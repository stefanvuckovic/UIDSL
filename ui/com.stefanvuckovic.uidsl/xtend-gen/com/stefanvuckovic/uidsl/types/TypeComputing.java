package com.stefanvuckovic.uidsl.types;

import com.google.common.base.Objects;
import com.stefanvuckovic.domainmodel.domainModel.AttributeType;
import com.stefanvuckovic.domainmodel.domainModel.Expression;
import com.stefanvuckovic.domainmodel.domainModel.SelectionMember;
import com.stefanvuckovic.uidsl.uIDSL.MemberSelectionExpression;
import com.stefanvuckovic.uidsl.uIDSL.Method;
import com.stefanvuckovic.uidsl.uIDSL.UIDSLPackage;
import com.stefanvuckovic.uidsl.uIDSL.Variable;
import com.stefanvuckovic.uidsl.uIDSL.VariableReference;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

@SuppressWarnings("all")
public class TypeComputing {
  @Inject
  private com.stefanvuckovic.domainmodel.types.TypeComputing typeComputer;
  
  public EObject getType(final Expression e) {
    AttributeType _switchResult = null;
    boolean _matched = false;
    if (e instanceof MemberSelectionExpression) {
      _matched=true;
      SelectionMember _member = ((MemberSelectionExpression)e).getMember();
      _switchResult = _member.getType();
    }
    if (!_matched) {
      if (e instanceof VariableReference) {
        _matched=true;
        Variable _ref = ((VariableReference)e).getRef();
        _switchResult = _ref.getType();
      }
    }
    if (!_matched) {
      _switchResult = this.typeComputer.getType(e);
    }
    return _switchResult;
  }
  
  public AttributeType getExpectedType(final Expression e) {
    AttributeType _xblockexpression = null;
    {
      final EObject cont = e.eContainer();
      final EStructuralFeature feature = e.eContainingFeature();
      AttributeType _switchResult = null;
      boolean _matched = false;
      if (cont instanceof MemberSelectionExpression) {
        EReference _memberSelectionExpression_Params = UIDSLPackage.eINSTANCE.getMemberSelectionExpression_Params();
        boolean _equals = Objects.equal(feature, _memberSelectionExpression_Params);
        if (_equals) {
          _matched=true;
          AttributeType _xblockexpression_1 = null;
          {
            final SelectionMember member = ((MemberSelectionExpression)cont).getMember();
            EList<Expression> _params = ((MemberSelectionExpression)cont).getParams();
            final int indexOfParam = _params.indexOf(e);
            AttributeType _xifexpression = null;
            if (((member instanceof Method) && (((Method) member).getParams().size() > indexOfParam))) {
              EList<Variable> _params_1 = ((Method) member).getParams();
              EList<Expression> _params_2 = ((MemberSelectionExpression)cont).getParams();
              int _indexOf = _params_2.indexOf(e);
              Variable _get = _params_1.get(_indexOf);
              _xifexpression = _get.getType();
            } else {
              _xifexpression = null;
            }
            _xblockexpression_1 = _xifexpression;
          }
          _switchResult = _xblockexpression_1;
        }
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
}

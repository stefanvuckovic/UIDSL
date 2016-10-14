package com.stefanvuckovic.uidsl.types;

import com.google.common.base.Objects;
import com.stefanvuckovic.domainmodel.domainModel.AttributeType;
import com.stefanvuckovic.domainmodel.domainModel.CollectionType;
import com.stefanvuckovic.domainmodel.domainModel.Expression;
import com.stefanvuckovic.domainmodel.domainModel.SelectionMember;
import com.stefanvuckovic.domainmodel.domainModel.SingleType;
import com.stefanvuckovic.uidsl.UIDSLUtil;
import com.stefanvuckovic.uidsl.types.SingleAnyType;
import com.stefanvuckovic.uidsl.uIDSL.CollectionGeneralType;
import com.stefanvuckovic.uidsl.uIDSL.Fragment;
import com.stefanvuckovic.uidsl.uIDSL.FragmentCall;
import com.stefanvuckovic.uidsl.uIDSL.IFStatement;
import com.stefanvuckovic.uidsl.uIDSL.InlineVariable;
import com.stefanvuckovic.uidsl.uIDSL.IterationExpression;
import com.stefanvuckovic.uidsl.uIDSL.MemberSelectionExpression;
import com.stefanvuckovic.uidsl.uIDSL.Method;
import com.stefanvuckovic.uidsl.uIDSL.Page;
import com.stefanvuckovic.uidsl.uIDSL.PageCall;
import com.stefanvuckovic.uidsl.uIDSL.PageType;
import com.stefanvuckovic.uidsl.uIDSL.PropertyRuntimeType;
import com.stefanvuckovic.uidsl.uIDSL.PropertySingleRuntimeType;
import com.stefanvuckovic.uidsl.uIDSL.PropertyValue;
import com.stefanvuckovic.uidsl.uIDSL.PropertyValueInstance;
import com.stefanvuckovic.uidsl.uIDSL.SimpleType;
import com.stefanvuckovic.uidsl.uIDSL.TypeExpression;
import com.stefanvuckovic.uidsl.uIDSL.UIComponentInstance;
import com.stefanvuckovic.uidsl.uIDSL.UIDSLFactory;
import com.stefanvuckovic.uidsl.uIDSL.UIDSLPackage;
import com.stefanvuckovic.uidsl.uIDSL.Variable;
import com.stefanvuckovic.uidsl.uIDSL.VariableReference;
import java.util.LinkedHashSet;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class TypeComputing {
  @Inject
  private com.stefanvuckovic.domainmodel.types.TypeComputing typeComputer;
  
  @Inject
  @Extension
  private UIDSLUtil _uIDSLUtil;
  
  public final static CollectionGeneralType COLLECTION_TYPE = UIDSLFactory.eINSTANCE.createCollectionGeneralType();
  
  public final static PageType PAGE_TYPE = UIDSLFactory.eINSTANCE.createPageType();
  
  public final static SingleAnyType SINGLE_TYPE = new SingleAnyType();
  
  public AttributeType getType(final Expression e) {
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
        _switchResult = this.calculateType(((VariableReference)e));
      }
    }
    if (!_matched) {
      if (e instanceof IterationExpression) {
        _matched=true;
        Expression _expression = ((IterationExpression)e).getExpression();
        _switchResult = this.getType(_expression);
      }
    }
    if (!_matched) {
      if (e instanceof PageCall) {
        _matched=true;
        _switchResult = TypeComputing.PAGE_TYPE;
      }
    }
    if (!_matched) {
      _switchResult = this.typeComputer.getType(e);
    }
    return _switchResult;
  }
  
  public AttributeType calculateType(final VariableReference vr) {
    AttributeType _xblockexpression = null;
    {
      final Variable v = vr.getRef();
      AttributeType _xifexpression = null;
      if ((v instanceof InlineVariable)) {
        SingleType _xblockexpression_1 = null;
        {
          EObject _eContainer = ((InlineVariable)v).eContainer();
          final AttributeType iterationExprType = this.getType(((IterationExpression) _eContainer));
          SingleType _xifexpression_1 = null;
          if ((iterationExprType instanceof CollectionType)) {
            _xifexpression_1 = ((CollectionType)iterationExprType).getOfType();
          } else {
            _xifexpression_1 = null;
          }
          _xblockexpression_1 = _xifexpression_1;
        }
        _xifexpression = _xblockexpression_1;
      } else {
        Variable _ref = vr.getRef();
        _xifexpression = _ref.getType();
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
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
              Variable _get = _params_1.get(indexOfParam);
              _xifexpression = _get.getType();
            } else {
              _xifexpression = null;
            }
            _xblockexpression_1 = _xifexpression;
          }
          _switchResult = _xblockexpression_1;
        }
      }
      if (!_matched) {
        if (cont instanceof IterationExpression) {
          _matched=true;
          _switchResult = TypeComputing.COLLECTION_TYPE;
        }
      }
      if (!_matched) {
        if (cont instanceof IFStatement) {
          _matched=true;
          _switchResult = com.stefanvuckovic.domainmodel.types.TypeComputing.BOOL_TYPE;
        }
      }
      if (!_matched) {
        if (cont instanceof PropertyValueInstance) {
          _matched=true;
          _switchResult = this.getPropertyValueInstanceType(((PropertyValueInstance)cont));
        }
      }
      if (!_matched) {
        if (cont instanceof PageCall) {
          _matched=true;
          EList<Expression> _params = ((PageCall)cont).getParams();
          final int ind = _params.indexOf(e);
          final Page page = ((PageCall)cont).getPage();
          EList<Variable> _params_1 = page.getParams();
          int _size = _params_1.size();
          boolean _greaterThan = (_size > ind);
          if (_greaterThan) {
            EList<Variable> _params_2 = page.getParams();
            Variable _get = _params_2.get(ind);
            return _get.getType();
          }
        }
      }
      if (!_matched) {
        if (cont instanceof FragmentCall) {
          _matched=true;
          EList<Expression> _params = ((FragmentCall)cont).getParams();
          final int ind = _params.indexOf(e);
          final Fragment frag = ((FragmentCall)cont).getFrag();
          EList<Variable> _params_1 = frag.getParams();
          int _size = _params_1.size();
          boolean _greaterThan = (_size > ind);
          if (_greaterThan) {
            EList<Variable> _params_2 = frag.getParams();
            Variable _get = _params_2.get(ind);
            return _get.getType();
          }
        }
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  public AttributeType getPropertyValueInstanceType(final PropertyValueInstance propInstance) {
    AttributeType _xblockexpression = null;
    {
      PropertyValue _property = propInstance.getProperty();
      final TypeExpression exprType = _property.getType();
      AttributeType _switchResult = null;
      boolean _matched = false;
      if (exprType instanceof SimpleType) {
        _matched=true;
        _switchResult = ((SimpleType)exprType).getType();
      }
      if (!_matched) {
        if (exprType instanceof PropertyRuntimeType) {
          _matched=true;
          _switchResult = this.getPropertyRuntimeType(((PropertyRuntimeType)exprType), propInstance);
        }
      }
      if (!_matched) {
        if (exprType instanceof PropertySingleRuntimeType) {
          _matched=true;
          SingleType _xblockexpression_1 = null;
          {
            PropertyRuntimeType _propertyType = ((PropertySingleRuntimeType)exprType).getPropertyType();
            final AttributeType attrType = this.getPropertyRuntimeType(_propertyType, propInstance);
            SingleType _xifexpression = null;
            if ((attrType instanceof CollectionType)) {
              _xifexpression = ((CollectionType)attrType).getOfType();
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
  
  public AttributeType getPropertyRuntimeType(final PropertyRuntimeType type, final PropertyValueInstance propInstance) {
    AttributeType _xblockexpression = null;
    {
      EObject _eContainer = propInstance.eContainer();
      EList<PropertyValueInstance> _properties = ((UIComponentInstance) _eContainer).getProperties();
      final Function1<PropertyValueInstance, Boolean> _function = (PropertyValueInstance prop) -> {
        PropertyValue _property = prop.getProperty();
        PropertyValue _property_1 = type.getProperty();
        return Boolean.valueOf((_property == _property_1));
      };
      Iterable<PropertyValueInstance> _filter = IterableExtensions.<PropertyValueInstance>filter(_properties, _function);
      PropertyValueInstance _head = null;
      if (_filter!=null) {
        _head=IterableExtensions.<PropertyValueInstance>head(_filter);
      }
      final PropertyValueInstance propValueInstance = _head;
      AttributeType _xifexpression = null;
      boolean _notEquals = (!Objects.equal(propValueInstance, null));
      if (_notEquals) {
        Expression _value = propInstance.getValue();
        _xifexpression = this.getType(_value);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public AttributeType calculateTypeExpressionType(final TypeExpression type) {
    AttributeType _xblockexpression = null;
    {
      final PropertyValue property = EcoreUtil2.<PropertyValue>getContainerOfType(type, PropertyValue.class);
      LinkedHashSet<PropertyValue> _hierarchyOfTypeDependentProperties = this._uIDSLUtil.getHierarchyOfTypeDependentProperties(property);
      boolean _contains = _hierarchyOfTypeDependentProperties.contains(property);
      if (_contains) {
        return null;
      }
      AttributeType _switchResult = null;
      boolean _matched = false;
      if (type instanceof SimpleType) {
        _matched=true;
        _switchResult = ((SimpleType)type).getType();
      }
      if (!_matched) {
        if (type instanceof PropertyRuntimeType) {
          _matched=true;
          PropertyValue _property = ((PropertyRuntimeType)type).getProperty();
          TypeExpression _type = _property.getType();
          _switchResult = this.calculateTypeExpressionType(_type);
        }
      }
      if (!_matched) {
        if (type instanceof PropertySingleRuntimeType) {
          _matched=true;
          _switchResult = TypeComputing.SINGLE_TYPE;
        }
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
}

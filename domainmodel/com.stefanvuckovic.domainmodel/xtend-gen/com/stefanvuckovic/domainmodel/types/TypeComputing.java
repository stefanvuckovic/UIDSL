package com.stefanvuckovic.domainmodel.types;

import com.stefanvuckovic.domainmodel.domainModel.Attribute;
import com.stefanvuckovic.domainmodel.domainModel.AttributeType;
import com.stefanvuckovic.domainmodel.domainModel.BoolConstant;
import com.stefanvuckovic.domainmodel.domainModel.BoolType;
import com.stefanvuckovic.domainmodel.domainModel.DateConstant;
import com.stefanvuckovic.domainmodel.domainModel.DateType;
import com.stefanvuckovic.domainmodel.domainModel.DecimalType;
import com.stefanvuckovic.domainmodel.domainModel.DomainModelFactory;
import com.stefanvuckovic.domainmodel.domainModel.EnumLiteral;
import com.stefanvuckovic.domainmodel.domainModel.Expression;
import com.stefanvuckovic.domainmodel.domainModel.IntConstant;
import com.stefanvuckovic.domainmodel.domainModel.IntType;
import com.stefanvuckovic.domainmodel.domainModel.LongConstant;
import com.stefanvuckovic.domainmodel.domainModel.LongType;
import com.stefanvuckovic.domainmodel.domainModel.Null;
import com.stefanvuckovic.domainmodel.domainModel.StringConstant;
import com.stefanvuckovic.domainmodel.domainModel.StringType;
import com.stefanvuckovic.domainmodel.types.NullType;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class TypeComputing {
  public final static StringType STRING_TYPE = DomainModelFactory.eINSTANCE.createStringType();
  
  public final static IntType INT_TYPE = DomainModelFactory.eINSTANCE.createIntType();
  
  public final static LongType LONG_TYPE = DomainModelFactory.eINSTANCE.createLongType();
  
  public final static BoolType BOOL_TYPE = DomainModelFactory.eINSTANCE.createBoolType();
  
  public final static DateType DATE_TYPE = DomainModelFactory.eINSTANCE.createDateType();
  
  public final static DecimalType DECIMAL_TYPE = DomainModelFactory.eINSTANCE.createDecimalType();
  
  public final static NullType NULL_TYPE = new NullType();
  
  public AttributeType getType(final Expression c) {
    AttributeType _switchResult = null;
    boolean _matched = false;
    if (c instanceof StringConstant) {
      _matched=true;
      _switchResult = TypeComputing.STRING_TYPE;
    }
    if (!_matched) {
      if (c instanceof IntConstant) {
        _matched=true;
        _switchResult = TypeComputing.INT_TYPE;
      }
    }
    if (!_matched) {
      if (c instanceof LongConstant) {
        _matched=true;
        _switchResult = TypeComputing.LONG_TYPE;
      }
    }
    if (!_matched) {
      if (c instanceof BoolConstant) {
        _matched=true;
        _switchResult = TypeComputing.BOOL_TYPE;
      }
    }
    if (!_matched) {
      if (c instanceof DateConstant) {
        _matched=true;
        _switchResult = TypeComputing.DATE_TYPE;
      }
    }
    if (!_matched) {
      if (c instanceof DecimalType) {
        _matched=true;
        _switchResult = TypeComputing.DECIMAL_TYPE;
      }
    }
    if (!_matched) {
      if (c instanceof Null) {
        _matched=true;
        _switchResult = TypeComputing.NULL_TYPE;
      }
    }
    return _switchResult;
  }
  
  public AttributeType getExpectedType(final Expression e) {
    final EObject cont = e.eContainer();
    boolean _matched = false;
    if (cont instanceof EnumLiteral) {
      _matched=true;
      EObject _eContainer = ((EnumLiteral)cont).eContainer();
      final com.stefanvuckovic.domainmodel.domainModel.Enum enumCont = ((com.stefanvuckovic.domainmodel.domainModel.Enum) _eContainer);
      try {
        EList<Attribute> _attributes = enumCont.getAttributes();
        EList<Expression> _params = ((EnumLiteral) cont).getParams();
        int _indexOf = _params.indexOf(e);
        Attribute _get = _attributes.get(_indexOf);
        return _get.getType();
      } catch (final Throwable _t) {
        if (_t instanceof Throwable) {
          final Throwable t = (Throwable)_t;
          return null;
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    }
    return null;
  }
}

package com.stefanvuckovic.uidsl.types;

import com.google.common.collect.Iterables;
import com.stefanvuckovic.domainmodel.domainModel.AttributeType;
import com.stefanvuckovic.domainmodel.domainModel.BasicType;
import com.stefanvuckovic.domainmodel.domainModel.CollectionType;
import com.stefanvuckovic.domainmodel.domainModel.Concept;
import com.stefanvuckovic.domainmodel.domainModel.RefType;
import com.stefanvuckovic.domainmodel.domainModel.SingleType;
import com.stefanvuckovic.domainmodel.types.TypeComputing;
import com.stefanvuckovic.dto.DTOUtil;
import com.stefanvuckovic.dto.dTO.DTOClass;
import com.stefanvuckovic.uidsl.types.SingleAnyType;
import com.stefanvuckovic.uidsl.uIDSL.AlternativeType;
import com.stefanvuckovic.uidsl.uIDSL.AnyType;
import com.stefanvuckovic.uidsl.uIDSL.CollectionGeneralType;
import com.stefanvuckovic.uidsl.uIDSL.EnumGeneralType;
import com.stefanvuckovic.uidsl.uIDSL.ObjectGeneralType;
import com.stefanvuckovic.uidsl.uIDSL.PageType;
import com.stefanvuckovic.uidsl.uIDSL.ServerComponent;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class TypeConformance {
  @Inject
  @Extension
  private com.stefanvuckovic.domainmodel.types.TypeConformance _typeConformance;
  
  @Inject
  @Extension
  private DTOUtil _dTOUtil;
  
  public boolean isConformant(final AttributeType type1, final AttributeType type2) {
    return (((((((((((((type2 instanceof AnyType) || 
      ((type1 == TypeComputing.NULL_TYPE) && this._typeConformance.acceptNull(type2))) || 
      ((type2 instanceof AlternativeType) && this.isConformantToAlternativeType(type1, ((AlternativeType) type2)))) || 
      ((type1 instanceof BasicType) && type1.getClass().equals(type2.getClass()))) || 
      (((type1 instanceof RefType) && (type2 instanceof RefType)) && this.isRefTypeConformant(((RefType) type1), ((RefType) type2)))) || 
      (((type1 instanceof RefType) && (type2 instanceof ObjectGeneralType)) && this.isConformantToObjectGeneralType(((RefType) type1)))) || 
      (((type1 instanceof RefType) && (type2 instanceof EnumGeneralType)) && this.isConformantToEnumGeneralType(((RefType) type1)))) || 
      (((type1 instanceof CollectionType) && (type2 instanceof CollectionType)) && this.isCollectionTypeConformant(((CollectionType) type1), ((CollectionType) type2)))) || 
      (((type1 instanceof CollectionType) || (type1 instanceof CollectionGeneralType)) && (type2 instanceof CollectionGeneralType))) || 
      ((type1 instanceof PageType) && (type2 instanceof PageType))) || 
      ((!(type1 instanceof CollectionType)) && (type2 instanceof SingleAnyType))) || 
      ((type1 instanceof ObjectGeneralType) && (type2 instanceof ObjectGeneralType))) || 
      ((type1 instanceof EnumGeneralType) && (type2 instanceof EnumGeneralType)));
  }
  
  public boolean isRefTypeConformant(final RefType type1, final RefType type2) {
    boolean _xblockexpression = false;
    {
      final Concept c = type1.getReference();
      boolean _switchResult = false;
      boolean _matched = false;
      if (c instanceof com.stefanvuckovic.domainmodel.domainModel.Enum) {
        _matched=true;
        Concept _reference = type2.getReference();
        _switchResult = (c == _reference);
      }
      if (!_matched) {
        if (c instanceof DTOClass) {
          _matched=true;
          _switchResult = ((c == type2.getReference()) || ((type2.getReference() instanceof DTOClass) && 
            this._dTOUtil.getHierarchyForClass(((DTOClass)c)).contains(((DTOClass) type2.getReference()))));
        }
      }
      if (!_matched) {
        if (c instanceof ServerComponent) {
          _matched=true;
          Concept _reference = type2.getReference();
          _switchResult = (c == _reference);
        }
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  public boolean isCollectionTypeConformant(final CollectionType type1, final CollectionType type2) {
    boolean _xblockexpression = false;
    {
      final SingleType attrType1 = type1.getOfType();
      final SingleType attrType2 = type2.getOfType();
      boolean _switchResult = false;
      boolean _matched = false;
      if (attrType1 instanceof BasicType) {
        _matched=true;
        Class<? extends BasicType> _class = ((BasicType)attrType1).getClass();
        Class<? extends SingleType> _class_1 = attrType2.getClass();
        _switchResult = _class.equals(_class_1);
      }
      if (!_matched) {
        if (attrType1 instanceof RefType) {
          _matched=true;
          _switchResult = ((attrType2 instanceof RefType) && (((RefType) attrType2).getReference() == ((RefType)attrType1).getReference()));
        }
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  public boolean isConformantToObjectGeneralType(final RefType type) {
    Concept _reference = type.getReference();
    return (!(_reference instanceof com.stefanvuckovic.domainmodel.domainModel.Enum));
  }
  
  public boolean isConformantToEnumGeneralType(final RefType type) {
    Concept _reference = type.getReference();
    return (_reference instanceof com.stefanvuckovic.domainmodel.domainModel.Enum);
  }
  
  public boolean isConformantToAlternativeType(final AttributeType type1, final AlternativeType type2) {
    boolean _xifexpression = false;
    if ((type1 instanceof BasicType)) {
      EList<AttributeType> _types = type2.getTypes();
      final Function1<AttributeType, Boolean> _function = (AttributeType it) -> {
        Class<? extends AttributeType> _class = it.getClass();
        Class<? extends BasicType> _class_1 = ((BasicType)type1).getClass();
        return Boolean.valueOf(_class.equals(_class_1));
      };
      Iterable<AttributeType> _filter = IterableExtensions.<AttributeType>filter(_types, _function);
      int _size = IterableExtensions.size(_filter);
      _xifexpression = (_size > 0);
    } else {
      boolean _xifexpression_1 = false;
      if ((type1 instanceof RefType)) {
        boolean _xifexpression_2 = false;
        Concept _reference = ((RefType)type1).getReference();
        if ((_reference instanceof com.stefanvuckovic.domainmodel.domainModel.Enum)) {
          EList<AttributeType> _types_1 = type2.getTypes();
          Iterable<EnumGeneralType> _filter_1 = Iterables.<EnumGeneralType>filter(_types_1, EnumGeneralType.class);
          int _size_1 = IterableExtensions.size(_filter_1);
          _xifexpression_2 = (_size_1 > 0);
        } else {
          EList<AttributeType> _types_2 = type2.getTypes();
          Iterable<ObjectGeneralType> _filter_2 = Iterables.<ObjectGeneralType>filter(_types_2, ObjectGeneralType.class);
          int _size_2 = IterableExtensions.size(_filter_2);
          _xifexpression_2 = (_size_2 > 0);
        }
        _xifexpression_1 = _xifexpression_2;
      } else {
        boolean _xifexpression_3 = false;
        if (((type1 instanceof CollectionType) && (type1 instanceof CollectionGeneralType))) {
          EList<AttributeType> _types_3 = type2.getTypes();
          Iterable<CollectionGeneralType> _filter_3 = Iterables.<CollectionGeneralType>filter(_types_3, CollectionGeneralType.class);
          int _size_3 = IterableExtensions.size(_filter_3);
          _xifexpression_3 = (_size_3 > 0);
        } else {
          boolean _xifexpression_4 = false;
          if ((type1 instanceof ObjectGeneralType)) {
            EList<AttributeType> _types_4 = type2.getTypes();
            Iterable<ObjectGeneralType> _filter_4 = Iterables.<ObjectGeneralType>filter(_types_4, ObjectGeneralType.class);
            int _size_4 = IterableExtensions.size(_filter_4);
            _xifexpression_4 = (_size_4 > 0);
          } else {
            boolean _xifexpression_5 = false;
            if ((type1 instanceof EnumGeneralType)) {
              EList<AttributeType> _types_5 = type2.getTypes();
              Iterable<EnumGeneralType> _filter_5 = Iterables.<EnumGeneralType>filter(_types_5, EnumGeneralType.class);
              int _size_5 = IterableExtensions.size(_filter_5);
              _xifexpression_5 = (_size_5 > 0);
            } else {
              boolean _xifexpression_6 = false;
              if ((type1 instanceof PageType)) {
                EList<AttributeType> _types_6 = type2.getTypes();
                Iterable<PageType> _filter_6 = Iterables.<PageType>filter(_types_6, PageType.class);
                int _size_6 = IterableExtensions.size(_filter_6);
                _xifexpression_6 = (_size_6 > 0);
              }
              _xifexpression_5 = _xifexpression_6;
            }
            _xifexpression_4 = _xifexpression_5;
          }
          _xifexpression_3 = _xifexpression_4;
        }
        _xifexpression_1 = _xifexpression_3;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public boolean areTypesSame(final AttributeType type1, final AttributeType type2) {
    Class<? extends AttributeType> _class = type1.getClass();
    Class<? extends AttributeType> _class_1 = type2.getClass();
    return _class.equals(_class_1);
  }
}

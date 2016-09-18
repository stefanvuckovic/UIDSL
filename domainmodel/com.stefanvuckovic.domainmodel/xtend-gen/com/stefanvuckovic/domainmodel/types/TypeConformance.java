package com.stefanvuckovic.domainmodel.types;

import com.stefanvuckovic.domainmodel.DomainModelUtil;
import com.stefanvuckovic.domainmodel.domainModel.AttributeType;
import com.stefanvuckovic.domainmodel.domainModel.BasicType;
import com.stefanvuckovic.domainmodel.domainModel.CollectionType;
import com.stefanvuckovic.domainmodel.domainModel.Concept;
import com.stefanvuckovic.domainmodel.domainModel.DateType;
import com.stefanvuckovic.domainmodel.domainModel.Entity;
import com.stefanvuckovic.domainmodel.domainModel.RefType;
import com.stefanvuckovic.domainmodel.domainModel.SingleType;
import com.stefanvuckovic.domainmodel.types.TypeComputing;
import javax.inject.Inject;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class TypeConformance {
  @Inject
  @Extension
  private DomainModelUtil _domainModelUtil;
  
  public boolean isConformant(final AttributeType type1, final AttributeType type2) {
    return (((((type1 == TypeComputing.NULL_TYPE) && this.acceptNull(type2)) || 
      ((type1 instanceof BasicType) && type1.getClass().equals(type2.getClass()))) || 
      (((type1 instanceof RefType) && (type2 instanceof RefType)) && this.isConformant(((RefType) type1), ((RefType) type2)))) || 
      (((type1 instanceof CollectionType) && (type2 instanceof CollectionType)) && this.isConformant(((CollectionType) type1), ((CollectionType) type2))));
  }
  
  public boolean isConformant(final RefType type1, final RefType type2) {
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
        if (c instanceof Entity) {
          _matched=true;
          _switchResult = ((c == type2.getReference()) || 
            this._domainModelUtil.getHierarchyForEntity(((Entity)c)).contains(((Entity) type2.getReference())));
        }
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  public boolean isConformant(final CollectionType type1, final CollectionType type2) {
    SingleType _ofType = type1.getOfType();
    SingleType _ofType_1 = type2.getOfType();
    return this.isConformant(_ofType, _ofType_1);
  }
  
  public boolean acceptNull(final AttributeType type) {
    boolean _xblockexpression = false;
    {
      if (((type instanceof BasicType) && (!(type instanceof DateType)))) {
        return false;
      }
      _xblockexpression = true;
    }
    return _xblockexpression;
  }
}

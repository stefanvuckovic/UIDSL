package com.stefanvuckovic.domainToDto.types;

import com.stefanvuckovic.domainmodel.domainModel.AttributeType;
import com.stefanvuckovic.domainmodel.domainModel.BasicType;
import com.stefanvuckovic.domainmodel.domainModel.CollectionType;
import com.stefanvuckovic.domainmodel.domainModel.Concept;
import com.stefanvuckovic.domainmodel.domainModel.RefType;
import com.stefanvuckovic.domainmodel.domainModel.SingleType;
import com.stefanvuckovic.domainmodel.domainModel.StringType;
import com.stefanvuckovic.dto.DTOUtil;
import com.stefanvuckovic.dto.dTO.DTOClass;
import com.stefanvuckovic.dto.dTO.EmailType;
import com.stefanvuckovic.dto.dTO.FileType;
import com.stefanvuckovic.dto.dTO.ImageType;
import com.stefanvuckovic.dto.dTO.PasswordType;
import com.stefanvuckovic.dto.dTO.TextType;
import javax.inject.Inject;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class TypeConformance {
  @Inject
  @Extension
  private DTOUtil _dTOUtil;
  
  public boolean isConformant(final AttributeType type1, final AttributeType type2) {
    return (((((type1 instanceof BasicType) && (type2 instanceof BasicType)) && this.isBasicTypeConformant(((BasicType) type1), ((BasicType) type2))) || 
      (((type1 instanceof RefType) && (type2 instanceof RefType)) && this.isRefTypeConformant(((RefType) type1), ((RefType) type2)))) || 
      (((type1 instanceof CollectionType) && (type2 instanceof CollectionType)) && this.isCollectionTypeConformant(((CollectionType) type1), ((CollectionType) type2))));
  }
  
  public boolean isBasicTypeConformant(final BasicType type1, final BasicType type2) {
    return (type1.getClass().equals(type2.getClass()) || 
      ((type1 instanceof StringType) && (((((type2 instanceof TextType) || 
        (type2 instanceof EmailType)) || (type2 instanceof PasswordType)) || 
        (type2 instanceof FileType)) || (type2 instanceof ImageType))));
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
        return ((attrType2 instanceof BasicType) && 
          this.isBasicTypeConformant(((BasicType)attrType1), ((BasicType) attrType2)));
      }
      if (!_matched) {
        if (attrType1 instanceof RefType) {
          _matched=true;
          _switchResult = ((attrType2 instanceof RefType) && (((RefType) attrType2).getReference() == ((RefType)attrType1).getReference()));
        }
      }
      if (!_matched) {
        _switchResult = false;
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
}

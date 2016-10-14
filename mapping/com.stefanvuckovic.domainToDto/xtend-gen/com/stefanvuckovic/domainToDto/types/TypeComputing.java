package com.stefanvuckovic.domainToDto.types;

import com.google.common.base.Objects;
import com.stefanvuckovic.domainToDto.domainToDTO.DomainToDTOPackage;
import com.stefanvuckovic.domainToDto.domainToDTO.EntityMappingExpression;
import com.stefanvuckovic.domainToDto.domainToDTO.MappedAttribute;
import com.stefanvuckovic.domainToDto.domainToDTO.Mapper;
import com.stefanvuckovic.domainToDto.domainToDTO.MemberSelectionExpression;
import com.stefanvuckovic.domainToDto.domainToDTO.StaticEntityRef;
import com.stefanvuckovic.domainmodel.domainModel.Attribute;
import com.stefanvuckovic.domainmodel.domainModel.AttributeType;
import com.stefanvuckovic.domainmodel.domainModel.CollectionType;
import com.stefanvuckovic.domainmodel.domainModel.DomainModelFactory;
import com.stefanvuckovic.domainmodel.domainModel.Entity;
import com.stefanvuckovic.domainmodel.domainModel.Expression;
import com.stefanvuckovic.domainmodel.domainModel.RefType;
import com.stefanvuckovic.dto.dTO.DTOClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class TypeComputing {
  public AttributeType getType(final Expression e) {
    AttributeType _switchResult = null;
    boolean _matched = false;
    if (e instanceof MemberSelectionExpression) {
      _matched=true;
      Attribute _member = ((MemberSelectionExpression)e).getMember();
      _switchResult = _member.getType();
    }
    if (!_matched) {
      if (e instanceof StaticEntityRef) {
        _matched=true;
        RefType _createRefType = DomainModelFactory.eINSTANCE.createRefType();
        final Procedure1<RefType> _function = (RefType it) -> {
          Entity _reference = ((StaticEntityRef)e).getReference();
          it.setReference(_reference);
        };
        _switchResult = ObjectExtensions.<RefType>operator_doubleArrow(_createRefType, _function);
      }
    }
    if (!_matched) {
      if (e instanceof EntityMappingExpression) {
        _matched=true;
        Expression _mappedEntity = ((EntityMappingExpression)e).getMappedEntity();
        final AttributeType type = this.getType(_mappedEntity);
        final Mapper mapper = ((EntityMappingExpression)e).getMapper();
        if ((((!Objects.equal(type, null)) && (!Objects.equal(mapper, null))) && (!Objects.equal(mapper.getDto(), null)))) {
          final DomainModelFactory factory = DomainModelFactory.eINSTANCE;
          final DTOClass dto = mapper.getDto();
          RefType _createRefType = factory.createRefType();
          final Procedure1<RefType> _function = (RefType it) -> {
            it.setReference(dto);
          };
          final RefType attrType = ObjectExtensions.<RefType>operator_doubleArrow(_createRefType, _function);
          if ((type instanceof CollectionType)) {
            CollectionType _createCollectionType = factory.createCollectionType();
            final Procedure1<CollectionType> _function_1 = (CollectionType it) -> {
              it.setOfType(attrType);
            };
            return ObjectExtensions.<CollectionType>operator_doubleArrow(_createCollectionType, _function_1);
          } else {
            return attrType;
          }
        }
      }
    }
    return _switchResult;
  }
  
  public AttributeType getExpectedType(final Expression e) {
    final EStructuralFeature feature = e.eContainingFeature();
    EReference _mappedAttribute_Mapping = DomainToDTOPackage.eINSTANCE.getMappedAttribute_Mapping();
    boolean _equals = Objects.equal(feature, _mappedAttribute_Mapping);
    if (_equals) {
      EObject _eContainer = e.eContainer();
      final MappedAttribute mappedAttr = ((MappedAttribute) _eContainer);
      Attribute _attr = mappedAttr.getAttr();
      return _attr.getType();
    }
    return null;
  }
}

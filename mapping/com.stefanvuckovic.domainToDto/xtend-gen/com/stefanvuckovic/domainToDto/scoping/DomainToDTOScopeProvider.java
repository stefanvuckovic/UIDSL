/**
 * generated by Xtext 2.10.0
 */
package com.stefanvuckovic.domainToDto.scoping;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.stefanvuckovic.domainToDto.DomainToDTOUtil;
import com.stefanvuckovic.domainToDto.domainToDTO.DomainToDTOPackage;
import com.stefanvuckovic.domainToDto.domainToDTO.EntityMappingExpression;
import com.stefanvuckovic.domainToDto.domainToDTO.Mapper;
import com.stefanvuckovic.domainToDto.domainToDTO.MemberSelectionExpression;
import com.stefanvuckovic.domainToDto.scoping.AbstractDomainToDTOScopeProvider;
import com.stefanvuckovic.domainToDto.types.TypeComputing;
import com.stefanvuckovic.domainmodel.DomainModelUtil;
import com.stefanvuckovic.domainmodel.domainModel.Attribute;
import com.stefanvuckovic.domainmodel.domainModel.AttributeType;
import com.stefanvuckovic.domainmodel.domainModel.CollectionType;
import com.stefanvuckovic.domainmodel.domainModel.Concept;
import com.stefanvuckovic.domainmodel.domainModel.Entity;
import com.stefanvuckovic.domainmodel.domainModel.Expression;
import com.stefanvuckovic.domainmodel.domainModel.RefType;
import com.stefanvuckovic.domainmodel.domainModel.SingleType;
import com.stefanvuckovic.dto.DTOUtil;
import com.stefanvuckovic.dto.dTO.DTOClass;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.xbase.lib.Extension;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class DomainToDTOScopeProvider extends AbstractDomainToDTOScopeProvider {
  @Inject
  @Extension
  private TypeComputing _typeComputing;
  
  @Inject
  @Extension
  private DomainModelUtil _domainModelUtil;
  
  @Inject
  @Extension
  private DomainToDTOUtil _domainToDTOUtil;
  
  @Inject
  @Extension
  private DTOUtil _dTOUtil;
  
  @Override
  public IScope getScope(final EObject context, final EReference reference) {
    IScope _xifexpression = null;
    if ((context instanceof MemberSelectionExpression)) {
      return this.scopeForMemberSelectionExpression(((MemberSelectionExpression)context));
    } else {
      IScope _xifexpression_1 = null;
      EReference _entityMappingExpression_Mapper = DomainToDTOPackage.eINSTANCE.getEntityMappingExpression_Mapper();
      boolean _equals = Objects.equal(reference, _entityMappingExpression_Mapper);
      if (_equals) {
        return this.scopeForEntityMapper(((EntityMappingExpression) context));
      } else {
        IScope _xifexpression_2 = null;
        EReference _mappedAttribute_Attr = DomainToDTOPackage.eINSTANCE.getMappedAttribute_Attr();
        boolean _equals_1 = Objects.equal(reference, _mappedAttribute_Attr);
        if (_equals_1) {
          return this.scopeForDTOClassAttributes(context);
        } else {
          _xifexpression_2 = super.getScope(context, reference);
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  protected IScope scopeForMemberSelectionExpression(final MemberSelectionExpression sel) {
    IScope _xblockexpression = null;
    {
      final Expression receiver = sel.getReceiver();
      IScope _xifexpression = null;
      boolean _notEquals = (!Objects.equal(receiver, null));
      if (_notEquals) {
        IScope _xblockexpression_1 = null;
        {
          final AttributeType type = this._typeComputing.getType(receiver);
          if ((Objects.equal(type, null) || (!(type instanceof RefType)))) {
            return IScope.NULLSCOPE;
          }
          final Concept concept = ((RefType) type).getReference();
          IScope _switchResult = null;
          boolean _matched = false;
          if (concept instanceof Entity) {
            _matched=true;
            EList<Attribute> _attributes = ((Entity)concept).getAttributes();
            Iterable<Attribute> _entityHierarchyAttributesWithCommonAttributesIncluded = this._domainModelUtil.getEntityHierarchyAttributesWithCommonAttributesIncluded(((Entity)concept));
            IScope _scopeFor = Scopes.scopeFor(_entityHierarchyAttributesWithCommonAttributesIncluded);
            _switchResult = Scopes.scopeFor(_attributes, _scopeFor);
          }
          if (!_matched) {
            if (concept instanceof com.stefanvuckovic.domainmodel.domainModel.Enum) {
              _matched=true;
              EList<Attribute> _attributes = ((com.stefanvuckovic.domainmodel.domainModel.Enum)concept).getAttributes();
              _switchResult = Scopes.scopeFor(_attributes);
            }
          }
          _xblockexpression_1 = _switchResult;
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  protected IScope scopeForEntityMapper(final EntityMappingExpression mappingExpression) {
    final Expression mappedConcept = mappingExpression.getMappedEntity();
    boolean _notEquals = (!Objects.equal(mappedConcept, null));
    if (_notEquals) {
      final AttributeType type = this._typeComputing.getType(mappedConcept);
      AttributeType singleType = type;
      if ((type instanceof CollectionType)) {
        SingleType _ofType = ((CollectionType)type).getOfType();
        singleType = _ofType;
      }
      if ((((!Objects.equal(singleType, null)) && (singleType instanceof RefType)) && (((RefType) singleType).getReference() instanceof Entity))) {
        Concept _reference = ((RefType) singleType).getReference();
        final Entity ent = ((Entity) _reference);
        Iterable<Mapper> _mappersThatMapEntity = this._domainToDTOUtil.getMappersThatMapEntity(ent, mappingExpression);
        return Scopes.scopeFor(_mappersThatMapEntity);
      }
    }
    return null;
  }
  
  protected IScope scopeForDTOClassAttributes(final EObject context) {
    Mapper mapper = null;
    if ((context instanceof Mapper)) {
      mapper = ((Mapper) context);
    } else {
      EObject _eContainer = context.eContainer();
      mapper = ((Mapper) _eContainer);
    }
    final DTOClass dto = mapper.getDto();
    boolean _notEquals = (!Objects.equal(dto, null));
    if (_notEquals) {
      final Iterable<Attribute> attrs = this._dTOUtil.getAttributesFromClassHierarchy(dto);
      EList<Attribute> _attributes = dto.getAttributes();
      Iterable<Attribute> _plus = Iterables.<Attribute>concat(_attributes, attrs);
      return Scopes.scopeFor(_plus);
    }
    return IScope.NULLSCOPE;
  }
}
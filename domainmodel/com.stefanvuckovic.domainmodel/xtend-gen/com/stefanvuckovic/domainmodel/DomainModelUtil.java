package com.stefanvuckovic.domainmodel;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.stefanvuckovic.domainmodel.LibraryConstants;
import com.stefanvuckovic.domainmodel.domainModel.Attribute;
import com.stefanvuckovic.domainmodel.domainModel.AttributeOption;
import com.stefanvuckovic.domainmodel.domainModel.AttributeType;
import com.stefanvuckovic.domainmodel.domainModel.BoolType;
import com.stefanvuckovic.domainmodel.domainModel.Cardinality;
import com.stefanvuckovic.domainmodel.domainModel.CollectionType;
import com.stefanvuckovic.domainmodel.domainModel.Concept;
import com.stefanvuckovic.domainmodel.domainModel.DateType;
import com.stefanvuckovic.domainmodel.domainModel.Entity;
import com.stefanvuckovic.domainmodel.domainModel.EntityDeleteOption;
import com.stefanvuckovic.domainmodel.domainModel.EntityOption;
import com.stefanvuckovic.domainmodel.domainModel.InheritanceMappingOption;
import com.stefanvuckovic.domainmodel.domainModel.IntType;
import com.stefanvuckovic.domainmodel.domainModel.LongType;
import com.stefanvuckovic.domainmodel.domainModel.Model;
import com.stefanvuckovic.domainmodel.domainModel.PartOf;
import com.stefanvuckovic.domainmodel.domainModel.RefType;
import com.stefanvuckovic.domainmodel.domainModel.RelationshipOwner;
import com.stefanvuckovic.domainmodel.domainModel.Required;
import com.stefanvuckovic.domainmodel.domainModel.SingleType;
import com.stefanvuckovic.domainmodel.domainModel.StaticFieldSelection;
import com.stefanvuckovic.domainmodel.domainModel.StringType;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class DomainModelUtil {
  public LinkedHashSet<Entity> getHierarchyForEntity(final Entity entity) {
    LinkedHashSet<Entity> _xblockexpression = null;
    {
      final LinkedHashSet<Entity> hierarchy = CollectionLiterals.<Entity>newLinkedHashSet();
      Entity curr = entity.getSuperType();
      while (((!Objects.equal(curr, null)) && (!hierarchy.contains(curr)))) {
        {
          hierarchy.add(curr);
          Entity _superType = curr.getSuperType();
          curr = _superType;
        }
      }
      _xblockexpression = hierarchy;
    }
    return _xblockexpression;
  }
  
  public Iterable<Entity> getHierarchyForEntityWithCommonEntityIncluded(final Entity entity) {
    final Entity obj = this.getObjectFromLibrary(entity);
    final LinkedHashSet<Entity> hierarchy = this.getHierarchyForEntity(entity);
    boolean _notEquals = (!Objects.equal(obj, null));
    if (_notEquals) {
      ArrayList<Entity> _newArrayList = CollectionLiterals.<Entity>newArrayList(obj);
      return Iterables.<Entity>concat(hierarchy, _newArrayList);
    } else {
      return hierarchy;
    }
  }
  
  public Entity getObjectFromLibrary(final EObject ctx) {
    Entity _xblockexpression = null;
    {
      Resource _eResource = null;
      if (ctx!=null) {
        _eResource=ctx.eResource();
      }
      ResourceSet _resourceSet = null;
      if (_eResource!=null) {
        _resourceSet=_eResource.getResourceSet();
      }
      Resource _resource = null;
      if (_resourceSet!=null) {
        URI _createPlatformResourceURI = URI.createPlatformResourceURI(LibraryConstants.COMMON_ENTITY_LIBRARY, true);
        _resource=_resourceSet.getResource(_createPlatformResourceURI, true);
      }
      final Resource res = _resource;
      Entity _xifexpression = null;
      boolean _notEquals = (!Objects.equal(res, null));
      if (_notEquals) {
        Entity _xblockexpression_1 = null;
        {
          TreeIterator<EObject> _allContents = res.getAllContents();
          Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
          EObject _head = IterableExtensions.<EObject>head(_iterable);
          final Model model = ((Model) _head);
          EList<Concept> _concepts = model.getConcepts();
          final Function1<Concept, Boolean> _function = (Concept c) -> {
            return Boolean.valueOf(((c instanceof Entity) && Objects.equal(((Entity) c).getName(), LibraryConstants.COMMON_ENTITY_NAME)));
          };
          Iterable<Concept> _filter = IterableExtensions.<Concept>filter(_concepts, _function);
          Concept _head_1 = IterableExtensions.<Concept>head(_filter);
          _xblockexpression_1 = ((Entity) _head_1);
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public Iterable<Attribute> getEntityHierarchyAttributes(final Entity e) {
    LinkedHashSet<Entity> _hierarchyForEntity = this.getHierarchyForEntity(e);
    final Function1<Entity, EList<Attribute>> _function = (Entity it) -> {
      return it.getAttributes();
    };
    Iterable<EList<Attribute>> _map = IterableExtensions.<Entity, EList<Attribute>>map(_hierarchyForEntity, _function);
    return Iterables.<Attribute>concat(_map);
  }
  
  public Iterable<Attribute> getEntityHierarchyAttributesWithCommonAttributesIncluded(final Entity e) {
    Iterable<Entity> _hierarchyForEntityWithCommonEntityIncluded = this.getHierarchyForEntityWithCommonEntityIncluded(e);
    final Function1<Entity, EList<Attribute>> _function = (Entity it) -> {
      return it.getAttributes();
    };
    Iterable<EList<Attribute>> _map = IterableExtensions.<Entity, EList<Attribute>>map(_hierarchyForEntityWithCommonEntityIncluded, _function);
    return Iterables.<Attribute>concat(_map);
  }
  
  public Entity getAttributeEntityRefTypeIfExists(final AttributeType attrType) {
    Concept concept = this.getConceptRefTypeIfExists(attrType);
    if ((concept instanceof Entity)) {
      return ((Entity) concept);
    } else {
      return null;
    }
  }
  
  public com.stefanvuckovic.domainmodel.domainModel.Enum getAttributeEnumRefTypeIfExists(final AttributeType attrType) {
    final Concept concept = this.getConceptRefTypeIfExists(attrType);
    if ((concept instanceof com.stefanvuckovic.domainmodel.domainModel.Enum)) {
      return ((com.stefanvuckovic.domainmodel.domainModel.Enum) concept);
    } else {
      return null;
    }
  }
  
  public Concept getConceptRefTypeIfExists(final AttributeType attrType) {
    Concept _xblockexpression = null;
    {
      Concept concept = null;
      if ((attrType instanceof RefType)) {
        Concept _reference = ((RefType) attrType).getReference();
        concept = _reference;
      } else {
        if (((attrType instanceof CollectionType) && (((CollectionType) attrType).getOfType() instanceof RefType))) {
          SingleType _ofType = ((CollectionType) attrType).getOfType();
          Concept _reference_1 = ((RefType) _ofType).getReference();
          concept = _reference_1;
        }
      }
      _xblockexpression = concept;
    }
    return _xblockexpression;
  }
  
  public InheritanceMappingOption inheritanceMapping(final Entity e) {
    EList<EntityOption> _options = e.getOptions();
    Iterable<InheritanceMappingOption> _filter = Iterables.<InheritanceMappingOption>filter(_options, InheritanceMappingOption.class);
    InheritanceMappingOption _head = null;
    if (_filter!=null) {
      _head=IterableExtensions.<InheritanceMappingOption>head(_filter);
    }
    return _head;
  }
  
  public EntityDeleteOption deleteOption(final Entity e) {
    EList<EntityOption> _options = e.getOptions();
    Iterable<EntityDeleteOption> _filter = Iterables.<EntityDeleteOption>filter(_options, EntityDeleteOption.class);
    EntityDeleteOption _head = null;
    if (_filter!=null) {
      _head=IterableExtensions.<EntityDeleteOption>head(_filter);
    }
    return _head;
  }
  
  public Required requiredOption(final Attribute a) {
    EList<AttributeOption> _options = a.getOptions();
    Iterable<Required> _filter = Iterables.<Required>filter(_options, Required.class);
    Required _head = null;
    if (_filter!=null) {
      _head=IterableExtensions.<Required>head(_filter);
    }
    return _head;
  }
  
  public PartOf partOfOption(final Attribute a) {
    EList<AttributeOption> _options = a.getOptions();
    Iterable<PartOf> _filter = Iterables.<PartOf>filter(_options, PartOf.class);
    PartOf _head = null;
    if (_filter!=null) {
      _head=IterableExtensions.<PartOf>head(_filter);
    }
    return _head;
  }
  
  public RelationshipOwner relationshipOwner(final Attribute a) {
    EList<AttributeOption> _options = a.getOptions();
    Iterable<RelationshipOwner> _filter = Iterables.<RelationshipOwner>filter(_options, RelationshipOwner.class);
    RelationshipOwner _head = null;
    if (_filter!=null) {
      _head=IterableExtensions.<RelationshipOwner>head(_filter);
    }
    return _head;
  }
  
  public Cardinality cardinality(final Attribute a) {
    EList<AttributeOption> _options = a.getOptions();
    Iterable<Cardinality> _filter = Iterables.<Cardinality>filter(_options, Cardinality.class);
    Cardinality _head = null;
    if (_filter!=null) {
      _head=IterableExtensions.<Cardinality>head(_filter);
    }
    return _head;
  }
  
  public boolean collectionType(final AttributeType type) {
    return (type instanceof CollectionType);
  }
  
  public boolean singleType(final AttributeType type) {
    return (type instanceof SingleType);
  }
  
  public String typeToString(final AttributeType type) {
    String _switchResult = null;
    boolean _matched = false;
    if (type instanceof StringType) {
      _matched=true;
      _switchResult = "string";
    }
    if (!_matched) {
      if (type instanceof IntType) {
        _matched=true;
        _switchResult = "int";
      }
    }
    if (!_matched) {
      if (type instanceof LongType) {
        _matched=true;
        _switchResult = "long";
      }
    }
    if (!_matched) {
      if (type instanceof BoolType) {
        _matched=true;
        _switchResult = "boolean";
      }
    }
    if (!_matched) {
      if (type instanceof DateType) {
        _matched=true;
        _switchResult = "date";
      }
    }
    if (!_matched) {
      if (type instanceof RefType) {
        _matched=true;
        Concept _reference = ((RefType)type).getReference();
        _switchResult = _reference.getName();
      }
    }
    if (!_matched) {
      if (type instanceof CollectionType) {
        _matched=true;
        SingleType _ofType = ((CollectionType)type).getOfType();
        String _typeToString = this.typeToString(_ofType);
        String _plus = ("List<" + _typeToString);
        _switchResult = (_plus + ">");
      }
    }
    return _switchResult;
  }
  
  public Attribute getCorrespondingAttributeFromRelatedEntityIfExists(final Attribute attr) {
    Attribute _xblockexpression = null;
    {
      Attribute relatedAttr = null;
      EObject _eContainer = attr.eContainer();
      final Entity ent = ((Entity) _eContainer);
      final RelationshipOwner relationshipMapping = this.relationshipOwner(attr);
      boolean _notEquals = (!Objects.equal(relationshipMapping, null));
      if (_notEquals) {
        StaticFieldSelection _relationshipOwner = relationshipMapping.getRelationshipOwner();
        Attribute _member = _relationshipOwner.getMember();
        relatedAttr = _member;
        AttributeType _type = relatedAttr.getType();
        final Entity attrEntityType = this.getAttributeEntityRefTypeIfExists(_type);
        if (((Objects.equal(relatedAttr, null) || Objects.equal(attrEntityType, null)) || (attrEntityType != ent))) {
          return null;
        }
      } else {
        AttributeType _type_1 = attr.getType();
        final Entity entityType = this.getAttributeEntityRefTypeIfExists(_type_1);
        boolean _equals = Objects.equal(entityType, null);
        if (_equals) {
          return null;
        }
        EList<Attribute> _attributes = entityType.getAttributes();
        for (final Attribute a : _attributes) {
          {
            AttributeType _type_2 = a.getType();
            final Entity entType = this.getAttributeEntityRefTypeIfExists(_type_2);
            if (((!Objects.equal(entType, null)) && (entType == ent))) {
              RelationshipOwner relationship = this.relationshipOwner(a);
              boolean _notEquals_1 = (!Objects.equal(relationship, null));
              if (_notEquals_1) {
                StaticFieldSelection _relationshipOwner_1 = relationship.getRelationshipOwner();
                Attribute _member_1 = _relationshipOwner_1.getMember();
                boolean _tripleEquals = (_member_1 == attr);
                if (_tripleEquals) {
                  relatedAttr = a;
                }
              }
            }
          }
        }
      }
      _xblockexpression = relatedAttr;
    }
    return _xblockexpression;
  }
}

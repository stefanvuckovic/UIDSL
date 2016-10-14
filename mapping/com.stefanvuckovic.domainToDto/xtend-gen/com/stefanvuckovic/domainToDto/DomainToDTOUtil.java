package com.stefanvuckovic.domainToDto;

import com.google.common.base.Objects;
import com.stefanvuckovic.domainToDto.domainToDTO.EntityMappingExpression;
import com.stefanvuckovic.domainToDto.domainToDTO.MappedAttribute;
import com.stefanvuckovic.domainToDto.domainToDTO.Mapper;
import com.stefanvuckovic.domainToDto.domainToDTO.MappingModel;
import com.stefanvuckovic.domainToDto.domainToDTO.MemberSelectionExpression;
import com.stefanvuckovic.domainToDto.domainToDTO.StaticEntityRef;
import com.stefanvuckovic.domainmodel.domainModel.Entity;
import com.stefanvuckovic.domainmodel.domainModel.Expression;
import java.util.LinkedHashSet;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class DomainToDTOUtil {
  public Set<Entity> getMappedEntitiesForMapper(final Mapper m) {
    EList<MappedAttribute> _attributes = m.getAttributes();
    final Function1<MappedAttribute, Boolean> _function = (MappedAttribute a) -> {
      return Boolean.valueOf(((!Objects.equal(a.getMapping(), null)) && (a.getMapping() instanceof MemberSelectionExpression)));
    };
    Iterable<MappedAttribute> _filter = IterableExtensions.<MappedAttribute>filter(_attributes, _function);
    final Function1<MappedAttribute, Entity> _function_1 = (MappedAttribute it) -> {
      return this.getMappedEntityFromExpression(it);
    };
    Iterable<Entity> _map = IterableExtensions.<MappedAttribute, Entity>map(_filter, _function_1);
    return IterableExtensions.<Entity>toSet(_map);
  }
  
  public Entity getMappedEntityFromExpression(final MappedAttribute attr) {
    Entity _xblockexpression = null;
    {
      final Expression exp = attr.getMapping();
      _xblockexpression = this.getMappedEntityFromExpression(exp);
    }
    return _xblockexpression;
  }
  
  public Entity getMappedEntityFromExpression(final Expression exp) {
    Entity _xifexpression = null;
    if ((exp instanceof MemberSelectionExpression)) {
      _xifexpression = this.getMappedEntityFromExpression(((MemberSelectionExpression)exp));
    }
    return _xifexpression;
  }
  
  public Entity getMappedEntity(final MappedAttribute attr) {
    final Expression exp = attr.getMapping();
    if ((exp instanceof MemberSelectionExpression)) {
      return this.getMappedEntityFromExpression(((MemberSelectionExpression)exp));
    } else {
      if ((exp instanceof EntityMappingExpression)) {
        final Expression entMappingExp = ((EntityMappingExpression)exp).getMappedEntity();
        return this.getMappedEntityFromExpression(entMappingExp);
      }
    }
    return null;
  }
  
  public Entity getMappedEntityFromExpression(final MemberSelectionExpression exp) {
    final Expression receiver = exp.getReceiver();
    if ((receiver instanceof StaticEntityRef)) {
      return ((StaticEntityRef)receiver).getReference();
    } else {
      return this.getMappedEntityFromExpression(((MemberSelectionExpression) receiver));
    }
  }
  
  public boolean isMapperMappingEntity(final Mapper m, final Entity e) {
    Set<Entity> _mappedEntitiesForMapper = this.getMappedEntitiesForMapper(m);
    final Function1<Entity, Boolean> _function = (Entity ent) -> {
      return Boolean.valueOf((ent == e));
    };
    Entity _findFirst = IterableExtensions.<Entity>findFirst(_mappedEntitiesForMapper, _function);
    return (!Objects.equal(_findFirst, null));
  }
  
  public Iterable<Mapper> getMappersThatMapEntity(final Entity ent, final EObject context) {
    Iterable<Mapper> _xblockexpression = null;
    {
      final MappingModel model = EcoreUtil2.<MappingModel>getContainerOfType(context, MappingModel.class);
      Iterable<Mapper> _xifexpression = null;
      boolean _notEquals = (!Objects.equal(model, null));
      if (_notEquals) {
        EList<Mapper> _mappers = model.getMappers();
        final Function1<Mapper, Boolean> _function = (Mapper it) -> {
          return Boolean.valueOf(this.isMapperMappingEntity(it, ent));
        };
        _xifexpression = IterableExtensions.<Mapper>filter(_mappers, _function);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public Iterable<Mapper> getUsedMappers(final Mapper m) {
    EList<MappedAttribute> _attributes = m.getAttributes();
    final Function1<MappedAttribute, Boolean> _function = (MappedAttribute a) -> {
      Expression _mapping = a.getMapping();
      return Boolean.valueOf((_mapping instanceof EntityMappingExpression));
    };
    Iterable<MappedAttribute> _filter = IterableExtensions.<MappedAttribute>filter(_attributes, _function);
    final Function1<MappedAttribute, Mapper> _function_1 = (MappedAttribute a) -> {
      Expression _mapping = a.getMapping();
      return ((EntityMappingExpression) _mapping).getMapper();
    };
    return IterableExtensions.<MappedAttribute, Mapper>map(_filter, _function_1);
  }
  
  public LinkedHashSet<Mapper> getMapperHierarchy(final Mapper m) {
    LinkedHashSet<Mapper> _xblockexpression = null;
    {
      final LinkedHashSet<Mapper> hierarchy = CollectionLiterals.<Mapper>newLinkedHashSet();
      this.populateMapperHierachy(m, hierarchy);
      _xblockexpression = hierarchy;
    }
    return _xblockexpression;
  }
  
  public void populateMapperHierachy(final Mapper m, final Set<Mapper> mappers) {
    final Iterable<Mapper> usedMappers = this.getUsedMappers(m);
    boolean _isEmpty = IterableExtensions.isEmpty(usedMappers);
    if (_isEmpty) {
      return;
    }
    for (final Mapper mapp : usedMappers) {
      if (((!Objects.equal(mapp, null)) && (!mappers.contains(mapp)))) {
        mappers.add(mapp);
        this.populateMapperHierachy(mapp, mappers);
      }
    }
  }
}

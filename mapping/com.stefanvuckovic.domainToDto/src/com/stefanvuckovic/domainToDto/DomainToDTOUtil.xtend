package com.stefanvuckovic.domainToDto

import com.stefanvuckovic.domainToDto.domainToDTO.MappedAttribute
import com.stefanvuckovic.domainToDto.domainToDTO.Mapper
import com.stefanvuckovic.domainToDto.domainToDTO.MemberSelectionExpression
import com.stefanvuckovic.domainToDto.domainToDTO.StaticEntityRef
import com.stefanvuckovic.domainmodel.domainModel.Entity
import org.eclipse.emf.ecore.EObject
import static extension org.eclipse.xtext.EcoreUtil2.*
import com.stefanvuckovic.domainToDto.domainToDTO.MappingModel
import com.stefanvuckovic.domainToDto.domainToDTO.EntityMappingExpression
import java.util.Set
import com.stefanvuckovic.domainmodel.domainModel.Expression

class DomainToDTOUtil {
	
	def getMappedEntitiesForMapper(Mapper m) {
		m.attributes.filter[a | a.mapping != null && a.mapping instanceof MemberSelectionExpression]
			.map[mappedEntityFromExpression].toSet
	}
	
	def Entity getMappedEntityFromExpression(MappedAttribute attr) {
		val exp = attr.mapping
		exp.mappedEntityFromExpression
	}
	
	def Entity getMappedEntityFromExpression(Expression exp) {
		if(exp instanceof MemberSelectionExpression) {
			exp.mappedEntityFromExpression
		}
	}
	
	def Entity getMappedEntity(MappedAttribute attr) {
		val exp = attr.mapping
		if(exp instanceof MemberSelectionExpression) {
			return exp.mappedEntityFromExpression
		} else if(exp instanceof EntityMappingExpression) {
			val entMappingExp = exp.mappedEntity
			return entMappingExp.mappedEntityFromExpression
		}
	}
	
	def Entity getMappedEntityFromExpression(MemberSelectionExpression exp) {
		val receiver = exp.receiver
		if(receiver instanceof StaticEntityRef) {
			return receiver.reference
		} else {
			return getMappedEntityFromExpression(receiver as MemberSelectionExpression)
		}
	}
	
	def isMapperMappingEntity(Mapper m, Entity e) {
		m.mappedEntitiesForMapper.findFirst[ent | ent === e] != null
	}

	//assuming that all mappers are defined in one resource (file)
	def getMappersThatMapEntity(Entity ent, EObject context) {
		val model = context.getContainerOfType(MappingModel)
		if(model != null) {
			model.mappers.filter[isMapperMappingEntity(ent)]
		}
	}
	
	def getUsedMappers(Mapper m) {
		m.attributes.filter[a | a.mapping instanceof EntityMappingExpression].map[a | (a.mapping as EntityMappingExpression).mapper]
	}
	
	def getMapperHierarchy(Mapper m) {
		val hierarchy = newLinkedHashSet()
		populateMapperHierachy(m, hierarchy)
		hierarchy
	}
	
	def void populateMapperHierachy(Mapper m, Set<Mapper> mappers) {
		val usedMappers = m.usedMappers
		if(usedMappers.empty) {
			return
		}
		for(mapp : usedMappers) {
			if(mapp != null && !mappers.contains(mapp)) {
				mappers.add(mapp)
				populateMapperHierachy(mapp, mappers)
			}
		}
	}
}
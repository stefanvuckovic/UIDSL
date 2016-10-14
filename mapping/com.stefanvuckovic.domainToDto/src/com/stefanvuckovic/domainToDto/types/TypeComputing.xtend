package com.stefanvuckovic.domainToDto.types

import com.stefanvuckovic.domainToDto.domainToDTO.MemberSelectionExpression
import com.stefanvuckovic.domainToDto.domainToDTO.StaticEntityRef
import com.stefanvuckovic.domainmodel.domainModel.AttributeType
import com.stefanvuckovic.domainmodel.domainModel.DomainModelFactory
import com.stefanvuckovic.domainmodel.domainModel.Expression
import com.stefanvuckovic.domainToDto.domainToDTO.EntityMappingExpression
import com.stefanvuckovic.domainmodel.domainModel.CollectionType
import com.stefanvuckovic.domainToDto.domainToDTO.DomainToDTOPackage
import com.stefanvuckovic.domainToDto.domainToDTO.MappedAttribute

class TypeComputing {
	
	def AttributeType getType(Expression e) {
		switch (e) {
			MemberSelectionExpression:
				e.member.type
			StaticEntityRef:
				DomainModelFactory.eINSTANCE.createRefType => [reference = e.reference]
			EntityMappingExpression: {
				val type = e.mappedEntity.type
				val mapper = e.mapper
				if(type != null && mapper != null && mapper.dto != null) {
					val factory = DomainModelFactory.eINSTANCE
					val dto = mapper.dto
					val attrType = factory.createRefType => [reference = dto]
					if(type instanceof CollectionType) {
						return factory.createCollectionType => [ofType = attrType]
					} else {
						return attrType
					}
				}
			}
		}
	}
	
	def getExpectedType(Expression e) {
		val feature = e.eContainingFeature
		if(feature == DomainToDTOPackage.eINSTANCE.mappedAttribute_Mapping) {
			val mappedAttr = e.eContainer as MappedAttribute
			return mappedAttr.attr.type
		}
	}

}
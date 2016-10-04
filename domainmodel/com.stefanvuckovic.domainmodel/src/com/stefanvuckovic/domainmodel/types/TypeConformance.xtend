package com.stefanvuckovic.domainmodel.types

import com.stefanvuckovic.domainmodel.DomainModelUtil
import com.stefanvuckovic.domainmodel.domainModel.AttributeType
import com.stefanvuckovic.domainmodel.domainModel.BasicType
import com.stefanvuckovic.domainmodel.domainModel.CollectionType
import com.stefanvuckovic.domainmodel.domainModel.Entity
import com.stefanvuckovic.domainmodel.domainModel.Enum
import com.stefanvuckovic.domainmodel.domainModel.RefType
import javax.inject.Inject

import static com.stefanvuckovic.domainmodel.types.TypeComputing.*
import com.stefanvuckovic.domainmodel.domainModel.DateType

class TypeConformance {
	
	@Inject extension DomainModelUtil
	
	def boolean isConformant(AttributeType type1, AttributeType type2) {
		type1 === NULL_TYPE && type2.acceptNull ||
		type1 instanceof BasicType && type1.class.equals(type2.class) ||
		type1 instanceof RefType && type2 instanceof RefType && (type1 as RefType).isRefTypeConformant((type2 as RefType)) ||
		type1 instanceof CollectionType && type2 instanceof CollectionType && (type1 as CollectionType).isCollectionTypeConformant((type2 as CollectionType))
	}
	
	def isRefTypeConformant(RefType type1, RefType type2) {
		val c = type1.reference
		switch(c) {
			Enum:
				c === type2.reference
			Entity:
				c === type2.reference ||
					c.hierarchyForEntity.contains(type2.reference as Entity)
					
		} 
	}
	
	def isCollectionTypeConformant(CollectionType type1, CollectionType type2) {
		val attrType1 = type1.ofType
		val attrType2 = type2.ofType
		switch(attrType1) {
			BasicType:
				attrType1.class.equals(attrType2.class)
			RefType:
				attrType2 instanceof RefType && (attrType2 as RefType).reference === attrType1.reference
		}
	}
	
	def acceptNull(AttributeType type) {
		if(type instanceof BasicType && !(type instanceof DateType)) {
			return false
		}
		true
	}
}
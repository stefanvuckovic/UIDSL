package com.stefanvuckovic.uidsl.types

import com.stefanvuckovic.domainmodel.domainModel.AttributeType
import com.stefanvuckovic.domainmodel.domainModel.BasicType
import com.stefanvuckovic.domainmodel.domainModel.CollectionType
import com.stefanvuckovic.domainmodel.domainModel.Enum
import com.stefanvuckovic.domainmodel.domainModel.RefType
import com.stefanvuckovic.dto.DTOUtil
import com.stefanvuckovic.dto.dTO.DTOClass
import javax.inject.Inject

import static com.stefanvuckovic.domainmodel.types.TypeComputing.*

class TypeConformance {
	
	@Inject extension com.stefanvuckovic.domainmodel.types.TypeConformance
	@Inject extension DTOUtil
	
	def boolean isConformant(AttributeType type1, AttributeType type2) {
		type1 === NULL_TYPE && type2.acceptNull ||
		type1 instanceof BasicType && type1.class.equals(type2.class) ||
		type1 instanceof RefType && type2 instanceof RefType && (type1 as RefType).isConformant((type2 as RefType)) ||
		type1 instanceof CollectionType && type2 instanceof CollectionType && (type1 as CollectionType).isConformant((type2 as CollectionType))
	}
	
	def isConformant(RefType type1, RefType type2) {
		val c = type1.reference
		switch(c) {
			Enum:
				c === type2.reference
			DTOClass:
				c === type2.reference ||
					c.hierarchyForClass.contains(type2.reference as DTOClass)
					
		} 
	}
	
	def isConformant(CollectionType type1, CollectionType type2) {
		return type1.ofType.isConformant(type2.ofType)
	}
	
}
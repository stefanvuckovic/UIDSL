package com.stefanvuckovic.uidsl.types

import com.stefanvuckovic.domainmodel.domainModel.AttributeType
import com.stefanvuckovic.domainmodel.domainModel.BasicType
import com.stefanvuckovic.domainmodel.domainModel.CollectionType
import com.stefanvuckovic.domainmodel.domainModel.Enum
import com.stefanvuckovic.domainmodel.domainModel.RefType
import com.stefanvuckovic.dto.DTOUtil
import com.stefanvuckovic.dto.dTO.DTOClass
import com.stefanvuckovic.uidsl.uIDSL.AlternativeType
import com.stefanvuckovic.uidsl.uIDSL.AnyType
import com.stefanvuckovic.uidsl.uIDSL.CollectionGeneralType
import com.stefanvuckovic.uidsl.uIDSL.EnumGeneralType
import com.stefanvuckovic.uidsl.uIDSL.ObjectGeneralType
import com.stefanvuckovic.uidsl.uIDSL.PageType
import javax.inject.Inject

import static com.stefanvuckovic.domainmodel.types.TypeComputing.*
import com.stefanvuckovic.uidsl.uIDSL.ServerComponent

class TypeConformance {
	
	@Inject extension com.stefanvuckovic.domainmodel.types.TypeConformance
	@Inject extension DTOUtil
	
	def boolean isConformant(AttributeType type1, AttributeType type2) {
		type2 instanceof AnyType ||
		type1 === NULL_TYPE && type2.acceptNull ||
		type2 instanceof AlternativeType && type1.isConformantToAlternativeType(type2 as AlternativeType) ||
		type1 instanceof BasicType && type1.class.equals(type2.class) ||
		type1 instanceof RefType && type2 instanceof RefType && (type1 as RefType).isRefTypeConformant((type2 as RefType)) ||
		type1 instanceof RefType && type2 instanceof ObjectGeneralType && (type1 as RefType).isConformantToObjectGeneralType ||
		type1 instanceof RefType && type2 instanceof EnumGeneralType && (type1 as RefType).isConformantToEnumGeneralType ||
		type1 instanceof CollectionType && (type2 instanceof CollectionType) && (type1 as CollectionType).isCollectionTypeConformant(type2 as CollectionType) ||
		(type1 instanceof CollectionType || type1 instanceof CollectionGeneralType) && type2 instanceof CollectionGeneralType ||
		type1 instanceof PageType && type2 instanceof PageType ||
		!(type1 instanceof CollectionType) && type2 instanceof SingleAnyType ||
		type1 instanceof ObjectGeneralType && type2 instanceof ObjectGeneralType ||
		type1 instanceof EnumGeneralType && type2 instanceof EnumGeneralType
	}
	
	def isRefTypeConformant(RefType type1, RefType type2) {
		val c = type1.reference
		switch(c) {
			Enum:
				c === type2.reference
			DTOClass:
				c === type2.reference || type2.reference instanceof DTOClass &&
					c.hierarchyForClass.contains(type2.reference as DTOClass)
			ServerComponent:
				c === type2.reference		
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

	def isConformantToObjectGeneralType(RefType type) {
		!(type.reference instanceof Enum)
	}
	
	def isConformantToEnumGeneralType(RefType type) {
		type.reference instanceof Enum
	} 
	
//	def isConformantToCollectionGeneralType(CollectionType type) {
//		val colType = type.ofType
//		if(colType instanceof RefType && (colType as RefType).reference instanceof ServerComponent) {
//			return false
//		}
//		true
//	}

	def isConformantToAlternativeType(AttributeType type1, AlternativeType type2) {
		if(type1 instanceof BasicType) {
			type2.types.filter[it.class.equals(type1.class)].size > 0
		} else if(type1 instanceof RefType) {
			if(type1.reference instanceof Enum) {
				type2.types.filter(EnumGeneralType).size > 0
			} else {
				type2.types.filter(ObjectGeneralType).size > 0
			}
		} else if(type1 instanceof CollectionType && type1 instanceof CollectionGeneralType) {
			type2.types.filter(CollectionGeneralType).size > 0
		} else if(type1 instanceof ObjectGeneralType) {
			type2.types.filter(ObjectGeneralType).size > 0
		} else if(type1 instanceof EnumGeneralType) {
			type2.types.filter(EnumGeneralType).size > 0
		} else if(type1 instanceof PageType) {
			type2.types.filter(PageType).size > 0
		}
	}
	
	//does not work for RefType and AlternativeType
	def boolean areTypesSame(AttributeType type1, AttributeType type2) {
		if(type1 instanceof BasicType) {
			return type1.class.equals(type2.class)
		} else if(type1 instanceof RefType) {
			return type2 instanceof RefType &&
				type1.reference === (type2 as RefType).reference
		} else if(type1 instanceof CollectionType) {
			return type2 instanceof CollectionType &&
				areTypesSame(type1.ofType, (type2 as CollectionType).ofType)
		} else {
			return false
		}
		
	}
	
}
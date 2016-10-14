package com.stefanvuckovic.domainToDto.types

import com.stefanvuckovic.domainmodel.domainModel.AttributeType
import com.stefanvuckovic.domainmodel.domainModel.BasicType
import com.stefanvuckovic.domainmodel.domainModel.CollectionType
import com.stefanvuckovic.domainmodel.domainModel.Enum
import com.stefanvuckovic.domainmodel.domainModel.RefType
import com.stefanvuckovic.domainmodel.domainModel.StringType
import com.stefanvuckovic.dto.DTOUtil
import com.stefanvuckovic.dto.dTO.DTOClass
import com.stefanvuckovic.dto.dTO.EmailType
import com.stefanvuckovic.dto.dTO.FileType
import com.stefanvuckovic.dto.dTO.ImageType
import com.stefanvuckovic.dto.dTO.PasswordType
import com.stefanvuckovic.dto.dTO.TextType
import javax.inject.Inject

class TypeConformance {
	
	@Inject extension DTOUtil
	
	def boolean isConformant(AttributeType type1, AttributeType type2) {
		type1 instanceof BasicType && type2 instanceof BasicType && (type1 as BasicType).isBasicTypeConformant(type2 as BasicType) ||
		type1 instanceof RefType && type2 instanceof RefType && (type1 as RefType).isRefTypeConformant((type2 as RefType)) ||
		type1 instanceof CollectionType && type2 instanceof CollectionType && (type1 as CollectionType).isCollectionTypeConformant((type2 as CollectionType))
	}
	
	def isBasicTypeConformant(BasicType type1, BasicType type2) {
		type1.class.equals(type2.class) ||
		type1 instanceof StringType && (type2 instanceof TextType || 
			type2 instanceof EmailType || type2 instanceof PasswordType ||
			type2 instanceof FileType || type2 instanceof ImageType
		) 
	}
	
	def isRefTypeConformant(RefType type1, RefType type2) {
		val c = type1.reference
		switch(c) {
			Enum:
				c === type2.reference
			DTOClass:
				c === type2.reference || type2.reference instanceof DTOClass &&
					c.hierarchyForClass.contains(type2.reference as DTOClass)
					
		} 
	}
	
	def isCollectionTypeConformant(CollectionType type1, CollectionType type2) {
		val attrType1 = type1.ofType
		val attrType2 = type2.ofType
		switch(attrType1) {
			BasicType: {
				return attrType2 instanceof BasicType &&
					attrType1.isBasicTypeConformant((attrType2 as BasicType))
			}
			RefType:
				attrType2 instanceof RefType && (attrType2 as RefType).reference === attrType1.reference
			default:
				false
		}
	}

}
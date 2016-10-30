package com.stefanvuckovic.dto

import com.stefanvuckovic.domainmodel.DomainModelUtil
import com.stefanvuckovic.domainmodel.domainModel.Attribute
import com.stefanvuckovic.domainmodel.domainModel.AttributeOption
import com.stefanvuckovic.domainmodel.domainModel.AttributeType
import com.stefanvuckovic.domainmodel.domainModel.CollectionType
import com.stefanvuckovic.dto.dTO.DTOClass
import com.stefanvuckovic.dto.dTO.EmailType
import com.stefanvuckovic.dto.dTO.FileType
import com.stefanvuckovic.dto.dTO.ImageType
import com.stefanvuckovic.dto.dTO.PasswordType
import com.stefanvuckovic.dto.dTO.TextType
import javax.inject.Inject
import com.stefanvuckovic.dto.dTO.IDAttribute
import com.stefanvuckovic.dto.dTO.ObjectRepresentation

class DTOUtil {
	
	@Inject DomainModelUtil dmUtil
	
	def getHierarchyForClass(DTOClass c) {
		val hierarchy = newLinkedHashSet()
		
		var curr = c.superType
		while(curr != null && !hierarchy.contains(curr)) {
			hierarchy.add(curr)
			curr = curr.superType
		}
		hierarchy
	}
	
	def getAttributesFromClassHierarchy(DTOClass c) {
		c.hierarchyForClass.map[attributes].flatten
	}
	
	def String typeToString(AttributeType type) {
		switch(type) {
			TextType:
				"text"
			EmailType:
				"email"
			PasswordType:
				"password"
			FileType:
				"file"
			ImageType:
				"image"
			CollectionType:
				"List<" + type.ofType.typeToString + ">"
			default:
				dmUtil.typeToString(type)
		}
	}
	
	def hasAttributeOption(Attribute attr, Class<? extends AttributeOption> optClass) {
		val options = attr.options
		options != null && options.filter[o | o.class.equals(optClass)].size > 0
	}
	
	def getIDAttribute(DTOClass c) {
		c.attributes.findFirst[a | a.options.filter(IDAttribute).size == 1]
	}
	
	def getObjectRepresentationAttribute(DTOClass c) {
		c.attributes.findFirst[a | a.options.filter(ObjectRepresentation).size == 1]
	}
	
	def isID(Attribute attr) {
		attr.options?.findFirst[o | o instanceof IDAttribute] != null
	}

}
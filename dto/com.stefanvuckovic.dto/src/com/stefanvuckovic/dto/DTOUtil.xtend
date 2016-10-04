package com.stefanvuckovic.dto

import com.stefanvuckovic.dto.dTO.DTOClass
import com.stefanvuckovic.dto.dTO.TextType
import com.stefanvuckovic.dto.dTO.EmailType
import com.stefanvuckovic.dto.dTO.PasswordType
import com.stefanvuckovic.dto.dTO.FileType
import com.stefanvuckovic.dto.dTO.ImageType
import com.stefanvuckovic.domainmodel.domainModel.CollectionType
import com.stefanvuckovic.domainmodel.domainModel.AttributeType
import javax.inject.Inject
import com.stefanvuckovic.domainmodel.DomainModelUtil
import com.stefanvuckovic.domainmodel.domainModel.Attribute
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
	
	def isObjectRepresentation(Attribute attr) {
		attr.options != null && attr.options.size == 1 && attr.options.head instanceof ObjectRepresentation
	}

}
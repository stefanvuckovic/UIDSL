package com.stefanvuckovic.uidsl

import com.stefanvuckovic.domainmodel.domainModel.AttributeType
import com.stefanvuckovic.dto.DTOUtil
import com.stefanvuckovic.uidsl.uIDSL.AlternativeType
import com.stefanvuckovic.uidsl.uIDSL.CollectionGeneralType
import com.stefanvuckovic.uidsl.uIDSL.EnumGeneralType
import com.stefanvuckovic.uidsl.uIDSL.Field
import com.stefanvuckovic.uidsl.uIDSL.Method
import com.stefanvuckovic.uidsl.uIDSL.ObjectGeneralType
import com.stefanvuckovic.uidsl.uIDSL.PageType
import com.stefanvuckovic.uidsl.uIDSL.ServerComponent
import javax.inject.Inject
import com.stefanvuckovic.uidsl.uIDSL.UIComponent
import com.stefanvuckovic.uidsl.uIDSL.PropertyValue
import com.stefanvuckovic.uidsl.uIDSL.PropertyRuntimeType
import com.stefanvuckovic.uidsl.uIDSL.PropertySingleRuntimeType

class UIDSLUtil {
	
	@Inject DTOUtil dtoUtil
	
	def getFields(ServerComponent sc) {
		sc.members.filter(Field)
	}

	def getMethods(ServerComponent sc) {
		sc.members.filter(Method)
	}
	
	def String typeToString(AttributeType type) {
		switch(type) {
			PageType:
				"page"
			ObjectGeneralType:
				"object"
			EnumGeneralType:
				"enum"
			CollectionGeneralType:
				"collection"
			AlternativeType:
				type.types.join(", ") [typeToString]
			default:
				dtoUtil.typeToString(type)
		}
	}
	
	def getRequiredProperties(UIComponent comp) {
		comp.properties.filter[required]
	}
	
	def getHierarchyOfTypeDependentProperties(PropertyValue p) {
		val hierarchy = newLinkedHashSet()
		var curr = p.dependentProperty
		while(curr != null && !hierarchy.contains(curr)) {
			hierarchy.add(curr)
			curr = curr.dependentProperty
		}
		hierarchy
	}
	
	def getDependentProperty(PropertyValue p) {
		val type = p.type
		if(type != null) {
			switch(type) {
				PropertyRuntimeType:
					type.property
				PropertySingleRuntimeType:
					type.propertyType.property
			}
		}
	}
	
}
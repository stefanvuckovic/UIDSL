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
import com.stefanvuckovic.uidsl.uIDSL.PropertyRuntimeType
import com.stefanvuckovic.uidsl.uIDSL.PropertySingleRuntimeType
import com.stefanvuckovic.uidsl.uIDSL.PropertyValue
import com.stefanvuckovic.uidsl.uIDSL.ServerComponent
import com.stefanvuckovic.uidsl.uIDSL.UIComponent
import com.stefanvuckovic.uidsl.uIDSL.UIComponentInstance
import javax.inject.Inject
import com.stefanvuckovic.uidsl.uIDSL.ChildUIComponent

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
	
	def getProperty(UIComponentInstance inst, String propName) {
		inst.properties.filter[p | p.property.name == propName].head
	}
	
	//when component can have only one instance of child component
	def getChildComponent(UIComponentInstance inst, String compName) {
		inst.childElements.filter[c | (c as UIComponentInstance).component.name == compName]?.head as UIComponentInstance
	}
	
	def isTopLevelComponent(UIComponentInstance inst) {
		!(inst.component.eContainer instanceof UIComponent)
	}
	
	def isChildOfComponent(UIComponentInstance inst, String name) {
		val cont = inst.component.eContainer
		cont instanceof ChildUIComponent && cont.eContainer instanceof UIComponent &&
			(cont.eContainer as UIComponent).name == name
	}
	
}
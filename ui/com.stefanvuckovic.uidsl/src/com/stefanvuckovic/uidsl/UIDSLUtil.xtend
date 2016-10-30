package com.stefanvuckovic.uidsl

import com.stefanvuckovic.domainmodel.domainModel.AttributeType
import com.stefanvuckovic.domainmodel.domainModel.Expression
import com.stefanvuckovic.dto.DTOUtil
import com.stefanvuckovic.uidsl.scoping.CustomIndex
import com.stefanvuckovic.uidsl.types.TypeConformance
import com.stefanvuckovic.uidsl.uIDSL.AlternativeType
import com.stefanvuckovic.uidsl.uIDSL.ChildUIComponent
import com.stefanvuckovic.uidsl.uIDSL.CollectionGeneralType
import com.stefanvuckovic.uidsl.uIDSL.CustomDefaultComponentsDefinition
import com.stefanvuckovic.uidsl.uIDSL.EnumGeneralType
import com.stefanvuckovic.uidsl.uIDSL.Field
import com.stefanvuckovic.uidsl.uIDSL.IterationExpression
import com.stefanvuckovic.uidsl.uIDSL.MemberSelectionExpression
import com.stefanvuckovic.uidsl.uIDSL.Method
import com.stefanvuckovic.uidsl.uIDSL.ObjectGeneralType
import com.stefanvuckovic.uidsl.uIDSL.PageType
import com.stefanvuckovic.uidsl.uIDSL.PropertyRuntimeType
import com.stefanvuckovic.uidsl.uIDSL.PropertySingleRuntimeType
import com.stefanvuckovic.uidsl.uIDSL.PropertyValue
import com.stefanvuckovic.uidsl.uIDSL.ServerComponent
import com.stefanvuckovic.uidsl.uIDSL.UIComponent
import com.stefanvuckovic.uidsl.uIDSL.UIComponentInstance
import com.stefanvuckovic.uidsl.uIDSL.VariableReference
import javax.inject.Inject
import org.eclipse.emf.ecore.EObject

class UIDSLUtil {
	
	@Inject DTOUtil dtoUtil
	@Inject extension CustomIndex
	@Inject extension TypeConformance
	
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
	
	def getCustomDefaultComponents(EObject ctx) {
		val customDefaults = ctx.visibleCustomComponentDefaults
		if(customDefaults.size == 1) {
			val custom = customDefaults.head
			var customDef = custom.EObjectOrProxy
			if(customDef.eIsProxy) {
				customDef = ctx.eResource.resourceSet.getEObject(custom.EObjectURI, true)
			}
			(customDef as CustomDefaultComponentsDefinition).defaults
		}
	}
	
	def getCustomDefaultComponentForType(EObject ctx, AttributeType type, boolean input) {
		val compType = if(input) "input" else "output"
		ctx.customDefaultComponents?.findFirst[c | areTypesSame(type, c.type.type) && c.compType == compType]
	}
	
	def VariableReference getReferencedVariableFromExpression(Expression e) {
		switch(e) {
			VariableReference:
				e
			MemberSelectionExpression:
				e.firstReceiver
			IterationExpression:
				e.expression.referencedVariableFromExpression
			default:
				null
		}
	}  
	
	def VariableReference getFirstReceiver(MemberSelectionExpression e) {
		val rec = e.receiver
		if(rec instanceof VariableReference) {
			return rec
		} else {
			return getFirstReceiver(rec as MemberSelectionExpression)
		}
	}
	
}
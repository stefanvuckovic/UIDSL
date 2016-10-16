/*
 * generated by Xtext 2.10.0
 */
package com.stefanvuckovic.uidsl.scoping

import com.stefanvuckovic.domainmodel.domainModel.AttributeType
import com.stefanvuckovic.domainmodel.domainModel.DomainModelPackage
import com.stefanvuckovic.domainmodel.domainModel.Enum
import com.stefanvuckovic.domainmodel.domainModel.RefType
import com.stefanvuckovic.dto.DTOUtil
import com.stefanvuckovic.dto.dTO.DTOClass
import com.stefanvuckovic.uidsl.LibraryConstants
import com.stefanvuckovic.uidsl.UIDSLUtil
import com.stefanvuckovic.uidsl.types.TypeComputing
import com.stefanvuckovic.uidsl.types.TypeConformance
import com.stefanvuckovic.uidsl.uIDSL.AllAllowedComponents
import com.stefanvuckovic.uidsl.uIDSL.ChildUIComponent
import com.stefanvuckovic.uidsl.uIDSL.CustomAllowedComponents
import com.stefanvuckovic.uidsl.uIDSL.CustomDefaultComponentDefinition
import com.stefanvuckovic.uidsl.uIDSL.DefaultComponentConfig
import com.stefanvuckovic.uidsl.uIDSL.ExistingNestedComponents
import com.stefanvuckovic.uidsl.uIDSL.Fragment
import com.stefanvuckovic.uidsl.uIDSL.IterationExpression
import com.stefanvuckovic.uidsl.uIDSL.Iterator
import com.stefanvuckovic.uidsl.uIDSL.MemberSelectionExpression
import com.stefanvuckovic.uidsl.uIDSL.Page
import com.stefanvuckovic.uidsl.uIDSL.PropertyRuntimeType
import com.stefanvuckovic.uidsl.uIDSL.PropertyValue
import com.stefanvuckovic.uidsl.uIDSL.PropertyValueInstance
import com.stefanvuckovic.uidsl.uIDSL.ServerComponent
import com.stefanvuckovic.uidsl.uIDSL.Template
import com.stefanvuckovic.uidsl.uIDSL.TemplateFragment
import com.stefanvuckovic.uidsl.uIDSL.TemplateFragmentOverride
import com.stefanvuckovic.uidsl.uIDSL.UIComponent
import com.stefanvuckovic.uidsl.uIDSL.UIComponentInstance
import com.stefanvuckovic.uidsl.uIDSL.UIDSLPackage
import com.stefanvuckovic.uidsl.uIDSL.UIModel
import javax.inject.Inject
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.impl.SimpleScope

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import static extension org.eclipse.xtext.EcoreUtil2.*

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class UIDSLScopeProvider extends AbstractUIDSLScopeProvider {
	
	@Inject extension CustomIndex
	@Inject extension TypeComputing
	@Inject extension DTOUtil
	@Inject extension UIDSLUtil
	@Inject extension TypeConformance
	
	val pack = UIDSLPackage.eINSTANCE
	
	override getScope(EObject context, EReference reference) {
		if(reference == DomainModelPackage.eINSTANCE.refType_Reference &&
			context.rootContainer instanceof UIModel) {
			return scopeForConcept(context)
		} else if(reference == pack.variableReference_Ref) {
			return scopeForVariableReference(context) 
		} else if(context instanceof MemberSelectionExpression) {
			return scopeForMemberSelectionExpression(context)
		} else if(reference == pack.propertyValueInstance_Property) {
			return scopeForPropertyValue(context)
		} else if(reference == pack.UIComponentInstance_Component && context.eContainer instanceof UIComponentInstance) {
			return scopeForNestedUIComponents(context)
		} else if(reference == pack.propertyRuntimeType_Property) {
			return scopeForRuntimeTypeProperties(context as PropertyRuntimeType)
		} else if(reference == pack.defaultComponentConfig_InputComp || 
			reference == pack.defaultComponentConfig_OutputComp) {
			return scopeForDefaultComponents(context as DefaultComponentConfig)
		} else if(reference == pack.templateFragmentOverride_OverridenFragment) {
			return scopeForTemplateFragments(context as TemplateFragmentOverride)
		} else {
			super.getScope(context, reference)
		}
	}
	
	override scopeForConcept(EObject context) {
		val outerScope = new SimpleScope(context.listOfVisibleConceptsDescriptionsFromOtherFiles)
		Scopes.scopeFor((context.rootContainer as UIModel).concepts.filter(ServerComponent), outerScope)
	}

	def IScope scopeForVariableReference(EObject context) {
		val container = context.eContainer
		if(context instanceof PropertyValueInstance) {
			//if context is property value instance, that means that container is UIComponentInstance
			//and variables defined in that UIComponentInstance should not participate in building scope
			//so we skip one level
			scopeForVariableReference(container)
		} else {
			return switch (container) {
				Page:
					Scopes.scopeFor(container.params + container.serverComponents)
				Fragment:
					Scopes.scopeFor(container.params + container.serverComponents)
				CustomDefaultComponentDefinition:
					Scopes.scopeFor(newArrayList(container.type) + container.implicits)
				Template:
					Scopes.scopeFor(container.serverComponents)
				Iterator:
					Scopes.scopeFor(newArrayList(container.expression.^var), scopeForVariableReference(container))
				UIComponentInstance:
					Scopes.scopeFor(container.properties.filter[it.value instanceof IterationExpression].map[(it.value as IterationExpression).^var],
						scopeForVariableReference(container)
					)
				default:
					scopeForVariableReference(container)
			}
		}
	}

	def protected IScope scopeForMemberSelectionExpression(MemberSelectionExpression sel) {
		val type = sel.receiver.type

		if (type == null || !(type instanceof RefType)) {
			return IScope.NULLSCOPE
		}
		
		val concept = (type as RefType).reference
		switch(concept) {
			DTOClass:
				Scopes.scopeFor(concept.attributes, 
				Scopes.scopeFor(concept.attributesFromClassHierarchy))
			Enum:
				Scopes.scopeFor(concept.attributes)
			ServerComponent:
				if(sel.isIsMethod) {
					return Scopes.scopeFor(concept.methods + concept.fields)
				} else {
					return Scopes.scopeFor(concept.fields + concept.methods)
				}
		}
	}
	
	def scopeForPropertyValue(EObject context) {
		var compInstance = if (context instanceof UIComponentInstance) context else context.eContainer as UIComponentInstance
		Scopes.scopeFor(compInstance.component.properties)
	}
	
	def scopeForNestedUIComponents(EObject context) {
		val compInstance = context.eContainer as UIComponentInstance
		val comp = compInstance.component
		val nestedComps = comp.nested
		if(nestedComps != null) {
			switch(nestedComps) {
				ChildUIComponent:
					return Scopes.scopeFor(newArrayList(nestedComps.comp))
				ExistingNestedComponents: {
					val existingNestedComps = nestedComps.nestedComponents
					switch(existingNestedComps) {
						CustomAllowedComponents:
							return Scopes.scopeFor(existingNestedComps.components)
						AllAllowedComponents: {
							return new SimpleScope(comp.visibleUIComponentsFromLibrary)
						}
					}
				}
			}
		}
		IScope.NULLSCOPE
	}
	
	def scopeForRuntimeTypeProperties(PropertyRuntimeType type) {
		val propertyValue = type.getContainerOfType(PropertyValue)
		Scopes.scopeFor((propertyValue.eContainer as UIComponent).properties.filter[it !== propertyValue])
	}
	
	def scopeForDefaultComponents(DefaultComponentConfig conf) {
		val type = conf.type
		val res = conf.eResource.resourceSet.getResource(URI.createPlatformResourceURI(LibraryConstants.DEFAULT_COMPONENTS_LIBRARY_PATH, true), true)
		if(res != null) {
			val comps = res.allContents.toIterable.filter(UIComponent)
			val validComps = comps.filter[hasValuePropertyWithConformantType(type)]
			return Scopes.scopeFor(validComps)
		}		
//		val uiModelDesc = getExportedUIModelByResourceURI(conf, LibraryConstants.DEFAULT_COMPONENTS_LIBRARY_PATH)
//		if(uiModelDesc != null) {
//			var model = uiModelDesc.EObjectOrProxy
//			if(conf.eIsProxy) {
//				model = conf.eResource.resourceSet.getEObject(uiModelDesc.EObjectURI, true)
//			}
//			val m = model as UIModel
//			val uiComps = m.concepts.filter(UIComponent)
//			val validComps = uiComps.filter[hasValuePropertyWithConformantType(type)]
//			return Scopes.scopeFor(validComps)
//		}
	
	 	return IScope.NULLSCOPE
	}
	
	def hasValuePropertyWithConformantType(UIComponent c, AttributeType type) {
		val prop = c.properties.findFirst[valueProperty]
		if(prop != null && prop.type != null) {
			val attrType = prop.type.calculateTypeExpressionType
			return type.isConformant(attrType)
		}
		false
	}
	
	def scopeForTemplateFragments(TemplateFragmentOverride templateFragment) {
		val page = templateFragment.eContainer as Page
		val template = page.template
		if(template != null) {
			return Scopes.scopeFor(template.elements.filter(TemplateFragment))
		}
		return IScope.NULLSCOPE
	}

}

package com.stefanvuckovic.uidsl.scoping

import com.stefanvuckovic.domainmodel.domainModel.DomainModelPackage
import com.stefanvuckovic.uidsl.uIDSL.UIDSLPackage
import javax.inject.Inject
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.resource.IContainer
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider
import java.net.URI

class CustomIndex {
	@Inject ResourceDescriptionsProvider rdp
	@Inject IContainer.Manager cm
	
	def getListOfVisibleConceptsDescriptionsFromOtherFiles(EObject o) {
		val conceptsSet = getSetOfVisibleConceptsDescriptionsFromOtherFiles(o)
		conceptsSet.toList
	}
	
	def getSetOfVisibleConceptsDescriptionsFromOtherFiles(EObject o) {
		val allVisibleClasses =
			o.getVisibleConceptsDescriptions
		val allExportedClasses =
			o.getExportedConceptsEObjectDescriptions
		if(!allVisibleClasses.empty && allExportedClasses != null) {
			val difference = allVisibleClasses.toSet
			difference.removeAll(allExportedClasses.toSet)
			return difference
		} else {
			return newArrayList()
		}
	}
	
	def getVisibleConceptsDescriptions(EObject o) {
		//TODO check if there is a better way of defining which resources should be included
		//this is my improvisation, I did not find example like this anywhere
		o.getVisibleContainers.map [c | 
			c.resourceDescriptions.map[r | 
				if(r.URI.fileExtension == "domain") {
					r.getExportedObjectsByType(DomainModelPackage.eINSTANCE.enum)
				} else if(r.URI.fileExtension == "dto" || r.URI.fileExtension == "ui") {
					r.getExportedObjectsByType(DomainModelPackage.eINSTANCE.concept)
				} else {
					newArrayList()
				}
			].flatten
		].flatten
	}

	def getVisibleUIComponentsFromLibrary(EObject o) {
		o.getVisibleEObjectDescriptions(UIDSLPackage.eINSTANCE.UIComponent)
	}
	
	def getVisibleDefaultConfigurations(EObject o) {
		o.getVisibleEObjectDescriptions(UIDSLPackage.eINSTANCE.defaultConfigurations)
	}
	
	def getVisibleEObjectDescriptions(EObject o, EClass type) {
		o.getVisibleContainers.map [ container |
			container.getExportedObjectsByType(type)
		].flatten
	}

	def getVisibleContainers(EObject o) {
		//val res = o.eResource
		//val uri = res.URI
		//uri.toString
		val index = rdp.getResourceDescriptions(o.eResource)
		val rd = index.getResourceDescription(o.eResource.URI)
		if(rd == null) {
			return newArrayList()
		}
		cm.getVisibleContainers(rd, index)
	}

	def getResourceDescription(EObject o) {
		val index = rdp.getResourceDescriptions(o.eResource)
		index.getResourceDescription(o.eResource.URI)
	}

	def getExportedEObjectDescriptions(EObject o) {
		o.getResourceDescription?.getExportedObjects
	}

	def getExportedConceptsEObjectDescriptions(EObject o) {
		o.getResourceDescription?.getExportedObjectsByType(DomainModelPackage.eINSTANCE.concept)
	}
	
	
	def getExportedUIModelByResourceURI(EObject context, String fileUri) {
		val res = getResourceByURI(context, fileUri)
		if(res != null) {
			res.getExportedObjectsByType(UIDSLPackage.eINSTANCE.UIModel).head
		}
	}
	
	def getResourceByURI(EObject context, String fileUri) {
		val uri = org.eclipse.emf.common.util.URI.createPlatformResourceURI(fileUri, true)
		for(IContainer c : context.visibleContainers) {
			val res = c.getResourceDescription(uri)
			if(res != null) {
				return res
			}
		}
	}
	
	
}
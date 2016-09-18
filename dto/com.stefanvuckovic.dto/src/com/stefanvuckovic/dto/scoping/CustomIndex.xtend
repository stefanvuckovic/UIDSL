package com.stefanvuckovic.dto.scoping

import com.stefanvuckovic.domainmodel.domainModel.DomainModelPackage
import javax.inject.Inject
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.resource.IContainer
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider

class CustomIndex {
	@Inject ResourceDescriptionsProvider rdp
	@Inject IContainer.Manager cm

	def getVisibleConceptsDescriptionsFromOtherFiles(EObject o) {
		val conceptsSet = getSetOfVisibleConceptsDescriptionsFromOtherFiles(o)
		conceptsSet.toMap[conceptNameFromEObjectDescription]
	}
	
	def getListOfVisibleConceptsDescriptionsFromOtherFiles(EObject o) {
		val conceptsSet = getSetOfVisibleConceptsDescriptionsFromOtherFiles(o)
		conceptsSet.toList
	}
	
	def getSetOfVisibleConceptsDescriptionsFromOtherFiles(EObject o) {
		val allVisibleClasses =
			o.getVisibleConceptsDescriptions
		val allExportedClasses =
			o.getExportedConceptsEObjectDescriptions
		val difference = allVisibleClasses.toSet
		difference.removeAll(allExportedClasses.toSet)
		difference
	}
	
	def getConceptNameFromEObjectDescription(IEObjectDescription desc) {
		desc.name.toString
	}

	def getVisibleConceptsDescriptions(EObject o) {
		o.getVisibleEObjectDescriptions(DomainModelPackage.eINSTANCE.concept)
	}

	def getVisibleEObjectDescriptions(EObject o, EClass cl) {
		//TODO check if there is a better way of defining which resources should be included
		//this is my improvisations, I did not find anywhere example like this
		o.getVisibleContainers.map [c | 
			c.resourceDescriptions.map[r | 
				if(r.URI.fileExtension == "dto") {
					r.getExportedObjectsByType(cl)
				} else if(r.URI.fileExtension == "domain") {
					r.getExportedObjectsByType(DomainModelPackage.eINSTANCE.enum)
				} else {
					newArrayList()
				}
			].flatten
		].flatten
	}

	def getVisibleContainers(EObject o) {
		val index = rdp.getResourceDescriptions(o.eResource)
		val rd = index.getResourceDescription(o.eResource.URI)
		cm.getVisibleContainers(rd, index)
	}

	def getResourceDescription(EObject o) {
		val index = rdp.getResourceDescriptions(o.eResource)
		index.getResourceDescription(o.eResource.URI)
	}

	def getExportedEObjectDescriptions(EObject o) {
		o.getResourceDescription.getExportedObjects
	}

	def getExportedConceptsEObjectDescriptions(EObject o) {
		o.getResourceDescription.getExportedObjectsByType(DomainModelPackage.eINSTANCE.concept)
	}
	
}
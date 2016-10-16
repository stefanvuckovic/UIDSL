package com.stefanvuckovic.uidsl.validation

import org.eclipse.emf.ecore.EClass
import com.stefanvuckovic.uidsl.uIDSL.UIDSLPackage
import org.eclipse.xtext.validation.NamesAreUniqueValidationHelper

class CustomNamesAreUniqueValidator extends NamesAreUniqueValidationHelper {
	 
	override protected EClass getAssociatedClusterType(EClass eClass) {
		if (UIDSLPackage.eINSTANCE.variable == eClass) { 
			return null;
		}
		return super.getAssociatedClusterType(eClass);
	}
}
/*
 * generated by Xtext 2.10.0
 */
package com.stefanvuckovic.uidsl.validation;

import com.stefanvuckovic.dto.validation.DTOValidator;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public abstract class AbstractUIDSLValidator extends DTOValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>(super.getEPackages());
		result.add(com.stefanvuckovic.uidsl.uIDSL.UIDSLPackage.eINSTANCE);
		return result;
	}
	
}

/*
 * generated by Xtext 2.10.0
 */
package com.stefanvuckovic.domainmodel.ui.tests;

import com.google.inject.Injector;
import com.stefanvuckovic.domainmodel.ui.internal.DomainmodelActivator;
import org.eclipse.xtext.junit4.IInjectorProvider;

public class DomainModelUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return DomainmodelActivator.getInstance().getInjector("com.stefanvuckovic.domainmodel.DomainModel");
	}

}
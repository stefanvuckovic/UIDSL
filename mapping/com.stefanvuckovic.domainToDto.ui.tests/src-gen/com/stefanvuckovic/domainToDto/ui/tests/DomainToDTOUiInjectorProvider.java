/*
 * generated by Xtext 2.10.0
 */
package com.stefanvuckovic.domainToDto.ui.tests;

import com.google.inject.Injector;
import com.stefanvuckovic.domainToDto.ui.internal.DomainToDtoActivator;
import org.eclipse.xtext.junit4.IInjectorProvider;

public class DomainToDTOUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return DomainToDtoActivator.getInstance().getInjector("com.stefanvuckovic.domainToDto.DomainToDTO");
	}

}
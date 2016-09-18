/*
 * generated by Xtext 2.10.0
 */
package com.stefanvuckovic.dto.ui;

import com.google.inject.Injector;
import com.stefanvuckovic.dto.ui.internal.DtoActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class DTOExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return DtoActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return DtoActivator.getInstance().getInjector(DtoActivator.COM_STEFANVUCKOVIC_DTO_DTO);
	}
	
}
/*
 * generated by Xtext 2.10.0
 */
package com.stefanvuckovic.domainmodel

import com.google.inject.Binder
import org.eclipse.xtext.resource.IResourceServiceProvider

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class DomainModelRuntimeModule extends AbstractDomainModelRuntimeModule {
	
	override configure(Binder binder) {
		super.configure(binder)
		binder.bind(IResourceServiceProvider).to(CustomServiceProvider);
	}
	
}

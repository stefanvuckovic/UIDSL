/*
 * generated by Xtext 2.10.0
 */
package com.stefanvuckovic.domainToDto


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class DomainToDTOStandaloneSetup extends DomainToDTOStandaloneSetupGenerated {

	def static void doSetup() {
		new DomainToDTOStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
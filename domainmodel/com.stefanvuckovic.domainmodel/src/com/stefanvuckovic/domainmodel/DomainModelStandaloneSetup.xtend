/*
 * generated by Xtext 2.10.0
 */
package com.stefanvuckovic.domainmodel


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class DomainModelStandaloneSetup extends DomainModelStandaloneSetupGenerated {

	def static void doSetup() {
		new DomainModelStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
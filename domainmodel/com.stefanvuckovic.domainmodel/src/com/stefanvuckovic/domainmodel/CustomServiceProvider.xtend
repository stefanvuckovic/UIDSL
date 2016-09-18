package com.stefanvuckovic.domainmodel

import org.eclipse.xtext.resource.impl.DefaultResourceServiceProvider
import org.eclipse.emf.common.util.URI

class CustomServiceProvider extends DefaultResourceServiceProvider {
	
	override canHandle(URI uri) {
		val ext = uri.fileExtension
		val bool = ext == "domain"
		bool
	}
	
}
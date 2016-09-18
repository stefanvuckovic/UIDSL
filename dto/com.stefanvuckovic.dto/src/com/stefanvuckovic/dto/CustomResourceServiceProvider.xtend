package com.stefanvuckovic.dto

import org.eclipse.xtext.resource.impl.DefaultResourceServiceProvider
import org.eclipse.emf.common.util.URI

class CustomResourceServiceProvider extends DefaultResourceServiceProvider {
	
	override canHandle(URI uri) {
		val ext = uri.fileExtension
		val bool = ext == "dto"
		bool
	}
}
package com.stefanvuckovic.uidsl

import com.stefanvuckovic.uidsl.LibraryConstants
import com.stefanvuckovic.uidsl.types.TypeComputing
import com.stefanvuckovic.uidsl.types.TypeConformance
import com.stefanvuckovic.uidsl.uIDSL.DefaultComponent
import com.stefanvuckovic.uidsl.uIDSL.DefaultComponentConfig
import com.stefanvuckovic.uidsl.uIDSL.DefaultConfigurations
import com.stefanvuckovic.uidsl.uIDSL.OutputUIComponent
import javax.inject.Inject
import org.eclipse.emf.common.util.URI

class GeneratorUtil {
	 
	@Inject extension TypeComputing
	@Inject extension TypeConformance
	
	def getUIComponentForDefaultComponent(DefaultComponent c) {
		val type = c.value.type
		val output = c instanceof OutputUIComponent
		val res = c.eResource.resourceSet.getResource(URI.createPlatformResourceURI(LibraryConstants.DEFAULT_CONFIGURATION_LIBRARY_PATH, true), true)
		if(res != null) {
			val defaults = res.allContents.toIterable.filter(DefaultConfigurations).head.defaults
			defaults.findFirst[def | type.isConformant(def.type)].getInputOrOutputComp(output)
		}		
	}
	
	def getInputOrOutputComp(DefaultComponentConfig config, boolean output) {
		if(output) {
			config.outputComp
		} else {
			config.inputComp
		}
	}
}
/*
 * generated by Xtext 2.10.0
 */
package com.stefanvuckovic.domainToDto.tests

import com.google.inject.Inject
import com.stefanvuckovic.domainToDto.domainToDTO.MappingModel
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(DomainToDTOInjectorProvider)
class DomainToDTOParsingTest{

	@Inject
	ParseHelper<MappingModel> parseHelper

	@Test 
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assert.assertNotNull(result)
	}

}

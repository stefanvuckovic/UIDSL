/*
 * generated by Xtext 2.10.0
 */
package com.stefanvuckovic.uidsl.validation

import org.eclipse.xtext.validation.Check
import com.stefanvuckovic.uidsl.uIDSL.MemberSelectionExpression
import com.stefanvuckovic.uidsl.uIDSL.Method
import com.stefanvuckovic.uidsl.uIDSL.UIDSLPackage
import com.stefanvuckovic.uidsl.uIDSL.Field

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class UIDSLValidator extends AbstractUIDSLValidator {
	
@Check 
def void checkNumberOfParametersInMethodCall(MemberSelectionExpression selection) {
		val member = selection.member
		if (member instanceof Method) {
			if (member.params.size != selection.params.size) {
				error("Wrong number of parameters: expected " + member.params.size + " but was " + selection.params.size,
					UIDSLPackage.eINSTANCE.memberSelectionExpression_Member)
			}
		}
}

@Check
def void checkMemberSelection(MemberSelectionExpression selection) {
	val member = selection.member

	if (member instanceof Field && selection.isIsMethod) {
		error(
			"Method invocation on a field",
			UIDSLPackage.eINSTANCE.memberSelectionExpression_IsMethod)
	}
	else if (member instanceof Method && !selection.isIsMethod) {
		error(
			"Field selection on a method",
			UIDSLPackage.eINSTANCE.memberSelectionExpression_Member
		)
	}
}
	
}
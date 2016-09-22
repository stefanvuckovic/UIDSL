package com.stefanvuckovic.uidsl.types

import com.stefanvuckovic.domainmodel.domainModel.Expression
import com.stefanvuckovic.uidsl.uIDSL.MemberSelectionExpression
import com.stefanvuckovic.uidsl.uIDSL.Method
import com.stefanvuckovic.uidsl.uIDSL.UIDSLPackage
import com.stefanvuckovic.uidsl.uIDSL.VariableReference
import javax.inject.Inject
import org.eclipse.emf.ecore.EObject

class TypeComputing {

	@Inject com.stefanvuckovic.domainmodel.types.TypeComputing typeComputer
	
	def EObject getType(Expression e) {
		switch (e) {
			MemberSelectionExpression:
				e.member.type
			VariableReference:
				e.ref.type
			default:
				typeComputer.getType(e)
		}
	}

	def getExpectedType(Expression e) {
		val cont = e.eContainer
		val feature = e.eContainingFeature
		switch (cont) {
			MemberSelectionExpression case feature == UIDSLPackage.eINSTANCE.memberSelectionExpression_Params: {
				//here we assume that it is a method and there is a corresponding param in right position.
				//If assumption is not correct, other validation rules will take care of that.
				val member = cont.member
				val indexOfParam = cont.params.indexOf(e)
				if(member instanceof Method && (member as Method).params.size > indexOfParam) {
					(member as Method).params.get(cont.params.indexOf(e)).type
				}
				else {
					null
				}
			}
		}
	}

}
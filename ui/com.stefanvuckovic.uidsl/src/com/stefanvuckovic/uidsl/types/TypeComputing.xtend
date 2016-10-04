package com.stefanvuckovic.uidsl.types

import com.stefanvuckovic.domainmodel.domainModel.AttributeType
import com.stefanvuckovic.domainmodel.domainModel.CollectionType
import com.stefanvuckovic.domainmodel.domainModel.Expression
import com.stefanvuckovic.uidsl.uIDSL.IFStatement
import com.stefanvuckovic.uidsl.uIDSL.InlineVariable
import com.stefanvuckovic.uidsl.uIDSL.IterationExpression
import com.stefanvuckovic.uidsl.uIDSL.MemberSelectionExpression
import com.stefanvuckovic.uidsl.uIDSL.Method
import com.stefanvuckovic.uidsl.uIDSL.PageCall
import com.stefanvuckovic.uidsl.uIDSL.PropertyRuntimeType
import com.stefanvuckovic.uidsl.uIDSL.PropertySingleRuntimeType
import com.stefanvuckovic.uidsl.uIDSL.PropertyValueInstance
import com.stefanvuckovic.uidsl.uIDSL.SimpleType
import com.stefanvuckovic.uidsl.uIDSL.UIComponentInstance
import com.stefanvuckovic.uidsl.uIDSL.UIDSLFactory
import com.stefanvuckovic.uidsl.uIDSL.UIDSLPackage
import com.stefanvuckovic.uidsl.uIDSL.VariableReference
import javax.inject.Inject
import com.stefanvuckovic.uidsl.uIDSL.TypeExpression
import com.stefanvuckovic.uidsl.uIDSL.PropertyValue
import com.stefanvuckovic.uidsl.UIDSLUtil

import static extension org.eclipse.xtext.EcoreUtil2.*

class TypeComputing {

	@Inject com.stefanvuckovic.domainmodel.types.TypeComputing typeComputer
	@Inject extension UIDSLUtil
	
	public static val COLLECTION_TYPE = UIDSLFactory.eINSTANCE.createCollectionGeneralType
	public static val PAGE_TYPE = UIDSLFactory.eINSTANCE.createPageType
	public static val SINGLE_TYPE = new SingleAnyType()
	
	def AttributeType getType(Expression e) {
		switch (e) {
			MemberSelectionExpression:
				e.member.type
			VariableReference:
				e.calculateType
			IterationExpression:
				e.expression.type
			PageCall:
				PAGE_TYPE
			default:
				typeComputer.getType(e)
		}
	}
	
	def AttributeType calculateType(VariableReference vr) {
		val v = vr.ref
		if(v instanceof InlineVariable) {
			val iterationExprType = (v.eContainer as IterationExpression).type
			if(iterationExprType instanceof CollectionType) {
				iterationExprType.ofType
			} else {
				null
			}
		} else {
			vr.ref.type
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
			IterationExpression:
				COLLECTION_TYPE
			IFStatement:
				com.stefanvuckovic.domainmodel.types.TypeComputing.BOOL_TYPE
			PropertyValueInstance:
				cont.propertyValueInstanceType
		}
	}
	
	def getPropertyValueInstanceType(PropertyValueInstance propInstance) {
		val exprType = propInstance.property.type
		switch(exprType) {
			SimpleType:
				exprType.type
			PropertyRuntimeType:
				exprType.getPropertyRuntimeType(propInstance)
			PropertySingleRuntimeType: {
				val attrType = exprType.propertyType.getPropertyRuntimeType(propInstance)
				if(attrType instanceof CollectionType) {
					attrType.ofType
				}
			}
		}
	}
	
	def getPropertyRuntimeType(PropertyRuntimeType type, PropertyValueInstance propInstance) {
		val propValueInstance = (propInstance.eContainer as UIComponentInstance).properties.filter[PropertyValueInstance prop | prop.property === type.property]?.head
		if(propValueInstance != null) {
			propInstance.value.type
		}	
	}
	
	def AttributeType calculateTypeExpressionType(TypeExpression type) {
		val property = type.getContainerOfType(PropertyValue)
		if(property.hierarchyOfTypeDependentProperties.contains(property)) {
			return null
		}
		switch(type) {
			SimpleType:
				type.type
			PropertyRuntimeType:
				type.property.type.calculateTypeExpressionType
			PropertySingleRuntimeType:
				SINGLE_TYPE
		}
	}

}
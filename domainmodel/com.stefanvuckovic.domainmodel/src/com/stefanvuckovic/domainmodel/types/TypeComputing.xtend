package com.stefanvuckovic.domainmodel.types

import com.stefanvuckovic.domainmodel.domainModel.AttributeType
import com.stefanvuckovic.domainmodel.domainModel.BoolConstant
import com.stefanvuckovic.domainmodel.domainModel.DateConstant
import com.stefanvuckovic.domainmodel.domainModel.DomainModelFactory
import com.stefanvuckovic.domainmodel.domainModel.Enum
import com.stefanvuckovic.domainmodel.domainModel.EnumLiteral
import com.stefanvuckovic.domainmodel.domainModel.Expression
import com.stefanvuckovic.domainmodel.domainModel.IntConstant
import com.stefanvuckovic.domainmodel.domainModel.LongConstant
import com.stefanvuckovic.domainmodel.domainModel.Null
import com.stefanvuckovic.domainmodel.domainModel.StringConstant

class TypeComputing {

	public static val STRING_TYPE = DomainModelFactory.eINSTANCE.createStringType
	public static val INT_TYPE = DomainModelFactory.eINSTANCE.createIntType
	public static val LONG_TYPE = DomainModelFactory.eINSTANCE.createLongType
	public static val BOOL_TYPE = DomainModelFactory.eINSTANCE.createBoolType
	public static val DATE_TYPE = DomainModelFactory.eINSTANCE.createDateType
	public static val NULL_TYPE = new NullType
	
	def AttributeType getType(Expression c) {
		switch (c) {
			StringConstant:
				STRING_TYPE
			IntConstant:
				INT_TYPE
			LongConstant:
				LONG_TYPE
			BoolConstant:
				BOOL_TYPE
			DateConstant:
				DATE_TYPE
			Null:
				NULL_TYPE
		}
	}

	def getExpectedType(Expression e) {
		val cont = e.eContainer
		switch (cont) {
			EnumLiteral:
				{
					val enumCont = cont.eContainer as Enum
					try {
						return (enumCont.attributes.get((cont as EnumLiteral).params.indexOf(e))).type
					} catch (Throwable t) {
						return null // otherwise there is no specific expected type
					}
				}
		}
	}

}
package com.stefanvuckovic.uidsl

import com.stefanvuckovic.uidsl.uIDSL.ServerComponent
import com.stefanvuckovic.uidsl.uIDSL.Field
import com.stefanvuckovic.uidsl.uIDSL.Method

class UIDSLUtil {
	
	def getFields(ServerComponent sc) {
		sc.members.filter(Field)
	}

	def getMethods(ServerComponent sc) {
		sc.members.filter(Method)
	}
}
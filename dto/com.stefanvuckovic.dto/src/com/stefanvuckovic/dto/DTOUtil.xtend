package com.stefanvuckovic.dto

import com.stefanvuckovic.dto.dTO.DTOClass

class DTOUtil {
	
	def getHierarchyForClass(DTOClass c) {
		val hierarchy = newLinkedHashSet()
		
		var curr = c.superType
		while(curr != null && !hierarchy.contains(curr)) {
			hierarchy.add(curr)
			curr = curr.superType
		}
		hierarchy
	}
	
	def getAttributesFromClassHierarchy(DTOClass c) {
		c.hierarchyForClass.map[attributes].flatten
	}

}
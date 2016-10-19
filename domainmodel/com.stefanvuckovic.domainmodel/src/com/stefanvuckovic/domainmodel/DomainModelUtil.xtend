package com.stefanvuckovic.domainmodel

import com.stefanvuckovic.domainmodel.domainModel.Attribute
import com.stefanvuckovic.domainmodel.domainModel.AttributeType
import com.stefanvuckovic.domainmodel.domainModel.BoolType
import com.stefanvuckovic.domainmodel.domainModel.Cardinality
import com.stefanvuckovic.domainmodel.domainModel.CollectionType
import com.stefanvuckovic.domainmodel.domainModel.Concept
import com.stefanvuckovic.domainmodel.domainModel.DateType
import com.stefanvuckovic.domainmodel.domainModel.Entity
import com.stefanvuckovic.domainmodel.domainModel.EntityDeleteOption
import com.stefanvuckovic.domainmodel.domainModel.Enum
import com.stefanvuckovic.domainmodel.domainModel.InheritanceMappingOption
import com.stefanvuckovic.domainmodel.domainModel.IntType
import com.stefanvuckovic.domainmodel.domainModel.LongType
import com.stefanvuckovic.domainmodel.domainModel.PartOf
import com.stefanvuckovic.domainmodel.domainModel.RefType
import com.stefanvuckovic.domainmodel.domainModel.RelationshipOwner
import com.stefanvuckovic.domainmodel.domainModel.Required
import com.stefanvuckovic.domainmodel.domainModel.SingleType
import com.stefanvuckovic.domainmodel.domainModel.StringType
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.common.util.URI
import com.stefanvuckovic.domainmodel.domainModel.Model
import com.stefanvuckovic.domainmodel.domainModel.DecimalType

class DomainModelUtil {
	
	def getHierarchyForEntity(Entity entity) {
		val hierarchy = newLinkedHashSet()
		
		var curr = entity.superType
		while(curr != null && !hierarchy.contains(curr)) {
			hierarchy.add(curr)
			curr = curr.superType
		}
		hierarchy
	}
	
	def getHierarchyForEntityWithCommonEntityIncluded(Entity entity) {
		val obj = entity.objectFromLibrary
		val hierarchy = entity.hierarchyForEntity
		if(obj != null) {
			return hierarchy + newArrayList(obj)
		} else {
			return hierarchy
		}
	}
	
	def getObjectFromLibrary(EObject ctx) {
		val res = ctx?.eResource?.resourceSet?.getResource(URI.createPlatformResourceURI(LibraryConstants.COMMON_ENTITY_LIBRARY, true), true)
		if(res != null) {
			val model = res.allContents.toIterable.head as Model
			model.concepts.filter[c | c instanceof Entity && (c as Entity).name == LibraryConstants.COMMON_ENTITY_NAME].head as Entity
		}		
	}

	def getEntityHierarchyAttributes(Entity e) {
		e.hierarchyForEntity.map[attributes].flatten
	}
	
	def getEntityHierarchyAttributesWithCommonAttributesIncluded(Entity e) {
		e.hierarchyForEntityWithCommonEntityIncluded.map[attributes].flatten
	}
	
	def getAttributeEntityRefTypeIfExists(AttributeType attrType) {
		var concept = getConceptRefTypeIfExists(attrType)
//		if(concept != null && concept.eIsProxy) {
//			concept = EcoreUtil2.resolve(concept, attrType) as Concept
//		}
		if(concept instanceof Entity) {
			return concept as Entity
		} else {
			return null
		}
	}
	
	def getAttributeEnumRefTypeIfExists(AttributeType attrType) {
		val concept = getConceptRefTypeIfExists(attrType)
		if(concept instanceof Enum) {
			return concept as Enum
		} else {
			return null
		}
	}
	
	def getConceptRefTypeIfExists(AttributeType attrType) {
		var Concept concept
		if(attrType instanceof RefType) {
			concept = (attrType as RefType).reference
		} else if(attrType instanceof CollectionType 
			&& (attrType as CollectionType).ofType instanceof RefType
		) {
			concept = ((attrType as CollectionType).ofType as RefType).reference
		} 
		concept	
	}
	
	def inheritanceMapping(Entity e) {
		e.options.filter(InheritanceMappingOption)?.head
	}
	
	def deleteOption(Entity e) {
		e.options.filter(EntityDeleteOption)?.head 
	}
	
	def requiredOption(Attribute a) {
		a.options.filter(Required)?.head 
	}
	
	def partOfOption(Attribute a) {
		a.options.filter(PartOf)?.head 
	}
	
	def relationshipOwner(Attribute a) {
		a.options.filter(RelationshipOwner)?.head 
	}
	
	def cardinality(Attribute a) {
		a.options.filter(Cardinality)?.head
	}
	
	def collectionType(AttributeType type) {
		type instanceof CollectionType
	}
	
	def singleType(AttributeType type) {
		type instanceof SingleType
	}
	
	def String typeToString(AttributeType type) {
		switch(type) {
			StringType:
				"string"
			IntType:
				"int"
			LongType:
				"long"
			BoolType:
				"boolean"
			DateType:
				"date"
			DecimalType:
				"decimal"
			RefType:
				type.reference.name
			CollectionType:
				"List<" + type.ofType.typeToString + ">"
		}
	}
	
	def getCorrespondingAttributeFromRelatedEntityIfExists(Attribute attr) {
		var Attribute relatedAttr
		val ent = attr.eContainer as Entity
		val relationshipMapping = attr.relationshipOwner
		if(relationshipMapping != null) {
			relatedAttr = relationshipMapping.relationshipOwner.member
			val attrEntityType = relatedAttr.type.attributeEntityRefTypeIfExists
			if(relatedAttr == null || attrEntityType == null || attrEntityType !== ent) {
				return null
			}
		} else {
			val entityType = attr.type.attributeEntityRefTypeIfExists
			if(entityType == null) {
				return null
			}
			for(a : entityType.attributes) {
				val entType = a.type.attributeEntityRefTypeIfExists
				if(entType != null && entType === ent) {
					var relationship = a.relationshipOwner
					if(relationship != null) {
						if(relationship.relationshipOwner.member === attr) {
							relatedAttr = a
						}
					}
				}
			}
		}
		relatedAttr
	}

}
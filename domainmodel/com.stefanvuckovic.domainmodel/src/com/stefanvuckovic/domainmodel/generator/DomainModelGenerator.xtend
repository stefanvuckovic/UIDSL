/*
 * generated by Xtext 2.10.0
 */
package com.stefanvuckovic.domainmodel.generator

import com.stefanvuckovic.domainmodel.DomainModelUtil
import com.stefanvuckovic.domainmodel.domainModel.AttributeType
import com.stefanvuckovic.domainmodel.domainModel.BasicType
import com.stefanvuckovic.domainmodel.domainModel.CollectionType
import com.stefanvuckovic.domainmodel.domainModel.DomainModelFactory
import com.stefanvuckovic.domainmodel.domainModel.Entity
import com.stefanvuckovic.domainmodel.domainModel.InheritanceMappingOption
import com.stefanvuckovic.domainmodel.domainModel.RefType
import com.stefanvuckovic.domainmodel.domainModel.SingleType
import javax.inject.Inject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import com.stefanvuckovic.domainmodel.domainModel.Model
import com.stefanvuckovic.domainmodel.domainModel.Concept
import com.stefanvuckovic.domainmodel.domainModel.Constant
import com.stefanvuckovic.domainmodel.domainModel.IntConstant
import com.stefanvuckovic.domainmodel.domainModel.LongConstant
import com.stefanvuckovic.domainmodel.domainModel.StringConstant
import com.stefanvuckovic.domainmodel.domainModel.DateConstant
import com.stefanvuckovic.domainmodel.domainModel.BoolConstant
import com.stefanvuckovic.domainmodel.domainModel.Null
import com.stefanvuckovic.domainmodel.domainModel.Attribute
import com.stefanvuckovic.domainmodel.domainModel.EnumLiteral
import com.stefanvuckovic.domainmodel.domainModel.Cardinality
import com.stefanvuckovic.domainmodel.domainModel.CardinalityType
import com.stefanvuckovic.domainmodel.domainModel.RelationshipOwner
import com.stefanvuckovic.domainmodel.domainModel.DateType
import com.stefanvuckovic.domainmodel.domainModel.BoolType
import com.stefanvuckovic.domainmodel.domainModel.StringType
import com.stefanvuckovic.domainmodel.domainModel.IntType
import com.stefanvuckovic.domainmodel.domainModel.LongType

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class DomainModelGenerator extends AbstractGenerator {

	@Inject extension DomainModelUtil
	 
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val model = resource.allContents.toIterable.filter(Model).head
		for (c : model.concepts) {
			fsa.generateFile('''domain/«c.name».java''', c.compile)
		}
	}
	
	def compile(Concept concept) {
		switch(concept) {
			Entity:
				compile(concept)
			com.stefanvuckovic.domainmodel.domainModel.Enum:
				compile(concept, "domain")
		}	
	}
	
	def compile(com.stefanvuckovic.domainmodel.domainModel.Enum en, String packageName) '''
		package «packageName»;
		
		public enum «en.name» {
			«en.literals.map[compile].join(",\n")»;
			
			«IF !en.attributes.empty»
			private «en.name»(«en.attributes.map[compileAttributeForEnumConstructor].join(", ")») {
				«FOR attribute : en.attributes»
				«attribute.compileAttributeAssignmentInEnumConstructor»
				«ENDFOR»
			}
			«ENDIF»
			
			«FOR attribute : en.attributes»
			private «attribute.type.compile» «attribute.name»;
			«ENDFOR»
		
			«FOR attribute : en.attributes»
			public «attribute.type.compile» «attribute.type.getter»«attribute.name.toFirstUpper»() {
				return «attribute.name»;
			}
			
			«ENDFOR»
		}
	'''
	
	def compileAttributeAssignmentInEnumConstructor(Attribute attribute) '''
		«IF attribute.type instanceof DateType»
		if(«attribute.name» != null) {
			try {
				this.«attribute.name» = (new java.text.SimpleDateFormat(«"\""»dd/MM/yyy«"\""»)).parse(«attribute.name»);
			} catch(Exception e) {}
		}
		«ELSE»
		this.«attribute.name» = «attribute.name»;
		«ENDIF»
	'''
	
	def compile(EnumLiteral literal) '''
		«literal.name»«IF !literal.params.empty»(«ENDIF»«literal.params.map[compile].join(", ")»«IF !literal.params.empty»)«ENDIF»'''
	
	def compileAttributeForEnumConstructor(Attribute attr) {
		var String type
		if(attr.type instanceof DateType) {
			type = "String"
		} else {
			type = attr.type.compile
		}
		type + " " + attr.name
	}
	
	def compile(Constant const) {
		switch(const) {
			IntConstant:
				const.value
			LongConstant:
				const.value + "L"
			StringConstant:
				"\"" + const.value + "\""
			DateConstant:
				"\"" + const.day + "/" + const.month + "/" + const.year + "\""
			BoolConstant:
				const.value
			Null:
				"null"
		}
	}
	
	def compile(Entity entity) {
		val additionalAttrs = newArrayList()
		if(entity.superType == null) {
			additionalAttrs.add(getIdAttribute())
		}
		val deleteOption = entity.deleteOption
		if(deleteOption != null) {
			additionalAttrs.add(getDeleteAttribute())
		}
		'''
			package domain;
			
			@javax.persistence.Entity
			«entity.inheritanceMapping.compile»
			public class «entity.name» «IF entity.superType != null»extends «entity.superType.name» «ENDIF»{
				«FOR attribute : entity.attributes»
				private «attribute.type.compile» «attribute.name»;
				«ENDFOR»
				«FOR attribute : additionalAttrs»
				private «attribute.type.compile» «attribute.name»;
				«ENDFOR»
			
				«FOR attribute : entity.attributes»
				«attribute.compileAttributeAnnotations»
				public «attribute.type.compile» «attribute.type.getter»«attribute.name.toFirstUpper»() {
					return «attribute.name»;
				}
				
				public void set«attribute.name.toFirstUpper»(«attribute.type.compile» «attribute.name») {
					this.«attribute.name» = «attribute.name»;
				}
				
				«ENDFOR»
				«FOR attribute : additionalAttrs»
				«attribute.compileAttributeAnnotations»
				public «attribute.type.compile» «attribute.type.getter»«attribute.name.toFirstUpper»() {
					return «attribute.name»;
				}
				
				public void set«attribute.name.toFirstUpper»(«attribute.type.compile» «attribute.name») {
					this.«attribute.name» = «attribute.name»;
				}
				
				«ENDFOR»
			}
		'''
	}
	
	def compileAttributeAnnotations(Attribute attr) '''
		«IF attr.name.equals("id")»
		@javax.persistence.Id
		@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.TABLE)
		«ENDIF»
		«IF attr.type.attributeEnumRefTypeIfExists != null»
		@javax.persistence.Enumerated(javax.persistence.EnumType.STRING)
		«ENDIF»
		«IF attr.type.collectionType && (attr.type as CollectionType).ofType.attributeEntityRefTypeIfExists == null»
		@javax.persistence.ElementCollection
		«ENDIF»
		«IF attr.type.attributeEntityRefTypeIfExists != null»
		«val partOf = attr.partOfOption != null»
		«val relationshipOwner = attr.relationshipOwner»
		«attr.cardinality.getAnnotationBasedOnCardinality(attr.type.collectionType)»(«IF partOf»«generatePartOf(attr.cardinality)»«ENDIF»«IF partOf», «ENDIF»«IF relationshipOwner != null»«relationshipOwner.generateRelationshipOwner»«ENDIF»)
		«ENDIF»
	'''
	
	def generateRelationshipOwner(RelationshipOwner owner) {
		"mappedBy = \"" + owner.relationshipOwner.member.name + "\""
	}
	
	def generatePartOf(Cardinality card) {
		"cascade = javax.persistence.CascadeType.ALL" + if(card.card == CardinalityType.ONE) ", orphanRemoval = true" else ""	
	}
	
	def getAnnotationBasedOnCardinality(Cardinality card, boolean isCollection) {
		var annotation = "@javax.persistence."
		switch(card.card) {
			case CardinalityType.ONE:
				annotation += "OneTo"
			case CardinalityType.MANY:
				annotation += "ManyTo"
		}	
		annotation = annotation + if(isCollection) "Many" else "One"
	} 
	
	def getDeleteAttribute() {
		createAndReturnAttributeWithBasicType("deleted", 
			DomainModelFactory.eINSTANCE.createBoolType
		)
	}
	
	def getIdAttribute() {
		createAndReturnAttributeWithBasicType("id", 
			DomainModelFactory.eINSTANCE.createLongType
		)
	}
	
	def createAndReturnAttributeWithBasicType(String attrName, BasicType type) {
		val factory = DomainModelFactory.eINSTANCE
		val attr = factory.createAttribute => [name = attrName]
		attr.type = type
		attr
	}
	
	def compile(InheritanceMappingOption o) {
		if(o == null) {
			return ""
		} else {
			return "@javax.persistence.Inheritance(strategy = javax.persistence.InheritanceType." + 
				o.inheritanceMapping.type.inheritanceTypeToString + ")"
		}
	}
	
	def inheritanceTypeToString(String type) {
		switch(type) {
			case "SINGLE_TABLE":
				return type
			case "TABLE_PER_CONCRETE_CLASS":
				return "TABLE_PER_CLASS"
			case "TABLE_PER_CLASS":
				return "JOINED"
		}
	}
	
	def compile(AttributeType type) {
		if(type instanceof CollectionType) {
			return "java.util.List<" + (type as CollectionType).ofType.typeString(false) + ">"
		} else if(type instanceof SingleType) {
			return (type as SingleType).typeString(true)
		}
	}
	
	def getter(AttributeType type) {
		if(type instanceof BoolType) {
			return "is"
		}
		"get"
	}
	
	def dispatch typeString(BasicType type, boolean primitive) {
		switch(type) {
			StringType:
				return "String"
			IntType:
				if(primitive) {
					return "int"
				} else {
					return "Integer"
				}
			LongType:
				if(primitive) {
					return "long"
				} else {
					return "Long"
				}
			BoolType:
				if(primitive) {
					return "boolean"
				} else {
					return "Boolean"
				}
			DateType:
				return "java.util.Date"
		}
	}
	
	def dispatch typeString(RefType type, boolean primitive) {
		type.reference.name
	}
}

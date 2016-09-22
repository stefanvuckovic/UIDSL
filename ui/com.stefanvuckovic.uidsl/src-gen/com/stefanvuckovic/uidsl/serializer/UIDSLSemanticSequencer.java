/*
 * generated by Xtext 2.10.0
 */
package com.stefanvuckovic.uidsl.serializer;

import com.google.inject.Inject;
import com.stefanvuckovic.domainmodel.domainModel.Attribute;
import com.stefanvuckovic.domainmodel.domainModel.BoolConstant;
import com.stefanvuckovic.domainmodel.domainModel.BoolType;
import com.stefanvuckovic.domainmodel.domainModel.Cardinality;
import com.stefanvuckovic.domainmodel.domainModel.CollectionType;
import com.stefanvuckovic.domainmodel.domainModel.DateConstant;
import com.stefanvuckovic.domainmodel.domainModel.DateType;
import com.stefanvuckovic.domainmodel.domainModel.DomainModelPackage;
import com.stefanvuckovic.domainmodel.domainModel.Entity;
import com.stefanvuckovic.domainmodel.domainModel.EntityDeleteOption;
import com.stefanvuckovic.domainmodel.domainModel.EnumLiteral;
import com.stefanvuckovic.domainmodel.domainModel.InheritanceMappingOption;
import com.stefanvuckovic.domainmodel.domainModel.InheritanceMappingType;
import com.stefanvuckovic.domainmodel.domainModel.IntConstant;
import com.stefanvuckovic.domainmodel.domainModel.IntType;
import com.stefanvuckovic.domainmodel.domainModel.LongConstant;
import com.stefanvuckovic.domainmodel.domainModel.LongType;
import com.stefanvuckovic.domainmodel.domainModel.Model;
import com.stefanvuckovic.domainmodel.domainModel.Null;
import com.stefanvuckovic.domainmodel.domainModel.PartOf;
import com.stefanvuckovic.domainmodel.domainModel.RefType;
import com.stefanvuckovic.domainmodel.domainModel.RelationshipOwner;
import com.stefanvuckovic.domainmodel.domainModel.Required;
import com.stefanvuckovic.domainmodel.domainModel.SelectionMember;
import com.stefanvuckovic.domainmodel.domainModel.StaticFieldSelection;
import com.stefanvuckovic.domainmodel.domainModel.StringConstant;
import com.stefanvuckovic.domainmodel.domainModel.StringType;
import com.stefanvuckovic.dto.dTO.DTOClass;
import com.stefanvuckovic.dto.dTO.DTOModel;
import com.stefanvuckovic.dto.dTO.DTOPackage;
import com.stefanvuckovic.dto.dTO.EmailType;
import com.stefanvuckovic.dto.dTO.FileType;
import com.stefanvuckovic.dto.dTO.ImageType;
import com.stefanvuckovic.dto.dTO.PasswordType;
import com.stefanvuckovic.dto.dTO.TextType;
import com.stefanvuckovic.dto.serializer.DTOSemanticSequencer;
import com.stefanvuckovic.uidsl.services.UIDSLGrammarAccess;
import com.stefanvuckovic.uidsl.uIDSL.Field;
import com.stefanvuckovic.uidsl.uIDSL.Fragment;
import com.stefanvuckovic.uidsl.uIDSL.MemberSelectionExpression;
import com.stefanvuckovic.uidsl.uIDSL.Method;
import com.stefanvuckovic.uidsl.uIDSL.Page;
import com.stefanvuckovic.uidsl.uIDSL.ServerComponent;
import com.stefanvuckovic.uidsl.uIDSL.Template;
import com.stefanvuckovic.uidsl.uIDSL.UIDSLPackage;
import com.stefanvuckovic.uidsl.uIDSL.UIModel;
import com.stefanvuckovic.uidsl.uIDSL.Variable;
import com.stefanvuckovic.uidsl.uIDSL.VariableReference;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class UIDSLSemanticSequencer extends DTOSemanticSequencer {

	@Inject
	private UIDSLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == DTOPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DTOPackage.DTO_CLASS:
				sequence_DTOClass(context, (DTOClass) semanticObject); 
				return; 
			case DTOPackage.DTO_MODEL:
				sequence_DTOModel(context, (DTOModel) semanticObject); 
				return; 
			case DTOPackage.EMAIL_TYPE:
				sequence_BasicType(context, (EmailType) semanticObject); 
				return; 
			case DTOPackage.FILE_TYPE:
				sequence_BasicType(context, (FileType) semanticObject); 
				return; 
			case DTOPackage.IMAGE_TYPE:
				sequence_BasicType(context, (ImageType) semanticObject); 
				return; 
			case DTOPackage.PASSWORD_TYPE:
				sequence_BasicType(context, (PasswordType) semanticObject); 
				return; 
			case DTOPackage.TEXT_TYPE:
				sequence_BasicType(context, (TextType) semanticObject); 
				return; 
			}
		else if (epackage == DomainModelPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DomainModelPackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case DomainModelPackage.BOOL_CONSTANT:
				sequence_Constant(context, (BoolConstant) semanticObject); 
				return; 
			case DomainModelPackage.BOOL_TYPE:
				sequence_BasicType(context, (BoolType) semanticObject); 
				return; 
			case DomainModelPackage.CARDINALITY:
				sequence_AttributeOption(context, (Cardinality) semanticObject); 
				return; 
			case DomainModelPackage.COLLECTION_TYPE:
				sequence_CollectionType(context, (CollectionType) semanticObject); 
				return; 
			case DomainModelPackage.DATE_CONSTANT:
				sequence_Constant(context, (DateConstant) semanticObject); 
				return; 
			case DomainModelPackage.DATE_TYPE:
				sequence_BasicType(context, (DateType) semanticObject); 
				return; 
			case DomainModelPackage.ENTITY:
				sequence_Entity(context, (Entity) semanticObject); 
				return; 
			case DomainModelPackage.ENTITY_DELETE_OPTION:
				sequence_EntityOption(context, (EntityDeleteOption) semanticObject); 
				return; 
			case DomainModelPackage.ENUM:
				sequence_Enum(context, (com.stefanvuckovic.domainmodel.domainModel.Enum) semanticObject); 
				return; 
			case DomainModelPackage.ENUM_LITERAL:
				sequence_EnumLiteral(context, (EnumLiteral) semanticObject); 
				return; 
			case DomainModelPackage.INHERITANCE_MAPPING_OPTION:
				sequence_EntityOption(context, (InheritanceMappingOption) semanticObject); 
				return; 
			case DomainModelPackage.INHERITANCE_MAPPING_TYPE:
				sequence_InheritanceMappingType(context, (InheritanceMappingType) semanticObject); 
				return; 
			case DomainModelPackage.INT_CONSTANT:
				sequence_Constant(context, (IntConstant) semanticObject); 
				return; 
			case DomainModelPackage.INT_TYPE:
				sequence_BasicType(context, (IntType) semanticObject); 
				return; 
			case DomainModelPackage.LONG_CONSTANT:
				sequence_Constant(context, (LongConstant) semanticObject); 
				return; 
			case DomainModelPackage.LONG_TYPE:
				sequence_BasicType(context, (LongType) semanticObject); 
				return; 
			case DomainModelPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case DomainModelPackage.NULL:
				sequence_Constant(context, (Null) semanticObject); 
				return; 
			case DomainModelPackage.PART_OF:
				sequence_AttributeOption(context, (PartOf) semanticObject); 
				return; 
			case DomainModelPackage.REF_TYPE:
				sequence_RefType(context, (RefType) semanticObject); 
				return; 
			case DomainModelPackage.RELATIONSHIP_OWNER:
				sequence_AttributeOption(context, (RelationshipOwner) semanticObject); 
				return; 
			case DomainModelPackage.REQUIRED:
				sequence_AttributeOption(context, (Required) semanticObject); 
				return; 
			case DomainModelPackage.SELECTION_MEMBER:
				sequence_DumbSelectionMember(context, (SelectionMember) semanticObject); 
				return; 
			case DomainModelPackage.STATIC_FIELD_SELECTION:
				sequence_StaticFieldSelection(context, (StaticFieldSelection) semanticObject); 
				return; 
			case DomainModelPackage.STRING_CONSTANT:
				sequence_Constant(context, (StringConstant) semanticObject); 
				return; 
			case DomainModelPackage.STRING_TYPE:
				sequence_BasicType(context, (StringType) semanticObject); 
				return; 
			}
		else if (epackage == UIDSLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case UIDSLPackage.FIELD:
				sequence_TypedConcept(context, (Field) semanticObject); 
				return; 
			case UIDSLPackage.FRAGMENT:
				sequence_Fragment(context, (Fragment) semanticObject); 
				return; 
			case UIDSLPackage.MEMBER_SELECTION_EXPRESSION:
				sequence_MemberSelectionExpression(context, (MemberSelectionExpression) semanticObject); 
				return; 
			case UIDSLPackage.METHOD:
				sequence_Method_TypedConcept(context, (Method) semanticObject); 
				return; 
			case UIDSLPackage.PAGE:
				sequence_Page(context, (Page) semanticObject); 
				return; 
			case UIDSLPackage.SERVER_COMPONENT:
				sequence_ServerComponent(context, (ServerComponent) semanticObject); 
				return; 
			case UIDSLPackage.TEMPLATE:
				sequence_Template(context, (Template) semanticObject); 
				return; 
			case UIDSLPackage.UI_MODEL:
				sequence_UIModel(context, (UIModel) semanticObject); 
				return; 
			case UIDSLPackage.VARIABLE:
				sequence_TypedConcept(context, (Variable) semanticObject); 
				return; 
			case UIDSLPackage.VARIABLE_REFERENCE:
				sequence_AtomExpression(context, (VariableReference) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Expression returns VariableReference
	 *     MemberSelectionExpression returns VariableReference
	 *     MemberSelectionExpression.MemberSelectionExpression_1_0 returns VariableReference
	 *     AtomExpression returns VariableReference
	 *
	 * Constraint:
	 *     ref=[Variable|ID]
	 */
	protected void sequence_AtomExpression(ISerializationContext context, VariableReference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UIDSLPackage.Literals.VARIABLE_REFERENCE__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UIDSLPackage.Literals.VARIABLE_REFERENCE__REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomExpressionAccess().getRefVariableIDTerminalRuleCall_1_1_0_1(), semanticObject.getRef());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     UIConcept returns Fragment
	 *     UIContainer returns Fragment
	 *     Fragment returns Fragment
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Fragment(ISerializationContext context, Fragment semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UIDSLPackage.Literals.UI_CONTAINER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UIDSLPackage.Literals.UI_CONTAINER__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFragmentAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns MemberSelectionExpression
	 *     MemberSelectionExpression returns MemberSelectionExpression
	 *     MemberSelectionExpression.MemberSelectionExpression_1_0 returns MemberSelectionExpression
	 *
	 * Constraint:
	 *     (
	 *         receiver=MemberSelectionExpression_MemberSelectionExpression_1_0 
	 *         member=[SelectionMember|ID] 
	 *         (isMethod?='(' (params+=Expression params+=Expression*)?)?
	 *     )
	 */
	protected void sequence_MemberSelectionExpression(ISerializationContext context, MemberSelectionExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Member returns Method
	 *     Method returns Method
	 *     SelectionMember returns Method
	 *
	 * Constraint:
	 *     (type=AttributeType name=ID params+=Variable params+=Variable*)
	 */
	protected void sequence_Method_TypedConcept(ISerializationContext context, Method semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UIConcept returns Page
	 *     UIContainer returns Page
	 *     Page returns Page
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Page(ISerializationContext context, Page semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UIDSLPackage.Literals.UI_CONTAINER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UIDSLPackage.Literals.UI_CONTAINER__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPageAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     UIConcept returns ServerComponent
	 *     Concept returns ServerComponent
	 *     ServerComponent returns ServerComponent
	 *
	 * Constraint:
	 *     (name=ID members+=Member* expressions+=Expression*)
	 */
	protected void sequence_ServerComponent(ISerializationContext context, ServerComponent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UIConcept returns Template
	 *     UIContainer returns Template
	 *     Template returns Template
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Template(ISerializationContext context, Template semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UIDSLPackage.Literals.UI_CONTAINER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UIDSLPackage.Literals.UI_CONTAINER__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTemplateAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Member returns Field
	 *     Field returns Field
	 *     SelectionMember returns Field
	 *
	 * Constraint:
	 *     (type=AttributeType name=ID)
	 */
	protected void sequence_TypedConcept(ISerializationContext context, Field semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DomainModelPackage.Literals.SELECTION_MEMBER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainModelPackage.Literals.SELECTION_MEMBER__TYPE));
			if (transientValues.isValueTransient(semanticObject, DomainModelPackage.Literals.SELECTION_MEMBER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainModelPackage.Literals.SELECTION_MEMBER__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTypedConceptAccess().getTypeAttributeTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getTypedConceptAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Variable returns Variable
	 *
	 * Constraint:
	 *     (type=AttributeType name=ID)
	 */
	protected void sequence_TypedConcept(ISerializationContext context, Variable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UIDSLPackage.Literals.VARIABLE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UIDSLPackage.Literals.VARIABLE__TYPE));
			if (transientValues.isValueTransient(semanticObject, UIDSLPackage.Literals.VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UIDSLPackage.Literals.VARIABLE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTypedConceptAccess().getTypeAttributeTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getTypedConceptAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     UIModel returns UIModel
	 *
	 * Constraint:
	 *     concepts+=UIConcept+
	 */
	protected void sequence_UIModel(ISerializationContext context, UIModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}

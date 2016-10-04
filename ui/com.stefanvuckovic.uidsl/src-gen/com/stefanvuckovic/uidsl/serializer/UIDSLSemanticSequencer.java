/*
 * generated by Xtext 2.10.0
 */
package com.stefanvuckovic.uidsl.serializer;

import com.google.inject.Inject;
import com.stefanvuckovic.domainmodel.domainModel.Attribute;
import com.stefanvuckovic.domainmodel.domainModel.BoolConstant;
import com.stefanvuckovic.domainmodel.domainModel.BoolType;
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
import com.stefanvuckovic.domainmodel.domainModel.RefType;
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
import com.stefanvuckovic.dto.dTO.ObjectRepresentation;
import com.stefanvuckovic.dto.dTO.PasswordType;
import com.stefanvuckovic.dto.dTO.TextType;
import com.stefanvuckovic.dto.serializer.DTOSemanticSequencer;
import com.stefanvuckovic.uidsl.services.UIDSLGrammarAccess;
import com.stefanvuckovic.uidsl.uIDSL.AllAllowedComponents;
import com.stefanvuckovic.uidsl.uIDSL.AlternativeType;
import com.stefanvuckovic.uidsl.uIDSL.AnyType;
import com.stefanvuckovic.uidsl.uIDSL.ChildUIComponent;
import com.stefanvuckovic.uidsl.uIDSL.CollectionGeneralType;
import com.stefanvuckovic.uidsl.uIDSL.CustomAllowedComponents;
import com.stefanvuckovic.uidsl.uIDSL.DefaultComponentConfig;
import com.stefanvuckovic.uidsl.uIDSL.DefaultConfigurations;
import com.stefanvuckovic.uidsl.uIDSL.EnumGeneralType;
import com.stefanvuckovic.uidsl.uIDSL.ExistingNestedComponents;
import com.stefanvuckovic.uidsl.uIDSL.Field;
import com.stefanvuckovic.uidsl.uIDSL.Fragment;
import com.stefanvuckovic.uidsl.uIDSL.FragmentCall;
import com.stefanvuckovic.uidsl.uIDSL.IFStatement;
import com.stefanvuckovic.uidsl.uIDSL.InlineVariable;
import com.stefanvuckovic.uidsl.uIDSL.InputUIComponent;
import com.stefanvuckovic.uidsl.uIDSL.IterationExpression;
import com.stefanvuckovic.uidsl.uIDSL.Iterator;
import com.stefanvuckovic.uidsl.uIDSL.MemberSelectionExpression;
import com.stefanvuckovic.uidsl.uIDSL.Method;
import com.stefanvuckovic.uidsl.uIDSL.ObjectGeneralType;
import com.stefanvuckovic.uidsl.uIDSL.OutputUIComponent;
import com.stefanvuckovic.uidsl.uIDSL.Page;
import com.stefanvuckovic.uidsl.uIDSL.PageCall;
import com.stefanvuckovic.uidsl.uIDSL.PageType;
import com.stefanvuckovic.uidsl.uIDSL.PropertyRuntimeType;
import com.stefanvuckovic.uidsl.uIDSL.PropertySingleRuntimeType;
import com.stefanvuckovic.uidsl.uIDSL.PropertyValue;
import com.stefanvuckovic.uidsl.uIDSL.PropertyValueInstance;
import com.stefanvuckovic.uidsl.uIDSL.ServerComponent;
import com.stefanvuckovic.uidsl.uIDSL.SimpleType;
import com.stefanvuckovic.uidsl.uIDSL.Template;
import com.stefanvuckovic.uidsl.uIDSL.TemplateFragment;
import com.stefanvuckovic.uidsl.uIDSL.TemplateFragmentOverride;
import com.stefanvuckovic.uidsl.uIDSL.UIComponent;
import com.stefanvuckovic.uidsl.uIDSL.UIComponentInstance;
import com.stefanvuckovic.uidsl.uIDSL.UIDSLPackage;
import com.stefanvuckovic.uidsl.uIDSL.UIModel;
import com.stefanvuckovic.uidsl.uIDSL.Variable;
import com.stefanvuckovic.uidsl.uIDSL.VariableReference;
import com.stefanvuckovic.uidsl.uIDSL.VoidType;
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
			case DTOPackage.OBJECT_REPRESENTATION:
				sequence_AttributeOption(context, (ObjectRepresentation) semanticObject); 
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
			case DomainModelPackage.REF_TYPE:
				sequence_RefType(context, (RefType) semanticObject); 
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
			case UIDSLPackage.ALL_ALLOWED_COMPONENTS:
				sequence_AllowedNestedComponents(context, (AllAllowedComponents) semanticObject); 
				return; 
			case UIDSLPackage.ALTERNATIVE_TYPE:
				sequence_AlternativeType(context, (AlternativeType) semanticObject); 
				return; 
			case UIDSLPackage.ANY_TYPE:
				sequence_AnyType(context, (AnyType) semanticObject); 
				return; 
			case UIDSLPackage.CHILD_UI_COMPONENT:
				sequence_ChildUIComponent(context, (ChildUIComponent) semanticObject); 
				return; 
			case UIDSLPackage.COLLECTION_GENERAL_TYPE:
				sequence_GeneralType(context, (CollectionGeneralType) semanticObject); 
				return; 
			case UIDSLPackage.CUSTOM_ALLOWED_COMPONENTS:
				sequence_AllowedNestedComponents(context, (CustomAllowedComponents) semanticObject); 
				return; 
			case UIDSLPackage.DEFAULT_COMPONENT_CONFIG:
				sequence_DefaultComponentConfig(context, (DefaultComponentConfig) semanticObject); 
				return; 
			case UIDSLPackage.DEFAULT_CONFIGURATIONS:
				sequence_DefaultConfigurations(context, (DefaultConfigurations) semanticObject); 
				return; 
			case UIDSLPackage.ENUM_GENERAL_TYPE:
				sequence_GeneralType(context, (EnumGeneralType) semanticObject); 
				return; 
			case UIDSLPackage.EXISTING_NESTED_COMPONENTS:
				sequence_NestedComponent(context, (ExistingNestedComponents) semanticObject); 
				return; 
			case UIDSLPackage.FIELD:
				sequence_TypedConcept(context, (Field) semanticObject); 
				return; 
			case UIDSLPackage.FRAGMENT:
				sequence_Fragment_ServerComponentUsage_UIContainerDefinition(context, (Fragment) semanticObject); 
				return; 
			case UIDSLPackage.FRAGMENT_CALL:
				sequence_FragmentCall_Params(context, (FragmentCall) semanticObject); 
				return; 
			case UIDSLPackage.IF_STATEMENT:
				sequence_IFStatement(context, (IFStatement) semanticObject); 
				return; 
			case UIDSLPackage.INLINE_VARIABLE:
				sequence_InlineVariable(context, (InlineVariable) semanticObject); 
				return; 
			case UIDSLPackage.INPUT_UI_COMPONENT:
				sequence_DefaultUIComponent(context, (InputUIComponent) semanticObject); 
				return; 
			case UIDSLPackage.ITERATION_EXPRESSION:
				sequence_IterationExpression(context, (IterationExpression) semanticObject); 
				return; 
			case UIDSLPackage.ITERATOR:
				sequence_Iterator(context, (Iterator) semanticObject); 
				return; 
			case UIDSLPackage.MEMBER_SELECTION_EXPRESSION:
				sequence_MemberSelectionExpression_Params(context, (MemberSelectionExpression) semanticObject); 
				return; 
			case UIDSLPackage.METHOD:
				sequence_Method_TypedConcept(context, (Method) semanticObject); 
				return; 
			case UIDSLPackage.OBJECT_GENERAL_TYPE:
				sequence_GeneralType(context, (ObjectGeneralType) semanticObject); 
				return; 
			case UIDSLPackage.OUTPUT_UI_COMPONENT:
				sequence_DefaultUIComponent(context, (OutputUIComponent) semanticObject); 
				return; 
			case UIDSLPackage.PAGE:
				sequence_Page_ServerComponentUsage_UIContainerDefinition(context, (Page) semanticObject); 
				return; 
			case UIDSLPackage.PAGE_CALL:
				sequence_PageCall_Params(context, (PageCall) semanticObject); 
				return; 
			case UIDSLPackage.PAGE_TYPE:
				sequence_PageType(context, (PageType) semanticObject); 
				return; 
			case UIDSLPackage.PROPERTY_RUNTIME_TYPE:
				sequence_PropertyRuntimeType(context, (PropertyRuntimeType) semanticObject); 
				return; 
			case UIDSLPackage.PROPERTY_SINGLE_RUNTIME_TYPE:
				sequence_PropertySingleRuntimeType(context, (PropertySingleRuntimeType) semanticObject); 
				return; 
			case UIDSLPackage.PROPERTY_VALUE:
				sequence_PropertyValue(context, (PropertyValue) semanticObject); 
				return; 
			case UIDSLPackage.PROPERTY_VALUE_INSTANCE:
				sequence_PropertyValueInstance(context, (PropertyValueInstance) semanticObject); 
				return; 
			case UIDSLPackage.SERVER_COMPONENT:
				sequence_ServerComponent(context, (ServerComponent) semanticObject); 
				return; 
			case UIDSLPackage.SIMPLE_TYPE:
				sequence_TypeExpression(context, (SimpleType) semanticObject); 
				return; 
			case UIDSLPackage.TEMPLATE:
				sequence_ServerComponentUsage_Template(context, (Template) semanticObject); 
				return; 
			case UIDSLPackage.TEMPLATE_FRAGMENT:
				sequence_TemplateFragment(context, (TemplateFragment) semanticObject); 
				return; 
			case UIDSLPackage.TEMPLATE_FRAGMENT_OVERRIDE:
				sequence_TemplateFragmentOverride(context, (TemplateFragmentOverride) semanticObject); 
				return; 
			case UIDSLPackage.UI_COMPONENT:
				sequence_UIComponent(context, (UIComponent) semanticObject); 
				return; 
			case UIDSLPackage.UI_COMPONENT_INSTANCE:
				sequence_UIComponentInstance(context, (UIComponentInstance) semanticObject); 
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
			case UIDSLPackage.VOID_TYPE:
				sequence_VoidType(context, (VoidType) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AllowedNestedComponents returns AllAllowedComponents
	 *
	 * Constraint:
	 *     {AllAllowedComponents}
	 */
	protected void sequence_AllowedNestedComponents(ISerializationContext context, AllAllowedComponents semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AllowedNestedComponents returns CustomAllowedComponents
	 *
	 * Constraint:
	 *     (components+=[UIComponent|ID] components+=[UIComponent|ID]*)
	 */
	protected void sequence_AllowedNestedComponents(ISerializationContext context, CustomAllowedComponents semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AlternativeType returns AlternativeType
	 *
	 * Constraint:
	 *     (
	 *         (types+=AttributeType | types+=GeneralType | types+=PageType) 
	 *         (types+=AttributeType | types+=GeneralType | types+=PageType) 
	 *         (types+=AttributeType | types+=GeneralType | types+=PageType)*
	 *     )
	 */
	protected void sequence_AlternativeType(ISerializationContext context, AlternativeType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AnyType returns AnyType
	 *
	 * Constraint:
	 *     {AnyType}
	 */
	protected void sequence_AnyType(ISerializationContext context, AnyType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     NestedComponent returns ChildUIComponent
	 *     ChildUIComponent returns ChildUIComponent
	 *
	 * Constraint:
	 *     (cardinality=CardinalityType comp=UIComponent)
	 */
	protected void sequence_ChildUIComponent(ISerializationContext context, ChildUIComponent semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UIDSLPackage.Literals.CHILD_UI_COMPONENT__CARDINALITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UIDSLPackage.Literals.CHILD_UI_COMPONENT__CARDINALITY));
			if (transientValues.isValueTransient(semanticObject, UIDSLPackage.Literals.CHILD_UI_COMPONENT__COMP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UIDSLPackage.Literals.CHILD_UI_COMPONENT__COMP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getChildUIComponentAccess().getCardinalityCardinalityTypeEnumRuleCall_3_0(), semanticObject.getCardinality());
		feeder.accept(grammarAccess.getChildUIComponentAccess().getCompUIComponentParserRuleCall_5_0(), semanticObject.getComp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DefaultComponentConfig returns DefaultComponentConfig
	 *
	 * Constraint:
	 *     ((type=BasicType | type=GeneralType) inputComp=[UIComponent|ID] outputComp=[UIComponent|ID])
	 */
	protected void sequence_DefaultComponentConfig(ISerializationContext context, DefaultComponentConfig semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DefaultConfigurations returns DefaultConfigurations
	 *
	 * Constraint:
	 *     (name=ID defaults+=DefaultComponentConfig+)
	 */
	protected void sequence_DefaultConfigurations(ISerializationContext context, DefaultConfigurations semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UIElement returns InputUIComponent
	 *     DefaultUIComponent returns InputUIComponent
	 *     Component returns InputUIComponent
	 *
	 * Constraint:
	 *     value=MemberSelectionExpression
	 */
	protected void sequence_DefaultUIComponent(ISerializationContext context, InputUIComponent semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UIDSLPackage.Literals.DEFAULT_COMPONENT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UIDSLPackage.Literals.DEFAULT_COMPONENT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDefaultUIComponentAccess().getValueMemberSelectionExpressionParserRuleCall_0_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     UIElement returns OutputUIComponent
	 *     DefaultUIComponent returns OutputUIComponent
	 *     Component returns OutputUIComponent
	 *
	 * Constraint:
	 *     value=MemberSelectionExpression
	 */
	protected void sequence_DefaultUIComponent(ISerializationContext context, OutputUIComponent semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UIDSLPackage.Literals.DEFAULT_COMPONENT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UIDSLPackage.Literals.DEFAULT_COMPONENT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDefaultUIComponentAccess().getValueMemberSelectionExpressionParserRuleCall_1_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     UIElement returns FragmentCall
	 *     FragmentCall returns FragmentCall
	 *
	 * Constraint:
	 *     (frag=[Fragment|ID] (params+=Expression params+=Expression*)?)
	 */
	protected void sequence_FragmentCall_Params(ISerializationContext context, FragmentCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UIContainer returns Fragment
	 *     Fragment returns Fragment
	 *
	 * Constraint:
	 *     (name=ID (params+=Variable params+=Variable*)? (serverComponents+=Variable serverComponents+=Variable*)? elements+=UIElement*)
	 */
	protected void sequence_Fragment_ServerComponentUsage_UIContainerDefinition(ISerializationContext context, Fragment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GeneralType returns CollectionGeneralType
	 *
	 * Constraint:
	 *     {CollectionGeneralType}
	 */
	protected void sequence_GeneralType(ISerializationContext context, CollectionGeneralType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GeneralType returns EnumGeneralType
	 *
	 * Constraint:
	 *     {EnumGeneralType}
	 */
	protected void sequence_GeneralType(ISerializationContext context, EnumGeneralType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GeneralType returns ObjectGeneralType
	 *
	 * Constraint:
	 *     {ObjectGeneralType}
	 */
	protected void sequence_GeneralType(ISerializationContext context, ObjectGeneralType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UIElement returns IFStatement
	 *     LogicElement returns IFStatement
	 *     IFStatement returns IFStatement
	 *
	 * Constraint:
	 *     (expression=Expression elements+=UIElement*)
	 */
	protected void sequence_IFStatement(ISerializationContext context, IFStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     InlineVariable returns InlineVariable
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_InlineVariable(ISerializationContext context, InlineVariable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UIDSLPackage.Literals.VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UIDSLPackage.Literals.VARIABLE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInlineVariableAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns IterationExpression
	 *     IterationExpression returns IterationExpression
	 *
	 * Constraint:
	 *     (var=InlineVariable expression=Expression)
	 */
	protected void sequence_IterationExpression(ISerializationContext context, IterationExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UIDSLPackage.Literals.ITERATION_EXPRESSION__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UIDSLPackage.Literals.ITERATION_EXPRESSION__VAR));
			if (transientValues.isValueTransient(semanticObject, UIDSLPackage.Literals.ITERATION_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UIDSLPackage.Literals.ITERATION_EXPRESSION__EXPRESSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIterationExpressionAccess().getVarInlineVariableParserRuleCall_0_0(), semanticObject.getVar());
		feeder.accept(grammarAccess.getIterationExpressionAccess().getExpressionExpressionParserRuleCall_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     UIElement returns Iterator
	 *     LogicElement returns Iterator
	 *     Iterator returns Iterator
	 *
	 * Constraint:
	 *     (expression=IterationExpression elements+=UIElement*)
	 */
	protected void sequence_Iterator(ISerializationContext context, Iterator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	protected void sequence_MemberSelectionExpression_Params(ISerializationContext context, MemberSelectionExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Member returns Method
	 *     Method returns Method
	 *     SelectionMember returns Method
	 *
	 * Constraint:
	 *     (type=AttributeType name=ID (params+=Variable params+=Variable*)?)
	 */
	protected void sequence_Method_TypedConcept(ISerializationContext context, Method semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NestedComponent returns ExistingNestedComponents
	 *
	 * Constraint:
	 *     nestedComponents=AllowedNestedComponents
	 */
	protected void sequence_NestedComponent(ISerializationContext context, ExistingNestedComponents semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UIDSLPackage.Literals.EXISTING_NESTED_COMPONENTS__NESTED_COMPONENTS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UIDSLPackage.Literals.EXISTING_NESTED_COMPONENTS__NESTED_COMPONENTS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNestedComponentAccess().getNestedComponentsAllowedNestedComponentsParserRuleCall_1_3_0(), semanticObject.getNestedComponents());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns PageCall
	 *     PageCall returns PageCall
	 *
	 * Constraint:
	 *     (page=[Page|ID] (params+=Expression params+=Expression*)?)
	 */
	protected void sequence_PageCall_Params(ISerializationContext context, PageCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PageType returns PageType
	 *
	 * Constraint:
	 *     {PageType}
	 */
	protected void sequence_PageType(ISerializationContext context, PageType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UIContainer returns Page
	 *     Page returns Page
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (params+=Variable params+=Variable*)? 
	 *         (serverComponents+=Variable serverComponents+=Variable*)? 
	 *         template=[Template|ID]? 
	 *         (elements+=UIElement | elements+=TemplateFragmentOverride)*
	 *     )
	 */
	protected void sequence_Page_ServerComponentUsage_UIContainerDefinition(ISerializationContext context, Page semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TypeExpression returns PropertyRuntimeType
	 *     PropertyRuntimeType returns PropertyRuntimeType
	 *
	 * Constraint:
	 *     property=[PropertyValue|ID]
	 */
	protected void sequence_PropertyRuntimeType(ISerializationContext context, PropertyRuntimeType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UIDSLPackage.Literals.PROPERTY_RUNTIME_TYPE__PROPERTY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UIDSLPackage.Literals.PROPERTY_RUNTIME_TYPE__PROPERTY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPropertyRuntimeTypeAccess().getPropertyPropertyValueIDTerminalRuleCall_2_0_1(), semanticObject.getProperty());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TypeExpression returns PropertySingleRuntimeType
	 *     PropertySingleRuntimeType returns PropertySingleRuntimeType
	 *
	 * Constraint:
	 *     propertyType=PropertyRuntimeType
	 */
	protected void sequence_PropertySingleRuntimeType(ISerializationContext context, PropertySingleRuntimeType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UIDSLPackage.Literals.PROPERTY_SINGLE_RUNTIME_TYPE__PROPERTY_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UIDSLPackage.Literals.PROPERTY_SINGLE_RUNTIME_TYPE__PROPERTY_TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPropertySingleRuntimeTypeAccess().getPropertyTypePropertyRuntimeTypeParserRuleCall_2_0(), semanticObject.getPropertyType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PropertyValueInstance returns PropertyValueInstance
	 *
	 * Constraint:
	 *     (property=[PropertyValue|ID] value=Expression)
	 */
	protected void sequence_PropertyValueInstance(ISerializationContext context, PropertyValueInstance semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UIDSLPackage.Literals.PROPERTY_VALUE_INSTANCE__PROPERTY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UIDSLPackage.Literals.PROPERTY_VALUE_INSTANCE__PROPERTY));
			if (transientValues.isValueTransient(semanticObject, UIDSLPackage.Literals.PROPERTY_VALUE_INSTANCE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UIDSLPackage.Literals.PROPERTY_VALUE_INSTANCE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPropertyValueInstanceAccess().getPropertyPropertyValueIDTerminalRuleCall_1_0_1(), semanticObject.getProperty());
		feeder.accept(grammarAccess.getPropertyValueInstanceAccess().getValueExpressionParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PropertyValue returns PropertyValue
	 *
	 * Constraint:
	 *     (name=ID required?='required'? valueProperty?='valueProperty'? type=TypeExpression)
	 */
	protected void sequence_PropertyValue(ISerializationContext context, PropertyValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UIContainer returns Template
	 *     Template returns Template
	 *
	 * Constraint:
	 *     (name=ID (serverComponents+=Variable serverComponents+=Variable*)? (elements+=UIElement | elements+=TemplateFragment)*)
	 */
	protected void sequence_ServerComponentUsage_Template(ISerializationContext context, Template semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
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
	 *     TemplateFragmentOverride returns TemplateFragmentOverride
	 *
	 * Constraint:
	 *     (overridenFragment=[TemplateFragment|ID] elements+=UIElement*)
	 */
	protected void sequence_TemplateFragmentOverride(ISerializationContext context, TemplateFragmentOverride semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TemplateFragment returns TemplateFragment
	 *
	 * Constraint:
	 *     (name=ID elements+=UIElement*)
	 */
	protected void sequence_TemplateFragment(ISerializationContext context, TemplateFragment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TypeExpression returns SimpleType
	 *
	 * Constraint:
	 *     (type=AttributeType | type=AlternativeType | type=GeneralType | type=AnyType | type=PageType)
	 */
	protected void sequence_TypeExpression(ISerializationContext context, SimpleType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     UIElement returns UIComponentInstance
	 *     UIComponentInstance returns UIComponentInstance
	 *     Component returns UIComponentInstance
	 *
	 * Constraint:
	 *     (component=[UIComponent|ID] properties+=PropertyValueInstance* childElements+=Component*)
	 */
	protected void sequence_UIComponentInstance(ISerializationContext context, UIComponentInstance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UIComponent returns UIComponent
	 *
	 * Constraint:
	 *     (name=ID properties+=PropertyValue* nested=NestedComponent?)
	 */
	protected void sequence_UIComponent(ISerializationContext context, UIComponent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UIModel returns UIModel
	 *
	 * Constraint:
	 *     (concepts+=ServerComponent | concepts+=UIContainer | concepts+=UIComponent | concepts+=DefaultConfigurations)+
	 */
	protected void sequence_UIModel(ISerializationContext context, UIModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AttributeType returns VoidType
	 *     VoidType returns VoidType
	 *
	 * Constraint:
	 *     {VoidType}
	 */
	protected void sequence_VoidType(ISerializationContext context, VoidType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}

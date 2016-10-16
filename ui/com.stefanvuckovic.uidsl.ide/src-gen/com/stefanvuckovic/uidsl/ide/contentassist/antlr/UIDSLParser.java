/*
 * generated by Xtext 2.10.0
 */
package com.stefanvuckovic.uidsl.ide.contentassist.antlr;

import com.google.inject.Inject;
import com.stefanvuckovic.uidsl.ide.contentassist.antlr.internal.InternalUIDSLParser;
import com.stefanvuckovic.uidsl.services.UIDSLGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class UIDSLParser extends AbstractContentAssistParser {

	@Inject
	private UIDSLGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalUIDSLParser createParser() {
		InternalUIDSLParser result = new InternalUIDSLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getUIModelAccess().getConceptsAlternatives_0(), "rule__UIModel__ConceptsAlternatives_0");
					put(grammarAccess.getMemberAccess().getAlternatives(), "rule__Member__Alternatives");
					put(grammarAccess.getUIContainerAccess().getAlternatives(), "rule__UIContainer__Alternatives");
					put(grammarAccess.getPageAccess().getElementsAlternatives_5_0(), "rule__Page__ElementsAlternatives_5_0");
					put(grammarAccess.getUIElementAccess().getAlternatives(), "rule__UIElement__Alternatives");
					put(grammarAccess.getNestedComponentAccess().getAlternatives(), "rule__NestedComponent__Alternatives");
					put(grammarAccess.getAllowedNestedComponentsAccess().getAlternatives(), "rule__AllowedNestedComponents__Alternatives");
					put(grammarAccess.getLogicElementAccess().getAlternatives(), "rule__LogicElement__Alternatives");
					put(grammarAccess.getTemplateAccess().getElementsAlternatives_4_0(), "rule__Template__ElementsAlternatives_4_0");
					put(grammarAccess.getExpressionAccess().getAlternatives(), "rule__Expression__Alternatives");
					put(grammarAccess.getAtomExpressionAccess().getAlternatives(), "rule__AtomExpression__Alternatives");
					put(grammarAccess.getSelectionMemberAccess().getAlternatives(), "rule__SelectionMember__Alternatives");
					put(grammarAccess.getAttributeTypeAccess().getAlternatives(), "rule__AttributeType__Alternatives");
					put(grammarAccess.getGeneralTypeAccess().getAlternatives(), "rule__GeneralType__Alternatives");
					put(grammarAccess.getAlternativeTypeAccess().getTypesAlternatives_1_0(), "rule__AlternativeType__TypesAlternatives_1_0");
					put(grammarAccess.getAlternativeTypeAccess().getTypesAlternatives_3_0(), "rule__AlternativeType__TypesAlternatives_3_0");
					put(grammarAccess.getAlternativeTypeAccess().getTypesAlternatives_4_1_0(), "rule__AlternativeType__TypesAlternatives_4_1_0");
					put(grammarAccess.getTypeExpressionAccess().getAlternatives(), "rule__TypeExpression__Alternatives");
					put(grammarAccess.getTypeExpressionAccess().getTypeAlternatives_0_1_0(), "rule__TypeExpression__TypeAlternatives_0_1_0");
					put(grammarAccess.getDefaultComponentConfigAccess().getTypeAlternatives_2_0(), "rule__DefaultComponentConfig__TypeAlternatives_2_0");
					put(grammarAccess.getDefaultUIComponentAccess().getAlternatives(), "rule__DefaultUIComponent__Alternatives");
					put(grammarAccess.getComponentAccess().getAlternatives(), "rule__Component__Alternatives");
					put(grammarAccess.getCustomDefaultComponentDefinitionAccess().getCompTypeAlternatives_1_0(), "rule__CustomDefaultComponentDefinition__CompTypeAlternatives_1_0");
					put(grammarAccess.getConceptAccess().getAlternatives(), "rule__Concept__Alternatives");
					put(grammarAccess.getAttributeOptionAccess().getAlternatives(), "rule__AttributeOption__Alternatives");
					put(grammarAccess.getBasicTypeAccess().getAlternatives(), "rule__BasicType__Alternatives");
					put(grammarAccess.getConstantAccess().getAlternatives(), "rule__Constant__Alternatives");
					put(grammarAccess.getConstantAccess().getValueAlternatives_3_1_0(), "rule__Constant__ValueAlternatives_3_1_0");
					put(grammarAccess.getOptionAccess().getAlternatives(), "rule__Option__Alternatives");
					put(grammarAccess.getEntityOptionAccess().getAlternatives(), "rule__EntityOption__Alternatives");
					put(grammarAccess.getInheritanceMappingTypeAccess().getTypeAlternatives_0(), "rule__InheritanceMappingType__TypeAlternatives_0");
					put(grammarAccess.getDomainModelAttributeTypeAccess().getAlternatives(), "superAttributeType__Alternatives");
					put(grammarAccess.getSingleTypeAccess().getAlternatives(), "rule__SingleType__Alternatives");
					put(grammarAccess.getDomainModelBasicTypeAccess().getAlternatives(), "superBasicType__Alternatives");
					put(grammarAccess.getCardinalityTypeAccess().getAlternatives(), "rule__CardinalityType__Alternatives");
					put(grammarAccess.getServerComponentAccess().getGroup(), "rule__ServerComponent__Group__0");
					put(grammarAccess.getFieldAccess().getGroup(), "rule__Field__Group__0");
					put(grammarAccess.getMethodAccess().getGroup(), "rule__Method__Group__0");
					put(grammarAccess.getMethodAccess().getGroup_2(), "rule__Method__Group_2__0");
					put(grammarAccess.getMethodAccess().getGroup_2_1(), "rule__Method__Group_2_1__0");
					put(grammarAccess.getInlineVariableAccess().getGroup(), "rule__InlineVariable__Group__0");
					put(grammarAccess.getTypedConceptAccess().getGroup(), "rule__TypedConcept__Group__0");
					put(grammarAccess.getPageAccess().getGroup(), "rule__Page__Group__0");
					put(grammarAccess.getPageAccess().getGroup_3(), "rule__Page__Group_3__0");
					put(grammarAccess.getUIContainerDefinitionAccess().getGroup(), "rule__UIContainerDefinition__Group__0");
					put(grammarAccess.getUIContainerDefinitionAccess().getGroup_2(), "rule__UIContainerDefinition__Group_2__0");
					put(grammarAccess.getUIContainerDefinitionAccess().getGroup_2_1(), "rule__UIContainerDefinition__Group_2_1__0");
					put(grammarAccess.getServerComponentUsageAccess().getGroup(), "rule__ServerComponentUsage__Group__0");
					put(grammarAccess.getServerComponentUsageAccess().getGroup_2(), "rule__ServerComponentUsage__Group_2__0");
					put(grammarAccess.getUIComponentAccess().getGroup(), "rule__UIComponent__Group__0");
					put(grammarAccess.getNestedComponentAccess().getGroup_1(), "rule__NestedComponent__Group_1__0");
					put(grammarAccess.getChildUIComponentAccess().getGroup(), "rule__ChildUIComponent__Group__0");
					put(grammarAccess.getAllowedNestedComponentsAccess().getGroup_0(), "rule__AllowedNestedComponents__Group_0__0");
					put(grammarAccess.getAllowedNestedComponentsAccess().getGroup_1(), "rule__AllowedNestedComponents__Group_1__0");
					put(grammarAccess.getAllowedNestedComponentsAccess().getGroup_1_2(), "rule__AllowedNestedComponents__Group_1_2__0");
					put(grammarAccess.getPropertyValueAccess().getGroup(), "rule__PropertyValue__Group__0");
					put(grammarAccess.getUIComponentInstanceAccess().getGroup(), "rule__UIComponentInstance__Group__0");
					put(grammarAccess.getUIComponentInstanceAccess().getGroup_4(), "rule__UIComponentInstance__Group_4__0");
					put(grammarAccess.getIFStatementAccess().getGroup(), "rule__IFStatement__Group__0");
					put(grammarAccess.getIteratorAccess().getGroup(), "rule__Iterator__Group__0");
					put(grammarAccess.getPropertyValueInstanceAccess().getGroup(), "rule__PropertyValueInstance__Group__0");
					put(grammarAccess.getTemplateAccess().getGroup(), "rule__Template__Group__0");
					put(grammarAccess.getTemplateFragmentAccess().getGroup(), "rule__TemplateFragment__Group__0");
					put(grammarAccess.getTemplateFragmentOverrideAccess().getGroup(), "rule__TemplateFragmentOverride__Group__0");
					put(grammarAccess.getFragmentAccess().getGroup(), "rule__Fragment__Group__0");
					put(grammarAccess.getIterationExpressionAccess().getGroup(), "rule__IterationExpression__Group__0");
					put(grammarAccess.getMemberSelectionExpressionAccess().getGroup(), "rule__MemberSelectionExpression__Group__0");
					put(grammarAccess.getMemberSelectionExpressionAccess().getGroup_1(), "rule__MemberSelectionExpression__Group_1__0");
					put(grammarAccess.getMemberSelectionExpressionAccess().getGroup_1_3(), "rule__MemberSelectionExpression__Group_1_3__0");
					put(grammarAccess.getPageCallAccess().getGroup(), "rule__PageCall__Group__0");
					put(grammarAccess.getFragmentCallAccess().getGroup(), "rule__FragmentCall__Group__0");
					put(grammarAccess.getParamsAccess().getGroup(), "rule__Params__Group__0");
					put(grammarAccess.getParamsAccess().getGroup_1(), "rule__Params__Group_1__0");
					put(grammarAccess.getAtomExpressionAccess().getGroup_1(), "rule__AtomExpression__Group_1__0");
					put(grammarAccess.getGeneralTypeAccess().getGroup_0(), "rule__GeneralType__Group_0__0");
					put(grammarAccess.getGeneralTypeAccess().getGroup_1(), "rule__GeneralType__Group_1__0");
					put(grammarAccess.getGeneralTypeAccess().getGroup_2(), "rule__GeneralType__Group_2__0");
					put(grammarAccess.getAnyTypeAccess().getGroup(), "rule__AnyType__Group__0");
					put(grammarAccess.getPageTypeAccess().getGroup(), "rule__PageType__Group__0");
					put(grammarAccess.getVoidTypeAccess().getGroup(), "rule__VoidType__Group__0");
					put(grammarAccess.getAlternativeTypeAccess().getGroup(), "rule__AlternativeType__Group__0");
					put(grammarAccess.getAlternativeTypeAccess().getGroup_4(), "rule__AlternativeType__Group_4__0");
					put(grammarAccess.getTypeExpressionAccess().getGroup_0(), "rule__TypeExpression__Group_0__0");
					put(grammarAccess.getPropertyRuntimeTypeAccess().getGroup(), "rule__PropertyRuntimeType__Group__0");
					put(grammarAccess.getPropertySingleRuntimeTypeAccess().getGroup(), "rule__PropertySingleRuntimeType__Group__0");
					put(grammarAccess.getDefaultConfigurationsAccess().getGroup(), "rule__DefaultConfigurations__Group__0");
					put(grammarAccess.getDefaultComponentConfigAccess().getGroup(), "rule__DefaultComponentConfig__Group__0");
					put(grammarAccess.getDefaultUIComponentAccess().getGroup_0(), "rule__DefaultUIComponent__Group_0__0");
					put(grammarAccess.getDefaultUIComponentAccess().getGroup_1(), "rule__DefaultUIComponent__Group_1__0");
					put(grammarAccess.getCustomDefaultComponentsDefinitionAccess().getGroup(), "rule__CustomDefaultComponentsDefinition__Group__0");
					put(grammarAccess.getCustomDefaultComponentDefinitionAccess().getGroup(), "rule__CustomDefaultComponentDefinition__Group__0");
					put(grammarAccess.getCustomDefaultComponentDefinitionAccess().getGroup_5(), "rule__CustomDefaultComponentDefinition__Group_5__0");
					put(grammarAccess.getCustomDefaultComponentDefinitionAccess().getGroup_5_2(), "rule__CustomDefaultComponentDefinition__Group_5_2__0");
					put(grammarAccess.getDTOClassAccess().getGroup(), "rule__DTOClass__Group__0");
					put(grammarAccess.getDTOClassAccess().getGroup_2(), "rule__DTOClass__Group_2__0");
					put(grammarAccess.getAttributeOptionAccess().getGroup_0(), "rule__AttributeOption__Group_0__0");
					put(grammarAccess.getAttributeOptionAccess().getGroup_1(), "rule__AttributeOption__Group_1__0");
					put(grammarAccess.getBasicTypeAccess().getGroup_1(), "rule__BasicType__Group_1__0");
					put(grammarAccess.getBasicTypeAccess().getGroup_2(), "rule__BasicType__Group_2__0");
					put(grammarAccess.getBasicTypeAccess().getGroup_3(), "rule__BasicType__Group_3__0");
					put(grammarAccess.getBasicTypeAccess().getGroup_4(), "rule__BasicType__Group_4__0");
					put(grammarAccess.getBasicTypeAccess().getGroup_5(), "rule__BasicType__Group_5__0");
					put(grammarAccess.getEntityAccess().getGroup(), "rule__Entity__Group__0");
					put(grammarAccess.getEntityAccess().getGroup_2(), "rule__Entity__Group_2__0");
					put(grammarAccess.getEntityAccess().getGroup_3(), "rule__Entity__Group_3__0");
					put(grammarAccess.getEntityAccess().getGroup_3_3(), "rule__Entity__Group_3_3__0");
					put(grammarAccess.getEnumAccess().getGroup(), "rule__Enum__Group__0");
					put(grammarAccess.getEnumLiteralAccess().getGroup(), "rule__EnumLiteral__Group__0");
					put(grammarAccess.getEnumLiteralAccess().getGroup_1(), "rule__EnumLiteral__Group_1__0");
					put(grammarAccess.getEnumLiteralAccess().getGroup_1_2(), "rule__EnumLiteral__Group_1_2__0");
					put(grammarAccess.getConstantAccess().getGroup_0(), "rule__Constant__Group_0__0");
					put(grammarAccess.getConstantAccess().getGroup_1(), "rule__Constant__Group_1__0");
					put(grammarAccess.getConstantAccess().getGroup_2(), "rule__Constant__Group_2__0");
					put(grammarAccess.getConstantAccess().getGroup_3(), "rule__Constant__Group_3__0");
					put(grammarAccess.getConstantAccess().getGroup_4(), "rule__Constant__Group_4__0");
					put(grammarAccess.getConstantAccess().getGroup_5(), "rule__Constant__Group_5__0");
					put(grammarAccess.getEntityOptionAccess().getGroup_0(), "rule__EntityOption__Group_0__0");
					put(grammarAccess.getEntityOptionAccess().getGroup_1(), "rule__EntityOption__Group_1__0");
					put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
					put(grammarAccess.getAttributeAccess().getGroup_2(), "rule__Attribute__Group_2__0");
					put(grammarAccess.getAttributeAccess().getGroup_2_1(), "rule__Attribute__Group_2_1__0");
					put(grammarAccess.getDomainModelBasicTypeAccess().getGroup_0(), "superBasicType__Group_0__0");
					put(grammarAccess.getDomainModelBasicTypeAccess().getGroup_1(), "superBasicType__Group_1__0");
					put(grammarAccess.getDomainModelBasicTypeAccess().getGroup_2(), "superBasicType__Group_2__0");
					put(grammarAccess.getDomainModelBasicTypeAccess().getGroup_3(), "superBasicType__Group_3__0");
					put(grammarAccess.getDomainModelBasicTypeAccess().getGroup_4(), "superBasicType__Group_4__0");
					put(grammarAccess.getCollectionTypeAccess().getGroup(), "rule__CollectionType__Group__0");
					put(grammarAccess.getStaticFieldSelectionAccess().getGroup(), "rule__StaticFieldSelection__Group__0");
					put(grammarAccess.getDumbSelectionMemberAccess().getGroup(), "rule__DumbSelectionMember__Group__0");
					put(grammarAccess.getUIModelAccess().getConceptsAssignment(), "rule__UIModel__ConceptsAssignment");
					put(grammarAccess.getServerComponentAccess().getNameAssignment_2(), "rule__ServerComponent__NameAssignment_2");
					put(grammarAccess.getServerComponentAccess().getMembersAssignment_4(), "rule__ServerComponent__MembersAssignment_4");
					put(grammarAccess.getMethodAccess().getParamsAssignment_2_0(), "rule__Method__ParamsAssignment_2_0");
					put(grammarAccess.getMethodAccess().getParamsAssignment_2_1_1(), "rule__Method__ParamsAssignment_2_1_1");
					put(grammarAccess.getInlineVariableAccess().getNameAssignment_1(), "rule__InlineVariable__NameAssignment_1");
					put(grammarAccess.getTypedConceptAccess().getTypeAssignment_0(), "rule__TypedConcept__TypeAssignment_0");
					put(grammarAccess.getTypedConceptAccess().getNameAssignment_1(), "rule__TypedConcept__NameAssignment_1");
					put(grammarAccess.getPageAccess().getTemplateAssignment_3_2(), "rule__Page__TemplateAssignment_3_2");
					put(grammarAccess.getPageAccess().getElementsAssignment_5(), "rule__Page__ElementsAssignment_5");
					put(grammarAccess.getUIContainerDefinitionAccess().getNameAssignment_0(), "rule__UIContainerDefinition__NameAssignment_0");
					put(grammarAccess.getUIContainerDefinitionAccess().getParamsAssignment_2_0(), "rule__UIContainerDefinition__ParamsAssignment_2_0");
					put(grammarAccess.getUIContainerDefinitionAccess().getParamsAssignment_2_1_1(), "rule__UIContainerDefinition__ParamsAssignment_2_1_1");
					put(grammarAccess.getServerComponentUsageAccess().getServerComponentsAssignment_1(), "rule__ServerComponentUsage__ServerComponentsAssignment_1");
					put(grammarAccess.getServerComponentUsageAccess().getServerComponentsAssignment_2_1(), "rule__ServerComponentUsage__ServerComponentsAssignment_2_1");
					put(grammarAccess.getUIComponentAccess().getNameAssignment_1(), "rule__UIComponent__NameAssignment_1");
					put(grammarAccess.getUIComponentAccess().getPropertiesAssignment_3(), "rule__UIComponent__PropertiesAssignment_3");
					put(grammarAccess.getUIComponentAccess().getNestedAssignment_4(), "rule__UIComponent__NestedAssignment_4");
					put(grammarAccess.getNestedComponentAccess().getNestedComponentsAssignment_1_3(), "rule__NestedComponent__NestedComponentsAssignment_1_3");
					put(grammarAccess.getChildUIComponentAccess().getCardinalityAssignment_3(), "rule__ChildUIComponent__CardinalityAssignment_3");
					put(grammarAccess.getChildUIComponentAccess().getCompAssignment_5(), "rule__ChildUIComponent__CompAssignment_5");
					put(grammarAccess.getAllowedNestedComponentsAccess().getComponentsAssignment_1_1(), "rule__AllowedNestedComponents__ComponentsAssignment_1_1");
					put(grammarAccess.getAllowedNestedComponentsAccess().getComponentsAssignment_1_2_1(), "rule__AllowedNestedComponents__ComponentsAssignment_1_2_1");
					put(grammarAccess.getPropertyValueAccess().getNameAssignment_0(), "rule__PropertyValue__NameAssignment_0");
					put(grammarAccess.getPropertyValueAccess().getRequiredAssignment_1(), "rule__PropertyValue__RequiredAssignment_1");
					put(grammarAccess.getPropertyValueAccess().getValuePropertyAssignment_2(), "rule__PropertyValue__ValuePropertyAssignment_2");
					put(grammarAccess.getPropertyValueAccess().getTypeAssignment_4(), "rule__PropertyValue__TypeAssignment_4");
					put(grammarAccess.getUIComponentInstanceAccess().getComponentAssignment_2(), "rule__UIComponentInstance__ComponentAssignment_2");
					put(grammarAccess.getUIComponentInstanceAccess().getPropertiesAssignment_3(), "rule__UIComponentInstance__PropertiesAssignment_3");
					put(grammarAccess.getUIComponentInstanceAccess().getChildElementsAssignment_4_1(), "rule__UIComponentInstance__ChildElementsAssignment_4_1");
					put(grammarAccess.getIFStatementAccess().getExpressionAssignment_1(), "rule__IFStatement__ExpressionAssignment_1");
					put(grammarAccess.getIFStatementAccess().getElementsAssignment_3(), "rule__IFStatement__ElementsAssignment_3");
					put(grammarAccess.getIteratorAccess().getExpressionAssignment_1(), "rule__Iterator__ExpressionAssignment_1");
					put(grammarAccess.getIteratorAccess().getElementsAssignment_3(), "rule__Iterator__ElementsAssignment_3");
					put(grammarAccess.getPropertyValueInstanceAccess().getPropertyAssignment_1(), "rule__PropertyValueInstance__PropertyAssignment_1");
					put(grammarAccess.getPropertyValueInstanceAccess().getValueAssignment_3(), "rule__PropertyValueInstance__ValueAssignment_3");
					put(grammarAccess.getTemplateAccess().getNameAssignment_1(), "rule__Template__NameAssignment_1");
					put(grammarAccess.getTemplateAccess().getElementsAssignment_4(), "rule__Template__ElementsAssignment_4");
					put(grammarAccess.getTemplateFragmentAccess().getNameAssignment_1(), "rule__TemplateFragment__NameAssignment_1");
					put(grammarAccess.getTemplateFragmentAccess().getElementsAssignment_3(), "rule__TemplateFragment__ElementsAssignment_3");
					put(grammarAccess.getTemplateFragmentOverrideAccess().getOverridenFragmentAssignment_2(), "rule__TemplateFragmentOverride__OverridenFragmentAssignment_2");
					put(grammarAccess.getTemplateFragmentOverrideAccess().getElementsAssignment_4(), "rule__TemplateFragmentOverride__ElementsAssignment_4");
					put(grammarAccess.getFragmentAccess().getElementsAssignment_4(), "rule__Fragment__ElementsAssignment_4");
					put(grammarAccess.getIterationExpressionAccess().getVarAssignment_0(), "rule__IterationExpression__VarAssignment_0");
					put(grammarAccess.getIterationExpressionAccess().getExpressionAssignment_2(), "rule__IterationExpression__ExpressionAssignment_2");
					put(grammarAccess.getMemberSelectionExpressionAccess().getMemberAssignment_1_2(), "rule__MemberSelectionExpression__MemberAssignment_1_2");
					put(grammarAccess.getMemberSelectionExpressionAccess().getIsMethodAssignment_1_3_0(), "rule__MemberSelectionExpression__IsMethodAssignment_1_3_0");
					put(grammarAccess.getPageCallAccess().getPageAssignment_1(), "rule__PageCall__PageAssignment_1");
					put(grammarAccess.getFragmentCallAccess().getFragAssignment_0(), "rule__FragmentCall__FragAssignment_0");
					put(grammarAccess.getParamsAccess().getParamsAssignment_0(), "rule__Params__ParamsAssignment_0");
					put(grammarAccess.getParamsAccess().getParamsAssignment_1_1(), "rule__Params__ParamsAssignment_1_1");
					put(grammarAccess.getAtomExpressionAccess().getRefAssignment_1_1(), "rule__AtomExpression__RefAssignment_1_1");
					put(grammarAccess.getAlternativeTypeAccess().getTypesAssignment_1(), "rule__AlternativeType__TypesAssignment_1");
					put(grammarAccess.getAlternativeTypeAccess().getTypesAssignment_3(), "rule__AlternativeType__TypesAssignment_3");
					put(grammarAccess.getAlternativeTypeAccess().getTypesAssignment_4_1(), "rule__AlternativeType__TypesAssignment_4_1");
					put(grammarAccess.getTypeExpressionAccess().getTypeAssignment_0_1(), "rule__TypeExpression__TypeAssignment_0_1");
					put(grammarAccess.getPropertyRuntimeTypeAccess().getPropertyAssignment_2(), "rule__PropertyRuntimeType__PropertyAssignment_2");
					put(grammarAccess.getPropertySingleRuntimeTypeAccess().getPropertyTypeAssignment_2(), "rule__PropertySingleRuntimeType__PropertyTypeAssignment_2");
					put(grammarAccess.getDefaultConfigurationsAccess().getNameAssignment_1(), "rule__DefaultConfigurations__NameAssignment_1");
					put(grammarAccess.getDefaultConfigurationsAccess().getDefaultsAssignment_3(), "rule__DefaultConfigurations__DefaultsAssignment_3");
					put(grammarAccess.getDefaultComponentConfigAccess().getTypeAssignment_2(), "rule__DefaultComponentConfig__TypeAssignment_2");
					put(grammarAccess.getDefaultComponentConfigAccess().getInputCompAssignment_6(), "rule__DefaultComponentConfig__InputCompAssignment_6");
					put(grammarAccess.getDefaultComponentConfigAccess().getOutputCompAssignment_9(), "rule__DefaultComponentConfig__OutputCompAssignment_9");
					put(grammarAccess.getDefaultUIComponentAccess().getValueAssignment_0_3(), "rule__DefaultUIComponent__ValueAssignment_0_3");
					put(grammarAccess.getDefaultUIComponentAccess().getValueAssignment_1_3(), "rule__DefaultUIComponent__ValueAssignment_1_3");
					put(grammarAccess.getCustomDefaultComponentsDefinitionAccess().getNameAssignment_2(), "rule__CustomDefaultComponentsDefinition__NameAssignment_2");
					put(grammarAccess.getCustomDefaultComponentsDefinitionAccess().getDefaultsAssignment_4(), "rule__CustomDefaultComponentsDefinition__DefaultsAssignment_4");
					put(grammarAccess.getCustomDefaultComponentDefinitionAccess().getCompTypeAssignment_1(), "rule__CustomDefaultComponentDefinition__CompTypeAssignment_1");
					put(grammarAccess.getCustomDefaultComponentDefinitionAccess().getTypeAssignment_3(), "rule__CustomDefaultComponentDefinition__TypeAssignment_3");
					put(grammarAccess.getCustomDefaultComponentDefinitionAccess().getImplicitsAssignment_5_1(), "rule__CustomDefaultComponentDefinition__ImplicitsAssignment_5_1");
					put(grammarAccess.getCustomDefaultComponentDefinitionAccess().getImplicitsAssignment_5_2_1(), "rule__CustomDefaultComponentDefinition__ImplicitsAssignment_5_2_1");
					put(grammarAccess.getCustomDefaultComponentDefinitionAccess().getElementsAssignment_7(), "rule__CustomDefaultComponentDefinition__ElementsAssignment_7");
					put(grammarAccess.getDTOModelAccess().getConceptsAssignment(), "rule__DTOModel__ConceptsAssignment");
					put(grammarAccess.getDTOClassAccess().getNameAssignment_1(), "rule__DTOClass__NameAssignment_1");
					put(grammarAccess.getDTOClassAccess().getSuperTypeAssignment_2_1(), "rule__DTOClass__SuperTypeAssignment_2_1");
					put(grammarAccess.getDTOClassAccess().getAttributesAssignment_4(), "rule__DTOClass__AttributesAssignment_4");
					put(grammarAccess.getModelAccess().getConceptsAssignment(), "rule__Model__ConceptsAssignment");
					put(grammarAccess.getEntityAccess().getNameAssignment_1(), "rule__Entity__NameAssignment_1");
					put(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1(), "rule__Entity__SuperTypeAssignment_2_1");
					put(grammarAccess.getEntityAccess().getOptionsAssignment_3_2(), "rule__Entity__OptionsAssignment_3_2");
					put(grammarAccess.getEntityAccess().getOptionsAssignment_3_3_1(), "rule__Entity__OptionsAssignment_3_3_1");
					put(grammarAccess.getEntityAccess().getAttributesAssignment_5(), "rule__Entity__AttributesAssignment_5");
					put(grammarAccess.getEnumAccess().getNameAssignment_1(), "rule__Enum__NameAssignment_1");
					put(grammarAccess.getEnumAccess().getAttributesAssignment_3(), "rule__Enum__AttributesAssignment_3");
					put(grammarAccess.getEnumAccess().getLiteralsAssignment_4(), "rule__Enum__LiteralsAssignment_4");
					put(grammarAccess.getEnumLiteralAccess().getNameAssignment_0(), "rule__EnumLiteral__NameAssignment_0");
					put(grammarAccess.getEnumLiteralAccess().getParamsAssignment_1_1(), "rule__EnumLiteral__ParamsAssignment_1_1");
					put(grammarAccess.getEnumLiteralAccess().getParamsAssignment_1_2_1(), "rule__EnumLiteral__ParamsAssignment_1_2_1");
					put(grammarAccess.getConstantAccess().getValueAssignment_0_1(), "rule__Constant__ValueAssignment_0_1");
					put(grammarAccess.getConstantAccess().getValueAssignment_1_1(), "rule__Constant__ValueAssignment_1_1");
					put(grammarAccess.getConstantAccess().getValueAssignment_2_1(), "rule__Constant__ValueAssignment_2_1");
					put(grammarAccess.getConstantAccess().getValueAssignment_3_1(), "rule__Constant__ValueAssignment_3_1");
					put(grammarAccess.getConstantAccess().getDayAssignment_4_1(), "rule__Constant__DayAssignment_4_1");
					put(grammarAccess.getConstantAccess().getMonthAssignment_4_3(), "rule__Constant__MonthAssignment_4_3");
					put(grammarAccess.getConstantAccess().getYearAssignment_4_5(), "rule__Constant__YearAssignment_4_5");
					put(grammarAccess.getEntityOptionAccess().getDeleteByFlagAssignment_0_1(), "rule__EntityOption__DeleteByFlagAssignment_0_1");
					put(grammarAccess.getEntityOptionAccess().getInheritanceMappingAssignment_1_3(), "rule__EntityOption__InheritanceMappingAssignment_1_3");
					put(grammarAccess.getInheritanceMappingTypeAccess().getTypeAssignment(), "rule__InheritanceMappingType__TypeAssignment");
					put(grammarAccess.getAttributeAccess().getTypeAssignment_0(), "rule__Attribute__TypeAssignment_0");
					put(grammarAccess.getAttributeAccess().getNameAssignment_1(), "rule__Attribute__NameAssignment_1");
					put(grammarAccess.getAttributeAccess().getOptionsAssignment_2_0(), "rule__Attribute__OptionsAssignment_2_0");
					put(grammarAccess.getAttributeAccess().getOptionsAssignment_2_1_1(), "rule__Attribute__OptionsAssignment_2_1_1");
					put(grammarAccess.getRefTypeAccess().getReferenceAssignment(), "rule__RefType__ReferenceAssignment");
					put(grammarAccess.getCollectionTypeAccess().getOfTypeAssignment_2(), "rule__CollectionType__OfTypeAssignment_2");
					put(grammarAccess.getStaticFieldSelectionAccess().getReceiverAssignment_0(), "rule__StaticFieldSelection__ReceiverAssignment_0");
					put(grammarAccess.getStaticFieldSelectionAccess().getMemberAssignment_2(), "rule__StaticFieldSelection__MemberAssignment_2");
					put(grammarAccess.getDumbSelectionMemberAccess().getTypeAssignment_1(), "rule__DumbSelectionMember__TypeAssignment_1");
					put(grammarAccess.getDumbSelectionMemberAccess().getNameAssignment_2(), "rule__DumbSelectionMember__NameAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalUIDSLParser typedParser = (InternalUIDSLParser) parser;
			typedParser.entryRuleUIModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public UIDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(UIDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

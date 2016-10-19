/*
 * generated by Xtext 2.10.0
 */
grammar InternalDomainModel;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package com.stefanvuckovic.domainmodel.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package com.stefanvuckovic.domainmodel.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.stefanvuckovic.domainmodel.services.DomainModelGrammarAccess;

}

@parser::members {

 	private DomainModelGrammarAccess grammarAccess;

    public InternalDomainModelParser(TokenStream input, DomainModelGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected DomainModelGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getModelAccess().getConceptsConceptParserRuleCall_0());
			}
			lv_concepts_0_0=ruleConcept
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				add(
					$current,
					"concepts",
					lv_concepts_0_0,
					"com.stefanvuckovic.domainmodel.DomainModel.Concept");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleConcept
entryRuleConcept returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConceptRule()); }
	iv_ruleConcept=ruleConcept
	{ $current=$iv_ruleConcept.current; }
	EOF;

// Rule Concept
ruleConcept returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getConceptAccess().getEntityParserRuleCall_0());
		}
		this_Entity_0=ruleEntity
		{
			$current = $this_Entity_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getConceptAccess().getEnumParserRuleCall_1());
		}
		this_Enum_1=ruleEnum
		{
			$current = $this_Enum_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleEntity
entryRuleEntity returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntityRule()); }
	iv_ruleEntity=ruleEntity
	{ $current=$iv_ruleEntity.current; }
	EOF;

// Rule Entity
ruleEntity returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='entity'
		{
			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntityRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2='extends'
			{
				newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getExtendsKeyword_2_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEntityRule());
						}
					}
					otherlv_3=RULE_ID
					{
						newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0());
					}
				)
			)
		)?
		(
			otherlv_4='options'
			{
				newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getOptionsKeyword_3_0());
			}
			otherlv_5='('
			{
				newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getLeftParenthesisKeyword_3_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getEntityAccess().getOptionsEntityOptionParserRuleCall_3_2_0());
					}
					lv_options_6_0=ruleEntityOption
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEntityRule());
						}
						add(
							$current,
							"options",
							lv_options_6_0,
							"com.stefanvuckovic.domainmodel.DomainModel.EntityOption");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_7=','
				{
					newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getCommaKeyword_3_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getEntityAccess().getOptionsEntityOptionParserRuleCall_3_3_1_0());
						}
						lv_options_8_0=ruleEntityOption
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getEntityRule());
							}
							add(
								$current,
								"options",
								lv_options_8_0,
								"com.stefanvuckovic.domainmodel.DomainModel.EntityOption");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_9=')'
			{
				newLeafNode(otherlv_9, grammarAccess.getEntityAccess().getRightParenthesisKeyword_3_4());
			}
		)?
		otherlv_10='{'
		{
			newLeafNode(otherlv_10, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_5_0());
				}
				lv_attributes_11_0=ruleAttribute
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEntityRule());
					}
					add(
						$current,
						"attributes",
						lv_attributes_11_0,
						"com.stefanvuckovic.domainmodel.DomainModel.Attribute");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_12='}'
		{
			newLeafNode(otherlv_12, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleEnum
entryRuleEnum returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEnumRule()); }
	iv_ruleEnum=ruleEnum
	{ $current=$iv_ruleEnum.current; }
	EOF;

// Rule Enum
ruleEnum returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='enum'
		{
			newLeafNode(otherlv_0, grammarAccess.getEnumAccess().getEnumKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getEnumAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEnumRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEnumAccess().getAttributesAttributeParserRuleCall_3_0());
				}
				lv_attributes_3_0=ruleAttribute
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEnumRule());
					}
					add(
						$current,
						"attributes",
						lv_attributes_3_0,
						"com.stefanvuckovic.domainmodel.DomainModel.Attribute");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getEnumAccess().getLiteralsEnumLiteralParserRuleCall_4_0());
				}
				lv_literals_4_0=ruleEnumLiteral
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEnumRule());
					}
					add(
						$current,
						"literals",
						lv_literals_4_0,
						"com.stefanvuckovic.domainmodel.DomainModel.EnumLiteral");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleEnumLiteral
entryRuleEnumLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEnumLiteralRule()); }
	iv_ruleEnumLiteral=ruleEnumLiteral
	{ $current=$iv_ruleEnumLiteral.current; }
	EOF;

// Rule EnumLiteral
ruleEnumLiteral returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getEnumLiteralAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEnumLiteralRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_1='('
			{
				newLeafNode(otherlv_1, grammarAccess.getEnumLiteralAccess().getLeftParenthesisKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getEnumLiteralAccess().getParamsConstantParserRuleCall_1_1_0());
					}
					lv_params_2_0=ruleConstant
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEnumLiteralRule());
						}
						add(
							$current,
							"params",
							lv_params_2_0,
							"com.stefanvuckovic.domainmodel.DomainModel.Constant");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_3=','
				{
					newLeafNode(otherlv_3, grammarAccess.getEnumLiteralAccess().getCommaKeyword_1_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getEnumLiteralAccess().getParamsConstantParserRuleCall_1_2_1_0());
						}
						lv_params_4_0=ruleConstant
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getEnumLiteralRule());
							}
							add(
								$current,
								"params",
								lv_params_4_0,
								"com.stefanvuckovic.domainmodel.DomainModel.Constant");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_5=')'
			{
				newLeafNode(otherlv_5, grammarAccess.getEnumLiteralAccess().getRightParenthesisKeyword_1_3());
			}
		)?
	)
;

// Entry rule entryRuleConstant
entryRuleConstant returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConstantRule()); }
	iv_ruleConstant=ruleConstant
	{ $current=$iv_ruleConstant.current; }
	EOF;

// Rule Constant
ruleConstant returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getConstantAccess().getIntConstantAction_0_0(),
						$current);
				}
			)
			(
				(
					lv_value_1_0=RULE_INT
					{
						newLeafNode(lv_value_1_0, grammarAccess.getConstantAccess().getValueINTTerminalRuleCall_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getConstantRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_1_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getConstantAccess().getLongConstantAction_1_0(),
						$current);
				}
			)
			(
				(
					lv_value_3_0=RULE_INT
					{
						newLeafNode(lv_value_3_0, grammarAccess.getConstantAccess().getValueINTTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getConstantRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_3_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
			otherlv_4='L'
			{
				newLeafNode(otherlv_4, grammarAccess.getConstantAccess().getLKeyword_1_2());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getConstantAccess().getStringConstantAction_2_0(),
						$current);
				}
			)
			(
				(
					lv_value_6_0=RULE_STRING
					{
						newLeafNode(lv_value_6_0, grammarAccess.getConstantAccess().getValueSTRINGTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getConstantRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_6_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getConstantAccess().getBoolConstantAction_3_0(),
						$current);
				}
			)
			(
				(
					(
						lv_value_8_1='true'
						{
							newLeafNode(lv_value_8_1, grammarAccess.getConstantAccess().getValueTrueKeyword_3_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getConstantRule());
							}
							setWithLastConsumed($current, "value", lv_value_8_1, null);
						}
						    |
						lv_value_8_2='false'
						{
							newLeafNode(lv_value_8_2, grammarAccess.getConstantAccess().getValueFalseKeyword_3_1_0_1());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getConstantRule());
							}
							setWithLastConsumed($current, "value", lv_value_8_2, null);
						}
					)
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getConstantAccess().getDateConstantAction_4_0(),
						$current);
				}
			)
			(
				(
					lv_day_10_0=RULE_INT
					{
						newLeafNode(lv_day_10_0, grammarAccess.getConstantAccess().getDayINTTerminalRuleCall_4_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getConstantRule());
						}
						setWithLastConsumed(
							$current,
							"day",
							lv_day_10_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
			otherlv_11='/'
			{
				newLeafNode(otherlv_11, grammarAccess.getConstantAccess().getSolidusKeyword_4_2());
			}
			(
				(
					lv_month_12_0=RULE_INT
					{
						newLeafNode(lv_month_12_0, grammarAccess.getConstantAccess().getMonthINTTerminalRuleCall_4_3_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getConstantRule());
						}
						setWithLastConsumed(
							$current,
							"month",
							lv_month_12_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
			otherlv_13='/'
			{
				newLeafNode(otherlv_13, grammarAccess.getConstantAccess().getSolidusKeyword_4_4());
			}
			(
				(
					lv_year_14_0=RULE_INT
					{
						newLeafNode(lv_year_14_0, grammarAccess.getConstantAccess().getYearINTTerminalRuleCall_4_5_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getConstantRule());
						}
						setWithLastConsumed(
							$current,
							"year",
							lv_year_14_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getConstantAccess().getDecimalConstantAction_5_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getConstantAccess().getValueDecimalParserRuleCall_5_1_0());
					}
					lv_value_16_0=ruleDecimal
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConstantRule());
						}
						set(
							$current,
							"value",
							lv_value_16_0,
							"com.stefanvuckovic.domainmodel.DomainModel.Decimal");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getConstantAccess().getNullAction_6_0(),
						$current);
				}
			)
			otherlv_18='null'
			{
				newLeafNode(otherlv_18, grammarAccess.getConstantAccess().getNullKeyword_6_1());
			}
		)
	)
;

// Entry rule entryRuleEntityOption
entryRuleEntityOption returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntityOptionRule()); }
	iv_ruleEntityOption=ruleEntityOption
	{ $current=$iv_ruleEntityOption.current; }
	EOF;

// Rule EntityOption
ruleEntityOption returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getEntityOptionAccess().getEntityDeleteOptionAction_0_0(),
						$current);
				}
			)
			(
				(
					lv_deleteByFlag_1_0='deleteByFlag'
					{
						newLeafNode(lv_deleteByFlag_1_0, grammarAccess.getEntityOptionAccess().getDeleteByFlagDeleteByFlagKeyword_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEntityOptionRule());
						}
						setWithLastConsumed($current, "deleteByFlag", true, "deleteByFlag");
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getEntityOptionAccess().getInheritanceMappingOptionAction_1_0(),
						$current);
				}
			)
			otherlv_3='inheritance'
			{
				newLeafNode(otherlv_3, grammarAccess.getEntityOptionAccess().getInheritanceKeyword_1_1());
			}
			otherlv_4='='
			{
				newLeafNode(otherlv_4, grammarAccess.getEntityOptionAccess().getEqualsSignKeyword_1_2());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getEntityOptionAccess().getInheritanceMappingInheritanceMappingTypeParserRuleCall_1_3_0());
					}
					lv_inheritanceMapping_5_0=ruleInheritanceMappingType
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEntityOptionRule());
						}
						set(
							$current,
							"inheritanceMapping",
							lv_inheritanceMapping_5_0,
							"com.stefanvuckovic.domainmodel.DomainModel.InheritanceMappingType");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleInheritanceMappingType
entryRuleInheritanceMappingType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInheritanceMappingTypeRule()); }
	iv_ruleInheritanceMappingType=ruleInheritanceMappingType
	{ $current=$iv_ruleInheritanceMappingType.current; }
	EOF;

// Rule InheritanceMappingType
ruleInheritanceMappingType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_type_0_1='SINGLE_TABLE'
				{
					newLeafNode(lv_type_0_1, grammarAccess.getInheritanceMappingTypeAccess().getTypeSINGLE_TABLEKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInheritanceMappingTypeRule());
					}
					setWithLastConsumed($current, "type", lv_type_0_1, null);
				}
				    |
				lv_type_0_2='TABLE_PER_CONCRETE_CLASS'
				{
					newLeafNode(lv_type_0_2, grammarAccess.getInheritanceMappingTypeAccess().getTypeTABLE_PER_CONCRETE_CLASSKeyword_0_1());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInheritanceMappingTypeRule());
					}
					setWithLastConsumed($current, "type", lv_type_0_2, null);
				}
				    |
				lv_type_0_3='TABLE_PER_CLASS'
				{
					newLeafNode(lv_type_0_3, grammarAccess.getInheritanceMappingTypeAccess().getTypeTABLE_PER_CLASSKeyword_0_2());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInheritanceMappingTypeRule());
					}
					setWithLastConsumed($current, "type", lv_type_0_3, null);
				}
			)
		)
	)
;

// Entry rule entryRuleAttribute
entryRuleAttribute returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeRule()); }
	iv_ruleAttribute=ruleAttribute
	{ $current=$iv_ruleAttribute.current; }
	EOF;

// Rule Attribute
ruleAttribute returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeAccess().getTypeAttributeTypeParserRuleCall_0_0());
				}
				lv_type_0_0=ruleAttributeType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeRule());
					}
					set(
						$current,
						"type",
						lv_type_0_0,
						"com.stefanvuckovic.domainmodel.DomainModel.AttributeType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttributeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getAttributeAccess().getOptionsAttributeOptionParserRuleCall_2_0_0());
					}
					lv_options_2_0=ruleAttributeOption
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAttributeRule());
						}
						add(
							$current,
							"options",
							lv_options_2_0,
							"com.stefanvuckovic.domainmodel.DomainModel.AttributeOption");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_3=','
				{
					newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getCommaKeyword_2_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getAttributeAccess().getOptionsAttributeOptionParserRuleCall_2_1_1_0());
						}
						lv_options_4_0=ruleAttributeOption
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getAttributeRule());
							}
							add(
								$current,
								"options",
								lv_options_4_0,
								"com.stefanvuckovic.domainmodel.DomainModel.AttributeOption");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getSemicolonKeyword_3());
		}
	)
;

// Entry rule entryRuleAttributeType
entryRuleAttributeType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeTypeRule()); }
	iv_ruleAttributeType=ruleAttributeType
	{ $current=$iv_ruleAttributeType.current; }
	EOF;

// Rule AttributeType
ruleAttributeType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAttributeTypeAccess().getSingleTypeParserRuleCall_0());
		}
		this_SingleType_0=ruleSingleType
		{
			$current = $this_SingleType_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAttributeTypeAccess().getCollectionTypeParserRuleCall_1());
		}
		this_CollectionType_1=ruleCollectionType
		{
			$current = $this_CollectionType_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleSingleType
entryRuleSingleType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSingleTypeRule()); }
	iv_ruleSingleType=ruleSingleType
	{ $current=$iv_ruleSingleType.current; }
	EOF;

// Rule SingleType
ruleSingleType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getSingleTypeAccess().getBasicTypeParserRuleCall_0());
		}
		this_BasicType_0=ruleBasicType
		{
			$current = $this_BasicType_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getSingleTypeAccess().getRefTypeParserRuleCall_1());
		}
		this_RefType_1=ruleRefType
		{
			$current = $this_RefType_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleBasicType
entryRuleBasicType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBasicTypeRule()); }
	iv_ruleBasicType=ruleBasicType
	{ $current=$iv_ruleBasicType.current; }
	EOF;

// Rule BasicType
ruleBasicType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getBasicTypeAccess().getStringTypeAction_0_0(),
						$current);
				}
			)
			otherlv_1='string'
			{
				newLeafNode(otherlv_1, grammarAccess.getBasicTypeAccess().getStringKeyword_0_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getBasicTypeAccess().getIntTypeAction_1_0(),
						$current);
				}
			)
			otherlv_3='int'
			{
				newLeafNode(otherlv_3, grammarAccess.getBasicTypeAccess().getIntKeyword_1_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getBasicTypeAccess().getLongTypeAction_2_0(),
						$current);
				}
			)
			otherlv_5='long'
			{
				newLeafNode(otherlv_5, grammarAccess.getBasicTypeAccess().getLongKeyword_2_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getBasicTypeAccess().getBoolTypeAction_3_0(),
						$current);
				}
			)
			otherlv_7='boolean'
			{
				newLeafNode(otherlv_7, grammarAccess.getBasicTypeAccess().getBooleanKeyword_3_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getBasicTypeAccess().getDateTypeAction_4_0(),
						$current);
				}
			)
			otherlv_9='date'
			{
				newLeafNode(otherlv_9, grammarAccess.getBasicTypeAccess().getDateKeyword_4_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getBasicTypeAccess().getDecimalTypeAction_5_0(),
						$current);
				}
			)
			otherlv_11='decimal'
			{
				newLeafNode(otherlv_11, grammarAccess.getBasicTypeAccess().getDecimalKeyword_5_1());
			}
		)
	)
;

// Entry rule entryRuleRefType
entryRuleRefType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRefTypeRule()); }
	iv_ruleRefType=ruleRefType
	{ $current=$iv_ruleRefType.current; }
	EOF;

// Rule RefType
ruleRefType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getRefTypeRule());
				}
			}
			otherlv_0=RULE_ID
			{
				newLeafNode(otherlv_0, grammarAccess.getRefTypeAccess().getReferenceConceptCrossReference_0());
			}
		)
	)
;

// Entry rule entryRuleCollectionType
entryRuleCollectionType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCollectionTypeRule()); }
	iv_ruleCollectionType=ruleCollectionType
	{ $current=$iv_ruleCollectionType.current; }
	EOF;

// Rule CollectionType
ruleCollectionType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='List'
		{
			newLeafNode(otherlv_0, grammarAccess.getCollectionTypeAccess().getListKeyword_0());
		}
		otherlv_1='<'
		{
			newLeafNode(otherlv_1, grammarAccess.getCollectionTypeAccess().getLessThanSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCollectionTypeAccess().getOfTypeSingleTypeParserRuleCall_2_0());
				}
				lv_ofType_2_0=ruleSingleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCollectionTypeRule());
					}
					set(
						$current,
						"ofType",
						lv_ofType_2_0,
						"com.stefanvuckovic.domainmodel.DomainModel.SingleType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='>'
		{
			newLeafNode(otherlv_3, grammarAccess.getCollectionTypeAccess().getGreaterThanSignKeyword_3());
		}
	)
;

// Entry rule entryRuleAttributeOption
entryRuleAttributeOption returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeOptionRule()); }
	iv_ruleAttributeOption=ruleAttributeOption
	{ $current=$iv_ruleAttributeOption.current; }
	EOF;

// Rule AttributeOption
ruleAttributeOption returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getAttributeOptionAccess().getRequiredAction_0_0(),
						$current);
				}
			)
			(
				(
					lv_required_1_0='required'
					{
						newLeafNode(lv_required_1_0, grammarAccess.getAttributeOptionAccess().getRequiredRequiredKeyword_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAttributeOptionRule());
						}
						setWithLastConsumed($current, "required", true, "required");
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getAttributeOptionAccess().getPartOfAction_1_0(),
						$current);
				}
			)
			(
				(
					lv_partOf_3_0='partOf'
					{
						newLeafNode(lv_partOf_3_0, grammarAccess.getAttributeOptionAccess().getPartOfPartOfKeyword_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAttributeOptionRule());
						}
						setWithLastConsumed($current, "partOf", true, "partOf");
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getAttributeOptionAccess().getRelationshipOwnerAction_2_0(),
						$current);
				}
			)
			otherlv_5='relationshipOwner'
			{
				newLeafNode(otherlv_5, grammarAccess.getAttributeOptionAccess().getRelationshipOwnerKeyword_2_1());
			}
			otherlv_6='='
			{
				newLeafNode(otherlv_6, grammarAccess.getAttributeOptionAccess().getEqualsSignKeyword_2_2());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAttributeOptionAccess().getRelationshipOwnerStaticFieldSelectionParserRuleCall_2_3_0());
					}
					lv_relationshipOwner_7_0=ruleStaticFieldSelection
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAttributeOptionRule());
						}
						set(
							$current,
							"relationshipOwner",
							lv_relationshipOwner_7_0,
							"com.stefanvuckovic.domainmodel.DomainModel.StaticFieldSelection");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getAttributeOptionAccess().getCardinalityAction_3_0(),
						$current);
				}
			)
			otherlv_9='reverse_cardinality'
			{
				newLeafNode(otherlv_9, grammarAccess.getAttributeOptionAccess().getReverse_cardinalityKeyword_3_1());
			}
			otherlv_10='='
			{
				newLeafNode(otherlv_10, grammarAccess.getAttributeOptionAccess().getEqualsSignKeyword_3_2());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAttributeOptionAccess().getCardCardinalityTypeEnumRuleCall_3_3_0());
					}
					lv_card_11_0=ruleCardinalityType
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAttributeOptionRule());
						}
						set(
							$current,
							"card",
							lv_card_11_0,
							"com.stefanvuckovic.domainmodel.DomainModel.CardinalityType");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleStaticFieldSelection
entryRuleStaticFieldSelection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStaticFieldSelectionRule()); }
	iv_ruleStaticFieldSelection=ruleStaticFieldSelection
	{ $current=$iv_ruleStaticFieldSelection.current; }
	EOF;

// Rule StaticFieldSelection
ruleStaticFieldSelection returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStaticFieldSelectionRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getStaticFieldSelectionAccess().getReceiverEntityCrossReference_0_0());
				}
			)
		)
		otherlv_1='.'
		{
			newLeafNode(otherlv_1, grammarAccess.getStaticFieldSelectionAccess().getFullStopKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStaticFieldSelectionRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getStaticFieldSelectionAccess().getMemberAttributeCrossReference_2_0());
				}
			)
		)
	)
;

// Entry rule entryRuleDecimal
entryRuleDecimal returns [String current=null]:
	{ newCompositeNode(grammarAccess.getDecimalRule()); }
	iv_ruleDecimal=ruleDecimal
	{ $current=$iv_ruleDecimal.current.getText(); }
	EOF;

// Rule Decimal
ruleDecimal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_INT_0=RULE_INT
		{
			$current.merge(this_INT_0);
		}
		{
			newLeafNode(this_INT_0, grammarAccess.getDecimalAccess().getINTTerminalRuleCall_0());
		}
		kw='.'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDecimalAccess().getFullStopKeyword_1());
		}
		this_INT_2=RULE_INT
		{
			$current.merge(this_INT_2);
		}
		{
			newLeafNode(this_INT_2, grammarAccess.getDecimalAccess().getINTTerminalRuleCall_2());
		}
	)
;

// Rule CardinalityType
ruleCardinalityType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='one'
			{
				$current = grammarAccess.getCardinalityTypeAccess().getOneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getCardinalityTypeAccess().getOneEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='many'
			{
				$current = grammarAccess.getCardinalityTypeAccess().getManyEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getCardinalityTypeAccess().getManyEnumLiteralDeclaration_1());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

/*
 * generated by Xtext 2.10.0
 */
package com.stefanvuckovic.domainToDto.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class DomainToDTOGrammarAccess extends AbstractGrammarElementFinder {
	
	public class MappingModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.stefanvuckovic.domainToDto.DomainToDTO.MappingModel");
		private final Assignment cMappersAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cMappersMapperParserRuleCall_0 = (RuleCall)cMappersAssignment.eContents().get(0);
		
		//MappingModel:
		//	mappers+=Mapper*;
		@Override public ParserRule getRule() { return rule; }
		
		//mappers+=Mapper*
		public Assignment getMappersAssignment() { return cMappersAssignment; }
		
		//Mapper
		public RuleCall getMappersMapperParserRuleCall_0() { return cMappersMapperParserRuleCall_0; }
	}
	public class MapperElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.stefanvuckovic.domainToDto.DomainToDTO.Mapper");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMapperKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cDtoKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDtoAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cDtoDTOClassCrossReference_3_0 = (CrossReference)cDtoAssignment_3.eContents().get(0);
		private final RuleCall cDtoDTOClassIDTerminalRuleCall_3_0_1 = (RuleCall)cDtoDTOClassCrossReference_3_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cAttributesAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cAttributesMappedAttributeParserRuleCall_5_0 = (RuleCall)cAttributesAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Mapper:
		//	'mapper' name=ID 'dto' dto=[dto::DTOClass] '{'
		//	attributes+=MappedAttribute*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'mapper' name=ID 'dto' dto=[dto::DTOClass] '{' attributes+=MappedAttribute* '}'
		public Group getGroup() { return cGroup; }
		
		//'mapper'
		public Keyword getMapperKeyword_0() { return cMapperKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'dto'
		public Keyword getDtoKeyword_2() { return cDtoKeyword_2; }
		
		//dto=[dto::DTOClass]
		public Assignment getDtoAssignment_3() { return cDtoAssignment_3; }
		
		//[dto::DTOClass]
		public CrossReference getDtoDTOClassCrossReference_3_0() { return cDtoDTOClassCrossReference_3_0; }
		
		//ID
		public RuleCall getDtoDTOClassIDTerminalRuleCall_3_0_1() { return cDtoDTOClassIDTerminalRuleCall_3_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }
		
		//attributes+=MappedAttribute*
		public Assignment getAttributesAssignment_5() { return cAttributesAssignment_5; }
		
		//MappedAttribute
		public RuleCall getAttributesMappedAttributeParserRuleCall_5_0() { return cAttributesMappedAttributeParserRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class MappedAttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.stefanvuckovic.domainToDto.DomainToDTO.MappedAttribute");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAttrAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cAttrAttributeCrossReference_0_0 = (CrossReference)cAttrAssignment_0.eContents().get(0);
		private final RuleCall cAttrAttributeIDTerminalRuleCall_0_0_1 = (RuleCall)cAttrAttributeCrossReference_0_0.eContents().get(1);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cMappingAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cMappingExpressionParserRuleCall_2_0 = (RuleCall)cMappingAssignment_2.eContents().get(0);
		
		//MappedAttribute:
		//	attr=[dm::Attribute] '->' mapping=Expression;
		@Override public ParserRule getRule() { return rule; }
		
		//attr=[dm::Attribute] '->' mapping=Expression
		public Group getGroup() { return cGroup; }
		
		//attr=[dm::Attribute]
		public Assignment getAttrAssignment_0() { return cAttrAssignment_0; }
		
		//[dm::Attribute]
		public CrossReference getAttrAttributeCrossReference_0_0() { return cAttrAttributeCrossReference_0_0; }
		
		//ID
		public RuleCall getAttrAttributeIDTerminalRuleCall_0_0_1() { return cAttrAttributeIDTerminalRuleCall_0_0_1; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_1() { return cHyphenMinusGreaterThanSignKeyword_1; }
		
		//mapping=Expression
		public Assignment getMappingAssignment_2() { return cMappingAssignment_2; }
		
		//Expression
		public RuleCall getMappingExpressionParserRuleCall_2_0() { return cMappingExpressionParserRuleCall_2_0; }
	}
	public class ExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.stefanvuckovic.domainToDto.DomainToDTO.Expression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMemberSelectionExpressionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cEntityMappingExpressionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Expression dm::Expression:
		//	MemberSelectionExpression | EntityMappingExpression
		@Override public ParserRule getRule() { return rule; }
		
		//MemberSelectionExpression | EntityMappingExpression
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//MemberSelectionExpression
		public RuleCall getMemberSelectionExpressionParserRuleCall_0() { return cMemberSelectionExpressionParserRuleCall_0; }
		
		//EntityMappingExpression
		public RuleCall getEntityMappingExpressionParserRuleCall_1() { return cEntityMappingExpressionParserRuleCall_1; }
	}
	public class MemberSelectionExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.stefanvuckovic.domainToDto.DomainToDTO.MemberSelectionExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cAtomExpressionParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cMemberSelectionExpressionReceiverAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cFullStopKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cMemberAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final CrossReference cMemberAttributeCrossReference_1_2_0 = (CrossReference)cMemberAssignment_1_2.eContents().get(0);
		private final RuleCall cMemberAttributeIDTerminalRuleCall_1_2_0_1 = (RuleCall)cMemberAttributeCrossReference_1_2_0.eContents().get(1);
		
		//MemberSelectionExpression dm::Expression:
		//	AtomExpression ({MemberSelectionExpression.receiver=current} '.'
		//	member=[dm::Attribute])*
		@Override public ParserRule getRule() { return rule; }
		
		//AtomExpression ({MemberSelectionExpression.receiver=current} '.' member=[dm::Attribute])*
		public Group getGroup() { return cGroup; }
		
		//AtomExpression
		public RuleCall getAtomExpressionParserRuleCall_0() { return cAtomExpressionParserRuleCall_0; }
		
		//({MemberSelectionExpression.receiver=current} '.' member=[dm::Attribute])*
		public Group getGroup_1() { return cGroup_1; }
		
		//{MemberSelectionExpression.receiver=current}
		public Action getMemberSelectionExpressionReceiverAction_1_0() { return cMemberSelectionExpressionReceiverAction_1_0; }
		
		//'.'
		public Keyword getFullStopKeyword_1_1() { return cFullStopKeyword_1_1; }
		
		//member=[dm::Attribute]
		public Assignment getMemberAssignment_1_2() { return cMemberAssignment_1_2; }
		
		//[dm::Attribute]
		public CrossReference getMemberAttributeCrossReference_1_2_0() { return cMemberAttributeCrossReference_1_2_0; }
		
		//ID
		public RuleCall getMemberAttributeIDTerminalRuleCall_1_2_0_1() { return cMemberAttributeIDTerminalRuleCall_1_2_0_1; }
	}
	public class EntityMappingExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.stefanvuckovic.domainToDto.DomainToDTO.EntityMappingExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEntityMappingExpressionAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cMapKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cMappedEntityAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cMappedEntityMemberSelectionExpressionParserRuleCall_2_0 = (RuleCall)cMappedEntityAssignment_2.eContents().get(0);
		private final Keyword cWithKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cMapperAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cMapperMapperCrossReference_4_0 = (CrossReference)cMapperAssignment_4.eContents().get(0);
		private final RuleCall cMapperMapperIDTerminalRuleCall_4_0_1 = (RuleCall)cMapperMapperCrossReference_4_0.eContents().get(1);
		
		//EntityMappingExpression:
		//	{EntityMappingExpression} 'map' mappedEntity=MemberSelectionExpression 'with' mapper=[Mapper];
		@Override public ParserRule getRule() { return rule; }
		
		//{EntityMappingExpression} 'map' mappedEntity=MemberSelectionExpression 'with' mapper=[Mapper]
		public Group getGroup() { return cGroup; }
		
		//{EntityMappingExpression}
		public Action getEntityMappingExpressionAction_0() { return cEntityMappingExpressionAction_0; }
		
		//'map'
		public Keyword getMapKeyword_1() { return cMapKeyword_1; }
		
		//mappedEntity=MemberSelectionExpression
		public Assignment getMappedEntityAssignment_2() { return cMappedEntityAssignment_2; }
		
		//MemberSelectionExpression
		public RuleCall getMappedEntityMemberSelectionExpressionParserRuleCall_2_0() { return cMappedEntityMemberSelectionExpressionParserRuleCall_2_0; }
		
		//'with'
		public Keyword getWithKeyword_3() { return cWithKeyword_3; }
		
		//mapper=[Mapper]
		public Assignment getMapperAssignment_4() { return cMapperAssignment_4; }
		
		//[Mapper]
		public CrossReference getMapperMapperCrossReference_4_0() { return cMapperMapperCrossReference_4_0; }
		
		//ID
		public RuleCall getMapperMapperIDTerminalRuleCall_4_0_1() { return cMapperMapperIDTerminalRuleCall_4_0_1; }
	}
	public class AtomExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.stefanvuckovic.domainToDto.DomainToDTO.AtomExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cStaticEntityRefAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cReferenceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cReferenceEntityCrossReference_1_0 = (CrossReference)cReferenceAssignment_1.eContents().get(0);
		private final RuleCall cReferenceEntityIDTerminalRuleCall_1_0_1 = (RuleCall)cReferenceEntityCrossReference_1_0.eContents().get(1);
		
		//AtomExpression:
		//	{StaticEntityRef} reference=[dm::Entity];
		@Override public ParserRule getRule() { return rule; }
		
		//{StaticEntityRef} reference=[dm::Entity]
		public Group getGroup() { return cGroup; }
		
		//{StaticEntityRef}
		public Action getStaticEntityRefAction_0() { return cStaticEntityRefAction_0; }
		
		//reference=[dm::Entity]
		public Assignment getReferenceAssignment_1() { return cReferenceAssignment_1; }
		
		//[dm::Entity]
		public CrossReference getReferenceEntityCrossReference_1_0() { return cReferenceEntityCrossReference_1_0; }
		
		//ID
		public RuleCall getReferenceEntityIDTerminalRuleCall_1_0_1() { return cReferenceEntityIDTerminalRuleCall_1_0_1; }
	}
	
	
	private final MappingModelElements pMappingModel;
	private final MapperElements pMapper;
	private final MappedAttributeElements pMappedAttribute;
	private final ExpressionElements pExpression;
	private final MemberSelectionExpressionElements pMemberSelectionExpression;
	private final EntityMappingExpressionElements pEntityMappingExpression;
	private final AtomExpressionElements pAtomExpression;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public DomainToDTOGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pMappingModel = new MappingModelElements();
		this.pMapper = new MapperElements();
		this.pMappedAttribute = new MappedAttributeElements();
		this.pExpression = new ExpressionElements();
		this.pMemberSelectionExpression = new MemberSelectionExpressionElements();
		this.pEntityMappingExpression = new EntityMappingExpressionElements();
		this.pAtomExpression = new AtomExpressionElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("com.stefanvuckovic.domainToDto.DomainToDTO".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//MappingModel:
	//	mappers+=Mapper*;
	public MappingModelElements getMappingModelAccess() {
		return pMappingModel;
	}
	
	public ParserRule getMappingModelRule() {
		return getMappingModelAccess().getRule();
	}
	
	//Mapper:
	//	'mapper' name=ID 'dto' dto=[dto::DTOClass] '{'
	//	attributes+=MappedAttribute*
	//	'}';
	public MapperElements getMapperAccess() {
		return pMapper;
	}
	
	public ParserRule getMapperRule() {
		return getMapperAccess().getRule();
	}
	
	//MappedAttribute:
	//	attr=[dm::Attribute] '->' mapping=Expression;
	public MappedAttributeElements getMappedAttributeAccess() {
		return pMappedAttribute;
	}
	
	public ParserRule getMappedAttributeRule() {
		return getMappedAttributeAccess().getRule();
	}
	
	//Expression dm::Expression:
	//	MemberSelectionExpression | EntityMappingExpression
	public ExpressionElements getExpressionAccess() {
		return pExpression;
	}
	
	public ParserRule getExpressionRule() {
		return getExpressionAccess().getRule();
	}
	
	//MemberSelectionExpression dm::Expression:
	//	AtomExpression ({MemberSelectionExpression.receiver=current} '.'
	//	member=[dm::Attribute])*
	public MemberSelectionExpressionElements getMemberSelectionExpressionAccess() {
		return pMemberSelectionExpression;
	}
	
	public ParserRule getMemberSelectionExpressionRule() {
		return getMemberSelectionExpressionAccess().getRule();
	}
	
	//EntityMappingExpression:
	//	{EntityMappingExpression} 'map' mappedEntity=MemberSelectionExpression 'with' mapper=[Mapper];
	public EntityMappingExpressionElements getEntityMappingExpressionAccess() {
		return pEntityMappingExpression;
	}
	
	public ParserRule getEntityMappingExpressionRule() {
		return getEntityMappingExpressionAccess().getRule();
	}
	
	//AtomExpression:
	//	{StaticEntityRef} reference=[dm::Entity];
	public AtomExpressionElements getAtomExpressionAccess() {
		return pAtomExpression;
	}
	
	public ParserRule getAtomExpressionRule() {
		return getAtomExpressionAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}

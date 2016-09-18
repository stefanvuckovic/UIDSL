/*
 * generated by Xtext 2.10.0
 */
package com.stefanvuckovic.dto.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.stefanvuckovic.domainmodel.services.DomainModelGrammarAccess;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumRule;
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
public class DTOGrammarAccess extends AbstractGrammarElementFinder {
	
	public class DTOModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.stefanvuckovic.dto.DTO.DTOModel");
		private final Assignment cConceptsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cConceptsConceptParserRuleCall_0 = (RuleCall)cConceptsAssignment.eContents().get(0);
		
		//DTOModel:
		//	concepts+=Concept*;
		@Override public ParserRule getRule() { return rule; }
		
		//concepts+=Concept*
		public Assignment getConceptsAssignment() { return cConceptsAssignment; }
		
		//Concept
		public RuleCall getConceptsConceptParserRuleCall_0() { return cConceptsConceptParserRuleCall_0; }
	}
	public class ConceptElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.stefanvuckovic.dto.DTO.Concept");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cDTOClassParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cEnumParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Concept domainModel::Concept:
		//	DTOClass | Enum
		@Override public ParserRule getRule() { return rule; }
		
		//DTOClass | Enum
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//DTOClass
		public RuleCall getDTOClassParserRuleCall_0() { return cDTOClassParserRuleCall_0; }
		
		//Enum
		public RuleCall getEnumParserRuleCall_1() { return cEnumParserRuleCall_1; }
	}
	public class DTOClassElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.stefanvuckovic.dto.DTO.DTOClass");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cClassKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cExtendsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cSuperTypeAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cSuperTypeDTOClassCrossReference_2_1_0 = (CrossReference)cSuperTypeAssignment_2_1.eContents().get(0);
		private final RuleCall cSuperTypeDTOClassIDTerminalRuleCall_2_1_0_1 = (RuleCall)cSuperTypeDTOClassCrossReference_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cAttributesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cAttributesAttributeParserRuleCall_4_0 = (RuleCall)cAttributesAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//DTOClass:
		//	'class' name=ID ('extends' superType=[DTOClass])? '{'
		//	attributes+=Attribute*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'class' name=ID ('extends' superType=[DTOClass])? '{' attributes+=Attribute* '}'
		public Group getGroup() { return cGroup; }
		
		//'class'
		public Keyword getClassKeyword_0() { return cClassKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//('extends' superType=[DTOClass])?
		public Group getGroup_2() { return cGroup_2; }
		
		//'extends'
		public Keyword getExtendsKeyword_2_0() { return cExtendsKeyword_2_0; }
		
		//superType=[DTOClass]
		public Assignment getSuperTypeAssignment_2_1() { return cSuperTypeAssignment_2_1; }
		
		//[DTOClass]
		public CrossReference getSuperTypeDTOClassCrossReference_2_1_0() { return cSuperTypeDTOClassCrossReference_2_1_0; }
		
		//ID
		public RuleCall getSuperTypeDTOClassIDTerminalRuleCall_2_1_0_1() { return cSuperTypeDTOClassIDTerminalRuleCall_2_1_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//attributes+=Attribute*
		public Assignment getAttributesAssignment_4() { return cAttributesAssignment_4; }
		
		//Attribute
		public RuleCall getAttributesAttributeParserRuleCall_4_0() { return cAttributesAttributeParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class BasicTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.stefanvuckovic.dto.DTO.BasicType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cBasicTypeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cTextTypeAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cTextKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Action cEmailTypeAction_2_0 = (Action)cGroup_2.eContents().get(0);
		private final Keyword cEmailKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final Action cPasswordTypeAction_3_0 = (Action)cGroup_3.eContents().get(0);
		private final Keyword cPasswordKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Group cGroup_4 = (Group)cAlternatives.eContents().get(4);
		private final Action cFileTypeAction_4_0 = (Action)cGroup_4.eContents().get(0);
		private final Keyword cFileKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Group cGroup_5 = (Group)cAlternatives.eContents().get(5);
		private final Action cImageTypeAction_5_0 = (Action)cGroup_5.eContents().get(0);
		private final Keyword cImageKeyword_5_1 = (Keyword)cGroup_5.eContents().get(1);
		
		//BasicType domainModel::BasicType:
		//	super | {TextType} 'text' | {EmailType} 'email' | {PasswordType} 'password' | {FileType} 'file' | {ImageType} 'image'
		@Override public ParserRule getRule() { return rule; }
		
		//super | {TextType} 'text' | {EmailType} 'email' | {PasswordType} 'password' | {FileType} 'file' | {ImageType} 'image'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//super
		public RuleCall getBasicTypeParserRuleCall_0() { return cBasicTypeParserRuleCall_0; }
		
		//{TextType} 'text'
		public Group getGroup_1() { return cGroup_1; }
		
		//{TextType}
		public Action getTextTypeAction_1_0() { return cTextTypeAction_1_0; }
		
		//'text'
		public Keyword getTextKeyword_1_1() { return cTextKeyword_1_1; }
		
		//{EmailType} 'email'
		public Group getGroup_2() { return cGroup_2; }
		
		//{EmailType}
		public Action getEmailTypeAction_2_0() { return cEmailTypeAction_2_0; }
		
		//'email'
		public Keyword getEmailKeyword_2_1() { return cEmailKeyword_2_1; }
		
		//{PasswordType} 'password'
		public Group getGroup_3() { return cGroup_3; }
		
		//{PasswordType}
		public Action getPasswordTypeAction_3_0() { return cPasswordTypeAction_3_0; }
		
		//'password'
		public Keyword getPasswordKeyword_3_1() { return cPasswordKeyword_3_1; }
		
		//{FileType} 'file'
		public Group getGroup_4() { return cGroup_4; }
		
		//{FileType}
		public Action getFileTypeAction_4_0() { return cFileTypeAction_4_0; }
		
		//'file'
		public Keyword getFileKeyword_4_1() { return cFileKeyword_4_1; }
		
		//{ImageType} 'image'
		public Group getGroup_5() { return cGroup_5; }
		
		//{ImageType}
		public Action getImageTypeAction_5_0() { return cImageTypeAction_5_0; }
		
		//'image'
		public Keyword getImageKeyword_5_1() { return cImageKeyword_5_1; }
	}
	
	
	private final DTOModelElements pDTOModel;
	private final ConceptElements pConcept;
	private final DTOClassElements pDTOClass;
	private final BasicTypeElements pBasicType;
	
	private final Grammar grammar;
	
	private final DomainModelGrammarAccess gaDomainModel;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public DTOGrammarAccess(GrammarProvider grammarProvider,
			DomainModelGrammarAccess gaDomainModel,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaDomainModel = gaDomainModel;
		this.gaTerminals = gaTerminals;
		this.pDTOModel = new DTOModelElements();
		this.pConcept = new ConceptElements();
		this.pDTOClass = new DTOClassElements();
		this.pBasicType = new BasicTypeElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("com.stefanvuckovic.dto.DTO".equals(grammar.getName())) {
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
	
	
	public DomainModelGrammarAccess getDomainModelGrammarAccess() {
		return gaDomainModel;
	}
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//DTOModel:
	//	concepts+=Concept*;
	public DTOModelElements getDTOModelAccess() {
		return pDTOModel;
	}
	
	public ParserRule getDTOModelRule() {
		return getDTOModelAccess().getRule();
	}
	
	//Concept domainModel::Concept:
	//	DTOClass | Enum
	public ConceptElements getConceptAccess() {
		return pConcept;
	}
	
	public ParserRule getConceptRule() {
		return getConceptAccess().getRule();
	}
	
	//DTOClass:
	//	'class' name=ID ('extends' superType=[DTOClass])? '{'
	//	attributes+=Attribute*
	//	'}';
	public DTOClassElements getDTOClassAccess() {
		return pDTOClass;
	}
	
	public ParserRule getDTOClassRule() {
		return getDTOClassAccess().getRule();
	}
	
	//BasicType domainModel::BasicType:
	//	super | {TextType} 'text' | {EmailType} 'email' | {PasswordType} 'password' | {FileType} 'file' | {ImageType} 'image'
	public BasicTypeElements getBasicTypeAccess() {
		return pBasicType;
	}
	
	public ParserRule getBasicTypeRule() {
		return getBasicTypeAccess().getRule();
	}
	
	//Model:
	//	concepts+=super::Concept*;
	public DomainModelGrammarAccess.ModelElements getModelAccess() {
		return gaDomainModel.getModelAccess();
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Entity:
	//	'entity' name=ID ('extends' superType=[Entity])? ('options' '(' options+=EntityOption (',' options+=EntityOption)*
	//	')')? '{'
	//	attributes+=Attribute*
	//	'}';
	public DomainModelGrammarAccess.EntityElements getEntityAccess() {
		return gaDomainModel.getEntityAccess();
	}
	
	public ParserRule getEntityRule() {
		return getEntityAccess().getRule();
	}
	
	//Enum:
	//	'enum' name=ID '{'
	//	attributes+=Attribute*
	//	literals+=EnumLiteral+
	//	'}';
	public DomainModelGrammarAccess.EnumElements getEnumAccess() {
		return gaDomainModel.getEnumAccess();
	}
	
	public ParserRule getEnumRule() {
		return getEnumAccess().getRule();
	}
	
	//EnumLiteral:
	//	name=ID ('(' params+=Constant (',' params+=Constant)* ')')?;
	public DomainModelGrammarAccess.EnumLiteralElements getEnumLiteralAccess() {
		return gaDomainModel.getEnumLiteralAccess();
	}
	
	public ParserRule getEnumLiteralRule() {
		return getEnumLiteralAccess().getRule();
	}
	
	//Constant:
	//	{IntConstant} value=INT | {LongConstant} value=INT 'L' | {StringConstant} value=STRING | {BoolConstant} value=('true'
	//	| 'false') | {DateConstant} day=INT '/' month=INT '/' year=INT | {Null} 'null';
	public DomainModelGrammarAccess.ConstantElements getConstantAccess() {
		return gaDomainModel.getConstantAccess();
	}
	
	public ParserRule getConstantRule() {
		return getConstantAccess().getRule();
	}
	
	//Option:
	//	EntityOption | AttributeOption;
	public DomainModelGrammarAccess.OptionElements getOptionAccess() {
		return gaDomainModel.getOptionAccess();
	}
	
	public ParserRule getOptionRule() {
		return getOptionAccess().getRule();
	}
	
	//EntityOption:
	//	{EntityDeleteOption} deleteByFlag?='deleteByFlag' | {InheritanceMappingOption} 'inheritance' '='
	//	inheritanceMapping=InheritanceMappingType;
	public DomainModelGrammarAccess.EntityOptionElements getEntityOptionAccess() {
		return gaDomainModel.getEntityOptionAccess();
	}
	
	public ParserRule getEntityOptionRule() {
		return getEntityOptionAccess().getRule();
	}
	
	//InheritanceMappingType:
	//	type=('SINGLE_TABLE' | 'TABLE_PER_CONCRETE_CLASS' | 'TABLE_PER_CLASS');
	public DomainModelGrammarAccess.InheritanceMappingTypeElements getInheritanceMappingTypeAccess() {
		return gaDomainModel.getInheritanceMappingTypeAccess();
	}
	
	public ParserRule getInheritanceMappingTypeRule() {
		return getInheritanceMappingTypeAccess().getRule();
	}
	
	//Attribute:
	//	type=AttributeType name=ID (options+=AttributeOption (',' options+=AttributeOption)*)? ';';
	public DomainModelGrammarAccess.AttributeElements getAttributeAccess() {
		return gaDomainModel.getAttributeAccess();
	}
	
	public ParserRule getAttributeRule() {
		return getAttributeAccess().getRule();
	}
	
	//AttributeType:
	//	SingleType | CollectionType;
	public DomainModelGrammarAccess.AttributeTypeElements getAttributeTypeAccess() {
		return gaDomainModel.getAttributeTypeAccess();
	}
	
	public ParserRule getAttributeTypeRule() {
		return getAttributeTypeAccess().getRule();
	}
	
	//SingleType:
	//	super::BasicType | RefType;
	public DomainModelGrammarAccess.SingleTypeElements getSingleTypeAccess() {
		return gaDomainModel.getSingleTypeAccess();
	}
	
	public ParserRule getSingleTypeRule() {
		return getSingleTypeAccess().getRule();
	}
	
	//BasicType:
	//	{StringType} 'string' | {IntType} 'int' | {LongType} 'long' | {BoolType} 'boolean' | {DateType} 'date';
	public DomainModelGrammarAccess.BasicTypeElements getDomainModelBasicTypeAccess() {
		return gaDomainModel.getBasicTypeAccess();
	}
	
	public ParserRule getDomainModelBasicTypeRule() {
		return getDomainModelBasicTypeAccess().getRule();
	}
	
	//RefType:
	//	reference=[Concept];
	public DomainModelGrammarAccess.RefTypeElements getRefTypeAccess() {
		return gaDomainModel.getRefTypeAccess();
	}
	
	public ParserRule getRefTypeRule() {
		return getRefTypeAccess().getRule();
	}
	
	//CollectionType:
	//	'List' '<' ofType=SingleType '>';
	public DomainModelGrammarAccess.CollectionTypeElements getCollectionTypeAccess() {
		return gaDomainModel.getCollectionTypeAccess();
	}
	
	public ParserRule getCollectionTypeRule() {
		return getCollectionTypeAccess().getRule();
	}
	
	//AttributeOption:
	//	{Required} required?='required' | {PartOf} partOf?='partOf' | {RelationshipOwner} 'relationshipOwner' '='
	//	relationshipOwner=StaticFieldSelection | {Cardinality} 'reverse_cardinality' '=' card=CardinalityType;
	public DomainModelGrammarAccess.AttributeOptionElements getAttributeOptionAccess() {
		return gaDomainModel.getAttributeOptionAccess();
	}
	
	public ParserRule getAttributeOptionRule() {
		return getAttributeOptionAccess().getRule();
	}
	
	//enum CardinalityType:
	//	One='one' |
	//	Many='many';
	public DomainModelGrammarAccess.CardinalityTypeElements getCardinalityTypeAccess() {
		return gaDomainModel.getCardinalityTypeAccess();
	}
	
	public EnumRule getCardinalityTypeRule() {
		return getCardinalityTypeAccess().getRule();
	}
	
	//StaticFieldSelection:
	//	receiver=[Entity] '.' member=[Attribute];
	public DomainModelGrammarAccess.StaticFieldSelectionElements getStaticFieldSelectionAccess() {
		return gaDomainModel.getStaticFieldSelectionAccess();
	}
	
	public ParserRule getStaticFieldSelectionRule() {
		return getStaticFieldSelectionAccess().getRule();
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
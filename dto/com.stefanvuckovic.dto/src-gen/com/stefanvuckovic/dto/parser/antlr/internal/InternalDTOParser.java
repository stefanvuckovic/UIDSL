package com.stefanvuckovic.dto.parser.antlr.internal;

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
import com.stefanvuckovic.dto.services.DTOGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDTOParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'class'", "'extends'", "'{'", "'}'", "'representation'", "'text'", "'email'", "'password'", "'file'", "'image'", "'enum'", "'('", "','", "')'", "'L'", "'true'", "'false'", "'/'", "'null'", "'deleteByFlag'", "'inheritance'", "'='", "'SINGLE_TABLE'", "'TABLE_PER_CONCRETE_CLASS'", "'TABLE_PER_CLASS'", "';'", "'string'", "'int'", "'long'", "'boolean'", "'date'", "'List'", "'<'", "'>'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalDTOParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDTOParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDTOParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDTO.g"; }



     	private DTOGrammarAccess grammarAccess;

        public InternalDTOParser(TokenStream input, DTOGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "DTOModel";
       	}

       	@Override
       	protected DTOGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDTOModel"
    // InternalDTO.g:65:1: entryRuleDTOModel returns [EObject current=null] : iv_ruleDTOModel= ruleDTOModel EOF ;
    public final EObject entryRuleDTOModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTOModel = null;


        try {
            // InternalDTO.g:65:49: (iv_ruleDTOModel= ruleDTOModel EOF )
            // InternalDTO.g:66:2: iv_ruleDTOModel= ruleDTOModel EOF
            {
             newCompositeNode(grammarAccess.getDTOModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDTOModel=ruleDTOModel();

            state._fsp--;

             current =iv_ruleDTOModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDTOModel"


    // $ANTLR start "ruleDTOModel"
    // InternalDTO.g:72:1: ruleDTOModel returns [EObject current=null] : ( (lv_concepts_0_0= ruleConcept ) )* ;
    public final EObject ruleDTOModel() throws RecognitionException {
        EObject current = null;

        EObject lv_concepts_0_0 = null;



        	enterRule();

        try {
            // InternalDTO.g:78:2: ( ( (lv_concepts_0_0= ruleConcept ) )* )
            // InternalDTO.g:79:2: ( (lv_concepts_0_0= ruleConcept ) )*
            {
            // InternalDTO.g:79:2: ( (lv_concepts_0_0= ruleConcept ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==21) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDTO.g:80:3: (lv_concepts_0_0= ruleConcept )
            	    {
            	    // InternalDTO.g:80:3: (lv_concepts_0_0= ruleConcept )
            	    // InternalDTO.g:81:4: lv_concepts_0_0= ruleConcept
            	    {

            	    				newCompositeNode(grammarAccess.getDTOModelAccess().getConceptsConceptParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_concepts_0_0=ruleConcept();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getDTOModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"concepts",
            	    					lv_concepts_0_0,
            	    					"com.stefanvuckovic.dto.DTO.Concept");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDTOModel"


    // $ANTLR start "entryRuleConcept"
    // InternalDTO.g:101:1: entryRuleConcept returns [EObject current=null] : iv_ruleConcept= ruleConcept EOF ;
    public final EObject entryRuleConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcept = null;


        try {
            // InternalDTO.g:101:48: (iv_ruleConcept= ruleConcept EOF )
            // InternalDTO.g:102:2: iv_ruleConcept= ruleConcept EOF
            {
             newCompositeNode(grammarAccess.getConceptRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConcept=ruleConcept();

            state._fsp--;

             current =iv_ruleConcept; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConcept"


    // $ANTLR start "ruleConcept"
    // InternalDTO.g:108:1: ruleConcept returns [EObject current=null] : (this_DTOClass_0= ruleDTOClass | this_Enum_1= ruleEnum ) ;
    public final EObject ruleConcept() throws RecognitionException {
        EObject current = null;

        EObject this_DTOClass_0 = null;

        EObject this_Enum_1 = null;



        	enterRule();

        try {
            // InternalDTO.g:114:2: ( (this_DTOClass_0= ruleDTOClass | this_Enum_1= ruleEnum ) )
            // InternalDTO.g:115:2: (this_DTOClass_0= ruleDTOClass | this_Enum_1= ruleEnum )
            {
            // InternalDTO.g:115:2: (this_DTOClass_0= ruleDTOClass | this_Enum_1= ruleEnum )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==21) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDTO.g:116:3: this_DTOClass_0= ruleDTOClass
                    {

                    			newCompositeNode(grammarAccess.getConceptAccess().getDTOClassParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DTOClass_0=ruleDTOClass();

                    state._fsp--;


                    			current = this_DTOClass_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDTO.g:125:3: this_Enum_1= ruleEnum
                    {

                    			newCompositeNode(grammarAccess.getConceptAccess().getEnumParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Enum_1=ruleEnum();

                    state._fsp--;


                    			current = this_Enum_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConcept"


    // $ANTLR start "entryRuleDTOClass"
    // InternalDTO.g:137:1: entryRuleDTOClass returns [EObject current=null] : iv_ruleDTOClass= ruleDTOClass EOF ;
    public final EObject entryRuleDTOClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTOClass = null;


        try {
            // InternalDTO.g:137:49: (iv_ruleDTOClass= ruleDTOClass EOF )
            // InternalDTO.g:138:2: iv_ruleDTOClass= ruleDTOClass EOF
            {
             newCompositeNode(grammarAccess.getDTOClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDTOClass=ruleDTOClass();

            state._fsp--;

             current =iv_ruleDTOClass; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDTOClass"


    // $ANTLR start "ruleDTOClass"
    // InternalDTO.g:144:1: ruleDTOClass returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' ) ;
    public final EObject ruleDTOClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_attributes_5_0 = null;



        	enterRule();

        try {
            // InternalDTO.g:150:2: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' ) )
            // InternalDTO.g:151:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' )
            {
            // InternalDTO.g:151:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' )
            // InternalDTO.g:152:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDTOClassAccess().getClassKeyword_0());
            		
            // InternalDTO.g:156:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDTO.g:157:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDTO.g:157:4: (lv_name_1_0= RULE_ID )
            // InternalDTO.g:158:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDTOClassAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDTOClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDTO.g:174:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDTO.g:175:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getDTOClassAccess().getExtendsKeyword_2_0());
                    			
                    // InternalDTO.g:179:4: ( (otherlv_3= RULE_ID ) )
                    // InternalDTO.g:180:5: (otherlv_3= RULE_ID )
                    {
                    // InternalDTO.g:180:5: (otherlv_3= RULE_ID )
                    // InternalDTO.g:181:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDTOClassRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(otherlv_3, grammarAccess.getDTOClassAccess().getSuperTypeDTOClassCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getDTOClassAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDTO.g:197:3: ( (lv_attributes_5_0= ruleAttribute ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||(LA4_0>=16 && LA4_0<=20)||(LA4_0>=37 && LA4_0<=42)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDTO.g:198:4: (lv_attributes_5_0= ruleAttribute )
            	    {
            	    // InternalDTO.g:198:4: (lv_attributes_5_0= ruleAttribute )
            	    // InternalDTO.g:199:5: lv_attributes_5_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getDTOClassAccess().getAttributesAttributeParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_attributes_5_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDTOClassRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_5_0,
            	    						"com.stefanvuckovic.domainmodel.DomainModel.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDTOClassAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDTOClass"


    // $ANTLR start "entryRuleAttributeOption"
    // InternalDTO.g:224:1: entryRuleAttributeOption returns [EObject current=null] : iv_ruleAttributeOption= ruleAttributeOption EOF ;
    public final EObject entryRuleAttributeOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeOption = null;


        try {
            // InternalDTO.g:224:56: (iv_ruleAttributeOption= ruleAttributeOption EOF )
            // InternalDTO.g:225:2: iv_ruleAttributeOption= ruleAttributeOption EOF
            {
             newCompositeNode(grammarAccess.getAttributeOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeOption=ruleAttributeOption();

            state._fsp--;

             current =iv_ruleAttributeOption; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeOption"


    // $ANTLR start "ruleAttributeOption"
    // InternalDTO.g:231:1: ruleAttributeOption returns [EObject current=null] : ( () otherlv_1= 'representation' ) ;
    public final EObject ruleAttributeOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDTO.g:237:2: ( ( () otherlv_1= 'representation' ) )
            // InternalDTO.g:238:2: ( () otherlv_1= 'representation' )
            {
            // InternalDTO.g:238:2: ( () otherlv_1= 'representation' )
            // InternalDTO.g:239:3: () otherlv_1= 'representation'
            {
            // InternalDTO.g:239:3: ()
            // InternalDTO.g:240:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttributeOptionAccess().getObjectRepresentationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeOptionAccess().getRepresentationKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeOption"


    // $ANTLR start "entryRuleBasicType"
    // InternalDTO.g:254:1: entryRuleBasicType returns [EObject current=null] : iv_ruleBasicType= ruleBasicType EOF ;
    public final EObject entryRuleBasicType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicType = null;


        try {
            // InternalDTO.g:254:50: (iv_ruleBasicType= ruleBasicType EOF )
            // InternalDTO.g:255:2: iv_ruleBasicType= ruleBasicType EOF
            {
             newCompositeNode(grammarAccess.getBasicTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBasicType=ruleBasicType();

            state._fsp--;

             current =iv_ruleBasicType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBasicType"


    // $ANTLR start "ruleBasicType"
    // InternalDTO.g:261:1: ruleBasicType returns [EObject current=null] : (this_BasicType_0= superBasicType | ( () otherlv_2= 'text' ) | ( () otherlv_4= 'email' ) | ( () otherlv_6= 'password' ) | ( () otherlv_8= 'file' ) | ( () otherlv_10= 'image' ) ) ;
    public final EObject ruleBasicType() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject this_BasicType_0 = null;



        	enterRule();

        try {
            // InternalDTO.g:267:2: ( (this_BasicType_0= superBasicType | ( () otherlv_2= 'text' ) | ( () otherlv_4= 'email' ) | ( () otherlv_6= 'password' ) | ( () otherlv_8= 'file' ) | ( () otherlv_10= 'image' ) ) )
            // InternalDTO.g:268:2: (this_BasicType_0= superBasicType | ( () otherlv_2= 'text' ) | ( () otherlv_4= 'email' ) | ( () otherlv_6= 'password' ) | ( () otherlv_8= 'file' ) | ( () otherlv_10= 'image' ) )
            {
            // InternalDTO.g:268:2: (this_BasicType_0= superBasicType | ( () otherlv_2= 'text' ) | ( () otherlv_4= 'email' ) | ( () otherlv_6= 'password' ) | ( () otherlv_8= 'file' ) | ( () otherlv_10= 'image' ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
                {
                alt5=1;
                }
                break;
            case 16:
                {
                alt5=2;
                }
                break;
            case 17:
                {
                alt5=3;
                }
                break;
            case 18:
                {
                alt5=4;
                }
                break;
            case 19:
                {
                alt5=5;
                }
                break;
            case 20:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalDTO.g:269:3: this_BasicType_0= superBasicType
                    {

                    			newCompositeNode(grammarAccess.getBasicTypeAccess().getBasicTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BasicType_0=superBasicType();

                    state._fsp--;


                    			current = this_BasicType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDTO.g:278:3: ( () otherlv_2= 'text' )
                    {
                    // InternalDTO.g:278:3: ( () otherlv_2= 'text' )
                    // InternalDTO.g:279:4: () otherlv_2= 'text'
                    {
                    // InternalDTO.g:279:4: ()
                    // InternalDTO.g:280:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBasicTypeAccess().getTextTypeAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getBasicTypeAccess().getTextKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDTO.g:292:3: ( () otherlv_4= 'email' )
                    {
                    // InternalDTO.g:292:3: ( () otherlv_4= 'email' )
                    // InternalDTO.g:293:4: () otherlv_4= 'email'
                    {
                    // InternalDTO.g:293:4: ()
                    // InternalDTO.g:294:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBasicTypeAccess().getEmailTypeAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getBasicTypeAccess().getEmailKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDTO.g:306:3: ( () otherlv_6= 'password' )
                    {
                    // InternalDTO.g:306:3: ( () otherlv_6= 'password' )
                    // InternalDTO.g:307:4: () otherlv_6= 'password'
                    {
                    // InternalDTO.g:307:4: ()
                    // InternalDTO.g:308:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBasicTypeAccess().getPasswordTypeAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_6=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getBasicTypeAccess().getPasswordKeyword_3_1());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDTO.g:320:3: ( () otherlv_8= 'file' )
                    {
                    // InternalDTO.g:320:3: ( () otherlv_8= 'file' )
                    // InternalDTO.g:321:4: () otherlv_8= 'file'
                    {
                    // InternalDTO.g:321:4: ()
                    // InternalDTO.g:322:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBasicTypeAccess().getFileTypeAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_8=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getBasicTypeAccess().getFileKeyword_4_1());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDTO.g:334:3: ( () otherlv_10= 'image' )
                    {
                    // InternalDTO.g:334:3: ( () otherlv_10= 'image' )
                    // InternalDTO.g:335:4: () otherlv_10= 'image'
                    {
                    // InternalDTO.g:335:4: ()
                    // InternalDTO.g:336:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBasicTypeAccess().getImageTypeAction_5_0(),
                    						current);
                    				

                    }

                    otherlv_10=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getBasicTypeAccess().getImageKeyword_5_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBasicType"


    // $ANTLR start "entryRuleEnum"
    // InternalDTO.g:351:1: entryRuleEnum returns [EObject current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final EObject entryRuleEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnum = null;


        try {
            // InternalDTO.g:351:45: (iv_ruleEnum= ruleEnum EOF )
            // InternalDTO.g:352:2: iv_ruleEnum= ruleEnum EOF
            {
             newCompositeNode(grammarAccess.getEnumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnum=ruleEnum();

            state._fsp--;

             current =iv_ruleEnum; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnum"


    // $ANTLR start "ruleEnum"
    // InternalDTO.g:358:1: ruleEnum returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_literals_4_0= ruleEnumLiteral ) )+ otherlv_5= '}' ) ;
    public final EObject ruleEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_attributes_3_0 = null;

        EObject lv_literals_4_0 = null;



        	enterRule();

        try {
            // InternalDTO.g:364:2: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_literals_4_0= ruleEnumLiteral ) )+ otherlv_5= '}' ) )
            // InternalDTO.g:365:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_literals_4_0= ruleEnumLiteral ) )+ otherlv_5= '}' )
            {
            // InternalDTO.g:365:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_literals_4_0= ruleEnumLiteral ) )+ otherlv_5= '}' )
            // InternalDTO.g:366:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_literals_4_0= ruleEnumLiteral ) )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumAccess().getEnumKeyword_0());
            		
            // InternalDTO.g:370:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDTO.g:371:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDTO.g:371:4: (lv_name_1_0= RULE_ID )
            // InternalDTO.g:372:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEnumAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDTO.g:392:3: ( (lv_attributes_3_0= ruleAttribute ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1==RULE_ID) ) {
                        int LA6_3 = input.LA(3);

                        if ( (LA6_3==15||LA6_3==36) ) {
                            alt6=1;
                        }


                    }


                }
                else if ( ((LA6_0>=16 && LA6_0<=20)||(LA6_0>=37 && LA6_0<=42)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDTO.g:393:4: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // InternalDTO.g:393:4: (lv_attributes_3_0= ruleAttribute )
            	    // InternalDTO.g:394:5: lv_attributes_3_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getEnumAccess().getAttributesAttributeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_attributes_3_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEnumRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_3_0,
            	    						"com.stefanvuckovic.domainmodel.DomainModel.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalDTO.g:411:3: ( (lv_literals_4_0= ruleEnumLiteral ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDTO.g:412:4: (lv_literals_4_0= ruleEnumLiteral )
            	    {
            	    // InternalDTO.g:412:4: (lv_literals_4_0= ruleEnumLiteral )
            	    // InternalDTO.g:413:5: lv_literals_4_0= ruleEnumLiteral
            	    {

            	    					newCompositeNode(grammarAccess.getEnumAccess().getLiteralsEnumLiteralParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_literals_4_0=ruleEnumLiteral();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEnumRule());
            	    					}
            	    					add(
            	    						current,
            	    						"literals",
            	    						lv_literals_4_0,
            	    						"com.stefanvuckovic.domainmodel.DomainModel.EnumLiteral");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnum"


    // $ANTLR start "entryRuleEnumLiteral"
    // InternalDTO.g:438:1: entryRuleEnumLiteral returns [EObject current=null] : iv_ruleEnumLiteral= ruleEnumLiteral EOF ;
    public final EObject entryRuleEnumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumLiteral = null;


        try {
            // InternalDTO.g:438:52: (iv_ruleEnumLiteral= ruleEnumLiteral EOF )
            // InternalDTO.g:439:2: iv_ruleEnumLiteral= ruleEnumLiteral EOF
            {
             newCompositeNode(grammarAccess.getEnumLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumLiteral=ruleEnumLiteral();

            state._fsp--;

             current =iv_ruleEnumLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumLiteral"


    // $ANTLR start "ruleEnumLiteral"
    // InternalDTO.g:445:1: ruleEnumLiteral returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleConstant ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleConstant ) ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleEnumLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;



        	enterRule();

        try {
            // InternalDTO.g:451:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleConstant ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleConstant ) ) )* otherlv_5= ')' )? ) )
            // InternalDTO.g:452:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleConstant ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleConstant ) ) )* otherlv_5= ')' )? )
            {
            // InternalDTO.g:452:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleConstant ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleConstant ) ) )* otherlv_5= ')' )? )
            // InternalDTO.g:453:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleConstant ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleConstant ) ) )* otherlv_5= ')' )?
            {
            // InternalDTO.g:453:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDTO.g:454:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDTO.g:454:4: (lv_name_0_0= RULE_ID )
            // InternalDTO.g:455:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEnumLiteralAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumLiteralRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDTO.g:471:3: (otherlv_1= '(' ( (lv_params_2_0= ruleConstant ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleConstant ) ) )* otherlv_5= ')' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDTO.g:472:4: otherlv_1= '(' ( (lv_params_2_0= ruleConstant ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleConstant ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getEnumLiteralAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalDTO.g:476:4: ( (lv_params_2_0= ruleConstant ) )
                    // InternalDTO.g:477:5: (lv_params_2_0= ruleConstant )
                    {
                    // InternalDTO.g:477:5: (lv_params_2_0= ruleConstant )
                    // InternalDTO.g:478:6: lv_params_2_0= ruleConstant
                    {

                    						newCompositeNode(grammarAccess.getEnumLiteralAccess().getParamsConstantParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_params_2_0=ruleConstant();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnumLiteralRule());
                    						}
                    						add(
                    							current,
                    							"params",
                    							lv_params_2_0,
                    							"com.stefanvuckovic.domainmodel.DomainModel.Constant");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDTO.g:495:4: (otherlv_3= ',' ( (lv_params_4_0= ruleConstant ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==23) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalDTO.g:496:5: otherlv_3= ',' ( (lv_params_4_0= ruleConstant ) )
                    	    {
                    	    otherlv_3=(Token)match(input,23,FOLLOW_10); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getEnumLiteralAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalDTO.g:500:5: ( (lv_params_4_0= ruleConstant ) )
                    	    // InternalDTO.g:501:6: (lv_params_4_0= ruleConstant )
                    	    {
                    	    // InternalDTO.g:501:6: (lv_params_4_0= ruleConstant )
                    	    // InternalDTO.g:502:7: lv_params_4_0= ruleConstant
                    	    {

                    	    							newCompositeNode(grammarAccess.getEnumLiteralAccess().getParamsConstantParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_params_4_0=ruleConstant();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEnumLiteralRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"params",
                    	    								lv_params_4_0,
                    	    								"com.stefanvuckovic.domainmodel.DomainModel.Constant");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getEnumLiteralAccess().getRightParenthesisKeyword_1_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumLiteral"


    // $ANTLR start "entryRuleConstant"
    // InternalDTO.g:529:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // InternalDTO.g:529:49: (iv_ruleConstant= ruleConstant EOF )
            // InternalDTO.g:530:2: iv_ruleConstant= ruleConstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstant=ruleConstant();

            state._fsp--;

             current =iv_ruleConstant; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalDTO.g:536:1: ruleConstant returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) otherlv_4= 'L' ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) ) ) | ( () ( (lv_day_10_0= RULE_INT ) ) otherlv_11= '/' ( (lv_month_12_0= RULE_INT ) ) otherlv_13= '/' ( (lv_year_14_0= RULE_INT ) ) ) | ( () otherlv_16= 'null' ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;
        Token lv_value_6_0=null;
        Token lv_value_8_1=null;
        Token lv_value_8_2=null;
        Token lv_day_10_0=null;
        Token otherlv_11=null;
        Token lv_month_12_0=null;
        Token otherlv_13=null;
        Token lv_year_14_0=null;
        Token otherlv_16=null;


        	enterRule();

        try {
            // InternalDTO.g:542:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) otherlv_4= 'L' ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) ) ) | ( () ( (lv_day_10_0= RULE_INT ) ) otherlv_11= '/' ( (lv_month_12_0= RULE_INT ) ) otherlv_13= '/' ( (lv_year_14_0= RULE_INT ) ) ) | ( () otherlv_16= 'null' ) ) )
            // InternalDTO.g:543:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) otherlv_4= 'L' ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) ) ) | ( () ( (lv_day_10_0= RULE_INT ) ) otherlv_11= '/' ( (lv_month_12_0= RULE_INT ) ) otherlv_13= '/' ( (lv_year_14_0= RULE_INT ) ) ) | ( () otherlv_16= 'null' ) )
            {
            // InternalDTO.g:543:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) otherlv_4= 'L' ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) ) ) | ( () ( (lv_day_10_0= RULE_INT ) ) otherlv_11= '/' ( (lv_month_12_0= RULE_INT ) ) otherlv_13= '/' ( (lv_year_14_0= RULE_INT ) ) ) | ( () otherlv_16= 'null' ) )
            int alt11=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                switch ( input.LA(2) ) {
                case 25:
                    {
                    alt11=2;
                    }
                    break;
                case EOF:
                case 23:
                case 24:
                    {
                    alt11=1;
                    }
                    break;
                case 28:
                    {
                    alt11=5;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }

                }
                break;
            case RULE_STRING:
                {
                alt11=3;
                }
                break;
            case 26:
            case 27:
                {
                alt11=4;
                }
                break;
            case 29:
                {
                alt11=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalDTO.g:544:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalDTO.g:544:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalDTO.g:545:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalDTO.g:545:4: ()
                    // InternalDTO.g:546:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstantAccess().getIntConstantAction_0_0(),
                    						current);
                    				

                    }

                    // InternalDTO.g:552:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalDTO.g:553:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalDTO.g:553:5: (lv_value_1_0= RULE_INT )
                    // InternalDTO.g:554:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getConstantAccess().getValueINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConstantRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDTO.g:572:3: ( () ( (lv_value_3_0= RULE_INT ) ) otherlv_4= 'L' )
                    {
                    // InternalDTO.g:572:3: ( () ( (lv_value_3_0= RULE_INT ) ) otherlv_4= 'L' )
                    // InternalDTO.g:573:4: () ( (lv_value_3_0= RULE_INT ) ) otherlv_4= 'L'
                    {
                    // InternalDTO.g:573:4: ()
                    // InternalDTO.g:574:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstantAccess().getLongConstantAction_1_0(),
                    						current);
                    				

                    }

                    // InternalDTO.g:580:4: ( (lv_value_3_0= RULE_INT ) )
                    // InternalDTO.g:581:5: (lv_value_3_0= RULE_INT )
                    {
                    // InternalDTO.g:581:5: (lv_value_3_0= RULE_INT )
                    // InternalDTO.g:582:6: lv_value_3_0= RULE_INT
                    {
                    lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_12); 

                    						newLeafNode(lv_value_3_0, grammarAccess.getConstantAccess().getValueINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConstantRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getConstantAccess().getLKeyword_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDTO.g:604:3: ( () ( (lv_value_6_0= RULE_STRING ) ) )
                    {
                    // InternalDTO.g:604:3: ( () ( (lv_value_6_0= RULE_STRING ) ) )
                    // InternalDTO.g:605:4: () ( (lv_value_6_0= RULE_STRING ) )
                    {
                    // InternalDTO.g:605:4: ()
                    // InternalDTO.g:606:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstantAccess().getStringConstantAction_2_0(),
                    						current);
                    				

                    }

                    // InternalDTO.g:612:4: ( (lv_value_6_0= RULE_STRING ) )
                    // InternalDTO.g:613:5: (lv_value_6_0= RULE_STRING )
                    {
                    // InternalDTO.g:613:5: (lv_value_6_0= RULE_STRING )
                    // InternalDTO.g:614:6: lv_value_6_0= RULE_STRING
                    {
                    lv_value_6_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_6_0, grammarAccess.getConstantAccess().getValueSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConstantRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalDTO.g:632:3: ( () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) ) )
                    {
                    // InternalDTO.g:632:3: ( () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) ) )
                    // InternalDTO.g:633:4: () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) )
                    {
                    // InternalDTO.g:633:4: ()
                    // InternalDTO.g:634:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstantAccess().getBoolConstantAction_3_0(),
                    						current);
                    				

                    }

                    // InternalDTO.g:640:4: ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) )
                    // InternalDTO.g:641:5: ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) )
                    {
                    // InternalDTO.g:641:5: ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) )
                    // InternalDTO.g:642:6: (lv_value_8_1= 'true' | lv_value_8_2= 'false' )
                    {
                    // InternalDTO.g:642:6: (lv_value_8_1= 'true' | lv_value_8_2= 'false' )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==26) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==27) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalDTO.g:643:7: lv_value_8_1= 'true'
                            {
                            lv_value_8_1=(Token)match(input,26,FOLLOW_2); 

                            							newLeafNode(lv_value_8_1, grammarAccess.getConstantAccess().getValueTrueKeyword_3_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConstantRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_8_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalDTO.g:654:7: lv_value_8_2= 'false'
                            {
                            lv_value_8_2=(Token)match(input,27,FOLLOW_2); 

                            							newLeafNode(lv_value_8_2, grammarAccess.getConstantAccess().getValueFalseKeyword_3_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConstantRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_8_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalDTO.g:669:3: ( () ( (lv_day_10_0= RULE_INT ) ) otherlv_11= '/' ( (lv_month_12_0= RULE_INT ) ) otherlv_13= '/' ( (lv_year_14_0= RULE_INT ) ) )
                    {
                    // InternalDTO.g:669:3: ( () ( (lv_day_10_0= RULE_INT ) ) otherlv_11= '/' ( (lv_month_12_0= RULE_INT ) ) otherlv_13= '/' ( (lv_year_14_0= RULE_INT ) ) )
                    // InternalDTO.g:670:4: () ( (lv_day_10_0= RULE_INT ) ) otherlv_11= '/' ( (lv_month_12_0= RULE_INT ) ) otherlv_13= '/' ( (lv_year_14_0= RULE_INT ) )
                    {
                    // InternalDTO.g:670:4: ()
                    // InternalDTO.g:671:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstantAccess().getDateConstantAction_4_0(),
                    						current);
                    				

                    }

                    // InternalDTO.g:677:4: ( (lv_day_10_0= RULE_INT ) )
                    // InternalDTO.g:678:5: (lv_day_10_0= RULE_INT )
                    {
                    // InternalDTO.g:678:5: (lv_day_10_0= RULE_INT )
                    // InternalDTO.g:679:6: lv_day_10_0= RULE_INT
                    {
                    lv_day_10_0=(Token)match(input,RULE_INT,FOLLOW_13); 

                    						newLeafNode(lv_day_10_0, grammarAccess.getConstantAccess().getDayINTTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConstantRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"day",
                    							lv_day_10_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,28,FOLLOW_14); 

                    				newLeafNode(otherlv_11, grammarAccess.getConstantAccess().getSolidusKeyword_4_2());
                    			
                    // InternalDTO.g:699:4: ( (lv_month_12_0= RULE_INT ) )
                    // InternalDTO.g:700:5: (lv_month_12_0= RULE_INT )
                    {
                    // InternalDTO.g:700:5: (lv_month_12_0= RULE_INT )
                    // InternalDTO.g:701:6: lv_month_12_0= RULE_INT
                    {
                    lv_month_12_0=(Token)match(input,RULE_INT,FOLLOW_13); 

                    						newLeafNode(lv_month_12_0, grammarAccess.getConstantAccess().getMonthINTTerminalRuleCall_4_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConstantRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"month",
                    							lv_month_12_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,28,FOLLOW_14); 

                    				newLeafNode(otherlv_13, grammarAccess.getConstantAccess().getSolidusKeyword_4_4());
                    			
                    // InternalDTO.g:721:4: ( (lv_year_14_0= RULE_INT ) )
                    // InternalDTO.g:722:5: (lv_year_14_0= RULE_INT )
                    {
                    // InternalDTO.g:722:5: (lv_year_14_0= RULE_INT )
                    // InternalDTO.g:723:6: lv_year_14_0= RULE_INT
                    {
                    lv_year_14_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_year_14_0, grammarAccess.getConstantAccess().getYearINTTerminalRuleCall_4_5_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConstantRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"year",
                    							lv_year_14_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalDTO.g:741:3: ( () otherlv_16= 'null' )
                    {
                    // InternalDTO.g:741:3: ( () otherlv_16= 'null' )
                    // InternalDTO.g:742:4: () otherlv_16= 'null'
                    {
                    // InternalDTO.g:742:4: ()
                    // InternalDTO.g:743:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstantAccess().getNullAction_5_0(),
                    						current);
                    				

                    }

                    otherlv_16=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_16, grammarAccess.getConstantAccess().getNullKeyword_5_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleEntityOption"
    // InternalDTO.g:758:1: entryRuleEntityOption returns [EObject current=null] : iv_ruleEntityOption= ruleEntityOption EOF ;
    public final EObject entryRuleEntityOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityOption = null;


        try {
            // InternalDTO.g:758:53: (iv_ruleEntityOption= ruleEntityOption EOF )
            // InternalDTO.g:759:2: iv_ruleEntityOption= ruleEntityOption EOF
            {
             newCompositeNode(grammarAccess.getEntityOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityOption=ruleEntityOption();

            state._fsp--;

             current =iv_ruleEntityOption; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityOption"


    // $ANTLR start "ruleEntityOption"
    // InternalDTO.g:765:1: ruleEntityOption returns [EObject current=null] : ( ( () ( (lv_deleteByFlag_1_0= 'deleteByFlag' ) ) ) | ( () otherlv_3= 'inheritance' otherlv_4= '=' ( (lv_inheritanceMapping_5_0= ruleInheritanceMappingType ) ) ) ) ;
    public final EObject ruleEntityOption() throws RecognitionException {
        EObject current = null;

        Token lv_deleteByFlag_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_inheritanceMapping_5_0 = null;



        	enterRule();

        try {
            // InternalDTO.g:771:2: ( ( ( () ( (lv_deleteByFlag_1_0= 'deleteByFlag' ) ) ) | ( () otherlv_3= 'inheritance' otherlv_4= '=' ( (lv_inheritanceMapping_5_0= ruleInheritanceMappingType ) ) ) ) )
            // InternalDTO.g:772:2: ( ( () ( (lv_deleteByFlag_1_0= 'deleteByFlag' ) ) ) | ( () otherlv_3= 'inheritance' otherlv_4= '=' ( (lv_inheritanceMapping_5_0= ruleInheritanceMappingType ) ) ) )
            {
            // InternalDTO.g:772:2: ( ( () ( (lv_deleteByFlag_1_0= 'deleteByFlag' ) ) ) | ( () otherlv_3= 'inheritance' otherlv_4= '=' ( (lv_inheritanceMapping_5_0= ruleInheritanceMappingType ) ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            else if ( (LA12_0==31) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalDTO.g:773:3: ( () ( (lv_deleteByFlag_1_0= 'deleteByFlag' ) ) )
                    {
                    // InternalDTO.g:773:3: ( () ( (lv_deleteByFlag_1_0= 'deleteByFlag' ) ) )
                    // InternalDTO.g:774:4: () ( (lv_deleteByFlag_1_0= 'deleteByFlag' ) )
                    {
                    // InternalDTO.g:774:4: ()
                    // InternalDTO.g:775:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEntityOptionAccess().getEntityDeleteOptionAction_0_0(),
                    						current);
                    				

                    }

                    // InternalDTO.g:781:4: ( (lv_deleteByFlag_1_0= 'deleteByFlag' ) )
                    // InternalDTO.g:782:5: (lv_deleteByFlag_1_0= 'deleteByFlag' )
                    {
                    // InternalDTO.g:782:5: (lv_deleteByFlag_1_0= 'deleteByFlag' )
                    // InternalDTO.g:783:6: lv_deleteByFlag_1_0= 'deleteByFlag'
                    {
                    lv_deleteByFlag_1_0=(Token)match(input,30,FOLLOW_2); 

                    						newLeafNode(lv_deleteByFlag_1_0, grammarAccess.getEntityOptionAccess().getDeleteByFlagDeleteByFlagKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityOptionRule());
                    						}
                    						setWithLastConsumed(current, "deleteByFlag", true, "deleteByFlag");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDTO.g:797:3: ( () otherlv_3= 'inheritance' otherlv_4= '=' ( (lv_inheritanceMapping_5_0= ruleInheritanceMappingType ) ) )
                    {
                    // InternalDTO.g:797:3: ( () otherlv_3= 'inheritance' otherlv_4= '=' ( (lv_inheritanceMapping_5_0= ruleInheritanceMappingType ) ) )
                    // InternalDTO.g:798:4: () otherlv_3= 'inheritance' otherlv_4= '=' ( (lv_inheritanceMapping_5_0= ruleInheritanceMappingType ) )
                    {
                    // InternalDTO.g:798:4: ()
                    // InternalDTO.g:799:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEntityOptionAccess().getInheritanceMappingOptionAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,31,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getEntityOptionAccess().getInheritanceKeyword_1_1());
                    			
                    otherlv_4=(Token)match(input,32,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getEntityOptionAccess().getEqualsSignKeyword_1_2());
                    			
                    // InternalDTO.g:813:4: ( (lv_inheritanceMapping_5_0= ruleInheritanceMappingType ) )
                    // InternalDTO.g:814:5: (lv_inheritanceMapping_5_0= ruleInheritanceMappingType )
                    {
                    // InternalDTO.g:814:5: (lv_inheritanceMapping_5_0= ruleInheritanceMappingType )
                    // InternalDTO.g:815:6: lv_inheritanceMapping_5_0= ruleInheritanceMappingType
                    {

                    						newCompositeNode(grammarAccess.getEntityOptionAccess().getInheritanceMappingInheritanceMappingTypeParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_inheritanceMapping_5_0=ruleInheritanceMappingType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntityOptionRule());
                    						}
                    						set(
                    							current,
                    							"inheritanceMapping",
                    							lv_inheritanceMapping_5_0,
                    							"com.stefanvuckovic.domainmodel.DomainModel.InheritanceMappingType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityOption"


    // $ANTLR start "entryRuleInheritanceMappingType"
    // InternalDTO.g:837:1: entryRuleInheritanceMappingType returns [EObject current=null] : iv_ruleInheritanceMappingType= ruleInheritanceMappingType EOF ;
    public final EObject entryRuleInheritanceMappingType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInheritanceMappingType = null;


        try {
            // InternalDTO.g:837:63: (iv_ruleInheritanceMappingType= ruleInheritanceMappingType EOF )
            // InternalDTO.g:838:2: iv_ruleInheritanceMappingType= ruleInheritanceMappingType EOF
            {
             newCompositeNode(grammarAccess.getInheritanceMappingTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInheritanceMappingType=ruleInheritanceMappingType();

            state._fsp--;

             current =iv_ruleInheritanceMappingType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInheritanceMappingType"


    // $ANTLR start "ruleInheritanceMappingType"
    // InternalDTO.g:844:1: ruleInheritanceMappingType returns [EObject current=null] : ( ( (lv_type_0_1= 'SINGLE_TABLE' | lv_type_0_2= 'TABLE_PER_CONCRETE_CLASS' | lv_type_0_3= 'TABLE_PER_CLASS' ) ) ) ;
    public final EObject ruleInheritanceMappingType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;


        	enterRule();

        try {
            // InternalDTO.g:850:2: ( ( ( (lv_type_0_1= 'SINGLE_TABLE' | lv_type_0_2= 'TABLE_PER_CONCRETE_CLASS' | lv_type_0_3= 'TABLE_PER_CLASS' ) ) ) )
            // InternalDTO.g:851:2: ( ( (lv_type_0_1= 'SINGLE_TABLE' | lv_type_0_2= 'TABLE_PER_CONCRETE_CLASS' | lv_type_0_3= 'TABLE_PER_CLASS' ) ) )
            {
            // InternalDTO.g:851:2: ( ( (lv_type_0_1= 'SINGLE_TABLE' | lv_type_0_2= 'TABLE_PER_CONCRETE_CLASS' | lv_type_0_3= 'TABLE_PER_CLASS' ) ) )
            // InternalDTO.g:852:3: ( (lv_type_0_1= 'SINGLE_TABLE' | lv_type_0_2= 'TABLE_PER_CONCRETE_CLASS' | lv_type_0_3= 'TABLE_PER_CLASS' ) )
            {
            // InternalDTO.g:852:3: ( (lv_type_0_1= 'SINGLE_TABLE' | lv_type_0_2= 'TABLE_PER_CONCRETE_CLASS' | lv_type_0_3= 'TABLE_PER_CLASS' ) )
            // InternalDTO.g:853:4: (lv_type_0_1= 'SINGLE_TABLE' | lv_type_0_2= 'TABLE_PER_CONCRETE_CLASS' | lv_type_0_3= 'TABLE_PER_CLASS' )
            {
            // InternalDTO.g:853:4: (lv_type_0_1= 'SINGLE_TABLE' | lv_type_0_2= 'TABLE_PER_CONCRETE_CLASS' | lv_type_0_3= 'TABLE_PER_CLASS' )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt13=1;
                }
                break;
            case 34:
                {
                alt13=2;
                }
                break;
            case 35:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalDTO.g:854:5: lv_type_0_1= 'SINGLE_TABLE'
                    {
                    lv_type_0_1=(Token)match(input,33,FOLLOW_2); 

                    					newLeafNode(lv_type_0_1, grammarAccess.getInheritanceMappingTypeAccess().getTypeSINGLE_TABLEKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInheritanceMappingTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalDTO.g:865:5: lv_type_0_2= 'TABLE_PER_CONCRETE_CLASS'
                    {
                    lv_type_0_2=(Token)match(input,34,FOLLOW_2); 

                    					newLeafNode(lv_type_0_2, grammarAccess.getInheritanceMappingTypeAccess().getTypeTABLE_PER_CONCRETE_CLASSKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInheritanceMappingTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalDTO.g:876:5: lv_type_0_3= 'TABLE_PER_CLASS'
                    {
                    lv_type_0_3=(Token)match(input,35,FOLLOW_2); 

                    					newLeafNode(lv_type_0_3, grammarAccess.getInheritanceMappingTypeAccess().getTypeTABLE_PER_CLASSKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInheritanceMappingTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_3, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInheritanceMappingType"


    // $ANTLR start "entryRuleAttribute"
    // InternalDTO.g:892:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalDTO.g:892:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalDTO.g:893:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalDTO.g:899:1: ruleAttribute returns [EObject current=null] : ( ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_options_2_0= ruleAttributeOption ) ) (otherlv_3= ',' ( (lv_options_4_0= ruleAttributeOption ) ) )* )? otherlv_5= ';' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_type_0_0 = null;

        EObject lv_options_2_0 = null;

        EObject lv_options_4_0 = null;



        	enterRule();

        try {
            // InternalDTO.g:905:2: ( ( ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_options_2_0= ruleAttributeOption ) ) (otherlv_3= ',' ( (lv_options_4_0= ruleAttributeOption ) ) )* )? otherlv_5= ';' ) )
            // InternalDTO.g:906:2: ( ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_options_2_0= ruleAttributeOption ) ) (otherlv_3= ',' ( (lv_options_4_0= ruleAttributeOption ) ) )* )? otherlv_5= ';' )
            {
            // InternalDTO.g:906:2: ( ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_options_2_0= ruleAttributeOption ) ) (otherlv_3= ',' ( (lv_options_4_0= ruleAttributeOption ) ) )* )? otherlv_5= ';' )
            // InternalDTO.g:907:3: ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_options_2_0= ruleAttributeOption ) ) (otherlv_3= ',' ( (lv_options_4_0= ruleAttributeOption ) ) )* )? otherlv_5= ';'
            {
            // InternalDTO.g:907:3: ( (lv_type_0_0= ruleAttributeType ) )
            // InternalDTO.g:908:4: (lv_type_0_0= ruleAttributeType )
            {
            // InternalDTO.g:908:4: (lv_type_0_0= ruleAttributeType )
            // InternalDTO.g:909:5: lv_type_0_0= ruleAttributeType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeAttributeTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_type_0_0=ruleAttributeType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"com.stefanvuckovic.domainmodel.DomainModel.AttributeType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDTO.g:926:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDTO.g:927:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDTO.g:927:4: (lv_name_1_0= RULE_ID )
            // InternalDTO.g:928:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDTO.g:944:3: ( ( (lv_options_2_0= ruleAttributeOption ) ) (otherlv_3= ',' ( (lv_options_4_0= ruleAttributeOption ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==15) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDTO.g:945:4: ( (lv_options_2_0= ruleAttributeOption ) ) (otherlv_3= ',' ( (lv_options_4_0= ruleAttributeOption ) ) )*
                    {
                    // InternalDTO.g:945:4: ( (lv_options_2_0= ruleAttributeOption ) )
                    // InternalDTO.g:946:5: (lv_options_2_0= ruleAttributeOption )
                    {
                    // InternalDTO.g:946:5: (lv_options_2_0= ruleAttributeOption )
                    // InternalDTO.g:947:6: lv_options_2_0= ruleAttributeOption
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getOptionsAttributeOptionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_options_2_0=ruleAttributeOption();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						add(
                    							current,
                    							"options",
                    							lv_options_2_0,
                    							"com.stefanvuckovic.dto.DTO.AttributeOption");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDTO.g:964:4: (otherlv_3= ',' ( (lv_options_4_0= ruleAttributeOption ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==23) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalDTO.g:965:5: otherlv_3= ',' ( (lv_options_4_0= ruleAttributeOption ) )
                    	    {
                    	    otherlv_3=(Token)match(input,23,FOLLOW_19); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalDTO.g:969:5: ( (lv_options_4_0= ruleAttributeOption ) )
                    	    // InternalDTO.g:970:6: (lv_options_4_0= ruleAttributeOption )
                    	    {
                    	    // InternalDTO.g:970:6: (lv_options_4_0= ruleAttributeOption )
                    	    // InternalDTO.g:971:7: lv_options_4_0= ruleAttributeOption
                    	    {

                    	    							newCompositeNode(grammarAccess.getAttributeAccess().getOptionsAttributeOptionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_options_4_0=ruleAttributeOption();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAttributeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"options",
                    	    								lv_options_4_0,
                    	    								"com.stefanvuckovic.dto.DTO.AttributeOption");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleAttributeType"
    // InternalDTO.g:998:1: entryRuleAttributeType returns [EObject current=null] : iv_ruleAttributeType= ruleAttributeType EOF ;
    public final EObject entryRuleAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeType = null;


        try {
            // InternalDTO.g:998:54: (iv_ruleAttributeType= ruleAttributeType EOF )
            // InternalDTO.g:999:2: iv_ruleAttributeType= ruleAttributeType EOF
            {
             newCompositeNode(grammarAccess.getAttributeTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeType=ruleAttributeType();

            state._fsp--;

             current =iv_ruleAttributeType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeType"


    // $ANTLR start "ruleAttributeType"
    // InternalDTO.g:1005:1: ruleAttributeType returns [EObject current=null] : (this_SingleType_0= ruleSingleType | this_CollectionType_1= ruleCollectionType ) ;
    public final EObject ruleAttributeType() throws RecognitionException {
        EObject current = null;

        EObject this_SingleType_0 = null;

        EObject this_CollectionType_1 = null;



        	enterRule();

        try {
            // InternalDTO.g:1011:2: ( (this_SingleType_0= ruleSingleType | this_CollectionType_1= ruleCollectionType ) )
            // InternalDTO.g:1012:2: (this_SingleType_0= ruleSingleType | this_CollectionType_1= ruleCollectionType )
            {
            // InternalDTO.g:1012:2: (this_SingleType_0= ruleSingleType | this_CollectionType_1= ruleCollectionType )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID||(LA16_0>=16 && LA16_0<=20)||(LA16_0>=37 && LA16_0<=41)) ) {
                alt16=1;
            }
            else if ( (LA16_0==42) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalDTO.g:1013:3: this_SingleType_0= ruleSingleType
                    {

                    			newCompositeNode(grammarAccess.getAttributeTypeAccess().getSingleTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SingleType_0=ruleSingleType();

                    state._fsp--;


                    			current = this_SingleType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDTO.g:1022:3: this_CollectionType_1= ruleCollectionType
                    {

                    			newCompositeNode(grammarAccess.getAttributeTypeAccess().getCollectionTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CollectionType_1=ruleCollectionType();

                    state._fsp--;


                    			current = this_CollectionType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeType"


    // $ANTLR start "entryRuleSingleType"
    // InternalDTO.g:1034:1: entryRuleSingleType returns [EObject current=null] : iv_ruleSingleType= ruleSingleType EOF ;
    public final EObject entryRuleSingleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleType = null;


        try {
            // InternalDTO.g:1034:51: (iv_ruleSingleType= ruleSingleType EOF )
            // InternalDTO.g:1035:2: iv_ruleSingleType= ruleSingleType EOF
            {
             newCompositeNode(grammarAccess.getSingleTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleType=ruleSingleType();

            state._fsp--;

             current =iv_ruleSingleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSingleType"


    // $ANTLR start "ruleSingleType"
    // InternalDTO.g:1041:1: ruleSingleType returns [EObject current=null] : (this_BasicType_0= ruleBasicType | this_RefType_1= ruleRefType ) ;
    public final EObject ruleSingleType() throws RecognitionException {
        EObject current = null;

        EObject this_BasicType_0 = null;

        EObject this_RefType_1 = null;



        	enterRule();

        try {
            // InternalDTO.g:1047:2: ( (this_BasicType_0= ruleBasicType | this_RefType_1= ruleRefType ) )
            // InternalDTO.g:1048:2: (this_BasicType_0= ruleBasicType | this_RefType_1= ruleRefType )
            {
            // InternalDTO.g:1048:2: (this_BasicType_0= ruleBasicType | this_RefType_1= ruleRefType )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=16 && LA17_0<=20)||(LA17_0>=37 && LA17_0<=41)) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_ID) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalDTO.g:1049:3: this_BasicType_0= ruleBasicType
                    {

                    			newCompositeNode(grammarAccess.getSingleTypeAccess().getBasicTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BasicType_0=ruleBasicType();

                    state._fsp--;


                    			current = this_BasicType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDTO.g:1058:3: this_RefType_1= ruleRefType
                    {

                    			newCompositeNode(grammarAccess.getSingleTypeAccess().getRefTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RefType_1=ruleRefType();

                    state._fsp--;


                    			current = this_RefType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleType"


    // $ANTLR start "entrySuperBasicType"
    // InternalDTO.g:1070:1: entrySuperBasicType returns [EObject current=null] : iv_superBasicType= superBasicType EOF ;
    public final EObject entrySuperBasicType() throws RecognitionException {
        EObject current = null;

        EObject iv_superBasicType = null;


        try {
            // InternalDTO.g:1070:51: (iv_superBasicType= superBasicType EOF )
            // InternalDTO.g:1071:2: iv_superBasicType= superBasicType EOF
            {
             newCompositeNode(grammarAccess.getDomainModelBasicTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_superBasicType=superBasicType();

            state._fsp--;

             current =iv_superBasicType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entrySuperBasicType"


    // $ANTLR start "superBasicType"
    // InternalDTO.g:1077:1: superBasicType returns [EObject current=null] : ( ( () otherlv_1= 'string' ) | ( () otherlv_3= 'int' ) | ( () otherlv_5= 'long' ) | ( () otherlv_7= 'boolean' ) | ( () otherlv_9= 'date' ) ) ;
    public final EObject superBasicType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalDTO.g:1083:2: ( ( ( () otherlv_1= 'string' ) | ( () otherlv_3= 'int' ) | ( () otherlv_5= 'long' ) | ( () otherlv_7= 'boolean' ) | ( () otherlv_9= 'date' ) ) )
            // InternalDTO.g:1084:2: ( ( () otherlv_1= 'string' ) | ( () otherlv_3= 'int' ) | ( () otherlv_5= 'long' ) | ( () otherlv_7= 'boolean' ) | ( () otherlv_9= 'date' ) )
            {
            // InternalDTO.g:1084:2: ( ( () otherlv_1= 'string' ) | ( () otherlv_3= 'int' ) | ( () otherlv_5= 'long' ) | ( () otherlv_7= 'boolean' ) | ( () otherlv_9= 'date' ) )
            int alt18=5;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt18=1;
                }
                break;
            case 38:
                {
                alt18=2;
                }
                break;
            case 39:
                {
                alt18=3;
                }
                break;
            case 40:
                {
                alt18=4;
                }
                break;
            case 41:
                {
                alt18=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalDTO.g:1085:3: ( () otherlv_1= 'string' )
                    {
                    // InternalDTO.g:1085:3: ( () otherlv_1= 'string' )
                    // InternalDTO.g:1086:4: () otherlv_1= 'string'
                    {
                    // InternalDTO.g:1086:4: ()
                    // InternalDTO.g:1087:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDomainModelBasicTypeAccess().getStringTypeAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,37,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getDomainModelBasicTypeAccess().getStringKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDTO.g:1099:3: ( () otherlv_3= 'int' )
                    {
                    // InternalDTO.g:1099:3: ( () otherlv_3= 'int' )
                    // InternalDTO.g:1100:4: () otherlv_3= 'int'
                    {
                    // InternalDTO.g:1100:4: ()
                    // InternalDTO.g:1101:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDomainModelBasicTypeAccess().getIntTypeAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,38,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getDomainModelBasicTypeAccess().getIntKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDTO.g:1113:3: ( () otherlv_5= 'long' )
                    {
                    // InternalDTO.g:1113:3: ( () otherlv_5= 'long' )
                    // InternalDTO.g:1114:4: () otherlv_5= 'long'
                    {
                    // InternalDTO.g:1114:4: ()
                    // InternalDTO.g:1115:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDomainModelBasicTypeAccess().getLongTypeAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,39,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getDomainModelBasicTypeAccess().getLongKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDTO.g:1127:3: ( () otherlv_7= 'boolean' )
                    {
                    // InternalDTO.g:1127:3: ( () otherlv_7= 'boolean' )
                    // InternalDTO.g:1128:4: () otherlv_7= 'boolean'
                    {
                    // InternalDTO.g:1128:4: ()
                    // InternalDTO.g:1129:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDomainModelBasicTypeAccess().getBoolTypeAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,40,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getDomainModelBasicTypeAccess().getBooleanKeyword_3_1());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDTO.g:1141:3: ( () otherlv_9= 'date' )
                    {
                    // InternalDTO.g:1141:3: ( () otherlv_9= 'date' )
                    // InternalDTO.g:1142:4: () otherlv_9= 'date'
                    {
                    // InternalDTO.g:1142:4: ()
                    // InternalDTO.g:1143:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDomainModelBasicTypeAccess().getDateTypeAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_9=(Token)match(input,41,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getDomainModelBasicTypeAccess().getDateKeyword_4_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "superBasicType"


    // $ANTLR start "entryRuleRefType"
    // InternalDTO.g:1158:1: entryRuleRefType returns [EObject current=null] : iv_ruleRefType= ruleRefType EOF ;
    public final EObject entryRuleRefType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefType = null;


        try {
            // InternalDTO.g:1158:48: (iv_ruleRefType= ruleRefType EOF )
            // InternalDTO.g:1159:2: iv_ruleRefType= ruleRefType EOF
            {
             newCompositeNode(grammarAccess.getRefTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRefType=ruleRefType();

            state._fsp--;

             current =iv_ruleRefType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRefType"


    // $ANTLR start "ruleRefType"
    // InternalDTO.g:1165:1: ruleRefType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleRefType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalDTO.g:1171:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalDTO.g:1172:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalDTO.g:1172:2: ( (otherlv_0= RULE_ID ) )
            // InternalDTO.g:1173:3: (otherlv_0= RULE_ID )
            {
            // InternalDTO.g:1173:3: (otherlv_0= RULE_ID )
            // InternalDTO.g:1174:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getRefTypeRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getRefTypeAccess().getReferenceConceptCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRefType"


    // $ANTLR start "entryRuleCollectionType"
    // InternalDTO.g:1188:1: entryRuleCollectionType returns [EObject current=null] : iv_ruleCollectionType= ruleCollectionType EOF ;
    public final EObject entryRuleCollectionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionType = null;


        try {
            // InternalDTO.g:1188:55: (iv_ruleCollectionType= ruleCollectionType EOF )
            // InternalDTO.g:1189:2: iv_ruleCollectionType= ruleCollectionType EOF
            {
             newCompositeNode(grammarAccess.getCollectionTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCollectionType=ruleCollectionType();

            state._fsp--;

             current =iv_ruleCollectionType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollectionType"


    // $ANTLR start "ruleCollectionType"
    // InternalDTO.g:1195:1: ruleCollectionType returns [EObject current=null] : (otherlv_0= 'List' otherlv_1= '<' ( (lv_ofType_2_0= ruleSingleType ) ) otherlv_3= '>' ) ;
    public final EObject ruleCollectionType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ofType_2_0 = null;



        	enterRule();

        try {
            // InternalDTO.g:1201:2: ( (otherlv_0= 'List' otherlv_1= '<' ( (lv_ofType_2_0= ruleSingleType ) ) otherlv_3= '>' ) )
            // InternalDTO.g:1202:2: (otherlv_0= 'List' otherlv_1= '<' ( (lv_ofType_2_0= ruleSingleType ) ) otherlv_3= '>' )
            {
            // InternalDTO.g:1202:2: (otherlv_0= 'List' otherlv_1= '<' ( (lv_ofType_2_0= ruleSingleType ) ) otherlv_3= '>' )
            // InternalDTO.g:1203:3: otherlv_0= 'List' otherlv_1= '<' ( (lv_ofType_2_0= ruleSingleType ) ) otherlv_3= '>'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getCollectionTypeAccess().getListKeyword_0());
            		
            otherlv_1=(Token)match(input,43,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getCollectionTypeAccess().getLessThanSignKeyword_1());
            		
            // InternalDTO.g:1211:3: ( (lv_ofType_2_0= ruleSingleType ) )
            // InternalDTO.g:1212:4: (lv_ofType_2_0= ruleSingleType )
            {
            // InternalDTO.g:1212:4: (lv_ofType_2_0= ruleSingleType )
            // InternalDTO.g:1213:5: lv_ofType_2_0= ruleSingleType
            {

            					newCompositeNode(grammarAccess.getCollectionTypeAccess().getOfTypeSingleTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
            lv_ofType_2_0=ruleSingleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCollectionTypeRule());
            					}
            					set(
            						current,
            						"ofType",
            						lv_ofType_2_0,
            						"com.stefanvuckovic.domainmodel.DomainModel.SingleType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,44,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getCollectionTypeAccess().getGreaterThanSignKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollectionType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000200802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000007E0001F4010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000007E0001F0010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000002C000060L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000E00000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001000008000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000003E0001F0010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000100000000000L});

}
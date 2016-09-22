package com.stefanvuckovic.uidsl.parser.antlr.internal;

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
import com.stefanvuckovic.uidsl.services.UIDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUIDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'server_component'", "'{'", "'}'", "';'", "'('", "','", "')'", "'page'", "'template'", "'fragment'", "'.'", "'class'", "'extends'", "'text'", "'email'", "'password'", "'file'", "'image'", "'enum'", "'L'", "'true'", "'false'", "'/'", "'null'", "'deleteByFlag'", "'inheritance'", "'='", "'SINGLE_TABLE'", "'TABLE_PER_CONCRETE_CLASS'", "'TABLE_PER_CLASS'", "'string'", "'int'", "'long'", "'boolean'", "'date'", "'List'", "'<'", "'>'", "'required'", "'partOf'", "'relationshipOwner'", "'reverse_cardinality'", "'one'", "'many'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
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
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalUIDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalUIDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalUIDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalUIDSL.g"; }



     	private UIDSLGrammarAccess grammarAccess;

        public InternalUIDSLParser(TokenStream input, UIDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "UIModel";
       	}

       	@Override
       	protected UIDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleUIModel"
    // InternalUIDSL.g:65:1: entryRuleUIModel returns [EObject current=null] : iv_ruleUIModel= ruleUIModel EOF ;
    public final EObject entryRuleUIModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIModel = null;


        try {
            // InternalUIDSL.g:65:48: (iv_ruleUIModel= ruleUIModel EOF )
            // InternalUIDSL.g:66:2: iv_ruleUIModel= ruleUIModel EOF
            {
             newCompositeNode(grammarAccess.getUIModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUIModel=ruleUIModel();

            state._fsp--;

             current =iv_ruleUIModel; 
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
    // $ANTLR end "entryRuleUIModel"


    // $ANTLR start "ruleUIModel"
    // InternalUIDSL.g:72:1: ruleUIModel returns [EObject current=null] : ( (lv_concepts_0_0= ruleUIConcept ) )* ;
    public final EObject ruleUIModel() throws RecognitionException {
        EObject current = null;

        EObject lv_concepts_0_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:78:2: ( ( (lv_concepts_0_0= ruleUIConcept ) )* )
            // InternalUIDSL.g:79:2: ( (lv_concepts_0_0= ruleUIConcept ) )*
            {
            // InternalUIDSL.g:79:2: ( (lv_concepts_0_0= ruleUIConcept ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||(LA1_0>=18 && LA1_0<=20)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUIDSL.g:80:3: (lv_concepts_0_0= ruleUIConcept )
            	    {
            	    // InternalUIDSL.g:80:3: (lv_concepts_0_0= ruleUIConcept )
            	    // InternalUIDSL.g:81:4: lv_concepts_0_0= ruleUIConcept
            	    {

            	    				newCompositeNode(grammarAccess.getUIModelAccess().getConceptsUIConceptParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_concepts_0_0=ruleUIConcept();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getUIModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"concepts",
            	    					lv_concepts_0_0,
            	    					"com.stefanvuckovic.uidsl.UIDSL.UIConcept");
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
    // $ANTLR end "ruleUIModel"


    // $ANTLR start "entryRuleUIConcept"
    // InternalUIDSL.g:101:1: entryRuleUIConcept returns [EObject current=null] : iv_ruleUIConcept= ruleUIConcept EOF ;
    public final EObject entryRuleUIConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIConcept = null;


        try {
            // InternalUIDSL.g:101:50: (iv_ruleUIConcept= ruleUIConcept EOF )
            // InternalUIDSL.g:102:2: iv_ruleUIConcept= ruleUIConcept EOF
            {
             newCompositeNode(grammarAccess.getUIConceptRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUIConcept=ruleUIConcept();

            state._fsp--;

             current =iv_ruleUIConcept; 
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
    // $ANTLR end "entryRuleUIConcept"


    // $ANTLR start "ruleUIConcept"
    // InternalUIDSL.g:108:1: ruleUIConcept returns [EObject current=null] : (this_ServerComponent_0= ruleServerComponent | this_UIContainer_1= ruleUIContainer ) ;
    public final EObject ruleUIConcept() throws RecognitionException {
        EObject current = null;

        EObject this_ServerComponent_0 = null;

        EObject this_UIContainer_1 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:114:2: ( (this_ServerComponent_0= ruleServerComponent | this_UIContainer_1= ruleUIContainer ) )
            // InternalUIDSL.g:115:2: (this_ServerComponent_0= ruleServerComponent | this_UIContainer_1= ruleUIContainer )
            {
            // InternalUIDSL.g:115:2: (this_ServerComponent_0= ruleServerComponent | this_UIContainer_1= ruleUIContainer )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=18 && LA2_0<=20)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalUIDSL.g:116:3: this_ServerComponent_0= ruleServerComponent
                    {

                    			newCompositeNode(grammarAccess.getUIConceptAccess().getServerComponentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ServerComponent_0=ruleServerComponent();

                    state._fsp--;


                    			current = this_ServerComponent_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUIDSL.g:125:3: this_UIContainer_1= ruleUIContainer
                    {

                    			newCompositeNode(grammarAccess.getUIConceptAccess().getUIContainerParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_UIContainer_1=ruleUIContainer();

                    state._fsp--;


                    			current = this_UIContainer_1;
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
    // $ANTLR end "ruleUIConcept"


    // $ANTLR start "entryRuleConcept"
    // InternalUIDSL.g:137:1: entryRuleConcept returns [EObject current=null] : iv_ruleConcept= ruleConcept EOF ;
    public final EObject entryRuleConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcept = null;


        try {
            // InternalUIDSL.g:137:48: (iv_ruleConcept= ruleConcept EOF )
            // InternalUIDSL.g:138:2: iv_ruleConcept= ruleConcept EOF
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
    // InternalUIDSL.g:144:1: ruleConcept returns [EObject current=null] : (this_Concept_0= superConcept | this_ServerComponent_1= ruleServerComponent ) ;
    public final EObject ruleConcept() throws RecognitionException {
        EObject current = null;

        EObject this_Concept_0 = null;

        EObject this_ServerComponent_1 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:150:2: ( (this_Concept_0= superConcept | this_ServerComponent_1= ruleServerComponent ) )
            // InternalUIDSL.g:151:2: (this_Concept_0= superConcept | this_ServerComponent_1= ruleServerComponent )
            {
            // InternalUIDSL.g:151:2: (this_Concept_0= superConcept | this_ServerComponent_1= ruleServerComponent )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22||LA3_0==29) ) {
                alt3=1;
            }
            else if ( (LA3_0==11) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalUIDSL.g:152:3: this_Concept_0= superConcept
                    {

                    			newCompositeNode(grammarAccess.getConceptAccess().getConceptParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Concept_0=superConcept();

                    state._fsp--;


                    			current = this_Concept_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUIDSL.g:161:3: this_ServerComponent_1= ruleServerComponent
                    {

                    			newCompositeNode(grammarAccess.getConceptAccess().getServerComponentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ServerComponent_1=ruleServerComponent();

                    state._fsp--;


                    			current = this_ServerComponent_1;
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


    // $ANTLR start "entryRuleServerComponent"
    // InternalUIDSL.g:173:1: entryRuleServerComponent returns [EObject current=null] : iv_ruleServerComponent= ruleServerComponent EOF ;
    public final EObject entryRuleServerComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServerComponent = null;


        try {
            // InternalUIDSL.g:173:56: (iv_ruleServerComponent= ruleServerComponent EOF )
            // InternalUIDSL.g:174:2: iv_ruleServerComponent= ruleServerComponent EOF
            {
             newCompositeNode(grammarAccess.getServerComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServerComponent=ruleServerComponent();

            state._fsp--;

             current =iv_ruleServerComponent; 
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
    // $ANTLR end "entryRuleServerComponent"


    // $ANTLR start "ruleServerComponent"
    // InternalUIDSL.g:180:1: ruleServerComponent returns [EObject current=null] : (otherlv_0= 'server_component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleMember ) )* ( (lv_expressions_4_0= ruleExpression ) )* otherlv_5= '}' ) ;
    public final EObject ruleServerComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_members_3_0 = null;

        EObject lv_expressions_4_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:186:2: ( (otherlv_0= 'server_component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleMember ) )* ( (lv_expressions_4_0= ruleExpression ) )* otherlv_5= '}' ) )
            // InternalUIDSL.g:187:2: (otherlv_0= 'server_component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleMember ) )* ( (lv_expressions_4_0= ruleExpression ) )* otherlv_5= '}' )
            {
            // InternalUIDSL.g:187:2: (otherlv_0= 'server_component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleMember ) )* ( (lv_expressions_4_0= ruleExpression ) )* otherlv_5= '}' )
            // InternalUIDSL.g:188:3: otherlv_0= 'server_component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleMember ) )* ( (lv_expressions_4_0= ruleExpression ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getServerComponentAccess().getServer_componentKeyword_0());
            		
            // InternalUIDSL.g:192:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUIDSL.g:193:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUIDSL.g:193:4: (lv_name_1_0= RULE_ID )
            // InternalUIDSL.g:194:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getServerComponentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServerComponentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getServerComponentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUIDSL.g:214:3: ( (lv_members_3_0= ruleMember ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    int LA4_2 = input.LA(2);

                    if ( (LA4_2==RULE_ID) ) {
                        int LA4_4 = input.LA(3);

                        if ( ((LA4_4>=14 && LA4_4<=15)) ) {
                            alt4=1;
                        }


                    }


                }
                else if ( ((LA4_0>=24 && LA4_0<=28)||(LA4_0>=41 && LA4_0<=46)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalUIDSL.g:215:4: (lv_members_3_0= ruleMember )
            	    {
            	    // InternalUIDSL.g:215:4: (lv_members_3_0= ruleMember )
            	    // InternalUIDSL.g:216:5: lv_members_3_0= ruleMember
            	    {

            	    					newCompositeNode(grammarAccess.getServerComponentAccess().getMembersMemberParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_members_3_0=ruleMember();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getServerComponentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"members",
            	    						lv_members_3_0,
            	    						"com.stefanvuckovic.uidsl.UIDSL.Member");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalUIDSL.g:233:3: ( (lv_expressions_4_0= ruleExpression ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_STRING)||(LA5_0>=31 && LA5_0<=32)||LA5_0==34) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalUIDSL.g:234:4: (lv_expressions_4_0= ruleExpression )
            	    {
            	    // InternalUIDSL.g:234:4: (lv_expressions_4_0= ruleExpression )
            	    // InternalUIDSL.g:235:5: lv_expressions_4_0= ruleExpression
            	    {

            	    					newCompositeNode(grammarAccess.getServerComponentAccess().getExpressionsExpressionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_expressions_4_0=ruleExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getServerComponentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"expressions",
            	    						lv_expressions_4_0,
            	    						"com.stefanvuckovic.uidsl.UIDSL.Expression");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getServerComponentAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleServerComponent"


    // $ANTLR start "entryRuleMember"
    // InternalUIDSL.g:260:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // InternalUIDSL.g:260:47: (iv_ruleMember= ruleMember EOF )
            // InternalUIDSL.g:261:2: iv_ruleMember= ruleMember EOF
            {
             newCompositeNode(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMember=ruleMember();

            state._fsp--;

             current =iv_ruleMember; 
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
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // InternalUIDSL.g:267:1: ruleMember returns [EObject current=null] : (this_Field_0= ruleField | this_Method_1= ruleMethod ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        EObject this_Field_0 = null;

        EObject this_Method_1 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:273:2: ( (this_Field_0= ruleField | this_Method_1= ruleMethod ) )
            // InternalUIDSL.g:274:2: (this_Field_0= ruleField | this_Method_1= ruleMethod )
            {
            // InternalUIDSL.g:274:2: (this_Field_0= ruleField | this_Method_1= ruleMethod )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalUIDSL.g:275:3: this_Field_0= ruleField
                    {

                    			newCompositeNode(grammarAccess.getMemberAccess().getFieldParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Field_0=ruleField();

                    state._fsp--;


                    			current = this_Field_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUIDSL.g:284:3: this_Method_1= ruleMethod
                    {

                    			newCompositeNode(grammarAccess.getMemberAccess().getMethodParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Method_1=ruleMethod();

                    state._fsp--;


                    			current = this_Method_1;
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
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleField"
    // InternalUIDSL.g:296:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalUIDSL.g:296:46: (iv_ruleField= ruleField EOF )
            // InternalUIDSL.g:297:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalUIDSL.g:303:1: ruleField returns [EObject current=null] : (this_TypedConcept_0= ruleTypedConcept[$current] otherlv_1= ';' ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_TypedConcept_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:309:2: ( (this_TypedConcept_0= ruleTypedConcept[$current] otherlv_1= ';' ) )
            // InternalUIDSL.g:310:2: (this_TypedConcept_0= ruleTypedConcept[$current] otherlv_1= ';' )
            {
            // InternalUIDSL.g:310:2: (this_TypedConcept_0= ruleTypedConcept[$current] otherlv_1= ';' )
            // InternalUIDSL.g:311:3: this_TypedConcept_0= ruleTypedConcept[$current] otherlv_1= ';'
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getFieldRule());
            			}
            			newCompositeNode(grammarAccess.getFieldAccess().getTypedConceptParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_TypedConcept_0=ruleTypedConcept(current);

            state._fsp--;


            			current = this_TypedConcept_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getSemicolonKeyword_1());
            		

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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleMethod"
    // InternalUIDSL.g:330:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalUIDSL.g:330:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalUIDSL.g:331:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalUIDSL.g:337:1: ruleMethod returns [EObject current=null] : (this_TypedConcept_0= ruleTypedConcept[$current] otherlv_1= '(' ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) )* otherlv_5= ')' otherlv_6= ';' ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject this_TypedConcept_0 = null;

        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:343:2: ( (this_TypedConcept_0= ruleTypedConcept[$current] otherlv_1= '(' ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) )* otherlv_5= ')' otherlv_6= ';' ) )
            // InternalUIDSL.g:344:2: (this_TypedConcept_0= ruleTypedConcept[$current] otherlv_1= '(' ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) )* otherlv_5= ')' otherlv_6= ';' )
            {
            // InternalUIDSL.g:344:2: (this_TypedConcept_0= ruleTypedConcept[$current] otherlv_1= '(' ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) )* otherlv_5= ')' otherlv_6= ';' )
            // InternalUIDSL.g:345:3: this_TypedConcept_0= ruleTypedConcept[$current] otherlv_1= '(' ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) )* otherlv_5= ')' otherlv_6= ';'
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getMethodRule());
            			}
            			newCompositeNode(grammarAccess.getMethodAccess().getTypedConceptParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            this_TypedConcept_0=ruleTypedConcept(current);

            state._fsp--;


            			current = this_TypedConcept_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_1());
            		
            // InternalUIDSL.g:360:3: ( (lv_params_2_0= ruleVariable ) )
            // InternalUIDSL.g:361:4: (lv_params_2_0= ruleVariable )
            {
            // InternalUIDSL.g:361:4: (lv_params_2_0= ruleVariable )
            // InternalUIDSL.g:362:5: lv_params_2_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getMethodAccess().getParamsVariableParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_params_2_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMethodRule());
            					}
            					add(
            						current,
            						"params",
            						lv_params_2_0,
            						"com.stefanvuckovic.uidsl.UIDSL.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUIDSL.g:379:3: (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalUIDSL.g:380:4: otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_10); 

            	    				newLeafNode(otherlv_3, grammarAccess.getMethodAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalUIDSL.g:384:4: ( (lv_params_4_0= ruleVariable ) )
            	    // InternalUIDSL.g:385:5: (lv_params_4_0= ruleVariable )
            	    {
            	    // InternalUIDSL.g:385:5: (lv_params_4_0= ruleVariable )
            	    // InternalUIDSL.g:386:6: lv_params_4_0= ruleVariable
            	    {

            	    						newCompositeNode(grammarAccess.getMethodAccess().getParamsVariableParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_params_4_0=ruleVariable();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMethodRule());
            	    						}
            	    						add(
            	    							current,
            	    							"params",
            	    							lv_params_4_0,
            	    							"com.stefanvuckovic.uidsl.UIDSL.Variable");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getMethodAccess().getRightParenthesisKeyword_4());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMethodAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleVariable"
    // InternalUIDSL.g:416:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalUIDSL.g:416:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalUIDSL.g:417:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalUIDSL.g:423:1: ruleVariable returns [EObject current=null] : this_TypedConcept_0= ruleTypedConcept[$current] ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        EObject this_TypedConcept_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:429:2: (this_TypedConcept_0= ruleTypedConcept[$current] )
            // InternalUIDSL.g:430:2: this_TypedConcept_0= ruleTypedConcept[$current]
            {

            		if (current==null) {
            			current = createModelElement(grammarAccess.getVariableRule());
            		}
            		newCompositeNode(grammarAccess.getVariableAccess().getTypedConceptParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_TypedConcept_0=ruleTypedConcept(current);

            state._fsp--;


            		current = this_TypedConcept_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "ruleTypedConcept"
    // InternalUIDSL.g:445:1: ruleTypedConcept[EObject in_current] returns [EObject current=in_current] : ( ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTypedConcept(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:451:2: ( ( ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalUIDSL.g:452:2: ( ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalUIDSL.g:452:2: ( ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalUIDSL.g:453:3: ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalUIDSL.g:453:3: ( (lv_type_0_0= ruleAttributeType ) )
            // InternalUIDSL.g:454:4: (lv_type_0_0= ruleAttributeType )
            {
            // InternalUIDSL.g:454:4: (lv_type_0_0= ruleAttributeType )
            // InternalUIDSL.g:455:5: lv_type_0_0= ruleAttributeType
            {

            					newCompositeNode(grammarAccess.getTypedConceptAccess().getTypeAttributeTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_type_0_0=ruleAttributeType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypedConceptRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"com.stefanvuckovic.domainmodel.DomainModel.AttributeType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUIDSL.g:472:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUIDSL.g:473:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUIDSL.g:473:4: (lv_name_1_0= RULE_ID )
            // InternalUIDSL.g:474:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTypedConceptAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypedConceptRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleTypedConcept"


    // $ANTLR start "entryRuleUIContainer"
    // InternalUIDSL.g:494:1: entryRuleUIContainer returns [EObject current=null] : iv_ruleUIContainer= ruleUIContainer EOF ;
    public final EObject entryRuleUIContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIContainer = null;


        try {
            // InternalUIDSL.g:494:52: (iv_ruleUIContainer= ruleUIContainer EOF )
            // InternalUIDSL.g:495:2: iv_ruleUIContainer= ruleUIContainer EOF
            {
             newCompositeNode(grammarAccess.getUIContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUIContainer=ruleUIContainer();

            state._fsp--;

             current =iv_ruleUIContainer; 
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
    // $ANTLR end "entryRuleUIContainer"


    // $ANTLR start "ruleUIContainer"
    // InternalUIDSL.g:501:1: ruleUIContainer returns [EObject current=null] : (this_Page_0= rulePage | this_Template_1= ruleTemplate | this_Fragment_2= ruleFragment ) ;
    public final EObject ruleUIContainer() throws RecognitionException {
        EObject current = null;

        EObject this_Page_0 = null;

        EObject this_Template_1 = null;

        EObject this_Fragment_2 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:507:2: ( (this_Page_0= rulePage | this_Template_1= ruleTemplate | this_Fragment_2= ruleFragment ) )
            // InternalUIDSL.g:508:2: (this_Page_0= rulePage | this_Template_1= ruleTemplate | this_Fragment_2= ruleFragment )
            {
            // InternalUIDSL.g:508:2: (this_Page_0= rulePage | this_Template_1= ruleTemplate | this_Fragment_2= ruleFragment )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt8=1;
                }
                break;
            case 19:
                {
                alt8=2;
                }
                break;
            case 20:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalUIDSL.g:509:3: this_Page_0= rulePage
                    {

                    			newCompositeNode(grammarAccess.getUIContainerAccess().getPageParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Page_0=rulePage();

                    state._fsp--;


                    			current = this_Page_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUIDSL.g:518:3: this_Template_1= ruleTemplate
                    {

                    			newCompositeNode(grammarAccess.getUIContainerAccess().getTemplateParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Template_1=ruleTemplate();

                    state._fsp--;


                    			current = this_Template_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUIDSL.g:527:3: this_Fragment_2= ruleFragment
                    {

                    			newCompositeNode(grammarAccess.getUIContainerAccess().getFragmentParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Fragment_2=ruleFragment();

                    state._fsp--;


                    			current = this_Fragment_2;
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
    // $ANTLR end "ruleUIContainer"


    // $ANTLR start "entryRulePage"
    // InternalUIDSL.g:539:1: entryRulePage returns [EObject current=null] : iv_rulePage= rulePage EOF ;
    public final EObject entryRulePage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePage = null;


        try {
            // InternalUIDSL.g:539:45: (iv_rulePage= rulePage EOF )
            // InternalUIDSL.g:540:2: iv_rulePage= rulePage EOF
            {
             newCompositeNode(grammarAccess.getPageRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePage=rulePage();

            state._fsp--;

             current =iv_rulePage; 
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
    // $ANTLR end "entryRulePage"


    // $ANTLR start "rulePage"
    // InternalUIDSL.g:546:1: rulePage returns [EObject current=null] : (otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalUIDSL.g:552:2: ( (otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalUIDSL.g:553:2: (otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalUIDSL.g:553:2: (otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalUIDSL.g:554:3: otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPageAccess().getPageKeyword_0());
            		
            // InternalUIDSL.g:558:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUIDSL.g:559:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUIDSL.g:559:4: (lv_name_1_0= RULE_ID )
            // InternalUIDSL.g:560:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPageAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "rulePage"


    // $ANTLR start "entryRuleTemplate"
    // InternalUIDSL.g:580:1: entryRuleTemplate returns [EObject current=null] : iv_ruleTemplate= ruleTemplate EOF ;
    public final EObject entryRuleTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplate = null;


        try {
            // InternalUIDSL.g:580:49: (iv_ruleTemplate= ruleTemplate EOF )
            // InternalUIDSL.g:581:2: iv_ruleTemplate= ruleTemplate EOF
            {
             newCompositeNode(grammarAccess.getTemplateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTemplate=ruleTemplate();

            state._fsp--;

             current =iv_ruleTemplate; 
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
    // $ANTLR end "entryRuleTemplate"


    // $ANTLR start "ruleTemplate"
    // InternalUIDSL.g:587:1: ruleTemplate returns [EObject current=null] : (otherlv_0= 'template' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTemplate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalUIDSL.g:593:2: ( (otherlv_0= 'template' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalUIDSL.g:594:2: (otherlv_0= 'template' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalUIDSL.g:594:2: (otherlv_0= 'template' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalUIDSL.g:595:3: otherlv_0= 'template' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTemplateAccess().getTemplateKeyword_0());
            		
            // InternalUIDSL.g:599:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUIDSL.g:600:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUIDSL.g:600:4: (lv_name_1_0= RULE_ID )
            // InternalUIDSL.g:601:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTemplateAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTemplateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleTemplate"


    // $ANTLR start "entryRuleFragment"
    // InternalUIDSL.g:621:1: entryRuleFragment returns [EObject current=null] : iv_ruleFragment= ruleFragment EOF ;
    public final EObject entryRuleFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFragment = null;


        try {
            // InternalUIDSL.g:621:49: (iv_ruleFragment= ruleFragment EOF )
            // InternalUIDSL.g:622:2: iv_ruleFragment= ruleFragment EOF
            {
             newCompositeNode(grammarAccess.getFragmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFragment=ruleFragment();

            state._fsp--;

             current =iv_ruleFragment; 
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
    // $ANTLR end "entryRuleFragment"


    // $ANTLR start "ruleFragment"
    // InternalUIDSL.g:628:1: ruleFragment returns [EObject current=null] : (otherlv_0= 'fragment' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleFragment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalUIDSL.g:634:2: ( (otherlv_0= 'fragment' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalUIDSL.g:635:2: (otherlv_0= 'fragment' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalUIDSL.g:635:2: (otherlv_0= 'fragment' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalUIDSL.g:636:3: otherlv_0= 'fragment' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFragmentAccess().getFragmentKeyword_0());
            		
            // InternalUIDSL.g:640:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUIDSL.g:641:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUIDSL.g:641:4: (lv_name_1_0= RULE_ID )
            // InternalUIDSL.g:642:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFragmentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFragmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleFragment"


    // $ANTLR start "entryRuleExpression"
    // InternalUIDSL.g:662:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalUIDSL.g:662:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalUIDSL.g:663:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalUIDSL.g:669:1: ruleExpression returns [EObject current=null] : this_MemberSelectionExpression_0= ruleMemberSelectionExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MemberSelectionExpression_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:675:2: (this_MemberSelectionExpression_0= ruleMemberSelectionExpression )
            // InternalUIDSL.g:676:2: this_MemberSelectionExpression_0= ruleMemberSelectionExpression
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getMemberSelectionExpressionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_MemberSelectionExpression_0=ruleMemberSelectionExpression();

            state._fsp--;


            		current = this_MemberSelectionExpression_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleMemberSelectionExpression"
    // InternalUIDSL.g:687:1: entryRuleMemberSelectionExpression returns [EObject current=null] : iv_ruleMemberSelectionExpression= ruleMemberSelectionExpression EOF ;
    public final EObject entryRuleMemberSelectionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemberSelectionExpression = null;


        try {
            // InternalUIDSL.g:687:66: (iv_ruleMemberSelectionExpression= ruleMemberSelectionExpression EOF )
            // InternalUIDSL.g:688:2: iv_ruleMemberSelectionExpression= ruleMemberSelectionExpression EOF
            {
             newCompositeNode(grammarAccess.getMemberSelectionExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMemberSelectionExpression=ruleMemberSelectionExpression();

            state._fsp--;

             current =iv_ruleMemberSelectionExpression; 
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
    // $ANTLR end "entryRuleMemberSelectionExpression"


    // $ANTLR start "ruleMemberSelectionExpression"
    // InternalUIDSL.g:694:1: ruleMemberSelectionExpression returns [EObject current=null] : (this_AtomExpression_0= ruleAtomExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_isMethod_4_0= '(' ) ) ( ( (lv_params_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) ;
    public final EObject ruleMemberSelectionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_isMethod_4_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_AtomExpression_0 = null;

        EObject lv_params_5_0 = null;

        EObject lv_params_7_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:700:2: ( (this_AtomExpression_0= ruleAtomExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_isMethod_4_0= '(' ) ) ( ( (lv_params_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* ) )
            // InternalUIDSL.g:701:2: (this_AtomExpression_0= ruleAtomExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_isMethod_4_0= '(' ) ) ( ( (lv_params_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            {
            // InternalUIDSL.g:701:2: (this_AtomExpression_0= ruleAtomExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_isMethod_4_0= '(' ) ) ( ( (lv_params_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )* )
            // InternalUIDSL.g:702:3: this_AtomExpression_0= ruleAtomExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_isMethod_4_0= '(' ) ) ( ( (lv_params_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            {

            			newCompositeNode(grammarAccess.getMemberSelectionExpressionAccess().getAtomExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_12);
            this_AtomExpression_0=ruleAtomExpression();

            state._fsp--;


            			current = this_AtomExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalUIDSL.g:710:3: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_isMethod_4_0= '(' ) ) ( ( (lv_params_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )? )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalUIDSL.g:711:4: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_isMethod_4_0= '(' ) ) ( ( (lv_params_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    {
            	    // InternalUIDSL.g:711:4: ()
            	    // InternalUIDSL.g:712:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMemberSelectionExpressionAccess().getMemberSelectionExpressionReceiverAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,21,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getMemberSelectionExpressionAccess().getFullStopKeyword_1_1());
            	    			
            	    // InternalUIDSL.g:722:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalUIDSL.g:723:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalUIDSL.g:723:5: (otherlv_3= RULE_ID )
            	    // InternalUIDSL.g:724:6: otherlv_3= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMemberSelectionExpressionRule());
            	    						}
            	    					
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_13); 

            	    						newLeafNode(otherlv_3, grammarAccess.getMemberSelectionExpressionAccess().getMemberSelectionMemberCrossReference_1_2_0());
            	    					

            	    }


            	    }

            	    // InternalUIDSL.g:735:4: ( ( (lv_isMethod_4_0= '(' ) ) ( ( (lv_params_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleExpression ) ) )* )? otherlv_8= ')' )?
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==15) ) {
            	        alt11=1;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // InternalUIDSL.g:736:5: ( (lv_isMethod_4_0= '(' ) ) ( ( (lv_params_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleExpression ) ) )* )? otherlv_8= ')'
            	            {
            	            // InternalUIDSL.g:736:5: ( (lv_isMethod_4_0= '(' ) )
            	            // InternalUIDSL.g:737:6: (lv_isMethod_4_0= '(' )
            	            {
            	            // InternalUIDSL.g:737:6: (lv_isMethod_4_0= '(' )
            	            // InternalUIDSL.g:738:7: lv_isMethod_4_0= '('
            	            {
            	            lv_isMethod_4_0=(Token)match(input,15,FOLLOW_14); 

            	            							newLeafNode(lv_isMethod_4_0, grammarAccess.getMemberSelectionExpressionAccess().getIsMethodLeftParenthesisKeyword_1_3_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMemberSelectionExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "isMethod", true, "(");
            	            						

            	            }


            	            }

            	            // InternalUIDSL.g:750:5: ( ( (lv_params_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleExpression ) ) )* )?
            	            int alt10=2;
            	            int LA10_0 = input.LA(1);

            	            if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_STRING)||(LA10_0>=31 && LA10_0<=32)||LA10_0==34) ) {
            	                alt10=1;
            	            }
            	            switch (alt10) {
            	                case 1 :
            	                    // InternalUIDSL.g:751:6: ( (lv_params_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_params_7_0= ruleExpression ) ) )*
            	                    {
            	                    // InternalUIDSL.g:751:6: ( (lv_params_5_0= ruleExpression ) )
            	                    // InternalUIDSL.g:752:7: (lv_params_5_0= ruleExpression )
            	                    {
            	                    // InternalUIDSL.g:752:7: (lv_params_5_0= ruleExpression )
            	                    // InternalUIDSL.g:753:8: lv_params_5_0= ruleExpression
            	                    {

            	                    								newCompositeNode(grammarAccess.getMemberSelectionExpressionAccess().getParamsExpressionParserRuleCall_1_3_1_0_0());
            	                    							
            	                    pushFollow(FOLLOW_11);
            	                    lv_params_5_0=ruleExpression();

            	                    state._fsp--;


            	                    								if (current==null) {
            	                    									current = createModelElementForParent(grammarAccess.getMemberSelectionExpressionRule());
            	                    								}
            	                    								add(
            	                    									current,
            	                    									"params",
            	                    									lv_params_5_0,
            	                    									"com.stefanvuckovic.uidsl.UIDSL.Expression");
            	                    								afterParserOrEnumRuleCall();
            	                    							

            	                    }


            	                    }

            	                    // InternalUIDSL.g:770:6: (otherlv_6= ',' ( (lv_params_7_0= ruleExpression ) ) )*
            	                    loop9:
            	                    do {
            	                        int alt9=2;
            	                        int LA9_0 = input.LA(1);

            	                        if ( (LA9_0==16) ) {
            	                            alt9=1;
            	                        }


            	                        switch (alt9) {
            	                    	case 1 :
            	                    	    // InternalUIDSL.g:771:7: otherlv_6= ',' ( (lv_params_7_0= ruleExpression ) )
            	                    	    {
            	                    	    otherlv_6=(Token)match(input,16,FOLLOW_15); 

            	                    	    							newLeafNode(otherlv_6, grammarAccess.getMemberSelectionExpressionAccess().getCommaKeyword_1_3_1_1_0());
            	                    	    						
            	                    	    // InternalUIDSL.g:775:7: ( (lv_params_7_0= ruleExpression ) )
            	                    	    // InternalUIDSL.g:776:8: (lv_params_7_0= ruleExpression )
            	                    	    {
            	                    	    // InternalUIDSL.g:776:8: (lv_params_7_0= ruleExpression )
            	                    	    // InternalUIDSL.g:777:9: lv_params_7_0= ruleExpression
            	                    	    {

            	                    	    									newCompositeNode(grammarAccess.getMemberSelectionExpressionAccess().getParamsExpressionParserRuleCall_1_3_1_1_1_0());
            	                    	    								
            	                    	    pushFollow(FOLLOW_11);
            	                    	    lv_params_7_0=ruleExpression();

            	                    	    state._fsp--;


            	                    	    									if (current==null) {
            	                    	    										current = createModelElementForParent(grammarAccess.getMemberSelectionExpressionRule());
            	                    	    									}
            	                    	    									add(
            	                    	    										current,
            	                    	    										"params",
            	                    	    										lv_params_7_0,
            	                    	    										"com.stefanvuckovic.uidsl.UIDSL.Expression");
            	                    	    									afterParserOrEnumRuleCall();
            	                    	    								

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop9;
            	                        }
            	                    } while (true);


            	                    }
            	                    break;

            	            }

            	            otherlv_8=(Token)match(input,17,FOLLOW_12); 

            	            					newLeafNode(otherlv_8, grammarAccess.getMemberSelectionExpressionAccess().getRightParenthesisKeyword_1_3_2());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


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
    // $ANTLR end "ruleMemberSelectionExpression"


    // $ANTLR start "entryRuleAtomExpression"
    // InternalUIDSL.g:806:1: entryRuleAtomExpression returns [EObject current=null] : iv_ruleAtomExpression= ruleAtomExpression EOF ;
    public final EObject entryRuleAtomExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomExpression = null;


        try {
            // InternalUIDSL.g:806:55: (iv_ruleAtomExpression= ruleAtomExpression EOF )
            // InternalUIDSL.g:807:2: iv_ruleAtomExpression= ruleAtomExpression EOF
            {
             newCompositeNode(grammarAccess.getAtomExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomExpression=ruleAtomExpression();

            state._fsp--;

             current =iv_ruleAtomExpression; 
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
    // $ANTLR end "entryRuleAtomExpression"


    // $ANTLR start "ruleAtomExpression"
    // InternalUIDSL.g:813:1: ruleAtomExpression returns [EObject current=null] : (this_Constant_0= ruleConstant | ( () ( (otherlv_2= RULE_ID ) ) ) ) ;
    public final EObject ruleAtomExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Constant_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:819:2: ( (this_Constant_0= ruleConstant | ( () ( (otherlv_2= RULE_ID ) ) ) ) )
            // InternalUIDSL.g:820:2: (this_Constant_0= ruleConstant | ( () ( (otherlv_2= RULE_ID ) ) ) )
            {
            // InternalUIDSL.g:820:2: (this_Constant_0= ruleConstant | ( () ( (otherlv_2= RULE_ID ) ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_INT && LA13_0<=RULE_STRING)||(LA13_0>=31 && LA13_0<=32)||LA13_0==34) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalUIDSL.g:821:3: this_Constant_0= ruleConstant
                    {

                    			newCompositeNode(grammarAccess.getAtomExpressionAccess().getConstantParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Constant_0=ruleConstant();

                    state._fsp--;


                    			current = this_Constant_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUIDSL.g:830:3: ( () ( (otherlv_2= RULE_ID ) ) )
                    {
                    // InternalUIDSL.g:830:3: ( () ( (otherlv_2= RULE_ID ) ) )
                    // InternalUIDSL.g:831:4: () ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalUIDSL.g:831:4: ()
                    // InternalUIDSL.g:832:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomExpressionAccess().getVariableReferenceAction_1_0(),
                    						current);
                    				

                    }

                    // InternalUIDSL.g:838:4: ( (otherlv_2= RULE_ID ) )
                    // InternalUIDSL.g:839:5: (otherlv_2= RULE_ID )
                    {
                    // InternalUIDSL.g:839:5: (otherlv_2= RULE_ID )
                    // InternalUIDSL.g:840:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomExpressionRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_2, grammarAccess.getAtomExpressionAccess().getRefVariableCrossReference_1_1_0());
                    					

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
    // $ANTLR end "ruleAtomExpression"


    // $ANTLR start "entrySuperConcept"
    // InternalUIDSL.g:856:1: entrySuperConcept returns [EObject current=null] : iv_superConcept= superConcept EOF ;
    public final EObject entrySuperConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_superConcept = null;


        try {
            // InternalUIDSL.g:856:49: (iv_superConcept= superConcept EOF )
            // InternalUIDSL.g:857:2: iv_superConcept= superConcept EOF
            {
             newCompositeNode(grammarAccess.getDTOConceptRule()); 
            pushFollow(FOLLOW_1);
            iv_superConcept=superConcept();

            state._fsp--;

             current =iv_superConcept; 
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
    // $ANTLR end "entrySuperConcept"


    // $ANTLR start "superConcept"
    // InternalUIDSL.g:863:1: superConcept returns [EObject current=null] : (this_DTOClass_0= ruleDTOClass | this_Enum_1= ruleEnum ) ;
    public final EObject superConcept() throws RecognitionException {
        EObject current = null;

        EObject this_DTOClass_0 = null;

        EObject this_Enum_1 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:869:2: ( (this_DTOClass_0= ruleDTOClass | this_Enum_1= ruleEnum ) )
            // InternalUIDSL.g:870:2: (this_DTOClass_0= ruleDTOClass | this_Enum_1= ruleEnum )
            {
            // InternalUIDSL.g:870:2: (this_DTOClass_0= ruleDTOClass | this_Enum_1= ruleEnum )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            else if ( (LA14_0==29) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalUIDSL.g:871:3: this_DTOClass_0= ruleDTOClass
                    {

                    			newCompositeNode(grammarAccess.getDTOConceptAccess().getDTOClassParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DTOClass_0=ruleDTOClass();

                    state._fsp--;


                    			current = this_DTOClass_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUIDSL.g:880:3: this_Enum_1= ruleEnum
                    {

                    			newCompositeNode(grammarAccess.getDTOConceptAccess().getEnumParserRuleCall_1());
                    		
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
    // $ANTLR end "superConcept"


    // $ANTLR start "entryRuleDTOClass"
    // InternalUIDSL.g:892:1: entryRuleDTOClass returns [EObject current=null] : iv_ruleDTOClass= ruleDTOClass EOF ;
    public final EObject entryRuleDTOClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTOClass = null;


        try {
            // InternalUIDSL.g:892:49: (iv_ruleDTOClass= ruleDTOClass EOF )
            // InternalUIDSL.g:893:2: iv_ruleDTOClass= ruleDTOClass EOF
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
    // InternalUIDSL.g:899:1: ruleDTOClass returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' ) ;
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
            // InternalUIDSL.g:905:2: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' ) )
            // InternalUIDSL.g:906:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' )
            {
            // InternalUIDSL.g:906:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' )
            // InternalUIDSL.g:907:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDTOClassAccess().getClassKeyword_0());
            		
            // InternalUIDSL.g:911:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUIDSL.g:912:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUIDSL.g:912:4: (lv_name_1_0= RULE_ID )
            // InternalUIDSL.g:913:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

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

            // InternalUIDSL.g:929:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalUIDSL.g:930:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getDTOClassAccess().getExtendsKeyword_2_0());
                    			
                    // InternalUIDSL.g:934:4: ( (otherlv_3= RULE_ID ) )
                    // InternalUIDSL.g:935:5: (otherlv_3= RULE_ID )
                    {
                    // InternalUIDSL.g:935:5: (otherlv_3= RULE_ID )
                    // InternalUIDSL.g:936:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDTOClassRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(otherlv_3, grammarAccess.getDTOClassAccess().getSuperTypeDTOClassCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getDTOClassAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUIDSL.g:952:3: ( (lv_attributes_5_0= ruleAttribute ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID||(LA16_0>=24 && LA16_0<=28)||(LA16_0>=41 && LA16_0<=46)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalUIDSL.g:953:4: (lv_attributes_5_0= ruleAttribute )
            	    {
            	    // InternalUIDSL.g:953:4: (lv_attributes_5_0= ruleAttribute )
            	    // InternalUIDSL.g:954:5: lv_attributes_5_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getDTOClassAccess().getAttributesAttributeParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_17);
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
            	    break loop16;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

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


    // $ANTLR start "entryRuleBasicType"
    // InternalUIDSL.g:979:1: entryRuleBasicType returns [EObject current=null] : iv_ruleBasicType= ruleBasicType EOF ;
    public final EObject entryRuleBasicType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicType = null;


        try {
            // InternalUIDSL.g:979:50: (iv_ruleBasicType= ruleBasicType EOF )
            // InternalUIDSL.g:980:2: iv_ruleBasicType= ruleBasicType EOF
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
    // InternalUIDSL.g:986:1: ruleBasicType returns [EObject current=null] : (this_BasicType_0= superBasicType | ( () otherlv_2= 'text' ) | ( () otherlv_4= 'email' ) | ( () otherlv_6= 'password' ) | ( () otherlv_8= 'file' ) | ( () otherlv_10= 'image' ) ) ;
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
            // InternalUIDSL.g:992:2: ( (this_BasicType_0= superBasicType | ( () otherlv_2= 'text' ) | ( () otherlv_4= 'email' ) | ( () otherlv_6= 'password' ) | ( () otherlv_8= 'file' ) | ( () otherlv_10= 'image' ) ) )
            // InternalUIDSL.g:993:2: (this_BasicType_0= superBasicType | ( () otherlv_2= 'text' ) | ( () otherlv_4= 'email' ) | ( () otherlv_6= 'password' ) | ( () otherlv_8= 'file' ) | ( () otherlv_10= 'image' ) )
            {
            // InternalUIDSL.g:993:2: (this_BasicType_0= superBasicType | ( () otherlv_2= 'text' ) | ( () otherlv_4= 'email' ) | ( () otherlv_6= 'password' ) | ( () otherlv_8= 'file' ) | ( () otherlv_10= 'image' ) )
            int alt17=6;
            switch ( input.LA(1) ) {
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
                {
                alt17=1;
                }
                break;
            case 24:
                {
                alt17=2;
                }
                break;
            case 25:
                {
                alt17=3;
                }
                break;
            case 26:
                {
                alt17=4;
                }
                break;
            case 27:
                {
                alt17=5;
                }
                break;
            case 28:
                {
                alt17=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalUIDSL.g:994:3: this_BasicType_0= superBasicType
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
                    // InternalUIDSL.g:1003:3: ( () otherlv_2= 'text' )
                    {
                    // InternalUIDSL.g:1003:3: ( () otherlv_2= 'text' )
                    // InternalUIDSL.g:1004:4: () otherlv_2= 'text'
                    {
                    // InternalUIDSL.g:1004:4: ()
                    // InternalUIDSL.g:1005:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBasicTypeAccess().getTextTypeAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getBasicTypeAccess().getTextKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalUIDSL.g:1017:3: ( () otherlv_4= 'email' )
                    {
                    // InternalUIDSL.g:1017:3: ( () otherlv_4= 'email' )
                    // InternalUIDSL.g:1018:4: () otherlv_4= 'email'
                    {
                    // InternalUIDSL.g:1018:4: ()
                    // InternalUIDSL.g:1019:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBasicTypeAccess().getEmailTypeAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getBasicTypeAccess().getEmailKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalUIDSL.g:1031:3: ( () otherlv_6= 'password' )
                    {
                    // InternalUIDSL.g:1031:3: ( () otherlv_6= 'password' )
                    // InternalUIDSL.g:1032:4: () otherlv_6= 'password'
                    {
                    // InternalUIDSL.g:1032:4: ()
                    // InternalUIDSL.g:1033:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBasicTypeAccess().getPasswordTypeAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_6=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getBasicTypeAccess().getPasswordKeyword_3_1());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalUIDSL.g:1045:3: ( () otherlv_8= 'file' )
                    {
                    // InternalUIDSL.g:1045:3: ( () otherlv_8= 'file' )
                    // InternalUIDSL.g:1046:4: () otherlv_8= 'file'
                    {
                    // InternalUIDSL.g:1046:4: ()
                    // InternalUIDSL.g:1047:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBasicTypeAccess().getFileTypeAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_8=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getBasicTypeAccess().getFileKeyword_4_1());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalUIDSL.g:1059:3: ( () otherlv_10= 'image' )
                    {
                    // InternalUIDSL.g:1059:3: ( () otherlv_10= 'image' )
                    // InternalUIDSL.g:1060:4: () otherlv_10= 'image'
                    {
                    // InternalUIDSL.g:1060:4: ()
                    // InternalUIDSL.g:1061:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBasicTypeAccess().getImageTypeAction_5_0(),
                    						current);
                    				

                    }

                    otherlv_10=(Token)match(input,28,FOLLOW_2); 

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
    // InternalUIDSL.g:1076:1: entryRuleEnum returns [EObject current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final EObject entryRuleEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnum = null;


        try {
            // InternalUIDSL.g:1076:45: (iv_ruleEnum= ruleEnum EOF )
            // InternalUIDSL.g:1077:2: iv_ruleEnum= ruleEnum EOF
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
    // InternalUIDSL.g:1083:1: ruleEnum returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_literals_4_0= ruleEnumLiteral ) )+ otherlv_5= '}' ) ;
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
            // InternalUIDSL.g:1089:2: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_literals_4_0= ruleEnumLiteral ) )+ otherlv_5= '}' ) )
            // InternalUIDSL.g:1090:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_literals_4_0= ruleEnumLiteral ) )+ otherlv_5= '}' )
            {
            // InternalUIDSL.g:1090:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_literals_4_0= ruleEnumLiteral ) )+ otherlv_5= '}' )
            // InternalUIDSL.g:1091:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_literals_4_0= ruleEnumLiteral ) )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumAccess().getEnumKeyword_0());
            		
            // InternalUIDSL.g:1095:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUIDSL.g:1096:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUIDSL.g:1096:4: (lv_name_1_0= RULE_ID )
            // InternalUIDSL.g:1097:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUIDSL.g:1117:3: ( (lv_attributes_3_0= ruleAttribute ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1==RULE_ID) ) {
                        int LA18_4 = input.LA(3);

                        if ( (LA18_4==14||(LA18_4>=49 && LA18_4<=52)) ) {
                            alt18=1;
                        }


                    }


                }
                else if ( ((LA18_0>=24 && LA18_0<=28)||(LA18_0>=41 && LA18_0<=46)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalUIDSL.g:1118:4: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // InternalUIDSL.g:1118:4: (lv_attributes_3_0= ruleAttribute )
            	    // InternalUIDSL.g:1119:5: lv_attributes_3_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getEnumAccess().getAttributesAttributeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_10);
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
            	    break loop18;
                }
            } while (true);

            // InternalUIDSL.g:1136:3: ( (lv_literals_4_0= ruleEnumLiteral ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalUIDSL.g:1137:4: (lv_literals_4_0= ruleEnumLiteral )
            	    {
            	    // InternalUIDSL.g:1137:4: (lv_literals_4_0= ruleEnumLiteral )
            	    // InternalUIDSL.g:1138:5: lv_literals_4_0= ruleEnumLiteral
            	    {

            	    					newCompositeNode(grammarAccess.getEnumAccess().getLiteralsEnumLiteralParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_17);
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
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

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
    // InternalUIDSL.g:1163:1: entryRuleEnumLiteral returns [EObject current=null] : iv_ruleEnumLiteral= ruleEnumLiteral EOF ;
    public final EObject entryRuleEnumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumLiteral = null;


        try {
            // InternalUIDSL.g:1163:52: (iv_ruleEnumLiteral= ruleEnumLiteral EOF )
            // InternalUIDSL.g:1164:2: iv_ruleEnumLiteral= ruleEnumLiteral EOF
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
    // InternalUIDSL.g:1170:1: ruleEnumLiteral returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleConstant ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleConstant ) ) )* otherlv_5= ')' )? ) ;
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
            // InternalUIDSL.g:1176:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleConstant ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleConstant ) ) )* otherlv_5= ')' )? ) )
            // InternalUIDSL.g:1177:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleConstant ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleConstant ) ) )* otherlv_5= ')' )? )
            {
            // InternalUIDSL.g:1177:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleConstant ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleConstant ) ) )* otherlv_5= ')' )? )
            // InternalUIDSL.g:1178:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleConstant ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleConstant ) ) )* otherlv_5= ')' )?
            {
            // InternalUIDSL.g:1178:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalUIDSL.g:1179:4: (lv_name_0_0= RULE_ID )
            {
            // InternalUIDSL.g:1179:4: (lv_name_0_0= RULE_ID )
            // InternalUIDSL.g:1180:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_18); 

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

            // InternalUIDSL.g:1196:3: (otherlv_1= '(' ( (lv_params_2_0= ruleConstant ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleConstant ) ) )* otherlv_5= ')' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==15) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalUIDSL.g:1197:4: otherlv_1= '(' ( (lv_params_2_0= ruleConstant ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleConstant ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_19); 

                    				newLeafNode(otherlv_1, grammarAccess.getEnumLiteralAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalUIDSL.g:1201:4: ( (lv_params_2_0= ruleConstant ) )
                    // InternalUIDSL.g:1202:5: (lv_params_2_0= ruleConstant )
                    {
                    // InternalUIDSL.g:1202:5: (lv_params_2_0= ruleConstant )
                    // InternalUIDSL.g:1203:6: lv_params_2_0= ruleConstant
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

                    // InternalUIDSL.g:1220:4: (otherlv_3= ',' ( (lv_params_4_0= ruleConstant ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==16) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalUIDSL.g:1221:5: otherlv_3= ',' ( (lv_params_4_0= ruleConstant ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_19); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getEnumLiteralAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalUIDSL.g:1225:5: ( (lv_params_4_0= ruleConstant ) )
                    	    // InternalUIDSL.g:1226:6: (lv_params_4_0= ruleConstant )
                    	    {
                    	    // InternalUIDSL.g:1226:6: (lv_params_4_0= ruleConstant )
                    	    // InternalUIDSL.g:1227:7: lv_params_4_0= ruleConstant
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
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,17,FOLLOW_2); 

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
    // InternalUIDSL.g:1254:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // InternalUIDSL.g:1254:49: (iv_ruleConstant= ruleConstant EOF )
            // InternalUIDSL.g:1255:2: iv_ruleConstant= ruleConstant EOF
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
    // InternalUIDSL.g:1261:1: ruleConstant returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) otherlv_4= 'L' ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) ) ) | ( () ( (lv_day_10_0= RULE_INT ) ) otherlv_11= '/' ( (lv_month_12_0= RULE_INT ) ) otherlv_13= '/' ( (lv_year_14_0= RULE_INT ) ) ) | ( () otherlv_16= 'null' ) ) ;
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
            // InternalUIDSL.g:1267:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) otherlv_4= 'L' ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) ) ) | ( () ( (lv_day_10_0= RULE_INT ) ) otherlv_11= '/' ( (lv_month_12_0= RULE_INT ) ) otherlv_13= '/' ( (lv_year_14_0= RULE_INT ) ) ) | ( () otherlv_16= 'null' ) ) )
            // InternalUIDSL.g:1268:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) otherlv_4= 'L' ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) ) ) | ( () ( (lv_day_10_0= RULE_INT ) ) otherlv_11= '/' ( (lv_month_12_0= RULE_INT ) ) otherlv_13= '/' ( (lv_year_14_0= RULE_INT ) ) ) | ( () otherlv_16= 'null' ) )
            {
            // InternalUIDSL.g:1268:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) otherlv_4= 'L' ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) ) ) | ( () ( (lv_day_10_0= RULE_INT ) ) otherlv_11= '/' ( (lv_month_12_0= RULE_INT ) ) otherlv_13= '/' ( (lv_year_14_0= RULE_INT ) ) ) | ( () otherlv_16= 'null' ) )
            int alt23=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                switch ( input.LA(2) ) {
                case 30:
                    {
                    alt23=2;
                    }
                    break;
                case EOF:
                case RULE_ID:
                case RULE_INT:
                case RULE_STRING:
                case 13:
                case 16:
                case 17:
                case 21:
                case 31:
                case 32:
                case 34:
                    {
                    alt23=1;
                    }
                    break;
                case 33:
                    {
                    alt23=5;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }

                }
                break;
            case RULE_STRING:
                {
                alt23=3;
                }
                break;
            case 31:
            case 32:
                {
                alt23=4;
                }
                break;
            case 34:
                {
                alt23=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalUIDSL.g:1269:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalUIDSL.g:1269:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalUIDSL.g:1270:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalUIDSL.g:1270:4: ()
                    // InternalUIDSL.g:1271:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstantAccess().getIntConstantAction_0_0(),
                    						current);
                    				

                    }

                    // InternalUIDSL.g:1277:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalUIDSL.g:1278:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalUIDSL.g:1278:5: (lv_value_1_0= RULE_INT )
                    // InternalUIDSL.g:1279:6: lv_value_1_0= RULE_INT
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
                    // InternalUIDSL.g:1297:3: ( () ( (lv_value_3_0= RULE_INT ) ) otherlv_4= 'L' )
                    {
                    // InternalUIDSL.g:1297:3: ( () ( (lv_value_3_0= RULE_INT ) ) otherlv_4= 'L' )
                    // InternalUIDSL.g:1298:4: () ( (lv_value_3_0= RULE_INT ) ) otherlv_4= 'L'
                    {
                    // InternalUIDSL.g:1298:4: ()
                    // InternalUIDSL.g:1299:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstantAccess().getLongConstantAction_1_0(),
                    						current);
                    				

                    }

                    // InternalUIDSL.g:1305:4: ( (lv_value_3_0= RULE_INT ) )
                    // InternalUIDSL.g:1306:5: (lv_value_3_0= RULE_INT )
                    {
                    // InternalUIDSL.g:1306:5: (lv_value_3_0= RULE_INT )
                    // InternalUIDSL.g:1307:6: lv_value_3_0= RULE_INT
                    {
                    lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_20); 

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

                    otherlv_4=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getConstantAccess().getLKeyword_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalUIDSL.g:1329:3: ( () ( (lv_value_6_0= RULE_STRING ) ) )
                    {
                    // InternalUIDSL.g:1329:3: ( () ( (lv_value_6_0= RULE_STRING ) ) )
                    // InternalUIDSL.g:1330:4: () ( (lv_value_6_0= RULE_STRING ) )
                    {
                    // InternalUIDSL.g:1330:4: ()
                    // InternalUIDSL.g:1331:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstantAccess().getStringConstantAction_2_0(),
                    						current);
                    				

                    }

                    // InternalUIDSL.g:1337:4: ( (lv_value_6_0= RULE_STRING ) )
                    // InternalUIDSL.g:1338:5: (lv_value_6_0= RULE_STRING )
                    {
                    // InternalUIDSL.g:1338:5: (lv_value_6_0= RULE_STRING )
                    // InternalUIDSL.g:1339:6: lv_value_6_0= RULE_STRING
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
                    // InternalUIDSL.g:1357:3: ( () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) ) )
                    {
                    // InternalUIDSL.g:1357:3: ( () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) ) )
                    // InternalUIDSL.g:1358:4: () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) )
                    {
                    // InternalUIDSL.g:1358:4: ()
                    // InternalUIDSL.g:1359:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstantAccess().getBoolConstantAction_3_0(),
                    						current);
                    				

                    }

                    // InternalUIDSL.g:1365:4: ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) )
                    // InternalUIDSL.g:1366:5: ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) )
                    {
                    // InternalUIDSL.g:1366:5: ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) )
                    // InternalUIDSL.g:1367:6: (lv_value_8_1= 'true' | lv_value_8_2= 'false' )
                    {
                    // InternalUIDSL.g:1367:6: (lv_value_8_1= 'true' | lv_value_8_2= 'false' )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==31) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==32) ) {
                        alt22=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalUIDSL.g:1368:7: lv_value_8_1= 'true'
                            {
                            lv_value_8_1=(Token)match(input,31,FOLLOW_2); 

                            							newLeafNode(lv_value_8_1, grammarAccess.getConstantAccess().getValueTrueKeyword_3_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConstantRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_8_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalUIDSL.g:1379:7: lv_value_8_2= 'false'
                            {
                            lv_value_8_2=(Token)match(input,32,FOLLOW_2); 

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
                    // InternalUIDSL.g:1394:3: ( () ( (lv_day_10_0= RULE_INT ) ) otherlv_11= '/' ( (lv_month_12_0= RULE_INT ) ) otherlv_13= '/' ( (lv_year_14_0= RULE_INT ) ) )
                    {
                    // InternalUIDSL.g:1394:3: ( () ( (lv_day_10_0= RULE_INT ) ) otherlv_11= '/' ( (lv_month_12_0= RULE_INT ) ) otherlv_13= '/' ( (lv_year_14_0= RULE_INT ) ) )
                    // InternalUIDSL.g:1395:4: () ( (lv_day_10_0= RULE_INT ) ) otherlv_11= '/' ( (lv_month_12_0= RULE_INT ) ) otherlv_13= '/' ( (lv_year_14_0= RULE_INT ) )
                    {
                    // InternalUIDSL.g:1395:4: ()
                    // InternalUIDSL.g:1396:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstantAccess().getDateConstantAction_4_0(),
                    						current);
                    				

                    }

                    // InternalUIDSL.g:1402:4: ( (lv_day_10_0= RULE_INT ) )
                    // InternalUIDSL.g:1403:5: (lv_day_10_0= RULE_INT )
                    {
                    // InternalUIDSL.g:1403:5: (lv_day_10_0= RULE_INT )
                    // InternalUIDSL.g:1404:6: lv_day_10_0= RULE_INT
                    {
                    lv_day_10_0=(Token)match(input,RULE_INT,FOLLOW_21); 

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

                    otherlv_11=(Token)match(input,33,FOLLOW_22); 

                    				newLeafNode(otherlv_11, grammarAccess.getConstantAccess().getSolidusKeyword_4_2());
                    			
                    // InternalUIDSL.g:1424:4: ( (lv_month_12_0= RULE_INT ) )
                    // InternalUIDSL.g:1425:5: (lv_month_12_0= RULE_INT )
                    {
                    // InternalUIDSL.g:1425:5: (lv_month_12_0= RULE_INT )
                    // InternalUIDSL.g:1426:6: lv_month_12_0= RULE_INT
                    {
                    lv_month_12_0=(Token)match(input,RULE_INT,FOLLOW_21); 

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

                    otherlv_13=(Token)match(input,33,FOLLOW_22); 

                    				newLeafNode(otherlv_13, grammarAccess.getConstantAccess().getSolidusKeyword_4_4());
                    			
                    // InternalUIDSL.g:1446:4: ( (lv_year_14_0= RULE_INT ) )
                    // InternalUIDSL.g:1447:5: (lv_year_14_0= RULE_INT )
                    {
                    // InternalUIDSL.g:1447:5: (lv_year_14_0= RULE_INT )
                    // InternalUIDSL.g:1448:6: lv_year_14_0= RULE_INT
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
                    // InternalUIDSL.g:1466:3: ( () otherlv_16= 'null' )
                    {
                    // InternalUIDSL.g:1466:3: ( () otherlv_16= 'null' )
                    // InternalUIDSL.g:1467:4: () otherlv_16= 'null'
                    {
                    // InternalUIDSL.g:1467:4: ()
                    // InternalUIDSL.g:1468:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstantAccess().getNullAction_5_0(),
                    						current);
                    				

                    }

                    otherlv_16=(Token)match(input,34,FOLLOW_2); 

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
    // InternalUIDSL.g:1483:1: entryRuleEntityOption returns [EObject current=null] : iv_ruleEntityOption= ruleEntityOption EOF ;
    public final EObject entryRuleEntityOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityOption = null;


        try {
            // InternalUIDSL.g:1483:53: (iv_ruleEntityOption= ruleEntityOption EOF )
            // InternalUIDSL.g:1484:2: iv_ruleEntityOption= ruleEntityOption EOF
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
    // InternalUIDSL.g:1490:1: ruleEntityOption returns [EObject current=null] : ( ( () ( (lv_deleteByFlag_1_0= 'deleteByFlag' ) ) ) | ( () otherlv_3= 'inheritance' otherlv_4= '=' ( (lv_inheritanceMapping_5_0= ruleInheritanceMappingType ) ) ) ) ;
    public final EObject ruleEntityOption() throws RecognitionException {
        EObject current = null;

        Token lv_deleteByFlag_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_inheritanceMapping_5_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:1496:2: ( ( ( () ( (lv_deleteByFlag_1_0= 'deleteByFlag' ) ) ) | ( () otherlv_3= 'inheritance' otherlv_4= '=' ( (lv_inheritanceMapping_5_0= ruleInheritanceMappingType ) ) ) ) )
            // InternalUIDSL.g:1497:2: ( ( () ( (lv_deleteByFlag_1_0= 'deleteByFlag' ) ) ) | ( () otherlv_3= 'inheritance' otherlv_4= '=' ( (lv_inheritanceMapping_5_0= ruleInheritanceMappingType ) ) ) )
            {
            // InternalUIDSL.g:1497:2: ( ( () ( (lv_deleteByFlag_1_0= 'deleteByFlag' ) ) ) | ( () otherlv_3= 'inheritance' otherlv_4= '=' ( (lv_inheritanceMapping_5_0= ruleInheritanceMappingType ) ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==35) ) {
                alt24=1;
            }
            else if ( (LA24_0==36) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalUIDSL.g:1498:3: ( () ( (lv_deleteByFlag_1_0= 'deleteByFlag' ) ) )
                    {
                    // InternalUIDSL.g:1498:3: ( () ( (lv_deleteByFlag_1_0= 'deleteByFlag' ) ) )
                    // InternalUIDSL.g:1499:4: () ( (lv_deleteByFlag_1_0= 'deleteByFlag' ) )
                    {
                    // InternalUIDSL.g:1499:4: ()
                    // InternalUIDSL.g:1500:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEntityOptionAccess().getEntityDeleteOptionAction_0_0(),
                    						current);
                    				

                    }

                    // InternalUIDSL.g:1506:4: ( (lv_deleteByFlag_1_0= 'deleteByFlag' ) )
                    // InternalUIDSL.g:1507:5: (lv_deleteByFlag_1_0= 'deleteByFlag' )
                    {
                    // InternalUIDSL.g:1507:5: (lv_deleteByFlag_1_0= 'deleteByFlag' )
                    // InternalUIDSL.g:1508:6: lv_deleteByFlag_1_0= 'deleteByFlag'
                    {
                    lv_deleteByFlag_1_0=(Token)match(input,35,FOLLOW_2); 

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
                    // InternalUIDSL.g:1522:3: ( () otherlv_3= 'inheritance' otherlv_4= '=' ( (lv_inheritanceMapping_5_0= ruleInheritanceMappingType ) ) )
                    {
                    // InternalUIDSL.g:1522:3: ( () otherlv_3= 'inheritance' otherlv_4= '=' ( (lv_inheritanceMapping_5_0= ruleInheritanceMappingType ) ) )
                    // InternalUIDSL.g:1523:4: () otherlv_3= 'inheritance' otherlv_4= '=' ( (lv_inheritanceMapping_5_0= ruleInheritanceMappingType ) )
                    {
                    // InternalUIDSL.g:1523:4: ()
                    // InternalUIDSL.g:1524:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEntityOptionAccess().getInheritanceMappingOptionAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,36,FOLLOW_23); 

                    				newLeafNode(otherlv_3, grammarAccess.getEntityOptionAccess().getInheritanceKeyword_1_1());
                    			
                    otherlv_4=(Token)match(input,37,FOLLOW_24); 

                    				newLeafNode(otherlv_4, grammarAccess.getEntityOptionAccess().getEqualsSignKeyword_1_2());
                    			
                    // InternalUIDSL.g:1538:4: ( (lv_inheritanceMapping_5_0= ruleInheritanceMappingType ) )
                    // InternalUIDSL.g:1539:5: (lv_inheritanceMapping_5_0= ruleInheritanceMappingType )
                    {
                    // InternalUIDSL.g:1539:5: (lv_inheritanceMapping_5_0= ruleInheritanceMappingType )
                    // InternalUIDSL.g:1540:6: lv_inheritanceMapping_5_0= ruleInheritanceMappingType
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
    // InternalUIDSL.g:1562:1: entryRuleInheritanceMappingType returns [EObject current=null] : iv_ruleInheritanceMappingType= ruleInheritanceMappingType EOF ;
    public final EObject entryRuleInheritanceMappingType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInheritanceMappingType = null;


        try {
            // InternalUIDSL.g:1562:63: (iv_ruleInheritanceMappingType= ruleInheritanceMappingType EOF )
            // InternalUIDSL.g:1563:2: iv_ruleInheritanceMappingType= ruleInheritanceMappingType EOF
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
    // InternalUIDSL.g:1569:1: ruleInheritanceMappingType returns [EObject current=null] : ( ( (lv_type_0_1= 'SINGLE_TABLE' | lv_type_0_2= 'TABLE_PER_CONCRETE_CLASS' | lv_type_0_3= 'TABLE_PER_CLASS' ) ) ) ;
    public final EObject ruleInheritanceMappingType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;


        	enterRule();

        try {
            // InternalUIDSL.g:1575:2: ( ( ( (lv_type_0_1= 'SINGLE_TABLE' | lv_type_0_2= 'TABLE_PER_CONCRETE_CLASS' | lv_type_0_3= 'TABLE_PER_CLASS' ) ) ) )
            // InternalUIDSL.g:1576:2: ( ( (lv_type_0_1= 'SINGLE_TABLE' | lv_type_0_2= 'TABLE_PER_CONCRETE_CLASS' | lv_type_0_3= 'TABLE_PER_CLASS' ) ) )
            {
            // InternalUIDSL.g:1576:2: ( ( (lv_type_0_1= 'SINGLE_TABLE' | lv_type_0_2= 'TABLE_PER_CONCRETE_CLASS' | lv_type_0_3= 'TABLE_PER_CLASS' ) ) )
            // InternalUIDSL.g:1577:3: ( (lv_type_0_1= 'SINGLE_TABLE' | lv_type_0_2= 'TABLE_PER_CONCRETE_CLASS' | lv_type_0_3= 'TABLE_PER_CLASS' ) )
            {
            // InternalUIDSL.g:1577:3: ( (lv_type_0_1= 'SINGLE_TABLE' | lv_type_0_2= 'TABLE_PER_CONCRETE_CLASS' | lv_type_0_3= 'TABLE_PER_CLASS' ) )
            // InternalUIDSL.g:1578:4: (lv_type_0_1= 'SINGLE_TABLE' | lv_type_0_2= 'TABLE_PER_CONCRETE_CLASS' | lv_type_0_3= 'TABLE_PER_CLASS' )
            {
            // InternalUIDSL.g:1578:4: (lv_type_0_1= 'SINGLE_TABLE' | lv_type_0_2= 'TABLE_PER_CONCRETE_CLASS' | lv_type_0_3= 'TABLE_PER_CLASS' )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt25=1;
                }
                break;
            case 39:
                {
                alt25=2;
                }
                break;
            case 40:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalUIDSL.g:1579:5: lv_type_0_1= 'SINGLE_TABLE'
                    {
                    lv_type_0_1=(Token)match(input,38,FOLLOW_2); 

                    					newLeafNode(lv_type_0_1, grammarAccess.getInheritanceMappingTypeAccess().getTypeSINGLE_TABLEKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInheritanceMappingTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalUIDSL.g:1590:5: lv_type_0_2= 'TABLE_PER_CONCRETE_CLASS'
                    {
                    lv_type_0_2=(Token)match(input,39,FOLLOW_2); 

                    					newLeafNode(lv_type_0_2, grammarAccess.getInheritanceMappingTypeAccess().getTypeTABLE_PER_CONCRETE_CLASSKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInheritanceMappingTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalUIDSL.g:1601:5: lv_type_0_3= 'TABLE_PER_CLASS'
                    {
                    lv_type_0_3=(Token)match(input,40,FOLLOW_2); 

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
    // InternalUIDSL.g:1617:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalUIDSL.g:1617:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalUIDSL.g:1618:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalUIDSL.g:1624:1: ruleAttribute returns [EObject current=null] : ( ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_options_2_0= ruleAttributeOption ) ) (otherlv_3= ',' ( (lv_options_4_0= ruleAttributeOption ) ) )* )? otherlv_5= ';' ) ;
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
            // InternalUIDSL.g:1630:2: ( ( ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_options_2_0= ruleAttributeOption ) ) (otherlv_3= ',' ( (lv_options_4_0= ruleAttributeOption ) ) )* )? otherlv_5= ';' ) )
            // InternalUIDSL.g:1631:2: ( ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_options_2_0= ruleAttributeOption ) ) (otherlv_3= ',' ( (lv_options_4_0= ruleAttributeOption ) ) )* )? otherlv_5= ';' )
            {
            // InternalUIDSL.g:1631:2: ( ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_options_2_0= ruleAttributeOption ) ) (otherlv_3= ',' ( (lv_options_4_0= ruleAttributeOption ) ) )* )? otherlv_5= ';' )
            // InternalUIDSL.g:1632:3: ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_options_2_0= ruleAttributeOption ) ) (otherlv_3= ',' ( (lv_options_4_0= ruleAttributeOption ) ) )* )? otherlv_5= ';'
            {
            // InternalUIDSL.g:1632:3: ( (lv_type_0_0= ruleAttributeType ) )
            // InternalUIDSL.g:1633:4: (lv_type_0_0= ruleAttributeType )
            {
            // InternalUIDSL.g:1633:4: (lv_type_0_0= ruleAttributeType )
            // InternalUIDSL.g:1634:5: lv_type_0_0= ruleAttributeType
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

            // InternalUIDSL.g:1651:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUIDSL.g:1652:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUIDSL.g:1652:4: (lv_name_1_0= RULE_ID )
            // InternalUIDSL.g:1653:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_25); 

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

            // InternalUIDSL.g:1669:3: ( ( (lv_options_2_0= ruleAttributeOption ) ) (otherlv_3= ',' ( (lv_options_4_0= ruleAttributeOption ) ) )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=49 && LA27_0<=52)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalUIDSL.g:1670:4: ( (lv_options_2_0= ruleAttributeOption ) ) (otherlv_3= ',' ( (lv_options_4_0= ruleAttributeOption ) ) )*
                    {
                    // InternalUIDSL.g:1670:4: ( (lv_options_2_0= ruleAttributeOption ) )
                    // InternalUIDSL.g:1671:5: (lv_options_2_0= ruleAttributeOption )
                    {
                    // InternalUIDSL.g:1671:5: (lv_options_2_0= ruleAttributeOption )
                    // InternalUIDSL.g:1672:6: lv_options_2_0= ruleAttributeOption
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getOptionsAttributeOptionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_options_2_0=ruleAttributeOption();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						add(
                    							current,
                    							"options",
                    							lv_options_2_0,
                    							"com.stefanvuckovic.domainmodel.DomainModel.AttributeOption");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUIDSL.g:1689:4: (otherlv_3= ',' ( (lv_options_4_0= ruleAttributeOption ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==16) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalUIDSL.g:1690:5: otherlv_3= ',' ( (lv_options_4_0= ruleAttributeOption ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_27); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalUIDSL.g:1694:5: ( (lv_options_4_0= ruleAttributeOption ) )
                    	    // InternalUIDSL.g:1695:6: (lv_options_4_0= ruleAttributeOption )
                    	    {
                    	    // InternalUIDSL.g:1695:6: (lv_options_4_0= ruleAttributeOption )
                    	    // InternalUIDSL.g:1696:7: lv_options_4_0= ruleAttributeOption
                    	    {

                    	    							newCompositeNode(grammarAccess.getAttributeAccess().getOptionsAttributeOptionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_26);
                    	    lv_options_4_0=ruleAttributeOption();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAttributeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"options",
                    	    								lv_options_4_0,
                    	    								"com.stefanvuckovic.domainmodel.DomainModel.AttributeOption");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

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
    // InternalUIDSL.g:1723:1: entryRuleAttributeType returns [EObject current=null] : iv_ruleAttributeType= ruleAttributeType EOF ;
    public final EObject entryRuleAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeType = null;


        try {
            // InternalUIDSL.g:1723:54: (iv_ruleAttributeType= ruleAttributeType EOF )
            // InternalUIDSL.g:1724:2: iv_ruleAttributeType= ruleAttributeType EOF
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
    // InternalUIDSL.g:1730:1: ruleAttributeType returns [EObject current=null] : (this_SingleType_0= ruleSingleType | this_CollectionType_1= ruleCollectionType ) ;
    public final EObject ruleAttributeType() throws RecognitionException {
        EObject current = null;

        EObject this_SingleType_0 = null;

        EObject this_CollectionType_1 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:1736:2: ( (this_SingleType_0= ruleSingleType | this_CollectionType_1= ruleCollectionType ) )
            // InternalUIDSL.g:1737:2: (this_SingleType_0= ruleSingleType | this_CollectionType_1= ruleCollectionType )
            {
            // InternalUIDSL.g:1737:2: (this_SingleType_0= ruleSingleType | this_CollectionType_1= ruleCollectionType )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID||(LA28_0>=24 && LA28_0<=28)||(LA28_0>=41 && LA28_0<=45)) ) {
                alt28=1;
            }
            else if ( (LA28_0==46) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalUIDSL.g:1738:3: this_SingleType_0= ruleSingleType
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
                    // InternalUIDSL.g:1747:3: this_CollectionType_1= ruleCollectionType
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
    // InternalUIDSL.g:1759:1: entryRuleSingleType returns [EObject current=null] : iv_ruleSingleType= ruleSingleType EOF ;
    public final EObject entryRuleSingleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleType = null;


        try {
            // InternalUIDSL.g:1759:51: (iv_ruleSingleType= ruleSingleType EOF )
            // InternalUIDSL.g:1760:2: iv_ruleSingleType= ruleSingleType EOF
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
    // InternalUIDSL.g:1766:1: ruleSingleType returns [EObject current=null] : (this_BasicType_0= ruleBasicType | this_RefType_1= ruleRefType ) ;
    public final EObject ruleSingleType() throws RecognitionException {
        EObject current = null;

        EObject this_BasicType_0 = null;

        EObject this_RefType_1 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:1772:2: ( (this_BasicType_0= ruleBasicType | this_RefType_1= ruleRefType ) )
            // InternalUIDSL.g:1773:2: (this_BasicType_0= ruleBasicType | this_RefType_1= ruleRefType )
            {
            // InternalUIDSL.g:1773:2: (this_BasicType_0= ruleBasicType | this_RefType_1= ruleRefType )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=24 && LA29_0<=28)||(LA29_0>=41 && LA29_0<=45)) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_ID) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalUIDSL.g:1774:3: this_BasicType_0= ruleBasicType
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
                    // InternalUIDSL.g:1783:3: this_RefType_1= ruleRefType
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
    // InternalUIDSL.g:1795:1: entrySuperBasicType returns [EObject current=null] : iv_superBasicType= superBasicType EOF ;
    public final EObject entrySuperBasicType() throws RecognitionException {
        EObject current = null;

        EObject iv_superBasicType = null;


        try {
            // InternalUIDSL.g:1795:51: (iv_superBasicType= superBasicType EOF )
            // InternalUIDSL.g:1796:2: iv_superBasicType= superBasicType EOF
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
    // InternalUIDSL.g:1802:1: superBasicType returns [EObject current=null] : ( ( () otherlv_1= 'string' ) | ( () otherlv_3= 'int' ) | ( () otherlv_5= 'long' ) | ( () otherlv_7= 'boolean' ) | ( () otherlv_9= 'date' ) ) ;
    public final EObject superBasicType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalUIDSL.g:1808:2: ( ( ( () otherlv_1= 'string' ) | ( () otherlv_3= 'int' ) | ( () otherlv_5= 'long' ) | ( () otherlv_7= 'boolean' ) | ( () otherlv_9= 'date' ) ) )
            // InternalUIDSL.g:1809:2: ( ( () otherlv_1= 'string' ) | ( () otherlv_3= 'int' ) | ( () otherlv_5= 'long' ) | ( () otherlv_7= 'boolean' ) | ( () otherlv_9= 'date' ) )
            {
            // InternalUIDSL.g:1809:2: ( ( () otherlv_1= 'string' ) | ( () otherlv_3= 'int' ) | ( () otherlv_5= 'long' ) | ( () otherlv_7= 'boolean' ) | ( () otherlv_9= 'date' ) )
            int alt30=5;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt30=1;
                }
                break;
            case 42:
                {
                alt30=2;
                }
                break;
            case 43:
                {
                alt30=3;
                }
                break;
            case 44:
                {
                alt30=4;
                }
                break;
            case 45:
                {
                alt30=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalUIDSL.g:1810:3: ( () otherlv_1= 'string' )
                    {
                    // InternalUIDSL.g:1810:3: ( () otherlv_1= 'string' )
                    // InternalUIDSL.g:1811:4: () otherlv_1= 'string'
                    {
                    // InternalUIDSL.g:1811:4: ()
                    // InternalUIDSL.g:1812:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDomainModelBasicTypeAccess().getStringTypeAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,41,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getDomainModelBasicTypeAccess().getStringKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUIDSL.g:1824:3: ( () otherlv_3= 'int' )
                    {
                    // InternalUIDSL.g:1824:3: ( () otherlv_3= 'int' )
                    // InternalUIDSL.g:1825:4: () otherlv_3= 'int'
                    {
                    // InternalUIDSL.g:1825:4: ()
                    // InternalUIDSL.g:1826:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDomainModelBasicTypeAccess().getIntTypeAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,42,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getDomainModelBasicTypeAccess().getIntKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalUIDSL.g:1838:3: ( () otherlv_5= 'long' )
                    {
                    // InternalUIDSL.g:1838:3: ( () otherlv_5= 'long' )
                    // InternalUIDSL.g:1839:4: () otherlv_5= 'long'
                    {
                    // InternalUIDSL.g:1839:4: ()
                    // InternalUIDSL.g:1840:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDomainModelBasicTypeAccess().getLongTypeAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,43,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getDomainModelBasicTypeAccess().getLongKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalUIDSL.g:1852:3: ( () otherlv_7= 'boolean' )
                    {
                    // InternalUIDSL.g:1852:3: ( () otherlv_7= 'boolean' )
                    // InternalUIDSL.g:1853:4: () otherlv_7= 'boolean'
                    {
                    // InternalUIDSL.g:1853:4: ()
                    // InternalUIDSL.g:1854:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDomainModelBasicTypeAccess().getBoolTypeAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,44,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getDomainModelBasicTypeAccess().getBooleanKeyword_3_1());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalUIDSL.g:1866:3: ( () otherlv_9= 'date' )
                    {
                    // InternalUIDSL.g:1866:3: ( () otherlv_9= 'date' )
                    // InternalUIDSL.g:1867:4: () otherlv_9= 'date'
                    {
                    // InternalUIDSL.g:1867:4: ()
                    // InternalUIDSL.g:1868:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDomainModelBasicTypeAccess().getDateTypeAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_9=(Token)match(input,45,FOLLOW_2); 

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
    // InternalUIDSL.g:1883:1: entryRuleRefType returns [EObject current=null] : iv_ruleRefType= ruleRefType EOF ;
    public final EObject entryRuleRefType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefType = null;


        try {
            // InternalUIDSL.g:1883:48: (iv_ruleRefType= ruleRefType EOF )
            // InternalUIDSL.g:1884:2: iv_ruleRefType= ruleRefType EOF
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
    // InternalUIDSL.g:1890:1: ruleRefType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleRefType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalUIDSL.g:1896:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalUIDSL.g:1897:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalUIDSL.g:1897:2: ( (otherlv_0= RULE_ID ) )
            // InternalUIDSL.g:1898:3: (otherlv_0= RULE_ID )
            {
            // InternalUIDSL.g:1898:3: (otherlv_0= RULE_ID )
            // InternalUIDSL.g:1899:4: otherlv_0= RULE_ID
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
    // InternalUIDSL.g:1913:1: entryRuleCollectionType returns [EObject current=null] : iv_ruleCollectionType= ruleCollectionType EOF ;
    public final EObject entryRuleCollectionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionType = null;


        try {
            // InternalUIDSL.g:1913:55: (iv_ruleCollectionType= ruleCollectionType EOF )
            // InternalUIDSL.g:1914:2: iv_ruleCollectionType= ruleCollectionType EOF
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
    // InternalUIDSL.g:1920:1: ruleCollectionType returns [EObject current=null] : (otherlv_0= 'List' otherlv_1= '<' ( (lv_ofType_2_0= ruleSingleType ) ) otherlv_3= '>' ) ;
    public final EObject ruleCollectionType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ofType_2_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:1926:2: ( (otherlv_0= 'List' otherlv_1= '<' ( (lv_ofType_2_0= ruleSingleType ) ) otherlv_3= '>' ) )
            // InternalUIDSL.g:1927:2: (otherlv_0= 'List' otherlv_1= '<' ( (lv_ofType_2_0= ruleSingleType ) ) otherlv_3= '>' )
            {
            // InternalUIDSL.g:1927:2: (otherlv_0= 'List' otherlv_1= '<' ( (lv_ofType_2_0= ruleSingleType ) ) otherlv_3= '>' )
            // InternalUIDSL.g:1928:3: otherlv_0= 'List' otherlv_1= '<' ( (lv_ofType_2_0= ruleSingleType ) ) otherlv_3= '>'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getCollectionTypeAccess().getListKeyword_0());
            		
            otherlv_1=(Token)match(input,47,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getCollectionTypeAccess().getLessThanSignKeyword_1());
            		
            // InternalUIDSL.g:1936:3: ( (lv_ofType_2_0= ruleSingleType ) )
            // InternalUIDSL.g:1937:4: (lv_ofType_2_0= ruleSingleType )
            {
            // InternalUIDSL.g:1937:4: (lv_ofType_2_0= ruleSingleType )
            // InternalUIDSL.g:1938:5: lv_ofType_2_0= ruleSingleType
            {

            					newCompositeNode(grammarAccess.getCollectionTypeAccess().getOfTypeSingleTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_30);
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

            otherlv_3=(Token)match(input,48,FOLLOW_2); 

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


    // $ANTLR start "entryRuleAttributeOption"
    // InternalUIDSL.g:1963:1: entryRuleAttributeOption returns [EObject current=null] : iv_ruleAttributeOption= ruleAttributeOption EOF ;
    public final EObject entryRuleAttributeOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeOption = null;


        try {
            // InternalUIDSL.g:1963:56: (iv_ruleAttributeOption= ruleAttributeOption EOF )
            // InternalUIDSL.g:1964:2: iv_ruleAttributeOption= ruleAttributeOption EOF
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
    // InternalUIDSL.g:1970:1: ruleAttributeOption returns [EObject current=null] : ( ( () ( (lv_required_1_0= 'required' ) ) ) | ( () ( (lv_partOf_3_0= 'partOf' ) ) ) | ( () otherlv_5= 'relationshipOwner' otherlv_6= '=' ( (lv_relationshipOwner_7_0= ruleStaticFieldSelection ) ) ) | ( () otherlv_9= 'reverse_cardinality' otherlv_10= '=' ( (lv_card_11_0= ruleCardinalityType ) ) ) ) ;
    public final EObject ruleAttributeOption() throws RecognitionException {
        EObject current = null;

        Token lv_required_1_0=null;
        Token lv_partOf_3_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_relationshipOwner_7_0 = null;

        Enumerator lv_card_11_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:1976:2: ( ( ( () ( (lv_required_1_0= 'required' ) ) ) | ( () ( (lv_partOf_3_0= 'partOf' ) ) ) | ( () otherlv_5= 'relationshipOwner' otherlv_6= '=' ( (lv_relationshipOwner_7_0= ruleStaticFieldSelection ) ) ) | ( () otherlv_9= 'reverse_cardinality' otherlv_10= '=' ( (lv_card_11_0= ruleCardinalityType ) ) ) ) )
            // InternalUIDSL.g:1977:2: ( ( () ( (lv_required_1_0= 'required' ) ) ) | ( () ( (lv_partOf_3_0= 'partOf' ) ) ) | ( () otherlv_5= 'relationshipOwner' otherlv_6= '=' ( (lv_relationshipOwner_7_0= ruleStaticFieldSelection ) ) ) | ( () otherlv_9= 'reverse_cardinality' otherlv_10= '=' ( (lv_card_11_0= ruleCardinalityType ) ) ) )
            {
            // InternalUIDSL.g:1977:2: ( ( () ( (lv_required_1_0= 'required' ) ) ) | ( () ( (lv_partOf_3_0= 'partOf' ) ) ) | ( () otherlv_5= 'relationshipOwner' otherlv_6= '=' ( (lv_relationshipOwner_7_0= ruleStaticFieldSelection ) ) ) | ( () otherlv_9= 'reverse_cardinality' otherlv_10= '=' ( (lv_card_11_0= ruleCardinalityType ) ) ) )
            int alt31=4;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt31=1;
                }
                break;
            case 50:
                {
                alt31=2;
                }
                break;
            case 51:
                {
                alt31=3;
                }
                break;
            case 52:
                {
                alt31=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalUIDSL.g:1978:3: ( () ( (lv_required_1_0= 'required' ) ) )
                    {
                    // InternalUIDSL.g:1978:3: ( () ( (lv_required_1_0= 'required' ) ) )
                    // InternalUIDSL.g:1979:4: () ( (lv_required_1_0= 'required' ) )
                    {
                    // InternalUIDSL.g:1979:4: ()
                    // InternalUIDSL.g:1980:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAttributeOptionAccess().getRequiredAction_0_0(),
                    						current);
                    				

                    }

                    // InternalUIDSL.g:1986:4: ( (lv_required_1_0= 'required' ) )
                    // InternalUIDSL.g:1987:5: (lv_required_1_0= 'required' )
                    {
                    // InternalUIDSL.g:1987:5: (lv_required_1_0= 'required' )
                    // InternalUIDSL.g:1988:6: lv_required_1_0= 'required'
                    {
                    lv_required_1_0=(Token)match(input,49,FOLLOW_2); 

                    						newLeafNode(lv_required_1_0, grammarAccess.getAttributeOptionAccess().getRequiredRequiredKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeOptionRule());
                    						}
                    						setWithLastConsumed(current, "required", true, "required");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUIDSL.g:2002:3: ( () ( (lv_partOf_3_0= 'partOf' ) ) )
                    {
                    // InternalUIDSL.g:2002:3: ( () ( (lv_partOf_3_0= 'partOf' ) ) )
                    // InternalUIDSL.g:2003:4: () ( (lv_partOf_3_0= 'partOf' ) )
                    {
                    // InternalUIDSL.g:2003:4: ()
                    // InternalUIDSL.g:2004:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAttributeOptionAccess().getPartOfAction_1_0(),
                    						current);
                    				

                    }

                    // InternalUIDSL.g:2010:4: ( (lv_partOf_3_0= 'partOf' ) )
                    // InternalUIDSL.g:2011:5: (lv_partOf_3_0= 'partOf' )
                    {
                    // InternalUIDSL.g:2011:5: (lv_partOf_3_0= 'partOf' )
                    // InternalUIDSL.g:2012:6: lv_partOf_3_0= 'partOf'
                    {
                    lv_partOf_3_0=(Token)match(input,50,FOLLOW_2); 

                    						newLeafNode(lv_partOf_3_0, grammarAccess.getAttributeOptionAccess().getPartOfPartOfKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeOptionRule());
                    						}
                    						setWithLastConsumed(current, "partOf", true, "partOf");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalUIDSL.g:2026:3: ( () otherlv_5= 'relationshipOwner' otherlv_6= '=' ( (lv_relationshipOwner_7_0= ruleStaticFieldSelection ) ) )
                    {
                    // InternalUIDSL.g:2026:3: ( () otherlv_5= 'relationshipOwner' otherlv_6= '=' ( (lv_relationshipOwner_7_0= ruleStaticFieldSelection ) ) )
                    // InternalUIDSL.g:2027:4: () otherlv_5= 'relationshipOwner' otherlv_6= '=' ( (lv_relationshipOwner_7_0= ruleStaticFieldSelection ) )
                    {
                    // InternalUIDSL.g:2027:4: ()
                    // InternalUIDSL.g:2028:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAttributeOptionAccess().getRelationshipOwnerAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,51,FOLLOW_23); 

                    				newLeafNode(otherlv_5, grammarAccess.getAttributeOptionAccess().getRelationshipOwnerKeyword_2_1());
                    			
                    otherlv_6=(Token)match(input,37,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getAttributeOptionAccess().getEqualsSignKeyword_2_2());
                    			
                    // InternalUIDSL.g:2042:4: ( (lv_relationshipOwner_7_0= ruleStaticFieldSelection ) )
                    // InternalUIDSL.g:2043:5: (lv_relationshipOwner_7_0= ruleStaticFieldSelection )
                    {
                    // InternalUIDSL.g:2043:5: (lv_relationshipOwner_7_0= ruleStaticFieldSelection )
                    // InternalUIDSL.g:2044:6: lv_relationshipOwner_7_0= ruleStaticFieldSelection
                    {

                    						newCompositeNode(grammarAccess.getAttributeOptionAccess().getRelationshipOwnerStaticFieldSelectionParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_relationshipOwner_7_0=ruleStaticFieldSelection();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeOptionRule());
                    						}
                    						set(
                    							current,
                    							"relationshipOwner",
                    							lv_relationshipOwner_7_0,
                    							"com.stefanvuckovic.domainmodel.DomainModel.StaticFieldSelection");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalUIDSL.g:2063:3: ( () otherlv_9= 'reverse_cardinality' otherlv_10= '=' ( (lv_card_11_0= ruleCardinalityType ) ) )
                    {
                    // InternalUIDSL.g:2063:3: ( () otherlv_9= 'reverse_cardinality' otherlv_10= '=' ( (lv_card_11_0= ruleCardinalityType ) ) )
                    // InternalUIDSL.g:2064:4: () otherlv_9= 'reverse_cardinality' otherlv_10= '=' ( (lv_card_11_0= ruleCardinalityType ) )
                    {
                    // InternalUIDSL.g:2064:4: ()
                    // InternalUIDSL.g:2065:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAttributeOptionAccess().getCardinalityAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_9=(Token)match(input,52,FOLLOW_23); 

                    				newLeafNode(otherlv_9, grammarAccess.getAttributeOptionAccess().getReverse_cardinalityKeyword_3_1());
                    			
                    otherlv_10=(Token)match(input,37,FOLLOW_31); 

                    				newLeafNode(otherlv_10, grammarAccess.getAttributeOptionAccess().getEqualsSignKeyword_3_2());
                    			
                    // InternalUIDSL.g:2079:4: ( (lv_card_11_0= ruleCardinalityType ) )
                    // InternalUIDSL.g:2080:5: (lv_card_11_0= ruleCardinalityType )
                    {
                    // InternalUIDSL.g:2080:5: (lv_card_11_0= ruleCardinalityType )
                    // InternalUIDSL.g:2081:6: lv_card_11_0= ruleCardinalityType
                    {

                    						newCompositeNode(grammarAccess.getAttributeOptionAccess().getCardCardinalityTypeEnumRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_card_11_0=ruleCardinalityType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeOptionRule());
                    						}
                    						set(
                    							current,
                    							"card",
                    							lv_card_11_0,
                    							"com.stefanvuckovic.domainmodel.DomainModel.CardinalityType");
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
    // $ANTLR end "ruleAttributeOption"


    // $ANTLR start "entryRuleStaticFieldSelection"
    // InternalUIDSL.g:2103:1: entryRuleStaticFieldSelection returns [EObject current=null] : iv_ruleStaticFieldSelection= ruleStaticFieldSelection EOF ;
    public final EObject entryRuleStaticFieldSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStaticFieldSelection = null;


        try {
            // InternalUIDSL.g:2103:61: (iv_ruleStaticFieldSelection= ruleStaticFieldSelection EOF )
            // InternalUIDSL.g:2104:2: iv_ruleStaticFieldSelection= ruleStaticFieldSelection EOF
            {
             newCompositeNode(grammarAccess.getStaticFieldSelectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStaticFieldSelection=ruleStaticFieldSelection();

            state._fsp--;

             current =iv_ruleStaticFieldSelection; 
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
    // $ANTLR end "entryRuleStaticFieldSelection"


    // $ANTLR start "ruleStaticFieldSelection"
    // InternalUIDSL.g:2110:1: ruleStaticFieldSelection returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleStaticFieldSelection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalUIDSL.g:2116:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalUIDSL.g:2117:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalUIDSL.g:2117:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            // InternalUIDSL.g:2118:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
            {
            // InternalUIDSL.g:2118:3: ( (otherlv_0= RULE_ID ) )
            // InternalUIDSL.g:2119:4: (otherlv_0= RULE_ID )
            {
            // InternalUIDSL.g:2119:4: (otherlv_0= RULE_ID )
            // InternalUIDSL.g:2120:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStaticFieldSelectionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_32); 

            					newLeafNode(otherlv_0, grammarAccess.getStaticFieldSelectionAccess().getReceiverEntityCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getStaticFieldSelectionAccess().getFullStopKeyword_1());
            		
            // InternalUIDSL.g:2135:3: ( (otherlv_2= RULE_ID ) )
            // InternalUIDSL.g:2136:4: (otherlv_2= RULE_ID )
            {
            // InternalUIDSL.g:2136:4: (otherlv_2= RULE_ID )
            // InternalUIDSL.g:2137:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStaticFieldSelectionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getStaticFieldSelectionAccess().getMemberAttributeCrossReference_2_0());
            				

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
    // $ANTLR end "ruleStaticFieldSelection"


    // $ANTLR start "entrySuperSelectionMember"
    // InternalUIDSL.g:2152:1: entrySuperSelectionMember returns [EObject current=null] : iv_superSelectionMember= superSelectionMember EOF ;
    public final EObject entrySuperSelectionMember() throws RecognitionException {
        EObject current = null;

        EObject iv_superSelectionMember = null;


        try {
            // InternalUIDSL.g:2152:57: (iv_superSelectionMember= superSelectionMember EOF )
            // InternalUIDSL.g:2153:2: iv_superSelectionMember= superSelectionMember EOF
            {
             newCompositeNode(grammarAccess.getDomainModelSelectionMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_superSelectionMember=superSelectionMember();

            state._fsp--;

             current =iv_superSelectionMember; 
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
    // $ANTLR end "entrySuperSelectionMember"


    // $ANTLR start "superSelectionMember"
    // InternalUIDSL.g:2159:1: superSelectionMember returns [EObject current=null] : this_Attribute_0= ruleAttribute ;
    public final EObject superSelectionMember() throws RecognitionException {
        EObject current = null;

        EObject this_Attribute_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:2165:2: (this_Attribute_0= ruleAttribute )
            // InternalUIDSL.g:2166:2: this_Attribute_0= ruleAttribute
            {

            		newCompositeNode(grammarAccess.getDomainModelSelectionMemberAccess().getAttributeParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Attribute_0=ruleAttribute();

            state._fsp--;


            		current = this_Attribute_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "superSelectionMember"


    // $ANTLR start "ruleCardinalityType"
    // InternalUIDSL.g:2177:1: ruleCardinalityType returns [Enumerator current=null] : ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'many' ) ) ;
    public final Enumerator ruleCardinalityType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalUIDSL.g:2183:2: ( ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'many' ) ) )
            // InternalUIDSL.g:2184:2: ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'many' ) )
            {
            // InternalUIDSL.g:2184:2: ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'many' ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==53) ) {
                alt32=1;
            }
            else if ( (LA32_0==54) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalUIDSL.g:2185:3: (enumLiteral_0= 'one' )
                    {
                    // InternalUIDSL.g:2185:3: (enumLiteral_0= 'one' )
                    // InternalUIDSL.g:2186:4: enumLiteral_0= 'one'
                    {
                    enumLiteral_0=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getCardinalityTypeAccess().getOneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCardinalityTypeAccess().getOneEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUIDSL.g:2193:3: (enumLiteral_1= 'many' )
                    {
                    // InternalUIDSL.g:2193:3: (enumLiteral_1= 'many' )
                    // InternalUIDSL.g:2194:4: enumLiteral_1= 'many'
                    {
                    enumLiteral_1=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getCardinalityTypeAccess().getManyEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCardinalityTypeAccess().getManyEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleCardinalityType"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    static final String dfa_1s = "\35\uffff";
    static final String dfa_2s = "\14\4\1\57\1\16\1\4\2\uffff\13\60\1\4";
    static final String dfa_3s = "\1\56\13\4\1\57\1\17\1\55\2\uffff\13\60\1\4";
    static final String dfa_4s = "\17\uffff\1\2\1\1\14\uffff";
    static final String dfa_5s = "\35\uffff}>";
    static final String[] dfa_6s = {
            "\1\13\23\uffff\1\6\1\7\1\10\1\11\1\12\14\uffff\1\1\1\2\1\3\1\4\1\5\1\14",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\16",
            "\1\20\1\17",
            "\1\33\23\uffff\1\26\1\27\1\30\1\31\1\32\14\uffff\1\21\1\22\1\23\1\24\1\25",
            "",
            "",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\34",
            "\1\15"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "274:2: (this_Field_0= ruleField | this_Method_1= ruleMethod )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000001C0802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00007E059F002070L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000580002070L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00007E001F000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000208002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000580020070L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000580000070L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000801000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00007E001F002010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000580000060L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000001C000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x001E000000004000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x001E000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00003E001F000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000200000L});

}
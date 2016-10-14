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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'server_component'", "'{'", "'}'", "';'", "'('", "','", "')'", "'page'", "'template'", "':'", "'uses'", "'component'", "'allowed_nested_components'", "'child_component'", "'cardinality'", "'='", "'ALL'", "'required'", "'valueProperty'", "'#'", "'if'", "'for'", "'override'", "'fragment'", "'in'", "'.'", "'object'", "'enum'", "'collection'", "'any'", "'void'", "'or'", "'typeOf'", "'singleTypeOf'", "'defaults'", "'default'", "'input_component'", "'output_component'", "'input'", "'output'", "'class'", "'extends'", "'representation'", "'@id'", "'text'", "'email'", "'password'", "'file'", "'image'", "'L'", "'true'", "'false'", "'/'", "'null'", "'deleteByFlag'", "'inheritance'", "'SINGLE_TABLE'", "'TABLE_PER_CONCRETE_CLASS'", "'TABLE_PER_CLASS'", "'string'", "'int'", "'long'", "'boolean'", "'date'", "'List'", "'<'", "'>'", "'one'", "'many'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
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
    // InternalUIDSL.g:72:1: ruleUIModel returns [EObject current=null] : ( ( (lv_concepts_0_1= ruleServerComponent | lv_concepts_0_2= ruleUIContainer | lv_concepts_0_3= ruleUIComponent | lv_concepts_0_4= ruleDefaultConfigurations ) ) )* ;
    public final EObject ruleUIModel() throws RecognitionException {
        EObject current = null;

        EObject lv_concepts_0_1 = null;

        EObject lv_concepts_0_2 = null;

        EObject lv_concepts_0_3 = null;

        EObject lv_concepts_0_4 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:78:2: ( ( ( (lv_concepts_0_1= ruleServerComponent | lv_concepts_0_2= ruleUIContainer | lv_concepts_0_3= ruleUIComponent | lv_concepts_0_4= ruleDefaultConfigurations ) ) )* )
            // InternalUIDSL.g:79:2: ( ( (lv_concepts_0_1= ruleServerComponent | lv_concepts_0_2= ruleUIContainer | lv_concepts_0_3= ruleUIComponent | lv_concepts_0_4= ruleDefaultConfigurations ) ) )*
            {
            // InternalUIDSL.g:79:2: ( ( (lv_concepts_0_1= ruleServerComponent | lv_concepts_0_2= ruleUIContainer | lv_concepts_0_3= ruleUIComponent | lv_concepts_0_4= ruleDefaultConfigurations ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11||(LA2_0>=18 && LA2_0<=19)||LA2_0==22||LA2_0==34||LA2_0==45) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalUIDSL.g:80:3: ( (lv_concepts_0_1= ruleServerComponent | lv_concepts_0_2= ruleUIContainer | lv_concepts_0_3= ruleUIComponent | lv_concepts_0_4= ruleDefaultConfigurations ) )
            	    {
            	    // InternalUIDSL.g:80:3: ( (lv_concepts_0_1= ruleServerComponent | lv_concepts_0_2= ruleUIContainer | lv_concepts_0_3= ruleUIComponent | lv_concepts_0_4= ruleDefaultConfigurations ) )
            	    // InternalUIDSL.g:81:4: (lv_concepts_0_1= ruleServerComponent | lv_concepts_0_2= ruleUIContainer | lv_concepts_0_3= ruleUIComponent | lv_concepts_0_4= ruleDefaultConfigurations )
            	    {
            	    // InternalUIDSL.g:81:4: (lv_concepts_0_1= ruleServerComponent | lv_concepts_0_2= ruleUIContainer | lv_concepts_0_3= ruleUIComponent | lv_concepts_0_4= ruleDefaultConfigurations )
            	    int alt1=4;
            	    switch ( input.LA(1) ) {
            	    case 11:
            	        {
            	        alt1=1;
            	        }
            	        break;
            	    case 18:
            	    case 19:
            	    case 34:
            	        {
            	        alt1=2;
            	        }
            	        break;
            	    case 22:
            	        {
            	        alt1=3;
            	        }
            	        break;
            	    case 45:
            	        {
            	        alt1=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt1) {
            	        case 1 :
            	            // InternalUIDSL.g:82:5: lv_concepts_0_1= ruleServerComponent
            	            {

            	            					newCompositeNode(grammarAccess.getUIModelAccess().getConceptsServerComponentParserRuleCall_0_0());
            	            				
            	            pushFollow(FOLLOW_3);
            	            lv_concepts_0_1=ruleServerComponent();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getUIModelRule());
            	            					}
            	            					add(
            	            						current,
            	            						"concepts",
            	            						lv_concepts_0_1,
            	            						"com.stefanvuckovic.uidsl.UIDSL.ServerComponent");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalUIDSL.g:98:5: lv_concepts_0_2= ruleUIContainer
            	            {

            	            					newCompositeNode(grammarAccess.getUIModelAccess().getConceptsUIContainerParserRuleCall_0_1());
            	            				
            	            pushFollow(FOLLOW_3);
            	            lv_concepts_0_2=ruleUIContainer();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getUIModelRule());
            	            					}
            	            					add(
            	            						current,
            	            						"concepts",
            	            						lv_concepts_0_2,
            	            						"com.stefanvuckovic.uidsl.UIDSL.UIContainer");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;
            	        case 3 :
            	            // InternalUIDSL.g:114:5: lv_concepts_0_3= ruleUIComponent
            	            {

            	            					newCompositeNode(grammarAccess.getUIModelAccess().getConceptsUIComponentParserRuleCall_0_2());
            	            				
            	            pushFollow(FOLLOW_3);
            	            lv_concepts_0_3=ruleUIComponent();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getUIModelRule());
            	            					}
            	            					add(
            	            						current,
            	            						"concepts",
            	            						lv_concepts_0_3,
            	            						"com.stefanvuckovic.uidsl.UIDSL.UIComponent");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;
            	        case 4 :
            	            // InternalUIDSL.g:130:5: lv_concepts_0_4= ruleDefaultConfigurations
            	            {

            	            					newCompositeNode(grammarAccess.getUIModelAccess().getConceptsDefaultConfigurationsParserRuleCall_0_3());
            	            				
            	            pushFollow(FOLLOW_3);
            	            lv_concepts_0_4=ruleDefaultConfigurations();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getUIModelRule());
            	            					}
            	            					add(
            	            						current,
            	            						"concepts",
            	            						lv_concepts_0_4,
            	            						"com.stefanvuckovic.uidsl.UIDSL.DefaultConfigurations");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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


    // $ANTLR start "entryRuleServerComponent"
    // InternalUIDSL.g:151:1: entryRuleServerComponent returns [EObject current=null] : iv_ruleServerComponent= ruleServerComponent EOF ;
    public final EObject entryRuleServerComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServerComponent = null;


        try {
            // InternalUIDSL.g:151:56: (iv_ruleServerComponent= ruleServerComponent EOF )
            // InternalUIDSL.g:152:2: iv_ruleServerComponent= ruleServerComponent EOF
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
    // InternalUIDSL.g:158:1: ruleServerComponent returns [EObject current=null] : ( () otherlv_1= 'server_component' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_members_4_0= ruleMember ) )* otherlv_5= '}' ) ;
    public final EObject ruleServerComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_members_4_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:164:2: ( ( () otherlv_1= 'server_component' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_members_4_0= ruleMember ) )* otherlv_5= '}' ) )
            // InternalUIDSL.g:165:2: ( () otherlv_1= 'server_component' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_members_4_0= ruleMember ) )* otherlv_5= '}' )
            {
            // InternalUIDSL.g:165:2: ( () otherlv_1= 'server_component' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_members_4_0= ruleMember ) )* otherlv_5= '}' )
            // InternalUIDSL.g:166:3: () otherlv_1= 'server_component' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_members_4_0= ruleMember ) )* otherlv_5= '}'
            {
            // InternalUIDSL.g:166:3: ()
            // InternalUIDSL.g:167:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getServerComponentAccess().getServerComponentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getServerComponentAccess().getServer_componentKeyword_1());
            		
            // InternalUIDSL.g:177:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUIDSL.g:178:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUIDSL.g:178:4: (lv_name_2_0= RULE_ID )
            // InternalUIDSL.g:179:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getServerComponentAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServerComponentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getServerComponentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUIDSL.g:199:3: ( (lv_members_4_0= ruleMember ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||LA3_0==41||(LA3_0>=55 && LA3_0<=59)||(LA3_0>=70 && LA3_0<=75)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalUIDSL.g:200:4: (lv_members_4_0= ruleMember )
            	    {
            	    // InternalUIDSL.g:200:4: (lv_members_4_0= ruleMember )
            	    // InternalUIDSL.g:201:5: lv_members_4_0= ruleMember
            	    {

            	    					newCompositeNode(grammarAccess.getServerComponentAccess().getMembersMemberParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_members_4_0=ruleMember();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getServerComponentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"members",
            	    						lv_members_4_0,
            	    						"com.stefanvuckovic.uidsl.UIDSL.Member");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // InternalUIDSL.g:226:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // InternalUIDSL.g:226:47: (iv_ruleMember= ruleMember EOF )
            // InternalUIDSL.g:227:2: iv_ruleMember= ruleMember EOF
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
    // InternalUIDSL.g:233:1: ruleMember returns [EObject current=null] : (this_Field_0= ruleField | this_Method_1= ruleMethod ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        EObject this_Field_0 = null;

        EObject this_Method_1 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:239:2: ( (this_Field_0= ruleField | this_Method_1= ruleMethod ) )
            // InternalUIDSL.g:240:2: (this_Field_0= ruleField | this_Method_1= ruleMethod )
            {
            // InternalUIDSL.g:240:2: (this_Field_0= ruleField | this_Method_1= ruleMethod )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalUIDSL.g:241:3: this_Field_0= ruleField
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
                    // InternalUIDSL.g:250:3: this_Method_1= ruleMethod
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
    // InternalUIDSL.g:262:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalUIDSL.g:262:46: (iv_ruleField= ruleField EOF )
            // InternalUIDSL.g:263:2: iv_ruleField= ruleField EOF
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
    // InternalUIDSL.g:269:1: ruleField returns [EObject current=null] : (this_TypedConcept_0= ruleTypedConcept[$current] otherlv_1= ';' ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_TypedConcept_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:275:2: ( (this_TypedConcept_0= ruleTypedConcept[$current] otherlv_1= ';' ) )
            // InternalUIDSL.g:276:2: (this_TypedConcept_0= ruleTypedConcept[$current] otherlv_1= ';' )
            {
            // InternalUIDSL.g:276:2: (this_TypedConcept_0= ruleTypedConcept[$current] otherlv_1= ';' )
            // InternalUIDSL.g:277:3: this_TypedConcept_0= ruleTypedConcept[$current] otherlv_1= ';'
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getFieldRule());
            			}
            			newCompositeNode(grammarAccess.getFieldAccess().getTypedConceptParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
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
    // InternalUIDSL.g:296:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalUIDSL.g:296:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalUIDSL.g:297:2: iv_ruleMethod= ruleMethod EOF
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
    // InternalUIDSL.g:303:1: ruleMethod returns [EObject current=null] : (this_TypedConcept_0= ruleTypedConcept[$current] otherlv_1= '(' ( ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) )* )? otherlv_5= ')' otherlv_6= ';' ) ;
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
            // InternalUIDSL.g:309:2: ( (this_TypedConcept_0= ruleTypedConcept[$current] otherlv_1= '(' ( ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) )* )? otherlv_5= ')' otherlv_6= ';' ) )
            // InternalUIDSL.g:310:2: (this_TypedConcept_0= ruleTypedConcept[$current] otherlv_1= '(' ( ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) )* )? otherlv_5= ')' otherlv_6= ';' )
            {
            // InternalUIDSL.g:310:2: (this_TypedConcept_0= ruleTypedConcept[$current] otherlv_1= '(' ( ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) )* )? otherlv_5= ')' otherlv_6= ';' )
            // InternalUIDSL.g:311:3: this_TypedConcept_0= ruleTypedConcept[$current] otherlv_1= '(' ( ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) )* )? otherlv_5= ')' otherlv_6= ';'
            {

            			if (current==null) {
            				current = createModelElement(grammarAccess.getMethodRule());
            			}
            			newCompositeNode(grammarAccess.getMethodAccess().getTypedConceptParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_TypedConcept_0=ruleTypedConcept(current);

            state._fsp--;


            			current = this_TypedConcept_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_1());
            		
            // InternalUIDSL.g:326:3: ( ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID||LA6_0==41||(LA6_0>=55 && LA6_0<=59)||(LA6_0>=70 && LA6_0<=75)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalUIDSL.g:327:4: ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) )*
                    {
                    // InternalUIDSL.g:327:4: ( (lv_params_2_0= ruleVariable ) )
                    // InternalUIDSL.g:328:5: (lv_params_2_0= ruleVariable )
                    {
                    // InternalUIDSL.g:328:5: (lv_params_2_0= ruleVariable )
                    // InternalUIDSL.g:329:6: lv_params_2_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getMethodAccess().getParamsVariableParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_10);
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

                    // InternalUIDSL.g:346:4: (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==16) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalUIDSL.g:347:5: otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_11); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getMethodAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalUIDSL.g:351:5: ( (lv_params_4_0= ruleVariable ) )
                    	    // InternalUIDSL.g:352:6: (lv_params_4_0= ruleVariable )
                    	    {
                    	    // InternalUIDSL.g:352:6: (lv_params_4_0= ruleVariable )
                    	    // InternalUIDSL.g:353:7: lv_params_4_0= ruleVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getMethodAccess().getParamsVariableParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
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
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getMethodAccess().getRightParenthesisKeyword_3());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMethodAccess().getSemicolonKeyword_4());
            		

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
    // InternalUIDSL.g:384:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalUIDSL.g:384:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalUIDSL.g:385:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalUIDSL.g:391:1: ruleVariable returns [EObject current=null] : this_TypedConcept_0= ruleTypedConcept[$current] ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        EObject this_TypedConcept_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:397:2: (this_TypedConcept_0= ruleTypedConcept[$current] )
            // InternalUIDSL.g:398:2: this_TypedConcept_0= ruleTypedConcept[$current]
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


    // $ANTLR start "entryRuleInlineVariable"
    // InternalUIDSL.g:412:1: entryRuleInlineVariable returns [EObject current=null] : iv_ruleInlineVariable= ruleInlineVariable EOF ;
    public final EObject entryRuleInlineVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlineVariable = null;


        try {
            // InternalUIDSL.g:412:55: (iv_ruleInlineVariable= ruleInlineVariable EOF )
            // InternalUIDSL.g:413:2: iv_ruleInlineVariable= ruleInlineVariable EOF
            {
             newCompositeNode(grammarAccess.getInlineVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInlineVariable=ruleInlineVariable();

            state._fsp--;

             current =iv_ruleInlineVariable; 
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
    // $ANTLR end "entryRuleInlineVariable"


    // $ANTLR start "ruleInlineVariable"
    // InternalUIDSL.g:419:1: ruleInlineVariable returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleInlineVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalUIDSL.g:425:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalUIDSL.g:426:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalUIDSL.g:426:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalUIDSL.g:427:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalUIDSL.g:427:3: ()
            // InternalUIDSL.g:428:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInlineVariableAccess().getInlineVariableAction_0(),
            					current);
            			

            }

            // InternalUIDSL.g:434:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUIDSL.g:435:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUIDSL.g:435:4: (lv_name_1_0= RULE_ID )
            // InternalUIDSL.g:436:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInlineVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInlineVariableRule());
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
    // $ANTLR end "ruleInlineVariable"


    // $ANTLR start "ruleTypedConcept"
    // InternalUIDSL.g:457:1: ruleTypedConcept[EObject in_current] returns [EObject current=in_current] : ( ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTypedConcept(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:463:2: ( ( ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalUIDSL.g:464:2: ( ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalUIDSL.g:464:2: ( ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalUIDSL.g:465:3: ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalUIDSL.g:465:3: ( (lv_type_0_0= ruleAttributeType ) )
            // InternalUIDSL.g:466:4: (lv_type_0_0= ruleAttributeType )
            {
            // InternalUIDSL.g:466:4: (lv_type_0_0= ruleAttributeType )
            // InternalUIDSL.g:467:5: lv_type_0_0= ruleAttributeType
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
            						"com.stefanvuckovic.uidsl.UIDSL.AttributeType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUIDSL.g:484:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUIDSL.g:485:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUIDSL.g:485:4: (lv_name_1_0= RULE_ID )
            // InternalUIDSL.g:486:5: lv_name_1_0= RULE_ID
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
    // InternalUIDSL.g:506:1: entryRuleUIContainer returns [EObject current=null] : iv_ruleUIContainer= ruleUIContainer EOF ;
    public final EObject entryRuleUIContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIContainer = null;


        try {
            // InternalUIDSL.g:506:52: (iv_ruleUIContainer= ruleUIContainer EOF )
            // InternalUIDSL.g:507:2: iv_ruleUIContainer= ruleUIContainer EOF
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
    // InternalUIDSL.g:513:1: ruleUIContainer returns [EObject current=null] : (this_Page_0= rulePage | this_Template_1= ruleTemplate | this_Fragment_2= ruleFragment ) ;
    public final EObject ruleUIContainer() throws RecognitionException {
        EObject current = null;

        EObject this_Page_0 = null;

        EObject this_Template_1 = null;

        EObject this_Fragment_2 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:519:2: ( (this_Page_0= rulePage | this_Template_1= ruleTemplate | this_Fragment_2= ruleFragment ) )
            // InternalUIDSL.g:520:2: (this_Page_0= rulePage | this_Template_1= ruleTemplate | this_Fragment_2= ruleFragment )
            {
            // InternalUIDSL.g:520:2: (this_Page_0= rulePage | this_Template_1= ruleTemplate | this_Fragment_2= ruleFragment )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt7=1;
                }
                break;
            case 19:
                {
                alt7=2;
                }
                break;
            case 34:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalUIDSL.g:521:3: this_Page_0= rulePage
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
                    // InternalUIDSL.g:530:3: this_Template_1= ruleTemplate
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
                    // InternalUIDSL.g:539:3: this_Fragment_2= ruleFragment
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
    // InternalUIDSL.g:551:1: entryRulePage returns [EObject current=null] : iv_rulePage= rulePage EOF ;
    public final EObject entryRulePage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePage = null;


        try {
            // InternalUIDSL.g:551:45: (iv_rulePage= rulePage EOF )
            // InternalUIDSL.g:552:2: iv_rulePage= rulePage EOF
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
    // InternalUIDSL.g:558:1: rulePage returns [EObject current=null] : (otherlv_0= 'page' this_UIContainerDefinition_1= ruleUIContainerDefinition[$current] this_ServerComponentUsage_2= ruleServerComponentUsage[$current] (otherlv_3= 'template' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '{' ( ( (lv_elements_7_1= ruleUIElement | lv_elements_7_2= ruleTemplateFragmentOverride ) ) )* otherlv_8= '}' ) ;
    public final EObject rulePage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_UIContainerDefinition_1 = null;

        EObject this_ServerComponentUsage_2 = null;

        EObject lv_elements_7_1 = null;

        EObject lv_elements_7_2 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:564:2: ( (otherlv_0= 'page' this_UIContainerDefinition_1= ruleUIContainerDefinition[$current] this_ServerComponentUsage_2= ruleServerComponentUsage[$current] (otherlv_3= 'template' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '{' ( ( (lv_elements_7_1= ruleUIElement | lv_elements_7_2= ruleTemplateFragmentOverride ) ) )* otherlv_8= '}' ) )
            // InternalUIDSL.g:565:2: (otherlv_0= 'page' this_UIContainerDefinition_1= ruleUIContainerDefinition[$current] this_ServerComponentUsage_2= ruleServerComponentUsage[$current] (otherlv_3= 'template' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '{' ( ( (lv_elements_7_1= ruleUIElement | lv_elements_7_2= ruleTemplateFragmentOverride ) ) )* otherlv_8= '}' )
            {
            // InternalUIDSL.g:565:2: (otherlv_0= 'page' this_UIContainerDefinition_1= ruleUIContainerDefinition[$current] this_ServerComponentUsage_2= ruleServerComponentUsage[$current] (otherlv_3= 'template' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '{' ( ( (lv_elements_7_1= ruleUIElement | lv_elements_7_2= ruleTemplateFragmentOverride ) ) )* otherlv_8= '}' )
            // InternalUIDSL.g:566:3: otherlv_0= 'page' this_UIContainerDefinition_1= ruleUIContainerDefinition[$current] this_ServerComponentUsage_2= ruleServerComponentUsage[$current] (otherlv_3= 'template' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '{' ( ( (lv_elements_7_1= ruleUIElement | lv_elements_7_2= ruleTemplateFragmentOverride ) ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPageAccess().getPageKeyword_0());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getPageRule());
            			}
            			newCompositeNode(grammarAccess.getPageAccess().getUIContainerDefinitionParserRuleCall_1());
            		
            pushFollow(FOLLOW_12);
            this_UIContainerDefinition_1=ruleUIContainerDefinition(current);

            state._fsp--;


            			current = this_UIContainerDefinition_1;
            			afterParserOrEnumRuleCall();
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getPageRule());
            			}
            			newCompositeNode(grammarAccess.getPageAccess().getServerComponentUsageParserRuleCall_2());
            		
            pushFollow(FOLLOW_13);
            this_ServerComponentUsage_2=ruleServerComponentUsage(current);

            state._fsp--;


            			current = this_ServerComponentUsage_2;
            			afterParserOrEnumRuleCall();
            		
            // InternalUIDSL.g:592:3: (otherlv_3= 'template' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalUIDSL.g:593:4: otherlv_3= 'template' otherlv_4= ':' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getPageAccess().getTemplateKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getPageAccess().getColonKeyword_3_1());
                    			
                    // InternalUIDSL.g:601:4: ( (otherlv_5= RULE_ID ) )
                    // InternalUIDSL.g:602:5: (otherlv_5= RULE_ID )
                    {
                    // InternalUIDSL.g:602:5: (otherlv_5= RULE_ID )
                    // InternalUIDSL.g:603:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPageRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(otherlv_5, grammarAccess.getPageAccess().getTemplateTemplateCrossReference_3_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalUIDSL.g:619:3: ( ( (lv_elements_7_1= ruleUIElement | lv_elements_7_2= ruleTemplateFragmentOverride ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||(LA10_0>=30 && LA10_0<=33)||(LA10_0>=49 && LA10_0<=50)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalUIDSL.g:620:4: ( (lv_elements_7_1= ruleUIElement | lv_elements_7_2= ruleTemplateFragmentOverride ) )
            	    {
            	    // InternalUIDSL.g:620:4: ( (lv_elements_7_1= ruleUIElement | lv_elements_7_2= ruleTemplateFragmentOverride ) )
            	    // InternalUIDSL.g:621:5: (lv_elements_7_1= ruleUIElement | lv_elements_7_2= ruleTemplateFragmentOverride )
            	    {
            	    // InternalUIDSL.g:621:5: (lv_elements_7_1= ruleUIElement | lv_elements_7_2= ruleTemplateFragmentOverride )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==RULE_ID||(LA9_0>=30 && LA9_0<=32)||(LA9_0>=49 && LA9_0<=50)) ) {
            	        alt9=1;
            	    }
            	    else if ( (LA9_0==33) ) {
            	        alt9=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalUIDSL.g:622:6: lv_elements_7_1= ruleUIElement
            	            {

            	            						newCompositeNode(grammarAccess.getPageAccess().getElementsUIElementParserRuleCall_5_0_0());
            	            					
            	            pushFollow(FOLLOW_15);
            	            lv_elements_7_1=ruleUIElement();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getPageRule());
            	            						}
            	            						add(
            	            							current,
            	            							"elements",
            	            							lv_elements_7_1,
            	            							"com.stefanvuckovic.uidsl.UIDSL.UIElement");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalUIDSL.g:638:6: lv_elements_7_2= ruleTemplateFragmentOverride
            	            {

            	            						newCompositeNode(grammarAccess.getPageAccess().getElementsTemplateFragmentOverrideParserRuleCall_5_0_1());
            	            					
            	            pushFollow(FOLLOW_15);
            	            lv_elements_7_2=ruleTemplateFragmentOverride();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getPageRule());
            	            						}
            	            						add(
            	            							current,
            	            							"elements",
            	            							lv_elements_7_2,
            	            							"com.stefanvuckovic.uidsl.UIDSL.TemplateFragmentOverride");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_6());
            		

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


    // $ANTLR start "ruleUIContainerDefinition"
    // InternalUIDSL.g:665:1: ruleUIContainerDefinition[EObject in_current] returns [EObject current=in_current] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleUIContainerDefinition(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:671:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) )* )? otherlv_5= ')' ) )
            // InternalUIDSL.g:672:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) )* )? otherlv_5= ')' )
            {
            // InternalUIDSL.g:672:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) )* )? otherlv_5= ')' )
            // InternalUIDSL.g:673:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) )* )? otherlv_5= ')'
            {
            // InternalUIDSL.g:673:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalUIDSL.g:674:4: (lv_name_0_0= RULE_ID )
            {
            // InternalUIDSL.g:674:4: (lv_name_0_0= RULE_ID )
            // InternalUIDSL.g:675:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_0_0, grammarAccess.getUIContainerDefinitionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUIContainerDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getUIContainerDefinitionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalUIDSL.g:695:3: ( ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID||LA12_0==41||(LA12_0>=55 && LA12_0<=59)||(LA12_0>=70 && LA12_0<=75)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalUIDSL.g:696:4: ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) )*
                    {
                    // InternalUIDSL.g:696:4: ( (lv_params_2_0= ruleVariable ) )
                    // InternalUIDSL.g:697:5: (lv_params_2_0= ruleVariable )
                    {
                    // InternalUIDSL.g:697:5: (lv_params_2_0= ruleVariable )
                    // InternalUIDSL.g:698:6: lv_params_2_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getUIContainerDefinitionAccess().getParamsVariableParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_params_2_0=ruleVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUIContainerDefinitionRule());
                    						}
                    						add(
                    							current,
                    							"params",
                    							lv_params_2_0,
                    							"com.stefanvuckovic.uidsl.UIDSL.Variable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUIDSL.g:715:4: (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==16) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalUIDSL.g:716:5: otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_11); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getUIContainerDefinitionAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalUIDSL.g:720:5: ( (lv_params_4_0= ruleVariable ) )
                    	    // InternalUIDSL.g:721:6: (lv_params_4_0= ruleVariable )
                    	    {
                    	    // InternalUIDSL.g:721:6: (lv_params_4_0= ruleVariable )
                    	    // InternalUIDSL.g:722:7: lv_params_4_0= ruleVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getUIContainerDefinitionAccess().getParamsVariableParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_params_4_0=ruleVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUIContainerDefinitionRule());
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
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getUIContainerDefinitionAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleUIContainerDefinition"


    // $ANTLR start "ruleServerComponentUsage"
    // InternalUIDSL.g:750:1: ruleServerComponentUsage[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'uses' ( (lv_serverComponents_1_0= ruleVariable ) ) (otherlv_2= ',' ( (lv_serverComponents_3_0= ruleVariable ) ) )* )? ;
    public final EObject ruleServerComponentUsage(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_serverComponents_1_0 = null;

        EObject lv_serverComponents_3_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:756:2: ( (otherlv_0= 'uses' ( (lv_serverComponents_1_0= ruleVariable ) ) (otherlv_2= ',' ( (lv_serverComponents_3_0= ruleVariable ) ) )* )? )
            // InternalUIDSL.g:757:2: (otherlv_0= 'uses' ( (lv_serverComponents_1_0= ruleVariable ) ) (otherlv_2= ',' ( (lv_serverComponents_3_0= ruleVariable ) ) )* )?
            {
            // InternalUIDSL.g:757:2: (otherlv_0= 'uses' ( (lv_serverComponents_1_0= ruleVariable ) ) (otherlv_2= ',' ( (lv_serverComponents_3_0= ruleVariable ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalUIDSL.g:758:3: otherlv_0= 'uses' ( (lv_serverComponents_1_0= ruleVariable ) ) (otherlv_2= ',' ( (lv_serverComponents_3_0= ruleVariable ) ) )*
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_11); 

                    			newLeafNode(otherlv_0, grammarAccess.getServerComponentUsageAccess().getUsesKeyword_0());
                    		
                    // InternalUIDSL.g:762:3: ( (lv_serverComponents_1_0= ruleVariable ) )
                    // InternalUIDSL.g:763:4: (lv_serverComponents_1_0= ruleVariable )
                    {
                    // InternalUIDSL.g:763:4: (lv_serverComponents_1_0= ruleVariable )
                    // InternalUIDSL.g:764:5: lv_serverComponents_1_0= ruleVariable
                    {

                    					newCompositeNode(grammarAccess.getServerComponentUsageAccess().getServerComponentsVariableParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_16);
                    lv_serverComponents_1_0=ruleVariable();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getServerComponentUsageRule());
                    					}
                    					add(
                    						current,
                    						"serverComponents",
                    						lv_serverComponents_1_0,
                    						"com.stefanvuckovic.uidsl.UIDSL.Variable");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }

                    // InternalUIDSL.g:781:3: (otherlv_2= ',' ( (lv_serverComponents_3_0= ruleVariable ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==16) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalUIDSL.g:782:4: otherlv_2= ',' ( (lv_serverComponents_3_0= ruleVariable ) )
                    	    {
                    	    otherlv_2=(Token)match(input,16,FOLLOW_11); 

                    	    				newLeafNode(otherlv_2, grammarAccess.getServerComponentUsageAccess().getCommaKeyword_2_0());
                    	    			
                    	    // InternalUIDSL.g:786:4: ( (lv_serverComponents_3_0= ruleVariable ) )
                    	    // InternalUIDSL.g:787:5: (lv_serverComponents_3_0= ruleVariable )
                    	    {
                    	    // InternalUIDSL.g:787:5: (lv_serverComponents_3_0= ruleVariable )
                    	    // InternalUIDSL.g:788:6: lv_serverComponents_3_0= ruleVariable
                    	    {

                    	    						newCompositeNode(grammarAccess.getServerComponentUsageAccess().getServerComponentsVariableParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_16);
                    	    lv_serverComponents_3_0=ruleVariable();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getServerComponentUsageRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"serverComponents",
                    	    							lv_serverComponents_3_0,
                    	    							"com.stefanvuckovic.uidsl.UIDSL.Variable");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


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
    // $ANTLR end "ruleServerComponentUsage"


    // $ANTLR start "entryRuleUIElement"
    // InternalUIDSL.g:810:1: entryRuleUIElement returns [EObject current=null] : iv_ruleUIElement= ruleUIElement EOF ;
    public final EObject entryRuleUIElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIElement = null;


        try {
            // InternalUIDSL.g:810:50: (iv_ruleUIElement= ruleUIElement EOF )
            // InternalUIDSL.g:811:2: iv_ruleUIElement= ruleUIElement EOF
            {
             newCompositeNode(grammarAccess.getUIElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUIElement=ruleUIElement();

            state._fsp--;

             current =iv_ruleUIElement; 
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
    // $ANTLR end "entryRuleUIElement"


    // $ANTLR start "ruleUIElement"
    // InternalUIDSL.g:817:1: ruleUIElement returns [EObject current=null] : (this_Component_0= ruleComponent | this_LogicElement_1= ruleLogicElement | this_FragmentCall_2= ruleFragmentCall ) ;
    public final EObject ruleUIElement() throws RecognitionException {
        EObject current = null;

        EObject this_Component_0 = null;

        EObject this_LogicElement_1 = null;

        EObject this_FragmentCall_2 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:823:2: ( (this_Component_0= ruleComponent | this_LogicElement_1= ruleLogicElement | this_FragmentCall_2= ruleFragmentCall ) )
            // InternalUIDSL.g:824:2: (this_Component_0= ruleComponent | this_LogicElement_1= ruleLogicElement | this_FragmentCall_2= ruleFragmentCall )
            {
            // InternalUIDSL.g:824:2: (this_Component_0= ruleComponent | this_LogicElement_1= ruleLogicElement | this_FragmentCall_2= ruleFragmentCall )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 30:
            case 49:
            case 50:
                {
                alt15=1;
                }
                break;
            case 31:
            case 32:
                {
                alt15=2;
                }
                break;
            case RULE_ID:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalUIDSL.g:825:3: this_Component_0= ruleComponent
                    {

                    			newCompositeNode(grammarAccess.getUIElementAccess().getComponentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Component_0=ruleComponent();

                    state._fsp--;


                    			current = this_Component_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUIDSL.g:834:3: this_LogicElement_1= ruleLogicElement
                    {

                    			newCompositeNode(grammarAccess.getUIElementAccess().getLogicElementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicElement_1=ruleLogicElement();

                    state._fsp--;


                    			current = this_LogicElement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUIDSL.g:843:3: this_FragmentCall_2= ruleFragmentCall
                    {

                    			newCompositeNode(grammarAccess.getUIElementAccess().getFragmentCallParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_FragmentCall_2=ruleFragmentCall();

                    state._fsp--;


                    			current = this_FragmentCall_2;
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
    // $ANTLR end "ruleUIElement"


    // $ANTLR start "entryRuleUIComponent"
    // InternalUIDSL.g:855:1: entryRuleUIComponent returns [EObject current=null] : iv_ruleUIComponent= ruleUIComponent EOF ;
    public final EObject entryRuleUIComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIComponent = null;


        try {
            // InternalUIDSL.g:855:52: (iv_ruleUIComponent= ruleUIComponent EOF )
            // InternalUIDSL.g:856:2: iv_ruleUIComponent= ruleUIComponent EOF
            {
             newCompositeNode(grammarAccess.getUIComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUIComponent=ruleUIComponent();

            state._fsp--;

             current =iv_ruleUIComponent; 
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
    // $ANTLR end "entryRuleUIComponent"


    // $ANTLR start "ruleUIComponent"
    // InternalUIDSL.g:862:1: ruleUIComponent returns [EObject current=null] : (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= rulePropertyValue ) )* ( (lv_nested_4_0= ruleNestedComponent ) )? otherlv_5= '}' ) ;
    public final EObject ruleUIComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_properties_3_0 = null;

        EObject lv_nested_4_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:868:2: ( (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= rulePropertyValue ) )* ( (lv_nested_4_0= ruleNestedComponent ) )? otherlv_5= '}' ) )
            // InternalUIDSL.g:869:2: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= rulePropertyValue ) )* ( (lv_nested_4_0= ruleNestedComponent ) )? otherlv_5= '}' )
            {
            // InternalUIDSL.g:869:2: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= rulePropertyValue ) )* ( (lv_nested_4_0= ruleNestedComponent ) )? otherlv_5= '}' )
            // InternalUIDSL.g:870:3: otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= rulePropertyValue ) )* ( (lv_nested_4_0= ruleNestedComponent ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getUIComponentAccess().getComponentKeyword_0());
            		
            // InternalUIDSL.g:874:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUIDSL.g:875:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUIDSL.g:875:4: (lv_name_1_0= RULE_ID )
            // InternalUIDSL.g:876:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getUIComponentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUIComponentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getUIComponentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUIDSL.g:896:3: ( (lv_properties_3_0= rulePropertyValue ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalUIDSL.g:897:4: (lv_properties_3_0= rulePropertyValue )
            	    {
            	    // InternalUIDSL.g:897:4: (lv_properties_3_0= rulePropertyValue )
            	    // InternalUIDSL.g:898:5: lv_properties_3_0= rulePropertyValue
            	    {

            	    					newCompositeNode(grammarAccess.getUIComponentAccess().getPropertiesPropertyValueParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_properties_3_0=rulePropertyValue();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUIComponentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_3_0,
            	    						"com.stefanvuckovic.uidsl.UIDSL.PropertyValue");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // InternalUIDSL.g:915:3: ( (lv_nested_4_0= ruleNestedComponent ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=23 && LA17_0<=24)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalUIDSL.g:916:4: (lv_nested_4_0= ruleNestedComponent )
                    {
                    // InternalUIDSL.g:916:4: (lv_nested_4_0= ruleNestedComponent )
                    // InternalUIDSL.g:917:5: lv_nested_4_0= ruleNestedComponent
                    {

                    					newCompositeNode(grammarAccess.getUIComponentAccess().getNestedNestedComponentParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_18);
                    lv_nested_4_0=ruleNestedComponent();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUIComponentRule());
                    					}
                    					set(
                    						current,
                    						"nested",
                    						lv_nested_4_0,
                    						"com.stefanvuckovic.uidsl.UIDSL.NestedComponent");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getUIComponentAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleUIComponent"


    // $ANTLR start "entryRuleNestedComponent"
    // InternalUIDSL.g:942:1: entryRuleNestedComponent returns [EObject current=null] : iv_ruleNestedComponent= ruleNestedComponent EOF ;
    public final EObject entryRuleNestedComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedComponent = null;


        try {
            // InternalUIDSL.g:942:56: (iv_ruleNestedComponent= ruleNestedComponent EOF )
            // InternalUIDSL.g:943:2: iv_ruleNestedComponent= ruleNestedComponent EOF
            {
             newCompositeNode(grammarAccess.getNestedComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNestedComponent=ruleNestedComponent();

            state._fsp--;

             current =iv_ruleNestedComponent; 
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
    // $ANTLR end "entryRuleNestedComponent"


    // $ANTLR start "ruleNestedComponent"
    // InternalUIDSL.g:949:1: ruleNestedComponent returns [EObject current=null] : (this_ChildUIComponent_0= ruleChildUIComponent | ( () otherlv_2= 'allowed_nested_components' otherlv_3= ':' ( (lv_nestedComponents_4_0= ruleAllowedNestedComponents ) ) ) ) ;
    public final EObject ruleNestedComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_ChildUIComponent_0 = null;

        EObject lv_nestedComponents_4_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:955:2: ( (this_ChildUIComponent_0= ruleChildUIComponent | ( () otherlv_2= 'allowed_nested_components' otherlv_3= ':' ( (lv_nestedComponents_4_0= ruleAllowedNestedComponents ) ) ) ) )
            // InternalUIDSL.g:956:2: (this_ChildUIComponent_0= ruleChildUIComponent | ( () otherlv_2= 'allowed_nested_components' otherlv_3= ':' ( (lv_nestedComponents_4_0= ruleAllowedNestedComponents ) ) ) )
            {
            // InternalUIDSL.g:956:2: (this_ChildUIComponent_0= ruleChildUIComponent | ( () otherlv_2= 'allowed_nested_components' otherlv_3= ':' ( (lv_nestedComponents_4_0= ruleAllowedNestedComponents ) ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) ) {
                alt18=1;
            }
            else if ( (LA18_0==23) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalUIDSL.g:957:3: this_ChildUIComponent_0= ruleChildUIComponent
                    {

                    			newCompositeNode(grammarAccess.getNestedComponentAccess().getChildUIComponentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ChildUIComponent_0=ruleChildUIComponent();

                    state._fsp--;


                    			current = this_ChildUIComponent_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUIDSL.g:966:3: ( () otherlv_2= 'allowed_nested_components' otherlv_3= ':' ( (lv_nestedComponents_4_0= ruleAllowedNestedComponents ) ) )
                    {
                    // InternalUIDSL.g:966:3: ( () otherlv_2= 'allowed_nested_components' otherlv_3= ':' ( (lv_nestedComponents_4_0= ruleAllowedNestedComponents ) ) )
                    // InternalUIDSL.g:967:4: () otherlv_2= 'allowed_nested_components' otherlv_3= ':' ( (lv_nestedComponents_4_0= ruleAllowedNestedComponents ) )
                    {
                    // InternalUIDSL.g:967:4: ()
                    // InternalUIDSL.g:968:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNestedComponentAccess().getExistingNestedComponentsAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,23,FOLLOW_14); 

                    				newLeafNode(otherlv_2, grammarAccess.getNestedComponentAccess().getAllowed_nested_componentsKeyword_1_1());
                    			
                    otherlv_3=(Token)match(input,20,FOLLOW_19); 

                    				newLeafNode(otherlv_3, grammarAccess.getNestedComponentAccess().getColonKeyword_1_2());
                    			
                    // InternalUIDSL.g:982:4: ( (lv_nestedComponents_4_0= ruleAllowedNestedComponents ) )
                    // InternalUIDSL.g:983:5: (lv_nestedComponents_4_0= ruleAllowedNestedComponents )
                    {
                    // InternalUIDSL.g:983:5: (lv_nestedComponents_4_0= ruleAllowedNestedComponents )
                    // InternalUIDSL.g:984:6: lv_nestedComponents_4_0= ruleAllowedNestedComponents
                    {

                    						newCompositeNode(grammarAccess.getNestedComponentAccess().getNestedComponentsAllowedNestedComponentsParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_nestedComponents_4_0=ruleAllowedNestedComponents();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNestedComponentRule());
                    						}
                    						set(
                    							current,
                    							"nestedComponents",
                    							lv_nestedComponents_4_0,
                    							"com.stefanvuckovic.uidsl.UIDSL.AllowedNestedComponents");
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
    // $ANTLR end "ruleNestedComponent"


    // $ANTLR start "entryRuleChildUIComponent"
    // InternalUIDSL.g:1006:1: entryRuleChildUIComponent returns [EObject current=null] : iv_ruleChildUIComponent= ruleChildUIComponent EOF ;
    public final EObject entryRuleChildUIComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChildUIComponent = null;


        try {
            // InternalUIDSL.g:1006:57: (iv_ruleChildUIComponent= ruleChildUIComponent EOF )
            // InternalUIDSL.g:1007:2: iv_ruleChildUIComponent= ruleChildUIComponent EOF
            {
             newCompositeNode(grammarAccess.getChildUIComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChildUIComponent=ruleChildUIComponent();

            state._fsp--;

             current =iv_ruleChildUIComponent; 
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
    // $ANTLR end "entryRuleChildUIComponent"


    // $ANTLR start "ruleChildUIComponent"
    // InternalUIDSL.g:1013:1: ruleChildUIComponent returns [EObject current=null] : (otherlv_0= 'child_component' otherlv_1= 'cardinality' otherlv_2= '=' ( (lv_cardinality_3_0= ruleCardinalityType ) ) otherlv_4= ':' ( (lv_comp_5_0= ruleUIComponent ) ) ) ;
    public final EObject ruleChildUIComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_cardinality_3_0 = null;

        EObject lv_comp_5_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:1019:2: ( (otherlv_0= 'child_component' otherlv_1= 'cardinality' otherlv_2= '=' ( (lv_cardinality_3_0= ruleCardinalityType ) ) otherlv_4= ':' ( (lv_comp_5_0= ruleUIComponent ) ) ) )
            // InternalUIDSL.g:1020:2: (otherlv_0= 'child_component' otherlv_1= 'cardinality' otherlv_2= '=' ( (lv_cardinality_3_0= ruleCardinalityType ) ) otherlv_4= ':' ( (lv_comp_5_0= ruleUIComponent ) ) )
            {
            // InternalUIDSL.g:1020:2: (otherlv_0= 'child_component' otherlv_1= 'cardinality' otherlv_2= '=' ( (lv_cardinality_3_0= ruleCardinalityType ) ) otherlv_4= ':' ( (lv_comp_5_0= ruleUIComponent ) ) )
            // InternalUIDSL.g:1021:3: otherlv_0= 'child_component' otherlv_1= 'cardinality' otherlv_2= '=' ( (lv_cardinality_3_0= ruleCardinalityType ) ) otherlv_4= ':' ( (lv_comp_5_0= ruleUIComponent ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getChildUIComponentAccess().getChild_componentKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getChildUIComponentAccess().getCardinalityKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getChildUIComponentAccess().getEqualsSignKeyword_2());
            		
            // InternalUIDSL.g:1033:3: ( (lv_cardinality_3_0= ruleCardinalityType ) )
            // InternalUIDSL.g:1034:4: (lv_cardinality_3_0= ruleCardinalityType )
            {
            // InternalUIDSL.g:1034:4: (lv_cardinality_3_0= ruleCardinalityType )
            // InternalUIDSL.g:1035:5: lv_cardinality_3_0= ruleCardinalityType
            {

            					newCompositeNode(grammarAccess.getChildUIComponentAccess().getCardinalityCardinalityTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
            lv_cardinality_3_0=ruleCardinalityType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChildUIComponentRule());
            					}
            					set(
            						current,
            						"cardinality",
            						lv_cardinality_3_0,
            						"com.stefanvuckovic.domainmodel.DomainModel.CardinalityType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_23); 

            			newLeafNode(otherlv_4, grammarAccess.getChildUIComponentAccess().getColonKeyword_4());
            		
            // InternalUIDSL.g:1056:3: ( (lv_comp_5_0= ruleUIComponent ) )
            // InternalUIDSL.g:1057:4: (lv_comp_5_0= ruleUIComponent )
            {
            // InternalUIDSL.g:1057:4: (lv_comp_5_0= ruleUIComponent )
            // InternalUIDSL.g:1058:5: lv_comp_5_0= ruleUIComponent
            {

            					newCompositeNode(grammarAccess.getChildUIComponentAccess().getCompUIComponentParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_comp_5_0=ruleUIComponent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChildUIComponentRule());
            					}
            					set(
            						current,
            						"comp",
            						lv_comp_5_0,
            						"com.stefanvuckovic.uidsl.UIDSL.UIComponent");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleChildUIComponent"


    // $ANTLR start "entryRuleAllowedNestedComponents"
    // InternalUIDSL.g:1079:1: entryRuleAllowedNestedComponents returns [EObject current=null] : iv_ruleAllowedNestedComponents= ruleAllowedNestedComponents EOF ;
    public final EObject entryRuleAllowedNestedComponents() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllowedNestedComponents = null;


        try {
            // InternalUIDSL.g:1079:64: (iv_ruleAllowedNestedComponents= ruleAllowedNestedComponents EOF )
            // InternalUIDSL.g:1080:2: iv_ruleAllowedNestedComponents= ruleAllowedNestedComponents EOF
            {
             newCompositeNode(grammarAccess.getAllowedNestedComponentsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAllowedNestedComponents=ruleAllowedNestedComponents();

            state._fsp--;

             current =iv_ruleAllowedNestedComponents; 
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
    // $ANTLR end "entryRuleAllowedNestedComponents"


    // $ANTLR start "ruleAllowedNestedComponents"
    // InternalUIDSL.g:1086:1: ruleAllowedNestedComponents returns [EObject current=null] : ( ( () otherlv_1= 'ALL' ) | ( () ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ) ) ;
    public final EObject ruleAllowedNestedComponents() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalUIDSL.g:1092:2: ( ( ( () otherlv_1= 'ALL' ) | ( () ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ) ) )
            // InternalUIDSL.g:1093:2: ( ( () otherlv_1= 'ALL' ) | ( () ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ) )
            {
            // InternalUIDSL.g:1093:2: ( ( () otherlv_1= 'ALL' ) | ( () ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_ID) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalUIDSL.g:1094:3: ( () otherlv_1= 'ALL' )
                    {
                    // InternalUIDSL.g:1094:3: ( () otherlv_1= 'ALL' )
                    // InternalUIDSL.g:1095:4: () otherlv_1= 'ALL'
                    {
                    // InternalUIDSL.g:1095:4: ()
                    // InternalUIDSL.g:1096:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAllowedNestedComponentsAccess().getAllAllowedComponentsAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getAllowedNestedComponentsAccess().getALLKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUIDSL.g:1108:3: ( () ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )
                    {
                    // InternalUIDSL.g:1108:3: ( () ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )
                    // InternalUIDSL.g:1109:4: () ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    {
                    // InternalUIDSL.g:1109:4: ()
                    // InternalUIDSL.g:1110:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAllowedNestedComponentsAccess().getCustomAllowedComponentsAction_1_0(),
                    						current);
                    				

                    }

                    // InternalUIDSL.g:1116:4: ( (otherlv_3= RULE_ID ) )
                    // InternalUIDSL.g:1117:5: (otherlv_3= RULE_ID )
                    {
                    // InternalUIDSL.g:1117:5: (otherlv_3= RULE_ID )
                    // InternalUIDSL.g:1118:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAllowedNestedComponentsRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_16); 

                    						newLeafNode(otherlv_3, grammarAccess.getAllowedNestedComponentsAccess().getComponentsUIComponentCrossReference_1_1_0());
                    					

                    }


                    }

                    // InternalUIDSL.g:1129:4: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==16) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalUIDSL.g:1130:5: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getAllowedNestedComponentsAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalUIDSL.g:1134:5: ( (otherlv_5= RULE_ID ) )
                    	    // InternalUIDSL.g:1135:6: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalUIDSL.g:1135:6: (otherlv_5= RULE_ID )
                    	    // InternalUIDSL.g:1136:7: otherlv_5= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAllowedNestedComponentsRule());
                    	    							}
                    	    						
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_16); 

                    	    							newLeafNode(otherlv_5, grammarAccess.getAllowedNestedComponentsAccess().getComponentsUIComponentCrossReference_1_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


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
    // $ANTLR end "ruleAllowedNestedComponents"


    // $ANTLR start "entryRulePropertyValue"
    // InternalUIDSL.g:1153:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // InternalUIDSL.g:1153:54: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalUIDSL.g:1154:2: iv_rulePropertyValue= rulePropertyValue EOF
            {
             newCompositeNode(grammarAccess.getPropertyValueRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyValue=rulePropertyValue();

            state._fsp--;

             current =iv_rulePropertyValue; 
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
    // $ANTLR end "entryRulePropertyValue"


    // $ANTLR start "rulePropertyValue"
    // InternalUIDSL.g:1160:1: rulePropertyValue returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_required_1_0= 'required' ) )? ( (lv_valueProperty_2_0= 'valueProperty' ) )? otherlv_3= ':' ( (lv_type_4_0= ruleTypeExpression ) ) ) ;
    public final EObject rulePropertyValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_required_1_0=null;
        Token lv_valueProperty_2_0=null;
        Token otherlv_3=null;
        EObject lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:1166:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_required_1_0= 'required' ) )? ( (lv_valueProperty_2_0= 'valueProperty' ) )? otherlv_3= ':' ( (lv_type_4_0= ruleTypeExpression ) ) ) )
            // InternalUIDSL.g:1167:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_required_1_0= 'required' ) )? ( (lv_valueProperty_2_0= 'valueProperty' ) )? otherlv_3= ':' ( (lv_type_4_0= ruleTypeExpression ) ) )
            {
            // InternalUIDSL.g:1167:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_required_1_0= 'required' ) )? ( (lv_valueProperty_2_0= 'valueProperty' ) )? otherlv_3= ':' ( (lv_type_4_0= ruleTypeExpression ) ) )
            // InternalUIDSL.g:1168:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_required_1_0= 'required' ) )? ( (lv_valueProperty_2_0= 'valueProperty' ) )? otherlv_3= ':' ( (lv_type_4_0= ruleTypeExpression ) )
            {
            // InternalUIDSL.g:1168:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalUIDSL.g:1169:4: (lv_name_0_0= RULE_ID )
            {
            // InternalUIDSL.g:1169:4: (lv_name_0_0= RULE_ID )
            // InternalUIDSL.g:1170:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_name_0_0, grammarAccess.getPropertyValueAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUIDSL.g:1186:3: ( (lv_required_1_0= 'required' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalUIDSL.g:1187:4: (lv_required_1_0= 'required' )
                    {
                    // InternalUIDSL.g:1187:4: (lv_required_1_0= 'required' )
                    // InternalUIDSL.g:1188:5: lv_required_1_0= 'required'
                    {
                    lv_required_1_0=(Token)match(input,28,FOLLOW_25); 

                    					newLeafNode(lv_required_1_0, grammarAccess.getPropertyValueAccess().getRequiredRequiredKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPropertyValueRule());
                    					}
                    					setWithLastConsumed(current, "required", true, "required");
                    				

                    }


                    }
                    break;

            }

            // InternalUIDSL.g:1200:3: ( (lv_valueProperty_2_0= 'valueProperty' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalUIDSL.g:1201:4: (lv_valueProperty_2_0= 'valueProperty' )
                    {
                    // InternalUIDSL.g:1201:4: (lv_valueProperty_2_0= 'valueProperty' )
                    // InternalUIDSL.g:1202:5: lv_valueProperty_2_0= 'valueProperty'
                    {
                    lv_valueProperty_2_0=(Token)match(input,29,FOLLOW_14); 

                    					newLeafNode(lv_valueProperty_2_0, grammarAccess.getPropertyValueAccess().getValuePropertyValuePropertyKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPropertyValueRule());
                    					}
                    					setWithLastConsumed(current, "valueProperty", true, "valueProperty");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,20,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getPropertyValueAccess().getColonKeyword_3());
            		
            // InternalUIDSL.g:1218:3: ( (lv_type_4_0= ruleTypeExpression ) )
            // InternalUIDSL.g:1219:4: (lv_type_4_0= ruleTypeExpression )
            {
            // InternalUIDSL.g:1219:4: (lv_type_4_0= ruleTypeExpression )
            // InternalUIDSL.g:1220:5: lv_type_4_0= ruleTypeExpression
            {

            					newCompositeNode(grammarAccess.getPropertyValueAccess().getTypeTypeExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_4_0=ruleTypeExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyValueRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"com.stefanvuckovic.uidsl.UIDSL.TypeExpression");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "rulePropertyValue"


    // $ANTLR start "entryRuleUIComponentInstance"
    // InternalUIDSL.g:1241:1: entryRuleUIComponentInstance returns [EObject current=null] : iv_ruleUIComponentInstance= ruleUIComponentInstance EOF ;
    public final EObject entryRuleUIComponentInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIComponentInstance = null;


        try {
            // InternalUIDSL.g:1241:60: (iv_ruleUIComponentInstance= ruleUIComponentInstance EOF )
            // InternalUIDSL.g:1242:2: iv_ruleUIComponentInstance= ruleUIComponentInstance EOF
            {
             newCompositeNode(grammarAccess.getUIComponentInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUIComponentInstance=ruleUIComponentInstance();

            state._fsp--;

             current =iv_ruleUIComponentInstance; 
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
    // $ANTLR end "entryRuleUIComponentInstance"


    // $ANTLR start "ruleUIComponentInstance"
    // InternalUIDSL.g:1248:1: ruleUIComponentInstance returns [EObject current=null] : ( () otherlv_1= '#' ( (otherlv_2= RULE_ID ) ) ( (lv_properties_3_0= rulePropertyValueInstance ) )* (otherlv_4= '{' ( (lv_childElements_5_0= ruleComponent ) )* otherlv_6= '}' )? ) ;
    public final EObject ruleUIComponentInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_properties_3_0 = null;

        EObject lv_childElements_5_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:1254:2: ( ( () otherlv_1= '#' ( (otherlv_2= RULE_ID ) ) ( (lv_properties_3_0= rulePropertyValueInstance ) )* (otherlv_4= '{' ( (lv_childElements_5_0= ruleComponent ) )* otherlv_6= '}' )? ) )
            // InternalUIDSL.g:1255:2: ( () otherlv_1= '#' ( (otherlv_2= RULE_ID ) ) ( (lv_properties_3_0= rulePropertyValueInstance ) )* (otherlv_4= '{' ( (lv_childElements_5_0= ruleComponent ) )* otherlv_6= '}' )? )
            {
            // InternalUIDSL.g:1255:2: ( () otherlv_1= '#' ( (otherlv_2= RULE_ID ) ) ( (lv_properties_3_0= rulePropertyValueInstance ) )* (otherlv_4= '{' ( (lv_childElements_5_0= ruleComponent ) )* otherlv_6= '}' )? )
            // InternalUIDSL.g:1256:3: () otherlv_1= '#' ( (otherlv_2= RULE_ID ) ) ( (lv_properties_3_0= rulePropertyValueInstance ) )* (otherlv_4= '{' ( (lv_childElements_5_0= ruleComponent ) )* otherlv_6= '}' )?
            {
            // InternalUIDSL.g:1256:3: ()
            // InternalUIDSL.g:1257:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUIComponentInstanceAccess().getUIComponentInstanceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getUIComponentInstanceAccess().getNumberSignKeyword_1());
            		
            // InternalUIDSL.g:1267:3: ( (otherlv_2= RULE_ID ) )
            // InternalUIDSL.g:1268:4: (otherlv_2= RULE_ID )
            {
            // InternalUIDSL.g:1268:4: (otherlv_2= RULE_ID )
            // InternalUIDSL.g:1269:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUIComponentInstanceRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_2, grammarAccess.getUIComponentInstanceAccess().getComponentUIComponentCrossReference_2_0());
            				

            }


            }

            // InternalUIDSL.g:1280:3: ( (lv_properties_3_0= rulePropertyValueInstance ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    int LA23_2 = input.LA(2);

                    if ( (LA23_2==20) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // InternalUIDSL.g:1281:4: (lv_properties_3_0= rulePropertyValueInstance )
            	    {
            	    // InternalUIDSL.g:1281:4: (lv_properties_3_0= rulePropertyValueInstance )
            	    // InternalUIDSL.g:1282:5: lv_properties_3_0= rulePropertyValueInstance
            	    {

            	    					newCompositeNode(grammarAccess.getUIComponentInstanceAccess().getPropertiesPropertyValueInstanceParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_27);
            	    lv_properties_3_0=rulePropertyValueInstance();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUIComponentInstanceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_3_0,
            	    						"com.stefanvuckovic.uidsl.UIDSL.PropertyValueInstance");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            // InternalUIDSL.g:1299:3: (otherlv_4= '{' ( (lv_childElements_5_0= ruleComponent ) )* otherlv_6= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==12) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalUIDSL.g:1300:4: otherlv_4= '{' ( (lv_childElements_5_0= ruleComponent ) )* otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,12,FOLLOW_28); 

                    				newLeafNode(otherlv_4, grammarAccess.getUIComponentInstanceAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalUIDSL.g:1304:4: ( (lv_childElements_5_0= ruleComponent ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==30||(LA24_0>=49 && LA24_0<=50)) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalUIDSL.g:1305:5: (lv_childElements_5_0= ruleComponent )
                    	    {
                    	    // InternalUIDSL.g:1305:5: (lv_childElements_5_0= ruleComponent )
                    	    // InternalUIDSL.g:1306:6: lv_childElements_5_0= ruleComponent
                    	    {

                    	    						newCompositeNode(grammarAccess.getUIComponentInstanceAccess().getChildElementsComponentParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_28);
                    	    lv_childElements_5_0=ruleComponent();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getUIComponentInstanceRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"childElements",
                    	    							lv_childElements_5_0,
                    	    							"com.stefanvuckovic.uidsl.UIDSL.Component");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getUIComponentInstanceAccess().getRightCurlyBracketKeyword_4_2());
                    			

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
    // $ANTLR end "ruleUIComponentInstance"


    // $ANTLR start "entryRuleLogicElement"
    // InternalUIDSL.g:1332:1: entryRuleLogicElement returns [EObject current=null] : iv_ruleLogicElement= ruleLogicElement EOF ;
    public final EObject entryRuleLogicElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicElement = null;


        try {
            // InternalUIDSL.g:1332:53: (iv_ruleLogicElement= ruleLogicElement EOF )
            // InternalUIDSL.g:1333:2: iv_ruleLogicElement= ruleLogicElement EOF
            {
             newCompositeNode(grammarAccess.getLogicElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicElement=ruleLogicElement();

            state._fsp--;

             current =iv_ruleLogicElement; 
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
    // $ANTLR end "entryRuleLogicElement"


    // $ANTLR start "ruleLogicElement"
    // InternalUIDSL.g:1339:1: ruleLogicElement returns [EObject current=null] : (this_IFStatement_0= ruleIFStatement | this_Iterator_1= ruleIterator ) ;
    public final EObject ruleLogicElement() throws RecognitionException {
        EObject current = null;

        EObject this_IFStatement_0 = null;

        EObject this_Iterator_1 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:1345:2: ( (this_IFStatement_0= ruleIFStatement | this_Iterator_1= ruleIterator ) )
            // InternalUIDSL.g:1346:2: (this_IFStatement_0= ruleIFStatement | this_Iterator_1= ruleIterator )
            {
            // InternalUIDSL.g:1346:2: (this_IFStatement_0= ruleIFStatement | this_Iterator_1= ruleIterator )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==31) ) {
                alt26=1;
            }
            else if ( (LA26_0==32) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalUIDSL.g:1347:3: this_IFStatement_0= ruleIFStatement
                    {

                    			newCompositeNode(grammarAccess.getLogicElementAccess().getIFStatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IFStatement_0=ruleIFStatement();

                    state._fsp--;


                    			current = this_IFStatement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUIDSL.g:1356:3: this_Iterator_1= ruleIterator
                    {

                    			newCompositeNode(grammarAccess.getLogicElementAccess().getIteratorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Iterator_1=ruleIterator();

                    state._fsp--;


                    			current = this_Iterator_1;
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
    // $ANTLR end "ruleLogicElement"


    // $ANTLR start "entryRuleIFStatement"
    // InternalUIDSL.g:1368:1: entryRuleIFStatement returns [EObject current=null] : iv_ruleIFStatement= ruleIFStatement EOF ;
    public final EObject entryRuleIFStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIFStatement = null;


        try {
            // InternalUIDSL.g:1368:52: (iv_ruleIFStatement= ruleIFStatement EOF )
            // InternalUIDSL.g:1369:2: iv_ruleIFStatement= ruleIFStatement EOF
            {
             newCompositeNode(grammarAccess.getIFStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIFStatement=ruleIFStatement();

            state._fsp--;

             current =iv_ruleIFStatement; 
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
    // $ANTLR end "entryRuleIFStatement"


    // $ANTLR start "ruleIFStatement"
    // InternalUIDSL.g:1375:1: ruleIFStatement returns [EObject current=null] : (otherlv_0= 'if' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleUIElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleIFStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expression_1_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:1381:2: ( (otherlv_0= 'if' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleUIElement ) )* otherlv_4= '}' ) )
            // InternalUIDSL.g:1382:2: (otherlv_0= 'if' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleUIElement ) )* otherlv_4= '}' )
            {
            // InternalUIDSL.g:1382:2: (otherlv_0= 'if' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleUIElement ) )* otherlv_4= '}' )
            // InternalUIDSL.g:1383:3: otherlv_0= 'if' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleUIElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getIFStatementAccess().getIfKeyword_0());
            		
            // InternalUIDSL.g:1387:3: ( (lv_expression_1_0= ruleExpression ) )
            // InternalUIDSL.g:1388:4: (lv_expression_1_0= ruleExpression )
            {
            // InternalUIDSL.g:1388:4: (lv_expression_1_0= ruleExpression )
            // InternalUIDSL.g:1389:5: lv_expression_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIFStatementAccess().getExpressionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_expression_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIFStatementRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"com.stefanvuckovic.uidsl.UIDSL.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getIFStatementAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUIDSL.g:1410:3: ( (lv_elements_3_0= ruleUIElement ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID||(LA27_0>=30 && LA27_0<=32)||(LA27_0>=49 && LA27_0<=50)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalUIDSL.g:1411:4: (lv_elements_3_0= ruleUIElement )
            	    {
            	    // InternalUIDSL.g:1411:4: (lv_elements_3_0= ruleUIElement )
            	    // InternalUIDSL.g:1412:5: lv_elements_3_0= ruleUIElement
            	    {

            	    					newCompositeNode(grammarAccess.getIFStatementAccess().getElementsUIElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_30);
            	    lv_elements_3_0=ruleUIElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIFStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"com.stefanvuckovic.uidsl.UIDSL.UIElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getIFStatementAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleIFStatement"


    // $ANTLR start "entryRuleIterator"
    // InternalUIDSL.g:1437:1: entryRuleIterator returns [EObject current=null] : iv_ruleIterator= ruleIterator EOF ;
    public final EObject entryRuleIterator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIterator = null;


        try {
            // InternalUIDSL.g:1437:49: (iv_ruleIterator= ruleIterator EOF )
            // InternalUIDSL.g:1438:2: iv_ruleIterator= ruleIterator EOF
            {
             newCompositeNode(grammarAccess.getIteratorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIterator=ruleIterator();

            state._fsp--;

             current =iv_ruleIterator; 
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
    // $ANTLR end "entryRuleIterator"


    // $ANTLR start "ruleIterator"
    // InternalUIDSL.g:1444:1: ruleIterator returns [EObject current=null] : (otherlv_0= 'for' ( (lv_expression_1_0= ruleIterationExpression ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleUIElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleIterator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expression_1_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:1450:2: ( (otherlv_0= 'for' ( (lv_expression_1_0= ruleIterationExpression ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleUIElement ) )* otherlv_4= '}' ) )
            // InternalUIDSL.g:1451:2: (otherlv_0= 'for' ( (lv_expression_1_0= ruleIterationExpression ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleUIElement ) )* otherlv_4= '}' )
            {
            // InternalUIDSL.g:1451:2: (otherlv_0= 'for' ( (lv_expression_1_0= ruleIterationExpression ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleUIElement ) )* otherlv_4= '}' )
            // InternalUIDSL.g:1452:3: otherlv_0= 'for' ( (lv_expression_1_0= ruleIterationExpression ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleUIElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getIteratorAccess().getForKeyword_0());
            		
            // InternalUIDSL.g:1456:3: ( (lv_expression_1_0= ruleIterationExpression ) )
            // InternalUIDSL.g:1457:4: (lv_expression_1_0= ruleIterationExpression )
            {
            // InternalUIDSL.g:1457:4: (lv_expression_1_0= ruleIterationExpression )
            // InternalUIDSL.g:1458:5: lv_expression_1_0= ruleIterationExpression
            {

            					newCompositeNode(grammarAccess.getIteratorAccess().getExpressionIterationExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_expression_1_0=ruleIterationExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIteratorRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"com.stefanvuckovic.uidsl.UIDSL.IterationExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getIteratorAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUIDSL.g:1479:3: ( (lv_elements_3_0= ruleUIElement ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID||(LA28_0>=30 && LA28_0<=32)||(LA28_0>=49 && LA28_0<=50)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalUIDSL.g:1480:4: (lv_elements_3_0= ruleUIElement )
            	    {
            	    // InternalUIDSL.g:1480:4: (lv_elements_3_0= ruleUIElement )
            	    // InternalUIDSL.g:1481:5: lv_elements_3_0= ruleUIElement
            	    {

            	    					newCompositeNode(grammarAccess.getIteratorAccess().getElementsUIElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_30);
            	    lv_elements_3_0=ruleUIElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIteratorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"com.stefanvuckovic.uidsl.UIDSL.UIElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getIteratorAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleIterator"


    // $ANTLR start "entryRulePropertyValueInstance"
    // InternalUIDSL.g:1506:1: entryRulePropertyValueInstance returns [EObject current=null] : iv_rulePropertyValueInstance= rulePropertyValueInstance EOF ;
    public final EObject entryRulePropertyValueInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueInstance = null;


        try {
            // InternalUIDSL.g:1506:62: (iv_rulePropertyValueInstance= rulePropertyValueInstance EOF )
            // InternalUIDSL.g:1507:2: iv_rulePropertyValueInstance= rulePropertyValueInstance EOF
            {
             newCompositeNode(grammarAccess.getPropertyValueInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyValueInstance=rulePropertyValueInstance();

            state._fsp--;

             current =iv_rulePropertyValueInstance; 
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
    // $ANTLR end "entryRulePropertyValueInstance"


    // $ANTLR start "rulePropertyValueInstance"
    // InternalUIDSL.g:1513:1: rulePropertyValueInstance returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleExpression ) ) ) ;
    public final EObject rulePropertyValueInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:1519:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleExpression ) ) ) )
            // InternalUIDSL.g:1520:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleExpression ) ) )
            {
            // InternalUIDSL.g:1520:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleExpression ) ) )
            // InternalUIDSL.g:1521:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleExpression ) )
            {
            // InternalUIDSL.g:1521:3: ()
            // InternalUIDSL.g:1522:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPropertyValueInstanceAccess().getPropertyValueInstanceAction_0(),
            					current);
            			

            }

            // InternalUIDSL.g:1528:3: ( (otherlv_1= RULE_ID ) )
            // InternalUIDSL.g:1529:4: (otherlv_1= RULE_ID )
            {
            // InternalUIDSL.g:1529:4: (otherlv_1= RULE_ID )
            // InternalUIDSL.g:1530:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyValueInstanceRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_1, grammarAccess.getPropertyValueInstanceAccess().getPropertyPropertyValueCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getPropertyValueInstanceAccess().getColonKeyword_2());
            		
            // InternalUIDSL.g:1545:3: ( (lv_value_3_0= ruleExpression ) )
            // InternalUIDSL.g:1546:4: (lv_value_3_0= ruleExpression )
            {
            // InternalUIDSL.g:1546:4: (lv_value_3_0= ruleExpression )
            // InternalUIDSL.g:1547:5: lv_value_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getPropertyValueInstanceAccess().getValueExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyValueInstanceRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"com.stefanvuckovic.uidsl.UIDSL.Expression");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "rulePropertyValueInstance"


    // $ANTLR start "entryRuleTemplate"
    // InternalUIDSL.g:1568:1: entryRuleTemplate returns [EObject current=null] : iv_ruleTemplate= ruleTemplate EOF ;
    public final EObject entryRuleTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplate = null;


        try {
            // InternalUIDSL.g:1568:49: (iv_ruleTemplate= ruleTemplate EOF )
            // InternalUIDSL.g:1569:2: iv_ruleTemplate= ruleTemplate EOF
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
    // InternalUIDSL.g:1575:1: ruleTemplate returns [EObject current=null] : (otherlv_0= 'template' ( (lv_name_1_0= RULE_ID ) ) this_ServerComponentUsage_2= ruleServerComponentUsage[$current] otherlv_3= '{' ( ( (lv_elements_4_1= ruleUIElement | lv_elements_4_2= ruleTemplateFragment ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleTemplate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_ServerComponentUsage_2 = null;

        EObject lv_elements_4_1 = null;

        EObject lv_elements_4_2 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:1581:2: ( (otherlv_0= 'template' ( (lv_name_1_0= RULE_ID ) ) this_ServerComponentUsage_2= ruleServerComponentUsage[$current] otherlv_3= '{' ( ( (lv_elements_4_1= ruleUIElement | lv_elements_4_2= ruleTemplateFragment ) ) )* otherlv_5= '}' ) )
            // InternalUIDSL.g:1582:2: (otherlv_0= 'template' ( (lv_name_1_0= RULE_ID ) ) this_ServerComponentUsage_2= ruleServerComponentUsage[$current] otherlv_3= '{' ( ( (lv_elements_4_1= ruleUIElement | lv_elements_4_2= ruleTemplateFragment ) ) )* otherlv_5= '}' )
            {
            // InternalUIDSL.g:1582:2: (otherlv_0= 'template' ( (lv_name_1_0= RULE_ID ) ) this_ServerComponentUsage_2= ruleServerComponentUsage[$current] otherlv_3= '{' ( ( (lv_elements_4_1= ruleUIElement | lv_elements_4_2= ruleTemplateFragment ) ) )* otherlv_5= '}' )
            // InternalUIDSL.g:1583:3: otherlv_0= 'template' ( (lv_name_1_0= RULE_ID ) ) this_ServerComponentUsage_2= ruleServerComponentUsage[$current] otherlv_3= '{' ( ( (lv_elements_4_1= ruleUIElement | lv_elements_4_2= ruleTemplateFragment ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTemplateAccess().getTemplateKeyword_0());
            		
            // InternalUIDSL.g:1587:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUIDSL.g:1588:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUIDSL.g:1588:4: (lv_name_1_0= RULE_ID )
            // InternalUIDSL.g:1589:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_31); 

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


            			if (current==null) {
            				current = createModelElement(grammarAccess.getTemplateRule());
            			}
            			newCompositeNode(grammarAccess.getTemplateAccess().getServerComponentUsageParserRuleCall_2());
            		
            pushFollow(FOLLOW_5);
            this_ServerComponentUsage_2=ruleServerComponentUsage(current);

            state._fsp--;


            			current = this_ServerComponentUsage_2;
            			afterParserOrEnumRuleCall();
            		
            otherlv_3=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_3, grammarAccess.getTemplateAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUIDSL.g:1620:3: ( ( (lv_elements_4_1= ruleUIElement | lv_elements_4_2= ruleTemplateFragment ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID||(LA30_0>=30 && LA30_0<=32)||(LA30_0>=49 && LA30_0<=50)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalUIDSL.g:1621:4: ( (lv_elements_4_1= ruleUIElement | lv_elements_4_2= ruleTemplateFragment ) )
            	    {
            	    // InternalUIDSL.g:1621:4: ( (lv_elements_4_1= ruleUIElement | lv_elements_4_2= ruleTemplateFragment ) )
            	    // InternalUIDSL.g:1622:5: (lv_elements_4_1= ruleUIElement | lv_elements_4_2= ruleTemplateFragment )
            	    {
            	    // InternalUIDSL.g:1622:5: (lv_elements_4_1= ruleUIElement | lv_elements_4_2= ruleTemplateFragment )
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( ((LA29_0>=30 && LA29_0<=32)||(LA29_0>=49 && LA29_0<=50)) ) {
            	        alt29=1;
            	    }
            	    else if ( (LA29_0==RULE_ID) ) {
            	        int LA29_2 = input.LA(2);

            	        if ( (LA29_2==15) ) {
            	            alt29=1;
            	        }
            	        else if ( (LA29_2==12) ) {
            	            alt29=2;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 29, 2, input);

            	            throw nvae;
            	        }
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // InternalUIDSL.g:1623:6: lv_elements_4_1= ruleUIElement
            	            {

            	            						newCompositeNode(grammarAccess.getTemplateAccess().getElementsUIElementParserRuleCall_4_0_0());
            	            					
            	            pushFollow(FOLLOW_30);
            	            lv_elements_4_1=ruleUIElement();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getTemplateRule());
            	            						}
            	            						add(
            	            							current,
            	            							"elements",
            	            							lv_elements_4_1,
            	            							"com.stefanvuckovic.uidsl.UIDSL.UIElement");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalUIDSL.g:1639:6: lv_elements_4_2= ruleTemplateFragment
            	            {

            	            						newCompositeNode(grammarAccess.getTemplateAccess().getElementsTemplateFragmentParserRuleCall_4_0_1());
            	            					
            	            pushFollow(FOLLOW_30);
            	            lv_elements_4_2=ruleTemplateFragment();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getTemplateRule());
            	            						}
            	            						add(
            	            							current,
            	            							"elements",
            	            							lv_elements_4_2,
            	            							"com.stefanvuckovic.uidsl.UIDSL.TemplateFragment");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getTemplateAccess().getRightCurlyBracketKeyword_5());
            		

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


    // $ANTLR start "entryRuleTemplateFragment"
    // InternalUIDSL.g:1665:1: entryRuleTemplateFragment returns [EObject current=null] : iv_ruleTemplateFragment= ruleTemplateFragment EOF ;
    public final EObject entryRuleTemplateFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateFragment = null;


        try {
            // InternalUIDSL.g:1665:57: (iv_ruleTemplateFragment= ruleTemplateFragment EOF )
            // InternalUIDSL.g:1666:2: iv_ruleTemplateFragment= ruleTemplateFragment EOF
            {
             newCompositeNode(grammarAccess.getTemplateFragmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTemplateFragment=ruleTemplateFragment();

            state._fsp--;

             current =iv_ruleTemplateFragment; 
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
    // $ANTLR end "entryRuleTemplateFragment"


    // $ANTLR start "ruleTemplateFragment"
    // InternalUIDSL.g:1672:1: ruleTemplateFragment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleUIElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleTemplateFragment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:1678:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleUIElement ) )* otherlv_4= '}' ) )
            // InternalUIDSL.g:1679:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleUIElement ) )* otherlv_4= '}' )
            {
            // InternalUIDSL.g:1679:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleUIElement ) )* otherlv_4= '}' )
            // InternalUIDSL.g:1680:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleUIElement ) )* otherlv_4= '}'
            {
            // InternalUIDSL.g:1680:3: ()
            // InternalUIDSL.g:1681:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTemplateFragmentAccess().getTemplateFragmentAction_0(),
            					current);
            			

            }

            // InternalUIDSL.g:1687:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUIDSL.g:1688:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUIDSL.g:1688:4: (lv_name_1_0= RULE_ID )
            // InternalUIDSL.g:1689:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTemplateFragmentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTemplateFragmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getTemplateFragmentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUIDSL.g:1709:3: ( (lv_elements_3_0= ruleUIElement ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID||(LA31_0>=30 && LA31_0<=32)||(LA31_0>=49 && LA31_0<=50)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalUIDSL.g:1710:4: (lv_elements_3_0= ruleUIElement )
            	    {
            	    // InternalUIDSL.g:1710:4: (lv_elements_3_0= ruleUIElement )
            	    // InternalUIDSL.g:1711:5: lv_elements_3_0= ruleUIElement
            	    {

            	    					newCompositeNode(grammarAccess.getTemplateFragmentAccess().getElementsUIElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_30);
            	    lv_elements_3_0=ruleUIElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTemplateFragmentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"com.stefanvuckovic.uidsl.UIDSL.UIElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTemplateFragmentAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleTemplateFragment"


    // $ANTLR start "entryRuleTemplateFragmentOverride"
    // InternalUIDSL.g:1736:1: entryRuleTemplateFragmentOverride returns [EObject current=null] : iv_ruleTemplateFragmentOverride= ruleTemplateFragmentOverride EOF ;
    public final EObject entryRuleTemplateFragmentOverride() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateFragmentOverride = null;


        try {
            // InternalUIDSL.g:1736:65: (iv_ruleTemplateFragmentOverride= ruleTemplateFragmentOverride EOF )
            // InternalUIDSL.g:1737:2: iv_ruleTemplateFragmentOverride= ruleTemplateFragmentOverride EOF
            {
             newCompositeNode(grammarAccess.getTemplateFragmentOverrideRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTemplateFragmentOverride=ruleTemplateFragmentOverride();

            state._fsp--;

             current =iv_ruleTemplateFragmentOverride; 
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
    // $ANTLR end "entryRuleTemplateFragmentOverride"


    // $ANTLR start "ruleTemplateFragmentOverride"
    // InternalUIDSL.g:1743:1: ruleTemplateFragmentOverride returns [EObject current=null] : ( () otherlv_1= 'override' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleUIElement ) )* otherlv_5= '}' ) ;
    public final EObject ruleTemplateFragmentOverride() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:1749:2: ( ( () otherlv_1= 'override' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleUIElement ) )* otherlv_5= '}' ) )
            // InternalUIDSL.g:1750:2: ( () otherlv_1= 'override' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleUIElement ) )* otherlv_5= '}' )
            {
            // InternalUIDSL.g:1750:2: ( () otherlv_1= 'override' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleUIElement ) )* otherlv_5= '}' )
            // InternalUIDSL.g:1751:3: () otherlv_1= 'override' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleUIElement ) )* otherlv_5= '}'
            {
            // InternalUIDSL.g:1751:3: ()
            // InternalUIDSL.g:1752:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTemplateFragmentOverrideAccess().getTemplateFragmentOverrideAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTemplateFragmentOverrideAccess().getOverrideKeyword_1());
            		
            // InternalUIDSL.g:1762:3: ( (otherlv_2= RULE_ID ) )
            // InternalUIDSL.g:1763:4: (otherlv_2= RULE_ID )
            {
            // InternalUIDSL.g:1763:4: (otherlv_2= RULE_ID )
            // InternalUIDSL.g:1764:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTemplateFragmentOverrideRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_2, grammarAccess.getTemplateFragmentOverrideAccess().getOverridenFragmentTemplateFragmentCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_3, grammarAccess.getTemplateFragmentOverrideAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUIDSL.g:1779:3: ( (lv_elements_4_0= ruleUIElement ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID||(LA32_0>=30 && LA32_0<=32)||(LA32_0>=49 && LA32_0<=50)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalUIDSL.g:1780:4: (lv_elements_4_0= ruleUIElement )
            	    {
            	    // InternalUIDSL.g:1780:4: (lv_elements_4_0= ruleUIElement )
            	    // InternalUIDSL.g:1781:5: lv_elements_4_0= ruleUIElement
            	    {

            	    					newCompositeNode(grammarAccess.getTemplateFragmentOverrideAccess().getElementsUIElementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_30);
            	    lv_elements_4_0=ruleUIElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTemplateFragmentOverrideRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_4_0,
            	    						"com.stefanvuckovic.uidsl.UIDSL.UIElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getTemplateFragmentOverrideAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleTemplateFragmentOverride"


    // $ANTLR start "entryRuleFragment"
    // InternalUIDSL.g:1806:1: entryRuleFragment returns [EObject current=null] : iv_ruleFragment= ruleFragment EOF ;
    public final EObject entryRuleFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFragment = null;


        try {
            // InternalUIDSL.g:1806:49: (iv_ruleFragment= ruleFragment EOF )
            // InternalUIDSL.g:1807:2: iv_ruleFragment= ruleFragment EOF
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
    // InternalUIDSL.g:1813:1: ruleFragment returns [EObject current=null] : (otherlv_0= 'fragment' this_UIContainerDefinition_1= ruleUIContainerDefinition[$current] this_ServerComponentUsage_2= ruleServerComponentUsage[$current] otherlv_3= '{' ( (lv_elements_4_0= ruleUIElement ) )* otherlv_5= '}' ) ;
    public final EObject ruleFragment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_UIContainerDefinition_1 = null;

        EObject this_ServerComponentUsage_2 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:1819:2: ( (otherlv_0= 'fragment' this_UIContainerDefinition_1= ruleUIContainerDefinition[$current] this_ServerComponentUsage_2= ruleServerComponentUsage[$current] otherlv_3= '{' ( (lv_elements_4_0= ruleUIElement ) )* otherlv_5= '}' ) )
            // InternalUIDSL.g:1820:2: (otherlv_0= 'fragment' this_UIContainerDefinition_1= ruleUIContainerDefinition[$current] this_ServerComponentUsage_2= ruleServerComponentUsage[$current] otherlv_3= '{' ( (lv_elements_4_0= ruleUIElement ) )* otherlv_5= '}' )
            {
            // InternalUIDSL.g:1820:2: (otherlv_0= 'fragment' this_UIContainerDefinition_1= ruleUIContainerDefinition[$current] this_ServerComponentUsage_2= ruleServerComponentUsage[$current] otherlv_3= '{' ( (lv_elements_4_0= ruleUIElement ) )* otherlv_5= '}' )
            // InternalUIDSL.g:1821:3: otherlv_0= 'fragment' this_UIContainerDefinition_1= ruleUIContainerDefinition[$current] this_ServerComponentUsage_2= ruleServerComponentUsage[$current] otherlv_3= '{' ( (lv_elements_4_0= ruleUIElement ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFragmentAccess().getFragmentKeyword_0());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getFragmentRule());
            			}
            			newCompositeNode(grammarAccess.getFragmentAccess().getUIContainerDefinitionParserRuleCall_1());
            		
            pushFollow(FOLLOW_31);
            this_UIContainerDefinition_1=ruleUIContainerDefinition(current);

            state._fsp--;


            			current = this_UIContainerDefinition_1;
            			afterParserOrEnumRuleCall();
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getFragmentRule());
            			}
            			newCompositeNode(grammarAccess.getFragmentAccess().getServerComponentUsageParserRuleCall_2());
            		
            pushFollow(FOLLOW_5);
            this_ServerComponentUsage_2=ruleServerComponentUsage(current);

            state._fsp--;


            			current = this_ServerComponentUsage_2;
            			afterParserOrEnumRuleCall();
            		
            otherlv_3=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_3, grammarAccess.getFragmentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUIDSL.g:1851:3: ( (lv_elements_4_0= ruleUIElement ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ID||(LA33_0>=30 && LA33_0<=32)||(LA33_0>=49 && LA33_0<=50)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalUIDSL.g:1852:4: (lv_elements_4_0= ruleUIElement )
            	    {
            	    // InternalUIDSL.g:1852:4: (lv_elements_4_0= ruleUIElement )
            	    // InternalUIDSL.g:1853:5: lv_elements_4_0= ruleUIElement
            	    {

            	    					newCompositeNode(grammarAccess.getFragmentAccess().getElementsUIElementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_30);
            	    lv_elements_4_0=ruleUIElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFragmentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_4_0,
            	    						"com.stefanvuckovic.uidsl.UIDSL.UIElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getFragmentAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalUIDSL.g:1878:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalUIDSL.g:1878:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalUIDSL.g:1879:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalUIDSL.g:1885:1: ruleExpression returns [EObject current=null] : (this_MemberSelectionExpression_0= ruleMemberSelectionExpression | this_PageCall_1= rulePageCall | this_IterationExpression_2= ruleIterationExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MemberSelectionExpression_0 = null;

        EObject this_PageCall_1 = null;

        EObject this_IterationExpression_2 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:1891:2: ( (this_MemberSelectionExpression_0= ruleMemberSelectionExpression | this_PageCall_1= rulePageCall | this_IterationExpression_2= ruleIterationExpression ) )
            // InternalUIDSL.g:1892:2: (this_MemberSelectionExpression_0= ruleMemberSelectionExpression | this_PageCall_1= rulePageCall | this_IterationExpression_2= ruleIterationExpression )
            {
            // InternalUIDSL.g:1892:2: (this_MemberSelectionExpression_0= ruleMemberSelectionExpression | this_PageCall_1= rulePageCall | this_IterationExpression_2= ruleIterationExpression )
            int alt34=3;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_INT && LA34_0<=RULE_STRING)||(LA34_0>=61 && LA34_0<=62)||LA34_0==64) ) {
                alt34=1;
            }
            else if ( (LA34_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case EOF:
                case RULE_ID:
                case 12:
                case 13:
                case 16:
                case 17:
                case 30:
                case 31:
                case 32:
                case 33:
                case 36:
                case 49:
                case 50:
                    {
                    alt34=1;
                    }
                    break;
                case 35:
                    {
                    alt34=3;
                    }
                    break;
                case 15:
                    {
                    alt34=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalUIDSL.g:1893:3: this_MemberSelectionExpression_0= ruleMemberSelectionExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getMemberSelectionExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MemberSelectionExpression_0=ruleMemberSelectionExpression();

                    state._fsp--;


                    			current = this_MemberSelectionExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUIDSL.g:1902:3: this_PageCall_1= rulePageCall
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getPageCallParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PageCall_1=rulePageCall();

                    state._fsp--;


                    			current = this_PageCall_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUIDSL.g:1911:3: this_IterationExpression_2= ruleIterationExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getIterationExpressionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_IterationExpression_2=ruleIterationExpression();

                    state._fsp--;


                    			current = this_IterationExpression_2;
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleIterationExpression"
    // InternalUIDSL.g:1923:1: entryRuleIterationExpression returns [EObject current=null] : iv_ruleIterationExpression= ruleIterationExpression EOF ;
    public final EObject entryRuleIterationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIterationExpression = null;


        try {
            // InternalUIDSL.g:1923:60: (iv_ruleIterationExpression= ruleIterationExpression EOF )
            // InternalUIDSL.g:1924:2: iv_ruleIterationExpression= ruleIterationExpression EOF
            {
             newCompositeNode(grammarAccess.getIterationExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIterationExpression=ruleIterationExpression();

            state._fsp--;

             current =iv_ruleIterationExpression; 
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
    // $ANTLR end "entryRuleIterationExpression"


    // $ANTLR start "ruleIterationExpression"
    // InternalUIDSL.g:1930:1: ruleIterationExpression returns [EObject current=null] : ( ( (lv_var_0_0= ruleInlineVariable ) ) otherlv_1= 'in' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleIterationExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_var_0_0 = null;

        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:1936:2: ( ( ( (lv_var_0_0= ruleInlineVariable ) ) otherlv_1= 'in' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalUIDSL.g:1937:2: ( ( (lv_var_0_0= ruleInlineVariable ) ) otherlv_1= 'in' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalUIDSL.g:1937:2: ( ( (lv_var_0_0= ruleInlineVariable ) ) otherlv_1= 'in' ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalUIDSL.g:1938:3: ( (lv_var_0_0= ruleInlineVariable ) ) otherlv_1= 'in' ( (lv_expression_2_0= ruleExpression ) )
            {
            // InternalUIDSL.g:1938:3: ( (lv_var_0_0= ruleInlineVariable ) )
            // InternalUIDSL.g:1939:4: (lv_var_0_0= ruleInlineVariable )
            {
            // InternalUIDSL.g:1939:4: (lv_var_0_0= ruleInlineVariable )
            // InternalUIDSL.g:1940:5: lv_var_0_0= ruleInlineVariable
            {

            					newCompositeNode(grammarAccess.getIterationExpressionAccess().getVarInlineVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_32);
            lv_var_0_0=ruleInlineVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIterationExpressionRule());
            					}
            					set(
            						current,
            						"var",
            						lv_var_0_0,
            						"com.stefanvuckovic.uidsl.UIDSL.InlineVariable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getIterationExpressionAccess().getInKeyword_1());
            		
            // InternalUIDSL.g:1961:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalUIDSL.g:1962:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalUIDSL.g:1962:4: (lv_expression_2_0= ruleExpression )
            // InternalUIDSL.g:1963:5: lv_expression_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIterationExpressionAccess().getExpressionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIterationExpressionRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_2_0,
            						"com.stefanvuckovic.uidsl.UIDSL.Expression");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleIterationExpression"


    // $ANTLR start "entryRuleMemberSelectionExpression"
    // InternalUIDSL.g:1984:1: entryRuleMemberSelectionExpression returns [EObject current=null] : iv_ruleMemberSelectionExpression= ruleMemberSelectionExpression EOF ;
    public final EObject entryRuleMemberSelectionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemberSelectionExpression = null;


        try {
            // InternalUIDSL.g:1984:66: (iv_ruleMemberSelectionExpression= ruleMemberSelectionExpression EOF )
            // InternalUIDSL.g:1985:2: iv_ruleMemberSelectionExpression= ruleMemberSelectionExpression EOF
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
    // InternalUIDSL.g:1991:1: ruleMemberSelectionExpression returns [EObject current=null] : (this_AtomExpression_0= ruleAtomExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_isMethod_4_0= '(' ) ) (this_Params_5= ruleParams[$current] )? otherlv_6= ')' )? )* ) ;
    public final EObject ruleMemberSelectionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_isMethod_4_0=null;
        Token otherlv_6=null;
        EObject this_AtomExpression_0 = null;

        EObject this_Params_5 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:1997:2: ( (this_AtomExpression_0= ruleAtomExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_isMethod_4_0= '(' ) ) (this_Params_5= ruleParams[$current] )? otherlv_6= ')' )? )* ) )
            // InternalUIDSL.g:1998:2: (this_AtomExpression_0= ruleAtomExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_isMethod_4_0= '(' ) ) (this_Params_5= ruleParams[$current] )? otherlv_6= ')' )? )* )
            {
            // InternalUIDSL.g:1998:2: (this_AtomExpression_0= ruleAtomExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_isMethod_4_0= '(' ) ) (this_Params_5= ruleParams[$current] )? otherlv_6= ')' )? )* )
            // InternalUIDSL.g:1999:3: this_AtomExpression_0= ruleAtomExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_isMethod_4_0= '(' ) ) (this_Params_5= ruleParams[$current] )? otherlv_6= ')' )? )*
            {

            			newCompositeNode(grammarAccess.getMemberSelectionExpressionAccess().getAtomExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_33);
            this_AtomExpression_0=ruleAtomExpression();

            state._fsp--;


            			current = this_AtomExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalUIDSL.g:2007:3: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_isMethod_4_0= '(' ) ) (this_Params_5= ruleParams[$current] )? otherlv_6= ')' )? )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==36) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalUIDSL.g:2008:4: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_isMethod_4_0= '(' ) ) (this_Params_5= ruleParams[$current] )? otherlv_6= ')' )?
            	    {
            	    // InternalUIDSL.g:2008:4: ()
            	    // InternalUIDSL.g:2009:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMemberSelectionExpressionAccess().getMemberSelectionExpressionReceiverAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,36,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getMemberSelectionExpressionAccess().getFullStopKeyword_1_1());
            	    			
            	    // InternalUIDSL.g:2019:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalUIDSL.g:2020:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalUIDSL.g:2020:5: (otherlv_3= RULE_ID )
            	    // InternalUIDSL.g:2021:6: otherlv_3= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMemberSelectionExpressionRule());
            	    						}
            	    					
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_34); 

            	    						newLeafNode(otherlv_3, grammarAccess.getMemberSelectionExpressionAccess().getMemberSelectionMemberCrossReference_1_2_0());
            	    					

            	    }


            	    }

            	    // InternalUIDSL.g:2032:4: ( ( (lv_isMethod_4_0= '(' ) ) (this_Params_5= ruleParams[$current] )? otherlv_6= ')' )?
            	    int alt36=2;
            	    int LA36_0 = input.LA(1);

            	    if ( (LA36_0==15) ) {
            	        alt36=1;
            	    }
            	    switch (alt36) {
            	        case 1 :
            	            // InternalUIDSL.g:2033:5: ( (lv_isMethod_4_0= '(' ) ) (this_Params_5= ruleParams[$current] )? otherlv_6= ')'
            	            {
            	            // InternalUIDSL.g:2033:5: ( (lv_isMethod_4_0= '(' ) )
            	            // InternalUIDSL.g:2034:6: (lv_isMethod_4_0= '(' )
            	            {
            	            // InternalUIDSL.g:2034:6: (lv_isMethod_4_0= '(' )
            	            // InternalUIDSL.g:2035:7: lv_isMethod_4_0= '('
            	            {
            	            lv_isMethod_4_0=(Token)match(input,15,FOLLOW_35); 

            	            							newLeafNode(lv_isMethod_4_0, grammarAccess.getMemberSelectionExpressionAccess().getIsMethodLeftParenthesisKeyword_1_3_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMemberSelectionExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "isMethod", true, "(");
            	            						

            	            }


            	            }

            	            // InternalUIDSL.g:2047:5: (this_Params_5= ruleParams[$current] )?
            	            int alt35=2;
            	            int LA35_0 = input.LA(1);

            	            if ( ((LA35_0>=RULE_ID && LA35_0<=RULE_STRING)||(LA35_0>=61 && LA35_0<=62)||LA35_0==64) ) {
            	                alt35=1;
            	            }
            	            switch (alt35) {
            	                case 1 :
            	                    // InternalUIDSL.g:2048:6: this_Params_5= ruleParams[$current]
            	                    {

            	                    						if (current==null) {
            	                    							current = createModelElement(grammarAccess.getMemberSelectionExpressionRule());
            	                    						}
            	                    						newCompositeNode(grammarAccess.getMemberSelectionExpressionAccess().getParamsParserRuleCall_1_3_1());
            	                    					
            	                    pushFollow(FOLLOW_36);
            	                    this_Params_5=ruleParams(current);

            	                    state._fsp--;


            	                    						current = this_Params_5;
            	                    						afterParserOrEnumRuleCall();
            	                    					

            	                    }
            	                    break;

            	            }

            	            otherlv_6=(Token)match(input,17,FOLLOW_33); 

            	            					newLeafNode(otherlv_6, grammarAccess.getMemberSelectionExpressionAccess().getRightParenthesisKeyword_1_3_2());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
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


    // $ANTLR start "entryRulePageCall"
    // InternalUIDSL.g:2070:1: entryRulePageCall returns [EObject current=null] : iv_rulePageCall= rulePageCall EOF ;
    public final EObject entryRulePageCall() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageCall = null;


        try {
            // InternalUIDSL.g:2070:49: (iv_rulePageCall= rulePageCall EOF )
            // InternalUIDSL.g:2071:2: iv_rulePageCall= rulePageCall EOF
            {
             newCompositeNode(grammarAccess.getPageCallRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePageCall=rulePageCall();

            state._fsp--;

             current =iv_rulePageCall; 
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
    // $ANTLR end "entryRulePageCall"


    // $ANTLR start "rulePageCall"
    // InternalUIDSL.g:2077:1: rulePageCall returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' (this_Params_3= ruleParams[$current] )? otherlv_4= ')' ) ;
    public final EObject rulePageCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Params_3 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:2083:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' (this_Params_3= ruleParams[$current] )? otherlv_4= ')' ) )
            // InternalUIDSL.g:2084:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' (this_Params_3= ruleParams[$current] )? otherlv_4= ')' )
            {
            // InternalUIDSL.g:2084:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' (this_Params_3= ruleParams[$current] )? otherlv_4= ')' )
            // InternalUIDSL.g:2085:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' (this_Params_3= ruleParams[$current] )? otherlv_4= ')'
            {
            // InternalUIDSL.g:2085:3: ()
            // InternalUIDSL.g:2086:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPageCallAccess().getPageCallAction_0(),
            					current);
            			

            }

            // InternalUIDSL.g:2092:3: ( (otherlv_1= RULE_ID ) )
            // InternalUIDSL.g:2093:4: (otherlv_1= RULE_ID )
            {
            // InternalUIDSL.g:2093:4: (otherlv_1= RULE_ID )
            // InternalUIDSL.g:2094:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPageCallRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_1, grammarAccess.getPageCallAccess().getPagePageCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getPageCallAccess().getLeftParenthesisKeyword_2());
            		
            // InternalUIDSL.g:2109:3: (this_Params_3= ruleParams[$current] )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=RULE_ID && LA38_0<=RULE_STRING)||(LA38_0>=61 && LA38_0<=62)||LA38_0==64) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalUIDSL.g:2110:4: this_Params_3= ruleParams[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getPageCallRule());
                    				}
                    				newCompositeNode(grammarAccess.getPageCallAccess().getParamsParserRuleCall_3());
                    			
                    pushFollow(FOLLOW_36);
                    this_Params_3=ruleParams(current);

                    state._fsp--;


                    				current = this_Params_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPageCallAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "rulePageCall"


    // $ANTLR start "entryRuleFragmentCall"
    // InternalUIDSL.g:2130:1: entryRuleFragmentCall returns [EObject current=null] : iv_ruleFragmentCall= ruleFragmentCall EOF ;
    public final EObject entryRuleFragmentCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFragmentCall = null;


        try {
            // InternalUIDSL.g:2130:53: (iv_ruleFragmentCall= ruleFragmentCall EOF )
            // InternalUIDSL.g:2131:2: iv_ruleFragmentCall= ruleFragmentCall EOF
            {
             newCompositeNode(grammarAccess.getFragmentCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFragmentCall=ruleFragmentCall();

            state._fsp--;

             current =iv_ruleFragmentCall; 
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
    // $ANTLR end "entryRuleFragmentCall"


    // $ANTLR start "ruleFragmentCall"
    // InternalUIDSL.g:2137:1: ruleFragmentCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (this_Params_2= ruleParams[$current] )? otherlv_3= ')' ) ;
    public final EObject ruleFragmentCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Params_2 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:2143:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (this_Params_2= ruleParams[$current] )? otherlv_3= ')' ) )
            // InternalUIDSL.g:2144:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (this_Params_2= ruleParams[$current] )? otherlv_3= ')' )
            {
            // InternalUIDSL.g:2144:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (this_Params_2= ruleParams[$current] )? otherlv_3= ')' )
            // InternalUIDSL.g:2145:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (this_Params_2= ruleParams[$current] )? otherlv_3= ')'
            {
            // InternalUIDSL.g:2145:3: ( (otherlv_0= RULE_ID ) )
            // InternalUIDSL.g:2146:4: (otherlv_0= RULE_ID )
            {
            // InternalUIDSL.g:2146:4: (otherlv_0= RULE_ID )
            // InternalUIDSL.g:2147:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFragmentCallRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_0, grammarAccess.getFragmentCallAccess().getFragFragmentCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getFragmentCallAccess().getLeftParenthesisKeyword_1());
            		
            // InternalUIDSL.g:2162:3: (this_Params_2= ruleParams[$current] )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RULE_ID && LA39_0<=RULE_STRING)||(LA39_0>=61 && LA39_0<=62)||LA39_0==64) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalUIDSL.g:2163:4: this_Params_2= ruleParams[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getFragmentCallRule());
                    				}
                    				newCompositeNode(grammarAccess.getFragmentCallAccess().getParamsParserRuleCall_2());
                    			
                    pushFollow(FOLLOW_36);
                    this_Params_2=ruleParams(current);

                    state._fsp--;


                    				current = this_Params_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getFragmentCallAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleFragmentCall"


    // $ANTLR start "ruleParams"
    // InternalUIDSL.g:2184:1: ruleParams[EObject in_current] returns [EObject current=in_current] : ( ( (lv_params_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleExpression ) ) )* ) ;
    public final EObject ruleParams(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        EObject lv_params_0_0 = null;

        EObject lv_params_2_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:2190:2: ( ( ( (lv_params_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleExpression ) ) )* ) )
            // InternalUIDSL.g:2191:2: ( ( (lv_params_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleExpression ) ) )* )
            {
            // InternalUIDSL.g:2191:2: ( ( (lv_params_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleExpression ) ) )* )
            // InternalUIDSL.g:2192:3: ( (lv_params_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleExpression ) ) )*
            {
            // InternalUIDSL.g:2192:3: ( (lv_params_0_0= ruleExpression ) )
            // InternalUIDSL.g:2193:4: (lv_params_0_0= ruleExpression )
            {
            // InternalUIDSL.g:2193:4: (lv_params_0_0= ruleExpression )
            // InternalUIDSL.g:2194:5: lv_params_0_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getParamsAccess().getParamsExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_16);
            lv_params_0_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParamsRule());
            					}
            					add(
            						current,
            						"params",
            						lv_params_0_0,
            						"com.stefanvuckovic.uidsl.UIDSL.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUIDSL.g:2211:3: (otherlv_1= ',' ( (lv_params_2_0= ruleExpression ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==16) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalUIDSL.g:2212:4: otherlv_1= ',' ( (lv_params_2_0= ruleExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_29); 

            	    				newLeafNode(otherlv_1, grammarAccess.getParamsAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalUIDSL.g:2216:4: ( (lv_params_2_0= ruleExpression ) )
            	    // InternalUIDSL.g:2217:5: (lv_params_2_0= ruleExpression )
            	    {
            	    // InternalUIDSL.g:2217:5: (lv_params_2_0= ruleExpression )
            	    // InternalUIDSL.g:2218:6: lv_params_2_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getParamsAccess().getParamsExpressionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_params_2_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getParamsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"params",
            	    							lv_params_2_0,
            	    							"com.stefanvuckovic.uidsl.UIDSL.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // $ANTLR end "ruleParams"


    // $ANTLR start "entryRuleAtomExpression"
    // InternalUIDSL.g:2240:1: entryRuleAtomExpression returns [EObject current=null] : iv_ruleAtomExpression= ruleAtomExpression EOF ;
    public final EObject entryRuleAtomExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomExpression = null;


        try {
            // InternalUIDSL.g:2240:55: (iv_ruleAtomExpression= ruleAtomExpression EOF )
            // InternalUIDSL.g:2241:2: iv_ruleAtomExpression= ruleAtomExpression EOF
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
    // InternalUIDSL.g:2247:1: ruleAtomExpression returns [EObject current=null] : (this_Constant_0= ruleConstant | ( () ( (otherlv_2= RULE_ID ) ) ) ) ;
    public final EObject ruleAtomExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Constant_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:2253:2: ( (this_Constant_0= ruleConstant | ( () ( (otherlv_2= RULE_ID ) ) ) ) )
            // InternalUIDSL.g:2254:2: (this_Constant_0= ruleConstant | ( () ( (otherlv_2= RULE_ID ) ) ) )
            {
            // InternalUIDSL.g:2254:2: (this_Constant_0= ruleConstant | ( () ( (otherlv_2= RULE_ID ) ) ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_INT && LA41_0<=RULE_STRING)||(LA41_0>=61 && LA41_0<=62)||LA41_0==64) ) {
                alt41=1;
            }
            else if ( (LA41_0==RULE_ID) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalUIDSL.g:2255:3: this_Constant_0= ruleConstant
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
                    // InternalUIDSL.g:2264:3: ( () ( (otherlv_2= RULE_ID ) ) )
                    {
                    // InternalUIDSL.g:2264:3: ( () ( (otherlv_2= RULE_ID ) ) )
                    // InternalUIDSL.g:2265:4: () ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalUIDSL.g:2265:4: ()
                    // InternalUIDSL.g:2266:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomExpressionAccess().getVariableReferenceAction_1_0(),
                    						current);
                    				

                    }

                    // InternalUIDSL.g:2272:4: ( (otherlv_2= RULE_ID ) )
                    // InternalUIDSL.g:2273:5: (otherlv_2= RULE_ID )
                    {
                    // InternalUIDSL.g:2273:5: (otherlv_2= RULE_ID )
                    // InternalUIDSL.g:2274:6: otherlv_2= RULE_ID
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


    // $ANTLR start "entryRuleAttributeType"
    // InternalUIDSL.g:2290:1: entryRuleAttributeType returns [EObject current=null] : iv_ruleAttributeType= ruleAttributeType EOF ;
    public final EObject entryRuleAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeType = null;


        try {
            // InternalUIDSL.g:2290:54: (iv_ruleAttributeType= ruleAttributeType EOF )
            // InternalUIDSL.g:2291:2: iv_ruleAttributeType= ruleAttributeType EOF
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
    // InternalUIDSL.g:2297:1: ruleAttributeType returns [EObject current=null] : (this_AttributeType_0= superAttributeType | this_VoidType_1= ruleVoidType ) ;
    public final EObject ruleAttributeType() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeType_0 = null;

        EObject this_VoidType_1 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:2303:2: ( (this_AttributeType_0= superAttributeType | this_VoidType_1= ruleVoidType ) )
            // InternalUIDSL.g:2304:2: (this_AttributeType_0= superAttributeType | this_VoidType_1= ruleVoidType )
            {
            // InternalUIDSL.g:2304:2: (this_AttributeType_0= superAttributeType | this_VoidType_1= ruleVoidType )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID||(LA42_0>=55 && LA42_0<=59)||(LA42_0>=70 && LA42_0<=75)) ) {
                alt42=1;
            }
            else if ( (LA42_0==41) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalUIDSL.g:2305:3: this_AttributeType_0= superAttributeType
                    {

                    			newCompositeNode(grammarAccess.getAttributeTypeAccess().getAttributeTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AttributeType_0=superAttributeType();

                    state._fsp--;


                    			current = this_AttributeType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUIDSL.g:2314:3: this_VoidType_1= ruleVoidType
                    {

                    			newCompositeNode(grammarAccess.getAttributeTypeAccess().getVoidTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_VoidType_1=ruleVoidType();

                    state._fsp--;


                    			current = this_VoidType_1;
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


    // $ANTLR start "entryRuleGeneralType"
    // InternalUIDSL.g:2326:1: entryRuleGeneralType returns [EObject current=null] : iv_ruleGeneralType= ruleGeneralType EOF ;
    public final EObject entryRuleGeneralType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralType = null;


        try {
            // InternalUIDSL.g:2326:52: (iv_ruleGeneralType= ruleGeneralType EOF )
            // InternalUIDSL.g:2327:2: iv_ruleGeneralType= ruleGeneralType EOF
            {
             newCompositeNode(grammarAccess.getGeneralTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeneralType=ruleGeneralType();

            state._fsp--;

             current =iv_ruleGeneralType; 
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
    // $ANTLR end "entryRuleGeneralType"


    // $ANTLR start "ruleGeneralType"
    // InternalUIDSL.g:2333:1: ruleGeneralType returns [EObject current=null] : ( ( () otherlv_1= 'object' ) | ( () otherlv_3= 'enum' ) | ( () otherlv_5= 'collection' ) ) ;
    public final EObject ruleGeneralType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalUIDSL.g:2339:2: ( ( ( () otherlv_1= 'object' ) | ( () otherlv_3= 'enum' ) | ( () otherlv_5= 'collection' ) ) )
            // InternalUIDSL.g:2340:2: ( ( () otherlv_1= 'object' ) | ( () otherlv_3= 'enum' ) | ( () otherlv_5= 'collection' ) )
            {
            // InternalUIDSL.g:2340:2: ( ( () otherlv_1= 'object' ) | ( () otherlv_3= 'enum' ) | ( () otherlv_5= 'collection' ) )
            int alt43=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt43=1;
                }
                break;
            case 38:
                {
                alt43=2;
                }
                break;
            case 39:
                {
                alt43=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalUIDSL.g:2341:3: ( () otherlv_1= 'object' )
                    {
                    // InternalUIDSL.g:2341:3: ( () otherlv_1= 'object' )
                    // InternalUIDSL.g:2342:4: () otherlv_1= 'object'
                    {
                    // InternalUIDSL.g:2342:4: ()
                    // InternalUIDSL.g:2343:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getGeneralTypeAccess().getObjectGeneralTypeAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,37,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getGeneralTypeAccess().getObjectKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUIDSL.g:2355:3: ( () otherlv_3= 'enum' )
                    {
                    // InternalUIDSL.g:2355:3: ( () otherlv_3= 'enum' )
                    // InternalUIDSL.g:2356:4: () otherlv_3= 'enum'
                    {
                    // InternalUIDSL.g:2356:4: ()
                    // InternalUIDSL.g:2357:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getGeneralTypeAccess().getEnumGeneralTypeAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,38,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getGeneralTypeAccess().getEnumKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalUIDSL.g:2369:3: ( () otherlv_5= 'collection' )
                    {
                    // InternalUIDSL.g:2369:3: ( () otherlv_5= 'collection' )
                    // InternalUIDSL.g:2370:4: () otherlv_5= 'collection'
                    {
                    // InternalUIDSL.g:2370:4: ()
                    // InternalUIDSL.g:2371:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getGeneralTypeAccess().getCollectionGeneralTypeAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,39,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getGeneralTypeAccess().getCollectionKeyword_2_1());
                    			

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
    // $ANTLR end "ruleGeneralType"


    // $ANTLR start "entryRuleAnyType"
    // InternalUIDSL.g:2386:1: entryRuleAnyType returns [EObject current=null] : iv_ruleAnyType= ruleAnyType EOF ;
    public final EObject entryRuleAnyType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnyType = null;


        try {
            // InternalUIDSL.g:2386:48: (iv_ruleAnyType= ruleAnyType EOF )
            // InternalUIDSL.g:2387:2: iv_ruleAnyType= ruleAnyType EOF
            {
             newCompositeNode(grammarAccess.getAnyTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnyType=ruleAnyType();

            state._fsp--;

             current =iv_ruleAnyType; 
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
    // $ANTLR end "entryRuleAnyType"


    // $ANTLR start "ruleAnyType"
    // InternalUIDSL.g:2393:1: ruleAnyType returns [EObject current=null] : ( () otherlv_1= 'any' ) ;
    public final EObject ruleAnyType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalUIDSL.g:2399:2: ( ( () otherlv_1= 'any' ) )
            // InternalUIDSL.g:2400:2: ( () otherlv_1= 'any' )
            {
            // InternalUIDSL.g:2400:2: ( () otherlv_1= 'any' )
            // InternalUIDSL.g:2401:3: () otherlv_1= 'any'
            {
            // InternalUIDSL.g:2401:3: ()
            // InternalUIDSL.g:2402:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAnyTypeAccess().getAnyTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getAnyTypeAccess().getAnyKeyword_1());
            		

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
    // $ANTLR end "ruleAnyType"


    // $ANTLR start "entryRulePageType"
    // InternalUIDSL.g:2416:1: entryRulePageType returns [EObject current=null] : iv_rulePageType= rulePageType EOF ;
    public final EObject entryRulePageType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageType = null;


        try {
            // InternalUIDSL.g:2416:49: (iv_rulePageType= rulePageType EOF )
            // InternalUIDSL.g:2417:2: iv_rulePageType= rulePageType EOF
            {
             newCompositeNode(grammarAccess.getPageTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePageType=rulePageType();

            state._fsp--;

             current =iv_rulePageType; 
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
    // $ANTLR end "entryRulePageType"


    // $ANTLR start "rulePageType"
    // InternalUIDSL.g:2423:1: rulePageType returns [EObject current=null] : ( () otherlv_1= 'page' ) ;
    public final EObject rulePageType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalUIDSL.g:2429:2: ( ( () otherlv_1= 'page' ) )
            // InternalUIDSL.g:2430:2: ( () otherlv_1= 'page' )
            {
            // InternalUIDSL.g:2430:2: ( () otherlv_1= 'page' )
            // InternalUIDSL.g:2431:3: () otherlv_1= 'page'
            {
            // InternalUIDSL.g:2431:3: ()
            // InternalUIDSL.g:2432:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPageTypeAccess().getPageTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getPageTypeAccess().getPageKeyword_1());
            		

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
    // $ANTLR end "rulePageType"


    // $ANTLR start "entryRuleVoidType"
    // InternalUIDSL.g:2446:1: entryRuleVoidType returns [EObject current=null] : iv_ruleVoidType= ruleVoidType EOF ;
    public final EObject entryRuleVoidType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVoidType = null;


        try {
            // InternalUIDSL.g:2446:49: (iv_ruleVoidType= ruleVoidType EOF )
            // InternalUIDSL.g:2447:2: iv_ruleVoidType= ruleVoidType EOF
            {
             newCompositeNode(grammarAccess.getVoidTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVoidType=ruleVoidType();

            state._fsp--;

             current =iv_ruleVoidType; 
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
    // $ANTLR end "entryRuleVoidType"


    // $ANTLR start "ruleVoidType"
    // InternalUIDSL.g:2453:1: ruleVoidType returns [EObject current=null] : ( () otherlv_1= 'void' ) ;
    public final EObject ruleVoidType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalUIDSL.g:2459:2: ( ( () otherlv_1= 'void' ) )
            // InternalUIDSL.g:2460:2: ( () otherlv_1= 'void' )
            {
            // InternalUIDSL.g:2460:2: ( () otherlv_1= 'void' )
            // InternalUIDSL.g:2461:3: () otherlv_1= 'void'
            {
            // InternalUIDSL.g:2461:3: ()
            // InternalUIDSL.g:2462:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVoidTypeAccess().getVoidTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getVoidTypeAccess().getVoidKeyword_1());
            		

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
    // $ANTLR end "ruleVoidType"


    // $ANTLR start "entryRuleAlternativeType"
    // InternalUIDSL.g:2476:1: entryRuleAlternativeType returns [EObject current=null] : iv_ruleAlternativeType= ruleAlternativeType EOF ;
    public final EObject entryRuleAlternativeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternativeType = null;


        try {
            // InternalUIDSL.g:2476:56: (iv_ruleAlternativeType= ruleAlternativeType EOF )
            // InternalUIDSL.g:2477:2: iv_ruleAlternativeType= ruleAlternativeType EOF
            {
             newCompositeNode(grammarAccess.getAlternativeTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlternativeType=ruleAlternativeType();

            state._fsp--;

             current =iv_ruleAlternativeType; 
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
    // $ANTLR end "entryRuleAlternativeType"


    // $ANTLR start "ruleAlternativeType"
    // InternalUIDSL.g:2483:1: ruleAlternativeType returns [EObject current=null] : ( () ( ( (lv_types_1_1= ruleAttributeType | lv_types_1_2= ruleGeneralType | lv_types_1_3= rulePageType ) ) ) otherlv_2= 'or' ( ( (lv_types_3_1= ruleAttributeType | lv_types_3_2= ruleGeneralType | lv_types_3_3= rulePageType ) ) ) (otherlv_4= 'or' ( ( (lv_types_5_1= ruleAttributeType | lv_types_5_2= ruleGeneralType | lv_types_5_3= rulePageType ) ) ) )* ) ;
    public final EObject ruleAlternativeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_types_1_1 = null;

        EObject lv_types_1_2 = null;

        EObject lv_types_1_3 = null;

        EObject lv_types_3_1 = null;

        EObject lv_types_3_2 = null;

        EObject lv_types_3_3 = null;

        EObject lv_types_5_1 = null;

        EObject lv_types_5_2 = null;

        EObject lv_types_5_3 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:2489:2: ( ( () ( ( (lv_types_1_1= ruleAttributeType | lv_types_1_2= ruleGeneralType | lv_types_1_3= rulePageType ) ) ) otherlv_2= 'or' ( ( (lv_types_3_1= ruleAttributeType | lv_types_3_2= ruleGeneralType | lv_types_3_3= rulePageType ) ) ) (otherlv_4= 'or' ( ( (lv_types_5_1= ruleAttributeType | lv_types_5_2= ruleGeneralType | lv_types_5_3= rulePageType ) ) ) )* ) )
            // InternalUIDSL.g:2490:2: ( () ( ( (lv_types_1_1= ruleAttributeType | lv_types_1_2= ruleGeneralType | lv_types_1_3= rulePageType ) ) ) otherlv_2= 'or' ( ( (lv_types_3_1= ruleAttributeType | lv_types_3_2= ruleGeneralType | lv_types_3_3= rulePageType ) ) ) (otherlv_4= 'or' ( ( (lv_types_5_1= ruleAttributeType | lv_types_5_2= ruleGeneralType | lv_types_5_3= rulePageType ) ) ) )* )
            {
            // InternalUIDSL.g:2490:2: ( () ( ( (lv_types_1_1= ruleAttributeType | lv_types_1_2= ruleGeneralType | lv_types_1_3= rulePageType ) ) ) otherlv_2= 'or' ( ( (lv_types_3_1= ruleAttributeType | lv_types_3_2= ruleGeneralType | lv_types_3_3= rulePageType ) ) ) (otherlv_4= 'or' ( ( (lv_types_5_1= ruleAttributeType | lv_types_5_2= ruleGeneralType | lv_types_5_3= rulePageType ) ) ) )* )
            // InternalUIDSL.g:2491:3: () ( ( (lv_types_1_1= ruleAttributeType | lv_types_1_2= ruleGeneralType | lv_types_1_3= rulePageType ) ) ) otherlv_2= 'or' ( ( (lv_types_3_1= ruleAttributeType | lv_types_3_2= ruleGeneralType | lv_types_3_3= rulePageType ) ) ) (otherlv_4= 'or' ( ( (lv_types_5_1= ruleAttributeType | lv_types_5_2= ruleGeneralType | lv_types_5_3= rulePageType ) ) ) )*
            {
            // InternalUIDSL.g:2491:3: ()
            // InternalUIDSL.g:2492:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAlternativeTypeAccess().getAlternativeTypeAction_0(),
            					current);
            			

            }

            // InternalUIDSL.g:2498:3: ( ( (lv_types_1_1= ruleAttributeType | lv_types_1_2= ruleGeneralType | lv_types_1_3= rulePageType ) ) )
            // InternalUIDSL.g:2499:4: ( (lv_types_1_1= ruleAttributeType | lv_types_1_2= ruleGeneralType | lv_types_1_3= rulePageType ) )
            {
            // InternalUIDSL.g:2499:4: ( (lv_types_1_1= ruleAttributeType | lv_types_1_2= ruleGeneralType | lv_types_1_3= rulePageType ) )
            // InternalUIDSL.g:2500:5: (lv_types_1_1= ruleAttributeType | lv_types_1_2= ruleGeneralType | lv_types_1_3= rulePageType )
            {
            // InternalUIDSL.g:2500:5: (lv_types_1_1= ruleAttributeType | lv_types_1_2= ruleGeneralType | lv_types_1_3= rulePageType )
            int alt44=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 41:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
                {
                alt44=1;
                }
                break;
            case 37:
            case 38:
            case 39:
                {
                alt44=2;
                }
                break;
            case 18:
                {
                alt44=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalUIDSL.g:2501:6: lv_types_1_1= ruleAttributeType
                    {

                    						newCompositeNode(grammarAccess.getAlternativeTypeAccess().getTypesAttributeTypeParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_types_1_1=ruleAttributeType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlternativeTypeRule());
                    						}
                    						add(
                    							current,
                    							"types",
                    							lv_types_1_1,
                    							"com.stefanvuckovic.uidsl.UIDSL.AttributeType");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalUIDSL.g:2517:6: lv_types_1_2= ruleGeneralType
                    {

                    						newCompositeNode(grammarAccess.getAlternativeTypeAccess().getTypesGeneralTypeParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_37);
                    lv_types_1_2=ruleGeneralType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlternativeTypeRule());
                    						}
                    						add(
                    							current,
                    							"types",
                    							lv_types_1_2,
                    							"com.stefanvuckovic.uidsl.UIDSL.GeneralType");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalUIDSL.g:2533:6: lv_types_1_3= rulePageType
                    {

                    						newCompositeNode(grammarAccess.getAlternativeTypeAccess().getTypesPageTypeParserRuleCall_1_0_2());
                    					
                    pushFollow(FOLLOW_37);
                    lv_types_1_3=rulePageType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlternativeTypeRule());
                    						}
                    						add(
                    							current,
                    							"types",
                    							lv_types_1_3,
                    							"com.stefanvuckovic.uidsl.UIDSL.PageType");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,42,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getAlternativeTypeAccess().getOrKeyword_2());
            		
            // InternalUIDSL.g:2555:3: ( ( (lv_types_3_1= ruleAttributeType | lv_types_3_2= ruleGeneralType | lv_types_3_3= rulePageType ) ) )
            // InternalUIDSL.g:2556:4: ( (lv_types_3_1= ruleAttributeType | lv_types_3_2= ruleGeneralType | lv_types_3_3= rulePageType ) )
            {
            // InternalUIDSL.g:2556:4: ( (lv_types_3_1= ruleAttributeType | lv_types_3_2= ruleGeneralType | lv_types_3_3= rulePageType ) )
            // InternalUIDSL.g:2557:5: (lv_types_3_1= ruleAttributeType | lv_types_3_2= ruleGeneralType | lv_types_3_3= rulePageType )
            {
            // InternalUIDSL.g:2557:5: (lv_types_3_1= ruleAttributeType | lv_types_3_2= ruleGeneralType | lv_types_3_3= rulePageType )
            int alt45=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 41:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
                {
                alt45=1;
                }
                break;
            case 37:
            case 38:
            case 39:
                {
                alt45=2;
                }
                break;
            case 18:
                {
                alt45=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalUIDSL.g:2558:6: lv_types_3_1= ruleAttributeType
                    {

                    						newCompositeNode(grammarAccess.getAlternativeTypeAccess().getTypesAttributeTypeParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_types_3_1=ruleAttributeType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlternativeTypeRule());
                    						}
                    						add(
                    							current,
                    							"types",
                    							lv_types_3_1,
                    							"com.stefanvuckovic.uidsl.UIDSL.AttributeType");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalUIDSL.g:2574:6: lv_types_3_2= ruleGeneralType
                    {

                    						newCompositeNode(grammarAccess.getAlternativeTypeAccess().getTypesGeneralTypeParserRuleCall_3_0_1());
                    					
                    pushFollow(FOLLOW_39);
                    lv_types_3_2=ruleGeneralType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlternativeTypeRule());
                    						}
                    						add(
                    							current,
                    							"types",
                    							lv_types_3_2,
                    							"com.stefanvuckovic.uidsl.UIDSL.GeneralType");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalUIDSL.g:2590:6: lv_types_3_3= rulePageType
                    {

                    						newCompositeNode(grammarAccess.getAlternativeTypeAccess().getTypesPageTypeParserRuleCall_3_0_2());
                    					
                    pushFollow(FOLLOW_39);
                    lv_types_3_3=rulePageType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlternativeTypeRule());
                    						}
                    						add(
                    							current,
                    							"types",
                    							lv_types_3_3,
                    							"com.stefanvuckovic.uidsl.UIDSL.PageType");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalUIDSL.g:2608:3: (otherlv_4= 'or' ( ( (lv_types_5_1= ruleAttributeType | lv_types_5_2= ruleGeneralType | lv_types_5_3= rulePageType ) ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==42) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalUIDSL.g:2609:4: otherlv_4= 'or' ( ( (lv_types_5_1= ruleAttributeType | lv_types_5_2= ruleGeneralType | lv_types_5_3= rulePageType ) ) )
            	    {
            	    otherlv_4=(Token)match(input,42,FOLLOW_38); 

            	    				newLeafNode(otherlv_4, grammarAccess.getAlternativeTypeAccess().getOrKeyword_4_0());
            	    			
            	    // InternalUIDSL.g:2613:4: ( ( (lv_types_5_1= ruleAttributeType | lv_types_5_2= ruleGeneralType | lv_types_5_3= rulePageType ) ) )
            	    // InternalUIDSL.g:2614:5: ( (lv_types_5_1= ruleAttributeType | lv_types_5_2= ruleGeneralType | lv_types_5_3= rulePageType ) )
            	    {
            	    // InternalUIDSL.g:2614:5: ( (lv_types_5_1= ruleAttributeType | lv_types_5_2= ruleGeneralType | lv_types_5_3= rulePageType ) )
            	    // InternalUIDSL.g:2615:6: (lv_types_5_1= ruleAttributeType | lv_types_5_2= ruleGeneralType | lv_types_5_3= rulePageType )
            	    {
            	    // InternalUIDSL.g:2615:6: (lv_types_5_1= ruleAttributeType | lv_types_5_2= ruleGeneralType | lv_types_5_3= rulePageType )
            	    int alt46=3;
            	    switch ( input.LA(1) ) {
            	    case RULE_ID:
            	    case 41:
            	    case 55:
            	    case 56:
            	    case 57:
            	    case 58:
            	    case 59:
            	    case 70:
            	    case 71:
            	    case 72:
            	    case 73:
            	    case 74:
            	    case 75:
            	        {
            	        alt46=1;
            	        }
            	        break;
            	    case 37:
            	    case 38:
            	    case 39:
            	        {
            	        alt46=2;
            	        }
            	        break;
            	    case 18:
            	        {
            	        alt46=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 46, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt46) {
            	        case 1 :
            	            // InternalUIDSL.g:2616:7: lv_types_5_1= ruleAttributeType
            	            {

            	            							newCompositeNode(grammarAccess.getAlternativeTypeAccess().getTypesAttributeTypeParserRuleCall_4_1_0_0());
            	            						
            	            pushFollow(FOLLOW_39);
            	            lv_types_5_1=ruleAttributeType();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getAlternativeTypeRule());
            	            							}
            	            							add(
            	            								current,
            	            								"types",
            	            								lv_types_5_1,
            	            								"com.stefanvuckovic.uidsl.UIDSL.AttributeType");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalUIDSL.g:2632:7: lv_types_5_2= ruleGeneralType
            	            {

            	            							newCompositeNode(grammarAccess.getAlternativeTypeAccess().getTypesGeneralTypeParserRuleCall_4_1_0_1());
            	            						
            	            pushFollow(FOLLOW_39);
            	            lv_types_5_2=ruleGeneralType();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getAlternativeTypeRule());
            	            							}
            	            							add(
            	            								current,
            	            								"types",
            	            								lv_types_5_2,
            	            								"com.stefanvuckovic.uidsl.UIDSL.GeneralType");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalUIDSL.g:2648:7: lv_types_5_3= rulePageType
            	            {

            	            							newCompositeNode(grammarAccess.getAlternativeTypeAccess().getTypesPageTypeParserRuleCall_4_1_0_2());
            	            						
            	            pushFollow(FOLLOW_39);
            	            lv_types_5_3=rulePageType();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getAlternativeTypeRule());
            	            							}
            	            							add(
            	            								current,
            	            								"types",
            	            								lv_types_5_3,
            	            								"com.stefanvuckovic.uidsl.UIDSL.PageType");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
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
    // $ANTLR end "ruleAlternativeType"


    // $ANTLR start "entryRuleTypeExpression"
    // InternalUIDSL.g:2671:1: entryRuleTypeExpression returns [EObject current=null] : iv_ruleTypeExpression= ruleTypeExpression EOF ;
    public final EObject entryRuleTypeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeExpression = null;


        try {
            // InternalUIDSL.g:2671:55: (iv_ruleTypeExpression= ruleTypeExpression EOF )
            // InternalUIDSL.g:2672:2: iv_ruleTypeExpression= ruleTypeExpression EOF
            {
             newCompositeNode(grammarAccess.getTypeExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeExpression=ruleTypeExpression();

            state._fsp--;

             current =iv_ruleTypeExpression; 
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
    // $ANTLR end "entryRuleTypeExpression"


    // $ANTLR start "ruleTypeExpression"
    // InternalUIDSL.g:2678:1: ruleTypeExpression returns [EObject current=null] : ( ( () ( ( (lv_type_1_1= ruleAttributeType | lv_type_1_2= ruleAlternativeType | lv_type_1_3= ruleGeneralType | lv_type_1_4= ruleAnyType | lv_type_1_5= rulePageType ) ) ) ) | this_PropertyRuntimeType_2= rulePropertyRuntimeType | this_PropertySingleRuntimeType_3= rulePropertySingleRuntimeType ) ;
    public final EObject ruleTypeExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_type_1_1 = null;

        EObject lv_type_1_2 = null;

        EObject lv_type_1_3 = null;

        EObject lv_type_1_4 = null;

        EObject lv_type_1_5 = null;

        EObject this_PropertyRuntimeType_2 = null;

        EObject this_PropertySingleRuntimeType_3 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:2684:2: ( ( ( () ( ( (lv_type_1_1= ruleAttributeType | lv_type_1_2= ruleAlternativeType | lv_type_1_3= ruleGeneralType | lv_type_1_4= ruleAnyType | lv_type_1_5= rulePageType ) ) ) ) | this_PropertyRuntimeType_2= rulePropertyRuntimeType | this_PropertySingleRuntimeType_3= rulePropertySingleRuntimeType ) )
            // InternalUIDSL.g:2685:2: ( ( () ( ( (lv_type_1_1= ruleAttributeType | lv_type_1_2= ruleAlternativeType | lv_type_1_3= ruleGeneralType | lv_type_1_4= ruleAnyType | lv_type_1_5= rulePageType ) ) ) ) | this_PropertyRuntimeType_2= rulePropertyRuntimeType | this_PropertySingleRuntimeType_3= rulePropertySingleRuntimeType )
            {
            // InternalUIDSL.g:2685:2: ( ( () ( ( (lv_type_1_1= ruleAttributeType | lv_type_1_2= ruleAlternativeType | lv_type_1_3= ruleGeneralType | lv_type_1_4= ruleAnyType | lv_type_1_5= rulePageType ) ) ) ) | this_PropertyRuntimeType_2= rulePropertyRuntimeType | this_PropertySingleRuntimeType_3= rulePropertySingleRuntimeType )
            int alt49=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 18:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
                {
                alt49=1;
                }
                break;
            case 43:
                {
                alt49=2;
                }
                break;
            case 44:
                {
                alt49=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalUIDSL.g:2686:3: ( () ( ( (lv_type_1_1= ruleAttributeType | lv_type_1_2= ruleAlternativeType | lv_type_1_3= ruleGeneralType | lv_type_1_4= ruleAnyType | lv_type_1_5= rulePageType ) ) ) )
                    {
                    // InternalUIDSL.g:2686:3: ( () ( ( (lv_type_1_1= ruleAttributeType | lv_type_1_2= ruleAlternativeType | lv_type_1_3= ruleGeneralType | lv_type_1_4= ruleAnyType | lv_type_1_5= rulePageType ) ) ) )
                    // InternalUIDSL.g:2687:4: () ( ( (lv_type_1_1= ruleAttributeType | lv_type_1_2= ruleAlternativeType | lv_type_1_3= ruleGeneralType | lv_type_1_4= ruleAnyType | lv_type_1_5= rulePageType ) ) )
                    {
                    // InternalUIDSL.g:2687:4: ()
                    // InternalUIDSL.g:2688:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeExpressionAccess().getSimpleTypeAction_0_0(),
                    						current);
                    				

                    }

                    // InternalUIDSL.g:2694:4: ( ( (lv_type_1_1= ruleAttributeType | lv_type_1_2= ruleAlternativeType | lv_type_1_3= ruleGeneralType | lv_type_1_4= ruleAnyType | lv_type_1_5= rulePageType ) ) )
                    // InternalUIDSL.g:2695:5: ( (lv_type_1_1= ruleAttributeType | lv_type_1_2= ruleAlternativeType | lv_type_1_3= ruleGeneralType | lv_type_1_4= ruleAnyType | lv_type_1_5= rulePageType ) )
                    {
                    // InternalUIDSL.g:2695:5: ( (lv_type_1_1= ruleAttributeType | lv_type_1_2= ruleAlternativeType | lv_type_1_3= ruleGeneralType | lv_type_1_4= ruleAnyType | lv_type_1_5= rulePageType ) )
                    // InternalUIDSL.g:2696:6: (lv_type_1_1= ruleAttributeType | lv_type_1_2= ruleAlternativeType | lv_type_1_3= ruleGeneralType | lv_type_1_4= ruleAnyType | lv_type_1_5= rulePageType )
                    {
                    // InternalUIDSL.g:2696:6: (lv_type_1_1= ruleAttributeType | lv_type_1_2= ruleAlternativeType | lv_type_1_3= ruleGeneralType | lv_type_1_4= ruleAnyType | lv_type_1_5= rulePageType )
                    int alt48=5;
                    alt48 = dfa48.predict(input);
                    switch (alt48) {
                        case 1 :
                            // InternalUIDSL.g:2697:7: lv_type_1_1= ruleAttributeType
                            {

                            							newCompositeNode(grammarAccess.getTypeExpressionAccess().getTypeAttributeTypeParserRuleCall_0_1_0_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_type_1_1=ruleAttributeType();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getTypeExpressionRule());
                            							}
                            							set(
                            								current,
                            								"type",
                            								lv_type_1_1,
                            								"com.stefanvuckovic.uidsl.UIDSL.AttributeType");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalUIDSL.g:2713:7: lv_type_1_2= ruleAlternativeType
                            {

                            							newCompositeNode(grammarAccess.getTypeExpressionAccess().getTypeAlternativeTypeParserRuleCall_0_1_0_1());
                            						
                            pushFollow(FOLLOW_2);
                            lv_type_1_2=ruleAlternativeType();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getTypeExpressionRule());
                            							}
                            							set(
                            								current,
                            								"type",
                            								lv_type_1_2,
                            								"com.stefanvuckovic.uidsl.UIDSL.AlternativeType");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 3 :
                            // InternalUIDSL.g:2729:7: lv_type_1_3= ruleGeneralType
                            {

                            							newCompositeNode(grammarAccess.getTypeExpressionAccess().getTypeGeneralTypeParserRuleCall_0_1_0_2());
                            						
                            pushFollow(FOLLOW_2);
                            lv_type_1_3=ruleGeneralType();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getTypeExpressionRule());
                            							}
                            							set(
                            								current,
                            								"type",
                            								lv_type_1_3,
                            								"com.stefanvuckovic.uidsl.UIDSL.GeneralType");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 4 :
                            // InternalUIDSL.g:2745:7: lv_type_1_4= ruleAnyType
                            {

                            							newCompositeNode(grammarAccess.getTypeExpressionAccess().getTypeAnyTypeParserRuleCall_0_1_0_3());
                            						
                            pushFollow(FOLLOW_2);
                            lv_type_1_4=ruleAnyType();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getTypeExpressionRule());
                            							}
                            							set(
                            								current,
                            								"type",
                            								lv_type_1_4,
                            								"com.stefanvuckovic.uidsl.UIDSL.AnyType");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 5 :
                            // InternalUIDSL.g:2761:7: lv_type_1_5= rulePageType
                            {

                            							newCompositeNode(grammarAccess.getTypeExpressionAccess().getTypePageTypeParserRuleCall_0_1_0_4());
                            						
                            pushFollow(FOLLOW_2);
                            lv_type_1_5=rulePageType();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getTypeExpressionRule());
                            							}
                            							set(
                            								current,
                            								"type",
                            								lv_type_1_5,
                            								"com.stefanvuckovic.uidsl.UIDSL.PageType");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUIDSL.g:2781:3: this_PropertyRuntimeType_2= rulePropertyRuntimeType
                    {

                    			newCompositeNode(grammarAccess.getTypeExpressionAccess().getPropertyRuntimeTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PropertyRuntimeType_2=rulePropertyRuntimeType();

                    state._fsp--;


                    			current = this_PropertyRuntimeType_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUIDSL.g:2790:3: this_PropertySingleRuntimeType_3= rulePropertySingleRuntimeType
                    {

                    			newCompositeNode(grammarAccess.getTypeExpressionAccess().getPropertySingleRuntimeTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PropertySingleRuntimeType_3=rulePropertySingleRuntimeType();

                    state._fsp--;


                    			current = this_PropertySingleRuntimeType_3;
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
    // $ANTLR end "ruleTypeExpression"


    // $ANTLR start "entryRulePropertyRuntimeType"
    // InternalUIDSL.g:2802:1: entryRulePropertyRuntimeType returns [EObject current=null] : iv_rulePropertyRuntimeType= rulePropertyRuntimeType EOF ;
    public final EObject entryRulePropertyRuntimeType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyRuntimeType = null;


        try {
            // InternalUIDSL.g:2802:60: (iv_rulePropertyRuntimeType= rulePropertyRuntimeType EOF )
            // InternalUIDSL.g:2803:2: iv_rulePropertyRuntimeType= rulePropertyRuntimeType EOF
            {
             newCompositeNode(grammarAccess.getPropertyRuntimeTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyRuntimeType=rulePropertyRuntimeType();

            state._fsp--;

             current =iv_rulePropertyRuntimeType; 
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
    // $ANTLR end "entryRulePropertyRuntimeType"


    // $ANTLR start "rulePropertyRuntimeType"
    // InternalUIDSL.g:2809:1: rulePropertyRuntimeType returns [EObject current=null] : (otherlv_0= 'typeOf' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject rulePropertyRuntimeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalUIDSL.g:2815:2: ( (otherlv_0= 'typeOf' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) )
            // InternalUIDSL.g:2816:2: (otherlv_0= 'typeOf' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            {
            // InternalUIDSL.g:2816:2: (otherlv_0= 'typeOf' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            // InternalUIDSL.g:2817:3: otherlv_0= 'typeOf' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertyRuntimeTypeAccess().getTypeOfKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyRuntimeTypeAccess().getLeftParenthesisKeyword_1());
            		
            // InternalUIDSL.g:2825:3: ( (otherlv_2= RULE_ID ) )
            // InternalUIDSL.g:2826:4: (otherlv_2= RULE_ID )
            {
            // InternalUIDSL.g:2826:4: (otherlv_2= RULE_ID )
            // InternalUIDSL.g:2827:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyRuntimeTypeRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_36); 

            					newLeafNode(otherlv_2, grammarAccess.getPropertyRuntimeTypeAccess().getPropertyPropertyValueCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getPropertyRuntimeTypeAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "rulePropertyRuntimeType"


    // $ANTLR start "entryRulePropertySingleRuntimeType"
    // InternalUIDSL.g:2846:1: entryRulePropertySingleRuntimeType returns [EObject current=null] : iv_rulePropertySingleRuntimeType= rulePropertySingleRuntimeType EOF ;
    public final EObject entryRulePropertySingleRuntimeType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertySingleRuntimeType = null;


        try {
            // InternalUIDSL.g:2846:66: (iv_rulePropertySingleRuntimeType= rulePropertySingleRuntimeType EOF )
            // InternalUIDSL.g:2847:2: iv_rulePropertySingleRuntimeType= rulePropertySingleRuntimeType EOF
            {
             newCompositeNode(grammarAccess.getPropertySingleRuntimeTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertySingleRuntimeType=rulePropertySingleRuntimeType();

            state._fsp--;

             current =iv_rulePropertySingleRuntimeType; 
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
    // $ANTLR end "entryRulePropertySingleRuntimeType"


    // $ANTLR start "rulePropertySingleRuntimeType"
    // InternalUIDSL.g:2853:1: rulePropertySingleRuntimeType returns [EObject current=null] : (otherlv_0= 'singleTypeOf' otherlv_1= '(' ( (lv_propertyType_2_0= rulePropertyRuntimeType ) ) otherlv_3= ')' ) ;
    public final EObject rulePropertySingleRuntimeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_propertyType_2_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:2859:2: ( (otherlv_0= 'singleTypeOf' otherlv_1= '(' ( (lv_propertyType_2_0= rulePropertyRuntimeType ) ) otherlv_3= ')' ) )
            // InternalUIDSL.g:2860:2: (otherlv_0= 'singleTypeOf' otherlv_1= '(' ( (lv_propertyType_2_0= rulePropertyRuntimeType ) ) otherlv_3= ')' )
            {
            // InternalUIDSL.g:2860:2: (otherlv_0= 'singleTypeOf' otherlv_1= '(' ( (lv_propertyType_2_0= rulePropertyRuntimeType ) ) otherlv_3= ')' )
            // InternalUIDSL.g:2861:3: otherlv_0= 'singleTypeOf' otherlv_1= '(' ( (lv_propertyType_2_0= rulePropertyRuntimeType ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertySingleRuntimeTypeAccess().getSingleTypeOfKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertySingleRuntimeTypeAccess().getLeftParenthesisKeyword_1());
            		
            // InternalUIDSL.g:2869:3: ( (lv_propertyType_2_0= rulePropertyRuntimeType ) )
            // InternalUIDSL.g:2870:4: (lv_propertyType_2_0= rulePropertyRuntimeType )
            {
            // InternalUIDSL.g:2870:4: (lv_propertyType_2_0= rulePropertyRuntimeType )
            // InternalUIDSL.g:2871:5: lv_propertyType_2_0= rulePropertyRuntimeType
            {

            					newCompositeNode(grammarAccess.getPropertySingleRuntimeTypeAccess().getPropertyTypePropertyRuntimeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_36);
            lv_propertyType_2_0=rulePropertyRuntimeType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertySingleRuntimeTypeRule());
            					}
            					set(
            						current,
            						"propertyType",
            						lv_propertyType_2_0,
            						"com.stefanvuckovic.uidsl.UIDSL.PropertyRuntimeType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getPropertySingleRuntimeTypeAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "rulePropertySingleRuntimeType"


    // $ANTLR start "entryRuleDefaultConfigurations"
    // InternalUIDSL.g:2896:1: entryRuleDefaultConfigurations returns [EObject current=null] : iv_ruleDefaultConfigurations= ruleDefaultConfigurations EOF ;
    public final EObject entryRuleDefaultConfigurations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultConfigurations = null;


        try {
            // InternalUIDSL.g:2896:62: (iv_ruleDefaultConfigurations= ruleDefaultConfigurations EOF )
            // InternalUIDSL.g:2897:2: iv_ruleDefaultConfigurations= ruleDefaultConfigurations EOF
            {
             newCompositeNode(grammarAccess.getDefaultConfigurationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefaultConfigurations=ruleDefaultConfigurations();

            state._fsp--;

             current =iv_ruleDefaultConfigurations; 
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
    // $ANTLR end "entryRuleDefaultConfigurations"


    // $ANTLR start "ruleDefaultConfigurations"
    // InternalUIDSL.g:2903:1: ruleDefaultConfigurations returns [EObject current=null] : (otherlv_0= 'defaults' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_defaults_3_0= ruleDefaultComponentConfig ) )+ otherlv_4= '}' ) ;
    public final EObject ruleDefaultConfigurations() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_defaults_3_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:2909:2: ( (otherlv_0= 'defaults' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_defaults_3_0= ruleDefaultComponentConfig ) )+ otherlv_4= '}' ) )
            // InternalUIDSL.g:2910:2: (otherlv_0= 'defaults' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_defaults_3_0= ruleDefaultComponentConfig ) )+ otherlv_4= '}' )
            {
            // InternalUIDSL.g:2910:2: (otherlv_0= 'defaults' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_defaults_3_0= ruleDefaultComponentConfig ) )+ otherlv_4= '}' )
            // InternalUIDSL.g:2911:3: otherlv_0= 'defaults' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_defaults_3_0= ruleDefaultComponentConfig ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDefaultConfigurationsAccess().getDefaultsKeyword_0());
            		
            // InternalUIDSL.g:2915:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUIDSL.g:2916:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUIDSL.g:2916:4: (lv_name_1_0= RULE_ID )
            // InternalUIDSL.g:2917:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDefaultConfigurationsAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefaultConfigurationsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getDefaultConfigurationsAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUIDSL.g:2937:3: ( (lv_defaults_3_0= ruleDefaultComponentConfig ) )+
            int cnt50=0;
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==46) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalUIDSL.g:2938:4: (lv_defaults_3_0= ruleDefaultComponentConfig )
            	    {
            	    // InternalUIDSL.g:2938:4: (lv_defaults_3_0= ruleDefaultComponentConfig )
            	    // InternalUIDSL.g:2939:5: lv_defaults_3_0= ruleDefaultComponentConfig
            	    {

            	    					newCompositeNode(grammarAccess.getDefaultConfigurationsAccess().getDefaultsDefaultComponentConfigParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_42);
            	    lv_defaults_3_0=ruleDefaultComponentConfig();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDefaultConfigurationsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"defaults",
            	    						lv_defaults_3_0,
            	    						"com.stefanvuckovic.uidsl.UIDSL.DefaultComponentConfig");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt50 >= 1 ) break loop50;
                        EarlyExitException eee =
                            new EarlyExitException(50, input);
                        throw eee;
                }
                cnt50++;
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDefaultConfigurationsAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleDefaultConfigurations"


    // $ANTLR start "entryRuleDefaultComponentConfig"
    // InternalUIDSL.g:2964:1: entryRuleDefaultComponentConfig returns [EObject current=null] : iv_ruleDefaultComponentConfig= ruleDefaultComponentConfig EOF ;
    public final EObject entryRuleDefaultComponentConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultComponentConfig = null;


        try {
            // InternalUIDSL.g:2964:63: (iv_ruleDefaultComponentConfig= ruleDefaultComponentConfig EOF )
            // InternalUIDSL.g:2965:2: iv_ruleDefaultComponentConfig= ruleDefaultComponentConfig EOF
            {
             newCompositeNode(grammarAccess.getDefaultComponentConfigRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefaultComponentConfig=ruleDefaultComponentConfig();

            state._fsp--;

             current =iv_ruleDefaultComponentConfig; 
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
    // $ANTLR end "entryRuleDefaultComponentConfig"


    // $ANTLR start "ruleDefaultComponentConfig"
    // InternalUIDSL.g:2971:1: ruleDefaultComponentConfig returns [EObject current=null] : (otherlv_0= 'default' otherlv_1= 'for' ( ( (lv_type_2_1= ruleBasicType | lv_type_2_2= ruleGeneralType ) ) ) otherlv_3= '{' otherlv_4= 'input_component' otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'output_component' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) otherlv_10= '}' ) ;
    public final EObject ruleDefaultComponentConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_type_2_1 = null;

        EObject lv_type_2_2 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:2977:2: ( (otherlv_0= 'default' otherlv_1= 'for' ( ( (lv_type_2_1= ruleBasicType | lv_type_2_2= ruleGeneralType ) ) ) otherlv_3= '{' otherlv_4= 'input_component' otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'output_component' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) otherlv_10= '}' ) )
            // InternalUIDSL.g:2978:2: (otherlv_0= 'default' otherlv_1= 'for' ( ( (lv_type_2_1= ruleBasicType | lv_type_2_2= ruleGeneralType ) ) ) otherlv_3= '{' otherlv_4= 'input_component' otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'output_component' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) otherlv_10= '}' )
            {
            // InternalUIDSL.g:2978:2: (otherlv_0= 'default' otherlv_1= 'for' ( ( (lv_type_2_1= ruleBasicType | lv_type_2_2= ruleGeneralType ) ) ) otherlv_3= '{' otherlv_4= 'input_component' otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'output_component' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) otherlv_10= '}' )
            // InternalUIDSL.g:2979:3: otherlv_0= 'default' otherlv_1= 'for' ( ( (lv_type_2_1= ruleBasicType | lv_type_2_2= ruleGeneralType ) ) ) otherlv_3= '{' otherlv_4= 'input_component' otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'output_component' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_43); 

            			newLeafNode(otherlv_0, grammarAccess.getDefaultComponentConfigAccess().getDefaultKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_44); 

            			newLeafNode(otherlv_1, grammarAccess.getDefaultComponentConfigAccess().getForKeyword_1());
            		
            // InternalUIDSL.g:2987:3: ( ( (lv_type_2_1= ruleBasicType | lv_type_2_2= ruleGeneralType ) ) )
            // InternalUIDSL.g:2988:4: ( (lv_type_2_1= ruleBasicType | lv_type_2_2= ruleGeneralType ) )
            {
            // InternalUIDSL.g:2988:4: ( (lv_type_2_1= ruleBasicType | lv_type_2_2= ruleGeneralType ) )
            // InternalUIDSL.g:2989:5: (lv_type_2_1= ruleBasicType | lv_type_2_2= ruleGeneralType )
            {
            // InternalUIDSL.g:2989:5: (lv_type_2_1= ruleBasicType | lv_type_2_2= ruleGeneralType )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=55 && LA51_0<=59)||(LA51_0>=70 && LA51_0<=74)) ) {
                alt51=1;
            }
            else if ( ((LA51_0>=37 && LA51_0<=39)) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalUIDSL.g:2990:6: lv_type_2_1= ruleBasicType
                    {

                    						newCompositeNode(grammarAccess.getDefaultComponentConfigAccess().getTypeBasicTypeParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_type_2_1=ruleBasicType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefaultComponentConfigRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_2_1,
                    							"com.stefanvuckovic.dto.DTO.BasicType");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalUIDSL.g:3006:6: lv_type_2_2= ruleGeneralType
                    {

                    						newCompositeNode(grammarAccess.getDefaultComponentConfigAccess().getTypeGeneralTypeParserRuleCall_2_0_1());
                    					
                    pushFollow(FOLLOW_5);
                    lv_type_2_2=ruleGeneralType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefaultComponentConfigRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_2_2,
                    							"com.stefanvuckovic.uidsl.UIDSL.GeneralType");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_45); 

            			newLeafNode(otherlv_3, grammarAccess.getDefaultComponentConfigAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,47,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getDefaultComponentConfigAccess().getInput_componentKeyword_4());
            		
            otherlv_5=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getDefaultComponentConfigAccess().getColonKeyword_5());
            		
            // InternalUIDSL.g:3036:3: ( (otherlv_6= RULE_ID ) )
            // InternalUIDSL.g:3037:4: (otherlv_6= RULE_ID )
            {
            // InternalUIDSL.g:3037:4: (otherlv_6= RULE_ID )
            // InternalUIDSL.g:3038:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefaultComponentConfigRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_46); 

            					newLeafNode(otherlv_6, grammarAccess.getDefaultComponentConfigAccess().getInputCompUIComponentCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,48,FOLLOW_14); 

            			newLeafNode(otherlv_7, grammarAccess.getDefaultComponentConfigAccess().getOutput_componentKeyword_7());
            		
            otherlv_8=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getDefaultComponentConfigAccess().getColonKeyword_8());
            		
            // InternalUIDSL.g:3057:3: ( (otherlv_9= RULE_ID ) )
            // InternalUIDSL.g:3058:4: (otherlv_9= RULE_ID )
            {
            // InternalUIDSL.g:3058:4: (otherlv_9= RULE_ID )
            // InternalUIDSL.g:3059:5: otherlv_9= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefaultComponentConfigRule());
            					}
            				
            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_9, grammarAccess.getDefaultComponentConfigAccess().getOutputCompUIComponentCrossReference_9_0());
            				

            }


            }

            otherlv_10=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getDefaultComponentConfigAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleDefaultComponentConfig"


    // $ANTLR start "entryRuleDefaultUIComponent"
    // InternalUIDSL.g:3078:1: entryRuleDefaultUIComponent returns [EObject current=null] : iv_ruleDefaultUIComponent= ruleDefaultUIComponent EOF ;
    public final EObject entryRuleDefaultUIComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultUIComponent = null;


        try {
            // InternalUIDSL.g:3078:59: (iv_ruleDefaultUIComponent= ruleDefaultUIComponent EOF )
            // InternalUIDSL.g:3079:2: iv_ruleDefaultUIComponent= ruleDefaultUIComponent EOF
            {
             newCompositeNode(grammarAccess.getDefaultUIComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefaultUIComponent=ruleDefaultUIComponent();

            state._fsp--;

             current =iv_ruleDefaultUIComponent; 
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
    // $ANTLR end "entryRuleDefaultUIComponent"


    // $ANTLR start "ruleDefaultUIComponent"
    // InternalUIDSL.g:3085:1: ruleDefaultUIComponent returns [EObject current=null] : ( ( () otherlv_1= 'input' otherlv_2= '(' ( (lv_value_3_0= ruleMemberSelectionExpression ) ) otherlv_4= ')' ) | ( () otherlv_6= 'output' otherlv_7= '(' ( (lv_value_8_0= ruleMemberSelectionExpression ) ) otherlv_9= ')' ) ) ;
    public final EObject ruleDefaultUIComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_value_3_0 = null;

        EObject lv_value_8_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:3091:2: ( ( ( () otherlv_1= 'input' otherlv_2= '(' ( (lv_value_3_0= ruleMemberSelectionExpression ) ) otherlv_4= ')' ) | ( () otherlv_6= 'output' otherlv_7= '(' ( (lv_value_8_0= ruleMemberSelectionExpression ) ) otherlv_9= ')' ) ) )
            // InternalUIDSL.g:3092:2: ( ( () otherlv_1= 'input' otherlv_2= '(' ( (lv_value_3_0= ruleMemberSelectionExpression ) ) otherlv_4= ')' ) | ( () otherlv_6= 'output' otherlv_7= '(' ( (lv_value_8_0= ruleMemberSelectionExpression ) ) otherlv_9= ')' ) )
            {
            // InternalUIDSL.g:3092:2: ( ( () otherlv_1= 'input' otherlv_2= '(' ( (lv_value_3_0= ruleMemberSelectionExpression ) ) otherlv_4= ')' ) | ( () otherlv_6= 'output' otherlv_7= '(' ( (lv_value_8_0= ruleMemberSelectionExpression ) ) otherlv_9= ')' ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==49) ) {
                alt52=1;
            }
            else if ( (LA52_0==50) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalUIDSL.g:3093:3: ( () otherlv_1= 'input' otherlv_2= '(' ( (lv_value_3_0= ruleMemberSelectionExpression ) ) otherlv_4= ')' )
                    {
                    // InternalUIDSL.g:3093:3: ( () otherlv_1= 'input' otherlv_2= '(' ( (lv_value_3_0= ruleMemberSelectionExpression ) ) otherlv_4= ')' )
                    // InternalUIDSL.g:3094:4: () otherlv_1= 'input' otherlv_2= '(' ( (lv_value_3_0= ruleMemberSelectionExpression ) ) otherlv_4= ')'
                    {
                    // InternalUIDSL.g:3094:4: ()
                    // InternalUIDSL.g:3095:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDefaultUIComponentAccess().getInputUIComponentAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,49,FOLLOW_8); 

                    				newLeafNode(otherlv_1, grammarAccess.getDefaultUIComponentAccess().getInputKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,15,FOLLOW_29); 

                    				newLeafNode(otherlv_2, grammarAccess.getDefaultUIComponentAccess().getLeftParenthesisKeyword_0_2());
                    			
                    // InternalUIDSL.g:3109:4: ( (lv_value_3_0= ruleMemberSelectionExpression ) )
                    // InternalUIDSL.g:3110:5: (lv_value_3_0= ruleMemberSelectionExpression )
                    {
                    // InternalUIDSL.g:3110:5: (lv_value_3_0= ruleMemberSelectionExpression )
                    // InternalUIDSL.g:3111:6: lv_value_3_0= ruleMemberSelectionExpression
                    {

                    						newCompositeNode(grammarAccess.getDefaultUIComponentAccess().getValueMemberSelectionExpressionParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_value_3_0=ruleMemberSelectionExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefaultUIComponentRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"com.stefanvuckovic.uidsl.UIDSL.MemberSelectionExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getDefaultUIComponentAccess().getRightParenthesisKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUIDSL.g:3134:3: ( () otherlv_6= 'output' otherlv_7= '(' ( (lv_value_8_0= ruleMemberSelectionExpression ) ) otherlv_9= ')' )
                    {
                    // InternalUIDSL.g:3134:3: ( () otherlv_6= 'output' otherlv_7= '(' ( (lv_value_8_0= ruleMemberSelectionExpression ) ) otherlv_9= ')' )
                    // InternalUIDSL.g:3135:4: () otherlv_6= 'output' otherlv_7= '(' ( (lv_value_8_0= ruleMemberSelectionExpression ) ) otherlv_9= ')'
                    {
                    // InternalUIDSL.g:3135:4: ()
                    // InternalUIDSL.g:3136:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDefaultUIComponentAccess().getOutputUIComponentAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_6=(Token)match(input,50,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getDefaultUIComponentAccess().getOutputKeyword_1_1());
                    			
                    otherlv_7=(Token)match(input,15,FOLLOW_29); 

                    				newLeafNode(otherlv_7, grammarAccess.getDefaultUIComponentAccess().getLeftParenthesisKeyword_1_2());
                    			
                    // InternalUIDSL.g:3150:4: ( (lv_value_8_0= ruleMemberSelectionExpression ) )
                    // InternalUIDSL.g:3151:5: (lv_value_8_0= ruleMemberSelectionExpression )
                    {
                    // InternalUIDSL.g:3151:5: (lv_value_8_0= ruleMemberSelectionExpression )
                    // InternalUIDSL.g:3152:6: lv_value_8_0= ruleMemberSelectionExpression
                    {

                    						newCompositeNode(grammarAccess.getDefaultUIComponentAccess().getValueMemberSelectionExpressionParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_value_8_0=ruleMemberSelectionExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefaultUIComponentRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_8_0,
                    							"com.stefanvuckovic.uidsl.UIDSL.MemberSelectionExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getDefaultUIComponentAccess().getRightParenthesisKeyword_1_4());
                    			

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
    // $ANTLR end "ruleDefaultUIComponent"


    // $ANTLR start "entryRuleComponent"
    // InternalUIDSL.g:3178:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalUIDSL.g:3178:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalUIDSL.g:3179:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalUIDSL.g:3185:1: ruleComponent returns [EObject current=null] : (this_UIComponentInstance_0= ruleUIComponentInstance | this_DefaultUIComponent_1= ruleDefaultUIComponent ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        EObject this_UIComponentInstance_0 = null;

        EObject this_DefaultUIComponent_1 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:3191:2: ( (this_UIComponentInstance_0= ruleUIComponentInstance | this_DefaultUIComponent_1= ruleDefaultUIComponent ) )
            // InternalUIDSL.g:3192:2: (this_UIComponentInstance_0= ruleUIComponentInstance | this_DefaultUIComponent_1= ruleDefaultUIComponent )
            {
            // InternalUIDSL.g:3192:2: (this_UIComponentInstance_0= ruleUIComponentInstance | this_DefaultUIComponent_1= ruleDefaultUIComponent )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==30) ) {
                alt53=1;
            }
            else if ( ((LA53_0>=49 && LA53_0<=50)) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // InternalUIDSL.g:3193:3: this_UIComponentInstance_0= ruleUIComponentInstance
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getUIComponentInstanceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_UIComponentInstance_0=ruleUIComponentInstance();

                    state._fsp--;


                    			current = this_UIComponentInstance_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUIDSL.g:3202:3: this_DefaultUIComponent_1= ruleDefaultUIComponent
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getDefaultUIComponentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DefaultUIComponent_1=ruleDefaultUIComponent();

                    state._fsp--;


                    			current = this_DefaultUIComponent_1;
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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleConcept"
    // InternalUIDSL.g:3214:1: entryRuleConcept returns [EObject current=null] : iv_ruleConcept= ruleConcept EOF ;
    public final EObject entryRuleConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcept = null;


        try {
            // InternalUIDSL.g:3214:48: (iv_ruleConcept= ruleConcept EOF )
            // InternalUIDSL.g:3215:2: iv_ruleConcept= ruleConcept EOF
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
    // InternalUIDSL.g:3221:1: ruleConcept returns [EObject current=null] : (this_DTOClass_0= ruleDTOClass | this_Enum_1= ruleEnum ) ;
    public final EObject ruleConcept() throws RecognitionException {
        EObject current = null;

        EObject this_DTOClass_0 = null;

        EObject this_Enum_1 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:3227:2: ( (this_DTOClass_0= ruleDTOClass | this_Enum_1= ruleEnum ) )
            // InternalUIDSL.g:3228:2: (this_DTOClass_0= ruleDTOClass | this_Enum_1= ruleEnum )
            {
            // InternalUIDSL.g:3228:2: (this_DTOClass_0= ruleDTOClass | this_Enum_1= ruleEnum )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==51) ) {
                alt54=1;
            }
            else if ( (LA54_0==38) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalUIDSL.g:3229:3: this_DTOClass_0= ruleDTOClass
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
                    // InternalUIDSL.g:3238:3: this_Enum_1= ruleEnum
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
    // InternalUIDSL.g:3250:1: entryRuleDTOClass returns [EObject current=null] : iv_ruleDTOClass= ruleDTOClass EOF ;
    public final EObject entryRuleDTOClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTOClass = null;


        try {
            // InternalUIDSL.g:3250:49: (iv_ruleDTOClass= ruleDTOClass EOF )
            // InternalUIDSL.g:3251:2: iv_ruleDTOClass= ruleDTOClass EOF
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
    // InternalUIDSL.g:3257:1: ruleDTOClass returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' ) ;
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
            // InternalUIDSL.g:3263:2: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' ) )
            // InternalUIDSL.g:3264:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' )
            {
            // InternalUIDSL.g:3264:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' )
            // InternalUIDSL.g:3265:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDTOClassAccess().getClassKeyword_0());
            		
            // InternalUIDSL.g:3269:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUIDSL.g:3270:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUIDSL.g:3270:4: (lv_name_1_0= RULE_ID )
            // InternalUIDSL.g:3271:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_47); 

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

            // InternalUIDSL.g:3287:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==52) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalUIDSL.g:3288:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,52,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getDTOClassAccess().getExtendsKeyword_2_0());
                    			
                    // InternalUIDSL.g:3292:4: ( (otherlv_3= RULE_ID ) )
                    // InternalUIDSL.g:3293:5: (otherlv_3= RULE_ID )
                    {
                    // InternalUIDSL.g:3293:5: (otherlv_3= RULE_ID )
                    // InternalUIDSL.g:3294:6: otherlv_3= RULE_ID
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

            otherlv_4=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getDTOClassAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUIDSL.g:3310:3: ( (lv_attributes_5_0= ruleAttribute ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==RULE_ID||LA56_0==41||(LA56_0>=55 && LA56_0<=59)||(LA56_0>=70 && LA56_0<=75)) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalUIDSL.g:3311:4: (lv_attributes_5_0= ruleAttribute )
            	    {
            	    // InternalUIDSL.g:3311:4: (lv_attributes_5_0= ruleAttribute )
            	    // InternalUIDSL.g:3312:5: lv_attributes_5_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getDTOClassAccess().getAttributesAttributeParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
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
            	    break loop56;
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


    // $ANTLR start "entryRuleAttributeOption"
    // InternalUIDSL.g:3337:1: entryRuleAttributeOption returns [EObject current=null] : iv_ruleAttributeOption= ruleAttributeOption EOF ;
    public final EObject entryRuleAttributeOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeOption = null;


        try {
            // InternalUIDSL.g:3337:56: (iv_ruleAttributeOption= ruleAttributeOption EOF )
            // InternalUIDSL.g:3338:2: iv_ruleAttributeOption= ruleAttributeOption EOF
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
    // InternalUIDSL.g:3344:1: ruleAttributeOption returns [EObject current=null] : ( ( () otherlv_1= 'representation' ) | ( () otherlv_3= '@id' ) ) ;
    public final EObject ruleAttributeOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalUIDSL.g:3350:2: ( ( ( () otherlv_1= 'representation' ) | ( () otherlv_3= '@id' ) ) )
            // InternalUIDSL.g:3351:2: ( ( () otherlv_1= 'representation' ) | ( () otherlv_3= '@id' ) )
            {
            // InternalUIDSL.g:3351:2: ( ( () otherlv_1= 'representation' ) | ( () otherlv_3= '@id' ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==53) ) {
                alt57=1;
            }
            else if ( (LA57_0==54) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalUIDSL.g:3352:3: ( () otherlv_1= 'representation' )
                    {
                    // InternalUIDSL.g:3352:3: ( () otherlv_1= 'representation' )
                    // InternalUIDSL.g:3353:4: () otherlv_1= 'representation'
                    {
                    // InternalUIDSL.g:3353:4: ()
                    // InternalUIDSL.g:3354:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAttributeOptionAccess().getObjectRepresentationAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,53,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getAttributeOptionAccess().getRepresentationKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUIDSL.g:3366:3: ( () otherlv_3= '@id' )
                    {
                    // InternalUIDSL.g:3366:3: ( () otherlv_3= '@id' )
                    // InternalUIDSL.g:3367:4: () otherlv_3= '@id'
                    {
                    // InternalUIDSL.g:3367:4: ()
                    // InternalUIDSL.g:3368:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAttributeOptionAccess().getIDAttributeAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,54,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getAttributeOptionAccess().getIdKeyword_1_1());
                    			

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


    // $ANTLR start "entryRuleBasicType"
    // InternalUIDSL.g:3383:1: entryRuleBasicType returns [EObject current=null] : iv_ruleBasicType= ruleBasicType EOF ;
    public final EObject entryRuleBasicType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicType = null;


        try {
            // InternalUIDSL.g:3383:50: (iv_ruleBasicType= ruleBasicType EOF )
            // InternalUIDSL.g:3384:2: iv_ruleBasicType= ruleBasicType EOF
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
    // InternalUIDSL.g:3390:1: ruleBasicType returns [EObject current=null] : (this_BasicType_0= superBasicType | ( () otherlv_2= 'text' ) | ( () otherlv_4= 'email' ) | ( () otherlv_6= 'password' ) | ( () otherlv_8= 'file' ) | ( () otherlv_10= 'image' ) ) ;
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
            // InternalUIDSL.g:3396:2: ( (this_BasicType_0= superBasicType | ( () otherlv_2= 'text' ) | ( () otherlv_4= 'email' ) | ( () otherlv_6= 'password' ) | ( () otherlv_8= 'file' ) | ( () otherlv_10= 'image' ) ) )
            // InternalUIDSL.g:3397:2: (this_BasicType_0= superBasicType | ( () otherlv_2= 'text' ) | ( () otherlv_4= 'email' ) | ( () otherlv_6= 'password' ) | ( () otherlv_8= 'file' ) | ( () otherlv_10= 'image' ) )
            {
            // InternalUIDSL.g:3397:2: (this_BasicType_0= superBasicType | ( () otherlv_2= 'text' ) | ( () otherlv_4= 'email' ) | ( () otherlv_6= 'password' ) | ( () otherlv_8= 'file' ) | ( () otherlv_10= 'image' ) )
            int alt58=6;
            switch ( input.LA(1) ) {
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
                {
                alt58=1;
                }
                break;
            case 55:
                {
                alt58=2;
                }
                break;
            case 56:
                {
                alt58=3;
                }
                break;
            case 57:
                {
                alt58=4;
                }
                break;
            case 58:
                {
                alt58=5;
                }
                break;
            case 59:
                {
                alt58=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // InternalUIDSL.g:3398:3: this_BasicType_0= superBasicType
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
                    // InternalUIDSL.g:3407:3: ( () otherlv_2= 'text' )
                    {
                    // InternalUIDSL.g:3407:3: ( () otherlv_2= 'text' )
                    // InternalUIDSL.g:3408:4: () otherlv_2= 'text'
                    {
                    // InternalUIDSL.g:3408:4: ()
                    // InternalUIDSL.g:3409:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBasicTypeAccess().getTextTypeAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,55,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getBasicTypeAccess().getTextKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalUIDSL.g:3421:3: ( () otherlv_4= 'email' )
                    {
                    // InternalUIDSL.g:3421:3: ( () otherlv_4= 'email' )
                    // InternalUIDSL.g:3422:4: () otherlv_4= 'email'
                    {
                    // InternalUIDSL.g:3422:4: ()
                    // InternalUIDSL.g:3423:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBasicTypeAccess().getEmailTypeAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,56,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getBasicTypeAccess().getEmailKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalUIDSL.g:3435:3: ( () otherlv_6= 'password' )
                    {
                    // InternalUIDSL.g:3435:3: ( () otherlv_6= 'password' )
                    // InternalUIDSL.g:3436:4: () otherlv_6= 'password'
                    {
                    // InternalUIDSL.g:3436:4: ()
                    // InternalUIDSL.g:3437:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBasicTypeAccess().getPasswordTypeAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_6=(Token)match(input,57,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getBasicTypeAccess().getPasswordKeyword_3_1());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalUIDSL.g:3449:3: ( () otherlv_8= 'file' )
                    {
                    // InternalUIDSL.g:3449:3: ( () otherlv_8= 'file' )
                    // InternalUIDSL.g:3450:4: () otherlv_8= 'file'
                    {
                    // InternalUIDSL.g:3450:4: ()
                    // InternalUIDSL.g:3451:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBasicTypeAccess().getFileTypeAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_8=(Token)match(input,58,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getBasicTypeAccess().getFileKeyword_4_1());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalUIDSL.g:3463:3: ( () otherlv_10= 'image' )
                    {
                    // InternalUIDSL.g:3463:3: ( () otherlv_10= 'image' )
                    // InternalUIDSL.g:3464:4: () otherlv_10= 'image'
                    {
                    // InternalUIDSL.g:3464:4: ()
                    // InternalUIDSL.g:3465:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBasicTypeAccess().getImageTypeAction_5_0(),
                    						current);
                    				

                    }

                    otherlv_10=(Token)match(input,59,FOLLOW_2); 

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
    // InternalUIDSL.g:3480:1: entryRuleEnum returns [EObject current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final EObject entryRuleEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnum = null;


        try {
            // InternalUIDSL.g:3480:45: (iv_ruleEnum= ruleEnum EOF )
            // InternalUIDSL.g:3481:2: iv_ruleEnum= ruleEnum EOF
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
    // InternalUIDSL.g:3487:1: ruleEnum returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_literals_4_0= ruleEnumLiteral ) )+ otherlv_5= '}' ) ;
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
            // InternalUIDSL.g:3493:2: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_literals_4_0= ruleEnumLiteral ) )+ otherlv_5= '}' ) )
            // InternalUIDSL.g:3494:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_literals_4_0= ruleEnumLiteral ) )+ otherlv_5= '}' )
            {
            // InternalUIDSL.g:3494:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_literals_4_0= ruleEnumLiteral ) )+ otherlv_5= '}' )
            // InternalUIDSL.g:3495:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_literals_4_0= ruleEnumLiteral ) )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumAccess().getEnumKeyword_0());
            		
            // InternalUIDSL.g:3499:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUIDSL.g:3500:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUIDSL.g:3500:4: (lv_name_1_0= RULE_ID )
            // InternalUIDSL.g:3501:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUIDSL.g:3521:3: ( (lv_attributes_3_0= ruleAttribute ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==RULE_ID) ) {
                    int LA59_1 = input.LA(2);

                    if ( (LA59_1==RULE_ID) ) {
                        int LA59_3 = input.LA(3);

                        if ( (LA59_3==14||(LA59_3>=53 && LA59_3<=54)) ) {
                            alt59=1;
                        }


                    }


                }
                else if ( (LA59_0==41||(LA59_0>=55 && LA59_0<=59)||(LA59_0>=70 && LA59_0<=75)) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalUIDSL.g:3522:4: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // InternalUIDSL.g:3522:4: (lv_attributes_3_0= ruleAttribute )
            	    // InternalUIDSL.g:3523:5: lv_attributes_3_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getEnumAccess().getAttributesAttributeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_11);
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
            	    break loop59;
                }
            } while (true);

            // InternalUIDSL.g:3540:3: ( (lv_literals_4_0= ruleEnumLiteral ) )+
            int cnt60=0;
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==RULE_ID) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalUIDSL.g:3541:4: (lv_literals_4_0= ruleEnumLiteral )
            	    {
            	    // InternalUIDSL.g:3541:4: (lv_literals_4_0= ruleEnumLiteral )
            	    // InternalUIDSL.g:3542:5: lv_literals_4_0= ruleEnumLiteral
            	    {

            	    					newCompositeNode(grammarAccess.getEnumAccess().getLiteralsEnumLiteralParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
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
            	    if ( cnt60 >= 1 ) break loop60;
                        EarlyExitException eee =
                            new EarlyExitException(60, input);
                        throw eee;
                }
                cnt60++;
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
    // InternalUIDSL.g:3567:1: entryRuleEnumLiteral returns [EObject current=null] : iv_ruleEnumLiteral= ruleEnumLiteral EOF ;
    public final EObject entryRuleEnumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumLiteral = null;


        try {
            // InternalUIDSL.g:3567:52: (iv_ruleEnumLiteral= ruleEnumLiteral EOF )
            // InternalUIDSL.g:3568:2: iv_ruleEnumLiteral= ruleEnumLiteral EOF
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
    // InternalUIDSL.g:3574:1: ruleEnumLiteral returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleConstant ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleConstant ) ) )* otherlv_5= ')' )? ) ;
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
            // InternalUIDSL.g:3580:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleConstant ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleConstant ) ) )* otherlv_5= ')' )? ) )
            // InternalUIDSL.g:3581:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleConstant ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleConstant ) ) )* otherlv_5= ')' )? )
            {
            // InternalUIDSL.g:3581:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleConstant ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleConstant ) ) )* otherlv_5= ')' )? )
            // InternalUIDSL.g:3582:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleConstant ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleConstant ) ) )* otherlv_5= ')' )?
            {
            // InternalUIDSL.g:3582:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalUIDSL.g:3583:4: (lv_name_0_0= RULE_ID )
            {
            // InternalUIDSL.g:3583:4: (lv_name_0_0= RULE_ID )
            // InternalUIDSL.g:3584:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_48); 

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

            // InternalUIDSL.g:3600:3: (otherlv_1= '(' ( (lv_params_2_0= ruleConstant ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleConstant ) ) )* otherlv_5= ')' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==15) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalUIDSL.g:3601:4: otherlv_1= '(' ( (lv_params_2_0= ruleConstant ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleConstant ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_49); 

                    				newLeafNode(otherlv_1, grammarAccess.getEnumLiteralAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalUIDSL.g:3605:4: ( (lv_params_2_0= ruleConstant ) )
                    // InternalUIDSL.g:3606:5: (lv_params_2_0= ruleConstant )
                    {
                    // InternalUIDSL.g:3606:5: (lv_params_2_0= ruleConstant )
                    // InternalUIDSL.g:3607:6: lv_params_2_0= ruleConstant
                    {

                    						newCompositeNode(grammarAccess.getEnumLiteralAccess().getParamsConstantParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_10);
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

                    // InternalUIDSL.g:3624:4: (otherlv_3= ',' ( (lv_params_4_0= ruleConstant ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==16) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // InternalUIDSL.g:3625:5: otherlv_3= ',' ( (lv_params_4_0= ruleConstant ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_49); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getEnumLiteralAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalUIDSL.g:3629:5: ( (lv_params_4_0= ruleConstant ) )
                    	    // InternalUIDSL.g:3630:6: (lv_params_4_0= ruleConstant )
                    	    {
                    	    // InternalUIDSL.g:3630:6: (lv_params_4_0= ruleConstant )
                    	    // InternalUIDSL.g:3631:7: lv_params_4_0= ruleConstant
                    	    {

                    	    							newCompositeNode(grammarAccess.getEnumLiteralAccess().getParamsConstantParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
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
                    	    break loop61;
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
    // InternalUIDSL.g:3658:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // InternalUIDSL.g:3658:49: (iv_ruleConstant= ruleConstant EOF )
            // InternalUIDSL.g:3659:2: iv_ruleConstant= ruleConstant EOF
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
    // InternalUIDSL.g:3665:1: ruleConstant returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) otherlv_4= 'L' ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) ) ) | ( () ( (lv_day_10_0= RULE_INT ) ) otherlv_11= '/' ( (lv_month_12_0= RULE_INT ) ) otherlv_13= '/' ( (lv_year_14_0= RULE_INT ) ) ) | ( () otherlv_16= 'null' ) ) ;
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
            // InternalUIDSL.g:3671:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) otherlv_4= 'L' ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) ) ) | ( () ( (lv_day_10_0= RULE_INT ) ) otherlv_11= '/' ( (lv_month_12_0= RULE_INT ) ) otherlv_13= '/' ( (lv_year_14_0= RULE_INT ) ) ) | ( () otherlv_16= 'null' ) ) )
            // InternalUIDSL.g:3672:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) otherlv_4= 'L' ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) ) ) | ( () ( (lv_day_10_0= RULE_INT ) ) otherlv_11= '/' ( (lv_month_12_0= RULE_INT ) ) otherlv_13= '/' ( (lv_year_14_0= RULE_INT ) ) ) | ( () otherlv_16= 'null' ) )
            {
            // InternalUIDSL.g:3672:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) otherlv_4= 'L' ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) ) ) | ( () ( (lv_day_10_0= RULE_INT ) ) otherlv_11= '/' ( (lv_month_12_0= RULE_INT ) ) otherlv_13= '/' ( (lv_year_14_0= RULE_INT ) ) ) | ( () otherlv_16= 'null' ) )
            int alt64=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                switch ( input.LA(2) ) {
                case 60:
                    {
                    alt64=2;
                    }
                    break;
                case EOF:
                case RULE_ID:
                case 12:
                case 13:
                case 16:
                case 17:
                case 30:
                case 31:
                case 32:
                case 33:
                case 36:
                case 49:
                case 50:
                    {
                    alt64=1;
                    }
                    break;
                case 63:
                    {
                    alt64=5;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 1, input);

                    throw nvae;
                }

                }
                break;
            case RULE_STRING:
                {
                alt64=3;
                }
                break;
            case 61:
            case 62:
                {
                alt64=4;
                }
                break;
            case 64:
                {
                alt64=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // InternalUIDSL.g:3673:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalUIDSL.g:3673:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalUIDSL.g:3674:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalUIDSL.g:3674:4: ()
                    // InternalUIDSL.g:3675:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstantAccess().getIntConstantAction_0_0(),
                    						current);
                    				

                    }

                    // InternalUIDSL.g:3681:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalUIDSL.g:3682:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalUIDSL.g:3682:5: (lv_value_1_0= RULE_INT )
                    // InternalUIDSL.g:3683:6: lv_value_1_0= RULE_INT
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
                    // InternalUIDSL.g:3701:3: ( () ( (lv_value_3_0= RULE_INT ) ) otherlv_4= 'L' )
                    {
                    // InternalUIDSL.g:3701:3: ( () ( (lv_value_3_0= RULE_INT ) ) otherlv_4= 'L' )
                    // InternalUIDSL.g:3702:4: () ( (lv_value_3_0= RULE_INT ) ) otherlv_4= 'L'
                    {
                    // InternalUIDSL.g:3702:4: ()
                    // InternalUIDSL.g:3703:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstantAccess().getLongConstantAction_1_0(),
                    						current);
                    				

                    }

                    // InternalUIDSL.g:3709:4: ( (lv_value_3_0= RULE_INT ) )
                    // InternalUIDSL.g:3710:5: (lv_value_3_0= RULE_INT )
                    {
                    // InternalUIDSL.g:3710:5: (lv_value_3_0= RULE_INT )
                    // InternalUIDSL.g:3711:6: lv_value_3_0= RULE_INT
                    {
                    lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_50); 

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

                    otherlv_4=(Token)match(input,60,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getConstantAccess().getLKeyword_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalUIDSL.g:3733:3: ( () ( (lv_value_6_0= RULE_STRING ) ) )
                    {
                    // InternalUIDSL.g:3733:3: ( () ( (lv_value_6_0= RULE_STRING ) ) )
                    // InternalUIDSL.g:3734:4: () ( (lv_value_6_0= RULE_STRING ) )
                    {
                    // InternalUIDSL.g:3734:4: ()
                    // InternalUIDSL.g:3735:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstantAccess().getStringConstantAction_2_0(),
                    						current);
                    				

                    }

                    // InternalUIDSL.g:3741:4: ( (lv_value_6_0= RULE_STRING ) )
                    // InternalUIDSL.g:3742:5: (lv_value_6_0= RULE_STRING )
                    {
                    // InternalUIDSL.g:3742:5: (lv_value_6_0= RULE_STRING )
                    // InternalUIDSL.g:3743:6: lv_value_6_0= RULE_STRING
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
                    // InternalUIDSL.g:3761:3: ( () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) ) )
                    {
                    // InternalUIDSL.g:3761:3: ( () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) ) )
                    // InternalUIDSL.g:3762:4: () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) )
                    {
                    // InternalUIDSL.g:3762:4: ()
                    // InternalUIDSL.g:3763:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstantAccess().getBoolConstantAction_3_0(),
                    						current);
                    				

                    }

                    // InternalUIDSL.g:3769:4: ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) )
                    // InternalUIDSL.g:3770:5: ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) )
                    {
                    // InternalUIDSL.g:3770:5: ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) )
                    // InternalUIDSL.g:3771:6: (lv_value_8_1= 'true' | lv_value_8_2= 'false' )
                    {
                    // InternalUIDSL.g:3771:6: (lv_value_8_1= 'true' | lv_value_8_2= 'false' )
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==61) ) {
                        alt63=1;
                    }
                    else if ( (LA63_0==62) ) {
                        alt63=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 63, 0, input);

                        throw nvae;
                    }
                    switch (alt63) {
                        case 1 :
                            // InternalUIDSL.g:3772:7: lv_value_8_1= 'true'
                            {
                            lv_value_8_1=(Token)match(input,61,FOLLOW_2); 

                            							newLeafNode(lv_value_8_1, grammarAccess.getConstantAccess().getValueTrueKeyword_3_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConstantRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_8_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalUIDSL.g:3783:7: lv_value_8_2= 'false'
                            {
                            lv_value_8_2=(Token)match(input,62,FOLLOW_2); 

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
                    // InternalUIDSL.g:3798:3: ( () ( (lv_day_10_0= RULE_INT ) ) otherlv_11= '/' ( (lv_month_12_0= RULE_INT ) ) otherlv_13= '/' ( (lv_year_14_0= RULE_INT ) ) )
                    {
                    // InternalUIDSL.g:3798:3: ( () ( (lv_day_10_0= RULE_INT ) ) otherlv_11= '/' ( (lv_month_12_0= RULE_INT ) ) otherlv_13= '/' ( (lv_year_14_0= RULE_INT ) ) )
                    // InternalUIDSL.g:3799:4: () ( (lv_day_10_0= RULE_INT ) ) otherlv_11= '/' ( (lv_month_12_0= RULE_INT ) ) otherlv_13= '/' ( (lv_year_14_0= RULE_INT ) )
                    {
                    // InternalUIDSL.g:3799:4: ()
                    // InternalUIDSL.g:3800:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstantAccess().getDateConstantAction_4_0(),
                    						current);
                    				

                    }

                    // InternalUIDSL.g:3806:4: ( (lv_day_10_0= RULE_INT ) )
                    // InternalUIDSL.g:3807:5: (lv_day_10_0= RULE_INT )
                    {
                    // InternalUIDSL.g:3807:5: (lv_day_10_0= RULE_INT )
                    // InternalUIDSL.g:3808:6: lv_day_10_0= RULE_INT
                    {
                    lv_day_10_0=(Token)match(input,RULE_INT,FOLLOW_51); 

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

                    otherlv_11=(Token)match(input,63,FOLLOW_52); 

                    				newLeafNode(otherlv_11, grammarAccess.getConstantAccess().getSolidusKeyword_4_2());
                    			
                    // InternalUIDSL.g:3828:4: ( (lv_month_12_0= RULE_INT ) )
                    // InternalUIDSL.g:3829:5: (lv_month_12_0= RULE_INT )
                    {
                    // InternalUIDSL.g:3829:5: (lv_month_12_0= RULE_INT )
                    // InternalUIDSL.g:3830:6: lv_month_12_0= RULE_INT
                    {
                    lv_month_12_0=(Token)match(input,RULE_INT,FOLLOW_51); 

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

                    otherlv_13=(Token)match(input,63,FOLLOW_52); 

                    				newLeafNode(otherlv_13, grammarAccess.getConstantAccess().getSolidusKeyword_4_4());
                    			
                    // InternalUIDSL.g:3850:4: ( (lv_year_14_0= RULE_INT ) )
                    // InternalUIDSL.g:3851:5: (lv_year_14_0= RULE_INT )
                    {
                    // InternalUIDSL.g:3851:5: (lv_year_14_0= RULE_INT )
                    // InternalUIDSL.g:3852:6: lv_year_14_0= RULE_INT
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
                    // InternalUIDSL.g:3870:3: ( () otherlv_16= 'null' )
                    {
                    // InternalUIDSL.g:3870:3: ( () otherlv_16= 'null' )
                    // InternalUIDSL.g:3871:4: () otherlv_16= 'null'
                    {
                    // InternalUIDSL.g:3871:4: ()
                    // InternalUIDSL.g:3872:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstantAccess().getNullAction_5_0(),
                    						current);
                    				

                    }

                    otherlv_16=(Token)match(input,64,FOLLOW_2); 

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
    // InternalUIDSL.g:3887:1: entryRuleEntityOption returns [EObject current=null] : iv_ruleEntityOption= ruleEntityOption EOF ;
    public final EObject entryRuleEntityOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityOption = null;


        try {
            // InternalUIDSL.g:3887:53: (iv_ruleEntityOption= ruleEntityOption EOF )
            // InternalUIDSL.g:3888:2: iv_ruleEntityOption= ruleEntityOption EOF
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
    // InternalUIDSL.g:3894:1: ruleEntityOption returns [EObject current=null] : ( ( () ( (lv_deleteByFlag_1_0= 'deleteByFlag' ) ) ) | ( () otherlv_3= 'inheritance' otherlv_4= '=' ( (lv_inheritanceMapping_5_0= ruleInheritanceMappingType ) ) ) ) ;
    public final EObject ruleEntityOption() throws RecognitionException {
        EObject current = null;

        Token lv_deleteByFlag_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_inheritanceMapping_5_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:3900:2: ( ( ( () ( (lv_deleteByFlag_1_0= 'deleteByFlag' ) ) ) | ( () otherlv_3= 'inheritance' otherlv_4= '=' ( (lv_inheritanceMapping_5_0= ruleInheritanceMappingType ) ) ) ) )
            // InternalUIDSL.g:3901:2: ( ( () ( (lv_deleteByFlag_1_0= 'deleteByFlag' ) ) ) | ( () otherlv_3= 'inheritance' otherlv_4= '=' ( (lv_inheritanceMapping_5_0= ruleInheritanceMappingType ) ) ) )
            {
            // InternalUIDSL.g:3901:2: ( ( () ( (lv_deleteByFlag_1_0= 'deleteByFlag' ) ) ) | ( () otherlv_3= 'inheritance' otherlv_4= '=' ( (lv_inheritanceMapping_5_0= ruleInheritanceMappingType ) ) ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==65) ) {
                alt65=1;
            }
            else if ( (LA65_0==66) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // InternalUIDSL.g:3902:3: ( () ( (lv_deleteByFlag_1_0= 'deleteByFlag' ) ) )
                    {
                    // InternalUIDSL.g:3902:3: ( () ( (lv_deleteByFlag_1_0= 'deleteByFlag' ) ) )
                    // InternalUIDSL.g:3903:4: () ( (lv_deleteByFlag_1_0= 'deleteByFlag' ) )
                    {
                    // InternalUIDSL.g:3903:4: ()
                    // InternalUIDSL.g:3904:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEntityOptionAccess().getEntityDeleteOptionAction_0_0(),
                    						current);
                    				

                    }

                    // InternalUIDSL.g:3910:4: ( (lv_deleteByFlag_1_0= 'deleteByFlag' ) )
                    // InternalUIDSL.g:3911:5: (lv_deleteByFlag_1_0= 'deleteByFlag' )
                    {
                    // InternalUIDSL.g:3911:5: (lv_deleteByFlag_1_0= 'deleteByFlag' )
                    // InternalUIDSL.g:3912:6: lv_deleteByFlag_1_0= 'deleteByFlag'
                    {
                    lv_deleteByFlag_1_0=(Token)match(input,65,FOLLOW_2); 

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
                    // InternalUIDSL.g:3926:3: ( () otherlv_3= 'inheritance' otherlv_4= '=' ( (lv_inheritanceMapping_5_0= ruleInheritanceMappingType ) ) )
                    {
                    // InternalUIDSL.g:3926:3: ( () otherlv_3= 'inheritance' otherlv_4= '=' ( (lv_inheritanceMapping_5_0= ruleInheritanceMappingType ) ) )
                    // InternalUIDSL.g:3927:4: () otherlv_3= 'inheritance' otherlv_4= '=' ( (lv_inheritanceMapping_5_0= ruleInheritanceMappingType ) )
                    {
                    // InternalUIDSL.g:3927:4: ()
                    // InternalUIDSL.g:3928:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEntityOptionAccess().getInheritanceMappingOptionAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,66,FOLLOW_21); 

                    				newLeafNode(otherlv_3, grammarAccess.getEntityOptionAccess().getInheritanceKeyword_1_1());
                    			
                    otherlv_4=(Token)match(input,26,FOLLOW_53); 

                    				newLeafNode(otherlv_4, grammarAccess.getEntityOptionAccess().getEqualsSignKeyword_1_2());
                    			
                    // InternalUIDSL.g:3942:4: ( (lv_inheritanceMapping_5_0= ruleInheritanceMappingType ) )
                    // InternalUIDSL.g:3943:5: (lv_inheritanceMapping_5_0= ruleInheritanceMappingType )
                    {
                    // InternalUIDSL.g:3943:5: (lv_inheritanceMapping_5_0= ruleInheritanceMappingType )
                    // InternalUIDSL.g:3944:6: lv_inheritanceMapping_5_0= ruleInheritanceMappingType
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
    // InternalUIDSL.g:3966:1: entryRuleInheritanceMappingType returns [EObject current=null] : iv_ruleInheritanceMappingType= ruleInheritanceMappingType EOF ;
    public final EObject entryRuleInheritanceMappingType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInheritanceMappingType = null;


        try {
            // InternalUIDSL.g:3966:63: (iv_ruleInheritanceMappingType= ruleInheritanceMappingType EOF )
            // InternalUIDSL.g:3967:2: iv_ruleInheritanceMappingType= ruleInheritanceMappingType EOF
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
    // InternalUIDSL.g:3973:1: ruleInheritanceMappingType returns [EObject current=null] : ( ( (lv_type_0_1= 'SINGLE_TABLE' | lv_type_0_2= 'TABLE_PER_CONCRETE_CLASS' | lv_type_0_3= 'TABLE_PER_CLASS' ) ) ) ;
    public final EObject ruleInheritanceMappingType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;


        	enterRule();

        try {
            // InternalUIDSL.g:3979:2: ( ( ( (lv_type_0_1= 'SINGLE_TABLE' | lv_type_0_2= 'TABLE_PER_CONCRETE_CLASS' | lv_type_0_3= 'TABLE_PER_CLASS' ) ) ) )
            // InternalUIDSL.g:3980:2: ( ( (lv_type_0_1= 'SINGLE_TABLE' | lv_type_0_2= 'TABLE_PER_CONCRETE_CLASS' | lv_type_0_3= 'TABLE_PER_CLASS' ) ) )
            {
            // InternalUIDSL.g:3980:2: ( ( (lv_type_0_1= 'SINGLE_TABLE' | lv_type_0_2= 'TABLE_PER_CONCRETE_CLASS' | lv_type_0_3= 'TABLE_PER_CLASS' ) ) )
            // InternalUIDSL.g:3981:3: ( (lv_type_0_1= 'SINGLE_TABLE' | lv_type_0_2= 'TABLE_PER_CONCRETE_CLASS' | lv_type_0_3= 'TABLE_PER_CLASS' ) )
            {
            // InternalUIDSL.g:3981:3: ( (lv_type_0_1= 'SINGLE_TABLE' | lv_type_0_2= 'TABLE_PER_CONCRETE_CLASS' | lv_type_0_3= 'TABLE_PER_CLASS' ) )
            // InternalUIDSL.g:3982:4: (lv_type_0_1= 'SINGLE_TABLE' | lv_type_0_2= 'TABLE_PER_CONCRETE_CLASS' | lv_type_0_3= 'TABLE_PER_CLASS' )
            {
            // InternalUIDSL.g:3982:4: (lv_type_0_1= 'SINGLE_TABLE' | lv_type_0_2= 'TABLE_PER_CONCRETE_CLASS' | lv_type_0_3= 'TABLE_PER_CLASS' )
            int alt66=3;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt66=1;
                }
                break;
            case 68:
                {
                alt66=2;
                }
                break;
            case 69:
                {
                alt66=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // InternalUIDSL.g:3983:5: lv_type_0_1= 'SINGLE_TABLE'
                    {
                    lv_type_0_1=(Token)match(input,67,FOLLOW_2); 

                    					newLeafNode(lv_type_0_1, grammarAccess.getInheritanceMappingTypeAccess().getTypeSINGLE_TABLEKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInheritanceMappingTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalUIDSL.g:3994:5: lv_type_0_2= 'TABLE_PER_CONCRETE_CLASS'
                    {
                    lv_type_0_2=(Token)match(input,68,FOLLOW_2); 

                    					newLeafNode(lv_type_0_2, grammarAccess.getInheritanceMappingTypeAccess().getTypeTABLE_PER_CONCRETE_CLASSKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInheritanceMappingTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalUIDSL.g:4005:5: lv_type_0_3= 'TABLE_PER_CLASS'
                    {
                    lv_type_0_3=(Token)match(input,69,FOLLOW_2); 

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
    // InternalUIDSL.g:4021:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalUIDSL.g:4021:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalUIDSL.g:4022:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalUIDSL.g:4028:1: ruleAttribute returns [EObject current=null] : ( ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_options_2_0= ruleAttributeOption ) ) (otherlv_3= ',' ( (lv_options_4_0= ruleAttributeOption ) ) )* )? otherlv_5= ';' ) ;
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
            // InternalUIDSL.g:4034:2: ( ( ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_options_2_0= ruleAttributeOption ) ) (otherlv_3= ',' ( (lv_options_4_0= ruleAttributeOption ) ) )* )? otherlv_5= ';' ) )
            // InternalUIDSL.g:4035:2: ( ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_options_2_0= ruleAttributeOption ) ) (otherlv_3= ',' ( (lv_options_4_0= ruleAttributeOption ) ) )* )? otherlv_5= ';' )
            {
            // InternalUIDSL.g:4035:2: ( ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_options_2_0= ruleAttributeOption ) ) (otherlv_3= ',' ( (lv_options_4_0= ruleAttributeOption ) ) )* )? otherlv_5= ';' )
            // InternalUIDSL.g:4036:3: ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_options_2_0= ruleAttributeOption ) ) (otherlv_3= ',' ( (lv_options_4_0= ruleAttributeOption ) ) )* )? otherlv_5= ';'
            {
            // InternalUIDSL.g:4036:3: ( (lv_type_0_0= ruleAttributeType ) )
            // InternalUIDSL.g:4037:4: (lv_type_0_0= ruleAttributeType )
            {
            // InternalUIDSL.g:4037:4: (lv_type_0_0= ruleAttributeType )
            // InternalUIDSL.g:4038:5: lv_type_0_0= ruleAttributeType
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
            						"com.stefanvuckovic.uidsl.UIDSL.AttributeType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUIDSL.g:4055:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUIDSL.g:4056:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUIDSL.g:4056:4: (lv_name_1_0= RULE_ID )
            // InternalUIDSL.g:4057:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_54); 

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

            // InternalUIDSL.g:4073:3: ( ( (lv_options_2_0= ruleAttributeOption ) ) (otherlv_3= ',' ( (lv_options_4_0= ruleAttributeOption ) ) )* )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( ((LA68_0>=53 && LA68_0<=54)) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalUIDSL.g:4074:4: ( (lv_options_2_0= ruleAttributeOption ) ) (otherlv_3= ',' ( (lv_options_4_0= ruleAttributeOption ) ) )*
                    {
                    // InternalUIDSL.g:4074:4: ( (lv_options_2_0= ruleAttributeOption ) )
                    // InternalUIDSL.g:4075:5: (lv_options_2_0= ruleAttributeOption )
                    {
                    // InternalUIDSL.g:4075:5: (lv_options_2_0= ruleAttributeOption )
                    // InternalUIDSL.g:4076:6: lv_options_2_0= ruleAttributeOption
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getOptionsAttributeOptionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_55);
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

                    // InternalUIDSL.g:4093:4: (otherlv_3= ',' ( (lv_options_4_0= ruleAttributeOption ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==16) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // InternalUIDSL.g:4094:5: otherlv_3= ',' ( (lv_options_4_0= ruleAttributeOption ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_56); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalUIDSL.g:4098:5: ( (lv_options_4_0= ruleAttributeOption ) )
                    	    // InternalUIDSL.g:4099:6: (lv_options_4_0= ruleAttributeOption )
                    	    {
                    	    // InternalUIDSL.g:4099:6: (lv_options_4_0= ruleAttributeOption )
                    	    // InternalUIDSL.g:4100:7: lv_options_4_0= ruleAttributeOption
                    	    {

                    	    							newCompositeNode(grammarAccess.getAttributeAccess().getOptionsAttributeOptionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_55);
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
                    	    break loop67;
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


    // $ANTLR start "entrySuperAttributeType"
    // InternalUIDSL.g:4127:1: entrySuperAttributeType returns [EObject current=null] : iv_superAttributeType= superAttributeType EOF ;
    public final EObject entrySuperAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_superAttributeType = null;


        try {
            // InternalUIDSL.g:4127:55: (iv_superAttributeType= superAttributeType EOF )
            // InternalUIDSL.g:4128:2: iv_superAttributeType= superAttributeType EOF
            {
             newCompositeNode(grammarAccess.getDomainModelAttributeTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_superAttributeType=superAttributeType();

            state._fsp--;

             current =iv_superAttributeType; 
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
    // $ANTLR end "entrySuperAttributeType"


    // $ANTLR start "superAttributeType"
    // InternalUIDSL.g:4134:1: superAttributeType returns [EObject current=null] : (this_SingleType_0= ruleSingleType | this_CollectionType_1= ruleCollectionType ) ;
    public final EObject superAttributeType() throws RecognitionException {
        EObject current = null;

        EObject this_SingleType_0 = null;

        EObject this_CollectionType_1 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:4140:2: ( (this_SingleType_0= ruleSingleType | this_CollectionType_1= ruleCollectionType ) )
            // InternalUIDSL.g:4141:2: (this_SingleType_0= ruleSingleType | this_CollectionType_1= ruleCollectionType )
            {
            // InternalUIDSL.g:4141:2: (this_SingleType_0= ruleSingleType | this_CollectionType_1= ruleCollectionType )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_ID||(LA69_0>=55 && LA69_0<=59)||(LA69_0>=70 && LA69_0<=74)) ) {
                alt69=1;
            }
            else if ( (LA69_0==75) ) {
                alt69=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // InternalUIDSL.g:4142:3: this_SingleType_0= ruleSingleType
                    {

                    			newCompositeNode(grammarAccess.getDomainModelAttributeTypeAccess().getSingleTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SingleType_0=ruleSingleType();

                    state._fsp--;


                    			current = this_SingleType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUIDSL.g:4151:3: this_CollectionType_1= ruleCollectionType
                    {

                    			newCompositeNode(grammarAccess.getDomainModelAttributeTypeAccess().getCollectionTypeParserRuleCall_1());
                    		
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
    // $ANTLR end "superAttributeType"


    // $ANTLR start "entryRuleSingleType"
    // InternalUIDSL.g:4163:1: entryRuleSingleType returns [EObject current=null] : iv_ruleSingleType= ruleSingleType EOF ;
    public final EObject entryRuleSingleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleType = null;


        try {
            // InternalUIDSL.g:4163:51: (iv_ruleSingleType= ruleSingleType EOF )
            // InternalUIDSL.g:4164:2: iv_ruleSingleType= ruleSingleType EOF
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
    // InternalUIDSL.g:4170:1: ruleSingleType returns [EObject current=null] : (this_BasicType_0= ruleBasicType | this_RefType_1= ruleRefType ) ;
    public final EObject ruleSingleType() throws RecognitionException {
        EObject current = null;

        EObject this_BasicType_0 = null;

        EObject this_RefType_1 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:4176:2: ( (this_BasicType_0= ruleBasicType | this_RefType_1= ruleRefType ) )
            // InternalUIDSL.g:4177:2: (this_BasicType_0= ruleBasicType | this_RefType_1= ruleRefType )
            {
            // InternalUIDSL.g:4177:2: (this_BasicType_0= ruleBasicType | this_RefType_1= ruleRefType )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=55 && LA70_0<=59)||(LA70_0>=70 && LA70_0<=74)) ) {
                alt70=1;
            }
            else if ( (LA70_0==RULE_ID) ) {
                alt70=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // InternalUIDSL.g:4178:3: this_BasicType_0= ruleBasicType
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
                    // InternalUIDSL.g:4187:3: this_RefType_1= ruleRefType
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
    // InternalUIDSL.g:4199:1: entrySuperBasicType returns [EObject current=null] : iv_superBasicType= superBasicType EOF ;
    public final EObject entrySuperBasicType() throws RecognitionException {
        EObject current = null;

        EObject iv_superBasicType = null;


        try {
            // InternalUIDSL.g:4199:51: (iv_superBasicType= superBasicType EOF )
            // InternalUIDSL.g:4200:2: iv_superBasicType= superBasicType EOF
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
    // InternalUIDSL.g:4206:1: superBasicType returns [EObject current=null] : ( ( () otherlv_1= 'string' ) | ( () otherlv_3= 'int' ) | ( () otherlv_5= 'long' ) | ( () otherlv_7= 'boolean' ) | ( () otherlv_9= 'date' ) ) ;
    public final EObject superBasicType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalUIDSL.g:4212:2: ( ( ( () otherlv_1= 'string' ) | ( () otherlv_3= 'int' ) | ( () otherlv_5= 'long' ) | ( () otherlv_7= 'boolean' ) | ( () otherlv_9= 'date' ) ) )
            // InternalUIDSL.g:4213:2: ( ( () otherlv_1= 'string' ) | ( () otherlv_3= 'int' ) | ( () otherlv_5= 'long' ) | ( () otherlv_7= 'boolean' ) | ( () otherlv_9= 'date' ) )
            {
            // InternalUIDSL.g:4213:2: ( ( () otherlv_1= 'string' ) | ( () otherlv_3= 'int' ) | ( () otherlv_5= 'long' ) | ( () otherlv_7= 'boolean' ) | ( () otherlv_9= 'date' ) )
            int alt71=5;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt71=1;
                }
                break;
            case 71:
                {
                alt71=2;
                }
                break;
            case 72:
                {
                alt71=3;
                }
                break;
            case 73:
                {
                alt71=4;
                }
                break;
            case 74:
                {
                alt71=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // InternalUIDSL.g:4214:3: ( () otherlv_1= 'string' )
                    {
                    // InternalUIDSL.g:4214:3: ( () otherlv_1= 'string' )
                    // InternalUIDSL.g:4215:4: () otherlv_1= 'string'
                    {
                    // InternalUIDSL.g:4215:4: ()
                    // InternalUIDSL.g:4216:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDomainModelBasicTypeAccess().getStringTypeAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,70,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getDomainModelBasicTypeAccess().getStringKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUIDSL.g:4228:3: ( () otherlv_3= 'int' )
                    {
                    // InternalUIDSL.g:4228:3: ( () otherlv_3= 'int' )
                    // InternalUIDSL.g:4229:4: () otherlv_3= 'int'
                    {
                    // InternalUIDSL.g:4229:4: ()
                    // InternalUIDSL.g:4230:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDomainModelBasicTypeAccess().getIntTypeAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,71,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getDomainModelBasicTypeAccess().getIntKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalUIDSL.g:4242:3: ( () otherlv_5= 'long' )
                    {
                    // InternalUIDSL.g:4242:3: ( () otherlv_5= 'long' )
                    // InternalUIDSL.g:4243:4: () otherlv_5= 'long'
                    {
                    // InternalUIDSL.g:4243:4: ()
                    // InternalUIDSL.g:4244:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDomainModelBasicTypeAccess().getLongTypeAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,72,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getDomainModelBasicTypeAccess().getLongKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalUIDSL.g:4256:3: ( () otherlv_7= 'boolean' )
                    {
                    // InternalUIDSL.g:4256:3: ( () otherlv_7= 'boolean' )
                    // InternalUIDSL.g:4257:4: () otherlv_7= 'boolean'
                    {
                    // InternalUIDSL.g:4257:4: ()
                    // InternalUIDSL.g:4258:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDomainModelBasicTypeAccess().getBoolTypeAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,73,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getDomainModelBasicTypeAccess().getBooleanKeyword_3_1());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalUIDSL.g:4270:3: ( () otherlv_9= 'date' )
                    {
                    // InternalUIDSL.g:4270:3: ( () otherlv_9= 'date' )
                    // InternalUIDSL.g:4271:4: () otherlv_9= 'date'
                    {
                    // InternalUIDSL.g:4271:4: ()
                    // InternalUIDSL.g:4272:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDomainModelBasicTypeAccess().getDateTypeAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_9=(Token)match(input,74,FOLLOW_2); 

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
    // InternalUIDSL.g:4287:1: entryRuleRefType returns [EObject current=null] : iv_ruleRefType= ruleRefType EOF ;
    public final EObject entryRuleRefType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefType = null;


        try {
            // InternalUIDSL.g:4287:48: (iv_ruleRefType= ruleRefType EOF )
            // InternalUIDSL.g:4288:2: iv_ruleRefType= ruleRefType EOF
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
    // InternalUIDSL.g:4294:1: ruleRefType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleRefType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalUIDSL.g:4300:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalUIDSL.g:4301:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalUIDSL.g:4301:2: ( (otherlv_0= RULE_ID ) )
            // InternalUIDSL.g:4302:3: (otherlv_0= RULE_ID )
            {
            // InternalUIDSL.g:4302:3: (otherlv_0= RULE_ID )
            // InternalUIDSL.g:4303:4: otherlv_0= RULE_ID
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
    // InternalUIDSL.g:4317:1: entryRuleCollectionType returns [EObject current=null] : iv_ruleCollectionType= ruleCollectionType EOF ;
    public final EObject entryRuleCollectionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionType = null;


        try {
            // InternalUIDSL.g:4317:55: (iv_ruleCollectionType= ruleCollectionType EOF )
            // InternalUIDSL.g:4318:2: iv_ruleCollectionType= ruleCollectionType EOF
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
    // InternalUIDSL.g:4324:1: ruleCollectionType returns [EObject current=null] : (otherlv_0= 'List' otherlv_1= '<' ( (lv_ofType_2_0= ruleSingleType ) ) otherlv_3= '>' ) ;
    public final EObject ruleCollectionType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ofType_2_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:4330:2: ( (otherlv_0= 'List' otherlv_1= '<' ( (lv_ofType_2_0= ruleSingleType ) ) otherlv_3= '>' ) )
            // InternalUIDSL.g:4331:2: (otherlv_0= 'List' otherlv_1= '<' ( (lv_ofType_2_0= ruleSingleType ) ) otherlv_3= '>' )
            {
            // InternalUIDSL.g:4331:2: (otherlv_0= 'List' otherlv_1= '<' ( (lv_ofType_2_0= ruleSingleType ) ) otherlv_3= '>' )
            // InternalUIDSL.g:4332:3: otherlv_0= 'List' otherlv_1= '<' ( (lv_ofType_2_0= ruleSingleType ) ) otherlv_3= '>'
            {
            otherlv_0=(Token)match(input,75,FOLLOW_57); 

            			newLeafNode(otherlv_0, grammarAccess.getCollectionTypeAccess().getListKeyword_0());
            		
            otherlv_1=(Token)match(input,76,FOLLOW_58); 

            			newLeafNode(otherlv_1, grammarAccess.getCollectionTypeAccess().getLessThanSignKeyword_1());
            		
            // InternalUIDSL.g:4340:3: ( (lv_ofType_2_0= ruleSingleType ) )
            // InternalUIDSL.g:4341:4: (lv_ofType_2_0= ruleSingleType )
            {
            // InternalUIDSL.g:4341:4: (lv_ofType_2_0= ruleSingleType )
            // InternalUIDSL.g:4342:5: lv_ofType_2_0= ruleSingleType
            {

            					newCompositeNode(grammarAccess.getCollectionTypeAccess().getOfTypeSingleTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_59);
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

            otherlv_3=(Token)match(input,77,FOLLOW_2); 

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


    // $ANTLR start "entrySuperSelectionMember"
    // InternalUIDSL.g:4367:1: entrySuperSelectionMember returns [EObject current=null] : iv_superSelectionMember= superSelectionMember EOF ;
    public final EObject entrySuperSelectionMember() throws RecognitionException {
        EObject current = null;

        EObject iv_superSelectionMember = null;


        try {
            // InternalUIDSL.g:4367:57: (iv_superSelectionMember= superSelectionMember EOF )
            // InternalUIDSL.g:4368:2: iv_superSelectionMember= superSelectionMember EOF
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
    // InternalUIDSL.g:4374:1: superSelectionMember returns [EObject current=null] : this_Attribute_0= ruleAttribute ;
    public final EObject superSelectionMember() throws RecognitionException {
        EObject current = null;

        EObject this_Attribute_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:4380:2: (this_Attribute_0= ruleAttribute )
            // InternalUIDSL.g:4381:2: this_Attribute_0= ruleAttribute
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
    // InternalUIDSL.g:4392:1: ruleCardinalityType returns [Enumerator current=null] : ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'many' ) ) ;
    public final Enumerator ruleCardinalityType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalUIDSL.g:4398:2: ( ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'many' ) ) )
            // InternalUIDSL.g:4399:2: ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'many' ) )
            {
            // InternalUIDSL.g:4399:2: ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'many' ) )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==78) ) {
                alt72=1;
            }
            else if ( (LA72_0==79) ) {
                alt72=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // InternalUIDSL.g:4400:3: (enumLiteral_0= 'one' )
                    {
                    // InternalUIDSL.g:4400:3: (enumLiteral_0= 'one' )
                    // InternalUIDSL.g:4401:4: enumLiteral_0= 'one'
                    {
                    enumLiteral_0=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getCardinalityTypeAccess().getOneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCardinalityTypeAccess().getOneEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUIDSL.g:4408:3: (enumLiteral_1= 'many' )
                    {
                    // InternalUIDSL.g:4408:3: (enumLiteral_1= 'many' )
                    // InternalUIDSL.g:4409:4: enumLiteral_1= 'many'
                    {
                    enumLiteral_1=(Token)match(input,79,FOLLOW_2); 

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


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA48 dfa48 = new DFA48(this);
    static final String dfa_1s = "\36\uffff";
    static final String dfa_2s = "\14\4\1\114\1\4\1\16\1\4\2\uffff\13\115\1\4";
    static final String dfa_3s = "\1\113\13\4\1\114\1\4\1\17\1\112\2\uffff\13\115\1\4";
    static final String dfa_4s = "\20\uffff\1\2\1\1\14\uffff";
    static final String dfa_5s = "\36\uffff}>";
    static final String[] dfa_6s = {
            "\1\13\44\uffff\1\15\15\uffff\1\6\1\7\1\10\1\11\1\12\12\uffff\1\1\1\2\1\3\1\4\1\5\1\14",
            "\1\16",
            "\1\16",
            "\1\16",
            "\1\16",
            "\1\16",
            "\1\16",
            "\1\16",
            "\1\16",
            "\1\16",
            "\1\16",
            "\1\16",
            "\1\17",
            "\1\16",
            "\1\21\1\20",
            "\1\34\62\uffff\1\27\1\30\1\31\1\32\1\33\12\uffff\1\22\1\23\1\24\1\25\1\26",
            "",
            "",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\16"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "240:2: (this_Field_0= ruleField | this_Method_1= ruleMethod )";
        }
    }
    static final String dfa_7s = "\44\uffff";
    static final String dfa_8s = "\1\uffff\13\24\1\uffff\1\24\3\26\1\27\21\uffff\1\24";
    static final String dfa_9s = "\14\4\1\114\5\4\3\uffff\1\4\2\uffff\13\115\1\4";
    static final String dfa_10s = "\1\113\13\52\1\114\5\52\3\uffff\1\112\2\uffff\13\115\1\52";
    static final String dfa_11s = "\22\uffff\1\4\1\2\1\1\1\uffff\1\3\1\5\14\uffff";
    static final String dfa_12s = "\44\uffff}>";
    static final String[] dfa_13s = {
            "\1\13\15\uffff\1\21\22\uffff\1\16\1\17\1\20\1\22\1\15\15\uffff\1\6\1\7\1\10\1\11\1\12\12\uffff\1\1\1\2\1\3\1\4\1\5\1\14",
            "\1\24\10\uffff\1\24\11\uffff\2\24\21\uffff\1\23",
            "\1\24\10\uffff\1\24\11\uffff\2\24\21\uffff\1\23",
            "\1\24\10\uffff\1\24\11\uffff\2\24\21\uffff\1\23",
            "\1\24\10\uffff\1\24\11\uffff\2\24\21\uffff\1\23",
            "\1\24\10\uffff\1\24\11\uffff\2\24\21\uffff\1\23",
            "\1\24\10\uffff\1\24\11\uffff\2\24\21\uffff\1\23",
            "\1\24\10\uffff\1\24\11\uffff\2\24\21\uffff\1\23",
            "\1\24\10\uffff\1\24\11\uffff\2\24\21\uffff\1\23",
            "\1\24\10\uffff\1\24\11\uffff\2\24\21\uffff\1\23",
            "\1\24\10\uffff\1\24\11\uffff\2\24\21\uffff\1\23",
            "\1\24\10\uffff\1\24\11\uffff\2\24\21\uffff\1\23",
            "\1\25",
            "\1\24\10\uffff\1\24\11\uffff\2\24\21\uffff\1\23",
            "\1\26\10\uffff\1\26\11\uffff\2\26\21\uffff\1\23",
            "\1\26\10\uffff\1\26\11\uffff\2\26\21\uffff\1\23",
            "\1\26\10\uffff\1\26\11\uffff\2\26\21\uffff\1\23",
            "\1\27\10\uffff\1\27\11\uffff\2\27\21\uffff\1\23",
            "",
            "",
            "",
            "\1\42\62\uffff\1\35\1\36\1\37\1\40\1\41\12\uffff\1\30\1\31\1\32\1\33\1\34",
            "",
            "",
            "\1\43",
            "\1\43",
            "\1\43",
            "\1\43",
            "\1\43",
            "\1\43",
            "\1\43",
            "\1\43",
            "\1\43",
            "\1\43",
            "\1\43",
            "\1\24\10\uffff\1\24\11\uffff\2\24\21\uffff\1\23"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA48 extends DFA {

        public DFA48(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 48;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "2696:6: (lv_type_1_1= ruleAttributeType | lv_type_1_2= ruleAlternativeType | lv_type_1_3= ruleGeneralType | lv_type_1_4= ruleAnyType | lv_type_1_5= rulePageType )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00002004004C0802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0F80020000002010L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0F80020000020010L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0F80020000000010L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000281000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000081000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00060003C0002010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001802010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000030100000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020100000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0F801BE000040010L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000001012L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0006000040002000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x6000000000000070L,0x0000000000000001L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00060001C0002010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000201000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001000008002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x6000000000020070L,0x0000000000000001L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0F8002E000040010L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000400000002000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0F8000E000000000L,0x00000000000007C0L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0010000000001000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x6000000000000060L,0x0000000000000001L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000038L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0060000000004000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0F80000000000010L,0x00000000000007C0L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});

}
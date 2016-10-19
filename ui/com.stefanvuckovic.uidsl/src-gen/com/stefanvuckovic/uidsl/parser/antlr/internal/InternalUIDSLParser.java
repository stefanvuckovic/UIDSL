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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'server_component'", "'{'", "'}'", "';'", "'('", "','", "')'", "'page'", "'template'", "':'", "'uses'", "'component'", "'allowed_nested_components'", "'child_component'", "'cardinality'", "'='", "'ALL'", "'required'", "'valueProperty'", "'#'", "'if'", "'for'", "'override'", "'fragment'", "'in'", "'.'", "'object'", "'enum'", "'collection'", "'any'", "'void'", "'or'", "'typeOf'", "'singleTypeOf'", "'defaults'", "'default'", "'input_component'", "'output_component'", "'input'", "'output'", "'custom'", "'define'", "'implicit_variables'", "'class'", "'extends'", "'representation'", "'@id'", "'text'", "'email'", "'password'", "'file'", "'image'", "'L'", "'true'", "'false'", "'/'", "'null'", "'deleteByFlag'", "'inheritance'", "'SINGLE_TABLE'", "'TABLE_PER_CONCRETE_CLASS'", "'TABLE_PER_CLASS'", "'string'", "'int'", "'long'", "'boolean'", "'date'", "'decimal'", "'List'", "'<'", "'>'", "'one'", "'many'"
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
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
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
    // InternalUIDSL.g:72:1: ruleUIModel returns [EObject current=null] : ( ( (lv_concepts_0_1= ruleServerComponent | lv_concepts_0_2= ruleUIContainer | lv_concepts_0_3= ruleUIComponent | lv_concepts_0_4= ruleDefaultConfigurations | lv_concepts_0_5= ruleCustomDefaultComponentsDefinition ) ) )* ;
    public final EObject ruleUIModel() throws RecognitionException {
        EObject current = null;

        EObject lv_concepts_0_1 = null;

        EObject lv_concepts_0_2 = null;

        EObject lv_concepts_0_3 = null;

        EObject lv_concepts_0_4 = null;

        EObject lv_concepts_0_5 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:78:2: ( ( ( (lv_concepts_0_1= ruleServerComponent | lv_concepts_0_2= ruleUIContainer | lv_concepts_0_3= ruleUIComponent | lv_concepts_0_4= ruleDefaultConfigurations | lv_concepts_0_5= ruleCustomDefaultComponentsDefinition ) ) )* )
            // InternalUIDSL.g:79:2: ( ( (lv_concepts_0_1= ruleServerComponent | lv_concepts_0_2= ruleUIContainer | lv_concepts_0_3= ruleUIComponent | lv_concepts_0_4= ruleDefaultConfigurations | lv_concepts_0_5= ruleCustomDefaultComponentsDefinition ) ) )*
            {
            // InternalUIDSL.g:79:2: ( ( (lv_concepts_0_1= ruleServerComponent | lv_concepts_0_2= ruleUIContainer | lv_concepts_0_3= ruleUIComponent | lv_concepts_0_4= ruleDefaultConfigurations | lv_concepts_0_5= ruleCustomDefaultComponentsDefinition ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11||(LA2_0>=18 && LA2_0<=19)||LA2_0==22||LA2_0==34||LA2_0==45||LA2_0==51) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalUIDSL.g:80:3: ( (lv_concepts_0_1= ruleServerComponent | lv_concepts_0_2= ruleUIContainer | lv_concepts_0_3= ruleUIComponent | lv_concepts_0_4= ruleDefaultConfigurations | lv_concepts_0_5= ruleCustomDefaultComponentsDefinition ) )
            	    {
            	    // InternalUIDSL.g:80:3: ( (lv_concepts_0_1= ruleServerComponent | lv_concepts_0_2= ruleUIContainer | lv_concepts_0_3= ruleUIComponent | lv_concepts_0_4= ruleDefaultConfigurations | lv_concepts_0_5= ruleCustomDefaultComponentsDefinition ) )
            	    // InternalUIDSL.g:81:4: (lv_concepts_0_1= ruleServerComponent | lv_concepts_0_2= ruleUIContainer | lv_concepts_0_3= ruleUIComponent | lv_concepts_0_4= ruleDefaultConfigurations | lv_concepts_0_5= ruleCustomDefaultComponentsDefinition )
            	    {
            	    // InternalUIDSL.g:81:4: (lv_concepts_0_1= ruleServerComponent | lv_concepts_0_2= ruleUIContainer | lv_concepts_0_3= ruleUIComponent | lv_concepts_0_4= ruleDefaultConfigurations | lv_concepts_0_5= ruleCustomDefaultComponentsDefinition )
            	    int alt1=5;
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
            	    case 51:
            	        {
            	        alt1=5;
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
            	        case 5 :
            	            // InternalUIDSL.g:146:5: lv_concepts_0_5= ruleCustomDefaultComponentsDefinition
            	            {

            	            					newCompositeNode(grammarAccess.getUIModelAccess().getConceptsCustomDefaultComponentsDefinitionParserRuleCall_0_4());
            	            				
            	            pushFollow(FOLLOW_3);
            	            lv_concepts_0_5=ruleCustomDefaultComponentsDefinition();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getUIModelRule());
            	            					}
            	            					add(
            	            						current,
            	            						"concepts",
            	            						lv_concepts_0_5,
            	            						"com.stefanvuckovic.uidsl.UIDSL.CustomDefaultComponentsDefinition");
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
    // InternalUIDSL.g:167:1: entryRuleServerComponent returns [EObject current=null] : iv_ruleServerComponent= ruleServerComponent EOF ;
    public final EObject entryRuleServerComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServerComponent = null;


        try {
            // InternalUIDSL.g:167:56: (iv_ruleServerComponent= ruleServerComponent EOF )
            // InternalUIDSL.g:168:2: iv_ruleServerComponent= ruleServerComponent EOF
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
    // InternalUIDSL.g:174:1: ruleServerComponent returns [EObject current=null] : ( () otherlv_1= 'server_component' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_members_4_0= ruleMember ) )* otherlv_5= '}' ) ;
    public final EObject ruleServerComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_members_4_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:180:2: ( ( () otherlv_1= 'server_component' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_members_4_0= ruleMember ) )* otherlv_5= '}' ) )
            // InternalUIDSL.g:181:2: ( () otherlv_1= 'server_component' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_members_4_0= ruleMember ) )* otherlv_5= '}' )
            {
            // InternalUIDSL.g:181:2: ( () otherlv_1= 'server_component' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_members_4_0= ruleMember ) )* otherlv_5= '}' )
            // InternalUIDSL.g:182:3: () otherlv_1= 'server_component' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_members_4_0= ruleMember ) )* otherlv_5= '}'
            {
            // InternalUIDSL.g:182:3: ()
            // InternalUIDSL.g:183:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getServerComponentAccess().getServerComponentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getServerComponentAccess().getServer_componentKeyword_1());
            		
            // InternalUIDSL.g:193:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUIDSL.g:194:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUIDSL.g:194:4: (lv_name_2_0= RULE_ID )
            // InternalUIDSL.g:195:5: lv_name_2_0= RULE_ID
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
            		
            // InternalUIDSL.g:215:3: ( (lv_members_4_0= ruleMember ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||LA3_0==41||(LA3_0>=58 && LA3_0<=62)||(LA3_0>=73 && LA3_0<=79)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalUIDSL.g:216:4: (lv_members_4_0= ruleMember )
            	    {
            	    // InternalUIDSL.g:216:4: (lv_members_4_0= ruleMember )
            	    // InternalUIDSL.g:217:5: lv_members_4_0= ruleMember
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
    // InternalUIDSL.g:242:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // InternalUIDSL.g:242:47: (iv_ruleMember= ruleMember EOF )
            // InternalUIDSL.g:243:2: iv_ruleMember= ruleMember EOF
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
    // InternalUIDSL.g:249:1: ruleMember returns [EObject current=null] : (this_Field_0= ruleField | this_Method_1= ruleMethod ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        EObject this_Field_0 = null;

        EObject this_Method_1 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:255:2: ( (this_Field_0= ruleField | this_Method_1= ruleMethod ) )
            // InternalUIDSL.g:256:2: (this_Field_0= ruleField | this_Method_1= ruleMethod )
            {
            // InternalUIDSL.g:256:2: (this_Field_0= ruleField | this_Method_1= ruleMethod )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalUIDSL.g:257:3: this_Field_0= ruleField
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
                    // InternalUIDSL.g:266:3: this_Method_1= ruleMethod
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
    // InternalUIDSL.g:278:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalUIDSL.g:278:46: (iv_ruleField= ruleField EOF )
            // InternalUIDSL.g:279:2: iv_ruleField= ruleField EOF
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
    // InternalUIDSL.g:285:1: ruleField returns [EObject current=null] : (this_TypedConcept_0= ruleTypedConcept[$current] otherlv_1= ';' ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_TypedConcept_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:291:2: ( (this_TypedConcept_0= ruleTypedConcept[$current] otherlv_1= ';' ) )
            // InternalUIDSL.g:292:2: (this_TypedConcept_0= ruleTypedConcept[$current] otherlv_1= ';' )
            {
            // InternalUIDSL.g:292:2: (this_TypedConcept_0= ruleTypedConcept[$current] otherlv_1= ';' )
            // InternalUIDSL.g:293:3: this_TypedConcept_0= ruleTypedConcept[$current] otherlv_1= ';'
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
    // InternalUIDSL.g:312:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalUIDSL.g:312:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalUIDSL.g:313:2: iv_ruleMethod= ruleMethod EOF
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
    // InternalUIDSL.g:319:1: ruleMethod returns [EObject current=null] : (this_TypedConcept_0= ruleTypedConcept[$current] otherlv_1= '(' ( ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) )* )? otherlv_5= ')' otherlv_6= ';' ) ;
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
            // InternalUIDSL.g:325:2: ( (this_TypedConcept_0= ruleTypedConcept[$current] otherlv_1= '(' ( ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) )* )? otherlv_5= ')' otherlv_6= ';' ) )
            // InternalUIDSL.g:326:2: (this_TypedConcept_0= ruleTypedConcept[$current] otherlv_1= '(' ( ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) )* )? otherlv_5= ')' otherlv_6= ';' )
            {
            // InternalUIDSL.g:326:2: (this_TypedConcept_0= ruleTypedConcept[$current] otherlv_1= '(' ( ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) )* )? otherlv_5= ')' otherlv_6= ';' )
            // InternalUIDSL.g:327:3: this_TypedConcept_0= ruleTypedConcept[$current] otherlv_1= '(' ( ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) )* )? otherlv_5= ')' otherlv_6= ';'
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
            		
            // InternalUIDSL.g:342:3: ( ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID||LA6_0==41||(LA6_0>=58 && LA6_0<=62)||(LA6_0>=73 && LA6_0<=79)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalUIDSL.g:343:4: ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) )*
                    {
                    // InternalUIDSL.g:343:4: ( (lv_params_2_0= ruleVariable ) )
                    // InternalUIDSL.g:344:5: (lv_params_2_0= ruleVariable )
                    {
                    // InternalUIDSL.g:344:5: (lv_params_2_0= ruleVariable )
                    // InternalUIDSL.g:345:6: lv_params_2_0= ruleVariable
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

                    // InternalUIDSL.g:362:4: (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==16) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalUIDSL.g:363:5: otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_11); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getMethodAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalUIDSL.g:367:5: ( (lv_params_4_0= ruleVariable ) )
                    	    // InternalUIDSL.g:368:6: (lv_params_4_0= ruleVariable )
                    	    {
                    	    // InternalUIDSL.g:368:6: (lv_params_4_0= ruleVariable )
                    	    // InternalUIDSL.g:369:7: lv_params_4_0= ruleVariable
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
    // InternalUIDSL.g:400:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalUIDSL.g:400:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalUIDSL.g:401:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalUIDSL.g:407:1: ruleVariable returns [EObject current=null] : this_TypedConcept_0= ruleTypedConcept[$current] ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        EObject this_TypedConcept_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:413:2: (this_TypedConcept_0= ruleTypedConcept[$current] )
            // InternalUIDSL.g:414:2: this_TypedConcept_0= ruleTypedConcept[$current]
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
    // InternalUIDSL.g:428:1: entryRuleInlineVariable returns [EObject current=null] : iv_ruleInlineVariable= ruleInlineVariable EOF ;
    public final EObject entryRuleInlineVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlineVariable = null;


        try {
            // InternalUIDSL.g:428:55: (iv_ruleInlineVariable= ruleInlineVariable EOF )
            // InternalUIDSL.g:429:2: iv_ruleInlineVariable= ruleInlineVariable EOF
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
    // InternalUIDSL.g:435:1: ruleInlineVariable returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleInlineVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalUIDSL.g:441:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalUIDSL.g:442:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalUIDSL.g:442:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalUIDSL.g:443:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalUIDSL.g:443:3: ()
            // InternalUIDSL.g:444:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInlineVariableAccess().getInlineVariableAction_0(),
            					current);
            			

            }

            // InternalUIDSL.g:450:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUIDSL.g:451:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUIDSL.g:451:4: (lv_name_1_0= RULE_ID )
            // InternalUIDSL.g:452:5: lv_name_1_0= RULE_ID
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
    // InternalUIDSL.g:473:1: ruleTypedConcept[EObject in_current] returns [EObject current=in_current] : ( ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTypedConcept(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:479:2: ( ( ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalUIDSL.g:480:2: ( ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalUIDSL.g:480:2: ( ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalUIDSL.g:481:3: ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalUIDSL.g:481:3: ( (lv_type_0_0= ruleAttributeType ) )
            // InternalUIDSL.g:482:4: (lv_type_0_0= ruleAttributeType )
            {
            // InternalUIDSL.g:482:4: (lv_type_0_0= ruleAttributeType )
            // InternalUIDSL.g:483:5: lv_type_0_0= ruleAttributeType
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

            // InternalUIDSL.g:500:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUIDSL.g:501:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUIDSL.g:501:4: (lv_name_1_0= RULE_ID )
            // InternalUIDSL.g:502:5: lv_name_1_0= RULE_ID
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
    // InternalUIDSL.g:522:1: entryRuleUIContainer returns [EObject current=null] : iv_ruleUIContainer= ruleUIContainer EOF ;
    public final EObject entryRuleUIContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIContainer = null;


        try {
            // InternalUIDSL.g:522:52: (iv_ruleUIContainer= ruleUIContainer EOF )
            // InternalUIDSL.g:523:2: iv_ruleUIContainer= ruleUIContainer EOF
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
    // InternalUIDSL.g:529:1: ruleUIContainer returns [EObject current=null] : (this_Page_0= rulePage | this_Template_1= ruleTemplate | this_Fragment_2= ruleFragment ) ;
    public final EObject ruleUIContainer() throws RecognitionException {
        EObject current = null;

        EObject this_Page_0 = null;

        EObject this_Template_1 = null;

        EObject this_Fragment_2 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:535:2: ( (this_Page_0= rulePage | this_Template_1= ruleTemplate | this_Fragment_2= ruleFragment ) )
            // InternalUIDSL.g:536:2: (this_Page_0= rulePage | this_Template_1= ruleTemplate | this_Fragment_2= ruleFragment )
            {
            // InternalUIDSL.g:536:2: (this_Page_0= rulePage | this_Template_1= ruleTemplate | this_Fragment_2= ruleFragment )
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
                    // InternalUIDSL.g:537:3: this_Page_0= rulePage
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
                    // InternalUIDSL.g:546:3: this_Template_1= ruleTemplate
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
                    // InternalUIDSL.g:555:3: this_Fragment_2= ruleFragment
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
    // InternalUIDSL.g:567:1: entryRulePage returns [EObject current=null] : iv_rulePage= rulePage EOF ;
    public final EObject entryRulePage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePage = null;


        try {
            // InternalUIDSL.g:567:45: (iv_rulePage= rulePage EOF )
            // InternalUIDSL.g:568:2: iv_rulePage= rulePage EOF
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
    // InternalUIDSL.g:574:1: rulePage returns [EObject current=null] : (otherlv_0= 'page' this_UIContainerDefinition_1= ruleUIContainerDefinition[$current] this_ServerComponentUsage_2= ruleServerComponentUsage[$current] (otherlv_3= 'template' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '{' ( ( (lv_elements_7_1= ruleUIElement | lv_elements_7_2= ruleTemplateFragmentOverride ) ) )* otherlv_8= '}' ) ;
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
            // InternalUIDSL.g:580:2: ( (otherlv_0= 'page' this_UIContainerDefinition_1= ruleUIContainerDefinition[$current] this_ServerComponentUsage_2= ruleServerComponentUsage[$current] (otherlv_3= 'template' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '{' ( ( (lv_elements_7_1= ruleUIElement | lv_elements_7_2= ruleTemplateFragmentOverride ) ) )* otherlv_8= '}' ) )
            // InternalUIDSL.g:581:2: (otherlv_0= 'page' this_UIContainerDefinition_1= ruleUIContainerDefinition[$current] this_ServerComponentUsage_2= ruleServerComponentUsage[$current] (otherlv_3= 'template' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '{' ( ( (lv_elements_7_1= ruleUIElement | lv_elements_7_2= ruleTemplateFragmentOverride ) ) )* otherlv_8= '}' )
            {
            // InternalUIDSL.g:581:2: (otherlv_0= 'page' this_UIContainerDefinition_1= ruleUIContainerDefinition[$current] this_ServerComponentUsage_2= ruleServerComponentUsage[$current] (otherlv_3= 'template' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '{' ( ( (lv_elements_7_1= ruleUIElement | lv_elements_7_2= ruleTemplateFragmentOverride ) ) )* otherlv_8= '}' )
            // InternalUIDSL.g:582:3: otherlv_0= 'page' this_UIContainerDefinition_1= ruleUIContainerDefinition[$current] this_ServerComponentUsage_2= ruleServerComponentUsage[$current] (otherlv_3= 'template' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '{' ( ( (lv_elements_7_1= ruleUIElement | lv_elements_7_2= ruleTemplateFragmentOverride ) ) )* otherlv_8= '}'
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
            		
            // InternalUIDSL.g:608:3: (otherlv_3= 'template' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalUIDSL.g:609:4: otherlv_3= 'template' otherlv_4= ':' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getPageAccess().getTemplateKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getPageAccess().getColonKeyword_3_1());
                    			
                    // InternalUIDSL.g:617:4: ( (otherlv_5= RULE_ID ) )
                    // InternalUIDSL.g:618:5: (otherlv_5= RULE_ID )
                    {
                    // InternalUIDSL.g:618:5: (otherlv_5= RULE_ID )
                    // InternalUIDSL.g:619:6: otherlv_5= RULE_ID
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
            		
            // InternalUIDSL.g:635:3: ( ( (lv_elements_7_1= ruleUIElement | lv_elements_7_2= ruleTemplateFragmentOverride ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||(LA10_0>=30 && LA10_0<=33)||(LA10_0>=49 && LA10_0<=50)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalUIDSL.g:636:4: ( (lv_elements_7_1= ruleUIElement | lv_elements_7_2= ruleTemplateFragmentOverride ) )
            	    {
            	    // InternalUIDSL.g:636:4: ( (lv_elements_7_1= ruleUIElement | lv_elements_7_2= ruleTemplateFragmentOverride ) )
            	    // InternalUIDSL.g:637:5: (lv_elements_7_1= ruleUIElement | lv_elements_7_2= ruleTemplateFragmentOverride )
            	    {
            	    // InternalUIDSL.g:637:5: (lv_elements_7_1= ruleUIElement | lv_elements_7_2= ruleTemplateFragmentOverride )
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
            	            // InternalUIDSL.g:638:6: lv_elements_7_1= ruleUIElement
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
            	            // InternalUIDSL.g:654:6: lv_elements_7_2= ruleTemplateFragmentOverride
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
    // InternalUIDSL.g:681:1: ruleUIContainerDefinition[EObject in_current] returns [EObject current=in_current] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) )* )? otherlv_5= ')' ) ;
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
            // InternalUIDSL.g:687:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) )* )? otherlv_5= ')' ) )
            // InternalUIDSL.g:688:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) )* )? otherlv_5= ')' )
            {
            // InternalUIDSL.g:688:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) )* )? otherlv_5= ')' )
            // InternalUIDSL.g:689:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) )* )? otherlv_5= ')'
            {
            // InternalUIDSL.g:689:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalUIDSL.g:690:4: (lv_name_0_0= RULE_ID )
            {
            // InternalUIDSL.g:690:4: (lv_name_0_0= RULE_ID )
            // InternalUIDSL.g:691:5: lv_name_0_0= RULE_ID
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
            		
            // InternalUIDSL.g:711:3: ( ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID||LA12_0==41||(LA12_0>=58 && LA12_0<=62)||(LA12_0>=73 && LA12_0<=79)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalUIDSL.g:712:4: ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) )*
                    {
                    // InternalUIDSL.g:712:4: ( (lv_params_2_0= ruleVariable ) )
                    // InternalUIDSL.g:713:5: (lv_params_2_0= ruleVariable )
                    {
                    // InternalUIDSL.g:713:5: (lv_params_2_0= ruleVariable )
                    // InternalUIDSL.g:714:6: lv_params_2_0= ruleVariable
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

                    // InternalUIDSL.g:731:4: (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==16) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalUIDSL.g:732:5: otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_11); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getUIContainerDefinitionAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalUIDSL.g:736:5: ( (lv_params_4_0= ruleVariable ) )
                    	    // InternalUIDSL.g:737:6: (lv_params_4_0= ruleVariable )
                    	    {
                    	    // InternalUIDSL.g:737:6: (lv_params_4_0= ruleVariable )
                    	    // InternalUIDSL.g:738:7: lv_params_4_0= ruleVariable
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
    // InternalUIDSL.g:766:1: ruleServerComponentUsage[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'uses' ( (lv_serverComponents_1_0= ruleVariable ) ) (otherlv_2= ',' ( (lv_serverComponents_3_0= ruleVariable ) ) )* )? ;
    public final EObject ruleServerComponentUsage(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_serverComponents_1_0 = null;

        EObject lv_serverComponents_3_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:772:2: ( (otherlv_0= 'uses' ( (lv_serverComponents_1_0= ruleVariable ) ) (otherlv_2= ',' ( (lv_serverComponents_3_0= ruleVariable ) ) )* )? )
            // InternalUIDSL.g:773:2: (otherlv_0= 'uses' ( (lv_serverComponents_1_0= ruleVariable ) ) (otherlv_2= ',' ( (lv_serverComponents_3_0= ruleVariable ) ) )* )?
            {
            // InternalUIDSL.g:773:2: (otherlv_0= 'uses' ( (lv_serverComponents_1_0= ruleVariable ) ) (otherlv_2= ',' ( (lv_serverComponents_3_0= ruleVariable ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalUIDSL.g:774:3: otherlv_0= 'uses' ( (lv_serverComponents_1_0= ruleVariable ) ) (otherlv_2= ',' ( (lv_serverComponents_3_0= ruleVariable ) ) )*
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_11); 

                    			newLeafNode(otherlv_0, grammarAccess.getServerComponentUsageAccess().getUsesKeyword_0());
                    		
                    // InternalUIDSL.g:778:3: ( (lv_serverComponents_1_0= ruleVariable ) )
                    // InternalUIDSL.g:779:4: (lv_serverComponents_1_0= ruleVariable )
                    {
                    // InternalUIDSL.g:779:4: (lv_serverComponents_1_0= ruleVariable )
                    // InternalUIDSL.g:780:5: lv_serverComponents_1_0= ruleVariable
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

                    // InternalUIDSL.g:797:3: (otherlv_2= ',' ( (lv_serverComponents_3_0= ruleVariable ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==16) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalUIDSL.g:798:4: otherlv_2= ',' ( (lv_serverComponents_3_0= ruleVariable ) )
                    	    {
                    	    otherlv_2=(Token)match(input,16,FOLLOW_11); 

                    	    				newLeafNode(otherlv_2, grammarAccess.getServerComponentUsageAccess().getCommaKeyword_2_0());
                    	    			
                    	    // InternalUIDSL.g:802:4: ( (lv_serverComponents_3_0= ruleVariable ) )
                    	    // InternalUIDSL.g:803:5: (lv_serverComponents_3_0= ruleVariable )
                    	    {
                    	    // InternalUIDSL.g:803:5: (lv_serverComponents_3_0= ruleVariable )
                    	    // InternalUIDSL.g:804:6: lv_serverComponents_3_0= ruleVariable
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
    // InternalUIDSL.g:826:1: entryRuleUIElement returns [EObject current=null] : iv_ruleUIElement= ruleUIElement EOF ;
    public final EObject entryRuleUIElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIElement = null;


        try {
            // InternalUIDSL.g:826:50: (iv_ruleUIElement= ruleUIElement EOF )
            // InternalUIDSL.g:827:2: iv_ruleUIElement= ruleUIElement EOF
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
    // InternalUIDSL.g:833:1: ruleUIElement returns [EObject current=null] : (this_Component_0= ruleComponent | this_LogicElement_1= ruleLogicElement | this_FragmentCall_2= ruleFragmentCall ) ;
    public final EObject ruleUIElement() throws RecognitionException {
        EObject current = null;

        EObject this_Component_0 = null;

        EObject this_LogicElement_1 = null;

        EObject this_FragmentCall_2 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:839:2: ( (this_Component_0= ruleComponent | this_LogicElement_1= ruleLogicElement | this_FragmentCall_2= ruleFragmentCall ) )
            // InternalUIDSL.g:840:2: (this_Component_0= ruleComponent | this_LogicElement_1= ruleLogicElement | this_FragmentCall_2= ruleFragmentCall )
            {
            // InternalUIDSL.g:840:2: (this_Component_0= ruleComponent | this_LogicElement_1= ruleLogicElement | this_FragmentCall_2= ruleFragmentCall )
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
                    // InternalUIDSL.g:841:3: this_Component_0= ruleComponent
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
                    // InternalUIDSL.g:850:3: this_LogicElement_1= ruleLogicElement
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
                    // InternalUIDSL.g:859:3: this_FragmentCall_2= ruleFragmentCall
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
    // InternalUIDSL.g:871:1: entryRuleUIComponent returns [EObject current=null] : iv_ruleUIComponent= ruleUIComponent EOF ;
    public final EObject entryRuleUIComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIComponent = null;


        try {
            // InternalUIDSL.g:871:52: (iv_ruleUIComponent= ruleUIComponent EOF )
            // InternalUIDSL.g:872:2: iv_ruleUIComponent= ruleUIComponent EOF
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
    // InternalUIDSL.g:878:1: ruleUIComponent returns [EObject current=null] : (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= rulePropertyValue ) )* ( (lv_nested_4_0= ruleNestedComponent ) )? otherlv_5= '}' ) ;
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
            // InternalUIDSL.g:884:2: ( (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= rulePropertyValue ) )* ( (lv_nested_4_0= ruleNestedComponent ) )? otherlv_5= '}' ) )
            // InternalUIDSL.g:885:2: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= rulePropertyValue ) )* ( (lv_nested_4_0= ruleNestedComponent ) )? otherlv_5= '}' )
            {
            // InternalUIDSL.g:885:2: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= rulePropertyValue ) )* ( (lv_nested_4_0= ruleNestedComponent ) )? otherlv_5= '}' )
            // InternalUIDSL.g:886:3: otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= rulePropertyValue ) )* ( (lv_nested_4_0= ruleNestedComponent ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getUIComponentAccess().getComponentKeyword_0());
            		
            // InternalUIDSL.g:890:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUIDSL.g:891:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUIDSL.g:891:4: (lv_name_1_0= RULE_ID )
            // InternalUIDSL.g:892:5: lv_name_1_0= RULE_ID
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
            		
            // InternalUIDSL.g:912:3: ( (lv_properties_3_0= rulePropertyValue ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalUIDSL.g:913:4: (lv_properties_3_0= rulePropertyValue )
            	    {
            	    // InternalUIDSL.g:913:4: (lv_properties_3_0= rulePropertyValue )
            	    // InternalUIDSL.g:914:5: lv_properties_3_0= rulePropertyValue
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

            // InternalUIDSL.g:931:3: ( (lv_nested_4_0= ruleNestedComponent ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=23 && LA17_0<=24)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalUIDSL.g:932:4: (lv_nested_4_0= ruleNestedComponent )
                    {
                    // InternalUIDSL.g:932:4: (lv_nested_4_0= ruleNestedComponent )
                    // InternalUIDSL.g:933:5: lv_nested_4_0= ruleNestedComponent
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
    // InternalUIDSL.g:958:1: entryRuleNestedComponent returns [EObject current=null] : iv_ruleNestedComponent= ruleNestedComponent EOF ;
    public final EObject entryRuleNestedComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedComponent = null;


        try {
            // InternalUIDSL.g:958:56: (iv_ruleNestedComponent= ruleNestedComponent EOF )
            // InternalUIDSL.g:959:2: iv_ruleNestedComponent= ruleNestedComponent EOF
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
    // InternalUIDSL.g:965:1: ruleNestedComponent returns [EObject current=null] : (this_ChildUIComponent_0= ruleChildUIComponent | ( () otherlv_2= 'allowed_nested_components' otherlv_3= ':' ( (lv_nestedComponents_4_0= ruleAllowedNestedComponents ) ) ) ) ;
    public final EObject ruleNestedComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_ChildUIComponent_0 = null;

        EObject lv_nestedComponents_4_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:971:2: ( (this_ChildUIComponent_0= ruleChildUIComponent | ( () otherlv_2= 'allowed_nested_components' otherlv_3= ':' ( (lv_nestedComponents_4_0= ruleAllowedNestedComponents ) ) ) ) )
            // InternalUIDSL.g:972:2: (this_ChildUIComponent_0= ruleChildUIComponent | ( () otherlv_2= 'allowed_nested_components' otherlv_3= ':' ( (lv_nestedComponents_4_0= ruleAllowedNestedComponents ) ) ) )
            {
            // InternalUIDSL.g:972:2: (this_ChildUIComponent_0= ruleChildUIComponent | ( () otherlv_2= 'allowed_nested_components' otherlv_3= ':' ( (lv_nestedComponents_4_0= ruleAllowedNestedComponents ) ) ) )
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
                    // InternalUIDSL.g:973:3: this_ChildUIComponent_0= ruleChildUIComponent
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
                    // InternalUIDSL.g:982:3: ( () otherlv_2= 'allowed_nested_components' otherlv_3= ':' ( (lv_nestedComponents_4_0= ruleAllowedNestedComponents ) ) )
                    {
                    // InternalUIDSL.g:982:3: ( () otherlv_2= 'allowed_nested_components' otherlv_3= ':' ( (lv_nestedComponents_4_0= ruleAllowedNestedComponents ) ) )
                    // InternalUIDSL.g:983:4: () otherlv_2= 'allowed_nested_components' otherlv_3= ':' ( (lv_nestedComponents_4_0= ruleAllowedNestedComponents ) )
                    {
                    // InternalUIDSL.g:983:4: ()
                    // InternalUIDSL.g:984:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNestedComponentAccess().getExistingNestedComponentsAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,23,FOLLOW_14); 

                    				newLeafNode(otherlv_2, grammarAccess.getNestedComponentAccess().getAllowed_nested_componentsKeyword_1_1());
                    			
                    otherlv_3=(Token)match(input,20,FOLLOW_19); 

                    				newLeafNode(otherlv_3, grammarAccess.getNestedComponentAccess().getColonKeyword_1_2());
                    			
                    // InternalUIDSL.g:998:4: ( (lv_nestedComponents_4_0= ruleAllowedNestedComponents ) )
                    // InternalUIDSL.g:999:5: (lv_nestedComponents_4_0= ruleAllowedNestedComponents )
                    {
                    // InternalUIDSL.g:999:5: (lv_nestedComponents_4_0= ruleAllowedNestedComponents )
                    // InternalUIDSL.g:1000:6: lv_nestedComponents_4_0= ruleAllowedNestedComponents
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
    // InternalUIDSL.g:1022:1: entryRuleChildUIComponent returns [EObject current=null] : iv_ruleChildUIComponent= ruleChildUIComponent EOF ;
    public final EObject entryRuleChildUIComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChildUIComponent = null;


        try {
            // InternalUIDSL.g:1022:57: (iv_ruleChildUIComponent= ruleChildUIComponent EOF )
            // InternalUIDSL.g:1023:2: iv_ruleChildUIComponent= ruleChildUIComponent EOF
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
    // InternalUIDSL.g:1029:1: ruleChildUIComponent returns [EObject current=null] : (otherlv_0= 'child_component' otherlv_1= 'cardinality' otherlv_2= '=' ( (lv_cardinality_3_0= ruleCardinalityType ) ) otherlv_4= ':' ( (lv_comp_5_0= ruleUIComponent ) ) ) ;
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
            // InternalUIDSL.g:1035:2: ( (otherlv_0= 'child_component' otherlv_1= 'cardinality' otherlv_2= '=' ( (lv_cardinality_3_0= ruleCardinalityType ) ) otherlv_4= ':' ( (lv_comp_5_0= ruleUIComponent ) ) ) )
            // InternalUIDSL.g:1036:2: (otherlv_0= 'child_component' otherlv_1= 'cardinality' otherlv_2= '=' ( (lv_cardinality_3_0= ruleCardinalityType ) ) otherlv_4= ':' ( (lv_comp_5_0= ruleUIComponent ) ) )
            {
            // InternalUIDSL.g:1036:2: (otherlv_0= 'child_component' otherlv_1= 'cardinality' otherlv_2= '=' ( (lv_cardinality_3_0= ruleCardinalityType ) ) otherlv_4= ':' ( (lv_comp_5_0= ruleUIComponent ) ) )
            // InternalUIDSL.g:1037:3: otherlv_0= 'child_component' otherlv_1= 'cardinality' otherlv_2= '=' ( (lv_cardinality_3_0= ruleCardinalityType ) ) otherlv_4= ':' ( (lv_comp_5_0= ruleUIComponent ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getChildUIComponentAccess().getChild_componentKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getChildUIComponentAccess().getCardinalityKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getChildUIComponentAccess().getEqualsSignKeyword_2());
            		
            // InternalUIDSL.g:1049:3: ( (lv_cardinality_3_0= ruleCardinalityType ) )
            // InternalUIDSL.g:1050:4: (lv_cardinality_3_0= ruleCardinalityType )
            {
            // InternalUIDSL.g:1050:4: (lv_cardinality_3_0= ruleCardinalityType )
            // InternalUIDSL.g:1051:5: lv_cardinality_3_0= ruleCardinalityType
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
            		
            // InternalUIDSL.g:1072:3: ( (lv_comp_5_0= ruleUIComponent ) )
            // InternalUIDSL.g:1073:4: (lv_comp_5_0= ruleUIComponent )
            {
            // InternalUIDSL.g:1073:4: (lv_comp_5_0= ruleUIComponent )
            // InternalUIDSL.g:1074:5: lv_comp_5_0= ruleUIComponent
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
    // InternalUIDSL.g:1095:1: entryRuleAllowedNestedComponents returns [EObject current=null] : iv_ruleAllowedNestedComponents= ruleAllowedNestedComponents EOF ;
    public final EObject entryRuleAllowedNestedComponents() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllowedNestedComponents = null;


        try {
            // InternalUIDSL.g:1095:64: (iv_ruleAllowedNestedComponents= ruleAllowedNestedComponents EOF )
            // InternalUIDSL.g:1096:2: iv_ruleAllowedNestedComponents= ruleAllowedNestedComponents EOF
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
    // InternalUIDSL.g:1102:1: ruleAllowedNestedComponents returns [EObject current=null] : ( ( () otherlv_1= 'ALL' ) | ( () ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ) ) ;
    public final EObject ruleAllowedNestedComponents() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalUIDSL.g:1108:2: ( ( ( () otherlv_1= 'ALL' ) | ( () ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ) ) )
            // InternalUIDSL.g:1109:2: ( ( () otherlv_1= 'ALL' ) | ( () ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ) )
            {
            // InternalUIDSL.g:1109:2: ( ( () otherlv_1= 'ALL' ) | ( () ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ) )
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
                    // InternalUIDSL.g:1110:3: ( () otherlv_1= 'ALL' )
                    {
                    // InternalUIDSL.g:1110:3: ( () otherlv_1= 'ALL' )
                    // InternalUIDSL.g:1111:4: () otherlv_1= 'ALL'
                    {
                    // InternalUIDSL.g:1111:4: ()
                    // InternalUIDSL.g:1112:5: 
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
                    // InternalUIDSL.g:1124:3: ( () ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )
                    {
                    // InternalUIDSL.g:1124:3: ( () ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )
                    // InternalUIDSL.g:1125:4: () ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    {
                    // InternalUIDSL.g:1125:4: ()
                    // InternalUIDSL.g:1126:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAllowedNestedComponentsAccess().getCustomAllowedComponentsAction_1_0(),
                    						current);
                    				

                    }

                    // InternalUIDSL.g:1132:4: ( (otherlv_3= RULE_ID ) )
                    // InternalUIDSL.g:1133:5: (otherlv_3= RULE_ID )
                    {
                    // InternalUIDSL.g:1133:5: (otherlv_3= RULE_ID )
                    // InternalUIDSL.g:1134:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAllowedNestedComponentsRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_16); 

                    						newLeafNode(otherlv_3, grammarAccess.getAllowedNestedComponentsAccess().getComponentsUIComponentCrossReference_1_1_0());
                    					

                    }


                    }

                    // InternalUIDSL.g:1145:4: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==16) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalUIDSL.g:1146:5: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getAllowedNestedComponentsAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalUIDSL.g:1150:5: ( (otherlv_5= RULE_ID ) )
                    	    // InternalUIDSL.g:1151:6: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalUIDSL.g:1151:6: (otherlv_5= RULE_ID )
                    	    // InternalUIDSL.g:1152:7: otherlv_5= RULE_ID
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
    // InternalUIDSL.g:1169:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // InternalUIDSL.g:1169:54: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalUIDSL.g:1170:2: iv_rulePropertyValue= rulePropertyValue EOF
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
    // InternalUIDSL.g:1176:1: rulePropertyValue returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_required_1_0= 'required' ) )? ( (lv_valueProperty_2_0= 'valueProperty' ) )? otherlv_3= ':' ( (lv_type_4_0= ruleTypeExpression ) ) ) ;
    public final EObject rulePropertyValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_required_1_0=null;
        Token lv_valueProperty_2_0=null;
        Token otherlv_3=null;
        EObject lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:1182:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_required_1_0= 'required' ) )? ( (lv_valueProperty_2_0= 'valueProperty' ) )? otherlv_3= ':' ( (lv_type_4_0= ruleTypeExpression ) ) ) )
            // InternalUIDSL.g:1183:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_required_1_0= 'required' ) )? ( (lv_valueProperty_2_0= 'valueProperty' ) )? otherlv_3= ':' ( (lv_type_4_0= ruleTypeExpression ) ) )
            {
            // InternalUIDSL.g:1183:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_required_1_0= 'required' ) )? ( (lv_valueProperty_2_0= 'valueProperty' ) )? otherlv_3= ':' ( (lv_type_4_0= ruleTypeExpression ) ) )
            // InternalUIDSL.g:1184:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_required_1_0= 'required' ) )? ( (lv_valueProperty_2_0= 'valueProperty' ) )? otherlv_3= ':' ( (lv_type_4_0= ruleTypeExpression ) )
            {
            // InternalUIDSL.g:1184:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalUIDSL.g:1185:4: (lv_name_0_0= RULE_ID )
            {
            // InternalUIDSL.g:1185:4: (lv_name_0_0= RULE_ID )
            // InternalUIDSL.g:1186:5: lv_name_0_0= RULE_ID
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

            // InternalUIDSL.g:1202:3: ( (lv_required_1_0= 'required' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalUIDSL.g:1203:4: (lv_required_1_0= 'required' )
                    {
                    // InternalUIDSL.g:1203:4: (lv_required_1_0= 'required' )
                    // InternalUIDSL.g:1204:5: lv_required_1_0= 'required'
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

            // InternalUIDSL.g:1216:3: ( (lv_valueProperty_2_0= 'valueProperty' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalUIDSL.g:1217:4: (lv_valueProperty_2_0= 'valueProperty' )
                    {
                    // InternalUIDSL.g:1217:4: (lv_valueProperty_2_0= 'valueProperty' )
                    // InternalUIDSL.g:1218:5: lv_valueProperty_2_0= 'valueProperty'
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
            		
            // InternalUIDSL.g:1234:3: ( (lv_type_4_0= ruleTypeExpression ) )
            // InternalUIDSL.g:1235:4: (lv_type_4_0= ruleTypeExpression )
            {
            // InternalUIDSL.g:1235:4: (lv_type_4_0= ruleTypeExpression )
            // InternalUIDSL.g:1236:5: lv_type_4_0= ruleTypeExpression
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
    // InternalUIDSL.g:1257:1: entryRuleUIComponentInstance returns [EObject current=null] : iv_ruleUIComponentInstance= ruleUIComponentInstance EOF ;
    public final EObject entryRuleUIComponentInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIComponentInstance = null;


        try {
            // InternalUIDSL.g:1257:60: (iv_ruleUIComponentInstance= ruleUIComponentInstance EOF )
            // InternalUIDSL.g:1258:2: iv_ruleUIComponentInstance= ruleUIComponentInstance EOF
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
    // InternalUIDSL.g:1264:1: ruleUIComponentInstance returns [EObject current=null] : ( () otherlv_1= '#' ( (otherlv_2= RULE_ID ) ) ( (lv_properties_3_0= rulePropertyValueInstance ) )* (otherlv_4= '{' ( (lv_childElements_5_0= ruleComponent ) )* otherlv_6= '}' )? ) ;
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
            // InternalUIDSL.g:1270:2: ( ( () otherlv_1= '#' ( (otherlv_2= RULE_ID ) ) ( (lv_properties_3_0= rulePropertyValueInstance ) )* (otherlv_4= '{' ( (lv_childElements_5_0= ruleComponent ) )* otherlv_6= '}' )? ) )
            // InternalUIDSL.g:1271:2: ( () otherlv_1= '#' ( (otherlv_2= RULE_ID ) ) ( (lv_properties_3_0= rulePropertyValueInstance ) )* (otherlv_4= '{' ( (lv_childElements_5_0= ruleComponent ) )* otherlv_6= '}' )? )
            {
            // InternalUIDSL.g:1271:2: ( () otherlv_1= '#' ( (otherlv_2= RULE_ID ) ) ( (lv_properties_3_0= rulePropertyValueInstance ) )* (otherlv_4= '{' ( (lv_childElements_5_0= ruleComponent ) )* otherlv_6= '}' )? )
            // InternalUIDSL.g:1272:3: () otherlv_1= '#' ( (otherlv_2= RULE_ID ) ) ( (lv_properties_3_0= rulePropertyValueInstance ) )* (otherlv_4= '{' ( (lv_childElements_5_0= ruleComponent ) )* otherlv_6= '}' )?
            {
            // InternalUIDSL.g:1272:3: ()
            // InternalUIDSL.g:1273:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUIComponentInstanceAccess().getUIComponentInstanceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getUIComponentInstanceAccess().getNumberSignKeyword_1());
            		
            // InternalUIDSL.g:1283:3: ( (otherlv_2= RULE_ID ) )
            // InternalUIDSL.g:1284:4: (otherlv_2= RULE_ID )
            {
            // InternalUIDSL.g:1284:4: (otherlv_2= RULE_ID )
            // InternalUIDSL.g:1285:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUIComponentInstanceRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_2, grammarAccess.getUIComponentInstanceAccess().getComponentUIComponentCrossReference_2_0());
            				

            }


            }

            // InternalUIDSL.g:1296:3: ( (lv_properties_3_0= rulePropertyValueInstance ) )*
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
            	    // InternalUIDSL.g:1297:4: (lv_properties_3_0= rulePropertyValueInstance )
            	    {
            	    // InternalUIDSL.g:1297:4: (lv_properties_3_0= rulePropertyValueInstance )
            	    // InternalUIDSL.g:1298:5: lv_properties_3_0= rulePropertyValueInstance
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

            // InternalUIDSL.g:1315:3: (otherlv_4= '{' ( (lv_childElements_5_0= ruleComponent ) )* otherlv_6= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==12) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalUIDSL.g:1316:4: otherlv_4= '{' ( (lv_childElements_5_0= ruleComponent ) )* otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,12,FOLLOW_28); 

                    				newLeafNode(otherlv_4, grammarAccess.getUIComponentInstanceAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalUIDSL.g:1320:4: ( (lv_childElements_5_0= ruleComponent ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==30||(LA24_0>=49 && LA24_0<=50)) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalUIDSL.g:1321:5: (lv_childElements_5_0= ruleComponent )
                    	    {
                    	    // InternalUIDSL.g:1321:5: (lv_childElements_5_0= ruleComponent )
                    	    // InternalUIDSL.g:1322:6: lv_childElements_5_0= ruleComponent
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
    // InternalUIDSL.g:1348:1: entryRuleLogicElement returns [EObject current=null] : iv_ruleLogicElement= ruleLogicElement EOF ;
    public final EObject entryRuleLogicElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicElement = null;


        try {
            // InternalUIDSL.g:1348:53: (iv_ruleLogicElement= ruleLogicElement EOF )
            // InternalUIDSL.g:1349:2: iv_ruleLogicElement= ruleLogicElement EOF
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
    // InternalUIDSL.g:1355:1: ruleLogicElement returns [EObject current=null] : (this_IFStatement_0= ruleIFStatement | this_Iterator_1= ruleIterator ) ;
    public final EObject ruleLogicElement() throws RecognitionException {
        EObject current = null;

        EObject this_IFStatement_0 = null;

        EObject this_Iterator_1 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:1361:2: ( (this_IFStatement_0= ruleIFStatement | this_Iterator_1= ruleIterator ) )
            // InternalUIDSL.g:1362:2: (this_IFStatement_0= ruleIFStatement | this_Iterator_1= ruleIterator )
            {
            // InternalUIDSL.g:1362:2: (this_IFStatement_0= ruleIFStatement | this_Iterator_1= ruleIterator )
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
                    // InternalUIDSL.g:1363:3: this_IFStatement_0= ruleIFStatement
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
                    // InternalUIDSL.g:1372:3: this_Iterator_1= ruleIterator
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
    // InternalUIDSL.g:1384:1: entryRuleIFStatement returns [EObject current=null] : iv_ruleIFStatement= ruleIFStatement EOF ;
    public final EObject entryRuleIFStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIFStatement = null;


        try {
            // InternalUIDSL.g:1384:52: (iv_ruleIFStatement= ruleIFStatement EOF )
            // InternalUIDSL.g:1385:2: iv_ruleIFStatement= ruleIFStatement EOF
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
    // InternalUIDSL.g:1391:1: ruleIFStatement returns [EObject current=null] : (otherlv_0= 'if' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleUIElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleIFStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expression_1_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:1397:2: ( (otherlv_0= 'if' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleUIElement ) )* otherlv_4= '}' ) )
            // InternalUIDSL.g:1398:2: (otherlv_0= 'if' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleUIElement ) )* otherlv_4= '}' )
            {
            // InternalUIDSL.g:1398:2: (otherlv_0= 'if' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleUIElement ) )* otherlv_4= '}' )
            // InternalUIDSL.g:1399:3: otherlv_0= 'if' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleUIElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getIFStatementAccess().getIfKeyword_0());
            		
            // InternalUIDSL.g:1403:3: ( (lv_expression_1_0= ruleExpression ) )
            // InternalUIDSL.g:1404:4: (lv_expression_1_0= ruleExpression )
            {
            // InternalUIDSL.g:1404:4: (lv_expression_1_0= ruleExpression )
            // InternalUIDSL.g:1405:5: lv_expression_1_0= ruleExpression
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
            		
            // InternalUIDSL.g:1426:3: ( (lv_elements_3_0= ruleUIElement ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID||(LA27_0>=30 && LA27_0<=32)||(LA27_0>=49 && LA27_0<=50)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalUIDSL.g:1427:4: (lv_elements_3_0= ruleUIElement )
            	    {
            	    // InternalUIDSL.g:1427:4: (lv_elements_3_0= ruleUIElement )
            	    // InternalUIDSL.g:1428:5: lv_elements_3_0= ruleUIElement
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
    // InternalUIDSL.g:1453:1: entryRuleIterator returns [EObject current=null] : iv_ruleIterator= ruleIterator EOF ;
    public final EObject entryRuleIterator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIterator = null;


        try {
            // InternalUIDSL.g:1453:49: (iv_ruleIterator= ruleIterator EOF )
            // InternalUIDSL.g:1454:2: iv_ruleIterator= ruleIterator EOF
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
    // InternalUIDSL.g:1460:1: ruleIterator returns [EObject current=null] : (otherlv_0= 'for' ( (lv_expression_1_0= ruleIterationExpression ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleUIElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleIterator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expression_1_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:1466:2: ( (otherlv_0= 'for' ( (lv_expression_1_0= ruleIterationExpression ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleUIElement ) )* otherlv_4= '}' ) )
            // InternalUIDSL.g:1467:2: (otherlv_0= 'for' ( (lv_expression_1_0= ruleIterationExpression ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleUIElement ) )* otherlv_4= '}' )
            {
            // InternalUIDSL.g:1467:2: (otherlv_0= 'for' ( (lv_expression_1_0= ruleIterationExpression ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleUIElement ) )* otherlv_4= '}' )
            // InternalUIDSL.g:1468:3: otherlv_0= 'for' ( (lv_expression_1_0= ruleIterationExpression ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleUIElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getIteratorAccess().getForKeyword_0());
            		
            // InternalUIDSL.g:1472:3: ( (lv_expression_1_0= ruleIterationExpression ) )
            // InternalUIDSL.g:1473:4: (lv_expression_1_0= ruleIterationExpression )
            {
            // InternalUIDSL.g:1473:4: (lv_expression_1_0= ruleIterationExpression )
            // InternalUIDSL.g:1474:5: lv_expression_1_0= ruleIterationExpression
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
            		
            // InternalUIDSL.g:1495:3: ( (lv_elements_3_0= ruleUIElement ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID||(LA28_0>=30 && LA28_0<=32)||(LA28_0>=49 && LA28_0<=50)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalUIDSL.g:1496:4: (lv_elements_3_0= ruleUIElement )
            	    {
            	    // InternalUIDSL.g:1496:4: (lv_elements_3_0= ruleUIElement )
            	    // InternalUIDSL.g:1497:5: lv_elements_3_0= ruleUIElement
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
    // InternalUIDSL.g:1522:1: entryRulePropertyValueInstance returns [EObject current=null] : iv_rulePropertyValueInstance= rulePropertyValueInstance EOF ;
    public final EObject entryRulePropertyValueInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueInstance = null;


        try {
            // InternalUIDSL.g:1522:62: (iv_rulePropertyValueInstance= rulePropertyValueInstance EOF )
            // InternalUIDSL.g:1523:2: iv_rulePropertyValueInstance= rulePropertyValueInstance EOF
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
    // InternalUIDSL.g:1529:1: rulePropertyValueInstance returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleExpression ) ) ) ;
    public final EObject rulePropertyValueInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:1535:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleExpression ) ) ) )
            // InternalUIDSL.g:1536:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleExpression ) ) )
            {
            // InternalUIDSL.g:1536:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleExpression ) ) )
            // InternalUIDSL.g:1537:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleExpression ) )
            {
            // InternalUIDSL.g:1537:3: ()
            // InternalUIDSL.g:1538:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPropertyValueInstanceAccess().getPropertyValueInstanceAction_0(),
            					current);
            			

            }

            // InternalUIDSL.g:1544:3: ( (otherlv_1= RULE_ID ) )
            // InternalUIDSL.g:1545:4: (otherlv_1= RULE_ID )
            {
            // InternalUIDSL.g:1545:4: (otherlv_1= RULE_ID )
            // InternalUIDSL.g:1546:5: otherlv_1= RULE_ID
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
            		
            // InternalUIDSL.g:1561:3: ( (lv_value_3_0= ruleExpression ) )
            // InternalUIDSL.g:1562:4: (lv_value_3_0= ruleExpression )
            {
            // InternalUIDSL.g:1562:4: (lv_value_3_0= ruleExpression )
            // InternalUIDSL.g:1563:5: lv_value_3_0= ruleExpression
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
    // InternalUIDSL.g:1584:1: entryRuleTemplate returns [EObject current=null] : iv_ruleTemplate= ruleTemplate EOF ;
    public final EObject entryRuleTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplate = null;


        try {
            // InternalUIDSL.g:1584:49: (iv_ruleTemplate= ruleTemplate EOF )
            // InternalUIDSL.g:1585:2: iv_ruleTemplate= ruleTemplate EOF
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
    // InternalUIDSL.g:1591:1: ruleTemplate returns [EObject current=null] : (otherlv_0= 'template' ( (lv_name_1_0= RULE_ID ) ) this_ServerComponentUsage_2= ruleServerComponentUsage[$current] otherlv_3= '{' ( ( (lv_elements_4_1= ruleUIElement | lv_elements_4_2= ruleTemplateFragment ) ) )* otherlv_5= '}' ) ;
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
            // InternalUIDSL.g:1597:2: ( (otherlv_0= 'template' ( (lv_name_1_0= RULE_ID ) ) this_ServerComponentUsage_2= ruleServerComponentUsage[$current] otherlv_3= '{' ( ( (lv_elements_4_1= ruleUIElement | lv_elements_4_2= ruleTemplateFragment ) ) )* otherlv_5= '}' ) )
            // InternalUIDSL.g:1598:2: (otherlv_0= 'template' ( (lv_name_1_0= RULE_ID ) ) this_ServerComponentUsage_2= ruleServerComponentUsage[$current] otherlv_3= '{' ( ( (lv_elements_4_1= ruleUIElement | lv_elements_4_2= ruleTemplateFragment ) ) )* otherlv_5= '}' )
            {
            // InternalUIDSL.g:1598:2: (otherlv_0= 'template' ( (lv_name_1_0= RULE_ID ) ) this_ServerComponentUsage_2= ruleServerComponentUsage[$current] otherlv_3= '{' ( ( (lv_elements_4_1= ruleUIElement | lv_elements_4_2= ruleTemplateFragment ) ) )* otherlv_5= '}' )
            // InternalUIDSL.g:1599:3: otherlv_0= 'template' ( (lv_name_1_0= RULE_ID ) ) this_ServerComponentUsage_2= ruleServerComponentUsage[$current] otherlv_3= '{' ( ( (lv_elements_4_1= ruleUIElement | lv_elements_4_2= ruleTemplateFragment ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTemplateAccess().getTemplateKeyword_0());
            		
            // InternalUIDSL.g:1603:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUIDSL.g:1604:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUIDSL.g:1604:4: (lv_name_1_0= RULE_ID )
            // InternalUIDSL.g:1605:5: lv_name_1_0= RULE_ID
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
            		
            // InternalUIDSL.g:1636:3: ( ( (lv_elements_4_1= ruleUIElement | lv_elements_4_2= ruleTemplateFragment ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID||(LA30_0>=30 && LA30_0<=32)||(LA30_0>=49 && LA30_0<=50)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalUIDSL.g:1637:4: ( (lv_elements_4_1= ruleUIElement | lv_elements_4_2= ruleTemplateFragment ) )
            	    {
            	    // InternalUIDSL.g:1637:4: ( (lv_elements_4_1= ruleUIElement | lv_elements_4_2= ruleTemplateFragment ) )
            	    // InternalUIDSL.g:1638:5: (lv_elements_4_1= ruleUIElement | lv_elements_4_2= ruleTemplateFragment )
            	    {
            	    // InternalUIDSL.g:1638:5: (lv_elements_4_1= ruleUIElement | lv_elements_4_2= ruleTemplateFragment )
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( ((LA29_0>=30 && LA29_0<=32)||(LA29_0>=49 && LA29_0<=50)) ) {
            	        alt29=1;
            	    }
            	    else if ( (LA29_0==RULE_ID) ) {
            	        int LA29_2 = input.LA(2);

            	        if ( (LA29_2==12) ) {
            	            alt29=2;
            	        }
            	        else if ( (LA29_2==15) ) {
            	            alt29=1;
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
            	            // InternalUIDSL.g:1639:6: lv_elements_4_1= ruleUIElement
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
            	            // InternalUIDSL.g:1655:6: lv_elements_4_2= ruleTemplateFragment
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
    // InternalUIDSL.g:1681:1: entryRuleTemplateFragment returns [EObject current=null] : iv_ruleTemplateFragment= ruleTemplateFragment EOF ;
    public final EObject entryRuleTemplateFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateFragment = null;


        try {
            // InternalUIDSL.g:1681:57: (iv_ruleTemplateFragment= ruleTemplateFragment EOF )
            // InternalUIDSL.g:1682:2: iv_ruleTemplateFragment= ruleTemplateFragment EOF
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
    // InternalUIDSL.g:1688:1: ruleTemplateFragment returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleUIElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleTemplateFragment() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:1694:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleUIElement ) )* otherlv_4= '}' ) )
            // InternalUIDSL.g:1695:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleUIElement ) )* otherlv_4= '}' )
            {
            // InternalUIDSL.g:1695:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleUIElement ) )* otherlv_4= '}' )
            // InternalUIDSL.g:1696:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleUIElement ) )* otherlv_4= '}'
            {
            // InternalUIDSL.g:1696:3: ()
            // InternalUIDSL.g:1697:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTemplateFragmentAccess().getTemplateFragmentAction_0(),
            					current);
            			

            }

            // InternalUIDSL.g:1703:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUIDSL.g:1704:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUIDSL.g:1704:4: (lv_name_1_0= RULE_ID )
            // InternalUIDSL.g:1705:5: lv_name_1_0= RULE_ID
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
            		
            // InternalUIDSL.g:1725:3: ( (lv_elements_3_0= ruleUIElement ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID||(LA31_0>=30 && LA31_0<=32)||(LA31_0>=49 && LA31_0<=50)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalUIDSL.g:1726:4: (lv_elements_3_0= ruleUIElement )
            	    {
            	    // InternalUIDSL.g:1726:4: (lv_elements_3_0= ruleUIElement )
            	    // InternalUIDSL.g:1727:5: lv_elements_3_0= ruleUIElement
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
    // InternalUIDSL.g:1752:1: entryRuleTemplateFragmentOverride returns [EObject current=null] : iv_ruleTemplateFragmentOverride= ruleTemplateFragmentOverride EOF ;
    public final EObject entryRuleTemplateFragmentOverride() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateFragmentOverride = null;


        try {
            // InternalUIDSL.g:1752:65: (iv_ruleTemplateFragmentOverride= ruleTemplateFragmentOverride EOF )
            // InternalUIDSL.g:1753:2: iv_ruleTemplateFragmentOverride= ruleTemplateFragmentOverride EOF
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
    // InternalUIDSL.g:1759:1: ruleTemplateFragmentOverride returns [EObject current=null] : ( () otherlv_1= 'override' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleUIElement ) )* otherlv_5= '}' ) ;
    public final EObject ruleTemplateFragmentOverride() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:1765:2: ( ( () otherlv_1= 'override' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleUIElement ) )* otherlv_5= '}' ) )
            // InternalUIDSL.g:1766:2: ( () otherlv_1= 'override' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleUIElement ) )* otherlv_5= '}' )
            {
            // InternalUIDSL.g:1766:2: ( () otherlv_1= 'override' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleUIElement ) )* otherlv_5= '}' )
            // InternalUIDSL.g:1767:3: () otherlv_1= 'override' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleUIElement ) )* otherlv_5= '}'
            {
            // InternalUIDSL.g:1767:3: ()
            // InternalUIDSL.g:1768:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTemplateFragmentOverrideAccess().getTemplateFragmentOverrideAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTemplateFragmentOverrideAccess().getOverrideKeyword_1());
            		
            // InternalUIDSL.g:1778:3: ( (otherlv_2= RULE_ID ) )
            // InternalUIDSL.g:1779:4: (otherlv_2= RULE_ID )
            {
            // InternalUIDSL.g:1779:4: (otherlv_2= RULE_ID )
            // InternalUIDSL.g:1780:5: otherlv_2= RULE_ID
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
            		
            // InternalUIDSL.g:1795:3: ( (lv_elements_4_0= ruleUIElement ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID||(LA32_0>=30 && LA32_0<=32)||(LA32_0>=49 && LA32_0<=50)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalUIDSL.g:1796:4: (lv_elements_4_0= ruleUIElement )
            	    {
            	    // InternalUIDSL.g:1796:4: (lv_elements_4_0= ruleUIElement )
            	    // InternalUIDSL.g:1797:5: lv_elements_4_0= ruleUIElement
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
    // InternalUIDSL.g:1822:1: entryRuleFragment returns [EObject current=null] : iv_ruleFragment= ruleFragment EOF ;
    public final EObject entryRuleFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFragment = null;


        try {
            // InternalUIDSL.g:1822:49: (iv_ruleFragment= ruleFragment EOF )
            // InternalUIDSL.g:1823:2: iv_ruleFragment= ruleFragment EOF
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
    // InternalUIDSL.g:1829:1: ruleFragment returns [EObject current=null] : (otherlv_0= 'fragment' this_UIContainerDefinition_1= ruleUIContainerDefinition[$current] this_ServerComponentUsage_2= ruleServerComponentUsage[$current] otherlv_3= '{' ( (lv_elements_4_0= ruleUIElement ) )* otherlv_5= '}' ) ;
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
            // InternalUIDSL.g:1835:2: ( (otherlv_0= 'fragment' this_UIContainerDefinition_1= ruleUIContainerDefinition[$current] this_ServerComponentUsage_2= ruleServerComponentUsage[$current] otherlv_3= '{' ( (lv_elements_4_0= ruleUIElement ) )* otherlv_5= '}' ) )
            // InternalUIDSL.g:1836:2: (otherlv_0= 'fragment' this_UIContainerDefinition_1= ruleUIContainerDefinition[$current] this_ServerComponentUsage_2= ruleServerComponentUsage[$current] otherlv_3= '{' ( (lv_elements_4_0= ruleUIElement ) )* otherlv_5= '}' )
            {
            // InternalUIDSL.g:1836:2: (otherlv_0= 'fragment' this_UIContainerDefinition_1= ruleUIContainerDefinition[$current] this_ServerComponentUsage_2= ruleServerComponentUsage[$current] otherlv_3= '{' ( (lv_elements_4_0= ruleUIElement ) )* otherlv_5= '}' )
            // InternalUIDSL.g:1837:3: otherlv_0= 'fragment' this_UIContainerDefinition_1= ruleUIContainerDefinition[$current] this_ServerComponentUsage_2= ruleServerComponentUsage[$current] otherlv_3= '{' ( (lv_elements_4_0= ruleUIElement ) )* otherlv_5= '}'
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
            		
            // InternalUIDSL.g:1867:3: ( (lv_elements_4_0= ruleUIElement ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ID||(LA33_0>=30 && LA33_0<=32)||(LA33_0>=49 && LA33_0<=50)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalUIDSL.g:1868:4: (lv_elements_4_0= ruleUIElement )
            	    {
            	    // InternalUIDSL.g:1868:4: (lv_elements_4_0= ruleUIElement )
            	    // InternalUIDSL.g:1869:5: lv_elements_4_0= ruleUIElement
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
    // InternalUIDSL.g:1894:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalUIDSL.g:1894:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalUIDSL.g:1895:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalUIDSL.g:1901:1: ruleExpression returns [EObject current=null] : (this_MemberSelectionExpression_0= ruleMemberSelectionExpression | this_PageCall_1= rulePageCall | this_IterationExpression_2= ruleIterationExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MemberSelectionExpression_0 = null;

        EObject this_PageCall_1 = null;

        EObject this_IterationExpression_2 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:1907:2: ( (this_MemberSelectionExpression_0= ruleMemberSelectionExpression | this_PageCall_1= rulePageCall | this_IterationExpression_2= ruleIterationExpression ) )
            // InternalUIDSL.g:1908:2: (this_MemberSelectionExpression_0= ruleMemberSelectionExpression | this_PageCall_1= rulePageCall | this_IterationExpression_2= ruleIterationExpression )
            {
            // InternalUIDSL.g:1908:2: (this_MemberSelectionExpression_0= ruleMemberSelectionExpression | this_PageCall_1= rulePageCall | this_IterationExpression_2= ruleIterationExpression )
            int alt34=3;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_INT && LA34_0<=RULE_STRING)||(LA34_0>=64 && LA34_0<=65)||LA34_0==67) ) {
                alt34=1;
            }
            else if ( (LA34_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
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
                    // InternalUIDSL.g:1909:3: this_MemberSelectionExpression_0= ruleMemberSelectionExpression
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
                    // InternalUIDSL.g:1918:3: this_PageCall_1= rulePageCall
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
                    // InternalUIDSL.g:1927:3: this_IterationExpression_2= ruleIterationExpression
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
    // InternalUIDSL.g:1939:1: entryRuleIterationExpression returns [EObject current=null] : iv_ruleIterationExpression= ruleIterationExpression EOF ;
    public final EObject entryRuleIterationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIterationExpression = null;


        try {
            // InternalUIDSL.g:1939:60: (iv_ruleIterationExpression= ruleIterationExpression EOF )
            // InternalUIDSL.g:1940:2: iv_ruleIterationExpression= ruleIterationExpression EOF
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
    // InternalUIDSL.g:1946:1: ruleIterationExpression returns [EObject current=null] : ( ( (lv_var_0_0= ruleInlineVariable ) ) otherlv_1= 'in' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleIterationExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_var_0_0 = null;

        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:1952:2: ( ( ( (lv_var_0_0= ruleInlineVariable ) ) otherlv_1= 'in' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalUIDSL.g:1953:2: ( ( (lv_var_0_0= ruleInlineVariable ) ) otherlv_1= 'in' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalUIDSL.g:1953:2: ( ( (lv_var_0_0= ruleInlineVariable ) ) otherlv_1= 'in' ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalUIDSL.g:1954:3: ( (lv_var_0_0= ruleInlineVariable ) ) otherlv_1= 'in' ( (lv_expression_2_0= ruleExpression ) )
            {
            // InternalUIDSL.g:1954:3: ( (lv_var_0_0= ruleInlineVariable ) )
            // InternalUIDSL.g:1955:4: (lv_var_0_0= ruleInlineVariable )
            {
            // InternalUIDSL.g:1955:4: (lv_var_0_0= ruleInlineVariable )
            // InternalUIDSL.g:1956:5: lv_var_0_0= ruleInlineVariable
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
            		
            // InternalUIDSL.g:1977:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalUIDSL.g:1978:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalUIDSL.g:1978:4: (lv_expression_2_0= ruleExpression )
            // InternalUIDSL.g:1979:5: lv_expression_2_0= ruleExpression
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
    // InternalUIDSL.g:2000:1: entryRuleMemberSelectionExpression returns [EObject current=null] : iv_ruleMemberSelectionExpression= ruleMemberSelectionExpression EOF ;
    public final EObject entryRuleMemberSelectionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemberSelectionExpression = null;


        try {
            // InternalUIDSL.g:2000:66: (iv_ruleMemberSelectionExpression= ruleMemberSelectionExpression EOF )
            // InternalUIDSL.g:2001:2: iv_ruleMemberSelectionExpression= ruleMemberSelectionExpression EOF
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
    // InternalUIDSL.g:2007:1: ruleMemberSelectionExpression returns [EObject current=null] : (this_AtomExpression_0= ruleAtomExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_isMethod_4_0= '(' ) ) (this_Params_5= ruleParams[$current] )? otherlv_6= ')' )? )* ) ;
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
            // InternalUIDSL.g:2013:2: ( (this_AtomExpression_0= ruleAtomExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_isMethod_4_0= '(' ) ) (this_Params_5= ruleParams[$current] )? otherlv_6= ')' )? )* ) )
            // InternalUIDSL.g:2014:2: (this_AtomExpression_0= ruleAtomExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_isMethod_4_0= '(' ) ) (this_Params_5= ruleParams[$current] )? otherlv_6= ')' )? )* )
            {
            // InternalUIDSL.g:2014:2: (this_AtomExpression_0= ruleAtomExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_isMethod_4_0= '(' ) ) (this_Params_5= ruleParams[$current] )? otherlv_6= ')' )? )* )
            // InternalUIDSL.g:2015:3: this_AtomExpression_0= ruleAtomExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_isMethod_4_0= '(' ) ) (this_Params_5= ruleParams[$current] )? otherlv_6= ')' )? )*
            {

            			newCompositeNode(grammarAccess.getMemberSelectionExpressionAccess().getAtomExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_33);
            this_AtomExpression_0=ruleAtomExpression();

            state._fsp--;


            			current = this_AtomExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalUIDSL.g:2023:3: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_isMethod_4_0= '(' ) ) (this_Params_5= ruleParams[$current] )? otherlv_6= ')' )? )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==36) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalUIDSL.g:2024:4: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_isMethod_4_0= '(' ) ) (this_Params_5= ruleParams[$current] )? otherlv_6= ')' )?
            	    {
            	    // InternalUIDSL.g:2024:4: ()
            	    // InternalUIDSL.g:2025:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMemberSelectionExpressionAccess().getMemberSelectionExpressionReceiverAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,36,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getMemberSelectionExpressionAccess().getFullStopKeyword_1_1());
            	    			
            	    // InternalUIDSL.g:2035:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalUIDSL.g:2036:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalUIDSL.g:2036:5: (otherlv_3= RULE_ID )
            	    // InternalUIDSL.g:2037:6: otherlv_3= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMemberSelectionExpressionRule());
            	    						}
            	    					
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_34); 

            	    						newLeafNode(otherlv_3, grammarAccess.getMemberSelectionExpressionAccess().getMemberSelectionMemberCrossReference_1_2_0());
            	    					

            	    }


            	    }

            	    // InternalUIDSL.g:2048:4: ( ( (lv_isMethod_4_0= '(' ) ) (this_Params_5= ruleParams[$current] )? otherlv_6= ')' )?
            	    int alt36=2;
            	    int LA36_0 = input.LA(1);

            	    if ( (LA36_0==15) ) {
            	        alt36=1;
            	    }
            	    switch (alt36) {
            	        case 1 :
            	            // InternalUIDSL.g:2049:5: ( (lv_isMethod_4_0= '(' ) ) (this_Params_5= ruleParams[$current] )? otherlv_6= ')'
            	            {
            	            // InternalUIDSL.g:2049:5: ( (lv_isMethod_4_0= '(' ) )
            	            // InternalUIDSL.g:2050:6: (lv_isMethod_4_0= '(' )
            	            {
            	            // InternalUIDSL.g:2050:6: (lv_isMethod_4_0= '(' )
            	            // InternalUIDSL.g:2051:7: lv_isMethod_4_0= '('
            	            {
            	            lv_isMethod_4_0=(Token)match(input,15,FOLLOW_35); 

            	            							newLeafNode(lv_isMethod_4_0, grammarAccess.getMemberSelectionExpressionAccess().getIsMethodLeftParenthesisKeyword_1_3_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMemberSelectionExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "isMethod", true, "(");
            	            						

            	            }


            	            }

            	            // InternalUIDSL.g:2063:5: (this_Params_5= ruleParams[$current] )?
            	            int alt35=2;
            	            int LA35_0 = input.LA(1);

            	            if ( ((LA35_0>=RULE_ID && LA35_0<=RULE_STRING)||(LA35_0>=64 && LA35_0<=65)||LA35_0==67) ) {
            	                alt35=1;
            	            }
            	            switch (alt35) {
            	                case 1 :
            	                    // InternalUIDSL.g:2064:6: this_Params_5= ruleParams[$current]
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
    // InternalUIDSL.g:2086:1: entryRulePageCall returns [EObject current=null] : iv_rulePageCall= rulePageCall EOF ;
    public final EObject entryRulePageCall() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageCall = null;


        try {
            // InternalUIDSL.g:2086:49: (iv_rulePageCall= rulePageCall EOF )
            // InternalUIDSL.g:2087:2: iv_rulePageCall= rulePageCall EOF
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
    // InternalUIDSL.g:2093:1: rulePageCall returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' (this_Params_3= ruleParams[$current] )? otherlv_4= ')' ) ;
    public final EObject rulePageCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Params_3 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:2099:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' (this_Params_3= ruleParams[$current] )? otherlv_4= ')' ) )
            // InternalUIDSL.g:2100:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' (this_Params_3= ruleParams[$current] )? otherlv_4= ')' )
            {
            // InternalUIDSL.g:2100:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' (this_Params_3= ruleParams[$current] )? otherlv_4= ')' )
            // InternalUIDSL.g:2101:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' (this_Params_3= ruleParams[$current] )? otherlv_4= ')'
            {
            // InternalUIDSL.g:2101:3: ()
            // InternalUIDSL.g:2102:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPageCallAccess().getPageCallAction_0(),
            					current);
            			

            }

            // InternalUIDSL.g:2108:3: ( (otherlv_1= RULE_ID ) )
            // InternalUIDSL.g:2109:4: (otherlv_1= RULE_ID )
            {
            // InternalUIDSL.g:2109:4: (otherlv_1= RULE_ID )
            // InternalUIDSL.g:2110:5: otherlv_1= RULE_ID
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
            		
            // InternalUIDSL.g:2125:3: (this_Params_3= ruleParams[$current] )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=RULE_ID && LA38_0<=RULE_STRING)||(LA38_0>=64 && LA38_0<=65)||LA38_0==67) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalUIDSL.g:2126:4: this_Params_3= ruleParams[$current]
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
    // InternalUIDSL.g:2146:1: entryRuleFragmentCall returns [EObject current=null] : iv_ruleFragmentCall= ruleFragmentCall EOF ;
    public final EObject entryRuleFragmentCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFragmentCall = null;


        try {
            // InternalUIDSL.g:2146:53: (iv_ruleFragmentCall= ruleFragmentCall EOF )
            // InternalUIDSL.g:2147:2: iv_ruleFragmentCall= ruleFragmentCall EOF
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
    // InternalUIDSL.g:2153:1: ruleFragmentCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (this_Params_2= ruleParams[$current] )? otherlv_3= ')' ) ;
    public final EObject ruleFragmentCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Params_2 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:2159:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (this_Params_2= ruleParams[$current] )? otherlv_3= ')' ) )
            // InternalUIDSL.g:2160:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (this_Params_2= ruleParams[$current] )? otherlv_3= ')' )
            {
            // InternalUIDSL.g:2160:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (this_Params_2= ruleParams[$current] )? otherlv_3= ')' )
            // InternalUIDSL.g:2161:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' (this_Params_2= ruleParams[$current] )? otherlv_3= ')'
            {
            // InternalUIDSL.g:2161:3: ( (otherlv_0= RULE_ID ) )
            // InternalUIDSL.g:2162:4: (otherlv_0= RULE_ID )
            {
            // InternalUIDSL.g:2162:4: (otherlv_0= RULE_ID )
            // InternalUIDSL.g:2163:5: otherlv_0= RULE_ID
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
            		
            // InternalUIDSL.g:2178:3: (this_Params_2= ruleParams[$current] )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RULE_ID && LA39_0<=RULE_STRING)||(LA39_0>=64 && LA39_0<=65)||LA39_0==67) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalUIDSL.g:2179:4: this_Params_2= ruleParams[$current]
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
    // InternalUIDSL.g:2200:1: ruleParams[EObject in_current] returns [EObject current=in_current] : ( ( (lv_params_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleExpression ) ) )* ) ;
    public final EObject ruleParams(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        EObject lv_params_0_0 = null;

        EObject lv_params_2_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:2206:2: ( ( ( (lv_params_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleExpression ) ) )* ) )
            // InternalUIDSL.g:2207:2: ( ( (lv_params_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleExpression ) ) )* )
            {
            // InternalUIDSL.g:2207:2: ( ( (lv_params_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleExpression ) ) )* )
            // InternalUIDSL.g:2208:3: ( (lv_params_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleExpression ) ) )*
            {
            // InternalUIDSL.g:2208:3: ( (lv_params_0_0= ruleExpression ) )
            // InternalUIDSL.g:2209:4: (lv_params_0_0= ruleExpression )
            {
            // InternalUIDSL.g:2209:4: (lv_params_0_0= ruleExpression )
            // InternalUIDSL.g:2210:5: lv_params_0_0= ruleExpression
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

            // InternalUIDSL.g:2227:3: (otherlv_1= ',' ( (lv_params_2_0= ruleExpression ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==16) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalUIDSL.g:2228:4: otherlv_1= ',' ( (lv_params_2_0= ruleExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_29); 

            	    				newLeafNode(otherlv_1, grammarAccess.getParamsAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalUIDSL.g:2232:4: ( (lv_params_2_0= ruleExpression ) )
            	    // InternalUIDSL.g:2233:5: (lv_params_2_0= ruleExpression )
            	    {
            	    // InternalUIDSL.g:2233:5: (lv_params_2_0= ruleExpression )
            	    // InternalUIDSL.g:2234:6: lv_params_2_0= ruleExpression
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
    // InternalUIDSL.g:2256:1: entryRuleAtomExpression returns [EObject current=null] : iv_ruleAtomExpression= ruleAtomExpression EOF ;
    public final EObject entryRuleAtomExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomExpression = null;


        try {
            // InternalUIDSL.g:2256:55: (iv_ruleAtomExpression= ruleAtomExpression EOF )
            // InternalUIDSL.g:2257:2: iv_ruleAtomExpression= ruleAtomExpression EOF
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
    // InternalUIDSL.g:2263:1: ruleAtomExpression returns [EObject current=null] : (this_Constant_0= ruleConstant | ( () ( (otherlv_2= RULE_ID ) ) ) ) ;
    public final EObject ruleAtomExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Constant_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:2269:2: ( (this_Constant_0= ruleConstant | ( () ( (otherlv_2= RULE_ID ) ) ) ) )
            // InternalUIDSL.g:2270:2: (this_Constant_0= ruleConstant | ( () ( (otherlv_2= RULE_ID ) ) ) )
            {
            // InternalUIDSL.g:2270:2: (this_Constant_0= ruleConstant | ( () ( (otherlv_2= RULE_ID ) ) ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_INT && LA41_0<=RULE_STRING)||(LA41_0>=64 && LA41_0<=65)||LA41_0==67) ) {
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
                    // InternalUIDSL.g:2271:3: this_Constant_0= ruleConstant
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
                    // InternalUIDSL.g:2280:3: ( () ( (otherlv_2= RULE_ID ) ) )
                    {
                    // InternalUIDSL.g:2280:3: ( () ( (otherlv_2= RULE_ID ) ) )
                    // InternalUIDSL.g:2281:4: () ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalUIDSL.g:2281:4: ()
                    // InternalUIDSL.g:2282:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomExpressionAccess().getVariableReferenceAction_1_0(),
                    						current);
                    				

                    }

                    // InternalUIDSL.g:2288:4: ( (otherlv_2= RULE_ID ) )
                    // InternalUIDSL.g:2289:5: (otherlv_2= RULE_ID )
                    {
                    // InternalUIDSL.g:2289:5: (otherlv_2= RULE_ID )
                    // InternalUIDSL.g:2290:6: otherlv_2= RULE_ID
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
    // InternalUIDSL.g:2306:1: entryRuleAttributeType returns [EObject current=null] : iv_ruleAttributeType= ruleAttributeType EOF ;
    public final EObject entryRuleAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeType = null;


        try {
            // InternalUIDSL.g:2306:54: (iv_ruleAttributeType= ruleAttributeType EOF )
            // InternalUIDSL.g:2307:2: iv_ruleAttributeType= ruleAttributeType EOF
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
    // InternalUIDSL.g:2313:1: ruleAttributeType returns [EObject current=null] : (this_AttributeType_0= superAttributeType | this_VoidType_1= ruleVoidType ) ;
    public final EObject ruleAttributeType() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeType_0 = null;

        EObject this_VoidType_1 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:2319:2: ( (this_AttributeType_0= superAttributeType | this_VoidType_1= ruleVoidType ) )
            // InternalUIDSL.g:2320:2: (this_AttributeType_0= superAttributeType | this_VoidType_1= ruleVoidType )
            {
            // InternalUIDSL.g:2320:2: (this_AttributeType_0= superAttributeType | this_VoidType_1= ruleVoidType )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID||(LA42_0>=58 && LA42_0<=62)||(LA42_0>=73 && LA42_0<=79)) ) {
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
                    // InternalUIDSL.g:2321:3: this_AttributeType_0= superAttributeType
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
                    // InternalUIDSL.g:2330:3: this_VoidType_1= ruleVoidType
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
    // InternalUIDSL.g:2342:1: entryRuleGeneralType returns [EObject current=null] : iv_ruleGeneralType= ruleGeneralType EOF ;
    public final EObject entryRuleGeneralType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralType = null;


        try {
            // InternalUIDSL.g:2342:52: (iv_ruleGeneralType= ruleGeneralType EOF )
            // InternalUIDSL.g:2343:2: iv_ruleGeneralType= ruleGeneralType EOF
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
    // InternalUIDSL.g:2349:1: ruleGeneralType returns [EObject current=null] : ( ( () otherlv_1= 'object' ) | ( () otherlv_3= 'enum' ) | ( () otherlv_5= 'collection' ) ) ;
    public final EObject ruleGeneralType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalUIDSL.g:2355:2: ( ( ( () otherlv_1= 'object' ) | ( () otherlv_3= 'enum' ) | ( () otherlv_5= 'collection' ) ) )
            // InternalUIDSL.g:2356:2: ( ( () otherlv_1= 'object' ) | ( () otherlv_3= 'enum' ) | ( () otherlv_5= 'collection' ) )
            {
            // InternalUIDSL.g:2356:2: ( ( () otherlv_1= 'object' ) | ( () otherlv_3= 'enum' ) | ( () otherlv_5= 'collection' ) )
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
                    // InternalUIDSL.g:2357:3: ( () otherlv_1= 'object' )
                    {
                    // InternalUIDSL.g:2357:3: ( () otherlv_1= 'object' )
                    // InternalUIDSL.g:2358:4: () otherlv_1= 'object'
                    {
                    // InternalUIDSL.g:2358:4: ()
                    // InternalUIDSL.g:2359:5: 
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
                    // InternalUIDSL.g:2371:3: ( () otherlv_3= 'enum' )
                    {
                    // InternalUIDSL.g:2371:3: ( () otherlv_3= 'enum' )
                    // InternalUIDSL.g:2372:4: () otherlv_3= 'enum'
                    {
                    // InternalUIDSL.g:2372:4: ()
                    // InternalUIDSL.g:2373:5: 
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
                    // InternalUIDSL.g:2385:3: ( () otherlv_5= 'collection' )
                    {
                    // InternalUIDSL.g:2385:3: ( () otherlv_5= 'collection' )
                    // InternalUIDSL.g:2386:4: () otherlv_5= 'collection'
                    {
                    // InternalUIDSL.g:2386:4: ()
                    // InternalUIDSL.g:2387:5: 
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
    // InternalUIDSL.g:2402:1: entryRuleAnyType returns [EObject current=null] : iv_ruleAnyType= ruleAnyType EOF ;
    public final EObject entryRuleAnyType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnyType = null;


        try {
            // InternalUIDSL.g:2402:48: (iv_ruleAnyType= ruleAnyType EOF )
            // InternalUIDSL.g:2403:2: iv_ruleAnyType= ruleAnyType EOF
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
    // InternalUIDSL.g:2409:1: ruleAnyType returns [EObject current=null] : ( () otherlv_1= 'any' ) ;
    public final EObject ruleAnyType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalUIDSL.g:2415:2: ( ( () otherlv_1= 'any' ) )
            // InternalUIDSL.g:2416:2: ( () otherlv_1= 'any' )
            {
            // InternalUIDSL.g:2416:2: ( () otherlv_1= 'any' )
            // InternalUIDSL.g:2417:3: () otherlv_1= 'any'
            {
            // InternalUIDSL.g:2417:3: ()
            // InternalUIDSL.g:2418:4: 
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
    // InternalUIDSL.g:2432:1: entryRulePageType returns [EObject current=null] : iv_rulePageType= rulePageType EOF ;
    public final EObject entryRulePageType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageType = null;


        try {
            // InternalUIDSL.g:2432:49: (iv_rulePageType= rulePageType EOF )
            // InternalUIDSL.g:2433:2: iv_rulePageType= rulePageType EOF
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
    // InternalUIDSL.g:2439:1: rulePageType returns [EObject current=null] : ( () otherlv_1= 'page' ) ;
    public final EObject rulePageType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalUIDSL.g:2445:2: ( ( () otherlv_1= 'page' ) )
            // InternalUIDSL.g:2446:2: ( () otherlv_1= 'page' )
            {
            // InternalUIDSL.g:2446:2: ( () otherlv_1= 'page' )
            // InternalUIDSL.g:2447:3: () otherlv_1= 'page'
            {
            // InternalUIDSL.g:2447:3: ()
            // InternalUIDSL.g:2448:4: 
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
    // InternalUIDSL.g:2462:1: entryRuleVoidType returns [EObject current=null] : iv_ruleVoidType= ruleVoidType EOF ;
    public final EObject entryRuleVoidType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVoidType = null;


        try {
            // InternalUIDSL.g:2462:49: (iv_ruleVoidType= ruleVoidType EOF )
            // InternalUIDSL.g:2463:2: iv_ruleVoidType= ruleVoidType EOF
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
    // InternalUIDSL.g:2469:1: ruleVoidType returns [EObject current=null] : ( () otherlv_1= 'void' ) ;
    public final EObject ruleVoidType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalUIDSL.g:2475:2: ( ( () otherlv_1= 'void' ) )
            // InternalUIDSL.g:2476:2: ( () otherlv_1= 'void' )
            {
            // InternalUIDSL.g:2476:2: ( () otherlv_1= 'void' )
            // InternalUIDSL.g:2477:3: () otherlv_1= 'void'
            {
            // InternalUIDSL.g:2477:3: ()
            // InternalUIDSL.g:2478:4: 
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
    // InternalUIDSL.g:2492:1: entryRuleAlternativeType returns [EObject current=null] : iv_ruleAlternativeType= ruleAlternativeType EOF ;
    public final EObject entryRuleAlternativeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternativeType = null;


        try {
            // InternalUIDSL.g:2492:56: (iv_ruleAlternativeType= ruleAlternativeType EOF )
            // InternalUIDSL.g:2493:2: iv_ruleAlternativeType= ruleAlternativeType EOF
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
    // InternalUIDSL.g:2499:1: ruleAlternativeType returns [EObject current=null] : ( () ( ( (lv_types_1_1= ruleAttributeType | lv_types_1_2= ruleGeneralType | lv_types_1_3= rulePageType ) ) ) otherlv_2= 'or' ( ( (lv_types_3_1= ruleAttributeType | lv_types_3_2= ruleGeneralType | lv_types_3_3= rulePageType ) ) ) (otherlv_4= 'or' ( ( (lv_types_5_1= ruleAttributeType | lv_types_5_2= ruleGeneralType | lv_types_5_3= rulePageType ) ) ) )* ) ;
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
            // InternalUIDSL.g:2505:2: ( ( () ( ( (lv_types_1_1= ruleAttributeType | lv_types_1_2= ruleGeneralType | lv_types_1_3= rulePageType ) ) ) otherlv_2= 'or' ( ( (lv_types_3_1= ruleAttributeType | lv_types_3_2= ruleGeneralType | lv_types_3_3= rulePageType ) ) ) (otherlv_4= 'or' ( ( (lv_types_5_1= ruleAttributeType | lv_types_5_2= ruleGeneralType | lv_types_5_3= rulePageType ) ) ) )* ) )
            // InternalUIDSL.g:2506:2: ( () ( ( (lv_types_1_1= ruleAttributeType | lv_types_1_2= ruleGeneralType | lv_types_1_3= rulePageType ) ) ) otherlv_2= 'or' ( ( (lv_types_3_1= ruleAttributeType | lv_types_3_2= ruleGeneralType | lv_types_3_3= rulePageType ) ) ) (otherlv_4= 'or' ( ( (lv_types_5_1= ruleAttributeType | lv_types_5_2= ruleGeneralType | lv_types_5_3= rulePageType ) ) ) )* )
            {
            // InternalUIDSL.g:2506:2: ( () ( ( (lv_types_1_1= ruleAttributeType | lv_types_1_2= ruleGeneralType | lv_types_1_3= rulePageType ) ) ) otherlv_2= 'or' ( ( (lv_types_3_1= ruleAttributeType | lv_types_3_2= ruleGeneralType | lv_types_3_3= rulePageType ) ) ) (otherlv_4= 'or' ( ( (lv_types_5_1= ruleAttributeType | lv_types_5_2= ruleGeneralType | lv_types_5_3= rulePageType ) ) ) )* )
            // InternalUIDSL.g:2507:3: () ( ( (lv_types_1_1= ruleAttributeType | lv_types_1_2= ruleGeneralType | lv_types_1_3= rulePageType ) ) ) otherlv_2= 'or' ( ( (lv_types_3_1= ruleAttributeType | lv_types_3_2= ruleGeneralType | lv_types_3_3= rulePageType ) ) ) (otherlv_4= 'or' ( ( (lv_types_5_1= ruleAttributeType | lv_types_5_2= ruleGeneralType | lv_types_5_3= rulePageType ) ) ) )*
            {
            // InternalUIDSL.g:2507:3: ()
            // InternalUIDSL.g:2508:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAlternativeTypeAccess().getAlternativeTypeAction_0(),
            					current);
            			

            }

            // InternalUIDSL.g:2514:3: ( ( (lv_types_1_1= ruleAttributeType | lv_types_1_2= ruleGeneralType | lv_types_1_3= rulePageType ) ) )
            // InternalUIDSL.g:2515:4: ( (lv_types_1_1= ruleAttributeType | lv_types_1_2= ruleGeneralType | lv_types_1_3= rulePageType ) )
            {
            // InternalUIDSL.g:2515:4: ( (lv_types_1_1= ruleAttributeType | lv_types_1_2= ruleGeneralType | lv_types_1_3= rulePageType ) )
            // InternalUIDSL.g:2516:5: (lv_types_1_1= ruleAttributeType | lv_types_1_2= ruleGeneralType | lv_types_1_3= rulePageType )
            {
            // InternalUIDSL.g:2516:5: (lv_types_1_1= ruleAttributeType | lv_types_1_2= ruleGeneralType | lv_types_1_3= rulePageType )
            int alt44=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 41:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
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
                    // InternalUIDSL.g:2517:6: lv_types_1_1= ruleAttributeType
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
                    // InternalUIDSL.g:2533:6: lv_types_1_2= ruleGeneralType
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
                    // InternalUIDSL.g:2549:6: lv_types_1_3= rulePageType
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
            		
            // InternalUIDSL.g:2571:3: ( ( (lv_types_3_1= ruleAttributeType | lv_types_3_2= ruleGeneralType | lv_types_3_3= rulePageType ) ) )
            // InternalUIDSL.g:2572:4: ( (lv_types_3_1= ruleAttributeType | lv_types_3_2= ruleGeneralType | lv_types_3_3= rulePageType ) )
            {
            // InternalUIDSL.g:2572:4: ( (lv_types_3_1= ruleAttributeType | lv_types_3_2= ruleGeneralType | lv_types_3_3= rulePageType ) )
            // InternalUIDSL.g:2573:5: (lv_types_3_1= ruleAttributeType | lv_types_3_2= ruleGeneralType | lv_types_3_3= rulePageType )
            {
            // InternalUIDSL.g:2573:5: (lv_types_3_1= ruleAttributeType | lv_types_3_2= ruleGeneralType | lv_types_3_3= rulePageType )
            int alt45=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 41:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
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
                    // InternalUIDSL.g:2574:6: lv_types_3_1= ruleAttributeType
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
                    // InternalUIDSL.g:2590:6: lv_types_3_2= ruleGeneralType
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
                    // InternalUIDSL.g:2606:6: lv_types_3_3= rulePageType
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

            // InternalUIDSL.g:2624:3: (otherlv_4= 'or' ( ( (lv_types_5_1= ruleAttributeType | lv_types_5_2= ruleGeneralType | lv_types_5_3= rulePageType ) ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==42) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalUIDSL.g:2625:4: otherlv_4= 'or' ( ( (lv_types_5_1= ruleAttributeType | lv_types_5_2= ruleGeneralType | lv_types_5_3= rulePageType ) ) )
            	    {
            	    otherlv_4=(Token)match(input,42,FOLLOW_38); 

            	    				newLeafNode(otherlv_4, grammarAccess.getAlternativeTypeAccess().getOrKeyword_4_0());
            	    			
            	    // InternalUIDSL.g:2629:4: ( ( (lv_types_5_1= ruleAttributeType | lv_types_5_2= ruleGeneralType | lv_types_5_3= rulePageType ) ) )
            	    // InternalUIDSL.g:2630:5: ( (lv_types_5_1= ruleAttributeType | lv_types_5_2= ruleGeneralType | lv_types_5_3= rulePageType ) )
            	    {
            	    // InternalUIDSL.g:2630:5: ( (lv_types_5_1= ruleAttributeType | lv_types_5_2= ruleGeneralType | lv_types_5_3= rulePageType ) )
            	    // InternalUIDSL.g:2631:6: (lv_types_5_1= ruleAttributeType | lv_types_5_2= ruleGeneralType | lv_types_5_3= rulePageType )
            	    {
            	    // InternalUIDSL.g:2631:6: (lv_types_5_1= ruleAttributeType | lv_types_5_2= ruleGeneralType | lv_types_5_3= rulePageType )
            	    int alt46=3;
            	    switch ( input.LA(1) ) {
            	    case RULE_ID:
            	    case 41:
            	    case 58:
            	    case 59:
            	    case 60:
            	    case 61:
            	    case 62:
            	    case 73:
            	    case 74:
            	    case 75:
            	    case 76:
            	    case 77:
            	    case 78:
            	    case 79:
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
            	            // InternalUIDSL.g:2632:7: lv_types_5_1= ruleAttributeType
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
            	            // InternalUIDSL.g:2648:7: lv_types_5_2= ruleGeneralType
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
            	            // InternalUIDSL.g:2664:7: lv_types_5_3= rulePageType
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
    // InternalUIDSL.g:2687:1: entryRuleTypeExpression returns [EObject current=null] : iv_ruleTypeExpression= ruleTypeExpression EOF ;
    public final EObject entryRuleTypeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeExpression = null;


        try {
            // InternalUIDSL.g:2687:55: (iv_ruleTypeExpression= ruleTypeExpression EOF )
            // InternalUIDSL.g:2688:2: iv_ruleTypeExpression= ruleTypeExpression EOF
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
    // InternalUIDSL.g:2694:1: ruleTypeExpression returns [EObject current=null] : ( ( () ( ( (lv_type_1_1= ruleAttributeType | lv_type_1_2= ruleAlternativeType | lv_type_1_3= ruleGeneralType | lv_type_1_4= ruleAnyType | lv_type_1_5= rulePageType ) ) ) ) | this_PropertyRuntimeType_2= rulePropertyRuntimeType | this_PropertySingleRuntimeType_3= rulePropertySingleRuntimeType ) ;
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
            // InternalUIDSL.g:2700:2: ( ( ( () ( ( (lv_type_1_1= ruleAttributeType | lv_type_1_2= ruleAlternativeType | lv_type_1_3= ruleGeneralType | lv_type_1_4= ruleAnyType | lv_type_1_5= rulePageType ) ) ) ) | this_PropertyRuntimeType_2= rulePropertyRuntimeType | this_PropertySingleRuntimeType_3= rulePropertySingleRuntimeType ) )
            // InternalUIDSL.g:2701:2: ( ( () ( ( (lv_type_1_1= ruleAttributeType | lv_type_1_2= ruleAlternativeType | lv_type_1_3= ruleGeneralType | lv_type_1_4= ruleAnyType | lv_type_1_5= rulePageType ) ) ) ) | this_PropertyRuntimeType_2= rulePropertyRuntimeType | this_PropertySingleRuntimeType_3= rulePropertySingleRuntimeType )
            {
            // InternalUIDSL.g:2701:2: ( ( () ( ( (lv_type_1_1= ruleAttributeType | lv_type_1_2= ruleAlternativeType | lv_type_1_3= ruleGeneralType | lv_type_1_4= ruleAnyType | lv_type_1_5= rulePageType ) ) ) ) | this_PropertyRuntimeType_2= rulePropertyRuntimeType | this_PropertySingleRuntimeType_3= rulePropertySingleRuntimeType )
            int alt49=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 18:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
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
                    // InternalUIDSL.g:2702:3: ( () ( ( (lv_type_1_1= ruleAttributeType | lv_type_1_2= ruleAlternativeType | lv_type_1_3= ruleGeneralType | lv_type_1_4= ruleAnyType | lv_type_1_5= rulePageType ) ) ) )
                    {
                    // InternalUIDSL.g:2702:3: ( () ( ( (lv_type_1_1= ruleAttributeType | lv_type_1_2= ruleAlternativeType | lv_type_1_3= ruleGeneralType | lv_type_1_4= ruleAnyType | lv_type_1_5= rulePageType ) ) ) )
                    // InternalUIDSL.g:2703:4: () ( ( (lv_type_1_1= ruleAttributeType | lv_type_1_2= ruleAlternativeType | lv_type_1_3= ruleGeneralType | lv_type_1_4= ruleAnyType | lv_type_1_5= rulePageType ) ) )
                    {
                    // InternalUIDSL.g:2703:4: ()
                    // InternalUIDSL.g:2704:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeExpressionAccess().getSimpleTypeAction_0_0(),
                    						current);
                    				

                    }

                    // InternalUIDSL.g:2710:4: ( ( (lv_type_1_1= ruleAttributeType | lv_type_1_2= ruleAlternativeType | lv_type_1_3= ruleGeneralType | lv_type_1_4= ruleAnyType | lv_type_1_5= rulePageType ) ) )
                    // InternalUIDSL.g:2711:5: ( (lv_type_1_1= ruleAttributeType | lv_type_1_2= ruleAlternativeType | lv_type_1_3= ruleGeneralType | lv_type_1_4= ruleAnyType | lv_type_1_5= rulePageType ) )
                    {
                    // InternalUIDSL.g:2711:5: ( (lv_type_1_1= ruleAttributeType | lv_type_1_2= ruleAlternativeType | lv_type_1_3= ruleGeneralType | lv_type_1_4= ruleAnyType | lv_type_1_5= rulePageType ) )
                    // InternalUIDSL.g:2712:6: (lv_type_1_1= ruleAttributeType | lv_type_1_2= ruleAlternativeType | lv_type_1_3= ruleGeneralType | lv_type_1_4= ruleAnyType | lv_type_1_5= rulePageType )
                    {
                    // InternalUIDSL.g:2712:6: (lv_type_1_1= ruleAttributeType | lv_type_1_2= ruleAlternativeType | lv_type_1_3= ruleGeneralType | lv_type_1_4= ruleAnyType | lv_type_1_5= rulePageType )
                    int alt48=5;
                    alt48 = dfa48.predict(input);
                    switch (alt48) {
                        case 1 :
                            // InternalUIDSL.g:2713:7: lv_type_1_1= ruleAttributeType
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
                            // InternalUIDSL.g:2729:7: lv_type_1_2= ruleAlternativeType
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
                            // InternalUIDSL.g:2745:7: lv_type_1_3= ruleGeneralType
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
                            // InternalUIDSL.g:2761:7: lv_type_1_4= ruleAnyType
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
                            // InternalUIDSL.g:2777:7: lv_type_1_5= rulePageType
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
                    // InternalUIDSL.g:2797:3: this_PropertyRuntimeType_2= rulePropertyRuntimeType
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
                    // InternalUIDSL.g:2806:3: this_PropertySingleRuntimeType_3= rulePropertySingleRuntimeType
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
    // InternalUIDSL.g:2818:1: entryRulePropertyRuntimeType returns [EObject current=null] : iv_rulePropertyRuntimeType= rulePropertyRuntimeType EOF ;
    public final EObject entryRulePropertyRuntimeType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyRuntimeType = null;


        try {
            // InternalUIDSL.g:2818:60: (iv_rulePropertyRuntimeType= rulePropertyRuntimeType EOF )
            // InternalUIDSL.g:2819:2: iv_rulePropertyRuntimeType= rulePropertyRuntimeType EOF
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
    // InternalUIDSL.g:2825:1: rulePropertyRuntimeType returns [EObject current=null] : (otherlv_0= 'typeOf' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject rulePropertyRuntimeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalUIDSL.g:2831:2: ( (otherlv_0= 'typeOf' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) )
            // InternalUIDSL.g:2832:2: (otherlv_0= 'typeOf' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            {
            // InternalUIDSL.g:2832:2: (otherlv_0= 'typeOf' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            // InternalUIDSL.g:2833:3: otherlv_0= 'typeOf' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertyRuntimeTypeAccess().getTypeOfKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyRuntimeTypeAccess().getLeftParenthesisKeyword_1());
            		
            // InternalUIDSL.g:2841:3: ( (otherlv_2= RULE_ID ) )
            // InternalUIDSL.g:2842:4: (otherlv_2= RULE_ID )
            {
            // InternalUIDSL.g:2842:4: (otherlv_2= RULE_ID )
            // InternalUIDSL.g:2843:5: otherlv_2= RULE_ID
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
    // InternalUIDSL.g:2862:1: entryRulePropertySingleRuntimeType returns [EObject current=null] : iv_rulePropertySingleRuntimeType= rulePropertySingleRuntimeType EOF ;
    public final EObject entryRulePropertySingleRuntimeType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertySingleRuntimeType = null;


        try {
            // InternalUIDSL.g:2862:66: (iv_rulePropertySingleRuntimeType= rulePropertySingleRuntimeType EOF )
            // InternalUIDSL.g:2863:2: iv_rulePropertySingleRuntimeType= rulePropertySingleRuntimeType EOF
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
    // InternalUIDSL.g:2869:1: rulePropertySingleRuntimeType returns [EObject current=null] : (otherlv_0= 'singleTypeOf' otherlv_1= '(' ( (lv_propertyType_2_0= rulePropertyRuntimeType ) ) otherlv_3= ')' ) ;
    public final EObject rulePropertySingleRuntimeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_propertyType_2_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:2875:2: ( (otherlv_0= 'singleTypeOf' otherlv_1= '(' ( (lv_propertyType_2_0= rulePropertyRuntimeType ) ) otherlv_3= ')' ) )
            // InternalUIDSL.g:2876:2: (otherlv_0= 'singleTypeOf' otherlv_1= '(' ( (lv_propertyType_2_0= rulePropertyRuntimeType ) ) otherlv_3= ')' )
            {
            // InternalUIDSL.g:2876:2: (otherlv_0= 'singleTypeOf' otherlv_1= '(' ( (lv_propertyType_2_0= rulePropertyRuntimeType ) ) otherlv_3= ')' )
            // InternalUIDSL.g:2877:3: otherlv_0= 'singleTypeOf' otherlv_1= '(' ( (lv_propertyType_2_0= rulePropertyRuntimeType ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertySingleRuntimeTypeAccess().getSingleTypeOfKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertySingleRuntimeTypeAccess().getLeftParenthesisKeyword_1());
            		
            // InternalUIDSL.g:2885:3: ( (lv_propertyType_2_0= rulePropertyRuntimeType ) )
            // InternalUIDSL.g:2886:4: (lv_propertyType_2_0= rulePropertyRuntimeType )
            {
            // InternalUIDSL.g:2886:4: (lv_propertyType_2_0= rulePropertyRuntimeType )
            // InternalUIDSL.g:2887:5: lv_propertyType_2_0= rulePropertyRuntimeType
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
    // InternalUIDSL.g:2912:1: entryRuleDefaultConfigurations returns [EObject current=null] : iv_ruleDefaultConfigurations= ruleDefaultConfigurations EOF ;
    public final EObject entryRuleDefaultConfigurations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultConfigurations = null;


        try {
            // InternalUIDSL.g:2912:62: (iv_ruleDefaultConfigurations= ruleDefaultConfigurations EOF )
            // InternalUIDSL.g:2913:2: iv_ruleDefaultConfigurations= ruleDefaultConfigurations EOF
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
    // InternalUIDSL.g:2919:1: ruleDefaultConfigurations returns [EObject current=null] : (otherlv_0= 'defaults' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_defaults_3_0= ruleDefaultComponentConfig ) )* otherlv_4= '}' ) ;
    public final EObject ruleDefaultConfigurations() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_defaults_3_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:2925:2: ( (otherlv_0= 'defaults' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_defaults_3_0= ruleDefaultComponentConfig ) )* otherlv_4= '}' ) )
            // InternalUIDSL.g:2926:2: (otherlv_0= 'defaults' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_defaults_3_0= ruleDefaultComponentConfig ) )* otherlv_4= '}' )
            {
            // InternalUIDSL.g:2926:2: (otherlv_0= 'defaults' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_defaults_3_0= ruleDefaultComponentConfig ) )* otherlv_4= '}' )
            // InternalUIDSL.g:2927:3: otherlv_0= 'defaults' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_defaults_3_0= ruleDefaultComponentConfig ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDefaultConfigurationsAccess().getDefaultsKeyword_0());
            		
            // InternalUIDSL.g:2931:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUIDSL.g:2932:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUIDSL.g:2932:4: (lv_name_1_0= RULE_ID )
            // InternalUIDSL.g:2933:5: lv_name_1_0= RULE_ID
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
            		
            // InternalUIDSL.g:2953:3: ( (lv_defaults_3_0= ruleDefaultComponentConfig ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==46) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalUIDSL.g:2954:4: (lv_defaults_3_0= ruleDefaultComponentConfig )
            	    {
            	    // InternalUIDSL.g:2954:4: (lv_defaults_3_0= ruleDefaultComponentConfig )
            	    // InternalUIDSL.g:2955:5: lv_defaults_3_0= ruleDefaultComponentConfig
            	    {

            	    					newCompositeNode(grammarAccess.getDefaultConfigurationsAccess().getDefaultsDefaultComponentConfigParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_41);
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
            	    break loop50;
                }
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
    // InternalUIDSL.g:2980:1: entryRuleDefaultComponentConfig returns [EObject current=null] : iv_ruleDefaultComponentConfig= ruleDefaultComponentConfig EOF ;
    public final EObject entryRuleDefaultComponentConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultComponentConfig = null;


        try {
            // InternalUIDSL.g:2980:63: (iv_ruleDefaultComponentConfig= ruleDefaultComponentConfig EOF )
            // InternalUIDSL.g:2981:2: iv_ruleDefaultComponentConfig= ruleDefaultComponentConfig EOF
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
    // InternalUIDSL.g:2987:1: ruleDefaultComponentConfig returns [EObject current=null] : (otherlv_0= 'default' otherlv_1= 'for' ( ( (lv_type_2_1= ruleBasicType | lv_type_2_2= ruleGeneralType ) ) ) otherlv_3= '{' otherlv_4= 'input_component' otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'output_component' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) otherlv_10= '}' ) ;
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
            // InternalUIDSL.g:2993:2: ( (otherlv_0= 'default' otherlv_1= 'for' ( ( (lv_type_2_1= ruleBasicType | lv_type_2_2= ruleGeneralType ) ) ) otherlv_3= '{' otherlv_4= 'input_component' otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'output_component' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) otherlv_10= '}' ) )
            // InternalUIDSL.g:2994:2: (otherlv_0= 'default' otherlv_1= 'for' ( ( (lv_type_2_1= ruleBasicType | lv_type_2_2= ruleGeneralType ) ) ) otherlv_3= '{' otherlv_4= 'input_component' otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'output_component' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) otherlv_10= '}' )
            {
            // InternalUIDSL.g:2994:2: (otherlv_0= 'default' otherlv_1= 'for' ( ( (lv_type_2_1= ruleBasicType | lv_type_2_2= ruleGeneralType ) ) ) otherlv_3= '{' otherlv_4= 'input_component' otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'output_component' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) otherlv_10= '}' )
            // InternalUIDSL.g:2995:3: otherlv_0= 'default' otherlv_1= 'for' ( ( (lv_type_2_1= ruleBasicType | lv_type_2_2= ruleGeneralType ) ) ) otherlv_3= '{' otherlv_4= 'input_component' otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'output_component' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_42); 

            			newLeafNode(otherlv_0, grammarAccess.getDefaultComponentConfigAccess().getDefaultKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_43); 

            			newLeafNode(otherlv_1, grammarAccess.getDefaultComponentConfigAccess().getForKeyword_1());
            		
            // InternalUIDSL.g:3003:3: ( ( (lv_type_2_1= ruleBasicType | lv_type_2_2= ruleGeneralType ) ) )
            // InternalUIDSL.g:3004:4: ( (lv_type_2_1= ruleBasicType | lv_type_2_2= ruleGeneralType ) )
            {
            // InternalUIDSL.g:3004:4: ( (lv_type_2_1= ruleBasicType | lv_type_2_2= ruleGeneralType ) )
            // InternalUIDSL.g:3005:5: (lv_type_2_1= ruleBasicType | lv_type_2_2= ruleGeneralType )
            {
            // InternalUIDSL.g:3005:5: (lv_type_2_1= ruleBasicType | lv_type_2_2= ruleGeneralType )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=58 && LA51_0<=62)||(LA51_0>=73 && LA51_0<=78)) ) {
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
                    // InternalUIDSL.g:3006:6: lv_type_2_1= ruleBasicType
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
                    // InternalUIDSL.g:3022:6: lv_type_2_2= ruleGeneralType
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

            otherlv_3=(Token)match(input,12,FOLLOW_44); 

            			newLeafNode(otherlv_3, grammarAccess.getDefaultComponentConfigAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,47,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getDefaultComponentConfigAccess().getInput_componentKeyword_4());
            		
            otherlv_5=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getDefaultComponentConfigAccess().getColonKeyword_5());
            		
            // InternalUIDSL.g:3052:3: ( (otherlv_6= RULE_ID ) )
            // InternalUIDSL.g:3053:4: (otherlv_6= RULE_ID )
            {
            // InternalUIDSL.g:3053:4: (otherlv_6= RULE_ID )
            // InternalUIDSL.g:3054:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefaultComponentConfigRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_45); 

            					newLeafNode(otherlv_6, grammarAccess.getDefaultComponentConfigAccess().getInputCompUIComponentCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,48,FOLLOW_14); 

            			newLeafNode(otherlv_7, grammarAccess.getDefaultComponentConfigAccess().getOutput_componentKeyword_7());
            		
            otherlv_8=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getDefaultComponentConfigAccess().getColonKeyword_8());
            		
            // InternalUIDSL.g:3073:3: ( (otherlv_9= RULE_ID ) )
            // InternalUIDSL.g:3074:4: (otherlv_9= RULE_ID )
            {
            // InternalUIDSL.g:3074:4: (otherlv_9= RULE_ID )
            // InternalUIDSL.g:3075:5: otherlv_9= RULE_ID
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
    // InternalUIDSL.g:3094:1: entryRuleDefaultUIComponent returns [EObject current=null] : iv_ruleDefaultUIComponent= ruleDefaultUIComponent EOF ;
    public final EObject entryRuleDefaultUIComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultUIComponent = null;


        try {
            // InternalUIDSL.g:3094:59: (iv_ruleDefaultUIComponent= ruleDefaultUIComponent EOF )
            // InternalUIDSL.g:3095:2: iv_ruleDefaultUIComponent= ruleDefaultUIComponent EOF
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
    // InternalUIDSL.g:3101:1: ruleDefaultUIComponent returns [EObject current=null] : ( ( () otherlv_1= 'input' otherlv_2= '(' ( (lv_value_3_0= ruleMemberSelectionExpression ) ) otherlv_4= ')' ) | ( () otherlv_6= 'output' otherlv_7= '(' ( (lv_value_8_0= ruleMemberSelectionExpression ) ) otherlv_9= ')' ) ) ;
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
            // InternalUIDSL.g:3107:2: ( ( ( () otherlv_1= 'input' otherlv_2= '(' ( (lv_value_3_0= ruleMemberSelectionExpression ) ) otherlv_4= ')' ) | ( () otherlv_6= 'output' otherlv_7= '(' ( (lv_value_8_0= ruleMemberSelectionExpression ) ) otherlv_9= ')' ) ) )
            // InternalUIDSL.g:3108:2: ( ( () otherlv_1= 'input' otherlv_2= '(' ( (lv_value_3_0= ruleMemberSelectionExpression ) ) otherlv_4= ')' ) | ( () otherlv_6= 'output' otherlv_7= '(' ( (lv_value_8_0= ruleMemberSelectionExpression ) ) otherlv_9= ')' ) )
            {
            // InternalUIDSL.g:3108:2: ( ( () otherlv_1= 'input' otherlv_2= '(' ( (lv_value_3_0= ruleMemberSelectionExpression ) ) otherlv_4= ')' ) | ( () otherlv_6= 'output' otherlv_7= '(' ( (lv_value_8_0= ruleMemberSelectionExpression ) ) otherlv_9= ')' ) )
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
                    // InternalUIDSL.g:3109:3: ( () otherlv_1= 'input' otherlv_2= '(' ( (lv_value_3_0= ruleMemberSelectionExpression ) ) otherlv_4= ')' )
                    {
                    // InternalUIDSL.g:3109:3: ( () otherlv_1= 'input' otherlv_2= '(' ( (lv_value_3_0= ruleMemberSelectionExpression ) ) otherlv_4= ')' )
                    // InternalUIDSL.g:3110:4: () otherlv_1= 'input' otherlv_2= '(' ( (lv_value_3_0= ruleMemberSelectionExpression ) ) otherlv_4= ')'
                    {
                    // InternalUIDSL.g:3110:4: ()
                    // InternalUIDSL.g:3111:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDefaultUIComponentAccess().getInputUIComponentAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,49,FOLLOW_8); 

                    				newLeafNode(otherlv_1, grammarAccess.getDefaultUIComponentAccess().getInputKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,15,FOLLOW_29); 

                    				newLeafNode(otherlv_2, grammarAccess.getDefaultUIComponentAccess().getLeftParenthesisKeyword_0_2());
                    			
                    // InternalUIDSL.g:3125:4: ( (lv_value_3_0= ruleMemberSelectionExpression ) )
                    // InternalUIDSL.g:3126:5: (lv_value_3_0= ruleMemberSelectionExpression )
                    {
                    // InternalUIDSL.g:3126:5: (lv_value_3_0= ruleMemberSelectionExpression )
                    // InternalUIDSL.g:3127:6: lv_value_3_0= ruleMemberSelectionExpression
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
                    // InternalUIDSL.g:3150:3: ( () otherlv_6= 'output' otherlv_7= '(' ( (lv_value_8_0= ruleMemberSelectionExpression ) ) otherlv_9= ')' )
                    {
                    // InternalUIDSL.g:3150:3: ( () otherlv_6= 'output' otherlv_7= '(' ( (lv_value_8_0= ruleMemberSelectionExpression ) ) otherlv_9= ')' )
                    // InternalUIDSL.g:3151:4: () otherlv_6= 'output' otherlv_7= '(' ( (lv_value_8_0= ruleMemberSelectionExpression ) ) otherlv_9= ')'
                    {
                    // InternalUIDSL.g:3151:4: ()
                    // InternalUIDSL.g:3152:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDefaultUIComponentAccess().getOutputUIComponentAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_6=(Token)match(input,50,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getDefaultUIComponentAccess().getOutputKeyword_1_1());
                    			
                    otherlv_7=(Token)match(input,15,FOLLOW_29); 

                    				newLeafNode(otherlv_7, grammarAccess.getDefaultUIComponentAccess().getLeftParenthesisKeyword_1_2());
                    			
                    // InternalUIDSL.g:3166:4: ( (lv_value_8_0= ruleMemberSelectionExpression ) )
                    // InternalUIDSL.g:3167:5: (lv_value_8_0= ruleMemberSelectionExpression )
                    {
                    // InternalUIDSL.g:3167:5: (lv_value_8_0= ruleMemberSelectionExpression )
                    // InternalUIDSL.g:3168:6: lv_value_8_0= ruleMemberSelectionExpression
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
    // InternalUIDSL.g:3194:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalUIDSL.g:3194:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalUIDSL.g:3195:2: iv_ruleComponent= ruleComponent EOF
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
    // InternalUIDSL.g:3201:1: ruleComponent returns [EObject current=null] : (this_UIComponentInstance_0= ruleUIComponentInstance | this_DefaultUIComponent_1= ruleDefaultUIComponent ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        EObject this_UIComponentInstance_0 = null;

        EObject this_DefaultUIComponent_1 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:3207:2: ( (this_UIComponentInstance_0= ruleUIComponentInstance | this_DefaultUIComponent_1= ruleDefaultUIComponent ) )
            // InternalUIDSL.g:3208:2: (this_UIComponentInstance_0= ruleUIComponentInstance | this_DefaultUIComponent_1= ruleDefaultUIComponent )
            {
            // InternalUIDSL.g:3208:2: (this_UIComponentInstance_0= ruleUIComponentInstance | this_DefaultUIComponent_1= ruleDefaultUIComponent )
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
                    // InternalUIDSL.g:3209:3: this_UIComponentInstance_0= ruleUIComponentInstance
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
                    // InternalUIDSL.g:3218:3: this_DefaultUIComponent_1= ruleDefaultUIComponent
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


    // $ANTLR start "entryRuleCustomDefaultComponentsDefinition"
    // InternalUIDSL.g:3230:1: entryRuleCustomDefaultComponentsDefinition returns [EObject current=null] : iv_ruleCustomDefaultComponentsDefinition= ruleCustomDefaultComponentsDefinition EOF ;
    public final EObject entryRuleCustomDefaultComponentsDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomDefaultComponentsDefinition = null;


        try {
            // InternalUIDSL.g:3230:74: (iv_ruleCustomDefaultComponentsDefinition= ruleCustomDefaultComponentsDefinition EOF )
            // InternalUIDSL.g:3231:2: iv_ruleCustomDefaultComponentsDefinition= ruleCustomDefaultComponentsDefinition EOF
            {
             newCompositeNode(grammarAccess.getCustomDefaultComponentsDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustomDefaultComponentsDefinition=ruleCustomDefaultComponentsDefinition();

            state._fsp--;

             current =iv_ruleCustomDefaultComponentsDefinition; 
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
    // $ANTLR end "entryRuleCustomDefaultComponentsDefinition"


    // $ANTLR start "ruleCustomDefaultComponentsDefinition"
    // InternalUIDSL.g:3237:1: ruleCustomDefaultComponentsDefinition returns [EObject current=null] : (otherlv_0= 'custom' otherlv_1= 'defaults' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_defaults_4_0= ruleCustomDefaultComponentDefinition ) )+ otherlv_5= '}' ) ;
    public final EObject ruleCustomDefaultComponentsDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_defaults_4_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:3243:2: ( (otherlv_0= 'custom' otherlv_1= 'defaults' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_defaults_4_0= ruleCustomDefaultComponentDefinition ) )+ otherlv_5= '}' ) )
            // InternalUIDSL.g:3244:2: (otherlv_0= 'custom' otherlv_1= 'defaults' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_defaults_4_0= ruleCustomDefaultComponentDefinition ) )+ otherlv_5= '}' )
            {
            // InternalUIDSL.g:3244:2: (otherlv_0= 'custom' otherlv_1= 'defaults' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_defaults_4_0= ruleCustomDefaultComponentDefinition ) )+ otherlv_5= '}' )
            // InternalUIDSL.g:3245:3: otherlv_0= 'custom' otherlv_1= 'defaults' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_defaults_4_0= ruleCustomDefaultComponentDefinition ) )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_46); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomDefaultComponentsDefinitionAccess().getCustomKeyword_0());
            		
            otherlv_1=(Token)match(input,45,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getCustomDefaultComponentsDefinitionAccess().getDefaultsKeyword_1());
            		
            // InternalUIDSL.g:3253:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUIDSL.g:3254:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUIDSL.g:3254:4: (lv_name_2_0= RULE_ID )
            // InternalUIDSL.g:3255:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getCustomDefaultComponentsDefinitionAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomDefaultComponentsDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_47); 

            			newLeafNode(otherlv_3, grammarAccess.getCustomDefaultComponentsDefinitionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUIDSL.g:3275:3: ( (lv_defaults_4_0= ruleCustomDefaultComponentDefinition ) )+
            int cnt54=0;
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==52) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalUIDSL.g:3276:4: (lv_defaults_4_0= ruleCustomDefaultComponentDefinition )
            	    {
            	    // InternalUIDSL.g:3276:4: (lv_defaults_4_0= ruleCustomDefaultComponentDefinition )
            	    // InternalUIDSL.g:3277:5: lv_defaults_4_0= ruleCustomDefaultComponentDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getCustomDefaultComponentsDefinitionAccess().getDefaultsCustomDefaultComponentDefinitionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_48);
            	    lv_defaults_4_0=ruleCustomDefaultComponentDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCustomDefaultComponentsDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"defaults",
            	    						lv_defaults_4_0,
            	    						"com.stefanvuckovic.uidsl.UIDSL.CustomDefaultComponentDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt54 >= 1 ) break loop54;
                        EarlyExitException eee =
                            new EarlyExitException(54, input);
                        throw eee;
                }
                cnt54++;
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getCustomDefaultComponentsDefinitionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleCustomDefaultComponentsDefinition"


    // $ANTLR start "entryRuleCustomDefaultComponentDefinition"
    // InternalUIDSL.g:3302:1: entryRuleCustomDefaultComponentDefinition returns [EObject current=null] : iv_ruleCustomDefaultComponentDefinition= ruleCustomDefaultComponentDefinition EOF ;
    public final EObject entryRuleCustomDefaultComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomDefaultComponentDefinition = null;


        try {
            // InternalUIDSL.g:3302:73: (iv_ruleCustomDefaultComponentDefinition= ruleCustomDefaultComponentDefinition EOF )
            // InternalUIDSL.g:3303:2: iv_ruleCustomDefaultComponentDefinition= ruleCustomDefaultComponentDefinition EOF
            {
             newCompositeNode(grammarAccess.getCustomDefaultComponentDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustomDefaultComponentDefinition=ruleCustomDefaultComponentDefinition();

            state._fsp--;

             current =iv_ruleCustomDefaultComponentDefinition; 
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
    // $ANTLR end "entryRuleCustomDefaultComponentDefinition"


    // $ANTLR start "ruleCustomDefaultComponentDefinition"
    // InternalUIDSL.g:3309:1: ruleCustomDefaultComponentDefinition returns [EObject current=null] : (otherlv_0= 'define' ( ( (lv_compType_1_1= 'input' | lv_compType_1_2= 'output' ) ) ) otherlv_2= '(' ( (lv_type_3_0= ruleVariable ) ) otherlv_4= ')' (otherlv_5= 'implicit_variables' ( (lv_implicits_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_implicits_8_0= ruleVariable ) ) )* )? otherlv_9= '{' ( (lv_elements_10_0= ruleUIElement ) )* otherlv_11= '}' ) ;
    public final EObject ruleCustomDefaultComponentDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_compType_1_1=null;
        Token lv_compType_1_2=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_type_3_0 = null;

        EObject lv_implicits_6_0 = null;

        EObject lv_implicits_8_0 = null;

        EObject lv_elements_10_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:3315:2: ( (otherlv_0= 'define' ( ( (lv_compType_1_1= 'input' | lv_compType_1_2= 'output' ) ) ) otherlv_2= '(' ( (lv_type_3_0= ruleVariable ) ) otherlv_4= ')' (otherlv_5= 'implicit_variables' ( (lv_implicits_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_implicits_8_0= ruleVariable ) ) )* )? otherlv_9= '{' ( (lv_elements_10_0= ruleUIElement ) )* otherlv_11= '}' ) )
            // InternalUIDSL.g:3316:2: (otherlv_0= 'define' ( ( (lv_compType_1_1= 'input' | lv_compType_1_2= 'output' ) ) ) otherlv_2= '(' ( (lv_type_3_0= ruleVariable ) ) otherlv_4= ')' (otherlv_5= 'implicit_variables' ( (lv_implicits_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_implicits_8_0= ruleVariable ) ) )* )? otherlv_9= '{' ( (lv_elements_10_0= ruleUIElement ) )* otherlv_11= '}' )
            {
            // InternalUIDSL.g:3316:2: (otherlv_0= 'define' ( ( (lv_compType_1_1= 'input' | lv_compType_1_2= 'output' ) ) ) otherlv_2= '(' ( (lv_type_3_0= ruleVariable ) ) otherlv_4= ')' (otherlv_5= 'implicit_variables' ( (lv_implicits_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_implicits_8_0= ruleVariable ) ) )* )? otherlv_9= '{' ( (lv_elements_10_0= ruleUIElement ) )* otherlv_11= '}' )
            // InternalUIDSL.g:3317:3: otherlv_0= 'define' ( ( (lv_compType_1_1= 'input' | lv_compType_1_2= 'output' ) ) ) otherlv_2= '(' ( (lv_type_3_0= ruleVariable ) ) otherlv_4= ')' (otherlv_5= 'implicit_variables' ( (lv_implicits_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_implicits_8_0= ruleVariable ) ) )* )? otherlv_9= '{' ( (lv_elements_10_0= ruleUIElement ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_49); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomDefaultComponentDefinitionAccess().getDefineKeyword_0());
            		
            // InternalUIDSL.g:3321:3: ( ( (lv_compType_1_1= 'input' | lv_compType_1_2= 'output' ) ) )
            // InternalUIDSL.g:3322:4: ( (lv_compType_1_1= 'input' | lv_compType_1_2= 'output' ) )
            {
            // InternalUIDSL.g:3322:4: ( (lv_compType_1_1= 'input' | lv_compType_1_2= 'output' ) )
            // InternalUIDSL.g:3323:5: (lv_compType_1_1= 'input' | lv_compType_1_2= 'output' )
            {
            // InternalUIDSL.g:3323:5: (lv_compType_1_1= 'input' | lv_compType_1_2= 'output' )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==49) ) {
                alt55=1;
            }
            else if ( (LA55_0==50) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // InternalUIDSL.g:3324:6: lv_compType_1_1= 'input'
                    {
                    lv_compType_1_1=(Token)match(input,49,FOLLOW_8); 

                    						newLeafNode(lv_compType_1_1, grammarAccess.getCustomDefaultComponentDefinitionAccess().getCompTypeInputKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCustomDefaultComponentDefinitionRule());
                    						}
                    						setWithLastConsumed(current, "compType", lv_compType_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalUIDSL.g:3335:6: lv_compType_1_2= 'output'
                    {
                    lv_compType_1_2=(Token)match(input,50,FOLLOW_8); 

                    						newLeafNode(lv_compType_1_2, grammarAccess.getCustomDefaultComponentDefinitionAccess().getCompTypeOutputKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCustomDefaultComponentDefinitionRule());
                    						}
                    						setWithLastConsumed(current, "compType", lv_compType_1_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getCustomDefaultComponentDefinitionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalUIDSL.g:3352:3: ( (lv_type_3_0= ruleVariable ) )
            // InternalUIDSL.g:3353:4: (lv_type_3_0= ruleVariable )
            {
            // InternalUIDSL.g:3353:4: (lv_type_3_0= ruleVariable )
            // InternalUIDSL.g:3354:5: lv_type_3_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getCustomDefaultComponentDefinitionAccess().getTypeVariableParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_36);
            lv_type_3_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCustomDefaultComponentDefinitionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"com.stefanvuckovic.uidsl.UIDSL.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_50); 

            			newLeafNode(otherlv_4, grammarAccess.getCustomDefaultComponentDefinitionAccess().getRightParenthesisKeyword_4());
            		
            // InternalUIDSL.g:3375:3: (otherlv_5= 'implicit_variables' ( (lv_implicits_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_implicits_8_0= ruleVariable ) ) )* )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==53) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalUIDSL.g:3376:4: otherlv_5= 'implicit_variables' ( (lv_implicits_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_implicits_8_0= ruleVariable ) ) )*
                    {
                    otherlv_5=(Token)match(input,53,FOLLOW_11); 

                    				newLeafNode(otherlv_5, grammarAccess.getCustomDefaultComponentDefinitionAccess().getImplicit_variablesKeyword_5_0());
                    			
                    // InternalUIDSL.g:3380:4: ( (lv_implicits_6_0= ruleVariable ) )
                    // InternalUIDSL.g:3381:5: (lv_implicits_6_0= ruleVariable )
                    {
                    // InternalUIDSL.g:3381:5: (lv_implicits_6_0= ruleVariable )
                    // InternalUIDSL.g:3382:6: lv_implicits_6_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getCustomDefaultComponentDefinitionAccess().getImplicitsVariableParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_51);
                    lv_implicits_6_0=ruleVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCustomDefaultComponentDefinitionRule());
                    						}
                    						add(
                    							current,
                    							"implicits",
                    							lv_implicits_6_0,
                    							"com.stefanvuckovic.uidsl.UIDSL.Variable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUIDSL.g:3399:4: (otherlv_7= ',' ( (lv_implicits_8_0= ruleVariable ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==16) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // InternalUIDSL.g:3400:5: otherlv_7= ',' ( (lv_implicits_8_0= ruleVariable ) )
                    	    {
                    	    otherlv_7=(Token)match(input,16,FOLLOW_11); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getCustomDefaultComponentDefinitionAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalUIDSL.g:3404:5: ( (lv_implicits_8_0= ruleVariable ) )
                    	    // InternalUIDSL.g:3405:6: (lv_implicits_8_0= ruleVariable )
                    	    {
                    	    // InternalUIDSL.g:3405:6: (lv_implicits_8_0= ruleVariable )
                    	    // InternalUIDSL.g:3406:7: lv_implicits_8_0= ruleVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getCustomDefaultComponentDefinitionAccess().getImplicitsVariableParserRuleCall_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_51);
                    	    lv_implicits_8_0=ruleVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCustomDefaultComponentDefinitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"implicits",
                    	    								lv_implicits_8_0,
                    	    								"com.stefanvuckovic.uidsl.UIDSL.Variable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_9, grammarAccess.getCustomDefaultComponentDefinitionAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalUIDSL.g:3429:3: ( (lv_elements_10_0= ruleUIElement ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==RULE_ID||(LA58_0>=30 && LA58_0<=32)||(LA58_0>=49 && LA58_0<=50)) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalUIDSL.g:3430:4: (lv_elements_10_0= ruleUIElement )
            	    {
            	    // InternalUIDSL.g:3430:4: (lv_elements_10_0= ruleUIElement )
            	    // InternalUIDSL.g:3431:5: lv_elements_10_0= ruleUIElement
            	    {

            	    					newCompositeNode(grammarAccess.getCustomDefaultComponentDefinitionAccess().getElementsUIElementParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_30);
            	    lv_elements_10_0=ruleUIElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCustomDefaultComponentDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_10_0,
            	    						"com.stefanvuckovic.uidsl.UIDSL.UIElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

            otherlv_11=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getCustomDefaultComponentDefinitionAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleCustomDefaultComponentDefinition"


    // $ANTLR start "entryRuleConcept"
    // InternalUIDSL.g:3456:1: entryRuleConcept returns [EObject current=null] : iv_ruleConcept= ruleConcept EOF ;
    public final EObject entryRuleConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcept = null;


        try {
            // InternalUIDSL.g:3456:48: (iv_ruleConcept= ruleConcept EOF )
            // InternalUIDSL.g:3457:2: iv_ruleConcept= ruleConcept EOF
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
    // InternalUIDSL.g:3463:1: ruleConcept returns [EObject current=null] : (this_DTOClass_0= ruleDTOClass | this_Enum_1= ruleEnum ) ;
    public final EObject ruleConcept() throws RecognitionException {
        EObject current = null;

        EObject this_DTOClass_0 = null;

        EObject this_Enum_1 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:3469:2: ( (this_DTOClass_0= ruleDTOClass | this_Enum_1= ruleEnum ) )
            // InternalUIDSL.g:3470:2: (this_DTOClass_0= ruleDTOClass | this_Enum_1= ruleEnum )
            {
            // InternalUIDSL.g:3470:2: (this_DTOClass_0= ruleDTOClass | this_Enum_1= ruleEnum )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==54) ) {
                alt59=1;
            }
            else if ( (LA59_0==38) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalUIDSL.g:3471:3: this_DTOClass_0= ruleDTOClass
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
                    // InternalUIDSL.g:3480:3: this_Enum_1= ruleEnum
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
    // InternalUIDSL.g:3492:1: entryRuleDTOClass returns [EObject current=null] : iv_ruleDTOClass= ruleDTOClass EOF ;
    public final EObject entryRuleDTOClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDTOClass = null;


        try {
            // InternalUIDSL.g:3492:49: (iv_ruleDTOClass= ruleDTOClass EOF )
            // InternalUIDSL.g:3493:2: iv_ruleDTOClass= ruleDTOClass EOF
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
    // InternalUIDSL.g:3499:1: ruleDTOClass returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' ) ;
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
            // InternalUIDSL.g:3505:2: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' ) )
            // InternalUIDSL.g:3506:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' )
            {
            // InternalUIDSL.g:3506:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' )
            // InternalUIDSL.g:3507:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDTOClassAccess().getClassKeyword_0());
            		
            // InternalUIDSL.g:3511:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUIDSL.g:3512:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUIDSL.g:3512:4: (lv_name_1_0= RULE_ID )
            // InternalUIDSL.g:3513:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_52); 

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

            // InternalUIDSL.g:3529:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==55) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalUIDSL.g:3530:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,55,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getDTOClassAccess().getExtendsKeyword_2_0());
                    			
                    // InternalUIDSL.g:3534:4: ( (otherlv_3= RULE_ID ) )
                    // InternalUIDSL.g:3535:5: (otherlv_3= RULE_ID )
                    {
                    // InternalUIDSL.g:3535:5: (otherlv_3= RULE_ID )
                    // InternalUIDSL.g:3536:6: otherlv_3= RULE_ID
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
            		
            // InternalUIDSL.g:3552:3: ( (lv_attributes_5_0= ruleAttribute ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==RULE_ID||LA61_0==41||(LA61_0>=58 && LA61_0<=62)||(LA61_0>=73 && LA61_0<=79)) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalUIDSL.g:3553:4: (lv_attributes_5_0= ruleAttribute )
            	    {
            	    // InternalUIDSL.g:3553:4: (lv_attributes_5_0= ruleAttribute )
            	    // InternalUIDSL.g:3554:5: lv_attributes_5_0= ruleAttribute
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
            	    break loop61;
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
    // InternalUIDSL.g:3579:1: entryRuleAttributeOption returns [EObject current=null] : iv_ruleAttributeOption= ruleAttributeOption EOF ;
    public final EObject entryRuleAttributeOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeOption = null;


        try {
            // InternalUIDSL.g:3579:56: (iv_ruleAttributeOption= ruleAttributeOption EOF )
            // InternalUIDSL.g:3580:2: iv_ruleAttributeOption= ruleAttributeOption EOF
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
    // InternalUIDSL.g:3586:1: ruleAttributeOption returns [EObject current=null] : ( ( () otherlv_1= 'representation' ) | ( () otherlv_3= '@id' ) ) ;
    public final EObject ruleAttributeOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalUIDSL.g:3592:2: ( ( ( () otherlv_1= 'representation' ) | ( () otherlv_3= '@id' ) ) )
            // InternalUIDSL.g:3593:2: ( ( () otherlv_1= 'representation' ) | ( () otherlv_3= '@id' ) )
            {
            // InternalUIDSL.g:3593:2: ( ( () otherlv_1= 'representation' ) | ( () otherlv_3= '@id' ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==56) ) {
                alt62=1;
            }
            else if ( (LA62_0==57) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // InternalUIDSL.g:3594:3: ( () otherlv_1= 'representation' )
                    {
                    // InternalUIDSL.g:3594:3: ( () otherlv_1= 'representation' )
                    // InternalUIDSL.g:3595:4: () otherlv_1= 'representation'
                    {
                    // InternalUIDSL.g:3595:4: ()
                    // InternalUIDSL.g:3596:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAttributeOptionAccess().getObjectRepresentationAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,56,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getAttributeOptionAccess().getRepresentationKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUIDSL.g:3608:3: ( () otherlv_3= '@id' )
                    {
                    // InternalUIDSL.g:3608:3: ( () otherlv_3= '@id' )
                    // InternalUIDSL.g:3609:4: () otherlv_3= '@id'
                    {
                    // InternalUIDSL.g:3609:4: ()
                    // InternalUIDSL.g:3610:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAttributeOptionAccess().getIDAttributeAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,57,FOLLOW_2); 

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
    // InternalUIDSL.g:3625:1: entryRuleBasicType returns [EObject current=null] : iv_ruleBasicType= ruleBasicType EOF ;
    public final EObject entryRuleBasicType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicType = null;


        try {
            // InternalUIDSL.g:3625:50: (iv_ruleBasicType= ruleBasicType EOF )
            // InternalUIDSL.g:3626:2: iv_ruleBasicType= ruleBasicType EOF
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
    // InternalUIDSL.g:3632:1: ruleBasicType returns [EObject current=null] : (this_BasicType_0= superBasicType | ( () otherlv_2= 'text' ) | ( () otherlv_4= 'email' ) | ( () otherlv_6= 'password' ) | ( () otherlv_8= 'file' ) | ( () otherlv_10= 'image' ) ) ;
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
            // InternalUIDSL.g:3638:2: ( (this_BasicType_0= superBasicType | ( () otherlv_2= 'text' ) | ( () otherlv_4= 'email' ) | ( () otherlv_6= 'password' ) | ( () otherlv_8= 'file' ) | ( () otherlv_10= 'image' ) ) )
            // InternalUIDSL.g:3639:2: (this_BasicType_0= superBasicType | ( () otherlv_2= 'text' ) | ( () otherlv_4= 'email' ) | ( () otherlv_6= 'password' ) | ( () otherlv_8= 'file' ) | ( () otherlv_10= 'image' ) )
            {
            // InternalUIDSL.g:3639:2: (this_BasicType_0= superBasicType | ( () otherlv_2= 'text' ) | ( () otherlv_4= 'email' ) | ( () otherlv_6= 'password' ) | ( () otherlv_8= 'file' ) | ( () otherlv_10= 'image' ) )
            int alt63=6;
            switch ( input.LA(1) ) {
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
                {
                alt63=1;
                }
                break;
            case 58:
                {
                alt63=2;
                }
                break;
            case 59:
                {
                alt63=3;
                }
                break;
            case 60:
                {
                alt63=4;
                }
                break;
            case 61:
                {
                alt63=5;
                }
                break;
            case 62:
                {
                alt63=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // InternalUIDSL.g:3640:3: this_BasicType_0= superBasicType
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
                    // InternalUIDSL.g:3649:3: ( () otherlv_2= 'text' )
                    {
                    // InternalUIDSL.g:3649:3: ( () otherlv_2= 'text' )
                    // InternalUIDSL.g:3650:4: () otherlv_2= 'text'
                    {
                    // InternalUIDSL.g:3650:4: ()
                    // InternalUIDSL.g:3651:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBasicTypeAccess().getTextTypeAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,58,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getBasicTypeAccess().getTextKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalUIDSL.g:3663:3: ( () otherlv_4= 'email' )
                    {
                    // InternalUIDSL.g:3663:3: ( () otherlv_4= 'email' )
                    // InternalUIDSL.g:3664:4: () otherlv_4= 'email'
                    {
                    // InternalUIDSL.g:3664:4: ()
                    // InternalUIDSL.g:3665:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBasicTypeAccess().getEmailTypeAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,59,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getBasicTypeAccess().getEmailKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalUIDSL.g:3677:3: ( () otherlv_6= 'password' )
                    {
                    // InternalUIDSL.g:3677:3: ( () otherlv_6= 'password' )
                    // InternalUIDSL.g:3678:4: () otherlv_6= 'password'
                    {
                    // InternalUIDSL.g:3678:4: ()
                    // InternalUIDSL.g:3679:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBasicTypeAccess().getPasswordTypeAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_6=(Token)match(input,60,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getBasicTypeAccess().getPasswordKeyword_3_1());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalUIDSL.g:3691:3: ( () otherlv_8= 'file' )
                    {
                    // InternalUIDSL.g:3691:3: ( () otherlv_8= 'file' )
                    // InternalUIDSL.g:3692:4: () otherlv_8= 'file'
                    {
                    // InternalUIDSL.g:3692:4: ()
                    // InternalUIDSL.g:3693:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBasicTypeAccess().getFileTypeAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_8=(Token)match(input,61,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getBasicTypeAccess().getFileKeyword_4_1());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalUIDSL.g:3705:3: ( () otherlv_10= 'image' )
                    {
                    // InternalUIDSL.g:3705:3: ( () otherlv_10= 'image' )
                    // InternalUIDSL.g:3706:4: () otherlv_10= 'image'
                    {
                    // InternalUIDSL.g:3706:4: ()
                    // InternalUIDSL.g:3707:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBasicTypeAccess().getImageTypeAction_5_0(),
                    						current);
                    				

                    }

                    otherlv_10=(Token)match(input,62,FOLLOW_2); 

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
    // InternalUIDSL.g:3722:1: entryRuleEnum returns [EObject current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final EObject entryRuleEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnum = null;


        try {
            // InternalUIDSL.g:3722:45: (iv_ruleEnum= ruleEnum EOF )
            // InternalUIDSL.g:3723:2: iv_ruleEnum= ruleEnum EOF
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
    // InternalUIDSL.g:3729:1: ruleEnum returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_literals_4_0= ruleEnumLiteral ) )+ otherlv_5= '}' ) ;
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
            // InternalUIDSL.g:3735:2: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_literals_4_0= ruleEnumLiteral ) )+ otherlv_5= '}' ) )
            // InternalUIDSL.g:3736:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_literals_4_0= ruleEnumLiteral ) )+ otherlv_5= '}' )
            {
            // InternalUIDSL.g:3736:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_literals_4_0= ruleEnumLiteral ) )+ otherlv_5= '}' )
            // InternalUIDSL.g:3737:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_literals_4_0= ruleEnumLiteral ) )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumAccess().getEnumKeyword_0());
            		
            // InternalUIDSL.g:3741:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUIDSL.g:3742:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUIDSL.g:3742:4: (lv_name_1_0= RULE_ID )
            // InternalUIDSL.g:3743:5: lv_name_1_0= RULE_ID
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
            		
            // InternalUIDSL.g:3763:3: ( (lv_attributes_3_0= ruleAttribute ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==RULE_ID) ) {
                    int LA64_1 = input.LA(2);

                    if ( (LA64_1==RULE_ID) ) {
                        int LA64_4 = input.LA(3);

                        if ( (LA64_4==14||(LA64_4>=56 && LA64_4<=57)) ) {
                            alt64=1;
                        }


                    }


                }
                else if ( (LA64_0==41||(LA64_0>=58 && LA64_0<=62)||(LA64_0>=73 && LA64_0<=79)) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalUIDSL.g:3764:4: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // InternalUIDSL.g:3764:4: (lv_attributes_3_0= ruleAttribute )
            	    // InternalUIDSL.g:3765:5: lv_attributes_3_0= ruleAttribute
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
            	    break loop64;
                }
            } while (true);

            // InternalUIDSL.g:3782:3: ( (lv_literals_4_0= ruleEnumLiteral ) )+
            int cnt65=0;
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==RULE_ID) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalUIDSL.g:3783:4: (lv_literals_4_0= ruleEnumLiteral )
            	    {
            	    // InternalUIDSL.g:3783:4: (lv_literals_4_0= ruleEnumLiteral )
            	    // InternalUIDSL.g:3784:5: lv_literals_4_0= ruleEnumLiteral
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
            	    if ( cnt65 >= 1 ) break loop65;
                        EarlyExitException eee =
                            new EarlyExitException(65, input);
                        throw eee;
                }
                cnt65++;
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
    // InternalUIDSL.g:3809:1: entryRuleEnumLiteral returns [EObject current=null] : iv_ruleEnumLiteral= ruleEnumLiteral EOF ;
    public final EObject entryRuleEnumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumLiteral = null;


        try {
            // InternalUIDSL.g:3809:52: (iv_ruleEnumLiteral= ruleEnumLiteral EOF )
            // InternalUIDSL.g:3810:2: iv_ruleEnumLiteral= ruleEnumLiteral EOF
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
    // InternalUIDSL.g:3816:1: ruleEnumLiteral returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleConstant ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleConstant ) ) )* otherlv_5= ')' )? ) ;
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
            // InternalUIDSL.g:3822:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleConstant ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleConstant ) ) )* otherlv_5= ')' )? ) )
            // InternalUIDSL.g:3823:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleConstant ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleConstant ) ) )* otherlv_5= ')' )? )
            {
            // InternalUIDSL.g:3823:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleConstant ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleConstant ) ) )* otherlv_5= ')' )? )
            // InternalUIDSL.g:3824:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleConstant ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleConstant ) ) )* otherlv_5= ')' )?
            {
            // InternalUIDSL.g:3824:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalUIDSL.g:3825:4: (lv_name_0_0= RULE_ID )
            {
            // InternalUIDSL.g:3825:4: (lv_name_0_0= RULE_ID )
            // InternalUIDSL.g:3826:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_53); 

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

            // InternalUIDSL.g:3842:3: (otherlv_1= '(' ( (lv_params_2_0= ruleConstant ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleConstant ) ) )* otherlv_5= ')' )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==15) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalUIDSL.g:3843:4: otherlv_1= '(' ( (lv_params_2_0= ruleConstant ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleConstant ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_54); 

                    				newLeafNode(otherlv_1, grammarAccess.getEnumLiteralAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalUIDSL.g:3847:4: ( (lv_params_2_0= ruleConstant ) )
                    // InternalUIDSL.g:3848:5: (lv_params_2_0= ruleConstant )
                    {
                    // InternalUIDSL.g:3848:5: (lv_params_2_0= ruleConstant )
                    // InternalUIDSL.g:3849:6: lv_params_2_0= ruleConstant
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

                    // InternalUIDSL.g:3866:4: (otherlv_3= ',' ( (lv_params_4_0= ruleConstant ) ) )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==16) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // InternalUIDSL.g:3867:5: otherlv_3= ',' ( (lv_params_4_0= ruleConstant ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_54); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getEnumLiteralAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalUIDSL.g:3871:5: ( (lv_params_4_0= ruleConstant ) )
                    	    // InternalUIDSL.g:3872:6: (lv_params_4_0= ruleConstant )
                    	    {
                    	    // InternalUIDSL.g:3872:6: (lv_params_4_0= ruleConstant )
                    	    // InternalUIDSL.g:3873:7: lv_params_4_0= ruleConstant
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
                    	    break loop66;
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
    // InternalUIDSL.g:3900:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // InternalUIDSL.g:3900:49: (iv_ruleConstant= ruleConstant EOF )
            // InternalUIDSL.g:3901:2: iv_ruleConstant= ruleConstant EOF
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
    // InternalUIDSL.g:3907:1: ruleConstant returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) otherlv_4= 'L' ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) ) ) | ( () ( (lv_day_10_0= RULE_INT ) ) otherlv_11= '/' ( (lv_month_12_0= RULE_INT ) ) otherlv_13= '/' ( (lv_year_14_0= RULE_INT ) ) ) | ( () ( (lv_value_16_0= ruleDecimal ) ) ) | ( () otherlv_18= 'null' ) ) ;
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
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_value_16_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:3913:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) otherlv_4= 'L' ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) ) ) | ( () ( (lv_day_10_0= RULE_INT ) ) otherlv_11= '/' ( (lv_month_12_0= RULE_INT ) ) otherlv_13= '/' ( (lv_year_14_0= RULE_INT ) ) ) | ( () ( (lv_value_16_0= ruleDecimal ) ) ) | ( () otherlv_18= 'null' ) ) )
            // InternalUIDSL.g:3914:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) otherlv_4= 'L' ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) ) ) | ( () ( (lv_day_10_0= RULE_INT ) ) otherlv_11= '/' ( (lv_month_12_0= RULE_INT ) ) otherlv_13= '/' ( (lv_year_14_0= RULE_INT ) ) ) | ( () ( (lv_value_16_0= ruleDecimal ) ) ) | ( () otherlv_18= 'null' ) )
            {
            // InternalUIDSL.g:3914:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) otherlv_4= 'L' ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) ) ) | ( () ( (lv_day_10_0= RULE_INT ) ) otherlv_11= '/' ( (lv_month_12_0= RULE_INT ) ) otherlv_13= '/' ( (lv_year_14_0= RULE_INT ) ) ) | ( () ( (lv_value_16_0= ruleDecimal ) ) ) | ( () otherlv_18= 'null' ) )
            int alt69=7;
            alt69 = dfa69.predict(input);
            switch (alt69) {
                case 1 :
                    // InternalUIDSL.g:3915:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalUIDSL.g:3915:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalUIDSL.g:3916:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalUIDSL.g:3916:4: ()
                    // InternalUIDSL.g:3917:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstantAccess().getIntConstantAction_0_0(),
                    						current);
                    				

                    }

                    // InternalUIDSL.g:3923:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalUIDSL.g:3924:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalUIDSL.g:3924:5: (lv_value_1_0= RULE_INT )
                    // InternalUIDSL.g:3925:6: lv_value_1_0= RULE_INT
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
                    // InternalUIDSL.g:3943:3: ( () ( (lv_value_3_0= RULE_INT ) ) otherlv_4= 'L' )
                    {
                    // InternalUIDSL.g:3943:3: ( () ( (lv_value_3_0= RULE_INT ) ) otherlv_4= 'L' )
                    // InternalUIDSL.g:3944:4: () ( (lv_value_3_0= RULE_INT ) ) otherlv_4= 'L'
                    {
                    // InternalUIDSL.g:3944:4: ()
                    // InternalUIDSL.g:3945:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstantAccess().getLongConstantAction_1_0(),
                    						current);
                    				

                    }

                    // InternalUIDSL.g:3951:4: ( (lv_value_3_0= RULE_INT ) )
                    // InternalUIDSL.g:3952:5: (lv_value_3_0= RULE_INT )
                    {
                    // InternalUIDSL.g:3952:5: (lv_value_3_0= RULE_INT )
                    // InternalUIDSL.g:3953:6: lv_value_3_0= RULE_INT
                    {
                    lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_55); 

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

                    otherlv_4=(Token)match(input,63,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getConstantAccess().getLKeyword_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalUIDSL.g:3975:3: ( () ( (lv_value_6_0= RULE_STRING ) ) )
                    {
                    // InternalUIDSL.g:3975:3: ( () ( (lv_value_6_0= RULE_STRING ) ) )
                    // InternalUIDSL.g:3976:4: () ( (lv_value_6_0= RULE_STRING ) )
                    {
                    // InternalUIDSL.g:3976:4: ()
                    // InternalUIDSL.g:3977:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstantAccess().getStringConstantAction_2_0(),
                    						current);
                    				

                    }

                    // InternalUIDSL.g:3983:4: ( (lv_value_6_0= RULE_STRING ) )
                    // InternalUIDSL.g:3984:5: (lv_value_6_0= RULE_STRING )
                    {
                    // InternalUIDSL.g:3984:5: (lv_value_6_0= RULE_STRING )
                    // InternalUIDSL.g:3985:6: lv_value_6_0= RULE_STRING
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
                    // InternalUIDSL.g:4003:3: ( () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) ) )
                    {
                    // InternalUIDSL.g:4003:3: ( () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) ) )
                    // InternalUIDSL.g:4004:4: () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) )
                    {
                    // InternalUIDSL.g:4004:4: ()
                    // InternalUIDSL.g:4005:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstantAccess().getBoolConstantAction_3_0(),
                    						current);
                    				

                    }

                    // InternalUIDSL.g:4011:4: ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) )
                    // InternalUIDSL.g:4012:5: ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) )
                    {
                    // InternalUIDSL.g:4012:5: ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) )
                    // InternalUIDSL.g:4013:6: (lv_value_8_1= 'true' | lv_value_8_2= 'false' )
                    {
                    // InternalUIDSL.g:4013:6: (lv_value_8_1= 'true' | lv_value_8_2= 'false' )
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==64) ) {
                        alt68=1;
                    }
                    else if ( (LA68_0==65) ) {
                        alt68=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 68, 0, input);

                        throw nvae;
                    }
                    switch (alt68) {
                        case 1 :
                            // InternalUIDSL.g:4014:7: lv_value_8_1= 'true'
                            {
                            lv_value_8_1=(Token)match(input,64,FOLLOW_2); 

                            							newLeafNode(lv_value_8_1, grammarAccess.getConstantAccess().getValueTrueKeyword_3_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConstantRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_8_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalUIDSL.g:4025:7: lv_value_8_2= 'false'
                            {
                            lv_value_8_2=(Token)match(input,65,FOLLOW_2); 

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
                    // InternalUIDSL.g:4040:3: ( () ( (lv_day_10_0= RULE_INT ) ) otherlv_11= '/' ( (lv_month_12_0= RULE_INT ) ) otherlv_13= '/' ( (lv_year_14_0= RULE_INT ) ) )
                    {
                    // InternalUIDSL.g:4040:3: ( () ( (lv_day_10_0= RULE_INT ) ) otherlv_11= '/' ( (lv_month_12_0= RULE_INT ) ) otherlv_13= '/' ( (lv_year_14_0= RULE_INT ) ) )
                    // InternalUIDSL.g:4041:4: () ( (lv_day_10_0= RULE_INT ) ) otherlv_11= '/' ( (lv_month_12_0= RULE_INT ) ) otherlv_13= '/' ( (lv_year_14_0= RULE_INT ) )
                    {
                    // InternalUIDSL.g:4041:4: ()
                    // InternalUIDSL.g:4042:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstantAccess().getDateConstantAction_4_0(),
                    						current);
                    				

                    }

                    // InternalUIDSL.g:4048:4: ( (lv_day_10_0= RULE_INT ) )
                    // InternalUIDSL.g:4049:5: (lv_day_10_0= RULE_INT )
                    {
                    // InternalUIDSL.g:4049:5: (lv_day_10_0= RULE_INT )
                    // InternalUIDSL.g:4050:6: lv_day_10_0= RULE_INT
                    {
                    lv_day_10_0=(Token)match(input,RULE_INT,FOLLOW_56); 

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

                    otherlv_11=(Token)match(input,66,FOLLOW_57); 

                    				newLeafNode(otherlv_11, grammarAccess.getConstantAccess().getSolidusKeyword_4_2());
                    			
                    // InternalUIDSL.g:4070:4: ( (lv_month_12_0= RULE_INT ) )
                    // InternalUIDSL.g:4071:5: (lv_month_12_0= RULE_INT )
                    {
                    // InternalUIDSL.g:4071:5: (lv_month_12_0= RULE_INT )
                    // InternalUIDSL.g:4072:6: lv_month_12_0= RULE_INT
                    {
                    lv_month_12_0=(Token)match(input,RULE_INT,FOLLOW_56); 

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

                    otherlv_13=(Token)match(input,66,FOLLOW_57); 

                    				newLeafNode(otherlv_13, grammarAccess.getConstantAccess().getSolidusKeyword_4_4());
                    			
                    // InternalUIDSL.g:4092:4: ( (lv_year_14_0= RULE_INT ) )
                    // InternalUIDSL.g:4093:5: (lv_year_14_0= RULE_INT )
                    {
                    // InternalUIDSL.g:4093:5: (lv_year_14_0= RULE_INT )
                    // InternalUIDSL.g:4094:6: lv_year_14_0= RULE_INT
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
                    // InternalUIDSL.g:4112:3: ( () ( (lv_value_16_0= ruleDecimal ) ) )
                    {
                    // InternalUIDSL.g:4112:3: ( () ( (lv_value_16_0= ruleDecimal ) ) )
                    // InternalUIDSL.g:4113:4: () ( (lv_value_16_0= ruleDecimal ) )
                    {
                    // InternalUIDSL.g:4113:4: ()
                    // InternalUIDSL.g:4114:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstantAccess().getDecimalConstantAction_5_0(),
                    						current);
                    				

                    }

                    // InternalUIDSL.g:4120:4: ( (lv_value_16_0= ruleDecimal ) )
                    // InternalUIDSL.g:4121:5: (lv_value_16_0= ruleDecimal )
                    {
                    // InternalUIDSL.g:4121:5: (lv_value_16_0= ruleDecimal )
                    // InternalUIDSL.g:4122:6: lv_value_16_0= ruleDecimal
                    {

                    						newCompositeNode(grammarAccess.getConstantAccess().getValueDecimalParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_16_0=ruleDecimal();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstantRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_16_0,
                    							"com.stefanvuckovic.domainmodel.DomainModel.Decimal");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalUIDSL.g:4141:3: ( () otherlv_18= 'null' )
                    {
                    // InternalUIDSL.g:4141:3: ( () otherlv_18= 'null' )
                    // InternalUIDSL.g:4142:4: () otherlv_18= 'null'
                    {
                    // InternalUIDSL.g:4142:4: ()
                    // InternalUIDSL.g:4143:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstantAccess().getNullAction_6_0(),
                    						current);
                    				

                    }

                    otherlv_18=(Token)match(input,67,FOLLOW_2); 

                    				newLeafNode(otherlv_18, grammarAccess.getConstantAccess().getNullKeyword_6_1());
                    			

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
    // InternalUIDSL.g:4158:1: entryRuleEntityOption returns [EObject current=null] : iv_ruleEntityOption= ruleEntityOption EOF ;
    public final EObject entryRuleEntityOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityOption = null;


        try {
            // InternalUIDSL.g:4158:53: (iv_ruleEntityOption= ruleEntityOption EOF )
            // InternalUIDSL.g:4159:2: iv_ruleEntityOption= ruleEntityOption EOF
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
    // InternalUIDSL.g:4165:1: ruleEntityOption returns [EObject current=null] : ( ( () ( (lv_deleteByFlag_1_0= 'deleteByFlag' ) ) ) | ( () otherlv_3= 'inheritance' otherlv_4= '=' ( (lv_inheritanceMapping_5_0= ruleInheritanceMappingType ) ) ) ) ;
    public final EObject ruleEntityOption() throws RecognitionException {
        EObject current = null;

        Token lv_deleteByFlag_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_inheritanceMapping_5_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:4171:2: ( ( ( () ( (lv_deleteByFlag_1_0= 'deleteByFlag' ) ) ) | ( () otherlv_3= 'inheritance' otherlv_4= '=' ( (lv_inheritanceMapping_5_0= ruleInheritanceMappingType ) ) ) ) )
            // InternalUIDSL.g:4172:2: ( ( () ( (lv_deleteByFlag_1_0= 'deleteByFlag' ) ) ) | ( () otherlv_3= 'inheritance' otherlv_4= '=' ( (lv_inheritanceMapping_5_0= ruleInheritanceMappingType ) ) ) )
            {
            // InternalUIDSL.g:4172:2: ( ( () ( (lv_deleteByFlag_1_0= 'deleteByFlag' ) ) ) | ( () otherlv_3= 'inheritance' otherlv_4= '=' ( (lv_inheritanceMapping_5_0= ruleInheritanceMappingType ) ) ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==68) ) {
                alt70=1;
            }
            else if ( (LA70_0==69) ) {
                alt70=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // InternalUIDSL.g:4173:3: ( () ( (lv_deleteByFlag_1_0= 'deleteByFlag' ) ) )
                    {
                    // InternalUIDSL.g:4173:3: ( () ( (lv_deleteByFlag_1_0= 'deleteByFlag' ) ) )
                    // InternalUIDSL.g:4174:4: () ( (lv_deleteByFlag_1_0= 'deleteByFlag' ) )
                    {
                    // InternalUIDSL.g:4174:4: ()
                    // InternalUIDSL.g:4175:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEntityOptionAccess().getEntityDeleteOptionAction_0_0(),
                    						current);
                    				

                    }

                    // InternalUIDSL.g:4181:4: ( (lv_deleteByFlag_1_0= 'deleteByFlag' ) )
                    // InternalUIDSL.g:4182:5: (lv_deleteByFlag_1_0= 'deleteByFlag' )
                    {
                    // InternalUIDSL.g:4182:5: (lv_deleteByFlag_1_0= 'deleteByFlag' )
                    // InternalUIDSL.g:4183:6: lv_deleteByFlag_1_0= 'deleteByFlag'
                    {
                    lv_deleteByFlag_1_0=(Token)match(input,68,FOLLOW_2); 

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
                    // InternalUIDSL.g:4197:3: ( () otherlv_3= 'inheritance' otherlv_4= '=' ( (lv_inheritanceMapping_5_0= ruleInheritanceMappingType ) ) )
                    {
                    // InternalUIDSL.g:4197:3: ( () otherlv_3= 'inheritance' otherlv_4= '=' ( (lv_inheritanceMapping_5_0= ruleInheritanceMappingType ) ) )
                    // InternalUIDSL.g:4198:4: () otherlv_3= 'inheritance' otherlv_4= '=' ( (lv_inheritanceMapping_5_0= ruleInheritanceMappingType ) )
                    {
                    // InternalUIDSL.g:4198:4: ()
                    // InternalUIDSL.g:4199:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEntityOptionAccess().getInheritanceMappingOptionAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,69,FOLLOW_21); 

                    				newLeafNode(otherlv_3, grammarAccess.getEntityOptionAccess().getInheritanceKeyword_1_1());
                    			
                    otherlv_4=(Token)match(input,26,FOLLOW_58); 

                    				newLeafNode(otherlv_4, grammarAccess.getEntityOptionAccess().getEqualsSignKeyword_1_2());
                    			
                    // InternalUIDSL.g:4213:4: ( (lv_inheritanceMapping_5_0= ruleInheritanceMappingType ) )
                    // InternalUIDSL.g:4214:5: (lv_inheritanceMapping_5_0= ruleInheritanceMappingType )
                    {
                    // InternalUIDSL.g:4214:5: (lv_inheritanceMapping_5_0= ruleInheritanceMappingType )
                    // InternalUIDSL.g:4215:6: lv_inheritanceMapping_5_0= ruleInheritanceMappingType
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
    // InternalUIDSL.g:4237:1: entryRuleInheritanceMappingType returns [EObject current=null] : iv_ruleInheritanceMappingType= ruleInheritanceMappingType EOF ;
    public final EObject entryRuleInheritanceMappingType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInheritanceMappingType = null;


        try {
            // InternalUIDSL.g:4237:63: (iv_ruleInheritanceMappingType= ruleInheritanceMappingType EOF )
            // InternalUIDSL.g:4238:2: iv_ruleInheritanceMappingType= ruleInheritanceMappingType EOF
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
    // InternalUIDSL.g:4244:1: ruleInheritanceMappingType returns [EObject current=null] : ( ( (lv_type_0_1= 'SINGLE_TABLE' | lv_type_0_2= 'TABLE_PER_CONCRETE_CLASS' | lv_type_0_3= 'TABLE_PER_CLASS' ) ) ) ;
    public final EObject ruleInheritanceMappingType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;


        	enterRule();

        try {
            // InternalUIDSL.g:4250:2: ( ( ( (lv_type_0_1= 'SINGLE_TABLE' | lv_type_0_2= 'TABLE_PER_CONCRETE_CLASS' | lv_type_0_3= 'TABLE_PER_CLASS' ) ) ) )
            // InternalUIDSL.g:4251:2: ( ( (lv_type_0_1= 'SINGLE_TABLE' | lv_type_0_2= 'TABLE_PER_CONCRETE_CLASS' | lv_type_0_3= 'TABLE_PER_CLASS' ) ) )
            {
            // InternalUIDSL.g:4251:2: ( ( (lv_type_0_1= 'SINGLE_TABLE' | lv_type_0_2= 'TABLE_PER_CONCRETE_CLASS' | lv_type_0_3= 'TABLE_PER_CLASS' ) ) )
            // InternalUIDSL.g:4252:3: ( (lv_type_0_1= 'SINGLE_TABLE' | lv_type_0_2= 'TABLE_PER_CONCRETE_CLASS' | lv_type_0_3= 'TABLE_PER_CLASS' ) )
            {
            // InternalUIDSL.g:4252:3: ( (lv_type_0_1= 'SINGLE_TABLE' | lv_type_0_2= 'TABLE_PER_CONCRETE_CLASS' | lv_type_0_3= 'TABLE_PER_CLASS' ) )
            // InternalUIDSL.g:4253:4: (lv_type_0_1= 'SINGLE_TABLE' | lv_type_0_2= 'TABLE_PER_CONCRETE_CLASS' | lv_type_0_3= 'TABLE_PER_CLASS' )
            {
            // InternalUIDSL.g:4253:4: (lv_type_0_1= 'SINGLE_TABLE' | lv_type_0_2= 'TABLE_PER_CONCRETE_CLASS' | lv_type_0_3= 'TABLE_PER_CLASS' )
            int alt71=3;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // InternalUIDSL.g:4254:5: lv_type_0_1= 'SINGLE_TABLE'
                    {
                    lv_type_0_1=(Token)match(input,70,FOLLOW_2); 

                    					newLeafNode(lv_type_0_1, grammarAccess.getInheritanceMappingTypeAccess().getTypeSINGLE_TABLEKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInheritanceMappingTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalUIDSL.g:4265:5: lv_type_0_2= 'TABLE_PER_CONCRETE_CLASS'
                    {
                    lv_type_0_2=(Token)match(input,71,FOLLOW_2); 

                    					newLeafNode(lv_type_0_2, grammarAccess.getInheritanceMappingTypeAccess().getTypeTABLE_PER_CONCRETE_CLASSKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInheritanceMappingTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalUIDSL.g:4276:5: lv_type_0_3= 'TABLE_PER_CLASS'
                    {
                    lv_type_0_3=(Token)match(input,72,FOLLOW_2); 

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
    // InternalUIDSL.g:4292:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalUIDSL.g:4292:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalUIDSL.g:4293:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalUIDSL.g:4299:1: ruleAttribute returns [EObject current=null] : ( ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_options_2_0= ruleAttributeOption ) ) (otherlv_3= ',' ( (lv_options_4_0= ruleAttributeOption ) ) )* )? otherlv_5= ';' ) ;
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
            // InternalUIDSL.g:4305:2: ( ( ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_options_2_0= ruleAttributeOption ) ) (otherlv_3= ',' ( (lv_options_4_0= ruleAttributeOption ) ) )* )? otherlv_5= ';' ) )
            // InternalUIDSL.g:4306:2: ( ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_options_2_0= ruleAttributeOption ) ) (otherlv_3= ',' ( (lv_options_4_0= ruleAttributeOption ) ) )* )? otherlv_5= ';' )
            {
            // InternalUIDSL.g:4306:2: ( ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_options_2_0= ruleAttributeOption ) ) (otherlv_3= ',' ( (lv_options_4_0= ruleAttributeOption ) ) )* )? otherlv_5= ';' )
            // InternalUIDSL.g:4307:3: ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_options_2_0= ruleAttributeOption ) ) (otherlv_3= ',' ( (lv_options_4_0= ruleAttributeOption ) ) )* )? otherlv_5= ';'
            {
            // InternalUIDSL.g:4307:3: ( (lv_type_0_0= ruleAttributeType ) )
            // InternalUIDSL.g:4308:4: (lv_type_0_0= ruleAttributeType )
            {
            // InternalUIDSL.g:4308:4: (lv_type_0_0= ruleAttributeType )
            // InternalUIDSL.g:4309:5: lv_type_0_0= ruleAttributeType
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

            // InternalUIDSL.g:4326:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUIDSL.g:4327:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUIDSL.g:4327:4: (lv_name_1_0= RULE_ID )
            // InternalUIDSL.g:4328:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_59); 

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

            // InternalUIDSL.g:4344:3: ( ( (lv_options_2_0= ruleAttributeOption ) ) (otherlv_3= ',' ( (lv_options_4_0= ruleAttributeOption ) ) )* )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( ((LA73_0>=56 && LA73_0<=57)) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalUIDSL.g:4345:4: ( (lv_options_2_0= ruleAttributeOption ) ) (otherlv_3= ',' ( (lv_options_4_0= ruleAttributeOption ) ) )*
                    {
                    // InternalUIDSL.g:4345:4: ( (lv_options_2_0= ruleAttributeOption ) )
                    // InternalUIDSL.g:4346:5: (lv_options_2_0= ruleAttributeOption )
                    {
                    // InternalUIDSL.g:4346:5: (lv_options_2_0= ruleAttributeOption )
                    // InternalUIDSL.g:4347:6: lv_options_2_0= ruleAttributeOption
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getOptionsAttributeOptionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_60);
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

                    // InternalUIDSL.g:4364:4: (otherlv_3= ',' ( (lv_options_4_0= ruleAttributeOption ) ) )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==16) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // InternalUIDSL.g:4365:5: otherlv_3= ',' ( (lv_options_4_0= ruleAttributeOption ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_61); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalUIDSL.g:4369:5: ( (lv_options_4_0= ruleAttributeOption ) )
                    	    // InternalUIDSL.g:4370:6: (lv_options_4_0= ruleAttributeOption )
                    	    {
                    	    // InternalUIDSL.g:4370:6: (lv_options_4_0= ruleAttributeOption )
                    	    // InternalUIDSL.g:4371:7: lv_options_4_0= ruleAttributeOption
                    	    {

                    	    							newCompositeNode(grammarAccess.getAttributeAccess().getOptionsAttributeOptionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_60);
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
                    	    break loop72;
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
    // InternalUIDSL.g:4398:1: entrySuperAttributeType returns [EObject current=null] : iv_superAttributeType= superAttributeType EOF ;
    public final EObject entrySuperAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_superAttributeType = null;


        try {
            // InternalUIDSL.g:4398:55: (iv_superAttributeType= superAttributeType EOF )
            // InternalUIDSL.g:4399:2: iv_superAttributeType= superAttributeType EOF
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
    // InternalUIDSL.g:4405:1: superAttributeType returns [EObject current=null] : (this_SingleType_0= ruleSingleType | this_CollectionType_1= ruleCollectionType ) ;
    public final EObject superAttributeType() throws RecognitionException {
        EObject current = null;

        EObject this_SingleType_0 = null;

        EObject this_CollectionType_1 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:4411:2: ( (this_SingleType_0= ruleSingleType | this_CollectionType_1= ruleCollectionType ) )
            // InternalUIDSL.g:4412:2: (this_SingleType_0= ruleSingleType | this_CollectionType_1= ruleCollectionType )
            {
            // InternalUIDSL.g:4412:2: (this_SingleType_0= ruleSingleType | this_CollectionType_1= ruleCollectionType )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==RULE_ID||(LA74_0>=58 && LA74_0<=62)||(LA74_0>=73 && LA74_0<=78)) ) {
                alt74=1;
            }
            else if ( (LA74_0==79) ) {
                alt74=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // InternalUIDSL.g:4413:3: this_SingleType_0= ruleSingleType
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
                    // InternalUIDSL.g:4422:3: this_CollectionType_1= ruleCollectionType
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
    // InternalUIDSL.g:4434:1: entryRuleSingleType returns [EObject current=null] : iv_ruleSingleType= ruleSingleType EOF ;
    public final EObject entryRuleSingleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleType = null;


        try {
            // InternalUIDSL.g:4434:51: (iv_ruleSingleType= ruleSingleType EOF )
            // InternalUIDSL.g:4435:2: iv_ruleSingleType= ruleSingleType EOF
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
    // InternalUIDSL.g:4441:1: ruleSingleType returns [EObject current=null] : (this_BasicType_0= ruleBasicType | this_RefType_1= ruleRefType ) ;
    public final EObject ruleSingleType() throws RecognitionException {
        EObject current = null;

        EObject this_BasicType_0 = null;

        EObject this_RefType_1 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:4447:2: ( (this_BasicType_0= ruleBasicType | this_RefType_1= ruleRefType ) )
            // InternalUIDSL.g:4448:2: (this_BasicType_0= ruleBasicType | this_RefType_1= ruleRefType )
            {
            // InternalUIDSL.g:4448:2: (this_BasicType_0= ruleBasicType | this_RefType_1= ruleRefType )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( ((LA75_0>=58 && LA75_0<=62)||(LA75_0>=73 && LA75_0<=78)) ) {
                alt75=1;
            }
            else if ( (LA75_0==RULE_ID) ) {
                alt75=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // InternalUIDSL.g:4449:3: this_BasicType_0= ruleBasicType
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
                    // InternalUIDSL.g:4458:3: this_RefType_1= ruleRefType
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
    // InternalUIDSL.g:4470:1: entrySuperBasicType returns [EObject current=null] : iv_superBasicType= superBasicType EOF ;
    public final EObject entrySuperBasicType() throws RecognitionException {
        EObject current = null;

        EObject iv_superBasicType = null;


        try {
            // InternalUIDSL.g:4470:51: (iv_superBasicType= superBasicType EOF )
            // InternalUIDSL.g:4471:2: iv_superBasicType= superBasicType EOF
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
    // InternalUIDSL.g:4477:1: superBasicType returns [EObject current=null] : ( ( () otherlv_1= 'string' ) | ( () otherlv_3= 'int' ) | ( () otherlv_5= 'long' ) | ( () otherlv_7= 'boolean' ) | ( () otherlv_9= 'date' ) | ( () otherlv_11= 'decimal' ) ) ;
    public final EObject superBasicType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalUIDSL.g:4483:2: ( ( ( () otherlv_1= 'string' ) | ( () otherlv_3= 'int' ) | ( () otherlv_5= 'long' ) | ( () otherlv_7= 'boolean' ) | ( () otherlv_9= 'date' ) | ( () otherlv_11= 'decimal' ) ) )
            // InternalUIDSL.g:4484:2: ( ( () otherlv_1= 'string' ) | ( () otherlv_3= 'int' ) | ( () otherlv_5= 'long' ) | ( () otherlv_7= 'boolean' ) | ( () otherlv_9= 'date' ) | ( () otherlv_11= 'decimal' ) )
            {
            // InternalUIDSL.g:4484:2: ( ( () otherlv_1= 'string' ) | ( () otherlv_3= 'int' ) | ( () otherlv_5= 'long' ) | ( () otherlv_7= 'boolean' ) | ( () otherlv_9= 'date' ) | ( () otherlv_11= 'decimal' ) )
            int alt76=6;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt76=1;
                }
                break;
            case 74:
                {
                alt76=2;
                }
                break;
            case 75:
                {
                alt76=3;
                }
                break;
            case 76:
                {
                alt76=4;
                }
                break;
            case 77:
                {
                alt76=5;
                }
                break;
            case 78:
                {
                alt76=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // InternalUIDSL.g:4485:3: ( () otherlv_1= 'string' )
                    {
                    // InternalUIDSL.g:4485:3: ( () otherlv_1= 'string' )
                    // InternalUIDSL.g:4486:4: () otherlv_1= 'string'
                    {
                    // InternalUIDSL.g:4486:4: ()
                    // InternalUIDSL.g:4487:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDomainModelBasicTypeAccess().getStringTypeAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,73,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getDomainModelBasicTypeAccess().getStringKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUIDSL.g:4499:3: ( () otherlv_3= 'int' )
                    {
                    // InternalUIDSL.g:4499:3: ( () otherlv_3= 'int' )
                    // InternalUIDSL.g:4500:4: () otherlv_3= 'int'
                    {
                    // InternalUIDSL.g:4500:4: ()
                    // InternalUIDSL.g:4501:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDomainModelBasicTypeAccess().getIntTypeAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,74,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getDomainModelBasicTypeAccess().getIntKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalUIDSL.g:4513:3: ( () otherlv_5= 'long' )
                    {
                    // InternalUIDSL.g:4513:3: ( () otherlv_5= 'long' )
                    // InternalUIDSL.g:4514:4: () otherlv_5= 'long'
                    {
                    // InternalUIDSL.g:4514:4: ()
                    // InternalUIDSL.g:4515:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDomainModelBasicTypeAccess().getLongTypeAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,75,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getDomainModelBasicTypeAccess().getLongKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalUIDSL.g:4527:3: ( () otherlv_7= 'boolean' )
                    {
                    // InternalUIDSL.g:4527:3: ( () otherlv_7= 'boolean' )
                    // InternalUIDSL.g:4528:4: () otherlv_7= 'boolean'
                    {
                    // InternalUIDSL.g:4528:4: ()
                    // InternalUIDSL.g:4529:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDomainModelBasicTypeAccess().getBoolTypeAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,76,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getDomainModelBasicTypeAccess().getBooleanKeyword_3_1());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalUIDSL.g:4541:3: ( () otherlv_9= 'date' )
                    {
                    // InternalUIDSL.g:4541:3: ( () otherlv_9= 'date' )
                    // InternalUIDSL.g:4542:4: () otherlv_9= 'date'
                    {
                    // InternalUIDSL.g:4542:4: ()
                    // InternalUIDSL.g:4543:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDomainModelBasicTypeAccess().getDateTypeAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_9=(Token)match(input,77,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getDomainModelBasicTypeAccess().getDateKeyword_4_1());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalUIDSL.g:4555:3: ( () otherlv_11= 'decimal' )
                    {
                    // InternalUIDSL.g:4555:3: ( () otherlv_11= 'decimal' )
                    // InternalUIDSL.g:4556:4: () otherlv_11= 'decimal'
                    {
                    // InternalUIDSL.g:4556:4: ()
                    // InternalUIDSL.g:4557:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDomainModelBasicTypeAccess().getDecimalTypeAction_5_0(),
                    						current);
                    				

                    }

                    otherlv_11=(Token)match(input,78,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getDomainModelBasicTypeAccess().getDecimalKeyword_5_1());
                    			

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
    // InternalUIDSL.g:4572:1: entryRuleRefType returns [EObject current=null] : iv_ruleRefType= ruleRefType EOF ;
    public final EObject entryRuleRefType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefType = null;


        try {
            // InternalUIDSL.g:4572:48: (iv_ruleRefType= ruleRefType EOF )
            // InternalUIDSL.g:4573:2: iv_ruleRefType= ruleRefType EOF
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
    // InternalUIDSL.g:4579:1: ruleRefType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleRefType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalUIDSL.g:4585:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalUIDSL.g:4586:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalUIDSL.g:4586:2: ( (otherlv_0= RULE_ID ) )
            // InternalUIDSL.g:4587:3: (otherlv_0= RULE_ID )
            {
            // InternalUIDSL.g:4587:3: (otherlv_0= RULE_ID )
            // InternalUIDSL.g:4588:4: otherlv_0= RULE_ID
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
    // InternalUIDSL.g:4602:1: entryRuleCollectionType returns [EObject current=null] : iv_ruleCollectionType= ruleCollectionType EOF ;
    public final EObject entryRuleCollectionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionType = null;


        try {
            // InternalUIDSL.g:4602:55: (iv_ruleCollectionType= ruleCollectionType EOF )
            // InternalUIDSL.g:4603:2: iv_ruleCollectionType= ruleCollectionType EOF
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
    // InternalUIDSL.g:4609:1: ruleCollectionType returns [EObject current=null] : (otherlv_0= 'List' otherlv_1= '<' ( (lv_ofType_2_0= ruleSingleType ) ) otherlv_3= '>' ) ;
    public final EObject ruleCollectionType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ofType_2_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:4615:2: ( (otherlv_0= 'List' otherlv_1= '<' ( (lv_ofType_2_0= ruleSingleType ) ) otherlv_3= '>' ) )
            // InternalUIDSL.g:4616:2: (otherlv_0= 'List' otherlv_1= '<' ( (lv_ofType_2_0= ruleSingleType ) ) otherlv_3= '>' )
            {
            // InternalUIDSL.g:4616:2: (otherlv_0= 'List' otherlv_1= '<' ( (lv_ofType_2_0= ruleSingleType ) ) otherlv_3= '>' )
            // InternalUIDSL.g:4617:3: otherlv_0= 'List' otherlv_1= '<' ( (lv_ofType_2_0= ruleSingleType ) ) otherlv_3= '>'
            {
            otherlv_0=(Token)match(input,79,FOLLOW_62); 

            			newLeafNode(otherlv_0, grammarAccess.getCollectionTypeAccess().getListKeyword_0());
            		
            otherlv_1=(Token)match(input,80,FOLLOW_63); 

            			newLeafNode(otherlv_1, grammarAccess.getCollectionTypeAccess().getLessThanSignKeyword_1());
            		
            // InternalUIDSL.g:4625:3: ( (lv_ofType_2_0= ruleSingleType ) )
            // InternalUIDSL.g:4626:4: (lv_ofType_2_0= ruleSingleType )
            {
            // InternalUIDSL.g:4626:4: (lv_ofType_2_0= ruleSingleType )
            // InternalUIDSL.g:4627:5: lv_ofType_2_0= ruleSingleType
            {

            					newCompositeNode(grammarAccess.getCollectionTypeAccess().getOfTypeSingleTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_64);
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

            otherlv_3=(Token)match(input,81,FOLLOW_2); 

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
    // InternalUIDSL.g:4652:1: entrySuperSelectionMember returns [EObject current=null] : iv_superSelectionMember= superSelectionMember EOF ;
    public final EObject entrySuperSelectionMember() throws RecognitionException {
        EObject current = null;

        EObject iv_superSelectionMember = null;


        try {
            // InternalUIDSL.g:4652:57: (iv_superSelectionMember= superSelectionMember EOF )
            // InternalUIDSL.g:4653:2: iv_superSelectionMember= superSelectionMember EOF
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
    // InternalUIDSL.g:4659:1: superSelectionMember returns [EObject current=null] : this_Attribute_0= ruleAttribute ;
    public final EObject superSelectionMember() throws RecognitionException {
        EObject current = null;

        EObject this_Attribute_0 = null;



        	enterRule();

        try {
            // InternalUIDSL.g:4665:2: (this_Attribute_0= ruleAttribute )
            // InternalUIDSL.g:4666:2: this_Attribute_0= ruleAttribute
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


    // $ANTLR start "entryRuleDecimal"
    // InternalUIDSL.g:4677:1: entryRuleDecimal returns [String current=null] : iv_ruleDecimal= ruleDecimal EOF ;
    public final String entryRuleDecimal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDecimal = null;


        try {
            // InternalUIDSL.g:4677:47: (iv_ruleDecimal= ruleDecimal EOF )
            // InternalUIDSL.g:4678:2: iv_ruleDecimal= ruleDecimal EOF
            {
             newCompositeNode(grammarAccess.getDecimalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDecimal=ruleDecimal();

            state._fsp--;

             current =iv_ruleDecimal.getText(); 
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
    // $ANTLR end "entryRuleDecimal"


    // $ANTLR start "ruleDecimal"
    // InternalUIDSL.g:4684:1: ruleDecimal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDecimal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalUIDSL.g:4690:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalUIDSL.g:4691:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalUIDSL.g:4691:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalUIDSL.g:4692:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_65); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDecimalAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,36,FOLLOW_57); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDecimalAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getDecimalAccess().getINTTerminalRuleCall_2());
            		

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
    // $ANTLR end "ruleDecimal"


    // $ANTLR start "ruleCardinalityType"
    // InternalUIDSL.g:4715:1: ruleCardinalityType returns [Enumerator current=null] : ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'many' ) ) ;
    public final Enumerator ruleCardinalityType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalUIDSL.g:4721:2: ( ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'many' ) ) )
            // InternalUIDSL.g:4722:2: ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'many' ) )
            {
            // InternalUIDSL.g:4722:2: ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'many' ) )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==82) ) {
                alt77=1;
            }
            else if ( (LA77_0==83) ) {
                alt77=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // InternalUIDSL.g:4723:3: (enumLiteral_0= 'one' )
                    {
                    // InternalUIDSL.g:4723:3: (enumLiteral_0= 'one' )
                    // InternalUIDSL.g:4724:4: enumLiteral_0= 'one'
                    {
                    enumLiteral_0=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getCardinalityTypeAccess().getOneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCardinalityTypeAccess().getOneEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUIDSL.g:4731:3: (enumLiteral_1= 'many' )
                    {
                    // InternalUIDSL.g:4731:3: (enumLiteral_1= 'many' )
                    // InternalUIDSL.g:4732:4: enumLiteral_1= 'many'
                    {
                    enumLiteral_1=(Token)match(input,83,FOLLOW_2); 

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
    protected DFA69 dfa69 = new DFA69(this);
    static final String dfa_1s = "\40\uffff";
    static final String dfa_2s = "\15\4\1\120\1\4\1\16\1\4\2\uffff\14\121\1\4";
    static final String dfa_3s = "\1\117\14\4\1\120\1\4\1\17\1\116\2\uffff\14\121\1\4";
    static final String dfa_4s = "\21\uffff\1\2\1\1\15\uffff";
    static final String dfa_5s = "\40\uffff}>";
    static final String[] dfa_6s = {
            "\1\14\44\uffff\1\16\20\uffff\1\7\1\10\1\11\1\12\1\13\12\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\15",
            "\1\17",
            "\1\17",
            "\1\17",
            "\1\17",
            "\1\17",
            "\1\17",
            "\1\17",
            "\1\17",
            "\1\17",
            "\1\17",
            "\1\17",
            "\1\17",
            "\1\20",
            "\1\17",
            "\1\22\1\21",
            "\1\36\65\uffff\1\31\1\32\1\33\1\34\1\35\12\uffff\1\23\1\24\1\25\1\26\1\27\1\30",
            "",
            "",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\37",
            "\1\17"
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
            return "256:2: (this_Field_0= ruleField | this_Method_1= ruleMethod )";
        }
    }
    static final String dfa_7s = "\46\uffff";
    static final String dfa_8s = "\1\uffff\14\25\1\uffff\1\25\3\27\1\30\22\uffff\1\25";
    static final String dfa_9s = "\15\4\1\120\5\4\3\uffff\1\4\2\uffff\14\121\1\4";
    static final String dfa_10s = "\1\117\14\52\1\120\5\52\3\uffff\1\116\2\uffff\14\121\1\52";
    static final String dfa_11s = "\23\uffff\1\4\1\2\1\1\1\uffff\1\3\1\5\15\uffff";
    static final String dfa_12s = "\46\uffff}>";
    static final String[] dfa_13s = {
            "\1\14\15\uffff\1\22\22\uffff\1\17\1\20\1\21\1\23\1\16\20\uffff\1\7\1\10\1\11\1\12\1\13\12\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\15",
            "\1\25\10\uffff\1\25\11\uffff\2\25\21\uffff\1\24",
            "\1\25\10\uffff\1\25\11\uffff\2\25\21\uffff\1\24",
            "\1\25\10\uffff\1\25\11\uffff\2\25\21\uffff\1\24",
            "\1\25\10\uffff\1\25\11\uffff\2\25\21\uffff\1\24",
            "\1\25\10\uffff\1\25\11\uffff\2\25\21\uffff\1\24",
            "\1\25\10\uffff\1\25\11\uffff\2\25\21\uffff\1\24",
            "\1\25\10\uffff\1\25\11\uffff\2\25\21\uffff\1\24",
            "\1\25\10\uffff\1\25\11\uffff\2\25\21\uffff\1\24",
            "\1\25\10\uffff\1\25\11\uffff\2\25\21\uffff\1\24",
            "\1\25\10\uffff\1\25\11\uffff\2\25\21\uffff\1\24",
            "\1\25\10\uffff\1\25\11\uffff\2\25\21\uffff\1\24",
            "\1\25\10\uffff\1\25\11\uffff\2\25\21\uffff\1\24",
            "\1\26",
            "\1\25\10\uffff\1\25\11\uffff\2\25\21\uffff\1\24",
            "\1\27\10\uffff\1\27\11\uffff\2\27\21\uffff\1\24",
            "\1\27\10\uffff\1\27\11\uffff\2\27\21\uffff\1\24",
            "\1\27\10\uffff\1\27\11\uffff\2\27\21\uffff\1\24",
            "\1\30\10\uffff\1\30\11\uffff\2\30\21\uffff\1\24",
            "",
            "",
            "",
            "\1\44\65\uffff\1\37\1\40\1\41\1\42\1\43\12\uffff\1\31\1\32\1\33\1\34\1\35\1\36",
            "",
            "",
            "\1\45",
            "\1\45",
            "\1\45",
            "\1\45",
            "\1\45",
            "\1\45",
            "\1\45",
            "\1\45",
            "\1\45",
            "\1\45",
            "\1\45",
            "\1\45",
            "\1\25\10\uffff\1\25\11\uffff\2\25\21\uffff\1\24"
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
            return "2712:6: (lv_type_1_1= ruleAttributeType | lv_type_1_2= ruleAlternativeType | lv_type_1_3= ruleGeneralType | lv_type_1_4= ruleAnyType | lv_type_1_5= rulePageType )";
        }
    }
    static final String dfa_14s = "\12\uffff";
    static final String dfa_15s = "\1\uffff\1\6\10\uffff";
    static final String dfa_16s = "\1\5\1\4\3\uffff\1\4\4\uffff";
    static final String dfa_17s = "\1\103\1\102\3\uffff\1\5\4\uffff";
    static final String dfa_18s = "\2\uffff\1\3\1\4\1\7\1\uffff\1\1\1\5\1\2\1\6";
    static final String dfa_19s = "\12\uffff}>";
    static final String[] dfa_20s = {
            "\1\1\1\2\71\uffff\2\3\1\uffff\1\4",
            "\1\6\7\uffff\2\6\2\uffff\2\6\14\uffff\4\6\2\uffff\1\5\14\uffff\2\6\14\uffff\1\10\2\uffff\1\7",
            "",
            "",
            "",
            "\1\6\1\11",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA69 extends DFA {

        public DFA69(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 69;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "3914:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) otherlv_4= 'L' ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) ) ) | ( () ( (lv_day_10_0= RULE_INT ) ) otherlv_11= '/' ( (lv_month_12_0= RULE_INT ) ) otherlv_13= '/' ( (lv_year_14_0= RULE_INT ) ) ) | ( () ( (lv_value_16_0= ruleDecimal ) ) ) | ( () otherlv_18= 'null' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00082004004C0802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x7C00020000002010L,0x000000000000FE00L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x7C00020000020010L,0x000000000000FE00L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x7C00020000000010L,0x000000000000FE00L});
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
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000030100000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020100000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x7C001BE000040010L,0x000000000000FE00L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000001012L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0006000040002000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000070L,0x000000000000000BL});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00060001C0002010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000201000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001000008002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000020070L,0x000000000000000BL});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x7C0002E000040010L,0x000000000000FE00L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000400000002000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x7C0000E000000000L,0x0000000000007E00L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0010000000002000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0020000000001000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0080000000001000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000060L,0x000000000000000BL});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0300000000004000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x7C00000000000010L,0x0000000000007E00L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000001000000000L});

}
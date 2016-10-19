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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDomainModelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'entity'", "'extends'", "'options'", "'('", "','", "')'", "'{'", "'}'", "'enum'", "'L'", "'true'", "'false'", "'/'", "'null'", "'deleteByFlag'", "'inheritance'", "'='", "'SINGLE_TABLE'", "'TABLE_PER_CONCRETE_CLASS'", "'TABLE_PER_CLASS'", "';'", "'string'", "'int'", "'long'", "'boolean'", "'date'", "'decimal'", "'List'", "'<'", "'>'", "'required'", "'partOf'", "'relationshipOwner'", "'reverse_cardinality'", "'.'", "'one'", "'many'"
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
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalDomainModelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDomainModelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDomainModelParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDomainModel.g"; }



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




    // $ANTLR start "entryRuleModel"
    // InternalDomainModel.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalDomainModel.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalDomainModel.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalDomainModel.g:72:1: ruleModel returns [EObject current=null] : ( (lv_concepts_0_0= ruleConcept ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_concepts_0_0 = null;



        	enterRule();

        try {
            // InternalDomainModel.g:78:2: ( ( (lv_concepts_0_0= ruleConcept ) )* )
            // InternalDomainModel.g:79:2: ( (lv_concepts_0_0= ruleConcept ) )*
            {
            // InternalDomainModel.g:79:2: ( (lv_concepts_0_0= ruleConcept ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDomainModel.g:80:3: (lv_concepts_0_0= ruleConcept )
            	    {
            	    // InternalDomainModel.g:80:3: (lv_concepts_0_0= ruleConcept )
            	    // InternalDomainModel.g:81:4: lv_concepts_0_0= ruleConcept
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getConceptsConceptParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_concepts_0_0=ruleConcept();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"concepts",
            	    					lv_concepts_0_0,
            	    					"com.stefanvuckovic.domainmodel.DomainModel.Concept");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleConcept"
    // InternalDomainModel.g:101:1: entryRuleConcept returns [EObject current=null] : iv_ruleConcept= ruleConcept EOF ;
    public final EObject entryRuleConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcept = null;


        try {
            // InternalDomainModel.g:101:48: (iv_ruleConcept= ruleConcept EOF )
            // InternalDomainModel.g:102:2: iv_ruleConcept= ruleConcept EOF
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
    // InternalDomainModel.g:108:1: ruleConcept returns [EObject current=null] : (this_Entity_0= ruleEntity | this_Enum_1= ruleEnum ) ;
    public final EObject ruleConcept() throws RecognitionException {
        EObject current = null;

        EObject this_Entity_0 = null;

        EObject this_Enum_1 = null;



        	enterRule();

        try {
            // InternalDomainModel.g:114:2: ( (this_Entity_0= ruleEntity | this_Enum_1= ruleEnum ) )
            // InternalDomainModel.g:115:2: (this_Entity_0= ruleEntity | this_Enum_1= ruleEnum )
            {
            // InternalDomainModel.g:115:2: (this_Entity_0= ruleEntity | this_Enum_1= ruleEnum )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==19) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDomainModel.g:116:3: this_Entity_0= ruleEntity
                    {

                    			newCompositeNode(grammarAccess.getConceptAccess().getEntityParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entity_0=ruleEntity();

                    state._fsp--;


                    			current = this_Entity_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDomainModel.g:125:3: this_Enum_1= ruleEnum
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


    // $ANTLR start "entryRuleEntity"
    // InternalDomainModel.g:137:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalDomainModel.g:137:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalDomainModel.g:138:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalDomainModel.g:144:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'options' otherlv_5= '(' ( (lv_options_6_0= ruleEntityOption ) ) (otherlv_7= ',' ( (lv_options_8_0= ruleEntityOption ) ) )* otherlv_9= ')' )? otherlv_10= '{' ( (lv_attributes_11_0= ruleAttribute ) )* otherlv_12= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_options_6_0 = null;

        EObject lv_options_8_0 = null;

        EObject lv_attributes_11_0 = null;



        	enterRule();

        try {
            // InternalDomainModel.g:150:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'options' otherlv_5= '(' ( (lv_options_6_0= ruleEntityOption ) ) (otherlv_7= ',' ( (lv_options_8_0= ruleEntityOption ) ) )* otherlv_9= ')' )? otherlv_10= '{' ( (lv_attributes_11_0= ruleAttribute ) )* otherlv_12= '}' ) )
            // InternalDomainModel.g:151:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'options' otherlv_5= '(' ( (lv_options_6_0= ruleEntityOption ) ) (otherlv_7= ',' ( (lv_options_8_0= ruleEntityOption ) ) )* otherlv_9= ')' )? otherlv_10= '{' ( (lv_attributes_11_0= ruleAttribute ) )* otherlv_12= '}' )
            {
            // InternalDomainModel.g:151:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'options' otherlv_5= '(' ( (lv_options_6_0= ruleEntityOption ) ) (otherlv_7= ',' ( (lv_options_8_0= ruleEntityOption ) ) )* otherlv_9= ')' )? otherlv_10= '{' ( (lv_attributes_11_0= ruleAttribute ) )* otherlv_12= '}' )
            // InternalDomainModel.g:152:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'options' otherlv_5= '(' ( (lv_options_6_0= ruleEntityOption ) ) (otherlv_7= ',' ( (lv_options_8_0= ruleEntityOption ) ) )* otherlv_9= ')' )? otherlv_10= '{' ( (lv_attributes_11_0= ruleAttribute ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalDomainModel.g:156:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDomainModel.g:157:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDomainModel.g:157:4: (lv_name_1_0= RULE_ID )
            // InternalDomainModel.g:158:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDomainModel.g:174:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDomainModel.g:175:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getExtendsKeyword_2_0());
                    			
                    // InternalDomainModel.g:179:4: ( (otherlv_3= RULE_ID ) )
                    // InternalDomainModel.g:180:5: (otherlv_3= RULE_ID )
                    {
                    // InternalDomainModel.g:180:5: (otherlv_3= RULE_ID )
                    // InternalDomainModel.g:181:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDomainModel.g:193:3: (otherlv_4= 'options' otherlv_5= '(' ( (lv_options_6_0= ruleEntityOption ) ) (otherlv_7= ',' ( (lv_options_8_0= ruleEntityOption ) ) )* otherlv_9= ')' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDomainModel.g:194:4: otherlv_4= 'options' otherlv_5= '(' ( (lv_options_6_0= ruleEntityOption ) ) (otherlv_7= ',' ( (lv_options_8_0= ruleEntityOption ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getOptionsKeyword_3_0());
                    			
                    otherlv_5=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalDomainModel.g:202:4: ( (lv_options_6_0= ruleEntityOption ) )
                    // InternalDomainModel.g:203:5: (lv_options_6_0= ruleEntityOption )
                    {
                    // InternalDomainModel.g:203:5: (lv_options_6_0= ruleEntityOption )
                    // InternalDomainModel.g:204:6: lv_options_6_0= ruleEntityOption
                    {

                    						newCompositeNode(grammarAccess.getEntityAccess().getOptionsEntityOptionParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_options_6_0=ruleEntityOption();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntityRule());
                    						}
                    						add(
                    							current,
                    							"options",
                    							lv_options_6_0,
                    							"com.stefanvuckovic.domainmodel.DomainModel.EntityOption");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDomainModel.g:221:4: (otherlv_7= ',' ( (lv_options_8_0= ruleEntityOption ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==15) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalDomainModel.g:222:5: otherlv_7= ',' ( (lv_options_8_0= ruleEntityOption ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_8); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalDomainModel.g:226:5: ( (lv_options_8_0= ruleEntityOption ) )
                    	    // InternalDomainModel.g:227:6: (lv_options_8_0= ruleEntityOption )
                    	    {
                    	    // InternalDomainModel.g:227:6: (lv_options_8_0= ruleEntityOption )
                    	    // InternalDomainModel.g:228:7: lv_options_8_0= ruleEntityOption
                    	    {

                    	    							newCompositeNode(grammarAccess.getEntityAccess().getOptionsEntityOptionParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_options_8_0=ruleEntityOption();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEntityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"options",
                    	    								lv_options_8_0,
                    	    								"com.stefanvuckovic.domainmodel.DomainModel.EntityOption");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getEntityAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_10, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalDomainModel.g:255:3: ( (lv_attributes_11_0= ruleAttribute ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||(LA6_0>=32 && LA6_0<=38)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDomainModel.g:256:4: (lv_attributes_11_0= ruleAttribute )
            	    {
            	    // InternalDomainModel.g:256:4: (lv_attributes_11_0= ruleAttribute )
            	    // InternalDomainModel.g:257:5: lv_attributes_11_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_attributes_11_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_11_0,
            	    						"com.stefanvuckovic.domainmodel.DomainModel.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_12=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleEnum"
    // InternalDomainModel.g:282:1: entryRuleEnum returns [EObject current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final EObject entryRuleEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnum = null;


        try {
            // InternalDomainModel.g:282:45: (iv_ruleEnum= ruleEnum EOF )
            // InternalDomainModel.g:283:2: iv_ruleEnum= ruleEnum EOF
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
    // InternalDomainModel.g:289:1: ruleEnum returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_literals_4_0= ruleEnumLiteral ) )+ otherlv_5= '}' ) ;
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
            // InternalDomainModel.g:295:2: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_literals_4_0= ruleEnumLiteral ) )+ otherlv_5= '}' ) )
            // InternalDomainModel.g:296:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_literals_4_0= ruleEnumLiteral ) )+ otherlv_5= '}' )
            {
            // InternalDomainModel.g:296:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_literals_4_0= ruleEnumLiteral ) )+ otherlv_5= '}' )
            // InternalDomainModel.g:297:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_literals_4_0= ruleEnumLiteral ) )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumAccess().getEnumKeyword_0());
            		
            // InternalDomainModel.g:301:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDomainModel.g:302:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDomainModel.g:302:4: (lv_name_1_0= RULE_ID )
            // InternalDomainModel.g:303:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            otherlv_2=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDomainModel.g:323:3: ( (lv_attributes_3_0= ruleAttribute ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1==RULE_ID) ) {
                        int LA7_3 = input.LA(3);

                        if ( (LA7_3==31||(LA7_3>=41 && LA7_3<=44)) ) {
                            alt7=1;
                        }


                    }


                }
                else if ( ((LA7_0>=32 && LA7_0<=38)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDomainModel.g:324:4: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // InternalDomainModel.g:324:4: (lv_attributes_3_0= ruleAttribute )
            	    // InternalDomainModel.g:325:5: lv_attributes_3_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getEnumAccess().getAttributesAttributeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
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
            	    break loop7;
                }
            } while (true);

            // InternalDomainModel.g:342:3: ( (lv_literals_4_0= ruleEnumLiteral ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDomainModel.g:343:4: (lv_literals_4_0= ruleEnumLiteral )
            	    {
            	    // InternalDomainModel.g:343:4: (lv_literals_4_0= ruleEnumLiteral )
            	    // InternalDomainModel.g:344:5: lv_literals_4_0= ruleEnumLiteral
            	    {

            	    					newCompositeNode(grammarAccess.getEnumAccess().getLiteralsEnumLiteralParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_11);
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
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

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
    // InternalDomainModel.g:369:1: entryRuleEnumLiteral returns [EObject current=null] : iv_ruleEnumLiteral= ruleEnumLiteral EOF ;
    public final EObject entryRuleEnumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumLiteral = null;


        try {
            // InternalDomainModel.g:369:52: (iv_ruleEnumLiteral= ruleEnumLiteral EOF )
            // InternalDomainModel.g:370:2: iv_ruleEnumLiteral= ruleEnumLiteral EOF
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
    // InternalDomainModel.g:376:1: ruleEnumLiteral returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleConstant ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleConstant ) ) )* otherlv_5= ')' )? ) ;
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
            // InternalDomainModel.g:382:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleConstant ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleConstant ) ) )* otherlv_5= ')' )? ) )
            // InternalDomainModel.g:383:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleConstant ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleConstant ) ) )* otherlv_5= ')' )? )
            {
            // InternalDomainModel.g:383:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleConstant ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleConstant ) ) )* otherlv_5= ')' )? )
            // InternalDomainModel.g:384:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleConstant ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleConstant ) ) )* otherlv_5= ')' )?
            {
            // InternalDomainModel.g:384:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDomainModel.g:385:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDomainModel.g:385:4: (lv_name_0_0= RULE_ID )
            // InternalDomainModel.g:386:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            // InternalDomainModel.g:402:3: (otherlv_1= '(' ( (lv_params_2_0= ruleConstant ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleConstant ) ) )* otherlv_5= ')' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==14) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDomainModel.g:403:4: otherlv_1= '(' ( (lv_params_2_0= ruleConstant ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleConstant ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_14); 

                    				newLeafNode(otherlv_1, grammarAccess.getEnumLiteralAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalDomainModel.g:407:4: ( (lv_params_2_0= ruleConstant ) )
                    // InternalDomainModel.g:408:5: (lv_params_2_0= ruleConstant )
                    {
                    // InternalDomainModel.g:408:5: (lv_params_2_0= ruleConstant )
                    // InternalDomainModel.g:409:6: lv_params_2_0= ruleConstant
                    {

                    						newCompositeNode(grammarAccess.getEnumLiteralAccess().getParamsConstantParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_9);
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

                    // InternalDomainModel.g:426:4: (otherlv_3= ',' ( (lv_params_4_0= ruleConstant ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==15) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalDomainModel.g:427:5: otherlv_3= ',' ( (lv_params_4_0= ruleConstant ) )
                    	    {
                    	    otherlv_3=(Token)match(input,15,FOLLOW_14); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getEnumLiteralAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalDomainModel.g:431:5: ( (lv_params_4_0= ruleConstant ) )
                    	    // InternalDomainModel.g:432:6: (lv_params_4_0= ruleConstant )
                    	    {
                    	    // InternalDomainModel.g:432:6: (lv_params_4_0= ruleConstant )
                    	    // InternalDomainModel.g:433:7: lv_params_4_0= ruleConstant
                    	    {

                    	    							newCompositeNode(grammarAccess.getEnumLiteralAccess().getParamsConstantParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
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
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,16,FOLLOW_2); 

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
    // InternalDomainModel.g:460:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // InternalDomainModel.g:460:49: (iv_ruleConstant= ruleConstant EOF )
            // InternalDomainModel.g:461:2: iv_ruleConstant= ruleConstant EOF
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
    // InternalDomainModel.g:467:1: ruleConstant returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) otherlv_4= 'L' ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) ) ) | ( () ( (lv_day_10_0= RULE_INT ) ) otherlv_11= '/' ( (lv_month_12_0= RULE_INT ) ) otherlv_13= '/' ( (lv_year_14_0= RULE_INT ) ) ) | ( () ( (lv_value_16_0= ruleDecimal ) ) ) | ( () otherlv_18= 'null' ) ) ;
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
            // InternalDomainModel.g:473:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) otherlv_4= 'L' ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) ) ) | ( () ( (lv_day_10_0= RULE_INT ) ) otherlv_11= '/' ( (lv_month_12_0= RULE_INT ) ) otherlv_13= '/' ( (lv_year_14_0= RULE_INT ) ) ) | ( () ( (lv_value_16_0= ruleDecimal ) ) ) | ( () otherlv_18= 'null' ) ) )
            // InternalDomainModel.g:474:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) otherlv_4= 'L' ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) ) ) | ( () ( (lv_day_10_0= RULE_INT ) ) otherlv_11= '/' ( (lv_month_12_0= RULE_INT ) ) otherlv_13= '/' ( (lv_year_14_0= RULE_INT ) ) ) | ( () ( (lv_value_16_0= ruleDecimal ) ) ) | ( () otherlv_18= 'null' ) )
            {
            // InternalDomainModel.g:474:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) otherlv_4= 'L' ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) ) ) | ( () ( (lv_day_10_0= RULE_INT ) ) otherlv_11= '/' ( (lv_month_12_0= RULE_INT ) ) otherlv_13= '/' ( (lv_year_14_0= RULE_INT ) ) ) | ( () ( (lv_value_16_0= ruleDecimal ) ) ) | ( () otherlv_18= 'null' ) )
            int alt12=7;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                switch ( input.LA(2) ) {
                case 20:
                    {
                    alt12=2;
                    }
                    break;
                case EOF:
                case 15:
                case 16:
                    {
                    alt12=1;
                    }
                    break;
                case 23:
                    {
                    alt12=5;
                    }
                    break;
                case 45:
                    {
                    alt12=6;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }

                }
                break;
            case RULE_STRING:
                {
                alt12=3;
                }
                break;
            case 21:
            case 22:
                {
                alt12=4;
                }
                break;
            case 24:
                {
                alt12=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalDomainModel.g:475:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalDomainModel.g:475:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalDomainModel.g:476:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalDomainModel.g:476:4: ()
                    // InternalDomainModel.g:477:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstantAccess().getIntConstantAction_0_0(),
                    						current);
                    				

                    }

                    // InternalDomainModel.g:483:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalDomainModel.g:484:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalDomainModel.g:484:5: (lv_value_1_0= RULE_INT )
                    // InternalDomainModel.g:485:6: lv_value_1_0= RULE_INT
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
                    // InternalDomainModel.g:503:3: ( () ( (lv_value_3_0= RULE_INT ) ) otherlv_4= 'L' )
                    {
                    // InternalDomainModel.g:503:3: ( () ( (lv_value_3_0= RULE_INT ) ) otherlv_4= 'L' )
                    // InternalDomainModel.g:504:4: () ( (lv_value_3_0= RULE_INT ) ) otherlv_4= 'L'
                    {
                    // InternalDomainModel.g:504:4: ()
                    // InternalDomainModel.g:505:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstantAccess().getLongConstantAction_1_0(),
                    						current);
                    				

                    }

                    // InternalDomainModel.g:511:4: ( (lv_value_3_0= RULE_INT ) )
                    // InternalDomainModel.g:512:5: (lv_value_3_0= RULE_INT )
                    {
                    // InternalDomainModel.g:512:5: (lv_value_3_0= RULE_INT )
                    // InternalDomainModel.g:513:6: lv_value_3_0= RULE_INT
                    {
                    lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_15); 

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

                    otherlv_4=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getConstantAccess().getLKeyword_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDomainModel.g:535:3: ( () ( (lv_value_6_0= RULE_STRING ) ) )
                    {
                    // InternalDomainModel.g:535:3: ( () ( (lv_value_6_0= RULE_STRING ) ) )
                    // InternalDomainModel.g:536:4: () ( (lv_value_6_0= RULE_STRING ) )
                    {
                    // InternalDomainModel.g:536:4: ()
                    // InternalDomainModel.g:537:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstantAccess().getStringConstantAction_2_0(),
                    						current);
                    				

                    }

                    // InternalDomainModel.g:543:4: ( (lv_value_6_0= RULE_STRING ) )
                    // InternalDomainModel.g:544:5: (lv_value_6_0= RULE_STRING )
                    {
                    // InternalDomainModel.g:544:5: (lv_value_6_0= RULE_STRING )
                    // InternalDomainModel.g:545:6: lv_value_6_0= RULE_STRING
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
                    // InternalDomainModel.g:563:3: ( () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) ) )
                    {
                    // InternalDomainModel.g:563:3: ( () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) ) )
                    // InternalDomainModel.g:564:4: () ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) )
                    {
                    // InternalDomainModel.g:564:4: ()
                    // InternalDomainModel.g:565:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstantAccess().getBoolConstantAction_3_0(),
                    						current);
                    				

                    }

                    // InternalDomainModel.g:571:4: ( ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) ) )
                    // InternalDomainModel.g:572:5: ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) )
                    {
                    // InternalDomainModel.g:572:5: ( (lv_value_8_1= 'true' | lv_value_8_2= 'false' ) )
                    // InternalDomainModel.g:573:6: (lv_value_8_1= 'true' | lv_value_8_2= 'false' )
                    {
                    // InternalDomainModel.g:573:6: (lv_value_8_1= 'true' | lv_value_8_2= 'false' )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==21) ) {
                        alt11=1;
                    }
                    else if ( (LA11_0==22) ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalDomainModel.g:574:7: lv_value_8_1= 'true'
                            {
                            lv_value_8_1=(Token)match(input,21,FOLLOW_2); 

                            							newLeafNode(lv_value_8_1, grammarAccess.getConstantAccess().getValueTrueKeyword_3_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConstantRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_8_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalDomainModel.g:585:7: lv_value_8_2= 'false'
                            {
                            lv_value_8_2=(Token)match(input,22,FOLLOW_2); 

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
                    // InternalDomainModel.g:600:3: ( () ( (lv_day_10_0= RULE_INT ) ) otherlv_11= '/' ( (lv_month_12_0= RULE_INT ) ) otherlv_13= '/' ( (lv_year_14_0= RULE_INT ) ) )
                    {
                    // InternalDomainModel.g:600:3: ( () ( (lv_day_10_0= RULE_INT ) ) otherlv_11= '/' ( (lv_month_12_0= RULE_INT ) ) otherlv_13= '/' ( (lv_year_14_0= RULE_INT ) ) )
                    // InternalDomainModel.g:601:4: () ( (lv_day_10_0= RULE_INT ) ) otherlv_11= '/' ( (lv_month_12_0= RULE_INT ) ) otherlv_13= '/' ( (lv_year_14_0= RULE_INT ) )
                    {
                    // InternalDomainModel.g:601:4: ()
                    // InternalDomainModel.g:602:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstantAccess().getDateConstantAction_4_0(),
                    						current);
                    				

                    }

                    // InternalDomainModel.g:608:4: ( (lv_day_10_0= RULE_INT ) )
                    // InternalDomainModel.g:609:5: (lv_day_10_0= RULE_INT )
                    {
                    // InternalDomainModel.g:609:5: (lv_day_10_0= RULE_INT )
                    // InternalDomainModel.g:610:6: lv_day_10_0= RULE_INT
                    {
                    lv_day_10_0=(Token)match(input,RULE_INT,FOLLOW_16); 

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

                    otherlv_11=(Token)match(input,23,FOLLOW_17); 

                    				newLeafNode(otherlv_11, grammarAccess.getConstantAccess().getSolidusKeyword_4_2());
                    			
                    // InternalDomainModel.g:630:4: ( (lv_month_12_0= RULE_INT ) )
                    // InternalDomainModel.g:631:5: (lv_month_12_0= RULE_INT )
                    {
                    // InternalDomainModel.g:631:5: (lv_month_12_0= RULE_INT )
                    // InternalDomainModel.g:632:6: lv_month_12_0= RULE_INT
                    {
                    lv_month_12_0=(Token)match(input,RULE_INT,FOLLOW_16); 

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

                    otherlv_13=(Token)match(input,23,FOLLOW_17); 

                    				newLeafNode(otherlv_13, grammarAccess.getConstantAccess().getSolidusKeyword_4_4());
                    			
                    // InternalDomainModel.g:652:4: ( (lv_year_14_0= RULE_INT ) )
                    // InternalDomainModel.g:653:5: (lv_year_14_0= RULE_INT )
                    {
                    // InternalDomainModel.g:653:5: (lv_year_14_0= RULE_INT )
                    // InternalDomainModel.g:654:6: lv_year_14_0= RULE_INT
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
                    // InternalDomainModel.g:672:3: ( () ( (lv_value_16_0= ruleDecimal ) ) )
                    {
                    // InternalDomainModel.g:672:3: ( () ( (lv_value_16_0= ruleDecimal ) ) )
                    // InternalDomainModel.g:673:4: () ( (lv_value_16_0= ruleDecimal ) )
                    {
                    // InternalDomainModel.g:673:4: ()
                    // InternalDomainModel.g:674:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstantAccess().getDecimalConstantAction_5_0(),
                    						current);
                    				

                    }

                    // InternalDomainModel.g:680:4: ( (lv_value_16_0= ruleDecimal ) )
                    // InternalDomainModel.g:681:5: (lv_value_16_0= ruleDecimal )
                    {
                    // InternalDomainModel.g:681:5: (lv_value_16_0= ruleDecimal )
                    // InternalDomainModel.g:682:6: lv_value_16_0= ruleDecimal
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
                    // InternalDomainModel.g:701:3: ( () otherlv_18= 'null' )
                    {
                    // InternalDomainModel.g:701:3: ( () otherlv_18= 'null' )
                    // InternalDomainModel.g:702:4: () otherlv_18= 'null'
                    {
                    // InternalDomainModel.g:702:4: ()
                    // InternalDomainModel.g:703:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstantAccess().getNullAction_6_0(),
                    						current);
                    				

                    }

                    otherlv_18=(Token)match(input,24,FOLLOW_2); 

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
    // InternalDomainModel.g:718:1: entryRuleEntityOption returns [EObject current=null] : iv_ruleEntityOption= ruleEntityOption EOF ;
    public final EObject entryRuleEntityOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityOption = null;


        try {
            // InternalDomainModel.g:718:53: (iv_ruleEntityOption= ruleEntityOption EOF )
            // InternalDomainModel.g:719:2: iv_ruleEntityOption= ruleEntityOption EOF
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
    // InternalDomainModel.g:725:1: ruleEntityOption returns [EObject current=null] : ( ( () ( (lv_deleteByFlag_1_0= 'deleteByFlag' ) ) ) | ( () otherlv_3= 'inheritance' otherlv_4= '=' ( (lv_inheritanceMapping_5_0= ruleInheritanceMappingType ) ) ) ) ;
    public final EObject ruleEntityOption() throws RecognitionException {
        EObject current = null;

        Token lv_deleteByFlag_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_inheritanceMapping_5_0 = null;



        	enterRule();

        try {
            // InternalDomainModel.g:731:2: ( ( ( () ( (lv_deleteByFlag_1_0= 'deleteByFlag' ) ) ) | ( () otherlv_3= 'inheritance' otherlv_4= '=' ( (lv_inheritanceMapping_5_0= ruleInheritanceMappingType ) ) ) ) )
            // InternalDomainModel.g:732:2: ( ( () ( (lv_deleteByFlag_1_0= 'deleteByFlag' ) ) ) | ( () otherlv_3= 'inheritance' otherlv_4= '=' ( (lv_inheritanceMapping_5_0= ruleInheritanceMappingType ) ) ) )
            {
            // InternalDomainModel.g:732:2: ( ( () ( (lv_deleteByFlag_1_0= 'deleteByFlag' ) ) ) | ( () otherlv_3= 'inheritance' otherlv_4= '=' ( (lv_inheritanceMapping_5_0= ruleInheritanceMappingType ) ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            else if ( (LA13_0==26) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalDomainModel.g:733:3: ( () ( (lv_deleteByFlag_1_0= 'deleteByFlag' ) ) )
                    {
                    // InternalDomainModel.g:733:3: ( () ( (lv_deleteByFlag_1_0= 'deleteByFlag' ) ) )
                    // InternalDomainModel.g:734:4: () ( (lv_deleteByFlag_1_0= 'deleteByFlag' ) )
                    {
                    // InternalDomainModel.g:734:4: ()
                    // InternalDomainModel.g:735:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEntityOptionAccess().getEntityDeleteOptionAction_0_0(),
                    						current);
                    				

                    }

                    // InternalDomainModel.g:741:4: ( (lv_deleteByFlag_1_0= 'deleteByFlag' ) )
                    // InternalDomainModel.g:742:5: (lv_deleteByFlag_1_0= 'deleteByFlag' )
                    {
                    // InternalDomainModel.g:742:5: (lv_deleteByFlag_1_0= 'deleteByFlag' )
                    // InternalDomainModel.g:743:6: lv_deleteByFlag_1_0= 'deleteByFlag'
                    {
                    lv_deleteByFlag_1_0=(Token)match(input,25,FOLLOW_2); 

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
                    // InternalDomainModel.g:757:3: ( () otherlv_3= 'inheritance' otherlv_4= '=' ( (lv_inheritanceMapping_5_0= ruleInheritanceMappingType ) ) )
                    {
                    // InternalDomainModel.g:757:3: ( () otherlv_3= 'inheritance' otherlv_4= '=' ( (lv_inheritanceMapping_5_0= ruleInheritanceMappingType ) ) )
                    // InternalDomainModel.g:758:4: () otherlv_3= 'inheritance' otherlv_4= '=' ( (lv_inheritanceMapping_5_0= ruleInheritanceMappingType ) )
                    {
                    // InternalDomainModel.g:758:4: ()
                    // InternalDomainModel.g:759:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEntityOptionAccess().getInheritanceMappingOptionAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,26,FOLLOW_18); 

                    				newLeafNode(otherlv_3, grammarAccess.getEntityOptionAccess().getInheritanceKeyword_1_1());
                    			
                    otherlv_4=(Token)match(input,27,FOLLOW_19); 

                    				newLeafNode(otherlv_4, grammarAccess.getEntityOptionAccess().getEqualsSignKeyword_1_2());
                    			
                    // InternalDomainModel.g:773:4: ( (lv_inheritanceMapping_5_0= ruleInheritanceMappingType ) )
                    // InternalDomainModel.g:774:5: (lv_inheritanceMapping_5_0= ruleInheritanceMappingType )
                    {
                    // InternalDomainModel.g:774:5: (lv_inheritanceMapping_5_0= ruleInheritanceMappingType )
                    // InternalDomainModel.g:775:6: lv_inheritanceMapping_5_0= ruleInheritanceMappingType
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
    // InternalDomainModel.g:797:1: entryRuleInheritanceMappingType returns [EObject current=null] : iv_ruleInheritanceMappingType= ruleInheritanceMappingType EOF ;
    public final EObject entryRuleInheritanceMappingType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInheritanceMappingType = null;


        try {
            // InternalDomainModel.g:797:63: (iv_ruleInheritanceMappingType= ruleInheritanceMappingType EOF )
            // InternalDomainModel.g:798:2: iv_ruleInheritanceMappingType= ruleInheritanceMappingType EOF
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
    // InternalDomainModel.g:804:1: ruleInheritanceMappingType returns [EObject current=null] : ( ( (lv_type_0_1= 'SINGLE_TABLE' | lv_type_0_2= 'TABLE_PER_CONCRETE_CLASS' | lv_type_0_3= 'TABLE_PER_CLASS' ) ) ) ;
    public final EObject ruleInheritanceMappingType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;


        	enterRule();

        try {
            // InternalDomainModel.g:810:2: ( ( ( (lv_type_0_1= 'SINGLE_TABLE' | lv_type_0_2= 'TABLE_PER_CONCRETE_CLASS' | lv_type_0_3= 'TABLE_PER_CLASS' ) ) ) )
            // InternalDomainModel.g:811:2: ( ( (lv_type_0_1= 'SINGLE_TABLE' | lv_type_0_2= 'TABLE_PER_CONCRETE_CLASS' | lv_type_0_3= 'TABLE_PER_CLASS' ) ) )
            {
            // InternalDomainModel.g:811:2: ( ( (lv_type_0_1= 'SINGLE_TABLE' | lv_type_0_2= 'TABLE_PER_CONCRETE_CLASS' | lv_type_0_3= 'TABLE_PER_CLASS' ) ) )
            // InternalDomainModel.g:812:3: ( (lv_type_0_1= 'SINGLE_TABLE' | lv_type_0_2= 'TABLE_PER_CONCRETE_CLASS' | lv_type_0_3= 'TABLE_PER_CLASS' ) )
            {
            // InternalDomainModel.g:812:3: ( (lv_type_0_1= 'SINGLE_TABLE' | lv_type_0_2= 'TABLE_PER_CONCRETE_CLASS' | lv_type_0_3= 'TABLE_PER_CLASS' ) )
            // InternalDomainModel.g:813:4: (lv_type_0_1= 'SINGLE_TABLE' | lv_type_0_2= 'TABLE_PER_CONCRETE_CLASS' | lv_type_0_3= 'TABLE_PER_CLASS' )
            {
            // InternalDomainModel.g:813:4: (lv_type_0_1= 'SINGLE_TABLE' | lv_type_0_2= 'TABLE_PER_CONCRETE_CLASS' | lv_type_0_3= 'TABLE_PER_CLASS' )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt14=1;
                }
                break;
            case 29:
                {
                alt14=2;
                }
                break;
            case 30:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalDomainModel.g:814:5: lv_type_0_1= 'SINGLE_TABLE'
                    {
                    lv_type_0_1=(Token)match(input,28,FOLLOW_2); 

                    					newLeafNode(lv_type_0_1, grammarAccess.getInheritanceMappingTypeAccess().getTypeSINGLE_TABLEKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInheritanceMappingTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalDomainModel.g:825:5: lv_type_0_2= 'TABLE_PER_CONCRETE_CLASS'
                    {
                    lv_type_0_2=(Token)match(input,29,FOLLOW_2); 

                    					newLeafNode(lv_type_0_2, grammarAccess.getInheritanceMappingTypeAccess().getTypeTABLE_PER_CONCRETE_CLASSKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInheritanceMappingTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalDomainModel.g:836:5: lv_type_0_3= 'TABLE_PER_CLASS'
                    {
                    lv_type_0_3=(Token)match(input,30,FOLLOW_2); 

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
    // InternalDomainModel.g:852:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalDomainModel.g:852:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalDomainModel.g:853:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalDomainModel.g:859:1: ruleAttribute returns [EObject current=null] : ( ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_options_2_0= ruleAttributeOption ) ) (otherlv_3= ',' ( (lv_options_4_0= ruleAttributeOption ) ) )* )? otherlv_5= ';' ) ;
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
            // InternalDomainModel.g:865:2: ( ( ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_options_2_0= ruleAttributeOption ) ) (otherlv_3= ',' ( (lv_options_4_0= ruleAttributeOption ) ) )* )? otherlv_5= ';' ) )
            // InternalDomainModel.g:866:2: ( ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_options_2_0= ruleAttributeOption ) ) (otherlv_3= ',' ( (lv_options_4_0= ruleAttributeOption ) ) )* )? otherlv_5= ';' )
            {
            // InternalDomainModel.g:866:2: ( ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_options_2_0= ruleAttributeOption ) ) (otherlv_3= ',' ( (lv_options_4_0= ruleAttributeOption ) ) )* )? otherlv_5= ';' )
            // InternalDomainModel.g:867:3: ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_options_2_0= ruleAttributeOption ) ) (otherlv_3= ',' ( (lv_options_4_0= ruleAttributeOption ) ) )* )? otherlv_5= ';'
            {
            // InternalDomainModel.g:867:3: ( (lv_type_0_0= ruleAttributeType ) )
            // InternalDomainModel.g:868:4: (lv_type_0_0= ruleAttributeType )
            {
            // InternalDomainModel.g:868:4: (lv_type_0_0= ruleAttributeType )
            // InternalDomainModel.g:869:5: lv_type_0_0= ruleAttributeType
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

            // InternalDomainModel.g:886:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDomainModel.g:887:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDomainModel.g:887:4: (lv_name_1_0= RULE_ID )
            // InternalDomainModel.g:888:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_20); 

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

            // InternalDomainModel.g:904:3: ( ( (lv_options_2_0= ruleAttributeOption ) ) (otherlv_3= ',' ( (lv_options_4_0= ruleAttributeOption ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=41 && LA16_0<=44)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDomainModel.g:905:4: ( (lv_options_2_0= ruleAttributeOption ) ) (otherlv_3= ',' ( (lv_options_4_0= ruleAttributeOption ) ) )*
                    {
                    // InternalDomainModel.g:905:4: ( (lv_options_2_0= ruleAttributeOption ) )
                    // InternalDomainModel.g:906:5: (lv_options_2_0= ruleAttributeOption )
                    {
                    // InternalDomainModel.g:906:5: (lv_options_2_0= ruleAttributeOption )
                    // InternalDomainModel.g:907:6: lv_options_2_0= ruleAttributeOption
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getOptionsAttributeOptionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_21);
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

                    // InternalDomainModel.g:924:4: (otherlv_3= ',' ( (lv_options_4_0= ruleAttributeOption ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==15) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalDomainModel.g:925:5: otherlv_3= ',' ( (lv_options_4_0= ruleAttributeOption ) )
                    	    {
                    	    otherlv_3=(Token)match(input,15,FOLLOW_22); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalDomainModel.g:929:5: ( (lv_options_4_0= ruleAttributeOption ) )
                    	    // InternalDomainModel.g:930:6: (lv_options_4_0= ruleAttributeOption )
                    	    {
                    	    // InternalDomainModel.g:930:6: (lv_options_4_0= ruleAttributeOption )
                    	    // InternalDomainModel.g:931:7: lv_options_4_0= ruleAttributeOption
                    	    {

                    	    							newCompositeNode(grammarAccess.getAttributeAccess().getOptionsAttributeOptionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
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
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,31,FOLLOW_2); 

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
    // InternalDomainModel.g:958:1: entryRuleAttributeType returns [EObject current=null] : iv_ruleAttributeType= ruleAttributeType EOF ;
    public final EObject entryRuleAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeType = null;


        try {
            // InternalDomainModel.g:958:54: (iv_ruleAttributeType= ruleAttributeType EOF )
            // InternalDomainModel.g:959:2: iv_ruleAttributeType= ruleAttributeType EOF
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
    // InternalDomainModel.g:965:1: ruleAttributeType returns [EObject current=null] : (this_SingleType_0= ruleSingleType | this_CollectionType_1= ruleCollectionType ) ;
    public final EObject ruleAttributeType() throws RecognitionException {
        EObject current = null;

        EObject this_SingleType_0 = null;

        EObject this_CollectionType_1 = null;



        	enterRule();

        try {
            // InternalDomainModel.g:971:2: ( (this_SingleType_0= ruleSingleType | this_CollectionType_1= ruleCollectionType ) )
            // InternalDomainModel.g:972:2: (this_SingleType_0= ruleSingleType | this_CollectionType_1= ruleCollectionType )
            {
            // InternalDomainModel.g:972:2: (this_SingleType_0= ruleSingleType | this_CollectionType_1= ruleCollectionType )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID||(LA17_0>=32 && LA17_0<=37)) ) {
                alt17=1;
            }
            else if ( (LA17_0==38) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalDomainModel.g:973:3: this_SingleType_0= ruleSingleType
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
                    // InternalDomainModel.g:982:3: this_CollectionType_1= ruleCollectionType
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
    // InternalDomainModel.g:994:1: entryRuleSingleType returns [EObject current=null] : iv_ruleSingleType= ruleSingleType EOF ;
    public final EObject entryRuleSingleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleType = null;


        try {
            // InternalDomainModel.g:994:51: (iv_ruleSingleType= ruleSingleType EOF )
            // InternalDomainModel.g:995:2: iv_ruleSingleType= ruleSingleType EOF
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
    // InternalDomainModel.g:1001:1: ruleSingleType returns [EObject current=null] : (this_BasicType_0= ruleBasicType | this_RefType_1= ruleRefType ) ;
    public final EObject ruleSingleType() throws RecognitionException {
        EObject current = null;

        EObject this_BasicType_0 = null;

        EObject this_RefType_1 = null;



        	enterRule();

        try {
            // InternalDomainModel.g:1007:2: ( (this_BasicType_0= ruleBasicType | this_RefType_1= ruleRefType ) )
            // InternalDomainModel.g:1008:2: (this_BasicType_0= ruleBasicType | this_RefType_1= ruleRefType )
            {
            // InternalDomainModel.g:1008:2: (this_BasicType_0= ruleBasicType | this_RefType_1= ruleRefType )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=32 && LA18_0<=37)) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_ID) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalDomainModel.g:1009:3: this_BasicType_0= ruleBasicType
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
                    // InternalDomainModel.g:1018:3: this_RefType_1= ruleRefType
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


    // $ANTLR start "entryRuleBasicType"
    // InternalDomainModel.g:1030:1: entryRuleBasicType returns [EObject current=null] : iv_ruleBasicType= ruleBasicType EOF ;
    public final EObject entryRuleBasicType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicType = null;


        try {
            // InternalDomainModel.g:1030:50: (iv_ruleBasicType= ruleBasicType EOF )
            // InternalDomainModel.g:1031:2: iv_ruleBasicType= ruleBasicType EOF
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
    // InternalDomainModel.g:1037:1: ruleBasicType returns [EObject current=null] : ( ( () otherlv_1= 'string' ) | ( () otherlv_3= 'int' ) | ( () otherlv_5= 'long' ) | ( () otherlv_7= 'boolean' ) | ( () otherlv_9= 'date' ) | ( () otherlv_11= 'decimal' ) ) ;
    public final EObject ruleBasicType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalDomainModel.g:1043:2: ( ( ( () otherlv_1= 'string' ) | ( () otherlv_3= 'int' ) | ( () otherlv_5= 'long' ) | ( () otherlv_7= 'boolean' ) | ( () otherlv_9= 'date' ) | ( () otherlv_11= 'decimal' ) ) )
            // InternalDomainModel.g:1044:2: ( ( () otherlv_1= 'string' ) | ( () otherlv_3= 'int' ) | ( () otherlv_5= 'long' ) | ( () otherlv_7= 'boolean' ) | ( () otherlv_9= 'date' ) | ( () otherlv_11= 'decimal' ) )
            {
            // InternalDomainModel.g:1044:2: ( ( () otherlv_1= 'string' ) | ( () otherlv_3= 'int' ) | ( () otherlv_5= 'long' ) | ( () otherlv_7= 'boolean' ) | ( () otherlv_9= 'date' ) | ( () otherlv_11= 'decimal' ) )
            int alt19=6;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt19=1;
                }
                break;
            case 33:
                {
                alt19=2;
                }
                break;
            case 34:
                {
                alt19=3;
                }
                break;
            case 35:
                {
                alt19=4;
                }
                break;
            case 36:
                {
                alt19=5;
                }
                break;
            case 37:
                {
                alt19=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalDomainModel.g:1045:3: ( () otherlv_1= 'string' )
                    {
                    // InternalDomainModel.g:1045:3: ( () otherlv_1= 'string' )
                    // InternalDomainModel.g:1046:4: () otherlv_1= 'string'
                    {
                    // InternalDomainModel.g:1046:4: ()
                    // InternalDomainModel.g:1047:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBasicTypeAccess().getStringTypeAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getBasicTypeAccess().getStringKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainModel.g:1059:3: ( () otherlv_3= 'int' )
                    {
                    // InternalDomainModel.g:1059:3: ( () otherlv_3= 'int' )
                    // InternalDomainModel.g:1060:4: () otherlv_3= 'int'
                    {
                    // InternalDomainModel.g:1060:4: ()
                    // InternalDomainModel.g:1061:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBasicTypeAccess().getIntTypeAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,33,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getBasicTypeAccess().getIntKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDomainModel.g:1073:3: ( () otherlv_5= 'long' )
                    {
                    // InternalDomainModel.g:1073:3: ( () otherlv_5= 'long' )
                    // InternalDomainModel.g:1074:4: () otherlv_5= 'long'
                    {
                    // InternalDomainModel.g:1074:4: ()
                    // InternalDomainModel.g:1075:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBasicTypeAccess().getLongTypeAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,34,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getBasicTypeAccess().getLongKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDomainModel.g:1087:3: ( () otherlv_7= 'boolean' )
                    {
                    // InternalDomainModel.g:1087:3: ( () otherlv_7= 'boolean' )
                    // InternalDomainModel.g:1088:4: () otherlv_7= 'boolean'
                    {
                    // InternalDomainModel.g:1088:4: ()
                    // InternalDomainModel.g:1089:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBasicTypeAccess().getBoolTypeAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,35,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getBasicTypeAccess().getBooleanKeyword_3_1());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDomainModel.g:1101:3: ( () otherlv_9= 'date' )
                    {
                    // InternalDomainModel.g:1101:3: ( () otherlv_9= 'date' )
                    // InternalDomainModel.g:1102:4: () otherlv_9= 'date'
                    {
                    // InternalDomainModel.g:1102:4: ()
                    // InternalDomainModel.g:1103:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBasicTypeAccess().getDateTypeAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_9=(Token)match(input,36,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getBasicTypeAccess().getDateKeyword_4_1());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDomainModel.g:1115:3: ( () otherlv_11= 'decimal' )
                    {
                    // InternalDomainModel.g:1115:3: ( () otherlv_11= 'decimal' )
                    // InternalDomainModel.g:1116:4: () otherlv_11= 'decimal'
                    {
                    // InternalDomainModel.g:1116:4: ()
                    // InternalDomainModel.g:1117:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBasicTypeAccess().getDecimalTypeAction_5_0(),
                    						current);
                    				

                    }

                    otherlv_11=(Token)match(input,37,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getBasicTypeAccess().getDecimalKeyword_5_1());
                    			

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


    // $ANTLR start "entryRuleRefType"
    // InternalDomainModel.g:1132:1: entryRuleRefType returns [EObject current=null] : iv_ruleRefType= ruleRefType EOF ;
    public final EObject entryRuleRefType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefType = null;


        try {
            // InternalDomainModel.g:1132:48: (iv_ruleRefType= ruleRefType EOF )
            // InternalDomainModel.g:1133:2: iv_ruleRefType= ruleRefType EOF
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
    // InternalDomainModel.g:1139:1: ruleRefType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleRefType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalDomainModel.g:1145:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalDomainModel.g:1146:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalDomainModel.g:1146:2: ( (otherlv_0= RULE_ID ) )
            // InternalDomainModel.g:1147:3: (otherlv_0= RULE_ID )
            {
            // InternalDomainModel.g:1147:3: (otherlv_0= RULE_ID )
            // InternalDomainModel.g:1148:4: otherlv_0= RULE_ID
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
    // InternalDomainModel.g:1162:1: entryRuleCollectionType returns [EObject current=null] : iv_ruleCollectionType= ruleCollectionType EOF ;
    public final EObject entryRuleCollectionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionType = null;


        try {
            // InternalDomainModel.g:1162:55: (iv_ruleCollectionType= ruleCollectionType EOF )
            // InternalDomainModel.g:1163:2: iv_ruleCollectionType= ruleCollectionType EOF
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
    // InternalDomainModel.g:1169:1: ruleCollectionType returns [EObject current=null] : (otherlv_0= 'List' otherlv_1= '<' ( (lv_ofType_2_0= ruleSingleType ) ) otherlv_3= '>' ) ;
    public final EObject ruleCollectionType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ofType_2_0 = null;



        	enterRule();

        try {
            // InternalDomainModel.g:1175:2: ( (otherlv_0= 'List' otherlv_1= '<' ( (lv_ofType_2_0= ruleSingleType ) ) otherlv_3= '>' ) )
            // InternalDomainModel.g:1176:2: (otherlv_0= 'List' otherlv_1= '<' ( (lv_ofType_2_0= ruleSingleType ) ) otherlv_3= '>' )
            {
            // InternalDomainModel.g:1176:2: (otherlv_0= 'List' otherlv_1= '<' ( (lv_ofType_2_0= ruleSingleType ) ) otherlv_3= '>' )
            // InternalDomainModel.g:1177:3: otherlv_0= 'List' otherlv_1= '<' ( (lv_ofType_2_0= ruleSingleType ) ) otherlv_3= '>'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getCollectionTypeAccess().getListKeyword_0());
            		
            otherlv_1=(Token)match(input,39,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getCollectionTypeAccess().getLessThanSignKeyword_1());
            		
            // InternalDomainModel.g:1185:3: ( (lv_ofType_2_0= ruleSingleType ) )
            // InternalDomainModel.g:1186:4: (lv_ofType_2_0= ruleSingleType )
            {
            // InternalDomainModel.g:1186:4: (lv_ofType_2_0= ruleSingleType )
            // InternalDomainModel.g:1187:5: lv_ofType_2_0= ruleSingleType
            {

            					newCompositeNode(grammarAccess.getCollectionTypeAccess().getOfTypeSingleTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_25);
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

            otherlv_3=(Token)match(input,40,FOLLOW_2); 

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
    // InternalDomainModel.g:1212:1: entryRuleAttributeOption returns [EObject current=null] : iv_ruleAttributeOption= ruleAttributeOption EOF ;
    public final EObject entryRuleAttributeOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeOption = null;


        try {
            // InternalDomainModel.g:1212:56: (iv_ruleAttributeOption= ruleAttributeOption EOF )
            // InternalDomainModel.g:1213:2: iv_ruleAttributeOption= ruleAttributeOption EOF
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
    // InternalDomainModel.g:1219:1: ruleAttributeOption returns [EObject current=null] : ( ( () ( (lv_required_1_0= 'required' ) ) ) | ( () ( (lv_partOf_3_0= 'partOf' ) ) ) | ( () otherlv_5= 'relationshipOwner' otherlv_6= '=' ( (lv_relationshipOwner_7_0= ruleStaticFieldSelection ) ) ) | ( () otherlv_9= 'reverse_cardinality' otherlv_10= '=' ( (lv_card_11_0= ruleCardinalityType ) ) ) ) ;
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
            // InternalDomainModel.g:1225:2: ( ( ( () ( (lv_required_1_0= 'required' ) ) ) | ( () ( (lv_partOf_3_0= 'partOf' ) ) ) | ( () otherlv_5= 'relationshipOwner' otherlv_6= '=' ( (lv_relationshipOwner_7_0= ruleStaticFieldSelection ) ) ) | ( () otherlv_9= 'reverse_cardinality' otherlv_10= '=' ( (lv_card_11_0= ruleCardinalityType ) ) ) ) )
            // InternalDomainModel.g:1226:2: ( ( () ( (lv_required_1_0= 'required' ) ) ) | ( () ( (lv_partOf_3_0= 'partOf' ) ) ) | ( () otherlv_5= 'relationshipOwner' otherlv_6= '=' ( (lv_relationshipOwner_7_0= ruleStaticFieldSelection ) ) ) | ( () otherlv_9= 'reverse_cardinality' otherlv_10= '=' ( (lv_card_11_0= ruleCardinalityType ) ) ) )
            {
            // InternalDomainModel.g:1226:2: ( ( () ( (lv_required_1_0= 'required' ) ) ) | ( () ( (lv_partOf_3_0= 'partOf' ) ) ) | ( () otherlv_5= 'relationshipOwner' otherlv_6= '=' ( (lv_relationshipOwner_7_0= ruleStaticFieldSelection ) ) ) | ( () otherlv_9= 'reverse_cardinality' otherlv_10= '=' ( (lv_card_11_0= ruleCardinalityType ) ) ) )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt20=1;
                }
                break;
            case 42:
                {
                alt20=2;
                }
                break;
            case 43:
                {
                alt20=3;
                }
                break;
            case 44:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalDomainModel.g:1227:3: ( () ( (lv_required_1_0= 'required' ) ) )
                    {
                    // InternalDomainModel.g:1227:3: ( () ( (lv_required_1_0= 'required' ) ) )
                    // InternalDomainModel.g:1228:4: () ( (lv_required_1_0= 'required' ) )
                    {
                    // InternalDomainModel.g:1228:4: ()
                    // InternalDomainModel.g:1229:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAttributeOptionAccess().getRequiredAction_0_0(),
                    						current);
                    				

                    }

                    // InternalDomainModel.g:1235:4: ( (lv_required_1_0= 'required' ) )
                    // InternalDomainModel.g:1236:5: (lv_required_1_0= 'required' )
                    {
                    // InternalDomainModel.g:1236:5: (lv_required_1_0= 'required' )
                    // InternalDomainModel.g:1237:6: lv_required_1_0= 'required'
                    {
                    lv_required_1_0=(Token)match(input,41,FOLLOW_2); 

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
                    // InternalDomainModel.g:1251:3: ( () ( (lv_partOf_3_0= 'partOf' ) ) )
                    {
                    // InternalDomainModel.g:1251:3: ( () ( (lv_partOf_3_0= 'partOf' ) ) )
                    // InternalDomainModel.g:1252:4: () ( (lv_partOf_3_0= 'partOf' ) )
                    {
                    // InternalDomainModel.g:1252:4: ()
                    // InternalDomainModel.g:1253:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAttributeOptionAccess().getPartOfAction_1_0(),
                    						current);
                    				

                    }

                    // InternalDomainModel.g:1259:4: ( (lv_partOf_3_0= 'partOf' ) )
                    // InternalDomainModel.g:1260:5: (lv_partOf_3_0= 'partOf' )
                    {
                    // InternalDomainModel.g:1260:5: (lv_partOf_3_0= 'partOf' )
                    // InternalDomainModel.g:1261:6: lv_partOf_3_0= 'partOf'
                    {
                    lv_partOf_3_0=(Token)match(input,42,FOLLOW_2); 

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
                    // InternalDomainModel.g:1275:3: ( () otherlv_5= 'relationshipOwner' otherlv_6= '=' ( (lv_relationshipOwner_7_0= ruleStaticFieldSelection ) ) )
                    {
                    // InternalDomainModel.g:1275:3: ( () otherlv_5= 'relationshipOwner' otherlv_6= '=' ( (lv_relationshipOwner_7_0= ruleStaticFieldSelection ) ) )
                    // InternalDomainModel.g:1276:4: () otherlv_5= 'relationshipOwner' otherlv_6= '=' ( (lv_relationshipOwner_7_0= ruleStaticFieldSelection ) )
                    {
                    // InternalDomainModel.g:1276:4: ()
                    // InternalDomainModel.g:1277:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAttributeOptionAccess().getRelationshipOwnerAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,43,FOLLOW_18); 

                    				newLeafNode(otherlv_5, grammarAccess.getAttributeOptionAccess().getRelationshipOwnerKeyword_2_1());
                    			
                    otherlv_6=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getAttributeOptionAccess().getEqualsSignKeyword_2_2());
                    			
                    // InternalDomainModel.g:1291:4: ( (lv_relationshipOwner_7_0= ruleStaticFieldSelection ) )
                    // InternalDomainModel.g:1292:5: (lv_relationshipOwner_7_0= ruleStaticFieldSelection )
                    {
                    // InternalDomainModel.g:1292:5: (lv_relationshipOwner_7_0= ruleStaticFieldSelection )
                    // InternalDomainModel.g:1293:6: lv_relationshipOwner_7_0= ruleStaticFieldSelection
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
                    // InternalDomainModel.g:1312:3: ( () otherlv_9= 'reverse_cardinality' otherlv_10= '=' ( (lv_card_11_0= ruleCardinalityType ) ) )
                    {
                    // InternalDomainModel.g:1312:3: ( () otherlv_9= 'reverse_cardinality' otherlv_10= '=' ( (lv_card_11_0= ruleCardinalityType ) ) )
                    // InternalDomainModel.g:1313:4: () otherlv_9= 'reverse_cardinality' otherlv_10= '=' ( (lv_card_11_0= ruleCardinalityType ) )
                    {
                    // InternalDomainModel.g:1313:4: ()
                    // InternalDomainModel.g:1314:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAttributeOptionAccess().getCardinalityAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_9=(Token)match(input,44,FOLLOW_18); 

                    				newLeafNode(otherlv_9, grammarAccess.getAttributeOptionAccess().getReverse_cardinalityKeyword_3_1());
                    			
                    otherlv_10=(Token)match(input,27,FOLLOW_26); 

                    				newLeafNode(otherlv_10, grammarAccess.getAttributeOptionAccess().getEqualsSignKeyword_3_2());
                    			
                    // InternalDomainModel.g:1328:4: ( (lv_card_11_0= ruleCardinalityType ) )
                    // InternalDomainModel.g:1329:5: (lv_card_11_0= ruleCardinalityType )
                    {
                    // InternalDomainModel.g:1329:5: (lv_card_11_0= ruleCardinalityType )
                    // InternalDomainModel.g:1330:6: lv_card_11_0= ruleCardinalityType
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
    // InternalDomainModel.g:1352:1: entryRuleStaticFieldSelection returns [EObject current=null] : iv_ruleStaticFieldSelection= ruleStaticFieldSelection EOF ;
    public final EObject entryRuleStaticFieldSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStaticFieldSelection = null;


        try {
            // InternalDomainModel.g:1352:61: (iv_ruleStaticFieldSelection= ruleStaticFieldSelection EOF )
            // InternalDomainModel.g:1353:2: iv_ruleStaticFieldSelection= ruleStaticFieldSelection EOF
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
    // InternalDomainModel.g:1359:1: ruleStaticFieldSelection returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleStaticFieldSelection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDomainModel.g:1365:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalDomainModel.g:1366:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalDomainModel.g:1366:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            // InternalDomainModel.g:1367:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
            {
            // InternalDomainModel.g:1367:3: ( (otherlv_0= RULE_ID ) )
            // InternalDomainModel.g:1368:4: (otherlv_0= RULE_ID )
            {
            // InternalDomainModel.g:1368:4: (otherlv_0= RULE_ID )
            // InternalDomainModel.g:1369:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStaticFieldSelectionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_0, grammarAccess.getStaticFieldSelectionAccess().getReceiverEntityCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,45,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getStaticFieldSelectionAccess().getFullStopKeyword_1());
            		
            // InternalDomainModel.g:1384:3: ( (otherlv_2= RULE_ID ) )
            // InternalDomainModel.g:1385:4: (otherlv_2= RULE_ID )
            {
            // InternalDomainModel.g:1385:4: (otherlv_2= RULE_ID )
            // InternalDomainModel.g:1386:5: otherlv_2= RULE_ID
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


    // $ANTLR start "entryRuleDecimal"
    // InternalDomainModel.g:1401:1: entryRuleDecimal returns [String current=null] : iv_ruleDecimal= ruleDecimal EOF ;
    public final String entryRuleDecimal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDecimal = null;


        try {
            // InternalDomainModel.g:1401:47: (iv_ruleDecimal= ruleDecimal EOF )
            // InternalDomainModel.g:1402:2: iv_ruleDecimal= ruleDecimal EOF
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
    // InternalDomainModel.g:1408:1: ruleDecimal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDecimal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalDomainModel.g:1414:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalDomainModel.g:1415:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalDomainModel.g:1415:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalDomainModel.g:1416:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_27); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDecimalAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,45,FOLLOW_17); 

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
    // InternalDomainModel.g:1439:1: ruleCardinalityType returns [Enumerator current=null] : ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'many' ) ) ;
    public final Enumerator ruleCardinalityType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDomainModel.g:1445:2: ( ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'many' ) ) )
            // InternalDomainModel.g:1446:2: ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'many' ) )
            {
            // InternalDomainModel.g:1446:2: ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'many' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==46) ) {
                alt21=1;
            }
            else if ( (LA21_0==47) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalDomainModel.g:1447:3: (enumLiteral_0= 'one' )
                    {
                    // InternalDomainModel.g:1447:3: (enumLiteral_0= 'one' )
                    // InternalDomainModel.g:1448:4: enumLiteral_0= 'one'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getCardinalityTypeAccess().getOneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCardinalityTypeAccess().getOneEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainModel.g:1455:3: (enumLiteral_1= 'many' )
                    {
                    // InternalDomainModel.g:1455:3: (enumLiteral_1= 'many' )
                    // InternalDomainModel.g:1456:4: enumLiteral_1= 'many'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000080802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000023000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000007F00040010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000007F00000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001600060L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00001E0080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080008000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00001E0000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000003F00000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000200000000000L});

}
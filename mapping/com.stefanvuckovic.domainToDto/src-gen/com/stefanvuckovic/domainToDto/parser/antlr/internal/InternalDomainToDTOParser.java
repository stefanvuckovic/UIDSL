package com.stefanvuckovic.domainToDto.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.stefanvuckovic.domainToDto.services.DomainToDTOGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDomainToDTOParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'mapper'", "'dto'", "'{'", "'}'", "'->'", "'.'", "'map'", "'with'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=5;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalDomainToDTOParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDomainToDTOParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDomainToDTOParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDomainToDTO.g"; }



     	private DomainToDTOGrammarAccess grammarAccess;

        public InternalDomainToDTOParser(TokenStream input, DomainToDTOGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MappingModel";
       	}

       	@Override
       	protected DomainToDTOGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMappingModel"
    // InternalDomainToDTO.g:64:1: entryRuleMappingModel returns [EObject current=null] : iv_ruleMappingModel= ruleMappingModel EOF ;
    public final EObject entryRuleMappingModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingModel = null;


        try {
            // InternalDomainToDTO.g:64:53: (iv_ruleMappingModel= ruleMappingModel EOF )
            // InternalDomainToDTO.g:65:2: iv_ruleMappingModel= ruleMappingModel EOF
            {
             newCompositeNode(grammarAccess.getMappingModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMappingModel=ruleMappingModel();

            state._fsp--;

             current =iv_ruleMappingModel; 
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
    // $ANTLR end "entryRuleMappingModel"


    // $ANTLR start "ruleMappingModel"
    // InternalDomainToDTO.g:71:1: ruleMappingModel returns [EObject current=null] : ( (lv_mappers_0_0= ruleMapper ) )* ;
    public final EObject ruleMappingModel() throws RecognitionException {
        EObject current = null;

        EObject lv_mappers_0_0 = null;



        	enterRule();

        try {
            // InternalDomainToDTO.g:77:2: ( ( (lv_mappers_0_0= ruleMapper ) )* )
            // InternalDomainToDTO.g:78:2: ( (lv_mappers_0_0= ruleMapper ) )*
            {
            // InternalDomainToDTO.g:78:2: ( (lv_mappers_0_0= ruleMapper ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDomainToDTO.g:79:3: (lv_mappers_0_0= ruleMapper )
            	    {
            	    // InternalDomainToDTO.g:79:3: (lv_mappers_0_0= ruleMapper )
            	    // InternalDomainToDTO.g:80:4: lv_mappers_0_0= ruleMapper
            	    {

            	    				newCompositeNode(grammarAccess.getMappingModelAccess().getMappersMapperParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_mappers_0_0=ruleMapper();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getMappingModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"mappers",
            	    					lv_mappers_0_0,
            	    					"com.stefanvuckovic.domainToDto.DomainToDTO.Mapper");
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
    // $ANTLR end "ruleMappingModel"


    // $ANTLR start "entryRuleMapper"
    // InternalDomainToDTO.g:100:1: entryRuleMapper returns [EObject current=null] : iv_ruleMapper= ruleMapper EOF ;
    public final EObject entryRuleMapper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapper = null;


        try {
            // InternalDomainToDTO.g:100:47: (iv_ruleMapper= ruleMapper EOF )
            // InternalDomainToDTO.g:101:2: iv_ruleMapper= ruleMapper EOF
            {
             newCompositeNode(grammarAccess.getMapperRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMapper=ruleMapper();

            state._fsp--;

             current =iv_ruleMapper; 
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
    // $ANTLR end "entryRuleMapper"


    // $ANTLR start "ruleMapper"
    // InternalDomainToDTO.g:107:1: ruleMapper returns [EObject current=null] : (otherlv_0= 'mapper' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'dto' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_attributes_5_0= ruleMappedAttribute ) )* otherlv_6= '}' ) ;
    public final EObject ruleMapper() throws RecognitionException {
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
            // InternalDomainToDTO.g:113:2: ( (otherlv_0= 'mapper' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'dto' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_attributes_5_0= ruleMappedAttribute ) )* otherlv_6= '}' ) )
            // InternalDomainToDTO.g:114:2: (otherlv_0= 'mapper' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'dto' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_attributes_5_0= ruleMappedAttribute ) )* otherlv_6= '}' )
            {
            // InternalDomainToDTO.g:114:2: (otherlv_0= 'mapper' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'dto' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_attributes_5_0= ruleMappedAttribute ) )* otherlv_6= '}' )
            // InternalDomainToDTO.g:115:3: otherlv_0= 'mapper' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'dto' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_attributes_5_0= ruleMappedAttribute ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMapperAccess().getMapperKeyword_0());
            		
            // InternalDomainToDTO.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDomainToDTO.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDomainToDTO.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalDomainToDTO.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMapperAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMapperRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getMapperAccess().getDtoKeyword_2());
            		
            // InternalDomainToDTO.g:141:3: ( (otherlv_3= RULE_ID ) )
            // InternalDomainToDTO.g:142:4: (otherlv_3= RULE_ID )
            {
            // InternalDomainToDTO.g:142:4: (otherlv_3= RULE_ID )
            // InternalDomainToDTO.g:143:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMapperRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_3, grammarAccess.getMapperAccess().getDtoDTOClassCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getMapperAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalDomainToDTO.g:158:3: ( (lv_attributes_5_0= ruleMappedAttribute ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDomainToDTO.g:159:4: (lv_attributes_5_0= ruleMappedAttribute )
            	    {
            	    // InternalDomainToDTO.g:159:4: (lv_attributes_5_0= ruleMappedAttribute )
            	    // InternalDomainToDTO.g:160:5: lv_attributes_5_0= ruleMappedAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getMapperAccess().getAttributesMappedAttributeParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_attributes_5_0=ruleMappedAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMapperRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_5_0,
            	    						"com.stefanvuckovic.domainToDto.DomainToDTO.MappedAttribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMapperAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleMapper"


    // $ANTLR start "entryRuleMappedAttribute"
    // InternalDomainToDTO.g:185:1: entryRuleMappedAttribute returns [EObject current=null] : iv_ruleMappedAttribute= ruleMappedAttribute EOF ;
    public final EObject entryRuleMappedAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappedAttribute = null;


        try {
            // InternalDomainToDTO.g:185:56: (iv_ruleMappedAttribute= ruleMappedAttribute EOF )
            // InternalDomainToDTO.g:186:2: iv_ruleMappedAttribute= ruleMappedAttribute EOF
            {
             newCompositeNode(grammarAccess.getMappedAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMappedAttribute=ruleMappedAttribute();

            state._fsp--;

             current =iv_ruleMappedAttribute; 
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
    // $ANTLR end "entryRuleMappedAttribute"


    // $ANTLR start "ruleMappedAttribute"
    // InternalDomainToDTO.g:192:1: ruleMappedAttribute returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (lv_mapping_2_0= ruleExpression ) ) ) ;
    public final EObject ruleMappedAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_mapping_2_0 = null;



        	enterRule();

        try {
            // InternalDomainToDTO.g:198:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (lv_mapping_2_0= ruleExpression ) ) ) )
            // InternalDomainToDTO.g:199:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (lv_mapping_2_0= ruleExpression ) ) )
            {
            // InternalDomainToDTO.g:199:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (lv_mapping_2_0= ruleExpression ) ) )
            // InternalDomainToDTO.g:200:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (lv_mapping_2_0= ruleExpression ) )
            {
            // InternalDomainToDTO.g:200:3: ( (otherlv_0= RULE_ID ) )
            // InternalDomainToDTO.g:201:4: (otherlv_0= RULE_ID )
            {
            // InternalDomainToDTO.g:201:4: (otherlv_0= RULE_ID )
            // InternalDomainToDTO.g:202:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMappedAttributeRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_0, grammarAccess.getMappedAttributeAccess().getAttrAttributeCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getMappedAttributeAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalDomainToDTO.g:217:3: ( (lv_mapping_2_0= ruleExpression ) )
            // InternalDomainToDTO.g:218:4: (lv_mapping_2_0= ruleExpression )
            {
            // InternalDomainToDTO.g:218:4: (lv_mapping_2_0= ruleExpression )
            // InternalDomainToDTO.g:219:5: lv_mapping_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getMappedAttributeAccess().getMappingExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_mapping_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMappedAttributeRule());
            					}
            					set(
            						current,
            						"mapping",
            						lv_mapping_2_0,
            						"com.stefanvuckovic.domainToDto.DomainToDTO.Expression");
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
    // $ANTLR end "ruleMappedAttribute"


    // $ANTLR start "entryRuleExpression"
    // InternalDomainToDTO.g:240:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalDomainToDTO.g:240:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalDomainToDTO.g:241:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalDomainToDTO.g:247:1: ruleExpression returns [EObject current=null] : (this_MemberSelectionExpression_0= ruleMemberSelectionExpression | this_EntityMappingExpression_1= ruleEntityMappingExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MemberSelectionExpression_0 = null;

        EObject this_EntityMappingExpression_1 = null;



        	enterRule();

        try {
            // InternalDomainToDTO.g:253:2: ( (this_MemberSelectionExpression_0= ruleMemberSelectionExpression | this_EntityMappingExpression_1= ruleEntityMappingExpression ) )
            // InternalDomainToDTO.g:254:2: (this_MemberSelectionExpression_0= ruleMemberSelectionExpression | this_EntityMappingExpression_1= ruleEntityMappingExpression )
            {
            // InternalDomainToDTO.g:254:2: (this_MemberSelectionExpression_0= ruleMemberSelectionExpression | this_EntityMappingExpression_1= ruleEntityMappingExpression )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==17) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDomainToDTO.g:255:3: this_MemberSelectionExpression_0= ruleMemberSelectionExpression
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
                    // InternalDomainToDTO.g:264:3: this_EntityMappingExpression_1= ruleEntityMappingExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getEntityMappingExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntityMappingExpression_1=ruleEntityMappingExpression();

                    state._fsp--;


                    			current = this_EntityMappingExpression_1;
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


    // $ANTLR start "entryRuleMemberSelectionExpression"
    // InternalDomainToDTO.g:276:1: entryRuleMemberSelectionExpression returns [EObject current=null] : iv_ruleMemberSelectionExpression= ruleMemberSelectionExpression EOF ;
    public final EObject entryRuleMemberSelectionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemberSelectionExpression = null;


        try {
            // InternalDomainToDTO.g:276:66: (iv_ruleMemberSelectionExpression= ruleMemberSelectionExpression EOF )
            // InternalDomainToDTO.g:277:2: iv_ruleMemberSelectionExpression= ruleMemberSelectionExpression EOF
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
    // InternalDomainToDTO.g:283:1: ruleMemberSelectionExpression returns [EObject current=null] : (this_AtomExpression_0= ruleAtomExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* ) ;
    public final EObject ruleMemberSelectionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_AtomExpression_0 = null;



        	enterRule();

        try {
            // InternalDomainToDTO.g:289:2: ( (this_AtomExpression_0= ruleAtomExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* ) )
            // InternalDomainToDTO.g:290:2: (this_AtomExpression_0= ruleAtomExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* )
            {
            // InternalDomainToDTO.g:290:2: (this_AtomExpression_0= ruleAtomExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* )
            // InternalDomainToDTO.g:291:3: this_AtomExpression_0= ruleAtomExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )*
            {

            			newCompositeNode(grammarAccess.getMemberSelectionExpressionAccess().getAtomExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_10);
            this_AtomExpression_0=ruleAtomExpression();

            state._fsp--;


            			current = this_AtomExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDomainToDTO.g:299:3: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDomainToDTO.g:300:4: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalDomainToDTO.g:300:4: ()
            	    // InternalDomainToDTO.g:301:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMemberSelectionExpressionAccess().getMemberSelectionExpressionReceiverAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,16,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getMemberSelectionExpressionAccess().getFullStopKeyword_1_1());
            	    			
            	    // InternalDomainToDTO.g:311:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalDomainToDTO.g:312:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalDomainToDTO.g:312:5: (otherlv_3= RULE_ID )
            	    // InternalDomainToDTO.g:313:6: otherlv_3= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMemberSelectionExpressionRule());
            	    						}
            	    					
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    						newLeafNode(otherlv_3, grammarAccess.getMemberSelectionExpressionAccess().getMemberAttributeCrossReference_1_2_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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


    // $ANTLR start "entryRuleEntityMappingExpression"
    // InternalDomainToDTO.g:329:1: entryRuleEntityMappingExpression returns [EObject current=null] : iv_ruleEntityMappingExpression= ruleEntityMappingExpression EOF ;
    public final EObject entryRuleEntityMappingExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityMappingExpression = null;


        try {
            // InternalDomainToDTO.g:329:64: (iv_ruleEntityMappingExpression= ruleEntityMappingExpression EOF )
            // InternalDomainToDTO.g:330:2: iv_ruleEntityMappingExpression= ruleEntityMappingExpression EOF
            {
             newCompositeNode(grammarAccess.getEntityMappingExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityMappingExpression=ruleEntityMappingExpression();

            state._fsp--;

             current =iv_ruleEntityMappingExpression; 
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
    // $ANTLR end "entryRuleEntityMappingExpression"


    // $ANTLR start "ruleEntityMappingExpression"
    // InternalDomainToDTO.g:336:1: ruleEntityMappingExpression returns [EObject current=null] : ( () otherlv_1= 'map' ( (lv_mappedEntity_2_0= ruleMemberSelectionExpression ) ) otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleEntityMappingExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_mappedEntity_2_0 = null;



        	enterRule();

        try {
            // InternalDomainToDTO.g:342:2: ( ( () otherlv_1= 'map' ( (lv_mappedEntity_2_0= ruleMemberSelectionExpression ) ) otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) ) )
            // InternalDomainToDTO.g:343:2: ( () otherlv_1= 'map' ( (lv_mappedEntity_2_0= ruleMemberSelectionExpression ) ) otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalDomainToDTO.g:343:2: ( () otherlv_1= 'map' ( (lv_mappedEntity_2_0= ruleMemberSelectionExpression ) ) otherlv_3= 'with' ( (otherlv_4= RULE_ID ) ) )
            // InternalDomainToDTO.g:344:3: () otherlv_1= 'map' ( (lv_mappedEntity_2_0= ruleMemberSelectionExpression ) ) otherlv_3= 'with' ( (otherlv_4= RULE_ID ) )
            {
            // InternalDomainToDTO.g:344:3: ()
            // InternalDomainToDTO.g:345:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEntityMappingExpressionAccess().getEntityMappingExpressionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEntityMappingExpressionAccess().getMapKeyword_1());
            		
            // InternalDomainToDTO.g:355:3: ( (lv_mappedEntity_2_0= ruleMemberSelectionExpression ) )
            // InternalDomainToDTO.g:356:4: (lv_mappedEntity_2_0= ruleMemberSelectionExpression )
            {
            // InternalDomainToDTO.g:356:4: (lv_mappedEntity_2_0= ruleMemberSelectionExpression )
            // InternalDomainToDTO.g:357:5: lv_mappedEntity_2_0= ruleMemberSelectionExpression
            {

            					newCompositeNode(grammarAccess.getEntityMappingExpressionAccess().getMappedEntityMemberSelectionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_mappedEntity_2_0=ruleMemberSelectionExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityMappingExpressionRule());
            					}
            					set(
            						current,
            						"mappedEntity",
            						lv_mappedEntity_2_0,
            						"com.stefanvuckovic.domainToDto.DomainToDTO.MemberSelectionExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getEntityMappingExpressionAccess().getWithKeyword_3());
            		
            // InternalDomainToDTO.g:378:3: ( (otherlv_4= RULE_ID ) )
            // InternalDomainToDTO.g:379:4: (otherlv_4= RULE_ID )
            {
            // InternalDomainToDTO.g:379:4: (otherlv_4= RULE_ID )
            // InternalDomainToDTO.g:380:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityMappingExpressionRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_4, grammarAccess.getEntityMappingExpressionAccess().getMapperMapperCrossReference_4_0());
            				

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
    // $ANTLR end "ruleEntityMappingExpression"


    // $ANTLR start "entryRuleAtomExpression"
    // InternalDomainToDTO.g:395:1: entryRuleAtomExpression returns [EObject current=null] : iv_ruleAtomExpression= ruleAtomExpression EOF ;
    public final EObject entryRuleAtomExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomExpression = null;


        try {
            // InternalDomainToDTO.g:395:55: (iv_ruleAtomExpression= ruleAtomExpression EOF )
            // InternalDomainToDTO.g:396:2: iv_ruleAtomExpression= ruleAtomExpression EOF
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
    // InternalDomainToDTO.g:402:1: ruleAtomExpression returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleAtomExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDomainToDTO.g:408:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalDomainToDTO.g:409:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalDomainToDTO.g:409:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalDomainToDTO.g:410:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalDomainToDTO.g:410:3: ()
            // InternalDomainToDTO.g:411:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAtomExpressionAccess().getStaticEntityRefAction_0(),
            					current);
            			

            }

            // InternalDomainToDTO.g:417:3: ( (otherlv_1= RULE_ID ) )
            // InternalDomainToDTO.g:418:4: (otherlv_1= RULE_ID )
            {
            // InternalDomainToDTO.g:418:4: (otherlv_1= RULE_ID )
            // InternalDomainToDTO.g:419:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtomExpressionRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getAtomExpressionAccess().getReferenceEntityCrossReference_1_0());
            				

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
    // $ANTLR end "ruleAtomExpression"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});

}
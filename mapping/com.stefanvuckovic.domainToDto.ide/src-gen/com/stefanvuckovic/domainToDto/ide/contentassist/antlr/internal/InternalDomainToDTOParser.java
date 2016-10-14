package com.stefanvuckovic.domainToDto.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import com.stefanvuckovic.domainToDto.services.DomainToDTOGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDomainToDTOParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(DomainToDTOGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleMappingModel"
    // InternalDomainToDTO.g:53:1: entryRuleMappingModel : ruleMappingModel EOF ;
    public final void entryRuleMappingModel() throws RecognitionException {
        try {
            // InternalDomainToDTO.g:54:1: ( ruleMappingModel EOF )
            // InternalDomainToDTO.g:55:1: ruleMappingModel EOF
            {
             before(grammarAccess.getMappingModelRule()); 
            pushFollow(FOLLOW_1);
            ruleMappingModel();

            state._fsp--;

             after(grammarAccess.getMappingModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMappingModel"


    // $ANTLR start "ruleMappingModel"
    // InternalDomainToDTO.g:62:1: ruleMappingModel : ( ( rule__MappingModel__MappersAssignment )* ) ;
    public final void ruleMappingModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:66:2: ( ( ( rule__MappingModel__MappersAssignment )* ) )
            // InternalDomainToDTO.g:67:2: ( ( rule__MappingModel__MappersAssignment )* )
            {
            // InternalDomainToDTO.g:67:2: ( ( rule__MappingModel__MappersAssignment )* )
            // InternalDomainToDTO.g:68:3: ( rule__MappingModel__MappersAssignment )*
            {
             before(grammarAccess.getMappingModelAccess().getMappersAssignment()); 
            // InternalDomainToDTO.g:69:3: ( rule__MappingModel__MappersAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDomainToDTO.g:69:4: rule__MappingModel__MappersAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__MappingModel__MappersAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getMappingModelAccess().getMappersAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMappingModel"


    // $ANTLR start "entryRuleMapper"
    // InternalDomainToDTO.g:78:1: entryRuleMapper : ruleMapper EOF ;
    public final void entryRuleMapper() throws RecognitionException {
        try {
            // InternalDomainToDTO.g:79:1: ( ruleMapper EOF )
            // InternalDomainToDTO.g:80:1: ruleMapper EOF
            {
             before(grammarAccess.getMapperRule()); 
            pushFollow(FOLLOW_1);
            ruleMapper();

            state._fsp--;

             after(grammarAccess.getMapperRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMapper"


    // $ANTLR start "ruleMapper"
    // InternalDomainToDTO.g:87:1: ruleMapper : ( ( rule__Mapper__Group__0 ) ) ;
    public final void ruleMapper() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:91:2: ( ( ( rule__Mapper__Group__0 ) ) )
            // InternalDomainToDTO.g:92:2: ( ( rule__Mapper__Group__0 ) )
            {
            // InternalDomainToDTO.g:92:2: ( ( rule__Mapper__Group__0 ) )
            // InternalDomainToDTO.g:93:3: ( rule__Mapper__Group__0 )
            {
             before(grammarAccess.getMapperAccess().getGroup()); 
            // InternalDomainToDTO.g:94:3: ( rule__Mapper__Group__0 )
            // InternalDomainToDTO.g:94:4: rule__Mapper__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mapper__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMapperAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMapper"


    // $ANTLR start "entryRuleMappedAttribute"
    // InternalDomainToDTO.g:103:1: entryRuleMappedAttribute : ruleMappedAttribute EOF ;
    public final void entryRuleMappedAttribute() throws RecognitionException {
        try {
            // InternalDomainToDTO.g:104:1: ( ruleMappedAttribute EOF )
            // InternalDomainToDTO.g:105:1: ruleMappedAttribute EOF
            {
             before(grammarAccess.getMappedAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleMappedAttribute();

            state._fsp--;

             after(grammarAccess.getMappedAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMappedAttribute"


    // $ANTLR start "ruleMappedAttribute"
    // InternalDomainToDTO.g:112:1: ruleMappedAttribute : ( ( rule__MappedAttribute__Group__0 ) ) ;
    public final void ruleMappedAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:116:2: ( ( ( rule__MappedAttribute__Group__0 ) ) )
            // InternalDomainToDTO.g:117:2: ( ( rule__MappedAttribute__Group__0 ) )
            {
            // InternalDomainToDTO.g:117:2: ( ( rule__MappedAttribute__Group__0 ) )
            // InternalDomainToDTO.g:118:3: ( rule__MappedAttribute__Group__0 )
            {
             before(grammarAccess.getMappedAttributeAccess().getGroup()); 
            // InternalDomainToDTO.g:119:3: ( rule__MappedAttribute__Group__0 )
            // InternalDomainToDTO.g:119:4: rule__MappedAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MappedAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMappedAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMappedAttribute"


    // $ANTLR start "entryRuleExpression"
    // InternalDomainToDTO.g:128:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalDomainToDTO.g:129:1: ( ruleExpression EOF )
            // InternalDomainToDTO.g:130:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalDomainToDTO.g:137:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:141:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalDomainToDTO.g:142:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalDomainToDTO.g:142:2: ( ( rule__Expression__Alternatives ) )
            // InternalDomainToDTO.g:143:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalDomainToDTO.g:144:3: ( rule__Expression__Alternatives )
            // InternalDomainToDTO.g:144:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleMemberSelectionExpression"
    // InternalDomainToDTO.g:153:1: entryRuleMemberSelectionExpression : ruleMemberSelectionExpression EOF ;
    public final void entryRuleMemberSelectionExpression() throws RecognitionException {
        try {
            // InternalDomainToDTO.g:154:1: ( ruleMemberSelectionExpression EOF )
            // InternalDomainToDTO.g:155:1: ruleMemberSelectionExpression EOF
            {
             before(grammarAccess.getMemberSelectionExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleMemberSelectionExpression();

            state._fsp--;

             after(grammarAccess.getMemberSelectionExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMemberSelectionExpression"


    // $ANTLR start "ruleMemberSelectionExpression"
    // InternalDomainToDTO.g:162:1: ruleMemberSelectionExpression : ( ( rule__MemberSelectionExpression__Group__0 ) ) ;
    public final void ruleMemberSelectionExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:166:2: ( ( ( rule__MemberSelectionExpression__Group__0 ) ) )
            // InternalDomainToDTO.g:167:2: ( ( rule__MemberSelectionExpression__Group__0 ) )
            {
            // InternalDomainToDTO.g:167:2: ( ( rule__MemberSelectionExpression__Group__0 ) )
            // InternalDomainToDTO.g:168:3: ( rule__MemberSelectionExpression__Group__0 )
            {
             before(grammarAccess.getMemberSelectionExpressionAccess().getGroup()); 
            // InternalDomainToDTO.g:169:3: ( rule__MemberSelectionExpression__Group__0 )
            // InternalDomainToDTO.g:169:4: rule__MemberSelectionExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MemberSelectionExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMemberSelectionExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMemberSelectionExpression"


    // $ANTLR start "entryRuleEntityMappingExpression"
    // InternalDomainToDTO.g:178:1: entryRuleEntityMappingExpression : ruleEntityMappingExpression EOF ;
    public final void entryRuleEntityMappingExpression() throws RecognitionException {
        try {
            // InternalDomainToDTO.g:179:1: ( ruleEntityMappingExpression EOF )
            // InternalDomainToDTO.g:180:1: ruleEntityMappingExpression EOF
            {
             before(grammarAccess.getEntityMappingExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleEntityMappingExpression();

            state._fsp--;

             after(grammarAccess.getEntityMappingExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntityMappingExpression"


    // $ANTLR start "ruleEntityMappingExpression"
    // InternalDomainToDTO.g:187:1: ruleEntityMappingExpression : ( ( rule__EntityMappingExpression__Group__0 ) ) ;
    public final void ruleEntityMappingExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:191:2: ( ( ( rule__EntityMappingExpression__Group__0 ) ) )
            // InternalDomainToDTO.g:192:2: ( ( rule__EntityMappingExpression__Group__0 ) )
            {
            // InternalDomainToDTO.g:192:2: ( ( rule__EntityMappingExpression__Group__0 ) )
            // InternalDomainToDTO.g:193:3: ( rule__EntityMappingExpression__Group__0 )
            {
             before(grammarAccess.getEntityMappingExpressionAccess().getGroup()); 
            // InternalDomainToDTO.g:194:3: ( rule__EntityMappingExpression__Group__0 )
            // InternalDomainToDTO.g:194:4: rule__EntityMappingExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EntityMappingExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityMappingExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntityMappingExpression"


    // $ANTLR start "entryRuleAtomExpression"
    // InternalDomainToDTO.g:203:1: entryRuleAtomExpression : ruleAtomExpression EOF ;
    public final void entryRuleAtomExpression() throws RecognitionException {
        try {
            // InternalDomainToDTO.g:204:1: ( ruleAtomExpression EOF )
            // InternalDomainToDTO.g:205:1: ruleAtomExpression EOF
            {
             before(grammarAccess.getAtomExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleAtomExpression();

            state._fsp--;

             after(grammarAccess.getAtomExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtomExpression"


    // $ANTLR start "ruleAtomExpression"
    // InternalDomainToDTO.g:212:1: ruleAtomExpression : ( ( rule__AtomExpression__Group__0 ) ) ;
    public final void ruleAtomExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:216:2: ( ( ( rule__AtomExpression__Group__0 ) ) )
            // InternalDomainToDTO.g:217:2: ( ( rule__AtomExpression__Group__0 ) )
            {
            // InternalDomainToDTO.g:217:2: ( ( rule__AtomExpression__Group__0 ) )
            // InternalDomainToDTO.g:218:3: ( rule__AtomExpression__Group__0 )
            {
             before(grammarAccess.getAtomExpressionAccess().getGroup()); 
            // InternalDomainToDTO.g:219:3: ( rule__AtomExpression__Group__0 )
            // InternalDomainToDTO.g:219:4: rule__AtomExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AtomExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtomExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtomExpression"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalDomainToDTO.g:227:1: rule__Expression__Alternatives : ( ( ruleMemberSelectionExpression ) | ( ruleEntityMappingExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:231:1: ( ( ruleMemberSelectionExpression ) | ( ruleEntityMappingExpression ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDomainToDTO.g:232:2: ( ruleMemberSelectionExpression )
                    {
                    // InternalDomainToDTO.g:232:2: ( ruleMemberSelectionExpression )
                    // InternalDomainToDTO.g:233:3: ruleMemberSelectionExpression
                    {
                     before(grammarAccess.getExpressionAccess().getMemberSelectionExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMemberSelectionExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getMemberSelectionExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainToDTO.g:238:2: ( ruleEntityMappingExpression )
                    {
                    // InternalDomainToDTO.g:238:2: ( ruleEntityMappingExpression )
                    // InternalDomainToDTO.g:239:3: ruleEntityMappingExpression
                    {
                     before(grammarAccess.getExpressionAccess().getEntityMappingExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEntityMappingExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getEntityMappingExpressionParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__Mapper__Group__0"
    // InternalDomainToDTO.g:248:1: rule__Mapper__Group__0 : rule__Mapper__Group__0__Impl rule__Mapper__Group__1 ;
    public final void rule__Mapper__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:252:1: ( rule__Mapper__Group__0__Impl rule__Mapper__Group__1 )
            // InternalDomainToDTO.g:253:2: rule__Mapper__Group__0__Impl rule__Mapper__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Mapper__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapper__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapper__Group__0"


    // $ANTLR start "rule__Mapper__Group__0__Impl"
    // InternalDomainToDTO.g:260:1: rule__Mapper__Group__0__Impl : ( 'mapper' ) ;
    public final void rule__Mapper__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:264:1: ( ( 'mapper' ) )
            // InternalDomainToDTO.g:265:1: ( 'mapper' )
            {
            // InternalDomainToDTO.g:265:1: ( 'mapper' )
            // InternalDomainToDTO.g:266:2: 'mapper'
            {
             before(grammarAccess.getMapperAccess().getMapperKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getMapperAccess().getMapperKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapper__Group__0__Impl"


    // $ANTLR start "rule__Mapper__Group__1"
    // InternalDomainToDTO.g:275:1: rule__Mapper__Group__1 : rule__Mapper__Group__1__Impl rule__Mapper__Group__2 ;
    public final void rule__Mapper__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:279:1: ( rule__Mapper__Group__1__Impl rule__Mapper__Group__2 )
            // InternalDomainToDTO.g:280:2: rule__Mapper__Group__1__Impl rule__Mapper__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Mapper__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapper__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapper__Group__1"


    // $ANTLR start "rule__Mapper__Group__1__Impl"
    // InternalDomainToDTO.g:287:1: rule__Mapper__Group__1__Impl : ( ( rule__Mapper__NameAssignment_1 ) ) ;
    public final void rule__Mapper__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:291:1: ( ( ( rule__Mapper__NameAssignment_1 ) ) )
            // InternalDomainToDTO.g:292:1: ( ( rule__Mapper__NameAssignment_1 ) )
            {
            // InternalDomainToDTO.g:292:1: ( ( rule__Mapper__NameAssignment_1 ) )
            // InternalDomainToDTO.g:293:2: ( rule__Mapper__NameAssignment_1 )
            {
             before(grammarAccess.getMapperAccess().getNameAssignment_1()); 
            // InternalDomainToDTO.g:294:2: ( rule__Mapper__NameAssignment_1 )
            // InternalDomainToDTO.g:294:3: rule__Mapper__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Mapper__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMapperAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapper__Group__1__Impl"


    // $ANTLR start "rule__Mapper__Group__2"
    // InternalDomainToDTO.g:302:1: rule__Mapper__Group__2 : rule__Mapper__Group__2__Impl rule__Mapper__Group__3 ;
    public final void rule__Mapper__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:306:1: ( rule__Mapper__Group__2__Impl rule__Mapper__Group__3 )
            // InternalDomainToDTO.g:307:2: rule__Mapper__Group__2__Impl rule__Mapper__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Mapper__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapper__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapper__Group__2"


    // $ANTLR start "rule__Mapper__Group__2__Impl"
    // InternalDomainToDTO.g:314:1: rule__Mapper__Group__2__Impl : ( 'dto' ) ;
    public final void rule__Mapper__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:318:1: ( ( 'dto' ) )
            // InternalDomainToDTO.g:319:1: ( 'dto' )
            {
            // InternalDomainToDTO.g:319:1: ( 'dto' )
            // InternalDomainToDTO.g:320:2: 'dto'
            {
             before(grammarAccess.getMapperAccess().getDtoKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMapperAccess().getDtoKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapper__Group__2__Impl"


    // $ANTLR start "rule__Mapper__Group__3"
    // InternalDomainToDTO.g:329:1: rule__Mapper__Group__3 : rule__Mapper__Group__3__Impl rule__Mapper__Group__4 ;
    public final void rule__Mapper__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:333:1: ( rule__Mapper__Group__3__Impl rule__Mapper__Group__4 )
            // InternalDomainToDTO.g:334:2: rule__Mapper__Group__3__Impl rule__Mapper__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Mapper__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapper__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapper__Group__3"


    // $ANTLR start "rule__Mapper__Group__3__Impl"
    // InternalDomainToDTO.g:341:1: rule__Mapper__Group__3__Impl : ( ( rule__Mapper__DtoAssignment_3 ) ) ;
    public final void rule__Mapper__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:345:1: ( ( ( rule__Mapper__DtoAssignment_3 ) ) )
            // InternalDomainToDTO.g:346:1: ( ( rule__Mapper__DtoAssignment_3 ) )
            {
            // InternalDomainToDTO.g:346:1: ( ( rule__Mapper__DtoAssignment_3 ) )
            // InternalDomainToDTO.g:347:2: ( rule__Mapper__DtoAssignment_3 )
            {
             before(grammarAccess.getMapperAccess().getDtoAssignment_3()); 
            // InternalDomainToDTO.g:348:2: ( rule__Mapper__DtoAssignment_3 )
            // InternalDomainToDTO.g:348:3: rule__Mapper__DtoAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Mapper__DtoAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMapperAccess().getDtoAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapper__Group__3__Impl"


    // $ANTLR start "rule__Mapper__Group__4"
    // InternalDomainToDTO.g:356:1: rule__Mapper__Group__4 : rule__Mapper__Group__4__Impl rule__Mapper__Group__5 ;
    public final void rule__Mapper__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:360:1: ( rule__Mapper__Group__4__Impl rule__Mapper__Group__5 )
            // InternalDomainToDTO.g:361:2: rule__Mapper__Group__4__Impl rule__Mapper__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Mapper__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapper__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapper__Group__4"


    // $ANTLR start "rule__Mapper__Group__4__Impl"
    // InternalDomainToDTO.g:368:1: rule__Mapper__Group__4__Impl : ( '{' ) ;
    public final void rule__Mapper__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:372:1: ( ( '{' ) )
            // InternalDomainToDTO.g:373:1: ( '{' )
            {
            // InternalDomainToDTO.g:373:1: ( '{' )
            // InternalDomainToDTO.g:374:2: '{'
            {
             before(grammarAccess.getMapperAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMapperAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapper__Group__4__Impl"


    // $ANTLR start "rule__Mapper__Group__5"
    // InternalDomainToDTO.g:383:1: rule__Mapper__Group__5 : rule__Mapper__Group__5__Impl rule__Mapper__Group__6 ;
    public final void rule__Mapper__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:387:1: ( rule__Mapper__Group__5__Impl rule__Mapper__Group__6 )
            // InternalDomainToDTO.g:388:2: rule__Mapper__Group__5__Impl rule__Mapper__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Mapper__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapper__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapper__Group__5"


    // $ANTLR start "rule__Mapper__Group__5__Impl"
    // InternalDomainToDTO.g:395:1: rule__Mapper__Group__5__Impl : ( ( rule__Mapper__AttributesAssignment_5 )* ) ;
    public final void rule__Mapper__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:399:1: ( ( ( rule__Mapper__AttributesAssignment_5 )* ) )
            // InternalDomainToDTO.g:400:1: ( ( rule__Mapper__AttributesAssignment_5 )* )
            {
            // InternalDomainToDTO.g:400:1: ( ( rule__Mapper__AttributesAssignment_5 )* )
            // InternalDomainToDTO.g:401:2: ( rule__Mapper__AttributesAssignment_5 )*
            {
             before(grammarAccess.getMapperAccess().getAttributesAssignment_5()); 
            // InternalDomainToDTO.g:402:2: ( rule__Mapper__AttributesAssignment_5 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDomainToDTO.g:402:3: rule__Mapper__AttributesAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Mapper__AttributesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getMapperAccess().getAttributesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapper__Group__5__Impl"


    // $ANTLR start "rule__Mapper__Group__6"
    // InternalDomainToDTO.g:410:1: rule__Mapper__Group__6 : rule__Mapper__Group__6__Impl ;
    public final void rule__Mapper__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:414:1: ( rule__Mapper__Group__6__Impl )
            // InternalDomainToDTO.g:415:2: rule__Mapper__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mapper__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapper__Group__6"


    // $ANTLR start "rule__Mapper__Group__6__Impl"
    // InternalDomainToDTO.g:421:1: rule__Mapper__Group__6__Impl : ( '}' ) ;
    public final void rule__Mapper__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:425:1: ( ( '}' ) )
            // InternalDomainToDTO.g:426:1: ( '}' )
            {
            // InternalDomainToDTO.g:426:1: ( '}' )
            // InternalDomainToDTO.g:427:2: '}'
            {
             before(grammarAccess.getMapperAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getMapperAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapper__Group__6__Impl"


    // $ANTLR start "rule__MappedAttribute__Group__0"
    // InternalDomainToDTO.g:437:1: rule__MappedAttribute__Group__0 : rule__MappedAttribute__Group__0__Impl rule__MappedAttribute__Group__1 ;
    public final void rule__MappedAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:441:1: ( rule__MappedAttribute__Group__0__Impl rule__MappedAttribute__Group__1 )
            // InternalDomainToDTO.g:442:2: rule__MappedAttribute__Group__0__Impl rule__MappedAttribute__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__MappedAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappedAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappedAttribute__Group__0"


    // $ANTLR start "rule__MappedAttribute__Group__0__Impl"
    // InternalDomainToDTO.g:449:1: rule__MappedAttribute__Group__0__Impl : ( ( rule__MappedAttribute__AttrAssignment_0 ) ) ;
    public final void rule__MappedAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:453:1: ( ( ( rule__MappedAttribute__AttrAssignment_0 ) ) )
            // InternalDomainToDTO.g:454:1: ( ( rule__MappedAttribute__AttrAssignment_0 ) )
            {
            // InternalDomainToDTO.g:454:1: ( ( rule__MappedAttribute__AttrAssignment_0 ) )
            // InternalDomainToDTO.g:455:2: ( rule__MappedAttribute__AttrAssignment_0 )
            {
             before(grammarAccess.getMappedAttributeAccess().getAttrAssignment_0()); 
            // InternalDomainToDTO.g:456:2: ( rule__MappedAttribute__AttrAssignment_0 )
            // InternalDomainToDTO.g:456:3: rule__MappedAttribute__AttrAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MappedAttribute__AttrAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMappedAttributeAccess().getAttrAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappedAttribute__Group__0__Impl"


    // $ANTLR start "rule__MappedAttribute__Group__1"
    // InternalDomainToDTO.g:464:1: rule__MappedAttribute__Group__1 : rule__MappedAttribute__Group__1__Impl rule__MappedAttribute__Group__2 ;
    public final void rule__MappedAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:468:1: ( rule__MappedAttribute__Group__1__Impl rule__MappedAttribute__Group__2 )
            // InternalDomainToDTO.g:469:2: rule__MappedAttribute__Group__1__Impl rule__MappedAttribute__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__MappedAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappedAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappedAttribute__Group__1"


    // $ANTLR start "rule__MappedAttribute__Group__1__Impl"
    // InternalDomainToDTO.g:476:1: rule__MappedAttribute__Group__1__Impl : ( '->' ) ;
    public final void rule__MappedAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:480:1: ( ( '->' ) )
            // InternalDomainToDTO.g:481:1: ( '->' )
            {
            // InternalDomainToDTO.g:481:1: ( '->' )
            // InternalDomainToDTO.g:482:2: '->'
            {
             before(grammarAccess.getMappedAttributeAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMappedAttributeAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappedAttribute__Group__1__Impl"


    // $ANTLR start "rule__MappedAttribute__Group__2"
    // InternalDomainToDTO.g:491:1: rule__MappedAttribute__Group__2 : rule__MappedAttribute__Group__2__Impl ;
    public final void rule__MappedAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:495:1: ( rule__MappedAttribute__Group__2__Impl )
            // InternalDomainToDTO.g:496:2: rule__MappedAttribute__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MappedAttribute__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappedAttribute__Group__2"


    // $ANTLR start "rule__MappedAttribute__Group__2__Impl"
    // InternalDomainToDTO.g:502:1: rule__MappedAttribute__Group__2__Impl : ( ( rule__MappedAttribute__MappingAssignment_2 ) ) ;
    public final void rule__MappedAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:506:1: ( ( ( rule__MappedAttribute__MappingAssignment_2 ) ) )
            // InternalDomainToDTO.g:507:1: ( ( rule__MappedAttribute__MappingAssignment_2 ) )
            {
            // InternalDomainToDTO.g:507:1: ( ( rule__MappedAttribute__MappingAssignment_2 ) )
            // InternalDomainToDTO.g:508:2: ( rule__MappedAttribute__MappingAssignment_2 )
            {
             before(grammarAccess.getMappedAttributeAccess().getMappingAssignment_2()); 
            // InternalDomainToDTO.g:509:2: ( rule__MappedAttribute__MappingAssignment_2 )
            // InternalDomainToDTO.g:509:3: rule__MappedAttribute__MappingAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MappedAttribute__MappingAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMappedAttributeAccess().getMappingAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappedAttribute__Group__2__Impl"


    // $ANTLR start "rule__MemberSelectionExpression__Group__0"
    // InternalDomainToDTO.g:518:1: rule__MemberSelectionExpression__Group__0 : rule__MemberSelectionExpression__Group__0__Impl rule__MemberSelectionExpression__Group__1 ;
    public final void rule__MemberSelectionExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:522:1: ( rule__MemberSelectionExpression__Group__0__Impl rule__MemberSelectionExpression__Group__1 )
            // InternalDomainToDTO.g:523:2: rule__MemberSelectionExpression__Group__0__Impl rule__MemberSelectionExpression__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__MemberSelectionExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemberSelectionExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberSelectionExpression__Group__0"


    // $ANTLR start "rule__MemberSelectionExpression__Group__0__Impl"
    // InternalDomainToDTO.g:530:1: rule__MemberSelectionExpression__Group__0__Impl : ( ruleAtomExpression ) ;
    public final void rule__MemberSelectionExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:534:1: ( ( ruleAtomExpression ) )
            // InternalDomainToDTO.g:535:1: ( ruleAtomExpression )
            {
            // InternalDomainToDTO.g:535:1: ( ruleAtomExpression )
            // InternalDomainToDTO.g:536:2: ruleAtomExpression
            {
             before(grammarAccess.getMemberSelectionExpressionAccess().getAtomExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAtomExpression();

            state._fsp--;

             after(grammarAccess.getMemberSelectionExpressionAccess().getAtomExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberSelectionExpression__Group__0__Impl"


    // $ANTLR start "rule__MemberSelectionExpression__Group__1"
    // InternalDomainToDTO.g:545:1: rule__MemberSelectionExpression__Group__1 : rule__MemberSelectionExpression__Group__1__Impl ;
    public final void rule__MemberSelectionExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:549:1: ( rule__MemberSelectionExpression__Group__1__Impl )
            // InternalDomainToDTO.g:550:2: rule__MemberSelectionExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MemberSelectionExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberSelectionExpression__Group__1"


    // $ANTLR start "rule__MemberSelectionExpression__Group__1__Impl"
    // InternalDomainToDTO.g:556:1: rule__MemberSelectionExpression__Group__1__Impl : ( ( rule__MemberSelectionExpression__Group_1__0 )* ) ;
    public final void rule__MemberSelectionExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:560:1: ( ( ( rule__MemberSelectionExpression__Group_1__0 )* ) )
            // InternalDomainToDTO.g:561:1: ( ( rule__MemberSelectionExpression__Group_1__0 )* )
            {
            // InternalDomainToDTO.g:561:1: ( ( rule__MemberSelectionExpression__Group_1__0 )* )
            // InternalDomainToDTO.g:562:2: ( rule__MemberSelectionExpression__Group_1__0 )*
            {
             before(grammarAccess.getMemberSelectionExpressionAccess().getGroup_1()); 
            // InternalDomainToDTO.g:563:2: ( rule__MemberSelectionExpression__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDomainToDTO.g:563:3: rule__MemberSelectionExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__MemberSelectionExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getMemberSelectionExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberSelectionExpression__Group__1__Impl"


    // $ANTLR start "rule__MemberSelectionExpression__Group_1__0"
    // InternalDomainToDTO.g:572:1: rule__MemberSelectionExpression__Group_1__0 : rule__MemberSelectionExpression__Group_1__0__Impl rule__MemberSelectionExpression__Group_1__1 ;
    public final void rule__MemberSelectionExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:576:1: ( rule__MemberSelectionExpression__Group_1__0__Impl rule__MemberSelectionExpression__Group_1__1 )
            // InternalDomainToDTO.g:577:2: rule__MemberSelectionExpression__Group_1__0__Impl rule__MemberSelectionExpression__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__MemberSelectionExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemberSelectionExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberSelectionExpression__Group_1__0"


    // $ANTLR start "rule__MemberSelectionExpression__Group_1__0__Impl"
    // InternalDomainToDTO.g:584:1: rule__MemberSelectionExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MemberSelectionExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:588:1: ( ( () ) )
            // InternalDomainToDTO.g:589:1: ( () )
            {
            // InternalDomainToDTO.g:589:1: ( () )
            // InternalDomainToDTO.g:590:2: ()
            {
             before(grammarAccess.getMemberSelectionExpressionAccess().getMemberSelectionExpressionReceiverAction_1_0()); 
            // InternalDomainToDTO.g:591:2: ()
            // InternalDomainToDTO.g:591:3: 
            {
            }

             after(grammarAccess.getMemberSelectionExpressionAccess().getMemberSelectionExpressionReceiverAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberSelectionExpression__Group_1__0__Impl"


    // $ANTLR start "rule__MemberSelectionExpression__Group_1__1"
    // InternalDomainToDTO.g:599:1: rule__MemberSelectionExpression__Group_1__1 : rule__MemberSelectionExpression__Group_1__1__Impl rule__MemberSelectionExpression__Group_1__2 ;
    public final void rule__MemberSelectionExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:603:1: ( rule__MemberSelectionExpression__Group_1__1__Impl rule__MemberSelectionExpression__Group_1__2 )
            // InternalDomainToDTO.g:604:2: rule__MemberSelectionExpression__Group_1__1__Impl rule__MemberSelectionExpression__Group_1__2
            {
            pushFollow(FOLLOW_4);
            rule__MemberSelectionExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemberSelectionExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberSelectionExpression__Group_1__1"


    // $ANTLR start "rule__MemberSelectionExpression__Group_1__1__Impl"
    // InternalDomainToDTO.g:611:1: rule__MemberSelectionExpression__Group_1__1__Impl : ( '.' ) ;
    public final void rule__MemberSelectionExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:615:1: ( ( '.' ) )
            // InternalDomainToDTO.g:616:1: ( '.' )
            {
            // InternalDomainToDTO.g:616:1: ( '.' )
            // InternalDomainToDTO.g:617:2: '.'
            {
             before(grammarAccess.getMemberSelectionExpressionAccess().getFullStopKeyword_1_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMemberSelectionExpressionAccess().getFullStopKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberSelectionExpression__Group_1__1__Impl"


    // $ANTLR start "rule__MemberSelectionExpression__Group_1__2"
    // InternalDomainToDTO.g:626:1: rule__MemberSelectionExpression__Group_1__2 : rule__MemberSelectionExpression__Group_1__2__Impl ;
    public final void rule__MemberSelectionExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:630:1: ( rule__MemberSelectionExpression__Group_1__2__Impl )
            // InternalDomainToDTO.g:631:2: rule__MemberSelectionExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MemberSelectionExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberSelectionExpression__Group_1__2"


    // $ANTLR start "rule__MemberSelectionExpression__Group_1__2__Impl"
    // InternalDomainToDTO.g:637:1: rule__MemberSelectionExpression__Group_1__2__Impl : ( ( rule__MemberSelectionExpression__MemberAssignment_1_2 ) ) ;
    public final void rule__MemberSelectionExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:641:1: ( ( ( rule__MemberSelectionExpression__MemberAssignment_1_2 ) ) )
            // InternalDomainToDTO.g:642:1: ( ( rule__MemberSelectionExpression__MemberAssignment_1_2 ) )
            {
            // InternalDomainToDTO.g:642:1: ( ( rule__MemberSelectionExpression__MemberAssignment_1_2 ) )
            // InternalDomainToDTO.g:643:2: ( rule__MemberSelectionExpression__MemberAssignment_1_2 )
            {
             before(grammarAccess.getMemberSelectionExpressionAccess().getMemberAssignment_1_2()); 
            // InternalDomainToDTO.g:644:2: ( rule__MemberSelectionExpression__MemberAssignment_1_2 )
            // InternalDomainToDTO.g:644:3: rule__MemberSelectionExpression__MemberAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__MemberSelectionExpression__MemberAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMemberSelectionExpressionAccess().getMemberAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberSelectionExpression__Group_1__2__Impl"


    // $ANTLR start "rule__EntityMappingExpression__Group__0"
    // InternalDomainToDTO.g:653:1: rule__EntityMappingExpression__Group__0 : rule__EntityMappingExpression__Group__0__Impl rule__EntityMappingExpression__Group__1 ;
    public final void rule__EntityMappingExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:657:1: ( rule__EntityMappingExpression__Group__0__Impl rule__EntityMappingExpression__Group__1 )
            // InternalDomainToDTO.g:658:2: rule__EntityMappingExpression__Group__0__Impl rule__EntityMappingExpression__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__EntityMappingExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityMappingExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityMappingExpression__Group__0"


    // $ANTLR start "rule__EntityMappingExpression__Group__0__Impl"
    // InternalDomainToDTO.g:665:1: rule__EntityMappingExpression__Group__0__Impl : ( () ) ;
    public final void rule__EntityMappingExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:669:1: ( ( () ) )
            // InternalDomainToDTO.g:670:1: ( () )
            {
            // InternalDomainToDTO.g:670:1: ( () )
            // InternalDomainToDTO.g:671:2: ()
            {
             before(grammarAccess.getEntityMappingExpressionAccess().getEntityMappingExpressionAction_0()); 
            // InternalDomainToDTO.g:672:2: ()
            // InternalDomainToDTO.g:672:3: 
            {
            }

             after(grammarAccess.getEntityMappingExpressionAccess().getEntityMappingExpressionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityMappingExpression__Group__0__Impl"


    // $ANTLR start "rule__EntityMappingExpression__Group__1"
    // InternalDomainToDTO.g:680:1: rule__EntityMappingExpression__Group__1 : rule__EntityMappingExpression__Group__1__Impl rule__EntityMappingExpression__Group__2 ;
    public final void rule__EntityMappingExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:684:1: ( rule__EntityMappingExpression__Group__1__Impl rule__EntityMappingExpression__Group__2 )
            // InternalDomainToDTO.g:685:2: rule__EntityMappingExpression__Group__1__Impl rule__EntityMappingExpression__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__EntityMappingExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityMappingExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityMappingExpression__Group__1"


    // $ANTLR start "rule__EntityMappingExpression__Group__1__Impl"
    // InternalDomainToDTO.g:692:1: rule__EntityMappingExpression__Group__1__Impl : ( 'map' ) ;
    public final void rule__EntityMappingExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:696:1: ( ( 'map' ) )
            // InternalDomainToDTO.g:697:1: ( 'map' )
            {
            // InternalDomainToDTO.g:697:1: ( 'map' )
            // InternalDomainToDTO.g:698:2: 'map'
            {
             before(grammarAccess.getEntityMappingExpressionAccess().getMapKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEntityMappingExpressionAccess().getMapKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityMappingExpression__Group__1__Impl"


    // $ANTLR start "rule__EntityMappingExpression__Group__2"
    // InternalDomainToDTO.g:707:1: rule__EntityMappingExpression__Group__2 : rule__EntityMappingExpression__Group__2__Impl rule__EntityMappingExpression__Group__3 ;
    public final void rule__EntityMappingExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:711:1: ( rule__EntityMappingExpression__Group__2__Impl rule__EntityMappingExpression__Group__3 )
            // InternalDomainToDTO.g:712:2: rule__EntityMappingExpression__Group__2__Impl rule__EntityMappingExpression__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__EntityMappingExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityMappingExpression__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityMappingExpression__Group__2"


    // $ANTLR start "rule__EntityMappingExpression__Group__2__Impl"
    // InternalDomainToDTO.g:719:1: rule__EntityMappingExpression__Group__2__Impl : ( ( rule__EntityMappingExpression__MappedEntityAssignment_2 ) ) ;
    public final void rule__EntityMappingExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:723:1: ( ( ( rule__EntityMappingExpression__MappedEntityAssignment_2 ) ) )
            // InternalDomainToDTO.g:724:1: ( ( rule__EntityMappingExpression__MappedEntityAssignment_2 ) )
            {
            // InternalDomainToDTO.g:724:1: ( ( rule__EntityMappingExpression__MappedEntityAssignment_2 ) )
            // InternalDomainToDTO.g:725:2: ( rule__EntityMappingExpression__MappedEntityAssignment_2 )
            {
             before(grammarAccess.getEntityMappingExpressionAccess().getMappedEntityAssignment_2()); 
            // InternalDomainToDTO.g:726:2: ( rule__EntityMappingExpression__MappedEntityAssignment_2 )
            // InternalDomainToDTO.g:726:3: rule__EntityMappingExpression__MappedEntityAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EntityMappingExpression__MappedEntityAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityMappingExpressionAccess().getMappedEntityAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityMappingExpression__Group__2__Impl"


    // $ANTLR start "rule__EntityMappingExpression__Group__3"
    // InternalDomainToDTO.g:734:1: rule__EntityMappingExpression__Group__3 : rule__EntityMappingExpression__Group__3__Impl rule__EntityMappingExpression__Group__4 ;
    public final void rule__EntityMappingExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:738:1: ( rule__EntityMappingExpression__Group__3__Impl rule__EntityMappingExpression__Group__4 )
            // InternalDomainToDTO.g:739:2: rule__EntityMappingExpression__Group__3__Impl rule__EntityMappingExpression__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__EntityMappingExpression__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityMappingExpression__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityMappingExpression__Group__3"


    // $ANTLR start "rule__EntityMappingExpression__Group__3__Impl"
    // InternalDomainToDTO.g:746:1: rule__EntityMappingExpression__Group__3__Impl : ( 'with' ) ;
    public final void rule__EntityMappingExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:750:1: ( ( 'with' ) )
            // InternalDomainToDTO.g:751:1: ( 'with' )
            {
            // InternalDomainToDTO.g:751:1: ( 'with' )
            // InternalDomainToDTO.g:752:2: 'with'
            {
             before(grammarAccess.getEntityMappingExpressionAccess().getWithKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEntityMappingExpressionAccess().getWithKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityMappingExpression__Group__3__Impl"


    // $ANTLR start "rule__EntityMappingExpression__Group__4"
    // InternalDomainToDTO.g:761:1: rule__EntityMappingExpression__Group__4 : rule__EntityMappingExpression__Group__4__Impl ;
    public final void rule__EntityMappingExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:765:1: ( rule__EntityMappingExpression__Group__4__Impl )
            // InternalDomainToDTO.g:766:2: rule__EntityMappingExpression__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntityMappingExpression__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityMappingExpression__Group__4"


    // $ANTLR start "rule__EntityMappingExpression__Group__4__Impl"
    // InternalDomainToDTO.g:772:1: rule__EntityMappingExpression__Group__4__Impl : ( ( rule__EntityMappingExpression__MapperAssignment_4 ) ) ;
    public final void rule__EntityMappingExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:776:1: ( ( ( rule__EntityMappingExpression__MapperAssignment_4 ) ) )
            // InternalDomainToDTO.g:777:1: ( ( rule__EntityMappingExpression__MapperAssignment_4 ) )
            {
            // InternalDomainToDTO.g:777:1: ( ( rule__EntityMappingExpression__MapperAssignment_4 ) )
            // InternalDomainToDTO.g:778:2: ( rule__EntityMappingExpression__MapperAssignment_4 )
            {
             before(grammarAccess.getEntityMappingExpressionAccess().getMapperAssignment_4()); 
            // InternalDomainToDTO.g:779:2: ( rule__EntityMappingExpression__MapperAssignment_4 )
            // InternalDomainToDTO.g:779:3: rule__EntityMappingExpression__MapperAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__EntityMappingExpression__MapperAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEntityMappingExpressionAccess().getMapperAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityMappingExpression__Group__4__Impl"


    // $ANTLR start "rule__AtomExpression__Group__0"
    // InternalDomainToDTO.g:788:1: rule__AtomExpression__Group__0 : rule__AtomExpression__Group__0__Impl rule__AtomExpression__Group__1 ;
    public final void rule__AtomExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:792:1: ( rule__AtomExpression__Group__0__Impl rule__AtomExpression__Group__1 )
            // InternalDomainToDTO.g:793:2: rule__AtomExpression__Group__0__Impl rule__AtomExpression__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__AtomExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomExpression__Group__0"


    // $ANTLR start "rule__AtomExpression__Group__0__Impl"
    // InternalDomainToDTO.g:800:1: rule__AtomExpression__Group__0__Impl : ( () ) ;
    public final void rule__AtomExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:804:1: ( ( () ) )
            // InternalDomainToDTO.g:805:1: ( () )
            {
            // InternalDomainToDTO.g:805:1: ( () )
            // InternalDomainToDTO.g:806:2: ()
            {
             before(grammarAccess.getAtomExpressionAccess().getStaticEntityRefAction_0()); 
            // InternalDomainToDTO.g:807:2: ()
            // InternalDomainToDTO.g:807:3: 
            {
            }

             after(grammarAccess.getAtomExpressionAccess().getStaticEntityRefAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomExpression__Group__0__Impl"


    // $ANTLR start "rule__AtomExpression__Group__1"
    // InternalDomainToDTO.g:815:1: rule__AtomExpression__Group__1 : rule__AtomExpression__Group__1__Impl ;
    public final void rule__AtomExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:819:1: ( rule__AtomExpression__Group__1__Impl )
            // InternalDomainToDTO.g:820:2: rule__AtomExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomExpression__Group__1"


    // $ANTLR start "rule__AtomExpression__Group__1__Impl"
    // InternalDomainToDTO.g:826:1: rule__AtomExpression__Group__1__Impl : ( ( rule__AtomExpression__ReferenceAssignment_1 ) ) ;
    public final void rule__AtomExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:830:1: ( ( ( rule__AtomExpression__ReferenceAssignment_1 ) ) )
            // InternalDomainToDTO.g:831:1: ( ( rule__AtomExpression__ReferenceAssignment_1 ) )
            {
            // InternalDomainToDTO.g:831:1: ( ( rule__AtomExpression__ReferenceAssignment_1 ) )
            // InternalDomainToDTO.g:832:2: ( rule__AtomExpression__ReferenceAssignment_1 )
            {
             before(grammarAccess.getAtomExpressionAccess().getReferenceAssignment_1()); 
            // InternalDomainToDTO.g:833:2: ( rule__AtomExpression__ReferenceAssignment_1 )
            // InternalDomainToDTO.g:833:3: rule__AtomExpression__ReferenceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AtomExpression__ReferenceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomExpressionAccess().getReferenceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomExpression__Group__1__Impl"


    // $ANTLR start "rule__MappingModel__MappersAssignment"
    // InternalDomainToDTO.g:842:1: rule__MappingModel__MappersAssignment : ( ruleMapper ) ;
    public final void rule__MappingModel__MappersAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:846:1: ( ( ruleMapper ) )
            // InternalDomainToDTO.g:847:2: ( ruleMapper )
            {
            // InternalDomainToDTO.g:847:2: ( ruleMapper )
            // InternalDomainToDTO.g:848:3: ruleMapper
            {
             before(grammarAccess.getMappingModelAccess().getMappersMapperParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMapper();

            state._fsp--;

             after(grammarAccess.getMappingModelAccess().getMappersMapperParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__MappersAssignment"


    // $ANTLR start "rule__Mapper__NameAssignment_1"
    // InternalDomainToDTO.g:857:1: rule__Mapper__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Mapper__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:861:1: ( ( RULE_ID ) )
            // InternalDomainToDTO.g:862:2: ( RULE_ID )
            {
            // InternalDomainToDTO.g:862:2: ( RULE_ID )
            // InternalDomainToDTO.g:863:3: RULE_ID
            {
             before(grammarAccess.getMapperAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMapperAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapper__NameAssignment_1"


    // $ANTLR start "rule__Mapper__DtoAssignment_3"
    // InternalDomainToDTO.g:872:1: rule__Mapper__DtoAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Mapper__DtoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:876:1: ( ( ( RULE_ID ) ) )
            // InternalDomainToDTO.g:877:2: ( ( RULE_ID ) )
            {
            // InternalDomainToDTO.g:877:2: ( ( RULE_ID ) )
            // InternalDomainToDTO.g:878:3: ( RULE_ID )
            {
             before(grammarAccess.getMapperAccess().getDtoDTOClassCrossReference_3_0()); 
            // InternalDomainToDTO.g:879:3: ( RULE_ID )
            // InternalDomainToDTO.g:880:4: RULE_ID
            {
             before(grammarAccess.getMapperAccess().getDtoDTOClassIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMapperAccess().getDtoDTOClassIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getMapperAccess().getDtoDTOClassCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapper__DtoAssignment_3"


    // $ANTLR start "rule__Mapper__AttributesAssignment_5"
    // InternalDomainToDTO.g:891:1: rule__Mapper__AttributesAssignment_5 : ( ruleMappedAttribute ) ;
    public final void rule__Mapper__AttributesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:895:1: ( ( ruleMappedAttribute ) )
            // InternalDomainToDTO.g:896:2: ( ruleMappedAttribute )
            {
            // InternalDomainToDTO.g:896:2: ( ruleMappedAttribute )
            // InternalDomainToDTO.g:897:3: ruleMappedAttribute
            {
             before(grammarAccess.getMapperAccess().getAttributesMappedAttributeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleMappedAttribute();

            state._fsp--;

             after(grammarAccess.getMapperAccess().getAttributesMappedAttributeParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapper__AttributesAssignment_5"


    // $ANTLR start "rule__MappedAttribute__AttrAssignment_0"
    // InternalDomainToDTO.g:906:1: rule__MappedAttribute__AttrAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__MappedAttribute__AttrAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:910:1: ( ( ( RULE_ID ) ) )
            // InternalDomainToDTO.g:911:2: ( ( RULE_ID ) )
            {
            // InternalDomainToDTO.g:911:2: ( ( RULE_ID ) )
            // InternalDomainToDTO.g:912:3: ( RULE_ID )
            {
             before(grammarAccess.getMappedAttributeAccess().getAttrAttributeCrossReference_0_0()); 
            // InternalDomainToDTO.g:913:3: ( RULE_ID )
            // InternalDomainToDTO.g:914:4: RULE_ID
            {
             before(grammarAccess.getMappedAttributeAccess().getAttrAttributeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMappedAttributeAccess().getAttrAttributeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getMappedAttributeAccess().getAttrAttributeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappedAttribute__AttrAssignment_0"


    // $ANTLR start "rule__MappedAttribute__MappingAssignment_2"
    // InternalDomainToDTO.g:925:1: rule__MappedAttribute__MappingAssignment_2 : ( ruleExpression ) ;
    public final void rule__MappedAttribute__MappingAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:929:1: ( ( ruleExpression ) )
            // InternalDomainToDTO.g:930:2: ( ruleExpression )
            {
            // InternalDomainToDTO.g:930:2: ( ruleExpression )
            // InternalDomainToDTO.g:931:3: ruleExpression
            {
             before(grammarAccess.getMappedAttributeAccess().getMappingExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getMappedAttributeAccess().getMappingExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappedAttribute__MappingAssignment_2"


    // $ANTLR start "rule__MemberSelectionExpression__MemberAssignment_1_2"
    // InternalDomainToDTO.g:940:1: rule__MemberSelectionExpression__MemberAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__MemberSelectionExpression__MemberAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:944:1: ( ( ( RULE_ID ) ) )
            // InternalDomainToDTO.g:945:2: ( ( RULE_ID ) )
            {
            // InternalDomainToDTO.g:945:2: ( ( RULE_ID ) )
            // InternalDomainToDTO.g:946:3: ( RULE_ID )
            {
             before(grammarAccess.getMemberSelectionExpressionAccess().getMemberAttributeCrossReference_1_2_0()); 
            // InternalDomainToDTO.g:947:3: ( RULE_ID )
            // InternalDomainToDTO.g:948:4: RULE_ID
            {
             before(grammarAccess.getMemberSelectionExpressionAccess().getMemberAttributeIDTerminalRuleCall_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMemberSelectionExpressionAccess().getMemberAttributeIDTerminalRuleCall_1_2_0_1()); 

            }

             after(grammarAccess.getMemberSelectionExpressionAccess().getMemberAttributeCrossReference_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberSelectionExpression__MemberAssignment_1_2"


    // $ANTLR start "rule__EntityMappingExpression__MappedEntityAssignment_2"
    // InternalDomainToDTO.g:959:1: rule__EntityMappingExpression__MappedEntityAssignment_2 : ( ruleMemberSelectionExpression ) ;
    public final void rule__EntityMappingExpression__MappedEntityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:963:1: ( ( ruleMemberSelectionExpression ) )
            // InternalDomainToDTO.g:964:2: ( ruleMemberSelectionExpression )
            {
            // InternalDomainToDTO.g:964:2: ( ruleMemberSelectionExpression )
            // InternalDomainToDTO.g:965:3: ruleMemberSelectionExpression
            {
             before(grammarAccess.getEntityMappingExpressionAccess().getMappedEntityMemberSelectionExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMemberSelectionExpression();

            state._fsp--;

             after(grammarAccess.getEntityMappingExpressionAccess().getMappedEntityMemberSelectionExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityMappingExpression__MappedEntityAssignment_2"


    // $ANTLR start "rule__EntityMappingExpression__MapperAssignment_4"
    // InternalDomainToDTO.g:974:1: rule__EntityMappingExpression__MapperAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__EntityMappingExpression__MapperAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:978:1: ( ( ( RULE_ID ) ) )
            // InternalDomainToDTO.g:979:2: ( ( RULE_ID ) )
            {
            // InternalDomainToDTO.g:979:2: ( ( RULE_ID ) )
            // InternalDomainToDTO.g:980:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityMappingExpressionAccess().getMapperMapperCrossReference_4_0()); 
            // InternalDomainToDTO.g:981:3: ( RULE_ID )
            // InternalDomainToDTO.g:982:4: RULE_ID
            {
             before(grammarAccess.getEntityMappingExpressionAccess().getMapperMapperIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityMappingExpressionAccess().getMapperMapperIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getEntityMappingExpressionAccess().getMapperMapperCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityMappingExpression__MapperAssignment_4"


    // $ANTLR start "rule__AtomExpression__ReferenceAssignment_1"
    // InternalDomainToDTO.g:993:1: rule__AtomExpression__ReferenceAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__AtomExpression__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainToDTO.g:997:1: ( ( ( RULE_ID ) ) )
            // InternalDomainToDTO.g:998:2: ( ( RULE_ID ) )
            {
            // InternalDomainToDTO.g:998:2: ( ( RULE_ID ) )
            // InternalDomainToDTO.g:999:3: ( RULE_ID )
            {
             before(grammarAccess.getAtomExpressionAccess().getReferenceEntityCrossReference_1_0()); 
            // InternalDomainToDTO.g:1000:3: ( RULE_ID )
            // InternalDomainToDTO.g:1001:4: RULE_ID
            {
             before(grammarAccess.getAtomExpressionAccess().getReferenceEntityIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAtomExpressionAccess().getReferenceEntityIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getAtomExpressionAccess().getReferenceEntityCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomExpression__ReferenceAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});

}
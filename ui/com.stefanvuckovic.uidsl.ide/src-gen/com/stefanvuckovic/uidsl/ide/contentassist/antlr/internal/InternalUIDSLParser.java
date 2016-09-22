package com.stefanvuckovic.uidsl.ide.contentassist.antlr.internal;

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
import com.stefanvuckovic.uidsl.services.UIDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUIDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'SINGLE_TABLE'", "'TABLE_PER_CONCRETE_CLASS'", "'TABLE_PER_CLASS'", "'one'", "'many'", "'server_component'", "'{'", "'}'", "';'", "'('", "')'", "','", "'page'", "'template'", "'fragment'", "'.'", "'class'", "'extends'", "'text'", "'email'", "'password'", "'file'", "'image'", "'enum'", "'L'", "'/'", "'null'", "'inheritance'", "'='", "'string'", "'int'", "'long'", "'boolean'", "'date'", "'List'", "'<'", "'>'", "'relationshipOwner'", "'reverse_cardinality'", "'deleteByFlag'", "'required'", "'partOf'"
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

    	public void setGrammarAccess(UIDSLGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleUIModel"
    // InternalUIDSL.g:53:1: entryRuleUIModel : ruleUIModel EOF ;
    public final void entryRuleUIModel() throws RecognitionException {
        try {
            // InternalUIDSL.g:54:1: ( ruleUIModel EOF )
            // InternalUIDSL.g:55:1: ruleUIModel EOF
            {
             before(grammarAccess.getUIModelRule()); 
            pushFollow(FOLLOW_1);
            ruleUIModel();

            state._fsp--;

             after(grammarAccess.getUIModelRule()); 
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
    // $ANTLR end "entryRuleUIModel"


    // $ANTLR start "ruleUIModel"
    // InternalUIDSL.g:62:1: ruleUIModel : ( ( rule__UIModel__ConceptsAssignment )* ) ;
    public final void ruleUIModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:66:2: ( ( ( rule__UIModel__ConceptsAssignment )* ) )
            // InternalUIDSL.g:67:2: ( ( rule__UIModel__ConceptsAssignment )* )
            {
            // InternalUIDSL.g:67:2: ( ( rule__UIModel__ConceptsAssignment )* )
            // InternalUIDSL.g:68:3: ( rule__UIModel__ConceptsAssignment )*
            {
             before(grammarAccess.getUIModelAccess().getConceptsAssignment()); 
            // InternalUIDSL.g:69:3: ( rule__UIModel__ConceptsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18||(LA1_0>=25 && LA1_0<=27)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUIDSL.g:69:4: rule__UIModel__ConceptsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__UIModel__ConceptsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getUIModelAccess().getConceptsAssignment()); 

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
    // $ANTLR end "ruleUIModel"


    // $ANTLR start "entryRuleUIConcept"
    // InternalUIDSL.g:78:1: entryRuleUIConcept : ruleUIConcept EOF ;
    public final void entryRuleUIConcept() throws RecognitionException {
        try {
            // InternalUIDSL.g:79:1: ( ruleUIConcept EOF )
            // InternalUIDSL.g:80:1: ruleUIConcept EOF
            {
             before(grammarAccess.getUIConceptRule()); 
            pushFollow(FOLLOW_1);
            ruleUIConcept();

            state._fsp--;

             after(grammarAccess.getUIConceptRule()); 
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
    // $ANTLR end "entryRuleUIConcept"


    // $ANTLR start "ruleUIConcept"
    // InternalUIDSL.g:87:1: ruleUIConcept : ( ( rule__UIConcept__Alternatives ) ) ;
    public final void ruleUIConcept() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:91:2: ( ( ( rule__UIConcept__Alternatives ) ) )
            // InternalUIDSL.g:92:2: ( ( rule__UIConcept__Alternatives ) )
            {
            // InternalUIDSL.g:92:2: ( ( rule__UIConcept__Alternatives ) )
            // InternalUIDSL.g:93:3: ( rule__UIConcept__Alternatives )
            {
             before(grammarAccess.getUIConceptAccess().getAlternatives()); 
            // InternalUIDSL.g:94:3: ( rule__UIConcept__Alternatives )
            // InternalUIDSL.g:94:4: rule__UIConcept__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UIConcept__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUIConceptAccess().getAlternatives()); 

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
    // $ANTLR end "ruleUIConcept"


    // $ANTLR start "entryRuleConcept"
    // InternalUIDSL.g:103:1: entryRuleConcept : ruleConcept EOF ;
    public final void entryRuleConcept() throws RecognitionException {
        try {
            // InternalUIDSL.g:104:1: ( ruleConcept EOF )
            // InternalUIDSL.g:105:1: ruleConcept EOF
            {
             before(grammarAccess.getConceptRule()); 
            pushFollow(FOLLOW_1);
            ruleConcept();

            state._fsp--;

             after(grammarAccess.getConceptRule()); 
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
    // $ANTLR end "entryRuleConcept"


    // $ANTLR start "ruleConcept"
    // InternalUIDSL.g:112:1: ruleConcept : ( ( rule__Concept__Alternatives ) ) ;
    public final void ruleConcept() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:116:2: ( ( ( rule__Concept__Alternatives ) ) )
            // InternalUIDSL.g:117:2: ( ( rule__Concept__Alternatives ) )
            {
            // InternalUIDSL.g:117:2: ( ( rule__Concept__Alternatives ) )
            // InternalUIDSL.g:118:3: ( rule__Concept__Alternatives )
            {
             before(grammarAccess.getConceptAccess().getAlternatives()); 
            // InternalUIDSL.g:119:3: ( rule__Concept__Alternatives )
            // InternalUIDSL.g:119:4: rule__Concept__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Concept__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConceptAccess().getAlternatives()); 

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
    // $ANTLR end "ruleConcept"


    // $ANTLR start "entryRuleServerComponent"
    // InternalUIDSL.g:128:1: entryRuleServerComponent : ruleServerComponent EOF ;
    public final void entryRuleServerComponent() throws RecognitionException {
        try {
            // InternalUIDSL.g:129:1: ( ruleServerComponent EOF )
            // InternalUIDSL.g:130:1: ruleServerComponent EOF
            {
             before(grammarAccess.getServerComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleServerComponent();

            state._fsp--;

             after(grammarAccess.getServerComponentRule()); 
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
    // $ANTLR end "entryRuleServerComponent"


    // $ANTLR start "ruleServerComponent"
    // InternalUIDSL.g:137:1: ruleServerComponent : ( ( rule__ServerComponent__Group__0 ) ) ;
    public final void ruleServerComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:141:2: ( ( ( rule__ServerComponent__Group__0 ) ) )
            // InternalUIDSL.g:142:2: ( ( rule__ServerComponent__Group__0 ) )
            {
            // InternalUIDSL.g:142:2: ( ( rule__ServerComponent__Group__0 ) )
            // InternalUIDSL.g:143:3: ( rule__ServerComponent__Group__0 )
            {
             before(grammarAccess.getServerComponentAccess().getGroup()); 
            // InternalUIDSL.g:144:3: ( rule__ServerComponent__Group__0 )
            // InternalUIDSL.g:144:4: rule__ServerComponent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ServerComponent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServerComponentAccess().getGroup()); 

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
    // $ANTLR end "ruleServerComponent"


    // $ANTLR start "entryRuleMember"
    // InternalUIDSL.g:153:1: entryRuleMember : ruleMember EOF ;
    public final void entryRuleMember() throws RecognitionException {
        try {
            // InternalUIDSL.g:154:1: ( ruleMember EOF )
            // InternalUIDSL.g:155:1: ruleMember EOF
            {
             before(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_1);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getMemberRule()); 
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
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // InternalUIDSL.g:162:1: ruleMember : ( ( rule__Member__Alternatives ) ) ;
    public final void ruleMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:166:2: ( ( ( rule__Member__Alternatives ) ) )
            // InternalUIDSL.g:167:2: ( ( rule__Member__Alternatives ) )
            {
            // InternalUIDSL.g:167:2: ( ( rule__Member__Alternatives ) )
            // InternalUIDSL.g:168:3: ( rule__Member__Alternatives )
            {
             before(grammarAccess.getMemberAccess().getAlternatives()); 
            // InternalUIDSL.g:169:3: ( rule__Member__Alternatives )
            // InternalUIDSL.g:169:4: rule__Member__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Member__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleField"
    // InternalUIDSL.g:178:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // InternalUIDSL.g:179:1: ( ruleField EOF )
            // InternalUIDSL.g:180:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalUIDSL.g:187:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:191:2: ( ( ( rule__Field__Group__0 ) ) )
            // InternalUIDSL.g:192:2: ( ( rule__Field__Group__0 ) )
            {
            // InternalUIDSL.g:192:2: ( ( rule__Field__Group__0 ) )
            // InternalUIDSL.g:193:3: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // InternalUIDSL.g:194:3: ( rule__Field__Group__0 )
            // InternalUIDSL.g:194:4: rule__Field__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getGroup()); 

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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleMethod"
    // InternalUIDSL.g:203:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // InternalUIDSL.g:204:1: ( ruleMethod EOF )
            // InternalUIDSL.g:205:1: ruleMethod EOF
            {
             before(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getMethodRule()); 
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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalUIDSL.g:212:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:216:2: ( ( ( rule__Method__Group__0 ) ) )
            // InternalUIDSL.g:217:2: ( ( rule__Method__Group__0 ) )
            {
            // InternalUIDSL.g:217:2: ( ( rule__Method__Group__0 ) )
            // InternalUIDSL.g:218:3: ( rule__Method__Group__0 )
            {
             before(grammarAccess.getMethodAccess().getGroup()); 
            // InternalUIDSL.g:219:3: ( rule__Method__Group__0 )
            // InternalUIDSL.g:219:4: rule__Method__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getGroup()); 

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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleVariable"
    // InternalUIDSL.g:228:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalUIDSL.g:229:1: ( ruleVariable EOF )
            // InternalUIDSL.g:230:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalUIDSL.g:237:1: ruleVariable : ( ruleTypedConcept ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:241:2: ( ( ruleTypedConcept ) )
            // InternalUIDSL.g:242:2: ( ruleTypedConcept )
            {
            // InternalUIDSL.g:242:2: ( ruleTypedConcept )
            // InternalUIDSL.g:243:3: ruleTypedConcept
            {
             before(grammarAccess.getVariableAccess().getTypedConceptParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleTypedConcept();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getTypedConceptParserRuleCall()); 

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "ruleTypedConcept"
    // InternalUIDSL.g:254:1: ruleTypedConcept : ( ( rule__TypedConcept__Group__0 ) ) ;
    public final void ruleTypedConcept() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:258:2: ( ( ( rule__TypedConcept__Group__0 ) ) )
            // InternalUIDSL.g:259:2: ( ( rule__TypedConcept__Group__0 ) )
            {
            // InternalUIDSL.g:259:2: ( ( rule__TypedConcept__Group__0 ) )
            // InternalUIDSL.g:260:3: ( rule__TypedConcept__Group__0 )
            {
             before(grammarAccess.getTypedConceptAccess().getGroup()); 
            // InternalUIDSL.g:261:3: ( rule__TypedConcept__Group__0 )
            // InternalUIDSL.g:261:4: rule__TypedConcept__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypedConcept__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypedConceptAccess().getGroup()); 

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
    // $ANTLR end "ruleTypedConcept"


    // $ANTLR start "entryRuleUIContainer"
    // InternalUIDSL.g:270:1: entryRuleUIContainer : ruleUIContainer EOF ;
    public final void entryRuleUIContainer() throws RecognitionException {
        try {
            // InternalUIDSL.g:271:1: ( ruleUIContainer EOF )
            // InternalUIDSL.g:272:1: ruleUIContainer EOF
            {
             before(grammarAccess.getUIContainerRule()); 
            pushFollow(FOLLOW_1);
            ruleUIContainer();

            state._fsp--;

             after(grammarAccess.getUIContainerRule()); 
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
    // $ANTLR end "entryRuleUIContainer"


    // $ANTLR start "ruleUIContainer"
    // InternalUIDSL.g:279:1: ruleUIContainer : ( ( rule__UIContainer__Alternatives ) ) ;
    public final void ruleUIContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:283:2: ( ( ( rule__UIContainer__Alternatives ) ) )
            // InternalUIDSL.g:284:2: ( ( rule__UIContainer__Alternatives ) )
            {
            // InternalUIDSL.g:284:2: ( ( rule__UIContainer__Alternatives ) )
            // InternalUIDSL.g:285:3: ( rule__UIContainer__Alternatives )
            {
             before(grammarAccess.getUIContainerAccess().getAlternatives()); 
            // InternalUIDSL.g:286:3: ( rule__UIContainer__Alternatives )
            // InternalUIDSL.g:286:4: rule__UIContainer__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UIContainer__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUIContainerAccess().getAlternatives()); 

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
    // $ANTLR end "ruleUIContainer"


    // $ANTLR start "entryRulePage"
    // InternalUIDSL.g:295:1: entryRulePage : rulePage EOF ;
    public final void entryRulePage() throws RecognitionException {
        try {
            // InternalUIDSL.g:296:1: ( rulePage EOF )
            // InternalUIDSL.g:297:1: rulePage EOF
            {
             before(grammarAccess.getPageRule()); 
            pushFollow(FOLLOW_1);
            rulePage();

            state._fsp--;

             after(grammarAccess.getPageRule()); 
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
    // $ANTLR end "entryRulePage"


    // $ANTLR start "rulePage"
    // InternalUIDSL.g:304:1: rulePage : ( ( rule__Page__Group__0 ) ) ;
    public final void rulePage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:308:2: ( ( ( rule__Page__Group__0 ) ) )
            // InternalUIDSL.g:309:2: ( ( rule__Page__Group__0 ) )
            {
            // InternalUIDSL.g:309:2: ( ( rule__Page__Group__0 ) )
            // InternalUIDSL.g:310:3: ( rule__Page__Group__0 )
            {
             before(grammarAccess.getPageAccess().getGroup()); 
            // InternalUIDSL.g:311:3: ( rule__Page__Group__0 )
            // InternalUIDSL.g:311:4: rule__Page__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Page__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getGroup()); 

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
    // $ANTLR end "rulePage"


    // $ANTLR start "entryRuleTemplate"
    // InternalUIDSL.g:320:1: entryRuleTemplate : ruleTemplate EOF ;
    public final void entryRuleTemplate() throws RecognitionException {
        try {
            // InternalUIDSL.g:321:1: ( ruleTemplate EOF )
            // InternalUIDSL.g:322:1: ruleTemplate EOF
            {
             before(grammarAccess.getTemplateRule()); 
            pushFollow(FOLLOW_1);
            ruleTemplate();

            state._fsp--;

             after(grammarAccess.getTemplateRule()); 
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
    // $ANTLR end "entryRuleTemplate"


    // $ANTLR start "ruleTemplate"
    // InternalUIDSL.g:329:1: ruleTemplate : ( ( rule__Template__Group__0 ) ) ;
    public final void ruleTemplate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:333:2: ( ( ( rule__Template__Group__0 ) ) )
            // InternalUIDSL.g:334:2: ( ( rule__Template__Group__0 ) )
            {
            // InternalUIDSL.g:334:2: ( ( rule__Template__Group__0 ) )
            // InternalUIDSL.g:335:3: ( rule__Template__Group__0 )
            {
             before(grammarAccess.getTemplateAccess().getGroup()); 
            // InternalUIDSL.g:336:3: ( rule__Template__Group__0 )
            // InternalUIDSL.g:336:4: rule__Template__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Template__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTemplateAccess().getGroup()); 

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
    // $ANTLR end "ruleTemplate"


    // $ANTLR start "entryRuleFragment"
    // InternalUIDSL.g:345:1: entryRuleFragment : ruleFragment EOF ;
    public final void entryRuleFragment() throws RecognitionException {
        try {
            // InternalUIDSL.g:346:1: ( ruleFragment EOF )
            // InternalUIDSL.g:347:1: ruleFragment EOF
            {
             before(grammarAccess.getFragmentRule()); 
            pushFollow(FOLLOW_1);
            ruleFragment();

            state._fsp--;

             after(grammarAccess.getFragmentRule()); 
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
    // $ANTLR end "entryRuleFragment"


    // $ANTLR start "ruleFragment"
    // InternalUIDSL.g:354:1: ruleFragment : ( ( rule__Fragment__Group__0 ) ) ;
    public final void ruleFragment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:358:2: ( ( ( rule__Fragment__Group__0 ) ) )
            // InternalUIDSL.g:359:2: ( ( rule__Fragment__Group__0 ) )
            {
            // InternalUIDSL.g:359:2: ( ( rule__Fragment__Group__0 ) )
            // InternalUIDSL.g:360:3: ( rule__Fragment__Group__0 )
            {
             before(grammarAccess.getFragmentAccess().getGroup()); 
            // InternalUIDSL.g:361:3: ( rule__Fragment__Group__0 )
            // InternalUIDSL.g:361:4: rule__Fragment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Fragment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFragmentAccess().getGroup()); 

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
    // $ANTLR end "ruleFragment"


    // $ANTLR start "entryRuleExpression"
    // InternalUIDSL.g:370:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalUIDSL.g:371:1: ( ruleExpression EOF )
            // InternalUIDSL.g:372:1: ruleExpression EOF
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
    // InternalUIDSL.g:379:1: ruleExpression : ( ruleMemberSelectionExpression ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:383:2: ( ( ruleMemberSelectionExpression ) )
            // InternalUIDSL.g:384:2: ( ruleMemberSelectionExpression )
            {
            // InternalUIDSL.g:384:2: ( ruleMemberSelectionExpression )
            // InternalUIDSL.g:385:3: ruleMemberSelectionExpression
            {
             before(grammarAccess.getExpressionAccess().getMemberSelectionExpressionParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleMemberSelectionExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getMemberSelectionExpressionParserRuleCall()); 

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
    // InternalUIDSL.g:395:1: entryRuleMemberSelectionExpression : ruleMemberSelectionExpression EOF ;
    public final void entryRuleMemberSelectionExpression() throws RecognitionException {
        try {
            // InternalUIDSL.g:396:1: ( ruleMemberSelectionExpression EOF )
            // InternalUIDSL.g:397:1: ruleMemberSelectionExpression EOF
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
    // InternalUIDSL.g:404:1: ruleMemberSelectionExpression : ( ( rule__MemberSelectionExpression__Group__0 ) ) ;
    public final void ruleMemberSelectionExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:408:2: ( ( ( rule__MemberSelectionExpression__Group__0 ) ) )
            // InternalUIDSL.g:409:2: ( ( rule__MemberSelectionExpression__Group__0 ) )
            {
            // InternalUIDSL.g:409:2: ( ( rule__MemberSelectionExpression__Group__0 ) )
            // InternalUIDSL.g:410:3: ( rule__MemberSelectionExpression__Group__0 )
            {
             before(grammarAccess.getMemberSelectionExpressionAccess().getGroup()); 
            // InternalUIDSL.g:411:3: ( rule__MemberSelectionExpression__Group__0 )
            // InternalUIDSL.g:411:4: rule__MemberSelectionExpression__Group__0
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


    // $ANTLR start "entryRuleAtomExpression"
    // InternalUIDSL.g:420:1: entryRuleAtomExpression : ruleAtomExpression EOF ;
    public final void entryRuleAtomExpression() throws RecognitionException {
        try {
            // InternalUIDSL.g:421:1: ( ruleAtomExpression EOF )
            // InternalUIDSL.g:422:1: ruleAtomExpression EOF
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
    // InternalUIDSL.g:429:1: ruleAtomExpression : ( ( rule__AtomExpression__Alternatives ) ) ;
    public final void ruleAtomExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:433:2: ( ( ( rule__AtomExpression__Alternatives ) ) )
            // InternalUIDSL.g:434:2: ( ( rule__AtomExpression__Alternatives ) )
            {
            // InternalUIDSL.g:434:2: ( ( rule__AtomExpression__Alternatives ) )
            // InternalUIDSL.g:435:3: ( rule__AtomExpression__Alternatives )
            {
             before(grammarAccess.getAtomExpressionAccess().getAlternatives()); 
            // InternalUIDSL.g:436:3: ( rule__AtomExpression__Alternatives )
            // InternalUIDSL.g:436:4: rule__AtomExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AtomExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtomExpressionAccess().getAlternatives()); 

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


    // $ANTLR start "entrySuperConcept"
    // InternalUIDSL.g:445:1: entrySuperConcept : superConcept EOF ;
    public final void entrySuperConcept() throws RecognitionException {
        try {
            // InternalUIDSL.g:446:1: ( superConcept EOF )
            // InternalUIDSL.g:447:1: superConcept EOF
            {
             before(grammarAccess.getDTOConceptRule()); 
            pushFollow(FOLLOW_1);
            superConcept();

            state._fsp--;

             after(grammarAccess.getDTOConceptRule()); 
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
    // $ANTLR end "entrySuperConcept"


    // $ANTLR start "superConcept"
    // InternalUIDSL.g:454:1: superConcept : ( ( superConcept__Alternatives ) ) ;
    public final void superConcept() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:458:2: ( ( ( superConcept__Alternatives ) ) )
            // InternalUIDSL.g:459:2: ( ( superConcept__Alternatives ) )
            {
            // InternalUIDSL.g:459:2: ( ( superConcept__Alternatives ) )
            // InternalUIDSL.g:460:3: ( superConcept__Alternatives )
            {
             before(grammarAccess.getDTOConceptAccess().getAlternatives()); 
            // InternalUIDSL.g:461:3: ( superConcept__Alternatives )
            // InternalUIDSL.g:461:4: superConcept__Alternatives
            {
            pushFollow(FOLLOW_2);
            superConcept__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDTOConceptAccess().getAlternatives()); 

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
    // $ANTLR end "superConcept"


    // $ANTLR start "entryRuleDTOClass"
    // InternalUIDSL.g:470:1: entryRuleDTOClass : ruleDTOClass EOF ;
    public final void entryRuleDTOClass() throws RecognitionException {
        try {
            // InternalUIDSL.g:471:1: ( ruleDTOClass EOF )
            // InternalUIDSL.g:472:1: ruleDTOClass EOF
            {
             before(grammarAccess.getDTOClassRule()); 
            pushFollow(FOLLOW_1);
            ruleDTOClass();

            state._fsp--;

             after(grammarAccess.getDTOClassRule()); 
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
    // $ANTLR end "entryRuleDTOClass"


    // $ANTLR start "ruleDTOClass"
    // InternalUIDSL.g:479:1: ruleDTOClass : ( ( rule__DTOClass__Group__0 ) ) ;
    public final void ruleDTOClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:483:2: ( ( ( rule__DTOClass__Group__0 ) ) )
            // InternalUIDSL.g:484:2: ( ( rule__DTOClass__Group__0 ) )
            {
            // InternalUIDSL.g:484:2: ( ( rule__DTOClass__Group__0 ) )
            // InternalUIDSL.g:485:3: ( rule__DTOClass__Group__0 )
            {
             before(grammarAccess.getDTOClassAccess().getGroup()); 
            // InternalUIDSL.g:486:3: ( rule__DTOClass__Group__0 )
            // InternalUIDSL.g:486:4: rule__DTOClass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DTOClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDTOClassAccess().getGroup()); 

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
    // $ANTLR end "ruleDTOClass"


    // $ANTLR start "entryRuleBasicType"
    // InternalUIDSL.g:495:1: entryRuleBasicType : ruleBasicType EOF ;
    public final void entryRuleBasicType() throws RecognitionException {
        try {
            // InternalUIDSL.g:496:1: ( ruleBasicType EOF )
            // InternalUIDSL.g:497:1: ruleBasicType EOF
            {
             before(grammarAccess.getBasicTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleBasicType();

            state._fsp--;

             after(grammarAccess.getBasicTypeRule()); 
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
    // $ANTLR end "entryRuleBasicType"


    // $ANTLR start "ruleBasicType"
    // InternalUIDSL.g:504:1: ruleBasicType : ( ( rule__BasicType__Alternatives ) ) ;
    public final void ruleBasicType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:508:2: ( ( ( rule__BasicType__Alternatives ) ) )
            // InternalUIDSL.g:509:2: ( ( rule__BasicType__Alternatives ) )
            {
            // InternalUIDSL.g:509:2: ( ( rule__BasicType__Alternatives ) )
            // InternalUIDSL.g:510:3: ( rule__BasicType__Alternatives )
            {
             before(grammarAccess.getBasicTypeAccess().getAlternatives()); 
            // InternalUIDSL.g:511:3: ( rule__BasicType__Alternatives )
            // InternalUIDSL.g:511:4: rule__BasicType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BasicType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBasicTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBasicType"


    // $ANTLR start "entryRuleEnum"
    // InternalUIDSL.g:520:1: entryRuleEnum : ruleEnum EOF ;
    public final void entryRuleEnum() throws RecognitionException {
        try {
            // InternalUIDSL.g:521:1: ( ruleEnum EOF )
            // InternalUIDSL.g:522:1: ruleEnum EOF
            {
             before(grammarAccess.getEnumRule()); 
            pushFollow(FOLLOW_1);
            ruleEnum();

            state._fsp--;

             after(grammarAccess.getEnumRule()); 
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
    // $ANTLR end "entryRuleEnum"


    // $ANTLR start "ruleEnum"
    // InternalUIDSL.g:529:1: ruleEnum : ( ( rule__Enum__Group__0 ) ) ;
    public final void ruleEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:533:2: ( ( ( rule__Enum__Group__0 ) ) )
            // InternalUIDSL.g:534:2: ( ( rule__Enum__Group__0 ) )
            {
            // InternalUIDSL.g:534:2: ( ( rule__Enum__Group__0 ) )
            // InternalUIDSL.g:535:3: ( rule__Enum__Group__0 )
            {
             before(grammarAccess.getEnumAccess().getGroup()); 
            // InternalUIDSL.g:536:3: ( rule__Enum__Group__0 )
            // InternalUIDSL.g:536:4: rule__Enum__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Enum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getGroup()); 

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
    // $ANTLR end "ruleEnum"


    // $ANTLR start "entryRuleEnumLiteral"
    // InternalUIDSL.g:545:1: entryRuleEnumLiteral : ruleEnumLiteral EOF ;
    public final void entryRuleEnumLiteral() throws RecognitionException {
        try {
            // InternalUIDSL.g:546:1: ( ruleEnumLiteral EOF )
            // InternalUIDSL.g:547:1: ruleEnumLiteral EOF
            {
             before(grammarAccess.getEnumLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumLiteral();

            state._fsp--;

             after(grammarAccess.getEnumLiteralRule()); 
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
    // $ANTLR end "entryRuleEnumLiteral"


    // $ANTLR start "ruleEnumLiteral"
    // InternalUIDSL.g:554:1: ruleEnumLiteral : ( ( rule__EnumLiteral__Group__0 ) ) ;
    public final void ruleEnumLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:558:2: ( ( ( rule__EnumLiteral__Group__0 ) ) )
            // InternalUIDSL.g:559:2: ( ( rule__EnumLiteral__Group__0 ) )
            {
            // InternalUIDSL.g:559:2: ( ( rule__EnumLiteral__Group__0 ) )
            // InternalUIDSL.g:560:3: ( rule__EnumLiteral__Group__0 )
            {
             before(grammarAccess.getEnumLiteralAccess().getGroup()); 
            // InternalUIDSL.g:561:3: ( rule__EnumLiteral__Group__0 )
            // InternalUIDSL.g:561:4: rule__EnumLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnumLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumLiteralAccess().getGroup()); 

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
    // $ANTLR end "ruleEnumLiteral"


    // $ANTLR start "entryRuleConstant"
    // InternalUIDSL.g:570:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // InternalUIDSL.g:571:1: ( ruleConstant EOF )
            // InternalUIDSL.g:572:1: ruleConstant EOF
            {
             before(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getConstantRule()); 
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
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalUIDSL.g:579:1: ruleConstant : ( ( rule__Constant__Alternatives ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:583:2: ( ( ( rule__Constant__Alternatives ) ) )
            // InternalUIDSL.g:584:2: ( ( rule__Constant__Alternatives ) )
            {
            // InternalUIDSL.g:584:2: ( ( rule__Constant__Alternatives ) )
            // InternalUIDSL.g:585:3: ( rule__Constant__Alternatives )
            {
             before(grammarAccess.getConstantAccess().getAlternatives()); 
            // InternalUIDSL.g:586:3: ( rule__Constant__Alternatives )
            // InternalUIDSL.g:586:4: rule__Constant__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getAlternatives()); 

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
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleEntityOption"
    // InternalUIDSL.g:595:1: entryRuleEntityOption : ruleEntityOption EOF ;
    public final void entryRuleEntityOption() throws RecognitionException {
        try {
            // InternalUIDSL.g:596:1: ( ruleEntityOption EOF )
            // InternalUIDSL.g:597:1: ruleEntityOption EOF
            {
             before(grammarAccess.getEntityOptionRule()); 
            pushFollow(FOLLOW_1);
            ruleEntityOption();

            state._fsp--;

             after(grammarAccess.getEntityOptionRule()); 
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
    // $ANTLR end "entryRuleEntityOption"


    // $ANTLR start "ruleEntityOption"
    // InternalUIDSL.g:604:1: ruleEntityOption : ( ( rule__EntityOption__Alternatives ) ) ;
    public final void ruleEntityOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:608:2: ( ( ( rule__EntityOption__Alternatives ) ) )
            // InternalUIDSL.g:609:2: ( ( rule__EntityOption__Alternatives ) )
            {
            // InternalUIDSL.g:609:2: ( ( rule__EntityOption__Alternatives ) )
            // InternalUIDSL.g:610:3: ( rule__EntityOption__Alternatives )
            {
             before(grammarAccess.getEntityOptionAccess().getAlternatives()); 
            // InternalUIDSL.g:611:3: ( rule__EntityOption__Alternatives )
            // InternalUIDSL.g:611:4: rule__EntityOption__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EntityOption__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEntityOptionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEntityOption"


    // $ANTLR start "entryRuleInheritanceMappingType"
    // InternalUIDSL.g:620:1: entryRuleInheritanceMappingType : ruleInheritanceMappingType EOF ;
    public final void entryRuleInheritanceMappingType() throws RecognitionException {
        try {
            // InternalUIDSL.g:621:1: ( ruleInheritanceMappingType EOF )
            // InternalUIDSL.g:622:1: ruleInheritanceMappingType EOF
            {
             before(grammarAccess.getInheritanceMappingTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleInheritanceMappingType();

            state._fsp--;

             after(grammarAccess.getInheritanceMappingTypeRule()); 
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
    // $ANTLR end "entryRuleInheritanceMappingType"


    // $ANTLR start "ruleInheritanceMappingType"
    // InternalUIDSL.g:629:1: ruleInheritanceMappingType : ( ( rule__InheritanceMappingType__TypeAssignment ) ) ;
    public final void ruleInheritanceMappingType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:633:2: ( ( ( rule__InheritanceMappingType__TypeAssignment ) ) )
            // InternalUIDSL.g:634:2: ( ( rule__InheritanceMappingType__TypeAssignment ) )
            {
            // InternalUIDSL.g:634:2: ( ( rule__InheritanceMappingType__TypeAssignment ) )
            // InternalUIDSL.g:635:3: ( rule__InheritanceMappingType__TypeAssignment )
            {
             before(grammarAccess.getInheritanceMappingTypeAccess().getTypeAssignment()); 
            // InternalUIDSL.g:636:3: ( rule__InheritanceMappingType__TypeAssignment )
            // InternalUIDSL.g:636:4: rule__InheritanceMappingType__TypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__InheritanceMappingType__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getInheritanceMappingTypeAccess().getTypeAssignment()); 

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
    // $ANTLR end "ruleInheritanceMappingType"


    // $ANTLR start "entryRuleAttribute"
    // InternalUIDSL.g:645:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalUIDSL.g:646:1: ( ruleAttribute EOF )
            // InternalUIDSL.g:647:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalUIDSL.g:654:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:658:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalUIDSL.g:659:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalUIDSL.g:659:2: ( ( rule__Attribute__Group__0 ) )
            // InternalUIDSL.g:660:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalUIDSL.g:661:3: ( rule__Attribute__Group__0 )
            // InternalUIDSL.g:661:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleAttributeType"
    // InternalUIDSL.g:670:1: entryRuleAttributeType : ruleAttributeType EOF ;
    public final void entryRuleAttributeType() throws RecognitionException {
        try {
            // InternalUIDSL.g:671:1: ( ruleAttributeType EOF )
            // InternalUIDSL.g:672:1: ruleAttributeType EOF
            {
             before(grammarAccess.getAttributeTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeType();

            state._fsp--;

             after(grammarAccess.getAttributeTypeRule()); 
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
    // $ANTLR end "entryRuleAttributeType"


    // $ANTLR start "ruleAttributeType"
    // InternalUIDSL.g:679:1: ruleAttributeType : ( ( rule__AttributeType__Alternatives ) ) ;
    public final void ruleAttributeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:683:2: ( ( ( rule__AttributeType__Alternatives ) ) )
            // InternalUIDSL.g:684:2: ( ( rule__AttributeType__Alternatives ) )
            {
            // InternalUIDSL.g:684:2: ( ( rule__AttributeType__Alternatives ) )
            // InternalUIDSL.g:685:3: ( rule__AttributeType__Alternatives )
            {
             before(grammarAccess.getAttributeTypeAccess().getAlternatives()); 
            // InternalUIDSL.g:686:3: ( rule__AttributeType__Alternatives )
            // InternalUIDSL.g:686:4: rule__AttributeType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AttributeType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttributeTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAttributeType"


    // $ANTLR start "entryRuleSingleType"
    // InternalUIDSL.g:695:1: entryRuleSingleType : ruleSingleType EOF ;
    public final void entryRuleSingleType() throws RecognitionException {
        try {
            // InternalUIDSL.g:696:1: ( ruleSingleType EOF )
            // InternalUIDSL.g:697:1: ruleSingleType EOF
            {
             before(grammarAccess.getSingleTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleSingleType();

            state._fsp--;

             after(grammarAccess.getSingleTypeRule()); 
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
    // $ANTLR end "entryRuleSingleType"


    // $ANTLR start "ruleSingleType"
    // InternalUIDSL.g:704:1: ruleSingleType : ( ( rule__SingleType__Alternatives ) ) ;
    public final void ruleSingleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:708:2: ( ( ( rule__SingleType__Alternatives ) ) )
            // InternalUIDSL.g:709:2: ( ( rule__SingleType__Alternatives ) )
            {
            // InternalUIDSL.g:709:2: ( ( rule__SingleType__Alternatives ) )
            // InternalUIDSL.g:710:3: ( rule__SingleType__Alternatives )
            {
             before(grammarAccess.getSingleTypeAccess().getAlternatives()); 
            // InternalUIDSL.g:711:3: ( rule__SingleType__Alternatives )
            // InternalUIDSL.g:711:4: rule__SingleType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SingleType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSingleTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSingleType"


    // $ANTLR start "entrySuperBasicType"
    // InternalUIDSL.g:720:1: entrySuperBasicType : superBasicType EOF ;
    public final void entrySuperBasicType() throws RecognitionException {
        try {
            // InternalUIDSL.g:721:1: ( superBasicType EOF )
            // InternalUIDSL.g:722:1: superBasicType EOF
            {
             before(grammarAccess.getDomainModelBasicTypeRule()); 
            pushFollow(FOLLOW_1);
            superBasicType();

            state._fsp--;

             after(grammarAccess.getDomainModelBasicTypeRule()); 
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
    // $ANTLR end "entrySuperBasicType"


    // $ANTLR start "superBasicType"
    // InternalUIDSL.g:729:1: superBasicType : ( ( superBasicType__Alternatives ) ) ;
    public final void superBasicType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:733:2: ( ( ( superBasicType__Alternatives ) ) )
            // InternalUIDSL.g:734:2: ( ( superBasicType__Alternatives ) )
            {
            // InternalUIDSL.g:734:2: ( ( superBasicType__Alternatives ) )
            // InternalUIDSL.g:735:3: ( superBasicType__Alternatives )
            {
             before(grammarAccess.getDomainModelBasicTypeAccess().getAlternatives()); 
            // InternalUIDSL.g:736:3: ( superBasicType__Alternatives )
            // InternalUIDSL.g:736:4: superBasicType__Alternatives
            {
            pushFollow(FOLLOW_2);
            superBasicType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDomainModelBasicTypeAccess().getAlternatives()); 

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
    // $ANTLR end "superBasicType"


    // $ANTLR start "entryRuleRefType"
    // InternalUIDSL.g:745:1: entryRuleRefType : ruleRefType EOF ;
    public final void entryRuleRefType() throws RecognitionException {
        try {
            // InternalUIDSL.g:746:1: ( ruleRefType EOF )
            // InternalUIDSL.g:747:1: ruleRefType EOF
            {
             before(grammarAccess.getRefTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleRefType();

            state._fsp--;

             after(grammarAccess.getRefTypeRule()); 
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
    // $ANTLR end "entryRuleRefType"


    // $ANTLR start "ruleRefType"
    // InternalUIDSL.g:754:1: ruleRefType : ( ( rule__RefType__ReferenceAssignment ) ) ;
    public final void ruleRefType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:758:2: ( ( ( rule__RefType__ReferenceAssignment ) ) )
            // InternalUIDSL.g:759:2: ( ( rule__RefType__ReferenceAssignment ) )
            {
            // InternalUIDSL.g:759:2: ( ( rule__RefType__ReferenceAssignment ) )
            // InternalUIDSL.g:760:3: ( rule__RefType__ReferenceAssignment )
            {
             before(grammarAccess.getRefTypeAccess().getReferenceAssignment()); 
            // InternalUIDSL.g:761:3: ( rule__RefType__ReferenceAssignment )
            // InternalUIDSL.g:761:4: rule__RefType__ReferenceAssignment
            {
            pushFollow(FOLLOW_2);
            rule__RefType__ReferenceAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRefTypeAccess().getReferenceAssignment()); 

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
    // $ANTLR end "ruleRefType"


    // $ANTLR start "entryRuleCollectionType"
    // InternalUIDSL.g:770:1: entryRuleCollectionType : ruleCollectionType EOF ;
    public final void entryRuleCollectionType() throws RecognitionException {
        try {
            // InternalUIDSL.g:771:1: ( ruleCollectionType EOF )
            // InternalUIDSL.g:772:1: ruleCollectionType EOF
            {
             before(grammarAccess.getCollectionTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleCollectionType();

            state._fsp--;

             after(grammarAccess.getCollectionTypeRule()); 
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
    // $ANTLR end "entryRuleCollectionType"


    // $ANTLR start "ruleCollectionType"
    // InternalUIDSL.g:779:1: ruleCollectionType : ( ( rule__CollectionType__Group__0 ) ) ;
    public final void ruleCollectionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:783:2: ( ( ( rule__CollectionType__Group__0 ) ) )
            // InternalUIDSL.g:784:2: ( ( rule__CollectionType__Group__0 ) )
            {
            // InternalUIDSL.g:784:2: ( ( rule__CollectionType__Group__0 ) )
            // InternalUIDSL.g:785:3: ( rule__CollectionType__Group__0 )
            {
             before(grammarAccess.getCollectionTypeAccess().getGroup()); 
            // InternalUIDSL.g:786:3: ( rule__CollectionType__Group__0 )
            // InternalUIDSL.g:786:4: rule__CollectionType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CollectionType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCollectionTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleCollectionType"


    // $ANTLR start "entryRuleAttributeOption"
    // InternalUIDSL.g:795:1: entryRuleAttributeOption : ruleAttributeOption EOF ;
    public final void entryRuleAttributeOption() throws RecognitionException {
        try {
            // InternalUIDSL.g:796:1: ( ruleAttributeOption EOF )
            // InternalUIDSL.g:797:1: ruleAttributeOption EOF
            {
             before(grammarAccess.getAttributeOptionRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeOption();

            state._fsp--;

             after(grammarAccess.getAttributeOptionRule()); 
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
    // $ANTLR end "entryRuleAttributeOption"


    // $ANTLR start "ruleAttributeOption"
    // InternalUIDSL.g:804:1: ruleAttributeOption : ( ( rule__AttributeOption__Alternatives ) ) ;
    public final void ruleAttributeOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:808:2: ( ( ( rule__AttributeOption__Alternatives ) ) )
            // InternalUIDSL.g:809:2: ( ( rule__AttributeOption__Alternatives ) )
            {
            // InternalUIDSL.g:809:2: ( ( rule__AttributeOption__Alternatives ) )
            // InternalUIDSL.g:810:3: ( rule__AttributeOption__Alternatives )
            {
             before(grammarAccess.getAttributeOptionAccess().getAlternatives()); 
            // InternalUIDSL.g:811:3: ( rule__AttributeOption__Alternatives )
            // InternalUIDSL.g:811:4: rule__AttributeOption__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AttributeOption__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttributeOptionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAttributeOption"


    // $ANTLR start "entryRuleStaticFieldSelection"
    // InternalUIDSL.g:820:1: entryRuleStaticFieldSelection : ruleStaticFieldSelection EOF ;
    public final void entryRuleStaticFieldSelection() throws RecognitionException {
        try {
            // InternalUIDSL.g:821:1: ( ruleStaticFieldSelection EOF )
            // InternalUIDSL.g:822:1: ruleStaticFieldSelection EOF
            {
             before(grammarAccess.getStaticFieldSelectionRule()); 
            pushFollow(FOLLOW_1);
            ruleStaticFieldSelection();

            state._fsp--;

             after(grammarAccess.getStaticFieldSelectionRule()); 
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
    // $ANTLR end "entryRuleStaticFieldSelection"


    // $ANTLR start "ruleStaticFieldSelection"
    // InternalUIDSL.g:829:1: ruleStaticFieldSelection : ( ( rule__StaticFieldSelection__Group__0 ) ) ;
    public final void ruleStaticFieldSelection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:833:2: ( ( ( rule__StaticFieldSelection__Group__0 ) ) )
            // InternalUIDSL.g:834:2: ( ( rule__StaticFieldSelection__Group__0 ) )
            {
            // InternalUIDSL.g:834:2: ( ( rule__StaticFieldSelection__Group__0 ) )
            // InternalUIDSL.g:835:3: ( rule__StaticFieldSelection__Group__0 )
            {
             before(grammarAccess.getStaticFieldSelectionAccess().getGroup()); 
            // InternalUIDSL.g:836:3: ( rule__StaticFieldSelection__Group__0 )
            // InternalUIDSL.g:836:4: rule__StaticFieldSelection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StaticFieldSelection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStaticFieldSelectionAccess().getGroup()); 

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
    // $ANTLR end "ruleStaticFieldSelection"


    // $ANTLR start "entrySuperSelectionMember"
    // InternalUIDSL.g:845:1: entrySuperSelectionMember : superSelectionMember EOF ;
    public final void entrySuperSelectionMember() throws RecognitionException {
        try {
            // InternalUIDSL.g:846:1: ( superSelectionMember EOF )
            // InternalUIDSL.g:847:1: superSelectionMember EOF
            {
             before(grammarAccess.getDomainModelSelectionMemberRule()); 
            pushFollow(FOLLOW_1);
            superSelectionMember();

            state._fsp--;

             after(grammarAccess.getDomainModelSelectionMemberRule()); 
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
    // $ANTLR end "entrySuperSelectionMember"


    // $ANTLR start "superSelectionMember"
    // InternalUIDSL.g:854:1: superSelectionMember : ( ruleAttribute ) ;
    public final void superSelectionMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:858:2: ( ( ruleAttribute ) )
            // InternalUIDSL.g:859:2: ( ruleAttribute )
            {
            // InternalUIDSL.g:859:2: ( ruleAttribute )
            // InternalUIDSL.g:860:3: ruleAttribute
            {
             before(grammarAccess.getDomainModelSelectionMemberAccess().getAttributeParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getDomainModelSelectionMemberAccess().getAttributeParserRuleCall()); 

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
    // $ANTLR end "superSelectionMember"


    // $ANTLR start "ruleCardinalityType"
    // InternalUIDSL.g:870:1: ruleCardinalityType : ( ( rule__CardinalityType__Alternatives ) ) ;
    public final void ruleCardinalityType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:874:1: ( ( ( rule__CardinalityType__Alternatives ) ) )
            // InternalUIDSL.g:875:2: ( ( rule__CardinalityType__Alternatives ) )
            {
            // InternalUIDSL.g:875:2: ( ( rule__CardinalityType__Alternatives ) )
            // InternalUIDSL.g:876:3: ( rule__CardinalityType__Alternatives )
            {
             before(grammarAccess.getCardinalityTypeAccess().getAlternatives()); 
            // InternalUIDSL.g:877:3: ( rule__CardinalityType__Alternatives )
            // InternalUIDSL.g:877:4: rule__CardinalityType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CardinalityType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCardinalityTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCardinalityType"


    // $ANTLR start "rule__UIConcept__Alternatives"
    // InternalUIDSL.g:885:1: rule__UIConcept__Alternatives : ( ( ruleServerComponent ) | ( ruleUIContainer ) );
    public final void rule__UIConcept__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:889:1: ( ( ruleServerComponent ) | ( ruleUIContainer ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=25 && LA2_0<=27)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalUIDSL.g:890:2: ( ruleServerComponent )
                    {
                    // InternalUIDSL.g:890:2: ( ruleServerComponent )
                    // InternalUIDSL.g:891:3: ruleServerComponent
                    {
                     before(grammarAccess.getUIConceptAccess().getServerComponentParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleServerComponent();

                    state._fsp--;

                     after(grammarAccess.getUIConceptAccess().getServerComponentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUIDSL.g:896:2: ( ruleUIContainer )
                    {
                    // InternalUIDSL.g:896:2: ( ruleUIContainer )
                    // InternalUIDSL.g:897:3: ruleUIContainer
                    {
                     before(grammarAccess.getUIConceptAccess().getUIContainerParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleUIContainer();

                    state._fsp--;

                     after(grammarAccess.getUIConceptAccess().getUIContainerParserRuleCall_1()); 

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
    // $ANTLR end "rule__UIConcept__Alternatives"


    // $ANTLR start "rule__Concept__Alternatives"
    // InternalUIDSL.g:906:1: rule__Concept__Alternatives : ( ( superConcept ) | ( ruleServerComponent ) );
    public final void rule__Concept__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:910:1: ( ( superConcept ) | ( ruleServerComponent ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==29||LA3_0==36) ) {
                alt3=1;
            }
            else if ( (LA3_0==18) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalUIDSL.g:911:2: ( superConcept )
                    {
                    // InternalUIDSL.g:911:2: ( superConcept )
                    // InternalUIDSL.g:912:3: superConcept
                    {
                     before(grammarAccess.getConceptAccess().getConceptParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    superConcept();

                    state._fsp--;

                     after(grammarAccess.getConceptAccess().getConceptParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUIDSL.g:917:2: ( ruleServerComponent )
                    {
                    // InternalUIDSL.g:917:2: ( ruleServerComponent )
                    // InternalUIDSL.g:918:3: ruleServerComponent
                    {
                     before(grammarAccess.getConceptAccess().getServerComponentParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleServerComponent();

                    state._fsp--;

                     after(grammarAccess.getConceptAccess().getServerComponentParserRuleCall_1()); 

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
    // $ANTLR end "rule__Concept__Alternatives"


    // $ANTLR start "rule__Member__Alternatives"
    // InternalUIDSL.g:927:1: rule__Member__Alternatives : ( ( ruleField ) | ( ruleMethod ) );
    public final void rule__Member__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:931:1: ( ( ruleField ) | ( ruleMethod ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalUIDSL.g:932:2: ( ruleField )
                    {
                    // InternalUIDSL.g:932:2: ( ruleField )
                    // InternalUIDSL.g:933:3: ruleField
                    {
                     before(grammarAccess.getMemberAccess().getFieldParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleField();

                    state._fsp--;

                     after(grammarAccess.getMemberAccess().getFieldParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUIDSL.g:938:2: ( ruleMethod )
                    {
                    // InternalUIDSL.g:938:2: ( ruleMethod )
                    // InternalUIDSL.g:939:3: ruleMethod
                    {
                     before(grammarAccess.getMemberAccess().getMethodParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMethod();

                    state._fsp--;

                     after(grammarAccess.getMemberAccess().getMethodParserRuleCall_1()); 

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
    // $ANTLR end "rule__Member__Alternatives"


    // $ANTLR start "rule__UIContainer__Alternatives"
    // InternalUIDSL.g:948:1: rule__UIContainer__Alternatives : ( ( rulePage ) | ( ruleTemplate ) | ( ruleFragment ) );
    public final void rule__UIContainer__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:952:1: ( ( rulePage ) | ( ruleTemplate ) | ( ruleFragment ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt5=1;
                }
                break;
            case 26:
                {
                alt5=2;
                }
                break;
            case 27:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalUIDSL.g:953:2: ( rulePage )
                    {
                    // InternalUIDSL.g:953:2: ( rulePage )
                    // InternalUIDSL.g:954:3: rulePage
                    {
                     before(grammarAccess.getUIContainerAccess().getPageParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePage();

                    state._fsp--;

                     after(grammarAccess.getUIContainerAccess().getPageParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUIDSL.g:959:2: ( ruleTemplate )
                    {
                    // InternalUIDSL.g:959:2: ( ruleTemplate )
                    // InternalUIDSL.g:960:3: ruleTemplate
                    {
                     before(grammarAccess.getUIContainerAccess().getTemplateParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTemplate();

                    state._fsp--;

                     after(grammarAccess.getUIContainerAccess().getTemplateParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUIDSL.g:965:2: ( ruleFragment )
                    {
                    // InternalUIDSL.g:965:2: ( ruleFragment )
                    // InternalUIDSL.g:966:3: ruleFragment
                    {
                     before(grammarAccess.getUIContainerAccess().getFragmentParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFragment();

                    state._fsp--;

                     after(grammarAccess.getUIContainerAccess().getFragmentParserRuleCall_2()); 

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
    // $ANTLR end "rule__UIContainer__Alternatives"


    // $ANTLR start "rule__AtomExpression__Alternatives"
    // InternalUIDSL.g:975:1: rule__AtomExpression__Alternatives : ( ( ruleConstant ) | ( ( rule__AtomExpression__Group_1__0 ) ) );
    public final void rule__AtomExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:979:1: ( ( ruleConstant ) | ( ( rule__AtomExpression__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_INT && LA6_0<=RULE_STRING)||(LA6_0>=11 && LA6_0<=12)||LA6_0==39) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalUIDSL.g:980:2: ( ruleConstant )
                    {
                    // InternalUIDSL.g:980:2: ( ruleConstant )
                    // InternalUIDSL.g:981:3: ruleConstant
                    {
                     before(grammarAccess.getAtomExpressionAccess().getConstantParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleConstant();

                    state._fsp--;

                     after(grammarAccess.getAtomExpressionAccess().getConstantParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUIDSL.g:986:2: ( ( rule__AtomExpression__Group_1__0 ) )
                    {
                    // InternalUIDSL.g:986:2: ( ( rule__AtomExpression__Group_1__0 ) )
                    // InternalUIDSL.g:987:3: ( rule__AtomExpression__Group_1__0 )
                    {
                     before(grammarAccess.getAtomExpressionAccess().getGroup_1()); 
                    // InternalUIDSL.g:988:3: ( rule__AtomExpression__Group_1__0 )
                    // InternalUIDSL.g:988:4: rule__AtomExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtomExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__AtomExpression__Alternatives"


    // $ANTLR start "superConcept__Alternatives"
    // InternalUIDSL.g:996:1: superConcept__Alternatives : ( ( ruleDTOClass ) | ( ruleEnum ) );
    public final void superConcept__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1000:1: ( ( ruleDTOClass ) | ( ruleEnum ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==29) ) {
                alt7=1;
            }
            else if ( (LA7_0==36) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalUIDSL.g:1001:2: ( ruleDTOClass )
                    {
                    // InternalUIDSL.g:1001:2: ( ruleDTOClass )
                    // InternalUIDSL.g:1002:3: ruleDTOClass
                    {
                     before(grammarAccess.getDTOConceptAccess().getDTOClassParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDTOClass();

                    state._fsp--;

                     after(grammarAccess.getDTOConceptAccess().getDTOClassParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUIDSL.g:1007:2: ( ruleEnum )
                    {
                    // InternalUIDSL.g:1007:2: ( ruleEnum )
                    // InternalUIDSL.g:1008:3: ruleEnum
                    {
                     before(grammarAccess.getDTOConceptAccess().getEnumParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEnum();

                    state._fsp--;

                     after(grammarAccess.getDTOConceptAccess().getEnumParserRuleCall_1()); 

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
    // $ANTLR end "superConcept__Alternatives"


    // $ANTLR start "rule__BasicType__Alternatives"
    // InternalUIDSL.g:1017:1: rule__BasicType__Alternatives : ( ( superBasicType ) | ( ( rule__BasicType__Group_1__0 ) ) | ( ( rule__BasicType__Group_2__0 ) ) | ( ( rule__BasicType__Group_3__0 ) ) | ( ( rule__BasicType__Group_4__0 ) ) | ( ( rule__BasicType__Group_5__0 ) ) );
    public final void rule__BasicType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1021:1: ( ( superBasicType ) | ( ( rule__BasicType__Group_1__0 ) ) | ( ( rule__BasicType__Group_2__0 ) ) | ( ( rule__BasicType__Group_3__0 ) ) | ( ( rule__BasicType__Group_4__0 ) ) | ( ( rule__BasicType__Group_5__0 ) ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
                {
                alt8=1;
                }
                break;
            case 31:
                {
                alt8=2;
                }
                break;
            case 32:
                {
                alt8=3;
                }
                break;
            case 33:
                {
                alt8=4;
                }
                break;
            case 34:
                {
                alt8=5;
                }
                break;
            case 35:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalUIDSL.g:1022:2: ( superBasicType )
                    {
                    // InternalUIDSL.g:1022:2: ( superBasicType )
                    // InternalUIDSL.g:1023:3: superBasicType
                    {
                     before(grammarAccess.getBasicTypeAccess().getBasicTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    superBasicType();

                    state._fsp--;

                     after(grammarAccess.getBasicTypeAccess().getBasicTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUIDSL.g:1028:2: ( ( rule__BasicType__Group_1__0 ) )
                    {
                    // InternalUIDSL.g:1028:2: ( ( rule__BasicType__Group_1__0 ) )
                    // InternalUIDSL.g:1029:3: ( rule__BasicType__Group_1__0 )
                    {
                     before(grammarAccess.getBasicTypeAccess().getGroup_1()); 
                    // InternalUIDSL.g:1030:3: ( rule__BasicType__Group_1__0 )
                    // InternalUIDSL.g:1030:4: rule__BasicType__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BasicType__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBasicTypeAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUIDSL.g:1034:2: ( ( rule__BasicType__Group_2__0 ) )
                    {
                    // InternalUIDSL.g:1034:2: ( ( rule__BasicType__Group_2__0 ) )
                    // InternalUIDSL.g:1035:3: ( rule__BasicType__Group_2__0 )
                    {
                     before(grammarAccess.getBasicTypeAccess().getGroup_2()); 
                    // InternalUIDSL.g:1036:3: ( rule__BasicType__Group_2__0 )
                    // InternalUIDSL.g:1036:4: rule__BasicType__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BasicType__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBasicTypeAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUIDSL.g:1040:2: ( ( rule__BasicType__Group_3__0 ) )
                    {
                    // InternalUIDSL.g:1040:2: ( ( rule__BasicType__Group_3__0 ) )
                    // InternalUIDSL.g:1041:3: ( rule__BasicType__Group_3__0 )
                    {
                     before(grammarAccess.getBasicTypeAccess().getGroup_3()); 
                    // InternalUIDSL.g:1042:3: ( rule__BasicType__Group_3__0 )
                    // InternalUIDSL.g:1042:4: rule__BasicType__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BasicType__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBasicTypeAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalUIDSL.g:1046:2: ( ( rule__BasicType__Group_4__0 ) )
                    {
                    // InternalUIDSL.g:1046:2: ( ( rule__BasicType__Group_4__0 ) )
                    // InternalUIDSL.g:1047:3: ( rule__BasicType__Group_4__0 )
                    {
                     before(grammarAccess.getBasicTypeAccess().getGroup_4()); 
                    // InternalUIDSL.g:1048:3: ( rule__BasicType__Group_4__0 )
                    // InternalUIDSL.g:1048:4: rule__BasicType__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BasicType__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBasicTypeAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalUIDSL.g:1052:2: ( ( rule__BasicType__Group_5__0 ) )
                    {
                    // InternalUIDSL.g:1052:2: ( ( rule__BasicType__Group_5__0 ) )
                    // InternalUIDSL.g:1053:3: ( rule__BasicType__Group_5__0 )
                    {
                     before(grammarAccess.getBasicTypeAccess().getGroup_5()); 
                    // InternalUIDSL.g:1054:3: ( rule__BasicType__Group_5__0 )
                    // InternalUIDSL.g:1054:4: rule__BasicType__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BasicType__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBasicTypeAccess().getGroup_5()); 

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
    // $ANTLR end "rule__BasicType__Alternatives"


    // $ANTLR start "rule__Constant__Alternatives"
    // InternalUIDSL.g:1062:1: rule__Constant__Alternatives : ( ( ( rule__Constant__Group_0__0 ) ) | ( ( rule__Constant__Group_1__0 ) ) | ( ( rule__Constant__Group_2__0 ) ) | ( ( rule__Constant__Group_3__0 ) ) | ( ( rule__Constant__Group_4__0 ) ) | ( ( rule__Constant__Group_5__0 ) ) );
    public final void rule__Constant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1066:1: ( ( ( rule__Constant__Group_0__0 ) ) | ( ( rule__Constant__Group_1__0 ) ) | ( ( rule__Constant__Group_2__0 ) ) | ( ( rule__Constant__Group_3__0 ) ) | ( ( rule__Constant__Group_4__0 ) ) | ( ( rule__Constant__Group_5__0 ) ) )
            int alt9=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                switch ( input.LA(2) ) {
                case 37:
                    {
                    alt9=2;
                    }
                    break;
                case 38:
                    {
                    alt9=5;
                    }
                    break;
                case EOF:
                case RULE_ID:
                case RULE_INT:
                case RULE_STRING:
                case 11:
                case 12:
                case 20:
                case 23:
                case 24:
                case 28:
                case 39:
                    {
                    alt9=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }

                }
                break;
            case RULE_STRING:
                {
                alt9=3;
                }
                break;
            case 11:
            case 12:
                {
                alt9=4;
                }
                break;
            case 39:
                {
                alt9=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalUIDSL.g:1067:2: ( ( rule__Constant__Group_0__0 ) )
                    {
                    // InternalUIDSL.g:1067:2: ( ( rule__Constant__Group_0__0 ) )
                    // InternalUIDSL.g:1068:3: ( rule__Constant__Group_0__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_0()); 
                    // InternalUIDSL.g:1069:3: ( rule__Constant__Group_0__0 )
                    // InternalUIDSL.g:1069:4: rule__Constant__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstantAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUIDSL.g:1073:2: ( ( rule__Constant__Group_1__0 ) )
                    {
                    // InternalUIDSL.g:1073:2: ( ( rule__Constant__Group_1__0 ) )
                    // InternalUIDSL.g:1074:3: ( rule__Constant__Group_1__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_1()); 
                    // InternalUIDSL.g:1075:3: ( rule__Constant__Group_1__0 )
                    // InternalUIDSL.g:1075:4: rule__Constant__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstantAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUIDSL.g:1079:2: ( ( rule__Constant__Group_2__0 ) )
                    {
                    // InternalUIDSL.g:1079:2: ( ( rule__Constant__Group_2__0 ) )
                    // InternalUIDSL.g:1080:3: ( rule__Constant__Group_2__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_2()); 
                    // InternalUIDSL.g:1081:3: ( rule__Constant__Group_2__0 )
                    // InternalUIDSL.g:1081:4: rule__Constant__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstantAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUIDSL.g:1085:2: ( ( rule__Constant__Group_3__0 ) )
                    {
                    // InternalUIDSL.g:1085:2: ( ( rule__Constant__Group_3__0 ) )
                    // InternalUIDSL.g:1086:3: ( rule__Constant__Group_3__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_3()); 
                    // InternalUIDSL.g:1087:3: ( rule__Constant__Group_3__0 )
                    // InternalUIDSL.g:1087:4: rule__Constant__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstantAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalUIDSL.g:1091:2: ( ( rule__Constant__Group_4__0 ) )
                    {
                    // InternalUIDSL.g:1091:2: ( ( rule__Constant__Group_4__0 ) )
                    // InternalUIDSL.g:1092:3: ( rule__Constant__Group_4__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_4()); 
                    // InternalUIDSL.g:1093:3: ( rule__Constant__Group_4__0 )
                    // InternalUIDSL.g:1093:4: rule__Constant__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstantAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalUIDSL.g:1097:2: ( ( rule__Constant__Group_5__0 ) )
                    {
                    // InternalUIDSL.g:1097:2: ( ( rule__Constant__Group_5__0 ) )
                    // InternalUIDSL.g:1098:3: ( rule__Constant__Group_5__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_5()); 
                    // InternalUIDSL.g:1099:3: ( rule__Constant__Group_5__0 )
                    // InternalUIDSL.g:1099:4: rule__Constant__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstantAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Constant__Alternatives"


    // $ANTLR start "rule__Constant__ValueAlternatives_3_1_0"
    // InternalUIDSL.g:1107:1: rule__Constant__ValueAlternatives_3_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Constant__ValueAlternatives_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1111:1: ( ( 'true' ) | ( 'false' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==11) ) {
                alt10=1;
            }
            else if ( (LA10_0==12) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalUIDSL.g:1112:2: ( 'true' )
                    {
                    // InternalUIDSL.g:1112:2: ( 'true' )
                    // InternalUIDSL.g:1113:3: 'true'
                    {
                     before(grammarAccess.getConstantAccess().getValueTrueKeyword_3_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getConstantAccess().getValueTrueKeyword_3_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUIDSL.g:1118:2: ( 'false' )
                    {
                    // InternalUIDSL.g:1118:2: ( 'false' )
                    // InternalUIDSL.g:1119:3: 'false'
                    {
                     before(grammarAccess.getConstantAccess().getValueFalseKeyword_3_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getConstantAccess().getValueFalseKeyword_3_1_0_1()); 

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
    // $ANTLR end "rule__Constant__ValueAlternatives_3_1_0"


    // $ANTLR start "rule__EntityOption__Alternatives"
    // InternalUIDSL.g:1128:1: rule__EntityOption__Alternatives : ( ( ( rule__EntityOption__Group_0__0 ) ) | ( ( rule__EntityOption__Group_1__0 ) ) );
    public final void rule__EntityOption__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1132:1: ( ( ( rule__EntityOption__Group_0__0 ) ) | ( ( rule__EntityOption__Group_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==52) ) {
                alt11=1;
            }
            else if ( (LA11_0==40) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalUIDSL.g:1133:2: ( ( rule__EntityOption__Group_0__0 ) )
                    {
                    // InternalUIDSL.g:1133:2: ( ( rule__EntityOption__Group_0__0 ) )
                    // InternalUIDSL.g:1134:3: ( rule__EntityOption__Group_0__0 )
                    {
                     before(grammarAccess.getEntityOptionAccess().getGroup_0()); 
                    // InternalUIDSL.g:1135:3: ( rule__EntityOption__Group_0__0 )
                    // InternalUIDSL.g:1135:4: rule__EntityOption__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EntityOption__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEntityOptionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUIDSL.g:1139:2: ( ( rule__EntityOption__Group_1__0 ) )
                    {
                    // InternalUIDSL.g:1139:2: ( ( rule__EntityOption__Group_1__0 ) )
                    // InternalUIDSL.g:1140:3: ( rule__EntityOption__Group_1__0 )
                    {
                     before(grammarAccess.getEntityOptionAccess().getGroup_1()); 
                    // InternalUIDSL.g:1141:3: ( rule__EntityOption__Group_1__0 )
                    // InternalUIDSL.g:1141:4: rule__EntityOption__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EntityOption__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEntityOptionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__EntityOption__Alternatives"


    // $ANTLR start "rule__InheritanceMappingType__TypeAlternatives_0"
    // InternalUIDSL.g:1149:1: rule__InheritanceMappingType__TypeAlternatives_0 : ( ( 'SINGLE_TABLE' ) | ( 'TABLE_PER_CONCRETE_CLASS' ) | ( 'TABLE_PER_CLASS' ) );
    public final void rule__InheritanceMappingType__TypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1153:1: ( ( 'SINGLE_TABLE' ) | ( 'TABLE_PER_CONCRETE_CLASS' ) | ( 'TABLE_PER_CLASS' ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt12=1;
                }
                break;
            case 14:
                {
                alt12=2;
                }
                break;
            case 15:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalUIDSL.g:1154:2: ( 'SINGLE_TABLE' )
                    {
                    // InternalUIDSL.g:1154:2: ( 'SINGLE_TABLE' )
                    // InternalUIDSL.g:1155:3: 'SINGLE_TABLE'
                    {
                     before(grammarAccess.getInheritanceMappingTypeAccess().getTypeSINGLE_TABLEKeyword_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getInheritanceMappingTypeAccess().getTypeSINGLE_TABLEKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUIDSL.g:1160:2: ( 'TABLE_PER_CONCRETE_CLASS' )
                    {
                    // InternalUIDSL.g:1160:2: ( 'TABLE_PER_CONCRETE_CLASS' )
                    // InternalUIDSL.g:1161:3: 'TABLE_PER_CONCRETE_CLASS'
                    {
                     before(grammarAccess.getInheritanceMappingTypeAccess().getTypeTABLE_PER_CONCRETE_CLASSKeyword_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getInheritanceMappingTypeAccess().getTypeTABLE_PER_CONCRETE_CLASSKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUIDSL.g:1166:2: ( 'TABLE_PER_CLASS' )
                    {
                    // InternalUIDSL.g:1166:2: ( 'TABLE_PER_CLASS' )
                    // InternalUIDSL.g:1167:3: 'TABLE_PER_CLASS'
                    {
                     before(grammarAccess.getInheritanceMappingTypeAccess().getTypeTABLE_PER_CLASSKeyword_0_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getInheritanceMappingTypeAccess().getTypeTABLE_PER_CLASSKeyword_0_2()); 

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
    // $ANTLR end "rule__InheritanceMappingType__TypeAlternatives_0"


    // $ANTLR start "rule__AttributeType__Alternatives"
    // InternalUIDSL.g:1176:1: rule__AttributeType__Alternatives : ( ( ruleSingleType ) | ( ruleCollectionType ) );
    public final void rule__AttributeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1180:1: ( ( ruleSingleType ) | ( ruleCollectionType ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID||(LA13_0>=31 && LA13_0<=35)||(LA13_0>=42 && LA13_0<=46)) ) {
                alt13=1;
            }
            else if ( (LA13_0==47) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalUIDSL.g:1181:2: ( ruleSingleType )
                    {
                    // InternalUIDSL.g:1181:2: ( ruleSingleType )
                    // InternalUIDSL.g:1182:3: ruleSingleType
                    {
                     before(grammarAccess.getAttributeTypeAccess().getSingleTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSingleType();

                    state._fsp--;

                     after(grammarAccess.getAttributeTypeAccess().getSingleTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUIDSL.g:1187:2: ( ruleCollectionType )
                    {
                    // InternalUIDSL.g:1187:2: ( ruleCollectionType )
                    // InternalUIDSL.g:1188:3: ruleCollectionType
                    {
                     before(grammarAccess.getAttributeTypeAccess().getCollectionTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCollectionType();

                    state._fsp--;

                     after(grammarAccess.getAttributeTypeAccess().getCollectionTypeParserRuleCall_1()); 

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
    // $ANTLR end "rule__AttributeType__Alternatives"


    // $ANTLR start "rule__SingleType__Alternatives"
    // InternalUIDSL.g:1197:1: rule__SingleType__Alternatives : ( ( ruleBasicType ) | ( ruleRefType ) );
    public final void rule__SingleType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1201:1: ( ( ruleBasicType ) | ( ruleRefType ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=31 && LA14_0<=35)||(LA14_0>=42 && LA14_0<=46)) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalUIDSL.g:1202:2: ( ruleBasicType )
                    {
                    // InternalUIDSL.g:1202:2: ( ruleBasicType )
                    // InternalUIDSL.g:1203:3: ruleBasicType
                    {
                     before(grammarAccess.getSingleTypeAccess().getBasicTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBasicType();

                    state._fsp--;

                     after(grammarAccess.getSingleTypeAccess().getBasicTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUIDSL.g:1208:2: ( ruleRefType )
                    {
                    // InternalUIDSL.g:1208:2: ( ruleRefType )
                    // InternalUIDSL.g:1209:3: ruleRefType
                    {
                     before(grammarAccess.getSingleTypeAccess().getRefTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRefType();

                    state._fsp--;

                     after(grammarAccess.getSingleTypeAccess().getRefTypeParserRuleCall_1()); 

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
    // $ANTLR end "rule__SingleType__Alternatives"


    // $ANTLR start "superBasicType__Alternatives"
    // InternalUIDSL.g:1218:1: superBasicType__Alternatives : ( ( ( superBasicType__Group_0__0 ) ) | ( ( superBasicType__Group_1__0 ) ) | ( ( superBasicType__Group_2__0 ) ) | ( ( superBasicType__Group_3__0 ) ) | ( ( superBasicType__Group_4__0 ) ) );
    public final void superBasicType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1222:1: ( ( ( superBasicType__Group_0__0 ) ) | ( ( superBasicType__Group_1__0 ) ) | ( ( superBasicType__Group_2__0 ) ) | ( ( superBasicType__Group_3__0 ) ) | ( ( superBasicType__Group_4__0 ) ) )
            int alt15=5;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt15=1;
                }
                break;
            case 43:
                {
                alt15=2;
                }
                break;
            case 44:
                {
                alt15=3;
                }
                break;
            case 45:
                {
                alt15=4;
                }
                break;
            case 46:
                {
                alt15=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalUIDSL.g:1223:2: ( ( superBasicType__Group_0__0 ) )
                    {
                    // InternalUIDSL.g:1223:2: ( ( superBasicType__Group_0__0 ) )
                    // InternalUIDSL.g:1224:3: ( superBasicType__Group_0__0 )
                    {
                     before(grammarAccess.getDomainModelBasicTypeAccess().getGroup_0()); 
                    // InternalUIDSL.g:1225:3: ( superBasicType__Group_0__0 )
                    // InternalUIDSL.g:1225:4: superBasicType__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    superBasicType__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDomainModelBasicTypeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUIDSL.g:1229:2: ( ( superBasicType__Group_1__0 ) )
                    {
                    // InternalUIDSL.g:1229:2: ( ( superBasicType__Group_1__0 ) )
                    // InternalUIDSL.g:1230:3: ( superBasicType__Group_1__0 )
                    {
                     before(grammarAccess.getDomainModelBasicTypeAccess().getGroup_1()); 
                    // InternalUIDSL.g:1231:3: ( superBasicType__Group_1__0 )
                    // InternalUIDSL.g:1231:4: superBasicType__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    superBasicType__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDomainModelBasicTypeAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUIDSL.g:1235:2: ( ( superBasicType__Group_2__0 ) )
                    {
                    // InternalUIDSL.g:1235:2: ( ( superBasicType__Group_2__0 ) )
                    // InternalUIDSL.g:1236:3: ( superBasicType__Group_2__0 )
                    {
                     before(grammarAccess.getDomainModelBasicTypeAccess().getGroup_2()); 
                    // InternalUIDSL.g:1237:3: ( superBasicType__Group_2__0 )
                    // InternalUIDSL.g:1237:4: superBasicType__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    superBasicType__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDomainModelBasicTypeAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUIDSL.g:1241:2: ( ( superBasicType__Group_3__0 ) )
                    {
                    // InternalUIDSL.g:1241:2: ( ( superBasicType__Group_3__0 ) )
                    // InternalUIDSL.g:1242:3: ( superBasicType__Group_3__0 )
                    {
                     before(grammarAccess.getDomainModelBasicTypeAccess().getGroup_3()); 
                    // InternalUIDSL.g:1243:3: ( superBasicType__Group_3__0 )
                    // InternalUIDSL.g:1243:4: superBasicType__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    superBasicType__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDomainModelBasicTypeAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalUIDSL.g:1247:2: ( ( superBasicType__Group_4__0 ) )
                    {
                    // InternalUIDSL.g:1247:2: ( ( superBasicType__Group_4__0 ) )
                    // InternalUIDSL.g:1248:3: ( superBasicType__Group_4__0 )
                    {
                     before(grammarAccess.getDomainModelBasicTypeAccess().getGroup_4()); 
                    // InternalUIDSL.g:1249:3: ( superBasicType__Group_4__0 )
                    // InternalUIDSL.g:1249:4: superBasicType__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    superBasicType__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDomainModelBasicTypeAccess().getGroup_4()); 

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
    // $ANTLR end "superBasicType__Alternatives"


    // $ANTLR start "rule__AttributeOption__Alternatives"
    // InternalUIDSL.g:1257:1: rule__AttributeOption__Alternatives : ( ( ( rule__AttributeOption__Group_0__0 ) ) | ( ( rule__AttributeOption__Group_1__0 ) ) | ( ( rule__AttributeOption__Group_2__0 ) ) | ( ( rule__AttributeOption__Group_3__0 ) ) );
    public final void rule__AttributeOption__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1261:1: ( ( ( rule__AttributeOption__Group_0__0 ) ) | ( ( rule__AttributeOption__Group_1__0 ) ) | ( ( rule__AttributeOption__Group_2__0 ) ) | ( ( rule__AttributeOption__Group_3__0 ) ) )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt16=1;
                }
                break;
            case 54:
                {
                alt16=2;
                }
                break;
            case 50:
                {
                alt16=3;
                }
                break;
            case 51:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalUIDSL.g:1262:2: ( ( rule__AttributeOption__Group_0__0 ) )
                    {
                    // InternalUIDSL.g:1262:2: ( ( rule__AttributeOption__Group_0__0 ) )
                    // InternalUIDSL.g:1263:3: ( rule__AttributeOption__Group_0__0 )
                    {
                     before(grammarAccess.getAttributeOptionAccess().getGroup_0()); 
                    // InternalUIDSL.g:1264:3: ( rule__AttributeOption__Group_0__0 )
                    // InternalUIDSL.g:1264:4: rule__AttributeOption__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeOption__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeOptionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUIDSL.g:1268:2: ( ( rule__AttributeOption__Group_1__0 ) )
                    {
                    // InternalUIDSL.g:1268:2: ( ( rule__AttributeOption__Group_1__0 ) )
                    // InternalUIDSL.g:1269:3: ( rule__AttributeOption__Group_1__0 )
                    {
                     before(grammarAccess.getAttributeOptionAccess().getGroup_1()); 
                    // InternalUIDSL.g:1270:3: ( rule__AttributeOption__Group_1__0 )
                    // InternalUIDSL.g:1270:4: rule__AttributeOption__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeOption__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeOptionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUIDSL.g:1274:2: ( ( rule__AttributeOption__Group_2__0 ) )
                    {
                    // InternalUIDSL.g:1274:2: ( ( rule__AttributeOption__Group_2__0 ) )
                    // InternalUIDSL.g:1275:3: ( rule__AttributeOption__Group_2__0 )
                    {
                     before(grammarAccess.getAttributeOptionAccess().getGroup_2()); 
                    // InternalUIDSL.g:1276:3: ( rule__AttributeOption__Group_2__0 )
                    // InternalUIDSL.g:1276:4: rule__AttributeOption__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeOption__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeOptionAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUIDSL.g:1280:2: ( ( rule__AttributeOption__Group_3__0 ) )
                    {
                    // InternalUIDSL.g:1280:2: ( ( rule__AttributeOption__Group_3__0 ) )
                    // InternalUIDSL.g:1281:3: ( rule__AttributeOption__Group_3__0 )
                    {
                     before(grammarAccess.getAttributeOptionAccess().getGroup_3()); 
                    // InternalUIDSL.g:1282:3: ( rule__AttributeOption__Group_3__0 )
                    // InternalUIDSL.g:1282:4: rule__AttributeOption__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeOption__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeOptionAccess().getGroup_3()); 

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
    // $ANTLR end "rule__AttributeOption__Alternatives"


    // $ANTLR start "rule__CardinalityType__Alternatives"
    // InternalUIDSL.g:1290:1: rule__CardinalityType__Alternatives : ( ( ( 'one' ) ) | ( ( 'many' ) ) );
    public final void rule__CardinalityType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1294:1: ( ( ( 'one' ) ) | ( ( 'many' ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==16) ) {
                alt17=1;
            }
            else if ( (LA17_0==17) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalUIDSL.g:1295:2: ( ( 'one' ) )
                    {
                    // InternalUIDSL.g:1295:2: ( ( 'one' ) )
                    // InternalUIDSL.g:1296:3: ( 'one' )
                    {
                     before(grammarAccess.getCardinalityTypeAccess().getOneEnumLiteralDeclaration_0()); 
                    // InternalUIDSL.g:1297:3: ( 'one' )
                    // InternalUIDSL.g:1297:4: 'one'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getCardinalityTypeAccess().getOneEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUIDSL.g:1301:2: ( ( 'many' ) )
                    {
                    // InternalUIDSL.g:1301:2: ( ( 'many' ) )
                    // InternalUIDSL.g:1302:3: ( 'many' )
                    {
                     before(grammarAccess.getCardinalityTypeAccess().getManyEnumLiteralDeclaration_1()); 
                    // InternalUIDSL.g:1303:3: ( 'many' )
                    // InternalUIDSL.g:1303:4: 'many'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getCardinalityTypeAccess().getManyEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__CardinalityType__Alternatives"


    // $ANTLR start "rule__ServerComponent__Group__0"
    // InternalUIDSL.g:1311:1: rule__ServerComponent__Group__0 : rule__ServerComponent__Group__0__Impl rule__ServerComponent__Group__1 ;
    public final void rule__ServerComponent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1315:1: ( rule__ServerComponent__Group__0__Impl rule__ServerComponent__Group__1 )
            // InternalUIDSL.g:1316:2: rule__ServerComponent__Group__0__Impl rule__ServerComponent__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ServerComponent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerComponent__Group__1();

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
    // $ANTLR end "rule__ServerComponent__Group__0"


    // $ANTLR start "rule__ServerComponent__Group__0__Impl"
    // InternalUIDSL.g:1323:1: rule__ServerComponent__Group__0__Impl : ( 'server_component' ) ;
    public final void rule__ServerComponent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1327:1: ( ( 'server_component' ) )
            // InternalUIDSL.g:1328:1: ( 'server_component' )
            {
            // InternalUIDSL.g:1328:1: ( 'server_component' )
            // InternalUIDSL.g:1329:2: 'server_component'
            {
             before(grammarAccess.getServerComponentAccess().getServer_componentKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getServerComponentAccess().getServer_componentKeyword_0()); 

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
    // $ANTLR end "rule__ServerComponent__Group__0__Impl"


    // $ANTLR start "rule__ServerComponent__Group__1"
    // InternalUIDSL.g:1338:1: rule__ServerComponent__Group__1 : rule__ServerComponent__Group__1__Impl rule__ServerComponent__Group__2 ;
    public final void rule__ServerComponent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1342:1: ( rule__ServerComponent__Group__1__Impl rule__ServerComponent__Group__2 )
            // InternalUIDSL.g:1343:2: rule__ServerComponent__Group__1__Impl rule__ServerComponent__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ServerComponent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerComponent__Group__2();

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
    // $ANTLR end "rule__ServerComponent__Group__1"


    // $ANTLR start "rule__ServerComponent__Group__1__Impl"
    // InternalUIDSL.g:1350:1: rule__ServerComponent__Group__1__Impl : ( ( rule__ServerComponent__NameAssignment_1 ) ) ;
    public final void rule__ServerComponent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1354:1: ( ( ( rule__ServerComponent__NameAssignment_1 ) ) )
            // InternalUIDSL.g:1355:1: ( ( rule__ServerComponent__NameAssignment_1 ) )
            {
            // InternalUIDSL.g:1355:1: ( ( rule__ServerComponent__NameAssignment_1 ) )
            // InternalUIDSL.g:1356:2: ( rule__ServerComponent__NameAssignment_1 )
            {
             before(grammarAccess.getServerComponentAccess().getNameAssignment_1()); 
            // InternalUIDSL.g:1357:2: ( rule__ServerComponent__NameAssignment_1 )
            // InternalUIDSL.g:1357:3: rule__ServerComponent__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ServerComponent__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getServerComponentAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ServerComponent__Group__1__Impl"


    // $ANTLR start "rule__ServerComponent__Group__2"
    // InternalUIDSL.g:1365:1: rule__ServerComponent__Group__2 : rule__ServerComponent__Group__2__Impl rule__ServerComponent__Group__3 ;
    public final void rule__ServerComponent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1369:1: ( rule__ServerComponent__Group__2__Impl rule__ServerComponent__Group__3 )
            // InternalUIDSL.g:1370:2: rule__ServerComponent__Group__2__Impl rule__ServerComponent__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__ServerComponent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerComponent__Group__3();

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
    // $ANTLR end "rule__ServerComponent__Group__2"


    // $ANTLR start "rule__ServerComponent__Group__2__Impl"
    // InternalUIDSL.g:1377:1: rule__ServerComponent__Group__2__Impl : ( '{' ) ;
    public final void rule__ServerComponent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1381:1: ( ( '{' ) )
            // InternalUIDSL.g:1382:1: ( '{' )
            {
            // InternalUIDSL.g:1382:1: ( '{' )
            // InternalUIDSL.g:1383:2: '{'
            {
             before(grammarAccess.getServerComponentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getServerComponentAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__ServerComponent__Group__2__Impl"


    // $ANTLR start "rule__ServerComponent__Group__3"
    // InternalUIDSL.g:1392:1: rule__ServerComponent__Group__3 : rule__ServerComponent__Group__3__Impl rule__ServerComponent__Group__4 ;
    public final void rule__ServerComponent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1396:1: ( rule__ServerComponent__Group__3__Impl rule__ServerComponent__Group__4 )
            // InternalUIDSL.g:1397:2: rule__ServerComponent__Group__3__Impl rule__ServerComponent__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__ServerComponent__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerComponent__Group__4();

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
    // $ANTLR end "rule__ServerComponent__Group__3"


    // $ANTLR start "rule__ServerComponent__Group__3__Impl"
    // InternalUIDSL.g:1404:1: rule__ServerComponent__Group__3__Impl : ( ( rule__ServerComponent__MembersAssignment_3 )* ) ;
    public final void rule__ServerComponent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1408:1: ( ( ( rule__ServerComponent__MembersAssignment_3 )* ) )
            // InternalUIDSL.g:1409:1: ( ( rule__ServerComponent__MembersAssignment_3 )* )
            {
            // InternalUIDSL.g:1409:1: ( ( rule__ServerComponent__MembersAssignment_3 )* )
            // InternalUIDSL.g:1410:2: ( rule__ServerComponent__MembersAssignment_3 )*
            {
             before(grammarAccess.getServerComponentAccess().getMembersAssignment_3()); 
            // InternalUIDSL.g:1411:2: ( rule__ServerComponent__MembersAssignment_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    int LA18_2 = input.LA(2);

                    if ( (LA18_2==RULE_ID) ) {
                        int LA18_4 = input.LA(3);

                        if ( ((LA18_4>=21 && LA18_4<=22)) ) {
                            alt18=1;
                        }


                    }


                }
                else if ( ((LA18_0>=31 && LA18_0<=35)||(LA18_0>=42 && LA18_0<=47)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalUIDSL.g:1411:3: rule__ServerComponent__MembersAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ServerComponent__MembersAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getServerComponentAccess().getMembersAssignment_3()); 

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
    // $ANTLR end "rule__ServerComponent__Group__3__Impl"


    // $ANTLR start "rule__ServerComponent__Group__4"
    // InternalUIDSL.g:1419:1: rule__ServerComponent__Group__4 : rule__ServerComponent__Group__4__Impl rule__ServerComponent__Group__5 ;
    public final void rule__ServerComponent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1423:1: ( rule__ServerComponent__Group__4__Impl rule__ServerComponent__Group__5 )
            // InternalUIDSL.g:1424:2: rule__ServerComponent__Group__4__Impl rule__ServerComponent__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__ServerComponent__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerComponent__Group__5();

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
    // $ANTLR end "rule__ServerComponent__Group__4"


    // $ANTLR start "rule__ServerComponent__Group__4__Impl"
    // InternalUIDSL.g:1431:1: rule__ServerComponent__Group__4__Impl : ( ( rule__ServerComponent__ExpressionsAssignment_4 )* ) ;
    public final void rule__ServerComponent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1435:1: ( ( ( rule__ServerComponent__ExpressionsAssignment_4 )* ) )
            // InternalUIDSL.g:1436:1: ( ( rule__ServerComponent__ExpressionsAssignment_4 )* )
            {
            // InternalUIDSL.g:1436:1: ( ( rule__ServerComponent__ExpressionsAssignment_4 )* )
            // InternalUIDSL.g:1437:2: ( rule__ServerComponent__ExpressionsAssignment_4 )*
            {
             before(grammarAccess.getServerComponentAccess().getExpressionsAssignment_4()); 
            // InternalUIDSL.g:1438:2: ( rule__ServerComponent__ExpressionsAssignment_4 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_STRING)||(LA19_0>=11 && LA19_0<=12)||LA19_0==39) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalUIDSL.g:1438:3: rule__ServerComponent__ExpressionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ServerComponent__ExpressionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getServerComponentAccess().getExpressionsAssignment_4()); 

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
    // $ANTLR end "rule__ServerComponent__Group__4__Impl"


    // $ANTLR start "rule__ServerComponent__Group__5"
    // InternalUIDSL.g:1446:1: rule__ServerComponent__Group__5 : rule__ServerComponent__Group__5__Impl ;
    public final void rule__ServerComponent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1450:1: ( rule__ServerComponent__Group__5__Impl )
            // InternalUIDSL.g:1451:2: rule__ServerComponent__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServerComponent__Group__5__Impl();

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
    // $ANTLR end "rule__ServerComponent__Group__5"


    // $ANTLR start "rule__ServerComponent__Group__5__Impl"
    // InternalUIDSL.g:1457:1: rule__ServerComponent__Group__5__Impl : ( '}' ) ;
    public final void rule__ServerComponent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1461:1: ( ( '}' ) )
            // InternalUIDSL.g:1462:1: ( '}' )
            {
            // InternalUIDSL.g:1462:1: ( '}' )
            // InternalUIDSL.g:1463:2: '}'
            {
             before(grammarAccess.getServerComponentAccess().getRightCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getServerComponentAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__ServerComponent__Group__5__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // InternalUIDSL.g:1473:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1477:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // InternalUIDSL.g:1478:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__1();

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
    // $ANTLR end "rule__Field__Group__0"


    // $ANTLR start "rule__Field__Group__0__Impl"
    // InternalUIDSL.g:1485:1: rule__Field__Group__0__Impl : ( ruleTypedConcept ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1489:1: ( ( ruleTypedConcept ) )
            // InternalUIDSL.g:1490:1: ( ruleTypedConcept )
            {
            // InternalUIDSL.g:1490:1: ( ruleTypedConcept )
            // InternalUIDSL.g:1491:2: ruleTypedConcept
            {
             before(grammarAccess.getFieldAccess().getTypedConceptParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTypedConcept();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getTypedConceptParserRuleCall_0()); 

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
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // InternalUIDSL.g:1500:1: rule__Field__Group__1 : rule__Field__Group__1__Impl ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1504:1: ( rule__Field__Group__1__Impl )
            // InternalUIDSL.g:1505:2: rule__Field__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__1__Impl();

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
    // $ANTLR end "rule__Field__Group__1"


    // $ANTLR start "rule__Field__Group__1__Impl"
    // InternalUIDSL.g:1511:1: rule__Field__Group__1__Impl : ( ';' ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1515:1: ( ( ';' ) )
            // InternalUIDSL.g:1516:1: ( ';' )
            {
            // InternalUIDSL.g:1516:1: ( ';' )
            // InternalUIDSL.g:1517:2: ';'
            {
             before(grammarAccess.getFieldAccess().getSemicolonKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getSemicolonKeyword_1()); 

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
    // $ANTLR end "rule__Field__Group__1__Impl"


    // $ANTLR start "rule__Method__Group__0"
    // InternalUIDSL.g:1527:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1531:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // InternalUIDSL.g:1532:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Method__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__1();

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
    // $ANTLR end "rule__Method__Group__0"


    // $ANTLR start "rule__Method__Group__0__Impl"
    // InternalUIDSL.g:1539:1: rule__Method__Group__0__Impl : ( ruleTypedConcept ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1543:1: ( ( ruleTypedConcept ) )
            // InternalUIDSL.g:1544:1: ( ruleTypedConcept )
            {
            // InternalUIDSL.g:1544:1: ( ruleTypedConcept )
            // InternalUIDSL.g:1545:2: ruleTypedConcept
            {
             before(grammarAccess.getMethodAccess().getTypedConceptParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTypedConcept();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getTypedConceptParserRuleCall_0()); 

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
    // $ANTLR end "rule__Method__Group__0__Impl"


    // $ANTLR start "rule__Method__Group__1"
    // InternalUIDSL.g:1554:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1558:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // InternalUIDSL.g:1559:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Method__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__2();

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
    // $ANTLR end "rule__Method__Group__1"


    // $ANTLR start "rule__Method__Group__1__Impl"
    // InternalUIDSL.g:1566:1: rule__Method__Group__1__Impl : ( '(' ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1570:1: ( ( '(' ) )
            // InternalUIDSL.g:1571:1: ( '(' )
            {
            // InternalUIDSL.g:1571:1: ( '(' )
            // InternalUIDSL.g:1572:2: '('
            {
             before(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Method__Group__1__Impl"


    // $ANTLR start "rule__Method__Group__2"
    // InternalUIDSL.g:1581:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1585:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // InternalUIDSL.g:1586:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Method__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__3();

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
    // $ANTLR end "rule__Method__Group__2"


    // $ANTLR start "rule__Method__Group__2__Impl"
    // InternalUIDSL.g:1593:1: rule__Method__Group__2__Impl : ( ( rule__Method__ParamsAssignment_2 ) ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1597:1: ( ( ( rule__Method__ParamsAssignment_2 ) ) )
            // InternalUIDSL.g:1598:1: ( ( rule__Method__ParamsAssignment_2 ) )
            {
            // InternalUIDSL.g:1598:1: ( ( rule__Method__ParamsAssignment_2 ) )
            // InternalUIDSL.g:1599:2: ( rule__Method__ParamsAssignment_2 )
            {
             before(grammarAccess.getMethodAccess().getParamsAssignment_2()); 
            // InternalUIDSL.g:1600:2: ( rule__Method__ParamsAssignment_2 )
            // InternalUIDSL.g:1600:3: rule__Method__ParamsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Method__ParamsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getParamsAssignment_2()); 

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
    // $ANTLR end "rule__Method__Group__2__Impl"


    // $ANTLR start "rule__Method__Group__3"
    // InternalUIDSL.g:1608:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1612:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // InternalUIDSL.g:1613:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Method__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__4();

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
    // $ANTLR end "rule__Method__Group__3"


    // $ANTLR start "rule__Method__Group__3__Impl"
    // InternalUIDSL.g:1620:1: rule__Method__Group__3__Impl : ( ( rule__Method__Group_3__0 )* ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1624:1: ( ( ( rule__Method__Group_3__0 )* ) )
            // InternalUIDSL.g:1625:1: ( ( rule__Method__Group_3__0 )* )
            {
            // InternalUIDSL.g:1625:1: ( ( rule__Method__Group_3__0 )* )
            // InternalUIDSL.g:1626:2: ( rule__Method__Group_3__0 )*
            {
             before(grammarAccess.getMethodAccess().getGroup_3()); 
            // InternalUIDSL.g:1627:2: ( rule__Method__Group_3__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==24) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalUIDSL.g:1627:3: rule__Method__Group_3__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Method__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getMethodAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Method__Group__3__Impl"


    // $ANTLR start "rule__Method__Group__4"
    // InternalUIDSL.g:1635:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1639:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // InternalUIDSL.g:1640:2: rule__Method__Group__4__Impl rule__Method__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Method__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__5();

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
    // $ANTLR end "rule__Method__Group__4"


    // $ANTLR start "rule__Method__Group__4__Impl"
    // InternalUIDSL.g:1647:1: rule__Method__Group__4__Impl : ( ')' ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1651:1: ( ( ')' ) )
            // InternalUIDSL.g:1652:1: ( ')' )
            {
            // InternalUIDSL.g:1652:1: ( ')' )
            // InternalUIDSL.g:1653:2: ')'
            {
             before(grammarAccess.getMethodAccess().getRightParenthesisKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__Method__Group__4__Impl"


    // $ANTLR start "rule__Method__Group__5"
    // InternalUIDSL.g:1662:1: rule__Method__Group__5 : rule__Method__Group__5__Impl ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1666:1: ( rule__Method__Group__5__Impl )
            // InternalUIDSL.g:1667:2: rule__Method__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__5__Impl();

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
    // $ANTLR end "rule__Method__Group__5"


    // $ANTLR start "rule__Method__Group__5__Impl"
    // InternalUIDSL.g:1673:1: rule__Method__Group__5__Impl : ( ';' ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1677:1: ( ( ';' ) )
            // InternalUIDSL.g:1678:1: ( ';' )
            {
            // InternalUIDSL.g:1678:1: ( ';' )
            // InternalUIDSL.g:1679:2: ';'
            {
             before(grammarAccess.getMethodAccess().getSemicolonKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getSemicolonKeyword_5()); 

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
    // $ANTLR end "rule__Method__Group__5__Impl"


    // $ANTLR start "rule__Method__Group_3__0"
    // InternalUIDSL.g:1689:1: rule__Method__Group_3__0 : rule__Method__Group_3__0__Impl rule__Method__Group_3__1 ;
    public final void rule__Method__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1693:1: ( rule__Method__Group_3__0__Impl rule__Method__Group_3__1 )
            // InternalUIDSL.g:1694:2: rule__Method__Group_3__0__Impl rule__Method__Group_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Method__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_3__1();

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
    // $ANTLR end "rule__Method__Group_3__0"


    // $ANTLR start "rule__Method__Group_3__0__Impl"
    // InternalUIDSL.g:1701:1: rule__Method__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Method__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1705:1: ( ( ',' ) )
            // InternalUIDSL.g:1706:1: ( ',' )
            {
            // InternalUIDSL.g:1706:1: ( ',' )
            // InternalUIDSL.g:1707:2: ','
            {
             before(grammarAccess.getMethodAccess().getCommaKeyword_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__Method__Group_3__0__Impl"


    // $ANTLR start "rule__Method__Group_3__1"
    // InternalUIDSL.g:1716:1: rule__Method__Group_3__1 : rule__Method__Group_3__1__Impl ;
    public final void rule__Method__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1720:1: ( rule__Method__Group_3__1__Impl )
            // InternalUIDSL.g:1721:2: rule__Method__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group_3__1__Impl();

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
    // $ANTLR end "rule__Method__Group_3__1"


    // $ANTLR start "rule__Method__Group_3__1__Impl"
    // InternalUIDSL.g:1727:1: rule__Method__Group_3__1__Impl : ( ( rule__Method__ParamsAssignment_3_1 ) ) ;
    public final void rule__Method__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1731:1: ( ( ( rule__Method__ParamsAssignment_3_1 ) ) )
            // InternalUIDSL.g:1732:1: ( ( rule__Method__ParamsAssignment_3_1 ) )
            {
            // InternalUIDSL.g:1732:1: ( ( rule__Method__ParamsAssignment_3_1 ) )
            // InternalUIDSL.g:1733:2: ( rule__Method__ParamsAssignment_3_1 )
            {
             before(grammarAccess.getMethodAccess().getParamsAssignment_3_1()); 
            // InternalUIDSL.g:1734:2: ( rule__Method__ParamsAssignment_3_1 )
            // InternalUIDSL.g:1734:3: rule__Method__ParamsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Method__ParamsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getParamsAssignment_3_1()); 

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
    // $ANTLR end "rule__Method__Group_3__1__Impl"


    // $ANTLR start "rule__TypedConcept__Group__0"
    // InternalUIDSL.g:1743:1: rule__TypedConcept__Group__0 : rule__TypedConcept__Group__0__Impl rule__TypedConcept__Group__1 ;
    public final void rule__TypedConcept__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1747:1: ( rule__TypedConcept__Group__0__Impl rule__TypedConcept__Group__1 )
            // InternalUIDSL.g:1748:2: rule__TypedConcept__Group__0__Impl rule__TypedConcept__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__TypedConcept__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypedConcept__Group__1();

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
    // $ANTLR end "rule__TypedConcept__Group__0"


    // $ANTLR start "rule__TypedConcept__Group__0__Impl"
    // InternalUIDSL.g:1755:1: rule__TypedConcept__Group__0__Impl : ( ( rule__TypedConcept__TypeAssignment_0 ) ) ;
    public final void rule__TypedConcept__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1759:1: ( ( ( rule__TypedConcept__TypeAssignment_0 ) ) )
            // InternalUIDSL.g:1760:1: ( ( rule__TypedConcept__TypeAssignment_0 ) )
            {
            // InternalUIDSL.g:1760:1: ( ( rule__TypedConcept__TypeAssignment_0 ) )
            // InternalUIDSL.g:1761:2: ( rule__TypedConcept__TypeAssignment_0 )
            {
             before(grammarAccess.getTypedConceptAccess().getTypeAssignment_0()); 
            // InternalUIDSL.g:1762:2: ( rule__TypedConcept__TypeAssignment_0 )
            // InternalUIDSL.g:1762:3: rule__TypedConcept__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TypedConcept__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTypedConceptAccess().getTypeAssignment_0()); 

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
    // $ANTLR end "rule__TypedConcept__Group__0__Impl"


    // $ANTLR start "rule__TypedConcept__Group__1"
    // InternalUIDSL.g:1770:1: rule__TypedConcept__Group__1 : rule__TypedConcept__Group__1__Impl ;
    public final void rule__TypedConcept__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1774:1: ( rule__TypedConcept__Group__1__Impl )
            // InternalUIDSL.g:1775:2: rule__TypedConcept__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypedConcept__Group__1__Impl();

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
    // $ANTLR end "rule__TypedConcept__Group__1"


    // $ANTLR start "rule__TypedConcept__Group__1__Impl"
    // InternalUIDSL.g:1781:1: rule__TypedConcept__Group__1__Impl : ( ( rule__TypedConcept__NameAssignment_1 ) ) ;
    public final void rule__TypedConcept__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1785:1: ( ( ( rule__TypedConcept__NameAssignment_1 ) ) )
            // InternalUIDSL.g:1786:1: ( ( rule__TypedConcept__NameAssignment_1 ) )
            {
            // InternalUIDSL.g:1786:1: ( ( rule__TypedConcept__NameAssignment_1 ) )
            // InternalUIDSL.g:1787:2: ( rule__TypedConcept__NameAssignment_1 )
            {
             before(grammarAccess.getTypedConceptAccess().getNameAssignment_1()); 
            // InternalUIDSL.g:1788:2: ( rule__TypedConcept__NameAssignment_1 )
            // InternalUIDSL.g:1788:3: rule__TypedConcept__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TypedConcept__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypedConceptAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__TypedConcept__Group__1__Impl"


    // $ANTLR start "rule__Page__Group__0"
    // InternalUIDSL.g:1797:1: rule__Page__Group__0 : rule__Page__Group__0__Impl rule__Page__Group__1 ;
    public final void rule__Page__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1801:1: ( rule__Page__Group__0__Impl rule__Page__Group__1 )
            // InternalUIDSL.g:1802:2: rule__Page__Group__0__Impl rule__Page__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Page__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__1();

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
    // $ANTLR end "rule__Page__Group__0"


    // $ANTLR start "rule__Page__Group__0__Impl"
    // InternalUIDSL.g:1809:1: rule__Page__Group__0__Impl : ( 'page' ) ;
    public final void rule__Page__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1813:1: ( ( 'page' ) )
            // InternalUIDSL.g:1814:1: ( 'page' )
            {
            // InternalUIDSL.g:1814:1: ( 'page' )
            // InternalUIDSL.g:1815:2: 'page'
            {
             before(grammarAccess.getPageAccess().getPageKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getPageKeyword_0()); 

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
    // $ANTLR end "rule__Page__Group__0__Impl"


    // $ANTLR start "rule__Page__Group__1"
    // InternalUIDSL.g:1824:1: rule__Page__Group__1 : rule__Page__Group__1__Impl ;
    public final void rule__Page__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1828:1: ( rule__Page__Group__1__Impl )
            // InternalUIDSL.g:1829:2: rule__Page__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Page__Group__1__Impl();

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
    // $ANTLR end "rule__Page__Group__1"


    // $ANTLR start "rule__Page__Group__1__Impl"
    // InternalUIDSL.g:1835:1: rule__Page__Group__1__Impl : ( ( rule__Page__NameAssignment_1 ) ) ;
    public final void rule__Page__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1839:1: ( ( ( rule__Page__NameAssignment_1 ) ) )
            // InternalUIDSL.g:1840:1: ( ( rule__Page__NameAssignment_1 ) )
            {
            // InternalUIDSL.g:1840:1: ( ( rule__Page__NameAssignment_1 ) )
            // InternalUIDSL.g:1841:2: ( rule__Page__NameAssignment_1 )
            {
             before(grammarAccess.getPageAccess().getNameAssignment_1()); 
            // InternalUIDSL.g:1842:2: ( rule__Page__NameAssignment_1 )
            // InternalUIDSL.g:1842:3: rule__Page__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Page__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Page__Group__1__Impl"


    // $ANTLR start "rule__Template__Group__0"
    // InternalUIDSL.g:1851:1: rule__Template__Group__0 : rule__Template__Group__0__Impl rule__Template__Group__1 ;
    public final void rule__Template__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1855:1: ( rule__Template__Group__0__Impl rule__Template__Group__1 )
            // InternalUIDSL.g:1856:2: rule__Template__Group__0__Impl rule__Template__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Template__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Template__Group__1();

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
    // $ANTLR end "rule__Template__Group__0"


    // $ANTLR start "rule__Template__Group__0__Impl"
    // InternalUIDSL.g:1863:1: rule__Template__Group__0__Impl : ( 'template' ) ;
    public final void rule__Template__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1867:1: ( ( 'template' ) )
            // InternalUIDSL.g:1868:1: ( 'template' )
            {
            // InternalUIDSL.g:1868:1: ( 'template' )
            // InternalUIDSL.g:1869:2: 'template'
            {
             before(grammarAccess.getTemplateAccess().getTemplateKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTemplateAccess().getTemplateKeyword_0()); 

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
    // $ANTLR end "rule__Template__Group__0__Impl"


    // $ANTLR start "rule__Template__Group__1"
    // InternalUIDSL.g:1878:1: rule__Template__Group__1 : rule__Template__Group__1__Impl ;
    public final void rule__Template__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1882:1: ( rule__Template__Group__1__Impl )
            // InternalUIDSL.g:1883:2: rule__Template__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Template__Group__1__Impl();

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
    // $ANTLR end "rule__Template__Group__1"


    // $ANTLR start "rule__Template__Group__1__Impl"
    // InternalUIDSL.g:1889:1: rule__Template__Group__1__Impl : ( ( rule__Template__NameAssignment_1 ) ) ;
    public final void rule__Template__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1893:1: ( ( ( rule__Template__NameAssignment_1 ) ) )
            // InternalUIDSL.g:1894:1: ( ( rule__Template__NameAssignment_1 ) )
            {
            // InternalUIDSL.g:1894:1: ( ( rule__Template__NameAssignment_1 ) )
            // InternalUIDSL.g:1895:2: ( rule__Template__NameAssignment_1 )
            {
             before(grammarAccess.getTemplateAccess().getNameAssignment_1()); 
            // InternalUIDSL.g:1896:2: ( rule__Template__NameAssignment_1 )
            // InternalUIDSL.g:1896:3: rule__Template__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Template__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTemplateAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Template__Group__1__Impl"


    // $ANTLR start "rule__Fragment__Group__0"
    // InternalUIDSL.g:1905:1: rule__Fragment__Group__0 : rule__Fragment__Group__0__Impl rule__Fragment__Group__1 ;
    public final void rule__Fragment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1909:1: ( rule__Fragment__Group__0__Impl rule__Fragment__Group__1 )
            // InternalUIDSL.g:1910:2: rule__Fragment__Group__0__Impl rule__Fragment__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Fragment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fragment__Group__1();

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
    // $ANTLR end "rule__Fragment__Group__0"


    // $ANTLR start "rule__Fragment__Group__0__Impl"
    // InternalUIDSL.g:1917:1: rule__Fragment__Group__0__Impl : ( 'fragment' ) ;
    public final void rule__Fragment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1921:1: ( ( 'fragment' ) )
            // InternalUIDSL.g:1922:1: ( 'fragment' )
            {
            // InternalUIDSL.g:1922:1: ( 'fragment' )
            // InternalUIDSL.g:1923:2: 'fragment'
            {
             before(grammarAccess.getFragmentAccess().getFragmentKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFragmentAccess().getFragmentKeyword_0()); 

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
    // $ANTLR end "rule__Fragment__Group__0__Impl"


    // $ANTLR start "rule__Fragment__Group__1"
    // InternalUIDSL.g:1932:1: rule__Fragment__Group__1 : rule__Fragment__Group__1__Impl ;
    public final void rule__Fragment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1936:1: ( rule__Fragment__Group__1__Impl )
            // InternalUIDSL.g:1937:2: rule__Fragment__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fragment__Group__1__Impl();

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
    // $ANTLR end "rule__Fragment__Group__1"


    // $ANTLR start "rule__Fragment__Group__1__Impl"
    // InternalUIDSL.g:1943:1: rule__Fragment__Group__1__Impl : ( ( rule__Fragment__NameAssignment_1 ) ) ;
    public final void rule__Fragment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1947:1: ( ( ( rule__Fragment__NameAssignment_1 ) ) )
            // InternalUIDSL.g:1948:1: ( ( rule__Fragment__NameAssignment_1 ) )
            {
            // InternalUIDSL.g:1948:1: ( ( rule__Fragment__NameAssignment_1 ) )
            // InternalUIDSL.g:1949:2: ( rule__Fragment__NameAssignment_1 )
            {
             before(grammarAccess.getFragmentAccess().getNameAssignment_1()); 
            // InternalUIDSL.g:1950:2: ( rule__Fragment__NameAssignment_1 )
            // InternalUIDSL.g:1950:3: rule__Fragment__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Fragment__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFragmentAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Fragment__Group__1__Impl"


    // $ANTLR start "rule__MemberSelectionExpression__Group__0"
    // InternalUIDSL.g:1959:1: rule__MemberSelectionExpression__Group__0 : rule__MemberSelectionExpression__Group__0__Impl rule__MemberSelectionExpression__Group__1 ;
    public final void rule__MemberSelectionExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1963:1: ( rule__MemberSelectionExpression__Group__0__Impl rule__MemberSelectionExpression__Group__1 )
            // InternalUIDSL.g:1964:2: rule__MemberSelectionExpression__Group__0__Impl rule__MemberSelectionExpression__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalUIDSL.g:1971:1: rule__MemberSelectionExpression__Group__0__Impl : ( ruleAtomExpression ) ;
    public final void rule__MemberSelectionExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1975:1: ( ( ruleAtomExpression ) )
            // InternalUIDSL.g:1976:1: ( ruleAtomExpression )
            {
            // InternalUIDSL.g:1976:1: ( ruleAtomExpression )
            // InternalUIDSL.g:1977:2: ruleAtomExpression
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
    // InternalUIDSL.g:1986:1: rule__MemberSelectionExpression__Group__1 : rule__MemberSelectionExpression__Group__1__Impl ;
    public final void rule__MemberSelectionExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:1990:1: ( rule__MemberSelectionExpression__Group__1__Impl )
            // InternalUIDSL.g:1991:2: rule__MemberSelectionExpression__Group__1__Impl
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
    // InternalUIDSL.g:1997:1: rule__MemberSelectionExpression__Group__1__Impl : ( ( rule__MemberSelectionExpression__Group_1__0 )* ) ;
    public final void rule__MemberSelectionExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2001:1: ( ( ( rule__MemberSelectionExpression__Group_1__0 )* ) )
            // InternalUIDSL.g:2002:1: ( ( rule__MemberSelectionExpression__Group_1__0 )* )
            {
            // InternalUIDSL.g:2002:1: ( ( rule__MemberSelectionExpression__Group_1__0 )* )
            // InternalUIDSL.g:2003:2: ( rule__MemberSelectionExpression__Group_1__0 )*
            {
             before(grammarAccess.getMemberSelectionExpressionAccess().getGroup_1()); 
            // InternalUIDSL.g:2004:2: ( rule__MemberSelectionExpression__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==28) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalUIDSL.g:2004:3: rule__MemberSelectionExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__MemberSelectionExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalUIDSL.g:2013:1: rule__MemberSelectionExpression__Group_1__0 : rule__MemberSelectionExpression__Group_1__0__Impl rule__MemberSelectionExpression__Group_1__1 ;
    public final void rule__MemberSelectionExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2017:1: ( rule__MemberSelectionExpression__Group_1__0__Impl rule__MemberSelectionExpression__Group_1__1 )
            // InternalUIDSL.g:2018:2: rule__MemberSelectionExpression__Group_1__0__Impl rule__MemberSelectionExpression__Group_1__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalUIDSL.g:2025:1: rule__MemberSelectionExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MemberSelectionExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2029:1: ( ( () ) )
            // InternalUIDSL.g:2030:1: ( () )
            {
            // InternalUIDSL.g:2030:1: ( () )
            // InternalUIDSL.g:2031:2: ()
            {
             before(grammarAccess.getMemberSelectionExpressionAccess().getMemberSelectionExpressionReceiverAction_1_0()); 
            // InternalUIDSL.g:2032:2: ()
            // InternalUIDSL.g:2032:3: 
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
    // InternalUIDSL.g:2040:1: rule__MemberSelectionExpression__Group_1__1 : rule__MemberSelectionExpression__Group_1__1__Impl rule__MemberSelectionExpression__Group_1__2 ;
    public final void rule__MemberSelectionExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2044:1: ( rule__MemberSelectionExpression__Group_1__1__Impl rule__MemberSelectionExpression__Group_1__2 )
            // InternalUIDSL.g:2045:2: rule__MemberSelectionExpression__Group_1__1__Impl rule__MemberSelectionExpression__Group_1__2
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
    // InternalUIDSL.g:2052:1: rule__MemberSelectionExpression__Group_1__1__Impl : ( '.' ) ;
    public final void rule__MemberSelectionExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2056:1: ( ( '.' ) )
            // InternalUIDSL.g:2057:1: ( '.' )
            {
            // InternalUIDSL.g:2057:1: ( '.' )
            // InternalUIDSL.g:2058:2: '.'
            {
             before(grammarAccess.getMemberSelectionExpressionAccess().getFullStopKeyword_1_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalUIDSL.g:2067:1: rule__MemberSelectionExpression__Group_1__2 : rule__MemberSelectionExpression__Group_1__2__Impl rule__MemberSelectionExpression__Group_1__3 ;
    public final void rule__MemberSelectionExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2071:1: ( rule__MemberSelectionExpression__Group_1__2__Impl rule__MemberSelectionExpression__Group_1__3 )
            // InternalUIDSL.g:2072:2: rule__MemberSelectionExpression__Group_1__2__Impl rule__MemberSelectionExpression__Group_1__3
            {
            pushFollow(FOLLOW_10);
            rule__MemberSelectionExpression__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemberSelectionExpression__Group_1__3();

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
    // InternalUIDSL.g:2079:1: rule__MemberSelectionExpression__Group_1__2__Impl : ( ( rule__MemberSelectionExpression__MemberAssignment_1_2 ) ) ;
    public final void rule__MemberSelectionExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2083:1: ( ( ( rule__MemberSelectionExpression__MemberAssignment_1_2 ) ) )
            // InternalUIDSL.g:2084:1: ( ( rule__MemberSelectionExpression__MemberAssignment_1_2 ) )
            {
            // InternalUIDSL.g:2084:1: ( ( rule__MemberSelectionExpression__MemberAssignment_1_2 ) )
            // InternalUIDSL.g:2085:2: ( rule__MemberSelectionExpression__MemberAssignment_1_2 )
            {
             before(grammarAccess.getMemberSelectionExpressionAccess().getMemberAssignment_1_2()); 
            // InternalUIDSL.g:2086:2: ( rule__MemberSelectionExpression__MemberAssignment_1_2 )
            // InternalUIDSL.g:2086:3: rule__MemberSelectionExpression__MemberAssignment_1_2
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


    // $ANTLR start "rule__MemberSelectionExpression__Group_1__3"
    // InternalUIDSL.g:2094:1: rule__MemberSelectionExpression__Group_1__3 : rule__MemberSelectionExpression__Group_1__3__Impl ;
    public final void rule__MemberSelectionExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2098:1: ( rule__MemberSelectionExpression__Group_1__3__Impl )
            // InternalUIDSL.g:2099:2: rule__MemberSelectionExpression__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MemberSelectionExpression__Group_1__3__Impl();

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
    // $ANTLR end "rule__MemberSelectionExpression__Group_1__3"


    // $ANTLR start "rule__MemberSelectionExpression__Group_1__3__Impl"
    // InternalUIDSL.g:2105:1: rule__MemberSelectionExpression__Group_1__3__Impl : ( ( rule__MemberSelectionExpression__Group_1_3__0 )? ) ;
    public final void rule__MemberSelectionExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2109:1: ( ( ( rule__MemberSelectionExpression__Group_1_3__0 )? ) )
            // InternalUIDSL.g:2110:1: ( ( rule__MemberSelectionExpression__Group_1_3__0 )? )
            {
            // InternalUIDSL.g:2110:1: ( ( rule__MemberSelectionExpression__Group_1_3__0 )? )
            // InternalUIDSL.g:2111:2: ( rule__MemberSelectionExpression__Group_1_3__0 )?
            {
             before(grammarAccess.getMemberSelectionExpressionAccess().getGroup_1_3()); 
            // InternalUIDSL.g:2112:2: ( rule__MemberSelectionExpression__Group_1_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==22) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalUIDSL.g:2112:3: rule__MemberSelectionExpression__Group_1_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MemberSelectionExpression__Group_1_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMemberSelectionExpressionAccess().getGroup_1_3()); 

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
    // $ANTLR end "rule__MemberSelectionExpression__Group_1__3__Impl"


    // $ANTLR start "rule__MemberSelectionExpression__Group_1_3__0"
    // InternalUIDSL.g:2121:1: rule__MemberSelectionExpression__Group_1_3__0 : rule__MemberSelectionExpression__Group_1_3__0__Impl rule__MemberSelectionExpression__Group_1_3__1 ;
    public final void rule__MemberSelectionExpression__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2125:1: ( rule__MemberSelectionExpression__Group_1_3__0__Impl rule__MemberSelectionExpression__Group_1_3__1 )
            // InternalUIDSL.g:2126:2: rule__MemberSelectionExpression__Group_1_3__0__Impl rule__MemberSelectionExpression__Group_1_3__1
            {
            pushFollow(FOLLOW_16);
            rule__MemberSelectionExpression__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemberSelectionExpression__Group_1_3__1();

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
    // $ANTLR end "rule__MemberSelectionExpression__Group_1_3__0"


    // $ANTLR start "rule__MemberSelectionExpression__Group_1_3__0__Impl"
    // InternalUIDSL.g:2133:1: rule__MemberSelectionExpression__Group_1_3__0__Impl : ( ( rule__MemberSelectionExpression__IsMethodAssignment_1_3_0 ) ) ;
    public final void rule__MemberSelectionExpression__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2137:1: ( ( ( rule__MemberSelectionExpression__IsMethodAssignment_1_3_0 ) ) )
            // InternalUIDSL.g:2138:1: ( ( rule__MemberSelectionExpression__IsMethodAssignment_1_3_0 ) )
            {
            // InternalUIDSL.g:2138:1: ( ( rule__MemberSelectionExpression__IsMethodAssignment_1_3_0 ) )
            // InternalUIDSL.g:2139:2: ( rule__MemberSelectionExpression__IsMethodAssignment_1_3_0 )
            {
             before(grammarAccess.getMemberSelectionExpressionAccess().getIsMethodAssignment_1_3_0()); 
            // InternalUIDSL.g:2140:2: ( rule__MemberSelectionExpression__IsMethodAssignment_1_3_0 )
            // InternalUIDSL.g:2140:3: rule__MemberSelectionExpression__IsMethodAssignment_1_3_0
            {
            pushFollow(FOLLOW_2);
            rule__MemberSelectionExpression__IsMethodAssignment_1_3_0();

            state._fsp--;


            }

             after(grammarAccess.getMemberSelectionExpressionAccess().getIsMethodAssignment_1_3_0()); 

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
    // $ANTLR end "rule__MemberSelectionExpression__Group_1_3__0__Impl"


    // $ANTLR start "rule__MemberSelectionExpression__Group_1_3__1"
    // InternalUIDSL.g:2148:1: rule__MemberSelectionExpression__Group_1_3__1 : rule__MemberSelectionExpression__Group_1_3__1__Impl rule__MemberSelectionExpression__Group_1_3__2 ;
    public final void rule__MemberSelectionExpression__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2152:1: ( rule__MemberSelectionExpression__Group_1_3__1__Impl rule__MemberSelectionExpression__Group_1_3__2 )
            // InternalUIDSL.g:2153:2: rule__MemberSelectionExpression__Group_1_3__1__Impl rule__MemberSelectionExpression__Group_1_3__2
            {
            pushFollow(FOLLOW_16);
            rule__MemberSelectionExpression__Group_1_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemberSelectionExpression__Group_1_3__2();

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
    // $ANTLR end "rule__MemberSelectionExpression__Group_1_3__1"


    // $ANTLR start "rule__MemberSelectionExpression__Group_1_3__1__Impl"
    // InternalUIDSL.g:2160:1: rule__MemberSelectionExpression__Group_1_3__1__Impl : ( ( rule__MemberSelectionExpression__Group_1_3_1__0 )? ) ;
    public final void rule__MemberSelectionExpression__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2164:1: ( ( ( rule__MemberSelectionExpression__Group_1_3_1__0 )? ) )
            // InternalUIDSL.g:2165:1: ( ( rule__MemberSelectionExpression__Group_1_3_1__0 )? )
            {
            // InternalUIDSL.g:2165:1: ( ( rule__MemberSelectionExpression__Group_1_3_1__0 )? )
            // InternalUIDSL.g:2166:2: ( rule__MemberSelectionExpression__Group_1_3_1__0 )?
            {
             before(grammarAccess.getMemberSelectionExpressionAccess().getGroup_1_3_1()); 
            // InternalUIDSL.g:2167:2: ( rule__MemberSelectionExpression__Group_1_3_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_ID && LA23_0<=RULE_STRING)||(LA23_0>=11 && LA23_0<=12)||LA23_0==39) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalUIDSL.g:2167:3: rule__MemberSelectionExpression__Group_1_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MemberSelectionExpression__Group_1_3_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMemberSelectionExpressionAccess().getGroup_1_3_1()); 

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
    // $ANTLR end "rule__MemberSelectionExpression__Group_1_3__1__Impl"


    // $ANTLR start "rule__MemberSelectionExpression__Group_1_3__2"
    // InternalUIDSL.g:2175:1: rule__MemberSelectionExpression__Group_1_3__2 : rule__MemberSelectionExpression__Group_1_3__2__Impl ;
    public final void rule__MemberSelectionExpression__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2179:1: ( rule__MemberSelectionExpression__Group_1_3__2__Impl )
            // InternalUIDSL.g:2180:2: rule__MemberSelectionExpression__Group_1_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MemberSelectionExpression__Group_1_3__2__Impl();

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
    // $ANTLR end "rule__MemberSelectionExpression__Group_1_3__2"


    // $ANTLR start "rule__MemberSelectionExpression__Group_1_3__2__Impl"
    // InternalUIDSL.g:2186:1: rule__MemberSelectionExpression__Group_1_3__2__Impl : ( ')' ) ;
    public final void rule__MemberSelectionExpression__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2190:1: ( ( ')' ) )
            // InternalUIDSL.g:2191:1: ( ')' )
            {
            // InternalUIDSL.g:2191:1: ( ')' )
            // InternalUIDSL.g:2192:2: ')'
            {
             before(grammarAccess.getMemberSelectionExpressionAccess().getRightParenthesisKeyword_1_3_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMemberSelectionExpressionAccess().getRightParenthesisKeyword_1_3_2()); 

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
    // $ANTLR end "rule__MemberSelectionExpression__Group_1_3__2__Impl"


    // $ANTLR start "rule__MemberSelectionExpression__Group_1_3_1__0"
    // InternalUIDSL.g:2202:1: rule__MemberSelectionExpression__Group_1_3_1__0 : rule__MemberSelectionExpression__Group_1_3_1__0__Impl rule__MemberSelectionExpression__Group_1_3_1__1 ;
    public final void rule__MemberSelectionExpression__Group_1_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2206:1: ( rule__MemberSelectionExpression__Group_1_3_1__0__Impl rule__MemberSelectionExpression__Group_1_3_1__1 )
            // InternalUIDSL.g:2207:2: rule__MemberSelectionExpression__Group_1_3_1__0__Impl rule__MemberSelectionExpression__Group_1_3_1__1
            {
            pushFollow(FOLLOW_17);
            rule__MemberSelectionExpression__Group_1_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemberSelectionExpression__Group_1_3_1__1();

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
    // $ANTLR end "rule__MemberSelectionExpression__Group_1_3_1__0"


    // $ANTLR start "rule__MemberSelectionExpression__Group_1_3_1__0__Impl"
    // InternalUIDSL.g:2214:1: rule__MemberSelectionExpression__Group_1_3_1__0__Impl : ( ( rule__MemberSelectionExpression__ParamsAssignment_1_3_1_0 ) ) ;
    public final void rule__MemberSelectionExpression__Group_1_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2218:1: ( ( ( rule__MemberSelectionExpression__ParamsAssignment_1_3_1_0 ) ) )
            // InternalUIDSL.g:2219:1: ( ( rule__MemberSelectionExpression__ParamsAssignment_1_3_1_0 ) )
            {
            // InternalUIDSL.g:2219:1: ( ( rule__MemberSelectionExpression__ParamsAssignment_1_3_1_0 ) )
            // InternalUIDSL.g:2220:2: ( rule__MemberSelectionExpression__ParamsAssignment_1_3_1_0 )
            {
             before(grammarAccess.getMemberSelectionExpressionAccess().getParamsAssignment_1_3_1_0()); 
            // InternalUIDSL.g:2221:2: ( rule__MemberSelectionExpression__ParamsAssignment_1_3_1_0 )
            // InternalUIDSL.g:2221:3: rule__MemberSelectionExpression__ParamsAssignment_1_3_1_0
            {
            pushFollow(FOLLOW_2);
            rule__MemberSelectionExpression__ParamsAssignment_1_3_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMemberSelectionExpressionAccess().getParamsAssignment_1_3_1_0()); 

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
    // $ANTLR end "rule__MemberSelectionExpression__Group_1_3_1__0__Impl"


    // $ANTLR start "rule__MemberSelectionExpression__Group_1_3_1__1"
    // InternalUIDSL.g:2229:1: rule__MemberSelectionExpression__Group_1_3_1__1 : rule__MemberSelectionExpression__Group_1_3_1__1__Impl ;
    public final void rule__MemberSelectionExpression__Group_1_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2233:1: ( rule__MemberSelectionExpression__Group_1_3_1__1__Impl )
            // InternalUIDSL.g:2234:2: rule__MemberSelectionExpression__Group_1_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MemberSelectionExpression__Group_1_3_1__1__Impl();

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
    // $ANTLR end "rule__MemberSelectionExpression__Group_1_3_1__1"


    // $ANTLR start "rule__MemberSelectionExpression__Group_1_3_1__1__Impl"
    // InternalUIDSL.g:2240:1: rule__MemberSelectionExpression__Group_1_3_1__1__Impl : ( ( rule__MemberSelectionExpression__Group_1_3_1_1__0 )* ) ;
    public final void rule__MemberSelectionExpression__Group_1_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2244:1: ( ( ( rule__MemberSelectionExpression__Group_1_3_1_1__0 )* ) )
            // InternalUIDSL.g:2245:1: ( ( rule__MemberSelectionExpression__Group_1_3_1_1__0 )* )
            {
            // InternalUIDSL.g:2245:1: ( ( rule__MemberSelectionExpression__Group_1_3_1_1__0 )* )
            // InternalUIDSL.g:2246:2: ( rule__MemberSelectionExpression__Group_1_3_1_1__0 )*
            {
             before(grammarAccess.getMemberSelectionExpressionAccess().getGroup_1_3_1_1()); 
            // InternalUIDSL.g:2247:2: ( rule__MemberSelectionExpression__Group_1_3_1_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==24) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalUIDSL.g:2247:3: rule__MemberSelectionExpression__Group_1_3_1_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__MemberSelectionExpression__Group_1_3_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getMemberSelectionExpressionAccess().getGroup_1_3_1_1()); 

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
    // $ANTLR end "rule__MemberSelectionExpression__Group_1_3_1__1__Impl"


    // $ANTLR start "rule__MemberSelectionExpression__Group_1_3_1_1__0"
    // InternalUIDSL.g:2256:1: rule__MemberSelectionExpression__Group_1_3_1_1__0 : rule__MemberSelectionExpression__Group_1_3_1_1__0__Impl rule__MemberSelectionExpression__Group_1_3_1_1__1 ;
    public final void rule__MemberSelectionExpression__Group_1_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2260:1: ( rule__MemberSelectionExpression__Group_1_3_1_1__0__Impl rule__MemberSelectionExpression__Group_1_3_1_1__1 )
            // InternalUIDSL.g:2261:2: rule__MemberSelectionExpression__Group_1_3_1_1__0__Impl rule__MemberSelectionExpression__Group_1_3_1_1__1
            {
            pushFollow(FOLLOW_18);
            rule__MemberSelectionExpression__Group_1_3_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemberSelectionExpression__Group_1_3_1_1__1();

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
    // $ANTLR end "rule__MemberSelectionExpression__Group_1_3_1_1__0"


    // $ANTLR start "rule__MemberSelectionExpression__Group_1_3_1_1__0__Impl"
    // InternalUIDSL.g:2268:1: rule__MemberSelectionExpression__Group_1_3_1_1__0__Impl : ( ',' ) ;
    public final void rule__MemberSelectionExpression__Group_1_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2272:1: ( ( ',' ) )
            // InternalUIDSL.g:2273:1: ( ',' )
            {
            // InternalUIDSL.g:2273:1: ( ',' )
            // InternalUIDSL.g:2274:2: ','
            {
             before(grammarAccess.getMemberSelectionExpressionAccess().getCommaKeyword_1_3_1_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMemberSelectionExpressionAccess().getCommaKeyword_1_3_1_1_0()); 

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
    // $ANTLR end "rule__MemberSelectionExpression__Group_1_3_1_1__0__Impl"


    // $ANTLR start "rule__MemberSelectionExpression__Group_1_3_1_1__1"
    // InternalUIDSL.g:2283:1: rule__MemberSelectionExpression__Group_1_3_1_1__1 : rule__MemberSelectionExpression__Group_1_3_1_1__1__Impl ;
    public final void rule__MemberSelectionExpression__Group_1_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2287:1: ( rule__MemberSelectionExpression__Group_1_3_1_1__1__Impl )
            // InternalUIDSL.g:2288:2: rule__MemberSelectionExpression__Group_1_3_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MemberSelectionExpression__Group_1_3_1_1__1__Impl();

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
    // $ANTLR end "rule__MemberSelectionExpression__Group_1_3_1_1__1"


    // $ANTLR start "rule__MemberSelectionExpression__Group_1_3_1_1__1__Impl"
    // InternalUIDSL.g:2294:1: rule__MemberSelectionExpression__Group_1_3_1_1__1__Impl : ( ( rule__MemberSelectionExpression__ParamsAssignment_1_3_1_1_1 ) ) ;
    public final void rule__MemberSelectionExpression__Group_1_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2298:1: ( ( ( rule__MemberSelectionExpression__ParamsAssignment_1_3_1_1_1 ) ) )
            // InternalUIDSL.g:2299:1: ( ( rule__MemberSelectionExpression__ParamsAssignment_1_3_1_1_1 ) )
            {
            // InternalUIDSL.g:2299:1: ( ( rule__MemberSelectionExpression__ParamsAssignment_1_3_1_1_1 ) )
            // InternalUIDSL.g:2300:2: ( rule__MemberSelectionExpression__ParamsAssignment_1_3_1_1_1 )
            {
             before(grammarAccess.getMemberSelectionExpressionAccess().getParamsAssignment_1_3_1_1_1()); 
            // InternalUIDSL.g:2301:2: ( rule__MemberSelectionExpression__ParamsAssignment_1_3_1_1_1 )
            // InternalUIDSL.g:2301:3: rule__MemberSelectionExpression__ParamsAssignment_1_3_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MemberSelectionExpression__ParamsAssignment_1_3_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMemberSelectionExpressionAccess().getParamsAssignment_1_3_1_1_1()); 

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
    // $ANTLR end "rule__MemberSelectionExpression__Group_1_3_1_1__1__Impl"


    // $ANTLR start "rule__AtomExpression__Group_1__0"
    // InternalUIDSL.g:2310:1: rule__AtomExpression__Group_1__0 : rule__AtomExpression__Group_1__0__Impl rule__AtomExpression__Group_1__1 ;
    public final void rule__AtomExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2314:1: ( rule__AtomExpression__Group_1__0__Impl rule__AtomExpression__Group_1__1 )
            // InternalUIDSL.g:2315:2: rule__AtomExpression__Group_1__0__Impl rule__AtomExpression__Group_1__1
            {
            pushFollow(FOLLOW_18);
            rule__AtomExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomExpression__Group_1__1();

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
    // $ANTLR end "rule__AtomExpression__Group_1__0"


    // $ANTLR start "rule__AtomExpression__Group_1__0__Impl"
    // InternalUIDSL.g:2322:1: rule__AtomExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AtomExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2326:1: ( ( () ) )
            // InternalUIDSL.g:2327:1: ( () )
            {
            // InternalUIDSL.g:2327:1: ( () )
            // InternalUIDSL.g:2328:2: ()
            {
             before(grammarAccess.getAtomExpressionAccess().getVariableReferenceAction_1_0()); 
            // InternalUIDSL.g:2329:2: ()
            // InternalUIDSL.g:2329:3: 
            {
            }

             after(grammarAccess.getAtomExpressionAccess().getVariableReferenceAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AtomExpression__Group_1__1"
    // InternalUIDSL.g:2337:1: rule__AtomExpression__Group_1__1 : rule__AtomExpression__Group_1__1__Impl ;
    public final void rule__AtomExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2341:1: ( rule__AtomExpression__Group_1__1__Impl )
            // InternalUIDSL.g:2342:2: rule__AtomExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomExpression__Group_1__1__Impl();

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
    // $ANTLR end "rule__AtomExpression__Group_1__1"


    // $ANTLR start "rule__AtomExpression__Group_1__1__Impl"
    // InternalUIDSL.g:2348:1: rule__AtomExpression__Group_1__1__Impl : ( ( rule__AtomExpression__RefAssignment_1_1 ) ) ;
    public final void rule__AtomExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2352:1: ( ( ( rule__AtomExpression__RefAssignment_1_1 ) ) )
            // InternalUIDSL.g:2353:1: ( ( rule__AtomExpression__RefAssignment_1_1 ) )
            {
            // InternalUIDSL.g:2353:1: ( ( rule__AtomExpression__RefAssignment_1_1 ) )
            // InternalUIDSL.g:2354:2: ( rule__AtomExpression__RefAssignment_1_1 )
            {
             before(grammarAccess.getAtomExpressionAccess().getRefAssignment_1_1()); 
            // InternalUIDSL.g:2355:2: ( rule__AtomExpression__RefAssignment_1_1 )
            // InternalUIDSL.g:2355:3: rule__AtomExpression__RefAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AtomExpression__RefAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomExpressionAccess().getRefAssignment_1_1()); 

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
    // $ANTLR end "rule__AtomExpression__Group_1__1__Impl"


    // $ANTLR start "rule__DTOClass__Group__0"
    // InternalUIDSL.g:2364:1: rule__DTOClass__Group__0 : rule__DTOClass__Group__0__Impl rule__DTOClass__Group__1 ;
    public final void rule__DTOClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2368:1: ( rule__DTOClass__Group__0__Impl rule__DTOClass__Group__1 )
            // InternalUIDSL.g:2369:2: rule__DTOClass__Group__0__Impl rule__DTOClass__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DTOClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DTOClass__Group__1();

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
    // $ANTLR end "rule__DTOClass__Group__0"


    // $ANTLR start "rule__DTOClass__Group__0__Impl"
    // InternalUIDSL.g:2376:1: rule__DTOClass__Group__0__Impl : ( 'class' ) ;
    public final void rule__DTOClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2380:1: ( ( 'class' ) )
            // InternalUIDSL.g:2381:1: ( 'class' )
            {
            // InternalUIDSL.g:2381:1: ( 'class' )
            // InternalUIDSL.g:2382:2: 'class'
            {
             before(grammarAccess.getDTOClassAccess().getClassKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDTOClassAccess().getClassKeyword_0()); 

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
    // $ANTLR end "rule__DTOClass__Group__0__Impl"


    // $ANTLR start "rule__DTOClass__Group__1"
    // InternalUIDSL.g:2391:1: rule__DTOClass__Group__1 : rule__DTOClass__Group__1__Impl rule__DTOClass__Group__2 ;
    public final void rule__DTOClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2395:1: ( rule__DTOClass__Group__1__Impl rule__DTOClass__Group__2 )
            // InternalUIDSL.g:2396:2: rule__DTOClass__Group__1__Impl rule__DTOClass__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__DTOClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DTOClass__Group__2();

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
    // $ANTLR end "rule__DTOClass__Group__1"


    // $ANTLR start "rule__DTOClass__Group__1__Impl"
    // InternalUIDSL.g:2403:1: rule__DTOClass__Group__1__Impl : ( ( rule__DTOClass__NameAssignment_1 ) ) ;
    public final void rule__DTOClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2407:1: ( ( ( rule__DTOClass__NameAssignment_1 ) ) )
            // InternalUIDSL.g:2408:1: ( ( rule__DTOClass__NameAssignment_1 ) )
            {
            // InternalUIDSL.g:2408:1: ( ( rule__DTOClass__NameAssignment_1 ) )
            // InternalUIDSL.g:2409:2: ( rule__DTOClass__NameAssignment_1 )
            {
             before(grammarAccess.getDTOClassAccess().getNameAssignment_1()); 
            // InternalUIDSL.g:2410:2: ( rule__DTOClass__NameAssignment_1 )
            // InternalUIDSL.g:2410:3: rule__DTOClass__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DTOClass__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDTOClassAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__DTOClass__Group__1__Impl"


    // $ANTLR start "rule__DTOClass__Group__2"
    // InternalUIDSL.g:2418:1: rule__DTOClass__Group__2 : rule__DTOClass__Group__2__Impl rule__DTOClass__Group__3 ;
    public final void rule__DTOClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2422:1: ( rule__DTOClass__Group__2__Impl rule__DTOClass__Group__3 )
            // InternalUIDSL.g:2423:2: rule__DTOClass__Group__2__Impl rule__DTOClass__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__DTOClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DTOClass__Group__3();

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
    // $ANTLR end "rule__DTOClass__Group__2"


    // $ANTLR start "rule__DTOClass__Group__2__Impl"
    // InternalUIDSL.g:2430:1: rule__DTOClass__Group__2__Impl : ( ( rule__DTOClass__Group_2__0 )? ) ;
    public final void rule__DTOClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2434:1: ( ( ( rule__DTOClass__Group_2__0 )? ) )
            // InternalUIDSL.g:2435:1: ( ( rule__DTOClass__Group_2__0 )? )
            {
            // InternalUIDSL.g:2435:1: ( ( rule__DTOClass__Group_2__0 )? )
            // InternalUIDSL.g:2436:2: ( rule__DTOClass__Group_2__0 )?
            {
             before(grammarAccess.getDTOClassAccess().getGroup_2()); 
            // InternalUIDSL.g:2437:2: ( rule__DTOClass__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==30) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalUIDSL.g:2437:3: rule__DTOClass__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DTOClass__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDTOClassAccess().getGroup_2()); 

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
    // $ANTLR end "rule__DTOClass__Group__2__Impl"


    // $ANTLR start "rule__DTOClass__Group__3"
    // InternalUIDSL.g:2445:1: rule__DTOClass__Group__3 : rule__DTOClass__Group__3__Impl rule__DTOClass__Group__4 ;
    public final void rule__DTOClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2449:1: ( rule__DTOClass__Group__3__Impl rule__DTOClass__Group__4 )
            // InternalUIDSL.g:2450:2: rule__DTOClass__Group__3__Impl rule__DTOClass__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__DTOClass__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DTOClass__Group__4();

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
    // $ANTLR end "rule__DTOClass__Group__3"


    // $ANTLR start "rule__DTOClass__Group__3__Impl"
    // InternalUIDSL.g:2457:1: rule__DTOClass__Group__3__Impl : ( '{' ) ;
    public final void rule__DTOClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2461:1: ( ( '{' ) )
            // InternalUIDSL.g:2462:1: ( '{' )
            {
            // InternalUIDSL.g:2462:1: ( '{' )
            // InternalUIDSL.g:2463:2: '{'
            {
             before(grammarAccess.getDTOClassAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDTOClassAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__DTOClass__Group__3__Impl"


    // $ANTLR start "rule__DTOClass__Group__4"
    // InternalUIDSL.g:2472:1: rule__DTOClass__Group__4 : rule__DTOClass__Group__4__Impl rule__DTOClass__Group__5 ;
    public final void rule__DTOClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2476:1: ( rule__DTOClass__Group__4__Impl rule__DTOClass__Group__5 )
            // InternalUIDSL.g:2477:2: rule__DTOClass__Group__4__Impl rule__DTOClass__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__DTOClass__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DTOClass__Group__5();

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
    // $ANTLR end "rule__DTOClass__Group__4"


    // $ANTLR start "rule__DTOClass__Group__4__Impl"
    // InternalUIDSL.g:2484:1: rule__DTOClass__Group__4__Impl : ( ( rule__DTOClass__AttributesAssignment_4 )* ) ;
    public final void rule__DTOClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2488:1: ( ( ( rule__DTOClass__AttributesAssignment_4 )* ) )
            // InternalUIDSL.g:2489:1: ( ( rule__DTOClass__AttributesAssignment_4 )* )
            {
            // InternalUIDSL.g:2489:1: ( ( rule__DTOClass__AttributesAssignment_4 )* )
            // InternalUIDSL.g:2490:2: ( rule__DTOClass__AttributesAssignment_4 )*
            {
             before(grammarAccess.getDTOClassAccess().getAttributesAssignment_4()); 
            // InternalUIDSL.g:2491:2: ( rule__DTOClass__AttributesAssignment_4 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID||(LA26_0>=31 && LA26_0<=35)||(LA26_0>=42 && LA26_0<=47)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalUIDSL.g:2491:3: rule__DTOClass__AttributesAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__DTOClass__AttributesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getDTOClassAccess().getAttributesAssignment_4()); 

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
    // $ANTLR end "rule__DTOClass__Group__4__Impl"


    // $ANTLR start "rule__DTOClass__Group__5"
    // InternalUIDSL.g:2499:1: rule__DTOClass__Group__5 : rule__DTOClass__Group__5__Impl ;
    public final void rule__DTOClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2503:1: ( rule__DTOClass__Group__5__Impl )
            // InternalUIDSL.g:2504:2: rule__DTOClass__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DTOClass__Group__5__Impl();

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
    // $ANTLR end "rule__DTOClass__Group__5"


    // $ANTLR start "rule__DTOClass__Group__5__Impl"
    // InternalUIDSL.g:2510:1: rule__DTOClass__Group__5__Impl : ( '}' ) ;
    public final void rule__DTOClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2514:1: ( ( '}' ) )
            // InternalUIDSL.g:2515:1: ( '}' )
            {
            // InternalUIDSL.g:2515:1: ( '}' )
            // InternalUIDSL.g:2516:2: '}'
            {
             before(grammarAccess.getDTOClassAccess().getRightCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDTOClassAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__DTOClass__Group__5__Impl"


    // $ANTLR start "rule__DTOClass__Group_2__0"
    // InternalUIDSL.g:2526:1: rule__DTOClass__Group_2__0 : rule__DTOClass__Group_2__0__Impl rule__DTOClass__Group_2__1 ;
    public final void rule__DTOClass__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2530:1: ( rule__DTOClass__Group_2__0__Impl rule__DTOClass__Group_2__1 )
            // InternalUIDSL.g:2531:2: rule__DTOClass__Group_2__0__Impl rule__DTOClass__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__DTOClass__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DTOClass__Group_2__1();

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
    // $ANTLR end "rule__DTOClass__Group_2__0"


    // $ANTLR start "rule__DTOClass__Group_2__0__Impl"
    // InternalUIDSL.g:2538:1: rule__DTOClass__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__DTOClass__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2542:1: ( ( 'extends' ) )
            // InternalUIDSL.g:2543:1: ( 'extends' )
            {
            // InternalUIDSL.g:2543:1: ( 'extends' )
            // InternalUIDSL.g:2544:2: 'extends'
            {
             before(grammarAccess.getDTOClassAccess().getExtendsKeyword_2_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDTOClassAccess().getExtendsKeyword_2_0()); 

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
    // $ANTLR end "rule__DTOClass__Group_2__0__Impl"


    // $ANTLR start "rule__DTOClass__Group_2__1"
    // InternalUIDSL.g:2553:1: rule__DTOClass__Group_2__1 : rule__DTOClass__Group_2__1__Impl ;
    public final void rule__DTOClass__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2557:1: ( rule__DTOClass__Group_2__1__Impl )
            // InternalUIDSL.g:2558:2: rule__DTOClass__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DTOClass__Group_2__1__Impl();

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
    // $ANTLR end "rule__DTOClass__Group_2__1"


    // $ANTLR start "rule__DTOClass__Group_2__1__Impl"
    // InternalUIDSL.g:2564:1: rule__DTOClass__Group_2__1__Impl : ( ( rule__DTOClass__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__DTOClass__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2568:1: ( ( ( rule__DTOClass__SuperTypeAssignment_2_1 ) ) )
            // InternalUIDSL.g:2569:1: ( ( rule__DTOClass__SuperTypeAssignment_2_1 ) )
            {
            // InternalUIDSL.g:2569:1: ( ( rule__DTOClass__SuperTypeAssignment_2_1 ) )
            // InternalUIDSL.g:2570:2: ( rule__DTOClass__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getDTOClassAccess().getSuperTypeAssignment_2_1()); 
            // InternalUIDSL.g:2571:2: ( rule__DTOClass__SuperTypeAssignment_2_1 )
            // InternalUIDSL.g:2571:3: rule__DTOClass__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DTOClass__SuperTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDTOClassAccess().getSuperTypeAssignment_2_1()); 

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
    // $ANTLR end "rule__DTOClass__Group_2__1__Impl"


    // $ANTLR start "rule__BasicType__Group_1__0"
    // InternalUIDSL.g:2580:1: rule__BasicType__Group_1__0 : rule__BasicType__Group_1__0__Impl rule__BasicType__Group_1__1 ;
    public final void rule__BasicType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2584:1: ( rule__BasicType__Group_1__0__Impl rule__BasicType__Group_1__1 )
            // InternalUIDSL.g:2585:2: rule__BasicType__Group_1__0__Impl rule__BasicType__Group_1__1
            {
            pushFollow(FOLLOW_21);
            rule__BasicType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicType__Group_1__1();

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
    // $ANTLR end "rule__BasicType__Group_1__0"


    // $ANTLR start "rule__BasicType__Group_1__0__Impl"
    // InternalUIDSL.g:2592:1: rule__BasicType__Group_1__0__Impl : ( () ) ;
    public final void rule__BasicType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2596:1: ( ( () ) )
            // InternalUIDSL.g:2597:1: ( () )
            {
            // InternalUIDSL.g:2597:1: ( () )
            // InternalUIDSL.g:2598:2: ()
            {
             before(grammarAccess.getBasicTypeAccess().getTextTypeAction_1_0()); 
            // InternalUIDSL.g:2599:2: ()
            // InternalUIDSL.g:2599:3: 
            {
            }

             after(grammarAccess.getBasicTypeAccess().getTextTypeAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicType__Group_1__0__Impl"


    // $ANTLR start "rule__BasicType__Group_1__1"
    // InternalUIDSL.g:2607:1: rule__BasicType__Group_1__1 : rule__BasicType__Group_1__1__Impl ;
    public final void rule__BasicType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2611:1: ( rule__BasicType__Group_1__1__Impl )
            // InternalUIDSL.g:2612:2: rule__BasicType__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicType__Group_1__1__Impl();

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
    // $ANTLR end "rule__BasicType__Group_1__1"


    // $ANTLR start "rule__BasicType__Group_1__1__Impl"
    // InternalUIDSL.g:2618:1: rule__BasicType__Group_1__1__Impl : ( 'text' ) ;
    public final void rule__BasicType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2622:1: ( ( 'text' ) )
            // InternalUIDSL.g:2623:1: ( 'text' )
            {
            // InternalUIDSL.g:2623:1: ( 'text' )
            // InternalUIDSL.g:2624:2: 'text'
            {
             before(grammarAccess.getBasicTypeAccess().getTextKeyword_1_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getBasicTypeAccess().getTextKeyword_1_1()); 

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
    // $ANTLR end "rule__BasicType__Group_1__1__Impl"


    // $ANTLR start "rule__BasicType__Group_2__0"
    // InternalUIDSL.g:2634:1: rule__BasicType__Group_2__0 : rule__BasicType__Group_2__0__Impl rule__BasicType__Group_2__1 ;
    public final void rule__BasicType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2638:1: ( rule__BasicType__Group_2__0__Impl rule__BasicType__Group_2__1 )
            // InternalUIDSL.g:2639:2: rule__BasicType__Group_2__0__Impl rule__BasicType__Group_2__1
            {
            pushFollow(FOLLOW_22);
            rule__BasicType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicType__Group_2__1();

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
    // $ANTLR end "rule__BasicType__Group_2__0"


    // $ANTLR start "rule__BasicType__Group_2__0__Impl"
    // InternalUIDSL.g:2646:1: rule__BasicType__Group_2__0__Impl : ( () ) ;
    public final void rule__BasicType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2650:1: ( ( () ) )
            // InternalUIDSL.g:2651:1: ( () )
            {
            // InternalUIDSL.g:2651:1: ( () )
            // InternalUIDSL.g:2652:2: ()
            {
             before(grammarAccess.getBasicTypeAccess().getEmailTypeAction_2_0()); 
            // InternalUIDSL.g:2653:2: ()
            // InternalUIDSL.g:2653:3: 
            {
            }

             after(grammarAccess.getBasicTypeAccess().getEmailTypeAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicType__Group_2__0__Impl"


    // $ANTLR start "rule__BasicType__Group_2__1"
    // InternalUIDSL.g:2661:1: rule__BasicType__Group_2__1 : rule__BasicType__Group_2__1__Impl ;
    public final void rule__BasicType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2665:1: ( rule__BasicType__Group_2__1__Impl )
            // InternalUIDSL.g:2666:2: rule__BasicType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicType__Group_2__1__Impl();

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
    // $ANTLR end "rule__BasicType__Group_2__1"


    // $ANTLR start "rule__BasicType__Group_2__1__Impl"
    // InternalUIDSL.g:2672:1: rule__BasicType__Group_2__1__Impl : ( 'email' ) ;
    public final void rule__BasicType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2676:1: ( ( 'email' ) )
            // InternalUIDSL.g:2677:1: ( 'email' )
            {
            // InternalUIDSL.g:2677:1: ( 'email' )
            // InternalUIDSL.g:2678:2: 'email'
            {
             before(grammarAccess.getBasicTypeAccess().getEmailKeyword_2_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getBasicTypeAccess().getEmailKeyword_2_1()); 

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
    // $ANTLR end "rule__BasicType__Group_2__1__Impl"


    // $ANTLR start "rule__BasicType__Group_3__0"
    // InternalUIDSL.g:2688:1: rule__BasicType__Group_3__0 : rule__BasicType__Group_3__0__Impl rule__BasicType__Group_3__1 ;
    public final void rule__BasicType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2692:1: ( rule__BasicType__Group_3__0__Impl rule__BasicType__Group_3__1 )
            // InternalUIDSL.g:2693:2: rule__BasicType__Group_3__0__Impl rule__BasicType__Group_3__1
            {
            pushFollow(FOLLOW_23);
            rule__BasicType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicType__Group_3__1();

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
    // $ANTLR end "rule__BasicType__Group_3__0"


    // $ANTLR start "rule__BasicType__Group_3__0__Impl"
    // InternalUIDSL.g:2700:1: rule__BasicType__Group_3__0__Impl : ( () ) ;
    public final void rule__BasicType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2704:1: ( ( () ) )
            // InternalUIDSL.g:2705:1: ( () )
            {
            // InternalUIDSL.g:2705:1: ( () )
            // InternalUIDSL.g:2706:2: ()
            {
             before(grammarAccess.getBasicTypeAccess().getPasswordTypeAction_3_0()); 
            // InternalUIDSL.g:2707:2: ()
            // InternalUIDSL.g:2707:3: 
            {
            }

             after(grammarAccess.getBasicTypeAccess().getPasswordTypeAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicType__Group_3__0__Impl"


    // $ANTLR start "rule__BasicType__Group_3__1"
    // InternalUIDSL.g:2715:1: rule__BasicType__Group_3__1 : rule__BasicType__Group_3__1__Impl ;
    public final void rule__BasicType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2719:1: ( rule__BasicType__Group_3__1__Impl )
            // InternalUIDSL.g:2720:2: rule__BasicType__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicType__Group_3__1__Impl();

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
    // $ANTLR end "rule__BasicType__Group_3__1"


    // $ANTLR start "rule__BasicType__Group_3__1__Impl"
    // InternalUIDSL.g:2726:1: rule__BasicType__Group_3__1__Impl : ( 'password' ) ;
    public final void rule__BasicType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2730:1: ( ( 'password' ) )
            // InternalUIDSL.g:2731:1: ( 'password' )
            {
            // InternalUIDSL.g:2731:1: ( 'password' )
            // InternalUIDSL.g:2732:2: 'password'
            {
             before(grammarAccess.getBasicTypeAccess().getPasswordKeyword_3_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getBasicTypeAccess().getPasswordKeyword_3_1()); 

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
    // $ANTLR end "rule__BasicType__Group_3__1__Impl"


    // $ANTLR start "rule__BasicType__Group_4__0"
    // InternalUIDSL.g:2742:1: rule__BasicType__Group_4__0 : rule__BasicType__Group_4__0__Impl rule__BasicType__Group_4__1 ;
    public final void rule__BasicType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2746:1: ( rule__BasicType__Group_4__0__Impl rule__BasicType__Group_4__1 )
            // InternalUIDSL.g:2747:2: rule__BasicType__Group_4__0__Impl rule__BasicType__Group_4__1
            {
            pushFollow(FOLLOW_24);
            rule__BasicType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicType__Group_4__1();

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
    // $ANTLR end "rule__BasicType__Group_4__0"


    // $ANTLR start "rule__BasicType__Group_4__0__Impl"
    // InternalUIDSL.g:2754:1: rule__BasicType__Group_4__0__Impl : ( () ) ;
    public final void rule__BasicType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2758:1: ( ( () ) )
            // InternalUIDSL.g:2759:1: ( () )
            {
            // InternalUIDSL.g:2759:1: ( () )
            // InternalUIDSL.g:2760:2: ()
            {
             before(grammarAccess.getBasicTypeAccess().getFileTypeAction_4_0()); 
            // InternalUIDSL.g:2761:2: ()
            // InternalUIDSL.g:2761:3: 
            {
            }

             after(grammarAccess.getBasicTypeAccess().getFileTypeAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicType__Group_4__0__Impl"


    // $ANTLR start "rule__BasicType__Group_4__1"
    // InternalUIDSL.g:2769:1: rule__BasicType__Group_4__1 : rule__BasicType__Group_4__1__Impl ;
    public final void rule__BasicType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2773:1: ( rule__BasicType__Group_4__1__Impl )
            // InternalUIDSL.g:2774:2: rule__BasicType__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicType__Group_4__1__Impl();

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
    // $ANTLR end "rule__BasicType__Group_4__1"


    // $ANTLR start "rule__BasicType__Group_4__1__Impl"
    // InternalUIDSL.g:2780:1: rule__BasicType__Group_4__1__Impl : ( 'file' ) ;
    public final void rule__BasicType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2784:1: ( ( 'file' ) )
            // InternalUIDSL.g:2785:1: ( 'file' )
            {
            // InternalUIDSL.g:2785:1: ( 'file' )
            // InternalUIDSL.g:2786:2: 'file'
            {
             before(grammarAccess.getBasicTypeAccess().getFileKeyword_4_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getBasicTypeAccess().getFileKeyword_4_1()); 

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
    // $ANTLR end "rule__BasicType__Group_4__1__Impl"


    // $ANTLR start "rule__BasicType__Group_5__0"
    // InternalUIDSL.g:2796:1: rule__BasicType__Group_5__0 : rule__BasicType__Group_5__0__Impl rule__BasicType__Group_5__1 ;
    public final void rule__BasicType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2800:1: ( rule__BasicType__Group_5__0__Impl rule__BasicType__Group_5__1 )
            // InternalUIDSL.g:2801:2: rule__BasicType__Group_5__0__Impl rule__BasicType__Group_5__1
            {
            pushFollow(FOLLOW_25);
            rule__BasicType__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicType__Group_5__1();

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
    // $ANTLR end "rule__BasicType__Group_5__0"


    // $ANTLR start "rule__BasicType__Group_5__0__Impl"
    // InternalUIDSL.g:2808:1: rule__BasicType__Group_5__0__Impl : ( () ) ;
    public final void rule__BasicType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2812:1: ( ( () ) )
            // InternalUIDSL.g:2813:1: ( () )
            {
            // InternalUIDSL.g:2813:1: ( () )
            // InternalUIDSL.g:2814:2: ()
            {
             before(grammarAccess.getBasicTypeAccess().getImageTypeAction_5_0()); 
            // InternalUIDSL.g:2815:2: ()
            // InternalUIDSL.g:2815:3: 
            {
            }

             after(grammarAccess.getBasicTypeAccess().getImageTypeAction_5_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicType__Group_5__0__Impl"


    // $ANTLR start "rule__BasicType__Group_5__1"
    // InternalUIDSL.g:2823:1: rule__BasicType__Group_5__1 : rule__BasicType__Group_5__1__Impl ;
    public final void rule__BasicType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2827:1: ( rule__BasicType__Group_5__1__Impl )
            // InternalUIDSL.g:2828:2: rule__BasicType__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicType__Group_5__1__Impl();

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
    // $ANTLR end "rule__BasicType__Group_5__1"


    // $ANTLR start "rule__BasicType__Group_5__1__Impl"
    // InternalUIDSL.g:2834:1: rule__BasicType__Group_5__1__Impl : ( 'image' ) ;
    public final void rule__BasicType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2838:1: ( ( 'image' ) )
            // InternalUIDSL.g:2839:1: ( 'image' )
            {
            // InternalUIDSL.g:2839:1: ( 'image' )
            // InternalUIDSL.g:2840:2: 'image'
            {
             before(grammarAccess.getBasicTypeAccess().getImageKeyword_5_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getBasicTypeAccess().getImageKeyword_5_1()); 

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
    // $ANTLR end "rule__BasicType__Group_5__1__Impl"


    // $ANTLR start "rule__Enum__Group__0"
    // InternalUIDSL.g:2850:1: rule__Enum__Group__0 : rule__Enum__Group__0__Impl rule__Enum__Group__1 ;
    public final void rule__Enum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2854:1: ( rule__Enum__Group__0__Impl rule__Enum__Group__1 )
            // InternalUIDSL.g:2855:2: rule__Enum__Group__0__Impl rule__Enum__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Enum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enum__Group__1();

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
    // $ANTLR end "rule__Enum__Group__0"


    // $ANTLR start "rule__Enum__Group__0__Impl"
    // InternalUIDSL.g:2862:1: rule__Enum__Group__0__Impl : ( 'enum' ) ;
    public final void rule__Enum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2866:1: ( ( 'enum' ) )
            // InternalUIDSL.g:2867:1: ( 'enum' )
            {
            // InternalUIDSL.g:2867:1: ( 'enum' )
            // InternalUIDSL.g:2868:2: 'enum'
            {
             before(grammarAccess.getEnumAccess().getEnumKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getEnumAccess().getEnumKeyword_0()); 

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
    // $ANTLR end "rule__Enum__Group__0__Impl"


    // $ANTLR start "rule__Enum__Group__1"
    // InternalUIDSL.g:2877:1: rule__Enum__Group__1 : rule__Enum__Group__1__Impl rule__Enum__Group__2 ;
    public final void rule__Enum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2881:1: ( rule__Enum__Group__1__Impl rule__Enum__Group__2 )
            // InternalUIDSL.g:2882:2: rule__Enum__Group__1__Impl rule__Enum__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Enum__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enum__Group__2();

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
    // $ANTLR end "rule__Enum__Group__1"


    // $ANTLR start "rule__Enum__Group__1__Impl"
    // InternalUIDSL.g:2889:1: rule__Enum__Group__1__Impl : ( ( rule__Enum__NameAssignment_1 ) ) ;
    public final void rule__Enum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2893:1: ( ( ( rule__Enum__NameAssignment_1 ) ) )
            // InternalUIDSL.g:2894:1: ( ( rule__Enum__NameAssignment_1 ) )
            {
            // InternalUIDSL.g:2894:1: ( ( rule__Enum__NameAssignment_1 ) )
            // InternalUIDSL.g:2895:2: ( rule__Enum__NameAssignment_1 )
            {
             before(grammarAccess.getEnumAccess().getNameAssignment_1()); 
            // InternalUIDSL.g:2896:2: ( rule__Enum__NameAssignment_1 )
            // InternalUIDSL.g:2896:3: rule__Enum__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Enum__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Enum__Group__1__Impl"


    // $ANTLR start "rule__Enum__Group__2"
    // InternalUIDSL.g:2904:1: rule__Enum__Group__2 : rule__Enum__Group__2__Impl rule__Enum__Group__3 ;
    public final void rule__Enum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2908:1: ( rule__Enum__Group__2__Impl rule__Enum__Group__3 )
            // InternalUIDSL.g:2909:2: rule__Enum__Group__2__Impl rule__Enum__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Enum__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enum__Group__3();

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
    // $ANTLR end "rule__Enum__Group__2"


    // $ANTLR start "rule__Enum__Group__2__Impl"
    // InternalUIDSL.g:2916:1: rule__Enum__Group__2__Impl : ( '{' ) ;
    public final void rule__Enum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2920:1: ( ( '{' ) )
            // InternalUIDSL.g:2921:1: ( '{' )
            {
            // InternalUIDSL.g:2921:1: ( '{' )
            // InternalUIDSL.g:2922:2: '{'
            {
             before(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Enum__Group__2__Impl"


    // $ANTLR start "rule__Enum__Group__3"
    // InternalUIDSL.g:2931:1: rule__Enum__Group__3 : rule__Enum__Group__3__Impl rule__Enum__Group__4 ;
    public final void rule__Enum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2935:1: ( rule__Enum__Group__3__Impl rule__Enum__Group__4 )
            // InternalUIDSL.g:2936:2: rule__Enum__Group__3__Impl rule__Enum__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Enum__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enum__Group__4();

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
    // $ANTLR end "rule__Enum__Group__3"


    // $ANTLR start "rule__Enum__Group__3__Impl"
    // InternalUIDSL.g:2943:1: rule__Enum__Group__3__Impl : ( ( rule__Enum__AttributesAssignment_3 )* ) ;
    public final void rule__Enum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2947:1: ( ( ( rule__Enum__AttributesAssignment_3 )* ) )
            // InternalUIDSL.g:2948:1: ( ( rule__Enum__AttributesAssignment_3 )* )
            {
            // InternalUIDSL.g:2948:1: ( ( rule__Enum__AttributesAssignment_3 )* )
            // InternalUIDSL.g:2949:2: ( rule__Enum__AttributesAssignment_3 )*
            {
             before(grammarAccess.getEnumAccess().getAttributesAssignment_3()); 
            // InternalUIDSL.g:2950:2: ( rule__Enum__AttributesAssignment_3 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID) ) {
                    int LA27_1 = input.LA(2);

                    if ( (LA27_1==RULE_ID) ) {
                        int LA27_4 = input.LA(3);

                        if ( (LA27_4==21||(LA27_4>=50 && LA27_4<=51)||(LA27_4>=53 && LA27_4<=54)) ) {
                            alt27=1;
                        }


                    }


                }
                else if ( ((LA27_0>=31 && LA27_0<=35)||(LA27_0>=42 && LA27_0<=47)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalUIDSL.g:2950:3: rule__Enum__AttributesAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Enum__AttributesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getEnumAccess().getAttributesAssignment_3()); 

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
    // $ANTLR end "rule__Enum__Group__3__Impl"


    // $ANTLR start "rule__Enum__Group__4"
    // InternalUIDSL.g:2958:1: rule__Enum__Group__4 : rule__Enum__Group__4__Impl rule__Enum__Group__5 ;
    public final void rule__Enum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2962:1: ( rule__Enum__Group__4__Impl rule__Enum__Group__5 )
            // InternalUIDSL.g:2963:2: rule__Enum__Group__4__Impl rule__Enum__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__Enum__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enum__Group__5();

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
    // $ANTLR end "rule__Enum__Group__4"


    // $ANTLR start "rule__Enum__Group__4__Impl"
    // InternalUIDSL.g:2970:1: rule__Enum__Group__4__Impl : ( ( ( rule__Enum__LiteralsAssignment_4 ) ) ( ( rule__Enum__LiteralsAssignment_4 )* ) ) ;
    public final void rule__Enum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2974:1: ( ( ( ( rule__Enum__LiteralsAssignment_4 ) ) ( ( rule__Enum__LiteralsAssignment_4 )* ) ) )
            // InternalUIDSL.g:2975:1: ( ( ( rule__Enum__LiteralsAssignment_4 ) ) ( ( rule__Enum__LiteralsAssignment_4 )* ) )
            {
            // InternalUIDSL.g:2975:1: ( ( ( rule__Enum__LiteralsAssignment_4 ) ) ( ( rule__Enum__LiteralsAssignment_4 )* ) )
            // InternalUIDSL.g:2976:2: ( ( rule__Enum__LiteralsAssignment_4 ) ) ( ( rule__Enum__LiteralsAssignment_4 )* )
            {
            // InternalUIDSL.g:2976:2: ( ( rule__Enum__LiteralsAssignment_4 ) )
            // InternalUIDSL.g:2977:3: ( rule__Enum__LiteralsAssignment_4 )
            {
             before(grammarAccess.getEnumAccess().getLiteralsAssignment_4()); 
            // InternalUIDSL.g:2978:3: ( rule__Enum__LiteralsAssignment_4 )
            // InternalUIDSL.g:2978:4: rule__Enum__LiteralsAssignment_4
            {
            pushFollow(FOLLOW_7);
            rule__Enum__LiteralsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getLiteralsAssignment_4()); 

            }

            // InternalUIDSL.g:2981:2: ( ( rule__Enum__LiteralsAssignment_4 )* )
            // InternalUIDSL.g:2982:3: ( rule__Enum__LiteralsAssignment_4 )*
            {
             before(grammarAccess.getEnumAccess().getLiteralsAssignment_4()); 
            // InternalUIDSL.g:2983:3: ( rule__Enum__LiteralsAssignment_4 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalUIDSL.g:2983:4: rule__Enum__LiteralsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Enum__LiteralsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getEnumAccess().getLiteralsAssignment_4()); 

            }


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
    // $ANTLR end "rule__Enum__Group__4__Impl"


    // $ANTLR start "rule__Enum__Group__5"
    // InternalUIDSL.g:2992:1: rule__Enum__Group__5 : rule__Enum__Group__5__Impl ;
    public final void rule__Enum__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:2996:1: ( rule__Enum__Group__5__Impl )
            // InternalUIDSL.g:2997:2: rule__Enum__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Enum__Group__5__Impl();

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
    // $ANTLR end "rule__Enum__Group__5"


    // $ANTLR start "rule__Enum__Group__5__Impl"
    // InternalUIDSL.g:3003:1: rule__Enum__Group__5__Impl : ( '}' ) ;
    public final void rule__Enum__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3007:1: ( ( '}' ) )
            // InternalUIDSL.g:3008:1: ( '}' )
            {
            // InternalUIDSL.g:3008:1: ( '}' )
            // InternalUIDSL.g:3009:2: '}'
            {
             before(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Enum__Group__5__Impl"


    // $ANTLR start "rule__EnumLiteral__Group__0"
    // InternalUIDSL.g:3019:1: rule__EnumLiteral__Group__0 : rule__EnumLiteral__Group__0__Impl rule__EnumLiteral__Group__1 ;
    public final void rule__EnumLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3023:1: ( rule__EnumLiteral__Group__0__Impl rule__EnumLiteral__Group__1 )
            // InternalUIDSL.g:3024:2: rule__EnumLiteral__Group__0__Impl rule__EnumLiteral__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__EnumLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumLiteral__Group__1();

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
    // $ANTLR end "rule__EnumLiteral__Group__0"


    // $ANTLR start "rule__EnumLiteral__Group__0__Impl"
    // InternalUIDSL.g:3031:1: rule__EnumLiteral__Group__0__Impl : ( ( rule__EnumLiteral__NameAssignment_0 ) ) ;
    public final void rule__EnumLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3035:1: ( ( ( rule__EnumLiteral__NameAssignment_0 ) ) )
            // InternalUIDSL.g:3036:1: ( ( rule__EnumLiteral__NameAssignment_0 ) )
            {
            // InternalUIDSL.g:3036:1: ( ( rule__EnumLiteral__NameAssignment_0 ) )
            // InternalUIDSL.g:3037:2: ( rule__EnumLiteral__NameAssignment_0 )
            {
             before(grammarAccess.getEnumLiteralAccess().getNameAssignment_0()); 
            // InternalUIDSL.g:3038:2: ( rule__EnumLiteral__NameAssignment_0 )
            // InternalUIDSL.g:3038:3: rule__EnumLiteral__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__EnumLiteral__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEnumLiteralAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__EnumLiteral__Group__0__Impl"


    // $ANTLR start "rule__EnumLiteral__Group__1"
    // InternalUIDSL.g:3046:1: rule__EnumLiteral__Group__1 : rule__EnumLiteral__Group__1__Impl ;
    public final void rule__EnumLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3050:1: ( rule__EnumLiteral__Group__1__Impl )
            // InternalUIDSL.g:3051:2: rule__EnumLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumLiteral__Group__1__Impl();

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
    // $ANTLR end "rule__EnumLiteral__Group__1"


    // $ANTLR start "rule__EnumLiteral__Group__1__Impl"
    // InternalUIDSL.g:3057:1: rule__EnumLiteral__Group__1__Impl : ( ( rule__EnumLiteral__Group_1__0 )? ) ;
    public final void rule__EnumLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3061:1: ( ( ( rule__EnumLiteral__Group_1__0 )? ) )
            // InternalUIDSL.g:3062:1: ( ( rule__EnumLiteral__Group_1__0 )? )
            {
            // InternalUIDSL.g:3062:1: ( ( rule__EnumLiteral__Group_1__0 )? )
            // InternalUIDSL.g:3063:2: ( rule__EnumLiteral__Group_1__0 )?
            {
             before(grammarAccess.getEnumLiteralAccess().getGroup_1()); 
            // InternalUIDSL.g:3064:2: ( rule__EnumLiteral__Group_1__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==22) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalUIDSL.g:3064:3: rule__EnumLiteral__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumLiteral__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumLiteralAccess().getGroup_1()); 

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
    // $ANTLR end "rule__EnumLiteral__Group__1__Impl"


    // $ANTLR start "rule__EnumLiteral__Group_1__0"
    // InternalUIDSL.g:3073:1: rule__EnumLiteral__Group_1__0 : rule__EnumLiteral__Group_1__0__Impl rule__EnumLiteral__Group_1__1 ;
    public final void rule__EnumLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3077:1: ( rule__EnumLiteral__Group_1__0__Impl rule__EnumLiteral__Group_1__1 )
            // InternalUIDSL.g:3078:2: rule__EnumLiteral__Group_1__0__Impl rule__EnumLiteral__Group_1__1
            {
            pushFollow(FOLLOW_27);
            rule__EnumLiteral__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumLiteral__Group_1__1();

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
    // $ANTLR end "rule__EnumLiteral__Group_1__0"


    // $ANTLR start "rule__EnumLiteral__Group_1__0__Impl"
    // InternalUIDSL.g:3085:1: rule__EnumLiteral__Group_1__0__Impl : ( '(' ) ;
    public final void rule__EnumLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3089:1: ( ( '(' ) )
            // InternalUIDSL.g:3090:1: ( '(' )
            {
            // InternalUIDSL.g:3090:1: ( '(' )
            // InternalUIDSL.g:3091:2: '('
            {
             before(grammarAccess.getEnumLiteralAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEnumLiteralAccess().getLeftParenthesisKeyword_1_0()); 

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
    // $ANTLR end "rule__EnumLiteral__Group_1__0__Impl"


    // $ANTLR start "rule__EnumLiteral__Group_1__1"
    // InternalUIDSL.g:3100:1: rule__EnumLiteral__Group_1__1 : rule__EnumLiteral__Group_1__1__Impl rule__EnumLiteral__Group_1__2 ;
    public final void rule__EnumLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3104:1: ( rule__EnumLiteral__Group_1__1__Impl rule__EnumLiteral__Group_1__2 )
            // InternalUIDSL.g:3105:2: rule__EnumLiteral__Group_1__1__Impl rule__EnumLiteral__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__EnumLiteral__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumLiteral__Group_1__2();

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
    // $ANTLR end "rule__EnumLiteral__Group_1__1"


    // $ANTLR start "rule__EnumLiteral__Group_1__1__Impl"
    // InternalUIDSL.g:3112:1: rule__EnumLiteral__Group_1__1__Impl : ( ( rule__EnumLiteral__ParamsAssignment_1_1 ) ) ;
    public final void rule__EnumLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3116:1: ( ( ( rule__EnumLiteral__ParamsAssignment_1_1 ) ) )
            // InternalUIDSL.g:3117:1: ( ( rule__EnumLiteral__ParamsAssignment_1_1 ) )
            {
            // InternalUIDSL.g:3117:1: ( ( rule__EnumLiteral__ParamsAssignment_1_1 ) )
            // InternalUIDSL.g:3118:2: ( rule__EnumLiteral__ParamsAssignment_1_1 )
            {
             before(grammarAccess.getEnumLiteralAccess().getParamsAssignment_1_1()); 
            // InternalUIDSL.g:3119:2: ( rule__EnumLiteral__ParamsAssignment_1_1 )
            // InternalUIDSL.g:3119:3: rule__EnumLiteral__ParamsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumLiteral__ParamsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumLiteralAccess().getParamsAssignment_1_1()); 

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
    // $ANTLR end "rule__EnumLiteral__Group_1__1__Impl"


    // $ANTLR start "rule__EnumLiteral__Group_1__2"
    // InternalUIDSL.g:3127:1: rule__EnumLiteral__Group_1__2 : rule__EnumLiteral__Group_1__2__Impl rule__EnumLiteral__Group_1__3 ;
    public final void rule__EnumLiteral__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3131:1: ( rule__EnumLiteral__Group_1__2__Impl rule__EnumLiteral__Group_1__3 )
            // InternalUIDSL.g:3132:2: rule__EnumLiteral__Group_1__2__Impl rule__EnumLiteral__Group_1__3
            {
            pushFollow(FOLLOW_12);
            rule__EnumLiteral__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumLiteral__Group_1__3();

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
    // $ANTLR end "rule__EnumLiteral__Group_1__2"


    // $ANTLR start "rule__EnumLiteral__Group_1__2__Impl"
    // InternalUIDSL.g:3139:1: rule__EnumLiteral__Group_1__2__Impl : ( ( rule__EnumLiteral__Group_1_2__0 )* ) ;
    public final void rule__EnumLiteral__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3143:1: ( ( ( rule__EnumLiteral__Group_1_2__0 )* ) )
            // InternalUIDSL.g:3144:1: ( ( rule__EnumLiteral__Group_1_2__0 )* )
            {
            // InternalUIDSL.g:3144:1: ( ( rule__EnumLiteral__Group_1_2__0 )* )
            // InternalUIDSL.g:3145:2: ( rule__EnumLiteral__Group_1_2__0 )*
            {
             before(grammarAccess.getEnumLiteralAccess().getGroup_1_2()); 
            // InternalUIDSL.g:3146:2: ( rule__EnumLiteral__Group_1_2__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==24) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalUIDSL.g:3146:3: rule__EnumLiteral__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__EnumLiteral__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getEnumLiteralAccess().getGroup_1_2()); 

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
    // $ANTLR end "rule__EnumLiteral__Group_1__2__Impl"


    // $ANTLR start "rule__EnumLiteral__Group_1__3"
    // InternalUIDSL.g:3154:1: rule__EnumLiteral__Group_1__3 : rule__EnumLiteral__Group_1__3__Impl ;
    public final void rule__EnumLiteral__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3158:1: ( rule__EnumLiteral__Group_1__3__Impl )
            // InternalUIDSL.g:3159:2: rule__EnumLiteral__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumLiteral__Group_1__3__Impl();

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
    // $ANTLR end "rule__EnumLiteral__Group_1__3"


    // $ANTLR start "rule__EnumLiteral__Group_1__3__Impl"
    // InternalUIDSL.g:3165:1: rule__EnumLiteral__Group_1__3__Impl : ( ')' ) ;
    public final void rule__EnumLiteral__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3169:1: ( ( ')' ) )
            // InternalUIDSL.g:3170:1: ( ')' )
            {
            // InternalUIDSL.g:3170:1: ( ')' )
            // InternalUIDSL.g:3171:2: ')'
            {
             before(grammarAccess.getEnumLiteralAccess().getRightParenthesisKeyword_1_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEnumLiteralAccess().getRightParenthesisKeyword_1_3()); 

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
    // $ANTLR end "rule__EnumLiteral__Group_1__3__Impl"


    // $ANTLR start "rule__EnumLiteral__Group_1_2__0"
    // InternalUIDSL.g:3181:1: rule__EnumLiteral__Group_1_2__0 : rule__EnumLiteral__Group_1_2__0__Impl rule__EnumLiteral__Group_1_2__1 ;
    public final void rule__EnumLiteral__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3185:1: ( rule__EnumLiteral__Group_1_2__0__Impl rule__EnumLiteral__Group_1_2__1 )
            // InternalUIDSL.g:3186:2: rule__EnumLiteral__Group_1_2__0__Impl rule__EnumLiteral__Group_1_2__1
            {
            pushFollow(FOLLOW_27);
            rule__EnumLiteral__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumLiteral__Group_1_2__1();

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
    // $ANTLR end "rule__EnumLiteral__Group_1_2__0"


    // $ANTLR start "rule__EnumLiteral__Group_1_2__0__Impl"
    // InternalUIDSL.g:3193:1: rule__EnumLiteral__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__EnumLiteral__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3197:1: ( ( ',' ) )
            // InternalUIDSL.g:3198:1: ( ',' )
            {
            // InternalUIDSL.g:3198:1: ( ',' )
            // InternalUIDSL.g:3199:2: ','
            {
             before(grammarAccess.getEnumLiteralAccess().getCommaKeyword_1_2_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getEnumLiteralAccess().getCommaKeyword_1_2_0()); 

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
    // $ANTLR end "rule__EnumLiteral__Group_1_2__0__Impl"


    // $ANTLR start "rule__EnumLiteral__Group_1_2__1"
    // InternalUIDSL.g:3208:1: rule__EnumLiteral__Group_1_2__1 : rule__EnumLiteral__Group_1_2__1__Impl ;
    public final void rule__EnumLiteral__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3212:1: ( rule__EnumLiteral__Group_1_2__1__Impl )
            // InternalUIDSL.g:3213:2: rule__EnumLiteral__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumLiteral__Group_1_2__1__Impl();

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
    // $ANTLR end "rule__EnumLiteral__Group_1_2__1"


    // $ANTLR start "rule__EnumLiteral__Group_1_2__1__Impl"
    // InternalUIDSL.g:3219:1: rule__EnumLiteral__Group_1_2__1__Impl : ( ( rule__EnumLiteral__ParamsAssignment_1_2_1 ) ) ;
    public final void rule__EnumLiteral__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3223:1: ( ( ( rule__EnumLiteral__ParamsAssignment_1_2_1 ) ) )
            // InternalUIDSL.g:3224:1: ( ( rule__EnumLiteral__ParamsAssignment_1_2_1 ) )
            {
            // InternalUIDSL.g:3224:1: ( ( rule__EnumLiteral__ParamsAssignment_1_2_1 ) )
            // InternalUIDSL.g:3225:2: ( rule__EnumLiteral__ParamsAssignment_1_2_1 )
            {
             before(grammarAccess.getEnumLiteralAccess().getParamsAssignment_1_2_1()); 
            // InternalUIDSL.g:3226:2: ( rule__EnumLiteral__ParamsAssignment_1_2_1 )
            // InternalUIDSL.g:3226:3: rule__EnumLiteral__ParamsAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumLiteral__ParamsAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumLiteralAccess().getParamsAssignment_1_2_1()); 

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
    // $ANTLR end "rule__EnumLiteral__Group_1_2__1__Impl"


    // $ANTLR start "rule__Constant__Group_0__0"
    // InternalUIDSL.g:3235:1: rule__Constant__Group_0__0 : rule__Constant__Group_0__0__Impl rule__Constant__Group_0__1 ;
    public final void rule__Constant__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3239:1: ( rule__Constant__Group_0__0__Impl rule__Constant__Group_0__1 )
            // InternalUIDSL.g:3240:2: rule__Constant__Group_0__0__Impl rule__Constant__Group_0__1
            {
            pushFollow(FOLLOW_28);
            rule__Constant__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant__Group_0__1();

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
    // $ANTLR end "rule__Constant__Group_0__0"


    // $ANTLR start "rule__Constant__Group_0__0__Impl"
    // InternalUIDSL.g:3247:1: rule__Constant__Group_0__0__Impl : ( () ) ;
    public final void rule__Constant__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3251:1: ( ( () ) )
            // InternalUIDSL.g:3252:1: ( () )
            {
            // InternalUIDSL.g:3252:1: ( () )
            // InternalUIDSL.g:3253:2: ()
            {
             before(grammarAccess.getConstantAccess().getIntConstantAction_0_0()); 
            // InternalUIDSL.g:3254:2: ()
            // InternalUIDSL.g:3254:3: 
            {
            }

             after(grammarAccess.getConstantAccess().getIntConstantAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group_0__0__Impl"


    // $ANTLR start "rule__Constant__Group_0__1"
    // InternalUIDSL.g:3262:1: rule__Constant__Group_0__1 : rule__Constant__Group_0__1__Impl ;
    public final void rule__Constant__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3266:1: ( rule__Constant__Group_0__1__Impl )
            // InternalUIDSL.g:3267:2: rule__Constant__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Group_0__1__Impl();

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
    // $ANTLR end "rule__Constant__Group_0__1"


    // $ANTLR start "rule__Constant__Group_0__1__Impl"
    // InternalUIDSL.g:3273:1: rule__Constant__Group_0__1__Impl : ( ( rule__Constant__ValueAssignment_0_1 ) ) ;
    public final void rule__Constant__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3277:1: ( ( ( rule__Constant__ValueAssignment_0_1 ) ) )
            // InternalUIDSL.g:3278:1: ( ( rule__Constant__ValueAssignment_0_1 ) )
            {
            // InternalUIDSL.g:3278:1: ( ( rule__Constant__ValueAssignment_0_1 ) )
            // InternalUIDSL.g:3279:2: ( rule__Constant__ValueAssignment_0_1 )
            {
             before(grammarAccess.getConstantAccess().getValueAssignment_0_1()); 
            // InternalUIDSL.g:3280:2: ( rule__Constant__ValueAssignment_0_1 )
            // InternalUIDSL.g:3280:3: rule__Constant__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Constant__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getValueAssignment_0_1()); 

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
    // $ANTLR end "rule__Constant__Group_0__1__Impl"


    // $ANTLR start "rule__Constant__Group_1__0"
    // InternalUIDSL.g:3289:1: rule__Constant__Group_1__0 : rule__Constant__Group_1__0__Impl rule__Constant__Group_1__1 ;
    public final void rule__Constant__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3293:1: ( rule__Constant__Group_1__0__Impl rule__Constant__Group_1__1 )
            // InternalUIDSL.g:3294:2: rule__Constant__Group_1__0__Impl rule__Constant__Group_1__1
            {
            pushFollow(FOLLOW_28);
            rule__Constant__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant__Group_1__1();

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
    // $ANTLR end "rule__Constant__Group_1__0"


    // $ANTLR start "rule__Constant__Group_1__0__Impl"
    // InternalUIDSL.g:3301:1: rule__Constant__Group_1__0__Impl : ( () ) ;
    public final void rule__Constant__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3305:1: ( ( () ) )
            // InternalUIDSL.g:3306:1: ( () )
            {
            // InternalUIDSL.g:3306:1: ( () )
            // InternalUIDSL.g:3307:2: ()
            {
             before(grammarAccess.getConstantAccess().getLongConstantAction_1_0()); 
            // InternalUIDSL.g:3308:2: ()
            // InternalUIDSL.g:3308:3: 
            {
            }

             after(grammarAccess.getConstantAccess().getLongConstantAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group_1__0__Impl"


    // $ANTLR start "rule__Constant__Group_1__1"
    // InternalUIDSL.g:3316:1: rule__Constant__Group_1__1 : rule__Constant__Group_1__1__Impl rule__Constant__Group_1__2 ;
    public final void rule__Constant__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3320:1: ( rule__Constant__Group_1__1__Impl rule__Constant__Group_1__2 )
            // InternalUIDSL.g:3321:2: rule__Constant__Group_1__1__Impl rule__Constant__Group_1__2
            {
            pushFollow(FOLLOW_29);
            rule__Constant__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant__Group_1__2();

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
    // $ANTLR end "rule__Constant__Group_1__1"


    // $ANTLR start "rule__Constant__Group_1__1__Impl"
    // InternalUIDSL.g:3328:1: rule__Constant__Group_1__1__Impl : ( ( rule__Constant__ValueAssignment_1_1 ) ) ;
    public final void rule__Constant__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3332:1: ( ( ( rule__Constant__ValueAssignment_1_1 ) ) )
            // InternalUIDSL.g:3333:1: ( ( rule__Constant__ValueAssignment_1_1 ) )
            {
            // InternalUIDSL.g:3333:1: ( ( rule__Constant__ValueAssignment_1_1 ) )
            // InternalUIDSL.g:3334:2: ( rule__Constant__ValueAssignment_1_1 )
            {
             before(grammarAccess.getConstantAccess().getValueAssignment_1_1()); 
            // InternalUIDSL.g:3335:2: ( rule__Constant__ValueAssignment_1_1 )
            // InternalUIDSL.g:3335:3: rule__Constant__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Constant__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getValueAssignment_1_1()); 

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
    // $ANTLR end "rule__Constant__Group_1__1__Impl"


    // $ANTLR start "rule__Constant__Group_1__2"
    // InternalUIDSL.g:3343:1: rule__Constant__Group_1__2 : rule__Constant__Group_1__2__Impl ;
    public final void rule__Constant__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3347:1: ( rule__Constant__Group_1__2__Impl )
            // InternalUIDSL.g:3348:2: rule__Constant__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Group_1__2__Impl();

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
    // $ANTLR end "rule__Constant__Group_1__2"


    // $ANTLR start "rule__Constant__Group_1__2__Impl"
    // InternalUIDSL.g:3354:1: rule__Constant__Group_1__2__Impl : ( 'L' ) ;
    public final void rule__Constant__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3358:1: ( ( 'L' ) )
            // InternalUIDSL.g:3359:1: ( 'L' )
            {
            // InternalUIDSL.g:3359:1: ( 'L' )
            // InternalUIDSL.g:3360:2: 'L'
            {
             before(grammarAccess.getConstantAccess().getLKeyword_1_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getLKeyword_1_2()); 

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
    // $ANTLR end "rule__Constant__Group_1__2__Impl"


    // $ANTLR start "rule__Constant__Group_2__0"
    // InternalUIDSL.g:3370:1: rule__Constant__Group_2__0 : rule__Constant__Group_2__0__Impl rule__Constant__Group_2__1 ;
    public final void rule__Constant__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3374:1: ( rule__Constant__Group_2__0__Impl rule__Constant__Group_2__1 )
            // InternalUIDSL.g:3375:2: rule__Constant__Group_2__0__Impl rule__Constant__Group_2__1
            {
            pushFollow(FOLLOW_30);
            rule__Constant__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant__Group_2__1();

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
    // $ANTLR end "rule__Constant__Group_2__0"


    // $ANTLR start "rule__Constant__Group_2__0__Impl"
    // InternalUIDSL.g:3382:1: rule__Constant__Group_2__0__Impl : ( () ) ;
    public final void rule__Constant__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3386:1: ( ( () ) )
            // InternalUIDSL.g:3387:1: ( () )
            {
            // InternalUIDSL.g:3387:1: ( () )
            // InternalUIDSL.g:3388:2: ()
            {
             before(grammarAccess.getConstantAccess().getStringConstantAction_2_0()); 
            // InternalUIDSL.g:3389:2: ()
            // InternalUIDSL.g:3389:3: 
            {
            }

             after(grammarAccess.getConstantAccess().getStringConstantAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group_2__0__Impl"


    // $ANTLR start "rule__Constant__Group_2__1"
    // InternalUIDSL.g:3397:1: rule__Constant__Group_2__1 : rule__Constant__Group_2__1__Impl ;
    public final void rule__Constant__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3401:1: ( rule__Constant__Group_2__1__Impl )
            // InternalUIDSL.g:3402:2: rule__Constant__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Group_2__1__Impl();

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
    // $ANTLR end "rule__Constant__Group_2__1"


    // $ANTLR start "rule__Constant__Group_2__1__Impl"
    // InternalUIDSL.g:3408:1: rule__Constant__Group_2__1__Impl : ( ( rule__Constant__ValueAssignment_2_1 ) ) ;
    public final void rule__Constant__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3412:1: ( ( ( rule__Constant__ValueAssignment_2_1 ) ) )
            // InternalUIDSL.g:3413:1: ( ( rule__Constant__ValueAssignment_2_1 ) )
            {
            // InternalUIDSL.g:3413:1: ( ( rule__Constant__ValueAssignment_2_1 ) )
            // InternalUIDSL.g:3414:2: ( rule__Constant__ValueAssignment_2_1 )
            {
             before(grammarAccess.getConstantAccess().getValueAssignment_2_1()); 
            // InternalUIDSL.g:3415:2: ( rule__Constant__ValueAssignment_2_1 )
            // InternalUIDSL.g:3415:3: rule__Constant__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Constant__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getValueAssignment_2_1()); 

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
    // $ANTLR end "rule__Constant__Group_2__1__Impl"


    // $ANTLR start "rule__Constant__Group_3__0"
    // InternalUIDSL.g:3424:1: rule__Constant__Group_3__0 : rule__Constant__Group_3__0__Impl rule__Constant__Group_3__1 ;
    public final void rule__Constant__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3428:1: ( rule__Constant__Group_3__0__Impl rule__Constant__Group_3__1 )
            // InternalUIDSL.g:3429:2: rule__Constant__Group_3__0__Impl rule__Constant__Group_3__1
            {
            pushFollow(FOLLOW_31);
            rule__Constant__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant__Group_3__1();

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
    // $ANTLR end "rule__Constant__Group_3__0"


    // $ANTLR start "rule__Constant__Group_3__0__Impl"
    // InternalUIDSL.g:3436:1: rule__Constant__Group_3__0__Impl : ( () ) ;
    public final void rule__Constant__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3440:1: ( ( () ) )
            // InternalUIDSL.g:3441:1: ( () )
            {
            // InternalUIDSL.g:3441:1: ( () )
            // InternalUIDSL.g:3442:2: ()
            {
             before(grammarAccess.getConstantAccess().getBoolConstantAction_3_0()); 
            // InternalUIDSL.g:3443:2: ()
            // InternalUIDSL.g:3443:3: 
            {
            }

             after(grammarAccess.getConstantAccess().getBoolConstantAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group_3__0__Impl"


    // $ANTLR start "rule__Constant__Group_3__1"
    // InternalUIDSL.g:3451:1: rule__Constant__Group_3__1 : rule__Constant__Group_3__1__Impl ;
    public final void rule__Constant__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3455:1: ( rule__Constant__Group_3__1__Impl )
            // InternalUIDSL.g:3456:2: rule__Constant__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Group_3__1__Impl();

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
    // $ANTLR end "rule__Constant__Group_3__1"


    // $ANTLR start "rule__Constant__Group_3__1__Impl"
    // InternalUIDSL.g:3462:1: rule__Constant__Group_3__1__Impl : ( ( rule__Constant__ValueAssignment_3_1 ) ) ;
    public final void rule__Constant__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3466:1: ( ( ( rule__Constant__ValueAssignment_3_1 ) ) )
            // InternalUIDSL.g:3467:1: ( ( rule__Constant__ValueAssignment_3_1 ) )
            {
            // InternalUIDSL.g:3467:1: ( ( rule__Constant__ValueAssignment_3_1 ) )
            // InternalUIDSL.g:3468:2: ( rule__Constant__ValueAssignment_3_1 )
            {
             before(grammarAccess.getConstantAccess().getValueAssignment_3_1()); 
            // InternalUIDSL.g:3469:2: ( rule__Constant__ValueAssignment_3_1 )
            // InternalUIDSL.g:3469:3: rule__Constant__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Constant__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getValueAssignment_3_1()); 

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
    // $ANTLR end "rule__Constant__Group_3__1__Impl"


    // $ANTLR start "rule__Constant__Group_4__0"
    // InternalUIDSL.g:3478:1: rule__Constant__Group_4__0 : rule__Constant__Group_4__0__Impl rule__Constant__Group_4__1 ;
    public final void rule__Constant__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3482:1: ( rule__Constant__Group_4__0__Impl rule__Constant__Group_4__1 )
            // InternalUIDSL.g:3483:2: rule__Constant__Group_4__0__Impl rule__Constant__Group_4__1
            {
            pushFollow(FOLLOW_28);
            rule__Constant__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant__Group_4__1();

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
    // $ANTLR end "rule__Constant__Group_4__0"


    // $ANTLR start "rule__Constant__Group_4__0__Impl"
    // InternalUIDSL.g:3490:1: rule__Constant__Group_4__0__Impl : ( () ) ;
    public final void rule__Constant__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3494:1: ( ( () ) )
            // InternalUIDSL.g:3495:1: ( () )
            {
            // InternalUIDSL.g:3495:1: ( () )
            // InternalUIDSL.g:3496:2: ()
            {
             before(grammarAccess.getConstantAccess().getDateConstantAction_4_0()); 
            // InternalUIDSL.g:3497:2: ()
            // InternalUIDSL.g:3497:3: 
            {
            }

             after(grammarAccess.getConstantAccess().getDateConstantAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group_4__0__Impl"


    // $ANTLR start "rule__Constant__Group_4__1"
    // InternalUIDSL.g:3505:1: rule__Constant__Group_4__1 : rule__Constant__Group_4__1__Impl rule__Constant__Group_4__2 ;
    public final void rule__Constant__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3509:1: ( rule__Constant__Group_4__1__Impl rule__Constant__Group_4__2 )
            // InternalUIDSL.g:3510:2: rule__Constant__Group_4__1__Impl rule__Constant__Group_4__2
            {
            pushFollow(FOLLOW_32);
            rule__Constant__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant__Group_4__2();

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
    // $ANTLR end "rule__Constant__Group_4__1"


    // $ANTLR start "rule__Constant__Group_4__1__Impl"
    // InternalUIDSL.g:3517:1: rule__Constant__Group_4__1__Impl : ( ( rule__Constant__DayAssignment_4_1 ) ) ;
    public final void rule__Constant__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3521:1: ( ( ( rule__Constant__DayAssignment_4_1 ) ) )
            // InternalUIDSL.g:3522:1: ( ( rule__Constant__DayAssignment_4_1 ) )
            {
            // InternalUIDSL.g:3522:1: ( ( rule__Constant__DayAssignment_4_1 ) )
            // InternalUIDSL.g:3523:2: ( rule__Constant__DayAssignment_4_1 )
            {
             before(grammarAccess.getConstantAccess().getDayAssignment_4_1()); 
            // InternalUIDSL.g:3524:2: ( rule__Constant__DayAssignment_4_1 )
            // InternalUIDSL.g:3524:3: rule__Constant__DayAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Constant__DayAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getDayAssignment_4_1()); 

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
    // $ANTLR end "rule__Constant__Group_4__1__Impl"


    // $ANTLR start "rule__Constant__Group_4__2"
    // InternalUIDSL.g:3532:1: rule__Constant__Group_4__2 : rule__Constant__Group_4__2__Impl rule__Constant__Group_4__3 ;
    public final void rule__Constant__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3536:1: ( rule__Constant__Group_4__2__Impl rule__Constant__Group_4__3 )
            // InternalUIDSL.g:3537:2: rule__Constant__Group_4__2__Impl rule__Constant__Group_4__3
            {
            pushFollow(FOLLOW_28);
            rule__Constant__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant__Group_4__3();

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
    // $ANTLR end "rule__Constant__Group_4__2"


    // $ANTLR start "rule__Constant__Group_4__2__Impl"
    // InternalUIDSL.g:3544:1: rule__Constant__Group_4__2__Impl : ( '/' ) ;
    public final void rule__Constant__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3548:1: ( ( '/' ) )
            // InternalUIDSL.g:3549:1: ( '/' )
            {
            // InternalUIDSL.g:3549:1: ( '/' )
            // InternalUIDSL.g:3550:2: '/'
            {
             before(grammarAccess.getConstantAccess().getSolidusKeyword_4_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getSolidusKeyword_4_2()); 

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
    // $ANTLR end "rule__Constant__Group_4__2__Impl"


    // $ANTLR start "rule__Constant__Group_4__3"
    // InternalUIDSL.g:3559:1: rule__Constant__Group_4__3 : rule__Constant__Group_4__3__Impl rule__Constant__Group_4__4 ;
    public final void rule__Constant__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3563:1: ( rule__Constant__Group_4__3__Impl rule__Constant__Group_4__4 )
            // InternalUIDSL.g:3564:2: rule__Constant__Group_4__3__Impl rule__Constant__Group_4__4
            {
            pushFollow(FOLLOW_32);
            rule__Constant__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant__Group_4__4();

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
    // $ANTLR end "rule__Constant__Group_4__3"


    // $ANTLR start "rule__Constant__Group_4__3__Impl"
    // InternalUIDSL.g:3571:1: rule__Constant__Group_4__3__Impl : ( ( rule__Constant__MonthAssignment_4_3 ) ) ;
    public final void rule__Constant__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3575:1: ( ( ( rule__Constant__MonthAssignment_4_3 ) ) )
            // InternalUIDSL.g:3576:1: ( ( rule__Constant__MonthAssignment_4_3 ) )
            {
            // InternalUIDSL.g:3576:1: ( ( rule__Constant__MonthAssignment_4_3 ) )
            // InternalUIDSL.g:3577:2: ( rule__Constant__MonthAssignment_4_3 )
            {
             before(grammarAccess.getConstantAccess().getMonthAssignment_4_3()); 
            // InternalUIDSL.g:3578:2: ( rule__Constant__MonthAssignment_4_3 )
            // InternalUIDSL.g:3578:3: rule__Constant__MonthAssignment_4_3
            {
            pushFollow(FOLLOW_2);
            rule__Constant__MonthAssignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getMonthAssignment_4_3()); 

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
    // $ANTLR end "rule__Constant__Group_4__3__Impl"


    // $ANTLR start "rule__Constant__Group_4__4"
    // InternalUIDSL.g:3586:1: rule__Constant__Group_4__4 : rule__Constant__Group_4__4__Impl rule__Constant__Group_4__5 ;
    public final void rule__Constant__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3590:1: ( rule__Constant__Group_4__4__Impl rule__Constant__Group_4__5 )
            // InternalUIDSL.g:3591:2: rule__Constant__Group_4__4__Impl rule__Constant__Group_4__5
            {
            pushFollow(FOLLOW_28);
            rule__Constant__Group_4__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant__Group_4__5();

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
    // $ANTLR end "rule__Constant__Group_4__4"


    // $ANTLR start "rule__Constant__Group_4__4__Impl"
    // InternalUIDSL.g:3598:1: rule__Constant__Group_4__4__Impl : ( '/' ) ;
    public final void rule__Constant__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3602:1: ( ( '/' ) )
            // InternalUIDSL.g:3603:1: ( '/' )
            {
            // InternalUIDSL.g:3603:1: ( '/' )
            // InternalUIDSL.g:3604:2: '/'
            {
             before(grammarAccess.getConstantAccess().getSolidusKeyword_4_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getSolidusKeyword_4_4()); 

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
    // $ANTLR end "rule__Constant__Group_4__4__Impl"


    // $ANTLR start "rule__Constant__Group_4__5"
    // InternalUIDSL.g:3613:1: rule__Constant__Group_4__5 : rule__Constant__Group_4__5__Impl ;
    public final void rule__Constant__Group_4__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3617:1: ( rule__Constant__Group_4__5__Impl )
            // InternalUIDSL.g:3618:2: rule__Constant__Group_4__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Group_4__5__Impl();

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
    // $ANTLR end "rule__Constant__Group_4__5"


    // $ANTLR start "rule__Constant__Group_4__5__Impl"
    // InternalUIDSL.g:3624:1: rule__Constant__Group_4__5__Impl : ( ( rule__Constant__YearAssignment_4_5 ) ) ;
    public final void rule__Constant__Group_4__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3628:1: ( ( ( rule__Constant__YearAssignment_4_5 ) ) )
            // InternalUIDSL.g:3629:1: ( ( rule__Constant__YearAssignment_4_5 ) )
            {
            // InternalUIDSL.g:3629:1: ( ( rule__Constant__YearAssignment_4_5 ) )
            // InternalUIDSL.g:3630:2: ( rule__Constant__YearAssignment_4_5 )
            {
             before(grammarAccess.getConstantAccess().getYearAssignment_4_5()); 
            // InternalUIDSL.g:3631:2: ( rule__Constant__YearAssignment_4_5 )
            // InternalUIDSL.g:3631:3: rule__Constant__YearAssignment_4_5
            {
            pushFollow(FOLLOW_2);
            rule__Constant__YearAssignment_4_5();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getYearAssignment_4_5()); 

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
    // $ANTLR end "rule__Constant__Group_4__5__Impl"


    // $ANTLR start "rule__Constant__Group_5__0"
    // InternalUIDSL.g:3640:1: rule__Constant__Group_5__0 : rule__Constant__Group_5__0__Impl rule__Constant__Group_5__1 ;
    public final void rule__Constant__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3644:1: ( rule__Constant__Group_5__0__Impl rule__Constant__Group_5__1 )
            // InternalUIDSL.g:3645:2: rule__Constant__Group_5__0__Impl rule__Constant__Group_5__1
            {
            pushFollow(FOLLOW_27);
            rule__Constant__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant__Group_5__1();

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
    // $ANTLR end "rule__Constant__Group_5__0"


    // $ANTLR start "rule__Constant__Group_5__0__Impl"
    // InternalUIDSL.g:3652:1: rule__Constant__Group_5__0__Impl : ( () ) ;
    public final void rule__Constant__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3656:1: ( ( () ) )
            // InternalUIDSL.g:3657:1: ( () )
            {
            // InternalUIDSL.g:3657:1: ( () )
            // InternalUIDSL.g:3658:2: ()
            {
             before(grammarAccess.getConstantAccess().getNullAction_5_0()); 
            // InternalUIDSL.g:3659:2: ()
            // InternalUIDSL.g:3659:3: 
            {
            }

             after(grammarAccess.getConstantAccess().getNullAction_5_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group_5__0__Impl"


    // $ANTLR start "rule__Constant__Group_5__1"
    // InternalUIDSL.g:3667:1: rule__Constant__Group_5__1 : rule__Constant__Group_5__1__Impl ;
    public final void rule__Constant__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3671:1: ( rule__Constant__Group_5__1__Impl )
            // InternalUIDSL.g:3672:2: rule__Constant__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Group_5__1__Impl();

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
    // $ANTLR end "rule__Constant__Group_5__1"


    // $ANTLR start "rule__Constant__Group_5__1__Impl"
    // InternalUIDSL.g:3678:1: rule__Constant__Group_5__1__Impl : ( 'null' ) ;
    public final void rule__Constant__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3682:1: ( ( 'null' ) )
            // InternalUIDSL.g:3683:1: ( 'null' )
            {
            // InternalUIDSL.g:3683:1: ( 'null' )
            // InternalUIDSL.g:3684:2: 'null'
            {
             before(grammarAccess.getConstantAccess().getNullKeyword_5_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getNullKeyword_5_1()); 

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
    // $ANTLR end "rule__Constant__Group_5__1__Impl"


    // $ANTLR start "rule__EntityOption__Group_0__0"
    // InternalUIDSL.g:3694:1: rule__EntityOption__Group_0__0 : rule__EntityOption__Group_0__0__Impl rule__EntityOption__Group_0__1 ;
    public final void rule__EntityOption__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3698:1: ( rule__EntityOption__Group_0__0__Impl rule__EntityOption__Group_0__1 )
            // InternalUIDSL.g:3699:2: rule__EntityOption__Group_0__0__Impl rule__EntityOption__Group_0__1
            {
            pushFollow(FOLLOW_33);
            rule__EntityOption__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityOption__Group_0__1();

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
    // $ANTLR end "rule__EntityOption__Group_0__0"


    // $ANTLR start "rule__EntityOption__Group_0__0__Impl"
    // InternalUIDSL.g:3706:1: rule__EntityOption__Group_0__0__Impl : ( () ) ;
    public final void rule__EntityOption__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3710:1: ( ( () ) )
            // InternalUIDSL.g:3711:1: ( () )
            {
            // InternalUIDSL.g:3711:1: ( () )
            // InternalUIDSL.g:3712:2: ()
            {
             before(grammarAccess.getEntityOptionAccess().getEntityDeleteOptionAction_0_0()); 
            // InternalUIDSL.g:3713:2: ()
            // InternalUIDSL.g:3713:3: 
            {
            }

             after(grammarAccess.getEntityOptionAccess().getEntityDeleteOptionAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityOption__Group_0__0__Impl"


    // $ANTLR start "rule__EntityOption__Group_0__1"
    // InternalUIDSL.g:3721:1: rule__EntityOption__Group_0__1 : rule__EntityOption__Group_0__1__Impl ;
    public final void rule__EntityOption__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3725:1: ( rule__EntityOption__Group_0__1__Impl )
            // InternalUIDSL.g:3726:2: rule__EntityOption__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntityOption__Group_0__1__Impl();

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
    // $ANTLR end "rule__EntityOption__Group_0__1"


    // $ANTLR start "rule__EntityOption__Group_0__1__Impl"
    // InternalUIDSL.g:3732:1: rule__EntityOption__Group_0__1__Impl : ( ( rule__EntityOption__DeleteByFlagAssignment_0_1 ) ) ;
    public final void rule__EntityOption__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3736:1: ( ( ( rule__EntityOption__DeleteByFlagAssignment_0_1 ) ) )
            // InternalUIDSL.g:3737:1: ( ( rule__EntityOption__DeleteByFlagAssignment_0_1 ) )
            {
            // InternalUIDSL.g:3737:1: ( ( rule__EntityOption__DeleteByFlagAssignment_0_1 ) )
            // InternalUIDSL.g:3738:2: ( rule__EntityOption__DeleteByFlagAssignment_0_1 )
            {
             before(grammarAccess.getEntityOptionAccess().getDeleteByFlagAssignment_0_1()); 
            // InternalUIDSL.g:3739:2: ( rule__EntityOption__DeleteByFlagAssignment_0_1 )
            // InternalUIDSL.g:3739:3: rule__EntityOption__DeleteByFlagAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__EntityOption__DeleteByFlagAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityOptionAccess().getDeleteByFlagAssignment_0_1()); 

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
    // $ANTLR end "rule__EntityOption__Group_0__1__Impl"


    // $ANTLR start "rule__EntityOption__Group_1__0"
    // InternalUIDSL.g:3748:1: rule__EntityOption__Group_1__0 : rule__EntityOption__Group_1__0__Impl rule__EntityOption__Group_1__1 ;
    public final void rule__EntityOption__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3752:1: ( rule__EntityOption__Group_1__0__Impl rule__EntityOption__Group_1__1 )
            // InternalUIDSL.g:3753:2: rule__EntityOption__Group_1__0__Impl rule__EntityOption__Group_1__1
            {
            pushFollow(FOLLOW_34);
            rule__EntityOption__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityOption__Group_1__1();

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
    // $ANTLR end "rule__EntityOption__Group_1__0"


    // $ANTLR start "rule__EntityOption__Group_1__0__Impl"
    // InternalUIDSL.g:3760:1: rule__EntityOption__Group_1__0__Impl : ( () ) ;
    public final void rule__EntityOption__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3764:1: ( ( () ) )
            // InternalUIDSL.g:3765:1: ( () )
            {
            // InternalUIDSL.g:3765:1: ( () )
            // InternalUIDSL.g:3766:2: ()
            {
             before(grammarAccess.getEntityOptionAccess().getInheritanceMappingOptionAction_1_0()); 
            // InternalUIDSL.g:3767:2: ()
            // InternalUIDSL.g:3767:3: 
            {
            }

             after(grammarAccess.getEntityOptionAccess().getInheritanceMappingOptionAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityOption__Group_1__0__Impl"


    // $ANTLR start "rule__EntityOption__Group_1__1"
    // InternalUIDSL.g:3775:1: rule__EntityOption__Group_1__1 : rule__EntityOption__Group_1__1__Impl rule__EntityOption__Group_1__2 ;
    public final void rule__EntityOption__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3779:1: ( rule__EntityOption__Group_1__1__Impl rule__EntityOption__Group_1__2 )
            // InternalUIDSL.g:3780:2: rule__EntityOption__Group_1__1__Impl rule__EntityOption__Group_1__2
            {
            pushFollow(FOLLOW_35);
            rule__EntityOption__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityOption__Group_1__2();

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
    // $ANTLR end "rule__EntityOption__Group_1__1"


    // $ANTLR start "rule__EntityOption__Group_1__1__Impl"
    // InternalUIDSL.g:3787:1: rule__EntityOption__Group_1__1__Impl : ( 'inheritance' ) ;
    public final void rule__EntityOption__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3791:1: ( ( 'inheritance' ) )
            // InternalUIDSL.g:3792:1: ( 'inheritance' )
            {
            // InternalUIDSL.g:3792:1: ( 'inheritance' )
            // InternalUIDSL.g:3793:2: 'inheritance'
            {
             before(grammarAccess.getEntityOptionAccess().getInheritanceKeyword_1_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getEntityOptionAccess().getInheritanceKeyword_1_1()); 

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
    // $ANTLR end "rule__EntityOption__Group_1__1__Impl"


    // $ANTLR start "rule__EntityOption__Group_1__2"
    // InternalUIDSL.g:3802:1: rule__EntityOption__Group_1__2 : rule__EntityOption__Group_1__2__Impl rule__EntityOption__Group_1__3 ;
    public final void rule__EntityOption__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3806:1: ( rule__EntityOption__Group_1__2__Impl rule__EntityOption__Group_1__3 )
            // InternalUIDSL.g:3807:2: rule__EntityOption__Group_1__2__Impl rule__EntityOption__Group_1__3
            {
            pushFollow(FOLLOW_36);
            rule__EntityOption__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityOption__Group_1__3();

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
    // $ANTLR end "rule__EntityOption__Group_1__2"


    // $ANTLR start "rule__EntityOption__Group_1__2__Impl"
    // InternalUIDSL.g:3814:1: rule__EntityOption__Group_1__2__Impl : ( '=' ) ;
    public final void rule__EntityOption__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3818:1: ( ( '=' ) )
            // InternalUIDSL.g:3819:1: ( '=' )
            {
            // InternalUIDSL.g:3819:1: ( '=' )
            // InternalUIDSL.g:3820:2: '='
            {
             before(grammarAccess.getEntityOptionAccess().getEqualsSignKeyword_1_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getEntityOptionAccess().getEqualsSignKeyword_1_2()); 

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
    // $ANTLR end "rule__EntityOption__Group_1__2__Impl"


    // $ANTLR start "rule__EntityOption__Group_1__3"
    // InternalUIDSL.g:3829:1: rule__EntityOption__Group_1__3 : rule__EntityOption__Group_1__3__Impl ;
    public final void rule__EntityOption__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3833:1: ( rule__EntityOption__Group_1__3__Impl )
            // InternalUIDSL.g:3834:2: rule__EntityOption__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntityOption__Group_1__3__Impl();

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
    // $ANTLR end "rule__EntityOption__Group_1__3"


    // $ANTLR start "rule__EntityOption__Group_1__3__Impl"
    // InternalUIDSL.g:3840:1: rule__EntityOption__Group_1__3__Impl : ( ( rule__EntityOption__InheritanceMappingAssignment_1_3 ) ) ;
    public final void rule__EntityOption__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3844:1: ( ( ( rule__EntityOption__InheritanceMappingAssignment_1_3 ) ) )
            // InternalUIDSL.g:3845:1: ( ( rule__EntityOption__InheritanceMappingAssignment_1_3 ) )
            {
            // InternalUIDSL.g:3845:1: ( ( rule__EntityOption__InheritanceMappingAssignment_1_3 ) )
            // InternalUIDSL.g:3846:2: ( rule__EntityOption__InheritanceMappingAssignment_1_3 )
            {
             before(grammarAccess.getEntityOptionAccess().getInheritanceMappingAssignment_1_3()); 
            // InternalUIDSL.g:3847:2: ( rule__EntityOption__InheritanceMappingAssignment_1_3 )
            // InternalUIDSL.g:3847:3: rule__EntityOption__InheritanceMappingAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__EntityOption__InheritanceMappingAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getEntityOptionAccess().getInheritanceMappingAssignment_1_3()); 

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
    // $ANTLR end "rule__EntityOption__Group_1__3__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalUIDSL.g:3856:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3860:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalUIDSL.g:3861:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

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
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalUIDSL.g:3868:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__TypeAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3872:1: ( ( ( rule__Attribute__TypeAssignment_0 ) ) )
            // InternalUIDSL.g:3873:1: ( ( rule__Attribute__TypeAssignment_0 ) )
            {
            // InternalUIDSL.g:3873:1: ( ( rule__Attribute__TypeAssignment_0 ) )
            // InternalUIDSL.g:3874:2: ( rule__Attribute__TypeAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_0()); 
            // InternalUIDSL.g:3875:2: ( rule__Attribute__TypeAssignment_0 )
            // InternalUIDSL.g:3875:3: rule__Attribute__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_0()); 

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
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalUIDSL.g:3883:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3887:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalUIDSL.g:3888:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

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
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalUIDSL.g:3895:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3899:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalUIDSL.g:3900:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalUIDSL.g:3900:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalUIDSL.g:3901:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalUIDSL.g:3902:2: ( rule__Attribute__NameAssignment_1 )
            // InternalUIDSL.g:3902:3: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalUIDSL.g:3910:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3914:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalUIDSL.g:3915:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3();

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
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalUIDSL.g:3922:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__Group_2__0 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3926:1: ( ( ( rule__Attribute__Group_2__0 )? ) )
            // InternalUIDSL.g:3927:1: ( ( rule__Attribute__Group_2__0 )? )
            {
            // InternalUIDSL.g:3927:1: ( ( rule__Attribute__Group_2__0 )? )
            // InternalUIDSL.g:3928:2: ( rule__Attribute__Group_2__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_2()); 
            // InternalUIDSL.g:3929:2: ( rule__Attribute__Group_2__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=50 && LA31_0<=51)||(LA31_0>=53 && LA31_0<=54)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalUIDSL.g:3929:3: rule__Attribute__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalUIDSL.g:3937:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3941:1: ( rule__Attribute__Group__3__Impl )
            // InternalUIDSL.g:3942:2: rule__Attribute__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3__Impl();

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
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // InternalUIDSL.g:3948:1: rule__Attribute__Group__3__Impl : ( ';' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3952:1: ( ( ';' ) )
            // InternalUIDSL.g:3953:1: ( ';' )
            {
            // InternalUIDSL.g:3953:1: ( ';' )
            // InternalUIDSL.g:3954:2: ';'
            {
             before(grammarAccess.getAttributeAccess().getSemicolonKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Attribute__Group_2__0"
    // InternalUIDSL.g:3964:1: rule__Attribute__Group_2__0 : rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1 ;
    public final void rule__Attribute__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3968:1: ( rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1 )
            // InternalUIDSL.g:3969:2: rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1
            {
            pushFollow(FOLLOW_17);
            rule__Attribute__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_2__1();

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
    // $ANTLR end "rule__Attribute__Group_2__0"


    // $ANTLR start "rule__Attribute__Group_2__0__Impl"
    // InternalUIDSL.g:3976:1: rule__Attribute__Group_2__0__Impl : ( ( rule__Attribute__OptionsAssignment_2_0 ) ) ;
    public final void rule__Attribute__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3980:1: ( ( ( rule__Attribute__OptionsAssignment_2_0 ) ) )
            // InternalUIDSL.g:3981:1: ( ( rule__Attribute__OptionsAssignment_2_0 ) )
            {
            // InternalUIDSL.g:3981:1: ( ( rule__Attribute__OptionsAssignment_2_0 ) )
            // InternalUIDSL.g:3982:2: ( rule__Attribute__OptionsAssignment_2_0 )
            {
             before(grammarAccess.getAttributeAccess().getOptionsAssignment_2_0()); 
            // InternalUIDSL.g:3983:2: ( rule__Attribute__OptionsAssignment_2_0 )
            // InternalUIDSL.g:3983:3: rule__Attribute__OptionsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__OptionsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getOptionsAssignment_2_0()); 

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
    // $ANTLR end "rule__Attribute__Group_2__0__Impl"


    // $ANTLR start "rule__Attribute__Group_2__1"
    // InternalUIDSL.g:3991:1: rule__Attribute__Group_2__1 : rule__Attribute__Group_2__1__Impl ;
    public final void rule__Attribute__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:3995:1: ( rule__Attribute__Group_2__1__Impl )
            // InternalUIDSL.g:3996:2: rule__Attribute__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_2__1__Impl();

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
    // $ANTLR end "rule__Attribute__Group_2__1"


    // $ANTLR start "rule__Attribute__Group_2__1__Impl"
    // InternalUIDSL.g:4002:1: rule__Attribute__Group_2__1__Impl : ( ( rule__Attribute__Group_2_1__0 )* ) ;
    public final void rule__Attribute__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4006:1: ( ( ( rule__Attribute__Group_2_1__0 )* ) )
            // InternalUIDSL.g:4007:1: ( ( rule__Attribute__Group_2_1__0 )* )
            {
            // InternalUIDSL.g:4007:1: ( ( rule__Attribute__Group_2_1__0 )* )
            // InternalUIDSL.g:4008:2: ( rule__Attribute__Group_2_1__0 )*
            {
             before(grammarAccess.getAttributeAccess().getGroup_2_1()); 
            // InternalUIDSL.g:4009:2: ( rule__Attribute__Group_2_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==24) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalUIDSL.g:4009:3: rule__Attribute__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Attribute__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getAttributeAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__Attribute__Group_2__1__Impl"


    // $ANTLR start "rule__Attribute__Group_2_1__0"
    // InternalUIDSL.g:4018:1: rule__Attribute__Group_2_1__0 : rule__Attribute__Group_2_1__0__Impl rule__Attribute__Group_2_1__1 ;
    public final void rule__Attribute__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4022:1: ( rule__Attribute__Group_2_1__0__Impl rule__Attribute__Group_2_1__1 )
            // InternalUIDSL.g:4023:2: rule__Attribute__Group_2_1__0__Impl rule__Attribute__Group_2_1__1
            {
            pushFollow(FOLLOW_38);
            rule__Attribute__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_2_1__1();

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
    // $ANTLR end "rule__Attribute__Group_2_1__0"


    // $ANTLR start "rule__Attribute__Group_2_1__0__Impl"
    // InternalUIDSL.g:4030:1: rule__Attribute__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Attribute__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4034:1: ( ( ',' ) )
            // InternalUIDSL.g:4035:1: ( ',' )
            {
            // InternalUIDSL.g:4035:1: ( ',' )
            // InternalUIDSL.g:4036:2: ','
            {
             before(grammarAccess.getAttributeAccess().getCommaKeyword_2_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getCommaKeyword_2_1_0()); 

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
    // $ANTLR end "rule__Attribute__Group_2_1__0__Impl"


    // $ANTLR start "rule__Attribute__Group_2_1__1"
    // InternalUIDSL.g:4045:1: rule__Attribute__Group_2_1__1 : rule__Attribute__Group_2_1__1__Impl ;
    public final void rule__Attribute__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4049:1: ( rule__Attribute__Group_2_1__1__Impl )
            // InternalUIDSL.g:4050:2: rule__Attribute__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__Attribute__Group_2_1__1"


    // $ANTLR start "rule__Attribute__Group_2_1__1__Impl"
    // InternalUIDSL.g:4056:1: rule__Attribute__Group_2_1__1__Impl : ( ( rule__Attribute__OptionsAssignment_2_1_1 ) ) ;
    public final void rule__Attribute__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4060:1: ( ( ( rule__Attribute__OptionsAssignment_2_1_1 ) ) )
            // InternalUIDSL.g:4061:1: ( ( rule__Attribute__OptionsAssignment_2_1_1 ) )
            {
            // InternalUIDSL.g:4061:1: ( ( rule__Attribute__OptionsAssignment_2_1_1 ) )
            // InternalUIDSL.g:4062:2: ( rule__Attribute__OptionsAssignment_2_1_1 )
            {
             before(grammarAccess.getAttributeAccess().getOptionsAssignment_2_1_1()); 
            // InternalUIDSL.g:4063:2: ( rule__Attribute__OptionsAssignment_2_1_1 )
            // InternalUIDSL.g:4063:3: rule__Attribute__OptionsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__OptionsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getOptionsAssignment_2_1_1()); 

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
    // $ANTLR end "rule__Attribute__Group_2_1__1__Impl"


    // $ANTLR start "superBasicType__Group_0__0"
    // InternalUIDSL.g:4072:1: superBasicType__Group_0__0 : superBasicType__Group_0__0__Impl superBasicType__Group_0__1 ;
    public final void superBasicType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4076:1: ( superBasicType__Group_0__0__Impl superBasicType__Group_0__1 )
            // InternalUIDSL.g:4077:2: superBasicType__Group_0__0__Impl superBasicType__Group_0__1
            {
            pushFollow(FOLLOW_39);
            superBasicType__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            superBasicType__Group_0__1();

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
    // $ANTLR end "superBasicType__Group_0__0"


    // $ANTLR start "superBasicType__Group_0__0__Impl"
    // InternalUIDSL.g:4084:1: superBasicType__Group_0__0__Impl : ( () ) ;
    public final void superBasicType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4088:1: ( ( () ) )
            // InternalUIDSL.g:4089:1: ( () )
            {
            // InternalUIDSL.g:4089:1: ( () )
            // InternalUIDSL.g:4090:2: ()
            {
             before(grammarAccess.getDomainModelBasicTypeAccess().getStringTypeAction_0_0()); 
            // InternalUIDSL.g:4091:2: ()
            // InternalUIDSL.g:4091:3: 
            {
            }

             after(grammarAccess.getDomainModelBasicTypeAccess().getStringTypeAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "superBasicType__Group_0__0__Impl"


    // $ANTLR start "superBasicType__Group_0__1"
    // InternalUIDSL.g:4099:1: superBasicType__Group_0__1 : superBasicType__Group_0__1__Impl ;
    public final void superBasicType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4103:1: ( superBasicType__Group_0__1__Impl )
            // InternalUIDSL.g:4104:2: superBasicType__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            superBasicType__Group_0__1__Impl();

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
    // $ANTLR end "superBasicType__Group_0__1"


    // $ANTLR start "superBasicType__Group_0__1__Impl"
    // InternalUIDSL.g:4110:1: superBasicType__Group_0__1__Impl : ( 'string' ) ;
    public final void superBasicType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4114:1: ( ( 'string' ) )
            // InternalUIDSL.g:4115:1: ( 'string' )
            {
            // InternalUIDSL.g:4115:1: ( 'string' )
            // InternalUIDSL.g:4116:2: 'string'
            {
             before(grammarAccess.getDomainModelBasicTypeAccess().getStringKeyword_0_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getDomainModelBasicTypeAccess().getStringKeyword_0_1()); 

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
    // $ANTLR end "superBasicType__Group_0__1__Impl"


    // $ANTLR start "superBasicType__Group_1__0"
    // InternalUIDSL.g:4126:1: superBasicType__Group_1__0 : superBasicType__Group_1__0__Impl superBasicType__Group_1__1 ;
    public final void superBasicType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4130:1: ( superBasicType__Group_1__0__Impl superBasicType__Group_1__1 )
            // InternalUIDSL.g:4131:2: superBasicType__Group_1__0__Impl superBasicType__Group_1__1
            {
            pushFollow(FOLLOW_40);
            superBasicType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            superBasicType__Group_1__1();

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
    // $ANTLR end "superBasicType__Group_1__0"


    // $ANTLR start "superBasicType__Group_1__0__Impl"
    // InternalUIDSL.g:4138:1: superBasicType__Group_1__0__Impl : ( () ) ;
    public final void superBasicType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4142:1: ( ( () ) )
            // InternalUIDSL.g:4143:1: ( () )
            {
            // InternalUIDSL.g:4143:1: ( () )
            // InternalUIDSL.g:4144:2: ()
            {
             before(grammarAccess.getDomainModelBasicTypeAccess().getIntTypeAction_1_0()); 
            // InternalUIDSL.g:4145:2: ()
            // InternalUIDSL.g:4145:3: 
            {
            }

             after(grammarAccess.getDomainModelBasicTypeAccess().getIntTypeAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "superBasicType__Group_1__0__Impl"


    // $ANTLR start "superBasicType__Group_1__1"
    // InternalUIDSL.g:4153:1: superBasicType__Group_1__1 : superBasicType__Group_1__1__Impl ;
    public final void superBasicType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4157:1: ( superBasicType__Group_1__1__Impl )
            // InternalUIDSL.g:4158:2: superBasicType__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            superBasicType__Group_1__1__Impl();

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
    // $ANTLR end "superBasicType__Group_1__1"


    // $ANTLR start "superBasicType__Group_1__1__Impl"
    // InternalUIDSL.g:4164:1: superBasicType__Group_1__1__Impl : ( 'int' ) ;
    public final void superBasicType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4168:1: ( ( 'int' ) )
            // InternalUIDSL.g:4169:1: ( 'int' )
            {
            // InternalUIDSL.g:4169:1: ( 'int' )
            // InternalUIDSL.g:4170:2: 'int'
            {
             before(grammarAccess.getDomainModelBasicTypeAccess().getIntKeyword_1_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getDomainModelBasicTypeAccess().getIntKeyword_1_1()); 

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
    // $ANTLR end "superBasicType__Group_1__1__Impl"


    // $ANTLR start "superBasicType__Group_2__0"
    // InternalUIDSL.g:4180:1: superBasicType__Group_2__0 : superBasicType__Group_2__0__Impl superBasicType__Group_2__1 ;
    public final void superBasicType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4184:1: ( superBasicType__Group_2__0__Impl superBasicType__Group_2__1 )
            // InternalUIDSL.g:4185:2: superBasicType__Group_2__0__Impl superBasicType__Group_2__1
            {
            pushFollow(FOLLOW_41);
            superBasicType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            superBasicType__Group_2__1();

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
    // $ANTLR end "superBasicType__Group_2__0"


    // $ANTLR start "superBasicType__Group_2__0__Impl"
    // InternalUIDSL.g:4192:1: superBasicType__Group_2__0__Impl : ( () ) ;
    public final void superBasicType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4196:1: ( ( () ) )
            // InternalUIDSL.g:4197:1: ( () )
            {
            // InternalUIDSL.g:4197:1: ( () )
            // InternalUIDSL.g:4198:2: ()
            {
             before(grammarAccess.getDomainModelBasicTypeAccess().getLongTypeAction_2_0()); 
            // InternalUIDSL.g:4199:2: ()
            // InternalUIDSL.g:4199:3: 
            {
            }

             after(grammarAccess.getDomainModelBasicTypeAccess().getLongTypeAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "superBasicType__Group_2__0__Impl"


    // $ANTLR start "superBasicType__Group_2__1"
    // InternalUIDSL.g:4207:1: superBasicType__Group_2__1 : superBasicType__Group_2__1__Impl ;
    public final void superBasicType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4211:1: ( superBasicType__Group_2__1__Impl )
            // InternalUIDSL.g:4212:2: superBasicType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            superBasicType__Group_2__1__Impl();

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
    // $ANTLR end "superBasicType__Group_2__1"


    // $ANTLR start "superBasicType__Group_2__1__Impl"
    // InternalUIDSL.g:4218:1: superBasicType__Group_2__1__Impl : ( 'long' ) ;
    public final void superBasicType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4222:1: ( ( 'long' ) )
            // InternalUIDSL.g:4223:1: ( 'long' )
            {
            // InternalUIDSL.g:4223:1: ( 'long' )
            // InternalUIDSL.g:4224:2: 'long'
            {
             before(grammarAccess.getDomainModelBasicTypeAccess().getLongKeyword_2_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getDomainModelBasicTypeAccess().getLongKeyword_2_1()); 

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
    // $ANTLR end "superBasicType__Group_2__1__Impl"


    // $ANTLR start "superBasicType__Group_3__0"
    // InternalUIDSL.g:4234:1: superBasicType__Group_3__0 : superBasicType__Group_3__0__Impl superBasicType__Group_3__1 ;
    public final void superBasicType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4238:1: ( superBasicType__Group_3__0__Impl superBasicType__Group_3__1 )
            // InternalUIDSL.g:4239:2: superBasicType__Group_3__0__Impl superBasicType__Group_3__1
            {
            pushFollow(FOLLOW_42);
            superBasicType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            superBasicType__Group_3__1();

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
    // $ANTLR end "superBasicType__Group_3__0"


    // $ANTLR start "superBasicType__Group_3__0__Impl"
    // InternalUIDSL.g:4246:1: superBasicType__Group_3__0__Impl : ( () ) ;
    public final void superBasicType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4250:1: ( ( () ) )
            // InternalUIDSL.g:4251:1: ( () )
            {
            // InternalUIDSL.g:4251:1: ( () )
            // InternalUIDSL.g:4252:2: ()
            {
             before(grammarAccess.getDomainModelBasicTypeAccess().getBoolTypeAction_3_0()); 
            // InternalUIDSL.g:4253:2: ()
            // InternalUIDSL.g:4253:3: 
            {
            }

             after(grammarAccess.getDomainModelBasicTypeAccess().getBoolTypeAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "superBasicType__Group_3__0__Impl"


    // $ANTLR start "superBasicType__Group_3__1"
    // InternalUIDSL.g:4261:1: superBasicType__Group_3__1 : superBasicType__Group_3__1__Impl ;
    public final void superBasicType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4265:1: ( superBasicType__Group_3__1__Impl )
            // InternalUIDSL.g:4266:2: superBasicType__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            superBasicType__Group_3__1__Impl();

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
    // $ANTLR end "superBasicType__Group_3__1"


    // $ANTLR start "superBasicType__Group_3__1__Impl"
    // InternalUIDSL.g:4272:1: superBasicType__Group_3__1__Impl : ( 'boolean' ) ;
    public final void superBasicType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4276:1: ( ( 'boolean' ) )
            // InternalUIDSL.g:4277:1: ( 'boolean' )
            {
            // InternalUIDSL.g:4277:1: ( 'boolean' )
            // InternalUIDSL.g:4278:2: 'boolean'
            {
             before(grammarAccess.getDomainModelBasicTypeAccess().getBooleanKeyword_3_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getDomainModelBasicTypeAccess().getBooleanKeyword_3_1()); 

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
    // $ANTLR end "superBasicType__Group_3__1__Impl"


    // $ANTLR start "superBasicType__Group_4__0"
    // InternalUIDSL.g:4288:1: superBasicType__Group_4__0 : superBasicType__Group_4__0__Impl superBasicType__Group_4__1 ;
    public final void superBasicType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4292:1: ( superBasicType__Group_4__0__Impl superBasicType__Group_4__1 )
            // InternalUIDSL.g:4293:2: superBasicType__Group_4__0__Impl superBasicType__Group_4__1
            {
            pushFollow(FOLLOW_43);
            superBasicType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            superBasicType__Group_4__1();

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
    // $ANTLR end "superBasicType__Group_4__0"


    // $ANTLR start "superBasicType__Group_4__0__Impl"
    // InternalUIDSL.g:4300:1: superBasicType__Group_4__0__Impl : ( () ) ;
    public final void superBasicType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4304:1: ( ( () ) )
            // InternalUIDSL.g:4305:1: ( () )
            {
            // InternalUIDSL.g:4305:1: ( () )
            // InternalUIDSL.g:4306:2: ()
            {
             before(grammarAccess.getDomainModelBasicTypeAccess().getDateTypeAction_4_0()); 
            // InternalUIDSL.g:4307:2: ()
            // InternalUIDSL.g:4307:3: 
            {
            }

             after(grammarAccess.getDomainModelBasicTypeAccess().getDateTypeAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "superBasicType__Group_4__0__Impl"


    // $ANTLR start "superBasicType__Group_4__1"
    // InternalUIDSL.g:4315:1: superBasicType__Group_4__1 : superBasicType__Group_4__1__Impl ;
    public final void superBasicType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4319:1: ( superBasicType__Group_4__1__Impl )
            // InternalUIDSL.g:4320:2: superBasicType__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            superBasicType__Group_4__1__Impl();

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
    // $ANTLR end "superBasicType__Group_4__1"


    // $ANTLR start "superBasicType__Group_4__1__Impl"
    // InternalUIDSL.g:4326:1: superBasicType__Group_4__1__Impl : ( 'date' ) ;
    public final void superBasicType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4330:1: ( ( 'date' ) )
            // InternalUIDSL.g:4331:1: ( 'date' )
            {
            // InternalUIDSL.g:4331:1: ( 'date' )
            // InternalUIDSL.g:4332:2: 'date'
            {
             before(grammarAccess.getDomainModelBasicTypeAccess().getDateKeyword_4_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getDomainModelBasicTypeAccess().getDateKeyword_4_1()); 

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
    // $ANTLR end "superBasicType__Group_4__1__Impl"


    // $ANTLR start "rule__CollectionType__Group__0"
    // InternalUIDSL.g:4342:1: rule__CollectionType__Group__0 : rule__CollectionType__Group__0__Impl rule__CollectionType__Group__1 ;
    public final void rule__CollectionType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4346:1: ( rule__CollectionType__Group__0__Impl rule__CollectionType__Group__1 )
            // InternalUIDSL.g:4347:2: rule__CollectionType__Group__0__Impl rule__CollectionType__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__CollectionType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollectionType__Group__1();

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
    // $ANTLR end "rule__CollectionType__Group__0"


    // $ANTLR start "rule__CollectionType__Group__0__Impl"
    // InternalUIDSL.g:4354:1: rule__CollectionType__Group__0__Impl : ( 'List' ) ;
    public final void rule__CollectionType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4358:1: ( ( 'List' ) )
            // InternalUIDSL.g:4359:1: ( 'List' )
            {
            // InternalUIDSL.g:4359:1: ( 'List' )
            // InternalUIDSL.g:4360:2: 'List'
            {
             before(grammarAccess.getCollectionTypeAccess().getListKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getCollectionTypeAccess().getListKeyword_0()); 

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
    // $ANTLR end "rule__CollectionType__Group__0__Impl"


    // $ANTLR start "rule__CollectionType__Group__1"
    // InternalUIDSL.g:4369:1: rule__CollectionType__Group__1 : rule__CollectionType__Group__1__Impl rule__CollectionType__Group__2 ;
    public final void rule__CollectionType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4373:1: ( rule__CollectionType__Group__1__Impl rule__CollectionType__Group__2 )
            // InternalUIDSL.g:4374:2: rule__CollectionType__Group__1__Impl rule__CollectionType__Group__2
            {
            pushFollow(FOLLOW_45);
            rule__CollectionType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollectionType__Group__2();

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
    // $ANTLR end "rule__CollectionType__Group__1"


    // $ANTLR start "rule__CollectionType__Group__1__Impl"
    // InternalUIDSL.g:4381:1: rule__CollectionType__Group__1__Impl : ( '<' ) ;
    public final void rule__CollectionType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4385:1: ( ( '<' ) )
            // InternalUIDSL.g:4386:1: ( '<' )
            {
            // InternalUIDSL.g:4386:1: ( '<' )
            // InternalUIDSL.g:4387:2: '<'
            {
             before(grammarAccess.getCollectionTypeAccess().getLessThanSignKeyword_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getCollectionTypeAccess().getLessThanSignKeyword_1()); 

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
    // $ANTLR end "rule__CollectionType__Group__1__Impl"


    // $ANTLR start "rule__CollectionType__Group__2"
    // InternalUIDSL.g:4396:1: rule__CollectionType__Group__2 : rule__CollectionType__Group__2__Impl rule__CollectionType__Group__3 ;
    public final void rule__CollectionType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4400:1: ( rule__CollectionType__Group__2__Impl rule__CollectionType__Group__3 )
            // InternalUIDSL.g:4401:2: rule__CollectionType__Group__2__Impl rule__CollectionType__Group__3
            {
            pushFollow(FOLLOW_46);
            rule__CollectionType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CollectionType__Group__3();

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
    // $ANTLR end "rule__CollectionType__Group__2"


    // $ANTLR start "rule__CollectionType__Group__2__Impl"
    // InternalUIDSL.g:4408:1: rule__CollectionType__Group__2__Impl : ( ( rule__CollectionType__OfTypeAssignment_2 ) ) ;
    public final void rule__CollectionType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4412:1: ( ( ( rule__CollectionType__OfTypeAssignment_2 ) ) )
            // InternalUIDSL.g:4413:1: ( ( rule__CollectionType__OfTypeAssignment_2 ) )
            {
            // InternalUIDSL.g:4413:1: ( ( rule__CollectionType__OfTypeAssignment_2 ) )
            // InternalUIDSL.g:4414:2: ( rule__CollectionType__OfTypeAssignment_2 )
            {
             before(grammarAccess.getCollectionTypeAccess().getOfTypeAssignment_2()); 
            // InternalUIDSL.g:4415:2: ( rule__CollectionType__OfTypeAssignment_2 )
            // InternalUIDSL.g:4415:3: rule__CollectionType__OfTypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CollectionType__OfTypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCollectionTypeAccess().getOfTypeAssignment_2()); 

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
    // $ANTLR end "rule__CollectionType__Group__2__Impl"


    // $ANTLR start "rule__CollectionType__Group__3"
    // InternalUIDSL.g:4423:1: rule__CollectionType__Group__3 : rule__CollectionType__Group__3__Impl ;
    public final void rule__CollectionType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4427:1: ( rule__CollectionType__Group__3__Impl )
            // InternalUIDSL.g:4428:2: rule__CollectionType__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CollectionType__Group__3__Impl();

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
    // $ANTLR end "rule__CollectionType__Group__3"


    // $ANTLR start "rule__CollectionType__Group__3__Impl"
    // InternalUIDSL.g:4434:1: rule__CollectionType__Group__3__Impl : ( '>' ) ;
    public final void rule__CollectionType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4438:1: ( ( '>' ) )
            // InternalUIDSL.g:4439:1: ( '>' )
            {
            // InternalUIDSL.g:4439:1: ( '>' )
            // InternalUIDSL.g:4440:2: '>'
            {
             before(grammarAccess.getCollectionTypeAccess().getGreaterThanSignKeyword_3()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getCollectionTypeAccess().getGreaterThanSignKeyword_3()); 

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
    // $ANTLR end "rule__CollectionType__Group__3__Impl"


    // $ANTLR start "rule__AttributeOption__Group_0__0"
    // InternalUIDSL.g:4450:1: rule__AttributeOption__Group_0__0 : rule__AttributeOption__Group_0__0__Impl rule__AttributeOption__Group_0__1 ;
    public final void rule__AttributeOption__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4454:1: ( rule__AttributeOption__Group_0__0__Impl rule__AttributeOption__Group_0__1 )
            // InternalUIDSL.g:4455:2: rule__AttributeOption__Group_0__0__Impl rule__AttributeOption__Group_0__1
            {
            pushFollow(FOLLOW_47);
            rule__AttributeOption__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeOption__Group_0__1();

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
    // $ANTLR end "rule__AttributeOption__Group_0__0"


    // $ANTLR start "rule__AttributeOption__Group_0__0__Impl"
    // InternalUIDSL.g:4462:1: rule__AttributeOption__Group_0__0__Impl : ( () ) ;
    public final void rule__AttributeOption__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4466:1: ( ( () ) )
            // InternalUIDSL.g:4467:1: ( () )
            {
            // InternalUIDSL.g:4467:1: ( () )
            // InternalUIDSL.g:4468:2: ()
            {
             before(grammarAccess.getAttributeOptionAccess().getRequiredAction_0_0()); 
            // InternalUIDSL.g:4469:2: ()
            // InternalUIDSL.g:4469:3: 
            {
            }

             after(grammarAccess.getAttributeOptionAccess().getRequiredAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeOption__Group_0__0__Impl"


    // $ANTLR start "rule__AttributeOption__Group_0__1"
    // InternalUIDSL.g:4477:1: rule__AttributeOption__Group_0__1 : rule__AttributeOption__Group_0__1__Impl ;
    public final void rule__AttributeOption__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4481:1: ( rule__AttributeOption__Group_0__1__Impl )
            // InternalUIDSL.g:4482:2: rule__AttributeOption__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeOption__Group_0__1__Impl();

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
    // $ANTLR end "rule__AttributeOption__Group_0__1"


    // $ANTLR start "rule__AttributeOption__Group_0__1__Impl"
    // InternalUIDSL.g:4488:1: rule__AttributeOption__Group_0__1__Impl : ( ( rule__AttributeOption__RequiredAssignment_0_1 ) ) ;
    public final void rule__AttributeOption__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4492:1: ( ( ( rule__AttributeOption__RequiredAssignment_0_1 ) ) )
            // InternalUIDSL.g:4493:1: ( ( rule__AttributeOption__RequiredAssignment_0_1 ) )
            {
            // InternalUIDSL.g:4493:1: ( ( rule__AttributeOption__RequiredAssignment_0_1 ) )
            // InternalUIDSL.g:4494:2: ( rule__AttributeOption__RequiredAssignment_0_1 )
            {
             before(grammarAccess.getAttributeOptionAccess().getRequiredAssignment_0_1()); 
            // InternalUIDSL.g:4495:2: ( rule__AttributeOption__RequiredAssignment_0_1 )
            // InternalUIDSL.g:4495:3: rule__AttributeOption__RequiredAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributeOption__RequiredAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeOptionAccess().getRequiredAssignment_0_1()); 

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
    // $ANTLR end "rule__AttributeOption__Group_0__1__Impl"


    // $ANTLR start "rule__AttributeOption__Group_1__0"
    // InternalUIDSL.g:4504:1: rule__AttributeOption__Group_1__0 : rule__AttributeOption__Group_1__0__Impl rule__AttributeOption__Group_1__1 ;
    public final void rule__AttributeOption__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4508:1: ( rule__AttributeOption__Group_1__0__Impl rule__AttributeOption__Group_1__1 )
            // InternalUIDSL.g:4509:2: rule__AttributeOption__Group_1__0__Impl rule__AttributeOption__Group_1__1
            {
            pushFollow(FOLLOW_48);
            rule__AttributeOption__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeOption__Group_1__1();

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
    // $ANTLR end "rule__AttributeOption__Group_1__0"


    // $ANTLR start "rule__AttributeOption__Group_1__0__Impl"
    // InternalUIDSL.g:4516:1: rule__AttributeOption__Group_1__0__Impl : ( () ) ;
    public final void rule__AttributeOption__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4520:1: ( ( () ) )
            // InternalUIDSL.g:4521:1: ( () )
            {
            // InternalUIDSL.g:4521:1: ( () )
            // InternalUIDSL.g:4522:2: ()
            {
             before(grammarAccess.getAttributeOptionAccess().getPartOfAction_1_0()); 
            // InternalUIDSL.g:4523:2: ()
            // InternalUIDSL.g:4523:3: 
            {
            }

             after(grammarAccess.getAttributeOptionAccess().getPartOfAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeOption__Group_1__0__Impl"


    // $ANTLR start "rule__AttributeOption__Group_1__1"
    // InternalUIDSL.g:4531:1: rule__AttributeOption__Group_1__1 : rule__AttributeOption__Group_1__1__Impl ;
    public final void rule__AttributeOption__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4535:1: ( rule__AttributeOption__Group_1__1__Impl )
            // InternalUIDSL.g:4536:2: rule__AttributeOption__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeOption__Group_1__1__Impl();

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
    // $ANTLR end "rule__AttributeOption__Group_1__1"


    // $ANTLR start "rule__AttributeOption__Group_1__1__Impl"
    // InternalUIDSL.g:4542:1: rule__AttributeOption__Group_1__1__Impl : ( ( rule__AttributeOption__PartOfAssignment_1_1 ) ) ;
    public final void rule__AttributeOption__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4546:1: ( ( ( rule__AttributeOption__PartOfAssignment_1_1 ) ) )
            // InternalUIDSL.g:4547:1: ( ( rule__AttributeOption__PartOfAssignment_1_1 ) )
            {
            // InternalUIDSL.g:4547:1: ( ( rule__AttributeOption__PartOfAssignment_1_1 ) )
            // InternalUIDSL.g:4548:2: ( rule__AttributeOption__PartOfAssignment_1_1 )
            {
             before(grammarAccess.getAttributeOptionAccess().getPartOfAssignment_1_1()); 
            // InternalUIDSL.g:4549:2: ( rule__AttributeOption__PartOfAssignment_1_1 )
            // InternalUIDSL.g:4549:3: rule__AttributeOption__PartOfAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributeOption__PartOfAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeOptionAccess().getPartOfAssignment_1_1()); 

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
    // $ANTLR end "rule__AttributeOption__Group_1__1__Impl"


    // $ANTLR start "rule__AttributeOption__Group_2__0"
    // InternalUIDSL.g:4558:1: rule__AttributeOption__Group_2__0 : rule__AttributeOption__Group_2__0__Impl rule__AttributeOption__Group_2__1 ;
    public final void rule__AttributeOption__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4562:1: ( rule__AttributeOption__Group_2__0__Impl rule__AttributeOption__Group_2__1 )
            // InternalUIDSL.g:4563:2: rule__AttributeOption__Group_2__0__Impl rule__AttributeOption__Group_2__1
            {
            pushFollow(FOLLOW_49);
            rule__AttributeOption__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeOption__Group_2__1();

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
    // $ANTLR end "rule__AttributeOption__Group_2__0"


    // $ANTLR start "rule__AttributeOption__Group_2__0__Impl"
    // InternalUIDSL.g:4570:1: rule__AttributeOption__Group_2__0__Impl : ( () ) ;
    public final void rule__AttributeOption__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4574:1: ( ( () ) )
            // InternalUIDSL.g:4575:1: ( () )
            {
            // InternalUIDSL.g:4575:1: ( () )
            // InternalUIDSL.g:4576:2: ()
            {
             before(grammarAccess.getAttributeOptionAccess().getRelationshipOwnerAction_2_0()); 
            // InternalUIDSL.g:4577:2: ()
            // InternalUIDSL.g:4577:3: 
            {
            }

             after(grammarAccess.getAttributeOptionAccess().getRelationshipOwnerAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeOption__Group_2__0__Impl"


    // $ANTLR start "rule__AttributeOption__Group_2__1"
    // InternalUIDSL.g:4585:1: rule__AttributeOption__Group_2__1 : rule__AttributeOption__Group_2__1__Impl rule__AttributeOption__Group_2__2 ;
    public final void rule__AttributeOption__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4589:1: ( rule__AttributeOption__Group_2__1__Impl rule__AttributeOption__Group_2__2 )
            // InternalUIDSL.g:4590:2: rule__AttributeOption__Group_2__1__Impl rule__AttributeOption__Group_2__2
            {
            pushFollow(FOLLOW_35);
            rule__AttributeOption__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeOption__Group_2__2();

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
    // $ANTLR end "rule__AttributeOption__Group_2__1"


    // $ANTLR start "rule__AttributeOption__Group_2__1__Impl"
    // InternalUIDSL.g:4597:1: rule__AttributeOption__Group_2__1__Impl : ( 'relationshipOwner' ) ;
    public final void rule__AttributeOption__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4601:1: ( ( 'relationshipOwner' ) )
            // InternalUIDSL.g:4602:1: ( 'relationshipOwner' )
            {
            // InternalUIDSL.g:4602:1: ( 'relationshipOwner' )
            // InternalUIDSL.g:4603:2: 'relationshipOwner'
            {
             before(grammarAccess.getAttributeOptionAccess().getRelationshipOwnerKeyword_2_1()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getAttributeOptionAccess().getRelationshipOwnerKeyword_2_1()); 

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
    // $ANTLR end "rule__AttributeOption__Group_2__1__Impl"


    // $ANTLR start "rule__AttributeOption__Group_2__2"
    // InternalUIDSL.g:4612:1: rule__AttributeOption__Group_2__2 : rule__AttributeOption__Group_2__2__Impl rule__AttributeOption__Group_2__3 ;
    public final void rule__AttributeOption__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4616:1: ( rule__AttributeOption__Group_2__2__Impl rule__AttributeOption__Group_2__3 )
            // InternalUIDSL.g:4617:2: rule__AttributeOption__Group_2__2__Impl rule__AttributeOption__Group_2__3
            {
            pushFollow(FOLLOW_4);
            rule__AttributeOption__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeOption__Group_2__3();

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
    // $ANTLR end "rule__AttributeOption__Group_2__2"


    // $ANTLR start "rule__AttributeOption__Group_2__2__Impl"
    // InternalUIDSL.g:4624:1: rule__AttributeOption__Group_2__2__Impl : ( '=' ) ;
    public final void rule__AttributeOption__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4628:1: ( ( '=' ) )
            // InternalUIDSL.g:4629:1: ( '=' )
            {
            // InternalUIDSL.g:4629:1: ( '=' )
            // InternalUIDSL.g:4630:2: '='
            {
             before(grammarAccess.getAttributeOptionAccess().getEqualsSignKeyword_2_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getAttributeOptionAccess().getEqualsSignKeyword_2_2()); 

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
    // $ANTLR end "rule__AttributeOption__Group_2__2__Impl"


    // $ANTLR start "rule__AttributeOption__Group_2__3"
    // InternalUIDSL.g:4639:1: rule__AttributeOption__Group_2__3 : rule__AttributeOption__Group_2__3__Impl ;
    public final void rule__AttributeOption__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4643:1: ( rule__AttributeOption__Group_2__3__Impl )
            // InternalUIDSL.g:4644:2: rule__AttributeOption__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeOption__Group_2__3__Impl();

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
    // $ANTLR end "rule__AttributeOption__Group_2__3"


    // $ANTLR start "rule__AttributeOption__Group_2__3__Impl"
    // InternalUIDSL.g:4650:1: rule__AttributeOption__Group_2__3__Impl : ( ( rule__AttributeOption__RelationshipOwnerAssignment_2_3 ) ) ;
    public final void rule__AttributeOption__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4654:1: ( ( ( rule__AttributeOption__RelationshipOwnerAssignment_2_3 ) ) )
            // InternalUIDSL.g:4655:1: ( ( rule__AttributeOption__RelationshipOwnerAssignment_2_3 ) )
            {
            // InternalUIDSL.g:4655:1: ( ( rule__AttributeOption__RelationshipOwnerAssignment_2_3 ) )
            // InternalUIDSL.g:4656:2: ( rule__AttributeOption__RelationshipOwnerAssignment_2_3 )
            {
             before(grammarAccess.getAttributeOptionAccess().getRelationshipOwnerAssignment_2_3()); 
            // InternalUIDSL.g:4657:2: ( rule__AttributeOption__RelationshipOwnerAssignment_2_3 )
            // InternalUIDSL.g:4657:3: rule__AttributeOption__RelationshipOwnerAssignment_2_3
            {
            pushFollow(FOLLOW_2);
            rule__AttributeOption__RelationshipOwnerAssignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getAttributeOptionAccess().getRelationshipOwnerAssignment_2_3()); 

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
    // $ANTLR end "rule__AttributeOption__Group_2__3__Impl"


    // $ANTLR start "rule__AttributeOption__Group_3__0"
    // InternalUIDSL.g:4666:1: rule__AttributeOption__Group_3__0 : rule__AttributeOption__Group_3__0__Impl rule__AttributeOption__Group_3__1 ;
    public final void rule__AttributeOption__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4670:1: ( rule__AttributeOption__Group_3__0__Impl rule__AttributeOption__Group_3__1 )
            // InternalUIDSL.g:4671:2: rule__AttributeOption__Group_3__0__Impl rule__AttributeOption__Group_3__1
            {
            pushFollow(FOLLOW_38);
            rule__AttributeOption__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeOption__Group_3__1();

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
    // $ANTLR end "rule__AttributeOption__Group_3__0"


    // $ANTLR start "rule__AttributeOption__Group_3__0__Impl"
    // InternalUIDSL.g:4678:1: rule__AttributeOption__Group_3__0__Impl : ( () ) ;
    public final void rule__AttributeOption__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4682:1: ( ( () ) )
            // InternalUIDSL.g:4683:1: ( () )
            {
            // InternalUIDSL.g:4683:1: ( () )
            // InternalUIDSL.g:4684:2: ()
            {
             before(grammarAccess.getAttributeOptionAccess().getCardinalityAction_3_0()); 
            // InternalUIDSL.g:4685:2: ()
            // InternalUIDSL.g:4685:3: 
            {
            }

             after(grammarAccess.getAttributeOptionAccess().getCardinalityAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeOption__Group_3__0__Impl"


    // $ANTLR start "rule__AttributeOption__Group_3__1"
    // InternalUIDSL.g:4693:1: rule__AttributeOption__Group_3__1 : rule__AttributeOption__Group_3__1__Impl rule__AttributeOption__Group_3__2 ;
    public final void rule__AttributeOption__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4697:1: ( rule__AttributeOption__Group_3__1__Impl rule__AttributeOption__Group_3__2 )
            // InternalUIDSL.g:4698:2: rule__AttributeOption__Group_3__1__Impl rule__AttributeOption__Group_3__2
            {
            pushFollow(FOLLOW_35);
            rule__AttributeOption__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeOption__Group_3__2();

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
    // $ANTLR end "rule__AttributeOption__Group_3__1"


    // $ANTLR start "rule__AttributeOption__Group_3__1__Impl"
    // InternalUIDSL.g:4705:1: rule__AttributeOption__Group_3__1__Impl : ( 'reverse_cardinality' ) ;
    public final void rule__AttributeOption__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4709:1: ( ( 'reverse_cardinality' ) )
            // InternalUIDSL.g:4710:1: ( 'reverse_cardinality' )
            {
            // InternalUIDSL.g:4710:1: ( 'reverse_cardinality' )
            // InternalUIDSL.g:4711:2: 'reverse_cardinality'
            {
             before(grammarAccess.getAttributeOptionAccess().getReverse_cardinalityKeyword_3_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getAttributeOptionAccess().getReverse_cardinalityKeyword_3_1()); 

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
    // $ANTLR end "rule__AttributeOption__Group_3__1__Impl"


    // $ANTLR start "rule__AttributeOption__Group_3__2"
    // InternalUIDSL.g:4720:1: rule__AttributeOption__Group_3__2 : rule__AttributeOption__Group_3__2__Impl rule__AttributeOption__Group_3__3 ;
    public final void rule__AttributeOption__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4724:1: ( rule__AttributeOption__Group_3__2__Impl rule__AttributeOption__Group_3__3 )
            // InternalUIDSL.g:4725:2: rule__AttributeOption__Group_3__2__Impl rule__AttributeOption__Group_3__3
            {
            pushFollow(FOLLOW_50);
            rule__AttributeOption__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeOption__Group_3__3();

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
    // $ANTLR end "rule__AttributeOption__Group_3__2"


    // $ANTLR start "rule__AttributeOption__Group_3__2__Impl"
    // InternalUIDSL.g:4732:1: rule__AttributeOption__Group_3__2__Impl : ( '=' ) ;
    public final void rule__AttributeOption__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4736:1: ( ( '=' ) )
            // InternalUIDSL.g:4737:1: ( '=' )
            {
            // InternalUIDSL.g:4737:1: ( '=' )
            // InternalUIDSL.g:4738:2: '='
            {
             before(grammarAccess.getAttributeOptionAccess().getEqualsSignKeyword_3_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getAttributeOptionAccess().getEqualsSignKeyword_3_2()); 

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
    // $ANTLR end "rule__AttributeOption__Group_3__2__Impl"


    // $ANTLR start "rule__AttributeOption__Group_3__3"
    // InternalUIDSL.g:4747:1: rule__AttributeOption__Group_3__3 : rule__AttributeOption__Group_3__3__Impl ;
    public final void rule__AttributeOption__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4751:1: ( rule__AttributeOption__Group_3__3__Impl )
            // InternalUIDSL.g:4752:2: rule__AttributeOption__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeOption__Group_3__3__Impl();

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
    // $ANTLR end "rule__AttributeOption__Group_3__3"


    // $ANTLR start "rule__AttributeOption__Group_3__3__Impl"
    // InternalUIDSL.g:4758:1: rule__AttributeOption__Group_3__3__Impl : ( ( rule__AttributeOption__CardAssignment_3_3 ) ) ;
    public final void rule__AttributeOption__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4762:1: ( ( ( rule__AttributeOption__CardAssignment_3_3 ) ) )
            // InternalUIDSL.g:4763:1: ( ( rule__AttributeOption__CardAssignment_3_3 ) )
            {
            // InternalUIDSL.g:4763:1: ( ( rule__AttributeOption__CardAssignment_3_3 ) )
            // InternalUIDSL.g:4764:2: ( rule__AttributeOption__CardAssignment_3_3 )
            {
             before(grammarAccess.getAttributeOptionAccess().getCardAssignment_3_3()); 
            // InternalUIDSL.g:4765:2: ( rule__AttributeOption__CardAssignment_3_3 )
            // InternalUIDSL.g:4765:3: rule__AttributeOption__CardAssignment_3_3
            {
            pushFollow(FOLLOW_2);
            rule__AttributeOption__CardAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getAttributeOptionAccess().getCardAssignment_3_3()); 

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
    // $ANTLR end "rule__AttributeOption__Group_3__3__Impl"


    // $ANTLR start "rule__StaticFieldSelection__Group__0"
    // InternalUIDSL.g:4774:1: rule__StaticFieldSelection__Group__0 : rule__StaticFieldSelection__Group__0__Impl rule__StaticFieldSelection__Group__1 ;
    public final void rule__StaticFieldSelection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4778:1: ( rule__StaticFieldSelection__Group__0__Impl rule__StaticFieldSelection__Group__1 )
            // InternalUIDSL.g:4779:2: rule__StaticFieldSelection__Group__0__Impl rule__StaticFieldSelection__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__StaticFieldSelection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StaticFieldSelection__Group__1();

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
    // $ANTLR end "rule__StaticFieldSelection__Group__0"


    // $ANTLR start "rule__StaticFieldSelection__Group__0__Impl"
    // InternalUIDSL.g:4786:1: rule__StaticFieldSelection__Group__0__Impl : ( ( rule__StaticFieldSelection__ReceiverAssignment_0 ) ) ;
    public final void rule__StaticFieldSelection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4790:1: ( ( ( rule__StaticFieldSelection__ReceiverAssignment_0 ) ) )
            // InternalUIDSL.g:4791:1: ( ( rule__StaticFieldSelection__ReceiverAssignment_0 ) )
            {
            // InternalUIDSL.g:4791:1: ( ( rule__StaticFieldSelection__ReceiverAssignment_0 ) )
            // InternalUIDSL.g:4792:2: ( rule__StaticFieldSelection__ReceiverAssignment_0 )
            {
             before(grammarAccess.getStaticFieldSelectionAccess().getReceiverAssignment_0()); 
            // InternalUIDSL.g:4793:2: ( rule__StaticFieldSelection__ReceiverAssignment_0 )
            // InternalUIDSL.g:4793:3: rule__StaticFieldSelection__ReceiverAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__StaticFieldSelection__ReceiverAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStaticFieldSelectionAccess().getReceiverAssignment_0()); 

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
    // $ANTLR end "rule__StaticFieldSelection__Group__0__Impl"


    // $ANTLR start "rule__StaticFieldSelection__Group__1"
    // InternalUIDSL.g:4801:1: rule__StaticFieldSelection__Group__1 : rule__StaticFieldSelection__Group__1__Impl rule__StaticFieldSelection__Group__2 ;
    public final void rule__StaticFieldSelection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4805:1: ( rule__StaticFieldSelection__Group__1__Impl rule__StaticFieldSelection__Group__2 )
            // InternalUIDSL.g:4806:2: rule__StaticFieldSelection__Group__1__Impl rule__StaticFieldSelection__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__StaticFieldSelection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StaticFieldSelection__Group__2();

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
    // $ANTLR end "rule__StaticFieldSelection__Group__1"


    // $ANTLR start "rule__StaticFieldSelection__Group__1__Impl"
    // InternalUIDSL.g:4813:1: rule__StaticFieldSelection__Group__1__Impl : ( '.' ) ;
    public final void rule__StaticFieldSelection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4817:1: ( ( '.' ) )
            // InternalUIDSL.g:4818:1: ( '.' )
            {
            // InternalUIDSL.g:4818:1: ( '.' )
            // InternalUIDSL.g:4819:2: '.'
            {
             before(grammarAccess.getStaticFieldSelectionAccess().getFullStopKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getStaticFieldSelectionAccess().getFullStopKeyword_1()); 

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
    // $ANTLR end "rule__StaticFieldSelection__Group__1__Impl"


    // $ANTLR start "rule__StaticFieldSelection__Group__2"
    // InternalUIDSL.g:4828:1: rule__StaticFieldSelection__Group__2 : rule__StaticFieldSelection__Group__2__Impl ;
    public final void rule__StaticFieldSelection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4832:1: ( rule__StaticFieldSelection__Group__2__Impl )
            // InternalUIDSL.g:4833:2: rule__StaticFieldSelection__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StaticFieldSelection__Group__2__Impl();

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
    // $ANTLR end "rule__StaticFieldSelection__Group__2"


    // $ANTLR start "rule__StaticFieldSelection__Group__2__Impl"
    // InternalUIDSL.g:4839:1: rule__StaticFieldSelection__Group__2__Impl : ( ( rule__StaticFieldSelection__MemberAssignment_2 ) ) ;
    public final void rule__StaticFieldSelection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4843:1: ( ( ( rule__StaticFieldSelection__MemberAssignment_2 ) ) )
            // InternalUIDSL.g:4844:1: ( ( rule__StaticFieldSelection__MemberAssignment_2 ) )
            {
            // InternalUIDSL.g:4844:1: ( ( rule__StaticFieldSelection__MemberAssignment_2 ) )
            // InternalUIDSL.g:4845:2: ( rule__StaticFieldSelection__MemberAssignment_2 )
            {
             before(grammarAccess.getStaticFieldSelectionAccess().getMemberAssignment_2()); 
            // InternalUIDSL.g:4846:2: ( rule__StaticFieldSelection__MemberAssignment_2 )
            // InternalUIDSL.g:4846:3: rule__StaticFieldSelection__MemberAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__StaticFieldSelection__MemberAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStaticFieldSelectionAccess().getMemberAssignment_2()); 

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
    // $ANTLR end "rule__StaticFieldSelection__Group__2__Impl"


    // $ANTLR start "rule__UIModel__ConceptsAssignment"
    // InternalUIDSL.g:4855:1: rule__UIModel__ConceptsAssignment : ( ruleUIConcept ) ;
    public final void rule__UIModel__ConceptsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4859:1: ( ( ruleUIConcept ) )
            // InternalUIDSL.g:4860:2: ( ruleUIConcept )
            {
            // InternalUIDSL.g:4860:2: ( ruleUIConcept )
            // InternalUIDSL.g:4861:3: ruleUIConcept
            {
             before(grammarAccess.getUIModelAccess().getConceptsUIConceptParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleUIConcept();

            state._fsp--;

             after(grammarAccess.getUIModelAccess().getConceptsUIConceptParserRuleCall_0()); 

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
    // $ANTLR end "rule__UIModel__ConceptsAssignment"


    // $ANTLR start "rule__ServerComponent__NameAssignment_1"
    // InternalUIDSL.g:4870:1: rule__ServerComponent__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ServerComponent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4874:1: ( ( RULE_ID ) )
            // InternalUIDSL.g:4875:2: ( RULE_ID )
            {
            // InternalUIDSL.g:4875:2: ( RULE_ID )
            // InternalUIDSL.g:4876:3: RULE_ID
            {
             before(grammarAccess.getServerComponentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getServerComponentAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ServerComponent__NameAssignment_1"


    // $ANTLR start "rule__ServerComponent__MembersAssignment_3"
    // InternalUIDSL.g:4885:1: rule__ServerComponent__MembersAssignment_3 : ( ruleMember ) ;
    public final void rule__ServerComponent__MembersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4889:1: ( ( ruleMember ) )
            // InternalUIDSL.g:4890:2: ( ruleMember )
            {
            // InternalUIDSL.g:4890:2: ( ruleMember )
            // InternalUIDSL.g:4891:3: ruleMember
            {
             before(grammarAccess.getServerComponentAccess().getMembersMemberParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getServerComponentAccess().getMembersMemberParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ServerComponent__MembersAssignment_3"


    // $ANTLR start "rule__ServerComponent__ExpressionsAssignment_4"
    // InternalUIDSL.g:4900:1: rule__ServerComponent__ExpressionsAssignment_4 : ( ruleExpression ) ;
    public final void rule__ServerComponent__ExpressionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4904:1: ( ( ruleExpression ) )
            // InternalUIDSL.g:4905:2: ( ruleExpression )
            {
            // InternalUIDSL.g:4905:2: ( ruleExpression )
            // InternalUIDSL.g:4906:3: ruleExpression
            {
             before(grammarAccess.getServerComponentAccess().getExpressionsExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getServerComponentAccess().getExpressionsExpressionParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__ServerComponent__ExpressionsAssignment_4"


    // $ANTLR start "rule__Method__ParamsAssignment_2"
    // InternalUIDSL.g:4915:1: rule__Method__ParamsAssignment_2 : ( ruleVariable ) ;
    public final void rule__Method__ParamsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4919:1: ( ( ruleVariable ) )
            // InternalUIDSL.g:4920:2: ( ruleVariable )
            {
            // InternalUIDSL.g:4920:2: ( ruleVariable )
            // InternalUIDSL.g:4921:3: ruleVariable
            {
             before(grammarAccess.getMethodAccess().getParamsVariableParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getParamsVariableParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Method__ParamsAssignment_2"


    // $ANTLR start "rule__Method__ParamsAssignment_3_1"
    // InternalUIDSL.g:4930:1: rule__Method__ParamsAssignment_3_1 : ( ruleVariable ) ;
    public final void rule__Method__ParamsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4934:1: ( ( ruleVariable ) )
            // InternalUIDSL.g:4935:2: ( ruleVariable )
            {
            // InternalUIDSL.g:4935:2: ( ruleVariable )
            // InternalUIDSL.g:4936:3: ruleVariable
            {
             before(grammarAccess.getMethodAccess().getParamsVariableParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getParamsVariableParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Method__ParamsAssignment_3_1"


    // $ANTLR start "rule__TypedConcept__TypeAssignment_0"
    // InternalUIDSL.g:4945:1: rule__TypedConcept__TypeAssignment_0 : ( ruleAttributeType ) ;
    public final void rule__TypedConcept__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4949:1: ( ( ruleAttributeType ) )
            // InternalUIDSL.g:4950:2: ( ruleAttributeType )
            {
            // InternalUIDSL.g:4950:2: ( ruleAttributeType )
            // InternalUIDSL.g:4951:3: ruleAttributeType
            {
             before(grammarAccess.getTypedConceptAccess().getTypeAttributeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeType();

            state._fsp--;

             after(grammarAccess.getTypedConceptAccess().getTypeAttributeTypeParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__TypedConcept__TypeAssignment_0"


    // $ANTLR start "rule__TypedConcept__NameAssignment_1"
    // InternalUIDSL.g:4960:1: rule__TypedConcept__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TypedConcept__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4964:1: ( ( RULE_ID ) )
            // InternalUIDSL.g:4965:2: ( RULE_ID )
            {
            // InternalUIDSL.g:4965:2: ( RULE_ID )
            // InternalUIDSL.g:4966:3: RULE_ID
            {
             before(grammarAccess.getTypedConceptAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypedConceptAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__TypedConcept__NameAssignment_1"


    // $ANTLR start "rule__Page__NameAssignment_1"
    // InternalUIDSL.g:4975:1: rule__Page__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Page__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4979:1: ( ( RULE_ID ) )
            // InternalUIDSL.g:4980:2: ( RULE_ID )
            {
            // InternalUIDSL.g:4980:2: ( RULE_ID )
            // InternalUIDSL.g:4981:3: RULE_ID
            {
             before(grammarAccess.getPageAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Page__NameAssignment_1"


    // $ANTLR start "rule__Template__NameAssignment_1"
    // InternalUIDSL.g:4990:1: rule__Template__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Template__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:4994:1: ( ( RULE_ID ) )
            // InternalUIDSL.g:4995:2: ( RULE_ID )
            {
            // InternalUIDSL.g:4995:2: ( RULE_ID )
            // InternalUIDSL.g:4996:3: RULE_ID
            {
             before(grammarAccess.getTemplateAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTemplateAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Template__NameAssignment_1"


    // $ANTLR start "rule__Fragment__NameAssignment_1"
    // InternalUIDSL.g:5005:1: rule__Fragment__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Fragment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:5009:1: ( ( RULE_ID ) )
            // InternalUIDSL.g:5010:2: ( RULE_ID )
            {
            // InternalUIDSL.g:5010:2: ( RULE_ID )
            // InternalUIDSL.g:5011:3: RULE_ID
            {
             before(grammarAccess.getFragmentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFragmentAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Fragment__NameAssignment_1"


    // $ANTLR start "rule__MemberSelectionExpression__MemberAssignment_1_2"
    // InternalUIDSL.g:5020:1: rule__MemberSelectionExpression__MemberAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__MemberSelectionExpression__MemberAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:5024:1: ( ( ( RULE_ID ) ) )
            // InternalUIDSL.g:5025:2: ( ( RULE_ID ) )
            {
            // InternalUIDSL.g:5025:2: ( ( RULE_ID ) )
            // InternalUIDSL.g:5026:3: ( RULE_ID )
            {
             before(grammarAccess.getMemberSelectionExpressionAccess().getMemberSelectionMemberCrossReference_1_2_0()); 
            // InternalUIDSL.g:5027:3: ( RULE_ID )
            // InternalUIDSL.g:5028:4: RULE_ID
            {
             before(grammarAccess.getMemberSelectionExpressionAccess().getMemberSelectionMemberIDTerminalRuleCall_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMemberSelectionExpressionAccess().getMemberSelectionMemberIDTerminalRuleCall_1_2_0_1()); 

            }

             after(grammarAccess.getMemberSelectionExpressionAccess().getMemberSelectionMemberCrossReference_1_2_0()); 

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


    // $ANTLR start "rule__MemberSelectionExpression__IsMethodAssignment_1_3_0"
    // InternalUIDSL.g:5039:1: rule__MemberSelectionExpression__IsMethodAssignment_1_3_0 : ( ( '(' ) ) ;
    public final void rule__MemberSelectionExpression__IsMethodAssignment_1_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:5043:1: ( ( ( '(' ) ) )
            // InternalUIDSL.g:5044:2: ( ( '(' ) )
            {
            // InternalUIDSL.g:5044:2: ( ( '(' ) )
            // InternalUIDSL.g:5045:3: ( '(' )
            {
             before(grammarAccess.getMemberSelectionExpressionAccess().getIsMethodLeftParenthesisKeyword_1_3_0_0()); 
            // InternalUIDSL.g:5046:3: ( '(' )
            // InternalUIDSL.g:5047:4: '('
            {
             before(grammarAccess.getMemberSelectionExpressionAccess().getIsMethodLeftParenthesisKeyword_1_3_0_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMemberSelectionExpressionAccess().getIsMethodLeftParenthesisKeyword_1_3_0_0()); 

            }

             after(grammarAccess.getMemberSelectionExpressionAccess().getIsMethodLeftParenthesisKeyword_1_3_0_0()); 

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
    // $ANTLR end "rule__MemberSelectionExpression__IsMethodAssignment_1_3_0"


    // $ANTLR start "rule__MemberSelectionExpression__ParamsAssignment_1_3_1_0"
    // InternalUIDSL.g:5058:1: rule__MemberSelectionExpression__ParamsAssignment_1_3_1_0 : ( ruleExpression ) ;
    public final void rule__MemberSelectionExpression__ParamsAssignment_1_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:5062:1: ( ( ruleExpression ) )
            // InternalUIDSL.g:5063:2: ( ruleExpression )
            {
            // InternalUIDSL.g:5063:2: ( ruleExpression )
            // InternalUIDSL.g:5064:3: ruleExpression
            {
             before(grammarAccess.getMemberSelectionExpressionAccess().getParamsExpressionParserRuleCall_1_3_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getMemberSelectionExpressionAccess().getParamsExpressionParserRuleCall_1_3_1_0_0()); 

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
    // $ANTLR end "rule__MemberSelectionExpression__ParamsAssignment_1_3_1_0"


    // $ANTLR start "rule__MemberSelectionExpression__ParamsAssignment_1_3_1_1_1"
    // InternalUIDSL.g:5073:1: rule__MemberSelectionExpression__ParamsAssignment_1_3_1_1_1 : ( ruleExpression ) ;
    public final void rule__MemberSelectionExpression__ParamsAssignment_1_3_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:5077:1: ( ( ruleExpression ) )
            // InternalUIDSL.g:5078:2: ( ruleExpression )
            {
            // InternalUIDSL.g:5078:2: ( ruleExpression )
            // InternalUIDSL.g:5079:3: ruleExpression
            {
             before(grammarAccess.getMemberSelectionExpressionAccess().getParamsExpressionParserRuleCall_1_3_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getMemberSelectionExpressionAccess().getParamsExpressionParserRuleCall_1_3_1_1_1_0()); 

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
    // $ANTLR end "rule__MemberSelectionExpression__ParamsAssignment_1_3_1_1_1"


    // $ANTLR start "rule__AtomExpression__RefAssignment_1_1"
    // InternalUIDSL.g:5088:1: rule__AtomExpression__RefAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__AtomExpression__RefAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:5092:1: ( ( ( RULE_ID ) ) )
            // InternalUIDSL.g:5093:2: ( ( RULE_ID ) )
            {
            // InternalUIDSL.g:5093:2: ( ( RULE_ID ) )
            // InternalUIDSL.g:5094:3: ( RULE_ID )
            {
             before(grammarAccess.getAtomExpressionAccess().getRefVariableCrossReference_1_1_0()); 
            // InternalUIDSL.g:5095:3: ( RULE_ID )
            // InternalUIDSL.g:5096:4: RULE_ID
            {
             before(grammarAccess.getAtomExpressionAccess().getRefVariableIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAtomExpressionAccess().getRefVariableIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getAtomExpressionAccess().getRefVariableCrossReference_1_1_0()); 

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
    // $ANTLR end "rule__AtomExpression__RefAssignment_1_1"


    // $ANTLR start "rule__DTOClass__NameAssignment_1"
    // InternalUIDSL.g:5107:1: rule__DTOClass__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DTOClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:5111:1: ( ( RULE_ID ) )
            // InternalUIDSL.g:5112:2: ( RULE_ID )
            {
            // InternalUIDSL.g:5112:2: ( RULE_ID )
            // InternalUIDSL.g:5113:3: RULE_ID
            {
             before(grammarAccess.getDTOClassAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDTOClassAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__DTOClass__NameAssignment_1"


    // $ANTLR start "rule__DTOClass__SuperTypeAssignment_2_1"
    // InternalUIDSL.g:5122:1: rule__DTOClass__SuperTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__DTOClass__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:5126:1: ( ( ( RULE_ID ) ) )
            // InternalUIDSL.g:5127:2: ( ( RULE_ID ) )
            {
            // InternalUIDSL.g:5127:2: ( ( RULE_ID ) )
            // InternalUIDSL.g:5128:3: ( RULE_ID )
            {
             before(grammarAccess.getDTOClassAccess().getSuperTypeDTOClassCrossReference_2_1_0()); 
            // InternalUIDSL.g:5129:3: ( RULE_ID )
            // InternalUIDSL.g:5130:4: RULE_ID
            {
             before(grammarAccess.getDTOClassAccess().getSuperTypeDTOClassIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDTOClassAccess().getSuperTypeDTOClassIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getDTOClassAccess().getSuperTypeDTOClassCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__DTOClass__SuperTypeAssignment_2_1"


    // $ANTLR start "rule__DTOClass__AttributesAssignment_4"
    // InternalUIDSL.g:5141:1: rule__DTOClass__AttributesAssignment_4 : ( ruleAttribute ) ;
    public final void rule__DTOClass__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:5145:1: ( ( ruleAttribute ) )
            // InternalUIDSL.g:5146:2: ( ruleAttribute )
            {
            // InternalUIDSL.g:5146:2: ( ruleAttribute )
            // InternalUIDSL.g:5147:3: ruleAttribute
            {
             before(grammarAccess.getDTOClassAccess().getAttributesAttributeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getDTOClassAccess().getAttributesAttributeParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__DTOClass__AttributesAssignment_4"


    // $ANTLR start "rule__Enum__NameAssignment_1"
    // InternalUIDSL.g:5156:1: rule__Enum__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Enum__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:5160:1: ( ( RULE_ID ) )
            // InternalUIDSL.g:5161:2: ( RULE_ID )
            {
            // InternalUIDSL.g:5161:2: ( RULE_ID )
            // InternalUIDSL.g:5162:3: RULE_ID
            {
             before(grammarAccess.getEnumAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnumAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Enum__NameAssignment_1"


    // $ANTLR start "rule__Enum__AttributesAssignment_3"
    // InternalUIDSL.g:5171:1: rule__Enum__AttributesAssignment_3 : ( ruleAttribute ) ;
    public final void rule__Enum__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:5175:1: ( ( ruleAttribute ) )
            // InternalUIDSL.g:5176:2: ( ruleAttribute )
            {
            // InternalUIDSL.g:5176:2: ( ruleAttribute )
            // InternalUIDSL.g:5177:3: ruleAttribute
            {
             before(grammarAccess.getEnumAccess().getAttributesAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getEnumAccess().getAttributesAttributeParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Enum__AttributesAssignment_3"


    // $ANTLR start "rule__Enum__LiteralsAssignment_4"
    // InternalUIDSL.g:5186:1: rule__Enum__LiteralsAssignment_4 : ( ruleEnumLiteral ) ;
    public final void rule__Enum__LiteralsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:5190:1: ( ( ruleEnumLiteral ) )
            // InternalUIDSL.g:5191:2: ( ruleEnumLiteral )
            {
            // InternalUIDSL.g:5191:2: ( ruleEnumLiteral )
            // InternalUIDSL.g:5192:3: ruleEnumLiteral
            {
             before(grammarAccess.getEnumAccess().getLiteralsEnumLiteralParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumLiteral();

            state._fsp--;

             after(grammarAccess.getEnumAccess().getLiteralsEnumLiteralParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Enum__LiteralsAssignment_4"


    // $ANTLR start "rule__EnumLiteral__NameAssignment_0"
    // InternalUIDSL.g:5201:1: rule__EnumLiteral__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumLiteral__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:5205:1: ( ( RULE_ID ) )
            // InternalUIDSL.g:5206:2: ( RULE_ID )
            {
            // InternalUIDSL.g:5206:2: ( RULE_ID )
            // InternalUIDSL.g:5207:3: RULE_ID
            {
             before(grammarAccess.getEnumLiteralAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnumLiteralAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__EnumLiteral__NameAssignment_0"


    // $ANTLR start "rule__EnumLiteral__ParamsAssignment_1_1"
    // InternalUIDSL.g:5216:1: rule__EnumLiteral__ParamsAssignment_1_1 : ( ruleConstant ) ;
    public final void rule__EnumLiteral__ParamsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:5220:1: ( ( ruleConstant ) )
            // InternalUIDSL.g:5221:2: ( ruleConstant )
            {
            // InternalUIDSL.g:5221:2: ( ruleConstant )
            // InternalUIDSL.g:5222:3: ruleConstant
            {
             before(grammarAccess.getEnumLiteralAccess().getParamsConstantParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getEnumLiteralAccess().getParamsConstantParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__EnumLiteral__ParamsAssignment_1_1"


    // $ANTLR start "rule__EnumLiteral__ParamsAssignment_1_2_1"
    // InternalUIDSL.g:5231:1: rule__EnumLiteral__ParamsAssignment_1_2_1 : ( ruleConstant ) ;
    public final void rule__EnumLiteral__ParamsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:5235:1: ( ( ruleConstant ) )
            // InternalUIDSL.g:5236:2: ( ruleConstant )
            {
            // InternalUIDSL.g:5236:2: ( ruleConstant )
            // InternalUIDSL.g:5237:3: ruleConstant
            {
             before(grammarAccess.getEnumLiteralAccess().getParamsConstantParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getEnumLiteralAccess().getParamsConstantParserRuleCall_1_2_1_0()); 

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
    // $ANTLR end "rule__EnumLiteral__ParamsAssignment_1_2_1"


    // $ANTLR start "rule__Constant__ValueAssignment_0_1"
    // InternalUIDSL.g:5246:1: rule__Constant__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Constant__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:5250:1: ( ( RULE_INT ) )
            // InternalUIDSL.g:5251:2: ( RULE_INT )
            {
            // InternalUIDSL.g:5251:2: ( RULE_INT )
            // InternalUIDSL.g:5252:3: RULE_INT
            {
             before(grammarAccess.getConstantAccess().getValueINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getValueINTTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Constant__ValueAssignment_0_1"


    // $ANTLR start "rule__Constant__ValueAssignment_1_1"
    // InternalUIDSL.g:5261:1: rule__Constant__ValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Constant__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:5265:1: ( ( RULE_INT ) )
            // InternalUIDSL.g:5266:2: ( RULE_INT )
            {
            // InternalUIDSL.g:5266:2: ( RULE_INT )
            // InternalUIDSL.g:5267:3: RULE_INT
            {
             before(grammarAccess.getConstantAccess().getValueINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getValueINTTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Constant__ValueAssignment_1_1"


    // $ANTLR start "rule__Constant__ValueAssignment_2_1"
    // InternalUIDSL.g:5276:1: rule__Constant__ValueAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Constant__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:5280:1: ( ( RULE_STRING ) )
            // InternalUIDSL.g:5281:2: ( RULE_STRING )
            {
            // InternalUIDSL.g:5281:2: ( RULE_STRING )
            // InternalUIDSL.g:5282:3: RULE_STRING
            {
             before(grammarAccess.getConstantAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Constant__ValueAssignment_2_1"


    // $ANTLR start "rule__Constant__ValueAssignment_3_1"
    // InternalUIDSL.g:5291:1: rule__Constant__ValueAssignment_3_1 : ( ( rule__Constant__ValueAlternatives_3_1_0 ) ) ;
    public final void rule__Constant__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:5295:1: ( ( ( rule__Constant__ValueAlternatives_3_1_0 ) ) )
            // InternalUIDSL.g:5296:2: ( ( rule__Constant__ValueAlternatives_3_1_0 ) )
            {
            // InternalUIDSL.g:5296:2: ( ( rule__Constant__ValueAlternatives_3_1_0 ) )
            // InternalUIDSL.g:5297:3: ( rule__Constant__ValueAlternatives_3_1_0 )
            {
             before(grammarAccess.getConstantAccess().getValueAlternatives_3_1_0()); 
            // InternalUIDSL.g:5298:3: ( rule__Constant__ValueAlternatives_3_1_0 )
            // InternalUIDSL.g:5298:4: rule__Constant__ValueAlternatives_3_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Constant__ValueAlternatives_3_1_0();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getValueAlternatives_3_1_0()); 

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
    // $ANTLR end "rule__Constant__ValueAssignment_3_1"


    // $ANTLR start "rule__Constant__DayAssignment_4_1"
    // InternalUIDSL.g:5306:1: rule__Constant__DayAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__Constant__DayAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:5310:1: ( ( RULE_INT ) )
            // InternalUIDSL.g:5311:2: ( RULE_INT )
            {
            // InternalUIDSL.g:5311:2: ( RULE_INT )
            // InternalUIDSL.g:5312:3: RULE_INT
            {
             before(grammarAccess.getConstantAccess().getDayINTTerminalRuleCall_4_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getDayINTTerminalRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Constant__DayAssignment_4_1"


    // $ANTLR start "rule__Constant__MonthAssignment_4_3"
    // InternalUIDSL.g:5321:1: rule__Constant__MonthAssignment_4_3 : ( RULE_INT ) ;
    public final void rule__Constant__MonthAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:5325:1: ( ( RULE_INT ) )
            // InternalUIDSL.g:5326:2: ( RULE_INT )
            {
            // InternalUIDSL.g:5326:2: ( RULE_INT )
            // InternalUIDSL.g:5327:3: RULE_INT
            {
             before(grammarAccess.getConstantAccess().getMonthINTTerminalRuleCall_4_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getMonthINTTerminalRuleCall_4_3_0()); 

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
    // $ANTLR end "rule__Constant__MonthAssignment_4_3"


    // $ANTLR start "rule__Constant__YearAssignment_4_5"
    // InternalUIDSL.g:5336:1: rule__Constant__YearAssignment_4_5 : ( RULE_INT ) ;
    public final void rule__Constant__YearAssignment_4_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:5340:1: ( ( RULE_INT ) )
            // InternalUIDSL.g:5341:2: ( RULE_INT )
            {
            // InternalUIDSL.g:5341:2: ( RULE_INT )
            // InternalUIDSL.g:5342:3: RULE_INT
            {
             before(grammarAccess.getConstantAccess().getYearINTTerminalRuleCall_4_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getYearINTTerminalRuleCall_4_5_0()); 

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
    // $ANTLR end "rule__Constant__YearAssignment_4_5"


    // $ANTLR start "rule__EntityOption__DeleteByFlagAssignment_0_1"
    // InternalUIDSL.g:5351:1: rule__EntityOption__DeleteByFlagAssignment_0_1 : ( ( 'deleteByFlag' ) ) ;
    public final void rule__EntityOption__DeleteByFlagAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:5355:1: ( ( ( 'deleteByFlag' ) ) )
            // InternalUIDSL.g:5356:2: ( ( 'deleteByFlag' ) )
            {
            // InternalUIDSL.g:5356:2: ( ( 'deleteByFlag' ) )
            // InternalUIDSL.g:5357:3: ( 'deleteByFlag' )
            {
             before(grammarAccess.getEntityOptionAccess().getDeleteByFlagDeleteByFlagKeyword_0_1_0()); 
            // InternalUIDSL.g:5358:3: ( 'deleteByFlag' )
            // InternalUIDSL.g:5359:4: 'deleteByFlag'
            {
             before(grammarAccess.getEntityOptionAccess().getDeleteByFlagDeleteByFlagKeyword_0_1_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getEntityOptionAccess().getDeleteByFlagDeleteByFlagKeyword_0_1_0()); 

            }

             after(grammarAccess.getEntityOptionAccess().getDeleteByFlagDeleteByFlagKeyword_0_1_0()); 

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
    // $ANTLR end "rule__EntityOption__DeleteByFlagAssignment_0_1"


    // $ANTLR start "rule__EntityOption__InheritanceMappingAssignment_1_3"
    // InternalUIDSL.g:5370:1: rule__EntityOption__InheritanceMappingAssignment_1_3 : ( ruleInheritanceMappingType ) ;
    public final void rule__EntityOption__InheritanceMappingAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:5374:1: ( ( ruleInheritanceMappingType ) )
            // InternalUIDSL.g:5375:2: ( ruleInheritanceMappingType )
            {
            // InternalUIDSL.g:5375:2: ( ruleInheritanceMappingType )
            // InternalUIDSL.g:5376:3: ruleInheritanceMappingType
            {
             before(grammarAccess.getEntityOptionAccess().getInheritanceMappingInheritanceMappingTypeParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleInheritanceMappingType();

            state._fsp--;

             after(grammarAccess.getEntityOptionAccess().getInheritanceMappingInheritanceMappingTypeParserRuleCall_1_3_0()); 

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
    // $ANTLR end "rule__EntityOption__InheritanceMappingAssignment_1_3"


    // $ANTLR start "rule__InheritanceMappingType__TypeAssignment"
    // InternalUIDSL.g:5385:1: rule__InheritanceMappingType__TypeAssignment : ( ( rule__InheritanceMappingType__TypeAlternatives_0 ) ) ;
    public final void rule__InheritanceMappingType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:5389:1: ( ( ( rule__InheritanceMappingType__TypeAlternatives_0 ) ) )
            // InternalUIDSL.g:5390:2: ( ( rule__InheritanceMappingType__TypeAlternatives_0 ) )
            {
            // InternalUIDSL.g:5390:2: ( ( rule__InheritanceMappingType__TypeAlternatives_0 ) )
            // InternalUIDSL.g:5391:3: ( rule__InheritanceMappingType__TypeAlternatives_0 )
            {
             before(grammarAccess.getInheritanceMappingTypeAccess().getTypeAlternatives_0()); 
            // InternalUIDSL.g:5392:3: ( rule__InheritanceMappingType__TypeAlternatives_0 )
            // InternalUIDSL.g:5392:4: rule__InheritanceMappingType__TypeAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__InheritanceMappingType__TypeAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getInheritanceMappingTypeAccess().getTypeAlternatives_0()); 

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
    // $ANTLR end "rule__InheritanceMappingType__TypeAssignment"


    // $ANTLR start "rule__Attribute__TypeAssignment_0"
    // InternalUIDSL.g:5400:1: rule__Attribute__TypeAssignment_0 : ( ruleAttributeType ) ;
    public final void rule__Attribute__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:5404:1: ( ( ruleAttributeType ) )
            // InternalUIDSL.g:5405:2: ( ruleAttributeType )
            {
            // InternalUIDSL.g:5405:2: ( ruleAttributeType )
            // InternalUIDSL.g:5406:3: ruleAttributeType
            {
             before(grammarAccess.getAttributeAccess().getTypeAttributeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeType();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeAttributeTypeParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Attribute__TypeAssignment_0"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // InternalUIDSL.g:5415:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:5419:1: ( ( RULE_ID ) )
            // InternalUIDSL.g:5420:2: ( RULE_ID )
            {
            // InternalUIDSL.g:5420:2: ( RULE_ID )
            // InternalUIDSL.g:5421:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Attribute__NameAssignment_1"


    // $ANTLR start "rule__Attribute__OptionsAssignment_2_0"
    // InternalUIDSL.g:5430:1: rule__Attribute__OptionsAssignment_2_0 : ( ruleAttributeOption ) ;
    public final void rule__Attribute__OptionsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:5434:1: ( ( ruleAttributeOption ) )
            // InternalUIDSL.g:5435:2: ( ruleAttributeOption )
            {
            // InternalUIDSL.g:5435:2: ( ruleAttributeOption )
            // InternalUIDSL.g:5436:3: ruleAttributeOption
            {
             before(grammarAccess.getAttributeAccess().getOptionsAttributeOptionParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeOption();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getOptionsAttributeOptionParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__Attribute__OptionsAssignment_2_0"


    // $ANTLR start "rule__Attribute__OptionsAssignment_2_1_1"
    // InternalUIDSL.g:5445:1: rule__Attribute__OptionsAssignment_2_1_1 : ( ruleAttributeOption ) ;
    public final void rule__Attribute__OptionsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:5449:1: ( ( ruleAttributeOption ) )
            // InternalUIDSL.g:5450:2: ( ruleAttributeOption )
            {
            // InternalUIDSL.g:5450:2: ( ruleAttributeOption )
            // InternalUIDSL.g:5451:3: ruleAttributeOption
            {
             before(grammarAccess.getAttributeAccess().getOptionsAttributeOptionParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeOption();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getOptionsAttributeOptionParserRuleCall_2_1_1_0()); 

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
    // $ANTLR end "rule__Attribute__OptionsAssignment_2_1_1"


    // $ANTLR start "rule__RefType__ReferenceAssignment"
    // InternalUIDSL.g:5460:1: rule__RefType__ReferenceAssignment : ( ( RULE_ID ) ) ;
    public final void rule__RefType__ReferenceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:5464:1: ( ( ( RULE_ID ) ) )
            // InternalUIDSL.g:5465:2: ( ( RULE_ID ) )
            {
            // InternalUIDSL.g:5465:2: ( ( RULE_ID ) )
            // InternalUIDSL.g:5466:3: ( RULE_ID )
            {
             before(grammarAccess.getRefTypeAccess().getReferenceConceptCrossReference_0()); 
            // InternalUIDSL.g:5467:3: ( RULE_ID )
            // InternalUIDSL.g:5468:4: RULE_ID
            {
             before(grammarAccess.getRefTypeAccess().getReferenceConceptIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRefTypeAccess().getReferenceConceptIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getRefTypeAccess().getReferenceConceptCrossReference_0()); 

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
    // $ANTLR end "rule__RefType__ReferenceAssignment"


    // $ANTLR start "rule__CollectionType__OfTypeAssignment_2"
    // InternalUIDSL.g:5479:1: rule__CollectionType__OfTypeAssignment_2 : ( ruleSingleType ) ;
    public final void rule__CollectionType__OfTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:5483:1: ( ( ruleSingleType ) )
            // InternalUIDSL.g:5484:2: ( ruleSingleType )
            {
            // InternalUIDSL.g:5484:2: ( ruleSingleType )
            // InternalUIDSL.g:5485:3: ruleSingleType
            {
             before(grammarAccess.getCollectionTypeAccess().getOfTypeSingleTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSingleType();

            state._fsp--;

             after(grammarAccess.getCollectionTypeAccess().getOfTypeSingleTypeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__CollectionType__OfTypeAssignment_2"


    // $ANTLR start "rule__AttributeOption__RequiredAssignment_0_1"
    // InternalUIDSL.g:5494:1: rule__AttributeOption__RequiredAssignment_0_1 : ( ( 'required' ) ) ;
    public final void rule__AttributeOption__RequiredAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:5498:1: ( ( ( 'required' ) ) )
            // InternalUIDSL.g:5499:2: ( ( 'required' ) )
            {
            // InternalUIDSL.g:5499:2: ( ( 'required' ) )
            // InternalUIDSL.g:5500:3: ( 'required' )
            {
             before(grammarAccess.getAttributeOptionAccess().getRequiredRequiredKeyword_0_1_0()); 
            // InternalUIDSL.g:5501:3: ( 'required' )
            // InternalUIDSL.g:5502:4: 'required'
            {
             before(grammarAccess.getAttributeOptionAccess().getRequiredRequiredKeyword_0_1_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getAttributeOptionAccess().getRequiredRequiredKeyword_0_1_0()); 

            }

             after(grammarAccess.getAttributeOptionAccess().getRequiredRequiredKeyword_0_1_0()); 

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
    // $ANTLR end "rule__AttributeOption__RequiredAssignment_0_1"


    // $ANTLR start "rule__AttributeOption__PartOfAssignment_1_1"
    // InternalUIDSL.g:5513:1: rule__AttributeOption__PartOfAssignment_1_1 : ( ( 'partOf' ) ) ;
    public final void rule__AttributeOption__PartOfAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:5517:1: ( ( ( 'partOf' ) ) )
            // InternalUIDSL.g:5518:2: ( ( 'partOf' ) )
            {
            // InternalUIDSL.g:5518:2: ( ( 'partOf' ) )
            // InternalUIDSL.g:5519:3: ( 'partOf' )
            {
             before(grammarAccess.getAttributeOptionAccess().getPartOfPartOfKeyword_1_1_0()); 
            // InternalUIDSL.g:5520:3: ( 'partOf' )
            // InternalUIDSL.g:5521:4: 'partOf'
            {
             before(grammarAccess.getAttributeOptionAccess().getPartOfPartOfKeyword_1_1_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getAttributeOptionAccess().getPartOfPartOfKeyword_1_1_0()); 

            }

             after(grammarAccess.getAttributeOptionAccess().getPartOfPartOfKeyword_1_1_0()); 

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
    // $ANTLR end "rule__AttributeOption__PartOfAssignment_1_1"


    // $ANTLR start "rule__AttributeOption__RelationshipOwnerAssignment_2_3"
    // InternalUIDSL.g:5532:1: rule__AttributeOption__RelationshipOwnerAssignment_2_3 : ( ruleStaticFieldSelection ) ;
    public final void rule__AttributeOption__RelationshipOwnerAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:5536:1: ( ( ruleStaticFieldSelection ) )
            // InternalUIDSL.g:5537:2: ( ruleStaticFieldSelection )
            {
            // InternalUIDSL.g:5537:2: ( ruleStaticFieldSelection )
            // InternalUIDSL.g:5538:3: ruleStaticFieldSelection
            {
             before(grammarAccess.getAttributeOptionAccess().getRelationshipOwnerStaticFieldSelectionParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStaticFieldSelection();

            state._fsp--;

             after(grammarAccess.getAttributeOptionAccess().getRelationshipOwnerStaticFieldSelectionParserRuleCall_2_3_0()); 

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
    // $ANTLR end "rule__AttributeOption__RelationshipOwnerAssignment_2_3"


    // $ANTLR start "rule__AttributeOption__CardAssignment_3_3"
    // InternalUIDSL.g:5547:1: rule__AttributeOption__CardAssignment_3_3 : ( ruleCardinalityType ) ;
    public final void rule__AttributeOption__CardAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:5551:1: ( ( ruleCardinalityType ) )
            // InternalUIDSL.g:5552:2: ( ruleCardinalityType )
            {
            // InternalUIDSL.g:5552:2: ( ruleCardinalityType )
            // InternalUIDSL.g:5553:3: ruleCardinalityType
            {
             before(grammarAccess.getAttributeOptionAccess().getCardCardinalityTypeEnumRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCardinalityType();

            state._fsp--;

             after(grammarAccess.getAttributeOptionAccess().getCardCardinalityTypeEnumRuleCall_3_3_0()); 

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
    // $ANTLR end "rule__AttributeOption__CardAssignment_3_3"


    // $ANTLR start "rule__StaticFieldSelection__ReceiverAssignment_0"
    // InternalUIDSL.g:5562:1: rule__StaticFieldSelection__ReceiverAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__StaticFieldSelection__ReceiverAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:5566:1: ( ( ( RULE_ID ) ) )
            // InternalUIDSL.g:5567:2: ( ( RULE_ID ) )
            {
            // InternalUIDSL.g:5567:2: ( ( RULE_ID ) )
            // InternalUIDSL.g:5568:3: ( RULE_ID )
            {
             before(grammarAccess.getStaticFieldSelectionAccess().getReceiverEntityCrossReference_0_0()); 
            // InternalUIDSL.g:5569:3: ( RULE_ID )
            // InternalUIDSL.g:5570:4: RULE_ID
            {
             before(grammarAccess.getStaticFieldSelectionAccess().getReceiverEntityIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStaticFieldSelectionAccess().getReceiverEntityIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getStaticFieldSelectionAccess().getReceiverEntityCrossReference_0_0()); 

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
    // $ANTLR end "rule__StaticFieldSelection__ReceiverAssignment_0"


    // $ANTLR start "rule__StaticFieldSelection__MemberAssignment_2"
    // InternalUIDSL.g:5581:1: rule__StaticFieldSelection__MemberAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__StaticFieldSelection__MemberAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUIDSL.g:5585:1: ( ( ( RULE_ID ) ) )
            // InternalUIDSL.g:5586:2: ( ( RULE_ID ) )
            {
            // InternalUIDSL.g:5586:2: ( ( RULE_ID ) )
            // InternalUIDSL.g:5587:3: ( RULE_ID )
            {
             before(grammarAccess.getStaticFieldSelectionAccess().getMemberAttributeCrossReference_2_0()); 
            // InternalUIDSL.g:5588:3: ( RULE_ID )
            // InternalUIDSL.g:5589:4: RULE_ID
            {
             before(grammarAccess.getStaticFieldSelectionAccess().getMemberAttributeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStaticFieldSelectionAccess().getMemberAttributeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getStaticFieldSelectionAccess().getMemberAttributeCrossReference_2_0()); 

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
    // $ANTLR end "rule__StaticFieldSelection__MemberAssignment_2"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\35\uffff";
    static final String dfa_2s = "\14\4\1\60\1\25\1\4\2\uffff\13\61\1\4";
    static final String dfa_3s = "\1\57\13\4\1\60\1\26\1\56\2\uffff\13\61\1\4";
    static final String dfa_4s = "\17\uffff\1\1\1\2\14\uffff";
    static final String dfa_5s = "\35\uffff}>";
    static final String[] dfa_6s = {
            "\1\13\32\uffff\1\6\1\7\1\10\1\11\1\12\6\uffff\1\1\1\2\1\3\1\4\1\5\1\14",
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
            "\1\17\1\20",
            "\1\33\32\uffff\1\26\1\27\1\30\1\31\1\32\6\uffff\1\21\1\22\1\23\1\24\1\25",
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
            return "927:1: rule__Member__Alternatives : ( ( ruleField ) | ( ruleMethod ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000E040002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000FC8F80101870L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000FC0F80000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000008000001872L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000FC0F80000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000008000801870L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000008000001870L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000FC0F80100010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00007C0F80000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008000001860L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x006C000000200000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x006C000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x00007C0000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x00007C0F80000010L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000030000L});

}
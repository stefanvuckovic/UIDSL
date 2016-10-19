package com.stefanvuckovic.domainmodel.ide.contentassist.antlr.internal;

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
import com.stefanvuckovic.domainmodel.services.DomainModelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDomainModelParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'SINGLE_TABLE'", "'TABLE_PER_CONCRETE_CLASS'", "'TABLE_PER_CLASS'", "'one'", "'many'", "'entity'", "'{'", "'}'", "'extends'", "'options'", "'('", "')'", "','", "'enum'", "'L'", "'/'", "'null'", "'inheritance'", "'='", "';'", "'string'", "'int'", "'long'", "'boolean'", "'date'", "'decimal'", "'List'", "'<'", "'>'", "'relationshipOwner'", "'reverse_cardinality'", "'.'", "'deleteByFlag'", "'required'", "'partOf'"
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
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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

    	public void setGrammarAccess(DomainModelGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalDomainModel.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalDomainModel.g:54:1: ( ruleModel EOF )
            // InternalDomainModel.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalDomainModel.g:62:1: ruleModel : ( ( rule__Model__ConceptsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:66:2: ( ( ( rule__Model__ConceptsAssignment )* ) )
            // InternalDomainModel.g:67:2: ( ( rule__Model__ConceptsAssignment )* )
            {
            // InternalDomainModel.g:67:2: ( ( rule__Model__ConceptsAssignment )* )
            // InternalDomainModel.g:68:3: ( rule__Model__ConceptsAssignment )*
            {
             before(grammarAccess.getModelAccess().getConceptsAssignment()); 
            // InternalDomainModel.g:69:3: ( rule__Model__ConceptsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18||LA1_0==26) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDomainModel.g:69:4: rule__Model__ConceptsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__ConceptsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getConceptsAssignment()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleConcept"
    // InternalDomainModel.g:78:1: entryRuleConcept : ruleConcept EOF ;
    public final void entryRuleConcept() throws RecognitionException {
        try {
            // InternalDomainModel.g:79:1: ( ruleConcept EOF )
            // InternalDomainModel.g:80:1: ruleConcept EOF
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
    // InternalDomainModel.g:87:1: ruleConcept : ( ( rule__Concept__Alternatives ) ) ;
    public final void ruleConcept() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:91:2: ( ( ( rule__Concept__Alternatives ) ) )
            // InternalDomainModel.g:92:2: ( ( rule__Concept__Alternatives ) )
            {
            // InternalDomainModel.g:92:2: ( ( rule__Concept__Alternatives ) )
            // InternalDomainModel.g:93:3: ( rule__Concept__Alternatives )
            {
             before(grammarAccess.getConceptAccess().getAlternatives()); 
            // InternalDomainModel.g:94:3: ( rule__Concept__Alternatives )
            // InternalDomainModel.g:94:4: rule__Concept__Alternatives
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


    // $ANTLR start "entryRuleEntity"
    // InternalDomainModel.g:103:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalDomainModel.g:104:1: ( ruleEntity EOF )
            // InternalDomainModel.g:105:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalDomainModel.g:112:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:116:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalDomainModel.g:117:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalDomainModel.g:117:2: ( ( rule__Entity__Group__0 ) )
            // InternalDomainModel.g:118:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalDomainModel.g:119:3: ( rule__Entity__Group__0 )
            // InternalDomainModel.g:119:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleEnum"
    // InternalDomainModel.g:128:1: entryRuleEnum : ruleEnum EOF ;
    public final void entryRuleEnum() throws RecognitionException {
        try {
            // InternalDomainModel.g:129:1: ( ruleEnum EOF )
            // InternalDomainModel.g:130:1: ruleEnum EOF
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
    // InternalDomainModel.g:137:1: ruleEnum : ( ( rule__Enum__Group__0 ) ) ;
    public final void ruleEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:141:2: ( ( ( rule__Enum__Group__0 ) ) )
            // InternalDomainModel.g:142:2: ( ( rule__Enum__Group__0 ) )
            {
            // InternalDomainModel.g:142:2: ( ( rule__Enum__Group__0 ) )
            // InternalDomainModel.g:143:3: ( rule__Enum__Group__0 )
            {
             before(grammarAccess.getEnumAccess().getGroup()); 
            // InternalDomainModel.g:144:3: ( rule__Enum__Group__0 )
            // InternalDomainModel.g:144:4: rule__Enum__Group__0
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
    // InternalDomainModel.g:153:1: entryRuleEnumLiteral : ruleEnumLiteral EOF ;
    public final void entryRuleEnumLiteral() throws RecognitionException {
        try {
            // InternalDomainModel.g:154:1: ( ruleEnumLiteral EOF )
            // InternalDomainModel.g:155:1: ruleEnumLiteral EOF
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
    // InternalDomainModel.g:162:1: ruleEnumLiteral : ( ( rule__EnumLiteral__Group__0 ) ) ;
    public final void ruleEnumLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:166:2: ( ( ( rule__EnumLiteral__Group__0 ) ) )
            // InternalDomainModel.g:167:2: ( ( rule__EnumLiteral__Group__0 ) )
            {
            // InternalDomainModel.g:167:2: ( ( rule__EnumLiteral__Group__0 ) )
            // InternalDomainModel.g:168:3: ( rule__EnumLiteral__Group__0 )
            {
             before(grammarAccess.getEnumLiteralAccess().getGroup()); 
            // InternalDomainModel.g:169:3: ( rule__EnumLiteral__Group__0 )
            // InternalDomainModel.g:169:4: rule__EnumLiteral__Group__0
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
    // InternalDomainModel.g:178:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // InternalDomainModel.g:179:1: ( ruleConstant EOF )
            // InternalDomainModel.g:180:1: ruleConstant EOF
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
    // InternalDomainModel.g:187:1: ruleConstant : ( ( rule__Constant__Alternatives ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:191:2: ( ( ( rule__Constant__Alternatives ) ) )
            // InternalDomainModel.g:192:2: ( ( rule__Constant__Alternatives ) )
            {
            // InternalDomainModel.g:192:2: ( ( rule__Constant__Alternatives ) )
            // InternalDomainModel.g:193:3: ( rule__Constant__Alternatives )
            {
             before(grammarAccess.getConstantAccess().getAlternatives()); 
            // InternalDomainModel.g:194:3: ( rule__Constant__Alternatives )
            // InternalDomainModel.g:194:4: rule__Constant__Alternatives
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
    // InternalDomainModel.g:203:1: entryRuleEntityOption : ruleEntityOption EOF ;
    public final void entryRuleEntityOption() throws RecognitionException {
        try {
            // InternalDomainModel.g:204:1: ( ruleEntityOption EOF )
            // InternalDomainModel.g:205:1: ruleEntityOption EOF
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
    // InternalDomainModel.g:212:1: ruleEntityOption : ( ( rule__EntityOption__Alternatives ) ) ;
    public final void ruleEntityOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:216:2: ( ( ( rule__EntityOption__Alternatives ) ) )
            // InternalDomainModel.g:217:2: ( ( rule__EntityOption__Alternatives ) )
            {
            // InternalDomainModel.g:217:2: ( ( rule__EntityOption__Alternatives ) )
            // InternalDomainModel.g:218:3: ( rule__EntityOption__Alternatives )
            {
             before(grammarAccess.getEntityOptionAccess().getAlternatives()); 
            // InternalDomainModel.g:219:3: ( rule__EntityOption__Alternatives )
            // InternalDomainModel.g:219:4: rule__EntityOption__Alternatives
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
    // InternalDomainModel.g:228:1: entryRuleInheritanceMappingType : ruleInheritanceMappingType EOF ;
    public final void entryRuleInheritanceMappingType() throws RecognitionException {
        try {
            // InternalDomainModel.g:229:1: ( ruleInheritanceMappingType EOF )
            // InternalDomainModel.g:230:1: ruleInheritanceMappingType EOF
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
    // InternalDomainModel.g:237:1: ruleInheritanceMappingType : ( ( rule__InheritanceMappingType__TypeAssignment ) ) ;
    public final void ruleInheritanceMappingType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:241:2: ( ( ( rule__InheritanceMappingType__TypeAssignment ) ) )
            // InternalDomainModel.g:242:2: ( ( rule__InheritanceMappingType__TypeAssignment ) )
            {
            // InternalDomainModel.g:242:2: ( ( rule__InheritanceMappingType__TypeAssignment ) )
            // InternalDomainModel.g:243:3: ( rule__InheritanceMappingType__TypeAssignment )
            {
             before(grammarAccess.getInheritanceMappingTypeAccess().getTypeAssignment()); 
            // InternalDomainModel.g:244:3: ( rule__InheritanceMappingType__TypeAssignment )
            // InternalDomainModel.g:244:4: rule__InheritanceMappingType__TypeAssignment
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
    // InternalDomainModel.g:253:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalDomainModel.g:254:1: ( ruleAttribute EOF )
            // InternalDomainModel.g:255:1: ruleAttribute EOF
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
    // InternalDomainModel.g:262:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:266:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalDomainModel.g:267:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalDomainModel.g:267:2: ( ( rule__Attribute__Group__0 ) )
            // InternalDomainModel.g:268:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalDomainModel.g:269:3: ( rule__Attribute__Group__0 )
            // InternalDomainModel.g:269:4: rule__Attribute__Group__0
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
    // InternalDomainModel.g:278:1: entryRuleAttributeType : ruleAttributeType EOF ;
    public final void entryRuleAttributeType() throws RecognitionException {
        try {
            // InternalDomainModel.g:279:1: ( ruleAttributeType EOF )
            // InternalDomainModel.g:280:1: ruleAttributeType EOF
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
    // InternalDomainModel.g:287:1: ruleAttributeType : ( ( rule__AttributeType__Alternatives ) ) ;
    public final void ruleAttributeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:291:2: ( ( ( rule__AttributeType__Alternatives ) ) )
            // InternalDomainModel.g:292:2: ( ( rule__AttributeType__Alternatives ) )
            {
            // InternalDomainModel.g:292:2: ( ( rule__AttributeType__Alternatives ) )
            // InternalDomainModel.g:293:3: ( rule__AttributeType__Alternatives )
            {
             before(grammarAccess.getAttributeTypeAccess().getAlternatives()); 
            // InternalDomainModel.g:294:3: ( rule__AttributeType__Alternatives )
            // InternalDomainModel.g:294:4: rule__AttributeType__Alternatives
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
    // InternalDomainModel.g:303:1: entryRuleSingleType : ruleSingleType EOF ;
    public final void entryRuleSingleType() throws RecognitionException {
        try {
            // InternalDomainModel.g:304:1: ( ruleSingleType EOF )
            // InternalDomainModel.g:305:1: ruleSingleType EOF
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
    // InternalDomainModel.g:312:1: ruleSingleType : ( ( rule__SingleType__Alternatives ) ) ;
    public final void ruleSingleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:316:2: ( ( ( rule__SingleType__Alternatives ) ) )
            // InternalDomainModel.g:317:2: ( ( rule__SingleType__Alternatives ) )
            {
            // InternalDomainModel.g:317:2: ( ( rule__SingleType__Alternatives ) )
            // InternalDomainModel.g:318:3: ( rule__SingleType__Alternatives )
            {
             before(grammarAccess.getSingleTypeAccess().getAlternatives()); 
            // InternalDomainModel.g:319:3: ( rule__SingleType__Alternatives )
            // InternalDomainModel.g:319:4: rule__SingleType__Alternatives
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


    // $ANTLR start "entryRuleBasicType"
    // InternalDomainModel.g:328:1: entryRuleBasicType : ruleBasicType EOF ;
    public final void entryRuleBasicType() throws RecognitionException {
        try {
            // InternalDomainModel.g:329:1: ( ruleBasicType EOF )
            // InternalDomainModel.g:330:1: ruleBasicType EOF
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
    // InternalDomainModel.g:337:1: ruleBasicType : ( ( rule__BasicType__Alternatives ) ) ;
    public final void ruleBasicType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:341:2: ( ( ( rule__BasicType__Alternatives ) ) )
            // InternalDomainModel.g:342:2: ( ( rule__BasicType__Alternatives ) )
            {
            // InternalDomainModel.g:342:2: ( ( rule__BasicType__Alternatives ) )
            // InternalDomainModel.g:343:3: ( rule__BasicType__Alternatives )
            {
             before(grammarAccess.getBasicTypeAccess().getAlternatives()); 
            // InternalDomainModel.g:344:3: ( rule__BasicType__Alternatives )
            // InternalDomainModel.g:344:4: rule__BasicType__Alternatives
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


    // $ANTLR start "entryRuleRefType"
    // InternalDomainModel.g:353:1: entryRuleRefType : ruleRefType EOF ;
    public final void entryRuleRefType() throws RecognitionException {
        try {
            // InternalDomainModel.g:354:1: ( ruleRefType EOF )
            // InternalDomainModel.g:355:1: ruleRefType EOF
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
    // InternalDomainModel.g:362:1: ruleRefType : ( ( rule__RefType__ReferenceAssignment ) ) ;
    public final void ruleRefType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:366:2: ( ( ( rule__RefType__ReferenceAssignment ) ) )
            // InternalDomainModel.g:367:2: ( ( rule__RefType__ReferenceAssignment ) )
            {
            // InternalDomainModel.g:367:2: ( ( rule__RefType__ReferenceAssignment ) )
            // InternalDomainModel.g:368:3: ( rule__RefType__ReferenceAssignment )
            {
             before(grammarAccess.getRefTypeAccess().getReferenceAssignment()); 
            // InternalDomainModel.g:369:3: ( rule__RefType__ReferenceAssignment )
            // InternalDomainModel.g:369:4: rule__RefType__ReferenceAssignment
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
    // InternalDomainModel.g:378:1: entryRuleCollectionType : ruleCollectionType EOF ;
    public final void entryRuleCollectionType() throws RecognitionException {
        try {
            // InternalDomainModel.g:379:1: ( ruleCollectionType EOF )
            // InternalDomainModel.g:380:1: ruleCollectionType EOF
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
    // InternalDomainModel.g:387:1: ruleCollectionType : ( ( rule__CollectionType__Group__0 ) ) ;
    public final void ruleCollectionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:391:2: ( ( ( rule__CollectionType__Group__0 ) ) )
            // InternalDomainModel.g:392:2: ( ( rule__CollectionType__Group__0 ) )
            {
            // InternalDomainModel.g:392:2: ( ( rule__CollectionType__Group__0 ) )
            // InternalDomainModel.g:393:3: ( rule__CollectionType__Group__0 )
            {
             before(grammarAccess.getCollectionTypeAccess().getGroup()); 
            // InternalDomainModel.g:394:3: ( rule__CollectionType__Group__0 )
            // InternalDomainModel.g:394:4: rule__CollectionType__Group__0
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
    // InternalDomainModel.g:403:1: entryRuleAttributeOption : ruleAttributeOption EOF ;
    public final void entryRuleAttributeOption() throws RecognitionException {
        try {
            // InternalDomainModel.g:404:1: ( ruleAttributeOption EOF )
            // InternalDomainModel.g:405:1: ruleAttributeOption EOF
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
    // InternalDomainModel.g:412:1: ruleAttributeOption : ( ( rule__AttributeOption__Alternatives ) ) ;
    public final void ruleAttributeOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:416:2: ( ( ( rule__AttributeOption__Alternatives ) ) )
            // InternalDomainModel.g:417:2: ( ( rule__AttributeOption__Alternatives ) )
            {
            // InternalDomainModel.g:417:2: ( ( rule__AttributeOption__Alternatives ) )
            // InternalDomainModel.g:418:3: ( rule__AttributeOption__Alternatives )
            {
             before(grammarAccess.getAttributeOptionAccess().getAlternatives()); 
            // InternalDomainModel.g:419:3: ( rule__AttributeOption__Alternatives )
            // InternalDomainModel.g:419:4: rule__AttributeOption__Alternatives
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
    // InternalDomainModel.g:428:1: entryRuleStaticFieldSelection : ruleStaticFieldSelection EOF ;
    public final void entryRuleStaticFieldSelection() throws RecognitionException {
        try {
            // InternalDomainModel.g:429:1: ( ruleStaticFieldSelection EOF )
            // InternalDomainModel.g:430:1: ruleStaticFieldSelection EOF
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
    // InternalDomainModel.g:437:1: ruleStaticFieldSelection : ( ( rule__StaticFieldSelection__Group__0 ) ) ;
    public final void ruleStaticFieldSelection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:441:2: ( ( ( rule__StaticFieldSelection__Group__0 ) ) )
            // InternalDomainModel.g:442:2: ( ( rule__StaticFieldSelection__Group__0 ) )
            {
            // InternalDomainModel.g:442:2: ( ( rule__StaticFieldSelection__Group__0 ) )
            // InternalDomainModel.g:443:3: ( rule__StaticFieldSelection__Group__0 )
            {
             before(grammarAccess.getStaticFieldSelectionAccess().getGroup()); 
            // InternalDomainModel.g:444:3: ( rule__StaticFieldSelection__Group__0 )
            // InternalDomainModel.g:444:4: rule__StaticFieldSelection__Group__0
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


    // $ANTLR start "entryRuleDecimal"
    // InternalDomainModel.g:453:1: entryRuleDecimal : ruleDecimal EOF ;
    public final void entryRuleDecimal() throws RecognitionException {
        try {
            // InternalDomainModel.g:454:1: ( ruleDecimal EOF )
            // InternalDomainModel.g:455:1: ruleDecimal EOF
            {
             before(grammarAccess.getDecimalRule()); 
            pushFollow(FOLLOW_1);
            ruleDecimal();

            state._fsp--;

             after(grammarAccess.getDecimalRule()); 
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
    // $ANTLR end "entryRuleDecimal"


    // $ANTLR start "ruleDecimal"
    // InternalDomainModel.g:462:1: ruleDecimal : ( ( rule__Decimal__Group__0 ) ) ;
    public final void ruleDecimal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:466:2: ( ( ( rule__Decimal__Group__0 ) ) )
            // InternalDomainModel.g:467:2: ( ( rule__Decimal__Group__0 ) )
            {
            // InternalDomainModel.g:467:2: ( ( rule__Decimal__Group__0 ) )
            // InternalDomainModel.g:468:3: ( rule__Decimal__Group__0 )
            {
             before(grammarAccess.getDecimalAccess().getGroup()); 
            // InternalDomainModel.g:469:3: ( rule__Decimal__Group__0 )
            // InternalDomainModel.g:469:4: rule__Decimal__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Decimal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDecimalAccess().getGroup()); 

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
    // $ANTLR end "ruleDecimal"


    // $ANTLR start "ruleCardinalityType"
    // InternalDomainModel.g:478:1: ruleCardinalityType : ( ( rule__CardinalityType__Alternatives ) ) ;
    public final void ruleCardinalityType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:482:1: ( ( ( rule__CardinalityType__Alternatives ) ) )
            // InternalDomainModel.g:483:2: ( ( rule__CardinalityType__Alternatives ) )
            {
            // InternalDomainModel.g:483:2: ( ( rule__CardinalityType__Alternatives ) )
            // InternalDomainModel.g:484:3: ( rule__CardinalityType__Alternatives )
            {
             before(grammarAccess.getCardinalityTypeAccess().getAlternatives()); 
            // InternalDomainModel.g:485:3: ( rule__CardinalityType__Alternatives )
            // InternalDomainModel.g:485:4: rule__CardinalityType__Alternatives
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


    // $ANTLR start "rule__Concept__Alternatives"
    // InternalDomainModel.g:493:1: rule__Concept__Alternatives : ( ( ruleEntity ) | ( ruleEnum ) );
    public final void rule__Concept__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:497:1: ( ( ruleEntity ) | ( ruleEnum ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            else if ( (LA2_0==26) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDomainModel.g:498:2: ( ruleEntity )
                    {
                    // InternalDomainModel.g:498:2: ( ruleEntity )
                    // InternalDomainModel.g:499:3: ruleEntity
                    {
                     before(grammarAccess.getConceptAccess().getEntityParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getConceptAccess().getEntityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainModel.g:504:2: ( ruleEnum )
                    {
                    // InternalDomainModel.g:504:2: ( ruleEnum )
                    // InternalDomainModel.g:505:3: ruleEnum
                    {
                     before(grammarAccess.getConceptAccess().getEnumParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEnum();

                    state._fsp--;

                     after(grammarAccess.getConceptAccess().getEnumParserRuleCall_1()); 

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


    // $ANTLR start "rule__Constant__Alternatives"
    // InternalDomainModel.g:514:1: rule__Constant__Alternatives : ( ( ( rule__Constant__Group_0__0 ) ) | ( ( rule__Constant__Group_1__0 ) ) | ( ( rule__Constant__Group_2__0 ) ) | ( ( rule__Constant__Group_3__0 ) ) | ( ( rule__Constant__Group_4__0 ) ) | ( ( rule__Constant__Group_5__0 ) ) | ( ( rule__Constant__Group_6__0 ) ) );
    public final void rule__Constant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:518:1: ( ( ( rule__Constant__Group_0__0 ) ) | ( ( rule__Constant__Group_1__0 ) ) | ( ( rule__Constant__Group_2__0 ) ) | ( ( rule__Constant__Group_3__0 ) ) | ( ( rule__Constant__Group_4__0 ) ) | ( ( rule__Constant__Group_5__0 ) ) | ( ( rule__Constant__Group_6__0 ) ) )
            int alt3=7;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                switch ( input.LA(2) ) {
                case 28:
                    {
                    alt3=5;
                    }
                    break;
                case EOF:
                case 24:
                case 25:
                    {
                    alt3=1;
                    }
                    break;
                case 27:
                    {
                    alt3=2;
                    }
                    break;
                case 44:
                    {
                    alt3=6;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }

                }
                break;
            case RULE_STRING:
                {
                alt3=3;
                }
                break;
            case 11:
            case 12:
                {
                alt3=4;
                }
                break;
            case 29:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDomainModel.g:519:2: ( ( rule__Constant__Group_0__0 ) )
                    {
                    // InternalDomainModel.g:519:2: ( ( rule__Constant__Group_0__0 ) )
                    // InternalDomainModel.g:520:3: ( rule__Constant__Group_0__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_0()); 
                    // InternalDomainModel.g:521:3: ( rule__Constant__Group_0__0 )
                    // InternalDomainModel.g:521:4: rule__Constant__Group_0__0
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
                    // InternalDomainModel.g:525:2: ( ( rule__Constant__Group_1__0 ) )
                    {
                    // InternalDomainModel.g:525:2: ( ( rule__Constant__Group_1__0 ) )
                    // InternalDomainModel.g:526:3: ( rule__Constant__Group_1__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_1()); 
                    // InternalDomainModel.g:527:3: ( rule__Constant__Group_1__0 )
                    // InternalDomainModel.g:527:4: rule__Constant__Group_1__0
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
                    // InternalDomainModel.g:531:2: ( ( rule__Constant__Group_2__0 ) )
                    {
                    // InternalDomainModel.g:531:2: ( ( rule__Constant__Group_2__0 ) )
                    // InternalDomainModel.g:532:3: ( rule__Constant__Group_2__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_2()); 
                    // InternalDomainModel.g:533:3: ( rule__Constant__Group_2__0 )
                    // InternalDomainModel.g:533:4: rule__Constant__Group_2__0
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
                    // InternalDomainModel.g:537:2: ( ( rule__Constant__Group_3__0 ) )
                    {
                    // InternalDomainModel.g:537:2: ( ( rule__Constant__Group_3__0 ) )
                    // InternalDomainModel.g:538:3: ( rule__Constant__Group_3__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_3()); 
                    // InternalDomainModel.g:539:3: ( rule__Constant__Group_3__0 )
                    // InternalDomainModel.g:539:4: rule__Constant__Group_3__0
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
                    // InternalDomainModel.g:543:2: ( ( rule__Constant__Group_4__0 ) )
                    {
                    // InternalDomainModel.g:543:2: ( ( rule__Constant__Group_4__0 ) )
                    // InternalDomainModel.g:544:3: ( rule__Constant__Group_4__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_4()); 
                    // InternalDomainModel.g:545:3: ( rule__Constant__Group_4__0 )
                    // InternalDomainModel.g:545:4: rule__Constant__Group_4__0
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
                    // InternalDomainModel.g:549:2: ( ( rule__Constant__Group_5__0 ) )
                    {
                    // InternalDomainModel.g:549:2: ( ( rule__Constant__Group_5__0 ) )
                    // InternalDomainModel.g:550:3: ( rule__Constant__Group_5__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_5()); 
                    // InternalDomainModel.g:551:3: ( rule__Constant__Group_5__0 )
                    // InternalDomainModel.g:551:4: rule__Constant__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstantAccess().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDomainModel.g:555:2: ( ( rule__Constant__Group_6__0 ) )
                    {
                    // InternalDomainModel.g:555:2: ( ( rule__Constant__Group_6__0 ) )
                    // InternalDomainModel.g:556:3: ( rule__Constant__Group_6__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_6()); 
                    // InternalDomainModel.g:557:3: ( rule__Constant__Group_6__0 )
                    // InternalDomainModel.g:557:4: rule__Constant__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstantAccess().getGroup_6()); 

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
    // InternalDomainModel.g:565:1: rule__Constant__ValueAlternatives_3_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Constant__ValueAlternatives_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:569:1: ( ( 'true' ) | ( 'false' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDomainModel.g:570:2: ( 'true' )
                    {
                    // InternalDomainModel.g:570:2: ( 'true' )
                    // InternalDomainModel.g:571:3: 'true'
                    {
                     before(grammarAccess.getConstantAccess().getValueTrueKeyword_3_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getConstantAccess().getValueTrueKeyword_3_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainModel.g:576:2: ( 'false' )
                    {
                    // InternalDomainModel.g:576:2: ( 'false' )
                    // InternalDomainModel.g:577:3: 'false'
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
    // InternalDomainModel.g:586:1: rule__EntityOption__Alternatives : ( ( ( rule__EntityOption__Group_0__0 ) ) | ( ( rule__EntityOption__Group_1__0 ) ) );
    public final void rule__EntityOption__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:590:1: ( ( ( rule__EntityOption__Group_0__0 ) ) | ( ( rule__EntityOption__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==45) ) {
                alt5=1;
            }
            else if ( (LA5_0==30) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDomainModel.g:591:2: ( ( rule__EntityOption__Group_0__0 ) )
                    {
                    // InternalDomainModel.g:591:2: ( ( rule__EntityOption__Group_0__0 ) )
                    // InternalDomainModel.g:592:3: ( rule__EntityOption__Group_0__0 )
                    {
                     before(grammarAccess.getEntityOptionAccess().getGroup_0()); 
                    // InternalDomainModel.g:593:3: ( rule__EntityOption__Group_0__0 )
                    // InternalDomainModel.g:593:4: rule__EntityOption__Group_0__0
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
                    // InternalDomainModel.g:597:2: ( ( rule__EntityOption__Group_1__0 ) )
                    {
                    // InternalDomainModel.g:597:2: ( ( rule__EntityOption__Group_1__0 ) )
                    // InternalDomainModel.g:598:3: ( rule__EntityOption__Group_1__0 )
                    {
                     before(grammarAccess.getEntityOptionAccess().getGroup_1()); 
                    // InternalDomainModel.g:599:3: ( rule__EntityOption__Group_1__0 )
                    // InternalDomainModel.g:599:4: rule__EntityOption__Group_1__0
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
    // InternalDomainModel.g:607:1: rule__InheritanceMappingType__TypeAlternatives_0 : ( ( 'SINGLE_TABLE' ) | ( 'TABLE_PER_CONCRETE_CLASS' ) | ( 'TABLE_PER_CLASS' ) );
    public final void rule__InheritanceMappingType__TypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:611:1: ( ( 'SINGLE_TABLE' ) | ( 'TABLE_PER_CONCRETE_CLASS' ) | ( 'TABLE_PER_CLASS' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt6=1;
                }
                break;
            case 14:
                {
                alt6=2;
                }
                break;
            case 15:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalDomainModel.g:612:2: ( 'SINGLE_TABLE' )
                    {
                    // InternalDomainModel.g:612:2: ( 'SINGLE_TABLE' )
                    // InternalDomainModel.g:613:3: 'SINGLE_TABLE'
                    {
                     before(grammarAccess.getInheritanceMappingTypeAccess().getTypeSINGLE_TABLEKeyword_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getInheritanceMappingTypeAccess().getTypeSINGLE_TABLEKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainModel.g:618:2: ( 'TABLE_PER_CONCRETE_CLASS' )
                    {
                    // InternalDomainModel.g:618:2: ( 'TABLE_PER_CONCRETE_CLASS' )
                    // InternalDomainModel.g:619:3: 'TABLE_PER_CONCRETE_CLASS'
                    {
                     before(grammarAccess.getInheritanceMappingTypeAccess().getTypeTABLE_PER_CONCRETE_CLASSKeyword_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getInheritanceMappingTypeAccess().getTypeTABLE_PER_CONCRETE_CLASSKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDomainModel.g:624:2: ( 'TABLE_PER_CLASS' )
                    {
                    // InternalDomainModel.g:624:2: ( 'TABLE_PER_CLASS' )
                    // InternalDomainModel.g:625:3: 'TABLE_PER_CLASS'
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
    // InternalDomainModel.g:634:1: rule__AttributeType__Alternatives : ( ( ruleSingleType ) | ( ruleCollectionType ) );
    public final void rule__AttributeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:638:1: ( ( ruleSingleType ) | ( ruleCollectionType ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID||(LA7_0>=33 && LA7_0<=38)) ) {
                alt7=1;
            }
            else if ( (LA7_0==39) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDomainModel.g:639:2: ( ruleSingleType )
                    {
                    // InternalDomainModel.g:639:2: ( ruleSingleType )
                    // InternalDomainModel.g:640:3: ruleSingleType
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
                    // InternalDomainModel.g:645:2: ( ruleCollectionType )
                    {
                    // InternalDomainModel.g:645:2: ( ruleCollectionType )
                    // InternalDomainModel.g:646:3: ruleCollectionType
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
    // InternalDomainModel.g:655:1: rule__SingleType__Alternatives : ( ( ruleBasicType ) | ( ruleRefType ) );
    public final void rule__SingleType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:659:1: ( ( ruleBasicType ) | ( ruleRefType ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=33 && LA8_0<=38)) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalDomainModel.g:660:2: ( ruleBasicType )
                    {
                    // InternalDomainModel.g:660:2: ( ruleBasicType )
                    // InternalDomainModel.g:661:3: ruleBasicType
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
                    // InternalDomainModel.g:666:2: ( ruleRefType )
                    {
                    // InternalDomainModel.g:666:2: ( ruleRefType )
                    // InternalDomainModel.g:667:3: ruleRefType
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


    // $ANTLR start "rule__BasicType__Alternatives"
    // InternalDomainModel.g:676:1: rule__BasicType__Alternatives : ( ( ( rule__BasicType__Group_0__0 ) ) | ( ( rule__BasicType__Group_1__0 ) ) | ( ( rule__BasicType__Group_2__0 ) ) | ( ( rule__BasicType__Group_3__0 ) ) | ( ( rule__BasicType__Group_4__0 ) ) | ( ( rule__BasicType__Group_5__0 ) ) );
    public final void rule__BasicType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:680:1: ( ( ( rule__BasicType__Group_0__0 ) ) | ( ( rule__BasicType__Group_1__0 ) ) | ( ( rule__BasicType__Group_2__0 ) ) | ( ( rule__BasicType__Group_3__0 ) ) | ( ( rule__BasicType__Group_4__0 ) ) | ( ( rule__BasicType__Group_5__0 ) ) )
            int alt9=6;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt9=1;
                }
                break;
            case 34:
                {
                alt9=2;
                }
                break;
            case 35:
                {
                alt9=3;
                }
                break;
            case 36:
                {
                alt9=4;
                }
                break;
            case 37:
                {
                alt9=5;
                }
                break;
            case 38:
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
                    // InternalDomainModel.g:681:2: ( ( rule__BasicType__Group_0__0 ) )
                    {
                    // InternalDomainModel.g:681:2: ( ( rule__BasicType__Group_0__0 ) )
                    // InternalDomainModel.g:682:3: ( rule__BasicType__Group_0__0 )
                    {
                     before(grammarAccess.getBasicTypeAccess().getGroup_0()); 
                    // InternalDomainModel.g:683:3: ( rule__BasicType__Group_0__0 )
                    // InternalDomainModel.g:683:4: rule__BasicType__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BasicType__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBasicTypeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainModel.g:687:2: ( ( rule__BasicType__Group_1__0 ) )
                    {
                    // InternalDomainModel.g:687:2: ( ( rule__BasicType__Group_1__0 ) )
                    // InternalDomainModel.g:688:3: ( rule__BasicType__Group_1__0 )
                    {
                     before(grammarAccess.getBasicTypeAccess().getGroup_1()); 
                    // InternalDomainModel.g:689:3: ( rule__BasicType__Group_1__0 )
                    // InternalDomainModel.g:689:4: rule__BasicType__Group_1__0
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
                    // InternalDomainModel.g:693:2: ( ( rule__BasicType__Group_2__0 ) )
                    {
                    // InternalDomainModel.g:693:2: ( ( rule__BasicType__Group_2__0 ) )
                    // InternalDomainModel.g:694:3: ( rule__BasicType__Group_2__0 )
                    {
                     before(grammarAccess.getBasicTypeAccess().getGroup_2()); 
                    // InternalDomainModel.g:695:3: ( rule__BasicType__Group_2__0 )
                    // InternalDomainModel.g:695:4: rule__BasicType__Group_2__0
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
                    // InternalDomainModel.g:699:2: ( ( rule__BasicType__Group_3__0 ) )
                    {
                    // InternalDomainModel.g:699:2: ( ( rule__BasicType__Group_3__0 ) )
                    // InternalDomainModel.g:700:3: ( rule__BasicType__Group_3__0 )
                    {
                     before(grammarAccess.getBasicTypeAccess().getGroup_3()); 
                    // InternalDomainModel.g:701:3: ( rule__BasicType__Group_3__0 )
                    // InternalDomainModel.g:701:4: rule__BasicType__Group_3__0
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
                    // InternalDomainModel.g:705:2: ( ( rule__BasicType__Group_4__0 ) )
                    {
                    // InternalDomainModel.g:705:2: ( ( rule__BasicType__Group_4__0 ) )
                    // InternalDomainModel.g:706:3: ( rule__BasicType__Group_4__0 )
                    {
                     before(grammarAccess.getBasicTypeAccess().getGroup_4()); 
                    // InternalDomainModel.g:707:3: ( rule__BasicType__Group_4__0 )
                    // InternalDomainModel.g:707:4: rule__BasicType__Group_4__0
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
                    // InternalDomainModel.g:711:2: ( ( rule__BasicType__Group_5__0 ) )
                    {
                    // InternalDomainModel.g:711:2: ( ( rule__BasicType__Group_5__0 ) )
                    // InternalDomainModel.g:712:3: ( rule__BasicType__Group_5__0 )
                    {
                     before(grammarAccess.getBasicTypeAccess().getGroup_5()); 
                    // InternalDomainModel.g:713:3: ( rule__BasicType__Group_5__0 )
                    // InternalDomainModel.g:713:4: rule__BasicType__Group_5__0
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


    // $ANTLR start "rule__AttributeOption__Alternatives"
    // InternalDomainModel.g:721:1: rule__AttributeOption__Alternatives : ( ( ( rule__AttributeOption__Group_0__0 ) ) | ( ( rule__AttributeOption__Group_1__0 ) ) | ( ( rule__AttributeOption__Group_2__0 ) ) | ( ( rule__AttributeOption__Group_3__0 ) ) );
    public final void rule__AttributeOption__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:725:1: ( ( ( rule__AttributeOption__Group_0__0 ) ) | ( ( rule__AttributeOption__Group_1__0 ) ) | ( ( rule__AttributeOption__Group_2__0 ) ) | ( ( rule__AttributeOption__Group_3__0 ) ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt10=1;
                }
                break;
            case 47:
                {
                alt10=2;
                }
                break;
            case 42:
                {
                alt10=3;
                }
                break;
            case 43:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalDomainModel.g:726:2: ( ( rule__AttributeOption__Group_0__0 ) )
                    {
                    // InternalDomainModel.g:726:2: ( ( rule__AttributeOption__Group_0__0 ) )
                    // InternalDomainModel.g:727:3: ( rule__AttributeOption__Group_0__0 )
                    {
                     before(grammarAccess.getAttributeOptionAccess().getGroup_0()); 
                    // InternalDomainModel.g:728:3: ( rule__AttributeOption__Group_0__0 )
                    // InternalDomainModel.g:728:4: rule__AttributeOption__Group_0__0
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
                    // InternalDomainModel.g:732:2: ( ( rule__AttributeOption__Group_1__0 ) )
                    {
                    // InternalDomainModel.g:732:2: ( ( rule__AttributeOption__Group_1__0 ) )
                    // InternalDomainModel.g:733:3: ( rule__AttributeOption__Group_1__0 )
                    {
                     before(grammarAccess.getAttributeOptionAccess().getGroup_1()); 
                    // InternalDomainModel.g:734:3: ( rule__AttributeOption__Group_1__0 )
                    // InternalDomainModel.g:734:4: rule__AttributeOption__Group_1__0
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
                    // InternalDomainModel.g:738:2: ( ( rule__AttributeOption__Group_2__0 ) )
                    {
                    // InternalDomainModel.g:738:2: ( ( rule__AttributeOption__Group_2__0 ) )
                    // InternalDomainModel.g:739:3: ( rule__AttributeOption__Group_2__0 )
                    {
                     before(grammarAccess.getAttributeOptionAccess().getGroup_2()); 
                    // InternalDomainModel.g:740:3: ( rule__AttributeOption__Group_2__0 )
                    // InternalDomainModel.g:740:4: rule__AttributeOption__Group_2__0
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
                    // InternalDomainModel.g:744:2: ( ( rule__AttributeOption__Group_3__0 ) )
                    {
                    // InternalDomainModel.g:744:2: ( ( rule__AttributeOption__Group_3__0 ) )
                    // InternalDomainModel.g:745:3: ( rule__AttributeOption__Group_3__0 )
                    {
                     before(grammarAccess.getAttributeOptionAccess().getGroup_3()); 
                    // InternalDomainModel.g:746:3: ( rule__AttributeOption__Group_3__0 )
                    // InternalDomainModel.g:746:4: rule__AttributeOption__Group_3__0
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
    // InternalDomainModel.g:754:1: rule__CardinalityType__Alternatives : ( ( ( 'one' ) ) | ( ( 'many' ) ) );
    public final void rule__CardinalityType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:758:1: ( ( ( 'one' ) ) | ( ( 'many' ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==16) ) {
                alt11=1;
            }
            else if ( (LA11_0==17) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalDomainModel.g:759:2: ( ( 'one' ) )
                    {
                    // InternalDomainModel.g:759:2: ( ( 'one' ) )
                    // InternalDomainModel.g:760:3: ( 'one' )
                    {
                     before(grammarAccess.getCardinalityTypeAccess().getOneEnumLiteralDeclaration_0()); 
                    // InternalDomainModel.g:761:3: ( 'one' )
                    // InternalDomainModel.g:761:4: 'one'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getCardinalityTypeAccess().getOneEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainModel.g:765:2: ( ( 'many' ) )
                    {
                    // InternalDomainModel.g:765:2: ( ( 'many' ) )
                    // InternalDomainModel.g:766:3: ( 'many' )
                    {
                     before(grammarAccess.getCardinalityTypeAccess().getManyEnumLiteralDeclaration_1()); 
                    // InternalDomainModel.g:767:3: ( 'many' )
                    // InternalDomainModel.g:767:4: 'many'
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


    // $ANTLR start "rule__Entity__Group__0"
    // InternalDomainModel.g:775:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:779:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalDomainModel.g:780:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

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
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalDomainModel.g:787:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:791:1: ( ( 'entity' ) )
            // InternalDomainModel.g:792:1: ( 'entity' )
            {
            // InternalDomainModel.g:792:1: ( 'entity' )
            // InternalDomainModel.g:793:2: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

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
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalDomainModel.g:802:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:806:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalDomainModel.g:807:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

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
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalDomainModel.g:814:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:818:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalDomainModel.g:819:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalDomainModel.g:819:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalDomainModel.g:820:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalDomainModel.g:821:2: ( rule__Entity__NameAssignment_1 )
            // InternalDomainModel.g:821:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalDomainModel.g:829:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:833:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalDomainModel.g:834:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

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
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalDomainModel.g:841:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:845:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // InternalDomainModel.g:846:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // InternalDomainModel.g:846:1: ( ( rule__Entity__Group_2__0 )? )
            // InternalDomainModel.g:847:2: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // InternalDomainModel.g:848:2: ( rule__Entity__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDomainModel.g:848:3: rule__Entity__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalDomainModel.g:856:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:860:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalDomainModel.g:861:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__4();

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
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalDomainModel.g:868:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__Group_3__0 )? ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:872:1: ( ( ( rule__Entity__Group_3__0 )? ) )
            // InternalDomainModel.g:873:1: ( ( rule__Entity__Group_3__0 )? )
            {
            // InternalDomainModel.g:873:1: ( ( rule__Entity__Group_3__0 )? )
            // InternalDomainModel.g:874:2: ( rule__Entity__Group_3__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_3()); 
            // InternalDomainModel.g:875:2: ( rule__Entity__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDomainModel.g:875:3: rule__Entity__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // InternalDomainModel.g:883:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:887:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalDomainModel.g:888:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__5();

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
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // InternalDomainModel.g:895:1: rule__Entity__Group__4__Impl : ( '{' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:899:1: ( ( '{' ) )
            // InternalDomainModel.g:900:1: ( '{' )
            {
            // InternalDomainModel.g:900:1: ( '{' )
            // InternalDomainModel.g:901:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // InternalDomainModel.g:910:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:914:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // InternalDomainModel.g:915:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Entity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__6();

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
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // InternalDomainModel.g:922:1: rule__Entity__Group__5__Impl : ( ( rule__Entity__AttributesAssignment_5 )* ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:926:1: ( ( ( rule__Entity__AttributesAssignment_5 )* ) )
            // InternalDomainModel.g:927:1: ( ( rule__Entity__AttributesAssignment_5 )* )
            {
            // InternalDomainModel.g:927:1: ( ( rule__Entity__AttributesAssignment_5 )* )
            // InternalDomainModel.g:928:2: ( rule__Entity__AttributesAssignment_5 )*
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_5()); 
            // InternalDomainModel.g:929:2: ( rule__Entity__AttributesAssignment_5 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||(LA14_0>=33 && LA14_0<=39)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDomainModel.g:929:3: rule__Entity__AttributesAssignment_5
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Entity__AttributesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getAttributesAssignment_5()); 

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
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group__6"
    // InternalDomainModel.g:937:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:941:1: ( rule__Entity__Group__6__Impl )
            // InternalDomainModel.g:942:2: rule__Entity__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__6__Impl();

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
    // $ANTLR end "rule__Entity__Group__6"


    // $ANTLR start "rule__Entity__Group__6__Impl"
    // InternalDomainModel.g:948:1: rule__Entity__Group__6__Impl : ( '}' ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:952:1: ( ( '}' ) )
            // InternalDomainModel.g:953:1: ( '}' )
            {
            // InternalDomainModel.g:953:1: ( '}' )
            // InternalDomainModel.g:954:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Entity__Group__6__Impl"


    // $ANTLR start "rule__Entity__Group_2__0"
    // InternalDomainModel.g:964:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:968:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // InternalDomainModel.g:969:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Entity__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__1();

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
    // $ANTLR end "rule__Entity__Group_2__0"


    // $ANTLR start "rule__Entity__Group_2__0__Impl"
    // InternalDomainModel.g:976:1: rule__Entity__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:980:1: ( ( 'extends' ) )
            // InternalDomainModel.g:981:1: ( 'extends' )
            {
            // InternalDomainModel.g:981:1: ( 'extends' )
            // InternalDomainModel.g:982:2: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 

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
    // $ANTLR end "rule__Entity__Group_2__0__Impl"


    // $ANTLR start "rule__Entity__Group_2__1"
    // InternalDomainModel.g:991:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:995:1: ( rule__Entity__Group_2__1__Impl )
            // InternalDomainModel.g:996:2: rule__Entity__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__1__Impl();

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
    // $ANTLR end "rule__Entity__Group_2__1"


    // $ANTLR start "rule__Entity__Group_2__1__Impl"
    // InternalDomainModel.g:1002:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1006:1: ( ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) )
            // InternalDomainModel.g:1007:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            {
            // InternalDomainModel.g:1007:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            // InternalDomainModel.g:1008:2: ( rule__Entity__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); 
            // InternalDomainModel.g:1009:2: ( rule__Entity__SuperTypeAssignment_2_1 )
            // InternalDomainModel.g:1009:3: rule__Entity__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__SuperTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); 

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
    // $ANTLR end "rule__Entity__Group_2__1__Impl"


    // $ANTLR start "rule__Entity__Group_3__0"
    // InternalDomainModel.g:1018:1: rule__Entity__Group_3__0 : rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 ;
    public final void rule__Entity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1022:1: ( rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 )
            // InternalDomainModel.g:1023:2: rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__Entity__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_3__1();

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
    // $ANTLR end "rule__Entity__Group_3__0"


    // $ANTLR start "rule__Entity__Group_3__0__Impl"
    // InternalDomainModel.g:1030:1: rule__Entity__Group_3__0__Impl : ( 'options' ) ;
    public final void rule__Entity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1034:1: ( ( 'options' ) )
            // InternalDomainModel.g:1035:1: ( 'options' )
            {
            // InternalDomainModel.g:1035:1: ( 'options' )
            // InternalDomainModel.g:1036:2: 'options'
            {
             before(grammarAccess.getEntityAccess().getOptionsKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getOptionsKeyword_3_0()); 

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
    // $ANTLR end "rule__Entity__Group_3__0__Impl"


    // $ANTLR start "rule__Entity__Group_3__1"
    // InternalDomainModel.g:1045:1: rule__Entity__Group_3__1 : rule__Entity__Group_3__1__Impl rule__Entity__Group_3__2 ;
    public final void rule__Entity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1049:1: ( rule__Entity__Group_3__1__Impl rule__Entity__Group_3__2 )
            // InternalDomainModel.g:1050:2: rule__Entity__Group_3__1__Impl rule__Entity__Group_3__2
            {
            pushFollow(FOLLOW_9);
            rule__Entity__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_3__2();

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
    // $ANTLR end "rule__Entity__Group_3__1"


    // $ANTLR start "rule__Entity__Group_3__1__Impl"
    // InternalDomainModel.g:1057:1: rule__Entity__Group_3__1__Impl : ( '(' ) ;
    public final void rule__Entity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1061:1: ( ( '(' ) )
            // InternalDomainModel.g:1062:1: ( '(' )
            {
            // InternalDomainModel.g:1062:1: ( '(' )
            // InternalDomainModel.g:1063:2: '('
            {
             before(grammarAccess.getEntityAccess().getLeftParenthesisKeyword_3_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftParenthesisKeyword_3_1()); 

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
    // $ANTLR end "rule__Entity__Group_3__1__Impl"


    // $ANTLR start "rule__Entity__Group_3__2"
    // InternalDomainModel.g:1072:1: rule__Entity__Group_3__2 : rule__Entity__Group_3__2__Impl rule__Entity__Group_3__3 ;
    public final void rule__Entity__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1076:1: ( rule__Entity__Group_3__2__Impl rule__Entity__Group_3__3 )
            // InternalDomainModel.g:1077:2: rule__Entity__Group_3__2__Impl rule__Entity__Group_3__3
            {
            pushFollow(FOLLOW_10);
            rule__Entity__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_3__3();

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
    // $ANTLR end "rule__Entity__Group_3__2"


    // $ANTLR start "rule__Entity__Group_3__2__Impl"
    // InternalDomainModel.g:1084:1: rule__Entity__Group_3__2__Impl : ( ( rule__Entity__OptionsAssignment_3_2 ) ) ;
    public final void rule__Entity__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1088:1: ( ( ( rule__Entity__OptionsAssignment_3_2 ) ) )
            // InternalDomainModel.g:1089:1: ( ( rule__Entity__OptionsAssignment_3_2 ) )
            {
            // InternalDomainModel.g:1089:1: ( ( rule__Entity__OptionsAssignment_3_2 ) )
            // InternalDomainModel.g:1090:2: ( rule__Entity__OptionsAssignment_3_2 )
            {
             before(grammarAccess.getEntityAccess().getOptionsAssignment_3_2()); 
            // InternalDomainModel.g:1091:2: ( rule__Entity__OptionsAssignment_3_2 )
            // InternalDomainModel.g:1091:3: rule__Entity__OptionsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Entity__OptionsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getOptionsAssignment_3_2()); 

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
    // $ANTLR end "rule__Entity__Group_3__2__Impl"


    // $ANTLR start "rule__Entity__Group_3__3"
    // InternalDomainModel.g:1099:1: rule__Entity__Group_3__3 : rule__Entity__Group_3__3__Impl rule__Entity__Group_3__4 ;
    public final void rule__Entity__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1103:1: ( rule__Entity__Group_3__3__Impl rule__Entity__Group_3__4 )
            // InternalDomainModel.g:1104:2: rule__Entity__Group_3__3__Impl rule__Entity__Group_3__4
            {
            pushFollow(FOLLOW_10);
            rule__Entity__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_3__4();

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
    // $ANTLR end "rule__Entity__Group_3__3"


    // $ANTLR start "rule__Entity__Group_3__3__Impl"
    // InternalDomainModel.g:1111:1: rule__Entity__Group_3__3__Impl : ( ( rule__Entity__Group_3_3__0 )* ) ;
    public final void rule__Entity__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1115:1: ( ( ( rule__Entity__Group_3_3__0 )* ) )
            // InternalDomainModel.g:1116:1: ( ( rule__Entity__Group_3_3__0 )* )
            {
            // InternalDomainModel.g:1116:1: ( ( rule__Entity__Group_3_3__0 )* )
            // InternalDomainModel.g:1117:2: ( rule__Entity__Group_3_3__0 )*
            {
             before(grammarAccess.getEntityAccess().getGroup_3_3()); 
            // InternalDomainModel.g:1118:2: ( rule__Entity__Group_3_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==25) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDomainModel.g:1118:3: rule__Entity__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Entity__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getGroup_3_3()); 

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
    // $ANTLR end "rule__Entity__Group_3__3__Impl"


    // $ANTLR start "rule__Entity__Group_3__4"
    // InternalDomainModel.g:1126:1: rule__Entity__Group_3__4 : rule__Entity__Group_3__4__Impl ;
    public final void rule__Entity__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1130:1: ( rule__Entity__Group_3__4__Impl )
            // InternalDomainModel.g:1131:2: rule__Entity__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_3__4__Impl();

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
    // $ANTLR end "rule__Entity__Group_3__4"


    // $ANTLR start "rule__Entity__Group_3__4__Impl"
    // InternalDomainModel.g:1137:1: rule__Entity__Group_3__4__Impl : ( ')' ) ;
    public final void rule__Entity__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1141:1: ( ( ')' ) )
            // InternalDomainModel.g:1142:1: ( ')' )
            {
            // InternalDomainModel.g:1142:1: ( ')' )
            // InternalDomainModel.g:1143:2: ')'
            {
             before(grammarAccess.getEntityAccess().getRightParenthesisKeyword_3_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightParenthesisKeyword_3_4()); 

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
    // $ANTLR end "rule__Entity__Group_3__4__Impl"


    // $ANTLR start "rule__Entity__Group_3_3__0"
    // InternalDomainModel.g:1153:1: rule__Entity__Group_3_3__0 : rule__Entity__Group_3_3__0__Impl rule__Entity__Group_3_3__1 ;
    public final void rule__Entity__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1157:1: ( rule__Entity__Group_3_3__0__Impl rule__Entity__Group_3_3__1 )
            // InternalDomainModel.g:1158:2: rule__Entity__Group_3_3__0__Impl rule__Entity__Group_3_3__1
            {
            pushFollow(FOLLOW_9);
            rule__Entity__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_3_3__1();

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
    // $ANTLR end "rule__Entity__Group_3_3__0"


    // $ANTLR start "rule__Entity__Group_3_3__0__Impl"
    // InternalDomainModel.g:1165:1: rule__Entity__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Entity__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1169:1: ( ( ',' ) )
            // InternalDomainModel.g:1170:1: ( ',' )
            {
            // InternalDomainModel.g:1170:1: ( ',' )
            // InternalDomainModel.g:1171:2: ','
            {
             before(grammarAccess.getEntityAccess().getCommaKeyword_3_3_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getCommaKeyword_3_3_0()); 

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
    // $ANTLR end "rule__Entity__Group_3_3__0__Impl"


    // $ANTLR start "rule__Entity__Group_3_3__1"
    // InternalDomainModel.g:1180:1: rule__Entity__Group_3_3__1 : rule__Entity__Group_3_3__1__Impl ;
    public final void rule__Entity__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1184:1: ( rule__Entity__Group_3_3__1__Impl )
            // InternalDomainModel.g:1185:2: rule__Entity__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_3_3__1__Impl();

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
    // $ANTLR end "rule__Entity__Group_3_3__1"


    // $ANTLR start "rule__Entity__Group_3_3__1__Impl"
    // InternalDomainModel.g:1191:1: rule__Entity__Group_3_3__1__Impl : ( ( rule__Entity__OptionsAssignment_3_3_1 ) ) ;
    public final void rule__Entity__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1195:1: ( ( ( rule__Entity__OptionsAssignment_3_3_1 ) ) )
            // InternalDomainModel.g:1196:1: ( ( rule__Entity__OptionsAssignment_3_3_1 ) )
            {
            // InternalDomainModel.g:1196:1: ( ( rule__Entity__OptionsAssignment_3_3_1 ) )
            // InternalDomainModel.g:1197:2: ( rule__Entity__OptionsAssignment_3_3_1 )
            {
             before(grammarAccess.getEntityAccess().getOptionsAssignment_3_3_1()); 
            // InternalDomainModel.g:1198:2: ( rule__Entity__OptionsAssignment_3_3_1 )
            // InternalDomainModel.g:1198:3: rule__Entity__OptionsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__OptionsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getOptionsAssignment_3_3_1()); 

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
    // $ANTLR end "rule__Entity__Group_3_3__1__Impl"


    // $ANTLR start "rule__Enum__Group__0"
    // InternalDomainModel.g:1207:1: rule__Enum__Group__0 : rule__Enum__Group__0__Impl rule__Enum__Group__1 ;
    public final void rule__Enum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1211:1: ( rule__Enum__Group__0__Impl rule__Enum__Group__1 )
            // InternalDomainModel.g:1212:2: rule__Enum__Group__0__Impl rule__Enum__Group__1
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
    // InternalDomainModel.g:1219:1: rule__Enum__Group__0__Impl : ( 'enum' ) ;
    public final void rule__Enum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1223:1: ( ( 'enum' ) )
            // InternalDomainModel.g:1224:1: ( 'enum' )
            {
            // InternalDomainModel.g:1224:1: ( 'enum' )
            // InternalDomainModel.g:1225:2: 'enum'
            {
             before(grammarAccess.getEnumAccess().getEnumKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalDomainModel.g:1234:1: rule__Enum__Group__1 : rule__Enum__Group__1__Impl rule__Enum__Group__2 ;
    public final void rule__Enum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1238:1: ( rule__Enum__Group__1__Impl rule__Enum__Group__2 )
            // InternalDomainModel.g:1239:2: rule__Enum__Group__1__Impl rule__Enum__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalDomainModel.g:1246:1: rule__Enum__Group__1__Impl : ( ( rule__Enum__NameAssignment_1 ) ) ;
    public final void rule__Enum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1250:1: ( ( ( rule__Enum__NameAssignment_1 ) ) )
            // InternalDomainModel.g:1251:1: ( ( rule__Enum__NameAssignment_1 ) )
            {
            // InternalDomainModel.g:1251:1: ( ( rule__Enum__NameAssignment_1 ) )
            // InternalDomainModel.g:1252:2: ( rule__Enum__NameAssignment_1 )
            {
             before(grammarAccess.getEnumAccess().getNameAssignment_1()); 
            // InternalDomainModel.g:1253:2: ( rule__Enum__NameAssignment_1 )
            // InternalDomainModel.g:1253:3: rule__Enum__NameAssignment_1
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
    // InternalDomainModel.g:1261:1: rule__Enum__Group__2 : rule__Enum__Group__2__Impl rule__Enum__Group__3 ;
    public final void rule__Enum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1265:1: ( rule__Enum__Group__2__Impl rule__Enum__Group__3 )
            // InternalDomainModel.g:1266:2: rule__Enum__Group__2__Impl rule__Enum__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalDomainModel.g:1273:1: rule__Enum__Group__2__Impl : ( '{' ) ;
    public final void rule__Enum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1277:1: ( ( '{' ) )
            // InternalDomainModel.g:1278:1: ( '{' )
            {
            // InternalDomainModel.g:1278:1: ( '{' )
            // InternalDomainModel.g:1279:2: '{'
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
    // InternalDomainModel.g:1288:1: rule__Enum__Group__3 : rule__Enum__Group__3__Impl rule__Enum__Group__4 ;
    public final void rule__Enum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1292:1: ( rule__Enum__Group__3__Impl rule__Enum__Group__4 )
            // InternalDomainModel.g:1293:2: rule__Enum__Group__3__Impl rule__Enum__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalDomainModel.g:1300:1: rule__Enum__Group__3__Impl : ( ( rule__Enum__AttributesAssignment_3 )* ) ;
    public final void rule__Enum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1304:1: ( ( ( rule__Enum__AttributesAssignment_3 )* ) )
            // InternalDomainModel.g:1305:1: ( ( rule__Enum__AttributesAssignment_3 )* )
            {
            // InternalDomainModel.g:1305:1: ( ( rule__Enum__AttributesAssignment_3 )* )
            // InternalDomainModel.g:1306:2: ( rule__Enum__AttributesAssignment_3 )*
            {
             before(grammarAccess.getEnumAccess().getAttributesAssignment_3()); 
            // InternalDomainModel.g:1307:2: ( rule__Enum__AttributesAssignment_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1==RULE_ID) ) {
                        int LA16_3 = input.LA(3);

                        if ( (LA16_3==32||(LA16_3>=42 && LA16_3<=43)||(LA16_3>=46 && LA16_3<=47)) ) {
                            alt16=1;
                        }


                    }


                }
                else if ( ((LA16_0>=33 && LA16_0<=39)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDomainModel.g:1307:3: rule__Enum__AttributesAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Enum__AttributesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalDomainModel.g:1315:1: rule__Enum__Group__4 : rule__Enum__Group__4__Impl rule__Enum__Group__5 ;
    public final void rule__Enum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1319:1: ( rule__Enum__Group__4__Impl rule__Enum__Group__5 )
            // InternalDomainModel.g:1320:2: rule__Enum__Group__4__Impl rule__Enum__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalDomainModel.g:1327:1: rule__Enum__Group__4__Impl : ( ( ( rule__Enum__LiteralsAssignment_4 ) ) ( ( rule__Enum__LiteralsAssignment_4 )* ) ) ;
    public final void rule__Enum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1331:1: ( ( ( ( rule__Enum__LiteralsAssignment_4 ) ) ( ( rule__Enum__LiteralsAssignment_4 )* ) ) )
            // InternalDomainModel.g:1332:1: ( ( ( rule__Enum__LiteralsAssignment_4 ) ) ( ( rule__Enum__LiteralsAssignment_4 )* ) )
            {
            // InternalDomainModel.g:1332:1: ( ( ( rule__Enum__LiteralsAssignment_4 ) ) ( ( rule__Enum__LiteralsAssignment_4 )* ) )
            // InternalDomainModel.g:1333:2: ( ( rule__Enum__LiteralsAssignment_4 ) ) ( ( rule__Enum__LiteralsAssignment_4 )* )
            {
            // InternalDomainModel.g:1333:2: ( ( rule__Enum__LiteralsAssignment_4 ) )
            // InternalDomainModel.g:1334:3: ( rule__Enum__LiteralsAssignment_4 )
            {
             before(grammarAccess.getEnumAccess().getLiteralsAssignment_4()); 
            // InternalDomainModel.g:1335:3: ( rule__Enum__LiteralsAssignment_4 )
            // InternalDomainModel.g:1335:4: rule__Enum__LiteralsAssignment_4
            {
            pushFollow(FOLLOW_7);
            rule__Enum__LiteralsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getLiteralsAssignment_4()); 

            }

            // InternalDomainModel.g:1338:2: ( ( rule__Enum__LiteralsAssignment_4 )* )
            // InternalDomainModel.g:1339:3: ( rule__Enum__LiteralsAssignment_4 )*
            {
             before(grammarAccess.getEnumAccess().getLiteralsAssignment_4()); 
            // InternalDomainModel.g:1340:3: ( rule__Enum__LiteralsAssignment_4 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDomainModel.g:1340:4: rule__Enum__LiteralsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Enum__LiteralsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalDomainModel.g:1349:1: rule__Enum__Group__5 : rule__Enum__Group__5__Impl ;
    public final void rule__Enum__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1353:1: ( rule__Enum__Group__5__Impl )
            // InternalDomainModel.g:1354:2: rule__Enum__Group__5__Impl
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
    // InternalDomainModel.g:1360:1: rule__Enum__Group__5__Impl : ( '}' ) ;
    public final void rule__Enum__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1364:1: ( ( '}' ) )
            // InternalDomainModel.g:1365:1: ( '}' )
            {
            // InternalDomainModel.g:1365:1: ( '}' )
            // InternalDomainModel.g:1366:2: '}'
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
    // InternalDomainModel.g:1376:1: rule__EnumLiteral__Group__0 : rule__EnumLiteral__Group__0__Impl rule__EnumLiteral__Group__1 ;
    public final void rule__EnumLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1380:1: ( rule__EnumLiteral__Group__0__Impl rule__EnumLiteral__Group__1 )
            // InternalDomainModel.g:1381:2: rule__EnumLiteral__Group__0__Impl rule__EnumLiteral__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalDomainModel.g:1388:1: rule__EnumLiteral__Group__0__Impl : ( ( rule__EnumLiteral__NameAssignment_0 ) ) ;
    public final void rule__EnumLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1392:1: ( ( ( rule__EnumLiteral__NameAssignment_0 ) ) )
            // InternalDomainModel.g:1393:1: ( ( rule__EnumLiteral__NameAssignment_0 ) )
            {
            // InternalDomainModel.g:1393:1: ( ( rule__EnumLiteral__NameAssignment_0 ) )
            // InternalDomainModel.g:1394:2: ( rule__EnumLiteral__NameAssignment_0 )
            {
             before(grammarAccess.getEnumLiteralAccess().getNameAssignment_0()); 
            // InternalDomainModel.g:1395:2: ( rule__EnumLiteral__NameAssignment_0 )
            // InternalDomainModel.g:1395:3: rule__EnumLiteral__NameAssignment_0
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
    // InternalDomainModel.g:1403:1: rule__EnumLiteral__Group__1 : rule__EnumLiteral__Group__1__Impl ;
    public final void rule__EnumLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1407:1: ( rule__EnumLiteral__Group__1__Impl )
            // InternalDomainModel.g:1408:2: rule__EnumLiteral__Group__1__Impl
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
    // InternalDomainModel.g:1414:1: rule__EnumLiteral__Group__1__Impl : ( ( rule__EnumLiteral__Group_1__0 )? ) ;
    public final void rule__EnumLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1418:1: ( ( ( rule__EnumLiteral__Group_1__0 )? ) )
            // InternalDomainModel.g:1419:1: ( ( rule__EnumLiteral__Group_1__0 )? )
            {
            // InternalDomainModel.g:1419:1: ( ( rule__EnumLiteral__Group_1__0 )? )
            // InternalDomainModel.g:1420:2: ( rule__EnumLiteral__Group_1__0 )?
            {
             before(grammarAccess.getEnumLiteralAccess().getGroup_1()); 
            // InternalDomainModel.g:1421:2: ( rule__EnumLiteral__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDomainModel.g:1421:3: rule__EnumLiteral__Group_1__0
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
    // InternalDomainModel.g:1430:1: rule__EnumLiteral__Group_1__0 : rule__EnumLiteral__Group_1__0__Impl rule__EnumLiteral__Group_1__1 ;
    public final void rule__EnumLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1434:1: ( rule__EnumLiteral__Group_1__0__Impl rule__EnumLiteral__Group_1__1 )
            // InternalDomainModel.g:1435:2: rule__EnumLiteral__Group_1__0__Impl rule__EnumLiteral__Group_1__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalDomainModel.g:1442:1: rule__EnumLiteral__Group_1__0__Impl : ( '(' ) ;
    public final void rule__EnumLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1446:1: ( ( '(' ) )
            // InternalDomainModel.g:1447:1: ( '(' )
            {
            // InternalDomainModel.g:1447:1: ( '(' )
            // InternalDomainModel.g:1448:2: '('
            {
             before(grammarAccess.getEnumLiteralAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalDomainModel.g:1457:1: rule__EnumLiteral__Group_1__1 : rule__EnumLiteral__Group_1__1__Impl rule__EnumLiteral__Group_1__2 ;
    public final void rule__EnumLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1461:1: ( rule__EnumLiteral__Group_1__1__Impl rule__EnumLiteral__Group_1__2 )
            // InternalDomainModel.g:1462:2: rule__EnumLiteral__Group_1__1__Impl rule__EnumLiteral__Group_1__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalDomainModel.g:1469:1: rule__EnumLiteral__Group_1__1__Impl : ( ( rule__EnumLiteral__ParamsAssignment_1_1 ) ) ;
    public final void rule__EnumLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1473:1: ( ( ( rule__EnumLiteral__ParamsAssignment_1_1 ) ) )
            // InternalDomainModel.g:1474:1: ( ( rule__EnumLiteral__ParamsAssignment_1_1 ) )
            {
            // InternalDomainModel.g:1474:1: ( ( rule__EnumLiteral__ParamsAssignment_1_1 ) )
            // InternalDomainModel.g:1475:2: ( rule__EnumLiteral__ParamsAssignment_1_1 )
            {
             before(grammarAccess.getEnumLiteralAccess().getParamsAssignment_1_1()); 
            // InternalDomainModel.g:1476:2: ( rule__EnumLiteral__ParamsAssignment_1_1 )
            // InternalDomainModel.g:1476:3: rule__EnumLiteral__ParamsAssignment_1_1
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
    // InternalDomainModel.g:1484:1: rule__EnumLiteral__Group_1__2 : rule__EnumLiteral__Group_1__2__Impl rule__EnumLiteral__Group_1__3 ;
    public final void rule__EnumLiteral__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1488:1: ( rule__EnumLiteral__Group_1__2__Impl rule__EnumLiteral__Group_1__3 )
            // InternalDomainModel.g:1489:2: rule__EnumLiteral__Group_1__2__Impl rule__EnumLiteral__Group_1__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalDomainModel.g:1496:1: rule__EnumLiteral__Group_1__2__Impl : ( ( rule__EnumLiteral__Group_1_2__0 )* ) ;
    public final void rule__EnumLiteral__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1500:1: ( ( ( rule__EnumLiteral__Group_1_2__0 )* ) )
            // InternalDomainModel.g:1501:1: ( ( rule__EnumLiteral__Group_1_2__0 )* )
            {
            // InternalDomainModel.g:1501:1: ( ( rule__EnumLiteral__Group_1_2__0 )* )
            // InternalDomainModel.g:1502:2: ( rule__EnumLiteral__Group_1_2__0 )*
            {
             before(grammarAccess.getEnumLiteralAccess().getGroup_1_2()); 
            // InternalDomainModel.g:1503:2: ( rule__EnumLiteral__Group_1_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==25) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalDomainModel.g:1503:3: rule__EnumLiteral__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__EnumLiteral__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalDomainModel.g:1511:1: rule__EnumLiteral__Group_1__3 : rule__EnumLiteral__Group_1__3__Impl ;
    public final void rule__EnumLiteral__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1515:1: ( rule__EnumLiteral__Group_1__3__Impl )
            // InternalDomainModel.g:1516:2: rule__EnumLiteral__Group_1__3__Impl
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
    // InternalDomainModel.g:1522:1: rule__EnumLiteral__Group_1__3__Impl : ( ')' ) ;
    public final void rule__EnumLiteral__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1526:1: ( ( ')' ) )
            // InternalDomainModel.g:1527:1: ( ')' )
            {
            // InternalDomainModel.g:1527:1: ( ')' )
            // InternalDomainModel.g:1528:2: ')'
            {
             before(grammarAccess.getEnumLiteralAccess().getRightParenthesisKeyword_1_3()); 
            match(input,24,FOLLOW_2); 
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
    // InternalDomainModel.g:1538:1: rule__EnumLiteral__Group_1_2__0 : rule__EnumLiteral__Group_1_2__0__Impl rule__EnumLiteral__Group_1_2__1 ;
    public final void rule__EnumLiteral__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1542:1: ( rule__EnumLiteral__Group_1_2__0__Impl rule__EnumLiteral__Group_1_2__1 )
            // InternalDomainModel.g:1543:2: rule__EnumLiteral__Group_1_2__0__Impl rule__EnumLiteral__Group_1_2__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalDomainModel.g:1550:1: rule__EnumLiteral__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__EnumLiteral__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1554:1: ( ( ',' ) )
            // InternalDomainModel.g:1555:1: ( ',' )
            {
            // InternalDomainModel.g:1555:1: ( ',' )
            // InternalDomainModel.g:1556:2: ','
            {
             before(grammarAccess.getEnumLiteralAccess().getCommaKeyword_1_2_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalDomainModel.g:1565:1: rule__EnumLiteral__Group_1_2__1 : rule__EnumLiteral__Group_1_2__1__Impl ;
    public final void rule__EnumLiteral__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1569:1: ( rule__EnumLiteral__Group_1_2__1__Impl )
            // InternalDomainModel.g:1570:2: rule__EnumLiteral__Group_1_2__1__Impl
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
    // InternalDomainModel.g:1576:1: rule__EnumLiteral__Group_1_2__1__Impl : ( ( rule__EnumLiteral__ParamsAssignment_1_2_1 ) ) ;
    public final void rule__EnumLiteral__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1580:1: ( ( ( rule__EnumLiteral__ParamsAssignment_1_2_1 ) ) )
            // InternalDomainModel.g:1581:1: ( ( rule__EnumLiteral__ParamsAssignment_1_2_1 ) )
            {
            // InternalDomainModel.g:1581:1: ( ( rule__EnumLiteral__ParamsAssignment_1_2_1 ) )
            // InternalDomainModel.g:1582:2: ( rule__EnumLiteral__ParamsAssignment_1_2_1 )
            {
             before(grammarAccess.getEnumLiteralAccess().getParamsAssignment_1_2_1()); 
            // InternalDomainModel.g:1583:2: ( rule__EnumLiteral__ParamsAssignment_1_2_1 )
            // InternalDomainModel.g:1583:3: rule__EnumLiteral__ParamsAssignment_1_2_1
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
    // InternalDomainModel.g:1592:1: rule__Constant__Group_0__0 : rule__Constant__Group_0__0__Impl rule__Constant__Group_0__1 ;
    public final void rule__Constant__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1596:1: ( rule__Constant__Group_0__0__Impl rule__Constant__Group_0__1 )
            // InternalDomainModel.g:1597:2: rule__Constant__Group_0__0__Impl rule__Constant__Group_0__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalDomainModel.g:1604:1: rule__Constant__Group_0__0__Impl : ( () ) ;
    public final void rule__Constant__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1608:1: ( ( () ) )
            // InternalDomainModel.g:1609:1: ( () )
            {
            // InternalDomainModel.g:1609:1: ( () )
            // InternalDomainModel.g:1610:2: ()
            {
             before(grammarAccess.getConstantAccess().getIntConstantAction_0_0()); 
            // InternalDomainModel.g:1611:2: ()
            // InternalDomainModel.g:1611:3: 
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
    // InternalDomainModel.g:1619:1: rule__Constant__Group_0__1 : rule__Constant__Group_0__1__Impl ;
    public final void rule__Constant__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1623:1: ( rule__Constant__Group_0__1__Impl )
            // InternalDomainModel.g:1624:2: rule__Constant__Group_0__1__Impl
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
    // InternalDomainModel.g:1630:1: rule__Constant__Group_0__1__Impl : ( ( rule__Constant__ValueAssignment_0_1 ) ) ;
    public final void rule__Constant__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1634:1: ( ( ( rule__Constant__ValueAssignment_0_1 ) ) )
            // InternalDomainModel.g:1635:1: ( ( rule__Constant__ValueAssignment_0_1 ) )
            {
            // InternalDomainModel.g:1635:1: ( ( rule__Constant__ValueAssignment_0_1 ) )
            // InternalDomainModel.g:1636:2: ( rule__Constant__ValueAssignment_0_1 )
            {
             before(grammarAccess.getConstantAccess().getValueAssignment_0_1()); 
            // InternalDomainModel.g:1637:2: ( rule__Constant__ValueAssignment_0_1 )
            // InternalDomainModel.g:1637:3: rule__Constant__ValueAssignment_0_1
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
    // InternalDomainModel.g:1646:1: rule__Constant__Group_1__0 : rule__Constant__Group_1__0__Impl rule__Constant__Group_1__1 ;
    public final void rule__Constant__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1650:1: ( rule__Constant__Group_1__0__Impl rule__Constant__Group_1__1 )
            // InternalDomainModel.g:1651:2: rule__Constant__Group_1__0__Impl rule__Constant__Group_1__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalDomainModel.g:1658:1: rule__Constant__Group_1__0__Impl : ( () ) ;
    public final void rule__Constant__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1662:1: ( ( () ) )
            // InternalDomainModel.g:1663:1: ( () )
            {
            // InternalDomainModel.g:1663:1: ( () )
            // InternalDomainModel.g:1664:2: ()
            {
             before(grammarAccess.getConstantAccess().getLongConstantAction_1_0()); 
            // InternalDomainModel.g:1665:2: ()
            // InternalDomainModel.g:1665:3: 
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
    // InternalDomainModel.g:1673:1: rule__Constant__Group_1__1 : rule__Constant__Group_1__1__Impl rule__Constant__Group_1__2 ;
    public final void rule__Constant__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1677:1: ( rule__Constant__Group_1__1__Impl rule__Constant__Group_1__2 )
            // InternalDomainModel.g:1678:2: rule__Constant__Group_1__1__Impl rule__Constant__Group_1__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalDomainModel.g:1685:1: rule__Constant__Group_1__1__Impl : ( ( rule__Constant__ValueAssignment_1_1 ) ) ;
    public final void rule__Constant__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1689:1: ( ( ( rule__Constant__ValueAssignment_1_1 ) ) )
            // InternalDomainModel.g:1690:1: ( ( rule__Constant__ValueAssignment_1_1 ) )
            {
            // InternalDomainModel.g:1690:1: ( ( rule__Constant__ValueAssignment_1_1 ) )
            // InternalDomainModel.g:1691:2: ( rule__Constant__ValueAssignment_1_1 )
            {
             before(grammarAccess.getConstantAccess().getValueAssignment_1_1()); 
            // InternalDomainModel.g:1692:2: ( rule__Constant__ValueAssignment_1_1 )
            // InternalDomainModel.g:1692:3: rule__Constant__ValueAssignment_1_1
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
    // InternalDomainModel.g:1700:1: rule__Constant__Group_1__2 : rule__Constant__Group_1__2__Impl ;
    public final void rule__Constant__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1704:1: ( rule__Constant__Group_1__2__Impl )
            // InternalDomainModel.g:1705:2: rule__Constant__Group_1__2__Impl
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
    // InternalDomainModel.g:1711:1: rule__Constant__Group_1__2__Impl : ( 'L' ) ;
    public final void rule__Constant__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1715:1: ( ( 'L' ) )
            // InternalDomainModel.g:1716:1: ( 'L' )
            {
            // InternalDomainModel.g:1716:1: ( 'L' )
            // InternalDomainModel.g:1717:2: 'L'
            {
             before(grammarAccess.getConstantAccess().getLKeyword_1_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalDomainModel.g:1727:1: rule__Constant__Group_2__0 : rule__Constant__Group_2__0__Impl rule__Constant__Group_2__1 ;
    public final void rule__Constant__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1731:1: ( rule__Constant__Group_2__0__Impl rule__Constant__Group_2__1 )
            // InternalDomainModel.g:1732:2: rule__Constant__Group_2__0__Impl rule__Constant__Group_2__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalDomainModel.g:1739:1: rule__Constant__Group_2__0__Impl : ( () ) ;
    public final void rule__Constant__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1743:1: ( ( () ) )
            // InternalDomainModel.g:1744:1: ( () )
            {
            // InternalDomainModel.g:1744:1: ( () )
            // InternalDomainModel.g:1745:2: ()
            {
             before(grammarAccess.getConstantAccess().getStringConstantAction_2_0()); 
            // InternalDomainModel.g:1746:2: ()
            // InternalDomainModel.g:1746:3: 
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
    // InternalDomainModel.g:1754:1: rule__Constant__Group_2__1 : rule__Constant__Group_2__1__Impl ;
    public final void rule__Constant__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1758:1: ( rule__Constant__Group_2__1__Impl )
            // InternalDomainModel.g:1759:2: rule__Constant__Group_2__1__Impl
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
    // InternalDomainModel.g:1765:1: rule__Constant__Group_2__1__Impl : ( ( rule__Constant__ValueAssignment_2_1 ) ) ;
    public final void rule__Constant__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1769:1: ( ( ( rule__Constant__ValueAssignment_2_1 ) ) )
            // InternalDomainModel.g:1770:1: ( ( rule__Constant__ValueAssignment_2_1 ) )
            {
            // InternalDomainModel.g:1770:1: ( ( rule__Constant__ValueAssignment_2_1 ) )
            // InternalDomainModel.g:1771:2: ( rule__Constant__ValueAssignment_2_1 )
            {
             before(grammarAccess.getConstantAccess().getValueAssignment_2_1()); 
            // InternalDomainModel.g:1772:2: ( rule__Constant__ValueAssignment_2_1 )
            // InternalDomainModel.g:1772:3: rule__Constant__ValueAssignment_2_1
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
    // InternalDomainModel.g:1781:1: rule__Constant__Group_3__0 : rule__Constant__Group_3__0__Impl rule__Constant__Group_3__1 ;
    public final void rule__Constant__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1785:1: ( rule__Constant__Group_3__0__Impl rule__Constant__Group_3__1 )
            // InternalDomainModel.g:1786:2: rule__Constant__Group_3__0__Impl rule__Constant__Group_3__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalDomainModel.g:1793:1: rule__Constant__Group_3__0__Impl : ( () ) ;
    public final void rule__Constant__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1797:1: ( ( () ) )
            // InternalDomainModel.g:1798:1: ( () )
            {
            // InternalDomainModel.g:1798:1: ( () )
            // InternalDomainModel.g:1799:2: ()
            {
             before(grammarAccess.getConstantAccess().getBoolConstantAction_3_0()); 
            // InternalDomainModel.g:1800:2: ()
            // InternalDomainModel.g:1800:3: 
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
    // InternalDomainModel.g:1808:1: rule__Constant__Group_3__1 : rule__Constant__Group_3__1__Impl ;
    public final void rule__Constant__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1812:1: ( rule__Constant__Group_3__1__Impl )
            // InternalDomainModel.g:1813:2: rule__Constant__Group_3__1__Impl
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
    // InternalDomainModel.g:1819:1: rule__Constant__Group_3__1__Impl : ( ( rule__Constant__ValueAssignment_3_1 ) ) ;
    public final void rule__Constant__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1823:1: ( ( ( rule__Constant__ValueAssignment_3_1 ) ) )
            // InternalDomainModel.g:1824:1: ( ( rule__Constant__ValueAssignment_3_1 ) )
            {
            // InternalDomainModel.g:1824:1: ( ( rule__Constant__ValueAssignment_3_1 ) )
            // InternalDomainModel.g:1825:2: ( rule__Constant__ValueAssignment_3_1 )
            {
             before(grammarAccess.getConstantAccess().getValueAssignment_3_1()); 
            // InternalDomainModel.g:1826:2: ( rule__Constant__ValueAssignment_3_1 )
            // InternalDomainModel.g:1826:3: rule__Constant__ValueAssignment_3_1
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
    // InternalDomainModel.g:1835:1: rule__Constant__Group_4__0 : rule__Constant__Group_4__0__Impl rule__Constant__Group_4__1 ;
    public final void rule__Constant__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1839:1: ( rule__Constant__Group_4__0__Impl rule__Constant__Group_4__1 )
            // InternalDomainModel.g:1840:2: rule__Constant__Group_4__0__Impl rule__Constant__Group_4__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalDomainModel.g:1847:1: rule__Constant__Group_4__0__Impl : ( () ) ;
    public final void rule__Constant__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1851:1: ( ( () ) )
            // InternalDomainModel.g:1852:1: ( () )
            {
            // InternalDomainModel.g:1852:1: ( () )
            // InternalDomainModel.g:1853:2: ()
            {
             before(grammarAccess.getConstantAccess().getDateConstantAction_4_0()); 
            // InternalDomainModel.g:1854:2: ()
            // InternalDomainModel.g:1854:3: 
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
    // InternalDomainModel.g:1862:1: rule__Constant__Group_4__1 : rule__Constant__Group_4__1__Impl rule__Constant__Group_4__2 ;
    public final void rule__Constant__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1866:1: ( rule__Constant__Group_4__1__Impl rule__Constant__Group_4__2 )
            // InternalDomainModel.g:1867:2: rule__Constant__Group_4__1__Impl rule__Constant__Group_4__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalDomainModel.g:1874:1: rule__Constant__Group_4__1__Impl : ( ( rule__Constant__DayAssignment_4_1 ) ) ;
    public final void rule__Constant__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1878:1: ( ( ( rule__Constant__DayAssignment_4_1 ) ) )
            // InternalDomainModel.g:1879:1: ( ( rule__Constant__DayAssignment_4_1 ) )
            {
            // InternalDomainModel.g:1879:1: ( ( rule__Constant__DayAssignment_4_1 ) )
            // InternalDomainModel.g:1880:2: ( rule__Constant__DayAssignment_4_1 )
            {
             before(grammarAccess.getConstantAccess().getDayAssignment_4_1()); 
            // InternalDomainModel.g:1881:2: ( rule__Constant__DayAssignment_4_1 )
            // InternalDomainModel.g:1881:3: rule__Constant__DayAssignment_4_1
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
    // InternalDomainModel.g:1889:1: rule__Constant__Group_4__2 : rule__Constant__Group_4__2__Impl rule__Constant__Group_4__3 ;
    public final void rule__Constant__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1893:1: ( rule__Constant__Group_4__2__Impl rule__Constant__Group_4__3 )
            // InternalDomainModel.g:1894:2: rule__Constant__Group_4__2__Impl rule__Constant__Group_4__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalDomainModel.g:1901:1: rule__Constant__Group_4__2__Impl : ( '/' ) ;
    public final void rule__Constant__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1905:1: ( ( '/' ) )
            // InternalDomainModel.g:1906:1: ( '/' )
            {
            // InternalDomainModel.g:1906:1: ( '/' )
            // InternalDomainModel.g:1907:2: '/'
            {
             before(grammarAccess.getConstantAccess().getSolidusKeyword_4_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalDomainModel.g:1916:1: rule__Constant__Group_4__3 : rule__Constant__Group_4__3__Impl rule__Constant__Group_4__4 ;
    public final void rule__Constant__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1920:1: ( rule__Constant__Group_4__3__Impl rule__Constant__Group_4__4 )
            // InternalDomainModel.g:1921:2: rule__Constant__Group_4__3__Impl rule__Constant__Group_4__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalDomainModel.g:1928:1: rule__Constant__Group_4__3__Impl : ( ( rule__Constant__MonthAssignment_4_3 ) ) ;
    public final void rule__Constant__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1932:1: ( ( ( rule__Constant__MonthAssignment_4_3 ) ) )
            // InternalDomainModel.g:1933:1: ( ( rule__Constant__MonthAssignment_4_3 ) )
            {
            // InternalDomainModel.g:1933:1: ( ( rule__Constant__MonthAssignment_4_3 ) )
            // InternalDomainModel.g:1934:2: ( rule__Constant__MonthAssignment_4_3 )
            {
             before(grammarAccess.getConstantAccess().getMonthAssignment_4_3()); 
            // InternalDomainModel.g:1935:2: ( rule__Constant__MonthAssignment_4_3 )
            // InternalDomainModel.g:1935:3: rule__Constant__MonthAssignment_4_3
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
    // InternalDomainModel.g:1943:1: rule__Constant__Group_4__4 : rule__Constant__Group_4__4__Impl rule__Constant__Group_4__5 ;
    public final void rule__Constant__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1947:1: ( rule__Constant__Group_4__4__Impl rule__Constant__Group_4__5 )
            // InternalDomainModel.g:1948:2: rule__Constant__Group_4__4__Impl rule__Constant__Group_4__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalDomainModel.g:1955:1: rule__Constant__Group_4__4__Impl : ( '/' ) ;
    public final void rule__Constant__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1959:1: ( ( '/' ) )
            // InternalDomainModel.g:1960:1: ( '/' )
            {
            // InternalDomainModel.g:1960:1: ( '/' )
            // InternalDomainModel.g:1961:2: '/'
            {
             before(grammarAccess.getConstantAccess().getSolidusKeyword_4_4()); 
            match(input,28,FOLLOW_2); 
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
    // InternalDomainModel.g:1970:1: rule__Constant__Group_4__5 : rule__Constant__Group_4__5__Impl ;
    public final void rule__Constant__Group_4__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1974:1: ( rule__Constant__Group_4__5__Impl )
            // InternalDomainModel.g:1975:2: rule__Constant__Group_4__5__Impl
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
    // InternalDomainModel.g:1981:1: rule__Constant__Group_4__5__Impl : ( ( rule__Constant__YearAssignment_4_5 ) ) ;
    public final void rule__Constant__Group_4__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1985:1: ( ( ( rule__Constant__YearAssignment_4_5 ) ) )
            // InternalDomainModel.g:1986:1: ( ( rule__Constant__YearAssignment_4_5 ) )
            {
            // InternalDomainModel.g:1986:1: ( ( rule__Constant__YearAssignment_4_5 ) )
            // InternalDomainModel.g:1987:2: ( rule__Constant__YearAssignment_4_5 )
            {
             before(grammarAccess.getConstantAccess().getYearAssignment_4_5()); 
            // InternalDomainModel.g:1988:2: ( rule__Constant__YearAssignment_4_5 )
            // InternalDomainModel.g:1988:3: rule__Constant__YearAssignment_4_5
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
    // InternalDomainModel.g:1997:1: rule__Constant__Group_5__0 : rule__Constant__Group_5__0__Impl rule__Constant__Group_5__1 ;
    public final void rule__Constant__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2001:1: ( rule__Constant__Group_5__0__Impl rule__Constant__Group_5__1 )
            // InternalDomainModel.g:2002:2: rule__Constant__Group_5__0__Impl rule__Constant__Group_5__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalDomainModel.g:2009:1: rule__Constant__Group_5__0__Impl : ( () ) ;
    public final void rule__Constant__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2013:1: ( ( () ) )
            // InternalDomainModel.g:2014:1: ( () )
            {
            // InternalDomainModel.g:2014:1: ( () )
            // InternalDomainModel.g:2015:2: ()
            {
             before(grammarAccess.getConstantAccess().getDecimalConstantAction_5_0()); 
            // InternalDomainModel.g:2016:2: ()
            // InternalDomainModel.g:2016:3: 
            {
            }

             after(grammarAccess.getConstantAccess().getDecimalConstantAction_5_0()); 

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
    // InternalDomainModel.g:2024:1: rule__Constant__Group_5__1 : rule__Constant__Group_5__1__Impl ;
    public final void rule__Constant__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2028:1: ( rule__Constant__Group_5__1__Impl )
            // InternalDomainModel.g:2029:2: rule__Constant__Group_5__1__Impl
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
    // InternalDomainModel.g:2035:1: rule__Constant__Group_5__1__Impl : ( ( rule__Constant__ValueAssignment_5_1 ) ) ;
    public final void rule__Constant__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2039:1: ( ( ( rule__Constant__ValueAssignment_5_1 ) ) )
            // InternalDomainModel.g:2040:1: ( ( rule__Constant__ValueAssignment_5_1 ) )
            {
            // InternalDomainModel.g:2040:1: ( ( rule__Constant__ValueAssignment_5_1 ) )
            // InternalDomainModel.g:2041:2: ( rule__Constant__ValueAssignment_5_1 )
            {
             before(grammarAccess.getConstantAccess().getValueAssignment_5_1()); 
            // InternalDomainModel.g:2042:2: ( rule__Constant__ValueAssignment_5_1 )
            // InternalDomainModel.g:2042:3: rule__Constant__ValueAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Constant__ValueAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getValueAssignment_5_1()); 

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


    // $ANTLR start "rule__Constant__Group_6__0"
    // InternalDomainModel.g:2051:1: rule__Constant__Group_6__0 : rule__Constant__Group_6__0__Impl rule__Constant__Group_6__1 ;
    public final void rule__Constant__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2055:1: ( rule__Constant__Group_6__0__Impl rule__Constant__Group_6__1 )
            // InternalDomainModel.g:2056:2: rule__Constant__Group_6__0__Impl rule__Constant__Group_6__1
            {
            pushFollow(FOLLOW_15);
            rule__Constant__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant__Group_6__1();

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
    // $ANTLR end "rule__Constant__Group_6__0"


    // $ANTLR start "rule__Constant__Group_6__0__Impl"
    // InternalDomainModel.g:2063:1: rule__Constant__Group_6__0__Impl : ( () ) ;
    public final void rule__Constant__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2067:1: ( ( () ) )
            // InternalDomainModel.g:2068:1: ( () )
            {
            // InternalDomainModel.g:2068:1: ( () )
            // InternalDomainModel.g:2069:2: ()
            {
             before(grammarAccess.getConstantAccess().getNullAction_6_0()); 
            // InternalDomainModel.g:2070:2: ()
            // InternalDomainModel.g:2070:3: 
            {
            }

             after(grammarAccess.getConstantAccess().getNullAction_6_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group_6__0__Impl"


    // $ANTLR start "rule__Constant__Group_6__1"
    // InternalDomainModel.g:2078:1: rule__Constant__Group_6__1 : rule__Constant__Group_6__1__Impl ;
    public final void rule__Constant__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2082:1: ( rule__Constant__Group_6__1__Impl )
            // InternalDomainModel.g:2083:2: rule__Constant__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Group_6__1__Impl();

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
    // $ANTLR end "rule__Constant__Group_6__1"


    // $ANTLR start "rule__Constant__Group_6__1__Impl"
    // InternalDomainModel.g:2089:1: rule__Constant__Group_6__1__Impl : ( 'null' ) ;
    public final void rule__Constant__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2093:1: ( ( 'null' ) )
            // InternalDomainModel.g:2094:1: ( 'null' )
            {
            // InternalDomainModel.g:2094:1: ( 'null' )
            // InternalDomainModel.g:2095:2: 'null'
            {
             before(grammarAccess.getConstantAccess().getNullKeyword_6_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getNullKeyword_6_1()); 

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
    // $ANTLR end "rule__Constant__Group_6__1__Impl"


    // $ANTLR start "rule__EntityOption__Group_0__0"
    // InternalDomainModel.g:2105:1: rule__EntityOption__Group_0__0 : rule__EntityOption__Group_0__0__Impl rule__EntityOption__Group_0__1 ;
    public final void rule__EntityOption__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2109:1: ( rule__EntityOption__Group_0__0__Impl rule__EntityOption__Group_0__1 )
            // InternalDomainModel.g:2110:2: rule__EntityOption__Group_0__0__Impl rule__EntityOption__Group_0__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalDomainModel.g:2117:1: rule__EntityOption__Group_0__0__Impl : ( () ) ;
    public final void rule__EntityOption__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2121:1: ( ( () ) )
            // InternalDomainModel.g:2122:1: ( () )
            {
            // InternalDomainModel.g:2122:1: ( () )
            // InternalDomainModel.g:2123:2: ()
            {
             before(grammarAccess.getEntityOptionAccess().getEntityDeleteOptionAction_0_0()); 
            // InternalDomainModel.g:2124:2: ()
            // InternalDomainModel.g:2124:3: 
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
    // InternalDomainModel.g:2132:1: rule__EntityOption__Group_0__1 : rule__EntityOption__Group_0__1__Impl ;
    public final void rule__EntityOption__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2136:1: ( rule__EntityOption__Group_0__1__Impl )
            // InternalDomainModel.g:2137:2: rule__EntityOption__Group_0__1__Impl
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
    // InternalDomainModel.g:2143:1: rule__EntityOption__Group_0__1__Impl : ( ( rule__EntityOption__DeleteByFlagAssignment_0_1 ) ) ;
    public final void rule__EntityOption__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2147:1: ( ( ( rule__EntityOption__DeleteByFlagAssignment_0_1 ) ) )
            // InternalDomainModel.g:2148:1: ( ( rule__EntityOption__DeleteByFlagAssignment_0_1 ) )
            {
            // InternalDomainModel.g:2148:1: ( ( rule__EntityOption__DeleteByFlagAssignment_0_1 ) )
            // InternalDomainModel.g:2149:2: ( rule__EntityOption__DeleteByFlagAssignment_0_1 )
            {
             before(grammarAccess.getEntityOptionAccess().getDeleteByFlagAssignment_0_1()); 
            // InternalDomainModel.g:2150:2: ( rule__EntityOption__DeleteByFlagAssignment_0_1 )
            // InternalDomainModel.g:2150:3: rule__EntityOption__DeleteByFlagAssignment_0_1
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
    // InternalDomainModel.g:2159:1: rule__EntityOption__Group_1__0 : rule__EntityOption__Group_1__0__Impl rule__EntityOption__Group_1__1 ;
    public final void rule__EntityOption__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2163:1: ( rule__EntityOption__Group_1__0__Impl rule__EntityOption__Group_1__1 )
            // InternalDomainModel.g:2164:2: rule__EntityOption__Group_1__0__Impl rule__EntityOption__Group_1__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalDomainModel.g:2171:1: rule__EntityOption__Group_1__0__Impl : ( () ) ;
    public final void rule__EntityOption__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2175:1: ( ( () ) )
            // InternalDomainModel.g:2176:1: ( () )
            {
            // InternalDomainModel.g:2176:1: ( () )
            // InternalDomainModel.g:2177:2: ()
            {
             before(grammarAccess.getEntityOptionAccess().getInheritanceMappingOptionAction_1_0()); 
            // InternalDomainModel.g:2178:2: ()
            // InternalDomainModel.g:2178:3: 
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
    // InternalDomainModel.g:2186:1: rule__EntityOption__Group_1__1 : rule__EntityOption__Group_1__1__Impl rule__EntityOption__Group_1__2 ;
    public final void rule__EntityOption__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2190:1: ( rule__EntityOption__Group_1__1__Impl rule__EntityOption__Group_1__2 )
            // InternalDomainModel.g:2191:2: rule__EntityOption__Group_1__1__Impl rule__EntityOption__Group_1__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalDomainModel.g:2198:1: rule__EntityOption__Group_1__1__Impl : ( 'inheritance' ) ;
    public final void rule__EntityOption__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2202:1: ( ( 'inheritance' ) )
            // InternalDomainModel.g:2203:1: ( 'inheritance' )
            {
            // InternalDomainModel.g:2203:1: ( 'inheritance' )
            // InternalDomainModel.g:2204:2: 'inheritance'
            {
             before(grammarAccess.getEntityOptionAccess().getInheritanceKeyword_1_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalDomainModel.g:2213:1: rule__EntityOption__Group_1__2 : rule__EntityOption__Group_1__2__Impl rule__EntityOption__Group_1__3 ;
    public final void rule__EntityOption__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2217:1: ( rule__EntityOption__Group_1__2__Impl rule__EntityOption__Group_1__3 )
            // InternalDomainModel.g:2218:2: rule__EntityOption__Group_1__2__Impl rule__EntityOption__Group_1__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalDomainModel.g:2225:1: rule__EntityOption__Group_1__2__Impl : ( '=' ) ;
    public final void rule__EntityOption__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2229:1: ( ( '=' ) )
            // InternalDomainModel.g:2230:1: ( '=' )
            {
            // InternalDomainModel.g:2230:1: ( '=' )
            // InternalDomainModel.g:2231:2: '='
            {
             before(grammarAccess.getEntityOptionAccess().getEqualsSignKeyword_1_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalDomainModel.g:2240:1: rule__EntityOption__Group_1__3 : rule__EntityOption__Group_1__3__Impl ;
    public final void rule__EntityOption__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2244:1: ( rule__EntityOption__Group_1__3__Impl )
            // InternalDomainModel.g:2245:2: rule__EntityOption__Group_1__3__Impl
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
    // InternalDomainModel.g:2251:1: rule__EntityOption__Group_1__3__Impl : ( ( rule__EntityOption__InheritanceMappingAssignment_1_3 ) ) ;
    public final void rule__EntityOption__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2255:1: ( ( ( rule__EntityOption__InheritanceMappingAssignment_1_3 ) ) )
            // InternalDomainModel.g:2256:1: ( ( rule__EntityOption__InheritanceMappingAssignment_1_3 ) )
            {
            // InternalDomainModel.g:2256:1: ( ( rule__EntityOption__InheritanceMappingAssignment_1_3 ) )
            // InternalDomainModel.g:2257:2: ( rule__EntityOption__InheritanceMappingAssignment_1_3 )
            {
             before(grammarAccess.getEntityOptionAccess().getInheritanceMappingAssignment_1_3()); 
            // InternalDomainModel.g:2258:2: ( rule__EntityOption__InheritanceMappingAssignment_1_3 )
            // InternalDomainModel.g:2258:3: rule__EntityOption__InheritanceMappingAssignment_1_3
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
    // InternalDomainModel.g:2267:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2271:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalDomainModel.g:2272:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalDomainModel.g:2279:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__TypeAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2283:1: ( ( ( rule__Attribute__TypeAssignment_0 ) ) )
            // InternalDomainModel.g:2284:1: ( ( rule__Attribute__TypeAssignment_0 ) )
            {
            // InternalDomainModel.g:2284:1: ( ( rule__Attribute__TypeAssignment_0 ) )
            // InternalDomainModel.g:2285:2: ( rule__Attribute__TypeAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_0()); 
            // InternalDomainModel.g:2286:2: ( rule__Attribute__TypeAssignment_0 )
            // InternalDomainModel.g:2286:3: rule__Attribute__TypeAssignment_0
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
    // InternalDomainModel.g:2294:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2298:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalDomainModel.g:2299:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalDomainModel.g:2306:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2310:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalDomainModel.g:2311:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalDomainModel.g:2311:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalDomainModel.g:2312:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalDomainModel.g:2313:2: ( rule__Attribute__NameAssignment_1 )
            // InternalDomainModel.g:2313:3: rule__Attribute__NameAssignment_1
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
    // InternalDomainModel.g:2321:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2325:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalDomainModel.g:2326:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalDomainModel.g:2333:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__Group_2__0 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2337:1: ( ( ( rule__Attribute__Group_2__0 )? ) )
            // InternalDomainModel.g:2338:1: ( ( rule__Attribute__Group_2__0 )? )
            {
            // InternalDomainModel.g:2338:1: ( ( rule__Attribute__Group_2__0 )? )
            // InternalDomainModel.g:2339:2: ( rule__Attribute__Group_2__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_2()); 
            // InternalDomainModel.g:2340:2: ( rule__Attribute__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=42 && LA20_0<=43)||(LA20_0>=46 && LA20_0<=47)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDomainModel.g:2340:3: rule__Attribute__Group_2__0
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
    // InternalDomainModel.g:2348:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2352:1: ( rule__Attribute__Group__3__Impl )
            // InternalDomainModel.g:2353:2: rule__Attribute__Group__3__Impl
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
    // InternalDomainModel.g:2359:1: rule__Attribute__Group__3__Impl : ( ';' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2363:1: ( ( ';' ) )
            // InternalDomainModel.g:2364:1: ( ';' )
            {
            // InternalDomainModel.g:2364:1: ( ';' )
            // InternalDomainModel.g:2365:2: ';'
            {
             before(grammarAccess.getAttributeAccess().getSemicolonKeyword_3()); 
            match(input,32,FOLLOW_2); 
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
    // InternalDomainModel.g:2375:1: rule__Attribute__Group_2__0 : rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1 ;
    public final void rule__Attribute__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2379:1: ( rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1 )
            // InternalDomainModel.g:2380:2: rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalDomainModel.g:2387:1: rule__Attribute__Group_2__0__Impl : ( ( rule__Attribute__OptionsAssignment_2_0 ) ) ;
    public final void rule__Attribute__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2391:1: ( ( ( rule__Attribute__OptionsAssignment_2_0 ) ) )
            // InternalDomainModel.g:2392:1: ( ( rule__Attribute__OptionsAssignment_2_0 ) )
            {
            // InternalDomainModel.g:2392:1: ( ( rule__Attribute__OptionsAssignment_2_0 ) )
            // InternalDomainModel.g:2393:2: ( rule__Attribute__OptionsAssignment_2_0 )
            {
             before(grammarAccess.getAttributeAccess().getOptionsAssignment_2_0()); 
            // InternalDomainModel.g:2394:2: ( rule__Attribute__OptionsAssignment_2_0 )
            // InternalDomainModel.g:2394:3: rule__Attribute__OptionsAssignment_2_0
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
    // InternalDomainModel.g:2402:1: rule__Attribute__Group_2__1 : rule__Attribute__Group_2__1__Impl ;
    public final void rule__Attribute__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2406:1: ( rule__Attribute__Group_2__1__Impl )
            // InternalDomainModel.g:2407:2: rule__Attribute__Group_2__1__Impl
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
    // InternalDomainModel.g:2413:1: rule__Attribute__Group_2__1__Impl : ( ( rule__Attribute__Group_2_1__0 )* ) ;
    public final void rule__Attribute__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2417:1: ( ( ( rule__Attribute__Group_2_1__0 )* ) )
            // InternalDomainModel.g:2418:1: ( ( rule__Attribute__Group_2_1__0 )* )
            {
            // InternalDomainModel.g:2418:1: ( ( rule__Attribute__Group_2_1__0 )* )
            // InternalDomainModel.g:2419:2: ( rule__Attribute__Group_2_1__0 )*
            {
             before(grammarAccess.getAttributeAccess().getGroup_2_1()); 
            // InternalDomainModel.g:2420:2: ( rule__Attribute__Group_2_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==25) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalDomainModel.g:2420:3: rule__Attribute__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Attribute__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalDomainModel.g:2429:1: rule__Attribute__Group_2_1__0 : rule__Attribute__Group_2_1__0__Impl rule__Attribute__Group_2_1__1 ;
    public final void rule__Attribute__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2433:1: ( rule__Attribute__Group_2_1__0__Impl rule__Attribute__Group_2_1__1 )
            // InternalDomainModel.g:2434:2: rule__Attribute__Group_2_1__0__Impl rule__Attribute__Group_2_1__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalDomainModel.g:2441:1: rule__Attribute__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Attribute__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2445:1: ( ( ',' ) )
            // InternalDomainModel.g:2446:1: ( ',' )
            {
            // InternalDomainModel.g:2446:1: ( ',' )
            // InternalDomainModel.g:2447:2: ','
            {
             before(grammarAccess.getAttributeAccess().getCommaKeyword_2_1_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalDomainModel.g:2456:1: rule__Attribute__Group_2_1__1 : rule__Attribute__Group_2_1__1__Impl ;
    public final void rule__Attribute__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2460:1: ( rule__Attribute__Group_2_1__1__Impl )
            // InternalDomainModel.g:2461:2: rule__Attribute__Group_2_1__1__Impl
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
    // InternalDomainModel.g:2467:1: rule__Attribute__Group_2_1__1__Impl : ( ( rule__Attribute__OptionsAssignment_2_1_1 ) ) ;
    public final void rule__Attribute__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2471:1: ( ( ( rule__Attribute__OptionsAssignment_2_1_1 ) ) )
            // InternalDomainModel.g:2472:1: ( ( rule__Attribute__OptionsAssignment_2_1_1 ) )
            {
            // InternalDomainModel.g:2472:1: ( ( rule__Attribute__OptionsAssignment_2_1_1 ) )
            // InternalDomainModel.g:2473:2: ( rule__Attribute__OptionsAssignment_2_1_1 )
            {
             before(grammarAccess.getAttributeAccess().getOptionsAssignment_2_1_1()); 
            // InternalDomainModel.g:2474:2: ( rule__Attribute__OptionsAssignment_2_1_1 )
            // InternalDomainModel.g:2474:3: rule__Attribute__OptionsAssignment_2_1_1
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


    // $ANTLR start "rule__BasicType__Group_0__0"
    // InternalDomainModel.g:2483:1: rule__BasicType__Group_0__0 : rule__BasicType__Group_0__0__Impl rule__BasicType__Group_0__1 ;
    public final void rule__BasicType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2487:1: ( rule__BasicType__Group_0__0__Impl rule__BasicType__Group_0__1 )
            // InternalDomainModel.g:2488:2: rule__BasicType__Group_0__0__Impl rule__BasicType__Group_0__1
            {
            pushFollow(FOLLOW_27);
            rule__BasicType__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicType__Group_0__1();

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
    // $ANTLR end "rule__BasicType__Group_0__0"


    // $ANTLR start "rule__BasicType__Group_0__0__Impl"
    // InternalDomainModel.g:2495:1: rule__BasicType__Group_0__0__Impl : ( () ) ;
    public final void rule__BasicType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2499:1: ( ( () ) )
            // InternalDomainModel.g:2500:1: ( () )
            {
            // InternalDomainModel.g:2500:1: ( () )
            // InternalDomainModel.g:2501:2: ()
            {
             before(grammarAccess.getBasicTypeAccess().getStringTypeAction_0_0()); 
            // InternalDomainModel.g:2502:2: ()
            // InternalDomainModel.g:2502:3: 
            {
            }

             after(grammarAccess.getBasicTypeAccess().getStringTypeAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicType__Group_0__0__Impl"


    // $ANTLR start "rule__BasicType__Group_0__1"
    // InternalDomainModel.g:2510:1: rule__BasicType__Group_0__1 : rule__BasicType__Group_0__1__Impl ;
    public final void rule__BasicType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2514:1: ( rule__BasicType__Group_0__1__Impl )
            // InternalDomainModel.g:2515:2: rule__BasicType__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicType__Group_0__1__Impl();

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
    // $ANTLR end "rule__BasicType__Group_0__1"


    // $ANTLR start "rule__BasicType__Group_0__1__Impl"
    // InternalDomainModel.g:2521:1: rule__BasicType__Group_0__1__Impl : ( 'string' ) ;
    public final void rule__BasicType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2525:1: ( ( 'string' ) )
            // InternalDomainModel.g:2526:1: ( 'string' )
            {
            // InternalDomainModel.g:2526:1: ( 'string' )
            // InternalDomainModel.g:2527:2: 'string'
            {
             before(grammarAccess.getBasicTypeAccess().getStringKeyword_0_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getBasicTypeAccess().getStringKeyword_0_1()); 

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
    // $ANTLR end "rule__BasicType__Group_0__1__Impl"


    // $ANTLR start "rule__BasicType__Group_1__0"
    // InternalDomainModel.g:2537:1: rule__BasicType__Group_1__0 : rule__BasicType__Group_1__0__Impl rule__BasicType__Group_1__1 ;
    public final void rule__BasicType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2541:1: ( rule__BasicType__Group_1__0__Impl rule__BasicType__Group_1__1 )
            // InternalDomainModel.g:2542:2: rule__BasicType__Group_1__0__Impl rule__BasicType__Group_1__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalDomainModel.g:2549:1: rule__BasicType__Group_1__0__Impl : ( () ) ;
    public final void rule__BasicType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2553:1: ( ( () ) )
            // InternalDomainModel.g:2554:1: ( () )
            {
            // InternalDomainModel.g:2554:1: ( () )
            // InternalDomainModel.g:2555:2: ()
            {
             before(grammarAccess.getBasicTypeAccess().getIntTypeAction_1_0()); 
            // InternalDomainModel.g:2556:2: ()
            // InternalDomainModel.g:2556:3: 
            {
            }

             after(grammarAccess.getBasicTypeAccess().getIntTypeAction_1_0()); 

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
    // InternalDomainModel.g:2564:1: rule__BasicType__Group_1__1 : rule__BasicType__Group_1__1__Impl ;
    public final void rule__BasicType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2568:1: ( rule__BasicType__Group_1__1__Impl )
            // InternalDomainModel.g:2569:2: rule__BasicType__Group_1__1__Impl
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
    // InternalDomainModel.g:2575:1: rule__BasicType__Group_1__1__Impl : ( 'int' ) ;
    public final void rule__BasicType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2579:1: ( ( 'int' ) )
            // InternalDomainModel.g:2580:1: ( 'int' )
            {
            // InternalDomainModel.g:2580:1: ( 'int' )
            // InternalDomainModel.g:2581:2: 'int'
            {
             before(grammarAccess.getBasicTypeAccess().getIntKeyword_1_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getBasicTypeAccess().getIntKeyword_1_1()); 

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
    // InternalDomainModel.g:2591:1: rule__BasicType__Group_2__0 : rule__BasicType__Group_2__0__Impl rule__BasicType__Group_2__1 ;
    public final void rule__BasicType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2595:1: ( rule__BasicType__Group_2__0__Impl rule__BasicType__Group_2__1 )
            // InternalDomainModel.g:2596:2: rule__BasicType__Group_2__0__Impl rule__BasicType__Group_2__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalDomainModel.g:2603:1: rule__BasicType__Group_2__0__Impl : ( () ) ;
    public final void rule__BasicType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2607:1: ( ( () ) )
            // InternalDomainModel.g:2608:1: ( () )
            {
            // InternalDomainModel.g:2608:1: ( () )
            // InternalDomainModel.g:2609:2: ()
            {
             before(grammarAccess.getBasicTypeAccess().getLongTypeAction_2_0()); 
            // InternalDomainModel.g:2610:2: ()
            // InternalDomainModel.g:2610:3: 
            {
            }

             after(grammarAccess.getBasicTypeAccess().getLongTypeAction_2_0()); 

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
    // InternalDomainModel.g:2618:1: rule__BasicType__Group_2__1 : rule__BasicType__Group_2__1__Impl ;
    public final void rule__BasicType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2622:1: ( rule__BasicType__Group_2__1__Impl )
            // InternalDomainModel.g:2623:2: rule__BasicType__Group_2__1__Impl
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
    // InternalDomainModel.g:2629:1: rule__BasicType__Group_2__1__Impl : ( 'long' ) ;
    public final void rule__BasicType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2633:1: ( ( 'long' ) )
            // InternalDomainModel.g:2634:1: ( 'long' )
            {
            // InternalDomainModel.g:2634:1: ( 'long' )
            // InternalDomainModel.g:2635:2: 'long'
            {
             before(grammarAccess.getBasicTypeAccess().getLongKeyword_2_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getBasicTypeAccess().getLongKeyword_2_1()); 

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
    // InternalDomainModel.g:2645:1: rule__BasicType__Group_3__0 : rule__BasicType__Group_3__0__Impl rule__BasicType__Group_3__1 ;
    public final void rule__BasicType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2649:1: ( rule__BasicType__Group_3__0__Impl rule__BasicType__Group_3__1 )
            // InternalDomainModel.g:2650:2: rule__BasicType__Group_3__0__Impl rule__BasicType__Group_3__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalDomainModel.g:2657:1: rule__BasicType__Group_3__0__Impl : ( () ) ;
    public final void rule__BasicType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2661:1: ( ( () ) )
            // InternalDomainModel.g:2662:1: ( () )
            {
            // InternalDomainModel.g:2662:1: ( () )
            // InternalDomainModel.g:2663:2: ()
            {
             before(grammarAccess.getBasicTypeAccess().getBoolTypeAction_3_0()); 
            // InternalDomainModel.g:2664:2: ()
            // InternalDomainModel.g:2664:3: 
            {
            }

             after(grammarAccess.getBasicTypeAccess().getBoolTypeAction_3_0()); 

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
    // InternalDomainModel.g:2672:1: rule__BasicType__Group_3__1 : rule__BasicType__Group_3__1__Impl ;
    public final void rule__BasicType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2676:1: ( rule__BasicType__Group_3__1__Impl )
            // InternalDomainModel.g:2677:2: rule__BasicType__Group_3__1__Impl
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
    // InternalDomainModel.g:2683:1: rule__BasicType__Group_3__1__Impl : ( 'boolean' ) ;
    public final void rule__BasicType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2687:1: ( ( 'boolean' ) )
            // InternalDomainModel.g:2688:1: ( 'boolean' )
            {
            // InternalDomainModel.g:2688:1: ( 'boolean' )
            // InternalDomainModel.g:2689:2: 'boolean'
            {
             before(grammarAccess.getBasicTypeAccess().getBooleanKeyword_3_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getBasicTypeAccess().getBooleanKeyword_3_1()); 

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
    // InternalDomainModel.g:2699:1: rule__BasicType__Group_4__0 : rule__BasicType__Group_4__0__Impl rule__BasicType__Group_4__1 ;
    public final void rule__BasicType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2703:1: ( rule__BasicType__Group_4__0__Impl rule__BasicType__Group_4__1 )
            // InternalDomainModel.g:2704:2: rule__BasicType__Group_4__0__Impl rule__BasicType__Group_4__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalDomainModel.g:2711:1: rule__BasicType__Group_4__0__Impl : ( () ) ;
    public final void rule__BasicType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2715:1: ( ( () ) )
            // InternalDomainModel.g:2716:1: ( () )
            {
            // InternalDomainModel.g:2716:1: ( () )
            // InternalDomainModel.g:2717:2: ()
            {
             before(grammarAccess.getBasicTypeAccess().getDateTypeAction_4_0()); 
            // InternalDomainModel.g:2718:2: ()
            // InternalDomainModel.g:2718:3: 
            {
            }

             after(grammarAccess.getBasicTypeAccess().getDateTypeAction_4_0()); 

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
    // InternalDomainModel.g:2726:1: rule__BasicType__Group_4__1 : rule__BasicType__Group_4__1__Impl ;
    public final void rule__BasicType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2730:1: ( rule__BasicType__Group_4__1__Impl )
            // InternalDomainModel.g:2731:2: rule__BasicType__Group_4__1__Impl
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
    // InternalDomainModel.g:2737:1: rule__BasicType__Group_4__1__Impl : ( 'date' ) ;
    public final void rule__BasicType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2741:1: ( ( 'date' ) )
            // InternalDomainModel.g:2742:1: ( 'date' )
            {
            // InternalDomainModel.g:2742:1: ( 'date' )
            // InternalDomainModel.g:2743:2: 'date'
            {
             before(grammarAccess.getBasicTypeAccess().getDateKeyword_4_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getBasicTypeAccess().getDateKeyword_4_1()); 

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
    // InternalDomainModel.g:2753:1: rule__BasicType__Group_5__0 : rule__BasicType__Group_5__0__Impl rule__BasicType__Group_5__1 ;
    public final void rule__BasicType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2757:1: ( rule__BasicType__Group_5__0__Impl rule__BasicType__Group_5__1 )
            // InternalDomainModel.g:2758:2: rule__BasicType__Group_5__0__Impl rule__BasicType__Group_5__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalDomainModel.g:2765:1: rule__BasicType__Group_5__0__Impl : ( () ) ;
    public final void rule__BasicType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2769:1: ( ( () ) )
            // InternalDomainModel.g:2770:1: ( () )
            {
            // InternalDomainModel.g:2770:1: ( () )
            // InternalDomainModel.g:2771:2: ()
            {
             before(grammarAccess.getBasicTypeAccess().getDecimalTypeAction_5_0()); 
            // InternalDomainModel.g:2772:2: ()
            // InternalDomainModel.g:2772:3: 
            {
            }

             after(grammarAccess.getBasicTypeAccess().getDecimalTypeAction_5_0()); 

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
    // InternalDomainModel.g:2780:1: rule__BasicType__Group_5__1 : rule__BasicType__Group_5__1__Impl ;
    public final void rule__BasicType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2784:1: ( rule__BasicType__Group_5__1__Impl )
            // InternalDomainModel.g:2785:2: rule__BasicType__Group_5__1__Impl
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
    // InternalDomainModel.g:2791:1: rule__BasicType__Group_5__1__Impl : ( 'decimal' ) ;
    public final void rule__BasicType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2795:1: ( ( 'decimal' ) )
            // InternalDomainModel.g:2796:1: ( 'decimal' )
            {
            // InternalDomainModel.g:2796:1: ( 'decimal' )
            // InternalDomainModel.g:2797:2: 'decimal'
            {
             before(grammarAccess.getBasicTypeAccess().getDecimalKeyword_5_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getBasicTypeAccess().getDecimalKeyword_5_1()); 

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


    // $ANTLR start "rule__CollectionType__Group__0"
    // InternalDomainModel.g:2807:1: rule__CollectionType__Group__0 : rule__CollectionType__Group__0__Impl rule__CollectionType__Group__1 ;
    public final void rule__CollectionType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2811:1: ( rule__CollectionType__Group__0__Impl rule__CollectionType__Group__1 )
            // InternalDomainModel.g:2812:2: rule__CollectionType__Group__0__Impl rule__CollectionType__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalDomainModel.g:2819:1: rule__CollectionType__Group__0__Impl : ( 'List' ) ;
    public final void rule__CollectionType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2823:1: ( ( 'List' ) )
            // InternalDomainModel.g:2824:1: ( 'List' )
            {
            // InternalDomainModel.g:2824:1: ( 'List' )
            // InternalDomainModel.g:2825:2: 'List'
            {
             before(grammarAccess.getCollectionTypeAccess().getListKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalDomainModel.g:2834:1: rule__CollectionType__Group__1 : rule__CollectionType__Group__1__Impl rule__CollectionType__Group__2 ;
    public final void rule__CollectionType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2838:1: ( rule__CollectionType__Group__1__Impl rule__CollectionType__Group__2 )
            // InternalDomainModel.g:2839:2: rule__CollectionType__Group__1__Impl rule__CollectionType__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalDomainModel.g:2846:1: rule__CollectionType__Group__1__Impl : ( '<' ) ;
    public final void rule__CollectionType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2850:1: ( ( '<' ) )
            // InternalDomainModel.g:2851:1: ( '<' )
            {
            // InternalDomainModel.g:2851:1: ( '<' )
            // InternalDomainModel.g:2852:2: '<'
            {
             before(grammarAccess.getCollectionTypeAccess().getLessThanSignKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalDomainModel.g:2861:1: rule__CollectionType__Group__2 : rule__CollectionType__Group__2__Impl rule__CollectionType__Group__3 ;
    public final void rule__CollectionType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2865:1: ( rule__CollectionType__Group__2__Impl rule__CollectionType__Group__3 )
            // InternalDomainModel.g:2866:2: rule__CollectionType__Group__2__Impl rule__CollectionType__Group__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalDomainModel.g:2873:1: rule__CollectionType__Group__2__Impl : ( ( rule__CollectionType__OfTypeAssignment_2 ) ) ;
    public final void rule__CollectionType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2877:1: ( ( ( rule__CollectionType__OfTypeAssignment_2 ) ) )
            // InternalDomainModel.g:2878:1: ( ( rule__CollectionType__OfTypeAssignment_2 ) )
            {
            // InternalDomainModel.g:2878:1: ( ( rule__CollectionType__OfTypeAssignment_2 ) )
            // InternalDomainModel.g:2879:2: ( rule__CollectionType__OfTypeAssignment_2 )
            {
             before(grammarAccess.getCollectionTypeAccess().getOfTypeAssignment_2()); 
            // InternalDomainModel.g:2880:2: ( rule__CollectionType__OfTypeAssignment_2 )
            // InternalDomainModel.g:2880:3: rule__CollectionType__OfTypeAssignment_2
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
    // InternalDomainModel.g:2888:1: rule__CollectionType__Group__3 : rule__CollectionType__Group__3__Impl ;
    public final void rule__CollectionType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2892:1: ( rule__CollectionType__Group__3__Impl )
            // InternalDomainModel.g:2893:2: rule__CollectionType__Group__3__Impl
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
    // InternalDomainModel.g:2899:1: rule__CollectionType__Group__3__Impl : ( '>' ) ;
    public final void rule__CollectionType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2903:1: ( ( '>' ) )
            // InternalDomainModel.g:2904:1: ( '>' )
            {
            // InternalDomainModel.g:2904:1: ( '>' )
            // InternalDomainModel.g:2905:2: '>'
            {
             before(grammarAccess.getCollectionTypeAccess().getGreaterThanSignKeyword_3()); 
            match(input,41,FOLLOW_2); 
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
    // InternalDomainModel.g:2915:1: rule__AttributeOption__Group_0__0 : rule__AttributeOption__Group_0__0__Impl rule__AttributeOption__Group_0__1 ;
    public final void rule__AttributeOption__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2919:1: ( rule__AttributeOption__Group_0__0__Impl rule__AttributeOption__Group_0__1 )
            // InternalDomainModel.g:2920:2: rule__AttributeOption__Group_0__0__Impl rule__AttributeOption__Group_0__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalDomainModel.g:2927:1: rule__AttributeOption__Group_0__0__Impl : ( () ) ;
    public final void rule__AttributeOption__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2931:1: ( ( () ) )
            // InternalDomainModel.g:2932:1: ( () )
            {
            // InternalDomainModel.g:2932:1: ( () )
            // InternalDomainModel.g:2933:2: ()
            {
             before(grammarAccess.getAttributeOptionAccess().getRequiredAction_0_0()); 
            // InternalDomainModel.g:2934:2: ()
            // InternalDomainModel.g:2934:3: 
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
    // InternalDomainModel.g:2942:1: rule__AttributeOption__Group_0__1 : rule__AttributeOption__Group_0__1__Impl ;
    public final void rule__AttributeOption__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2946:1: ( rule__AttributeOption__Group_0__1__Impl )
            // InternalDomainModel.g:2947:2: rule__AttributeOption__Group_0__1__Impl
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
    // InternalDomainModel.g:2953:1: rule__AttributeOption__Group_0__1__Impl : ( ( rule__AttributeOption__RequiredAssignment_0_1 ) ) ;
    public final void rule__AttributeOption__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2957:1: ( ( ( rule__AttributeOption__RequiredAssignment_0_1 ) ) )
            // InternalDomainModel.g:2958:1: ( ( rule__AttributeOption__RequiredAssignment_0_1 ) )
            {
            // InternalDomainModel.g:2958:1: ( ( rule__AttributeOption__RequiredAssignment_0_1 ) )
            // InternalDomainModel.g:2959:2: ( rule__AttributeOption__RequiredAssignment_0_1 )
            {
             before(grammarAccess.getAttributeOptionAccess().getRequiredAssignment_0_1()); 
            // InternalDomainModel.g:2960:2: ( rule__AttributeOption__RequiredAssignment_0_1 )
            // InternalDomainModel.g:2960:3: rule__AttributeOption__RequiredAssignment_0_1
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
    // InternalDomainModel.g:2969:1: rule__AttributeOption__Group_1__0 : rule__AttributeOption__Group_1__0__Impl rule__AttributeOption__Group_1__1 ;
    public final void rule__AttributeOption__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2973:1: ( rule__AttributeOption__Group_1__0__Impl rule__AttributeOption__Group_1__1 )
            // InternalDomainModel.g:2974:2: rule__AttributeOption__Group_1__0__Impl rule__AttributeOption__Group_1__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalDomainModel.g:2981:1: rule__AttributeOption__Group_1__0__Impl : ( () ) ;
    public final void rule__AttributeOption__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2985:1: ( ( () ) )
            // InternalDomainModel.g:2986:1: ( () )
            {
            // InternalDomainModel.g:2986:1: ( () )
            // InternalDomainModel.g:2987:2: ()
            {
             before(grammarAccess.getAttributeOptionAccess().getPartOfAction_1_0()); 
            // InternalDomainModel.g:2988:2: ()
            // InternalDomainModel.g:2988:3: 
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
    // InternalDomainModel.g:2996:1: rule__AttributeOption__Group_1__1 : rule__AttributeOption__Group_1__1__Impl ;
    public final void rule__AttributeOption__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3000:1: ( rule__AttributeOption__Group_1__1__Impl )
            // InternalDomainModel.g:3001:2: rule__AttributeOption__Group_1__1__Impl
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
    // InternalDomainModel.g:3007:1: rule__AttributeOption__Group_1__1__Impl : ( ( rule__AttributeOption__PartOfAssignment_1_1 ) ) ;
    public final void rule__AttributeOption__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3011:1: ( ( ( rule__AttributeOption__PartOfAssignment_1_1 ) ) )
            // InternalDomainModel.g:3012:1: ( ( rule__AttributeOption__PartOfAssignment_1_1 ) )
            {
            // InternalDomainModel.g:3012:1: ( ( rule__AttributeOption__PartOfAssignment_1_1 ) )
            // InternalDomainModel.g:3013:2: ( rule__AttributeOption__PartOfAssignment_1_1 )
            {
             before(grammarAccess.getAttributeOptionAccess().getPartOfAssignment_1_1()); 
            // InternalDomainModel.g:3014:2: ( rule__AttributeOption__PartOfAssignment_1_1 )
            // InternalDomainModel.g:3014:3: rule__AttributeOption__PartOfAssignment_1_1
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
    // InternalDomainModel.g:3023:1: rule__AttributeOption__Group_2__0 : rule__AttributeOption__Group_2__0__Impl rule__AttributeOption__Group_2__1 ;
    public final void rule__AttributeOption__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3027:1: ( rule__AttributeOption__Group_2__0__Impl rule__AttributeOption__Group_2__1 )
            // InternalDomainModel.g:3028:2: rule__AttributeOption__Group_2__0__Impl rule__AttributeOption__Group_2__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalDomainModel.g:3035:1: rule__AttributeOption__Group_2__0__Impl : ( () ) ;
    public final void rule__AttributeOption__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3039:1: ( ( () ) )
            // InternalDomainModel.g:3040:1: ( () )
            {
            // InternalDomainModel.g:3040:1: ( () )
            // InternalDomainModel.g:3041:2: ()
            {
             before(grammarAccess.getAttributeOptionAccess().getRelationshipOwnerAction_2_0()); 
            // InternalDomainModel.g:3042:2: ()
            // InternalDomainModel.g:3042:3: 
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
    // InternalDomainModel.g:3050:1: rule__AttributeOption__Group_2__1 : rule__AttributeOption__Group_2__1__Impl rule__AttributeOption__Group_2__2 ;
    public final void rule__AttributeOption__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3054:1: ( rule__AttributeOption__Group_2__1__Impl rule__AttributeOption__Group_2__2 )
            // InternalDomainModel.g:3055:2: rule__AttributeOption__Group_2__1__Impl rule__AttributeOption__Group_2__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalDomainModel.g:3062:1: rule__AttributeOption__Group_2__1__Impl : ( 'relationshipOwner' ) ;
    public final void rule__AttributeOption__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3066:1: ( ( 'relationshipOwner' ) )
            // InternalDomainModel.g:3067:1: ( 'relationshipOwner' )
            {
            // InternalDomainModel.g:3067:1: ( 'relationshipOwner' )
            // InternalDomainModel.g:3068:2: 'relationshipOwner'
            {
             before(grammarAccess.getAttributeOptionAccess().getRelationshipOwnerKeyword_2_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalDomainModel.g:3077:1: rule__AttributeOption__Group_2__2 : rule__AttributeOption__Group_2__2__Impl rule__AttributeOption__Group_2__3 ;
    public final void rule__AttributeOption__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3081:1: ( rule__AttributeOption__Group_2__2__Impl rule__AttributeOption__Group_2__3 )
            // InternalDomainModel.g:3082:2: rule__AttributeOption__Group_2__2__Impl rule__AttributeOption__Group_2__3
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
    // InternalDomainModel.g:3089:1: rule__AttributeOption__Group_2__2__Impl : ( '=' ) ;
    public final void rule__AttributeOption__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3093:1: ( ( '=' ) )
            // InternalDomainModel.g:3094:1: ( '=' )
            {
            // InternalDomainModel.g:3094:1: ( '=' )
            // InternalDomainModel.g:3095:2: '='
            {
             before(grammarAccess.getAttributeOptionAccess().getEqualsSignKeyword_2_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalDomainModel.g:3104:1: rule__AttributeOption__Group_2__3 : rule__AttributeOption__Group_2__3__Impl ;
    public final void rule__AttributeOption__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3108:1: ( rule__AttributeOption__Group_2__3__Impl )
            // InternalDomainModel.g:3109:2: rule__AttributeOption__Group_2__3__Impl
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
    // InternalDomainModel.g:3115:1: rule__AttributeOption__Group_2__3__Impl : ( ( rule__AttributeOption__RelationshipOwnerAssignment_2_3 ) ) ;
    public final void rule__AttributeOption__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3119:1: ( ( ( rule__AttributeOption__RelationshipOwnerAssignment_2_3 ) ) )
            // InternalDomainModel.g:3120:1: ( ( rule__AttributeOption__RelationshipOwnerAssignment_2_3 ) )
            {
            // InternalDomainModel.g:3120:1: ( ( rule__AttributeOption__RelationshipOwnerAssignment_2_3 ) )
            // InternalDomainModel.g:3121:2: ( rule__AttributeOption__RelationshipOwnerAssignment_2_3 )
            {
             before(grammarAccess.getAttributeOptionAccess().getRelationshipOwnerAssignment_2_3()); 
            // InternalDomainModel.g:3122:2: ( rule__AttributeOption__RelationshipOwnerAssignment_2_3 )
            // InternalDomainModel.g:3122:3: rule__AttributeOption__RelationshipOwnerAssignment_2_3
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
    // InternalDomainModel.g:3131:1: rule__AttributeOption__Group_3__0 : rule__AttributeOption__Group_3__0__Impl rule__AttributeOption__Group_3__1 ;
    public final void rule__AttributeOption__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3135:1: ( rule__AttributeOption__Group_3__0__Impl rule__AttributeOption__Group_3__1 )
            // InternalDomainModel.g:3136:2: rule__AttributeOption__Group_3__0__Impl rule__AttributeOption__Group_3__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalDomainModel.g:3143:1: rule__AttributeOption__Group_3__0__Impl : ( () ) ;
    public final void rule__AttributeOption__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3147:1: ( ( () ) )
            // InternalDomainModel.g:3148:1: ( () )
            {
            // InternalDomainModel.g:3148:1: ( () )
            // InternalDomainModel.g:3149:2: ()
            {
             before(grammarAccess.getAttributeOptionAccess().getCardinalityAction_3_0()); 
            // InternalDomainModel.g:3150:2: ()
            // InternalDomainModel.g:3150:3: 
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
    // InternalDomainModel.g:3158:1: rule__AttributeOption__Group_3__1 : rule__AttributeOption__Group_3__1__Impl rule__AttributeOption__Group_3__2 ;
    public final void rule__AttributeOption__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3162:1: ( rule__AttributeOption__Group_3__1__Impl rule__AttributeOption__Group_3__2 )
            // InternalDomainModel.g:3163:2: rule__AttributeOption__Group_3__1__Impl rule__AttributeOption__Group_3__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalDomainModel.g:3170:1: rule__AttributeOption__Group_3__1__Impl : ( 'reverse_cardinality' ) ;
    public final void rule__AttributeOption__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3174:1: ( ( 'reverse_cardinality' ) )
            // InternalDomainModel.g:3175:1: ( 'reverse_cardinality' )
            {
            // InternalDomainModel.g:3175:1: ( 'reverse_cardinality' )
            // InternalDomainModel.g:3176:2: 'reverse_cardinality'
            {
             before(grammarAccess.getAttributeOptionAccess().getReverse_cardinalityKeyword_3_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalDomainModel.g:3185:1: rule__AttributeOption__Group_3__2 : rule__AttributeOption__Group_3__2__Impl rule__AttributeOption__Group_3__3 ;
    public final void rule__AttributeOption__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3189:1: ( rule__AttributeOption__Group_3__2__Impl rule__AttributeOption__Group_3__3 )
            // InternalDomainModel.g:3190:2: rule__AttributeOption__Group_3__2__Impl rule__AttributeOption__Group_3__3
            {
            pushFollow(FOLLOW_39);
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
    // InternalDomainModel.g:3197:1: rule__AttributeOption__Group_3__2__Impl : ( '=' ) ;
    public final void rule__AttributeOption__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3201:1: ( ( '=' ) )
            // InternalDomainModel.g:3202:1: ( '=' )
            {
            // InternalDomainModel.g:3202:1: ( '=' )
            // InternalDomainModel.g:3203:2: '='
            {
             before(grammarAccess.getAttributeOptionAccess().getEqualsSignKeyword_3_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalDomainModel.g:3212:1: rule__AttributeOption__Group_3__3 : rule__AttributeOption__Group_3__3__Impl ;
    public final void rule__AttributeOption__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3216:1: ( rule__AttributeOption__Group_3__3__Impl )
            // InternalDomainModel.g:3217:2: rule__AttributeOption__Group_3__3__Impl
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
    // InternalDomainModel.g:3223:1: rule__AttributeOption__Group_3__3__Impl : ( ( rule__AttributeOption__CardAssignment_3_3 ) ) ;
    public final void rule__AttributeOption__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3227:1: ( ( ( rule__AttributeOption__CardAssignment_3_3 ) ) )
            // InternalDomainModel.g:3228:1: ( ( rule__AttributeOption__CardAssignment_3_3 ) )
            {
            // InternalDomainModel.g:3228:1: ( ( rule__AttributeOption__CardAssignment_3_3 ) )
            // InternalDomainModel.g:3229:2: ( rule__AttributeOption__CardAssignment_3_3 )
            {
             before(grammarAccess.getAttributeOptionAccess().getCardAssignment_3_3()); 
            // InternalDomainModel.g:3230:2: ( rule__AttributeOption__CardAssignment_3_3 )
            // InternalDomainModel.g:3230:3: rule__AttributeOption__CardAssignment_3_3
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
    // InternalDomainModel.g:3239:1: rule__StaticFieldSelection__Group__0 : rule__StaticFieldSelection__Group__0__Impl rule__StaticFieldSelection__Group__1 ;
    public final void rule__StaticFieldSelection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3243:1: ( rule__StaticFieldSelection__Group__0__Impl rule__StaticFieldSelection__Group__1 )
            // InternalDomainModel.g:3244:2: rule__StaticFieldSelection__Group__0__Impl rule__StaticFieldSelection__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalDomainModel.g:3251:1: rule__StaticFieldSelection__Group__0__Impl : ( ( rule__StaticFieldSelection__ReceiverAssignment_0 ) ) ;
    public final void rule__StaticFieldSelection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3255:1: ( ( ( rule__StaticFieldSelection__ReceiverAssignment_0 ) ) )
            // InternalDomainModel.g:3256:1: ( ( rule__StaticFieldSelection__ReceiverAssignment_0 ) )
            {
            // InternalDomainModel.g:3256:1: ( ( rule__StaticFieldSelection__ReceiverAssignment_0 ) )
            // InternalDomainModel.g:3257:2: ( rule__StaticFieldSelection__ReceiverAssignment_0 )
            {
             before(grammarAccess.getStaticFieldSelectionAccess().getReceiverAssignment_0()); 
            // InternalDomainModel.g:3258:2: ( rule__StaticFieldSelection__ReceiverAssignment_0 )
            // InternalDomainModel.g:3258:3: rule__StaticFieldSelection__ReceiverAssignment_0
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
    // InternalDomainModel.g:3266:1: rule__StaticFieldSelection__Group__1 : rule__StaticFieldSelection__Group__1__Impl rule__StaticFieldSelection__Group__2 ;
    public final void rule__StaticFieldSelection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3270:1: ( rule__StaticFieldSelection__Group__1__Impl rule__StaticFieldSelection__Group__2 )
            // InternalDomainModel.g:3271:2: rule__StaticFieldSelection__Group__1__Impl rule__StaticFieldSelection__Group__2
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
    // InternalDomainModel.g:3278:1: rule__StaticFieldSelection__Group__1__Impl : ( '.' ) ;
    public final void rule__StaticFieldSelection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3282:1: ( ( '.' ) )
            // InternalDomainModel.g:3283:1: ( '.' )
            {
            // InternalDomainModel.g:3283:1: ( '.' )
            // InternalDomainModel.g:3284:2: '.'
            {
             before(grammarAccess.getStaticFieldSelectionAccess().getFullStopKeyword_1()); 
            match(input,44,FOLLOW_2); 
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
    // InternalDomainModel.g:3293:1: rule__StaticFieldSelection__Group__2 : rule__StaticFieldSelection__Group__2__Impl ;
    public final void rule__StaticFieldSelection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3297:1: ( rule__StaticFieldSelection__Group__2__Impl )
            // InternalDomainModel.g:3298:2: rule__StaticFieldSelection__Group__2__Impl
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
    // InternalDomainModel.g:3304:1: rule__StaticFieldSelection__Group__2__Impl : ( ( rule__StaticFieldSelection__MemberAssignment_2 ) ) ;
    public final void rule__StaticFieldSelection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3308:1: ( ( ( rule__StaticFieldSelection__MemberAssignment_2 ) ) )
            // InternalDomainModel.g:3309:1: ( ( rule__StaticFieldSelection__MemberAssignment_2 ) )
            {
            // InternalDomainModel.g:3309:1: ( ( rule__StaticFieldSelection__MemberAssignment_2 ) )
            // InternalDomainModel.g:3310:2: ( rule__StaticFieldSelection__MemberAssignment_2 )
            {
             before(grammarAccess.getStaticFieldSelectionAccess().getMemberAssignment_2()); 
            // InternalDomainModel.g:3311:2: ( rule__StaticFieldSelection__MemberAssignment_2 )
            // InternalDomainModel.g:3311:3: rule__StaticFieldSelection__MemberAssignment_2
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


    // $ANTLR start "rule__Decimal__Group__0"
    // InternalDomainModel.g:3320:1: rule__Decimal__Group__0 : rule__Decimal__Group__0__Impl rule__Decimal__Group__1 ;
    public final void rule__Decimal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3324:1: ( rule__Decimal__Group__0__Impl rule__Decimal__Group__1 )
            // InternalDomainModel.g:3325:2: rule__Decimal__Group__0__Impl rule__Decimal__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__Decimal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Decimal__Group__1();

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
    // $ANTLR end "rule__Decimal__Group__0"


    // $ANTLR start "rule__Decimal__Group__0__Impl"
    // InternalDomainModel.g:3332:1: rule__Decimal__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Decimal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3336:1: ( ( RULE_INT ) )
            // InternalDomainModel.g:3337:1: ( RULE_INT )
            {
            // InternalDomainModel.g:3337:1: ( RULE_INT )
            // InternalDomainModel.g:3338:2: RULE_INT
            {
             before(grammarAccess.getDecimalAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDecimalAccess().getINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Decimal__Group__0__Impl"


    // $ANTLR start "rule__Decimal__Group__1"
    // InternalDomainModel.g:3347:1: rule__Decimal__Group__1 : rule__Decimal__Group__1__Impl rule__Decimal__Group__2 ;
    public final void rule__Decimal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3351:1: ( rule__Decimal__Group__1__Impl rule__Decimal__Group__2 )
            // InternalDomainModel.g:3352:2: rule__Decimal__Group__1__Impl rule__Decimal__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Decimal__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Decimal__Group__2();

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
    // $ANTLR end "rule__Decimal__Group__1"


    // $ANTLR start "rule__Decimal__Group__1__Impl"
    // InternalDomainModel.g:3359:1: rule__Decimal__Group__1__Impl : ( '.' ) ;
    public final void rule__Decimal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3363:1: ( ( '.' ) )
            // InternalDomainModel.g:3364:1: ( '.' )
            {
            // InternalDomainModel.g:3364:1: ( '.' )
            // InternalDomainModel.g:3365:2: '.'
            {
             before(grammarAccess.getDecimalAccess().getFullStopKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getDecimalAccess().getFullStopKeyword_1()); 

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
    // $ANTLR end "rule__Decimal__Group__1__Impl"


    // $ANTLR start "rule__Decimal__Group__2"
    // InternalDomainModel.g:3374:1: rule__Decimal__Group__2 : rule__Decimal__Group__2__Impl ;
    public final void rule__Decimal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3378:1: ( rule__Decimal__Group__2__Impl )
            // InternalDomainModel.g:3379:2: rule__Decimal__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Decimal__Group__2__Impl();

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
    // $ANTLR end "rule__Decimal__Group__2"


    // $ANTLR start "rule__Decimal__Group__2__Impl"
    // InternalDomainModel.g:3385:1: rule__Decimal__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__Decimal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3389:1: ( ( RULE_INT ) )
            // InternalDomainModel.g:3390:1: ( RULE_INT )
            {
            // InternalDomainModel.g:3390:1: ( RULE_INT )
            // InternalDomainModel.g:3391:2: RULE_INT
            {
             before(grammarAccess.getDecimalAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDecimalAccess().getINTTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__Decimal__Group__2__Impl"


    // $ANTLR start "rule__Model__ConceptsAssignment"
    // InternalDomainModel.g:3401:1: rule__Model__ConceptsAssignment : ( ruleConcept ) ;
    public final void rule__Model__ConceptsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3405:1: ( ( ruleConcept ) )
            // InternalDomainModel.g:3406:2: ( ruleConcept )
            {
            // InternalDomainModel.g:3406:2: ( ruleConcept )
            // InternalDomainModel.g:3407:3: ruleConcept
            {
             before(grammarAccess.getModelAccess().getConceptsConceptParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleConcept();

            state._fsp--;

             after(grammarAccess.getModelAccess().getConceptsConceptParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__ConceptsAssignment"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalDomainModel.g:3416:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3420:1: ( ( RULE_ID ) )
            // InternalDomainModel.g:3421:2: ( RULE_ID )
            {
            // InternalDomainModel.g:3421:2: ( RULE_ID )
            // InternalDomainModel.g:3422:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__SuperTypeAssignment_2_1"
    // InternalDomainModel.g:3431:1: rule__Entity__SuperTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3435:1: ( ( ( RULE_ID ) ) )
            // InternalDomainModel.g:3436:2: ( ( RULE_ID ) )
            {
            // InternalDomainModel.g:3436:2: ( ( RULE_ID ) )
            // InternalDomainModel.g:3437:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 
            // InternalDomainModel.g:3438:3: ( RULE_ID )
            // InternalDomainModel.g:3439:4: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__Entity__SuperTypeAssignment_2_1"


    // $ANTLR start "rule__Entity__OptionsAssignment_3_2"
    // InternalDomainModel.g:3450:1: rule__Entity__OptionsAssignment_3_2 : ( ruleEntityOption ) ;
    public final void rule__Entity__OptionsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3454:1: ( ( ruleEntityOption ) )
            // InternalDomainModel.g:3455:2: ( ruleEntityOption )
            {
            // InternalDomainModel.g:3455:2: ( ruleEntityOption )
            // InternalDomainModel.g:3456:3: ruleEntityOption
            {
             before(grammarAccess.getEntityAccess().getOptionsEntityOptionParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityOption();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getOptionsEntityOptionParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__Entity__OptionsAssignment_3_2"


    // $ANTLR start "rule__Entity__OptionsAssignment_3_3_1"
    // InternalDomainModel.g:3465:1: rule__Entity__OptionsAssignment_3_3_1 : ( ruleEntityOption ) ;
    public final void rule__Entity__OptionsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3469:1: ( ( ruleEntityOption ) )
            // InternalDomainModel.g:3470:2: ( ruleEntityOption )
            {
            // InternalDomainModel.g:3470:2: ( ruleEntityOption )
            // InternalDomainModel.g:3471:3: ruleEntityOption
            {
             before(grammarAccess.getEntityAccess().getOptionsEntityOptionParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityOption();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getOptionsEntityOptionParserRuleCall_3_3_1_0()); 

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
    // $ANTLR end "rule__Entity__OptionsAssignment_3_3_1"


    // $ANTLR start "rule__Entity__AttributesAssignment_5"
    // InternalDomainModel.g:3480:1: rule__Entity__AttributesAssignment_5 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3484:1: ( ( ruleAttribute ) )
            // InternalDomainModel.g:3485:2: ( ruleAttribute )
            {
            // InternalDomainModel.g:3485:2: ( ruleAttribute )
            // InternalDomainModel.g:3486:3: ruleAttribute
            {
             before(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Entity__AttributesAssignment_5"


    // $ANTLR start "rule__Enum__NameAssignment_1"
    // InternalDomainModel.g:3495:1: rule__Enum__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Enum__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3499:1: ( ( RULE_ID ) )
            // InternalDomainModel.g:3500:2: ( RULE_ID )
            {
            // InternalDomainModel.g:3500:2: ( RULE_ID )
            // InternalDomainModel.g:3501:3: RULE_ID
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
    // InternalDomainModel.g:3510:1: rule__Enum__AttributesAssignment_3 : ( ruleAttribute ) ;
    public final void rule__Enum__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3514:1: ( ( ruleAttribute ) )
            // InternalDomainModel.g:3515:2: ( ruleAttribute )
            {
            // InternalDomainModel.g:3515:2: ( ruleAttribute )
            // InternalDomainModel.g:3516:3: ruleAttribute
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
    // InternalDomainModel.g:3525:1: rule__Enum__LiteralsAssignment_4 : ( ruleEnumLiteral ) ;
    public final void rule__Enum__LiteralsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3529:1: ( ( ruleEnumLiteral ) )
            // InternalDomainModel.g:3530:2: ( ruleEnumLiteral )
            {
            // InternalDomainModel.g:3530:2: ( ruleEnumLiteral )
            // InternalDomainModel.g:3531:3: ruleEnumLiteral
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
    // InternalDomainModel.g:3540:1: rule__EnumLiteral__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumLiteral__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3544:1: ( ( RULE_ID ) )
            // InternalDomainModel.g:3545:2: ( RULE_ID )
            {
            // InternalDomainModel.g:3545:2: ( RULE_ID )
            // InternalDomainModel.g:3546:3: RULE_ID
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
    // InternalDomainModel.g:3555:1: rule__EnumLiteral__ParamsAssignment_1_1 : ( ruleConstant ) ;
    public final void rule__EnumLiteral__ParamsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3559:1: ( ( ruleConstant ) )
            // InternalDomainModel.g:3560:2: ( ruleConstant )
            {
            // InternalDomainModel.g:3560:2: ( ruleConstant )
            // InternalDomainModel.g:3561:3: ruleConstant
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
    // InternalDomainModel.g:3570:1: rule__EnumLiteral__ParamsAssignment_1_2_1 : ( ruleConstant ) ;
    public final void rule__EnumLiteral__ParamsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3574:1: ( ( ruleConstant ) )
            // InternalDomainModel.g:3575:2: ( ruleConstant )
            {
            // InternalDomainModel.g:3575:2: ( ruleConstant )
            // InternalDomainModel.g:3576:3: ruleConstant
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
    // InternalDomainModel.g:3585:1: rule__Constant__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Constant__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3589:1: ( ( RULE_INT ) )
            // InternalDomainModel.g:3590:2: ( RULE_INT )
            {
            // InternalDomainModel.g:3590:2: ( RULE_INT )
            // InternalDomainModel.g:3591:3: RULE_INT
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
    // InternalDomainModel.g:3600:1: rule__Constant__ValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Constant__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3604:1: ( ( RULE_INT ) )
            // InternalDomainModel.g:3605:2: ( RULE_INT )
            {
            // InternalDomainModel.g:3605:2: ( RULE_INT )
            // InternalDomainModel.g:3606:3: RULE_INT
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
    // InternalDomainModel.g:3615:1: rule__Constant__ValueAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Constant__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3619:1: ( ( RULE_STRING ) )
            // InternalDomainModel.g:3620:2: ( RULE_STRING )
            {
            // InternalDomainModel.g:3620:2: ( RULE_STRING )
            // InternalDomainModel.g:3621:3: RULE_STRING
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
    // InternalDomainModel.g:3630:1: rule__Constant__ValueAssignment_3_1 : ( ( rule__Constant__ValueAlternatives_3_1_0 ) ) ;
    public final void rule__Constant__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3634:1: ( ( ( rule__Constant__ValueAlternatives_3_1_0 ) ) )
            // InternalDomainModel.g:3635:2: ( ( rule__Constant__ValueAlternatives_3_1_0 ) )
            {
            // InternalDomainModel.g:3635:2: ( ( rule__Constant__ValueAlternatives_3_1_0 ) )
            // InternalDomainModel.g:3636:3: ( rule__Constant__ValueAlternatives_3_1_0 )
            {
             before(grammarAccess.getConstantAccess().getValueAlternatives_3_1_0()); 
            // InternalDomainModel.g:3637:3: ( rule__Constant__ValueAlternatives_3_1_0 )
            // InternalDomainModel.g:3637:4: rule__Constant__ValueAlternatives_3_1_0
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
    // InternalDomainModel.g:3645:1: rule__Constant__DayAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__Constant__DayAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3649:1: ( ( RULE_INT ) )
            // InternalDomainModel.g:3650:2: ( RULE_INT )
            {
            // InternalDomainModel.g:3650:2: ( RULE_INT )
            // InternalDomainModel.g:3651:3: RULE_INT
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
    // InternalDomainModel.g:3660:1: rule__Constant__MonthAssignment_4_3 : ( RULE_INT ) ;
    public final void rule__Constant__MonthAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3664:1: ( ( RULE_INT ) )
            // InternalDomainModel.g:3665:2: ( RULE_INT )
            {
            // InternalDomainModel.g:3665:2: ( RULE_INT )
            // InternalDomainModel.g:3666:3: RULE_INT
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
    // InternalDomainModel.g:3675:1: rule__Constant__YearAssignment_4_5 : ( RULE_INT ) ;
    public final void rule__Constant__YearAssignment_4_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3679:1: ( ( RULE_INT ) )
            // InternalDomainModel.g:3680:2: ( RULE_INT )
            {
            // InternalDomainModel.g:3680:2: ( RULE_INT )
            // InternalDomainModel.g:3681:3: RULE_INT
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


    // $ANTLR start "rule__Constant__ValueAssignment_5_1"
    // InternalDomainModel.g:3690:1: rule__Constant__ValueAssignment_5_1 : ( ruleDecimal ) ;
    public final void rule__Constant__ValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3694:1: ( ( ruleDecimal ) )
            // InternalDomainModel.g:3695:2: ( ruleDecimal )
            {
            // InternalDomainModel.g:3695:2: ( ruleDecimal )
            // InternalDomainModel.g:3696:3: ruleDecimal
            {
             before(grammarAccess.getConstantAccess().getValueDecimalParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDecimal();

            state._fsp--;

             after(grammarAccess.getConstantAccess().getValueDecimalParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Constant__ValueAssignment_5_1"


    // $ANTLR start "rule__EntityOption__DeleteByFlagAssignment_0_1"
    // InternalDomainModel.g:3705:1: rule__EntityOption__DeleteByFlagAssignment_0_1 : ( ( 'deleteByFlag' ) ) ;
    public final void rule__EntityOption__DeleteByFlagAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3709:1: ( ( ( 'deleteByFlag' ) ) )
            // InternalDomainModel.g:3710:2: ( ( 'deleteByFlag' ) )
            {
            // InternalDomainModel.g:3710:2: ( ( 'deleteByFlag' ) )
            // InternalDomainModel.g:3711:3: ( 'deleteByFlag' )
            {
             before(grammarAccess.getEntityOptionAccess().getDeleteByFlagDeleteByFlagKeyword_0_1_0()); 
            // InternalDomainModel.g:3712:3: ( 'deleteByFlag' )
            // InternalDomainModel.g:3713:4: 'deleteByFlag'
            {
             before(grammarAccess.getEntityOptionAccess().getDeleteByFlagDeleteByFlagKeyword_0_1_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalDomainModel.g:3724:1: rule__EntityOption__InheritanceMappingAssignment_1_3 : ( ruleInheritanceMappingType ) ;
    public final void rule__EntityOption__InheritanceMappingAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3728:1: ( ( ruleInheritanceMappingType ) )
            // InternalDomainModel.g:3729:2: ( ruleInheritanceMappingType )
            {
            // InternalDomainModel.g:3729:2: ( ruleInheritanceMappingType )
            // InternalDomainModel.g:3730:3: ruleInheritanceMappingType
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
    // InternalDomainModel.g:3739:1: rule__InheritanceMappingType__TypeAssignment : ( ( rule__InheritanceMappingType__TypeAlternatives_0 ) ) ;
    public final void rule__InheritanceMappingType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3743:1: ( ( ( rule__InheritanceMappingType__TypeAlternatives_0 ) ) )
            // InternalDomainModel.g:3744:2: ( ( rule__InheritanceMappingType__TypeAlternatives_0 ) )
            {
            // InternalDomainModel.g:3744:2: ( ( rule__InheritanceMappingType__TypeAlternatives_0 ) )
            // InternalDomainModel.g:3745:3: ( rule__InheritanceMappingType__TypeAlternatives_0 )
            {
             before(grammarAccess.getInheritanceMappingTypeAccess().getTypeAlternatives_0()); 
            // InternalDomainModel.g:3746:3: ( rule__InheritanceMappingType__TypeAlternatives_0 )
            // InternalDomainModel.g:3746:4: rule__InheritanceMappingType__TypeAlternatives_0
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
    // InternalDomainModel.g:3754:1: rule__Attribute__TypeAssignment_0 : ( ruleAttributeType ) ;
    public final void rule__Attribute__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3758:1: ( ( ruleAttributeType ) )
            // InternalDomainModel.g:3759:2: ( ruleAttributeType )
            {
            // InternalDomainModel.g:3759:2: ( ruleAttributeType )
            // InternalDomainModel.g:3760:3: ruleAttributeType
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
    // InternalDomainModel.g:3769:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3773:1: ( ( RULE_ID ) )
            // InternalDomainModel.g:3774:2: ( RULE_ID )
            {
            // InternalDomainModel.g:3774:2: ( RULE_ID )
            // InternalDomainModel.g:3775:3: RULE_ID
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
    // InternalDomainModel.g:3784:1: rule__Attribute__OptionsAssignment_2_0 : ( ruleAttributeOption ) ;
    public final void rule__Attribute__OptionsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3788:1: ( ( ruleAttributeOption ) )
            // InternalDomainModel.g:3789:2: ( ruleAttributeOption )
            {
            // InternalDomainModel.g:3789:2: ( ruleAttributeOption )
            // InternalDomainModel.g:3790:3: ruleAttributeOption
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
    // InternalDomainModel.g:3799:1: rule__Attribute__OptionsAssignment_2_1_1 : ( ruleAttributeOption ) ;
    public final void rule__Attribute__OptionsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3803:1: ( ( ruleAttributeOption ) )
            // InternalDomainModel.g:3804:2: ( ruleAttributeOption )
            {
            // InternalDomainModel.g:3804:2: ( ruleAttributeOption )
            // InternalDomainModel.g:3805:3: ruleAttributeOption
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
    // InternalDomainModel.g:3814:1: rule__RefType__ReferenceAssignment : ( ( RULE_ID ) ) ;
    public final void rule__RefType__ReferenceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3818:1: ( ( ( RULE_ID ) ) )
            // InternalDomainModel.g:3819:2: ( ( RULE_ID ) )
            {
            // InternalDomainModel.g:3819:2: ( ( RULE_ID ) )
            // InternalDomainModel.g:3820:3: ( RULE_ID )
            {
             before(grammarAccess.getRefTypeAccess().getReferenceConceptCrossReference_0()); 
            // InternalDomainModel.g:3821:3: ( RULE_ID )
            // InternalDomainModel.g:3822:4: RULE_ID
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
    // InternalDomainModel.g:3833:1: rule__CollectionType__OfTypeAssignment_2 : ( ruleSingleType ) ;
    public final void rule__CollectionType__OfTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3837:1: ( ( ruleSingleType ) )
            // InternalDomainModel.g:3838:2: ( ruleSingleType )
            {
            // InternalDomainModel.g:3838:2: ( ruleSingleType )
            // InternalDomainModel.g:3839:3: ruleSingleType
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
    // InternalDomainModel.g:3848:1: rule__AttributeOption__RequiredAssignment_0_1 : ( ( 'required' ) ) ;
    public final void rule__AttributeOption__RequiredAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3852:1: ( ( ( 'required' ) ) )
            // InternalDomainModel.g:3853:2: ( ( 'required' ) )
            {
            // InternalDomainModel.g:3853:2: ( ( 'required' ) )
            // InternalDomainModel.g:3854:3: ( 'required' )
            {
             before(grammarAccess.getAttributeOptionAccess().getRequiredRequiredKeyword_0_1_0()); 
            // InternalDomainModel.g:3855:3: ( 'required' )
            // InternalDomainModel.g:3856:4: 'required'
            {
             before(grammarAccess.getAttributeOptionAccess().getRequiredRequiredKeyword_0_1_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalDomainModel.g:3867:1: rule__AttributeOption__PartOfAssignment_1_1 : ( ( 'partOf' ) ) ;
    public final void rule__AttributeOption__PartOfAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3871:1: ( ( ( 'partOf' ) ) )
            // InternalDomainModel.g:3872:2: ( ( 'partOf' ) )
            {
            // InternalDomainModel.g:3872:2: ( ( 'partOf' ) )
            // InternalDomainModel.g:3873:3: ( 'partOf' )
            {
             before(grammarAccess.getAttributeOptionAccess().getPartOfPartOfKeyword_1_1_0()); 
            // InternalDomainModel.g:3874:3: ( 'partOf' )
            // InternalDomainModel.g:3875:4: 'partOf'
            {
             before(grammarAccess.getAttributeOptionAccess().getPartOfPartOfKeyword_1_1_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalDomainModel.g:3886:1: rule__AttributeOption__RelationshipOwnerAssignment_2_3 : ( ruleStaticFieldSelection ) ;
    public final void rule__AttributeOption__RelationshipOwnerAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3890:1: ( ( ruleStaticFieldSelection ) )
            // InternalDomainModel.g:3891:2: ( ruleStaticFieldSelection )
            {
            // InternalDomainModel.g:3891:2: ( ruleStaticFieldSelection )
            // InternalDomainModel.g:3892:3: ruleStaticFieldSelection
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
    // InternalDomainModel.g:3901:1: rule__AttributeOption__CardAssignment_3_3 : ( ruleCardinalityType ) ;
    public final void rule__AttributeOption__CardAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3905:1: ( ( ruleCardinalityType ) )
            // InternalDomainModel.g:3906:2: ( ruleCardinalityType )
            {
            // InternalDomainModel.g:3906:2: ( ruleCardinalityType )
            // InternalDomainModel.g:3907:3: ruleCardinalityType
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
    // InternalDomainModel.g:3916:1: rule__StaticFieldSelection__ReceiverAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__StaticFieldSelection__ReceiverAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3920:1: ( ( ( RULE_ID ) ) )
            // InternalDomainModel.g:3921:2: ( ( RULE_ID ) )
            {
            // InternalDomainModel.g:3921:2: ( ( RULE_ID ) )
            // InternalDomainModel.g:3922:3: ( RULE_ID )
            {
             before(grammarAccess.getStaticFieldSelectionAccess().getReceiverEntityCrossReference_0_0()); 
            // InternalDomainModel.g:3923:3: ( RULE_ID )
            // InternalDomainModel.g:3924:4: RULE_ID
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
    // InternalDomainModel.g:3935:1: rule__StaticFieldSelection__MemberAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__StaticFieldSelection__MemberAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3939:1: ( ( ( RULE_ID ) ) )
            // InternalDomainModel.g:3940:2: ( ( RULE_ID ) )
            {
            // InternalDomainModel.g:3940:2: ( ( RULE_ID ) )
            // InternalDomainModel.g:3941:3: ( RULE_ID )
            {
             before(grammarAccess.getStaticFieldSelectionAccess().getMemberAttributeCrossReference_2_0()); 
            // InternalDomainModel.g:3942:3: ( RULE_ID )
            // InternalDomainModel.g:3943:4: RULE_ID
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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000004040002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000680000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000FE00100020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000FE00000022L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000200040000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000FE00000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020001850L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000CC0100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000CC0000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000007E00000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000007E00000020L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000100000000000L});

}
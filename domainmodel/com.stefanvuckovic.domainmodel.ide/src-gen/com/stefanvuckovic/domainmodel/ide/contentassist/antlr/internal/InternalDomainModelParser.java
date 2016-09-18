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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'SINGLE_TABLE'", "'TABLE_PER_CONCRETE_CLASS'", "'TABLE_PER_CLASS'", "'one'", "'many'", "'entity'", "'{'", "'}'", "'extends'", "'options'", "'('", "')'", "','", "'enum'", "'L'", "'/'", "'null'", "'inheritance'", "'='", "';'", "'string'", "'int'", "'long'", "'boolean'", "'date'", "'List'", "'<'", "'>'", "'relationshipOwner'", "'reverse_cardinality'", "'.'", "'deleteByFlag'", "'required'", "'partOf'"
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


    // $ANTLR start "ruleCardinalityType"
    // InternalDomainModel.g:453:1: ruleCardinalityType : ( ( rule__CardinalityType__Alternatives ) ) ;
    public final void ruleCardinalityType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:457:1: ( ( ( rule__CardinalityType__Alternatives ) ) )
            // InternalDomainModel.g:458:2: ( ( rule__CardinalityType__Alternatives ) )
            {
            // InternalDomainModel.g:458:2: ( ( rule__CardinalityType__Alternatives ) )
            // InternalDomainModel.g:459:3: ( rule__CardinalityType__Alternatives )
            {
             before(grammarAccess.getCardinalityTypeAccess().getAlternatives()); 
            // InternalDomainModel.g:460:3: ( rule__CardinalityType__Alternatives )
            // InternalDomainModel.g:460:4: rule__CardinalityType__Alternatives
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
    // InternalDomainModel.g:468:1: rule__Concept__Alternatives : ( ( ruleEntity ) | ( ruleEnum ) );
    public final void rule__Concept__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:472:1: ( ( ruleEntity ) | ( ruleEnum ) )
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
                    // InternalDomainModel.g:473:2: ( ruleEntity )
                    {
                    // InternalDomainModel.g:473:2: ( ruleEntity )
                    // InternalDomainModel.g:474:3: ruleEntity
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
                    // InternalDomainModel.g:479:2: ( ruleEnum )
                    {
                    // InternalDomainModel.g:479:2: ( ruleEnum )
                    // InternalDomainModel.g:480:3: ruleEnum
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
    // InternalDomainModel.g:489:1: rule__Constant__Alternatives : ( ( ( rule__Constant__Group_0__0 ) ) | ( ( rule__Constant__Group_1__0 ) ) | ( ( rule__Constant__Group_2__0 ) ) | ( ( rule__Constant__Group_3__0 ) ) | ( ( rule__Constant__Group_4__0 ) ) | ( ( rule__Constant__Group_5__0 ) ) );
    public final void rule__Constant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:493:1: ( ( ( rule__Constant__Group_0__0 ) ) | ( ( rule__Constant__Group_1__0 ) ) | ( ( rule__Constant__Group_2__0 ) ) | ( ( rule__Constant__Group_3__0 ) ) | ( ( rule__Constant__Group_4__0 ) ) | ( ( rule__Constant__Group_5__0 ) ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                switch ( input.LA(2) ) {
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
                case 28:
                    {
                    alt3=5;
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
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDomainModel.g:494:2: ( ( rule__Constant__Group_0__0 ) )
                    {
                    // InternalDomainModel.g:494:2: ( ( rule__Constant__Group_0__0 ) )
                    // InternalDomainModel.g:495:3: ( rule__Constant__Group_0__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_0()); 
                    // InternalDomainModel.g:496:3: ( rule__Constant__Group_0__0 )
                    // InternalDomainModel.g:496:4: rule__Constant__Group_0__0
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
                    // InternalDomainModel.g:500:2: ( ( rule__Constant__Group_1__0 ) )
                    {
                    // InternalDomainModel.g:500:2: ( ( rule__Constant__Group_1__0 ) )
                    // InternalDomainModel.g:501:3: ( rule__Constant__Group_1__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_1()); 
                    // InternalDomainModel.g:502:3: ( rule__Constant__Group_1__0 )
                    // InternalDomainModel.g:502:4: rule__Constant__Group_1__0
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
                    // InternalDomainModel.g:506:2: ( ( rule__Constant__Group_2__0 ) )
                    {
                    // InternalDomainModel.g:506:2: ( ( rule__Constant__Group_2__0 ) )
                    // InternalDomainModel.g:507:3: ( rule__Constant__Group_2__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_2()); 
                    // InternalDomainModel.g:508:3: ( rule__Constant__Group_2__0 )
                    // InternalDomainModel.g:508:4: rule__Constant__Group_2__0
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
                    // InternalDomainModel.g:512:2: ( ( rule__Constant__Group_3__0 ) )
                    {
                    // InternalDomainModel.g:512:2: ( ( rule__Constant__Group_3__0 ) )
                    // InternalDomainModel.g:513:3: ( rule__Constant__Group_3__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_3()); 
                    // InternalDomainModel.g:514:3: ( rule__Constant__Group_3__0 )
                    // InternalDomainModel.g:514:4: rule__Constant__Group_3__0
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
                    // InternalDomainModel.g:518:2: ( ( rule__Constant__Group_4__0 ) )
                    {
                    // InternalDomainModel.g:518:2: ( ( rule__Constant__Group_4__0 ) )
                    // InternalDomainModel.g:519:3: ( rule__Constant__Group_4__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_4()); 
                    // InternalDomainModel.g:520:3: ( rule__Constant__Group_4__0 )
                    // InternalDomainModel.g:520:4: rule__Constant__Group_4__0
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
                    // InternalDomainModel.g:524:2: ( ( rule__Constant__Group_5__0 ) )
                    {
                    // InternalDomainModel.g:524:2: ( ( rule__Constant__Group_5__0 ) )
                    // InternalDomainModel.g:525:3: ( rule__Constant__Group_5__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_5()); 
                    // InternalDomainModel.g:526:3: ( rule__Constant__Group_5__0 )
                    // InternalDomainModel.g:526:4: rule__Constant__Group_5__0
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
    // InternalDomainModel.g:534:1: rule__Constant__ValueAlternatives_3_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Constant__ValueAlternatives_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:538:1: ( ( 'true' ) | ( 'false' ) )
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
                    // InternalDomainModel.g:539:2: ( 'true' )
                    {
                    // InternalDomainModel.g:539:2: ( 'true' )
                    // InternalDomainModel.g:540:3: 'true'
                    {
                     before(grammarAccess.getConstantAccess().getValueTrueKeyword_3_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getConstantAccess().getValueTrueKeyword_3_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainModel.g:545:2: ( 'false' )
                    {
                    // InternalDomainModel.g:545:2: ( 'false' )
                    // InternalDomainModel.g:546:3: 'false'
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
    // InternalDomainModel.g:555:1: rule__EntityOption__Alternatives : ( ( ( rule__EntityOption__Group_0__0 ) ) | ( ( rule__EntityOption__Group_1__0 ) ) );
    public final void rule__EntityOption__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:559:1: ( ( ( rule__EntityOption__Group_0__0 ) ) | ( ( rule__EntityOption__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==44) ) {
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
                    // InternalDomainModel.g:560:2: ( ( rule__EntityOption__Group_0__0 ) )
                    {
                    // InternalDomainModel.g:560:2: ( ( rule__EntityOption__Group_0__0 ) )
                    // InternalDomainModel.g:561:3: ( rule__EntityOption__Group_0__0 )
                    {
                     before(grammarAccess.getEntityOptionAccess().getGroup_0()); 
                    // InternalDomainModel.g:562:3: ( rule__EntityOption__Group_0__0 )
                    // InternalDomainModel.g:562:4: rule__EntityOption__Group_0__0
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
                    // InternalDomainModel.g:566:2: ( ( rule__EntityOption__Group_1__0 ) )
                    {
                    // InternalDomainModel.g:566:2: ( ( rule__EntityOption__Group_1__0 ) )
                    // InternalDomainModel.g:567:3: ( rule__EntityOption__Group_1__0 )
                    {
                     before(grammarAccess.getEntityOptionAccess().getGroup_1()); 
                    // InternalDomainModel.g:568:3: ( rule__EntityOption__Group_1__0 )
                    // InternalDomainModel.g:568:4: rule__EntityOption__Group_1__0
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
    // InternalDomainModel.g:576:1: rule__InheritanceMappingType__TypeAlternatives_0 : ( ( 'SINGLE_TABLE' ) | ( 'TABLE_PER_CONCRETE_CLASS' ) | ( 'TABLE_PER_CLASS' ) );
    public final void rule__InheritanceMappingType__TypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:580:1: ( ( 'SINGLE_TABLE' ) | ( 'TABLE_PER_CONCRETE_CLASS' ) | ( 'TABLE_PER_CLASS' ) )
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
                    // InternalDomainModel.g:581:2: ( 'SINGLE_TABLE' )
                    {
                    // InternalDomainModel.g:581:2: ( 'SINGLE_TABLE' )
                    // InternalDomainModel.g:582:3: 'SINGLE_TABLE'
                    {
                     before(grammarAccess.getInheritanceMappingTypeAccess().getTypeSINGLE_TABLEKeyword_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getInheritanceMappingTypeAccess().getTypeSINGLE_TABLEKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainModel.g:587:2: ( 'TABLE_PER_CONCRETE_CLASS' )
                    {
                    // InternalDomainModel.g:587:2: ( 'TABLE_PER_CONCRETE_CLASS' )
                    // InternalDomainModel.g:588:3: 'TABLE_PER_CONCRETE_CLASS'
                    {
                     before(grammarAccess.getInheritanceMappingTypeAccess().getTypeTABLE_PER_CONCRETE_CLASSKeyword_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getInheritanceMappingTypeAccess().getTypeTABLE_PER_CONCRETE_CLASSKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDomainModel.g:593:2: ( 'TABLE_PER_CLASS' )
                    {
                    // InternalDomainModel.g:593:2: ( 'TABLE_PER_CLASS' )
                    // InternalDomainModel.g:594:3: 'TABLE_PER_CLASS'
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
    // InternalDomainModel.g:603:1: rule__AttributeType__Alternatives : ( ( ruleSingleType ) | ( ruleCollectionType ) );
    public final void rule__AttributeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:607:1: ( ( ruleSingleType ) | ( ruleCollectionType ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID||(LA7_0>=33 && LA7_0<=37)) ) {
                alt7=1;
            }
            else if ( (LA7_0==38) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDomainModel.g:608:2: ( ruleSingleType )
                    {
                    // InternalDomainModel.g:608:2: ( ruleSingleType )
                    // InternalDomainModel.g:609:3: ruleSingleType
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
                    // InternalDomainModel.g:614:2: ( ruleCollectionType )
                    {
                    // InternalDomainModel.g:614:2: ( ruleCollectionType )
                    // InternalDomainModel.g:615:3: ruleCollectionType
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
    // InternalDomainModel.g:624:1: rule__SingleType__Alternatives : ( ( ruleBasicType ) | ( ruleRefType ) );
    public final void rule__SingleType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:628:1: ( ( ruleBasicType ) | ( ruleRefType ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=33 && LA8_0<=37)) ) {
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
                    // InternalDomainModel.g:629:2: ( ruleBasicType )
                    {
                    // InternalDomainModel.g:629:2: ( ruleBasicType )
                    // InternalDomainModel.g:630:3: ruleBasicType
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
                    // InternalDomainModel.g:635:2: ( ruleRefType )
                    {
                    // InternalDomainModel.g:635:2: ( ruleRefType )
                    // InternalDomainModel.g:636:3: ruleRefType
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
    // InternalDomainModel.g:645:1: rule__BasicType__Alternatives : ( ( ( rule__BasicType__Group_0__0 ) ) | ( ( rule__BasicType__Group_1__0 ) ) | ( ( rule__BasicType__Group_2__0 ) ) | ( ( rule__BasicType__Group_3__0 ) ) | ( ( rule__BasicType__Group_4__0 ) ) );
    public final void rule__BasicType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:649:1: ( ( ( rule__BasicType__Group_0__0 ) ) | ( ( rule__BasicType__Group_1__0 ) ) | ( ( rule__BasicType__Group_2__0 ) ) | ( ( rule__BasicType__Group_3__0 ) ) | ( ( rule__BasicType__Group_4__0 ) ) )
            int alt9=5;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalDomainModel.g:650:2: ( ( rule__BasicType__Group_0__0 ) )
                    {
                    // InternalDomainModel.g:650:2: ( ( rule__BasicType__Group_0__0 ) )
                    // InternalDomainModel.g:651:3: ( rule__BasicType__Group_0__0 )
                    {
                     before(grammarAccess.getBasicTypeAccess().getGroup_0()); 
                    // InternalDomainModel.g:652:3: ( rule__BasicType__Group_0__0 )
                    // InternalDomainModel.g:652:4: rule__BasicType__Group_0__0
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
                    // InternalDomainModel.g:656:2: ( ( rule__BasicType__Group_1__0 ) )
                    {
                    // InternalDomainModel.g:656:2: ( ( rule__BasicType__Group_1__0 ) )
                    // InternalDomainModel.g:657:3: ( rule__BasicType__Group_1__0 )
                    {
                     before(grammarAccess.getBasicTypeAccess().getGroup_1()); 
                    // InternalDomainModel.g:658:3: ( rule__BasicType__Group_1__0 )
                    // InternalDomainModel.g:658:4: rule__BasicType__Group_1__0
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
                    // InternalDomainModel.g:662:2: ( ( rule__BasicType__Group_2__0 ) )
                    {
                    // InternalDomainModel.g:662:2: ( ( rule__BasicType__Group_2__0 ) )
                    // InternalDomainModel.g:663:3: ( rule__BasicType__Group_2__0 )
                    {
                     before(grammarAccess.getBasicTypeAccess().getGroup_2()); 
                    // InternalDomainModel.g:664:3: ( rule__BasicType__Group_2__0 )
                    // InternalDomainModel.g:664:4: rule__BasicType__Group_2__0
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
                    // InternalDomainModel.g:668:2: ( ( rule__BasicType__Group_3__0 ) )
                    {
                    // InternalDomainModel.g:668:2: ( ( rule__BasicType__Group_3__0 ) )
                    // InternalDomainModel.g:669:3: ( rule__BasicType__Group_3__0 )
                    {
                     before(grammarAccess.getBasicTypeAccess().getGroup_3()); 
                    // InternalDomainModel.g:670:3: ( rule__BasicType__Group_3__0 )
                    // InternalDomainModel.g:670:4: rule__BasicType__Group_3__0
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
                    // InternalDomainModel.g:674:2: ( ( rule__BasicType__Group_4__0 ) )
                    {
                    // InternalDomainModel.g:674:2: ( ( rule__BasicType__Group_4__0 ) )
                    // InternalDomainModel.g:675:3: ( rule__BasicType__Group_4__0 )
                    {
                     before(grammarAccess.getBasicTypeAccess().getGroup_4()); 
                    // InternalDomainModel.g:676:3: ( rule__BasicType__Group_4__0 )
                    // InternalDomainModel.g:676:4: rule__BasicType__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BasicType__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBasicTypeAccess().getGroup_4()); 

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
    // InternalDomainModel.g:684:1: rule__AttributeOption__Alternatives : ( ( ( rule__AttributeOption__Group_0__0 ) ) | ( ( rule__AttributeOption__Group_1__0 ) ) | ( ( rule__AttributeOption__Group_2__0 ) ) | ( ( rule__AttributeOption__Group_3__0 ) ) );
    public final void rule__AttributeOption__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:688:1: ( ( ( rule__AttributeOption__Group_0__0 ) ) | ( ( rule__AttributeOption__Group_1__0 ) ) | ( ( rule__AttributeOption__Group_2__0 ) ) | ( ( rule__AttributeOption__Group_3__0 ) ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt10=1;
                }
                break;
            case 46:
                {
                alt10=2;
                }
                break;
            case 41:
                {
                alt10=3;
                }
                break;
            case 42:
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
                    // InternalDomainModel.g:689:2: ( ( rule__AttributeOption__Group_0__0 ) )
                    {
                    // InternalDomainModel.g:689:2: ( ( rule__AttributeOption__Group_0__0 ) )
                    // InternalDomainModel.g:690:3: ( rule__AttributeOption__Group_0__0 )
                    {
                     before(grammarAccess.getAttributeOptionAccess().getGroup_0()); 
                    // InternalDomainModel.g:691:3: ( rule__AttributeOption__Group_0__0 )
                    // InternalDomainModel.g:691:4: rule__AttributeOption__Group_0__0
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
                    // InternalDomainModel.g:695:2: ( ( rule__AttributeOption__Group_1__0 ) )
                    {
                    // InternalDomainModel.g:695:2: ( ( rule__AttributeOption__Group_1__0 ) )
                    // InternalDomainModel.g:696:3: ( rule__AttributeOption__Group_1__0 )
                    {
                     before(grammarAccess.getAttributeOptionAccess().getGroup_1()); 
                    // InternalDomainModel.g:697:3: ( rule__AttributeOption__Group_1__0 )
                    // InternalDomainModel.g:697:4: rule__AttributeOption__Group_1__0
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
                    // InternalDomainModel.g:701:2: ( ( rule__AttributeOption__Group_2__0 ) )
                    {
                    // InternalDomainModel.g:701:2: ( ( rule__AttributeOption__Group_2__0 ) )
                    // InternalDomainModel.g:702:3: ( rule__AttributeOption__Group_2__0 )
                    {
                     before(grammarAccess.getAttributeOptionAccess().getGroup_2()); 
                    // InternalDomainModel.g:703:3: ( rule__AttributeOption__Group_2__0 )
                    // InternalDomainModel.g:703:4: rule__AttributeOption__Group_2__0
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
                    // InternalDomainModel.g:707:2: ( ( rule__AttributeOption__Group_3__0 ) )
                    {
                    // InternalDomainModel.g:707:2: ( ( rule__AttributeOption__Group_3__0 ) )
                    // InternalDomainModel.g:708:3: ( rule__AttributeOption__Group_3__0 )
                    {
                     before(grammarAccess.getAttributeOptionAccess().getGroup_3()); 
                    // InternalDomainModel.g:709:3: ( rule__AttributeOption__Group_3__0 )
                    // InternalDomainModel.g:709:4: rule__AttributeOption__Group_3__0
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
    // InternalDomainModel.g:717:1: rule__CardinalityType__Alternatives : ( ( ( 'one' ) ) | ( ( 'many' ) ) );
    public final void rule__CardinalityType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:721:1: ( ( ( 'one' ) ) | ( ( 'many' ) ) )
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
                    // InternalDomainModel.g:722:2: ( ( 'one' ) )
                    {
                    // InternalDomainModel.g:722:2: ( ( 'one' ) )
                    // InternalDomainModel.g:723:3: ( 'one' )
                    {
                     before(grammarAccess.getCardinalityTypeAccess().getOneEnumLiteralDeclaration_0()); 
                    // InternalDomainModel.g:724:3: ( 'one' )
                    // InternalDomainModel.g:724:4: 'one'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getCardinalityTypeAccess().getOneEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainModel.g:728:2: ( ( 'many' ) )
                    {
                    // InternalDomainModel.g:728:2: ( ( 'many' ) )
                    // InternalDomainModel.g:729:3: ( 'many' )
                    {
                     before(grammarAccess.getCardinalityTypeAccess().getManyEnumLiteralDeclaration_1()); 
                    // InternalDomainModel.g:730:3: ( 'many' )
                    // InternalDomainModel.g:730:4: 'many'
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
    // InternalDomainModel.g:738:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:742:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalDomainModel.g:743:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
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
    // InternalDomainModel.g:750:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:754:1: ( ( 'entity' ) )
            // InternalDomainModel.g:755:1: ( 'entity' )
            {
            // InternalDomainModel.g:755:1: ( 'entity' )
            // InternalDomainModel.g:756:2: 'entity'
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
    // InternalDomainModel.g:765:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:769:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalDomainModel.g:770:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
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
    // InternalDomainModel.g:777:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:781:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalDomainModel.g:782:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalDomainModel.g:782:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalDomainModel.g:783:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalDomainModel.g:784:2: ( rule__Entity__NameAssignment_1 )
            // InternalDomainModel.g:784:3: rule__Entity__NameAssignment_1
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
    // InternalDomainModel.g:792:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:796:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalDomainModel.g:797:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
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
    // InternalDomainModel.g:804:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:808:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // InternalDomainModel.g:809:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // InternalDomainModel.g:809:1: ( ( rule__Entity__Group_2__0 )? )
            // InternalDomainModel.g:810:2: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // InternalDomainModel.g:811:2: ( rule__Entity__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDomainModel.g:811:3: rule__Entity__Group_2__0
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
    // InternalDomainModel.g:819:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:823:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalDomainModel.g:824:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
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
    // InternalDomainModel.g:831:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__Group_3__0 )? ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:835:1: ( ( ( rule__Entity__Group_3__0 )? ) )
            // InternalDomainModel.g:836:1: ( ( rule__Entity__Group_3__0 )? )
            {
            // InternalDomainModel.g:836:1: ( ( rule__Entity__Group_3__0 )? )
            // InternalDomainModel.g:837:2: ( rule__Entity__Group_3__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_3()); 
            // InternalDomainModel.g:838:2: ( rule__Entity__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDomainModel.g:838:3: rule__Entity__Group_3__0
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
    // InternalDomainModel.g:846:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:850:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalDomainModel.g:851:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
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
    // InternalDomainModel.g:858:1: rule__Entity__Group__4__Impl : ( '{' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:862:1: ( ( '{' ) )
            // InternalDomainModel.g:863:1: ( '{' )
            {
            // InternalDomainModel.g:863:1: ( '{' )
            // InternalDomainModel.g:864:2: '{'
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
    // InternalDomainModel.g:873:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:877:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // InternalDomainModel.g:878:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
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
    // InternalDomainModel.g:885:1: rule__Entity__Group__5__Impl : ( ( rule__Entity__AttributesAssignment_5 )* ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:889:1: ( ( ( rule__Entity__AttributesAssignment_5 )* ) )
            // InternalDomainModel.g:890:1: ( ( rule__Entity__AttributesAssignment_5 )* )
            {
            // InternalDomainModel.g:890:1: ( ( rule__Entity__AttributesAssignment_5 )* )
            // InternalDomainModel.g:891:2: ( rule__Entity__AttributesAssignment_5 )*
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_5()); 
            // InternalDomainModel.g:892:2: ( rule__Entity__AttributesAssignment_5 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||(LA14_0>=33 && LA14_0<=38)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDomainModel.g:892:3: rule__Entity__AttributesAssignment_5
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
    // InternalDomainModel.g:900:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:904:1: ( rule__Entity__Group__6__Impl )
            // InternalDomainModel.g:905:2: rule__Entity__Group__6__Impl
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
    // InternalDomainModel.g:911:1: rule__Entity__Group__6__Impl : ( '}' ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:915:1: ( ( '}' ) )
            // InternalDomainModel.g:916:1: ( '}' )
            {
            // InternalDomainModel.g:916:1: ( '}' )
            // InternalDomainModel.g:917:2: '}'
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
    // InternalDomainModel.g:927:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:931:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // InternalDomainModel.g:932:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
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
    // InternalDomainModel.g:939:1: rule__Entity__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:943:1: ( ( 'extends' ) )
            // InternalDomainModel.g:944:1: ( 'extends' )
            {
            // InternalDomainModel.g:944:1: ( 'extends' )
            // InternalDomainModel.g:945:2: 'extends'
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
    // InternalDomainModel.g:954:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:958:1: ( rule__Entity__Group_2__1__Impl )
            // InternalDomainModel.g:959:2: rule__Entity__Group_2__1__Impl
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
    // InternalDomainModel.g:965:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:969:1: ( ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) )
            // InternalDomainModel.g:970:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            {
            // InternalDomainModel.g:970:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            // InternalDomainModel.g:971:2: ( rule__Entity__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); 
            // InternalDomainModel.g:972:2: ( rule__Entity__SuperTypeAssignment_2_1 )
            // InternalDomainModel.g:972:3: rule__Entity__SuperTypeAssignment_2_1
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
    // InternalDomainModel.g:981:1: rule__Entity__Group_3__0 : rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 ;
    public final void rule__Entity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:985:1: ( rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 )
            // InternalDomainModel.g:986:2: rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1
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
    // InternalDomainModel.g:993:1: rule__Entity__Group_3__0__Impl : ( 'options' ) ;
    public final void rule__Entity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:997:1: ( ( 'options' ) )
            // InternalDomainModel.g:998:1: ( 'options' )
            {
            // InternalDomainModel.g:998:1: ( 'options' )
            // InternalDomainModel.g:999:2: 'options'
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
    // InternalDomainModel.g:1008:1: rule__Entity__Group_3__1 : rule__Entity__Group_3__1__Impl rule__Entity__Group_3__2 ;
    public final void rule__Entity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1012:1: ( rule__Entity__Group_3__1__Impl rule__Entity__Group_3__2 )
            // InternalDomainModel.g:1013:2: rule__Entity__Group_3__1__Impl rule__Entity__Group_3__2
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
    // InternalDomainModel.g:1020:1: rule__Entity__Group_3__1__Impl : ( '(' ) ;
    public final void rule__Entity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1024:1: ( ( '(' ) )
            // InternalDomainModel.g:1025:1: ( '(' )
            {
            // InternalDomainModel.g:1025:1: ( '(' )
            // InternalDomainModel.g:1026:2: '('
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
    // InternalDomainModel.g:1035:1: rule__Entity__Group_3__2 : rule__Entity__Group_3__2__Impl rule__Entity__Group_3__3 ;
    public final void rule__Entity__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1039:1: ( rule__Entity__Group_3__2__Impl rule__Entity__Group_3__3 )
            // InternalDomainModel.g:1040:2: rule__Entity__Group_3__2__Impl rule__Entity__Group_3__3
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
    // InternalDomainModel.g:1047:1: rule__Entity__Group_3__2__Impl : ( ( rule__Entity__OptionsAssignment_3_2 ) ) ;
    public final void rule__Entity__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1051:1: ( ( ( rule__Entity__OptionsAssignment_3_2 ) ) )
            // InternalDomainModel.g:1052:1: ( ( rule__Entity__OptionsAssignment_3_2 ) )
            {
            // InternalDomainModel.g:1052:1: ( ( rule__Entity__OptionsAssignment_3_2 ) )
            // InternalDomainModel.g:1053:2: ( rule__Entity__OptionsAssignment_3_2 )
            {
             before(grammarAccess.getEntityAccess().getOptionsAssignment_3_2()); 
            // InternalDomainModel.g:1054:2: ( rule__Entity__OptionsAssignment_3_2 )
            // InternalDomainModel.g:1054:3: rule__Entity__OptionsAssignment_3_2
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
    // InternalDomainModel.g:1062:1: rule__Entity__Group_3__3 : rule__Entity__Group_3__3__Impl rule__Entity__Group_3__4 ;
    public final void rule__Entity__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1066:1: ( rule__Entity__Group_3__3__Impl rule__Entity__Group_3__4 )
            // InternalDomainModel.g:1067:2: rule__Entity__Group_3__3__Impl rule__Entity__Group_3__4
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
    // InternalDomainModel.g:1074:1: rule__Entity__Group_3__3__Impl : ( ( rule__Entity__Group_3_3__0 )* ) ;
    public final void rule__Entity__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1078:1: ( ( ( rule__Entity__Group_3_3__0 )* ) )
            // InternalDomainModel.g:1079:1: ( ( rule__Entity__Group_3_3__0 )* )
            {
            // InternalDomainModel.g:1079:1: ( ( rule__Entity__Group_3_3__0 )* )
            // InternalDomainModel.g:1080:2: ( rule__Entity__Group_3_3__0 )*
            {
             before(grammarAccess.getEntityAccess().getGroup_3_3()); 
            // InternalDomainModel.g:1081:2: ( rule__Entity__Group_3_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==25) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDomainModel.g:1081:3: rule__Entity__Group_3_3__0
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
    // InternalDomainModel.g:1089:1: rule__Entity__Group_3__4 : rule__Entity__Group_3__4__Impl ;
    public final void rule__Entity__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1093:1: ( rule__Entity__Group_3__4__Impl )
            // InternalDomainModel.g:1094:2: rule__Entity__Group_3__4__Impl
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
    // InternalDomainModel.g:1100:1: rule__Entity__Group_3__4__Impl : ( ')' ) ;
    public final void rule__Entity__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1104:1: ( ( ')' ) )
            // InternalDomainModel.g:1105:1: ( ')' )
            {
            // InternalDomainModel.g:1105:1: ( ')' )
            // InternalDomainModel.g:1106:2: ')'
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
    // InternalDomainModel.g:1116:1: rule__Entity__Group_3_3__0 : rule__Entity__Group_3_3__0__Impl rule__Entity__Group_3_3__1 ;
    public final void rule__Entity__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1120:1: ( rule__Entity__Group_3_3__0__Impl rule__Entity__Group_3_3__1 )
            // InternalDomainModel.g:1121:2: rule__Entity__Group_3_3__0__Impl rule__Entity__Group_3_3__1
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
    // InternalDomainModel.g:1128:1: rule__Entity__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Entity__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1132:1: ( ( ',' ) )
            // InternalDomainModel.g:1133:1: ( ',' )
            {
            // InternalDomainModel.g:1133:1: ( ',' )
            // InternalDomainModel.g:1134:2: ','
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
    // InternalDomainModel.g:1143:1: rule__Entity__Group_3_3__1 : rule__Entity__Group_3_3__1__Impl ;
    public final void rule__Entity__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1147:1: ( rule__Entity__Group_3_3__1__Impl )
            // InternalDomainModel.g:1148:2: rule__Entity__Group_3_3__1__Impl
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
    // InternalDomainModel.g:1154:1: rule__Entity__Group_3_3__1__Impl : ( ( rule__Entity__OptionsAssignment_3_3_1 ) ) ;
    public final void rule__Entity__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1158:1: ( ( ( rule__Entity__OptionsAssignment_3_3_1 ) ) )
            // InternalDomainModel.g:1159:1: ( ( rule__Entity__OptionsAssignment_3_3_1 ) )
            {
            // InternalDomainModel.g:1159:1: ( ( rule__Entity__OptionsAssignment_3_3_1 ) )
            // InternalDomainModel.g:1160:2: ( rule__Entity__OptionsAssignment_3_3_1 )
            {
             before(grammarAccess.getEntityAccess().getOptionsAssignment_3_3_1()); 
            // InternalDomainModel.g:1161:2: ( rule__Entity__OptionsAssignment_3_3_1 )
            // InternalDomainModel.g:1161:3: rule__Entity__OptionsAssignment_3_3_1
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
    // InternalDomainModel.g:1170:1: rule__Enum__Group__0 : rule__Enum__Group__0__Impl rule__Enum__Group__1 ;
    public final void rule__Enum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1174:1: ( rule__Enum__Group__0__Impl rule__Enum__Group__1 )
            // InternalDomainModel.g:1175:2: rule__Enum__Group__0__Impl rule__Enum__Group__1
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
    // InternalDomainModel.g:1182:1: rule__Enum__Group__0__Impl : ( 'enum' ) ;
    public final void rule__Enum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1186:1: ( ( 'enum' ) )
            // InternalDomainModel.g:1187:1: ( 'enum' )
            {
            // InternalDomainModel.g:1187:1: ( 'enum' )
            // InternalDomainModel.g:1188:2: 'enum'
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
    // InternalDomainModel.g:1197:1: rule__Enum__Group__1 : rule__Enum__Group__1__Impl rule__Enum__Group__2 ;
    public final void rule__Enum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1201:1: ( rule__Enum__Group__1__Impl rule__Enum__Group__2 )
            // InternalDomainModel.g:1202:2: rule__Enum__Group__1__Impl rule__Enum__Group__2
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
    // InternalDomainModel.g:1209:1: rule__Enum__Group__1__Impl : ( ( rule__Enum__NameAssignment_1 ) ) ;
    public final void rule__Enum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1213:1: ( ( ( rule__Enum__NameAssignment_1 ) ) )
            // InternalDomainModel.g:1214:1: ( ( rule__Enum__NameAssignment_1 ) )
            {
            // InternalDomainModel.g:1214:1: ( ( rule__Enum__NameAssignment_1 ) )
            // InternalDomainModel.g:1215:2: ( rule__Enum__NameAssignment_1 )
            {
             before(grammarAccess.getEnumAccess().getNameAssignment_1()); 
            // InternalDomainModel.g:1216:2: ( rule__Enum__NameAssignment_1 )
            // InternalDomainModel.g:1216:3: rule__Enum__NameAssignment_1
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
    // InternalDomainModel.g:1224:1: rule__Enum__Group__2 : rule__Enum__Group__2__Impl rule__Enum__Group__3 ;
    public final void rule__Enum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1228:1: ( rule__Enum__Group__2__Impl rule__Enum__Group__3 )
            // InternalDomainModel.g:1229:2: rule__Enum__Group__2__Impl rule__Enum__Group__3
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
    // InternalDomainModel.g:1236:1: rule__Enum__Group__2__Impl : ( '{' ) ;
    public final void rule__Enum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1240:1: ( ( '{' ) )
            // InternalDomainModel.g:1241:1: ( '{' )
            {
            // InternalDomainModel.g:1241:1: ( '{' )
            // InternalDomainModel.g:1242:2: '{'
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
    // InternalDomainModel.g:1251:1: rule__Enum__Group__3 : rule__Enum__Group__3__Impl rule__Enum__Group__4 ;
    public final void rule__Enum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1255:1: ( rule__Enum__Group__3__Impl rule__Enum__Group__4 )
            // InternalDomainModel.g:1256:2: rule__Enum__Group__3__Impl rule__Enum__Group__4
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
    // InternalDomainModel.g:1263:1: rule__Enum__Group__3__Impl : ( ( rule__Enum__AttributesAssignment_3 )* ) ;
    public final void rule__Enum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1267:1: ( ( ( rule__Enum__AttributesAssignment_3 )* ) )
            // InternalDomainModel.g:1268:1: ( ( rule__Enum__AttributesAssignment_3 )* )
            {
            // InternalDomainModel.g:1268:1: ( ( rule__Enum__AttributesAssignment_3 )* )
            // InternalDomainModel.g:1269:2: ( rule__Enum__AttributesAssignment_3 )*
            {
             before(grammarAccess.getEnumAccess().getAttributesAssignment_3()); 
            // InternalDomainModel.g:1270:2: ( rule__Enum__AttributesAssignment_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1==RULE_ID) ) {
                        int LA16_3 = input.LA(3);

                        if ( (LA16_3==32||(LA16_3>=41 && LA16_3<=42)||(LA16_3>=45 && LA16_3<=46)) ) {
                            alt16=1;
                        }


                    }


                }
                else if ( ((LA16_0>=33 && LA16_0<=38)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDomainModel.g:1270:3: rule__Enum__AttributesAssignment_3
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
    // InternalDomainModel.g:1278:1: rule__Enum__Group__4 : rule__Enum__Group__4__Impl rule__Enum__Group__5 ;
    public final void rule__Enum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1282:1: ( rule__Enum__Group__4__Impl rule__Enum__Group__5 )
            // InternalDomainModel.g:1283:2: rule__Enum__Group__4__Impl rule__Enum__Group__5
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
    // InternalDomainModel.g:1290:1: rule__Enum__Group__4__Impl : ( ( ( rule__Enum__LiteralsAssignment_4 ) ) ( ( rule__Enum__LiteralsAssignment_4 )* ) ) ;
    public final void rule__Enum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1294:1: ( ( ( ( rule__Enum__LiteralsAssignment_4 ) ) ( ( rule__Enum__LiteralsAssignment_4 )* ) ) )
            // InternalDomainModel.g:1295:1: ( ( ( rule__Enum__LiteralsAssignment_4 ) ) ( ( rule__Enum__LiteralsAssignment_4 )* ) )
            {
            // InternalDomainModel.g:1295:1: ( ( ( rule__Enum__LiteralsAssignment_4 ) ) ( ( rule__Enum__LiteralsAssignment_4 )* ) )
            // InternalDomainModel.g:1296:2: ( ( rule__Enum__LiteralsAssignment_4 ) ) ( ( rule__Enum__LiteralsAssignment_4 )* )
            {
            // InternalDomainModel.g:1296:2: ( ( rule__Enum__LiteralsAssignment_4 ) )
            // InternalDomainModel.g:1297:3: ( rule__Enum__LiteralsAssignment_4 )
            {
             before(grammarAccess.getEnumAccess().getLiteralsAssignment_4()); 
            // InternalDomainModel.g:1298:3: ( rule__Enum__LiteralsAssignment_4 )
            // InternalDomainModel.g:1298:4: rule__Enum__LiteralsAssignment_4
            {
            pushFollow(FOLLOW_7);
            rule__Enum__LiteralsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getLiteralsAssignment_4()); 

            }

            // InternalDomainModel.g:1301:2: ( ( rule__Enum__LiteralsAssignment_4 )* )
            // InternalDomainModel.g:1302:3: ( rule__Enum__LiteralsAssignment_4 )*
            {
             before(grammarAccess.getEnumAccess().getLiteralsAssignment_4()); 
            // InternalDomainModel.g:1303:3: ( rule__Enum__LiteralsAssignment_4 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDomainModel.g:1303:4: rule__Enum__LiteralsAssignment_4
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
    // InternalDomainModel.g:1312:1: rule__Enum__Group__5 : rule__Enum__Group__5__Impl ;
    public final void rule__Enum__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1316:1: ( rule__Enum__Group__5__Impl )
            // InternalDomainModel.g:1317:2: rule__Enum__Group__5__Impl
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
    // InternalDomainModel.g:1323:1: rule__Enum__Group__5__Impl : ( '}' ) ;
    public final void rule__Enum__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1327:1: ( ( '}' ) )
            // InternalDomainModel.g:1328:1: ( '}' )
            {
            // InternalDomainModel.g:1328:1: ( '}' )
            // InternalDomainModel.g:1329:2: '}'
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
    // InternalDomainModel.g:1339:1: rule__EnumLiteral__Group__0 : rule__EnumLiteral__Group__0__Impl rule__EnumLiteral__Group__1 ;
    public final void rule__EnumLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1343:1: ( rule__EnumLiteral__Group__0__Impl rule__EnumLiteral__Group__1 )
            // InternalDomainModel.g:1344:2: rule__EnumLiteral__Group__0__Impl rule__EnumLiteral__Group__1
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
    // InternalDomainModel.g:1351:1: rule__EnumLiteral__Group__0__Impl : ( ( rule__EnumLiteral__NameAssignment_0 ) ) ;
    public final void rule__EnumLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1355:1: ( ( ( rule__EnumLiteral__NameAssignment_0 ) ) )
            // InternalDomainModel.g:1356:1: ( ( rule__EnumLiteral__NameAssignment_0 ) )
            {
            // InternalDomainModel.g:1356:1: ( ( rule__EnumLiteral__NameAssignment_0 ) )
            // InternalDomainModel.g:1357:2: ( rule__EnumLiteral__NameAssignment_0 )
            {
             before(grammarAccess.getEnumLiteralAccess().getNameAssignment_0()); 
            // InternalDomainModel.g:1358:2: ( rule__EnumLiteral__NameAssignment_0 )
            // InternalDomainModel.g:1358:3: rule__EnumLiteral__NameAssignment_0
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
    // InternalDomainModel.g:1366:1: rule__EnumLiteral__Group__1 : rule__EnumLiteral__Group__1__Impl ;
    public final void rule__EnumLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1370:1: ( rule__EnumLiteral__Group__1__Impl )
            // InternalDomainModel.g:1371:2: rule__EnumLiteral__Group__1__Impl
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
    // InternalDomainModel.g:1377:1: rule__EnumLiteral__Group__1__Impl : ( ( rule__EnumLiteral__Group_1__0 )? ) ;
    public final void rule__EnumLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1381:1: ( ( ( rule__EnumLiteral__Group_1__0 )? ) )
            // InternalDomainModel.g:1382:1: ( ( rule__EnumLiteral__Group_1__0 )? )
            {
            // InternalDomainModel.g:1382:1: ( ( rule__EnumLiteral__Group_1__0 )? )
            // InternalDomainModel.g:1383:2: ( rule__EnumLiteral__Group_1__0 )?
            {
             before(grammarAccess.getEnumLiteralAccess().getGroup_1()); 
            // InternalDomainModel.g:1384:2: ( rule__EnumLiteral__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDomainModel.g:1384:3: rule__EnumLiteral__Group_1__0
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
    // InternalDomainModel.g:1393:1: rule__EnumLiteral__Group_1__0 : rule__EnumLiteral__Group_1__0__Impl rule__EnumLiteral__Group_1__1 ;
    public final void rule__EnumLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1397:1: ( rule__EnumLiteral__Group_1__0__Impl rule__EnumLiteral__Group_1__1 )
            // InternalDomainModel.g:1398:2: rule__EnumLiteral__Group_1__0__Impl rule__EnumLiteral__Group_1__1
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
    // InternalDomainModel.g:1405:1: rule__EnumLiteral__Group_1__0__Impl : ( '(' ) ;
    public final void rule__EnumLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1409:1: ( ( '(' ) )
            // InternalDomainModel.g:1410:1: ( '(' )
            {
            // InternalDomainModel.g:1410:1: ( '(' )
            // InternalDomainModel.g:1411:2: '('
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
    // InternalDomainModel.g:1420:1: rule__EnumLiteral__Group_1__1 : rule__EnumLiteral__Group_1__1__Impl rule__EnumLiteral__Group_1__2 ;
    public final void rule__EnumLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1424:1: ( rule__EnumLiteral__Group_1__1__Impl rule__EnumLiteral__Group_1__2 )
            // InternalDomainModel.g:1425:2: rule__EnumLiteral__Group_1__1__Impl rule__EnumLiteral__Group_1__2
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
    // InternalDomainModel.g:1432:1: rule__EnumLiteral__Group_1__1__Impl : ( ( rule__EnumLiteral__ParamsAssignment_1_1 ) ) ;
    public final void rule__EnumLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1436:1: ( ( ( rule__EnumLiteral__ParamsAssignment_1_1 ) ) )
            // InternalDomainModel.g:1437:1: ( ( rule__EnumLiteral__ParamsAssignment_1_1 ) )
            {
            // InternalDomainModel.g:1437:1: ( ( rule__EnumLiteral__ParamsAssignment_1_1 ) )
            // InternalDomainModel.g:1438:2: ( rule__EnumLiteral__ParamsAssignment_1_1 )
            {
             before(grammarAccess.getEnumLiteralAccess().getParamsAssignment_1_1()); 
            // InternalDomainModel.g:1439:2: ( rule__EnumLiteral__ParamsAssignment_1_1 )
            // InternalDomainModel.g:1439:3: rule__EnumLiteral__ParamsAssignment_1_1
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
    // InternalDomainModel.g:1447:1: rule__EnumLiteral__Group_1__2 : rule__EnumLiteral__Group_1__2__Impl rule__EnumLiteral__Group_1__3 ;
    public final void rule__EnumLiteral__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1451:1: ( rule__EnumLiteral__Group_1__2__Impl rule__EnumLiteral__Group_1__3 )
            // InternalDomainModel.g:1452:2: rule__EnumLiteral__Group_1__2__Impl rule__EnumLiteral__Group_1__3
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
    // InternalDomainModel.g:1459:1: rule__EnumLiteral__Group_1__2__Impl : ( ( rule__EnumLiteral__Group_1_2__0 )* ) ;
    public final void rule__EnumLiteral__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1463:1: ( ( ( rule__EnumLiteral__Group_1_2__0 )* ) )
            // InternalDomainModel.g:1464:1: ( ( rule__EnumLiteral__Group_1_2__0 )* )
            {
            // InternalDomainModel.g:1464:1: ( ( rule__EnumLiteral__Group_1_2__0 )* )
            // InternalDomainModel.g:1465:2: ( rule__EnumLiteral__Group_1_2__0 )*
            {
             before(grammarAccess.getEnumLiteralAccess().getGroup_1_2()); 
            // InternalDomainModel.g:1466:2: ( rule__EnumLiteral__Group_1_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==25) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalDomainModel.g:1466:3: rule__EnumLiteral__Group_1_2__0
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
    // InternalDomainModel.g:1474:1: rule__EnumLiteral__Group_1__3 : rule__EnumLiteral__Group_1__3__Impl ;
    public final void rule__EnumLiteral__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1478:1: ( rule__EnumLiteral__Group_1__3__Impl )
            // InternalDomainModel.g:1479:2: rule__EnumLiteral__Group_1__3__Impl
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
    // InternalDomainModel.g:1485:1: rule__EnumLiteral__Group_1__3__Impl : ( ')' ) ;
    public final void rule__EnumLiteral__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1489:1: ( ( ')' ) )
            // InternalDomainModel.g:1490:1: ( ')' )
            {
            // InternalDomainModel.g:1490:1: ( ')' )
            // InternalDomainModel.g:1491:2: ')'
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
    // InternalDomainModel.g:1501:1: rule__EnumLiteral__Group_1_2__0 : rule__EnumLiteral__Group_1_2__0__Impl rule__EnumLiteral__Group_1_2__1 ;
    public final void rule__EnumLiteral__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1505:1: ( rule__EnumLiteral__Group_1_2__0__Impl rule__EnumLiteral__Group_1_2__1 )
            // InternalDomainModel.g:1506:2: rule__EnumLiteral__Group_1_2__0__Impl rule__EnumLiteral__Group_1_2__1
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
    // InternalDomainModel.g:1513:1: rule__EnumLiteral__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__EnumLiteral__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1517:1: ( ( ',' ) )
            // InternalDomainModel.g:1518:1: ( ',' )
            {
            // InternalDomainModel.g:1518:1: ( ',' )
            // InternalDomainModel.g:1519:2: ','
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
    // InternalDomainModel.g:1528:1: rule__EnumLiteral__Group_1_2__1 : rule__EnumLiteral__Group_1_2__1__Impl ;
    public final void rule__EnumLiteral__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1532:1: ( rule__EnumLiteral__Group_1_2__1__Impl )
            // InternalDomainModel.g:1533:2: rule__EnumLiteral__Group_1_2__1__Impl
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
    // InternalDomainModel.g:1539:1: rule__EnumLiteral__Group_1_2__1__Impl : ( ( rule__EnumLiteral__ParamsAssignment_1_2_1 ) ) ;
    public final void rule__EnumLiteral__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1543:1: ( ( ( rule__EnumLiteral__ParamsAssignment_1_2_1 ) ) )
            // InternalDomainModel.g:1544:1: ( ( rule__EnumLiteral__ParamsAssignment_1_2_1 ) )
            {
            // InternalDomainModel.g:1544:1: ( ( rule__EnumLiteral__ParamsAssignment_1_2_1 ) )
            // InternalDomainModel.g:1545:2: ( rule__EnumLiteral__ParamsAssignment_1_2_1 )
            {
             before(grammarAccess.getEnumLiteralAccess().getParamsAssignment_1_2_1()); 
            // InternalDomainModel.g:1546:2: ( rule__EnumLiteral__ParamsAssignment_1_2_1 )
            // InternalDomainModel.g:1546:3: rule__EnumLiteral__ParamsAssignment_1_2_1
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
    // InternalDomainModel.g:1555:1: rule__Constant__Group_0__0 : rule__Constant__Group_0__0__Impl rule__Constant__Group_0__1 ;
    public final void rule__Constant__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1559:1: ( rule__Constant__Group_0__0__Impl rule__Constant__Group_0__1 )
            // InternalDomainModel.g:1560:2: rule__Constant__Group_0__0__Impl rule__Constant__Group_0__1
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
    // InternalDomainModel.g:1567:1: rule__Constant__Group_0__0__Impl : ( () ) ;
    public final void rule__Constant__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1571:1: ( ( () ) )
            // InternalDomainModel.g:1572:1: ( () )
            {
            // InternalDomainModel.g:1572:1: ( () )
            // InternalDomainModel.g:1573:2: ()
            {
             before(grammarAccess.getConstantAccess().getIntConstantAction_0_0()); 
            // InternalDomainModel.g:1574:2: ()
            // InternalDomainModel.g:1574:3: 
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
    // InternalDomainModel.g:1582:1: rule__Constant__Group_0__1 : rule__Constant__Group_0__1__Impl ;
    public final void rule__Constant__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1586:1: ( rule__Constant__Group_0__1__Impl )
            // InternalDomainModel.g:1587:2: rule__Constant__Group_0__1__Impl
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
    // InternalDomainModel.g:1593:1: rule__Constant__Group_0__1__Impl : ( ( rule__Constant__ValueAssignment_0_1 ) ) ;
    public final void rule__Constant__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1597:1: ( ( ( rule__Constant__ValueAssignment_0_1 ) ) )
            // InternalDomainModel.g:1598:1: ( ( rule__Constant__ValueAssignment_0_1 ) )
            {
            // InternalDomainModel.g:1598:1: ( ( rule__Constant__ValueAssignment_0_1 ) )
            // InternalDomainModel.g:1599:2: ( rule__Constant__ValueAssignment_0_1 )
            {
             before(grammarAccess.getConstantAccess().getValueAssignment_0_1()); 
            // InternalDomainModel.g:1600:2: ( rule__Constant__ValueAssignment_0_1 )
            // InternalDomainModel.g:1600:3: rule__Constant__ValueAssignment_0_1
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
    // InternalDomainModel.g:1609:1: rule__Constant__Group_1__0 : rule__Constant__Group_1__0__Impl rule__Constant__Group_1__1 ;
    public final void rule__Constant__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1613:1: ( rule__Constant__Group_1__0__Impl rule__Constant__Group_1__1 )
            // InternalDomainModel.g:1614:2: rule__Constant__Group_1__0__Impl rule__Constant__Group_1__1
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
    // InternalDomainModel.g:1621:1: rule__Constant__Group_1__0__Impl : ( () ) ;
    public final void rule__Constant__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1625:1: ( ( () ) )
            // InternalDomainModel.g:1626:1: ( () )
            {
            // InternalDomainModel.g:1626:1: ( () )
            // InternalDomainModel.g:1627:2: ()
            {
             before(grammarAccess.getConstantAccess().getLongConstantAction_1_0()); 
            // InternalDomainModel.g:1628:2: ()
            // InternalDomainModel.g:1628:3: 
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
    // InternalDomainModel.g:1636:1: rule__Constant__Group_1__1 : rule__Constant__Group_1__1__Impl rule__Constant__Group_1__2 ;
    public final void rule__Constant__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1640:1: ( rule__Constant__Group_1__1__Impl rule__Constant__Group_1__2 )
            // InternalDomainModel.g:1641:2: rule__Constant__Group_1__1__Impl rule__Constant__Group_1__2
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
    // InternalDomainModel.g:1648:1: rule__Constant__Group_1__1__Impl : ( ( rule__Constant__ValueAssignment_1_1 ) ) ;
    public final void rule__Constant__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1652:1: ( ( ( rule__Constant__ValueAssignment_1_1 ) ) )
            // InternalDomainModel.g:1653:1: ( ( rule__Constant__ValueAssignment_1_1 ) )
            {
            // InternalDomainModel.g:1653:1: ( ( rule__Constant__ValueAssignment_1_1 ) )
            // InternalDomainModel.g:1654:2: ( rule__Constant__ValueAssignment_1_1 )
            {
             before(grammarAccess.getConstantAccess().getValueAssignment_1_1()); 
            // InternalDomainModel.g:1655:2: ( rule__Constant__ValueAssignment_1_1 )
            // InternalDomainModel.g:1655:3: rule__Constant__ValueAssignment_1_1
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
    // InternalDomainModel.g:1663:1: rule__Constant__Group_1__2 : rule__Constant__Group_1__2__Impl ;
    public final void rule__Constant__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1667:1: ( rule__Constant__Group_1__2__Impl )
            // InternalDomainModel.g:1668:2: rule__Constant__Group_1__2__Impl
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
    // InternalDomainModel.g:1674:1: rule__Constant__Group_1__2__Impl : ( 'L' ) ;
    public final void rule__Constant__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1678:1: ( ( 'L' ) )
            // InternalDomainModel.g:1679:1: ( 'L' )
            {
            // InternalDomainModel.g:1679:1: ( 'L' )
            // InternalDomainModel.g:1680:2: 'L'
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
    // InternalDomainModel.g:1690:1: rule__Constant__Group_2__0 : rule__Constant__Group_2__0__Impl rule__Constant__Group_2__1 ;
    public final void rule__Constant__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1694:1: ( rule__Constant__Group_2__0__Impl rule__Constant__Group_2__1 )
            // InternalDomainModel.g:1695:2: rule__Constant__Group_2__0__Impl rule__Constant__Group_2__1
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
    // InternalDomainModel.g:1702:1: rule__Constant__Group_2__0__Impl : ( () ) ;
    public final void rule__Constant__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1706:1: ( ( () ) )
            // InternalDomainModel.g:1707:1: ( () )
            {
            // InternalDomainModel.g:1707:1: ( () )
            // InternalDomainModel.g:1708:2: ()
            {
             before(grammarAccess.getConstantAccess().getStringConstantAction_2_0()); 
            // InternalDomainModel.g:1709:2: ()
            // InternalDomainModel.g:1709:3: 
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
    // InternalDomainModel.g:1717:1: rule__Constant__Group_2__1 : rule__Constant__Group_2__1__Impl ;
    public final void rule__Constant__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1721:1: ( rule__Constant__Group_2__1__Impl )
            // InternalDomainModel.g:1722:2: rule__Constant__Group_2__1__Impl
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
    // InternalDomainModel.g:1728:1: rule__Constant__Group_2__1__Impl : ( ( rule__Constant__ValueAssignment_2_1 ) ) ;
    public final void rule__Constant__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1732:1: ( ( ( rule__Constant__ValueAssignment_2_1 ) ) )
            // InternalDomainModel.g:1733:1: ( ( rule__Constant__ValueAssignment_2_1 ) )
            {
            // InternalDomainModel.g:1733:1: ( ( rule__Constant__ValueAssignment_2_1 ) )
            // InternalDomainModel.g:1734:2: ( rule__Constant__ValueAssignment_2_1 )
            {
             before(grammarAccess.getConstantAccess().getValueAssignment_2_1()); 
            // InternalDomainModel.g:1735:2: ( rule__Constant__ValueAssignment_2_1 )
            // InternalDomainModel.g:1735:3: rule__Constant__ValueAssignment_2_1
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
    // InternalDomainModel.g:1744:1: rule__Constant__Group_3__0 : rule__Constant__Group_3__0__Impl rule__Constant__Group_3__1 ;
    public final void rule__Constant__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1748:1: ( rule__Constant__Group_3__0__Impl rule__Constant__Group_3__1 )
            // InternalDomainModel.g:1749:2: rule__Constant__Group_3__0__Impl rule__Constant__Group_3__1
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
    // InternalDomainModel.g:1756:1: rule__Constant__Group_3__0__Impl : ( () ) ;
    public final void rule__Constant__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1760:1: ( ( () ) )
            // InternalDomainModel.g:1761:1: ( () )
            {
            // InternalDomainModel.g:1761:1: ( () )
            // InternalDomainModel.g:1762:2: ()
            {
             before(grammarAccess.getConstantAccess().getBoolConstantAction_3_0()); 
            // InternalDomainModel.g:1763:2: ()
            // InternalDomainModel.g:1763:3: 
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
    // InternalDomainModel.g:1771:1: rule__Constant__Group_3__1 : rule__Constant__Group_3__1__Impl ;
    public final void rule__Constant__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1775:1: ( rule__Constant__Group_3__1__Impl )
            // InternalDomainModel.g:1776:2: rule__Constant__Group_3__1__Impl
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
    // InternalDomainModel.g:1782:1: rule__Constant__Group_3__1__Impl : ( ( rule__Constant__ValueAssignment_3_1 ) ) ;
    public final void rule__Constant__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1786:1: ( ( ( rule__Constant__ValueAssignment_3_1 ) ) )
            // InternalDomainModel.g:1787:1: ( ( rule__Constant__ValueAssignment_3_1 ) )
            {
            // InternalDomainModel.g:1787:1: ( ( rule__Constant__ValueAssignment_3_1 ) )
            // InternalDomainModel.g:1788:2: ( rule__Constant__ValueAssignment_3_1 )
            {
             before(grammarAccess.getConstantAccess().getValueAssignment_3_1()); 
            // InternalDomainModel.g:1789:2: ( rule__Constant__ValueAssignment_3_1 )
            // InternalDomainModel.g:1789:3: rule__Constant__ValueAssignment_3_1
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
    // InternalDomainModel.g:1798:1: rule__Constant__Group_4__0 : rule__Constant__Group_4__0__Impl rule__Constant__Group_4__1 ;
    public final void rule__Constant__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1802:1: ( rule__Constant__Group_4__0__Impl rule__Constant__Group_4__1 )
            // InternalDomainModel.g:1803:2: rule__Constant__Group_4__0__Impl rule__Constant__Group_4__1
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
    // InternalDomainModel.g:1810:1: rule__Constant__Group_4__0__Impl : ( () ) ;
    public final void rule__Constant__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1814:1: ( ( () ) )
            // InternalDomainModel.g:1815:1: ( () )
            {
            // InternalDomainModel.g:1815:1: ( () )
            // InternalDomainModel.g:1816:2: ()
            {
             before(grammarAccess.getConstantAccess().getDateConstantAction_4_0()); 
            // InternalDomainModel.g:1817:2: ()
            // InternalDomainModel.g:1817:3: 
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
    // InternalDomainModel.g:1825:1: rule__Constant__Group_4__1 : rule__Constant__Group_4__1__Impl rule__Constant__Group_4__2 ;
    public final void rule__Constant__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1829:1: ( rule__Constant__Group_4__1__Impl rule__Constant__Group_4__2 )
            // InternalDomainModel.g:1830:2: rule__Constant__Group_4__1__Impl rule__Constant__Group_4__2
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
    // InternalDomainModel.g:1837:1: rule__Constant__Group_4__1__Impl : ( ( rule__Constant__DayAssignment_4_1 ) ) ;
    public final void rule__Constant__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1841:1: ( ( ( rule__Constant__DayAssignment_4_1 ) ) )
            // InternalDomainModel.g:1842:1: ( ( rule__Constant__DayAssignment_4_1 ) )
            {
            // InternalDomainModel.g:1842:1: ( ( rule__Constant__DayAssignment_4_1 ) )
            // InternalDomainModel.g:1843:2: ( rule__Constant__DayAssignment_4_1 )
            {
             before(grammarAccess.getConstantAccess().getDayAssignment_4_1()); 
            // InternalDomainModel.g:1844:2: ( rule__Constant__DayAssignment_4_1 )
            // InternalDomainModel.g:1844:3: rule__Constant__DayAssignment_4_1
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
    // InternalDomainModel.g:1852:1: rule__Constant__Group_4__2 : rule__Constant__Group_4__2__Impl rule__Constant__Group_4__3 ;
    public final void rule__Constant__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1856:1: ( rule__Constant__Group_4__2__Impl rule__Constant__Group_4__3 )
            // InternalDomainModel.g:1857:2: rule__Constant__Group_4__2__Impl rule__Constant__Group_4__3
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
    // InternalDomainModel.g:1864:1: rule__Constant__Group_4__2__Impl : ( '/' ) ;
    public final void rule__Constant__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1868:1: ( ( '/' ) )
            // InternalDomainModel.g:1869:1: ( '/' )
            {
            // InternalDomainModel.g:1869:1: ( '/' )
            // InternalDomainModel.g:1870:2: '/'
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
    // InternalDomainModel.g:1879:1: rule__Constant__Group_4__3 : rule__Constant__Group_4__3__Impl rule__Constant__Group_4__4 ;
    public final void rule__Constant__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1883:1: ( rule__Constant__Group_4__3__Impl rule__Constant__Group_4__4 )
            // InternalDomainModel.g:1884:2: rule__Constant__Group_4__3__Impl rule__Constant__Group_4__4
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
    // InternalDomainModel.g:1891:1: rule__Constant__Group_4__3__Impl : ( ( rule__Constant__MonthAssignment_4_3 ) ) ;
    public final void rule__Constant__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1895:1: ( ( ( rule__Constant__MonthAssignment_4_3 ) ) )
            // InternalDomainModel.g:1896:1: ( ( rule__Constant__MonthAssignment_4_3 ) )
            {
            // InternalDomainModel.g:1896:1: ( ( rule__Constant__MonthAssignment_4_3 ) )
            // InternalDomainModel.g:1897:2: ( rule__Constant__MonthAssignment_4_3 )
            {
             before(grammarAccess.getConstantAccess().getMonthAssignment_4_3()); 
            // InternalDomainModel.g:1898:2: ( rule__Constant__MonthAssignment_4_3 )
            // InternalDomainModel.g:1898:3: rule__Constant__MonthAssignment_4_3
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
    // InternalDomainModel.g:1906:1: rule__Constant__Group_4__4 : rule__Constant__Group_4__4__Impl rule__Constant__Group_4__5 ;
    public final void rule__Constant__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1910:1: ( rule__Constant__Group_4__4__Impl rule__Constant__Group_4__5 )
            // InternalDomainModel.g:1911:2: rule__Constant__Group_4__4__Impl rule__Constant__Group_4__5
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
    // InternalDomainModel.g:1918:1: rule__Constant__Group_4__4__Impl : ( '/' ) ;
    public final void rule__Constant__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1922:1: ( ( '/' ) )
            // InternalDomainModel.g:1923:1: ( '/' )
            {
            // InternalDomainModel.g:1923:1: ( '/' )
            // InternalDomainModel.g:1924:2: '/'
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
    // InternalDomainModel.g:1933:1: rule__Constant__Group_4__5 : rule__Constant__Group_4__5__Impl ;
    public final void rule__Constant__Group_4__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1937:1: ( rule__Constant__Group_4__5__Impl )
            // InternalDomainModel.g:1938:2: rule__Constant__Group_4__5__Impl
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
    // InternalDomainModel.g:1944:1: rule__Constant__Group_4__5__Impl : ( ( rule__Constant__YearAssignment_4_5 ) ) ;
    public final void rule__Constant__Group_4__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1948:1: ( ( ( rule__Constant__YearAssignment_4_5 ) ) )
            // InternalDomainModel.g:1949:1: ( ( rule__Constant__YearAssignment_4_5 ) )
            {
            // InternalDomainModel.g:1949:1: ( ( rule__Constant__YearAssignment_4_5 ) )
            // InternalDomainModel.g:1950:2: ( rule__Constant__YearAssignment_4_5 )
            {
             before(grammarAccess.getConstantAccess().getYearAssignment_4_5()); 
            // InternalDomainModel.g:1951:2: ( rule__Constant__YearAssignment_4_5 )
            // InternalDomainModel.g:1951:3: rule__Constant__YearAssignment_4_5
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
    // InternalDomainModel.g:1960:1: rule__Constant__Group_5__0 : rule__Constant__Group_5__0__Impl rule__Constant__Group_5__1 ;
    public final void rule__Constant__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1964:1: ( rule__Constant__Group_5__0__Impl rule__Constant__Group_5__1 )
            // InternalDomainModel.g:1965:2: rule__Constant__Group_5__0__Impl rule__Constant__Group_5__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalDomainModel.g:1972:1: rule__Constant__Group_5__0__Impl : ( () ) ;
    public final void rule__Constant__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1976:1: ( ( () ) )
            // InternalDomainModel.g:1977:1: ( () )
            {
            // InternalDomainModel.g:1977:1: ( () )
            // InternalDomainModel.g:1978:2: ()
            {
             before(grammarAccess.getConstantAccess().getNullAction_5_0()); 
            // InternalDomainModel.g:1979:2: ()
            // InternalDomainModel.g:1979:3: 
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
    // InternalDomainModel.g:1987:1: rule__Constant__Group_5__1 : rule__Constant__Group_5__1__Impl ;
    public final void rule__Constant__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:1991:1: ( rule__Constant__Group_5__1__Impl )
            // InternalDomainModel.g:1992:2: rule__Constant__Group_5__1__Impl
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
    // InternalDomainModel.g:1998:1: rule__Constant__Group_5__1__Impl : ( 'null' ) ;
    public final void rule__Constant__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2002:1: ( ( 'null' ) )
            // InternalDomainModel.g:2003:1: ( 'null' )
            {
            // InternalDomainModel.g:2003:1: ( 'null' )
            // InternalDomainModel.g:2004:2: 'null'
            {
             before(grammarAccess.getConstantAccess().getNullKeyword_5_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalDomainModel.g:2014:1: rule__EntityOption__Group_0__0 : rule__EntityOption__Group_0__0__Impl rule__EntityOption__Group_0__1 ;
    public final void rule__EntityOption__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2018:1: ( rule__EntityOption__Group_0__0__Impl rule__EntityOption__Group_0__1 )
            // InternalDomainModel.g:2019:2: rule__EntityOption__Group_0__0__Impl rule__EntityOption__Group_0__1
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
    // InternalDomainModel.g:2026:1: rule__EntityOption__Group_0__0__Impl : ( () ) ;
    public final void rule__EntityOption__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2030:1: ( ( () ) )
            // InternalDomainModel.g:2031:1: ( () )
            {
            // InternalDomainModel.g:2031:1: ( () )
            // InternalDomainModel.g:2032:2: ()
            {
             before(grammarAccess.getEntityOptionAccess().getEntityDeleteOptionAction_0_0()); 
            // InternalDomainModel.g:2033:2: ()
            // InternalDomainModel.g:2033:3: 
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
    // InternalDomainModel.g:2041:1: rule__EntityOption__Group_0__1 : rule__EntityOption__Group_0__1__Impl ;
    public final void rule__EntityOption__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2045:1: ( rule__EntityOption__Group_0__1__Impl )
            // InternalDomainModel.g:2046:2: rule__EntityOption__Group_0__1__Impl
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
    // InternalDomainModel.g:2052:1: rule__EntityOption__Group_0__1__Impl : ( ( rule__EntityOption__DeleteByFlagAssignment_0_1 ) ) ;
    public final void rule__EntityOption__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2056:1: ( ( ( rule__EntityOption__DeleteByFlagAssignment_0_1 ) ) )
            // InternalDomainModel.g:2057:1: ( ( rule__EntityOption__DeleteByFlagAssignment_0_1 ) )
            {
            // InternalDomainModel.g:2057:1: ( ( rule__EntityOption__DeleteByFlagAssignment_0_1 ) )
            // InternalDomainModel.g:2058:2: ( rule__EntityOption__DeleteByFlagAssignment_0_1 )
            {
             before(grammarAccess.getEntityOptionAccess().getDeleteByFlagAssignment_0_1()); 
            // InternalDomainModel.g:2059:2: ( rule__EntityOption__DeleteByFlagAssignment_0_1 )
            // InternalDomainModel.g:2059:3: rule__EntityOption__DeleteByFlagAssignment_0_1
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
    // InternalDomainModel.g:2068:1: rule__EntityOption__Group_1__0 : rule__EntityOption__Group_1__0__Impl rule__EntityOption__Group_1__1 ;
    public final void rule__EntityOption__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2072:1: ( rule__EntityOption__Group_1__0__Impl rule__EntityOption__Group_1__1 )
            // InternalDomainModel.g:2073:2: rule__EntityOption__Group_1__0__Impl rule__EntityOption__Group_1__1
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
    // InternalDomainModel.g:2080:1: rule__EntityOption__Group_1__0__Impl : ( () ) ;
    public final void rule__EntityOption__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2084:1: ( ( () ) )
            // InternalDomainModel.g:2085:1: ( () )
            {
            // InternalDomainModel.g:2085:1: ( () )
            // InternalDomainModel.g:2086:2: ()
            {
             before(grammarAccess.getEntityOptionAccess().getInheritanceMappingOptionAction_1_0()); 
            // InternalDomainModel.g:2087:2: ()
            // InternalDomainModel.g:2087:3: 
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
    // InternalDomainModel.g:2095:1: rule__EntityOption__Group_1__1 : rule__EntityOption__Group_1__1__Impl rule__EntityOption__Group_1__2 ;
    public final void rule__EntityOption__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2099:1: ( rule__EntityOption__Group_1__1__Impl rule__EntityOption__Group_1__2 )
            // InternalDomainModel.g:2100:2: rule__EntityOption__Group_1__1__Impl rule__EntityOption__Group_1__2
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
    // InternalDomainModel.g:2107:1: rule__EntityOption__Group_1__1__Impl : ( 'inheritance' ) ;
    public final void rule__EntityOption__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2111:1: ( ( 'inheritance' ) )
            // InternalDomainModel.g:2112:1: ( 'inheritance' )
            {
            // InternalDomainModel.g:2112:1: ( 'inheritance' )
            // InternalDomainModel.g:2113:2: 'inheritance'
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
    // InternalDomainModel.g:2122:1: rule__EntityOption__Group_1__2 : rule__EntityOption__Group_1__2__Impl rule__EntityOption__Group_1__3 ;
    public final void rule__EntityOption__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2126:1: ( rule__EntityOption__Group_1__2__Impl rule__EntityOption__Group_1__3 )
            // InternalDomainModel.g:2127:2: rule__EntityOption__Group_1__2__Impl rule__EntityOption__Group_1__3
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
    // InternalDomainModel.g:2134:1: rule__EntityOption__Group_1__2__Impl : ( '=' ) ;
    public final void rule__EntityOption__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2138:1: ( ( '=' ) )
            // InternalDomainModel.g:2139:1: ( '=' )
            {
            // InternalDomainModel.g:2139:1: ( '=' )
            // InternalDomainModel.g:2140:2: '='
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
    // InternalDomainModel.g:2149:1: rule__EntityOption__Group_1__3 : rule__EntityOption__Group_1__3__Impl ;
    public final void rule__EntityOption__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2153:1: ( rule__EntityOption__Group_1__3__Impl )
            // InternalDomainModel.g:2154:2: rule__EntityOption__Group_1__3__Impl
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
    // InternalDomainModel.g:2160:1: rule__EntityOption__Group_1__3__Impl : ( ( rule__EntityOption__InheritanceMappingAssignment_1_3 ) ) ;
    public final void rule__EntityOption__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2164:1: ( ( ( rule__EntityOption__InheritanceMappingAssignment_1_3 ) ) )
            // InternalDomainModel.g:2165:1: ( ( rule__EntityOption__InheritanceMappingAssignment_1_3 ) )
            {
            // InternalDomainModel.g:2165:1: ( ( rule__EntityOption__InheritanceMappingAssignment_1_3 ) )
            // InternalDomainModel.g:2166:2: ( rule__EntityOption__InheritanceMappingAssignment_1_3 )
            {
             before(grammarAccess.getEntityOptionAccess().getInheritanceMappingAssignment_1_3()); 
            // InternalDomainModel.g:2167:2: ( rule__EntityOption__InheritanceMappingAssignment_1_3 )
            // InternalDomainModel.g:2167:3: rule__EntityOption__InheritanceMappingAssignment_1_3
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
    // InternalDomainModel.g:2176:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2180:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalDomainModel.g:2181:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalDomainModel.g:2188:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__TypeAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2192:1: ( ( ( rule__Attribute__TypeAssignment_0 ) ) )
            // InternalDomainModel.g:2193:1: ( ( rule__Attribute__TypeAssignment_0 ) )
            {
            // InternalDomainModel.g:2193:1: ( ( rule__Attribute__TypeAssignment_0 ) )
            // InternalDomainModel.g:2194:2: ( rule__Attribute__TypeAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_0()); 
            // InternalDomainModel.g:2195:2: ( rule__Attribute__TypeAssignment_0 )
            // InternalDomainModel.g:2195:3: rule__Attribute__TypeAssignment_0
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
    // InternalDomainModel.g:2203:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2207:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalDomainModel.g:2208:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
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
    // InternalDomainModel.g:2215:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2219:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalDomainModel.g:2220:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalDomainModel.g:2220:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalDomainModel.g:2221:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalDomainModel.g:2222:2: ( rule__Attribute__NameAssignment_1 )
            // InternalDomainModel.g:2222:3: rule__Attribute__NameAssignment_1
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
    // InternalDomainModel.g:2230:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2234:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalDomainModel.g:2235:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
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
    // InternalDomainModel.g:2242:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__Group_2__0 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2246:1: ( ( ( rule__Attribute__Group_2__0 )? ) )
            // InternalDomainModel.g:2247:1: ( ( rule__Attribute__Group_2__0 )? )
            {
            // InternalDomainModel.g:2247:1: ( ( rule__Attribute__Group_2__0 )? )
            // InternalDomainModel.g:2248:2: ( rule__Attribute__Group_2__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_2()); 
            // InternalDomainModel.g:2249:2: ( rule__Attribute__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=41 && LA20_0<=42)||(LA20_0>=45 && LA20_0<=46)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDomainModel.g:2249:3: rule__Attribute__Group_2__0
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
    // InternalDomainModel.g:2257:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2261:1: ( rule__Attribute__Group__3__Impl )
            // InternalDomainModel.g:2262:2: rule__Attribute__Group__3__Impl
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
    // InternalDomainModel.g:2268:1: rule__Attribute__Group__3__Impl : ( ';' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2272:1: ( ( ';' ) )
            // InternalDomainModel.g:2273:1: ( ';' )
            {
            // InternalDomainModel.g:2273:1: ( ';' )
            // InternalDomainModel.g:2274:2: ';'
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
    // InternalDomainModel.g:2284:1: rule__Attribute__Group_2__0 : rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1 ;
    public final void rule__Attribute__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2288:1: ( rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1 )
            // InternalDomainModel.g:2289:2: rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1
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
    // InternalDomainModel.g:2296:1: rule__Attribute__Group_2__0__Impl : ( ( rule__Attribute__OptionsAssignment_2_0 ) ) ;
    public final void rule__Attribute__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2300:1: ( ( ( rule__Attribute__OptionsAssignment_2_0 ) ) )
            // InternalDomainModel.g:2301:1: ( ( rule__Attribute__OptionsAssignment_2_0 ) )
            {
            // InternalDomainModel.g:2301:1: ( ( rule__Attribute__OptionsAssignment_2_0 ) )
            // InternalDomainModel.g:2302:2: ( rule__Attribute__OptionsAssignment_2_0 )
            {
             before(grammarAccess.getAttributeAccess().getOptionsAssignment_2_0()); 
            // InternalDomainModel.g:2303:2: ( rule__Attribute__OptionsAssignment_2_0 )
            // InternalDomainModel.g:2303:3: rule__Attribute__OptionsAssignment_2_0
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
    // InternalDomainModel.g:2311:1: rule__Attribute__Group_2__1 : rule__Attribute__Group_2__1__Impl ;
    public final void rule__Attribute__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2315:1: ( rule__Attribute__Group_2__1__Impl )
            // InternalDomainModel.g:2316:2: rule__Attribute__Group_2__1__Impl
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
    // InternalDomainModel.g:2322:1: rule__Attribute__Group_2__1__Impl : ( ( rule__Attribute__Group_2_1__0 )* ) ;
    public final void rule__Attribute__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2326:1: ( ( ( rule__Attribute__Group_2_1__0 )* ) )
            // InternalDomainModel.g:2327:1: ( ( rule__Attribute__Group_2_1__0 )* )
            {
            // InternalDomainModel.g:2327:1: ( ( rule__Attribute__Group_2_1__0 )* )
            // InternalDomainModel.g:2328:2: ( rule__Attribute__Group_2_1__0 )*
            {
             before(grammarAccess.getAttributeAccess().getGroup_2_1()); 
            // InternalDomainModel.g:2329:2: ( rule__Attribute__Group_2_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==25) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalDomainModel.g:2329:3: rule__Attribute__Group_2_1__0
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
    // InternalDomainModel.g:2338:1: rule__Attribute__Group_2_1__0 : rule__Attribute__Group_2_1__0__Impl rule__Attribute__Group_2_1__1 ;
    public final void rule__Attribute__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2342:1: ( rule__Attribute__Group_2_1__0__Impl rule__Attribute__Group_2_1__1 )
            // InternalDomainModel.g:2343:2: rule__Attribute__Group_2_1__0__Impl rule__Attribute__Group_2_1__1
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
    // InternalDomainModel.g:2350:1: rule__Attribute__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Attribute__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2354:1: ( ( ',' ) )
            // InternalDomainModel.g:2355:1: ( ',' )
            {
            // InternalDomainModel.g:2355:1: ( ',' )
            // InternalDomainModel.g:2356:2: ','
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
    // InternalDomainModel.g:2365:1: rule__Attribute__Group_2_1__1 : rule__Attribute__Group_2_1__1__Impl ;
    public final void rule__Attribute__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2369:1: ( rule__Attribute__Group_2_1__1__Impl )
            // InternalDomainModel.g:2370:2: rule__Attribute__Group_2_1__1__Impl
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
    // InternalDomainModel.g:2376:1: rule__Attribute__Group_2_1__1__Impl : ( ( rule__Attribute__OptionsAssignment_2_1_1 ) ) ;
    public final void rule__Attribute__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2380:1: ( ( ( rule__Attribute__OptionsAssignment_2_1_1 ) ) )
            // InternalDomainModel.g:2381:1: ( ( rule__Attribute__OptionsAssignment_2_1_1 ) )
            {
            // InternalDomainModel.g:2381:1: ( ( rule__Attribute__OptionsAssignment_2_1_1 ) )
            // InternalDomainModel.g:2382:2: ( rule__Attribute__OptionsAssignment_2_1_1 )
            {
             before(grammarAccess.getAttributeAccess().getOptionsAssignment_2_1_1()); 
            // InternalDomainModel.g:2383:2: ( rule__Attribute__OptionsAssignment_2_1_1 )
            // InternalDomainModel.g:2383:3: rule__Attribute__OptionsAssignment_2_1_1
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
    // InternalDomainModel.g:2392:1: rule__BasicType__Group_0__0 : rule__BasicType__Group_0__0__Impl rule__BasicType__Group_0__1 ;
    public final void rule__BasicType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2396:1: ( rule__BasicType__Group_0__0__Impl rule__BasicType__Group_0__1 )
            // InternalDomainModel.g:2397:2: rule__BasicType__Group_0__0__Impl rule__BasicType__Group_0__1
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
    // InternalDomainModel.g:2404:1: rule__BasicType__Group_0__0__Impl : ( () ) ;
    public final void rule__BasicType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2408:1: ( ( () ) )
            // InternalDomainModel.g:2409:1: ( () )
            {
            // InternalDomainModel.g:2409:1: ( () )
            // InternalDomainModel.g:2410:2: ()
            {
             before(grammarAccess.getBasicTypeAccess().getStringTypeAction_0_0()); 
            // InternalDomainModel.g:2411:2: ()
            // InternalDomainModel.g:2411:3: 
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
    // InternalDomainModel.g:2419:1: rule__BasicType__Group_0__1 : rule__BasicType__Group_0__1__Impl ;
    public final void rule__BasicType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2423:1: ( rule__BasicType__Group_0__1__Impl )
            // InternalDomainModel.g:2424:2: rule__BasicType__Group_0__1__Impl
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
    // InternalDomainModel.g:2430:1: rule__BasicType__Group_0__1__Impl : ( 'string' ) ;
    public final void rule__BasicType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2434:1: ( ( 'string' ) )
            // InternalDomainModel.g:2435:1: ( 'string' )
            {
            // InternalDomainModel.g:2435:1: ( 'string' )
            // InternalDomainModel.g:2436:2: 'string'
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
    // InternalDomainModel.g:2446:1: rule__BasicType__Group_1__0 : rule__BasicType__Group_1__0__Impl rule__BasicType__Group_1__1 ;
    public final void rule__BasicType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2450:1: ( rule__BasicType__Group_1__0__Impl rule__BasicType__Group_1__1 )
            // InternalDomainModel.g:2451:2: rule__BasicType__Group_1__0__Impl rule__BasicType__Group_1__1
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
    // InternalDomainModel.g:2458:1: rule__BasicType__Group_1__0__Impl : ( () ) ;
    public final void rule__BasicType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2462:1: ( ( () ) )
            // InternalDomainModel.g:2463:1: ( () )
            {
            // InternalDomainModel.g:2463:1: ( () )
            // InternalDomainModel.g:2464:2: ()
            {
             before(grammarAccess.getBasicTypeAccess().getIntTypeAction_1_0()); 
            // InternalDomainModel.g:2465:2: ()
            // InternalDomainModel.g:2465:3: 
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
    // InternalDomainModel.g:2473:1: rule__BasicType__Group_1__1 : rule__BasicType__Group_1__1__Impl ;
    public final void rule__BasicType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2477:1: ( rule__BasicType__Group_1__1__Impl )
            // InternalDomainModel.g:2478:2: rule__BasicType__Group_1__1__Impl
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
    // InternalDomainModel.g:2484:1: rule__BasicType__Group_1__1__Impl : ( 'int' ) ;
    public final void rule__BasicType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2488:1: ( ( 'int' ) )
            // InternalDomainModel.g:2489:1: ( 'int' )
            {
            // InternalDomainModel.g:2489:1: ( 'int' )
            // InternalDomainModel.g:2490:2: 'int'
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
    // InternalDomainModel.g:2500:1: rule__BasicType__Group_2__0 : rule__BasicType__Group_2__0__Impl rule__BasicType__Group_2__1 ;
    public final void rule__BasicType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2504:1: ( rule__BasicType__Group_2__0__Impl rule__BasicType__Group_2__1 )
            // InternalDomainModel.g:2505:2: rule__BasicType__Group_2__0__Impl rule__BasicType__Group_2__1
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
    // InternalDomainModel.g:2512:1: rule__BasicType__Group_2__0__Impl : ( () ) ;
    public final void rule__BasicType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2516:1: ( ( () ) )
            // InternalDomainModel.g:2517:1: ( () )
            {
            // InternalDomainModel.g:2517:1: ( () )
            // InternalDomainModel.g:2518:2: ()
            {
             before(grammarAccess.getBasicTypeAccess().getLongTypeAction_2_0()); 
            // InternalDomainModel.g:2519:2: ()
            // InternalDomainModel.g:2519:3: 
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
    // InternalDomainModel.g:2527:1: rule__BasicType__Group_2__1 : rule__BasicType__Group_2__1__Impl ;
    public final void rule__BasicType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2531:1: ( rule__BasicType__Group_2__1__Impl )
            // InternalDomainModel.g:2532:2: rule__BasicType__Group_2__1__Impl
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
    // InternalDomainModel.g:2538:1: rule__BasicType__Group_2__1__Impl : ( 'long' ) ;
    public final void rule__BasicType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2542:1: ( ( 'long' ) )
            // InternalDomainModel.g:2543:1: ( 'long' )
            {
            // InternalDomainModel.g:2543:1: ( 'long' )
            // InternalDomainModel.g:2544:2: 'long'
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
    // InternalDomainModel.g:2554:1: rule__BasicType__Group_3__0 : rule__BasicType__Group_3__0__Impl rule__BasicType__Group_3__1 ;
    public final void rule__BasicType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2558:1: ( rule__BasicType__Group_3__0__Impl rule__BasicType__Group_3__1 )
            // InternalDomainModel.g:2559:2: rule__BasicType__Group_3__0__Impl rule__BasicType__Group_3__1
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
    // InternalDomainModel.g:2566:1: rule__BasicType__Group_3__0__Impl : ( () ) ;
    public final void rule__BasicType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2570:1: ( ( () ) )
            // InternalDomainModel.g:2571:1: ( () )
            {
            // InternalDomainModel.g:2571:1: ( () )
            // InternalDomainModel.g:2572:2: ()
            {
             before(grammarAccess.getBasicTypeAccess().getBoolTypeAction_3_0()); 
            // InternalDomainModel.g:2573:2: ()
            // InternalDomainModel.g:2573:3: 
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
    // InternalDomainModel.g:2581:1: rule__BasicType__Group_3__1 : rule__BasicType__Group_3__1__Impl ;
    public final void rule__BasicType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2585:1: ( rule__BasicType__Group_3__1__Impl )
            // InternalDomainModel.g:2586:2: rule__BasicType__Group_3__1__Impl
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
    // InternalDomainModel.g:2592:1: rule__BasicType__Group_3__1__Impl : ( 'boolean' ) ;
    public final void rule__BasicType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2596:1: ( ( 'boolean' ) )
            // InternalDomainModel.g:2597:1: ( 'boolean' )
            {
            // InternalDomainModel.g:2597:1: ( 'boolean' )
            // InternalDomainModel.g:2598:2: 'boolean'
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
    // InternalDomainModel.g:2608:1: rule__BasicType__Group_4__0 : rule__BasicType__Group_4__0__Impl rule__BasicType__Group_4__1 ;
    public final void rule__BasicType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2612:1: ( rule__BasicType__Group_4__0__Impl rule__BasicType__Group_4__1 )
            // InternalDomainModel.g:2613:2: rule__BasicType__Group_4__0__Impl rule__BasicType__Group_4__1
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
    // InternalDomainModel.g:2620:1: rule__BasicType__Group_4__0__Impl : ( () ) ;
    public final void rule__BasicType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2624:1: ( ( () ) )
            // InternalDomainModel.g:2625:1: ( () )
            {
            // InternalDomainModel.g:2625:1: ( () )
            // InternalDomainModel.g:2626:2: ()
            {
             before(grammarAccess.getBasicTypeAccess().getDateTypeAction_4_0()); 
            // InternalDomainModel.g:2627:2: ()
            // InternalDomainModel.g:2627:3: 
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
    // InternalDomainModel.g:2635:1: rule__BasicType__Group_4__1 : rule__BasicType__Group_4__1__Impl ;
    public final void rule__BasicType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2639:1: ( rule__BasicType__Group_4__1__Impl )
            // InternalDomainModel.g:2640:2: rule__BasicType__Group_4__1__Impl
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
    // InternalDomainModel.g:2646:1: rule__BasicType__Group_4__1__Impl : ( 'date' ) ;
    public final void rule__BasicType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2650:1: ( ( 'date' ) )
            // InternalDomainModel.g:2651:1: ( 'date' )
            {
            // InternalDomainModel.g:2651:1: ( 'date' )
            // InternalDomainModel.g:2652:2: 'date'
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


    // $ANTLR start "rule__CollectionType__Group__0"
    // InternalDomainModel.g:2662:1: rule__CollectionType__Group__0 : rule__CollectionType__Group__0__Impl rule__CollectionType__Group__1 ;
    public final void rule__CollectionType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2666:1: ( rule__CollectionType__Group__0__Impl rule__CollectionType__Group__1 )
            // InternalDomainModel.g:2667:2: rule__CollectionType__Group__0__Impl rule__CollectionType__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalDomainModel.g:2674:1: rule__CollectionType__Group__0__Impl : ( 'List' ) ;
    public final void rule__CollectionType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2678:1: ( ( 'List' ) )
            // InternalDomainModel.g:2679:1: ( 'List' )
            {
            // InternalDomainModel.g:2679:1: ( 'List' )
            // InternalDomainModel.g:2680:2: 'List'
            {
             before(grammarAccess.getCollectionTypeAccess().getListKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalDomainModel.g:2689:1: rule__CollectionType__Group__1 : rule__CollectionType__Group__1__Impl rule__CollectionType__Group__2 ;
    public final void rule__CollectionType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2693:1: ( rule__CollectionType__Group__1__Impl rule__CollectionType__Group__2 )
            // InternalDomainModel.g:2694:2: rule__CollectionType__Group__1__Impl rule__CollectionType__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalDomainModel.g:2701:1: rule__CollectionType__Group__1__Impl : ( '<' ) ;
    public final void rule__CollectionType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2705:1: ( ( '<' ) )
            // InternalDomainModel.g:2706:1: ( '<' )
            {
            // InternalDomainModel.g:2706:1: ( '<' )
            // InternalDomainModel.g:2707:2: '<'
            {
             before(grammarAccess.getCollectionTypeAccess().getLessThanSignKeyword_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalDomainModel.g:2716:1: rule__CollectionType__Group__2 : rule__CollectionType__Group__2__Impl rule__CollectionType__Group__3 ;
    public final void rule__CollectionType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2720:1: ( rule__CollectionType__Group__2__Impl rule__CollectionType__Group__3 )
            // InternalDomainModel.g:2721:2: rule__CollectionType__Group__2__Impl rule__CollectionType__Group__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalDomainModel.g:2728:1: rule__CollectionType__Group__2__Impl : ( ( rule__CollectionType__OfTypeAssignment_2 ) ) ;
    public final void rule__CollectionType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2732:1: ( ( ( rule__CollectionType__OfTypeAssignment_2 ) ) )
            // InternalDomainModel.g:2733:1: ( ( rule__CollectionType__OfTypeAssignment_2 ) )
            {
            // InternalDomainModel.g:2733:1: ( ( rule__CollectionType__OfTypeAssignment_2 ) )
            // InternalDomainModel.g:2734:2: ( rule__CollectionType__OfTypeAssignment_2 )
            {
             before(grammarAccess.getCollectionTypeAccess().getOfTypeAssignment_2()); 
            // InternalDomainModel.g:2735:2: ( rule__CollectionType__OfTypeAssignment_2 )
            // InternalDomainModel.g:2735:3: rule__CollectionType__OfTypeAssignment_2
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
    // InternalDomainModel.g:2743:1: rule__CollectionType__Group__3 : rule__CollectionType__Group__3__Impl ;
    public final void rule__CollectionType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2747:1: ( rule__CollectionType__Group__3__Impl )
            // InternalDomainModel.g:2748:2: rule__CollectionType__Group__3__Impl
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
    // InternalDomainModel.g:2754:1: rule__CollectionType__Group__3__Impl : ( '>' ) ;
    public final void rule__CollectionType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2758:1: ( ( '>' ) )
            // InternalDomainModel.g:2759:1: ( '>' )
            {
            // InternalDomainModel.g:2759:1: ( '>' )
            // InternalDomainModel.g:2760:2: '>'
            {
             before(grammarAccess.getCollectionTypeAccess().getGreaterThanSignKeyword_3()); 
            match(input,40,FOLLOW_2); 
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
    // InternalDomainModel.g:2770:1: rule__AttributeOption__Group_0__0 : rule__AttributeOption__Group_0__0__Impl rule__AttributeOption__Group_0__1 ;
    public final void rule__AttributeOption__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2774:1: ( rule__AttributeOption__Group_0__0__Impl rule__AttributeOption__Group_0__1 )
            // InternalDomainModel.g:2775:2: rule__AttributeOption__Group_0__0__Impl rule__AttributeOption__Group_0__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalDomainModel.g:2782:1: rule__AttributeOption__Group_0__0__Impl : ( () ) ;
    public final void rule__AttributeOption__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2786:1: ( ( () ) )
            // InternalDomainModel.g:2787:1: ( () )
            {
            // InternalDomainModel.g:2787:1: ( () )
            // InternalDomainModel.g:2788:2: ()
            {
             before(grammarAccess.getAttributeOptionAccess().getRequiredAction_0_0()); 
            // InternalDomainModel.g:2789:2: ()
            // InternalDomainModel.g:2789:3: 
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
    // InternalDomainModel.g:2797:1: rule__AttributeOption__Group_0__1 : rule__AttributeOption__Group_0__1__Impl ;
    public final void rule__AttributeOption__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2801:1: ( rule__AttributeOption__Group_0__1__Impl )
            // InternalDomainModel.g:2802:2: rule__AttributeOption__Group_0__1__Impl
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
    // InternalDomainModel.g:2808:1: rule__AttributeOption__Group_0__1__Impl : ( ( rule__AttributeOption__RequiredAssignment_0_1 ) ) ;
    public final void rule__AttributeOption__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2812:1: ( ( ( rule__AttributeOption__RequiredAssignment_0_1 ) ) )
            // InternalDomainModel.g:2813:1: ( ( rule__AttributeOption__RequiredAssignment_0_1 ) )
            {
            // InternalDomainModel.g:2813:1: ( ( rule__AttributeOption__RequiredAssignment_0_1 ) )
            // InternalDomainModel.g:2814:2: ( rule__AttributeOption__RequiredAssignment_0_1 )
            {
             before(grammarAccess.getAttributeOptionAccess().getRequiredAssignment_0_1()); 
            // InternalDomainModel.g:2815:2: ( rule__AttributeOption__RequiredAssignment_0_1 )
            // InternalDomainModel.g:2815:3: rule__AttributeOption__RequiredAssignment_0_1
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
    // InternalDomainModel.g:2824:1: rule__AttributeOption__Group_1__0 : rule__AttributeOption__Group_1__0__Impl rule__AttributeOption__Group_1__1 ;
    public final void rule__AttributeOption__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2828:1: ( rule__AttributeOption__Group_1__0__Impl rule__AttributeOption__Group_1__1 )
            // InternalDomainModel.g:2829:2: rule__AttributeOption__Group_1__0__Impl rule__AttributeOption__Group_1__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalDomainModel.g:2836:1: rule__AttributeOption__Group_1__0__Impl : ( () ) ;
    public final void rule__AttributeOption__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2840:1: ( ( () ) )
            // InternalDomainModel.g:2841:1: ( () )
            {
            // InternalDomainModel.g:2841:1: ( () )
            // InternalDomainModel.g:2842:2: ()
            {
             before(grammarAccess.getAttributeOptionAccess().getPartOfAction_1_0()); 
            // InternalDomainModel.g:2843:2: ()
            // InternalDomainModel.g:2843:3: 
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
    // InternalDomainModel.g:2851:1: rule__AttributeOption__Group_1__1 : rule__AttributeOption__Group_1__1__Impl ;
    public final void rule__AttributeOption__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2855:1: ( rule__AttributeOption__Group_1__1__Impl )
            // InternalDomainModel.g:2856:2: rule__AttributeOption__Group_1__1__Impl
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
    // InternalDomainModel.g:2862:1: rule__AttributeOption__Group_1__1__Impl : ( ( rule__AttributeOption__PartOfAssignment_1_1 ) ) ;
    public final void rule__AttributeOption__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2866:1: ( ( ( rule__AttributeOption__PartOfAssignment_1_1 ) ) )
            // InternalDomainModel.g:2867:1: ( ( rule__AttributeOption__PartOfAssignment_1_1 ) )
            {
            // InternalDomainModel.g:2867:1: ( ( rule__AttributeOption__PartOfAssignment_1_1 ) )
            // InternalDomainModel.g:2868:2: ( rule__AttributeOption__PartOfAssignment_1_1 )
            {
             before(grammarAccess.getAttributeOptionAccess().getPartOfAssignment_1_1()); 
            // InternalDomainModel.g:2869:2: ( rule__AttributeOption__PartOfAssignment_1_1 )
            // InternalDomainModel.g:2869:3: rule__AttributeOption__PartOfAssignment_1_1
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
    // InternalDomainModel.g:2878:1: rule__AttributeOption__Group_2__0 : rule__AttributeOption__Group_2__0__Impl rule__AttributeOption__Group_2__1 ;
    public final void rule__AttributeOption__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2882:1: ( rule__AttributeOption__Group_2__0__Impl rule__AttributeOption__Group_2__1 )
            // InternalDomainModel.g:2883:2: rule__AttributeOption__Group_2__0__Impl rule__AttributeOption__Group_2__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalDomainModel.g:2890:1: rule__AttributeOption__Group_2__0__Impl : ( () ) ;
    public final void rule__AttributeOption__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2894:1: ( ( () ) )
            // InternalDomainModel.g:2895:1: ( () )
            {
            // InternalDomainModel.g:2895:1: ( () )
            // InternalDomainModel.g:2896:2: ()
            {
             before(grammarAccess.getAttributeOptionAccess().getRelationshipOwnerAction_2_0()); 
            // InternalDomainModel.g:2897:2: ()
            // InternalDomainModel.g:2897:3: 
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
    // InternalDomainModel.g:2905:1: rule__AttributeOption__Group_2__1 : rule__AttributeOption__Group_2__1__Impl rule__AttributeOption__Group_2__2 ;
    public final void rule__AttributeOption__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2909:1: ( rule__AttributeOption__Group_2__1__Impl rule__AttributeOption__Group_2__2 )
            // InternalDomainModel.g:2910:2: rule__AttributeOption__Group_2__1__Impl rule__AttributeOption__Group_2__2
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
    // InternalDomainModel.g:2917:1: rule__AttributeOption__Group_2__1__Impl : ( 'relationshipOwner' ) ;
    public final void rule__AttributeOption__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2921:1: ( ( 'relationshipOwner' ) )
            // InternalDomainModel.g:2922:1: ( 'relationshipOwner' )
            {
            // InternalDomainModel.g:2922:1: ( 'relationshipOwner' )
            // InternalDomainModel.g:2923:2: 'relationshipOwner'
            {
             before(grammarAccess.getAttributeOptionAccess().getRelationshipOwnerKeyword_2_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalDomainModel.g:2932:1: rule__AttributeOption__Group_2__2 : rule__AttributeOption__Group_2__2__Impl rule__AttributeOption__Group_2__3 ;
    public final void rule__AttributeOption__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2936:1: ( rule__AttributeOption__Group_2__2__Impl rule__AttributeOption__Group_2__3 )
            // InternalDomainModel.g:2937:2: rule__AttributeOption__Group_2__2__Impl rule__AttributeOption__Group_2__3
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
    // InternalDomainModel.g:2944:1: rule__AttributeOption__Group_2__2__Impl : ( '=' ) ;
    public final void rule__AttributeOption__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2948:1: ( ( '=' ) )
            // InternalDomainModel.g:2949:1: ( '=' )
            {
            // InternalDomainModel.g:2949:1: ( '=' )
            // InternalDomainModel.g:2950:2: '='
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
    // InternalDomainModel.g:2959:1: rule__AttributeOption__Group_2__3 : rule__AttributeOption__Group_2__3__Impl ;
    public final void rule__AttributeOption__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2963:1: ( rule__AttributeOption__Group_2__3__Impl )
            // InternalDomainModel.g:2964:2: rule__AttributeOption__Group_2__3__Impl
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
    // InternalDomainModel.g:2970:1: rule__AttributeOption__Group_2__3__Impl : ( ( rule__AttributeOption__RelationshipOwnerAssignment_2_3 ) ) ;
    public final void rule__AttributeOption__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2974:1: ( ( ( rule__AttributeOption__RelationshipOwnerAssignment_2_3 ) ) )
            // InternalDomainModel.g:2975:1: ( ( rule__AttributeOption__RelationshipOwnerAssignment_2_3 ) )
            {
            // InternalDomainModel.g:2975:1: ( ( rule__AttributeOption__RelationshipOwnerAssignment_2_3 ) )
            // InternalDomainModel.g:2976:2: ( rule__AttributeOption__RelationshipOwnerAssignment_2_3 )
            {
             before(grammarAccess.getAttributeOptionAccess().getRelationshipOwnerAssignment_2_3()); 
            // InternalDomainModel.g:2977:2: ( rule__AttributeOption__RelationshipOwnerAssignment_2_3 )
            // InternalDomainModel.g:2977:3: rule__AttributeOption__RelationshipOwnerAssignment_2_3
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
    // InternalDomainModel.g:2986:1: rule__AttributeOption__Group_3__0 : rule__AttributeOption__Group_3__0__Impl rule__AttributeOption__Group_3__1 ;
    public final void rule__AttributeOption__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:2990:1: ( rule__AttributeOption__Group_3__0__Impl rule__AttributeOption__Group_3__1 )
            // InternalDomainModel.g:2991:2: rule__AttributeOption__Group_3__0__Impl rule__AttributeOption__Group_3__1
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
    // InternalDomainModel.g:2998:1: rule__AttributeOption__Group_3__0__Impl : ( () ) ;
    public final void rule__AttributeOption__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3002:1: ( ( () ) )
            // InternalDomainModel.g:3003:1: ( () )
            {
            // InternalDomainModel.g:3003:1: ( () )
            // InternalDomainModel.g:3004:2: ()
            {
             before(grammarAccess.getAttributeOptionAccess().getCardinalityAction_3_0()); 
            // InternalDomainModel.g:3005:2: ()
            // InternalDomainModel.g:3005:3: 
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
    // InternalDomainModel.g:3013:1: rule__AttributeOption__Group_3__1 : rule__AttributeOption__Group_3__1__Impl rule__AttributeOption__Group_3__2 ;
    public final void rule__AttributeOption__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3017:1: ( rule__AttributeOption__Group_3__1__Impl rule__AttributeOption__Group_3__2 )
            // InternalDomainModel.g:3018:2: rule__AttributeOption__Group_3__1__Impl rule__AttributeOption__Group_3__2
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
    // InternalDomainModel.g:3025:1: rule__AttributeOption__Group_3__1__Impl : ( 'reverse_cardinality' ) ;
    public final void rule__AttributeOption__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3029:1: ( ( 'reverse_cardinality' ) )
            // InternalDomainModel.g:3030:1: ( 'reverse_cardinality' )
            {
            // InternalDomainModel.g:3030:1: ( 'reverse_cardinality' )
            // InternalDomainModel.g:3031:2: 'reverse_cardinality'
            {
             before(grammarAccess.getAttributeOptionAccess().getReverse_cardinalityKeyword_3_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalDomainModel.g:3040:1: rule__AttributeOption__Group_3__2 : rule__AttributeOption__Group_3__2__Impl rule__AttributeOption__Group_3__3 ;
    public final void rule__AttributeOption__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3044:1: ( rule__AttributeOption__Group_3__2__Impl rule__AttributeOption__Group_3__3 )
            // InternalDomainModel.g:3045:2: rule__AttributeOption__Group_3__2__Impl rule__AttributeOption__Group_3__3
            {
            pushFollow(FOLLOW_38);
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
    // InternalDomainModel.g:3052:1: rule__AttributeOption__Group_3__2__Impl : ( '=' ) ;
    public final void rule__AttributeOption__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3056:1: ( ( '=' ) )
            // InternalDomainModel.g:3057:1: ( '=' )
            {
            // InternalDomainModel.g:3057:1: ( '=' )
            // InternalDomainModel.g:3058:2: '='
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
    // InternalDomainModel.g:3067:1: rule__AttributeOption__Group_3__3 : rule__AttributeOption__Group_3__3__Impl ;
    public final void rule__AttributeOption__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3071:1: ( rule__AttributeOption__Group_3__3__Impl )
            // InternalDomainModel.g:3072:2: rule__AttributeOption__Group_3__3__Impl
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
    // InternalDomainModel.g:3078:1: rule__AttributeOption__Group_3__3__Impl : ( ( rule__AttributeOption__CardAssignment_3_3 ) ) ;
    public final void rule__AttributeOption__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3082:1: ( ( ( rule__AttributeOption__CardAssignment_3_3 ) ) )
            // InternalDomainModel.g:3083:1: ( ( rule__AttributeOption__CardAssignment_3_3 ) )
            {
            // InternalDomainModel.g:3083:1: ( ( rule__AttributeOption__CardAssignment_3_3 ) )
            // InternalDomainModel.g:3084:2: ( rule__AttributeOption__CardAssignment_3_3 )
            {
             before(grammarAccess.getAttributeOptionAccess().getCardAssignment_3_3()); 
            // InternalDomainModel.g:3085:2: ( rule__AttributeOption__CardAssignment_3_3 )
            // InternalDomainModel.g:3085:3: rule__AttributeOption__CardAssignment_3_3
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
    // InternalDomainModel.g:3094:1: rule__StaticFieldSelection__Group__0 : rule__StaticFieldSelection__Group__0__Impl rule__StaticFieldSelection__Group__1 ;
    public final void rule__StaticFieldSelection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3098:1: ( rule__StaticFieldSelection__Group__0__Impl rule__StaticFieldSelection__Group__1 )
            // InternalDomainModel.g:3099:2: rule__StaticFieldSelection__Group__0__Impl rule__StaticFieldSelection__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalDomainModel.g:3106:1: rule__StaticFieldSelection__Group__0__Impl : ( ( rule__StaticFieldSelection__ReceiverAssignment_0 ) ) ;
    public final void rule__StaticFieldSelection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3110:1: ( ( ( rule__StaticFieldSelection__ReceiverAssignment_0 ) ) )
            // InternalDomainModel.g:3111:1: ( ( rule__StaticFieldSelection__ReceiverAssignment_0 ) )
            {
            // InternalDomainModel.g:3111:1: ( ( rule__StaticFieldSelection__ReceiverAssignment_0 ) )
            // InternalDomainModel.g:3112:2: ( rule__StaticFieldSelection__ReceiverAssignment_0 )
            {
             before(grammarAccess.getStaticFieldSelectionAccess().getReceiverAssignment_0()); 
            // InternalDomainModel.g:3113:2: ( rule__StaticFieldSelection__ReceiverAssignment_0 )
            // InternalDomainModel.g:3113:3: rule__StaticFieldSelection__ReceiverAssignment_0
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
    // InternalDomainModel.g:3121:1: rule__StaticFieldSelection__Group__1 : rule__StaticFieldSelection__Group__1__Impl rule__StaticFieldSelection__Group__2 ;
    public final void rule__StaticFieldSelection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3125:1: ( rule__StaticFieldSelection__Group__1__Impl rule__StaticFieldSelection__Group__2 )
            // InternalDomainModel.g:3126:2: rule__StaticFieldSelection__Group__1__Impl rule__StaticFieldSelection__Group__2
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
    // InternalDomainModel.g:3133:1: rule__StaticFieldSelection__Group__1__Impl : ( '.' ) ;
    public final void rule__StaticFieldSelection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3137:1: ( ( '.' ) )
            // InternalDomainModel.g:3138:1: ( '.' )
            {
            // InternalDomainModel.g:3138:1: ( '.' )
            // InternalDomainModel.g:3139:2: '.'
            {
             before(grammarAccess.getStaticFieldSelectionAccess().getFullStopKeyword_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalDomainModel.g:3148:1: rule__StaticFieldSelection__Group__2 : rule__StaticFieldSelection__Group__2__Impl ;
    public final void rule__StaticFieldSelection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3152:1: ( rule__StaticFieldSelection__Group__2__Impl )
            // InternalDomainModel.g:3153:2: rule__StaticFieldSelection__Group__2__Impl
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
    // InternalDomainModel.g:3159:1: rule__StaticFieldSelection__Group__2__Impl : ( ( rule__StaticFieldSelection__MemberAssignment_2 ) ) ;
    public final void rule__StaticFieldSelection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3163:1: ( ( ( rule__StaticFieldSelection__MemberAssignment_2 ) ) )
            // InternalDomainModel.g:3164:1: ( ( rule__StaticFieldSelection__MemberAssignment_2 ) )
            {
            // InternalDomainModel.g:3164:1: ( ( rule__StaticFieldSelection__MemberAssignment_2 ) )
            // InternalDomainModel.g:3165:2: ( rule__StaticFieldSelection__MemberAssignment_2 )
            {
             before(grammarAccess.getStaticFieldSelectionAccess().getMemberAssignment_2()); 
            // InternalDomainModel.g:3166:2: ( rule__StaticFieldSelection__MemberAssignment_2 )
            // InternalDomainModel.g:3166:3: rule__StaticFieldSelection__MemberAssignment_2
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


    // $ANTLR start "rule__Model__ConceptsAssignment"
    // InternalDomainModel.g:3175:1: rule__Model__ConceptsAssignment : ( ruleConcept ) ;
    public final void rule__Model__ConceptsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3179:1: ( ( ruleConcept ) )
            // InternalDomainModel.g:3180:2: ( ruleConcept )
            {
            // InternalDomainModel.g:3180:2: ( ruleConcept )
            // InternalDomainModel.g:3181:3: ruleConcept
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
    // InternalDomainModel.g:3190:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3194:1: ( ( RULE_ID ) )
            // InternalDomainModel.g:3195:2: ( RULE_ID )
            {
            // InternalDomainModel.g:3195:2: ( RULE_ID )
            // InternalDomainModel.g:3196:3: RULE_ID
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
    // InternalDomainModel.g:3205:1: rule__Entity__SuperTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3209:1: ( ( ( RULE_ID ) ) )
            // InternalDomainModel.g:3210:2: ( ( RULE_ID ) )
            {
            // InternalDomainModel.g:3210:2: ( ( RULE_ID ) )
            // InternalDomainModel.g:3211:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 
            // InternalDomainModel.g:3212:3: ( RULE_ID )
            // InternalDomainModel.g:3213:4: RULE_ID
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
    // InternalDomainModel.g:3224:1: rule__Entity__OptionsAssignment_3_2 : ( ruleEntityOption ) ;
    public final void rule__Entity__OptionsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3228:1: ( ( ruleEntityOption ) )
            // InternalDomainModel.g:3229:2: ( ruleEntityOption )
            {
            // InternalDomainModel.g:3229:2: ( ruleEntityOption )
            // InternalDomainModel.g:3230:3: ruleEntityOption
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
    // InternalDomainModel.g:3239:1: rule__Entity__OptionsAssignment_3_3_1 : ( ruleEntityOption ) ;
    public final void rule__Entity__OptionsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3243:1: ( ( ruleEntityOption ) )
            // InternalDomainModel.g:3244:2: ( ruleEntityOption )
            {
            // InternalDomainModel.g:3244:2: ( ruleEntityOption )
            // InternalDomainModel.g:3245:3: ruleEntityOption
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
    // InternalDomainModel.g:3254:1: rule__Entity__AttributesAssignment_5 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3258:1: ( ( ruleAttribute ) )
            // InternalDomainModel.g:3259:2: ( ruleAttribute )
            {
            // InternalDomainModel.g:3259:2: ( ruleAttribute )
            // InternalDomainModel.g:3260:3: ruleAttribute
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
    // InternalDomainModel.g:3269:1: rule__Enum__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Enum__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3273:1: ( ( RULE_ID ) )
            // InternalDomainModel.g:3274:2: ( RULE_ID )
            {
            // InternalDomainModel.g:3274:2: ( RULE_ID )
            // InternalDomainModel.g:3275:3: RULE_ID
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
    // InternalDomainModel.g:3284:1: rule__Enum__AttributesAssignment_3 : ( ruleAttribute ) ;
    public final void rule__Enum__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3288:1: ( ( ruleAttribute ) )
            // InternalDomainModel.g:3289:2: ( ruleAttribute )
            {
            // InternalDomainModel.g:3289:2: ( ruleAttribute )
            // InternalDomainModel.g:3290:3: ruleAttribute
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
    // InternalDomainModel.g:3299:1: rule__Enum__LiteralsAssignment_4 : ( ruleEnumLiteral ) ;
    public final void rule__Enum__LiteralsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3303:1: ( ( ruleEnumLiteral ) )
            // InternalDomainModel.g:3304:2: ( ruleEnumLiteral )
            {
            // InternalDomainModel.g:3304:2: ( ruleEnumLiteral )
            // InternalDomainModel.g:3305:3: ruleEnumLiteral
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
    // InternalDomainModel.g:3314:1: rule__EnumLiteral__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumLiteral__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3318:1: ( ( RULE_ID ) )
            // InternalDomainModel.g:3319:2: ( RULE_ID )
            {
            // InternalDomainModel.g:3319:2: ( RULE_ID )
            // InternalDomainModel.g:3320:3: RULE_ID
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
    // InternalDomainModel.g:3329:1: rule__EnumLiteral__ParamsAssignment_1_1 : ( ruleConstant ) ;
    public final void rule__EnumLiteral__ParamsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3333:1: ( ( ruleConstant ) )
            // InternalDomainModel.g:3334:2: ( ruleConstant )
            {
            // InternalDomainModel.g:3334:2: ( ruleConstant )
            // InternalDomainModel.g:3335:3: ruleConstant
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
    // InternalDomainModel.g:3344:1: rule__EnumLiteral__ParamsAssignment_1_2_1 : ( ruleConstant ) ;
    public final void rule__EnumLiteral__ParamsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3348:1: ( ( ruleConstant ) )
            // InternalDomainModel.g:3349:2: ( ruleConstant )
            {
            // InternalDomainModel.g:3349:2: ( ruleConstant )
            // InternalDomainModel.g:3350:3: ruleConstant
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
    // InternalDomainModel.g:3359:1: rule__Constant__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Constant__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3363:1: ( ( RULE_INT ) )
            // InternalDomainModel.g:3364:2: ( RULE_INT )
            {
            // InternalDomainModel.g:3364:2: ( RULE_INT )
            // InternalDomainModel.g:3365:3: RULE_INT
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
    // InternalDomainModel.g:3374:1: rule__Constant__ValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Constant__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3378:1: ( ( RULE_INT ) )
            // InternalDomainModel.g:3379:2: ( RULE_INT )
            {
            // InternalDomainModel.g:3379:2: ( RULE_INT )
            // InternalDomainModel.g:3380:3: RULE_INT
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
    // InternalDomainModel.g:3389:1: rule__Constant__ValueAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Constant__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3393:1: ( ( RULE_STRING ) )
            // InternalDomainModel.g:3394:2: ( RULE_STRING )
            {
            // InternalDomainModel.g:3394:2: ( RULE_STRING )
            // InternalDomainModel.g:3395:3: RULE_STRING
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
    // InternalDomainModel.g:3404:1: rule__Constant__ValueAssignment_3_1 : ( ( rule__Constant__ValueAlternatives_3_1_0 ) ) ;
    public final void rule__Constant__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3408:1: ( ( ( rule__Constant__ValueAlternatives_3_1_0 ) ) )
            // InternalDomainModel.g:3409:2: ( ( rule__Constant__ValueAlternatives_3_1_0 ) )
            {
            // InternalDomainModel.g:3409:2: ( ( rule__Constant__ValueAlternatives_3_1_0 ) )
            // InternalDomainModel.g:3410:3: ( rule__Constant__ValueAlternatives_3_1_0 )
            {
             before(grammarAccess.getConstantAccess().getValueAlternatives_3_1_0()); 
            // InternalDomainModel.g:3411:3: ( rule__Constant__ValueAlternatives_3_1_0 )
            // InternalDomainModel.g:3411:4: rule__Constant__ValueAlternatives_3_1_0
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
    // InternalDomainModel.g:3419:1: rule__Constant__DayAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__Constant__DayAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3423:1: ( ( RULE_INT ) )
            // InternalDomainModel.g:3424:2: ( RULE_INT )
            {
            // InternalDomainModel.g:3424:2: ( RULE_INT )
            // InternalDomainModel.g:3425:3: RULE_INT
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
    // InternalDomainModel.g:3434:1: rule__Constant__MonthAssignment_4_3 : ( RULE_INT ) ;
    public final void rule__Constant__MonthAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3438:1: ( ( RULE_INT ) )
            // InternalDomainModel.g:3439:2: ( RULE_INT )
            {
            // InternalDomainModel.g:3439:2: ( RULE_INT )
            // InternalDomainModel.g:3440:3: RULE_INT
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
    // InternalDomainModel.g:3449:1: rule__Constant__YearAssignment_4_5 : ( RULE_INT ) ;
    public final void rule__Constant__YearAssignment_4_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3453:1: ( ( RULE_INT ) )
            // InternalDomainModel.g:3454:2: ( RULE_INT )
            {
            // InternalDomainModel.g:3454:2: ( RULE_INT )
            // InternalDomainModel.g:3455:3: RULE_INT
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
    // InternalDomainModel.g:3464:1: rule__EntityOption__DeleteByFlagAssignment_0_1 : ( ( 'deleteByFlag' ) ) ;
    public final void rule__EntityOption__DeleteByFlagAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3468:1: ( ( ( 'deleteByFlag' ) ) )
            // InternalDomainModel.g:3469:2: ( ( 'deleteByFlag' ) )
            {
            // InternalDomainModel.g:3469:2: ( ( 'deleteByFlag' ) )
            // InternalDomainModel.g:3470:3: ( 'deleteByFlag' )
            {
             before(grammarAccess.getEntityOptionAccess().getDeleteByFlagDeleteByFlagKeyword_0_1_0()); 
            // InternalDomainModel.g:3471:3: ( 'deleteByFlag' )
            // InternalDomainModel.g:3472:4: 'deleteByFlag'
            {
             before(grammarAccess.getEntityOptionAccess().getDeleteByFlagDeleteByFlagKeyword_0_1_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalDomainModel.g:3483:1: rule__EntityOption__InheritanceMappingAssignment_1_3 : ( ruleInheritanceMappingType ) ;
    public final void rule__EntityOption__InheritanceMappingAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3487:1: ( ( ruleInheritanceMappingType ) )
            // InternalDomainModel.g:3488:2: ( ruleInheritanceMappingType )
            {
            // InternalDomainModel.g:3488:2: ( ruleInheritanceMappingType )
            // InternalDomainModel.g:3489:3: ruleInheritanceMappingType
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
    // InternalDomainModel.g:3498:1: rule__InheritanceMappingType__TypeAssignment : ( ( rule__InheritanceMappingType__TypeAlternatives_0 ) ) ;
    public final void rule__InheritanceMappingType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3502:1: ( ( ( rule__InheritanceMappingType__TypeAlternatives_0 ) ) )
            // InternalDomainModel.g:3503:2: ( ( rule__InheritanceMappingType__TypeAlternatives_0 ) )
            {
            // InternalDomainModel.g:3503:2: ( ( rule__InheritanceMappingType__TypeAlternatives_0 ) )
            // InternalDomainModel.g:3504:3: ( rule__InheritanceMappingType__TypeAlternatives_0 )
            {
             before(grammarAccess.getInheritanceMappingTypeAccess().getTypeAlternatives_0()); 
            // InternalDomainModel.g:3505:3: ( rule__InheritanceMappingType__TypeAlternatives_0 )
            // InternalDomainModel.g:3505:4: rule__InheritanceMappingType__TypeAlternatives_0
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
    // InternalDomainModel.g:3513:1: rule__Attribute__TypeAssignment_0 : ( ruleAttributeType ) ;
    public final void rule__Attribute__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3517:1: ( ( ruleAttributeType ) )
            // InternalDomainModel.g:3518:2: ( ruleAttributeType )
            {
            // InternalDomainModel.g:3518:2: ( ruleAttributeType )
            // InternalDomainModel.g:3519:3: ruleAttributeType
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
    // InternalDomainModel.g:3528:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3532:1: ( ( RULE_ID ) )
            // InternalDomainModel.g:3533:2: ( RULE_ID )
            {
            // InternalDomainModel.g:3533:2: ( RULE_ID )
            // InternalDomainModel.g:3534:3: RULE_ID
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
    // InternalDomainModel.g:3543:1: rule__Attribute__OptionsAssignment_2_0 : ( ruleAttributeOption ) ;
    public final void rule__Attribute__OptionsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3547:1: ( ( ruleAttributeOption ) )
            // InternalDomainModel.g:3548:2: ( ruleAttributeOption )
            {
            // InternalDomainModel.g:3548:2: ( ruleAttributeOption )
            // InternalDomainModel.g:3549:3: ruleAttributeOption
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
    // InternalDomainModel.g:3558:1: rule__Attribute__OptionsAssignment_2_1_1 : ( ruleAttributeOption ) ;
    public final void rule__Attribute__OptionsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3562:1: ( ( ruleAttributeOption ) )
            // InternalDomainModel.g:3563:2: ( ruleAttributeOption )
            {
            // InternalDomainModel.g:3563:2: ( ruleAttributeOption )
            // InternalDomainModel.g:3564:3: ruleAttributeOption
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
    // InternalDomainModel.g:3573:1: rule__RefType__ReferenceAssignment : ( ( RULE_ID ) ) ;
    public final void rule__RefType__ReferenceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3577:1: ( ( ( RULE_ID ) ) )
            // InternalDomainModel.g:3578:2: ( ( RULE_ID ) )
            {
            // InternalDomainModel.g:3578:2: ( ( RULE_ID ) )
            // InternalDomainModel.g:3579:3: ( RULE_ID )
            {
             before(grammarAccess.getRefTypeAccess().getReferenceConceptCrossReference_0()); 
            // InternalDomainModel.g:3580:3: ( RULE_ID )
            // InternalDomainModel.g:3581:4: RULE_ID
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
    // InternalDomainModel.g:3592:1: rule__CollectionType__OfTypeAssignment_2 : ( ruleSingleType ) ;
    public final void rule__CollectionType__OfTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3596:1: ( ( ruleSingleType ) )
            // InternalDomainModel.g:3597:2: ( ruleSingleType )
            {
            // InternalDomainModel.g:3597:2: ( ruleSingleType )
            // InternalDomainModel.g:3598:3: ruleSingleType
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
    // InternalDomainModel.g:3607:1: rule__AttributeOption__RequiredAssignment_0_1 : ( ( 'required' ) ) ;
    public final void rule__AttributeOption__RequiredAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3611:1: ( ( ( 'required' ) ) )
            // InternalDomainModel.g:3612:2: ( ( 'required' ) )
            {
            // InternalDomainModel.g:3612:2: ( ( 'required' ) )
            // InternalDomainModel.g:3613:3: ( 'required' )
            {
             before(grammarAccess.getAttributeOptionAccess().getRequiredRequiredKeyword_0_1_0()); 
            // InternalDomainModel.g:3614:3: ( 'required' )
            // InternalDomainModel.g:3615:4: 'required'
            {
             before(grammarAccess.getAttributeOptionAccess().getRequiredRequiredKeyword_0_1_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalDomainModel.g:3626:1: rule__AttributeOption__PartOfAssignment_1_1 : ( ( 'partOf' ) ) ;
    public final void rule__AttributeOption__PartOfAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3630:1: ( ( ( 'partOf' ) ) )
            // InternalDomainModel.g:3631:2: ( ( 'partOf' ) )
            {
            // InternalDomainModel.g:3631:2: ( ( 'partOf' ) )
            // InternalDomainModel.g:3632:3: ( 'partOf' )
            {
             before(grammarAccess.getAttributeOptionAccess().getPartOfPartOfKeyword_1_1_0()); 
            // InternalDomainModel.g:3633:3: ( 'partOf' )
            // InternalDomainModel.g:3634:4: 'partOf'
            {
             before(grammarAccess.getAttributeOptionAccess().getPartOfPartOfKeyword_1_1_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalDomainModel.g:3645:1: rule__AttributeOption__RelationshipOwnerAssignment_2_3 : ( ruleStaticFieldSelection ) ;
    public final void rule__AttributeOption__RelationshipOwnerAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3649:1: ( ( ruleStaticFieldSelection ) )
            // InternalDomainModel.g:3650:2: ( ruleStaticFieldSelection )
            {
            // InternalDomainModel.g:3650:2: ( ruleStaticFieldSelection )
            // InternalDomainModel.g:3651:3: ruleStaticFieldSelection
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
    // InternalDomainModel.g:3660:1: rule__AttributeOption__CardAssignment_3_3 : ( ruleCardinalityType ) ;
    public final void rule__AttributeOption__CardAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3664:1: ( ( ruleCardinalityType ) )
            // InternalDomainModel.g:3665:2: ( ruleCardinalityType )
            {
            // InternalDomainModel.g:3665:2: ( ruleCardinalityType )
            // InternalDomainModel.g:3666:3: ruleCardinalityType
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
    // InternalDomainModel.g:3675:1: rule__StaticFieldSelection__ReceiverAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__StaticFieldSelection__ReceiverAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3679:1: ( ( ( RULE_ID ) ) )
            // InternalDomainModel.g:3680:2: ( ( RULE_ID ) )
            {
            // InternalDomainModel.g:3680:2: ( ( RULE_ID ) )
            // InternalDomainModel.g:3681:3: ( RULE_ID )
            {
             before(grammarAccess.getStaticFieldSelectionAccess().getReceiverEntityCrossReference_0_0()); 
            // InternalDomainModel.g:3682:3: ( RULE_ID )
            // InternalDomainModel.g:3683:4: RULE_ID
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
    // InternalDomainModel.g:3694:1: rule__StaticFieldSelection__MemberAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__StaticFieldSelection__MemberAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainModel.g:3698:1: ( ( ( RULE_ID ) ) )
            // InternalDomainModel.g:3699:2: ( ( RULE_ID ) )
            {
            // InternalDomainModel.g:3699:2: ( ( RULE_ID ) )
            // InternalDomainModel.g:3700:3: ( RULE_ID )
            {
             before(grammarAccess.getStaticFieldSelectionAccess().getMemberAttributeCrossReference_2_0()); 
            // InternalDomainModel.g:3701:3: ( RULE_ID )
            // InternalDomainModel.g:3702:4: RULE_ID
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000680000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000007E00100010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000007E00000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000100040000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000007E00000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020001860L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000660100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000660000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000003E00000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000003E00000010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000080000000000L});

}
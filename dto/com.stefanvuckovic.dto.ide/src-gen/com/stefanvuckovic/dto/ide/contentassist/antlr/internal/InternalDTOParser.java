package com.stefanvuckovic.dto.ide.contentassist.antlr.internal;

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
import com.stefanvuckovic.dto.services.DTOGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDTOParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'SINGLE_TABLE'", "'TABLE_PER_CONCRETE_CLASS'", "'TABLE_PER_CLASS'", "'class'", "'{'", "'}'", "'extends'", "'representation'", "'text'", "'email'", "'password'", "'file'", "'image'", "'enum'", "'('", "')'", "','", "'L'", "'/'", "'null'", "'inheritance'", "'='", "';'", "'string'", "'int'", "'long'", "'boolean'", "'date'", "'List'", "'<'", "'>'", "'deleteByFlag'"
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

    	public void setGrammarAccess(DTOGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleDTOModel"
    // InternalDTO.g:53:1: entryRuleDTOModel : ruleDTOModel EOF ;
    public final void entryRuleDTOModel() throws RecognitionException {
        try {
            // InternalDTO.g:54:1: ( ruleDTOModel EOF )
            // InternalDTO.g:55:1: ruleDTOModel EOF
            {
             before(grammarAccess.getDTOModelRule()); 
            pushFollow(FOLLOW_1);
            ruleDTOModel();

            state._fsp--;

             after(grammarAccess.getDTOModelRule()); 
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
    // $ANTLR end "entryRuleDTOModel"


    // $ANTLR start "ruleDTOModel"
    // InternalDTO.g:62:1: ruleDTOModel : ( ( rule__DTOModel__ConceptsAssignment )* ) ;
    public final void ruleDTOModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:66:2: ( ( ( rule__DTOModel__ConceptsAssignment )* ) )
            // InternalDTO.g:67:2: ( ( rule__DTOModel__ConceptsAssignment )* )
            {
            // InternalDTO.g:67:2: ( ( rule__DTOModel__ConceptsAssignment )* )
            // InternalDTO.g:68:3: ( rule__DTOModel__ConceptsAssignment )*
            {
             before(grammarAccess.getDTOModelAccess().getConceptsAssignment()); 
            // InternalDTO.g:69:3: ( rule__DTOModel__ConceptsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16||LA1_0==26) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDTO.g:69:4: rule__DTOModel__ConceptsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__DTOModel__ConceptsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDTOModelAccess().getConceptsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDTOModel"


    // $ANTLR start "entryRuleConcept"
    // InternalDTO.g:78:1: entryRuleConcept : ruleConcept EOF ;
    public final void entryRuleConcept() throws RecognitionException {
        try {
            // InternalDTO.g:79:1: ( ruleConcept EOF )
            // InternalDTO.g:80:1: ruleConcept EOF
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
    // InternalDTO.g:87:1: ruleConcept : ( ( rule__Concept__Alternatives ) ) ;
    public final void ruleConcept() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:91:2: ( ( ( rule__Concept__Alternatives ) ) )
            // InternalDTO.g:92:2: ( ( rule__Concept__Alternatives ) )
            {
            // InternalDTO.g:92:2: ( ( rule__Concept__Alternatives ) )
            // InternalDTO.g:93:3: ( rule__Concept__Alternatives )
            {
             before(grammarAccess.getConceptAccess().getAlternatives()); 
            // InternalDTO.g:94:3: ( rule__Concept__Alternatives )
            // InternalDTO.g:94:4: rule__Concept__Alternatives
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


    // $ANTLR start "entryRuleDTOClass"
    // InternalDTO.g:103:1: entryRuleDTOClass : ruleDTOClass EOF ;
    public final void entryRuleDTOClass() throws RecognitionException {
        try {
            // InternalDTO.g:104:1: ( ruleDTOClass EOF )
            // InternalDTO.g:105:1: ruleDTOClass EOF
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
    // InternalDTO.g:112:1: ruleDTOClass : ( ( rule__DTOClass__Group__0 ) ) ;
    public final void ruleDTOClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:116:2: ( ( ( rule__DTOClass__Group__0 ) ) )
            // InternalDTO.g:117:2: ( ( rule__DTOClass__Group__0 ) )
            {
            // InternalDTO.g:117:2: ( ( rule__DTOClass__Group__0 ) )
            // InternalDTO.g:118:3: ( rule__DTOClass__Group__0 )
            {
             before(grammarAccess.getDTOClassAccess().getGroup()); 
            // InternalDTO.g:119:3: ( rule__DTOClass__Group__0 )
            // InternalDTO.g:119:4: rule__DTOClass__Group__0
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


    // $ANTLR start "entryRuleAttributeOption"
    // InternalDTO.g:128:1: entryRuleAttributeOption : ruleAttributeOption EOF ;
    public final void entryRuleAttributeOption() throws RecognitionException {
        try {
            // InternalDTO.g:129:1: ( ruleAttributeOption EOF )
            // InternalDTO.g:130:1: ruleAttributeOption EOF
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
    // InternalDTO.g:137:1: ruleAttributeOption : ( ( rule__AttributeOption__Group__0 ) ) ;
    public final void ruleAttributeOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:141:2: ( ( ( rule__AttributeOption__Group__0 ) ) )
            // InternalDTO.g:142:2: ( ( rule__AttributeOption__Group__0 ) )
            {
            // InternalDTO.g:142:2: ( ( rule__AttributeOption__Group__0 ) )
            // InternalDTO.g:143:3: ( rule__AttributeOption__Group__0 )
            {
             before(grammarAccess.getAttributeOptionAccess().getGroup()); 
            // InternalDTO.g:144:3: ( rule__AttributeOption__Group__0 )
            // InternalDTO.g:144:4: rule__AttributeOption__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeOption__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeOptionAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleBasicType"
    // InternalDTO.g:153:1: entryRuleBasicType : ruleBasicType EOF ;
    public final void entryRuleBasicType() throws RecognitionException {
        try {
            // InternalDTO.g:154:1: ( ruleBasicType EOF )
            // InternalDTO.g:155:1: ruleBasicType EOF
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
    // InternalDTO.g:162:1: ruleBasicType : ( ( rule__BasicType__Alternatives ) ) ;
    public final void ruleBasicType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:166:2: ( ( ( rule__BasicType__Alternatives ) ) )
            // InternalDTO.g:167:2: ( ( rule__BasicType__Alternatives ) )
            {
            // InternalDTO.g:167:2: ( ( rule__BasicType__Alternatives ) )
            // InternalDTO.g:168:3: ( rule__BasicType__Alternatives )
            {
             before(grammarAccess.getBasicTypeAccess().getAlternatives()); 
            // InternalDTO.g:169:3: ( rule__BasicType__Alternatives )
            // InternalDTO.g:169:4: rule__BasicType__Alternatives
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
    // InternalDTO.g:178:1: entryRuleEnum : ruleEnum EOF ;
    public final void entryRuleEnum() throws RecognitionException {
        try {
            // InternalDTO.g:179:1: ( ruleEnum EOF )
            // InternalDTO.g:180:1: ruleEnum EOF
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
    // InternalDTO.g:187:1: ruleEnum : ( ( rule__Enum__Group__0 ) ) ;
    public final void ruleEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:191:2: ( ( ( rule__Enum__Group__0 ) ) )
            // InternalDTO.g:192:2: ( ( rule__Enum__Group__0 ) )
            {
            // InternalDTO.g:192:2: ( ( rule__Enum__Group__0 ) )
            // InternalDTO.g:193:3: ( rule__Enum__Group__0 )
            {
             before(grammarAccess.getEnumAccess().getGroup()); 
            // InternalDTO.g:194:3: ( rule__Enum__Group__0 )
            // InternalDTO.g:194:4: rule__Enum__Group__0
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
    // InternalDTO.g:203:1: entryRuleEnumLiteral : ruleEnumLiteral EOF ;
    public final void entryRuleEnumLiteral() throws RecognitionException {
        try {
            // InternalDTO.g:204:1: ( ruleEnumLiteral EOF )
            // InternalDTO.g:205:1: ruleEnumLiteral EOF
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
    // InternalDTO.g:212:1: ruleEnumLiteral : ( ( rule__EnumLiteral__Group__0 ) ) ;
    public final void ruleEnumLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:216:2: ( ( ( rule__EnumLiteral__Group__0 ) ) )
            // InternalDTO.g:217:2: ( ( rule__EnumLiteral__Group__0 ) )
            {
            // InternalDTO.g:217:2: ( ( rule__EnumLiteral__Group__0 ) )
            // InternalDTO.g:218:3: ( rule__EnumLiteral__Group__0 )
            {
             before(grammarAccess.getEnumLiteralAccess().getGroup()); 
            // InternalDTO.g:219:3: ( rule__EnumLiteral__Group__0 )
            // InternalDTO.g:219:4: rule__EnumLiteral__Group__0
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
    // InternalDTO.g:228:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // InternalDTO.g:229:1: ( ruleConstant EOF )
            // InternalDTO.g:230:1: ruleConstant EOF
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
    // InternalDTO.g:237:1: ruleConstant : ( ( rule__Constant__Alternatives ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:241:2: ( ( ( rule__Constant__Alternatives ) ) )
            // InternalDTO.g:242:2: ( ( rule__Constant__Alternatives ) )
            {
            // InternalDTO.g:242:2: ( ( rule__Constant__Alternatives ) )
            // InternalDTO.g:243:3: ( rule__Constant__Alternatives )
            {
             before(grammarAccess.getConstantAccess().getAlternatives()); 
            // InternalDTO.g:244:3: ( rule__Constant__Alternatives )
            // InternalDTO.g:244:4: rule__Constant__Alternatives
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
    // InternalDTO.g:253:1: entryRuleEntityOption : ruleEntityOption EOF ;
    public final void entryRuleEntityOption() throws RecognitionException {
        try {
            // InternalDTO.g:254:1: ( ruleEntityOption EOF )
            // InternalDTO.g:255:1: ruleEntityOption EOF
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
    // InternalDTO.g:262:1: ruleEntityOption : ( ( rule__EntityOption__Alternatives ) ) ;
    public final void ruleEntityOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:266:2: ( ( ( rule__EntityOption__Alternatives ) ) )
            // InternalDTO.g:267:2: ( ( rule__EntityOption__Alternatives ) )
            {
            // InternalDTO.g:267:2: ( ( rule__EntityOption__Alternatives ) )
            // InternalDTO.g:268:3: ( rule__EntityOption__Alternatives )
            {
             before(grammarAccess.getEntityOptionAccess().getAlternatives()); 
            // InternalDTO.g:269:3: ( rule__EntityOption__Alternatives )
            // InternalDTO.g:269:4: rule__EntityOption__Alternatives
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
    // InternalDTO.g:278:1: entryRuleInheritanceMappingType : ruleInheritanceMappingType EOF ;
    public final void entryRuleInheritanceMappingType() throws RecognitionException {
        try {
            // InternalDTO.g:279:1: ( ruleInheritanceMappingType EOF )
            // InternalDTO.g:280:1: ruleInheritanceMappingType EOF
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
    // InternalDTO.g:287:1: ruleInheritanceMappingType : ( ( rule__InheritanceMappingType__TypeAssignment ) ) ;
    public final void ruleInheritanceMappingType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:291:2: ( ( ( rule__InheritanceMappingType__TypeAssignment ) ) )
            // InternalDTO.g:292:2: ( ( rule__InheritanceMappingType__TypeAssignment ) )
            {
            // InternalDTO.g:292:2: ( ( rule__InheritanceMappingType__TypeAssignment ) )
            // InternalDTO.g:293:3: ( rule__InheritanceMappingType__TypeAssignment )
            {
             before(grammarAccess.getInheritanceMappingTypeAccess().getTypeAssignment()); 
            // InternalDTO.g:294:3: ( rule__InheritanceMappingType__TypeAssignment )
            // InternalDTO.g:294:4: rule__InheritanceMappingType__TypeAssignment
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
    // InternalDTO.g:303:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalDTO.g:304:1: ( ruleAttribute EOF )
            // InternalDTO.g:305:1: ruleAttribute EOF
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
    // InternalDTO.g:312:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:316:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalDTO.g:317:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalDTO.g:317:2: ( ( rule__Attribute__Group__0 ) )
            // InternalDTO.g:318:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalDTO.g:319:3: ( rule__Attribute__Group__0 )
            // InternalDTO.g:319:4: rule__Attribute__Group__0
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
    // InternalDTO.g:328:1: entryRuleAttributeType : ruleAttributeType EOF ;
    public final void entryRuleAttributeType() throws RecognitionException {
        try {
            // InternalDTO.g:329:1: ( ruleAttributeType EOF )
            // InternalDTO.g:330:1: ruleAttributeType EOF
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
    // InternalDTO.g:337:1: ruleAttributeType : ( ( rule__AttributeType__Alternatives ) ) ;
    public final void ruleAttributeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:341:2: ( ( ( rule__AttributeType__Alternatives ) ) )
            // InternalDTO.g:342:2: ( ( rule__AttributeType__Alternatives ) )
            {
            // InternalDTO.g:342:2: ( ( rule__AttributeType__Alternatives ) )
            // InternalDTO.g:343:3: ( rule__AttributeType__Alternatives )
            {
             before(grammarAccess.getAttributeTypeAccess().getAlternatives()); 
            // InternalDTO.g:344:3: ( rule__AttributeType__Alternatives )
            // InternalDTO.g:344:4: rule__AttributeType__Alternatives
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
    // InternalDTO.g:353:1: entryRuleSingleType : ruleSingleType EOF ;
    public final void entryRuleSingleType() throws RecognitionException {
        try {
            // InternalDTO.g:354:1: ( ruleSingleType EOF )
            // InternalDTO.g:355:1: ruleSingleType EOF
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
    // InternalDTO.g:362:1: ruleSingleType : ( ( rule__SingleType__Alternatives ) ) ;
    public final void ruleSingleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:366:2: ( ( ( rule__SingleType__Alternatives ) ) )
            // InternalDTO.g:367:2: ( ( rule__SingleType__Alternatives ) )
            {
            // InternalDTO.g:367:2: ( ( rule__SingleType__Alternatives ) )
            // InternalDTO.g:368:3: ( rule__SingleType__Alternatives )
            {
             before(grammarAccess.getSingleTypeAccess().getAlternatives()); 
            // InternalDTO.g:369:3: ( rule__SingleType__Alternatives )
            // InternalDTO.g:369:4: rule__SingleType__Alternatives
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
    // InternalDTO.g:378:1: entrySuperBasicType : superBasicType EOF ;
    public final void entrySuperBasicType() throws RecognitionException {
        try {
            // InternalDTO.g:379:1: ( superBasicType EOF )
            // InternalDTO.g:380:1: superBasicType EOF
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
    // InternalDTO.g:387:1: superBasicType : ( ( superBasicType__Alternatives ) ) ;
    public final void superBasicType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:391:2: ( ( ( superBasicType__Alternatives ) ) )
            // InternalDTO.g:392:2: ( ( superBasicType__Alternatives ) )
            {
            // InternalDTO.g:392:2: ( ( superBasicType__Alternatives ) )
            // InternalDTO.g:393:3: ( superBasicType__Alternatives )
            {
             before(grammarAccess.getDomainModelBasicTypeAccess().getAlternatives()); 
            // InternalDTO.g:394:3: ( superBasicType__Alternatives )
            // InternalDTO.g:394:4: superBasicType__Alternatives
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
    // InternalDTO.g:403:1: entryRuleRefType : ruleRefType EOF ;
    public final void entryRuleRefType() throws RecognitionException {
        try {
            // InternalDTO.g:404:1: ( ruleRefType EOF )
            // InternalDTO.g:405:1: ruleRefType EOF
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
    // InternalDTO.g:412:1: ruleRefType : ( ( rule__RefType__ReferenceAssignment ) ) ;
    public final void ruleRefType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:416:2: ( ( ( rule__RefType__ReferenceAssignment ) ) )
            // InternalDTO.g:417:2: ( ( rule__RefType__ReferenceAssignment ) )
            {
            // InternalDTO.g:417:2: ( ( rule__RefType__ReferenceAssignment ) )
            // InternalDTO.g:418:3: ( rule__RefType__ReferenceAssignment )
            {
             before(grammarAccess.getRefTypeAccess().getReferenceAssignment()); 
            // InternalDTO.g:419:3: ( rule__RefType__ReferenceAssignment )
            // InternalDTO.g:419:4: rule__RefType__ReferenceAssignment
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
    // InternalDTO.g:428:1: entryRuleCollectionType : ruleCollectionType EOF ;
    public final void entryRuleCollectionType() throws RecognitionException {
        try {
            // InternalDTO.g:429:1: ( ruleCollectionType EOF )
            // InternalDTO.g:430:1: ruleCollectionType EOF
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
    // InternalDTO.g:437:1: ruleCollectionType : ( ( rule__CollectionType__Group__0 ) ) ;
    public final void ruleCollectionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:441:2: ( ( ( rule__CollectionType__Group__0 ) ) )
            // InternalDTO.g:442:2: ( ( rule__CollectionType__Group__0 ) )
            {
            // InternalDTO.g:442:2: ( ( rule__CollectionType__Group__0 ) )
            // InternalDTO.g:443:3: ( rule__CollectionType__Group__0 )
            {
             before(grammarAccess.getCollectionTypeAccess().getGroup()); 
            // InternalDTO.g:444:3: ( rule__CollectionType__Group__0 )
            // InternalDTO.g:444:4: rule__CollectionType__Group__0
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


    // $ANTLR start "rule__Concept__Alternatives"
    // InternalDTO.g:452:1: rule__Concept__Alternatives : ( ( ruleDTOClass ) | ( ruleEnum ) );
    public final void rule__Concept__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:456:1: ( ( ruleDTOClass ) | ( ruleEnum ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
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
                    // InternalDTO.g:457:2: ( ruleDTOClass )
                    {
                    // InternalDTO.g:457:2: ( ruleDTOClass )
                    // InternalDTO.g:458:3: ruleDTOClass
                    {
                     before(grammarAccess.getConceptAccess().getDTOClassParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDTOClass();

                    state._fsp--;

                     after(grammarAccess.getConceptAccess().getDTOClassParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDTO.g:463:2: ( ruleEnum )
                    {
                    // InternalDTO.g:463:2: ( ruleEnum )
                    // InternalDTO.g:464:3: ruleEnum
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


    // $ANTLR start "rule__BasicType__Alternatives"
    // InternalDTO.g:473:1: rule__BasicType__Alternatives : ( ( superBasicType ) | ( ( rule__BasicType__Group_1__0 ) ) | ( ( rule__BasicType__Group_2__0 ) ) | ( ( rule__BasicType__Group_3__0 ) ) | ( ( rule__BasicType__Group_4__0 ) ) | ( ( rule__BasicType__Group_5__0 ) ) );
    public final void rule__BasicType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:477:1: ( ( superBasicType ) | ( ( rule__BasicType__Group_1__0 ) ) | ( ( rule__BasicType__Group_2__0 ) ) | ( ( rule__BasicType__Group_3__0 ) ) | ( ( rule__BasicType__Group_4__0 ) ) | ( ( rule__BasicType__Group_5__0 ) ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
                {
                alt3=1;
                }
                break;
            case 21:
                {
                alt3=2;
                }
                break;
            case 22:
                {
                alt3=3;
                }
                break;
            case 23:
                {
                alt3=4;
                }
                break;
            case 24:
                {
                alt3=5;
                }
                break;
            case 25:
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
                    // InternalDTO.g:478:2: ( superBasicType )
                    {
                    // InternalDTO.g:478:2: ( superBasicType )
                    // InternalDTO.g:479:3: superBasicType
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
                    // InternalDTO.g:484:2: ( ( rule__BasicType__Group_1__0 ) )
                    {
                    // InternalDTO.g:484:2: ( ( rule__BasicType__Group_1__0 ) )
                    // InternalDTO.g:485:3: ( rule__BasicType__Group_1__0 )
                    {
                     before(grammarAccess.getBasicTypeAccess().getGroup_1()); 
                    // InternalDTO.g:486:3: ( rule__BasicType__Group_1__0 )
                    // InternalDTO.g:486:4: rule__BasicType__Group_1__0
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
                    // InternalDTO.g:490:2: ( ( rule__BasicType__Group_2__0 ) )
                    {
                    // InternalDTO.g:490:2: ( ( rule__BasicType__Group_2__0 ) )
                    // InternalDTO.g:491:3: ( rule__BasicType__Group_2__0 )
                    {
                     before(grammarAccess.getBasicTypeAccess().getGroup_2()); 
                    // InternalDTO.g:492:3: ( rule__BasicType__Group_2__0 )
                    // InternalDTO.g:492:4: rule__BasicType__Group_2__0
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
                    // InternalDTO.g:496:2: ( ( rule__BasicType__Group_3__0 ) )
                    {
                    // InternalDTO.g:496:2: ( ( rule__BasicType__Group_3__0 ) )
                    // InternalDTO.g:497:3: ( rule__BasicType__Group_3__0 )
                    {
                     before(grammarAccess.getBasicTypeAccess().getGroup_3()); 
                    // InternalDTO.g:498:3: ( rule__BasicType__Group_3__0 )
                    // InternalDTO.g:498:4: rule__BasicType__Group_3__0
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
                    // InternalDTO.g:502:2: ( ( rule__BasicType__Group_4__0 ) )
                    {
                    // InternalDTO.g:502:2: ( ( rule__BasicType__Group_4__0 ) )
                    // InternalDTO.g:503:3: ( rule__BasicType__Group_4__0 )
                    {
                     before(grammarAccess.getBasicTypeAccess().getGroup_4()); 
                    // InternalDTO.g:504:3: ( rule__BasicType__Group_4__0 )
                    // InternalDTO.g:504:4: rule__BasicType__Group_4__0
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
                    // InternalDTO.g:508:2: ( ( rule__BasicType__Group_5__0 ) )
                    {
                    // InternalDTO.g:508:2: ( ( rule__BasicType__Group_5__0 ) )
                    // InternalDTO.g:509:3: ( rule__BasicType__Group_5__0 )
                    {
                     before(grammarAccess.getBasicTypeAccess().getGroup_5()); 
                    // InternalDTO.g:510:3: ( rule__BasicType__Group_5__0 )
                    // InternalDTO.g:510:4: rule__BasicType__Group_5__0
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
    // InternalDTO.g:518:1: rule__Constant__Alternatives : ( ( ( rule__Constant__Group_0__0 ) ) | ( ( rule__Constant__Group_1__0 ) ) | ( ( rule__Constant__Group_2__0 ) ) | ( ( rule__Constant__Group_3__0 ) ) | ( ( rule__Constant__Group_4__0 ) ) | ( ( rule__Constant__Group_5__0 ) ) );
    public final void rule__Constant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:522:1: ( ( ( rule__Constant__Group_0__0 ) ) | ( ( rule__Constant__Group_1__0 ) ) | ( ( rule__Constant__Group_2__0 ) ) | ( ( rule__Constant__Group_3__0 ) ) | ( ( rule__Constant__Group_4__0 ) ) | ( ( rule__Constant__Group_5__0 ) ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                switch ( input.LA(2) ) {
                case 31:
                    {
                    alt4=5;
                    }
                    break;
                case EOF:
                case 28:
                case 29:
                    {
                    alt4=1;
                    }
                    break;
                case 30:
                    {
                    alt4=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }

                }
                break;
            case RULE_STRING:
                {
                alt4=3;
                }
                break;
            case 11:
            case 12:
                {
                alt4=4;
                }
                break;
            case 32:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalDTO.g:523:2: ( ( rule__Constant__Group_0__0 ) )
                    {
                    // InternalDTO.g:523:2: ( ( rule__Constant__Group_0__0 ) )
                    // InternalDTO.g:524:3: ( rule__Constant__Group_0__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_0()); 
                    // InternalDTO.g:525:3: ( rule__Constant__Group_0__0 )
                    // InternalDTO.g:525:4: rule__Constant__Group_0__0
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
                    // InternalDTO.g:529:2: ( ( rule__Constant__Group_1__0 ) )
                    {
                    // InternalDTO.g:529:2: ( ( rule__Constant__Group_1__0 ) )
                    // InternalDTO.g:530:3: ( rule__Constant__Group_1__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_1()); 
                    // InternalDTO.g:531:3: ( rule__Constant__Group_1__0 )
                    // InternalDTO.g:531:4: rule__Constant__Group_1__0
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
                    // InternalDTO.g:535:2: ( ( rule__Constant__Group_2__0 ) )
                    {
                    // InternalDTO.g:535:2: ( ( rule__Constant__Group_2__0 ) )
                    // InternalDTO.g:536:3: ( rule__Constant__Group_2__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_2()); 
                    // InternalDTO.g:537:3: ( rule__Constant__Group_2__0 )
                    // InternalDTO.g:537:4: rule__Constant__Group_2__0
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
                    // InternalDTO.g:541:2: ( ( rule__Constant__Group_3__0 ) )
                    {
                    // InternalDTO.g:541:2: ( ( rule__Constant__Group_3__0 ) )
                    // InternalDTO.g:542:3: ( rule__Constant__Group_3__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_3()); 
                    // InternalDTO.g:543:3: ( rule__Constant__Group_3__0 )
                    // InternalDTO.g:543:4: rule__Constant__Group_3__0
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
                    // InternalDTO.g:547:2: ( ( rule__Constant__Group_4__0 ) )
                    {
                    // InternalDTO.g:547:2: ( ( rule__Constant__Group_4__0 ) )
                    // InternalDTO.g:548:3: ( rule__Constant__Group_4__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_4()); 
                    // InternalDTO.g:549:3: ( rule__Constant__Group_4__0 )
                    // InternalDTO.g:549:4: rule__Constant__Group_4__0
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
                    // InternalDTO.g:553:2: ( ( rule__Constant__Group_5__0 ) )
                    {
                    // InternalDTO.g:553:2: ( ( rule__Constant__Group_5__0 ) )
                    // InternalDTO.g:554:3: ( rule__Constant__Group_5__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_5()); 
                    // InternalDTO.g:555:3: ( rule__Constant__Group_5__0 )
                    // InternalDTO.g:555:4: rule__Constant__Group_5__0
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
    // InternalDTO.g:563:1: rule__Constant__ValueAlternatives_3_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Constant__ValueAlternatives_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:567:1: ( ( 'true' ) | ( 'false' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDTO.g:568:2: ( 'true' )
                    {
                    // InternalDTO.g:568:2: ( 'true' )
                    // InternalDTO.g:569:3: 'true'
                    {
                     before(grammarAccess.getConstantAccess().getValueTrueKeyword_3_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getConstantAccess().getValueTrueKeyword_3_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDTO.g:574:2: ( 'false' )
                    {
                    // InternalDTO.g:574:2: ( 'false' )
                    // InternalDTO.g:575:3: 'false'
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
    // InternalDTO.g:584:1: rule__EntityOption__Alternatives : ( ( ( rule__EntityOption__Group_0__0 ) ) | ( ( rule__EntityOption__Group_1__0 ) ) );
    public final void rule__EntityOption__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:588:1: ( ( ( rule__EntityOption__Group_0__0 ) ) | ( ( rule__EntityOption__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==44) ) {
                alt6=1;
            }
            else if ( (LA6_0==33) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDTO.g:589:2: ( ( rule__EntityOption__Group_0__0 ) )
                    {
                    // InternalDTO.g:589:2: ( ( rule__EntityOption__Group_0__0 ) )
                    // InternalDTO.g:590:3: ( rule__EntityOption__Group_0__0 )
                    {
                     before(grammarAccess.getEntityOptionAccess().getGroup_0()); 
                    // InternalDTO.g:591:3: ( rule__EntityOption__Group_0__0 )
                    // InternalDTO.g:591:4: rule__EntityOption__Group_0__0
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
                    // InternalDTO.g:595:2: ( ( rule__EntityOption__Group_1__0 ) )
                    {
                    // InternalDTO.g:595:2: ( ( rule__EntityOption__Group_1__0 ) )
                    // InternalDTO.g:596:3: ( rule__EntityOption__Group_1__0 )
                    {
                     before(grammarAccess.getEntityOptionAccess().getGroup_1()); 
                    // InternalDTO.g:597:3: ( rule__EntityOption__Group_1__0 )
                    // InternalDTO.g:597:4: rule__EntityOption__Group_1__0
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
    // InternalDTO.g:605:1: rule__InheritanceMappingType__TypeAlternatives_0 : ( ( 'SINGLE_TABLE' ) | ( 'TABLE_PER_CONCRETE_CLASS' ) | ( 'TABLE_PER_CLASS' ) );
    public final void rule__InheritanceMappingType__TypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:609:1: ( ( 'SINGLE_TABLE' ) | ( 'TABLE_PER_CONCRETE_CLASS' ) | ( 'TABLE_PER_CLASS' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt7=1;
                }
                break;
            case 14:
                {
                alt7=2;
                }
                break;
            case 15:
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
                    // InternalDTO.g:610:2: ( 'SINGLE_TABLE' )
                    {
                    // InternalDTO.g:610:2: ( 'SINGLE_TABLE' )
                    // InternalDTO.g:611:3: 'SINGLE_TABLE'
                    {
                     before(grammarAccess.getInheritanceMappingTypeAccess().getTypeSINGLE_TABLEKeyword_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getInheritanceMappingTypeAccess().getTypeSINGLE_TABLEKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDTO.g:616:2: ( 'TABLE_PER_CONCRETE_CLASS' )
                    {
                    // InternalDTO.g:616:2: ( 'TABLE_PER_CONCRETE_CLASS' )
                    // InternalDTO.g:617:3: 'TABLE_PER_CONCRETE_CLASS'
                    {
                     before(grammarAccess.getInheritanceMappingTypeAccess().getTypeTABLE_PER_CONCRETE_CLASSKeyword_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getInheritanceMappingTypeAccess().getTypeTABLE_PER_CONCRETE_CLASSKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDTO.g:622:2: ( 'TABLE_PER_CLASS' )
                    {
                    // InternalDTO.g:622:2: ( 'TABLE_PER_CLASS' )
                    // InternalDTO.g:623:3: 'TABLE_PER_CLASS'
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
    // InternalDTO.g:632:1: rule__AttributeType__Alternatives : ( ( ruleSingleType ) | ( ruleCollectionType ) );
    public final void rule__AttributeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:636:1: ( ( ruleSingleType ) | ( ruleCollectionType ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID||(LA8_0>=21 && LA8_0<=25)||(LA8_0>=36 && LA8_0<=40)) ) {
                alt8=1;
            }
            else if ( (LA8_0==41) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalDTO.g:637:2: ( ruleSingleType )
                    {
                    // InternalDTO.g:637:2: ( ruleSingleType )
                    // InternalDTO.g:638:3: ruleSingleType
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
                    // InternalDTO.g:643:2: ( ruleCollectionType )
                    {
                    // InternalDTO.g:643:2: ( ruleCollectionType )
                    // InternalDTO.g:644:3: ruleCollectionType
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
    // InternalDTO.g:653:1: rule__SingleType__Alternatives : ( ( ruleBasicType ) | ( ruleRefType ) );
    public final void rule__SingleType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:657:1: ( ( ruleBasicType ) | ( ruleRefType ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=21 && LA9_0<=25)||(LA9_0>=36 && LA9_0<=40)) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalDTO.g:658:2: ( ruleBasicType )
                    {
                    // InternalDTO.g:658:2: ( ruleBasicType )
                    // InternalDTO.g:659:3: ruleBasicType
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
                    // InternalDTO.g:664:2: ( ruleRefType )
                    {
                    // InternalDTO.g:664:2: ( ruleRefType )
                    // InternalDTO.g:665:3: ruleRefType
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
    // InternalDTO.g:674:1: superBasicType__Alternatives : ( ( ( superBasicType__Group_0__0 ) ) | ( ( superBasicType__Group_1__0 ) ) | ( ( superBasicType__Group_2__0 ) ) | ( ( superBasicType__Group_3__0 ) ) | ( ( superBasicType__Group_4__0 ) ) );
    public final void superBasicType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:678:1: ( ( ( superBasicType__Group_0__0 ) ) | ( ( superBasicType__Group_1__0 ) ) | ( ( superBasicType__Group_2__0 ) ) | ( ( superBasicType__Group_3__0 ) ) | ( ( superBasicType__Group_4__0 ) ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt10=1;
                }
                break;
            case 37:
                {
                alt10=2;
                }
                break;
            case 38:
                {
                alt10=3;
                }
                break;
            case 39:
                {
                alt10=4;
                }
                break;
            case 40:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalDTO.g:679:2: ( ( superBasicType__Group_0__0 ) )
                    {
                    // InternalDTO.g:679:2: ( ( superBasicType__Group_0__0 ) )
                    // InternalDTO.g:680:3: ( superBasicType__Group_0__0 )
                    {
                     before(grammarAccess.getDomainModelBasicTypeAccess().getGroup_0()); 
                    // InternalDTO.g:681:3: ( superBasicType__Group_0__0 )
                    // InternalDTO.g:681:4: superBasicType__Group_0__0
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
                    // InternalDTO.g:685:2: ( ( superBasicType__Group_1__0 ) )
                    {
                    // InternalDTO.g:685:2: ( ( superBasicType__Group_1__0 ) )
                    // InternalDTO.g:686:3: ( superBasicType__Group_1__0 )
                    {
                     before(grammarAccess.getDomainModelBasicTypeAccess().getGroup_1()); 
                    // InternalDTO.g:687:3: ( superBasicType__Group_1__0 )
                    // InternalDTO.g:687:4: superBasicType__Group_1__0
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
                    // InternalDTO.g:691:2: ( ( superBasicType__Group_2__0 ) )
                    {
                    // InternalDTO.g:691:2: ( ( superBasicType__Group_2__0 ) )
                    // InternalDTO.g:692:3: ( superBasicType__Group_2__0 )
                    {
                     before(grammarAccess.getDomainModelBasicTypeAccess().getGroup_2()); 
                    // InternalDTO.g:693:3: ( superBasicType__Group_2__0 )
                    // InternalDTO.g:693:4: superBasicType__Group_2__0
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
                    // InternalDTO.g:697:2: ( ( superBasicType__Group_3__0 ) )
                    {
                    // InternalDTO.g:697:2: ( ( superBasicType__Group_3__0 ) )
                    // InternalDTO.g:698:3: ( superBasicType__Group_3__0 )
                    {
                     before(grammarAccess.getDomainModelBasicTypeAccess().getGroup_3()); 
                    // InternalDTO.g:699:3: ( superBasicType__Group_3__0 )
                    // InternalDTO.g:699:4: superBasicType__Group_3__0
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
                    // InternalDTO.g:703:2: ( ( superBasicType__Group_4__0 ) )
                    {
                    // InternalDTO.g:703:2: ( ( superBasicType__Group_4__0 ) )
                    // InternalDTO.g:704:3: ( superBasicType__Group_4__0 )
                    {
                     before(grammarAccess.getDomainModelBasicTypeAccess().getGroup_4()); 
                    // InternalDTO.g:705:3: ( superBasicType__Group_4__0 )
                    // InternalDTO.g:705:4: superBasicType__Group_4__0
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


    // $ANTLR start "rule__DTOClass__Group__0"
    // InternalDTO.g:713:1: rule__DTOClass__Group__0 : rule__DTOClass__Group__0__Impl rule__DTOClass__Group__1 ;
    public final void rule__DTOClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:717:1: ( rule__DTOClass__Group__0__Impl rule__DTOClass__Group__1 )
            // InternalDTO.g:718:2: rule__DTOClass__Group__0__Impl rule__DTOClass__Group__1
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
    // InternalDTO.g:725:1: rule__DTOClass__Group__0__Impl : ( 'class' ) ;
    public final void rule__DTOClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:729:1: ( ( 'class' ) )
            // InternalDTO.g:730:1: ( 'class' )
            {
            // InternalDTO.g:730:1: ( 'class' )
            // InternalDTO.g:731:2: 'class'
            {
             before(grammarAccess.getDTOClassAccess().getClassKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalDTO.g:740:1: rule__DTOClass__Group__1 : rule__DTOClass__Group__1__Impl rule__DTOClass__Group__2 ;
    public final void rule__DTOClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:744:1: ( rule__DTOClass__Group__1__Impl rule__DTOClass__Group__2 )
            // InternalDTO.g:745:2: rule__DTOClass__Group__1__Impl rule__DTOClass__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalDTO.g:752:1: rule__DTOClass__Group__1__Impl : ( ( rule__DTOClass__NameAssignment_1 ) ) ;
    public final void rule__DTOClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:756:1: ( ( ( rule__DTOClass__NameAssignment_1 ) ) )
            // InternalDTO.g:757:1: ( ( rule__DTOClass__NameAssignment_1 ) )
            {
            // InternalDTO.g:757:1: ( ( rule__DTOClass__NameAssignment_1 ) )
            // InternalDTO.g:758:2: ( rule__DTOClass__NameAssignment_1 )
            {
             before(grammarAccess.getDTOClassAccess().getNameAssignment_1()); 
            // InternalDTO.g:759:2: ( rule__DTOClass__NameAssignment_1 )
            // InternalDTO.g:759:3: rule__DTOClass__NameAssignment_1
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
    // InternalDTO.g:767:1: rule__DTOClass__Group__2 : rule__DTOClass__Group__2__Impl rule__DTOClass__Group__3 ;
    public final void rule__DTOClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:771:1: ( rule__DTOClass__Group__2__Impl rule__DTOClass__Group__3 )
            // InternalDTO.g:772:2: rule__DTOClass__Group__2__Impl rule__DTOClass__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalDTO.g:779:1: rule__DTOClass__Group__2__Impl : ( ( rule__DTOClass__Group_2__0 )? ) ;
    public final void rule__DTOClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:783:1: ( ( ( rule__DTOClass__Group_2__0 )? ) )
            // InternalDTO.g:784:1: ( ( rule__DTOClass__Group_2__0 )? )
            {
            // InternalDTO.g:784:1: ( ( rule__DTOClass__Group_2__0 )? )
            // InternalDTO.g:785:2: ( rule__DTOClass__Group_2__0 )?
            {
             before(grammarAccess.getDTOClassAccess().getGroup_2()); 
            // InternalDTO.g:786:2: ( rule__DTOClass__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDTO.g:786:3: rule__DTOClass__Group_2__0
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
    // InternalDTO.g:794:1: rule__DTOClass__Group__3 : rule__DTOClass__Group__3__Impl rule__DTOClass__Group__4 ;
    public final void rule__DTOClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:798:1: ( rule__DTOClass__Group__3__Impl rule__DTOClass__Group__4 )
            // InternalDTO.g:799:2: rule__DTOClass__Group__3__Impl rule__DTOClass__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalDTO.g:806:1: rule__DTOClass__Group__3__Impl : ( '{' ) ;
    public final void rule__DTOClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:810:1: ( ( '{' ) )
            // InternalDTO.g:811:1: ( '{' )
            {
            // InternalDTO.g:811:1: ( '{' )
            // InternalDTO.g:812:2: '{'
            {
             before(grammarAccess.getDTOClassAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
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
    // InternalDTO.g:821:1: rule__DTOClass__Group__4 : rule__DTOClass__Group__4__Impl rule__DTOClass__Group__5 ;
    public final void rule__DTOClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:825:1: ( rule__DTOClass__Group__4__Impl rule__DTOClass__Group__5 )
            // InternalDTO.g:826:2: rule__DTOClass__Group__4__Impl rule__DTOClass__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalDTO.g:833:1: rule__DTOClass__Group__4__Impl : ( ( rule__DTOClass__AttributesAssignment_4 )* ) ;
    public final void rule__DTOClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:837:1: ( ( ( rule__DTOClass__AttributesAssignment_4 )* ) )
            // InternalDTO.g:838:1: ( ( rule__DTOClass__AttributesAssignment_4 )* )
            {
            // InternalDTO.g:838:1: ( ( rule__DTOClass__AttributesAssignment_4 )* )
            // InternalDTO.g:839:2: ( rule__DTOClass__AttributesAssignment_4 )*
            {
             before(grammarAccess.getDTOClassAccess().getAttributesAssignment_4()); 
            // InternalDTO.g:840:2: ( rule__DTOClass__AttributesAssignment_4 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||(LA12_0>=21 && LA12_0<=25)||(LA12_0>=36 && LA12_0<=41)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDTO.g:840:3: rule__DTOClass__AttributesAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__DTOClass__AttributesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalDTO.g:848:1: rule__DTOClass__Group__5 : rule__DTOClass__Group__5__Impl ;
    public final void rule__DTOClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:852:1: ( rule__DTOClass__Group__5__Impl )
            // InternalDTO.g:853:2: rule__DTOClass__Group__5__Impl
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
    // InternalDTO.g:859:1: rule__DTOClass__Group__5__Impl : ( '}' ) ;
    public final void rule__DTOClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:863:1: ( ( '}' ) )
            // InternalDTO.g:864:1: ( '}' )
            {
            // InternalDTO.g:864:1: ( '}' )
            // InternalDTO.g:865:2: '}'
            {
             before(grammarAccess.getDTOClassAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
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
    // InternalDTO.g:875:1: rule__DTOClass__Group_2__0 : rule__DTOClass__Group_2__0__Impl rule__DTOClass__Group_2__1 ;
    public final void rule__DTOClass__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:879:1: ( rule__DTOClass__Group_2__0__Impl rule__DTOClass__Group_2__1 )
            // InternalDTO.g:880:2: rule__DTOClass__Group_2__0__Impl rule__DTOClass__Group_2__1
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
    // InternalDTO.g:887:1: rule__DTOClass__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__DTOClass__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:891:1: ( ( 'extends' ) )
            // InternalDTO.g:892:1: ( 'extends' )
            {
            // InternalDTO.g:892:1: ( 'extends' )
            // InternalDTO.g:893:2: 'extends'
            {
             before(grammarAccess.getDTOClassAccess().getExtendsKeyword_2_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalDTO.g:902:1: rule__DTOClass__Group_2__1 : rule__DTOClass__Group_2__1__Impl ;
    public final void rule__DTOClass__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:906:1: ( rule__DTOClass__Group_2__1__Impl )
            // InternalDTO.g:907:2: rule__DTOClass__Group_2__1__Impl
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
    // InternalDTO.g:913:1: rule__DTOClass__Group_2__1__Impl : ( ( rule__DTOClass__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__DTOClass__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:917:1: ( ( ( rule__DTOClass__SuperTypeAssignment_2_1 ) ) )
            // InternalDTO.g:918:1: ( ( rule__DTOClass__SuperTypeAssignment_2_1 ) )
            {
            // InternalDTO.g:918:1: ( ( rule__DTOClass__SuperTypeAssignment_2_1 ) )
            // InternalDTO.g:919:2: ( rule__DTOClass__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getDTOClassAccess().getSuperTypeAssignment_2_1()); 
            // InternalDTO.g:920:2: ( rule__DTOClass__SuperTypeAssignment_2_1 )
            // InternalDTO.g:920:3: rule__DTOClass__SuperTypeAssignment_2_1
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


    // $ANTLR start "rule__AttributeOption__Group__0"
    // InternalDTO.g:929:1: rule__AttributeOption__Group__0 : rule__AttributeOption__Group__0__Impl rule__AttributeOption__Group__1 ;
    public final void rule__AttributeOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:933:1: ( rule__AttributeOption__Group__0__Impl rule__AttributeOption__Group__1 )
            // InternalDTO.g:934:2: rule__AttributeOption__Group__0__Impl rule__AttributeOption__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__AttributeOption__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeOption__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeOption__Group__0"


    // $ANTLR start "rule__AttributeOption__Group__0__Impl"
    // InternalDTO.g:941:1: rule__AttributeOption__Group__0__Impl : ( () ) ;
    public final void rule__AttributeOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:945:1: ( ( () ) )
            // InternalDTO.g:946:1: ( () )
            {
            // InternalDTO.g:946:1: ( () )
            // InternalDTO.g:947:2: ()
            {
             before(grammarAccess.getAttributeOptionAccess().getObjectRepresentationAction_0()); 
            // InternalDTO.g:948:2: ()
            // InternalDTO.g:948:3: 
            {
            }

             after(grammarAccess.getAttributeOptionAccess().getObjectRepresentationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeOption__Group__0__Impl"


    // $ANTLR start "rule__AttributeOption__Group__1"
    // InternalDTO.g:956:1: rule__AttributeOption__Group__1 : rule__AttributeOption__Group__1__Impl ;
    public final void rule__AttributeOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:960:1: ( rule__AttributeOption__Group__1__Impl )
            // InternalDTO.g:961:2: rule__AttributeOption__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeOption__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeOption__Group__1"


    // $ANTLR start "rule__AttributeOption__Group__1__Impl"
    // InternalDTO.g:967:1: rule__AttributeOption__Group__1__Impl : ( 'representation' ) ;
    public final void rule__AttributeOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:971:1: ( ( 'representation' ) )
            // InternalDTO.g:972:1: ( 'representation' )
            {
            // InternalDTO.g:972:1: ( 'representation' )
            // InternalDTO.g:973:2: 'representation'
            {
             before(grammarAccess.getAttributeOptionAccess().getRepresentationKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAttributeOptionAccess().getRepresentationKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeOption__Group__1__Impl"


    // $ANTLR start "rule__BasicType__Group_1__0"
    // InternalDTO.g:983:1: rule__BasicType__Group_1__0 : rule__BasicType__Group_1__0__Impl rule__BasicType__Group_1__1 ;
    public final void rule__BasicType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:987:1: ( rule__BasicType__Group_1__0__Impl rule__BasicType__Group_1__1 )
            // InternalDTO.g:988:2: rule__BasicType__Group_1__0__Impl rule__BasicType__Group_1__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalDTO.g:995:1: rule__BasicType__Group_1__0__Impl : ( () ) ;
    public final void rule__BasicType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:999:1: ( ( () ) )
            // InternalDTO.g:1000:1: ( () )
            {
            // InternalDTO.g:1000:1: ( () )
            // InternalDTO.g:1001:2: ()
            {
             before(grammarAccess.getBasicTypeAccess().getTextTypeAction_1_0()); 
            // InternalDTO.g:1002:2: ()
            // InternalDTO.g:1002:3: 
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
    // InternalDTO.g:1010:1: rule__BasicType__Group_1__1 : rule__BasicType__Group_1__1__Impl ;
    public final void rule__BasicType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1014:1: ( rule__BasicType__Group_1__1__Impl )
            // InternalDTO.g:1015:2: rule__BasicType__Group_1__1__Impl
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
    // InternalDTO.g:1021:1: rule__BasicType__Group_1__1__Impl : ( 'text' ) ;
    public final void rule__BasicType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1025:1: ( ( 'text' ) )
            // InternalDTO.g:1026:1: ( 'text' )
            {
            // InternalDTO.g:1026:1: ( 'text' )
            // InternalDTO.g:1027:2: 'text'
            {
             before(grammarAccess.getBasicTypeAccess().getTextKeyword_1_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalDTO.g:1037:1: rule__BasicType__Group_2__0 : rule__BasicType__Group_2__0__Impl rule__BasicType__Group_2__1 ;
    public final void rule__BasicType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1041:1: ( rule__BasicType__Group_2__0__Impl rule__BasicType__Group_2__1 )
            // InternalDTO.g:1042:2: rule__BasicType__Group_2__0__Impl rule__BasicType__Group_2__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalDTO.g:1049:1: rule__BasicType__Group_2__0__Impl : ( () ) ;
    public final void rule__BasicType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1053:1: ( ( () ) )
            // InternalDTO.g:1054:1: ( () )
            {
            // InternalDTO.g:1054:1: ( () )
            // InternalDTO.g:1055:2: ()
            {
             before(grammarAccess.getBasicTypeAccess().getEmailTypeAction_2_0()); 
            // InternalDTO.g:1056:2: ()
            // InternalDTO.g:1056:3: 
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
    // InternalDTO.g:1064:1: rule__BasicType__Group_2__1 : rule__BasicType__Group_2__1__Impl ;
    public final void rule__BasicType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1068:1: ( rule__BasicType__Group_2__1__Impl )
            // InternalDTO.g:1069:2: rule__BasicType__Group_2__1__Impl
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
    // InternalDTO.g:1075:1: rule__BasicType__Group_2__1__Impl : ( 'email' ) ;
    public final void rule__BasicType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1079:1: ( ( 'email' ) )
            // InternalDTO.g:1080:1: ( 'email' )
            {
            // InternalDTO.g:1080:1: ( 'email' )
            // InternalDTO.g:1081:2: 'email'
            {
             before(grammarAccess.getBasicTypeAccess().getEmailKeyword_2_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalDTO.g:1091:1: rule__BasicType__Group_3__0 : rule__BasicType__Group_3__0__Impl rule__BasicType__Group_3__1 ;
    public final void rule__BasicType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1095:1: ( rule__BasicType__Group_3__0__Impl rule__BasicType__Group_3__1 )
            // InternalDTO.g:1096:2: rule__BasicType__Group_3__0__Impl rule__BasicType__Group_3__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalDTO.g:1103:1: rule__BasicType__Group_3__0__Impl : ( () ) ;
    public final void rule__BasicType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1107:1: ( ( () ) )
            // InternalDTO.g:1108:1: ( () )
            {
            // InternalDTO.g:1108:1: ( () )
            // InternalDTO.g:1109:2: ()
            {
             before(grammarAccess.getBasicTypeAccess().getPasswordTypeAction_3_0()); 
            // InternalDTO.g:1110:2: ()
            // InternalDTO.g:1110:3: 
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
    // InternalDTO.g:1118:1: rule__BasicType__Group_3__1 : rule__BasicType__Group_3__1__Impl ;
    public final void rule__BasicType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1122:1: ( rule__BasicType__Group_3__1__Impl )
            // InternalDTO.g:1123:2: rule__BasicType__Group_3__1__Impl
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
    // InternalDTO.g:1129:1: rule__BasicType__Group_3__1__Impl : ( 'password' ) ;
    public final void rule__BasicType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1133:1: ( ( 'password' ) )
            // InternalDTO.g:1134:1: ( 'password' )
            {
            // InternalDTO.g:1134:1: ( 'password' )
            // InternalDTO.g:1135:2: 'password'
            {
             before(grammarAccess.getBasicTypeAccess().getPasswordKeyword_3_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalDTO.g:1145:1: rule__BasicType__Group_4__0 : rule__BasicType__Group_4__0__Impl rule__BasicType__Group_4__1 ;
    public final void rule__BasicType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1149:1: ( rule__BasicType__Group_4__0__Impl rule__BasicType__Group_4__1 )
            // InternalDTO.g:1150:2: rule__BasicType__Group_4__0__Impl rule__BasicType__Group_4__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalDTO.g:1157:1: rule__BasicType__Group_4__0__Impl : ( () ) ;
    public final void rule__BasicType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1161:1: ( ( () ) )
            // InternalDTO.g:1162:1: ( () )
            {
            // InternalDTO.g:1162:1: ( () )
            // InternalDTO.g:1163:2: ()
            {
             before(grammarAccess.getBasicTypeAccess().getFileTypeAction_4_0()); 
            // InternalDTO.g:1164:2: ()
            // InternalDTO.g:1164:3: 
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
    // InternalDTO.g:1172:1: rule__BasicType__Group_4__1 : rule__BasicType__Group_4__1__Impl ;
    public final void rule__BasicType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1176:1: ( rule__BasicType__Group_4__1__Impl )
            // InternalDTO.g:1177:2: rule__BasicType__Group_4__1__Impl
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
    // InternalDTO.g:1183:1: rule__BasicType__Group_4__1__Impl : ( 'file' ) ;
    public final void rule__BasicType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1187:1: ( ( 'file' ) )
            // InternalDTO.g:1188:1: ( 'file' )
            {
            // InternalDTO.g:1188:1: ( 'file' )
            // InternalDTO.g:1189:2: 'file'
            {
             before(grammarAccess.getBasicTypeAccess().getFileKeyword_4_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalDTO.g:1199:1: rule__BasicType__Group_5__0 : rule__BasicType__Group_5__0__Impl rule__BasicType__Group_5__1 ;
    public final void rule__BasicType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1203:1: ( rule__BasicType__Group_5__0__Impl rule__BasicType__Group_5__1 )
            // InternalDTO.g:1204:2: rule__BasicType__Group_5__0__Impl rule__BasicType__Group_5__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalDTO.g:1211:1: rule__BasicType__Group_5__0__Impl : ( () ) ;
    public final void rule__BasicType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1215:1: ( ( () ) )
            // InternalDTO.g:1216:1: ( () )
            {
            // InternalDTO.g:1216:1: ( () )
            // InternalDTO.g:1217:2: ()
            {
             before(grammarAccess.getBasicTypeAccess().getImageTypeAction_5_0()); 
            // InternalDTO.g:1218:2: ()
            // InternalDTO.g:1218:3: 
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
    // InternalDTO.g:1226:1: rule__BasicType__Group_5__1 : rule__BasicType__Group_5__1__Impl ;
    public final void rule__BasicType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1230:1: ( rule__BasicType__Group_5__1__Impl )
            // InternalDTO.g:1231:2: rule__BasicType__Group_5__1__Impl
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
    // InternalDTO.g:1237:1: rule__BasicType__Group_5__1__Impl : ( 'image' ) ;
    public final void rule__BasicType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1241:1: ( ( 'image' ) )
            // InternalDTO.g:1242:1: ( 'image' )
            {
            // InternalDTO.g:1242:1: ( 'image' )
            // InternalDTO.g:1243:2: 'image'
            {
             before(grammarAccess.getBasicTypeAccess().getImageKeyword_5_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalDTO.g:1253:1: rule__Enum__Group__0 : rule__Enum__Group__0__Impl rule__Enum__Group__1 ;
    public final void rule__Enum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1257:1: ( rule__Enum__Group__0__Impl rule__Enum__Group__1 )
            // InternalDTO.g:1258:2: rule__Enum__Group__0__Impl rule__Enum__Group__1
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
    // InternalDTO.g:1265:1: rule__Enum__Group__0__Impl : ( 'enum' ) ;
    public final void rule__Enum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1269:1: ( ( 'enum' ) )
            // InternalDTO.g:1270:1: ( 'enum' )
            {
            // InternalDTO.g:1270:1: ( 'enum' )
            // InternalDTO.g:1271:2: 'enum'
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
    // InternalDTO.g:1280:1: rule__Enum__Group__1 : rule__Enum__Group__1__Impl rule__Enum__Group__2 ;
    public final void rule__Enum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1284:1: ( rule__Enum__Group__1__Impl rule__Enum__Group__2 )
            // InternalDTO.g:1285:2: rule__Enum__Group__1__Impl rule__Enum__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalDTO.g:1292:1: rule__Enum__Group__1__Impl : ( ( rule__Enum__NameAssignment_1 ) ) ;
    public final void rule__Enum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1296:1: ( ( ( rule__Enum__NameAssignment_1 ) ) )
            // InternalDTO.g:1297:1: ( ( rule__Enum__NameAssignment_1 ) )
            {
            // InternalDTO.g:1297:1: ( ( rule__Enum__NameAssignment_1 ) )
            // InternalDTO.g:1298:2: ( rule__Enum__NameAssignment_1 )
            {
             before(grammarAccess.getEnumAccess().getNameAssignment_1()); 
            // InternalDTO.g:1299:2: ( rule__Enum__NameAssignment_1 )
            // InternalDTO.g:1299:3: rule__Enum__NameAssignment_1
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
    // InternalDTO.g:1307:1: rule__Enum__Group__2 : rule__Enum__Group__2__Impl rule__Enum__Group__3 ;
    public final void rule__Enum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1311:1: ( rule__Enum__Group__2__Impl rule__Enum__Group__3 )
            // InternalDTO.g:1312:2: rule__Enum__Group__2__Impl rule__Enum__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalDTO.g:1319:1: rule__Enum__Group__2__Impl : ( '{' ) ;
    public final void rule__Enum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1323:1: ( ( '{' ) )
            // InternalDTO.g:1324:1: ( '{' )
            {
            // InternalDTO.g:1324:1: ( '{' )
            // InternalDTO.g:1325:2: '{'
            {
             before(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
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
    // InternalDTO.g:1334:1: rule__Enum__Group__3 : rule__Enum__Group__3__Impl rule__Enum__Group__4 ;
    public final void rule__Enum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1338:1: ( rule__Enum__Group__3__Impl rule__Enum__Group__4 )
            // InternalDTO.g:1339:2: rule__Enum__Group__3__Impl rule__Enum__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalDTO.g:1346:1: rule__Enum__Group__3__Impl : ( ( rule__Enum__AttributesAssignment_3 )* ) ;
    public final void rule__Enum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1350:1: ( ( ( rule__Enum__AttributesAssignment_3 )* ) )
            // InternalDTO.g:1351:1: ( ( rule__Enum__AttributesAssignment_3 )* )
            {
            // InternalDTO.g:1351:1: ( ( rule__Enum__AttributesAssignment_3 )* )
            // InternalDTO.g:1352:2: ( rule__Enum__AttributesAssignment_3 )*
            {
             before(grammarAccess.getEnumAccess().getAttributesAssignment_3()); 
            // InternalDTO.g:1353:2: ( rule__Enum__AttributesAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1==RULE_ID) ) {
                        int LA13_3 = input.LA(3);

                        if ( (LA13_3==20||LA13_3==35) ) {
                            alt13=1;
                        }


                    }


                }
                else if ( ((LA13_0>=21 && LA13_0<=25)||(LA13_0>=36 && LA13_0<=41)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDTO.g:1353:3: rule__Enum__AttributesAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Enum__AttributesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalDTO.g:1361:1: rule__Enum__Group__4 : rule__Enum__Group__4__Impl rule__Enum__Group__5 ;
    public final void rule__Enum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1365:1: ( rule__Enum__Group__4__Impl rule__Enum__Group__5 )
            // InternalDTO.g:1366:2: rule__Enum__Group__4__Impl rule__Enum__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalDTO.g:1373:1: rule__Enum__Group__4__Impl : ( ( ( rule__Enum__LiteralsAssignment_4 ) ) ( ( rule__Enum__LiteralsAssignment_4 )* ) ) ;
    public final void rule__Enum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1377:1: ( ( ( ( rule__Enum__LiteralsAssignment_4 ) ) ( ( rule__Enum__LiteralsAssignment_4 )* ) ) )
            // InternalDTO.g:1378:1: ( ( ( rule__Enum__LiteralsAssignment_4 ) ) ( ( rule__Enum__LiteralsAssignment_4 )* ) )
            {
            // InternalDTO.g:1378:1: ( ( ( rule__Enum__LiteralsAssignment_4 ) ) ( ( rule__Enum__LiteralsAssignment_4 )* ) )
            // InternalDTO.g:1379:2: ( ( rule__Enum__LiteralsAssignment_4 ) ) ( ( rule__Enum__LiteralsAssignment_4 )* )
            {
            // InternalDTO.g:1379:2: ( ( rule__Enum__LiteralsAssignment_4 ) )
            // InternalDTO.g:1380:3: ( rule__Enum__LiteralsAssignment_4 )
            {
             before(grammarAccess.getEnumAccess().getLiteralsAssignment_4()); 
            // InternalDTO.g:1381:3: ( rule__Enum__LiteralsAssignment_4 )
            // InternalDTO.g:1381:4: rule__Enum__LiteralsAssignment_4
            {
            pushFollow(FOLLOW_7);
            rule__Enum__LiteralsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getLiteralsAssignment_4()); 

            }

            // InternalDTO.g:1384:2: ( ( rule__Enum__LiteralsAssignment_4 )* )
            // InternalDTO.g:1385:3: ( rule__Enum__LiteralsAssignment_4 )*
            {
             before(grammarAccess.getEnumAccess().getLiteralsAssignment_4()); 
            // InternalDTO.g:1386:3: ( rule__Enum__LiteralsAssignment_4 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDTO.g:1386:4: rule__Enum__LiteralsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Enum__LiteralsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalDTO.g:1395:1: rule__Enum__Group__5 : rule__Enum__Group__5__Impl ;
    public final void rule__Enum__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1399:1: ( rule__Enum__Group__5__Impl )
            // InternalDTO.g:1400:2: rule__Enum__Group__5__Impl
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
    // InternalDTO.g:1406:1: rule__Enum__Group__5__Impl : ( '}' ) ;
    public final void rule__Enum__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1410:1: ( ( '}' ) )
            // InternalDTO.g:1411:1: ( '}' )
            {
            // InternalDTO.g:1411:1: ( '}' )
            // InternalDTO.g:1412:2: '}'
            {
             before(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
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
    // InternalDTO.g:1422:1: rule__EnumLiteral__Group__0 : rule__EnumLiteral__Group__0__Impl rule__EnumLiteral__Group__1 ;
    public final void rule__EnumLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1426:1: ( rule__EnumLiteral__Group__0__Impl rule__EnumLiteral__Group__1 )
            // InternalDTO.g:1427:2: rule__EnumLiteral__Group__0__Impl rule__EnumLiteral__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalDTO.g:1434:1: rule__EnumLiteral__Group__0__Impl : ( ( rule__EnumLiteral__NameAssignment_0 ) ) ;
    public final void rule__EnumLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1438:1: ( ( ( rule__EnumLiteral__NameAssignment_0 ) ) )
            // InternalDTO.g:1439:1: ( ( rule__EnumLiteral__NameAssignment_0 ) )
            {
            // InternalDTO.g:1439:1: ( ( rule__EnumLiteral__NameAssignment_0 ) )
            // InternalDTO.g:1440:2: ( rule__EnumLiteral__NameAssignment_0 )
            {
             before(grammarAccess.getEnumLiteralAccess().getNameAssignment_0()); 
            // InternalDTO.g:1441:2: ( rule__EnumLiteral__NameAssignment_0 )
            // InternalDTO.g:1441:3: rule__EnumLiteral__NameAssignment_0
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
    // InternalDTO.g:1449:1: rule__EnumLiteral__Group__1 : rule__EnumLiteral__Group__1__Impl ;
    public final void rule__EnumLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1453:1: ( rule__EnumLiteral__Group__1__Impl )
            // InternalDTO.g:1454:2: rule__EnumLiteral__Group__1__Impl
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
    // InternalDTO.g:1460:1: rule__EnumLiteral__Group__1__Impl : ( ( rule__EnumLiteral__Group_1__0 )? ) ;
    public final void rule__EnumLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1464:1: ( ( ( rule__EnumLiteral__Group_1__0 )? ) )
            // InternalDTO.g:1465:1: ( ( rule__EnumLiteral__Group_1__0 )? )
            {
            // InternalDTO.g:1465:1: ( ( rule__EnumLiteral__Group_1__0 )? )
            // InternalDTO.g:1466:2: ( rule__EnumLiteral__Group_1__0 )?
            {
             before(grammarAccess.getEnumLiteralAccess().getGroup_1()); 
            // InternalDTO.g:1467:2: ( rule__EnumLiteral__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDTO.g:1467:3: rule__EnumLiteral__Group_1__0
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
    // InternalDTO.g:1476:1: rule__EnumLiteral__Group_1__0 : rule__EnumLiteral__Group_1__0__Impl rule__EnumLiteral__Group_1__1 ;
    public final void rule__EnumLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1480:1: ( rule__EnumLiteral__Group_1__0__Impl rule__EnumLiteral__Group_1__1 )
            // InternalDTO.g:1481:2: rule__EnumLiteral__Group_1__0__Impl rule__EnumLiteral__Group_1__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalDTO.g:1488:1: rule__EnumLiteral__Group_1__0__Impl : ( '(' ) ;
    public final void rule__EnumLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1492:1: ( ( '(' ) )
            // InternalDTO.g:1493:1: ( '(' )
            {
            // InternalDTO.g:1493:1: ( '(' )
            // InternalDTO.g:1494:2: '('
            {
             before(grammarAccess.getEnumLiteralAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalDTO.g:1503:1: rule__EnumLiteral__Group_1__1 : rule__EnumLiteral__Group_1__1__Impl rule__EnumLiteral__Group_1__2 ;
    public final void rule__EnumLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1507:1: ( rule__EnumLiteral__Group_1__1__Impl rule__EnumLiteral__Group_1__2 )
            // InternalDTO.g:1508:2: rule__EnumLiteral__Group_1__1__Impl rule__EnumLiteral__Group_1__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalDTO.g:1515:1: rule__EnumLiteral__Group_1__1__Impl : ( ( rule__EnumLiteral__ParamsAssignment_1_1 ) ) ;
    public final void rule__EnumLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1519:1: ( ( ( rule__EnumLiteral__ParamsAssignment_1_1 ) ) )
            // InternalDTO.g:1520:1: ( ( rule__EnumLiteral__ParamsAssignment_1_1 ) )
            {
            // InternalDTO.g:1520:1: ( ( rule__EnumLiteral__ParamsAssignment_1_1 ) )
            // InternalDTO.g:1521:2: ( rule__EnumLiteral__ParamsAssignment_1_1 )
            {
             before(grammarAccess.getEnumLiteralAccess().getParamsAssignment_1_1()); 
            // InternalDTO.g:1522:2: ( rule__EnumLiteral__ParamsAssignment_1_1 )
            // InternalDTO.g:1522:3: rule__EnumLiteral__ParamsAssignment_1_1
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
    // InternalDTO.g:1530:1: rule__EnumLiteral__Group_1__2 : rule__EnumLiteral__Group_1__2__Impl rule__EnumLiteral__Group_1__3 ;
    public final void rule__EnumLiteral__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1534:1: ( rule__EnumLiteral__Group_1__2__Impl rule__EnumLiteral__Group_1__3 )
            // InternalDTO.g:1535:2: rule__EnumLiteral__Group_1__2__Impl rule__EnumLiteral__Group_1__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalDTO.g:1542:1: rule__EnumLiteral__Group_1__2__Impl : ( ( rule__EnumLiteral__Group_1_2__0 )* ) ;
    public final void rule__EnumLiteral__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1546:1: ( ( ( rule__EnumLiteral__Group_1_2__0 )* ) )
            // InternalDTO.g:1547:1: ( ( rule__EnumLiteral__Group_1_2__0 )* )
            {
            // InternalDTO.g:1547:1: ( ( rule__EnumLiteral__Group_1_2__0 )* )
            // InternalDTO.g:1548:2: ( rule__EnumLiteral__Group_1_2__0 )*
            {
             before(grammarAccess.getEnumLiteralAccess().getGroup_1_2()); 
            // InternalDTO.g:1549:2: ( rule__EnumLiteral__Group_1_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==29) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDTO.g:1549:3: rule__EnumLiteral__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__EnumLiteral__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalDTO.g:1557:1: rule__EnumLiteral__Group_1__3 : rule__EnumLiteral__Group_1__3__Impl ;
    public final void rule__EnumLiteral__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1561:1: ( rule__EnumLiteral__Group_1__3__Impl )
            // InternalDTO.g:1562:2: rule__EnumLiteral__Group_1__3__Impl
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
    // InternalDTO.g:1568:1: rule__EnumLiteral__Group_1__3__Impl : ( ')' ) ;
    public final void rule__EnumLiteral__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1572:1: ( ( ')' ) )
            // InternalDTO.g:1573:1: ( ')' )
            {
            // InternalDTO.g:1573:1: ( ')' )
            // InternalDTO.g:1574:2: ')'
            {
             before(grammarAccess.getEnumLiteralAccess().getRightParenthesisKeyword_1_3()); 
            match(input,28,FOLLOW_2); 
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
    // InternalDTO.g:1584:1: rule__EnumLiteral__Group_1_2__0 : rule__EnumLiteral__Group_1_2__0__Impl rule__EnumLiteral__Group_1_2__1 ;
    public final void rule__EnumLiteral__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1588:1: ( rule__EnumLiteral__Group_1_2__0__Impl rule__EnumLiteral__Group_1_2__1 )
            // InternalDTO.g:1589:2: rule__EnumLiteral__Group_1_2__0__Impl rule__EnumLiteral__Group_1_2__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalDTO.g:1596:1: rule__EnumLiteral__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__EnumLiteral__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1600:1: ( ( ',' ) )
            // InternalDTO.g:1601:1: ( ',' )
            {
            // InternalDTO.g:1601:1: ( ',' )
            // InternalDTO.g:1602:2: ','
            {
             before(grammarAccess.getEnumLiteralAccess().getCommaKeyword_1_2_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalDTO.g:1611:1: rule__EnumLiteral__Group_1_2__1 : rule__EnumLiteral__Group_1_2__1__Impl ;
    public final void rule__EnumLiteral__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1615:1: ( rule__EnumLiteral__Group_1_2__1__Impl )
            // InternalDTO.g:1616:2: rule__EnumLiteral__Group_1_2__1__Impl
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
    // InternalDTO.g:1622:1: rule__EnumLiteral__Group_1_2__1__Impl : ( ( rule__EnumLiteral__ParamsAssignment_1_2_1 ) ) ;
    public final void rule__EnumLiteral__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1626:1: ( ( ( rule__EnumLiteral__ParamsAssignment_1_2_1 ) ) )
            // InternalDTO.g:1627:1: ( ( rule__EnumLiteral__ParamsAssignment_1_2_1 ) )
            {
            // InternalDTO.g:1627:1: ( ( rule__EnumLiteral__ParamsAssignment_1_2_1 ) )
            // InternalDTO.g:1628:2: ( rule__EnumLiteral__ParamsAssignment_1_2_1 )
            {
             before(grammarAccess.getEnumLiteralAccess().getParamsAssignment_1_2_1()); 
            // InternalDTO.g:1629:2: ( rule__EnumLiteral__ParamsAssignment_1_2_1 )
            // InternalDTO.g:1629:3: rule__EnumLiteral__ParamsAssignment_1_2_1
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
    // InternalDTO.g:1638:1: rule__Constant__Group_0__0 : rule__Constant__Group_0__0__Impl rule__Constant__Group_0__1 ;
    public final void rule__Constant__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1642:1: ( rule__Constant__Group_0__0__Impl rule__Constant__Group_0__1 )
            // InternalDTO.g:1643:2: rule__Constant__Group_0__0__Impl rule__Constant__Group_0__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalDTO.g:1650:1: rule__Constant__Group_0__0__Impl : ( () ) ;
    public final void rule__Constant__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1654:1: ( ( () ) )
            // InternalDTO.g:1655:1: ( () )
            {
            // InternalDTO.g:1655:1: ( () )
            // InternalDTO.g:1656:2: ()
            {
             before(grammarAccess.getConstantAccess().getIntConstantAction_0_0()); 
            // InternalDTO.g:1657:2: ()
            // InternalDTO.g:1657:3: 
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
    // InternalDTO.g:1665:1: rule__Constant__Group_0__1 : rule__Constant__Group_0__1__Impl ;
    public final void rule__Constant__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1669:1: ( rule__Constant__Group_0__1__Impl )
            // InternalDTO.g:1670:2: rule__Constant__Group_0__1__Impl
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
    // InternalDTO.g:1676:1: rule__Constant__Group_0__1__Impl : ( ( rule__Constant__ValueAssignment_0_1 ) ) ;
    public final void rule__Constant__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1680:1: ( ( ( rule__Constant__ValueAssignment_0_1 ) ) )
            // InternalDTO.g:1681:1: ( ( rule__Constant__ValueAssignment_0_1 ) )
            {
            // InternalDTO.g:1681:1: ( ( rule__Constant__ValueAssignment_0_1 ) )
            // InternalDTO.g:1682:2: ( rule__Constant__ValueAssignment_0_1 )
            {
             before(grammarAccess.getConstantAccess().getValueAssignment_0_1()); 
            // InternalDTO.g:1683:2: ( rule__Constant__ValueAssignment_0_1 )
            // InternalDTO.g:1683:3: rule__Constant__ValueAssignment_0_1
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
    // InternalDTO.g:1692:1: rule__Constant__Group_1__0 : rule__Constant__Group_1__0__Impl rule__Constant__Group_1__1 ;
    public final void rule__Constant__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1696:1: ( rule__Constant__Group_1__0__Impl rule__Constant__Group_1__1 )
            // InternalDTO.g:1697:2: rule__Constant__Group_1__0__Impl rule__Constant__Group_1__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalDTO.g:1704:1: rule__Constant__Group_1__0__Impl : ( () ) ;
    public final void rule__Constant__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1708:1: ( ( () ) )
            // InternalDTO.g:1709:1: ( () )
            {
            // InternalDTO.g:1709:1: ( () )
            // InternalDTO.g:1710:2: ()
            {
             before(grammarAccess.getConstantAccess().getLongConstantAction_1_0()); 
            // InternalDTO.g:1711:2: ()
            // InternalDTO.g:1711:3: 
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
    // InternalDTO.g:1719:1: rule__Constant__Group_1__1 : rule__Constant__Group_1__1__Impl rule__Constant__Group_1__2 ;
    public final void rule__Constant__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1723:1: ( rule__Constant__Group_1__1__Impl rule__Constant__Group_1__2 )
            // InternalDTO.g:1724:2: rule__Constant__Group_1__1__Impl rule__Constant__Group_1__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalDTO.g:1731:1: rule__Constant__Group_1__1__Impl : ( ( rule__Constant__ValueAssignment_1_1 ) ) ;
    public final void rule__Constant__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1735:1: ( ( ( rule__Constant__ValueAssignment_1_1 ) ) )
            // InternalDTO.g:1736:1: ( ( rule__Constant__ValueAssignment_1_1 ) )
            {
            // InternalDTO.g:1736:1: ( ( rule__Constant__ValueAssignment_1_1 ) )
            // InternalDTO.g:1737:2: ( rule__Constant__ValueAssignment_1_1 )
            {
             before(grammarAccess.getConstantAccess().getValueAssignment_1_1()); 
            // InternalDTO.g:1738:2: ( rule__Constant__ValueAssignment_1_1 )
            // InternalDTO.g:1738:3: rule__Constant__ValueAssignment_1_1
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
    // InternalDTO.g:1746:1: rule__Constant__Group_1__2 : rule__Constant__Group_1__2__Impl ;
    public final void rule__Constant__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1750:1: ( rule__Constant__Group_1__2__Impl )
            // InternalDTO.g:1751:2: rule__Constant__Group_1__2__Impl
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
    // InternalDTO.g:1757:1: rule__Constant__Group_1__2__Impl : ( 'L' ) ;
    public final void rule__Constant__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1761:1: ( ( 'L' ) )
            // InternalDTO.g:1762:1: ( 'L' )
            {
            // InternalDTO.g:1762:1: ( 'L' )
            // InternalDTO.g:1763:2: 'L'
            {
             before(grammarAccess.getConstantAccess().getLKeyword_1_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalDTO.g:1773:1: rule__Constant__Group_2__0 : rule__Constant__Group_2__0__Impl rule__Constant__Group_2__1 ;
    public final void rule__Constant__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1777:1: ( rule__Constant__Group_2__0__Impl rule__Constant__Group_2__1 )
            // InternalDTO.g:1778:2: rule__Constant__Group_2__0__Impl rule__Constant__Group_2__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalDTO.g:1785:1: rule__Constant__Group_2__0__Impl : ( () ) ;
    public final void rule__Constant__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1789:1: ( ( () ) )
            // InternalDTO.g:1790:1: ( () )
            {
            // InternalDTO.g:1790:1: ( () )
            // InternalDTO.g:1791:2: ()
            {
             before(grammarAccess.getConstantAccess().getStringConstantAction_2_0()); 
            // InternalDTO.g:1792:2: ()
            // InternalDTO.g:1792:3: 
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
    // InternalDTO.g:1800:1: rule__Constant__Group_2__1 : rule__Constant__Group_2__1__Impl ;
    public final void rule__Constant__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1804:1: ( rule__Constant__Group_2__1__Impl )
            // InternalDTO.g:1805:2: rule__Constant__Group_2__1__Impl
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
    // InternalDTO.g:1811:1: rule__Constant__Group_2__1__Impl : ( ( rule__Constant__ValueAssignment_2_1 ) ) ;
    public final void rule__Constant__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1815:1: ( ( ( rule__Constant__ValueAssignment_2_1 ) ) )
            // InternalDTO.g:1816:1: ( ( rule__Constant__ValueAssignment_2_1 ) )
            {
            // InternalDTO.g:1816:1: ( ( rule__Constant__ValueAssignment_2_1 ) )
            // InternalDTO.g:1817:2: ( rule__Constant__ValueAssignment_2_1 )
            {
             before(grammarAccess.getConstantAccess().getValueAssignment_2_1()); 
            // InternalDTO.g:1818:2: ( rule__Constant__ValueAssignment_2_1 )
            // InternalDTO.g:1818:3: rule__Constant__ValueAssignment_2_1
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
    // InternalDTO.g:1827:1: rule__Constant__Group_3__0 : rule__Constant__Group_3__0__Impl rule__Constant__Group_3__1 ;
    public final void rule__Constant__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1831:1: ( rule__Constant__Group_3__0__Impl rule__Constant__Group_3__1 )
            // InternalDTO.g:1832:2: rule__Constant__Group_3__0__Impl rule__Constant__Group_3__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalDTO.g:1839:1: rule__Constant__Group_3__0__Impl : ( () ) ;
    public final void rule__Constant__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1843:1: ( ( () ) )
            // InternalDTO.g:1844:1: ( () )
            {
            // InternalDTO.g:1844:1: ( () )
            // InternalDTO.g:1845:2: ()
            {
             before(grammarAccess.getConstantAccess().getBoolConstantAction_3_0()); 
            // InternalDTO.g:1846:2: ()
            // InternalDTO.g:1846:3: 
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
    // InternalDTO.g:1854:1: rule__Constant__Group_3__1 : rule__Constant__Group_3__1__Impl ;
    public final void rule__Constant__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1858:1: ( rule__Constant__Group_3__1__Impl )
            // InternalDTO.g:1859:2: rule__Constant__Group_3__1__Impl
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
    // InternalDTO.g:1865:1: rule__Constant__Group_3__1__Impl : ( ( rule__Constant__ValueAssignment_3_1 ) ) ;
    public final void rule__Constant__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1869:1: ( ( ( rule__Constant__ValueAssignment_3_1 ) ) )
            // InternalDTO.g:1870:1: ( ( rule__Constant__ValueAssignment_3_1 ) )
            {
            // InternalDTO.g:1870:1: ( ( rule__Constant__ValueAssignment_3_1 ) )
            // InternalDTO.g:1871:2: ( rule__Constant__ValueAssignment_3_1 )
            {
             before(grammarAccess.getConstantAccess().getValueAssignment_3_1()); 
            // InternalDTO.g:1872:2: ( rule__Constant__ValueAssignment_3_1 )
            // InternalDTO.g:1872:3: rule__Constant__ValueAssignment_3_1
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
    // InternalDTO.g:1881:1: rule__Constant__Group_4__0 : rule__Constant__Group_4__0__Impl rule__Constant__Group_4__1 ;
    public final void rule__Constant__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1885:1: ( rule__Constant__Group_4__0__Impl rule__Constant__Group_4__1 )
            // InternalDTO.g:1886:2: rule__Constant__Group_4__0__Impl rule__Constant__Group_4__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalDTO.g:1893:1: rule__Constant__Group_4__0__Impl : ( () ) ;
    public final void rule__Constant__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1897:1: ( ( () ) )
            // InternalDTO.g:1898:1: ( () )
            {
            // InternalDTO.g:1898:1: ( () )
            // InternalDTO.g:1899:2: ()
            {
             before(grammarAccess.getConstantAccess().getDateConstantAction_4_0()); 
            // InternalDTO.g:1900:2: ()
            // InternalDTO.g:1900:3: 
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
    // InternalDTO.g:1908:1: rule__Constant__Group_4__1 : rule__Constant__Group_4__1__Impl rule__Constant__Group_4__2 ;
    public final void rule__Constant__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1912:1: ( rule__Constant__Group_4__1__Impl rule__Constant__Group_4__2 )
            // InternalDTO.g:1913:2: rule__Constant__Group_4__1__Impl rule__Constant__Group_4__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalDTO.g:1920:1: rule__Constant__Group_4__1__Impl : ( ( rule__Constant__DayAssignment_4_1 ) ) ;
    public final void rule__Constant__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1924:1: ( ( ( rule__Constant__DayAssignment_4_1 ) ) )
            // InternalDTO.g:1925:1: ( ( rule__Constant__DayAssignment_4_1 ) )
            {
            // InternalDTO.g:1925:1: ( ( rule__Constant__DayAssignment_4_1 ) )
            // InternalDTO.g:1926:2: ( rule__Constant__DayAssignment_4_1 )
            {
             before(grammarAccess.getConstantAccess().getDayAssignment_4_1()); 
            // InternalDTO.g:1927:2: ( rule__Constant__DayAssignment_4_1 )
            // InternalDTO.g:1927:3: rule__Constant__DayAssignment_4_1
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
    // InternalDTO.g:1935:1: rule__Constant__Group_4__2 : rule__Constant__Group_4__2__Impl rule__Constant__Group_4__3 ;
    public final void rule__Constant__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1939:1: ( rule__Constant__Group_4__2__Impl rule__Constant__Group_4__3 )
            // InternalDTO.g:1940:2: rule__Constant__Group_4__2__Impl rule__Constant__Group_4__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalDTO.g:1947:1: rule__Constant__Group_4__2__Impl : ( '/' ) ;
    public final void rule__Constant__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1951:1: ( ( '/' ) )
            // InternalDTO.g:1952:1: ( '/' )
            {
            // InternalDTO.g:1952:1: ( '/' )
            // InternalDTO.g:1953:2: '/'
            {
             before(grammarAccess.getConstantAccess().getSolidusKeyword_4_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalDTO.g:1962:1: rule__Constant__Group_4__3 : rule__Constant__Group_4__3__Impl rule__Constant__Group_4__4 ;
    public final void rule__Constant__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1966:1: ( rule__Constant__Group_4__3__Impl rule__Constant__Group_4__4 )
            // InternalDTO.g:1967:2: rule__Constant__Group_4__3__Impl rule__Constant__Group_4__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalDTO.g:1974:1: rule__Constant__Group_4__3__Impl : ( ( rule__Constant__MonthAssignment_4_3 ) ) ;
    public final void rule__Constant__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1978:1: ( ( ( rule__Constant__MonthAssignment_4_3 ) ) )
            // InternalDTO.g:1979:1: ( ( rule__Constant__MonthAssignment_4_3 ) )
            {
            // InternalDTO.g:1979:1: ( ( rule__Constant__MonthAssignment_4_3 ) )
            // InternalDTO.g:1980:2: ( rule__Constant__MonthAssignment_4_3 )
            {
             before(grammarAccess.getConstantAccess().getMonthAssignment_4_3()); 
            // InternalDTO.g:1981:2: ( rule__Constant__MonthAssignment_4_3 )
            // InternalDTO.g:1981:3: rule__Constant__MonthAssignment_4_3
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
    // InternalDTO.g:1989:1: rule__Constant__Group_4__4 : rule__Constant__Group_4__4__Impl rule__Constant__Group_4__5 ;
    public final void rule__Constant__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1993:1: ( rule__Constant__Group_4__4__Impl rule__Constant__Group_4__5 )
            // InternalDTO.g:1994:2: rule__Constant__Group_4__4__Impl rule__Constant__Group_4__5
            {
            pushFollow(FOLLOW_21);
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
    // InternalDTO.g:2001:1: rule__Constant__Group_4__4__Impl : ( '/' ) ;
    public final void rule__Constant__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2005:1: ( ( '/' ) )
            // InternalDTO.g:2006:1: ( '/' )
            {
            // InternalDTO.g:2006:1: ( '/' )
            // InternalDTO.g:2007:2: '/'
            {
             before(grammarAccess.getConstantAccess().getSolidusKeyword_4_4()); 
            match(input,31,FOLLOW_2); 
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
    // InternalDTO.g:2016:1: rule__Constant__Group_4__5 : rule__Constant__Group_4__5__Impl ;
    public final void rule__Constant__Group_4__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2020:1: ( rule__Constant__Group_4__5__Impl )
            // InternalDTO.g:2021:2: rule__Constant__Group_4__5__Impl
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
    // InternalDTO.g:2027:1: rule__Constant__Group_4__5__Impl : ( ( rule__Constant__YearAssignment_4_5 ) ) ;
    public final void rule__Constant__Group_4__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2031:1: ( ( ( rule__Constant__YearAssignment_4_5 ) ) )
            // InternalDTO.g:2032:1: ( ( rule__Constant__YearAssignment_4_5 ) )
            {
            // InternalDTO.g:2032:1: ( ( rule__Constant__YearAssignment_4_5 ) )
            // InternalDTO.g:2033:2: ( rule__Constant__YearAssignment_4_5 )
            {
             before(grammarAccess.getConstantAccess().getYearAssignment_4_5()); 
            // InternalDTO.g:2034:2: ( rule__Constant__YearAssignment_4_5 )
            // InternalDTO.g:2034:3: rule__Constant__YearAssignment_4_5
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
    // InternalDTO.g:2043:1: rule__Constant__Group_5__0 : rule__Constant__Group_5__0__Impl rule__Constant__Group_5__1 ;
    public final void rule__Constant__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2047:1: ( rule__Constant__Group_5__0__Impl rule__Constant__Group_5__1 )
            // InternalDTO.g:2048:2: rule__Constant__Group_5__0__Impl rule__Constant__Group_5__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalDTO.g:2055:1: rule__Constant__Group_5__0__Impl : ( () ) ;
    public final void rule__Constant__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2059:1: ( ( () ) )
            // InternalDTO.g:2060:1: ( () )
            {
            // InternalDTO.g:2060:1: ( () )
            // InternalDTO.g:2061:2: ()
            {
             before(grammarAccess.getConstantAccess().getNullAction_5_0()); 
            // InternalDTO.g:2062:2: ()
            // InternalDTO.g:2062:3: 
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
    // InternalDTO.g:2070:1: rule__Constant__Group_5__1 : rule__Constant__Group_5__1__Impl ;
    public final void rule__Constant__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2074:1: ( rule__Constant__Group_5__1__Impl )
            // InternalDTO.g:2075:2: rule__Constant__Group_5__1__Impl
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
    // InternalDTO.g:2081:1: rule__Constant__Group_5__1__Impl : ( 'null' ) ;
    public final void rule__Constant__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2085:1: ( ( 'null' ) )
            // InternalDTO.g:2086:1: ( 'null' )
            {
            // InternalDTO.g:2086:1: ( 'null' )
            // InternalDTO.g:2087:2: 'null'
            {
             before(grammarAccess.getConstantAccess().getNullKeyword_5_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalDTO.g:2097:1: rule__EntityOption__Group_0__0 : rule__EntityOption__Group_0__0__Impl rule__EntityOption__Group_0__1 ;
    public final void rule__EntityOption__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2101:1: ( rule__EntityOption__Group_0__0__Impl rule__EntityOption__Group_0__1 )
            // InternalDTO.g:2102:2: rule__EntityOption__Group_0__0__Impl rule__EntityOption__Group_0__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalDTO.g:2109:1: rule__EntityOption__Group_0__0__Impl : ( () ) ;
    public final void rule__EntityOption__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2113:1: ( ( () ) )
            // InternalDTO.g:2114:1: ( () )
            {
            // InternalDTO.g:2114:1: ( () )
            // InternalDTO.g:2115:2: ()
            {
             before(grammarAccess.getEntityOptionAccess().getEntityDeleteOptionAction_0_0()); 
            // InternalDTO.g:2116:2: ()
            // InternalDTO.g:2116:3: 
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
    // InternalDTO.g:2124:1: rule__EntityOption__Group_0__1 : rule__EntityOption__Group_0__1__Impl ;
    public final void rule__EntityOption__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2128:1: ( rule__EntityOption__Group_0__1__Impl )
            // InternalDTO.g:2129:2: rule__EntityOption__Group_0__1__Impl
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
    // InternalDTO.g:2135:1: rule__EntityOption__Group_0__1__Impl : ( ( rule__EntityOption__DeleteByFlagAssignment_0_1 ) ) ;
    public final void rule__EntityOption__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2139:1: ( ( ( rule__EntityOption__DeleteByFlagAssignment_0_1 ) ) )
            // InternalDTO.g:2140:1: ( ( rule__EntityOption__DeleteByFlagAssignment_0_1 ) )
            {
            // InternalDTO.g:2140:1: ( ( rule__EntityOption__DeleteByFlagAssignment_0_1 ) )
            // InternalDTO.g:2141:2: ( rule__EntityOption__DeleteByFlagAssignment_0_1 )
            {
             before(grammarAccess.getEntityOptionAccess().getDeleteByFlagAssignment_0_1()); 
            // InternalDTO.g:2142:2: ( rule__EntityOption__DeleteByFlagAssignment_0_1 )
            // InternalDTO.g:2142:3: rule__EntityOption__DeleteByFlagAssignment_0_1
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
    // InternalDTO.g:2151:1: rule__EntityOption__Group_1__0 : rule__EntityOption__Group_1__0__Impl rule__EntityOption__Group_1__1 ;
    public final void rule__EntityOption__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2155:1: ( rule__EntityOption__Group_1__0__Impl rule__EntityOption__Group_1__1 )
            // InternalDTO.g:2156:2: rule__EntityOption__Group_1__0__Impl rule__EntityOption__Group_1__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalDTO.g:2163:1: rule__EntityOption__Group_1__0__Impl : ( () ) ;
    public final void rule__EntityOption__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2167:1: ( ( () ) )
            // InternalDTO.g:2168:1: ( () )
            {
            // InternalDTO.g:2168:1: ( () )
            // InternalDTO.g:2169:2: ()
            {
             before(grammarAccess.getEntityOptionAccess().getInheritanceMappingOptionAction_1_0()); 
            // InternalDTO.g:2170:2: ()
            // InternalDTO.g:2170:3: 
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
    // InternalDTO.g:2178:1: rule__EntityOption__Group_1__1 : rule__EntityOption__Group_1__1__Impl rule__EntityOption__Group_1__2 ;
    public final void rule__EntityOption__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2182:1: ( rule__EntityOption__Group_1__1__Impl rule__EntityOption__Group_1__2 )
            // InternalDTO.g:2183:2: rule__EntityOption__Group_1__1__Impl rule__EntityOption__Group_1__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalDTO.g:2190:1: rule__EntityOption__Group_1__1__Impl : ( 'inheritance' ) ;
    public final void rule__EntityOption__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2194:1: ( ( 'inheritance' ) )
            // InternalDTO.g:2195:1: ( 'inheritance' )
            {
            // InternalDTO.g:2195:1: ( 'inheritance' )
            // InternalDTO.g:2196:2: 'inheritance'
            {
             before(grammarAccess.getEntityOptionAccess().getInheritanceKeyword_1_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalDTO.g:2205:1: rule__EntityOption__Group_1__2 : rule__EntityOption__Group_1__2__Impl rule__EntityOption__Group_1__3 ;
    public final void rule__EntityOption__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2209:1: ( rule__EntityOption__Group_1__2__Impl rule__EntityOption__Group_1__3 )
            // InternalDTO.g:2210:2: rule__EntityOption__Group_1__2__Impl rule__EntityOption__Group_1__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalDTO.g:2217:1: rule__EntityOption__Group_1__2__Impl : ( '=' ) ;
    public final void rule__EntityOption__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2221:1: ( ( '=' ) )
            // InternalDTO.g:2222:1: ( '=' )
            {
            // InternalDTO.g:2222:1: ( '=' )
            // InternalDTO.g:2223:2: '='
            {
             before(grammarAccess.getEntityOptionAccess().getEqualsSignKeyword_1_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalDTO.g:2232:1: rule__EntityOption__Group_1__3 : rule__EntityOption__Group_1__3__Impl ;
    public final void rule__EntityOption__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2236:1: ( rule__EntityOption__Group_1__3__Impl )
            // InternalDTO.g:2237:2: rule__EntityOption__Group_1__3__Impl
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
    // InternalDTO.g:2243:1: rule__EntityOption__Group_1__3__Impl : ( ( rule__EntityOption__InheritanceMappingAssignment_1_3 ) ) ;
    public final void rule__EntityOption__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2247:1: ( ( ( rule__EntityOption__InheritanceMappingAssignment_1_3 ) ) )
            // InternalDTO.g:2248:1: ( ( rule__EntityOption__InheritanceMappingAssignment_1_3 ) )
            {
            // InternalDTO.g:2248:1: ( ( rule__EntityOption__InheritanceMappingAssignment_1_3 ) )
            // InternalDTO.g:2249:2: ( rule__EntityOption__InheritanceMappingAssignment_1_3 )
            {
             before(grammarAccess.getEntityOptionAccess().getInheritanceMappingAssignment_1_3()); 
            // InternalDTO.g:2250:2: ( rule__EntityOption__InheritanceMappingAssignment_1_3 )
            // InternalDTO.g:2250:3: rule__EntityOption__InheritanceMappingAssignment_1_3
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
    // InternalDTO.g:2259:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2263:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalDTO.g:2264:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalDTO.g:2271:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__TypeAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2275:1: ( ( ( rule__Attribute__TypeAssignment_0 ) ) )
            // InternalDTO.g:2276:1: ( ( rule__Attribute__TypeAssignment_0 ) )
            {
            // InternalDTO.g:2276:1: ( ( rule__Attribute__TypeAssignment_0 ) )
            // InternalDTO.g:2277:2: ( rule__Attribute__TypeAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_0()); 
            // InternalDTO.g:2278:2: ( rule__Attribute__TypeAssignment_0 )
            // InternalDTO.g:2278:3: rule__Attribute__TypeAssignment_0
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
    // InternalDTO.g:2286:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2290:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalDTO.g:2291:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalDTO.g:2298:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2302:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalDTO.g:2303:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalDTO.g:2303:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalDTO.g:2304:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalDTO.g:2305:2: ( rule__Attribute__NameAssignment_1 )
            // InternalDTO.g:2305:3: rule__Attribute__NameAssignment_1
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
    // InternalDTO.g:2313:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2317:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalDTO.g:2318:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalDTO.g:2325:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__Group_2__0 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2329:1: ( ( ( rule__Attribute__Group_2__0 )? ) )
            // InternalDTO.g:2330:1: ( ( rule__Attribute__Group_2__0 )? )
            {
            // InternalDTO.g:2330:1: ( ( rule__Attribute__Group_2__0 )? )
            // InternalDTO.g:2331:2: ( rule__Attribute__Group_2__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_2()); 
            // InternalDTO.g:2332:2: ( rule__Attribute__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==20) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDTO.g:2332:3: rule__Attribute__Group_2__0
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
    // InternalDTO.g:2340:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2344:1: ( rule__Attribute__Group__3__Impl )
            // InternalDTO.g:2345:2: rule__Attribute__Group__3__Impl
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
    // InternalDTO.g:2351:1: rule__Attribute__Group__3__Impl : ( ';' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2355:1: ( ( ';' ) )
            // InternalDTO.g:2356:1: ( ';' )
            {
            // InternalDTO.g:2356:1: ( ';' )
            // InternalDTO.g:2357:2: ';'
            {
             before(grammarAccess.getAttributeAccess().getSemicolonKeyword_3()); 
            match(input,35,FOLLOW_2); 
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
    // InternalDTO.g:2367:1: rule__Attribute__Group_2__0 : rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1 ;
    public final void rule__Attribute__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2371:1: ( rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1 )
            // InternalDTO.g:2372:2: rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalDTO.g:2379:1: rule__Attribute__Group_2__0__Impl : ( ( rule__Attribute__OptionsAssignment_2_0 ) ) ;
    public final void rule__Attribute__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2383:1: ( ( ( rule__Attribute__OptionsAssignment_2_0 ) ) )
            // InternalDTO.g:2384:1: ( ( rule__Attribute__OptionsAssignment_2_0 ) )
            {
            // InternalDTO.g:2384:1: ( ( rule__Attribute__OptionsAssignment_2_0 ) )
            // InternalDTO.g:2385:2: ( rule__Attribute__OptionsAssignment_2_0 )
            {
             before(grammarAccess.getAttributeAccess().getOptionsAssignment_2_0()); 
            // InternalDTO.g:2386:2: ( rule__Attribute__OptionsAssignment_2_0 )
            // InternalDTO.g:2386:3: rule__Attribute__OptionsAssignment_2_0
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
    // InternalDTO.g:2394:1: rule__Attribute__Group_2__1 : rule__Attribute__Group_2__1__Impl ;
    public final void rule__Attribute__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2398:1: ( rule__Attribute__Group_2__1__Impl )
            // InternalDTO.g:2399:2: rule__Attribute__Group_2__1__Impl
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
    // InternalDTO.g:2405:1: rule__Attribute__Group_2__1__Impl : ( ( rule__Attribute__Group_2_1__0 )* ) ;
    public final void rule__Attribute__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2409:1: ( ( ( rule__Attribute__Group_2_1__0 )* ) )
            // InternalDTO.g:2410:1: ( ( rule__Attribute__Group_2_1__0 )* )
            {
            // InternalDTO.g:2410:1: ( ( rule__Attribute__Group_2_1__0 )* )
            // InternalDTO.g:2411:2: ( rule__Attribute__Group_2_1__0 )*
            {
             before(grammarAccess.getAttributeAccess().getGroup_2_1()); 
            // InternalDTO.g:2412:2: ( rule__Attribute__Group_2_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==29) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDTO.g:2412:3: rule__Attribute__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Attribute__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalDTO.g:2421:1: rule__Attribute__Group_2_1__0 : rule__Attribute__Group_2_1__0__Impl rule__Attribute__Group_2_1__1 ;
    public final void rule__Attribute__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2425:1: ( rule__Attribute__Group_2_1__0__Impl rule__Attribute__Group_2_1__1 )
            // InternalDTO.g:2426:2: rule__Attribute__Group_2_1__0__Impl rule__Attribute__Group_2_1__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalDTO.g:2433:1: rule__Attribute__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Attribute__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2437:1: ( ( ',' ) )
            // InternalDTO.g:2438:1: ( ',' )
            {
            // InternalDTO.g:2438:1: ( ',' )
            // InternalDTO.g:2439:2: ','
            {
             before(grammarAccess.getAttributeAccess().getCommaKeyword_2_1_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalDTO.g:2448:1: rule__Attribute__Group_2_1__1 : rule__Attribute__Group_2_1__1__Impl ;
    public final void rule__Attribute__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2452:1: ( rule__Attribute__Group_2_1__1__Impl )
            // InternalDTO.g:2453:2: rule__Attribute__Group_2_1__1__Impl
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
    // InternalDTO.g:2459:1: rule__Attribute__Group_2_1__1__Impl : ( ( rule__Attribute__OptionsAssignment_2_1_1 ) ) ;
    public final void rule__Attribute__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2463:1: ( ( ( rule__Attribute__OptionsAssignment_2_1_1 ) ) )
            // InternalDTO.g:2464:1: ( ( rule__Attribute__OptionsAssignment_2_1_1 ) )
            {
            // InternalDTO.g:2464:1: ( ( rule__Attribute__OptionsAssignment_2_1_1 ) )
            // InternalDTO.g:2465:2: ( rule__Attribute__OptionsAssignment_2_1_1 )
            {
             before(grammarAccess.getAttributeAccess().getOptionsAssignment_2_1_1()); 
            // InternalDTO.g:2466:2: ( rule__Attribute__OptionsAssignment_2_1_1 )
            // InternalDTO.g:2466:3: rule__Attribute__OptionsAssignment_2_1_1
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
    // InternalDTO.g:2475:1: superBasicType__Group_0__0 : superBasicType__Group_0__0__Impl superBasicType__Group_0__1 ;
    public final void superBasicType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2479:1: ( superBasicType__Group_0__0__Impl superBasicType__Group_0__1 )
            // InternalDTO.g:2480:2: superBasicType__Group_0__0__Impl superBasicType__Group_0__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalDTO.g:2487:1: superBasicType__Group_0__0__Impl : ( () ) ;
    public final void superBasicType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2491:1: ( ( () ) )
            // InternalDTO.g:2492:1: ( () )
            {
            // InternalDTO.g:2492:1: ( () )
            // InternalDTO.g:2493:2: ()
            {
             before(grammarAccess.getDomainModelBasicTypeAccess().getStringTypeAction_0_0()); 
            // InternalDTO.g:2494:2: ()
            // InternalDTO.g:2494:3: 
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
    // InternalDTO.g:2502:1: superBasicType__Group_0__1 : superBasicType__Group_0__1__Impl ;
    public final void superBasicType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2506:1: ( superBasicType__Group_0__1__Impl )
            // InternalDTO.g:2507:2: superBasicType__Group_0__1__Impl
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
    // InternalDTO.g:2513:1: superBasicType__Group_0__1__Impl : ( 'string' ) ;
    public final void superBasicType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2517:1: ( ( 'string' ) )
            // InternalDTO.g:2518:1: ( 'string' )
            {
            // InternalDTO.g:2518:1: ( 'string' )
            // InternalDTO.g:2519:2: 'string'
            {
             before(grammarAccess.getDomainModelBasicTypeAccess().getStringKeyword_0_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalDTO.g:2529:1: superBasicType__Group_1__0 : superBasicType__Group_1__0__Impl superBasicType__Group_1__1 ;
    public final void superBasicType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2533:1: ( superBasicType__Group_1__0__Impl superBasicType__Group_1__1 )
            // InternalDTO.g:2534:2: superBasicType__Group_1__0__Impl superBasicType__Group_1__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalDTO.g:2541:1: superBasicType__Group_1__0__Impl : ( () ) ;
    public final void superBasicType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2545:1: ( ( () ) )
            // InternalDTO.g:2546:1: ( () )
            {
            // InternalDTO.g:2546:1: ( () )
            // InternalDTO.g:2547:2: ()
            {
             before(grammarAccess.getDomainModelBasicTypeAccess().getIntTypeAction_1_0()); 
            // InternalDTO.g:2548:2: ()
            // InternalDTO.g:2548:3: 
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
    // InternalDTO.g:2556:1: superBasicType__Group_1__1 : superBasicType__Group_1__1__Impl ;
    public final void superBasicType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2560:1: ( superBasicType__Group_1__1__Impl )
            // InternalDTO.g:2561:2: superBasicType__Group_1__1__Impl
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
    // InternalDTO.g:2567:1: superBasicType__Group_1__1__Impl : ( 'int' ) ;
    public final void superBasicType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2571:1: ( ( 'int' ) )
            // InternalDTO.g:2572:1: ( 'int' )
            {
            // InternalDTO.g:2572:1: ( 'int' )
            // InternalDTO.g:2573:2: 'int'
            {
             before(grammarAccess.getDomainModelBasicTypeAccess().getIntKeyword_1_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalDTO.g:2583:1: superBasicType__Group_2__0 : superBasicType__Group_2__0__Impl superBasicType__Group_2__1 ;
    public final void superBasicType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2587:1: ( superBasicType__Group_2__0__Impl superBasicType__Group_2__1 )
            // InternalDTO.g:2588:2: superBasicType__Group_2__0__Impl superBasicType__Group_2__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalDTO.g:2595:1: superBasicType__Group_2__0__Impl : ( () ) ;
    public final void superBasicType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2599:1: ( ( () ) )
            // InternalDTO.g:2600:1: ( () )
            {
            // InternalDTO.g:2600:1: ( () )
            // InternalDTO.g:2601:2: ()
            {
             before(grammarAccess.getDomainModelBasicTypeAccess().getLongTypeAction_2_0()); 
            // InternalDTO.g:2602:2: ()
            // InternalDTO.g:2602:3: 
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
    // InternalDTO.g:2610:1: superBasicType__Group_2__1 : superBasicType__Group_2__1__Impl ;
    public final void superBasicType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2614:1: ( superBasicType__Group_2__1__Impl )
            // InternalDTO.g:2615:2: superBasicType__Group_2__1__Impl
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
    // InternalDTO.g:2621:1: superBasicType__Group_2__1__Impl : ( 'long' ) ;
    public final void superBasicType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2625:1: ( ( 'long' ) )
            // InternalDTO.g:2626:1: ( 'long' )
            {
            // InternalDTO.g:2626:1: ( 'long' )
            // InternalDTO.g:2627:2: 'long'
            {
             before(grammarAccess.getDomainModelBasicTypeAccess().getLongKeyword_2_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalDTO.g:2637:1: superBasicType__Group_3__0 : superBasicType__Group_3__0__Impl superBasicType__Group_3__1 ;
    public final void superBasicType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2641:1: ( superBasicType__Group_3__0__Impl superBasicType__Group_3__1 )
            // InternalDTO.g:2642:2: superBasicType__Group_3__0__Impl superBasicType__Group_3__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalDTO.g:2649:1: superBasicType__Group_3__0__Impl : ( () ) ;
    public final void superBasicType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2653:1: ( ( () ) )
            // InternalDTO.g:2654:1: ( () )
            {
            // InternalDTO.g:2654:1: ( () )
            // InternalDTO.g:2655:2: ()
            {
             before(grammarAccess.getDomainModelBasicTypeAccess().getBoolTypeAction_3_0()); 
            // InternalDTO.g:2656:2: ()
            // InternalDTO.g:2656:3: 
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
    // InternalDTO.g:2664:1: superBasicType__Group_3__1 : superBasicType__Group_3__1__Impl ;
    public final void superBasicType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2668:1: ( superBasicType__Group_3__1__Impl )
            // InternalDTO.g:2669:2: superBasicType__Group_3__1__Impl
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
    // InternalDTO.g:2675:1: superBasicType__Group_3__1__Impl : ( 'boolean' ) ;
    public final void superBasicType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2679:1: ( ( 'boolean' ) )
            // InternalDTO.g:2680:1: ( 'boolean' )
            {
            // InternalDTO.g:2680:1: ( 'boolean' )
            // InternalDTO.g:2681:2: 'boolean'
            {
             before(grammarAccess.getDomainModelBasicTypeAccess().getBooleanKeyword_3_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalDTO.g:2691:1: superBasicType__Group_4__0 : superBasicType__Group_4__0__Impl superBasicType__Group_4__1 ;
    public final void superBasicType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2695:1: ( superBasicType__Group_4__0__Impl superBasicType__Group_4__1 )
            // InternalDTO.g:2696:2: superBasicType__Group_4__0__Impl superBasicType__Group_4__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalDTO.g:2703:1: superBasicType__Group_4__0__Impl : ( () ) ;
    public final void superBasicType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2707:1: ( ( () ) )
            // InternalDTO.g:2708:1: ( () )
            {
            // InternalDTO.g:2708:1: ( () )
            // InternalDTO.g:2709:2: ()
            {
             before(grammarAccess.getDomainModelBasicTypeAccess().getDateTypeAction_4_0()); 
            // InternalDTO.g:2710:2: ()
            // InternalDTO.g:2710:3: 
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
    // InternalDTO.g:2718:1: superBasicType__Group_4__1 : superBasicType__Group_4__1__Impl ;
    public final void superBasicType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2722:1: ( superBasicType__Group_4__1__Impl )
            // InternalDTO.g:2723:2: superBasicType__Group_4__1__Impl
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
    // InternalDTO.g:2729:1: superBasicType__Group_4__1__Impl : ( 'date' ) ;
    public final void superBasicType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2733:1: ( ( 'date' ) )
            // InternalDTO.g:2734:1: ( 'date' )
            {
            // InternalDTO.g:2734:1: ( 'date' )
            // InternalDTO.g:2735:2: 'date'
            {
             before(grammarAccess.getDomainModelBasicTypeAccess().getDateKeyword_4_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalDTO.g:2745:1: rule__CollectionType__Group__0 : rule__CollectionType__Group__0__Impl rule__CollectionType__Group__1 ;
    public final void rule__CollectionType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2749:1: ( rule__CollectionType__Group__0__Impl rule__CollectionType__Group__1 )
            // InternalDTO.g:2750:2: rule__CollectionType__Group__0__Impl rule__CollectionType__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalDTO.g:2757:1: rule__CollectionType__Group__0__Impl : ( 'List' ) ;
    public final void rule__CollectionType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2761:1: ( ( 'List' ) )
            // InternalDTO.g:2762:1: ( 'List' )
            {
            // InternalDTO.g:2762:1: ( 'List' )
            // InternalDTO.g:2763:2: 'List'
            {
             before(grammarAccess.getCollectionTypeAccess().getListKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalDTO.g:2772:1: rule__CollectionType__Group__1 : rule__CollectionType__Group__1__Impl rule__CollectionType__Group__2 ;
    public final void rule__CollectionType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2776:1: ( rule__CollectionType__Group__1__Impl rule__CollectionType__Group__2 )
            // InternalDTO.g:2777:2: rule__CollectionType__Group__1__Impl rule__CollectionType__Group__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalDTO.g:2784:1: rule__CollectionType__Group__1__Impl : ( '<' ) ;
    public final void rule__CollectionType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2788:1: ( ( '<' ) )
            // InternalDTO.g:2789:1: ( '<' )
            {
            // InternalDTO.g:2789:1: ( '<' )
            // InternalDTO.g:2790:2: '<'
            {
             before(grammarAccess.getCollectionTypeAccess().getLessThanSignKeyword_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalDTO.g:2799:1: rule__CollectionType__Group__2 : rule__CollectionType__Group__2__Impl rule__CollectionType__Group__3 ;
    public final void rule__CollectionType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2803:1: ( rule__CollectionType__Group__2__Impl rule__CollectionType__Group__3 )
            // InternalDTO.g:2804:2: rule__CollectionType__Group__2__Impl rule__CollectionType__Group__3
            {
            pushFollow(FOLLOW_39);
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
    // InternalDTO.g:2811:1: rule__CollectionType__Group__2__Impl : ( ( rule__CollectionType__OfTypeAssignment_2 ) ) ;
    public final void rule__CollectionType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2815:1: ( ( ( rule__CollectionType__OfTypeAssignment_2 ) ) )
            // InternalDTO.g:2816:1: ( ( rule__CollectionType__OfTypeAssignment_2 ) )
            {
            // InternalDTO.g:2816:1: ( ( rule__CollectionType__OfTypeAssignment_2 ) )
            // InternalDTO.g:2817:2: ( rule__CollectionType__OfTypeAssignment_2 )
            {
             before(grammarAccess.getCollectionTypeAccess().getOfTypeAssignment_2()); 
            // InternalDTO.g:2818:2: ( rule__CollectionType__OfTypeAssignment_2 )
            // InternalDTO.g:2818:3: rule__CollectionType__OfTypeAssignment_2
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
    // InternalDTO.g:2826:1: rule__CollectionType__Group__3 : rule__CollectionType__Group__3__Impl ;
    public final void rule__CollectionType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2830:1: ( rule__CollectionType__Group__3__Impl )
            // InternalDTO.g:2831:2: rule__CollectionType__Group__3__Impl
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
    // InternalDTO.g:2837:1: rule__CollectionType__Group__3__Impl : ( '>' ) ;
    public final void rule__CollectionType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2841:1: ( ( '>' ) )
            // InternalDTO.g:2842:1: ( '>' )
            {
            // InternalDTO.g:2842:1: ( '>' )
            // InternalDTO.g:2843:2: '>'
            {
             before(grammarAccess.getCollectionTypeAccess().getGreaterThanSignKeyword_3()); 
            match(input,43,FOLLOW_2); 
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


    // $ANTLR start "rule__DTOModel__ConceptsAssignment"
    // InternalDTO.g:2853:1: rule__DTOModel__ConceptsAssignment : ( ruleConcept ) ;
    public final void rule__DTOModel__ConceptsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2857:1: ( ( ruleConcept ) )
            // InternalDTO.g:2858:2: ( ruleConcept )
            {
            // InternalDTO.g:2858:2: ( ruleConcept )
            // InternalDTO.g:2859:3: ruleConcept
            {
             before(grammarAccess.getDTOModelAccess().getConceptsConceptParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleConcept();

            state._fsp--;

             after(grammarAccess.getDTOModelAccess().getConceptsConceptParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DTOModel__ConceptsAssignment"


    // $ANTLR start "rule__DTOClass__NameAssignment_1"
    // InternalDTO.g:2868:1: rule__DTOClass__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DTOClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2872:1: ( ( RULE_ID ) )
            // InternalDTO.g:2873:2: ( RULE_ID )
            {
            // InternalDTO.g:2873:2: ( RULE_ID )
            // InternalDTO.g:2874:3: RULE_ID
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
    // InternalDTO.g:2883:1: rule__DTOClass__SuperTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__DTOClass__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2887:1: ( ( ( RULE_ID ) ) )
            // InternalDTO.g:2888:2: ( ( RULE_ID ) )
            {
            // InternalDTO.g:2888:2: ( ( RULE_ID ) )
            // InternalDTO.g:2889:3: ( RULE_ID )
            {
             before(grammarAccess.getDTOClassAccess().getSuperTypeDTOClassCrossReference_2_1_0()); 
            // InternalDTO.g:2890:3: ( RULE_ID )
            // InternalDTO.g:2891:4: RULE_ID
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
    // InternalDTO.g:2902:1: rule__DTOClass__AttributesAssignment_4 : ( ruleAttribute ) ;
    public final void rule__DTOClass__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2906:1: ( ( ruleAttribute ) )
            // InternalDTO.g:2907:2: ( ruleAttribute )
            {
            // InternalDTO.g:2907:2: ( ruleAttribute )
            // InternalDTO.g:2908:3: ruleAttribute
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
    // InternalDTO.g:2917:1: rule__Enum__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Enum__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2921:1: ( ( RULE_ID ) )
            // InternalDTO.g:2922:2: ( RULE_ID )
            {
            // InternalDTO.g:2922:2: ( RULE_ID )
            // InternalDTO.g:2923:3: RULE_ID
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
    // InternalDTO.g:2932:1: rule__Enum__AttributesAssignment_3 : ( ruleAttribute ) ;
    public final void rule__Enum__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2936:1: ( ( ruleAttribute ) )
            // InternalDTO.g:2937:2: ( ruleAttribute )
            {
            // InternalDTO.g:2937:2: ( ruleAttribute )
            // InternalDTO.g:2938:3: ruleAttribute
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
    // InternalDTO.g:2947:1: rule__Enum__LiteralsAssignment_4 : ( ruleEnumLiteral ) ;
    public final void rule__Enum__LiteralsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2951:1: ( ( ruleEnumLiteral ) )
            // InternalDTO.g:2952:2: ( ruleEnumLiteral )
            {
            // InternalDTO.g:2952:2: ( ruleEnumLiteral )
            // InternalDTO.g:2953:3: ruleEnumLiteral
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
    // InternalDTO.g:2962:1: rule__EnumLiteral__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumLiteral__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2966:1: ( ( RULE_ID ) )
            // InternalDTO.g:2967:2: ( RULE_ID )
            {
            // InternalDTO.g:2967:2: ( RULE_ID )
            // InternalDTO.g:2968:3: RULE_ID
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
    // InternalDTO.g:2977:1: rule__EnumLiteral__ParamsAssignment_1_1 : ( ruleConstant ) ;
    public final void rule__EnumLiteral__ParamsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2981:1: ( ( ruleConstant ) )
            // InternalDTO.g:2982:2: ( ruleConstant )
            {
            // InternalDTO.g:2982:2: ( ruleConstant )
            // InternalDTO.g:2983:3: ruleConstant
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
    // InternalDTO.g:2992:1: rule__EnumLiteral__ParamsAssignment_1_2_1 : ( ruleConstant ) ;
    public final void rule__EnumLiteral__ParamsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2996:1: ( ( ruleConstant ) )
            // InternalDTO.g:2997:2: ( ruleConstant )
            {
            // InternalDTO.g:2997:2: ( ruleConstant )
            // InternalDTO.g:2998:3: ruleConstant
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
    // InternalDTO.g:3007:1: rule__Constant__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Constant__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3011:1: ( ( RULE_INT ) )
            // InternalDTO.g:3012:2: ( RULE_INT )
            {
            // InternalDTO.g:3012:2: ( RULE_INT )
            // InternalDTO.g:3013:3: RULE_INT
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
    // InternalDTO.g:3022:1: rule__Constant__ValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Constant__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3026:1: ( ( RULE_INT ) )
            // InternalDTO.g:3027:2: ( RULE_INT )
            {
            // InternalDTO.g:3027:2: ( RULE_INT )
            // InternalDTO.g:3028:3: RULE_INT
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
    // InternalDTO.g:3037:1: rule__Constant__ValueAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Constant__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3041:1: ( ( RULE_STRING ) )
            // InternalDTO.g:3042:2: ( RULE_STRING )
            {
            // InternalDTO.g:3042:2: ( RULE_STRING )
            // InternalDTO.g:3043:3: RULE_STRING
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
    // InternalDTO.g:3052:1: rule__Constant__ValueAssignment_3_1 : ( ( rule__Constant__ValueAlternatives_3_1_0 ) ) ;
    public final void rule__Constant__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3056:1: ( ( ( rule__Constant__ValueAlternatives_3_1_0 ) ) )
            // InternalDTO.g:3057:2: ( ( rule__Constant__ValueAlternatives_3_1_0 ) )
            {
            // InternalDTO.g:3057:2: ( ( rule__Constant__ValueAlternatives_3_1_0 ) )
            // InternalDTO.g:3058:3: ( rule__Constant__ValueAlternatives_3_1_0 )
            {
             before(grammarAccess.getConstantAccess().getValueAlternatives_3_1_0()); 
            // InternalDTO.g:3059:3: ( rule__Constant__ValueAlternatives_3_1_0 )
            // InternalDTO.g:3059:4: rule__Constant__ValueAlternatives_3_1_0
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
    // InternalDTO.g:3067:1: rule__Constant__DayAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__Constant__DayAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3071:1: ( ( RULE_INT ) )
            // InternalDTO.g:3072:2: ( RULE_INT )
            {
            // InternalDTO.g:3072:2: ( RULE_INT )
            // InternalDTO.g:3073:3: RULE_INT
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
    // InternalDTO.g:3082:1: rule__Constant__MonthAssignment_4_3 : ( RULE_INT ) ;
    public final void rule__Constant__MonthAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3086:1: ( ( RULE_INT ) )
            // InternalDTO.g:3087:2: ( RULE_INT )
            {
            // InternalDTO.g:3087:2: ( RULE_INT )
            // InternalDTO.g:3088:3: RULE_INT
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
    // InternalDTO.g:3097:1: rule__Constant__YearAssignment_4_5 : ( RULE_INT ) ;
    public final void rule__Constant__YearAssignment_4_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3101:1: ( ( RULE_INT ) )
            // InternalDTO.g:3102:2: ( RULE_INT )
            {
            // InternalDTO.g:3102:2: ( RULE_INT )
            // InternalDTO.g:3103:3: RULE_INT
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
    // InternalDTO.g:3112:1: rule__EntityOption__DeleteByFlagAssignment_0_1 : ( ( 'deleteByFlag' ) ) ;
    public final void rule__EntityOption__DeleteByFlagAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3116:1: ( ( ( 'deleteByFlag' ) ) )
            // InternalDTO.g:3117:2: ( ( 'deleteByFlag' ) )
            {
            // InternalDTO.g:3117:2: ( ( 'deleteByFlag' ) )
            // InternalDTO.g:3118:3: ( 'deleteByFlag' )
            {
             before(grammarAccess.getEntityOptionAccess().getDeleteByFlagDeleteByFlagKeyword_0_1_0()); 
            // InternalDTO.g:3119:3: ( 'deleteByFlag' )
            // InternalDTO.g:3120:4: 'deleteByFlag'
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
    // InternalDTO.g:3131:1: rule__EntityOption__InheritanceMappingAssignment_1_3 : ( ruleInheritanceMappingType ) ;
    public final void rule__EntityOption__InheritanceMappingAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3135:1: ( ( ruleInheritanceMappingType ) )
            // InternalDTO.g:3136:2: ( ruleInheritanceMappingType )
            {
            // InternalDTO.g:3136:2: ( ruleInheritanceMappingType )
            // InternalDTO.g:3137:3: ruleInheritanceMappingType
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
    // InternalDTO.g:3146:1: rule__InheritanceMappingType__TypeAssignment : ( ( rule__InheritanceMappingType__TypeAlternatives_0 ) ) ;
    public final void rule__InheritanceMappingType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3150:1: ( ( ( rule__InheritanceMappingType__TypeAlternatives_0 ) ) )
            // InternalDTO.g:3151:2: ( ( rule__InheritanceMappingType__TypeAlternatives_0 ) )
            {
            // InternalDTO.g:3151:2: ( ( rule__InheritanceMappingType__TypeAlternatives_0 ) )
            // InternalDTO.g:3152:3: ( rule__InheritanceMappingType__TypeAlternatives_0 )
            {
             before(grammarAccess.getInheritanceMappingTypeAccess().getTypeAlternatives_0()); 
            // InternalDTO.g:3153:3: ( rule__InheritanceMappingType__TypeAlternatives_0 )
            // InternalDTO.g:3153:4: rule__InheritanceMappingType__TypeAlternatives_0
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
    // InternalDTO.g:3161:1: rule__Attribute__TypeAssignment_0 : ( ruleAttributeType ) ;
    public final void rule__Attribute__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3165:1: ( ( ruleAttributeType ) )
            // InternalDTO.g:3166:2: ( ruleAttributeType )
            {
            // InternalDTO.g:3166:2: ( ruleAttributeType )
            // InternalDTO.g:3167:3: ruleAttributeType
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
    // InternalDTO.g:3176:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3180:1: ( ( RULE_ID ) )
            // InternalDTO.g:3181:2: ( RULE_ID )
            {
            // InternalDTO.g:3181:2: ( RULE_ID )
            // InternalDTO.g:3182:3: RULE_ID
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
    // InternalDTO.g:3191:1: rule__Attribute__OptionsAssignment_2_0 : ( ruleAttributeOption ) ;
    public final void rule__Attribute__OptionsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3195:1: ( ( ruleAttributeOption ) )
            // InternalDTO.g:3196:2: ( ruleAttributeOption )
            {
            // InternalDTO.g:3196:2: ( ruleAttributeOption )
            // InternalDTO.g:3197:3: ruleAttributeOption
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
    // InternalDTO.g:3206:1: rule__Attribute__OptionsAssignment_2_1_1 : ( ruleAttributeOption ) ;
    public final void rule__Attribute__OptionsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3210:1: ( ( ruleAttributeOption ) )
            // InternalDTO.g:3211:2: ( ruleAttributeOption )
            {
            // InternalDTO.g:3211:2: ( ruleAttributeOption )
            // InternalDTO.g:3212:3: ruleAttributeOption
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
    // InternalDTO.g:3221:1: rule__RefType__ReferenceAssignment : ( ( RULE_ID ) ) ;
    public final void rule__RefType__ReferenceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3225:1: ( ( ( RULE_ID ) ) )
            // InternalDTO.g:3226:2: ( ( RULE_ID ) )
            {
            // InternalDTO.g:3226:2: ( ( RULE_ID ) )
            // InternalDTO.g:3227:3: ( RULE_ID )
            {
             before(grammarAccess.getRefTypeAccess().getReferenceConceptCrossReference_0()); 
            // InternalDTO.g:3228:3: ( RULE_ID )
            // InternalDTO.g:3229:4: RULE_ID
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
    // InternalDTO.g:3240:1: rule__CollectionType__OfTypeAssignment_2 : ( ruleSingleType ) ;
    public final void rule__CollectionType__OfTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3244:1: ( ( ruleSingleType ) )
            // InternalDTO.g:3245:2: ( ruleSingleType )
            {
            // InternalDTO.g:3245:2: ( ruleSingleType )
            // InternalDTO.g:3246:3: ruleSingleType
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000004010002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000003F003E40010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000003F003E00012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000001F003E00000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000003F003E00010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000100001860L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000001F000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000001F003E00010L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000080000000000L});

}
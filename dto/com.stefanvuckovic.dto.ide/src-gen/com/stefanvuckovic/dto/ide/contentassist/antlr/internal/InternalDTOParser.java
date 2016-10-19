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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'SINGLE_TABLE'", "'TABLE_PER_CONCRETE_CLASS'", "'TABLE_PER_CLASS'", "'class'", "'{'", "'}'", "'extends'", "'representation'", "'@id'", "'text'", "'email'", "'password'", "'file'", "'image'", "'enum'", "'('", "')'", "','", "'L'", "'/'", "'null'", "'inheritance'", "'='", "';'", "'string'", "'int'", "'long'", "'boolean'", "'date'", "'decimal'", "'List'", "'<'", "'>'", "'.'", "'deleteByFlag'"
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

                if ( (LA1_0==16||LA1_0==27) ) {
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
    // InternalDTO.g:137:1: ruleAttributeOption : ( ( rule__AttributeOption__Alternatives ) ) ;
    public final void ruleAttributeOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:141:2: ( ( ( rule__AttributeOption__Alternatives ) ) )
            // InternalDTO.g:142:2: ( ( rule__AttributeOption__Alternatives ) )
            {
            // InternalDTO.g:142:2: ( ( rule__AttributeOption__Alternatives ) )
            // InternalDTO.g:143:3: ( rule__AttributeOption__Alternatives )
            {
             before(grammarAccess.getAttributeOptionAccess().getAlternatives()); 
            // InternalDTO.g:144:3: ( rule__AttributeOption__Alternatives )
            // InternalDTO.g:144:4: rule__AttributeOption__Alternatives
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


    // $ANTLR start "entryRuleDecimal"
    // InternalDTO.g:453:1: entryRuleDecimal : ruleDecimal EOF ;
    public final void entryRuleDecimal() throws RecognitionException {
        try {
            // InternalDTO.g:454:1: ( ruleDecimal EOF )
            // InternalDTO.g:455:1: ruleDecimal EOF
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
    // InternalDTO.g:462:1: ruleDecimal : ( ( rule__Decimal__Group__0 ) ) ;
    public final void ruleDecimal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:466:2: ( ( ( rule__Decimal__Group__0 ) ) )
            // InternalDTO.g:467:2: ( ( rule__Decimal__Group__0 ) )
            {
            // InternalDTO.g:467:2: ( ( rule__Decimal__Group__0 ) )
            // InternalDTO.g:468:3: ( rule__Decimal__Group__0 )
            {
             before(grammarAccess.getDecimalAccess().getGroup()); 
            // InternalDTO.g:469:3: ( rule__Decimal__Group__0 )
            // InternalDTO.g:469:4: rule__Decimal__Group__0
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


    // $ANTLR start "rule__Concept__Alternatives"
    // InternalDTO.g:477:1: rule__Concept__Alternatives : ( ( ruleDTOClass ) | ( ruleEnum ) );
    public final void rule__Concept__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:481:1: ( ( ruleDTOClass ) | ( ruleEnum ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            else if ( (LA2_0==27) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDTO.g:482:2: ( ruleDTOClass )
                    {
                    // InternalDTO.g:482:2: ( ruleDTOClass )
                    // InternalDTO.g:483:3: ruleDTOClass
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
                    // InternalDTO.g:488:2: ( ruleEnum )
                    {
                    // InternalDTO.g:488:2: ( ruleEnum )
                    // InternalDTO.g:489:3: ruleEnum
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


    // $ANTLR start "rule__AttributeOption__Alternatives"
    // InternalDTO.g:498:1: rule__AttributeOption__Alternatives : ( ( ( rule__AttributeOption__Group_0__0 ) ) | ( ( rule__AttributeOption__Group_1__0 ) ) );
    public final void rule__AttributeOption__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:502:1: ( ( ( rule__AttributeOption__Group_0__0 ) ) | ( ( rule__AttributeOption__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            else if ( (LA3_0==21) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDTO.g:503:2: ( ( rule__AttributeOption__Group_0__0 ) )
                    {
                    // InternalDTO.g:503:2: ( ( rule__AttributeOption__Group_0__0 ) )
                    // InternalDTO.g:504:3: ( rule__AttributeOption__Group_0__0 )
                    {
                     before(grammarAccess.getAttributeOptionAccess().getGroup_0()); 
                    // InternalDTO.g:505:3: ( rule__AttributeOption__Group_0__0 )
                    // InternalDTO.g:505:4: rule__AttributeOption__Group_0__0
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
                    // InternalDTO.g:509:2: ( ( rule__AttributeOption__Group_1__0 ) )
                    {
                    // InternalDTO.g:509:2: ( ( rule__AttributeOption__Group_1__0 ) )
                    // InternalDTO.g:510:3: ( rule__AttributeOption__Group_1__0 )
                    {
                     before(grammarAccess.getAttributeOptionAccess().getGroup_1()); 
                    // InternalDTO.g:511:3: ( rule__AttributeOption__Group_1__0 )
                    // InternalDTO.g:511:4: rule__AttributeOption__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeOption__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeOptionAccess().getGroup_1()); 

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


    // $ANTLR start "rule__BasicType__Alternatives"
    // InternalDTO.g:519:1: rule__BasicType__Alternatives : ( ( superBasicType ) | ( ( rule__BasicType__Group_1__0 ) ) | ( ( rule__BasicType__Group_2__0 ) ) | ( ( rule__BasicType__Group_3__0 ) ) | ( ( rule__BasicType__Group_4__0 ) ) | ( ( rule__BasicType__Group_5__0 ) ) );
    public final void rule__BasicType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:523:1: ( ( superBasicType ) | ( ( rule__BasicType__Group_1__0 ) ) | ( ( rule__BasicType__Group_2__0 ) ) | ( ( rule__BasicType__Group_3__0 ) ) | ( ( rule__BasicType__Group_4__0 ) ) | ( ( rule__BasicType__Group_5__0 ) ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
                {
                alt4=1;
                }
                break;
            case 22:
                {
                alt4=2;
                }
                break;
            case 23:
                {
                alt4=3;
                }
                break;
            case 24:
                {
                alt4=4;
                }
                break;
            case 25:
                {
                alt4=5;
                }
                break;
            case 26:
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
                    // InternalDTO.g:524:2: ( superBasicType )
                    {
                    // InternalDTO.g:524:2: ( superBasicType )
                    // InternalDTO.g:525:3: superBasicType
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
                    // InternalDTO.g:530:2: ( ( rule__BasicType__Group_1__0 ) )
                    {
                    // InternalDTO.g:530:2: ( ( rule__BasicType__Group_1__0 ) )
                    // InternalDTO.g:531:3: ( rule__BasicType__Group_1__0 )
                    {
                     before(grammarAccess.getBasicTypeAccess().getGroup_1()); 
                    // InternalDTO.g:532:3: ( rule__BasicType__Group_1__0 )
                    // InternalDTO.g:532:4: rule__BasicType__Group_1__0
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
                    // InternalDTO.g:536:2: ( ( rule__BasicType__Group_2__0 ) )
                    {
                    // InternalDTO.g:536:2: ( ( rule__BasicType__Group_2__0 ) )
                    // InternalDTO.g:537:3: ( rule__BasicType__Group_2__0 )
                    {
                     before(grammarAccess.getBasicTypeAccess().getGroup_2()); 
                    // InternalDTO.g:538:3: ( rule__BasicType__Group_2__0 )
                    // InternalDTO.g:538:4: rule__BasicType__Group_2__0
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
                    // InternalDTO.g:542:2: ( ( rule__BasicType__Group_3__0 ) )
                    {
                    // InternalDTO.g:542:2: ( ( rule__BasicType__Group_3__0 ) )
                    // InternalDTO.g:543:3: ( rule__BasicType__Group_3__0 )
                    {
                     before(grammarAccess.getBasicTypeAccess().getGroup_3()); 
                    // InternalDTO.g:544:3: ( rule__BasicType__Group_3__0 )
                    // InternalDTO.g:544:4: rule__BasicType__Group_3__0
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
                    // InternalDTO.g:548:2: ( ( rule__BasicType__Group_4__0 ) )
                    {
                    // InternalDTO.g:548:2: ( ( rule__BasicType__Group_4__0 ) )
                    // InternalDTO.g:549:3: ( rule__BasicType__Group_4__0 )
                    {
                     before(grammarAccess.getBasicTypeAccess().getGroup_4()); 
                    // InternalDTO.g:550:3: ( rule__BasicType__Group_4__0 )
                    // InternalDTO.g:550:4: rule__BasicType__Group_4__0
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
                    // InternalDTO.g:554:2: ( ( rule__BasicType__Group_5__0 ) )
                    {
                    // InternalDTO.g:554:2: ( ( rule__BasicType__Group_5__0 ) )
                    // InternalDTO.g:555:3: ( rule__BasicType__Group_5__0 )
                    {
                     before(grammarAccess.getBasicTypeAccess().getGroup_5()); 
                    // InternalDTO.g:556:3: ( rule__BasicType__Group_5__0 )
                    // InternalDTO.g:556:4: rule__BasicType__Group_5__0
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
    // InternalDTO.g:564:1: rule__Constant__Alternatives : ( ( ( rule__Constant__Group_0__0 ) ) | ( ( rule__Constant__Group_1__0 ) ) | ( ( rule__Constant__Group_2__0 ) ) | ( ( rule__Constant__Group_3__0 ) ) | ( ( rule__Constant__Group_4__0 ) ) | ( ( rule__Constant__Group_5__0 ) ) | ( ( rule__Constant__Group_6__0 ) ) );
    public final void rule__Constant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:568:1: ( ( ( rule__Constant__Group_0__0 ) ) | ( ( rule__Constant__Group_1__0 ) ) | ( ( rule__Constant__Group_2__0 ) ) | ( ( rule__Constant__Group_3__0 ) ) | ( ( rule__Constant__Group_4__0 ) ) | ( ( rule__Constant__Group_5__0 ) ) | ( ( rule__Constant__Group_6__0 ) ) )
            int alt5=7;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                switch ( input.LA(2) ) {
                case EOF:
                case 29:
                case 30:
                    {
                    alt5=1;
                    }
                    break;
                case 46:
                    {
                    alt5=6;
                    }
                    break;
                case 31:
                    {
                    alt5=2;
                    }
                    break;
                case 32:
                    {
                    alt5=5;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }

                }
                break;
            case RULE_STRING:
                {
                alt5=3;
                }
                break;
            case 11:
            case 12:
                {
                alt5=4;
                }
                break;
            case 33:
                {
                alt5=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalDTO.g:569:2: ( ( rule__Constant__Group_0__0 ) )
                    {
                    // InternalDTO.g:569:2: ( ( rule__Constant__Group_0__0 ) )
                    // InternalDTO.g:570:3: ( rule__Constant__Group_0__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_0()); 
                    // InternalDTO.g:571:3: ( rule__Constant__Group_0__0 )
                    // InternalDTO.g:571:4: rule__Constant__Group_0__0
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
                    // InternalDTO.g:575:2: ( ( rule__Constant__Group_1__0 ) )
                    {
                    // InternalDTO.g:575:2: ( ( rule__Constant__Group_1__0 ) )
                    // InternalDTO.g:576:3: ( rule__Constant__Group_1__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_1()); 
                    // InternalDTO.g:577:3: ( rule__Constant__Group_1__0 )
                    // InternalDTO.g:577:4: rule__Constant__Group_1__0
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
                    // InternalDTO.g:581:2: ( ( rule__Constant__Group_2__0 ) )
                    {
                    // InternalDTO.g:581:2: ( ( rule__Constant__Group_2__0 ) )
                    // InternalDTO.g:582:3: ( rule__Constant__Group_2__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_2()); 
                    // InternalDTO.g:583:3: ( rule__Constant__Group_2__0 )
                    // InternalDTO.g:583:4: rule__Constant__Group_2__0
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
                    // InternalDTO.g:587:2: ( ( rule__Constant__Group_3__0 ) )
                    {
                    // InternalDTO.g:587:2: ( ( rule__Constant__Group_3__0 ) )
                    // InternalDTO.g:588:3: ( rule__Constant__Group_3__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_3()); 
                    // InternalDTO.g:589:3: ( rule__Constant__Group_3__0 )
                    // InternalDTO.g:589:4: rule__Constant__Group_3__0
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
                    // InternalDTO.g:593:2: ( ( rule__Constant__Group_4__0 ) )
                    {
                    // InternalDTO.g:593:2: ( ( rule__Constant__Group_4__0 ) )
                    // InternalDTO.g:594:3: ( rule__Constant__Group_4__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_4()); 
                    // InternalDTO.g:595:3: ( rule__Constant__Group_4__0 )
                    // InternalDTO.g:595:4: rule__Constant__Group_4__0
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
                    // InternalDTO.g:599:2: ( ( rule__Constant__Group_5__0 ) )
                    {
                    // InternalDTO.g:599:2: ( ( rule__Constant__Group_5__0 ) )
                    // InternalDTO.g:600:3: ( rule__Constant__Group_5__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_5()); 
                    // InternalDTO.g:601:3: ( rule__Constant__Group_5__0 )
                    // InternalDTO.g:601:4: rule__Constant__Group_5__0
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
                    // InternalDTO.g:605:2: ( ( rule__Constant__Group_6__0 ) )
                    {
                    // InternalDTO.g:605:2: ( ( rule__Constant__Group_6__0 ) )
                    // InternalDTO.g:606:3: ( rule__Constant__Group_6__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_6()); 
                    // InternalDTO.g:607:3: ( rule__Constant__Group_6__0 )
                    // InternalDTO.g:607:4: rule__Constant__Group_6__0
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
    // InternalDTO.g:615:1: rule__Constant__ValueAlternatives_3_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Constant__ValueAlternatives_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:619:1: ( ( 'true' ) | ( 'false' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11) ) {
                alt6=1;
            }
            else if ( (LA6_0==12) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDTO.g:620:2: ( 'true' )
                    {
                    // InternalDTO.g:620:2: ( 'true' )
                    // InternalDTO.g:621:3: 'true'
                    {
                     before(grammarAccess.getConstantAccess().getValueTrueKeyword_3_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getConstantAccess().getValueTrueKeyword_3_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDTO.g:626:2: ( 'false' )
                    {
                    // InternalDTO.g:626:2: ( 'false' )
                    // InternalDTO.g:627:3: 'false'
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
    // InternalDTO.g:636:1: rule__EntityOption__Alternatives : ( ( ( rule__EntityOption__Group_0__0 ) ) | ( ( rule__EntityOption__Group_1__0 ) ) );
    public final void rule__EntityOption__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:640:1: ( ( ( rule__EntityOption__Group_0__0 ) ) | ( ( rule__EntityOption__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==47) ) {
                alt7=1;
            }
            else if ( (LA7_0==34) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDTO.g:641:2: ( ( rule__EntityOption__Group_0__0 ) )
                    {
                    // InternalDTO.g:641:2: ( ( rule__EntityOption__Group_0__0 ) )
                    // InternalDTO.g:642:3: ( rule__EntityOption__Group_0__0 )
                    {
                     before(grammarAccess.getEntityOptionAccess().getGroup_0()); 
                    // InternalDTO.g:643:3: ( rule__EntityOption__Group_0__0 )
                    // InternalDTO.g:643:4: rule__EntityOption__Group_0__0
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
                    // InternalDTO.g:647:2: ( ( rule__EntityOption__Group_1__0 ) )
                    {
                    // InternalDTO.g:647:2: ( ( rule__EntityOption__Group_1__0 ) )
                    // InternalDTO.g:648:3: ( rule__EntityOption__Group_1__0 )
                    {
                     before(grammarAccess.getEntityOptionAccess().getGroup_1()); 
                    // InternalDTO.g:649:3: ( rule__EntityOption__Group_1__0 )
                    // InternalDTO.g:649:4: rule__EntityOption__Group_1__0
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
    // InternalDTO.g:657:1: rule__InheritanceMappingType__TypeAlternatives_0 : ( ( 'SINGLE_TABLE' ) | ( 'TABLE_PER_CONCRETE_CLASS' ) | ( 'TABLE_PER_CLASS' ) );
    public final void rule__InheritanceMappingType__TypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:661:1: ( ( 'SINGLE_TABLE' ) | ( 'TABLE_PER_CONCRETE_CLASS' ) | ( 'TABLE_PER_CLASS' ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt8=1;
                }
                break;
            case 14:
                {
                alt8=2;
                }
                break;
            case 15:
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
                    // InternalDTO.g:662:2: ( 'SINGLE_TABLE' )
                    {
                    // InternalDTO.g:662:2: ( 'SINGLE_TABLE' )
                    // InternalDTO.g:663:3: 'SINGLE_TABLE'
                    {
                     before(grammarAccess.getInheritanceMappingTypeAccess().getTypeSINGLE_TABLEKeyword_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getInheritanceMappingTypeAccess().getTypeSINGLE_TABLEKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDTO.g:668:2: ( 'TABLE_PER_CONCRETE_CLASS' )
                    {
                    // InternalDTO.g:668:2: ( 'TABLE_PER_CONCRETE_CLASS' )
                    // InternalDTO.g:669:3: 'TABLE_PER_CONCRETE_CLASS'
                    {
                     before(grammarAccess.getInheritanceMappingTypeAccess().getTypeTABLE_PER_CONCRETE_CLASSKeyword_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getInheritanceMappingTypeAccess().getTypeTABLE_PER_CONCRETE_CLASSKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDTO.g:674:2: ( 'TABLE_PER_CLASS' )
                    {
                    // InternalDTO.g:674:2: ( 'TABLE_PER_CLASS' )
                    // InternalDTO.g:675:3: 'TABLE_PER_CLASS'
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
    // InternalDTO.g:684:1: rule__AttributeType__Alternatives : ( ( ruleSingleType ) | ( ruleCollectionType ) );
    public final void rule__AttributeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:688:1: ( ( ruleSingleType ) | ( ruleCollectionType ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID||(LA9_0>=22 && LA9_0<=26)||(LA9_0>=37 && LA9_0<=42)) ) {
                alt9=1;
            }
            else if ( (LA9_0==43) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalDTO.g:689:2: ( ruleSingleType )
                    {
                    // InternalDTO.g:689:2: ( ruleSingleType )
                    // InternalDTO.g:690:3: ruleSingleType
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
                    // InternalDTO.g:695:2: ( ruleCollectionType )
                    {
                    // InternalDTO.g:695:2: ( ruleCollectionType )
                    // InternalDTO.g:696:3: ruleCollectionType
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
    // InternalDTO.g:705:1: rule__SingleType__Alternatives : ( ( ruleBasicType ) | ( ruleRefType ) );
    public final void rule__SingleType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:709:1: ( ( ruleBasicType ) | ( ruleRefType ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=22 && LA10_0<=26)||(LA10_0>=37 && LA10_0<=42)) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalDTO.g:710:2: ( ruleBasicType )
                    {
                    // InternalDTO.g:710:2: ( ruleBasicType )
                    // InternalDTO.g:711:3: ruleBasicType
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
                    // InternalDTO.g:716:2: ( ruleRefType )
                    {
                    // InternalDTO.g:716:2: ( ruleRefType )
                    // InternalDTO.g:717:3: ruleRefType
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
    // InternalDTO.g:726:1: superBasicType__Alternatives : ( ( ( superBasicType__Group_0__0 ) ) | ( ( superBasicType__Group_1__0 ) ) | ( ( superBasicType__Group_2__0 ) ) | ( ( superBasicType__Group_3__0 ) ) | ( ( superBasicType__Group_4__0 ) ) | ( ( superBasicType__Group_5__0 ) ) );
    public final void superBasicType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:730:1: ( ( ( superBasicType__Group_0__0 ) ) | ( ( superBasicType__Group_1__0 ) ) | ( ( superBasicType__Group_2__0 ) ) | ( ( superBasicType__Group_3__0 ) ) | ( ( superBasicType__Group_4__0 ) ) | ( ( superBasicType__Group_5__0 ) ) )
            int alt11=6;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt11=1;
                }
                break;
            case 38:
                {
                alt11=2;
                }
                break;
            case 39:
                {
                alt11=3;
                }
                break;
            case 40:
                {
                alt11=4;
                }
                break;
            case 41:
                {
                alt11=5;
                }
                break;
            case 42:
                {
                alt11=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalDTO.g:731:2: ( ( superBasicType__Group_0__0 ) )
                    {
                    // InternalDTO.g:731:2: ( ( superBasicType__Group_0__0 ) )
                    // InternalDTO.g:732:3: ( superBasicType__Group_0__0 )
                    {
                     before(grammarAccess.getDomainModelBasicTypeAccess().getGroup_0()); 
                    // InternalDTO.g:733:3: ( superBasicType__Group_0__0 )
                    // InternalDTO.g:733:4: superBasicType__Group_0__0
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
                    // InternalDTO.g:737:2: ( ( superBasicType__Group_1__0 ) )
                    {
                    // InternalDTO.g:737:2: ( ( superBasicType__Group_1__0 ) )
                    // InternalDTO.g:738:3: ( superBasicType__Group_1__0 )
                    {
                     before(grammarAccess.getDomainModelBasicTypeAccess().getGroup_1()); 
                    // InternalDTO.g:739:3: ( superBasicType__Group_1__0 )
                    // InternalDTO.g:739:4: superBasicType__Group_1__0
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
                    // InternalDTO.g:743:2: ( ( superBasicType__Group_2__0 ) )
                    {
                    // InternalDTO.g:743:2: ( ( superBasicType__Group_2__0 ) )
                    // InternalDTO.g:744:3: ( superBasicType__Group_2__0 )
                    {
                     before(grammarAccess.getDomainModelBasicTypeAccess().getGroup_2()); 
                    // InternalDTO.g:745:3: ( superBasicType__Group_2__0 )
                    // InternalDTO.g:745:4: superBasicType__Group_2__0
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
                    // InternalDTO.g:749:2: ( ( superBasicType__Group_3__0 ) )
                    {
                    // InternalDTO.g:749:2: ( ( superBasicType__Group_3__0 ) )
                    // InternalDTO.g:750:3: ( superBasicType__Group_3__0 )
                    {
                     before(grammarAccess.getDomainModelBasicTypeAccess().getGroup_3()); 
                    // InternalDTO.g:751:3: ( superBasicType__Group_3__0 )
                    // InternalDTO.g:751:4: superBasicType__Group_3__0
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
                    // InternalDTO.g:755:2: ( ( superBasicType__Group_4__0 ) )
                    {
                    // InternalDTO.g:755:2: ( ( superBasicType__Group_4__0 ) )
                    // InternalDTO.g:756:3: ( superBasicType__Group_4__0 )
                    {
                     before(grammarAccess.getDomainModelBasicTypeAccess().getGroup_4()); 
                    // InternalDTO.g:757:3: ( superBasicType__Group_4__0 )
                    // InternalDTO.g:757:4: superBasicType__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    superBasicType__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDomainModelBasicTypeAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDTO.g:761:2: ( ( superBasicType__Group_5__0 ) )
                    {
                    // InternalDTO.g:761:2: ( ( superBasicType__Group_5__0 ) )
                    // InternalDTO.g:762:3: ( superBasicType__Group_5__0 )
                    {
                     before(grammarAccess.getDomainModelBasicTypeAccess().getGroup_5()); 
                    // InternalDTO.g:763:3: ( superBasicType__Group_5__0 )
                    // InternalDTO.g:763:4: superBasicType__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    superBasicType__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDomainModelBasicTypeAccess().getGroup_5()); 

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
    // InternalDTO.g:771:1: rule__DTOClass__Group__0 : rule__DTOClass__Group__0__Impl rule__DTOClass__Group__1 ;
    public final void rule__DTOClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:775:1: ( rule__DTOClass__Group__0__Impl rule__DTOClass__Group__1 )
            // InternalDTO.g:776:2: rule__DTOClass__Group__0__Impl rule__DTOClass__Group__1
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
    // InternalDTO.g:783:1: rule__DTOClass__Group__0__Impl : ( 'class' ) ;
    public final void rule__DTOClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:787:1: ( ( 'class' ) )
            // InternalDTO.g:788:1: ( 'class' )
            {
            // InternalDTO.g:788:1: ( 'class' )
            // InternalDTO.g:789:2: 'class'
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
    // InternalDTO.g:798:1: rule__DTOClass__Group__1 : rule__DTOClass__Group__1__Impl rule__DTOClass__Group__2 ;
    public final void rule__DTOClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:802:1: ( rule__DTOClass__Group__1__Impl rule__DTOClass__Group__2 )
            // InternalDTO.g:803:2: rule__DTOClass__Group__1__Impl rule__DTOClass__Group__2
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
    // InternalDTO.g:810:1: rule__DTOClass__Group__1__Impl : ( ( rule__DTOClass__NameAssignment_1 ) ) ;
    public final void rule__DTOClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:814:1: ( ( ( rule__DTOClass__NameAssignment_1 ) ) )
            // InternalDTO.g:815:1: ( ( rule__DTOClass__NameAssignment_1 ) )
            {
            // InternalDTO.g:815:1: ( ( rule__DTOClass__NameAssignment_1 ) )
            // InternalDTO.g:816:2: ( rule__DTOClass__NameAssignment_1 )
            {
             before(grammarAccess.getDTOClassAccess().getNameAssignment_1()); 
            // InternalDTO.g:817:2: ( rule__DTOClass__NameAssignment_1 )
            // InternalDTO.g:817:3: rule__DTOClass__NameAssignment_1
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
    // InternalDTO.g:825:1: rule__DTOClass__Group__2 : rule__DTOClass__Group__2__Impl rule__DTOClass__Group__3 ;
    public final void rule__DTOClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:829:1: ( rule__DTOClass__Group__2__Impl rule__DTOClass__Group__3 )
            // InternalDTO.g:830:2: rule__DTOClass__Group__2__Impl rule__DTOClass__Group__3
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
    // InternalDTO.g:837:1: rule__DTOClass__Group__2__Impl : ( ( rule__DTOClass__Group_2__0 )? ) ;
    public final void rule__DTOClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:841:1: ( ( ( rule__DTOClass__Group_2__0 )? ) )
            // InternalDTO.g:842:1: ( ( rule__DTOClass__Group_2__0 )? )
            {
            // InternalDTO.g:842:1: ( ( rule__DTOClass__Group_2__0 )? )
            // InternalDTO.g:843:2: ( rule__DTOClass__Group_2__0 )?
            {
             before(grammarAccess.getDTOClassAccess().getGroup_2()); 
            // InternalDTO.g:844:2: ( rule__DTOClass__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDTO.g:844:3: rule__DTOClass__Group_2__0
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
    // InternalDTO.g:852:1: rule__DTOClass__Group__3 : rule__DTOClass__Group__3__Impl rule__DTOClass__Group__4 ;
    public final void rule__DTOClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:856:1: ( rule__DTOClass__Group__3__Impl rule__DTOClass__Group__4 )
            // InternalDTO.g:857:2: rule__DTOClass__Group__3__Impl rule__DTOClass__Group__4
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
    // InternalDTO.g:864:1: rule__DTOClass__Group__3__Impl : ( '{' ) ;
    public final void rule__DTOClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:868:1: ( ( '{' ) )
            // InternalDTO.g:869:1: ( '{' )
            {
            // InternalDTO.g:869:1: ( '{' )
            // InternalDTO.g:870:2: '{'
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
    // InternalDTO.g:879:1: rule__DTOClass__Group__4 : rule__DTOClass__Group__4__Impl rule__DTOClass__Group__5 ;
    public final void rule__DTOClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:883:1: ( rule__DTOClass__Group__4__Impl rule__DTOClass__Group__5 )
            // InternalDTO.g:884:2: rule__DTOClass__Group__4__Impl rule__DTOClass__Group__5
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
    // InternalDTO.g:891:1: rule__DTOClass__Group__4__Impl : ( ( rule__DTOClass__AttributesAssignment_4 )* ) ;
    public final void rule__DTOClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:895:1: ( ( ( rule__DTOClass__AttributesAssignment_4 )* ) )
            // InternalDTO.g:896:1: ( ( rule__DTOClass__AttributesAssignment_4 )* )
            {
            // InternalDTO.g:896:1: ( ( rule__DTOClass__AttributesAssignment_4 )* )
            // InternalDTO.g:897:2: ( rule__DTOClass__AttributesAssignment_4 )*
            {
             before(grammarAccess.getDTOClassAccess().getAttributesAssignment_4()); 
            // InternalDTO.g:898:2: ( rule__DTOClass__AttributesAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||(LA13_0>=22 && LA13_0<=26)||(LA13_0>=37 && LA13_0<=43)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDTO.g:898:3: rule__DTOClass__AttributesAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__DTOClass__AttributesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalDTO.g:906:1: rule__DTOClass__Group__5 : rule__DTOClass__Group__5__Impl ;
    public final void rule__DTOClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:910:1: ( rule__DTOClass__Group__5__Impl )
            // InternalDTO.g:911:2: rule__DTOClass__Group__5__Impl
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
    // InternalDTO.g:917:1: rule__DTOClass__Group__5__Impl : ( '}' ) ;
    public final void rule__DTOClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:921:1: ( ( '}' ) )
            // InternalDTO.g:922:1: ( '}' )
            {
            // InternalDTO.g:922:1: ( '}' )
            // InternalDTO.g:923:2: '}'
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
    // InternalDTO.g:933:1: rule__DTOClass__Group_2__0 : rule__DTOClass__Group_2__0__Impl rule__DTOClass__Group_2__1 ;
    public final void rule__DTOClass__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:937:1: ( rule__DTOClass__Group_2__0__Impl rule__DTOClass__Group_2__1 )
            // InternalDTO.g:938:2: rule__DTOClass__Group_2__0__Impl rule__DTOClass__Group_2__1
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
    // InternalDTO.g:945:1: rule__DTOClass__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__DTOClass__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:949:1: ( ( 'extends' ) )
            // InternalDTO.g:950:1: ( 'extends' )
            {
            // InternalDTO.g:950:1: ( 'extends' )
            // InternalDTO.g:951:2: 'extends'
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
    // InternalDTO.g:960:1: rule__DTOClass__Group_2__1 : rule__DTOClass__Group_2__1__Impl ;
    public final void rule__DTOClass__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:964:1: ( rule__DTOClass__Group_2__1__Impl )
            // InternalDTO.g:965:2: rule__DTOClass__Group_2__1__Impl
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
    // InternalDTO.g:971:1: rule__DTOClass__Group_2__1__Impl : ( ( rule__DTOClass__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__DTOClass__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:975:1: ( ( ( rule__DTOClass__SuperTypeAssignment_2_1 ) ) )
            // InternalDTO.g:976:1: ( ( rule__DTOClass__SuperTypeAssignment_2_1 ) )
            {
            // InternalDTO.g:976:1: ( ( rule__DTOClass__SuperTypeAssignment_2_1 ) )
            // InternalDTO.g:977:2: ( rule__DTOClass__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getDTOClassAccess().getSuperTypeAssignment_2_1()); 
            // InternalDTO.g:978:2: ( rule__DTOClass__SuperTypeAssignment_2_1 )
            // InternalDTO.g:978:3: rule__DTOClass__SuperTypeAssignment_2_1
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


    // $ANTLR start "rule__AttributeOption__Group_0__0"
    // InternalDTO.g:987:1: rule__AttributeOption__Group_0__0 : rule__AttributeOption__Group_0__0__Impl rule__AttributeOption__Group_0__1 ;
    public final void rule__AttributeOption__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:991:1: ( rule__AttributeOption__Group_0__0__Impl rule__AttributeOption__Group_0__1 )
            // InternalDTO.g:992:2: rule__AttributeOption__Group_0__0__Impl rule__AttributeOption__Group_0__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalDTO.g:999:1: rule__AttributeOption__Group_0__0__Impl : ( () ) ;
    public final void rule__AttributeOption__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1003:1: ( ( () ) )
            // InternalDTO.g:1004:1: ( () )
            {
            // InternalDTO.g:1004:1: ( () )
            // InternalDTO.g:1005:2: ()
            {
             before(grammarAccess.getAttributeOptionAccess().getObjectRepresentationAction_0_0()); 
            // InternalDTO.g:1006:2: ()
            // InternalDTO.g:1006:3: 
            {
            }

             after(grammarAccess.getAttributeOptionAccess().getObjectRepresentationAction_0_0()); 

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
    // InternalDTO.g:1014:1: rule__AttributeOption__Group_0__1 : rule__AttributeOption__Group_0__1__Impl ;
    public final void rule__AttributeOption__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1018:1: ( rule__AttributeOption__Group_0__1__Impl )
            // InternalDTO.g:1019:2: rule__AttributeOption__Group_0__1__Impl
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
    // InternalDTO.g:1025:1: rule__AttributeOption__Group_0__1__Impl : ( 'representation' ) ;
    public final void rule__AttributeOption__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1029:1: ( ( 'representation' ) )
            // InternalDTO.g:1030:1: ( 'representation' )
            {
            // InternalDTO.g:1030:1: ( 'representation' )
            // InternalDTO.g:1031:2: 'representation'
            {
             before(grammarAccess.getAttributeOptionAccess().getRepresentationKeyword_0_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAttributeOptionAccess().getRepresentationKeyword_0_1()); 

            }


            }

        }
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
    // InternalDTO.g:1041:1: rule__AttributeOption__Group_1__0 : rule__AttributeOption__Group_1__0__Impl rule__AttributeOption__Group_1__1 ;
    public final void rule__AttributeOption__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1045:1: ( rule__AttributeOption__Group_1__0__Impl rule__AttributeOption__Group_1__1 )
            // InternalDTO.g:1046:2: rule__AttributeOption__Group_1__0__Impl rule__AttributeOption__Group_1__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalDTO.g:1053:1: rule__AttributeOption__Group_1__0__Impl : ( () ) ;
    public final void rule__AttributeOption__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1057:1: ( ( () ) )
            // InternalDTO.g:1058:1: ( () )
            {
            // InternalDTO.g:1058:1: ( () )
            // InternalDTO.g:1059:2: ()
            {
             before(grammarAccess.getAttributeOptionAccess().getIDAttributeAction_1_0()); 
            // InternalDTO.g:1060:2: ()
            // InternalDTO.g:1060:3: 
            {
            }

             after(grammarAccess.getAttributeOptionAccess().getIDAttributeAction_1_0()); 

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
    // InternalDTO.g:1068:1: rule__AttributeOption__Group_1__1 : rule__AttributeOption__Group_1__1__Impl ;
    public final void rule__AttributeOption__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1072:1: ( rule__AttributeOption__Group_1__1__Impl )
            // InternalDTO.g:1073:2: rule__AttributeOption__Group_1__1__Impl
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
    // InternalDTO.g:1079:1: rule__AttributeOption__Group_1__1__Impl : ( '@id' ) ;
    public final void rule__AttributeOption__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1083:1: ( ( '@id' ) )
            // InternalDTO.g:1084:1: ( '@id' )
            {
            // InternalDTO.g:1084:1: ( '@id' )
            // InternalDTO.g:1085:2: '@id'
            {
             before(grammarAccess.getAttributeOptionAccess().getIdKeyword_1_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAttributeOptionAccess().getIdKeyword_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__BasicType__Group_1__0"
    // InternalDTO.g:1095:1: rule__BasicType__Group_1__0 : rule__BasicType__Group_1__0__Impl rule__BasicType__Group_1__1 ;
    public final void rule__BasicType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1099:1: ( rule__BasicType__Group_1__0__Impl rule__BasicType__Group_1__1 )
            // InternalDTO.g:1100:2: rule__BasicType__Group_1__0__Impl rule__BasicType__Group_1__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalDTO.g:1107:1: rule__BasicType__Group_1__0__Impl : ( () ) ;
    public final void rule__BasicType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1111:1: ( ( () ) )
            // InternalDTO.g:1112:1: ( () )
            {
            // InternalDTO.g:1112:1: ( () )
            // InternalDTO.g:1113:2: ()
            {
             before(grammarAccess.getBasicTypeAccess().getTextTypeAction_1_0()); 
            // InternalDTO.g:1114:2: ()
            // InternalDTO.g:1114:3: 
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
    // InternalDTO.g:1122:1: rule__BasicType__Group_1__1 : rule__BasicType__Group_1__1__Impl ;
    public final void rule__BasicType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1126:1: ( rule__BasicType__Group_1__1__Impl )
            // InternalDTO.g:1127:2: rule__BasicType__Group_1__1__Impl
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
    // InternalDTO.g:1133:1: rule__BasicType__Group_1__1__Impl : ( 'text' ) ;
    public final void rule__BasicType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1137:1: ( ( 'text' ) )
            // InternalDTO.g:1138:1: ( 'text' )
            {
            // InternalDTO.g:1138:1: ( 'text' )
            // InternalDTO.g:1139:2: 'text'
            {
             before(grammarAccess.getBasicTypeAccess().getTextKeyword_1_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalDTO.g:1149:1: rule__BasicType__Group_2__0 : rule__BasicType__Group_2__0__Impl rule__BasicType__Group_2__1 ;
    public final void rule__BasicType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1153:1: ( rule__BasicType__Group_2__0__Impl rule__BasicType__Group_2__1 )
            // InternalDTO.g:1154:2: rule__BasicType__Group_2__0__Impl rule__BasicType__Group_2__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalDTO.g:1161:1: rule__BasicType__Group_2__0__Impl : ( () ) ;
    public final void rule__BasicType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1165:1: ( ( () ) )
            // InternalDTO.g:1166:1: ( () )
            {
            // InternalDTO.g:1166:1: ( () )
            // InternalDTO.g:1167:2: ()
            {
             before(grammarAccess.getBasicTypeAccess().getEmailTypeAction_2_0()); 
            // InternalDTO.g:1168:2: ()
            // InternalDTO.g:1168:3: 
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
    // InternalDTO.g:1176:1: rule__BasicType__Group_2__1 : rule__BasicType__Group_2__1__Impl ;
    public final void rule__BasicType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1180:1: ( rule__BasicType__Group_2__1__Impl )
            // InternalDTO.g:1181:2: rule__BasicType__Group_2__1__Impl
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
    // InternalDTO.g:1187:1: rule__BasicType__Group_2__1__Impl : ( 'email' ) ;
    public final void rule__BasicType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1191:1: ( ( 'email' ) )
            // InternalDTO.g:1192:1: ( 'email' )
            {
            // InternalDTO.g:1192:1: ( 'email' )
            // InternalDTO.g:1193:2: 'email'
            {
             before(grammarAccess.getBasicTypeAccess().getEmailKeyword_2_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalDTO.g:1203:1: rule__BasicType__Group_3__0 : rule__BasicType__Group_3__0__Impl rule__BasicType__Group_3__1 ;
    public final void rule__BasicType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1207:1: ( rule__BasicType__Group_3__0__Impl rule__BasicType__Group_3__1 )
            // InternalDTO.g:1208:2: rule__BasicType__Group_3__0__Impl rule__BasicType__Group_3__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalDTO.g:1215:1: rule__BasicType__Group_3__0__Impl : ( () ) ;
    public final void rule__BasicType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1219:1: ( ( () ) )
            // InternalDTO.g:1220:1: ( () )
            {
            // InternalDTO.g:1220:1: ( () )
            // InternalDTO.g:1221:2: ()
            {
             before(grammarAccess.getBasicTypeAccess().getPasswordTypeAction_3_0()); 
            // InternalDTO.g:1222:2: ()
            // InternalDTO.g:1222:3: 
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
    // InternalDTO.g:1230:1: rule__BasicType__Group_3__1 : rule__BasicType__Group_3__1__Impl ;
    public final void rule__BasicType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1234:1: ( rule__BasicType__Group_3__1__Impl )
            // InternalDTO.g:1235:2: rule__BasicType__Group_3__1__Impl
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
    // InternalDTO.g:1241:1: rule__BasicType__Group_3__1__Impl : ( 'password' ) ;
    public final void rule__BasicType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1245:1: ( ( 'password' ) )
            // InternalDTO.g:1246:1: ( 'password' )
            {
            // InternalDTO.g:1246:1: ( 'password' )
            // InternalDTO.g:1247:2: 'password'
            {
             before(grammarAccess.getBasicTypeAccess().getPasswordKeyword_3_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalDTO.g:1257:1: rule__BasicType__Group_4__0 : rule__BasicType__Group_4__0__Impl rule__BasicType__Group_4__1 ;
    public final void rule__BasicType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1261:1: ( rule__BasicType__Group_4__0__Impl rule__BasicType__Group_4__1 )
            // InternalDTO.g:1262:2: rule__BasicType__Group_4__0__Impl rule__BasicType__Group_4__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalDTO.g:1269:1: rule__BasicType__Group_4__0__Impl : ( () ) ;
    public final void rule__BasicType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1273:1: ( ( () ) )
            // InternalDTO.g:1274:1: ( () )
            {
            // InternalDTO.g:1274:1: ( () )
            // InternalDTO.g:1275:2: ()
            {
             before(grammarAccess.getBasicTypeAccess().getFileTypeAction_4_0()); 
            // InternalDTO.g:1276:2: ()
            // InternalDTO.g:1276:3: 
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
    // InternalDTO.g:1284:1: rule__BasicType__Group_4__1 : rule__BasicType__Group_4__1__Impl ;
    public final void rule__BasicType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1288:1: ( rule__BasicType__Group_4__1__Impl )
            // InternalDTO.g:1289:2: rule__BasicType__Group_4__1__Impl
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
    // InternalDTO.g:1295:1: rule__BasicType__Group_4__1__Impl : ( 'file' ) ;
    public final void rule__BasicType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1299:1: ( ( 'file' ) )
            // InternalDTO.g:1300:1: ( 'file' )
            {
            // InternalDTO.g:1300:1: ( 'file' )
            // InternalDTO.g:1301:2: 'file'
            {
             before(grammarAccess.getBasicTypeAccess().getFileKeyword_4_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalDTO.g:1311:1: rule__BasicType__Group_5__0 : rule__BasicType__Group_5__0__Impl rule__BasicType__Group_5__1 ;
    public final void rule__BasicType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1315:1: ( rule__BasicType__Group_5__0__Impl rule__BasicType__Group_5__1 )
            // InternalDTO.g:1316:2: rule__BasicType__Group_5__0__Impl rule__BasicType__Group_5__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalDTO.g:1323:1: rule__BasicType__Group_5__0__Impl : ( () ) ;
    public final void rule__BasicType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1327:1: ( ( () ) )
            // InternalDTO.g:1328:1: ( () )
            {
            // InternalDTO.g:1328:1: ( () )
            // InternalDTO.g:1329:2: ()
            {
             before(grammarAccess.getBasicTypeAccess().getImageTypeAction_5_0()); 
            // InternalDTO.g:1330:2: ()
            // InternalDTO.g:1330:3: 
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
    // InternalDTO.g:1338:1: rule__BasicType__Group_5__1 : rule__BasicType__Group_5__1__Impl ;
    public final void rule__BasicType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1342:1: ( rule__BasicType__Group_5__1__Impl )
            // InternalDTO.g:1343:2: rule__BasicType__Group_5__1__Impl
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
    // InternalDTO.g:1349:1: rule__BasicType__Group_5__1__Impl : ( 'image' ) ;
    public final void rule__BasicType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1353:1: ( ( 'image' ) )
            // InternalDTO.g:1354:1: ( 'image' )
            {
            // InternalDTO.g:1354:1: ( 'image' )
            // InternalDTO.g:1355:2: 'image'
            {
             before(grammarAccess.getBasicTypeAccess().getImageKeyword_5_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalDTO.g:1365:1: rule__Enum__Group__0 : rule__Enum__Group__0__Impl rule__Enum__Group__1 ;
    public final void rule__Enum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1369:1: ( rule__Enum__Group__0__Impl rule__Enum__Group__1 )
            // InternalDTO.g:1370:2: rule__Enum__Group__0__Impl rule__Enum__Group__1
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
    // InternalDTO.g:1377:1: rule__Enum__Group__0__Impl : ( 'enum' ) ;
    public final void rule__Enum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1381:1: ( ( 'enum' ) )
            // InternalDTO.g:1382:1: ( 'enum' )
            {
            // InternalDTO.g:1382:1: ( 'enum' )
            // InternalDTO.g:1383:2: 'enum'
            {
             before(grammarAccess.getEnumAccess().getEnumKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalDTO.g:1392:1: rule__Enum__Group__1 : rule__Enum__Group__1__Impl rule__Enum__Group__2 ;
    public final void rule__Enum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1396:1: ( rule__Enum__Group__1__Impl rule__Enum__Group__2 )
            // InternalDTO.g:1397:2: rule__Enum__Group__1__Impl rule__Enum__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalDTO.g:1404:1: rule__Enum__Group__1__Impl : ( ( rule__Enum__NameAssignment_1 ) ) ;
    public final void rule__Enum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1408:1: ( ( ( rule__Enum__NameAssignment_1 ) ) )
            // InternalDTO.g:1409:1: ( ( rule__Enum__NameAssignment_1 ) )
            {
            // InternalDTO.g:1409:1: ( ( rule__Enum__NameAssignment_1 ) )
            // InternalDTO.g:1410:2: ( rule__Enum__NameAssignment_1 )
            {
             before(grammarAccess.getEnumAccess().getNameAssignment_1()); 
            // InternalDTO.g:1411:2: ( rule__Enum__NameAssignment_1 )
            // InternalDTO.g:1411:3: rule__Enum__NameAssignment_1
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
    // InternalDTO.g:1419:1: rule__Enum__Group__2 : rule__Enum__Group__2__Impl rule__Enum__Group__3 ;
    public final void rule__Enum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1423:1: ( rule__Enum__Group__2__Impl rule__Enum__Group__3 )
            // InternalDTO.g:1424:2: rule__Enum__Group__2__Impl rule__Enum__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalDTO.g:1431:1: rule__Enum__Group__2__Impl : ( '{' ) ;
    public final void rule__Enum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1435:1: ( ( '{' ) )
            // InternalDTO.g:1436:1: ( '{' )
            {
            // InternalDTO.g:1436:1: ( '{' )
            // InternalDTO.g:1437:2: '{'
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
    // InternalDTO.g:1446:1: rule__Enum__Group__3 : rule__Enum__Group__3__Impl rule__Enum__Group__4 ;
    public final void rule__Enum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1450:1: ( rule__Enum__Group__3__Impl rule__Enum__Group__4 )
            // InternalDTO.g:1451:2: rule__Enum__Group__3__Impl rule__Enum__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalDTO.g:1458:1: rule__Enum__Group__3__Impl : ( ( rule__Enum__AttributesAssignment_3 )* ) ;
    public final void rule__Enum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1462:1: ( ( ( rule__Enum__AttributesAssignment_3 )* ) )
            // InternalDTO.g:1463:1: ( ( rule__Enum__AttributesAssignment_3 )* )
            {
            // InternalDTO.g:1463:1: ( ( rule__Enum__AttributesAssignment_3 )* )
            // InternalDTO.g:1464:2: ( rule__Enum__AttributesAssignment_3 )*
            {
             before(grammarAccess.getEnumAccess().getAttributesAssignment_3()); 
            // InternalDTO.g:1465:2: ( rule__Enum__AttributesAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1==RULE_ID) ) {
                        int LA14_3 = input.LA(3);

                        if ( ((LA14_3>=20 && LA14_3<=21)||LA14_3==36) ) {
                            alt14=1;
                        }


                    }


                }
                else if ( ((LA14_0>=22 && LA14_0<=26)||(LA14_0>=37 && LA14_0<=43)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDTO.g:1465:3: rule__Enum__AttributesAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Enum__AttributesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalDTO.g:1473:1: rule__Enum__Group__4 : rule__Enum__Group__4__Impl rule__Enum__Group__5 ;
    public final void rule__Enum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1477:1: ( rule__Enum__Group__4__Impl rule__Enum__Group__5 )
            // InternalDTO.g:1478:2: rule__Enum__Group__4__Impl rule__Enum__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalDTO.g:1485:1: rule__Enum__Group__4__Impl : ( ( ( rule__Enum__LiteralsAssignment_4 ) ) ( ( rule__Enum__LiteralsAssignment_4 )* ) ) ;
    public final void rule__Enum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1489:1: ( ( ( ( rule__Enum__LiteralsAssignment_4 ) ) ( ( rule__Enum__LiteralsAssignment_4 )* ) ) )
            // InternalDTO.g:1490:1: ( ( ( rule__Enum__LiteralsAssignment_4 ) ) ( ( rule__Enum__LiteralsAssignment_4 )* ) )
            {
            // InternalDTO.g:1490:1: ( ( ( rule__Enum__LiteralsAssignment_4 ) ) ( ( rule__Enum__LiteralsAssignment_4 )* ) )
            // InternalDTO.g:1491:2: ( ( rule__Enum__LiteralsAssignment_4 ) ) ( ( rule__Enum__LiteralsAssignment_4 )* )
            {
            // InternalDTO.g:1491:2: ( ( rule__Enum__LiteralsAssignment_4 ) )
            // InternalDTO.g:1492:3: ( rule__Enum__LiteralsAssignment_4 )
            {
             before(grammarAccess.getEnumAccess().getLiteralsAssignment_4()); 
            // InternalDTO.g:1493:3: ( rule__Enum__LiteralsAssignment_4 )
            // InternalDTO.g:1493:4: rule__Enum__LiteralsAssignment_4
            {
            pushFollow(FOLLOW_7);
            rule__Enum__LiteralsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getLiteralsAssignment_4()); 

            }

            // InternalDTO.g:1496:2: ( ( rule__Enum__LiteralsAssignment_4 )* )
            // InternalDTO.g:1497:3: ( rule__Enum__LiteralsAssignment_4 )*
            {
             before(grammarAccess.getEnumAccess().getLiteralsAssignment_4()); 
            // InternalDTO.g:1498:3: ( rule__Enum__LiteralsAssignment_4 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDTO.g:1498:4: rule__Enum__LiteralsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Enum__LiteralsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalDTO.g:1507:1: rule__Enum__Group__5 : rule__Enum__Group__5__Impl ;
    public final void rule__Enum__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1511:1: ( rule__Enum__Group__5__Impl )
            // InternalDTO.g:1512:2: rule__Enum__Group__5__Impl
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
    // InternalDTO.g:1518:1: rule__Enum__Group__5__Impl : ( '}' ) ;
    public final void rule__Enum__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1522:1: ( ( '}' ) )
            // InternalDTO.g:1523:1: ( '}' )
            {
            // InternalDTO.g:1523:1: ( '}' )
            // InternalDTO.g:1524:2: '}'
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
    // InternalDTO.g:1534:1: rule__EnumLiteral__Group__0 : rule__EnumLiteral__Group__0__Impl rule__EnumLiteral__Group__1 ;
    public final void rule__EnumLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1538:1: ( rule__EnumLiteral__Group__0__Impl rule__EnumLiteral__Group__1 )
            // InternalDTO.g:1539:2: rule__EnumLiteral__Group__0__Impl rule__EnumLiteral__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalDTO.g:1546:1: rule__EnumLiteral__Group__0__Impl : ( ( rule__EnumLiteral__NameAssignment_0 ) ) ;
    public final void rule__EnumLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1550:1: ( ( ( rule__EnumLiteral__NameAssignment_0 ) ) )
            // InternalDTO.g:1551:1: ( ( rule__EnumLiteral__NameAssignment_0 ) )
            {
            // InternalDTO.g:1551:1: ( ( rule__EnumLiteral__NameAssignment_0 ) )
            // InternalDTO.g:1552:2: ( rule__EnumLiteral__NameAssignment_0 )
            {
             before(grammarAccess.getEnumLiteralAccess().getNameAssignment_0()); 
            // InternalDTO.g:1553:2: ( rule__EnumLiteral__NameAssignment_0 )
            // InternalDTO.g:1553:3: rule__EnumLiteral__NameAssignment_0
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
    // InternalDTO.g:1561:1: rule__EnumLiteral__Group__1 : rule__EnumLiteral__Group__1__Impl ;
    public final void rule__EnumLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1565:1: ( rule__EnumLiteral__Group__1__Impl )
            // InternalDTO.g:1566:2: rule__EnumLiteral__Group__1__Impl
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
    // InternalDTO.g:1572:1: rule__EnumLiteral__Group__1__Impl : ( ( rule__EnumLiteral__Group_1__0 )? ) ;
    public final void rule__EnumLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1576:1: ( ( ( rule__EnumLiteral__Group_1__0 )? ) )
            // InternalDTO.g:1577:1: ( ( rule__EnumLiteral__Group_1__0 )? )
            {
            // InternalDTO.g:1577:1: ( ( rule__EnumLiteral__Group_1__0 )? )
            // InternalDTO.g:1578:2: ( rule__EnumLiteral__Group_1__0 )?
            {
             before(grammarAccess.getEnumLiteralAccess().getGroup_1()); 
            // InternalDTO.g:1579:2: ( rule__EnumLiteral__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDTO.g:1579:3: rule__EnumLiteral__Group_1__0
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
    // InternalDTO.g:1588:1: rule__EnumLiteral__Group_1__0 : rule__EnumLiteral__Group_1__0__Impl rule__EnumLiteral__Group_1__1 ;
    public final void rule__EnumLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1592:1: ( rule__EnumLiteral__Group_1__0__Impl rule__EnumLiteral__Group_1__1 )
            // InternalDTO.g:1593:2: rule__EnumLiteral__Group_1__0__Impl rule__EnumLiteral__Group_1__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalDTO.g:1600:1: rule__EnumLiteral__Group_1__0__Impl : ( '(' ) ;
    public final void rule__EnumLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1604:1: ( ( '(' ) )
            // InternalDTO.g:1605:1: ( '(' )
            {
            // InternalDTO.g:1605:1: ( '(' )
            // InternalDTO.g:1606:2: '('
            {
             before(grammarAccess.getEnumLiteralAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalDTO.g:1615:1: rule__EnumLiteral__Group_1__1 : rule__EnumLiteral__Group_1__1__Impl rule__EnumLiteral__Group_1__2 ;
    public final void rule__EnumLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1619:1: ( rule__EnumLiteral__Group_1__1__Impl rule__EnumLiteral__Group_1__2 )
            // InternalDTO.g:1620:2: rule__EnumLiteral__Group_1__1__Impl rule__EnumLiteral__Group_1__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalDTO.g:1627:1: rule__EnumLiteral__Group_1__1__Impl : ( ( rule__EnumLiteral__ParamsAssignment_1_1 ) ) ;
    public final void rule__EnumLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1631:1: ( ( ( rule__EnumLiteral__ParamsAssignment_1_1 ) ) )
            // InternalDTO.g:1632:1: ( ( rule__EnumLiteral__ParamsAssignment_1_1 ) )
            {
            // InternalDTO.g:1632:1: ( ( rule__EnumLiteral__ParamsAssignment_1_1 ) )
            // InternalDTO.g:1633:2: ( rule__EnumLiteral__ParamsAssignment_1_1 )
            {
             before(grammarAccess.getEnumLiteralAccess().getParamsAssignment_1_1()); 
            // InternalDTO.g:1634:2: ( rule__EnumLiteral__ParamsAssignment_1_1 )
            // InternalDTO.g:1634:3: rule__EnumLiteral__ParamsAssignment_1_1
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
    // InternalDTO.g:1642:1: rule__EnumLiteral__Group_1__2 : rule__EnumLiteral__Group_1__2__Impl rule__EnumLiteral__Group_1__3 ;
    public final void rule__EnumLiteral__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1646:1: ( rule__EnumLiteral__Group_1__2__Impl rule__EnumLiteral__Group_1__3 )
            // InternalDTO.g:1647:2: rule__EnumLiteral__Group_1__2__Impl rule__EnumLiteral__Group_1__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalDTO.g:1654:1: rule__EnumLiteral__Group_1__2__Impl : ( ( rule__EnumLiteral__Group_1_2__0 )* ) ;
    public final void rule__EnumLiteral__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1658:1: ( ( ( rule__EnumLiteral__Group_1_2__0 )* ) )
            // InternalDTO.g:1659:1: ( ( rule__EnumLiteral__Group_1_2__0 )* )
            {
            // InternalDTO.g:1659:1: ( ( rule__EnumLiteral__Group_1_2__0 )* )
            // InternalDTO.g:1660:2: ( rule__EnumLiteral__Group_1_2__0 )*
            {
             before(grammarAccess.getEnumLiteralAccess().getGroup_1_2()); 
            // InternalDTO.g:1661:2: ( rule__EnumLiteral__Group_1_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==30) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDTO.g:1661:3: rule__EnumLiteral__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__EnumLiteral__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalDTO.g:1669:1: rule__EnumLiteral__Group_1__3 : rule__EnumLiteral__Group_1__3__Impl ;
    public final void rule__EnumLiteral__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1673:1: ( rule__EnumLiteral__Group_1__3__Impl )
            // InternalDTO.g:1674:2: rule__EnumLiteral__Group_1__3__Impl
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
    // InternalDTO.g:1680:1: rule__EnumLiteral__Group_1__3__Impl : ( ')' ) ;
    public final void rule__EnumLiteral__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1684:1: ( ( ')' ) )
            // InternalDTO.g:1685:1: ( ')' )
            {
            // InternalDTO.g:1685:1: ( ')' )
            // InternalDTO.g:1686:2: ')'
            {
             before(grammarAccess.getEnumLiteralAccess().getRightParenthesisKeyword_1_3()); 
            match(input,29,FOLLOW_2); 
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
    // InternalDTO.g:1696:1: rule__EnumLiteral__Group_1_2__0 : rule__EnumLiteral__Group_1_2__0__Impl rule__EnumLiteral__Group_1_2__1 ;
    public final void rule__EnumLiteral__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1700:1: ( rule__EnumLiteral__Group_1_2__0__Impl rule__EnumLiteral__Group_1_2__1 )
            // InternalDTO.g:1701:2: rule__EnumLiteral__Group_1_2__0__Impl rule__EnumLiteral__Group_1_2__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalDTO.g:1708:1: rule__EnumLiteral__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__EnumLiteral__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1712:1: ( ( ',' ) )
            // InternalDTO.g:1713:1: ( ',' )
            {
            // InternalDTO.g:1713:1: ( ',' )
            // InternalDTO.g:1714:2: ','
            {
             before(grammarAccess.getEnumLiteralAccess().getCommaKeyword_1_2_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalDTO.g:1723:1: rule__EnumLiteral__Group_1_2__1 : rule__EnumLiteral__Group_1_2__1__Impl ;
    public final void rule__EnumLiteral__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1727:1: ( rule__EnumLiteral__Group_1_2__1__Impl )
            // InternalDTO.g:1728:2: rule__EnumLiteral__Group_1_2__1__Impl
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
    // InternalDTO.g:1734:1: rule__EnumLiteral__Group_1_2__1__Impl : ( ( rule__EnumLiteral__ParamsAssignment_1_2_1 ) ) ;
    public final void rule__EnumLiteral__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1738:1: ( ( ( rule__EnumLiteral__ParamsAssignment_1_2_1 ) ) )
            // InternalDTO.g:1739:1: ( ( rule__EnumLiteral__ParamsAssignment_1_2_1 ) )
            {
            // InternalDTO.g:1739:1: ( ( rule__EnumLiteral__ParamsAssignment_1_2_1 ) )
            // InternalDTO.g:1740:2: ( rule__EnumLiteral__ParamsAssignment_1_2_1 )
            {
             before(grammarAccess.getEnumLiteralAccess().getParamsAssignment_1_2_1()); 
            // InternalDTO.g:1741:2: ( rule__EnumLiteral__ParamsAssignment_1_2_1 )
            // InternalDTO.g:1741:3: rule__EnumLiteral__ParamsAssignment_1_2_1
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
    // InternalDTO.g:1750:1: rule__Constant__Group_0__0 : rule__Constant__Group_0__0__Impl rule__Constant__Group_0__1 ;
    public final void rule__Constant__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1754:1: ( rule__Constant__Group_0__0__Impl rule__Constant__Group_0__1 )
            // InternalDTO.g:1755:2: rule__Constant__Group_0__0__Impl rule__Constant__Group_0__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalDTO.g:1762:1: rule__Constant__Group_0__0__Impl : ( () ) ;
    public final void rule__Constant__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1766:1: ( ( () ) )
            // InternalDTO.g:1767:1: ( () )
            {
            // InternalDTO.g:1767:1: ( () )
            // InternalDTO.g:1768:2: ()
            {
             before(grammarAccess.getConstantAccess().getIntConstantAction_0_0()); 
            // InternalDTO.g:1769:2: ()
            // InternalDTO.g:1769:3: 
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
    // InternalDTO.g:1777:1: rule__Constant__Group_0__1 : rule__Constant__Group_0__1__Impl ;
    public final void rule__Constant__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1781:1: ( rule__Constant__Group_0__1__Impl )
            // InternalDTO.g:1782:2: rule__Constant__Group_0__1__Impl
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
    // InternalDTO.g:1788:1: rule__Constant__Group_0__1__Impl : ( ( rule__Constant__ValueAssignment_0_1 ) ) ;
    public final void rule__Constant__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1792:1: ( ( ( rule__Constant__ValueAssignment_0_1 ) ) )
            // InternalDTO.g:1793:1: ( ( rule__Constant__ValueAssignment_0_1 ) )
            {
            // InternalDTO.g:1793:1: ( ( rule__Constant__ValueAssignment_0_1 ) )
            // InternalDTO.g:1794:2: ( rule__Constant__ValueAssignment_0_1 )
            {
             before(grammarAccess.getConstantAccess().getValueAssignment_0_1()); 
            // InternalDTO.g:1795:2: ( rule__Constant__ValueAssignment_0_1 )
            // InternalDTO.g:1795:3: rule__Constant__ValueAssignment_0_1
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
    // InternalDTO.g:1804:1: rule__Constant__Group_1__0 : rule__Constant__Group_1__0__Impl rule__Constant__Group_1__1 ;
    public final void rule__Constant__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1808:1: ( rule__Constant__Group_1__0__Impl rule__Constant__Group_1__1 )
            // InternalDTO.g:1809:2: rule__Constant__Group_1__0__Impl rule__Constant__Group_1__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalDTO.g:1816:1: rule__Constant__Group_1__0__Impl : ( () ) ;
    public final void rule__Constant__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1820:1: ( ( () ) )
            // InternalDTO.g:1821:1: ( () )
            {
            // InternalDTO.g:1821:1: ( () )
            // InternalDTO.g:1822:2: ()
            {
             before(grammarAccess.getConstantAccess().getLongConstantAction_1_0()); 
            // InternalDTO.g:1823:2: ()
            // InternalDTO.g:1823:3: 
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
    // InternalDTO.g:1831:1: rule__Constant__Group_1__1 : rule__Constant__Group_1__1__Impl rule__Constant__Group_1__2 ;
    public final void rule__Constant__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1835:1: ( rule__Constant__Group_1__1__Impl rule__Constant__Group_1__2 )
            // InternalDTO.g:1836:2: rule__Constant__Group_1__1__Impl rule__Constant__Group_1__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalDTO.g:1843:1: rule__Constant__Group_1__1__Impl : ( ( rule__Constant__ValueAssignment_1_1 ) ) ;
    public final void rule__Constant__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1847:1: ( ( ( rule__Constant__ValueAssignment_1_1 ) ) )
            // InternalDTO.g:1848:1: ( ( rule__Constant__ValueAssignment_1_1 ) )
            {
            // InternalDTO.g:1848:1: ( ( rule__Constant__ValueAssignment_1_1 ) )
            // InternalDTO.g:1849:2: ( rule__Constant__ValueAssignment_1_1 )
            {
             before(grammarAccess.getConstantAccess().getValueAssignment_1_1()); 
            // InternalDTO.g:1850:2: ( rule__Constant__ValueAssignment_1_1 )
            // InternalDTO.g:1850:3: rule__Constant__ValueAssignment_1_1
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
    // InternalDTO.g:1858:1: rule__Constant__Group_1__2 : rule__Constant__Group_1__2__Impl ;
    public final void rule__Constant__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1862:1: ( rule__Constant__Group_1__2__Impl )
            // InternalDTO.g:1863:2: rule__Constant__Group_1__2__Impl
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
    // InternalDTO.g:1869:1: rule__Constant__Group_1__2__Impl : ( 'L' ) ;
    public final void rule__Constant__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1873:1: ( ( 'L' ) )
            // InternalDTO.g:1874:1: ( 'L' )
            {
            // InternalDTO.g:1874:1: ( 'L' )
            // InternalDTO.g:1875:2: 'L'
            {
             before(grammarAccess.getConstantAccess().getLKeyword_1_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalDTO.g:1885:1: rule__Constant__Group_2__0 : rule__Constant__Group_2__0__Impl rule__Constant__Group_2__1 ;
    public final void rule__Constant__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1889:1: ( rule__Constant__Group_2__0__Impl rule__Constant__Group_2__1 )
            // InternalDTO.g:1890:2: rule__Constant__Group_2__0__Impl rule__Constant__Group_2__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalDTO.g:1897:1: rule__Constant__Group_2__0__Impl : ( () ) ;
    public final void rule__Constant__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1901:1: ( ( () ) )
            // InternalDTO.g:1902:1: ( () )
            {
            // InternalDTO.g:1902:1: ( () )
            // InternalDTO.g:1903:2: ()
            {
             before(grammarAccess.getConstantAccess().getStringConstantAction_2_0()); 
            // InternalDTO.g:1904:2: ()
            // InternalDTO.g:1904:3: 
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
    // InternalDTO.g:1912:1: rule__Constant__Group_2__1 : rule__Constant__Group_2__1__Impl ;
    public final void rule__Constant__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1916:1: ( rule__Constant__Group_2__1__Impl )
            // InternalDTO.g:1917:2: rule__Constant__Group_2__1__Impl
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
    // InternalDTO.g:1923:1: rule__Constant__Group_2__1__Impl : ( ( rule__Constant__ValueAssignment_2_1 ) ) ;
    public final void rule__Constant__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1927:1: ( ( ( rule__Constant__ValueAssignment_2_1 ) ) )
            // InternalDTO.g:1928:1: ( ( rule__Constant__ValueAssignment_2_1 ) )
            {
            // InternalDTO.g:1928:1: ( ( rule__Constant__ValueAssignment_2_1 ) )
            // InternalDTO.g:1929:2: ( rule__Constant__ValueAssignment_2_1 )
            {
             before(grammarAccess.getConstantAccess().getValueAssignment_2_1()); 
            // InternalDTO.g:1930:2: ( rule__Constant__ValueAssignment_2_1 )
            // InternalDTO.g:1930:3: rule__Constant__ValueAssignment_2_1
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
    // InternalDTO.g:1939:1: rule__Constant__Group_3__0 : rule__Constant__Group_3__0__Impl rule__Constant__Group_3__1 ;
    public final void rule__Constant__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1943:1: ( rule__Constant__Group_3__0__Impl rule__Constant__Group_3__1 )
            // InternalDTO.g:1944:2: rule__Constant__Group_3__0__Impl rule__Constant__Group_3__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalDTO.g:1951:1: rule__Constant__Group_3__0__Impl : ( () ) ;
    public final void rule__Constant__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1955:1: ( ( () ) )
            // InternalDTO.g:1956:1: ( () )
            {
            // InternalDTO.g:1956:1: ( () )
            // InternalDTO.g:1957:2: ()
            {
             before(grammarAccess.getConstantAccess().getBoolConstantAction_3_0()); 
            // InternalDTO.g:1958:2: ()
            // InternalDTO.g:1958:3: 
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
    // InternalDTO.g:1966:1: rule__Constant__Group_3__1 : rule__Constant__Group_3__1__Impl ;
    public final void rule__Constant__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1970:1: ( rule__Constant__Group_3__1__Impl )
            // InternalDTO.g:1971:2: rule__Constant__Group_3__1__Impl
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
    // InternalDTO.g:1977:1: rule__Constant__Group_3__1__Impl : ( ( rule__Constant__ValueAssignment_3_1 ) ) ;
    public final void rule__Constant__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1981:1: ( ( ( rule__Constant__ValueAssignment_3_1 ) ) )
            // InternalDTO.g:1982:1: ( ( rule__Constant__ValueAssignment_3_1 ) )
            {
            // InternalDTO.g:1982:1: ( ( rule__Constant__ValueAssignment_3_1 ) )
            // InternalDTO.g:1983:2: ( rule__Constant__ValueAssignment_3_1 )
            {
             before(grammarAccess.getConstantAccess().getValueAssignment_3_1()); 
            // InternalDTO.g:1984:2: ( rule__Constant__ValueAssignment_3_1 )
            // InternalDTO.g:1984:3: rule__Constant__ValueAssignment_3_1
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
    // InternalDTO.g:1993:1: rule__Constant__Group_4__0 : rule__Constant__Group_4__0__Impl rule__Constant__Group_4__1 ;
    public final void rule__Constant__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1997:1: ( rule__Constant__Group_4__0__Impl rule__Constant__Group_4__1 )
            // InternalDTO.g:1998:2: rule__Constant__Group_4__0__Impl rule__Constant__Group_4__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalDTO.g:2005:1: rule__Constant__Group_4__0__Impl : ( () ) ;
    public final void rule__Constant__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2009:1: ( ( () ) )
            // InternalDTO.g:2010:1: ( () )
            {
            // InternalDTO.g:2010:1: ( () )
            // InternalDTO.g:2011:2: ()
            {
             before(grammarAccess.getConstantAccess().getDateConstantAction_4_0()); 
            // InternalDTO.g:2012:2: ()
            // InternalDTO.g:2012:3: 
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
    // InternalDTO.g:2020:1: rule__Constant__Group_4__1 : rule__Constant__Group_4__1__Impl rule__Constant__Group_4__2 ;
    public final void rule__Constant__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2024:1: ( rule__Constant__Group_4__1__Impl rule__Constant__Group_4__2 )
            // InternalDTO.g:2025:2: rule__Constant__Group_4__1__Impl rule__Constant__Group_4__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalDTO.g:2032:1: rule__Constant__Group_4__1__Impl : ( ( rule__Constant__DayAssignment_4_1 ) ) ;
    public final void rule__Constant__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2036:1: ( ( ( rule__Constant__DayAssignment_4_1 ) ) )
            // InternalDTO.g:2037:1: ( ( rule__Constant__DayAssignment_4_1 ) )
            {
            // InternalDTO.g:2037:1: ( ( rule__Constant__DayAssignment_4_1 ) )
            // InternalDTO.g:2038:2: ( rule__Constant__DayAssignment_4_1 )
            {
             before(grammarAccess.getConstantAccess().getDayAssignment_4_1()); 
            // InternalDTO.g:2039:2: ( rule__Constant__DayAssignment_4_1 )
            // InternalDTO.g:2039:3: rule__Constant__DayAssignment_4_1
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
    // InternalDTO.g:2047:1: rule__Constant__Group_4__2 : rule__Constant__Group_4__2__Impl rule__Constant__Group_4__3 ;
    public final void rule__Constant__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2051:1: ( rule__Constant__Group_4__2__Impl rule__Constant__Group_4__3 )
            // InternalDTO.g:2052:2: rule__Constant__Group_4__2__Impl rule__Constant__Group_4__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalDTO.g:2059:1: rule__Constant__Group_4__2__Impl : ( '/' ) ;
    public final void rule__Constant__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2063:1: ( ( '/' ) )
            // InternalDTO.g:2064:1: ( '/' )
            {
            // InternalDTO.g:2064:1: ( '/' )
            // InternalDTO.g:2065:2: '/'
            {
             before(grammarAccess.getConstantAccess().getSolidusKeyword_4_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalDTO.g:2074:1: rule__Constant__Group_4__3 : rule__Constant__Group_4__3__Impl rule__Constant__Group_4__4 ;
    public final void rule__Constant__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2078:1: ( rule__Constant__Group_4__3__Impl rule__Constant__Group_4__4 )
            // InternalDTO.g:2079:2: rule__Constant__Group_4__3__Impl rule__Constant__Group_4__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalDTO.g:2086:1: rule__Constant__Group_4__3__Impl : ( ( rule__Constant__MonthAssignment_4_3 ) ) ;
    public final void rule__Constant__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2090:1: ( ( ( rule__Constant__MonthAssignment_4_3 ) ) )
            // InternalDTO.g:2091:1: ( ( rule__Constant__MonthAssignment_4_3 ) )
            {
            // InternalDTO.g:2091:1: ( ( rule__Constant__MonthAssignment_4_3 ) )
            // InternalDTO.g:2092:2: ( rule__Constant__MonthAssignment_4_3 )
            {
             before(grammarAccess.getConstantAccess().getMonthAssignment_4_3()); 
            // InternalDTO.g:2093:2: ( rule__Constant__MonthAssignment_4_3 )
            // InternalDTO.g:2093:3: rule__Constant__MonthAssignment_4_3
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
    // InternalDTO.g:2101:1: rule__Constant__Group_4__4 : rule__Constant__Group_4__4__Impl rule__Constant__Group_4__5 ;
    public final void rule__Constant__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2105:1: ( rule__Constant__Group_4__4__Impl rule__Constant__Group_4__5 )
            // InternalDTO.g:2106:2: rule__Constant__Group_4__4__Impl rule__Constant__Group_4__5
            {
            pushFollow(FOLLOW_22);
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
    // InternalDTO.g:2113:1: rule__Constant__Group_4__4__Impl : ( '/' ) ;
    public final void rule__Constant__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2117:1: ( ( '/' ) )
            // InternalDTO.g:2118:1: ( '/' )
            {
            // InternalDTO.g:2118:1: ( '/' )
            // InternalDTO.g:2119:2: '/'
            {
             before(grammarAccess.getConstantAccess().getSolidusKeyword_4_4()); 
            match(input,32,FOLLOW_2); 
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
    // InternalDTO.g:2128:1: rule__Constant__Group_4__5 : rule__Constant__Group_4__5__Impl ;
    public final void rule__Constant__Group_4__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2132:1: ( rule__Constant__Group_4__5__Impl )
            // InternalDTO.g:2133:2: rule__Constant__Group_4__5__Impl
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
    // InternalDTO.g:2139:1: rule__Constant__Group_4__5__Impl : ( ( rule__Constant__YearAssignment_4_5 ) ) ;
    public final void rule__Constant__Group_4__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2143:1: ( ( ( rule__Constant__YearAssignment_4_5 ) ) )
            // InternalDTO.g:2144:1: ( ( rule__Constant__YearAssignment_4_5 ) )
            {
            // InternalDTO.g:2144:1: ( ( rule__Constant__YearAssignment_4_5 ) )
            // InternalDTO.g:2145:2: ( rule__Constant__YearAssignment_4_5 )
            {
             before(grammarAccess.getConstantAccess().getYearAssignment_4_5()); 
            // InternalDTO.g:2146:2: ( rule__Constant__YearAssignment_4_5 )
            // InternalDTO.g:2146:3: rule__Constant__YearAssignment_4_5
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
    // InternalDTO.g:2155:1: rule__Constant__Group_5__0 : rule__Constant__Group_5__0__Impl rule__Constant__Group_5__1 ;
    public final void rule__Constant__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2159:1: ( rule__Constant__Group_5__0__Impl rule__Constant__Group_5__1 )
            // InternalDTO.g:2160:2: rule__Constant__Group_5__0__Impl rule__Constant__Group_5__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalDTO.g:2167:1: rule__Constant__Group_5__0__Impl : ( () ) ;
    public final void rule__Constant__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2171:1: ( ( () ) )
            // InternalDTO.g:2172:1: ( () )
            {
            // InternalDTO.g:2172:1: ( () )
            // InternalDTO.g:2173:2: ()
            {
             before(grammarAccess.getConstantAccess().getDecimalConstantAction_5_0()); 
            // InternalDTO.g:2174:2: ()
            // InternalDTO.g:2174:3: 
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
    // InternalDTO.g:2182:1: rule__Constant__Group_5__1 : rule__Constant__Group_5__1__Impl ;
    public final void rule__Constant__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2186:1: ( rule__Constant__Group_5__1__Impl )
            // InternalDTO.g:2187:2: rule__Constant__Group_5__1__Impl
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
    // InternalDTO.g:2193:1: rule__Constant__Group_5__1__Impl : ( ( rule__Constant__ValueAssignment_5_1 ) ) ;
    public final void rule__Constant__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2197:1: ( ( ( rule__Constant__ValueAssignment_5_1 ) ) )
            // InternalDTO.g:2198:1: ( ( rule__Constant__ValueAssignment_5_1 ) )
            {
            // InternalDTO.g:2198:1: ( ( rule__Constant__ValueAssignment_5_1 ) )
            // InternalDTO.g:2199:2: ( rule__Constant__ValueAssignment_5_1 )
            {
             before(grammarAccess.getConstantAccess().getValueAssignment_5_1()); 
            // InternalDTO.g:2200:2: ( rule__Constant__ValueAssignment_5_1 )
            // InternalDTO.g:2200:3: rule__Constant__ValueAssignment_5_1
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
    // InternalDTO.g:2209:1: rule__Constant__Group_6__0 : rule__Constant__Group_6__0__Impl rule__Constant__Group_6__1 ;
    public final void rule__Constant__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2213:1: ( rule__Constant__Group_6__0__Impl rule__Constant__Group_6__1 )
            // InternalDTO.g:2214:2: rule__Constant__Group_6__0__Impl rule__Constant__Group_6__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalDTO.g:2221:1: rule__Constant__Group_6__0__Impl : ( () ) ;
    public final void rule__Constant__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2225:1: ( ( () ) )
            // InternalDTO.g:2226:1: ( () )
            {
            // InternalDTO.g:2226:1: ( () )
            // InternalDTO.g:2227:2: ()
            {
             before(grammarAccess.getConstantAccess().getNullAction_6_0()); 
            // InternalDTO.g:2228:2: ()
            // InternalDTO.g:2228:3: 
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
    // InternalDTO.g:2236:1: rule__Constant__Group_6__1 : rule__Constant__Group_6__1__Impl ;
    public final void rule__Constant__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2240:1: ( rule__Constant__Group_6__1__Impl )
            // InternalDTO.g:2241:2: rule__Constant__Group_6__1__Impl
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
    // InternalDTO.g:2247:1: rule__Constant__Group_6__1__Impl : ( 'null' ) ;
    public final void rule__Constant__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2251:1: ( ( 'null' ) )
            // InternalDTO.g:2252:1: ( 'null' )
            {
            // InternalDTO.g:2252:1: ( 'null' )
            // InternalDTO.g:2253:2: 'null'
            {
             before(grammarAccess.getConstantAccess().getNullKeyword_6_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalDTO.g:2263:1: rule__EntityOption__Group_0__0 : rule__EntityOption__Group_0__0__Impl rule__EntityOption__Group_0__1 ;
    public final void rule__EntityOption__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2267:1: ( rule__EntityOption__Group_0__0__Impl rule__EntityOption__Group_0__1 )
            // InternalDTO.g:2268:2: rule__EntityOption__Group_0__0__Impl rule__EntityOption__Group_0__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalDTO.g:2275:1: rule__EntityOption__Group_0__0__Impl : ( () ) ;
    public final void rule__EntityOption__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2279:1: ( ( () ) )
            // InternalDTO.g:2280:1: ( () )
            {
            // InternalDTO.g:2280:1: ( () )
            // InternalDTO.g:2281:2: ()
            {
             before(grammarAccess.getEntityOptionAccess().getEntityDeleteOptionAction_0_0()); 
            // InternalDTO.g:2282:2: ()
            // InternalDTO.g:2282:3: 
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
    // InternalDTO.g:2290:1: rule__EntityOption__Group_0__1 : rule__EntityOption__Group_0__1__Impl ;
    public final void rule__EntityOption__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2294:1: ( rule__EntityOption__Group_0__1__Impl )
            // InternalDTO.g:2295:2: rule__EntityOption__Group_0__1__Impl
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
    // InternalDTO.g:2301:1: rule__EntityOption__Group_0__1__Impl : ( ( rule__EntityOption__DeleteByFlagAssignment_0_1 ) ) ;
    public final void rule__EntityOption__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2305:1: ( ( ( rule__EntityOption__DeleteByFlagAssignment_0_1 ) ) )
            // InternalDTO.g:2306:1: ( ( rule__EntityOption__DeleteByFlagAssignment_0_1 ) )
            {
            // InternalDTO.g:2306:1: ( ( rule__EntityOption__DeleteByFlagAssignment_0_1 ) )
            // InternalDTO.g:2307:2: ( rule__EntityOption__DeleteByFlagAssignment_0_1 )
            {
             before(grammarAccess.getEntityOptionAccess().getDeleteByFlagAssignment_0_1()); 
            // InternalDTO.g:2308:2: ( rule__EntityOption__DeleteByFlagAssignment_0_1 )
            // InternalDTO.g:2308:3: rule__EntityOption__DeleteByFlagAssignment_0_1
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
    // InternalDTO.g:2317:1: rule__EntityOption__Group_1__0 : rule__EntityOption__Group_1__0__Impl rule__EntityOption__Group_1__1 ;
    public final void rule__EntityOption__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2321:1: ( rule__EntityOption__Group_1__0__Impl rule__EntityOption__Group_1__1 )
            // InternalDTO.g:2322:2: rule__EntityOption__Group_1__0__Impl rule__EntityOption__Group_1__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalDTO.g:2329:1: rule__EntityOption__Group_1__0__Impl : ( () ) ;
    public final void rule__EntityOption__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2333:1: ( ( () ) )
            // InternalDTO.g:2334:1: ( () )
            {
            // InternalDTO.g:2334:1: ( () )
            // InternalDTO.g:2335:2: ()
            {
             before(grammarAccess.getEntityOptionAccess().getInheritanceMappingOptionAction_1_0()); 
            // InternalDTO.g:2336:2: ()
            // InternalDTO.g:2336:3: 
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
    // InternalDTO.g:2344:1: rule__EntityOption__Group_1__1 : rule__EntityOption__Group_1__1__Impl rule__EntityOption__Group_1__2 ;
    public final void rule__EntityOption__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2348:1: ( rule__EntityOption__Group_1__1__Impl rule__EntityOption__Group_1__2 )
            // InternalDTO.g:2349:2: rule__EntityOption__Group_1__1__Impl rule__EntityOption__Group_1__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalDTO.g:2356:1: rule__EntityOption__Group_1__1__Impl : ( 'inheritance' ) ;
    public final void rule__EntityOption__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2360:1: ( ( 'inheritance' ) )
            // InternalDTO.g:2361:1: ( 'inheritance' )
            {
            // InternalDTO.g:2361:1: ( 'inheritance' )
            // InternalDTO.g:2362:2: 'inheritance'
            {
             before(grammarAccess.getEntityOptionAccess().getInheritanceKeyword_1_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalDTO.g:2371:1: rule__EntityOption__Group_1__2 : rule__EntityOption__Group_1__2__Impl rule__EntityOption__Group_1__3 ;
    public final void rule__EntityOption__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2375:1: ( rule__EntityOption__Group_1__2__Impl rule__EntityOption__Group_1__3 )
            // InternalDTO.g:2376:2: rule__EntityOption__Group_1__2__Impl rule__EntityOption__Group_1__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalDTO.g:2383:1: rule__EntityOption__Group_1__2__Impl : ( '=' ) ;
    public final void rule__EntityOption__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2387:1: ( ( '=' ) )
            // InternalDTO.g:2388:1: ( '=' )
            {
            // InternalDTO.g:2388:1: ( '=' )
            // InternalDTO.g:2389:2: '='
            {
             before(grammarAccess.getEntityOptionAccess().getEqualsSignKeyword_1_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalDTO.g:2398:1: rule__EntityOption__Group_1__3 : rule__EntityOption__Group_1__3__Impl ;
    public final void rule__EntityOption__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2402:1: ( rule__EntityOption__Group_1__3__Impl )
            // InternalDTO.g:2403:2: rule__EntityOption__Group_1__3__Impl
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
    // InternalDTO.g:2409:1: rule__EntityOption__Group_1__3__Impl : ( ( rule__EntityOption__InheritanceMappingAssignment_1_3 ) ) ;
    public final void rule__EntityOption__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2413:1: ( ( ( rule__EntityOption__InheritanceMappingAssignment_1_3 ) ) )
            // InternalDTO.g:2414:1: ( ( rule__EntityOption__InheritanceMappingAssignment_1_3 ) )
            {
            // InternalDTO.g:2414:1: ( ( rule__EntityOption__InheritanceMappingAssignment_1_3 ) )
            // InternalDTO.g:2415:2: ( rule__EntityOption__InheritanceMappingAssignment_1_3 )
            {
             before(grammarAccess.getEntityOptionAccess().getInheritanceMappingAssignment_1_3()); 
            // InternalDTO.g:2416:2: ( rule__EntityOption__InheritanceMappingAssignment_1_3 )
            // InternalDTO.g:2416:3: rule__EntityOption__InheritanceMappingAssignment_1_3
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
    // InternalDTO.g:2425:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2429:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalDTO.g:2430:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalDTO.g:2437:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__TypeAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2441:1: ( ( ( rule__Attribute__TypeAssignment_0 ) ) )
            // InternalDTO.g:2442:1: ( ( rule__Attribute__TypeAssignment_0 ) )
            {
            // InternalDTO.g:2442:1: ( ( rule__Attribute__TypeAssignment_0 ) )
            // InternalDTO.g:2443:2: ( rule__Attribute__TypeAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_0()); 
            // InternalDTO.g:2444:2: ( rule__Attribute__TypeAssignment_0 )
            // InternalDTO.g:2444:3: rule__Attribute__TypeAssignment_0
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
    // InternalDTO.g:2452:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2456:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalDTO.g:2457:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalDTO.g:2464:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2468:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalDTO.g:2469:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalDTO.g:2469:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalDTO.g:2470:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalDTO.g:2471:2: ( rule__Attribute__NameAssignment_1 )
            // InternalDTO.g:2471:3: rule__Attribute__NameAssignment_1
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
    // InternalDTO.g:2479:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2483:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalDTO.g:2484:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalDTO.g:2491:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__Group_2__0 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2495:1: ( ( ( rule__Attribute__Group_2__0 )? ) )
            // InternalDTO.g:2496:1: ( ( rule__Attribute__Group_2__0 )? )
            {
            // InternalDTO.g:2496:1: ( ( rule__Attribute__Group_2__0 )? )
            // InternalDTO.g:2497:2: ( rule__Attribute__Group_2__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_2()); 
            // InternalDTO.g:2498:2: ( rule__Attribute__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=20 && LA18_0<=21)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDTO.g:2498:3: rule__Attribute__Group_2__0
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
    // InternalDTO.g:2506:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2510:1: ( rule__Attribute__Group__3__Impl )
            // InternalDTO.g:2511:2: rule__Attribute__Group__3__Impl
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
    // InternalDTO.g:2517:1: rule__Attribute__Group__3__Impl : ( ';' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2521:1: ( ( ';' ) )
            // InternalDTO.g:2522:1: ( ';' )
            {
            // InternalDTO.g:2522:1: ( ';' )
            // InternalDTO.g:2523:2: ';'
            {
             before(grammarAccess.getAttributeAccess().getSemicolonKeyword_3()); 
            match(input,36,FOLLOW_2); 
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
    // InternalDTO.g:2533:1: rule__Attribute__Group_2__0 : rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1 ;
    public final void rule__Attribute__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2537:1: ( rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1 )
            // InternalDTO.g:2538:2: rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalDTO.g:2545:1: rule__Attribute__Group_2__0__Impl : ( ( rule__Attribute__OptionsAssignment_2_0 ) ) ;
    public final void rule__Attribute__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2549:1: ( ( ( rule__Attribute__OptionsAssignment_2_0 ) ) )
            // InternalDTO.g:2550:1: ( ( rule__Attribute__OptionsAssignment_2_0 ) )
            {
            // InternalDTO.g:2550:1: ( ( rule__Attribute__OptionsAssignment_2_0 ) )
            // InternalDTO.g:2551:2: ( rule__Attribute__OptionsAssignment_2_0 )
            {
             before(grammarAccess.getAttributeAccess().getOptionsAssignment_2_0()); 
            // InternalDTO.g:2552:2: ( rule__Attribute__OptionsAssignment_2_0 )
            // InternalDTO.g:2552:3: rule__Attribute__OptionsAssignment_2_0
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
    // InternalDTO.g:2560:1: rule__Attribute__Group_2__1 : rule__Attribute__Group_2__1__Impl ;
    public final void rule__Attribute__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2564:1: ( rule__Attribute__Group_2__1__Impl )
            // InternalDTO.g:2565:2: rule__Attribute__Group_2__1__Impl
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
    // InternalDTO.g:2571:1: rule__Attribute__Group_2__1__Impl : ( ( rule__Attribute__Group_2_1__0 )* ) ;
    public final void rule__Attribute__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2575:1: ( ( ( rule__Attribute__Group_2_1__0 )* ) )
            // InternalDTO.g:2576:1: ( ( rule__Attribute__Group_2_1__0 )* )
            {
            // InternalDTO.g:2576:1: ( ( rule__Attribute__Group_2_1__0 )* )
            // InternalDTO.g:2577:2: ( rule__Attribute__Group_2_1__0 )*
            {
             before(grammarAccess.getAttributeAccess().getGroup_2_1()); 
            // InternalDTO.g:2578:2: ( rule__Attribute__Group_2_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==30) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalDTO.g:2578:3: rule__Attribute__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Attribute__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalDTO.g:2587:1: rule__Attribute__Group_2_1__0 : rule__Attribute__Group_2_1__0__Impl rule__Attribute__Group_2_1__1 ;
    public final void rule__Attribute__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2591:1: ( rule__Attribute__Group_2_1__0__Impl rule__Attribute__Group_2_1__1 )
            // InternalDTO.g:2592:2: rule__Attribute__Group_2_1__0__Impl rule__Attribute__Group_2_1__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalDTO.g:2599:1: rule__Attribute__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Attribute__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2603:1: ( ( ',' ) )
            // InternalDTO.g:2604:1: ( ',' )
            {
            // InternalDTO.g:2604:1: ( ',' )
            // InternalDTO.g:2605:2: ','
            {
             before(grammarAccess.getAttributeAccess().getCommaKeyword_2_1_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalDTO.g:2614:1: rule__Attribute__Group_2_1__1 : rule__Attribute__Group_2_1__1__Impl ;
    public final void rule__Attribute__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2618:1: ( rule__Attribute__Group_2_1__1__Impl )
            // InternalDTO.g:2619:2: rule__Attribute__Group_2_1__1__Impl
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
    // InternalDTO.g:2625:1: rule__Attribute__Group_2_1__1__Impl : ( ( rule__Attribute__OptionsAssignment_2_1_1 ) ) ;
    public final void rule__Attribute__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2629:1: ( ( ( rule__Attribute__OptionsAssignment_2_1_1 ) ) )
            // InternalDTO.g:2630:1: ( ( rule__Attribute__OptionsAssignment_2_1_1 ) )
            {
            // InternalDTO.g:2630:1: ( ( rule__Attribute__OptionsAssignment_2_1_1 ) )
            // InternalDTO.g:2631:2: ( rule__Attribute__OptionsAssignment_2_1_1 )
            {
             before(grammarAccess.getAttributeAccess().getOptionsAssignment_2_1_1()); 
            // InternalDTO.g:2632:2: ( rule__Attribute__OptionsAssignment_2_1_1 )
            // InternalDTO.g:2632:3: rule__Attribute__OptionsAssignment_2_1_1
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
    // InternalDTO.g:2641:1: superBasicType__Group_0__0 : superBasicType__Group_0__0__Impl superBasicType__Group_0__1 ;
    public final void superBasicType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2645:1: ( superBasicType__Group_0__0__Impl superBasicType__Group_0__1 )
            // InternalDTO.g:2646:2: superBasicType__Group_0__0__Impl superBasicType__Group_0__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalDTO.g:2653:1: superBasicType__Group_0__0__Impl : ( () ) ;
    public final void superBasicType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2657:1: ( ( () ) )
            // InternalDTO.g:2658:1: ( () )
            {
            // InternalDTO.g:2658:1: ( () )
            // InternalDTO.g:2659:2: ()
            {
             before(grammarAccess.getDomainModelBasicTypeAccess().getStringTypeAction_0_0()); 
            // InternalDTO.g:2660:2: ()
            // InternalDTO.g:2660:3: 
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
    // InternalDTO.g:2668:1: superBasicType__Group_0__1 : superBasicType__Group_0__1__Impl ;
    public final void superBasicType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2672:1: ( superBasicType__Group_0__1__Impl )
            // InternalDTO.g:2673:2: superBasicType__Group_0__1__Impl
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
    // InternalDTO.g:2679:1: superBasicType__Group_0__1__Impl : ( 'string' ) ;
    public final void superBasicType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2683:1: ( ( 'string' ) )
            // InternalDTO.g:2684:1: ( 'string' )
            {
            // InternalDTO.g:2684:1: ( 'string' )
            // InternalDTO.g:2685:2: 'string'
            {
             before(grammarAccess.getDomainModelBasicTypeAccess().getStringKeyword_0_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalDTO.g:2695:1: superBasicType__Group_1__0 : superBasicType__Group_1__0__Impl superBasicType__Group_1__1 ;
    public final void superBasicType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2699:1: ( superBasicType__Group_1__0__Impl superBasicType__Group_1__1 )
            // InternalDTO.g:2700:2: superBasicType__Group_1__0__Impl superBasicType__Group_1__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalDTO.g:2707:1: superBasicType__Group_1__0__Impl : ( () ) ;
    public final void superBasicType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2711:1: ( ( () ) )
            // InternalDTO.g:2712:1: ( () )
            {
            // InternalDTO.g:2712:1: ( () )
            // InternalDTO.g:2713:2: ()
            {
             before(grammarAccess.getDomainModelBasicTypeAccess().getIntTypeAction_1_0()); 
            // InternalDTO.g:2714:2: ()
            // InternalDTO.g:2714:3: 
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
    // InternalDTO.g:2722:1: superBasicType__Group_1__1 : superBasicType__Group_1__1__Impl ;
    public final void superBasicType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2726:1: ( superBasicType__Group_1__1__Impl )
            // InternalDTO.g:2727:2: superBasicType__Group_1__1__Impl
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
    // InternalDTO.g:2733:1: superBasicType__Group_1__1__Impl : ( 'int' ) ;
    public final void superBasicType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2737:1: ( ( 'int' ) )
            // InternalDTO.g:2738:1: ( 'int' )
            {
            // InternalDTO.g:2738:1: ( 'int' )
            // InternalDTO.g:2739:2: 'int'
            {
             before(grammarAccess.getDomainModelBasicTypeAccess().getIntKeyword_1_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalDTO.g:2749:1: superBasicType__Group_2__0 : superBasicType__Group_2__0__Impl superBasicType__Group_2__1 ;
    public final void superBasicType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2753:1: ( superBasicType__Group_2__0__Impl superBasicType__Group_2__1 )
            // InternalDTO.g:2754:2: superBasicType__Group_2__0__Impl superBasicType__Group_2__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalDTO.g:2761:1: superBasicType__Group_2__0__Impl : ( () ) ;
    public final void superBasicType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2765:1: ( ( () ) )
            // InternalDTO.g:2766:1: ( () )
            {
            // InternalDTO.g:2766:1: ( () )
            // InternalDTO.g:2767:2: ()
            {
             before(grammarAccess.getDomainModelBasicTypeAccess().getLongTypeAction_2_0()); 
            // InternalDTO.g:2768:2: ()
            // InternalDTO.g:2768:3: 
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
    // InternalDTO.g:2776:1: superBasicType__Group_2__1 : superBasicType__Group_2__1__Impl ;
    public final void superBasicType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2780:1: ( superBasicType__Group_2__1__Impl )
            // InternalDTO.g:2781:2: superBasicType__Group_2__1__Impl
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
    // InternalDTO.g:2787:1: superBasicType__Group_2__1__Impl : ( 'long' ) ;
    public final void superBasicType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2791:1: ( ( 'long' ) )
            // InternalDTO.g:2792:1: ( 'long' )
            {
            // InternalDTO.g:2792:1: ( 'long' )
            // InternalDTO.g:2793:2: 'long'
            {
             before(grammarAccess.getDomainModelBasicTypeAccess().getLongKeyword_2_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalDTO.g:2803:1: superBasicType__Group_3__0 : superBasicType__Group_3__0__Impl superBasicType__Group_3__1 ;
    public final void superBasicType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2807:1: ( superBasicType__Group_3__0__Impl superBasicType__Group_3__1 )
            // InternalDTO.g:2808:2: superBasicType__Group_3__0__Impl superBasicType__Group_3__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalDTO.g:2815:1: superBasicType__Group_3__0__Impl : ( () ) ;
    public final void superBasicType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2819:1: ( ( () ) )
            // InternalDTO.g:2820:1: ( () )
            {
            // InternalDTO.g:2820:1: ( () )
            // InternalDTO.g:2821:2: ()
            {
             before(grammarAccess.getDomainModelBasicTypeAccess().getBoolTypeAction_3_0()); 
            // InternalDTO.g:2822:2: ()
            // InternalDTO.g:2822:3: 
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
    // InternalDTO.g:2830:1: superBasicType__Group_3__1 : superBasicType__Group_3__1__Impl ;
    public final void superBasicType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2834:1: ( superBasicType__Group_3__1__Impl )
            // InternalDTO.g:2835:2: superBasicType__Group_3__1__Impl
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
    // InternalDTO.g:2841:1: superBasicType__Group_3__1__Impl : ( 'boolean' ) ;
    public final void superBasicType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2845:1: ( ( 'boolean' ) )
            // InternalDTO.g:2846:1: ( 'boolean' )
            {
            // InternalDTO.g:2846:1: ( 'boolean' )
            // InternalDTO.g:2847:2: 'boolean'
            {
             before(grammarAccess.getDomainModelBasicTypeAccess().getBooleanKeyword_3_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalDTO.g:2857:1: superBasicType__Group_4__0 : superBasicType__Group_4__0__Impl superBasicType__Group_4__1 ;
    public final void superBasicType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2861:1: ( superBasicType__Group_4__0__Impl superBasicType__Group_4__1 )
            // InternalDTO.g:2862:2: superBasicType__Group_4__0__Impl superBasicType__Group_4__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalDTO.g:2869:1: superBasicType__Group_4__0__Impl : ( () ) ;
    public final void superBasicType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2873:1: ( ( () ) )
            // InternalDTO.g:2874:1: ( () )
            {
            // InternalDTO.g:2874:1: ( () )
            // InternalDTO.g:2875:2: ()
            {
             before(grammarAccess.getDomainModelBasicTypeAccess().getDateTypeAction_4_0()); 
            // InternalDTO.g:2876:2: ()
            // InternalDTO.g:2876:3: 
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
    // InternalDTO.g:2884:1: superBasicType__Group_4__1 : superBasicType__Group_4__1__Impl ;
    public final void superBasicType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2888:1: ( superBasicType__Group_4__1__Impl )
            // InternalDTO.g:2889:2: superBasicType__Group_4__1__Impl
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
    // InternalDTO.g:2895:1: superBasicType__Group_4__1__Impl : ( 'date' ) ;
    public final void superBasicType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2899:1: ( ( 'date' ) )
            // InternalDTO.g:2900:1: ( 'date' )
            {
            // InternalDTO.g:2900:1: ( 'date' )
            // InternalDTO.g:2901:2: 'date'
            {
             before(grammarAccess.getDomainModelBasicTypeAccess().getDateKeyword_4_1()); 
            match(input,41,FOLLOW_2); 
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


    // $ANTLR start "superBasicType__Group_5__0"
    // InternalDTO.g:2911:1: superBasicType__Group_5__0 : superBasicType__Group_5__0__Impl superBasicType__Group_5__1 ;
    public final void superBasicType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2915:1: ( superBasicType__Group_5__0__Impl superBasicType__Group_5__1 )
            // InternalDTO.g:2916:2: superBasicType__Group_5__0__Impl superBasicType__Group_5__1
            {
            pushFollow(FOLLOW_39);
            superBasicType__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            superBasicType__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "superBasicType__Group_5__0"


    // $ANTLR start "superBasicType__Group_5__0__Impl"
    // InternalDTO.g:2923:1: superBasicType__Group_5__0__Impl : ( () ) ;
    public final void superBasicType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2927:1: ( ( () ) )
            // InternalDTO.g:2928:1: ( () )
            {
            // InternalDTO.g:2928:1: ( () )
            // InternalDTO.g:2929:2: ()
            {
             before(grammarAccess.getDomainModelBasicTypeAccess().getDecimalTypeAction_5_0()); 
            // InternalDTO.g:2930:2: ()
            // InternalDTO.g:2930:3: 
            {
            }

             after(grammarAccess.getDomainModelBasicTypeAccess().getDecimalTypeAction_5_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "superBasicType__Group_5__0__Impl"


    // $ANTLR start "superBasicType__Group_5__1"
    // InternalDTO.g:2938:1: superBasicType__Group_5__1 : superBasicType__Group_5__1__Impl ;
    public final void superBasicType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2942:1: ( superBasicType__Group_5__1__Impl )
            // InternalDTO.g:2943:2: superBasicType__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            superBasicType__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "superBasicType__Group_5__1"


    // $ANTLR start "superBasicType__Group_5__1__Impl"
    // InternalDTO.g:2949:1: superBasicType__Group_5__1__Impl : ( 'decimal' ) ;
    public final void superBasicType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2953:1: ( ( 'decimal' ) )
            // InternalDTO.g:2954:1: ( 'decimal' )
            {
            // InternalDTO.g:2954:1: ( 'decimal' )
            // InternalDTO.g:2955:2: 'decimal'
            {
             before(grammarAccess.getDomainModelBasicTypeAccess().getDecimalKeyword_5_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getDomainModelBasicTypeAccess().getDecimalKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "superBasicType__Group_5__1__Impl"


    // $ANTLR start "rule__CollectionType__Group__0"
    // InternalDTO.g:2965:1: rule__CollectionType__Group__0 : rule__CollectionType__Group__0__Impl rule__CollectionType__Group__1 ;
    public final void rule__CollectionType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2969:1: ( rule__CollectionType__Group__0__Impl rule__CollectionType__Group__1 )
            // InternalDTO.g:2970:2: rule__CollectionType__Group__0__Impl rule__CollectionType__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalDTO.g:2977:1: rule__CollectionType__Group__0__Impl : ( 'List' ) ;
    public final void rule__CollectionType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2981:1: ( ( 'List' ) )
            // InternalDTO.g:2982:1: ( 'List' )
            {
            // InternalDTO.g:2982:1: ( 'List' )
            // InternalDTO.g:2983:2: 'List'
            {
             before(grammarAccess.getCollectionTypeAccess().getListKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalDTO.g:2992:1: rule__CollectionType__Group__1 : rule__CollectionType__Group__1__Impl rule__CollectionType__Group__2 ;
    public final void rule__CollectionType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2996:1: ( rule__CollectionType__Group__1__Impl rule__CollectionType__Group__2 )
            // InternalDTO.g:2997:2: rule__CollectionType__Group__1__Impl rule__CollectionType__Group__2
            {
            pushFollow(FOLLOW_41);
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
    // InternalDTO.g:3004:1: rule__CollectionType__Group__1__Impl : ( '<' ) ;
    public final void rule__CollectionType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3008:1: ( ( '<' ) )
            // InternalDTO.g:3009:1: ( '<' )
            {
            // InternalDTO.g:3009:1: ( '<' )
            // InternalDTO.g:3010:2: '<'
            {
             before(grammarAccess.getCollectionTypeAccess().getLessThanSignKeyword_1()); 
            match(input,44,FOLLOW_2); 
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
    // InternalDTO.g:3019:1: rule__CollectionType__Group__2 : rule__CollectionType__Group__2__Impl rule__CollectionType__Group__3 ;
    public final void rule__CollectionType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3023:1: ( rule__CollectionType__Group__2__Impl rule__CollectionType__Group__3 )
            // InternalDTO.g:3024:2: rule__CollectionType__Group__2__Impl rule__CollectionType__Group__3
            {
            pushFollow(FOLLOW_42);
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
    // InternalDTO.g:3031:1: rule__CollectionType__Group__2__Impl : ( ( rule__CollectionType__OfTypeAssignment_2 ) ) ;
    public final void rule__CollectionType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3035:1: ( ( ( rule__CollectionType__OfTypeAssignment_2 ) ) )
            // InternalDTO.g:3036:1: ( ( rule__CollectionType__OfTypeAssignment_2 ) )
            {
            // InternalDTO.g:3036:1: ( ( rule__CollectionType__OfTypeAssignment_2 ) )
            // InternalDTO.g:3037:2: ( rule__CollectionType__OfTypeAssignment_2 )
            {
             before(grammarAccess.getCollectionTypeAccess().getOfTypeAssignment_2()); 
            // InternalDTO.g:3038:2: ( rule__CollectionType__OfTypeAssignment_2 )
            // InternalDTO.g:3038:3: rule__CollectionType__OfTypeAssignment_2
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
    // InternalDTO.g:3046:1: rule__CollectionType__Group__3 : rule__CollectionType__Group__3__Impl ;
    public final void rule__CollectionType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3050:1: ( rule__CollectionType__Group__3__Impl )
            // InternalDTO.g:3051:2: rule__CollectionType__Group__3__Impl
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
    // InternalDTO.g:3057:1: rule__CollectionType__Group__3__Impl : ( '>' ) ;
    public final void rule__CollectionType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3061:1: ( ( '>' ) )
            // InternalDTO.g:3062:1: ( '>' )
            {
            // InternalDTO.g:3062:1: ( '>' )
            // InternalDTO.g:3063:2: '>'
            {
             before(grammarAccess.getCollectionTypeAccess().getGreaterThanSignKeyword_3()); 
            match(input,45,FOLLOW_2); 
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


    // $ANTLR start "rule__Decimal__Group__0"
    // InternalDTO.g:3073:1: rule__Decimal__Group__0 : rule__Decimal__Group__0__Impl rule__Decimal__Group__1 ;
    public final void rule__Decimal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3077:1: ( rule__Decimal__Group__0__Impl rule__Decimal__Group__1 )
            // InternalDTO.g:3078:2: rule__Decimal__Group__0__Impl rule__Decimal__Group__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalDTO.g:3085:1: rule__Decimal__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Decimal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3089:1: ( ( RULE_INT ) )
            // InternalDTO.g:3090:1: ( RULE_INT )
            {
            // InternalDTO.g:3090:1: ( RULE_INT )
            // InternalDTO.g:3091:2: RULE_INT
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
    // InternalDTO.g:3100:1: rule__Decimal__Group__1 : rule__Decimal__Group__1__Impl rule__Decimal__Group__2 ;
    public final void rule__Decimal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3104:1: ( rule__Decimal__Group__1__Impl rule__Decimal__Group__2 )
            // InternalDTO.g:3105:2: rule__Decimal__Group__1__Impl rule__Decimal__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalDTO.g:3112:1: rule__Decimal__Group__1__Impl : ( '.' ) ;
    public final void rule__Decimal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3116:1: ( ( '.' ) )
            // InternalDTO.g:3117:1: ( '.' )
            {
            // InternalDTO.g:3117:1: ( '.' )
            // InternalDTO.g:3118:2: '.'
            {
             before(grammarAccess.getDecimalAccess().getFullStopKeyword_1()); 
            match(input,46,FOLLOW_2); 
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
    // InternalDTO.g:3127:1: rule__Decimal__Group__2 : rule__Decimal__Group__2__Impl ;
    public final void rule__Decimal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3131:1: ( rule__Decimal__Group__2__Impl )
            // InternalDTO.g:3132:2: rule__Decimal__Group__2__Impl
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
    // InternalDTO.g:3138:1: rule__Decimal__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__Decimal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3142:1: ( ( RULE_INT ) )
            // InternalDTO.g:3143:1: ( RULE_INT )
            {
            // InternalDTO.g:3143:1: ( RULE_INT )
            // InternalDTO.g:3144:2: RULE_INT
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


    // $ANTLR start "rule__DTOModel__ConceptsAssignment"
    // InternalDTO.g:3154:1: rule__DTOModel__ConceptsAssignment : ( ruleConcept ) ;
    public final void rule__DTOModel__ConceptsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3158:1: ( ( ruleConcept ) )
            // InternalDTO.g:3159:2: ( ruleConcept )
            {
            // InternalDTO.g:3159:2: ( ruleConcept )
            // InternalDTO.g:3160:3: ruleConcept
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
    // InternalDTO.g:3169:1: rule__DTOClass__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DTOClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3173:1: ( ( RULE_ID ) )
            // InternalDTO.g:3174:2: ( RULE_ID )
            {
            // InternalDTO.g:3174:2: ( RULE_ID )
            // InternalDTO.g:3175:3: RULE_ID
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
    // InternalDTO.g:3184:1: rule__DTOClass__SuperTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__DTOClass__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3188:1: ( ( ( RULE_ID ) ) )
            // InternalDTO.g:3189:2: ( ( RULE_ID ) )
            {
            // InternalDTO.g:3189:2: ( ( RULE_ID ) )
            // InternalDTO.g:3190:3: ( RULE_ID )
            {
             before(grammarAccess.getDTOClassAccess().getSuperTypeDTOClassCrossReference_2_1_0()); 
            // InternalDTO.g:3191:3: ( RULE_ID )
            // InternalDTO.g:3192:4: RULE_ID
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
    // InternalDTO.g:3203:1: rule__DTOClass__AttributesAssignment_4 : ( ruleAttribute ) ;
    public final void rule__DTOClass__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3207:1: ( ( ruleAttribute ) )
            // InternalDTO.g:3208:2: ( ruleAttribute )
            {
            // InternalDTO.g:3208:2: ( ruleAttribute )
            // InternalDTO.g:3209:3: ruleAttribute
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
    // InternalDTO.g:3218:1: rule__Enum__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Enum__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3222:1: ( ( RULE_ID ) )
            // InternalDTO.g:3223:2: ( RULE_ID )
            {
            // InternalDTO.g:3223:2: ( RULE_ID )
            // InternalDTO.g:3224:3: RULE_ID
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
    // InternalDTO.g:3233:1: rule__Enum__AttributesAssignment_3 : ( ruleAttribute ) ;
    public final void rule__Enum__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3237:1: ( ( ruleAttribute ) )
            // InternalDTO.g:3238:2: ( ruleAttribute )
            {
            // InternalDTO.g:3238:2: ( ruleAttribute )
            // InternalDTO.g:3239:3: ruleAttribute
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
    // InternalDTO.g:3248:1: rule__Enum__LiteralsAssignment_4 : ( ruleEnumLiteral ) ;
    public final void rule__Enum__LiteralsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3252:1: ( ( ruleEnumLiteral ) )
            // InternalDTO.g:3253:2: ( ruleEnumLiteral )
            {
            // InternalDTO.g:3253:2: ( ruleEnumLiteral )
            // InternalDTO.g:3254:3: ruleEnumLiteral
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
    // InternalDTO.g:3263:1: rule__EnumLiteral__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumLiteral__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3267:1: ( ( RULE_ID ) )
            // InternalDTO.g:3268:2: ( RULE_ID )
            {
            // InternalDTO.g:3268:2: ( RULE_ID )
            // InternalDTO.g:3269:3: RULE_ID
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
    // InternalDTO.g:3278:1: rule__EnumLiteral__ParamsAssignment_1_1 : ( ruleConstant ) ;
    public final void rule__EnumLiteral__ParamsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3282:1: ( ( ruleConstant ) )
            // InternalDTO.g:3283:2: ( ruleConstant )
            {
            // InternalDTO.g:3283:2: ( ruleConstant )
            // InternalDTO.g:3284:3: ruleConstant
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
    // InternalDTO.g:3293:1: rule__EnumLiteral__ParamsAssignment_1_2_1 : ( ruleConstant ) ;
    public final void rule__EnumLiteral__ParamsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3297:1: ( ( ruleConstant ) )
            // InternalDTO.g:3298:2: ( ruleConstant )
            {
            // InternalDTO.g:3298:2: ( ruleConstant )
            // InternalDTO.g:3299:3: ruleConstant
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
    // InternalDTO.g:3308:1: rule__Constant__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Constant__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3312:1: ( ( RULE_INT ) )
            // InternalDTO.g:3313:2: ( RULE_INT )
            {
            // InternalDTO.g:3313:2: ( RULE_INT )
            // InternalDTO.g:3314:3: RULE_INT
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
    // InternalDTO.g:3323:1: rule__Constant__ValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Constant__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3327:1: ( ( RULE_INT ) )
            // InternalDTO.g:3328:2: ( RULE_INT )
            {
            // InternalDTO.g:3328:2: ( RULE_INT )
            // InternalDTO.g:3329:3: RULE_INT
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
    // InternalDTO.g:3338:1: rule__Constant__ValueAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Constant__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3342:1: ( ( RULE_STRING ) )
            // InternalDTO.g:3343:2: ( RULE_STRING )
            {
            // InternalDTO.g:3343:2: ( RULE_STRING )
            // InternalDTO.g:3344:3: RULE_STRING
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
    // InternalDTO.g:3353:1: rule__Constant__ValueAssignment_3_1 : ( ( rule__Constant__ValueAlternatives_3_1_0 ) ) ;
    public final void rule__Constant__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3357:1: ( ( ( rule__Constant__ValueAlternatives_3_1_0 ) ) )
            // InternalDTO.g:3358:2: ( ( rule__Constant__ValueAlternatives_3_1_0 ) )
            {
            // InternalDTO.g:3358:2: ( ( rule__Constant__ValueAlternatives_3_1_0 ) )
            // InternalDTO.g:3359:3: ( rule__Constant__ValueAlternatives_3_1_0 )
            {
             before(grammarAccess.getConstantAccess().getValueAlternatives_3_1_0()); 
            // InternalDTO.g:3360:3: ( rule__Constant__ValueAlternatives_3_1_0 )
            // InternalDTO.g:3360:4: rule__Constant__ValueAlternatives_3_1_0
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
    // InternalDTO.g:3368:1: rule__Constant__DayAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__Constant__DayAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3372:1: ( ( RULE_INT ) )
            // InternalDTO.g:3373:2: ( RULE_INT )
            {
            // InternalDTO.g:3373:2: ( RULE_INT )
            // InternalDTO.g:3374:3: RULE_INT
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
    // InternalDTO.g:3383:1: rule__Constant__MonthAssignment_4_3 : ( RULE_INT ) ;
    public final void rule__Constant__MonthAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3387:1: ( ( RULE_INT ) )
            // InternalDTO.g:3388:2: ( RULE_INT )
            {
            // InternalDTO.g:3388:2: ( RULE_INT )
            // InternalDTO.g:3389:3: RULE_INT
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
    // InternalDTO.g:3398:1: rule__Constant__YearAssignment_4_5 : ( RULE_INT ) ;
    public final void rule__Constant__YearAssignment_4_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3402:1: ( ( RULE_INT ) )
            // InternalDTO.g:3403:2: ( RULE_INT )
            {
            // InternalDTO.g:3403:2: ( RULE_INT )
            // InternalDTO.g:3404:3: RULE_INT
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
    // InternalDTO.g:3413:1: rule__Constant__ValueAssignment_5_1 : ( ruleDecimal ) ;
    public final void rule__Constant__ValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3417:1: ( ( ruleDecimal ) )
            // InternalDTO.g:3418:2: ( ruleDecimal )
            {
            // InternalDTO.g:3418:2: ( ruleDecimal )
            // InternalDTO.g:3419:3: ruleDecimal
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
    // InternalDTO.g:3428:1: rule__EntityOption__DeleteByFlagAssignment_0_1 : ( ( 'deleteByFlag' ) ) ;
    public final void rule__EntityOption__DeleteByFlagAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3432:1: ( ( ( 'deleteByFlag' ) ) )
            // InternalDTO.g:3433:2: ( ( 'deleteByFlag' ) )
            {
            // InternalDTO.g:3433:2: ( ( 'deleteByFlag' ) )
            // InternalDTO.g:3434:3: ( 'deleteByFlag' )
            {
             before(grammarAccess.getEntityOptionAccess().getDeleteByFlagDeleteByFlagKeyword_0_1_0()); 
            // InternalDTO.g:3435:3: ( 'deleteByFlag' )
            // InternalDTO.g:3436:4: 'deleteByFlag'
            {
             before(grammarAccess.getEntityOptionAccess().getDeleteByFlagDeleteByFlagKeyword_0_1_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalDTO.g:3447:1: rule__EntityOption__InheritanceMappingAssignment_1_3 : ( ruleInheritanceMappingType ) ;
    public final void rule__EntityOption__InheritanceMappingAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3451:1: ( ( ruleInheritanceMappingType ) )
            // InternalDTO.g:3452:2: ( ruleInheritanceMappingType )
            {
            // InternalDTO.g:3452:2: ( ruleInheritanceMappingType )
            // InternalDTO.g:3453:3: ruleInheritanceMappingType
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
    // InternalDTO.g:3462:1: rule__InheritanceMappingType__TypeAssignment : ( ( rule__InheritanceMappingType__TypeAlternatives_0 ) ) ;
    public final void rule__InheritanceMappingType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3466:1: ( ( ( rule__InheritanceMappingType__TypeAlternatives_0 ) ) )
            // InternalDTO.g:3467:2: ( ( rule__InheritanceMappingType__TypeAlternatives_0 ) )
            {
            // InternalDTO.g:3467:2: ( ( rule__InheritanceMappingType__TypeAlternatives_0 ) )
            // InternalDTO.g:3468:3: ( rule__InheritanceMappingType__TypeAlternatives_0 )
            {
             before(grammarAccess.getInheritanceMappingTypeAccess().getTypeAlternatives_0()); 
            // InternalDTO.g:3469:3: ( rule__InheritanceMappingType__TypeAlternatives_0 )
            // InternalDTO.g:3469:4: rule__InheritanceMappingType__TypeAlternatives_0
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
    // InternalDTO.g:3477:1: rule__Attribute__TypeAssignment_0 : ( ruleAttributeType ) ;
    public final void rule__Attribute__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3481:1: ( ( ruleAttributeType ) )
            // InternalDTO.g:3482:2: ( ruleAttributeType )
            {
            // InternalDTO.g:3482:2: ( ruleAttributeType )
            // InternalDTO.g:3483:3: ruleAttributeType
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
    // InternalDTO.g:3492:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3496:1: ( ( RULE_ID ) )
            // InternalDTO.g:3497:2: ( RULE_ID )
            {
            // InternalDTO.g:3497:2: ( RULE_ID )
            // InternalDTO.g:3498:3: RULE_ID
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
    // InternalDTO.g:3507:1: rule__Attribute__OptionsAssignment_2_0 : ( ruleAttributeOption ) ;
    public final void rule__Attribute__OptionsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3511:1: ( ( ruleAttributeOption ) )
            // InternalDTO.g:3512:2: ( ruleAttributeOption )
            {
            // InternalDTO.g:3512:2: ( ruleAttributeOption )
            // InternalDTO.g:3513:3: ruleAttributeOption
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
    // InternalDTO.g:3522:1: rule__Attribute__OptionsAssignment_2_1_1 : ( ruleAttributeOption ) ;
    public final void rule__Attribute__OptionsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3526:1: ( ( ruleAttributeOption ) )
            // InternalDTO.g:3527:2: ( ruleAttributeOption )
            {
            // InternalDTO.g:3527:2: ( ruleAttributeOption )
            // InternalDTO.g:3528:3: ruleAttributeOption
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
    // InternalDTO.g:3537:1: rule__RefType__ReferenceAssignment : ( ( RULE_ID ) ) ;
    public final void rule__RefType__ReferenceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3541:1: ( ( ( RULE_ID ) ) )
            // InternalDTO.g:3542:2: ( ( RULE_ID ) )
            {
            // InternalDTO.g:3542:2: ( ( RULE_ID ) )
            // InternalDTO.g:3543:3: ( RULE_ID )
            {
             before(grammarAccess.getRefTypeAccess().getReferenceConceptCrossReference_0()); 
            // InternalDTO.g:3544:3: ( RULE_ID )
            // InternalDTO.g:3545:4: RULE_ID
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
    // InternalDTO.g:3556:1: rule__CollectionType__OfTypeAssignment_2 : ( ruleSingleType ) ;
    public final void rule__CollectionType__OfTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3560:1: ( ( ruleSingleType ) )
            // InternalDTO.g:3561:2: ( ruleSingleType )
            {
            // InternalDTO.g:3561:2: ( ruleSingleType )
            // InternalDTO.g:3562:3: ruleSingleType
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000008010002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000FE007C40020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000FE007C00022L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000007E007C00000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000FE007C00020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000200001850L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000300000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x000007E000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x000007E007C00020L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000400000000000L});

}
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'SINGLE_TABLE'", "'TABLE_PER_CONCRETE_CLASS'", "'TABLE_PER_CLASS'", "'class'", "'{'", "'}'", "'extends'", "'representation'", "'@id'", "'text'", "'email'", "'password'", "'file'", "'image'", "'enum'", "'('", "')'", "','", "'L'", "'/'", "'null'", "'inheritance'", "'='", "';'", "'string'", "'int'", "'long'", "'boolean'", "'date'", "'List'", "'<'", "'>'", "'deleteByFlag'"
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


    // $ANTLR start "rule__AttributeOption__Alternatives"
    // InternalDTO.g:473:1: rule__AttributeOption__Alternatives : ( ( ( rule__AttributeOption__Group_0__0 ) ) | ( ( rule__AttributeOption__Group_1__0 ) ) );
    public final void rule__AttributeOption__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:477:1: ( ( ( rule__AttributeOption__Group_0__0 ) ) | ( ( rule__AttributeOption__Group_1__0 ) ) )
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
                    // InternalDTO.g:478:2: ( ( rule__AttributeOption__Group_0__0 ) )
                    {
                    // InternalDTO.g:478:2: ( ( rule__AttributeOption__Group_0__0 ) )
                    // InternalDTO.g:479:3: ( rule__AttributeOption__Group_0__0 )
                    {
                     before(grammarAccess.getAttributeOptionAccess().getGroup_0()); 
                    // InternalDTO.g:480:3: ( rule__AttributeOption__Group_0__0 )
                    // InternalDTO.g:480:4: rule__AttributeOption__Group_0__0
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
                    // InternalDTO.g:484:2: ( ( rule__AttributeOption__Group_1__0 ) )
                    {
                    // InternalDTO.g:484:2: ( ( rule__AttributeOption__Group_1__0 ) )
                    // InternalDTO.g:485:3: ( rule__AttributeOption__Group_1__0 )
                    {
                     before(grammarAccess.getAttributeOptionAccess().getGroup_1()); 
                    // InternalDTO.g:486:3: ( rule__AttributeOption__Group_1__0 )
                    // InternalDTO.g:486:4: rule__AttributeOption__Group_1__0
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
    // InternalDTO.g:494:1: rule__BasicType__Alternatives : ( ( superBasicType ) | ( ( rule__BasicType__Group_1__0 ) ) | ( ( rule__BasicType__Group_2__0 ) ) | ( ( rule__BasicType__Group_3__0 ) ) | ( ( rule__BasicType__Group_4__0 ) ) | ( ( rule__BasicType__Group_5__0 ) ) );
    public final void rule__BasicType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:498:1: ( ( superBasicType ) | ( ( rule__BasicType__Group_1__0 ) ) | ( ( rule__BasicType__Group_2__0 ) ) | ( ( rule__BasicType__Group_3__0 ) ) | ( ( rule__BasicType__Group_4__0 ) ) | ( ( rule__BasicType__Group_5__0 ) ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
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
                    // InternalDTO.g:499:2: ( superBasicType )
                    {
                    // InternalDTO.g:499:2: ( superBasicType )
                    // InternalDTO.g:500:3: superBasicType
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
                    // InternalDTO.g:505:2: ( ( rule__BasicType__Group_1__0 ) )
                    {
                    // InternalDTO.g:505:2: ( ( rule__BasicType__Group_1__0 ) )
                    // InternalDTO.g:506:3: ( rule__BasicType__Group_1__0 )
                    {
                     before(grammarAccess.getBasicTypeAccess().getGroup_1()); 
                    // InternalDTO.g:507:3: ( rule__BasicType__Group_1__0 )
                    // InternalDTO.g:507:4: rule__BasicType__Group_1__0
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
                    // InternalDTO.g:511:2: ( ( rule__BasicType__Group_2__0 ) )
                    {
                    // InternalDTO.g:511:2: ( ( rule__BasicType__Group_2__0 ) )
                    // InternalDTO.g:512:3: ( rule__BasicType__Group_2__0 )
                    {
                     before(grammarAccess.getBasicTypeAccess().getGroup_2()); 
                    // InternalDTO.g:513:3: ( rule__BasicType__Group_2__0 )
                    // InternalDTO.g:513:4: rule__BasicType__Group_2__0
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
                    // InternalDTO.g:517:2: ( ( rule__BasicType__Group_3__0 ) )
                    {
                    // InternalDTO.g:517:2: ( ( rule__BasicType__Group_3__0 ) )
                    // InternalDTO.g:518:3: ( rule__BasicType__Group_3__0 )
                    {
                     before(grammarAccess.getBasicTypeAccess().getGroup_3()); 
                    // InternalDTO.g:519:3: ( rule__BasicType__Group_3__0 )
                    // InternalDTO.g:519:4: rule__BasicType__Group_3__0
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
                    // InternalDTO.g:523:2: ( ( rule__BasicType__Group_4__0 ) )
                    {
                    // InternalDTO.g:523:2: ( ( rule__BasicType__Group_4__0 ) )
                    // InternalDTO.g:524:3: ( rule__BasicType__Group_4__0 )
                    {
                     before(grammarAccess.getBasicTypeAccess().getGroup_4()); 
                    // InternalDTO.g:525:3: ( rule__BasicType__Group_4__0 )
                    // InternalDTO.g:525:4: rule__BasicType__Group_4__0
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
                    // InternalDTO.g:529:2: ( ( rule__BasicType__Group_5__0 ) )
                    {
                    // InternalDTO.g:529:2: ( ( rule__BasicType__Group_5__0 ) )
                    // InternalDTO.g:530:3: ( rule__BasicType__Group_5__0 )
                    {
                     before(grammarAccess.getBasicTypeAccess().getGroup_5()); 
                    // InternalDTO.g:531:3: ( rule__BasicType__Group_5__0 )
                    // InternalDTO.g:531:4: rule__BasicType__Group_5__0
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
    // InternalDTO.g:539:1: rule__Constant__Alternatives : ( ( ( rule__Constant__Group_0__0 ) ) | ( ( rule__Constant__Group_1__0 ) ) | ( ( rule__Constant__Group_2__0 ) ) | ( ( rule__Constant__Group_3__0 ) ) | ( ( rule__Constant__Group_4__0 ) ) | ( ( rule__Constant__Group_5__0 ) ) );
    public final void rule__Constant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:543:1: ( ( ( rule__Constant__Group_0__0 ) ) | ( ( rule__Constant__Group_1__0 ) ) | ( ( rule__Constant__Group_2__0 ) ) | ( ( rule__Constant__Group_3__0 ) ) | ( ( rule__Constant__Group_4__0 ) ) | ( ( rule__Constant__Group_5__0 ) ) )
            int alt5=6;
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
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalDTO.g:544:2: ( ( rule__Constant__Group_0__0 ) )
                    {
                    // InternalDTO.g:544:2: ( ( rule__Constant__Group_0__0 ) )
                    // InternalDTO.g:545:3: ( rule__Constant__Group_0__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_0()); 
                    // InternalDTO.g:546:3: ( rule__Constant__Group_0__0 )
                    // InternalDTO.g:546:4: rule__Constant__Group_0__0
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
                    // InternalDTO.g:550:2: ( ( rule__Constant__Group_1__0 ) )
                    {
                    // InternalDTO.g:550:2: ( ( rule__Constant__Group_1__0 ) )
                    // InternalDTO.g:551:3: ( rule__Constant__Group_1__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_1()); 
                    // InternalDTO.g:552:3: ( rule__Constant__Group_1__0 )
                    // InternalDTO.g:552:4: rule__Constant__Group_1__0
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
                    // InternalDTO.g:556:2: ( ( rule__Constant__Group_2__0 ) )
                    {
                    // InternalDTO.g:556:2: ( ( rule__Constant__Group_2__0 ) )
                    // InternalDTO.g:557:3: ( rule__Constant__Group_2__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_2()); 
                    // InternalDTO.g:558:3: ( rule__Constant__Group_2__0 )
                    // InternalDTO.g:558:4: rule__Constant__Group_2__0
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
                    // InternalDTO.g:562:2: ( ( rule__Constant__Group_3__0 ) )
                    {
                    // InternalDTO.g:562:2: ( ( rule__Constant__Group_3__0 ) )
                    // InternalDTO.g:563:3: ( rule__Constant__Group_3__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_3()); 
                    // InternalDTO.g:564:3: ( rule__Constant__Group_3__0 )
                    // InternalDTO.g:564:4: rule__Constant__Group_3__0
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
                    // InternalDTO.g:568:2: ( ( rule__Constant__Group_4__0 ) )
                    {
                    // InternalDTO.g:568:2: ( ( rule__Constant__Group_4__0 ) )
                    // InternalDTO.g:569:3: ( rule__Constant__Group_4__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_4()); 
                    // InternalDTO.g:570:3: ( rule__Constant__Group_4__0 )
                    // InternalDTO.g:570:4: rule__Constant__Group_4__0
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
                    // InternalDTO.g:574:2: ( ( rule__Constant__Group_5__0 ) )
                    {
                    // InternalDTO.g:574:2: ( ( rule__Constant__Group_5__0 ) )
                    // InternalDTO.g:575:3: ( rule__Constant__Group_5__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_5()); 
                    // InternalDTO.g:576:3: ( rule__Constant__Group_5__0 )
                    // InternalDTO.g:576:4: rule__Constant__Group_5__0
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
    // InternalDTO.g:584:1: rule__Constant__ValueAlternatives_3_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Constant__ValueAlternatives_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:588:1: ( ( 'true' ) | ( 'false' ) )
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
                    // InternalDTO.g:589:2: ( 'true' )
                    {
                    // InternalDTO.g:589:2: ( 'true' )
                    // InternalDTO.g:590:3: 'true'
                    {
                     before(grammarAccess.getConstantAccess().getValueTrueKeyword_3_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getConstantAccess().getValueTrueKeyword_3_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDTO.g:595:2: ( 'false' )
                    {
                    // InternalDTO.g:595:2: ( 'false' )
                    // InternalDTO.g:596:3: 'false'
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
    // InternalDTO.g:605:1: rule__EntityOption__Alternatives : ( ( ( rule__EntityOption__Group_0__0 ) ) | ( ( rule__EntityOption__Group_1__0 ) ) );
    public final void rule__EntityOption__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:609:1: ( ( ( rule__EntityOption__Group_0__0 ) ) | ( ( rule__EntityOption__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==45) ) {
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
                    // InternalDTO.g:610:2: ( ( rule__EntityOption__Group_0__0 ) )
                    {
                    // InternalDTO.g:610:2: ( ( rule__EntityOption__Group_0__0 ) )
                    // InternalDTO.g:611:3: ( rule__EntityOption__Group_0__0 )
                    {
                     before(grammarAccess.getEntityOptionAccess().getGroup_0()); 
                    // InternalDTO.g:612:3: ( rule__EntityOption__Group_0__0 )
                    // InternalDTO.g:612:4: rule__EntityOption__Group_0__0
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
                    // InternalDTO.g:616:2: ( ( rule__EntityOption__Group_1__0 ) )
                    {
                    // InternalDTO.g:616:2: ( ( rule__EntityOption__Group_1__0 ) )
                    // InternalDTO.g:617:3: ( rule__EntityOption__Group_1__0 )
                    {
                     before(grammarAccess.getEntityOptionAccess().getGroup_1()); 
                    // InternalDTO.g:618:3: ( rule__EntityOption__Group_1__0 )
                    // InternalDTO.g:618:4: rule__EntityOption__Group_1__0
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
    // InternalDTO.g:626:1: rule__InheritanceMappingType__TypeAlternatives_0 : ( ( 'SINGLE_TABLE' ) | ( 'TABLE_PER_CONCRETE_CLASS' ) | ( 'TABLE_PER_CLASS' ) );
    public final void rule__InheritanceMappingType__TypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:630:1: ( ( 'SINGLE_TABLE' ) | ( 'TABLE_PER_CONCRETE_CLASS' ) | ( 'TABLE_PER_CLASS' ) )
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
                    // InternalDTO.g:631:2: ( 'SINGLE_TABLE' )
                    {
                    // InternalDTO.g:631:2: ( 'SINGLE_TABLE' )
                    // InternalDTO.g:632:3: 'SINGLE_TABLE'
                    {
                     before(grammarAccess.getInheritanceMappingTypeAccess().getTypeSINGLE_TABLEKeyword_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getInheritanceMappingTypeAccess().getTypeSINGLE_TABLEKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDTO.g:637:2: ( 'TABLE_PER_CONCRETE_CLASS' )
                    {
                    // InternalDTO.g:637:2: ( 'TABLE_PER_CONCRETE_CLASS' )
                    // InternalDTO.g:638:3: 'TABLE_PER_CONCRETE_CLASS'
                    {
                     before(grammarAccess.getInheritanceMappingTypeAccess().getTypeTABLE_PER_CONCRETE_CLASSKeyword_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getInheritanceMappingTypeAccess().getTypeTABLE_PER_CONCRETE_CLASSKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDTO.g:643:2: ( 'TABLE_PER_CLASS' )
                    {
                    // InternalDTO.g:643:2: ( 'TABLE_PER_CLASS' )
                    // InternalDTO.g:644:3: 'TABLE_PER_CLASS'
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
    // InternalDTO.g:653:1: rule__AttributeType__Alternatives : ( ( ruleSingleType ) | ( ruleCollectionType ) );
    public final void rule__AttributeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:657:1: ( ( ruleSingleType ) | ( ruleCollectionType ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID||(LA9_0>=22 && LA9_0<=26)||(LA9_0>=37 && LA9_0<=41)) ) {
                alt9=1;
            }
            else if ( (LA9_0==42) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalDTO.g:658:2: ( ruleSingleType )
                    {
                    // InternalDTO.g:658:2: ( ruleSingleType )
                    // InternalDTO.g:659:3: ruleSingleType
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
                    // InternalDTO.g:664:2: ( ruleCollectionType )
                    {
                    // InternalDTO.g:664:2: ( ruleCollectionType )
                    // InternalDTO.g:665:3: ruleCollectionType
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
    // InternalDTO.g:674:1: rule__SingleType__Alternatives : ( ( ruleBasicType ) | ( ruleRefType ) );
    public final void rule__SingleType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:678:1: ( ( ruleBasicType ) | ( ruleRefType ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=22 && LA10_0<=26)||(LA10_0>=37 && LA10_0<=41)) ) {
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
                    // InternalDTO.g:679:2: ( ruleBasicType )
                    {
                    // InternalDTO.g:679:2: ( ruleBasicType )
                    // InternalDTO.g:680:3: ruleBasicType
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
                    // InternalDTO.g:685:2: ( ruleRefType )
                    {
                    // InternalDTO.g:685:2: ( ruleRefType )
                    // InternalDTO.g:686:3: ruleRefType
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
    // InternalDTO.g:695:1: superBasicType__Alternatives : ( ( ( superBasicType__Group_0__0 ) ) | ( ( superBasicType__Group_1__0 ) ) | ( ( superBasicType__Group_2__0 ) ) | ( ( superBasicType__Group_3__0 ) ) | ( ( superBasicType__Group_4__0 ) ) );
    public final void superBasicType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:699:1: ( ( ( superBasicType__Group_0__0 ) ) | ( ( superBasicType__Group_1__0 ) ) | ( ( superBasicType__Group_2__0 ) ) | ( ( superBasicType__Group_3__0 ) ) | ( ( superBasicType__Group_4__0 ) ) )
            int alt11=5;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalDTO.g:700:2: ( ( superBasicType__Group_0__0 ) )
                    {
                    // InternalDTO.g:700:2: ( ( superBasicType__Group_0__0 ) )
                    // InternalDTO.g:701:3: ( superBasicType__Group_0__0 )
                    {
                     before(grammarAccess.getDomainModelBasicTypeAccess().getGroup_0()); 
                    // InternalDTO.g:702:3: ( superBasicType__Group_0__0 )
                    // InternalDTO.g:702:4: superBasicType__Group_0__0
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
                    // InternalDTO.g:706:2: ( ( superBasicType__Group_1__0 ) )
                    {
                    // InternalDTO.g:706:2: ( ( superBasicType__Group_1__0 ) )
                    // InternalDTO.g:707:3: ( superBasicType__Group_1__0 )
                    {
                     before(grammarAccess.getDomainModelBasicTypeAccess().getGroup_1()); 
                    // InternalDTO.g:708:3: ( superBasicType__Group_1__0 )
                    // InternalDTO.g:708:4: superBasicType__Group_1__0
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
                    // InternalDTO.g:712:2: ( ( superBasicType__Group_2__0 ) )
                    {
                    // InternalDTO.g:712:2: ( ( superBasicType__Group_2__0 ) )
                    // InternalDTO.g:713:3: ( superBasicType__Group_2__0 )
                    {
                     before(grammarAccess.getDomainModelBasicTypeAccess().getGroup_2()); 
                    // InternalDTO.g:714:3: ( superBasicType__Group_2__0 )
                    // InternalDTO.g:714:4: superBasicType__Group_2__0
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
                    // InternalDTO.g:718:2: ( ( superBasicType__Group_3__0 ) )
                    {
                    // InternalDTO.g:718:2: ( ( superBasicType__Group_3__0 ) )
                    // InternalDTO.g:719:3: ( superBasicType__Group_3__0 )
                    {
                     before(grammarAccess.getDomainModelBasicTypeAccess().getGroup_3()); 
                    // InternalDTO.g:720:3: ( superBasicType__Group_3__0 )
                    // InternalDTO.g:720:4: superBasicType__Group_3__0
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
                    // InternalDTO.g:724:2: ( ( superBasicType__Group_4__0 ) )
                    {
                    // InternalDTO.g:724:2: ( ( superBasicType__Group_4__0 ) )
                    // InternalDTO.g:725:3: ( superBasicType__Group_4__0 )
                    {
                     before(grammarAccess.getDomainModelBasicTypeAccess().getGroup_4()); 
                    // InternalDTO.g:726:3: ( superBasicType__Group_4__0 )
                    // InternalDTO.g:726:4: superBasicType__Group_4__0
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
    // InternalDTO.g:734:1: rule__DTOClass__Group__0 : rule__DTOClass__Group__0__Impl rule__DTOClass__Group__1 ;
    public final void rule__DTOClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:738:1: ( rule__DTOClass__Group__0__Impl rule__DTOClass__Group__1 )
            // InternalDTO.g:739:2: rule__DTOClass__Group__0__Impl rule__DTOClass__Group__1
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
    // InternalDTO.g:746:1: rule__DTOClass__Group__0__Impl : ( 'class' ) ;
    public final void rule__DTOClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:750:1: ( ( 'class' ) )
            // InternalDTO.g:751:1: ( 'class' )
            {
            // InternalDTO.g:751:1: ( 'class' )
            // InternalDTO.g:752:2: 'class'
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
    // InternalDTO.g:761:1: rule__DTOClass__Group__1 : rule__DTOClass__Group__1__Impl rule__DTOClass__Group__2 ;
    public final void rule__DTOClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:765:1: ( rule__DTOClass__Group__1__Impl rule__DTOClass__Group__2 )
            // InternalDTO.g:766:2: rule__DTOClass__Group__1__Impl rule__DTOClass__Group__2
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
    // InternalDTO.g:773:1: rule__DTOClass__Group__1__Impl : ( ( rule__DTOClass__NameAssignment_1 ) ) ;
    public final void rule__DTOClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:777:1: ( ( ( rule__DTOClass__NameAssignment_1 ) ) )
            // InternalDTO.g:778:1: ( ( rule__DTOClass__NameAssignment_1 ) )
            {
            // InternalDTO.g:778:1: ( ( rule__DTOClass__NameAssignment_1 ) )
            // InternalDTO.g:779:2: ( rule__DTOClass__NameAssignment_1 )
            {
             before(grammarAccess.getDTOClassAccess().getNameAssignment_1()); 
            // InternalDTO.g:780:2: ( rule__DTOClass__NameAssignment_1 )
            // InternalDTO.g:780:3: rule__DTOClass__NameAssignment_1
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
    // InternalDTO.g:788:1: rule__DTOClass__Group__2 : rule__DTOClass__Group__2__Impl rule__DTOClass__Group__3 ;
    public final void rule__DTOClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:792:1: ( rule__DTOClass__Group__2__Impl rule__DTOClass__Group__3 )
            // InternalDTO.g:793:2: rule__DTOClass__Group__2__Impl rule__DTOClass__Group__3
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
    // InternalDTO.g:800:1: rule__DTOClass__Group__2__Impl : ( ( rule__DTOClass__Group_2__0 )? ) ;
    public final void rule__DTOClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:804:1: ( ( ( rule__DTOClass__Group_2__0 )? ) )
            // InternalDTO.g:805:1: ( ( rule__DTOClass__Group_2__0 )? )
            {
            // InternalDTO.g:805:1: ( ( rule__DTOClass__Group_2__0 )? )
            // InternalDTO.g:806:2: ( rule__DTOClass__Group_2__0 )?
            {
             before(grammarAccess.getDTOClassAccess().getGroup_2()); 
            // InternalDTO.g:807:2: ( rule__DTOClass__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDTO.g:807:3: rule__DTOClass__Group_2__0
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
    // InternalDTO.g:815:1: rule__DTOClass__Group__3 : rule__DTOClass__Group__3__Impl rule__DTOClass__Group__4 ;
    public final void rule__DTOClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:819:1: ( rule__DTOClass__Group__3__Impl rule__DTOClass__Group__4 )
            // InternalDTO.g:820:2: rule__DTOClass__Group__3__Impl rule__DTOClass__Group__4
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
    // InternalDTO.g:827:1: rule__DTOClass__Group__3__Impl : ( '{' ) ;
    public final void rule__DTOClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:831:1: ( ( '{' ) )
            // InternalDTO.g:832:1: ( '{' )
            {
            // InternalDTO.g:832:1: ( '{' )
            // InternalDTO.g:833:2: '{'
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
    // InternalDTO.g:842:1: rule__DTOClass__Group__4 : rule__DTOClass__Group__4__Impl rule__DTOClass__Group__5 ;
    public final void rule__DTOClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:846:1: ( rule__DTOClass__Group__4__Impl rule__DTOClass__Group__5 )
            // InternalDTO.g:847:2: rule__DTOClass__Group__4__Impl rule__DTOClass__Group__5
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
    // InternalDTO.g:854:1: rule__DTOClass__Group__4__Impl : ( ( rule__DTOClass__AttributesAssignment_4 )* ) ;
    public final void rule__DTOClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:858:1: ( ( ( rule__DTOClass__AttributesAssignment_4 )* ) )
            // InternalDTO.g:859:1: ( ( rule__DTOClass__AttributesAssignment_4 )* )
            {
            // InternalDTO.g:859:1: ( ( rule__DTOClass__AttributesAssignment_4 )* )
            // InternalDTO.g:860:2: ( rule__DTOClass__AttributesAssignment_4 )*
            {
             before(grammarAccess.getDTOClassAccess().getAttributesAssignment_4()); 
            // InternalDTO.g:861:2: ( rule__DTOClass__AttributesAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||(LA13_0>=22 && LA13_0<=26)||(LA13_0>=37 && LA13_0<=42)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDTO.g:861:3: rule__DTOClass__AttributesAssignment_4
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
    // InternalDTO.g:869:1: rule__DTOClass__Group__5 : rule__DTOClass__Group__5__Impl ;
    public final void rule__DTOClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:873:1: ( rule__DTOClass__Group__5__Impl )
            // InternalDTO.g:874:2: rule__DTOClass__Group__5__Impl
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
    // InternalDTO.g:880:1: rule__DTOClass__Group__5__Impl : ( '}' ) ;
    public final void rule__DTOClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:884:1: ( ( '}' ) )
            // InternalDTO.g:885:1: ( '}' )
            {
            // InternalDTO.g:885:1: ( '}' )
            // InternalDTO.g:886:2: '}'
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
    // InternalDTO.g:896:1: rule__DTOClass__Group_2__0 : rule__DTOClass__Group_2__0__Impl rule__DTOClass__Group_2__1 ;
    public final void rule__DTOClass__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:900:1: ( rule__DTOClass__Group_2__0__Impl rule__DTOClass__Group_2__1 )
            // InternalDTO.g:901:2: rule__DTOClass__Group_2__0__Impl rule__DTOClass__Group_2__1
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
    // InternalDTO.g:908:1: rule__DTOClass__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__DTOClass__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:912:1: ( ( 'extends' ) )
            // InternalDTO.g:913:1: ( 'extends' )
            {
            // InternalDTO.g:913:1: ( 'extends' )
            // InternalDTO.g:914:2: 'extends'
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
    // InternalDTO.g:923:1: rule__DTOClass__Group_2__1 : rule__DTOClass__Group_2__1__Impl ;
    public final void rule__DTOClass__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:927:1: ( rule__DTOClass__Group_2__1__Impl )
            // InternalDTO.g:928:2: rule__DTOClass__Group_2__1__Impl
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
    // InternalDTO.g:934:1: rule__DTOClass__Group_2__1__Impl : ( ( rule__DTOClass__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__DTOClass__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:938:1: ( ( ( rule__DTOClass__SuperTypeAssignment_2_1 ) ) )
            // InternalDTO.g:939:1: ( ( rule__DTOClass__SuperTypeAssignment_2_1 ) )
            {
            // InternalDTO.g:939:1: ( ( rule__DTOClass__SuperTypeAssignment_2_1 ) )
            // InternalDTO.g:940:2: ( rule__DTOClass__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getDTOClassAccess().getSuperTypeAssignment_2_1()); 
            // InternalDTO.g:941:2: ( rule__DTOClass__SuperTypeAssignment_2_1 )
            // InternalDTO.g:941:3: rule__DTOClass__SuperTypeAssignment_2_1
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
    // InternalDTO.g:950:1: rule__AttributeOption__Group_0__0 : rule__AttributeOption__Group_0__0__Impl rule__AttributeOption__Group_0__1 ;
    public final void rule__AttributeOption__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:954:1: ( rule__AttributeOption__Group_0__0__Impl rule__AttributeOption__Group_0__1 )
            // InternalDTO.g:955:2: rule__AttributeOption__Group_0__0__Impl rule__AttributeOption__Group_0__1
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
    // InternalDTO.g:962:1: rule__AttributeOption__Group_0__0__Impl : ( () ) ;
    public final void rule__AttributeOption__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:966:1: ( ( () ) )
            // InternalDTO.g:967:1: ( () )
            {
            // InternalDTO.g:967:1: ( () )
            // InternalDTO.g:968:2: ()
            {
             before(grammarAccess.getAttributeOptionAccess().getObjectRepresentationAction_0_0()); 
            // InternalDTO.g:969:2: ()
            // InternalDTO.g:969:3: 
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
    // InternalDTO.g:977:1: rule__AttributeOption__Group_0__1 : rule__AttributeOption__Group_0__1__Impl ;
    public final void rule__AttributeOption__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:981:1: ( rule__AttributeOption__Group_0__1__Impl )
            // InternalDTO.g:982:2: rule__AttributeOption__Group_0__1__Impl
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
    // InternalDTO.g:988:1: rule__AttributeOption__Group_0__1__Impl : ( 'representation' ) ;
    public final void rule__AttributeOption__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:992:1: ( ( 'representation' ) )
            // InternalDTO.g:993:1: ( 'representation' )
            {
            // InternalDTO.g:993:1: ( 'representation' )
            // InternalDTO.g:994:2: 'representation'
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
    // InternalDTO.g:1004:1: rule__AttributeOption__Group_1__0 : rule__AttributeOption__Group_1__0__Impl rule__AttributeOption__Group_1__1 ;
    public final void rule__AttributeOption__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1008:1: ( rule__AttributeOption__Group_1__0__Impl rule__AttributeOption__Group_1__1 )
            // InternalDTO.g:1009:2: rule__AttributeOption__Group_1__0__Impl rule__AttributeOption__Group_1__1
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
    // InternalDTO.g:1016:1: rule__AttributeOption__Group_1__0__Impl : ( () ) ;
    public final void rule__AttributeOption__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1020:1: ( ( () ) )
            // InternalDTO.g:1021:1: ( () )
            {
            // InternalDTO.g:1021:1: ( () )
            // InternalDTO.g:1022:2: ()
            {
             before(grammarAccess.getAttributeOptionAccess().getIDAttributeAction_1_0()); 
            // InternalDTO.g:1023:2: ()
            // InternalDTO.g:1023:3: 
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
    // InternalDTO.g:1031:1: rule__AttributeOption__Group_1__1 : rule__AttributeOption__Group_1__1__Impl ;
    public final void rule__AttributeOption__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1035:1: ( rule__AttributeOption__Group_1__1__Impl )
            // InternalDTO.g:1036:2: rule__AttributeOption__Group_1__1__Impl
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
    // InternalDTO.g:1042:1: rule__AttributeOption__Group_1__1__Impl : ( '@id' ) ;
    public final void rule__AttributeOption__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1046:1: ( ( '@id' ) )
            // InternalDTO.g:1047:1: ( '@id' )
            {
            // InternalDTO.g:1047:1: ( '@id' )
            // InternalDTO.g:1048:2: '@id'
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
    // InternalDTO.g:1058:1: rule__BasicType__Group_1__0 : rule__BasicType__Group_1__0__Impl rule__BasicType__Group_1__1 ;
    public final void rule__BasicType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1062:1: ( rule__BasicType__Group_1__0__Impl rule__BasicType__Group_1__1 )
            // InternalDTO.g:1063:2: rule__BasicType__Group_1__0__Impl rule__BasicType__Group_1__1
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
    // InternalDTO.g:1070:1: rule__BasicType__Group_1__0__Impl : ( () ) ;
    public final void rule__BasicType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1074:1: ( ( () ) )
            // InternalDTO.g:1075:1: ( () )
            {
            // InternalDTO.g:1075:1: ( () )
            // InternalDTO.g:1076:2: ()
            {
             before(grammarAccess.getBasicTypeAccess().getTextTypeAction_1_0()); 
            // InternalDTO.g:1077:2: ()
            // InternalDTO.g:1077:3: 
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
    // InternalDTO.g:1085:1: rule__BasicType__Group_1__1 : rule__BasicType__Group_1__1__Impl ;
    public final void rule__BasicType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1089:1: ( rule__BasicType__Group_1__1__Impl )
            // InternalDTO.g:1090:2: rule__BasicType__Group_1__1__Impl
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
    // InternalDTO.g:1096:1: rule__BasicType__Group_1__1__Impl : ( 'text' ) ;
    public final void rule__BasicType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1100:1: ( ( 'text' ) )
            // InternalDTO.g:1101:1: ( 'text' )
            {
            // InternalDTO.g:1101:1: ( 'text' )
            // InternalDTO.g:1102:2: 'text'
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
    // InternalDTO.g:1112:1: rule__BasicType__Group_2__0 : rule__BasicType__Group_2__0__Impl rule__BasicType__Group_2__1 ;
    public final void rule__BasicType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1116:1: ( rule__BasicType__Group_2__0__Impl rule__BasicType__Group_2__1 )
            // InternalDTO.g:1117:2: rule__BasicType__Group_2__0__Impl rule__BasicType__Group_2__1
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
    // InternalDTO.g:1124:1: rule__BasicType__Group_2__0__Impl : ( () ) ;
    public final void rule__BasicType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1128:1: ( ( () ) )
            // InternalDTO.g:1129:1: ( () )
            {
            // InternalDTO.g:1129:1: ( () )
            // InternalDTO.g:1130:2: ()
            {
             before(grammarAccess.getBasicTypeAccess().getEmailTypeAction_2_0()); 
            // InternalDTO.g:1131:2: ()
            // InternalDTO.g:1131:3: 
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
    // InternalDTO.g:1139:1: rule__BasicType__Group_2__1 : rule__BasicType__Group_2__1__Impl ;
    public final void rule__BasicType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1143:1: ( rule__BasicType__Group_2__1__Impl )
            // InternalDTO.g:1144:2: rule__BasicType__Group_2__1__Impl
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
    // InternalDTO.g:1150:1: rule__BasicType__Group_2__1__Impl : ( 'email' ) ;
    public final void rule__BasicType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1154:1: ( ( 'email' ) )
            // InternalDTO.g:1155:1: ( 'email' )
            {
            // InternalDTO.g:1155:1: ( 'email' )
            // InternalDTO.g:1156:2: 'email'
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
    // InternalDTO.g:1166:1: rule__BasicType__Group_3__0 : rule__BasicType__Group_3__0__Impl rule__BasicType__Group_3__1 ;
    public final void rule__BasicType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1170:1: ( rule__BasicType__Group_3__0__Impl rule__BasicType__Group_3__1 )
            // InternalDTO.g:1171:2: rule__BasicType__Group_3__0__Impl rule__BasicType__Group_3__1
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
    // InternalDTO.g:1178:1: rule__BasicType__Group_3__0__Impl : ( () ) ;
    public final void rule__BasicType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1182:1: ( ( () ) )
            // InternalDTO.g:1183:1: ( () )
            {
            // InternalDTO.g:1183:1: ( () )
            // InternalDTO.g:1184:2: ()
            {
             before(grammarAccess.getBasicTypeAccess().getPasswordTypeAction_3_0()); 
            // InternalDTO.g:1185:2: ()
            // InternalDTO.g:1185:3: 
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
    // InternalDTO.g:1193:1: rule__BasicType__Group_3__1 : rule__BasicType__Group_3__1__Impl ;
    public final void rule__BasicType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1197:1: ( rule__BasicType__Group_3__1__Impl )
            // InternalDTO.g:1198:2: rule__BasicType__Group_3__1__Impl
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
    // InternalDTO.g:1204:1: rule__BasicType__Group_3__1__Impl : ( 'password' ) ;
    public final void rule__BasicType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1208:1: ( ( 'password' ) )
            // InternalDTO.g:1209:1: ( 'password' )
            {
            // InternalDTO.g:1209:1: ( 'password' )
            // InternalDTO.g:1210:2: 'password'
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
    // InternalDTO.g:1220:1: rule__BasicType__Group_4__0 : rule__BasicType__Group_4__0__Impl rule__BasicType__Group_4__1 ;
    public final void rule__BasicType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1224:1: ( rule__BasicType__Group_4__0__Impl rule__BasicType__Group_4__1 )
            // InternalDTO.g:1225:2: rule__BasicType__Group_4__0__Impl rule__BasicType__Group_4__1
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
    // InternalDTO.g:1232:1: rule__BasicType__Group_4__0__Impl : ( () ) ;
    public final void rule__BasicType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1236:1: ( ( () ) )
            // InternalDTO.g:1237:1: ( () )
            {
            // InternalDTO.g:1237:1: ( () )
            // InternalDTO.g:1238:2: ()
            {
             before(grammarAccess.getBasicTypeAccess().getFileTypeAction_4_0()); 
            // InternalDTO.g:1239:2: ()
            // InternalDTO.g:1239:3: 
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
    // InternalDTO.g:1247:1: rule__BasicType__Group_4__1 : rule__BasicType__Group_4__1__Impl ;
    public final void rule__BasicType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1251:1: ( rule__BasicType__Group_4__1__Impl )
            // InternalDTO.g:1252:2: rule__BasicType__Group_4__1__Impl
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
    // InternalDTO.g:1258:1: rule__BasicType__Group_4__1__Impl : ( 'file' ) ;
    public final void rule__BasicType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1262:1: ( ( 'file' ) )
            // InternalDTO.g:1263:1: ( 'file' )
            {
            // InternalDTO.g:1263:1: ( 'file' )
            // InternalDTO.g:1264:2: 'file'
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
    // InternalDTO.g:1274:1: rule__BasicType__Group_5__0 : rule__BasicType__Group_5__0__Impl rule__BasicType__Group_5__1 ;
    public final void rule__BasicType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1278:1: ( rule__BasicType__Group_5__0__Impl rule__BasicType__Group_5__1 )
            // InternalDTO.g:1279:2: rule__BasicType__Group_5__0__Impl rule__BasicType__Group_5__1
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
    // InternalDTO.g:1286:1: rule__BasicType__Group_5__0__Impl : ( () ) ;
    public final void rule__BasicType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1290:1: ( ( () ) )
            // InternalDTO.g:1291:1: ( () )
            {
            // InternalDTO.g:1291:1: ( () )
            // InternalDTO.g:1292:2: ()
            {
             before(grammarAccess.getBasicTypeAccess().getImageTypeAction_5_0()); 
            // InternalDTO.g:1293:2: ()
            // InternalDTO.g:1293:3: 
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
    // InternalDTO.g:1301:1: rule__BasicType__Group_5__1 : rule__BasicType__Group_5__1__Impl ;
    public final void rule__BasicType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1305:1: ( rule__BasicType__Group_5__1__Impl )
            // InternalDTO.g:1306:2: rule__BasicType__Group_5__1__Impl
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
    // InternalDTO.g:1312:1: rule__BasicType__Group_5__1__Impl : ( 'image' ) ;
    public final void rule__BasicType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1316:1: ( ( 'image' ) )
            // InternalDTO.g:1317:1: ( 'image' )
            {
            // InternalDTO.g:1317:1: ( 'image' )
            // InternalDTO.g:1318:2: 'image'
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
    // InternalDTO.g:1328:1: rule__Enum__Group__0 : rule__Enum__Group__0__Impl rule__Enum__Group__1 ;
    public final void rule__Enum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1332:1: ( rule__Enum__Group__0__Impl rule__Enum__Group__1 )
            // InternalDTO.g:1333:2: rule__Enum__Group__0__Impl rule__Enum__Group__1
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
    // InternalDTO.g:1340:1: rule__Enum__Group__0__Impl : ( 'enum' ) ;
    public final void rule__Enum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1344:1: ( ( 'enum' ) )
            // InternalDTO.g:1345:1: ( 'enum' )
            {
            // InternalDTO.g:1345:1: ( 'enum' )
            // InternalDTO.g:1346:2: 'enum'
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
    // InternalDTO.g:1355:1: rule__Enum__Group__1 : rule__Enum__Group__1__Impl rule__Enum__Group__2 ;
    public final void rule__Enum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1359:1: ( rule__Enum__Group__1__Impl rule__Enum__Group__2 )
            // InternalDTO.g:1360:2: rule__Enum__Group__1__Impl rule__Enum__Group__2
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
    // InternalDTO.g:1367:1: rule__Enum__Group__1__Impl : ( ( rule__Enum__NameAssignment_1 ) ) ;
    public final void rule__Enum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1371:1: ( ( ( rule__Enum__NameAssignment_1 ) ) )
            // InternalDTO.g:1372:1: ( ( rule__Enum__NameAssignment_1 ) )
            {
            // InternalDTO.g:1372:1: ( ( rule__Enum__NameAssignment_1 ) )
            // InternalDTO.g:1373:2: ( rule__Enum__NameAssignment_1 )
            {
             before(grammarAccess.getEnumAccess().getNameAssignment_1()); 
            // InternalDTO.g:1374:2: ( rule__Enum__NameAssignment_1 )
            // InternalDTO.g:1374:3: rule__Enum__NameAssignment_1
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
    // InternalDTO.g:1382:1: rule__Enum__Group__2 : rule__Enum__Group__2__Impl rule__Enum__Group__3 ;
    public final void rule__Enum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1386:1: ( rule__Enum__Group__2__Impl rule__Enum__Group__3 )
            // InternalDTO.g:1387:2: rule__Enum__Group__2__Impl rule__Enum__Group__3
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
    // InternalDTO.g:1394:1: rule__Enum__Group__2__Impl : ( '{' ) ;
    public final void rule__Enum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1398:1: ( ( '{' ) )
            // InternalDTO.g:1399:1: ( '{' )
            {
            // InternalDTO.g:1399:1: ( '{' )
            // InternalDTO.g:1400:2: '{'
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
    // InternalDTO.g:1409:1: rule__Enum__Group__3 : rule__Enum__Group__3__Impl rule__Enum__Group__4 ;
    public final void rule__Enum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1413:1: ( rule__Enum__Group__3__Impl rule__Enum__Group__4 )
            // InternalDTO.g:1414:2: rule__Enum__Group__3__Impl rule__Enum__Group__4
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
    // InternalDTO.g:1421:1: rule__Enum__Group__3__Impl : ( ( rule__Enum__AttributesAssignment_3 )* ) ;
    public final void rule__Enum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1425:1: ( ( ( rule__Enum__AttributesAssignment_3 )* ) )
            // InternalDTO.g:1426:1: ( ( rule__Enum__AttributesAssignment_3 )* )
            {
            // InternalDTO.g:1426:1: ( ( rule__Enum__AttributesAssignment_3 )* )
            // InternalDTO.g:1427:2: ( rule__Enum__AttributesAssignment_3 )*
            {
             before(grammarAccess.getEnumAccess().getAttributesAssignment_3()); 
            // InternalDTO.g:1428:2: ( rule__Enum__AttributesAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1==RULE_ID) ) {
                        int LA14_4 = input.LA(3);

                        if ( ((LA14_4>=20 && LA14_4<=21)||LA14_4==36) ) {
                            alt14=1;
                        }


                    }


                }
                else if ( ((LA14_0>=22 && LA14_0<=26)||(LA14_0>=37 && LA14_0<=42)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDTO.g:1428:3: rule__Enum__AttributesAssignment_3
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
    // InternalDTO.g:1436:1: rule__Enum__Group__4 : rule__Enum__Group__4__Impl rule__Enum__Group__5 ;
    public final void rule__Enum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1440:1: ( rule__Enum__Group__4__Impl rule__Enum__Group__5 )
            // InternalDTO.g:1441:2: rule__Enum__Group__4__Impl rule__Enum__Group__5
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
    // InternalDTO.g:1448:1: rule__Enum__Group__4__Impl : ( ( ( rule__Enum__LiteralsAssignment_4 ) ) ( ( rule__Enum__LiteralsAssignment_4 )* ) ) ;
    public final void rule__Enum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1452:1: ( ( ( ( rule__Enum__LiteralsAssignment_4 ) ) ( ( rule__Enum__LiteralsAssignment_4 )* ) ) )
            // InternalDTO.g:1453:1: ( ( ( rule__Enum__LiteralsAssignment_4 ) ) ( ( rule__Enum__LiteralsAssignment_4 )* ) )
            {
            // InternalDTO.g:1453:1: ( ( ( rule__Enum__LiteralsAssignment_4 ) ) ( ( rule__Enum__LiteralsAssignment_4 )* ) )
            // InternalDTO.g:1454:2: ( ( rule__Enum__LiteralsAssignment_4 ) ) ( ( rule__Enum__LiteralsAssignment_4 )* )
            {
            // InternalDTO.g:1454:2: ( ( rule__Enum__LiteralsAssignment_4 ) )
            // InternalDTO.g:1455:3: ( rule__Enum__LiteralsAssignment_4 )
            {
             before(grammarAccess.getEnumAccess().getLiteralsAssignment_4()); 
            // InternalDTO.g:1456:3: ( rule__Enum__LiteralsAssignment_4 )
            // InternalDTO.g:1456:4: rule__Enum__LiteralsAssignment_4
            {
            pushFollow(FOLLOW_7);
            rule__Enum__LiteralsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getLiteralsAssignment_4()); 

            }

            // InternalDTO.g:1459:2: ( ( rule__Enum__LiteralsAssignment_4 )* )
            // InternalDTO.g:1460:3: ( rule__Enum__LiteralsAssignment_4 )*
            {
             before(grammarAccess.getEnumAccess().getLiteralsAssignment_4()); 
            // InternalDTO.g:1461:3: ( rule__Enum__LiteralsAssignment_4 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDTO.g:1461:4: rule__Enum__LiteralsAssignment_4
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
    // InternalDTO.g:1470:1: rule__Enum__Group__5 : rule__Enum__Group__5__Impl ;
    public final void rule__Enum__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1474:1: ( rule__Enum__Group__5__Impl )
            // InternalDTO.g:1475:2: rule__Enum__Group__5__Impl
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
    // InternalDTO.g:1481:1: rule__Enum__Group__5__Impl : ( '}' ) ;
    public final void rule__Enum__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1485:1: ( ( '}' ) )
            // InternalDTO.g:1486:1: ( '}' )
            {
            // InternalDTO.g:1486:1: ( '}' )
            // InternalDTO.g:1487:2: '}'
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
    // InternalDTO.g:1497:1: rule__EnumLiteral__Group__0 : rule__EnumLiteral__Group__0__Impl rule__EnumLiteral__Group__1 ;
    public final void rule__EnumLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1501:1: ( rule__EnumLiteral__Group__0__Impl rule__EnumLiteral__Group__1 )
            // InternalDTO.g:1502:2: rule__EnumLiteral__Group__0__Impl rule__EnumLiteral__Group__1
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
    // InternalDTO.g:1509:1: rule__EnumLiteral__Group__0__Impl : ( ( rule__EnumLiteral__NameAssignment_0 ) ) ;
    public final void rule__EnumLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1513:1: ( ( ( rule__EnumLiteral__NameAssignment_0 ) ) )
            // InternalDTO.g:1514:1: ( ( rule__EnumLiteral__NameAssignment_0 ) )
            {
            // InternalDTO.g:1514:1: ( ( rule__EnumLiteral__NameAssignment_0 ) )
            // InternalDTO.g:1515:2: ( rule__EnumLiteral__NameAssignment_0 )
            {
             before(grammarAccess.getEnumLiteralAccess().getNameAssignment_0()); 
            // InternalDTO.g:1516:2: ( rule__EnumLiteral__NameAssignment_0 )
            // InternalDTO.g:1516:3: rule__EnumLiteral__NameAssignment_0
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
    // InternalDTO.g:1524:1: rule__EnumLiteral__Group__1 : rule__EnumLiteral__Group__1__Impl ;
    public final void rule__EnumLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1528:1: ( rule__EnumLiteral__Group__1__Impl )
            // InternalDTO.g:1529:2: rule__EnumLiteral__Group__1__Impl
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
    // InternalDTO.g:1535:1: rule__EnumLiteral__Group__1__Impl : ( ( rule__EnumLiteral__Group_1__0 )? ) ;
    public final void rule__EnumLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1539:1: ( ( ( rule__EnumLiteral__Group_1__0 )? ) )
            // InternalDTO.g:1540:1: ( ( rule__EnumLiteral__Group_1__0 )? )
            {
            // InternalDTO.g:1540:1: ( ( rule__EnumLiteral__Group_1__0 )? )
            // InternalDTO.g:1541:2: ( rule__EnumLiteral__Group_1__0 )?
            {
             before(grammarAccess.getEnumLiteralAccess().getGroup_1()); 
            // InternalDTO.g:1542:2: ( rule__EnumLiteral__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDTO.g:1542:3: rule__EnumLiteral__Group_1__0
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
    // InternalDTO.g:1551:1: rule__EnumLiteral__Group_1__0 : rule__EnumLiteral__Group_1__0__Impl rule__EnumLiteral__Group_1__1 ;
    public final void rule__EnumLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1555:1: ( rule__EnumLiteral__Group_1__0__Impl rule__EnumLiteral__Group_1__1 )
            // InternalDTO.g:1556:2: rule__EnumLiteral__Group_1__0__Impl rule__EnumLiteral__Group_1__1
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
    // InternalDTO.g:1563:1: rule__EnumLiteral__Group_1__0__Impl : ( '(' ) ;
    public final void rule__EnumLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1567:1: ( ( '(' ) )
            // InternalDTO.g:1568:1: ( '(' )
            {
            // InternalDTO.g:1568:1: ( '(' )
            // InternalDTO.g:1569:2: '('
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
    // InternalDTO.g:1578:1: rule__EnumLiteral__Group_1__1 : rule__EnumLiteral__Group_1__1__Impl rule__EnumLiteral__Group_1__2 ;
    public final void rule__EnumLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1582:1: ( rule__EnumLiteral__Group_1__1__Impl rule__EnumLiteral__Group_1__2 )
            // InternalDTO.g:1583:2: rule__EnumLiteral__Group_1__1__Impl rule__EnumLiteral__Group_1__2
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
    // InternalDTO.g:1590:1: rule__EnumLiteral__Group_1__1__Impl : ( ( rule__EnumLiteral__ParamsAssignment_1_1 ) ) ;
    public final void rule__EnumLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1594:1: ( ( ( rule__EnumLiteral__ParamsAssignment_1_1 ) ) )
            // InternalDTO.g:1595:1: ( ( rule__EnumLiteral__ParamsAssignment_1_1 ) )
            {
            // InternalDTO.g:1595:1: ( ( rule__EnumLiteral__ParamsAssignment_1_1 ) )
            // InternalDTO.g:1596:2: ( rule__EnumLiteral__ParamsAssignment_1_1 )
            {
             before(grammarAccess.getEnumLiteralAccess().getParamsAssignment_1_1()); 
            // InternalDTO.g:1597:2: ( rule__EnumLiteral__ParamsAssignment_1_1 )
            // InternalDTO.g:1597:3: rule__EnumLiteral__ParamsAssignment_1_1
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
    // InternalDTO.g:1605:1: rule__EnumLiteral__Group_1__2 : rule__EnumLiteral__Group_1__2__Impl rule__EnumLiteral__Group_1__3 ;
    public final void rule__EnumLiteral__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1609:1: ( rule__EnumLiteral__Group_1__2__Impl rule__EnumLiteral__Group_1__3 )
            // InternalDTO.g:1610:2: rule__EnumLiteral__Group_1__2__Impl rule__EnumLiteral__Group_1__3
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
    // InternalDTO.g:1617:1: rule__EnumLiteral__Group_1__2__Impl : ( ( rule__EnumLiteral__Group_1_2__0 )* ) ;
    public final void rule__EnumLiteral__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1621:1: ( ( ( rule__EnumLiteral__Group_1_2__0 )* ) )
            // InternalDTO.g:1622:1: ( ( rule__EnumLiteral__Group_1_2__0 )* )
            {
            // InternalDTO.g:1622:1: ( ( rule__EnumLiteral__Group_1_2__0 )* )
            // InternalDTO.g:1623:2: ( rule__EnumLiteral__Group_1_2__0 )*
            {
             before(grammarAccess.getEnumLiteralAccess().getGroup_1_2()); 
            // InternalDTO.g:1624:2: ( rule__EnumLiteral__Group_1_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==30) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDTO.g:1624:3: rule__EnumLiteral__Group_1_2__0
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
    // InternalDTO.g:1632:1: rule__EnumLiteral__Group_1__3 : rule__EnumLiteral__Group_1__3__Impl ;
    public final void rule__EnumLiteral__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1636:1: ( rule__EnumLiteral__Group_1__3__Impl )
            // InternalDTO.g:1637:2: rule__EnumLiteral__Group_1__3__Impl
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
    // InternalDTO.g:1643:1: rule__EnumLiteral__Group_1__3__Impl : ( ')' ) ;
    public final void rule__EnumLiteral__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1647:1: ( ( ')' ) )
            // InternalDTO.g:1648:1: ( ')' )
            {
            // InternalDTO.g:1648:1: ( ')' )
            // InternalDTO.g:1649:2: ')'
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
    // InternalDTO.g:1659:1: rule__EnumLiteral__Group_1_2__0 : rule__EnumLiteral__Group_1_2__0__Impl rule__EnumLiteral__Group_1_2__1 ;
    public final void rule__EnumLiteral__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1663:1: ( rule__EnumLiteral__Group_1_2__0__Impl rule__EnumLiteral__Group_1_2__1 )
            // InternalDTO.g:1664:2: rule__EnumLiteral__Group_1_2__0__Impl rule__EnumLiteral__Group_1_2__1
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
    // InternalDTO.g:1671:1: rule__EnumLiteral__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__EnumLiteral__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1675:1: ( ( ',' ) )
            // InternalDTO.g:1676:1: ( ',' )
            {
            // InternalDTO.g:1676:1: ( ',' )
            // InternalDTO.g:1677:2: ','
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
    // InternalDTO.g:1686:1: rule__EnumLiteral__Group_1_2__1 : rule__EnumLiteral__Group_1_2__1__Impl ;
    public final void rule__EnumLiteral__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1690:1: ( rule__EnumLiteral__Group_1_2__1__Impl )
            // InternalDTO.g:1691:2: rule__EnumLiteral__Group_1_2__1__Impl
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
    // InternalDTO.g:1697:1: rule__EnumLiteral__Group_1_2__1__Impl : ( ( rule__EnumLiteral__ParamsAssignment_1_2_1 ) ) ;
    public final void rule__EnumLiteral__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1701:1: ( ( ( rule__EnumLiteral__ParamsAssignment_1_2_1 ) ) )
            // InternalDTO.g:1702:1: ( ( rule__EnumLiteral__ParamsAssignment_1_2_1 ) )
            {
            // InternalDTO.g:1702:1: ( ( rule__EnumLiteral__ParamsAssignment_1_2_1 ) )
            // InternalDTO.g:1703:2: ( rule__EnumLiteral__ParamsAssignment_1_2_1 )
            {
             before(grammarAccess.getEnumLiteralAccess().getParamsAssignment_1_2_1()); 
            // InternalDTO.g:1704:2: ( rule__EnumLiteral__ParamsAssignment_1_2_1 )
            // InternalDTO.g:1704:3: rule__EnumLiteral__ParamsAssignment_1_2_1
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
    // InternalDTO.g:1713:1: rule__Constant__Group_0__0 : rule__Constant__Group_0__0__Impl rule__Constant__Group_0__1 ;
    public final void rule__Constant__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1717:1: ( rule__Constant__Group_0__0__Impl rule__Constant__Group_0__1 )
            // InternalDTO.g:1718:2: rule__Constant__Group_0__0__Impl rule__Constant__Group_0__1
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
    // InternalDTO.g:1725:1: rule__Constant__Group_0__0__Impl : ( () ) ;
    public final void rule__Constant__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1729:1: ( ( () ) )
            // InternalDTO.g:1730:1: ( () )
            {
            // InternalDTO.g:1730:1: ( () )
            // InternalDTO.g:1731:2: ()
            {
             before(grammarAccess.getConstantAccess().getIntConstantAction_0_0()); 
            // InternalDTO.g:1732:2: ()
            // InternalDTO.g:1732:3: 
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
    // InternalDTO.g:1740:1: rule__Constant__Group_0__1 : rule__Constant__Group_0__1__Impl ;
    public final void rule__Constant__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1744:1: ( rule__Constant__Group_0__1__Impl )
            // InternalDTO.g:1745:2: rule__Constant__Group_0__1__Impl
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
    // InternalDTO.g:1751:1: rule__Constant__Group_0__1__Impl : ( ( rule__Constant__ValueAssignment_0_1 ) ) ;
    public final void rule__Constant__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1755:1: ( ( ( rule__Constant__ValueAssignment_0_1 ) ) )
            // InternalDTO.g:1756:1: ( ( rule__Constant__ValueAssignment_0_1 ) )
            {
            // InternalDTO.g:1756:1: ( ( rule__Constant__ValueAssignment_0_1 ) )
            // InternalDTO.g:1757:2: ( rule__Constant__ValueAssignment_0_1 )
            {
             before(grammarAccess.getConstantAccess().getValueAssignment_0_1()); 
            // InternalDTO.g:1758:2: ( rule__Constant__ValueAssignment_0_1 )
            // InternalDTO.g:1758:3: rule__Constant__ValueAssignment_0_1
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
    // InternalDTO.g:1767:1: rule__Constant__Group_1__0 : rule__Constant__Group_1__0__Impl rule__Constant__Group_1__1 ;
    public final void rule__Constant__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1771:1: ( rule__Constant__Group_1__0__Impl rule__Constant__Group_1__1 )
            // InternalDTO.g:1772:2: rule__Constant__Group_1__0__Impl rule__Constant__Group_1__1
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
    // InternalDTO.g:1779:1: rule__Constant__Group_1__0__Impl : ( () ) ;
    public final void rule__Constant__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1783:1: ( ( () ) )
            // InternalDTO.g:1784:1: ( () )
            {
            // InternalDTO.g:1784:1: ( () )
            // InternalDTO.g:1785:2: ()
            {
             before(grammarAccess.getConstantAccess().getLongConstantAction_1_0()); 
            // InternalDTO.g:1786:2: ()
            // InternalDTO.g:1786:3: 
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
    // InternalDTO.g:1794:1: rule__Constant__Group_1__1 : rule__Constant__Group_1__1__Impl rule__Constant__Group_1__2 ;
    public final void rule__Constant__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1798:1: ( rule__Constant__Group_1__1__Impl rule__Constant__Group_1__2 )
            // InternalDTO.g:1799:2: rule__Constant__Group_1__1__Impl rule__Constant__Group_1__2
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
    // InternalDTO.g:1806:1: rule__Constant__Group_1__1__Impl : ( ( rule__Constant__ValueAssignment_1_1 ) ) ;
    public final void rule__Constant__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1810:1: ( ( ( rule__Constant__ValueAssignment_1_1 ) ) )
            // InternalDTO.g:1811:1: ( ( rule__Constant__ValueAssignment_1_1 ) )
            {
            // InternalDTO.g:1811:1: ( ( rule__Constant__ValueAssignment_1_1 ) )
            // InternalDTO.g:1812:2: ( rule__Constant__ValueAssignment_1_1 )
            {
             before(grammarAccess.getConstantAccess().getValueAssignment_1_1()); 
            // InternalDTO.g:1813:2: ( rule__Constant__ValueAssignment_1_1 )
            // InternalDTO.g:1813:3: rule__Constant__ValueAssignment_1_1
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
    // InternalDTO.g:1821:1: rule__Constant__Group_1__2 : rule__Constant__Group_1__2__Impl ;
    public final void rule__Constant__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1825:1: ( rule__Constant__Group_1__2__Impl )
            // InternalDTO.g:1826:2: rule__Constant__Group_1__2__Impl
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
    // InternalDTO.g:1832:1: rule__Constant__Group_1__2__Impl : ( 'L' ) ;
    public final void rule__Constant__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1836:1: ( ( 'L' ) )
            // InternalDTO.g:1837:1: ( 'L' )
            {
            // InternalDTO.g:1837:1: ( 'L' )
            // InternalDTO.g:1838:2: 'L'
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
    // InternalDTO.g:1848:1: rule__Constant__Group_2__0 : rule__Constant__Group_2__0__Impl rule__Constant__Group_2__1 ;
    public final void rule__Constant__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1852:1: ( rule__Constant__Group_2__0__Impl rule__Constant__Group_2__1 )
            // InternalDTO.g:1853:2: rule__Constant__Group_2__0__Impl rule__Constant__Group_2__1
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
    // InternalDTO.g:1860:1: rule__Constant__Group_2__0__Impl : ( () ) ;
    public final void rule__Constant__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1864:1: ( ( () ) )
            // InternalDTO.g:1865:1: ( () )
            {
            // InternalDTO.g:1865:1: ( () )
            // InternalDTO.g:1866:2: ()
            {
             before(grammarAccess.getConstantAccess().getStringConstantAction_2_0()); 
            // InternalDTO.g:1867:2: ()
            // InternalDTO.g:1867:3: 
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
    // InternalDTO.g:1875:1: rule__Constant__Group_2__1 : rule__Constant__Group_2__1__Impl ;
    public final void rule__Constant__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1879:1: ( rule__Constant__Group_2__1__Impl )
            // InternalDTO.g:1880:2: rule__Constant__Group_2__1__Impl
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
    // InternalDTO.g:1886:1: rule__Constant__Group_2__1__Impl : ( ( rule__Constant__ValueAssignment_2_1 ) ) ;
    public final void rule__Constant__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1890:1: ( ( ( rule__Constant__ValueAssignment_2_1 ) ) )
            // InternalDTO.g:1891:1: ( ( rule__Constant__ValueAssignment_2_1 ) )
            {
            // InternalDTO.g:1891:1: ( ( rule__Constant__ValueAssignment_2_1 ) )
            // InternalDTO.g:1892:2: ( rule__Constant__ValueAssignment_2_1 )
            {
             before(grammarAccess.getConstantAccess().getValueAssignment_2_1()); 
            // InternalDTO.g:1893:2: ( rule__Constant__ValueAssignment_2_1 )
            // InternalDTO.g:1893:3: rule__Constant__ValueAssignment_2_1
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
    // InternalDTO.g:1902:1: rule__Constant__Group_3__0 : rule__Constant__Group_3__0__Impl rule__Constant__Group_3__1 ;
    public final void rule__Constant__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1906:1: ( rule__Constant__Group_3__0__Impl rule__Constant__Group_3__1 )
            // InternalDTO.g:1907:2: rule__Constant__Group_3__0__Impl rule__Constant__Group_3__1
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
    // InternalDTO.g:1914:1: rule__Constant__Group_3__0__Impl : ( () ) ;
    public final void rule__Constant__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1918:1: ( ( () ) )
            // InternalDTO.g:1919:1: ( () )
            {
            // InternalDTO.g:1919:1: ( () )
            // InternalDTO.g:1920:2: ()
            {
             before(grammarAccess.getConstantAccess().getBoolConstantAction_3_0()); 
            // InternalDTO.g:1921:2: ()
            // InternalDTO.g:1921:3: 
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
    // InternalDTO.g:1929:1: rule__Constant__Group_3__1 : rule__Constant__Group_3__1__Impl ;
    public final void rule__Constant__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1933:1: ( rule__Constant__Group_3__1__Impl )
            // InternalDTO.g:1934:2: rule__Constant__Group_3__1__Impl
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
    // InternalDTO.g:1940:1: rule__Constant__Group_3__1__Impl : ( ( rule__Constant__ValueAssignment_3_1 ) ) ;
    public final void rule__Constant__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1944:1: ( ( ( rule__Constant__ValueAssignment_3_1 ) ) )
            // InternalDTO.g:1945:1: ( ( rule__Constant__ValueAssignment_3_1 ) )
            {
            // InternalDTO.g:1945:1: ( ( rule__Constant__ValueAssignment_3_1 ) )
            // InternalDTO.g:1946:2: ( rule__Constant__ValueAssignment_3_1 )
            {
             before(grammarAccess.getConstantAccess().getValueAssignment_3_1()); 
            // InternalDTO.g:1947:2: ( rule__Constant__ValueAssignment_3_1 )
            // InternalDTO.g:1947:3: rule__Constant__ValueAssignment_3_1
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
    // InternalDTO.g:1956:1: rule__Constant__Group_4__0 : rule__Constant__Group_4__0__Impl rule__Constant__Group_4__1 ;
    public final void rule__Constant__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1960:1: ( rule__Constant__Group_4__0__Impl rule__Constant__Group_4__1 )
            // InternalDTO.g:1961:2: rule__Constant__Group_4__0__Impl rule__Constant__Group_4__1
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
    // InternalDTO.g:1968:1: rule__Constant__Group_4__0__Impl : ( () ) ;
    public final void rule__Constant__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1972:1: ( ( () ) )
            // InternalDTO.g:1973:1: ( () )
            {
            // InternalDTO.g:1973:1: ( () )
            // InternalDTO.g:1974:2: ()
            {
             before(grammarAccess.getConstantAccess().getDateConstantAction_4_0()); 
            // InternalDTO.g:1975:2: ()
            // InternalDTO.g:1975:3: 
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
    // InternalDTO.g:1983:1: rule__Constant__Group_4__1 : rule__Constant__Group_4__1__Impl rule__Constant__Group_4__2 ;
    public final void rule__Constant__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1987:1: ( rule__Constant__Group_4__1__Impl rule__Constant__Group_4__2 )
            // InternalDTO.g:1988:2: rule__Constant__Group_4__1__Impl rule__Constant__Group_4__2
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
    // InternalDTO.g:1995:1: rule__Constant__Group_4__1__Impl : ( ( rule__Constant__DayAssignment_4_1 ) ) ;
    public final void rule__Constant__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1999:1: ( ( ( rule__Constant__DayAssignment_4_1 ) ) )
            // InternalDTO.g:2000:1: ( ( rule__Constant__DayAssignment_4_1 ) )
            {
            // InternalDTO.g:2000:1: ( ( rule__Constant__DayAssignment_4_1 ) )
            // InternalDTO.g:2001:2: ( rule__Constant__DayAssignment_4_1 )
            {
             before(grammarAccess.getConstantAccess().getDayAssignment_4_1()); 
            // InternalDTO.g:2002:2: ( rule__Constant__DayAssignment_4_1 )
            // InternalDTO.g:2002:3: rule__Constant__DayAssignment_4_1
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
    // InternalDTO.g:2010:1: rule__Constant__Group_4__2 : rule__Constant__Group_4__2__Impl rule__Constant__Group_4__3 ;
    public final void rule__Constant__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2014:1: ( rule__Constant__Group_4__2__Impl rule__Constant__Group_4__3 )
            // InternalDTO.g:2015:2: rule__Constant__Group_4__2__Impl rule__Constant__Group_4__3
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
    // InternalDTO.g:2022:1: rule__Constant__Group_4__2__Impl : ( '/' ) ;
    public final void rule__Constant__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2026:1: ( ( '/' ) )
            // InternalDTO.g:2027:1: ( '/' )
            {
            // InternalDTO.g:2027:1: ( '/' )
            // InternalDTO.g:2028:2: '/'
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
    // InternalDTO.g:2037:1: rule__Constant__Group_4__3 : rule__Constant__Group_4__3__Impl rule__Constant__Group_4__4 ;
    public final void rule__Constant__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2041:1: ( rule__Constant__Group_4__3__Impl rule__Constant__Group_4__4 )
            // InternalDTO.g:2042:2: rule__Constant__Group_4__3__Impl rule__Constant__Group_4__4
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
    // InternalDTO.g:2049:1: rule__Constant__Group_4__3__Impl : ( ( rule__Constant__MonthAssignment_4_3 ) ) ;
    public final void rule__Constant__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2053:1: ( ( ( rule__Constant__MonthAssignment_4_3 ) ) )
            // InternalDTO.g:2054:1: ( ( rule__Constant__MonthAssignment_4_3 ) )
            {
            // InternalDTO.g:2054:1: ( ( rule__Constant__MonthAssignment_4_3 ) )
            // InternalDTO.g:2055:2: ( rule__Constant__MonthAssignment_4_3 )
            {
             before(grammarAccess.getConstantAccess().getMonthAssignment_4_3()); 
            // InternalDTO.g:2056:2: ( rule__Constant__MonthAssignment_4_3 )
            // InternalDTO.g:2056:3: rule__Constant__MonthAssignment_4_3
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
    // InternalDTO.g:2064:1: rule__Constant__Group_4__4 : rule__Constant__Group_4__4__Impl rule__Constant__Group_4__5 ;
    public final void rule__Constant__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2068:1: ( rule__Constant__Group_4__4__Impl rule__Constant__Group_4__5 )
            // InternalDTO.g:2069:2: rule__Constant__Group_4__4__Impl rule__Constant__Group_4__5
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
    // InternalDTO.g:2076:1: rule__Constant__Group_4__4__Impl : ( '/' ) ;
    public final void rule__Constant__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2080:1: ( ( '/' ) )
            // InternalDTO.g:2081:1: ( '/' )
            {
            // InternalDTO.g:2081:1: ( '/' )
            // InternalDTO.g:2082:2: '/'
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
    // InternalDTO.g:2091:1: rule__Constant__Group_4__5 : rule__Constant__Group_4__5__Impl ;
    public final void rule__Constant__Group_4__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2095:1: ( rule__Constant__Group_4__5__Impl )
            // InternalDTO.g:2096:2: rule__Constant__Group_4__5__Impl
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
    // InternalDTO.g:2102:1: rule__Constant__Group_4__5__Impl : ( ( rule__Constant__YearAssignment_4_5 ) ) ;
    public final void rule__Constant__Group_4__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2106:1: ( ( ( rule__Constant__YearAssignment_4_5 ) ) )
            // InternalDTO.g:2107:1: ( ( rule__Constant__YearAssignment_4_5 ) )
            {
            // InternalDTO.g:2107:1: ( ( rule__Constant__YearAssignment_4_5 ) )
            // InternalDTO.g:2108:2: ( rule__Constant__YearAssignment_4_5 )
            {
             before(grammarAccess.getConstantAccess().getYearAssignment_4_5()); 
            // InternalDTO.g:2109:2: ( rule__Constant__YearAssignment_4_5 )
            // InternalDTO.g:2109:3: rule__Constant__YearAssignment_4_5
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
    // InternalDTO.g:2118:1: rule__Constant__Group_5__0 : rule__Constant__Group_5__0__Impl rule__Constant__Group_5__1 ;
    public final void rule__Constant__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2122:1: ( rule__Constant__Group_5__0__Impl rule__Constant__Group_5__1 )
            // InternalDTO.g:2123:2: rule__Constant__Group_5__0__Impl rule__Constant__Group_5__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalDTO.g:2130:1: rule__Constant__Group_5__0__Impl : ( () ) ;
    public final void rule__Constant__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2134:1: ( ( () ) )
            // InternalDTO.g:2135:1: ( () )
            {
            // InternalDTO.g:2135:1: ( () )
            // InternalDTO.g:2136:2: ()
            {
             before(grammarAccess.getConstantAccess().getNullAction_5_0()); 
            // InternalDTO.g:2137:2: ()
            // InternalDTO.g:2137:3: 
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
    // InternalDTO.g:2145:1: rule__Constant__Group_5__1 : rule__Constant__Group_5__1__Impl ;
    public final void rule__Constant__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2149:1: ( rule__Constant__Group_5__1__Impl )
            // InternalDTO.g:2150:2: rule__Constant__Group_5__1__Impl
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
    // InternalDTO.g:2156:1: rule__Constant__Group_5__1__Impl : ( 'null' ) ;
    public final void rule__Constant__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2160:1: ( ( 'null' ) )
            // InternalDTO.g:2161:1: ( 'null' )
            {
            // InternalDTO.g:2161:1: ( 'null' )
            // InternalDTO.g:2162:2: 'null'
            {
             before(grammarAccess.getConstantAccess().getNullKeyword_5_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalDTO.g:2172:1: rule__EntityOption__Group_0__0 : rule__EntityOption__Group_0__0__Impl rule__EntityOption__Group_0__1 ;
    public final void rule__EntityOption__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2176:1: ( rule__EntityOption__Group_0__0__Impl rule__EntityOption__Group_0__1 )
            // InternalDTO.g:2177:2: rule__EntityOption__Group_0__0__Impl rule__EntityOption__Group_0__1
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
    // InternalDTO.g:2184:1: rule__EntityOption__Group_0__0__Impl : ( () ) ;
    public final void rule__EntityOption__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2188:1: ( ( () ) )
            // InternalDTO.g:2189:1: ( () )
            {
            // InternalDTO.g:2189:1: ( () )
            // InternalDTO.g:2190:2: ()
            {
             before(grammarAccess.getEntityOptionAccess().getEntityDeleteOptionAction_0_0()); 
            // InternalDTO.g:2191:2: ()
            // InternalDTO.g:2191:3: 
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
    // InternalDTO.g:2199:1: rule__EntityOption__Group_0__1 : rule__EntityOption__Group_0__1__Impl ;
    public final void rule__EntityOption__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2203:1: ( rule__EntityOption__Group_0__1__Impl )
            // InternalDTO.g:2204:2: rule__EntityOption__Group_0__1__Impl
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
    // InternalDTO.g:2210:1: rule__EntityOption__Group_0__1__Impl : ( ( rule__EntityOption__DeleteByFlagAssignment_0_1 ) ) ;
    public final void rule__EntityOption__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2214:1: ( ( ( rule__EntityOption__DeleteByFlagAssignment_0_1 ) ) )
            // InternalDTO.g:2215:1: ( ( rule__EntityOption__DeleteByFlagAssignment_0_1 ) )
            {
            // InternalDTO.g:2215:1: ( ( rule__EntityOption__DeleteByFlagAssignment_0_1 ) )
            // InternalDTO.g:2216:2: ( rule__EntityOption__DeleteByFlagAssignment_0_1 )
            {
             before(grammarAccess.getEntityOptionAccess().getDeleteByFlagAssignment_0_1()); 
            // InternalDTO.g:2217:2: ( rule__EntityOption__DeleteByFlagAssignment_0_1 )
            // InternalDTO.g:2217:3: rule__EntityOption__DeleteByFlagAssignment_0_1
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
    // InternalDTO.g:2226:1: rule__EntityOption__Group_1__0 : rule__EntityOption__Group_1__0__Impl rule__EntityOption__Group_1__1 ;
    public final void rule__EntityOption__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2230:1: ( rule__EntityOption__Group_1__0__Impl rule__EntityOption__Group_1__1 )
            // InternalDTO.g:2231:2: rule__EntityOption__Group_1__0__Impl rule__EntityOption__Group_1__1
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
    // InternalDTO.g:2238:1: rule__EntityOption__Group_1__0__Impl : ( () ) ;
    public final void rule__EntityOption__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2242:1: ( ( () ) )
            // InternalDTO.g:2243:1: ( () )
            {
            // InternalDTO.g:2243:1: ( () )
            // InternalDTO.g:2244:2: ()
            {
             before(grammarAccess.getEntityOptionAccess().getInheritanceMappingOptionAction_1_0()); 
            // InternalDTO.g:2245:2: ()
            // InternalDTO.g:2245:3: 
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
    // InternalDTO.g:2253:1: rule__EntityOption__Group_1__1 : rule__EntityOption__Group_1__1__Impl rule__EntityOption__Group_1__2 ;
    public final void rule__EntityOption__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2257:1: ( rule__EntityOption__Group_1__1__Impl rule__EntityOption__Group_1__2 )
            // InternalDTO.g:2258:2: rule__EntityOption__Group_1__1__Impl rule__EntityOption__Group_1__2
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
    // InternalDTO.g:2265:1: rule__EntityOption__Group_1__1__Impl : ( 'inheritance' ) ;
    public final void rule__EntityOption__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2269:1: ( ( 'inheritance' ) )
            // InternalDTO.g:2270:1: ( 'inheritance' )
            {
            // InternalDTO.g:2270:1: ( 'inheritance' )
            // InternalDTO.g:2271:2: 'inheritance'
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
    // InternalDTO.g:2280:1: rule__EntityOption__Group_1__2 : rule__EntityOption__Group_1__2__Impl rule__EntityOption__Group_1__3 ;
    public final void rule__EntityOption__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2284:1: ( rule__EntityOption__Group_1__2__Impl rule__EntityOption__Group_1__3 )
            // InternalDTO.g:2285:2: rule__EntityOption__Group_1__2__Impl rule__EntityOption__Group_1__3
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
    // InternalDTO.g:2292:1: rule__EntityOption__Group_1__2__Impl : ( '=' ) ;
    public final void rule__EntityOption__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2296:1: ( ( '=' ) )
            // InternalDTO.g:2297:1: ( '=' )
            {
            // InternalDTO.g:2297:1: ( '=' )
            // InternalDTO.g:2298:2: '='
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
    // InternalDTO.g:2307:1: rule__EntityOption__Group_1__3 : rule__EntityOption__Group_1__3__Impl ;
    public final void rule__EntityOption__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2311:1: ( rule__EntityOption__Group_1__3__Impl )
            // InternalDTO.g:2312:2: rule__EntityOption__Group_1__3__Impl
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
    // InternalDTO.g:2318:1: rule__EntityOption__Group_1__3__Impl : ( ( rule__EntityOption__InheritanceMappingAssignment_1_3 ) ) ;
    public final void rule__EntityOption__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2322:1: ( ( ( rule__EntityOption__InheritanceMappingAssignment_1_3 ) ) )
            // InternalDTO.g:2323:1: ( ( rule__EntityOption__InheritanceMappingAssignment_1_3 ) )
            {
            // InternalDTO.g:2323:1: ( ( rule__EntityOption__InheritanceMappingAssignment_1_3 ) )
            // InternalDTO.g:2324:2: ( rule__EntityOption__InheritanceMappingAssignment_1_3 )
            {
             before(grammarAccess.getEntityOptionAccess().getInheritanceMappingAssignment_1_3()); 
            // InternalDTO.g:2325:2: ( rule__EntityOption__InheritanceMappingAssignment_1_3 )
            // InternalDTO.g:2325:3: rule__EntityOption__InheritanceMappingAssignment_1_3
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
    // InternalDTO.g:2334:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2338:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalDTO.g:2339:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalDTO.g:2346:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__TypeAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2350:1: ( ( ( rule__Attribute__TypeAssignment_0 ) ) )
            // InternalDTO.g:2351:1: ( ( rule__Attribute__TypeAssignment_0 ) )
            {
            // InternalDTO.g:2351:1: ( ( rule__Attribute__TypeAssignment_0 ) )
            // InternalDTO.g:2352:2: ( rule__Attribute__TypeAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_0()); 
            // InternalDTO.g:2353:2: ( rule__Attribute__TypeAssignment_0 )
            // InternalDTO.g:2353:3: rule__Attribute__TypeAssignment_0
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
    // InternalDTO.g:2361:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2365:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalDTO.g:2366:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
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
    // InternalDTO.g:2373:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2377:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalDTO.g:2378:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalDTO.g:2378:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalDTO.g:2379:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalDTO.g:2380:2: ( rule__Attribute__NameAssignment_1 )
            // InternalDTO.g:2380:3: rule__Attribute__NameAssignment_1
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
    // InternalDTO.g:2388:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2392:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalDTO.g:2393:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
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
    // InternalDTO.g:2400:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__Group_2__0 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2404:1: ( ( ( rule__Attribute__Group_2__0 )? ) )
            // InternalDTO.g:2405:1: ( ( rule__Attribute__Group_2__0 )? )
            {
            // InternalDTO.g:2405:1: ( ( rule__Attribute__Group_2__0 )? )
            // InternalDTO.g:2406:2: ( rule__Attribute__Group_2__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_2()); 
            // InternalDTO.g:2407:2: ( rule__Attribute__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=20 && LA18_0<=21)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDTO.g:2407:3: rule__Attribute__Group_2__0
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
    // InternalDTO.g:2415:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2419:1: ( rule__Attribute__Group__3__Impl )
            // InternalDTO.g:2420:2: rule__Attribute__Group__3__Impl
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
    // InternalDTO.g:2426:1: rule__Attribute__Group__3__Impl : ( ';' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2430:1: ( ( ';' ) )
            // InternalDTO.g:2431:1: ( ';' )
            {
            // InternalDTO.g:2431:1: ( ';' )
            // InternalDTO.g:2432:2: ';'
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
    // InternalDTO.g:2442:1: rule__Attribute__Group_2__0 : rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1 ;
    public final void rule__Attribute__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2446:1: ( rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1 )
            // InternalDTO.g:2447:2: rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1
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
    // InternalDTO.g:2454:1: rule__Attribute__Group_2__0__Impl : ( ( rule__Attribute__OptionsAssignment_2_0 ) ) ;
    public final void rule__Attribute__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2458:1: ( ( ( rule__Attribute__OptionsAssignment_2_0 ) ) )
            // InternalDTO.g:2459:1: ( ( rule__Attribute__OptionsAssignment_2_0 ) )
            {
            // InternalDTO.g:2459:1: ( ( rule__Attribute__OptionsAssignment_2_0 ) )
            // InternalDTO.g:2460:2: ( rule__Attribute__OptionsAssignment_2_0 )
            {
             before(grammarAccess.getAttributeAccess().getOptionsAssignment_2_0()); 
            // InternalDTO.g:2461:2: ( rule__Attribute__OptionsAssignment_2_0 )
            // InternalDTO.g:2461:3: rule__Attribute__OptionsAssignment_2_0
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
    // InternalDTO.g:2469:1: rule__Attribute__Group_2__1 : rule__Attribute__Group_2__1__Impl ;
    public final void rule__Attribute__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2473:1: ( rule__Attribute__Group_2__1__Impl )
            // InternalDTO.g:2474:2: rule__Attribute__Group_2__1__Impl
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
    // InternalDTO.g:2480:1: rule__Attribute__Group_2__1__Impl : ( ( rule__Attribute__Group_2_1__0 )* ) ;
    public final void rule__Attribute__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2484:1: ( ( ( rule__Attribute__Group_2_1__0 )* ) )
            // InternalDTO.g:2485:1: ( ( rule__Attribute__Group_2_1__0 )* )
            {
            // InternalDTO.g:2485:1: ( ( rule__Attribute__Group_2_1__0 )* )
            // InternalDTO.g:2486:2: ( rule__Attribute__Group_2_1__0 )*
            {
             before(grammarAccess.getAttributeAccess().getGroup_2_1()); 
            // InternalDTO.g:2487:2: ( rule__Attribute__Group_2_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==30) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalDTO.g:2487:3: rule__Attribute__Group_2_1__0
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
    // InternalDTO.g:2496:1: rule__Attribute__Group_2_1__0 : rule__Attribute__Group_2_1__0__Impl rule__Attribute__Group_2_1__1 ;
    public final void rule__Attribute__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2500:1: ( rule__Attribute__Group_2_1__0__Impl rule__Attribute__Group_2_1__1 )
            // InternalDTO.g:2501:2: rule__Attribute__Group_2_1__0__Impl rule__Attribute__Group_2_1__1
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
    // InternalDTO.g:2508:1: rule__Attribute__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Attribute__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2512:1: ( ( ',' ) )
            // InternalDTO.g:2513:1: ( ',' )
            {
            // InternalDTO.g:2513:1: ( ',' )
            // InternalDTO.g:2514:2: ','
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
    // InternalDTO.g:2523:1: rule__Attribute__Group_2_1__1 : rule__Attribute__Group_2_1__1__Impl ;
    public final void rule__Attribute__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2527:1: ( rule__Attribute__Group_2_1__1__Impl )
            // InternalDTO.g:2528:2: rule__Attribute__Group_2_1__1__Impl
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
    // InternalDTO.g:2534:1: rule__Attribute__Group_2_1__1__Impl : ( ( rule__Attribute__OptionsAssignment_2_1_1 ) ) ;
    public final void rule__Attribute__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2538:1: ( ( ( rule__Attribute__OptionsAssignment_2_1_1 ) ) )
            // InternalDTO.g:2539:1: ( ( rule__Attribute__OptionsAssignment_2_1_1 ) )
            {
            // InternalDTO.g:2539:1: ( ( rule__Attribute__OptionsAssignment_2_1_1 ) )
            // InternalDTO.g:2540:2: ( rule__Attribute__OptionsAssignment_2_1_1 )
            {
             before(grammarAccess.getAttributeAccess().getOptionsAssignment_2_1_1()); 
            // InternalDTO.g:2541:2: ( rule__Attribute__OptionsAssignment_2_1_1 )
            // InternalDTO.g:2541:3: rule__Attribute__OptionsAssignment_2_1_1
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
    // InternalDTO.g:2550:1: superBasicType__Group_0__0 : superBasicType__Group_0__0__Impl superBasicType__Group_0__1 ;
    public final void superBasicType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2554:1: ( superBasicType__Group_0__0__Impl superBasicType__Group_0__1 )
            // InternalDTO.g:2555:2: superBasicType__Group_0__0__Impl superBasicType__Group_0__1
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
    // InternalDTO.g:2562:1: superBasicType__Group_0__0__Impl : ( () ) ;
    public final void superBasicType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2566:1: ( ( () ) )
            // InternalDTO.g:2567:1: ( () )
            {
            // InternalDTO.g:2567:1: ( () )
            // InternalDTO.g:2568:2: ()
            {
             before(grammarAccess.getDomainModelBasicTypeAccess().getStringTypeAction_0_0()); 
            // InternalDTO.g:2569:2: ()
            // InternalDTO.g:2569:3: 
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
    // InternalDTO.g:2577:1: superBasicType__Group_0__1 : superBasicType__Group_0__1__Impl ;
    public final void superBasicType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2581:1: ( superBasicType__Group_0__1__Impl )
            // InternalDTO.g:2582:2: superBasicType__Group_0__1__Impl
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
    // InternalDTO.g:2588:1: superBasicType__Group_0__1__Impl : ( 'string' ) ;
    public final void superBasicType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2592:1: ( ( 'string' ) )
            // InternalDTO.g:2593:1: ( 'string' )
            {
            // InternalDTO.g:2593:1: ( 'string' )
            // InternalDTO.g:2594:2: 'string'
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
    // InternalDTO.g:2604:1: superBasicType__Group_1__0 : superBasicType__Group_1__0__Impl superBasicType__Group_1__1 ;
    public final void superBasicType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2608:1: ( superBasicType__Group_1__0__Impl superBasicType__Group_1__1 )
            // InternalDTO.g:2609:2: superBasicType__Group_1__0__Impl superBasicType__Group_1__1
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
    // InternalDTO.g:2616:1: superBasicType__Group_1__0__Impl : ( () ) ;
    public final void superBasicType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2620:1: ( ( () ) )
            // InternalDTO.g:2621:1: ( () )
            {
            // InternalDTO.g:2621:1: ( () )
            // InternalDTO.g:2622:2: ()
            {
             before(grammarAccess.getDomainModelBasicTypeAccess().getIntTypeAction_1_0()); 
            // InternalDTO.g:2623:2: ()
            // InternalDTO.g:2623:3: 
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
    // InternalDTO.g:2631:1: superBasicType__Group_1__1 : superBasicType__Group_1__1__Impl ;
    public final void superBasicType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2635:1: ( superBasicType__Group_1__1__Impl )
            // InternalDTO.g:2636:2: superBasicType__Group_1__1__Impl
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
    // InternalDTO.g:2642:1: superBasicType__Group_1__1__Impl : ( 'int' ) ;
    public final void superBasicType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2646:1: ( ( 'int' ) )
            // InternalDTO.g:2647:1: ( 'int' )
            {
            // InternalDTO.g:2647:1: ( 'int' )
            // InternalDTO.g:2648:2: 'int'
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
    // InternalDTO.g:2658:1: superBasicType__Group_2__0 : superBasicType__Group_2__0__Impl superBasicType__Group_2__1 ;
    public final void superBasicType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2662:1: ( superBasicType__Group_2__0__Impl superBasicType__Group_2__1 )
            // InternalDTO.g:2663:2: superBasicType__Group_2__0__Impl superBasicType__Group_2__1
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
    // InternalDTO.g:2670:1: superBasicType__Group_2__0__Impl : ( () ) ;
    public final void superBasicType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2674:1: ( ( () ) )
            // InternalDTO.g:2675:1: ( () )
            {
            // InternalDTO.g:2675:1: ( () )
            // InternalDTO.g:2676:2: ()
            {
             before(grammarAccess.getDomainModelBasicTypeAccess().getLongTypeAction_2_0()); 
            // InternalDTO.g:2677:2: ()
            // InternalDTO.g:2677:3: 
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
    // InternalDTO.g:2685:1: superBasicType__Group_2__1 : superBasicType__Group_2__1__Impl ;
    public final void superBasicType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2689:1: ( superBasicType__Group_2__1__Impl )
            // InternalDTO.g:2690:2: superBasicType__Group_2__1__Impl
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
    // InternalDTO.g:2696:1: superBasicType__Group_2__1__Impl : ( 'long' ) ;
    public final void superBasicType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2700:1: ( ( 'long' ) )
            // InternalDTO.g:2701:1: ( 'long' )
            {
            // InternalDTO.g:2701:1: ( 'long' )
            // InternalDTO.g:2702:2: 'long'
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
    // InternalDTO.g:2712:1: superBasicType__Group_3__0 : superBasicType__Group_3__0__Impl superBasicType__Group_3__1 ;
    public final void superBasicType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2716:1: ( superBasicType__Group_3__0__Impl superBasicType__Group_3__1 )
            // InternalDTO.g:2717:2: superBasicType__Group_3__0__Impl superBasicType__Group_3__1
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
    // InternalDTO.g:2724:1: superBasicType__Group_3__0__Impl : ( () ) ;
    public final void superBasicType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2728:1: ( ( () ) )
            // InternalDTO.g:2729:1: ( () )
            {
            // InternalDTO.g:2729:1: ( () )
            // InternalDTO.g:2730:2: ()
            {
             before(grammarAccess.getDomainModelBasicTypeAccess().getBoolTypeAction_3_0()); 
            // InternalDTO.g:2731:2: ()
            // InternalDTO.g:2731:3: 
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
    // InternalDTO.g:2739:1: superBasicType__Group_3__1 : superBasicType__Group_3__1__Impl ;
    public final void superBasicType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2743:1: ( superBasicType__Group_3__1__Impl )
            // InternalDTO.g:2744:2: superBasicType__Group_3__1__Impl
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
    // InternalDTO.g:2750:1: superBasicType__Group_3__1__Impl : ( 'boolean' ) ;
    public final void superBasicType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2754:1: ( ( 'boolean' ) )
            // InternalDTO.g:2755:1: ( 'boolean' )
            {
            // InternalDTO.g:2755:1: ( 'boolean' )
            // InternalDTO.g:2756:2: 'boolean'
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
    // InternalDTO.g:2766:1: superBasicType__Group_4__0 : superBasicType__Group_4__0__Impl superBasicType__Group_4__1 ;
    public final void superBasicType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2770:1: ( superBasicType__Group_4__0__Impl superBasicType__Group_4__1 )
            // InternalDTO.g:2771:2: superBasicType__Group_4__0__Impl superBasicType__Group_4__1
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
    // InternalDTO.g:2778:1: superBasicType__Group_4__0__Impl : ( () ) ;
    public final void superBasicType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2782:1: ( ( () ) )
            // InternalDTO.g:2783:1: ( () )
            {
            // InternalDTO.g:2783:1: ( () )
            // InternalDTO.g:2784:2: ()
            {
             before(grammarAccess.getDomainModelBasicTypeAccess().getDateTypeAction_4_0()); 
            // InternalDTO.g:2785:2: ()
            // InternalDTO.g:2785:3: 
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
    // InternalDTO.g:2793:1: superBasicType__Group_4__1 : superBasicType__Group_4__1__Impl ;
    public final void superBasicType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2797:1: ( superBasicType__Group_4__1__Impl )
            // InternalDTO.g:2798:2: superBasicType__Group_4__1__Impl
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
    // InternalDTO.g:2804:1: superBasicType__Group_4__1__Impl : ( 'date' ) ;
    public final void superBasicType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2808:1: ( ( 'date' ) )
            // InternalDTO.g:2809:1: ( 'date' )
            {
            // InternalDTO.g:2809:1: ( 'date' )
            // InternalDTO.g:2810:2: 'date'
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


    // $ANTLR start "rule__CollectionType__Group__0"
    // InternalDTO.g:2820:1: rule__CollectionType__Group__0 : rule__CollectionType__Group__0__Impl rule__CollectionType__Group__1 ;
    public final void rule__CollectionType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2824:1: ( rule__CollectionType__Group__0__Impl rule__CollectionType__Group__1 )
            // InternalDTO.g:2825:2: rule__CollectionType__Group__0__Impl rule__CollectionType__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalDTO.g:2832:1: rule__CollectionType__Group__0__Impl : ( 'List' ) ;
    public final void rule__CollectionType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2836:1: ( ( 'List' ) )
            // InternalDTO.g:2837:1: ( 'List' )
            {
            // InternalDTO.g:2837:1: ( 'List' )
            // InternalDTO.g:2838:2: 'List'
            {
             before(grammarAccess.getCollectionTypeAccess().getListKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalDTO.g:2847:1: rule__CollectionType__Group__1 : rule__CollectionType__Group__1__Impl rule__CollectionType__Group__2 ;
    public final void rule__CollectionType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2851:1: ( rule__CollectionType__Group__1__Impl rule__CollectionType__Group__2 )
            // InternalDTO.g:2852:2: rule__CollectionType__Group__1__Impl rule__CollectionType__Group__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalDTO.g:2859:1: rule__CollectionType__Group__1__Impl : ( '<' ) ;
    public final void rule__CollectionType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2863:1: ( ( '<' ) )
            // InternalDTO.g:2864:1: ( '<' )
            {
            // InternalDTO.g:2864:1: ( '<' )
            // InternalDTO.g:2865:2: '<'
            {
             before(grammarAccess.getCollectionTypeAccess().getLessThanSignKeyword_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalDTO.g:2874:1: rule__CollectionType__Group__2 : rule__CollectionType__Group__2__Impl rule__CollectionType__Group__3 ;
    public final void rule__CollectionType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2878:1: ( rule__CollectionType__Group__2__Impl rule__CollectionType__Group__3 )
            // InternalDTO.g:2879:2: rule__CollectionType__Group__2__Impl rule__CollectionType__Group__3
            {
            pushFollow(FOLLOW_41);
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
    // InternalDTO.g:2886:1: rule__CollectionType__Group__2__Impl : ( ( rule__CollectionType__OfTypeAssignment_2 ) ) ;
    public final void rule__CollectionType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2890:1: ( ( ( rule__CollectionType__OfTypeAssignment_2 ) ) )
            // InternalDTO.g:2891:1: ( ( rule__CollectionType__OfTypeAssignment_2 ) )
            {
            // InternalDTO.g:2891:1: ( ( rule__CollectionType__OfTypeAssignment_2 ) )
            // InternalDTO.g:2892:2: ( rule__CollectionType__OfTypeAssignment_2 )
            {
             before(grammarAccess.getCollectionTypeAccess().getOfTypeAssignment_2()); 
            // InternalDTO.g:2893:2: ( rule__CollectionType__OfTypeAssignment_2 )
            // InternalDTO.g:2893:3: rule__CollectionType__OfTypeAssignment_2
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
    // InternalDTO.g:2901:1: rule__CollectionType__Group__3 : rule__CollectionType__Group__3__Impl ;
    public final void rule__CollectionType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2905:1: ( rule__CollectionType__Group__3__Impl )
            // InternalDTO.g:2906:2: rule__CollectionType__Group__3__Impl
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
    // InternalDTO.g:2912:1: rule__CollectionType__Group__3__Impl : ( '>' ) ;
    public final void rule__CollectionType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2916:1: ( ( '>' ) )
            // InternalDTO.g:2917:1: ( '>' )
            {
            // InternalDTO.g:2917:1: ( '>' )
            // InternalDTO.g:2918:2: '>'
            {
             before(grammarAccess.getCollectionTypeAccess().getGreaterThanSignKeyword_3()); 
            match(input,44,FOLLOW_2); 
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
    // InternalDTO.g:2928:1: rule__DTOModel__ConceptsAssignment : ( ruleConcept ) ;
    public final void rule__DTOModel__ConceptsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2932:1: ( ( ruleConcept ) )
            // InternalDTO.g:2933:2: ( ruleConcept )
            {
            // InternalDTO.g:2933:2: ( ruleConcept )
            // InternalDTO.g:2934:3: ruleConcept
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
    // InternalDTO.g:2943:1: rule__DTOClass__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DTOClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2947:1: ( ( RULE_ID ) )
            // InternalDTO.g:2948:2: ( RULE_ID )
            {
            // InternalDTO.g:2948:2: ( RULE_ID )
            // InternalDTO.g:2949:3: RULE_ID
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
    // InternalDTO.g:2958:1: rule__DTOClass__SuperTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__DTOClass__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2962:1: ( ( ( RULE_ID ) ) )
            // InternalDTO.g:2963:2: ( ( RULE_ID ) )
            {
            // InternalDTO.g:2963:2: ( ( RULE_ID ) )
            // InternalDTO.g:2964:3: ( RULE_ID )
            {
             before(grammarAccess.getDTOClassAccess().getSuperTypeDTOClassCrossReference_2_1_0()); 
            // InternalDTO.g:2965:3: ( RULE_ID )
            // InternalDTO.g:2966:4: RULE_ID
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
    // InternalDTO.g:2977:1: rule__DTOClass__AttributesAssignment_4 : ( ruleAttribute ) ;
    public final void rule__DTOClass__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2981:1: ( ( ruleAttribute ) )
            // InternalDTO.g:2982:2: ( ruleAttribute )
            {
            // InternalDTO.g:2982:2: ( ruleAttribute )
            // InternalDTO.g:2983:3: ruleAttribute
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
    // InternalDTO.g:2992:1: rule__Enum__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Enum__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2996:1: ( ( RULE_ID ) )
            // InternalDTO.g:2997:2: ( RULE_ID )
            {
            // InternalDTO.g:2997:2: ( RULE_ID )
            // InternalDTO.g:2998:3: RULE_ID
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
    // InternalDTO.g:3007:1: rule__Enum__AttributesAssignment_3 : ( ruleAttribute ) ;
    public final void rule__Enum__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3011:1: ( ( ruleAttribute ) )
            // InternalDTO.g:3012:2: ( ruleAttribute )
            {
            // InternalDTO.g:3012:2: ( ruleAttribute )
            // InternalDTO.g:3013:3: ruleAttribute
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
    // InternalDTO.g:3022:1: rule__Enum__LiteralsAssignment_4 : ( ruleEnumLiteral ) ;
    public final void rule__Enum__LiteralsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3026:1: ( ( ruleEnumLiteral ) )
            // InternalDTO.g:3027:2: ( ruleEnumLiteral )
            {
            // InternalDTO.g:3027:2: ( ruleEnumLiteral )
            // InternalDTO.g:3028:3: ruleEnumLiteral
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
    // InternalDTO.g:3037:1: rule__EnumLiteral__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumLiteral__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3041:1: ( ( RULE_ID ) )
            // InternalDTO.g:3042:2: ( RULE_ID )
            {
            // InternalDTO.g:3042:2: ( RULE_ID )
            // InternalDTO.g:3043:3: RULE_ID
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
    // InternalDTO.g:3052:1: rule__EnumLiteral__ParamsAssignment_1_1 : ( ruleConstant ) ;
    public final void rule__EnumLiteral__ParamsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3056:1: ( ( ruleConstant ) )
            // InternalDTO.g:3057:2: ( ruleConstant )
            {
            // InternalDTO.g:3057:2: ( ruleConstant )
            // InternalDTO.g:3058:3: ruleConstant
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
    // InternalDTO.g:3067:1: rule__EnumLiteral__ParamsAssignment_1_2_1 : ( ruleConstant ) ;
    public final void rule__EnumLiteral__ParamsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3071:1: ( ( ruleConstant ) )
            // InternalDTO.g:3072:2: ( ruleConstant )
            {
            // InternalDTO.g:3072:2: ( ruleConstant )
            // InternalDTO.g:3073:3: ruleConstant
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
    // InternalDTO.g:3082:1: rule__Constant__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Constant__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3086:1: ( ( RULE_INT ) )
            // InternalDTO.g:3087:2: ( RULE_INT )
            {
            // InternalDTO.g:3087:2: ( RULE_INT )
            // InternalDTO.g:3088:3: RULE_INT
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
    // InternalDTO.g:3097:1: rule__Constant__ValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Constant__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3101:1: ( ( RULE_INT ) )
            // InternalDTO.g:3102:2: ( RULE_INT )
            {
            // InternalDTO.g:3102:2: ( RULE_INT )
            // InternalDTO.g:3103:3: RULE_INT
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
    // InternalDTO.g:3112:1: rule__Constant__ValueAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Constant__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3116:1: ( ( RULE_STRING ) )
            // InternalDTO.g:3117:2: ( RULE_STRING )
            {
            // InternalDTO.g:3117:2: ( RULE_STRING )
            // InternalDTO.g:3118:3: RULE_STRING
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
    // InternalDTO.g:3127:1: rule__Constant__ValueAssignment_3_1 : ( ( rule__Constant__ValueAlternatives_3_1_0 ) ) ;
    public final void rule__Constant__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3131:1: ( ( ( rule__Constant__ValueAlternatives_3_1_0 ) ) )
            // InternalDTO.g:3132:2: ( ( rule__Constant__ValueAlternatives_3_1_0 ) )
            {
            // InternalDTO.g:3132:2: ( ( rule__Constant__ValueAlternatives_3_1_0 ) )
            // InternalDTO.g:3133:3: ( rule__Constant__ValueAlternatives_3_1_0 )
            {
             before(grammarAccess.getConstantAccess().getValueAlternatives_3_1_0()); 
            // InternalDTO.g:3134:3: ( rule__Constant__ValueAlternatives_3_1_0 )
            // InternalDTO.g:3134:4: rule__Constant__ValueAlternatives_3_1_0
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
    // InternalDTO.g:3142:1: rule__Constant__DayAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__Constant__DayAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3146:1: ( ( RULE_INT ) )
            // InternalDTO.g:3147:2: ( RULE_INT )
            {
            // InternalDTO.g:3147:2: ( RULE_INT )
            // InternalDTO.g:3148:3: RULE_INT
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
    // InternalDTO.g:3157:1: rule__Constant__MonthAssignment_4_3 : ( RULE_INT ) ;
    public final void rule__Constant__MonthAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3161:1: ( ( RULE_INT ) )
            // InternalDTO.g:3162:2: ( RULE_INT )
            {
            // InternalDTO.g:3162:2: ( RULE_INT )
            // InternalDTO.g:3163:3: RULE_INT
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
    // InternalDTO.g:3172:1: rule__Constant__YearAssignment_4_5 : ( RULE_INT ) ;
    public final void rule__Constant__YearAssignment_4_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3176:1: ( ( RULE_INT ) )
            // InternalDTO.g:3177:2: ( RULE_INT )
            {
            // InternalDTO.g:3177:2: ( RULE_INT )
            // InternalDTO.g:3178:3: RULE_INT
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
    // InternalDTO.g:3187:1: rule__EntityOption__DeleteByFlagAssignment_0_1 : ( ( 'deleteByFlag' ) ) ;
    public final void rule__EntityOption__DeleteByFlagAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3191:1: ( ( ( 'deleteByFlag' ) ) )
            // InternalDTO.g:3192:2: ( ( 'deleteByFlag' ) )
            {
            // InternalDTO.g:3192:2: ( ( 'deleteByFlag' ) )
            // InternalDTO.g:3193:3: ( 'deleteByFlag' )
            {
             before(grammarAccess.getEntityOptionAccess().getDeleteByFlagDeleteByFlagKeyword_0_1_0()); 
            // InternalDTO.g:3194:3: ( 'deleteByFlag' )
            // InternalDTO.g:3195:4: 'deleteByFlag'
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
    // InternalDTO.g:3206:1: rule__EntityOption__InheritanceMappingAssignment_1_3 : ( ruleInheritanceMappingType ) ;
    public final void rule__EntityOption__InheritanceMappingAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3210:1: ( ( ruleInheritanceMappingType ) )
            // InternalDTO.g:3211:2: ( ruleInheritanceMappingType )
            {
            // InternalDTO.g:3211:2: ( ruleInheritanceMappingType )
            // InternalDTO.g:3212:3: ruleInheritanceMappingType
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
    // InternalDTO.g:3221:1: rule__InheritanceMappingType__TypeAssignment : ( ( rule__InheritanceMappingType__TypeAlternatives_0 ) ) ;
    public final void rule__InheritanceMappingType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3225:1: ( ( ( rule__InheritanceMappingType__TypeAlternatives_0 ) ) )
            // InternalDTO.g:3226:2: ( ( rule__InheritanceMappingType__TypeAlternatives_0 ) )
            {
            // InternalDTO.g:3226:2: ( ( rule__InheritanceMappingType__TypeAlternatives_0 ) )
            // InternalDTO.g:3227:3: ( rule__InheritanceMappingType__TypeAlternatives_0 )
            {
             before(grammarAccess.getInheritanceMappingTypeAccess().getTypeAlternatives_0()); 
            // InternalDTO.g:3228:3: ( rule__InheritanceMappingType__TypeAlternatives_0 )
            // InternalDTO.g:3228:4: rule__InheritanceMappingType__TypeAlternatives_0
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
    // InternalDTO.g:3236:1: rule__Attribute__TypeAssignment_0 : ( ruleAttributeType ) ;
    public final void rule__Attribute__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3240:1: ( ( ruleAttributeType ) )
            // InternalDTO.g:3241:2: ( ruleAttributeType )
            {
            // InternalDTO.g:3241:2: ( ruleAttributeType )
            // InternalDTO.g:3242:3: ruleAttributeType
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
    // InternalDTO.g:3251:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3255:1: ( ( RULE_ID ) )
            // InternalDTO.g:3256:2: ( RULE_ID )
            {
            // InternalDTO.g:3256:2: ( RULE_ID )
            // InternalDTO.g:3257:3: RULE_ID
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
    // InternalDTO.g:3266:1: rule__Attribute__OptionsAssignment_2_0 : ( ruleAttributeOption ) ;
    public final void rule__Attribute__OptionsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3270:1: ( ( ruleAttributeOption ) )
            // InternalDTO.g:3271:2: ( ruleAttributeOption )
            {
            // InternalDTO.g:3271:2: ( ruleAttributeOption )
            // InternalDTO.g:3272:3: ruleAttributeOption
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
    // InternalDTO.g:3281:1: rule__Attribute__OptionsAssignment_2_1_1 : ( ruleAttributeOption ) ;
    public final void rule__Attribute__OptionsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3285:1: ( ( ruleAttributeOption ) )
            // InternalDTO.g:3286:2: ( ruleAttributeOption )
            {
            // InternalDTO.g:3286:2: ( ruleAttributeOption )
            // InternalDTO.g:3287:3: ruleAttributeOption
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
    // InternalDTO.g:3296:1: rule__RefType__ReferenceAssignment : ( ( RULE_ID ) ) ;
    public final void rule__RefType__ReferenceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3300:1: ( ( ( RULE_ID ) ) )
            // InternalDTO.g:3301:2: ( ( RULE_ID ) )
            {
            // InternalDTO.g:3301:2: ( ( RULE_ID ) )
            // InternalDTO.g:3302:3: ( RULE_ID )
            {
             before(grammarAccess.getRefTypeAccess().getReferenceConceptCrossReference_0()); 
            // InternalDTO.g:3303:3: ( RULE_ID )
            // InternalDTO.g:3304:4: RULE_ID
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
    // InternalDTO.g:3315:1: rule__CollectionType__OfTypeAssignment_2 : ( ruleSingleType ) ;
    public final void rule__CollectionType__OfTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3319:1: ( ( ruleSingleType ) )
            // InternalDTO.g:3320:2: ( ruleSingleType )
            {
            // InternalDTO.g:3320:2: ( ruleSingleType )
            // InternalDTO.g:3321:3: ruleSingleType
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000007E007C40010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000007E007C00012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000003E007C00000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000007E007C00010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000200001860L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000200000000000L});
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
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000003E000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x000003E007C00010L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000100000000000L});

}
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'SINGLE_TABLE'", "'TABLE_PER_CONCRETE_CLASS'", "'TABLE_PER_CLASS'", "'one'", "'many'", "'class'", "'{'", "'}'", "'extends'", "'text'", "'email'", "'password'", "'file'", "'image'", "'enum'", "'('", "')'", "','", "'L'", "'/'", "'null'", "'inheritance'", "'='", "';'", "'string'", "'int'", "'long'", "'boolean'", "'date'", "'List'", "'<'", "'>'", "'relationshipOwner'", "'reverse_cardinality'", "'.'", "'deleteByFlag'", "'required'", "'partOf'"
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

                if ( (LA1_0==18||LA1_0==27) ) {
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


    // $ANTLR start "entryRuleBasicType"
    // InternalDTO.g:128:1: entryRuleBasicType : ruleBasicType EOF ;
    public final void entryRuleBasicType() throws RecognitionException {
        try {
            // InternalDTO.g:129:1: ( ruleBasicType EOF )
            // InternalDTO.g:130:1: ruleBasicType EOF
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
    // InternalDTO.g:137:1: ruleBasicType : ( ( rule__BasicType__Alternatives ) ) ;
    public final void ruleBasicType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:141:2: ( ( ( rule__BasicType__Alternatives ) ) )
            // InternalDTO.g:142:2: ( ( rule__BasicType__Alternatives ) )
            {
            // InternalDTO.g:142:2: ( ( rule__BasicType__Alternatives ) )
            // InternalDTO.g:143:3: ( rule__BasicType__Alternatives )
            {
             before(grammarAccess.getBasicTypeAccess().getAlternatives()); 
            // InternalDTO.g:144:3: ( rule__BasicType__Alternatives )
            // InternalDTO.g:144:4: rule__BasicType__Alternatives
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
    // InternalDTO.g:153:1: entryRuleEnum : ruleEnum EOF ;
    public final void entryRuleEnum() throws RecognitionException {
        try {
            // InternalDTO.g:154:1: ( ruleEnum EOF )
            // InternalDTO.g:155:1: ruleEnum EOF
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
    // InternalDTO.g:162:1: ruleEnum : ( ( rule__Enum__Group__0 ) ) ;
    public final void ruleEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:166:2: ( ( ( rule__Enum__Group__0 ) ) )
            // InternalDTO.g:167:2: ( ( rule__Enum__Group__0 ) )
            {
            // InternalDTO.g:167:2: ( ( rule__Enum__Group__0 ) )
            // InternalDTO.g:168:3: ( rule__Enum__Group__0 )
            {
             before(grammarAccess.getEnumAccess().getGroup()); 
            // InternalDTO.g:169:3: ( rule__Enum__Group__0 )
            // InternalDTO.g:169:4: rule__Enum__Group__0
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
    // InternalDTO.g:178:1: entryRuleEnumLiteral : ruleEnumLiteral EOF ;
    public final void entryRuleEnumLiteral() throws RecognitionException {
        try {
            // InternalDTO.g:179:1: ( ruleEnumLiteral EOF )
            // InternalDTO.g:180:1: ruleEnumLiteral EOF
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
    // InternalDTO.g:187:1: ruleEnumLiteral : ( ( rule__EnumLiteral__Group__0 ) ) ;
    public final void ruleEnumLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:191:2: ( ( ( rule__EnumLiteral__Group__0 ) ) )
            // InternalDTO.g:192:2: ( ( rule__EnumLiteral__Group__0 ) )
            {
            // InternalDTO.g:192:2: ( ( rule__EnumLiteral__Group__0 ) )
            // InternalDTO.g:193:3: ( rule__EnumLiteral__Group__0 )
            {
             before(grammarAccess.getEnumLiteralAccess().getGroup()); 
            // InternalDTO.g:194:3: ( rule__EnumLiteral__Group__0 )
            // InternalDTO.g:194:4: rule__EnumLiteral__Group__0
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
    // InternalDTO.g:203:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // InternalDTO.g:204:1: ( ruleConstant EOF )
            // InternalDTO.g:205:1: ruleConstant EOF
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
    // InternalDTO.g:212:1: ruleConstant : ( ( rule__Constant__Alternatives ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:216:2: ( ( ( rule__Constant__Alternatives ) ) )
            // InternalDTO.g:217:2: ( ( rule__Constant__Alternatives ) )
            {
            // InternalDTO.g:217:2: ( ( rule__Constant__Alternatives ) )
            // InternalDTO.g:218:3: ( rule__Constant__Alternatives )
            {
             before(grammarAccess.getConstantAccess().getAlternatives()); 
            // InternalDTO.g:219:3: ( rule__Constant__Alternatives )
            // InternalDTO.g:219:4: rule__Constant__Alternatives
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
    // InternalDTO.g:228:1: entryRuleEntityOption : ruleEntityOption EOF ;
    public final void entryRuleEntityOption() throws RecognitionException {
        try {
            // InternalDTO.g:229:1: ( ruleEntityOption EOF )
            // InternalDTO.g:230:1: ruleEntityOption EOF
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
    // InternalDTO.g:237:1: ruleEntityOption : ( ( rule__EntityOption__Alternatives ) ) ;
    public final void ruleEntityOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:241:2: ( ( ( rule__EntityOption__Alternatives ) ) )
            // InternalDTO.g:242:2: ( ( rule__EntityOption__Alternatives ) )
            {
            // InternalDTO.g:242:2: ( ( rule__EntityOption__Alternatives ) )
            // InternalDTO.g:243:3: ( rule__EntityOption__Alternatives )
            {
             before(grammarAccess.getEntityOptionAccess().getAlternatives()); 
            // InternalDTO.g:244:3: ( rule__EntityOption__Alternatives )
            // InternalDTO.g:244:4: rule__EntityOption__Alternatives
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
    // InternalDTO.g:253:1: entryRuleInheritanceMappingType : ruleInheritanceMappingType EOF ;
    public final void entryRuleInheritanceMappingType() throws RecognitionException {
        try {
            // InternalDTO.g:254:1: ( ruleInheritanceMappingType EOF )
            // InternalDTO.g:255:1: ruleInheritanceMappingType EOF
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
    // InternalDTO.g:262:1: ruleInheritanceMappingType : ( ( rule__InheritanceMappingType__TypeAssignment ) ) ;
    public final void ruleInheritanceMappingType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:266:2: ( ( ( rule__InheritanceMappingType__TypeAssignment ) ) )
            // InternalDTO.g:267:2: ( ( rule__InheritanceMappingType__TypeAssignment ) )
            {
            // InternalDTO.g:267:2: ( ( rule__InheritanceMappingType__TypeAssignment ) )
            // InternalDTO.g:268:3: ( rule__InheritanceMappingType__TypeAssignment )
            {
             before(grammarAccess.getInheritanceMappingTypeAccess().getTypeAssignment()); 
            // InternalDTO.g:269:3: ( rule__InheritanceMappingType__TypeAssignment )
            // InternalDTO.g:269:4: rule__InheritanceMappingType__TypeAssignment
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
    // InternalDTO.g:278:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalDTO.g:279:1: ( ruleAttribute EOF )
            // InternalDTO.g:280:1: ruleAttribute EOF
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
    // InternalDTO.g:287:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:291:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalDTO.g:292:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalDTO.g:292:2: ( ( rule__Attribute__Group__0 ) )
            // InternalDTO.g:293:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalDTO.g:294:3: ( rule__Attribute__Group__0 )
            // InternalDTO.g:294:4: rule__Attribute__Group__0
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
    // InternalDTO.g:303:1: entryRuleAttributeType : ruleAttributeType EOF ;
    public final void entryRuleAttributeType() throws RecognitionException {
        try {
            // InternalDTO.g:304:1: ( ruleAttributeType EOF )
            // InternalDTO.g:305:1: ruleAttributeType EOF
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
    // InternalDTO.g:312:1: ruleAttributeType : ( ( rule__AttributeType__Alternatives ) ) ;
    public final void ruleAttributeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:316:2: ( ( ( rule__AttributeType__Alternatives ) ) )
            // InternalDTO.g:317:2: ( ( rule__AttributeType__Alternatives ) )
            {
            // InternalDTO.g:317:2: ( ( rule__AttributeType__Alternatives ) )
            // InternalDTO.g:318:3: ( rule__AttributeType__Alternatives )
            {
             before(grammarAccess.getAttributeTypeAccess().getAlternatives()); 
            // InternalDTO.g:319:3: ( rule__AttributeType__Alternatives )
            // InternalDTO.g:319:4: rule__AttributeType__Alternatives
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
    // InternalDTO.g:328:1: entryRuleSingleType : ruleSingleType EOF ;
    public final void entryRuleSingleType() throws RecognitionException {
        try {
            // InternalDTO.g:329:1: ( ruleSingleType EOF )
            // InternalDTO.g:330:1: ruleSingleType EOF
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
    // InternalDTO.g:337:1: ruleSingleType : ( ( rule__SingleType__Alternatives ) ) ;
    public final void ruleSingleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:341:2: ( ( ( rule__SingleType__Alternatives ) ) )
            // InternalDTO.g:342:2: ( ( rule__SingleType__Alternatives ) )
            {
            // InternalDTO.g:342:2: ( ( rule__SingleType__Alternatives ) )
            // InternalDTO.g:343:3: ( rule__SingleType__Alternatives )
            {
             before(grammarAccess.getSingleTypeAccess().getAlternatives()); 
            // InternalDTO.g:344:3: ( rule__SingleType__Alternatives )
            // InternalDTO.g:344:4: rule__SingleType__Alternatives
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
    // InternalDTO.g:353:1: entrySuperBasicType : superBasicType EOF ;
    public final void entrySuperBasicType() throws RecognitionException {
        try {
            // InternalDTO.g:354:1: ( superBasicType EOF )
            // InternalDTO.g:355:1: superBasicType EOF
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
    // InternalDTO.g:362:1: superBasicType : ( ( superBasicType__Alternatives ) ) ;
    public final void superBasicType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:366:2: ( ( ( superBasicType__Alternatives ) ) )
            // InternalDTO.g:367:2: ( ( superBasicType__Alternatives ) )
            {
            // InternalDTO.g:367:2: ( ( superBasicType__Alternatives ) )
            // InternalDTO.g:368:3: ( superBasicType__Alternatives )
            {
             before(grammarAccess.getDomainModelBasicTypeAccess().getAlternatives()); 
            // InternalDTO.g:369:3: ( superBasicType__Alternatives )
            // InternalDTO.g:369:4: superBasicType__Alternatives
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
    // InternalDTO.g:378:1: entryRuleRefType : ruleRefType EOF ;
    public final void entryRuleRefType() throws RecognitionException {
        try {
            // InternalDTO.g:379:1: ( ruleRefType EOF )
            // InternalDTO.g:380:1: ruleRefType EOF
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
    // InternalDTO.g:387:1: ruleRefType : ( ( rule__RefType__ReferenceAssignment ) ) ;
    public final void ruleRefType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:391:2: ( ( ( rule__RefType__ReferenceAssignment ) ) )
            // InternalDTO.g:392:2: ( ( rule__RefType__ReferenceAssignment ) )
            {
            // InternalDTO.g:392:2: ( ( rule__RefType__ReferenceAssignment ) )
            // InternalDTO.g:393:3: ( rule__RefType__ReferenceAssignment )
            {
             before(grammarAccess.getRefTypeAccess().getReferenceAssignment()); 
            // InternalDTO.g:394:3: ( rule__RefType__ReferenceAssignment )
            // InternalDTO.g:394:4: rule__RefType__ReferenceAssignment
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
    // InternalDTO.g:403:1: entryRuleCollectionType : ruleCollectionType EOF ;
    public final void entryRuleCollectionType() throws RecognitionException {
        try {
            // InternalDTO.g:404:1: ( ruleCollectionType EOF )
            // InternalDTO.g:405:1: ruleCollectionType EOF
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
    // InternalDTO.g:412:1: ruleCollectionType : ( ( rule__CollectionType__Group__0 ) ) ;
    public final void ruleCollectionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:416:2: ( ( ( rule__CollectionType__Group__0 ) ) )
            // InternalDTO.g:417:2: ( ( rule__CollectionType__Group__0 ) )
            {
            // InternalDTO.g:417:2: ( ( rule__CollectionType__Group__0 ) )
            // InternalDTO.g:418:3: ( rule__CollectionType__Group__0 )
            {
             before(grammarAccess.getCollectionTypeAccess().getGroup()); 
            // InternalDTO.g:419:3: ( rule__CollectionType__Group__0 )
            // InternalDTO.g:419:4: rule__CollectionType__Group__0
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
    // InternalDTO.g:428:1: entryRuleAttributeOption : ruleAttributeOption EOF ;
    public final void entryRuleAttributeOption() throws RecognitionException {
        try {
            // InternalDTO.g:429:1: ( ruleAttributeOption EOF )
            // InternalDTO.g:430:1: ruleAttributeOption EOF
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
    // InternalDTO.g:437:1: ruleAttributeOption : ( ( rule__AttributeOption__Alternatives ) ) ;
    public final void ruleAttributeOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:441:2: ( ( ( rule__AttributeOption__Alternatives ) ) )
            // InternalDTO.g:442:2: ( ( rule__AttributeOption__Alternatives ) )
            {
            // InternalDTO.g:442:2: ( ( rule__AttributeOption__Alternatives ) )
            // InternalDTO.g:443:3: ( rule__AttributeOption__Alternatives )
            {
             before(grammarAccess.getAttributeOptionAccess().getAlternatives()); 
            // InternalDTO.g:444:3: ( rule__AttributeOption__Alternatives )
            // InternalDTO.g:444:4: rule__AttributeOption__Alternatives
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
    // InternalDTO.g:453:1: entryRuleStaticFieldSelection : ruleStaticFieldSelection EOF ;
    public final void entryRuleStaticFieldSelection() throws RecognitionException {
        try {
            // InternalDTO.g:454:1: ( ruleStaticFieldSelection EOF )
            // InternalDTO.g:455:1: ruleStaticFieldSelection EOF
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
    // InternalDTO.g:462:1: ruleStaticFieldSelection : ( ( rule__StaticFieldSelection__Group__0 ) ) ;
    public final void ruleStaticFieldSelection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:466:2: ( ( ( rule__StaticFieldSelection__Group__0 ) ) )
            // InternalDTO.g:467:2: ( ( rule__StaticFieldSelection__Group__0 ) )
            {
            // InternalDTO.g:467:2: ( ( rule__StaticFieldSelection__Group__0 ) )
            // InternalDTO.g:468:3: ( rule__StaticFieldSelection__Group__0 )
            {
             before(grammarAccess.getStaticFieldSelectionAccess().getGroup()); 
            // InternalDTO.g:469:3: ( rule__StaticFieldSelection__Group__0 )
            // InternalDTO.g:469:4: rule__StaticFieldSelection__Group__0
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
    // InternalDTO.g:478:1: ruleCardinalityType : ( ( rule__CardinalityType__Alternatives ) ) ;
    public final void ruleCardinalityType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:482:1: ( ( ( rule__CardinalityType__Alternatives ) ) )
            // InternalDTO.g:483:2: ( ( rule__CardinalityType__Alternatives ) )
            {
            // InternalDTO.g:483:2: ( ( rule__CardinalityType__Alternatives ) )
            // InternalDTO.g:484:3: ( rule__CardinalityType__Alternatives )
            {
             before(grammarAccess.getCardinalityTypeAccess().getAlternatives()); 
            // InternalDTO.g:485:3: ( rule__CardinalityType__Alternatives )
            // InternalDTO.g:485:4: rule__CardinalityType__Alternatives
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
    // InternalDTO.g:493:1: rule__Concept__Alternatives : ( ( ruleDTOClass ) | ( ruleEnum ) );
    public final void rule__Concept__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:497:1: ( ( ruleDTOClass ) | ( ruleEnum ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
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
                    // InternalDTO.g:498:2: ( ruleDTOClass )
                    {
                    // InternalDTO.g:498:2: ( ruleDTOClass )
                    // InternalDTO.g:499:3: ruleDTOClass
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
                    // InternalDTO.g:504:2: ( ruleEnum )
                    {
                    // InternalDTO.g:504:2: ( ruleEnum )
                    // InternalDTO.g:505:3: ruleEnum
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
    // InternalDTO.g:514:1: rule__BasicType__Alternatives : ( ( superBasicType ) | ( ( rule__BasicType__Group_1__0 ) ) | ( ( rule__BasicType__Group_2__0 ) ) | ( ( rule__BasicType__Group_3__0 ) ) | ( ( rule__BasicType__Group_4__0 ) ) | ( ( rule__BasicType__Group_5__0 ) ) );
    public final void rule__BasicType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:518:1: ( ( superBasicType ) | ( ( rule__BasicType__Group_1__0 ) ) | ( ( rule__BasicType__Group_2__0 ) ) | ( ( rule__BasicType__Group_3__0 ) ) | ( ( rule__BasicType__Group_4__0 ) ) | ( ( rule__BasicType__Group_5__0 ) ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
                {
                alt3=1;
                }
                break;
            case 22:
                {
                alt3=2;
                }
                break;
            case 23:
                {
                alt3=3;
                }
                break;
            case 24:
                {
                alt3=4;
                }
                break;
            case 25:
                {
                alt3=5;
                }
                break;
            case 26:
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
                    // InternalDTO.g:519:2: ( superBasicType )
                    {
                    // InternalDTO.g:519:2: ( superBasicType )
                    // InternalDTO.g:520:3: superBasicType
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
                    // InternalDTO.g:525:2: ( ( rule__BasicType__Group_1__0 ) )
                    {
                    // InternalDTO.g:525:2: ( ( rule__BasicType__Group_1__0 ) )
                    // InternalDTO.g:526:3: ( rule__BasicType__Group_1__0 )
                    {
                     before(grammarAccess.getBasicTypeAccess().getGroup_1()); 
                    // InternalDTO.g:527:3: ( rule__BasicType__Group_1__0 )
                    // InternalDTO.g:527:4: rule__BasicType__Group_1__0
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
                    // InternalDTO.g:531:2: ( ( rule__BasicType__Group_2__0 ) )
                    {
                    // InternalDTO.g:531:2: ( ( rule__BasicType__Group_2__0 ) )
                    // InternalDTO.g:532:3: ( rule__BasicType__Group_2__0 )
                    {
                     before(grammarAccess.getBasicTypeAccess().getGroup_2()); 
                    // InternalDTO.g:533:3: ( rule__BasicType__Group_2__0 )
                    // InternalDTO.g:533:4: rule__BasicType__Group_2__0
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
                    // InternalDTO.g:537:2: ( ( rule__BasicType__Group_3__0 ) )
                    {
                    // InternalDTO.g:537:2: ( ( rule__BasicType__Group_3__0 ) )
                    // InternalDTO.g:538:3: ( rule__BasicType__Group_3__0 )
                    {
                     before(grammarAccess.getBasicTypeAccess().getGroup_3()); 
                    // InternalDTO.g:539:3: ( rule__BasicType__Group_3__0 )
                    // InternalDTO.g:539:4: rule__BasicType__Group_3__0
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
                    // InternalDTO.g:543:2: ( ( rule__BasicType__Group_4__0 ) )
                    {
                    // InternalDTO.g:543:2: ( ( rule__BasicType__Group_4__0 ) )
                    // InternalDTO.g:544:3: ( rule__BasicType__Group_4__0 )
                    {
                     before(grammarAccess.getBasicTypeAccess().getGroup_4()); 
                    // InternalDTO.g:545:3: ( rule__BasicType__Group_4__0 )
                    // InternalDTO.g:545:4: rule__BasicType__Group_4__0
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
                    // InternalDTO.g:549:2: ( ( rule__BasicType__Group_5__0 ) )
                    {
                    // InternalDTO.g:549:2: ( ( rule__BasicType__Group_5__0 ) )
                    // InternalDTO.g:550:3: ( rule__BasicType__Group_5__0 )
                    {
                     before(grammarAccess.getBasicTypeAccess().getGroup_5()); 
                    // InternalDTO.g:551:3: ( rule__BasicType__Group_5__0 )
                    // InternalDTO.g:551:4: rule__BasicType__Group_5__0
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
    // InternalDTO.g:559:1: rule__Constant__Alternatives : ( ( ( rule__Constant__Group_0__0 ) ) | ( ( rule__Constant__Group_1__0 ) ) | ( ( rule__Constant__Group_2__0 ) ) | ( ( rule__Constant__Group_3__0 ) ) | ( ( rule__Constant__Group_4__0 ) ) | ( ( rule__Constant__Group_5__0 ) ) );
    public final void rule__Constant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:563:1: ( ( ( rule__Constant__Group_0__0 ) ) | ( ( rule__Constant__Group_1__0 ) ) | ( ( rule__Constant__Group_2__0 ) ) | ( ( rule__Constant__Group_3__0 ) ) | ( ( rule__Constant__Group_4__0 ) ) | ( ( rule__Constant__Group_5__0 ) ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                switch ( input.LA(2) ) {
                case EOF:
                case 29:
                case 30:
                    {
                    alt4=1;
                    }
                    break;
                case 31:
                    {
                    alt4=2;
                    }
                    break;
                case 32:
                    {
                    alt4=5;
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
            case 33:
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
                    // InternalDTO.g:564:2: ( ( rule__Constant__Group_0__0 ) )
                    {
                    // InternalDTO.g:564:2: ( ( rule__Constant__Group_0__0 ) )
                    // InternalDTO.g:565:3: ( rule__Constant__Group_0__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_0()); 
                    // InternalDTO.g:566:3: ( rule__Constant__Group_0__0 )
                    // InternalDTO.g:566:4: rule__Constant__Group_0__0
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
                    // InternalDTO.g:570:2: ( ( rule__Constant__Group_1__0 ) )
                    {
                    // InternalDTO.g:570:2: ( ( rule__Constant__Group_1__0 ) )
                    // InternalDTO.g:571:3: ( rule__Constant__Group_1__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_1()); 
                    // InternalDTO.g:572:3: ( rule__Constant__Group_1__0 )
                    // InternalDTO.g:572:4: rule__Constant__Group_1__0
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
                    // InternalDTO.g:576:2: ( ( rule__Constant__Group_2__0 ) )
                    {
                    // InternalDTO.g:576:2: ( ( rule__Constant__Group_2__0 ) )
                    // InternalDTO.g:577:3: ( rule__Constant__Group_2__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_2()); 
                    // InternalDTO.g:578:3: ( rule__Constant__Group_2__0 )
                    // InternalDTO.g:578:4: rule__Constant__Group_2__0
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
                    // InternalDTO.g:582:2: ( ( rule__Constant__Group_3__0 ) )
                    {
                    // InternalDTO.g:582:2: ( ( rule__Constant__Group_3__0 ) )
                    // InternalDTO.g:583:3: ( rule__Constant__Group_3__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_3()); 
                    // InternalDTO.g:584:3: ( rule__Constant__Group_3__0 )
                    // InternalDTO.g:584:4: rule__Constant__Group_3__0
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
                    // InternalDTO.g:588:2: ( ( rule__Constant__Group_4__0 ) )
                    {
                    // InternalDTO.g:588:2: ( ( rule__Constant__Group_4__0 ) )
                    // InternalDTO.g:589:3: ( rule__Constant__Group_4__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_4()); 
                    // InternalDTO.g:590:3: ( rule__Constant__Group_4__0 )
                    // InternalDTO.g:590:4: rule__Constant__Group_4__0
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
                    // InternalDTO.g:594:2: ( ( rule__Constant__Group_5__0 ) )
                    {
                    // InternalDTO.g:594:2: ( ( rule__Constant__Group_5__0 ) )
                    // InternalDTO.g:595:3: ( rule__Constant__Group_5__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_5()); 
                    // InternalDTO.g:596:3: ( rule__Constant__Group_5__0 )
                    // InternalDTO.g:596:4: rule__Constant__Group_5__0
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
    // InternalDTO.g:604:1: rule__Constant__ValueAlternatives_3_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Constant__ValueAlternatives_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:608:1: ( ( 'true' ) | ( 'false' ) )
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
                    // InternalDTO.g:609:2: ( 'true' )
                    {
                    // InternalDTO.g:609:2: ( 'true' )
                    // InternalDTO.g:610:3: 'true'
                    {
                     before(grammarAccess.getConstantAccess().getValueTrueKeyword_3_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getConstantAccess().getValueTrueKeyword_3_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDTO.g:615:2: ( 'false' )
                    {
                    // InternalDTO.g:615:2: ( 'false' )
                    // InternalDTO.g:616:3: 'false'
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
    // InternalDTO.g:625:1: rule__EntityOption__Alternatives : ( ( ( rule__EntityOption__Group_0__0 ) ) | ( ( rule__EntityOption__Group_1__0 ) ) );
    public final void rule__EntityOption__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:629:1: ( ( ( rule__EntityOption__Group_0__0 ) ) | ( ( rule__EntityOption__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==48) ) {
                alt6=1;
            }
            else if ( (LA6_0==34) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDTO.g:630:2: ( ( rule__EntityOption__Group_0__0 ) )
                    {
                    // InternalDTO.g:630:2: ( ( rule__EntityOption__Group_0__0 ) )
                    // InternalDTO.g:631:3: ( rule__EntityOption__Group_0__0 )
                    {
                     before(grammarAccess.getEntityOptionAccess().getGroup_0()); 
                    // InternalDTO.g:632:3: ( rule__EntityOption__Group_0__0 )
                    // InternalDTO.g:632:4: rule__EntityOption__Group_0__0
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
                    // InternalDTO.g:636:2: ( ( rule__EntityOption__Group_1__0 ) )
                    {
                    // InternalDTO.g:636:2: ( ( rule__EntityOption__Group_1__0 ) )
                    // InternalDTO.g:637:3: ( rule__EntityOption__Group_1__0 )
                    {
                     before(grammarAccess.getEntityOptionAccess().getGroup_1()); 
                    // InternalDTO.g:638:3: ( rule__EntityOption__Group_1__0 )
                    // InternalDTO.g:638:4: rule__EntityOption__Group_1__0
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
    // InternalDTO.g:646:1: rule__InheritanceMappingType__TypeAlternatives_0 : ( ( 'SINGLE_TABLE' ) | ( 'TABLE_PER_CONCRETE_CLASS' ) | ( 'TABLE_PER_CLASS' ) );
    public final void rule__InheritanceMappingType__TypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:650:1: ( ( 'SINGLE_TABLE' ) | ( 'TABLE_PER_CONCRETE_CLASS' ) | ( 'TABLE_PER_CLASS' ) )
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
                    // InternalDTO.g:651:2: ( 'SINGLE_TABLE' )
                    {
                    // InternalDTO.g:651:2: ( 'SINGLE_TABLE' )
                    // InternalDTO.g:652:3: 'SINGLE_TABLE'
                    {
                     before(grammarAccess.getInheritanceMappingTypeAccess().getTypeSINGLE_TABLEKeyword_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getInheritanceMappingTypeAccess().getTypeSINGLE_TABLEKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDTO.g:657:2: ( 'TABLE_PER_CONCRETE_CLASS' )
                    {
                    // InternalDTO.g:657:2: ( 'TABLE_PER_CONCRETE_CLASS' )
                    // InternalDTO.g:658:3: 'TABLE_PER_CONCRETE_CLASS'
                    {
                     before(grammarAccess.getInheritanceMappingTypeAccess().getTypeTABLE_PER_CONCRETE_CLASSKeyword_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getInheritanceMappingTypeAccess().getTypeTABLE_PER_CONCRETE_CLASSKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDTO.g:663:2: ( 'TABLE_PER_CLASS' )
                    {
                    // InternalDTO.g:663:2: ( 'TABLE_PER_CLASS' )
                    // InternalDTO.g:664:3: 'TABLE_PER_CLASS'
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
    // InternalDTO.g:673:1: rule__AttributeType__Alternatives : ( ( ruleSingleType ) | ( ruleCollectionType ) );
    public final void rule__AttributeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:677:1: ( ( ruleSingleType ) | ( ruleCollectionType ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID||(LA8_0>=22 && LA8_0<=26)||(LA8_0>=37 && LA8_0<=41)) ) {
                alt8=1;
            }
            else if ( (LA8_0==42) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalDTO.g:678:2: ( ruleSingleType )
                    {
                    // InternalDTO.g:678:2: ( ruleSingleType )
                    // InternalDTO.g:679:3: ruleSingleType
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
                    // InternalDTO.g:684:2: ( ruleCollectionType )
                    {
                    // InternalDTO.g:684:2: ( ruleCollectionType )
                    // InternalDTO.g:685:3: ruleCollectionType
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
    // InternalDTO.g:694:1: rule__SingleType__Alternatives : ( ( ruleBasicType ) | ( ruleRefType ) );
    public final void rule__SingleType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:698:1: ( ( ruleBasicType ) | ( ruleRefType ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=22 && LA9_0<=26)||(LA9_0>=37 && LA9_0<=41)) ) {
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
                    // InternalDTO.g:699:2: ( ruleBasicType )
                    {
                    // InternalDTO.g:699:2: ( ruleBasicType )
                    // InternalDTO.g:700:3: ruleBasicType
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
                    // InternalDTO.g:705:2: ( ruleRefType )
                    {
                    // InternalDTO.g:705:2: ( ruleRefType )
                    // InternalDTO.g:706:3: ruleRefType
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
    // InternalDTO.g:715:1: superBasicType__Alternatives : ( ( ( superBasicType__Group_0__0 ) ) | ( ( superBasicType__Group_1__0 ) ) | ( ( superBasicType__Group_2__0 ) ) | ( ( superBasicType__Group_3__0 ) ) | ( ( superBasicType__Group_4__0 ) ) );
    public final void superBasicType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:719:1: ( ( ( superBasicType__Group_0__0 ) ) | ( ( superBasicType__Group_1__0 ) ) | ( ( superBasicType__Group_2__0 ) ) | ( ( superBasicType__Group_3__0 ) ) | ( ( superBasicType__Group_4__0 ) ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt10=1;
                }
                break;
            case 38:
                {
                alt10=2;
                }
                break;
            case 39:
                {
                alt10=3;
                }
                break;
            case 40:
                {
                alt10=4;
                }
                break;
            case 41:
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
                    // InternalDTO.g:720:2: ( ( superBasicType__Group_0__0 ) )
                    {
                    // InternalDTO.g:720:2: ( ( superBasicType__Group_0__0 ) )
                    // InternalDTO.g:721:3: ( superBasicType__Group_0__0 )
                    {
                     before(grammarAccess.getDomainModelBasicTypeAccess().getGroup_0()); 
                    // InternalDTO.g:722:3: ( superBasicType__Group_0__0 )
                    // InternalDTO.g:722:4: superBasicType__Group_0__0
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
                    // InternalDTO.g:726:2: ( ( superBasicType__Group_1__0 ) )
                    {
                    // InternalDTO.g:726:2: ( ( superBasicType__Group_1__0 ) )
                    // InternalDTO.g:727:3: ( superBasicType__Group_1__0 )
                    {
                     before(grammarAccess.getDomainModelBasicTypeAccess().getGroup_1()); 
                    // InternalDTO.g:728:3: ( superBasicType__Group_1__0 )
                    // InternalDTO.g:728:4: superBasicType__Group_1__0
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
                    // InternalDTO.g:732:2: ( ( superBasicType__Group_2__0 ) )
                    {
                    // InternalDTO.g:732:2: ( ( superBasicType__Group_2__0 ) )
                    // InternalDTO.g:733:3: ( superBasicType__Group_2__0 )
                    {
                     before(grammarAccess.getDomainModelBasicTypeAccess().getGroup_2()); 
                    // InternalDTO.g:734:3: ( superBasicType__Group_2__0 )
                    // InternalDTO.g:734:4: superBasicType__Group_2__0
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
                    // InternalDTO.g:738:2: ( ( superBasicType__Group_3__0 ) )
                    {
                    // InternalDTO.g:738:2: ( ( superBasicType__Group_3__0 ) )
                    // InternalDTO.g:739:3: ( superBasicType__Group_3__0 )
                    {
                     before(grammarAccess.getDomainModelBasicTypeAccess().getGroup_3()); 
                    // InternalDTO.g:740:3: ( superBasicType__Group_3__0 )
                    // InternalDTO.g:740:4: superBasicType__Group_3__0
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
                    // InternalDTO.g:744:2: ( ( superBasicType__Group_4__0 ) )
                    {
                    // InternalDTO.g:744:2: ( ( superBasicType__Group_4__0 ) )
                    // InternalDTO.g:745:3: ( superBasicType__Group_4__0 )
                    {
                     before(grammarAccess.getDomainModelBasicTypeAccess().getGroup_4()); 
                    // InternalDTO.g:746:3: ( superBasicType__Group_4__0 )
                    // InternalDTO.g:746:4: superBasicType__Group_4__0
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
    // InternalDTO.g:754:1: rule__AttributeOption__Alternatives : ( ( ( rule__AttributeOption__Group_0__0 ) ) | ( ( rule__AttributeOption__Group_1__0 ) ) | ( ( rule__AttributeOption__Group_2__0 ) ) | ( ( rule__AttributeOption__Group_3__0 ) ) );
    public final void rule__AttributeOption__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:758:1: ( ( ( rule__AttributeOption__Group_0__0 ) ) | ( ( rule__AttributeOption__Group_1__0 ) ) | ( ( rule__AttributeOption__Group_2__0 ) ) | ( ( rule__AttributeOption__Group_3__0 ) ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt11=1;
                }
                break;
            case 50:
                {
                alt11=2;
                }
                break;
            case 45:
                {
                alt11=3;
                }
                break;
            case 46:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalDTO.g:759:2: ( ( rule__AttributeOption__Group_0__0 ) )
                    {
                    // InternalDTO.g:759:2: ( ( rule__AttributeOption__Group_0__0 ) )
                    // InternalDTO.g:760:3: ( rule__AttributeOption__Group_0__0 )
                    {
                     before(grammarAccess.getAttributeOptionAccess().getGroup_0()); 
                    // InternalDTO.g:761:3: ( rule__AttributeOption__Group_0__0 )
                    // InternalDTO.g:761:4: rule__AttributeOption__Group_0__0
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
                    // InternalDTO.g:765:2: ( ( rule__AttributeOption__Group_1__0 ) )
                    {
                    // InternalDTO.g:765:2: ( ( rule__AttributeOption__Group_1__0 ) )
                    // InternalDTO.g:766:3: ( rule__AttributeOption__Group_1__0 )
                    {
                     before(grammarAccess.getAttributeOptionAccess().getGroup_1()); 
                    // InternalDTO.g:767:3: ( rule__AttributeOption__Group_1__0 )
                    // InternalDTO.g:767:4: rule__AttributeOption__Group_1__0
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
                    // InternalDTO.g:771:2: ( ( rule__AttributeOption__Group_2__0 ) )
                    {
                    // InternalDTO.g:771:2: ( ( rule__AttributeOption__Group_2__0 ) )
                    // InternalDTO.g:772:3: ( rule__AttributeOption__Group_2__0 )
                    {
                     before(grammarAccess.getAttributeOptionAccess().getGroup_2()); 
                    // InternalDTO.g:773:3: ( rule__AttributeOption__Group_2__0 )
                    // InternalDTO.g:773:4: rule__AttributeOption__Group_2__0
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
                    // InternalDTO.g:777:2: ( ( rule__AttributeOption__Group_3__0 ) )
                    {
                    // InternalDTO.g:777:2: ( ( rule__AttributeOption__Group_3__0 ) )
                    // InternalDTO.g:778:3: ( rule__AttributeOption__Group_3__0 )
                    {
                     before(grammarAccess.getAttributeOptionAccess().getGroup_3()); 
                    // InternalDTO.g:779:3: ( rule__AttributeOption__Group_3__0 )
                    // InternalDTO.g:779:4: rule__AttributeOption__Group_3__0
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
    // InternalDTO.g:787:1: rule__CardinalityType__Alternatives : ( ( ( 'one' ) ) | ( ( 'many' ) ) );
    public final void rule__CardinalityType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:791:1: ( ( ( 'one' ) ) | ( ( 'many' ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==16) ) {
                alt12=1;
            }
            else if ( (LA12_0==17) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalDTO.g:792:2: ( ( 'one' ) )
                    {
                    // InternalDTO.g:792:2: ( ( 'one' ) )
                    // InternalDTO.g:793:3: ( 'one' )
                    {
                     before(grammarAccess.getCardinalityTypeAccess().getOneEnumLiteralDeclaration_0()); 
                    // InternalDTO.g:794:3: ( 'one' )
                    // InternalDTO.g:794:4: 'one'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getCardinalityTypeAccess().getOneEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDTO.g:798:2: ( ( 'many' ) )
                    {
                    // InternalDTO.g:798:2: ( ( 'many' ) )
                    // InternalDTO.g:799:3: ( 'many' )
                    {
                     before(grammarAccess.getCardinalityTypeAccess().getManyEnumLiteralDeclaration_1()); 
                    // InternalDTO.g:800:3: ( 'many' )
                    // InternalDTO.g:800:4: 'many'
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


    // $ANTLR start "rule__DTOClass__Group__0"
    // InternalDTO.g:808:1: rule__DTOClass__Group__0 : rule__DTOClass__Group__0__Impl rule__DTOClass__Group__1 ;
    public final void rule__DTOClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:812:1: ( rule__DTOClass__Group__0__Impl rule__DTOClass__Group__1 )
            // InternalDTO.g:813:2: rule__DTOClass__Group__0__Impl rule__DTOClass__Group__1
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
    // InternalDTO.g:820:1: rule__DTOClass__Group__0__Impl : ( 'class' ) ;
    public final void rule__DTOClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:824:1: ( ( 'class' ) )
            // InternalDTO.g:825:1: ( 'class' )
            {
            // InternalDTO.g:825:1: ( 'class' )
            // InternalDTO.g:826:2: 'class'
            {
             before(grammarAccess.getDTOClassAccess().getClassKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalDTO.g:835:1: rule__DTOClass__Group__1 : rule__DTOClass__Group__1__Impl rule__DTOClass__Group__2 ;
    public final void rule__DTOClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:839:1: ( rule__DTOClass__Group__1__Impl rule__DTOClass__Group__2 )
            // InternalDTO.g:840:2: rule__DTOClass__Group__1__Impl rule__DTOClass__Group__2
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
    // InternalDTO.g:847:1: rule__DTOClass__Group__1__Impl : ( ( rule__DTOClass__NameAssignment_1 ) ) ;
    public final void rule__DTOClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:851:1: ( ( ( rule__DTOClass__NameAssignment_1 ) ) )
            // InternalDTO.g:852:1: ( ( rule__DTOClass__NameAssignment_1 ) )
            {
            // InternalDTO.g:852:1: ( ( rule__DTOClass__NameAssignment_1 ) )
            // InternalDTO.g:853:2: ( rule__DTOClass__NameAssignment_1 )
            {
             before(grammarAccess.getDTOClassAccess().getNameAssignment_1()); 
            // InternalDTO.g:854:2: ( rule__DTOClass__NameAssignment_1 )
            // InternalDTO.g:854:3: rule__DTOClass__NameAssignment_1
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
    // InternalDTO.g:862:1: rule__DTOClass__Group__2 : rule__DTOClass__Group__2__Impl rule__DTOClass__Group__3 ;
    public final void rule__DTOClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:866:1: ( rule__DTOClass__Group__2__Impl rule__DTOClass__Group__3 )
            // InternalDTO.g:867:2: rule__DTOClass__Group__2__Impl rule__DTOClass__Group__3
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
    // InternalDTO.g:874:1: rule__DTOClass__Group__2__Impl : ( ( rule__DTOClass__Group_2__0 )? ) ;
    public final void rule__DTOClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:878:1: ( ( ( rule__DTOClass__Group_2__0 )? ) )
            // InternalDTO.g:879:1: ( ( rule__DTOClass__Group_2__0 )? )
            {
            // InternalDTO.g:879:1: ( ( rule__DTOClass__Group_2__0 )? )
            // InternalDTO.g:880:2: ( rule__DTOClass__Group_2__0 )?
            {
             before(grammarAccess.getDTOClassAccess().getGroup_2()); 
            // InternalDTO.g:881:2: ( rule__DTOClass__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDTO.g:881:3: rule__DTOClass__Group_2__0
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
    // InternalDTO.g:889:1: rule__DTOClass__Group__3 : rule__DTOClass__Group__3__Impl rule__DTOClass__Group__4 ;
    public final void rule__DTOClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:893:1: ( rule__DTOClass__Group__3__Impl rule__DTOClass__Group__4 )
            // InternalDTO.g:894:2: rule__DTOClass__Group__3__Impl rule__DTOClass__Group__4
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
    // InternalDTO.g:901:1: rule__DTOClass__Group__3__Impl : ( '{' ) ;
    public final void rule__DTOClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:905:1: ( ( '{' ) )
            // InternalDTO.g:906:1: ( '{' )
            {
            // InternalDTO.g:906:1: ( '{' )
            // InternalDTO.g:907:2: '{'
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
    // InternalDTO.g:916:1: rule__DTOClass__Group__4 : rule__DTOClass__Group__4__Impl rule__DTOClass__Group__5 ;
    public final void rule__DTOClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:920:1: ( rule__DTOClass__Group__4__Impl rule__DTOClass__Group__5 )
            // InternalDTO.g:921:2: rule__DTOClass__Group__4__Impl rule__DTOClass__Group__5
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
    // InternalDTO.g:928:1: rule__DTOClass__Group__4__Impl : ( ( rule__DTOClass__AttributesAssignment_4 )* ) ;
    public final void rule__DTOClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:932:1: ( ( ( rule__DTOClass__AttributesAssignment_4 )* ) )
            // InternalDTO.g:933:1: ( ( rule__DTOClass__AttributesAssignment_4 )* )
            {
            // InternalDTO.g:933:1: ( ( rule__DTOClass__AttributesAssignment_4 )* )
            // InternalDTO.g:934:2: ( rule__DTOClass__AttributesAssignment_4 )*
            {
             before(grammarAccess.getDTOClassAccess().getAttributesAssignment_4()); 
            // InternalDTO.g:935:2: ( rule__DTOClass__AttributesAssignment_4 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||(LA14_0>=22 && LA14_0<=26)||(LA14_0>=37 && LA14_0<=42)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDTO.g:935:3: rule__DTOClass__AttributesAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__DTOClass__AttributesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalDTO.g:943:1: rule__DTOClass__Group__5 : rule__DTOClass__Group__5__Impl ;
    public final void rule__DTOClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:947:1: ( rule__DTOClass__Group__5__Impl )
            // InternalDTO.g:948:2: rule__DTOClass__Group__5__Impl
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
    // InternalDTO.g:954:1: rule__DTOClass__Group__5__Impl : ( '}' ) ;
    public final void rule__DTOClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:958:1: ( ( '}' ) )
            // InternalDTO.g:959:1: ( '}' )
            {
            // InternalDTO.g:959:1: ( '}' )
            // InternalDTO.g:960:2: '}'
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
    // InternalDTO.g:970:1: rule__DTOClass__Group_2__0 : rule__DTOClass__Group_2__0__Impl rule__DTOClass__Group_2__1 ;
    public final void rule__DTOClass__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:974:1: ( rule__DTOClass__Group_2__0__Impl rule__DTOClass__Group_2__1 )
            // InternalDTO.g:975:2: rule__DTOClass__Group_2__0__Impl rule__DTOClass__Group_2__1
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
    // InternalDTO.g:982:1: rule__DTOClass__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__DTOClass__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:986:1: ( ( 'extends' ) )
            // InternalDTO.g:987:1: ( 'extends' )
            {
            // InternalDTO.g:987:1: ( 'extends' )
            // InternalDTO.g:988:2: 'extends'
            {
             before(grammarAccess.getDTOClassAccess().getExtendsKeyword_2_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalDTO.g:997:1: rule__DTOClass__Group_2__1 : rule__DTOClass__Group_2__1__Impl ;
    public final void rule__DTOClass__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1001:1: ( rule__DTOClass__Group_2__1__Impl )
            // InternalDTO.g:1002:2: rule__DTOClass__Group_2__1__Impl
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
    // InternalDTO.g:1008:1: rule__DTOClass__Group_2__1__Impl : ( ( rule__DTOClass__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__DTOClass__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1012:1: ( ( ( rule__DTOClass__SuperTypeAssignment_2_1 ) ) )
            // InternalDTO.g:1013:1: ( ( rule__DTOClass__SuperTypeAssignment_2_1 ) )
            {
            // InternalDTO.g:1013:1: ( ( rule__DTOClass__SuperTypeAssignment_2_1 ) )
            // InternalDTO.g:1014:2: ( rule__DTOClass__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getDTOClassAccess().getSuperTypeAssignment_2_1()); 
            // InternalDTO.g:1015:2: ( rule__DTOClass__SuperTypeAssignment_2_1 )
            // InternalDTO.g:1015:3: rule__DTOClass__SuperTypeAssignment_2_1
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
    // InternalDTO.g:1024:1: rule__BasicType__Group_1__0 : rule__BasicType__Group_1__0__Impl rule__BasicType__Group_1__1 ;
    public final void rule__BasicType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1028:1: ( rule__BasicType__Group_1__0__Impl rule__BasicType__Group_1__1 )
            // InternalDTO.g:1029:2: rule__BasicType__Group_1__0__Impl rule__BasicType__Group_1__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalDTO.g:1036:1: rule__BasicType__Group_1__0__Impl : ( () ) ;
    public final void rule__BasicType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1040:1: ( ( () ) )
            // InternalDTO.g:1041:1: ( () )
            {
            // InternalDTO.g:1041:1: ( () )
            // InternalDTO.g:1042:2: ()
            {
             before(grammarAccess.getBasicTypeAccess().getTextTypeAction_1_0()); 
            // InternalDTO.g:1043:2: ()
            // InternalDTO.g:1043:3: 
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
    // InternalDTO.g:1051:1: rule__BasicType__Group_1__1 : rule__BasicType__Group_1__1__Impl ;
    public final void rule__BasicType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1055:1: ( rule__BasicType__Group_1__1__Impl )
            // InternalDTO.g:1056:2: rule__BasicType__Group_1__1__Impl
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
    // InternalDTO.g:1062:1: rule__BasicType__Group_1__1__Impl : ( 'text' ) ;
    public final void rule__BasicType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1066:1: ( ( 'text' ) )
            // InternalDTO.g:1067:1: ( 'text' )
            {
            // InternalDTO.g:1067:1: ( 'text' )
            // InternalDTO.g:1068:2: 'text'
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
    // InternalDTO.g:1078:1: rule__BasicType__Group_2__0 : rule__BasicType__Group_2__0__Impl rule__BasicType__Group_2__1 ;
    public final void rule__BasicType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1082:1: ( rule__BasicType__Group_2__0__Impl rule__BasicType__Group_2__1 )
            // InternalDTO.g:1083:2: rule__BasicType__Group_2__0__Impl rule__BasicType__Group_2__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalDTO.g:1090:1: rule__BasicType__Group_2__0__Impl : ( () ) ;
    public final void rule__BasicType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1094:1: ( ( () ) )
            // InternalDTO.g:1095:1: ( () )
            {
            // InternalDTO.g:1095:1: ( () )
            // InternalDTO.g:1096:2: ()
            {
             before(grammarAccess.getBasicTypeAccess().getEmailTypeAction_2_0()); 
            // InternalDTO.g:1097:2: ()
            // InternalDTO.g:1097:3: 
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
    // InternalDTO.g:1105:1: rule__BasicType__Group_2__1 : rule__BasicType__Group_2__1__Impl ;
    public final void rule__BasicType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1109:1: ( rule__BasicType__Group_2__1__Impl )
            // InternalDTO.g:1110:2: rule__BasicType__Group_2__1__Impl
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
    // InternalDTO.g:1116:1: rule__BasicType__Group_2__1__Impl : ( 'email' ) ;
    public final void rule__BasicType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1120:1: ( ( 'email' ) )
            // InternalDTO.g:1121:1: ( 'email' )
            {
            // InternalDTO.g:1121:1: ( 'email' )
            // InternalDTO.g:1122:2: 'email'
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
    // InternalDTO.g:1132:1: rule__BasicType__Group_3__0 : rule__BasicType__Group_3__0__Impl rule__BasicType__Group_3__1 ;
    public final void rule__BasicType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1136:1: ( rule__BasicType__Group_3__0__Impl rule__BasicType__Group_3__1 )
            // InternalDTO.g:1137:2: rule__BasicType__Group_3__0__Impl rule__BasicType__Group_3__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalDTO.g:1144:1: rule__BasicType__Group_3__0__Impl : ( () ) ;
    public final void rule__BasicType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1148:1: ( ( () ) )
            // InternalDTO.g:1149:1: ( () )
            {
            // InternalDTO.g:1149:1: ( () )
            // InternalDTO.g:1150:2: ()
            {
             before(grammarAccess.getBasicTypeAccess().getPasswordTypeAction_3_0()); 
            // InternalDTO.g:1151:2: ()
            // InternalDTO.g:1151:3: 
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
    // InternalDTO.g:1159:1: rule__BasicType__Group_3__1 : rule__BasicType__Group_3__1__Impl ;
    public final void rule__BasicType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1163:1: ( rule__BasicType__Group_3__1__Impl )
            // InternalDTO.g:1164:2: rule__BasicType__Group_3__1__Impl
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
    // InternalDTO.g:1170:1: rule__BasicType__Group_3__1__Impl : ( 'password' ) ;
    public final void rule__BasicType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1174:1: ( ( 'password' ) )
            // InternalDTO.g:1175:1: ( 'password' )
            {
            // InternalDTO.g:1175:1: ( 'password' )
            // InternalDTO.g:1176:2: 'password'
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
    // InternalDTO.g:1186:1: rule__BasicType__Group_4__0 : rule__BasicType__Group_4__0__Impl rule__BasicType__Group_4__1 ;
    public final void rule__BasicType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1190:1: ( rule__BasicType__Group_4__0__Impl rule__BasicType__Group_4__1 )
            // InternalDTO.g:1191:2: rule__BasicType__Group_4__0__Impl rule__BasicType__Group_4__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalDTO.g:1198:1: rule__BasicType__Group_4__0__Impl : ( () ) ;
    public final void rule__BasicType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1202:1: ( ( () ) )
            // InternalDTO.g:1203:1: ( () )
            {
            // InternalDTO.g:1203:1: ( () )
            // InternalDTO.g:1204:2: ()
            {
             before(grammarAccess.getBasicTypeAccess().getFileTypeAction_4_0()); 
            // InternalDTO.g:1205:2: ()
            // InternalDTO.g:1205:3: 
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
    // InternalDTO.g:1213:1: rule__BasicType__Group_4__1 : rule__BasicType__Group_4__1__Impl ;
    public final void rule__BasicType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1217:1: ( rule__BasicType__Group_4__1__Impl )
            // InternalDTO.g:1218:2: rule__BasicType__Group_4__1__Impl
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
    // InternalDTO.g:1224:1: rule__BasicType__Group_4__1__Impl : ( 'file' ) ;
    public final void rule__BasicType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1228:1: ( ( 'file' ) )
            // InternalDTO.g:1229:1: ( 'file' )
            {
            // InternalDTO.g:1229:1: ( 'file' )
            // InternalDTO.g:1230:2: 'file'
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
    // InternalDTO.g:1240:1: rule__BasicType__Group_5__0 : rule__BasicType__Group_5__0__Impl rule__BasicType__Group_5__1 ;
    public final void rule__BasicType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1244:1: ( rule__BasicType__Group_5__0__Impl rule__BasicType__Group_5__1 )
            // InternalDTO.g:1245:2: rule__BasicType__Group_5__0__Impl rule__BasicType__Group_5__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalDTO.g:1252:1: rule__BasicType__Group_5__0__Impl : ( () ) ;
    public final void rule__BasicType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1256:1: ( ( () ) )
            // InternalDTO.g:1257:1: ( () )
            {
            // InternalDTO.g:1257:1: ( () )
            // InternalDTO.g:1258:2: ()
            {
             before(grammarAccess.getBasicTypeAccess().getImageTypeAction_5_0()); 
            // InternalDTO.g:1259:2: ()
            // InternalDTO.g:1259:3: 
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
    // InternalDTO.g:1267:1: rule__BasicType__Group_5__1 : rule__BasicType__Group_5__1__Impl ;
    public final void rule__BasicType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1271:1: ( rule__BasicType__Group_5__1__Impl )
            // InternalDTO.g:1272:2: rule__BasicType__Group_5__1__Impl
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
    // InternalDTO.g:1278:1: rule__BasicType__Group_5__1__Impl : ( 'image' ) ;
    public final void rule__BasicType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1282:1: ( ( 'image' ) )
            // InternalDTO.g:1283:1: ( 'image' )
            {
            // InternalDTO.g:1283:1: ( 'image' )
            // InternalDTO.g:1284:2: 'image'
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
    // InternalDTO.g:1294:1: rule__Enum__Group__0 : rule__Enum__Group__0__Impl rule__Enum__Group__1 ;
    public final void rule__Enum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1298:1: ( rule__Enum__Group__0__Impl rule__Enum__Group__1 )
            // InternalDTO.g:1299:2: rule__Enum__Group__0__Impl rule__Enum__Group__1
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
    // InternalDTO.g:1306:1: rule__Enum__Group__0__Impl : ( 'enum' ) ;
    public final void rule__Enum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1310:1: ( ( 'enum' ) )
            // InternalDTO.g:1311:1: ( 'enum' )
            {
            // InternalDTO.g:1311:1: ( 'enum' )
            // InternalDTO.g:1312:2: 'enum'
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
    // InternalDTO.g:1321:1: rule__Enum__Group__1 : rule__Enum__Group__1__Impl rule__Enum__Group__2 ;
    public final void rule__Enum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1325:1: ( rule__Enum__Group__1__Impl rule__Enum__Group__2 )
            // InternalDTO.g:1326:2: rule__Enum__Group__1__Impl rule__Enum__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalDTO.g:1333:1: rule__Enum__Group__1__Impl : ( ( rule__Enum__NameAssignment_1 ) ) ;
    public final void rule__Enum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1337:1: ( ( ( rule__Enum__NameAssignment_1 ) ) )
            // InternalDTO.g:1338:1: ( ( rule__Enum__NameAssignment_1 ) )
            {
            // InternalDTO.g:1338:1: ( ( rule__Enum__NameAssignment_1 ) )
            // InternalDTO.g:1339:2: ( rule__Enum__NameAssignment_1 )
            {
             before(grammarAccess.getEnumAccess().getNameAssignment_1()); 
            // InternalDTO.g:1340:2: ( rule__Enum__NameAssignment_1 )
            // InternalDTO.g:1340:3: rule__Enum__NameAssignment_1
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
    // InternalDTO.g:1348:1: rule__Enum__Group__2 : rule__Enum__Group__2__Impl rule__Enum__Group__3 ;
    public final void rule__Enum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1352:1: ( rule__Enum__Group__2__Impl rule__Enum__Group__3 )
            // InternalDTO.g:1353:2: rule__Enum__Group__2__Impl rule__Enum__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalDTO.g:1360:1: rule__Enum__Group__2__Impl : ( '{' ) ;
    public final void rule__Enum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1364:1: ( ( '{' ) )
            // InternalDTO.g:1365:1: ( '{' )
            {
            // InternalDTO.g:1365:1: ( '{' )
            // InternalDTO.g:1366:2: '{'
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
    // InternalDTO.g:1375:1: rule__Enum__Group__3 : rule__Enum__Group__3__Impl rule__Enum__Group__4 ;
    public final void rule__Enum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1379:1: ( rule__Enum__Group__3__Impl rule__Enum__Group__4 )
            // InternalDTO.g:1380:2: rule__Enum__Group__3__Impl rule__Enum__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalDTO.g:1387:1: rule__Enum__Group__3__Impl : ( ( rule__Enum__AttributesAssignment_3 )* ) ;
    public final void rule__Enum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1391:1: ( ( ( rule__Enum__AttributesAssignment_3 )* ) )
            // InternalDTO.g:1392:1: ( ( rule__Enum__AttributesAssignment_3 )* )
            {
            // InternalDTO.g:1392:1: ( ( rule__Enum__AttributesAssignment_3 )* )
            // InternalDTO.g:1393:2: ( rule__Enum__AttributesAssignment_3 )*
            {
             before(grammarAccess.getEnumAccess().getAttributesAssignment_3()); 
            // InternalDTO.g:1394:2: ( rule__Enum__AttributesAssignment_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1==RULE_ID) ) {
                        int LA15_3 = input.LA(3);

                        if ( (LA15_3==36||(LA15_3>=45 && LA15_3<=46)||(LA15_3>=49 && LA15_3<=50)) ) {
                            alt15=1;
                        }


                    }


                }
                else if ( ((LA15_0>=22 && LA15_0<=26)||(LA15_0>=37 && LA15_0<=42)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDTO.g:1394:3: rule__Enum__AttributesAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Enum__AttributesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalDTO.g:1402:1: rule__Enum__Group__4 : rule__Enum__Group__4__Impl rule__Enum__Group__5 ;
    public final void rule__Enum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1406:1: ( rule__Enum__Group__4__Impl rule__Enum__Group__5 )
            // InternalDTO.g:1407:2: rule__Enum__Group__4__Impl rule__Enum__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalDTO.g:1414:1: rule__Enum__Group__4__Impl : ( ( ( rule__Enum__LiteralsAssignment_4 ) ) ( ( rule__Enum__LiteralsAssignment_4 )* ) ) ;
    public final void rule__Enum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1418:1: ( ( ( ( rule__Enum__LiteralsAssignment_4 ) ) ( ( rule__Enum__LiteralsAssignment_4 )* ) ) )
            // InternalDTO.g:1419:1: ( ( ( rule__Enum__LiteralsAssignment_4 ) ) ( ( rule__Enum__LiteralsAssignment_4 )* ) )
            {
            // InternalDTO.g:1419:1: ( ( ( rule__Enum__LiteralsAssignment_4 ) ) ( ( rule__Enum__LiteralsAssignment_4 )* ) )
            // InternalDTO.g:1420:2: ( ( rule__Enum__LiteralsAssignment_4 ) ) ( ( rule__Enum__LiteralsAssignment_4 )* )
            {
            // InternalDTO.g:1420:2: ( ( rule__Enum__LiteralsAssignment_4 ) )
            // InternalDTO.g:1421:3: ( rule__Enum__LiteralsAssignment_4 )
            {
             before(grammarAccess.getEnumAccess().getLiteralsAssignment_4()); 
            // InternalDTO.g:1422:3: ( rule__Enum__LiteralsAssignment_4 )
            // InternalDTO.g:1422:4: rule__Enum__LiteralsAssignment_4
            {
            pushFollow(FOLLOW_7);
            rule__Enum__LiteralsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getLiteralsAssignment_4()); 

            }

            // InternalDTO.g:1425:2: ( ( rule__Enum__LiteralsAssignment_4 )* )
            // InternalDTO.g:1426:3: ( rule__Enum__LiteralsAssignment_4 )*
            {
             before(grammarAccess.getEnumAccess().getLiteralsAssignment_4()); 
            // InternalDTO.g:1427:3: ( rule__Enum__LiteralsAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDTO.g:1427:4: rule__Enum__LiteralsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Enum__LiteralsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalDTO.g:1436:1: rule__Enum__Group__5 : rule__Enum__Group__5__Impl ;
    public final void rule__Enum__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1440:1: ( rule__Enum__Group__5__Impl )
            // InternalDTO.g:1441:2: rule__Enum__Group__5__Impl
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
    // InternalDTO.g:1447:1: rule__Enum__Group__5__Impl : ( '}' ) ;
    public final void rule__Enum__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1451:1: ( ( '}' ) )
            // InternalDTO.g:1452:1: ( '}' )
            {
            // InternalDTO.g:1452:1: ( '}' )
            // InternalDTO.g:1453:2: '}'
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
    // InternalDTO.g:1463:1: rule__EnumLiteral__Group__0 : rule__EnumLiteral__Group__0__Impl rule__EnumLiteral__Group__1 ;
    public final void rule__EnumLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1467:1: ( rule__EnumLiteral__Group__0__Impl rule__EnumLiteral__Group__1 )
            // InternalDTO.g:1468:2: rule__EnumLiteral__Group__0__Impl rule__EnumLiteral__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalDTO.g:1475:1: rule__EnumLiteral__Group__0__Impl : ( ( rule__EnumLiteral__NameAssignment_0 ) ) ;
    public final void rule__EnumLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1479:1: ( ( ( rule__EnumLiteral__NameAssignment_0 ) ) )
            // InternalDTO.g:1480:1: ( ( rule__EnumLiteral__NameAssignment_0 ) )
            {
            // InternalDTO.g:1480:1: ( ( rule__EnumLiteral__NameAssignment_0 ) )
            // InternalDTO.g:1481:2: ( rule__EnumLiteral__NameAssignment_0 )
            {
             before(grammarAccess.getEnumLiteralAccess().getNameAssignment_0()); 
            // InternalDTO.g:1482:2: ( rule__EnumLiteral__NameAssignment_0 )
            // InternalDTO.g:1482:3: rule__EnumLiteral__NameAssignment_0
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
    // InternalDTO.g:1490:1: rule__EnumLiteral__Group__1 : rule__EnumLiteral__Group__1__Impl ;
    public final void rule__EnumLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1494:1: ( rule__EnumLiteral__Group__1__Impl )
            // InternalDTO.g:1495:2: rule__EnumLiteral__Group__1__Impl
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
    // InternalDTO.g:1501:1: rule__EnumLiteral__Group__1__Impl : ( ( rule__EnumLiteral__Group_1__0 )? ) ;
    public final void rule__EnumLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1505:1: ( ( ( rule__EnumLiteral__Group_1__0 )? ) )
            // InternalDTO.g:1506:1: ( ( rule__EnumLiteral__Group_1__0 )? )
            {
            // InternalDTO.g:1506:1: ( ( rule__EnumLiteral__Group_1__0 )? )
            // InternalDTO.g:1507:2: ( rule__EnumLiteral__Group_1__0 )?
            {
             before(grammarAccess.getEnumLiteralAccess().getGroup_1()); 
            // InternalDTO.g:1508:2: ( rule__EnumLiteral__Group_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDTO.g:1508:3: rule__EnumLiteral__Group_1__0
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
    // InternalDTO.g:1517:1: rule__EnumLiteral__Group_1__0 : rule__EnumLiteral__Group_1__0__Impl rule__EnumLiteral__Group_1__1 ;
    public final void rule__EnumLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1521:1: ( rule__EnumLiteral__Group_1__0__Impl rule__EnumLiteral__Group_1__1 )
            // InternalDTO.g:1522:2: rule__EnumLiteral__Group_1__0__Impl rule__EnumLiteral__Group_1__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalDTO.g:1529:1: rule__EnumLiteral__Group_1__0__Impl : ( '(' ) ;
    public final void rule__EnumLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1533:1: ( ( '(' ) )
            // InternalDTO.g:1534:1: ( '(' )
            {
            // InternalDTO.g:1534:1: ( '(' )
            // InternalDTO.g:1535:2: '('
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
    // InternalDTO.g:1544:1: rule__EnumLiteral__Group_1__1 : rule__EnumLiteral__Group_1__1__Impl rule__EnumLiteral__Group_1__2 ;
    public final void rule__EnumLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1548:1: ( rule__EnumLiteral__Group_1__1__Impl rule__EnumLiteral__Group_1__2 )
            // InternalDTO.g:1549:2: rule__EnumLiteral__Group_1__1__Impl rule__EnumLiteral__Group_1__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalDTO.g:1556:1: rule__EnumLiteral__Group_1__1__Impl : ( ( rule__EnumLiteral__ParamsAssignment_1_1 ) ) ;
    public final void rule__EnumLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1560:1: ( ( ( rule__EnumLiteral__ParamsAssignment_1_1 ) ) )
            // InternalDTO.g:1561:1: ( ( rule__EnumLiteral__ParamsAssignment_1_1 ) )
            {
            // InternalDTO.g:1561:1: ( ( rule__EnumLiteral__ParamsAssignment_1_1 ) )
            // InternalDTO.g:1562:2: ( rule__EnumLiteral__ParamsAssignment_1_1 )
            {
             before(grammarAccess.getEnumLiteralAccess().getParamsAssignment_1_1()); 
            // InternalDTO.g:1563:2: ( rule__EnumLiteral__ParamsAssignment_1_1 )
            // InternalDTO.g:1563:3: rule__EnumLiteral__ParamsAssignment_1_1
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
    // InternalDTO.g:1571:1: rule__EnumLiteral__Group_1__2 : rule__EnumLiteral__Group_1__2__Impl rule__EnumLiteral__Group_1__3 ;
    public final void rule__EnumLiteral__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1575:1: ( rule__EnumLiteral__Group_1__2__Impl rule__EnumLiteral__Group_1__3 )
            // InternalDTO.g:1576:2: rule__EnumLiteral__Group_1__2__Impl rule__EnumLiteral__Group_1__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalDTO.g:1583:1: rule__EnumLiteral__Group_1__2__Impl : ( ( rule__EnumLiteral__Group_1_2__0 )* ) ;
    public final void rule__EnumLiteral__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1587:1: ( ( ( rule__EnumLiteral__Group_1_2__0 )* ) )
            // InternalDTO.g:1588:1: ( ( rule__EnumLiteral__Group_1_2__0 )* )
            {
            // InternalDTO.g:1588:1: ( ( rule__EnumLiteral__Group_1_2__0 )* )
            // InternalDTO.g:1589:2: ( rule__EnumLiteral__Group_1_2__0 )*
            {
             before(grammarAccess.getEnumLiteralAccess().getGroup_1_2()); 
            // InternalDTO.g:1590:2: ( rule__EnumLiteral__Group_1_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==30) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDTO.g:1590:3: rule__EnumLiteral__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__EnumLiteral__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalDTO.g:1598:1: rule__EnumLiteral__Group_1__3 : rule__EnumLiteral__Group_1__3__Impl ;
    public final void rule__EnumLiteral__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1602:1: ( rule__EnumLiteral__Group_1__3__Impl )
            // InternalDTO.g:1603:2: rule__EnumLiteral__Group_1__3__Impl
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
    // InternalDTO.g:1609:1: rule__EnumLiteral__Group_1__3__Impl : ( ')' ) ;
    public final void rule__EnumLiteral__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1613:1: ( ( ')' ) )
            // InternalDTO.g:1614:1: ( ')' )
            {
            // InternalDTO.g:1614:1: ( ')' )
            // InternalDTO.g:1615:2: ')'
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
    // InternalDTO.g:1625:1: rule__EnumLiteral__Group_1_2__0 : rule__EnumLiteral__Group_1_2__0__Impl rule__EnumLiteral__Group_1_2__1 ;
    public final void rule__EnumLiteral__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1629:1: ( rule__EnumLiteral__Group_1_2__0__Impl rule__EnumLiteral__Group_1_2__1 )
            // InternalDTO.g:1630:2: rule__EnumLiteral__Group_1_2__0__Impl rule__EnumLiteral__Group_1_2__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalDTO.g:1637:1: rule__EnumLiteral__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__EnumLiteral__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1641:1: ( ( ',' ) )
            // InternalDTO.g:1642:1: ( ',' )
            {
            // InternalDTO.g:1642:1: ( ',' )
            // InternalDTO.g:1643:2: ','
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
    // InternalDTO.g:1652:1: rule__EnumLiteral__Group_1_2__1 : rule__EnumLiteral__Group_1_2__1__Impl ;
    public final void rule__EnumLiteral__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1656:1: ( rule__EnumLiteral__Group_1_2__1__Impl )
            // InternalDTO.g:1657:2: rule__EnumLiteral__Group_1_2__1__Impl
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
    // InternalDTO.g:1663:1: rule__EnumLiteral__Group_1_2__1__Impl : ( ( rule__EnumLiteral__ParamsAssignment_1_2_1 ) ) ;
    public final void rule__EnumLiteral__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1667:1: ( ( ( rule__EnumLiteral__ParamsAssignment_1_2_1 ) ) )
            // InternalDTO.g:1668:1: ( ( rule__EnumLiteral__ParamsAssignment_1_2_1 ) )
            {
            // InternalDTO.g:1668:1: ( ( rule__EnumLiteral__ParamsAssignment_1_2_1 ) )
            // InternalDTO.g:1669:2: ( rule__EnumLiteral__ParamsAssignment_1_2_1 )
            {
             before(grammarAccess.getEnumLiteralAccess().getParamsAssignment_1_2_1()); 
            // InternalDTO.g:1670:2: ( rule__EnumLiteral__ParamsAssignment_1_2_1 )
            // InternalDTO.g:1670:3: rule__EnumLiteral__ParamsAssignment_1_2_1
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
    // InternalDTO.g:1679:1: rule__Constant__Group_0__0 : rule__Constant__Group_0__0__Impl rule__Constant__Group_0__1 ;
    public final void rule__Constant__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1683:1: ( rule__Constant__Group_0__0__Impl rule__Constant__Group_0__1 )
            // InternalDTO.g:1684:2: rule__Constant__Group_0__0__Impl rule__Constant__Group_0__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalDTO.g:1691:1: rule__Constant__Group_0__0__Impl : ( () ) ;
    public final void rule__Constant__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1695:1: ( ( () ) )
            // InternalDTO.g:1696:1: ( () )
            {
            // InternalDTO.g:1696:1: ( () )
            // InternalDTO.g:1697:2: ()
            {
             before(grammarAccess.getConstantAccess().getIntConstantAction_0_0()); 
            // InternalDTO.g:1698:2: ()
            // InternalDTO.g:1698:3: 
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
    // InternalDTO.g:1706:1: rule__Constant__Group_0__1 : rule__Constant__Group_0__1__Impl ;
    public final void rule__Constant__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1710:1: ( rule__Constant__Group_0__1__Impl )
            // InternalDTO.g:1711:2: rule__Constant__Group_0__1__Impl
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
    // InternalDTO.g:1717:1: rule__Constant__Group_0__1__Impl : ( ( rule__Constant__ValueAssignment_0_1 ) ) ;
    public final void rule__Constant__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1721:1: ( ( ( rule__Constant__ValueAssignment_0_1 ) ) )
            // InternalDTO.g:1722:1: ( ( rule__Constant__ValueAssignment_0_1 ) )
            {
            // InternalDTO.g:1722:1: ( ( rule__Constant__ValueAssignment_0_1 ) )
            // InternalDTO.g:1723:2: ( rule__Constant__ValueAssignment_0_1 )
            {
             before(grammarAccess.getConstantAccess().getValueAssignment_0_1()); 
            // InternalDTO.g:1724:2: ( rule__Constant__ValueAssignment_0_1 )
            // InternalDTO.g:1724:3: rule__Constant__ValueAssignment_0_1
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
    // InternalDTO.g:1733:1: rule__Constant__Group_1__0 : rule__Constant__Group_1__0__Impl rule__Constant__Group_1__1 ;
    public final void rule__Constant__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1737:1: ( rule__Constant__Group_1__0__Impl rule__Constant__Group_1__1 )
            // InternalDTO.g:1738:2: rule__Constant__Group_1__0__Impl rule__Constant__Group_1__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalDTO.g:1745:1: rule__Constant__Group_1__0__Impl : ( () ) ;
    public final void rule__Constant__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1749:1: ( ( () ) )
            // InternalDTO.g:1750:1: ( () )
            {
            // InternalDTO.g:1750:1: ( () )
            // InternalDTO.g:1751:2: ()
            {
             before(grammarAccess.getConstantAccess().getLongConstantAction_1_0()); 
            // InternalDTO.g:1752:2: ()
            // InternalDTO.g:1752:3: 
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
    // InternalDTO.g:1760:1: rule__Constant__Group_1__1 : rule__Constant__Group_1__1__Impl rule__Constant__Group_1__2 ;
    public final void rule__Constant__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1764:1: ( rule__Constant__Group_1__1__Impl rule__Constant__Group_1__2 )
            // InternalDTO.g:1765:2: rule__Constant__Group_1__1__Impl rule__Constant__Group_1__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalDTO.g:1772:1: rule__Constant__Group_1__1__Impl : ( ( rule__Constant__ValueAssignment_1_1 ) ) ;
    public final void rule__Constant__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1776:1: ( ( ( rule__Constant__ValueAssignment_1_1 ) ) )
            // InternalDTO.g:1777:1: ( ( rule__Constant__ValueAssignment_1_1 ) )
            {
            // InternalDTO.g:1777:1: ( ( rule__Constant__ValueAssignment_1_1 ) )
            // InternalDTO.g:1778:2: ( rule__Constant__ValueAssignment_1_1 )
            {
             before(grammarAccess.getConstantAccess().getValueAssignment_1_1()); 
            // InternalDTO.g:1779:2: ( rule__Constant__ValueAssignment_1_1 )
            // InternalDTO.g:1779:3: rule__Constant__ValueAssignment_1_1
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
    // InternalDTO.g:1787:1: rule__Constant__Group_1__2 : rule__Constant__Group_1__2__Impl ;
    public final void rule__Constant__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1791:1: ( rule__Constant__Group_1__2__Impl )
            // InternalDTO.g:1792:2: rule__Constant__Group_1__2__Impl
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
    // InternalDTO.g:1798:1: rule__Constant__Group_1__2__Impl : ( 'L' ) ;
    public final void rule__Constant__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1802:1: ( ( 'L' ) )
            // InternalDTO.g:1803:1: ( 'L' )
            {
            // InternalDTO.g:1803:1: ( 'L' )
            // InternalDTO.g:1804:2: 'L'
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
    // InternalDTO.g:1814:1: rule__Constant__Group_2__0 : rule__Constant__Group_2__0__Impl rule__Constant__Group_2__1 ;
    public final void rule__Constant__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1818:1: ( rule__Constant__Group_2__0__Impl rule__Constant__Group_2__1 )
            // InternalDTO.g:1819:2: rule__Constant__Group_2__0__Impl rule__Constant__Group_2__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalDTO.g:1826:1: rule__Constant__Group_2__0__Impl : ( () ) ;
    public final void rule__Constant__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1830:1: ( ( () ) )
            // InternalDTO.g:1831:1: ( () )
            {
            // InternalDTO.g:1831:1: ( () )
            // InternalDTO.g:1832:2: ()
            {
             before(grammarAccess.getConstantAccess().getStringConstantAction_2_0()); 
            // InternalDTO.g:1833:2: ()
            // InternalDTO.g:1833:3: 
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
    // InternalDTO.g:1841:1: rule__Constant__Group_2__1 : rule__Constant__Group_2__1__Impl ;
    public final void rule__Constant__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1845:1: ( rule__Constant__Group_2__1__Impl )
            // InternalDTO.g:1846:2: rule__Constant__Group_2__1__Impl
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
    // InternalDTO.g:1852:1: rule__Constant__Group_2__1__Impl : ( ( rule__Constant__ValueAssignment_2_1 ) ) ;
    public final void rule__Constant__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1856:1: ( ( ( rule__Constant__ValueAssignment_2_1 ) ) )
            // InternalDTO.g:1857:1: ( ( rule__Constant__ValueAssignment_2_1 ) )
            {
            // InternalDTO.g:1857:1: ( ( rule__Constant__ValueAssignment_2_1 ) )
            // InternalDTO.g:1858:2: ( rule__Constant__ValueAssignment_2_1 )
            {
             before(grammarAccess.getConstantAccess().getValueAssignment_2_1()); 
            // InternalDTO.g:1859:2: ( rule__Constant__ValueAssignment_2_1 )
            // InternalDTO.g:1859:3: rule__Constant__ValueAssignment_2_1
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
    // InternalDTO.g:1868:1: rule__Constant__Group_3__0 : rule__Constant__Group_3__0__Impl rule__Constant__Group_3__1 ;
    public final void rule__Constant__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1872:1: ( rule__Constant__Group_3__0__Impl rule__Constant__Group_3__1 )
            // InternalDTO.g:1873:2: rule__Constant__Group_3__0__Impl rule__Constant__Group_3__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalDTO.g:1880:1: rule__Constant__Group_3__0__Impl : ( () ) ;
    public final void rule__Constant__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1884:1: ( ( () ) )
            // InternalDTO.g:1885:1: ( () )
            {
            // InternalDTO.g:1885:1: ( () )
            // InternalDTO.g:1886:2: ()
            {
             before(grammarAccess.getConstantAccess().getBoolConstantAction_3_0()); 
            // InternalDTO.g:1887:2: ()
            // InternalDTO.g:1887:3: 
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
    // InternalDTO.g:1895:1: rule__Constant__Group_3__1 : rule__Constant__Group_3__1__Impl ;
    public final void rule__Constant__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1899:1: ( rule__Constant__Group_3__1__Impl )
            // InternalDTO.g:1900:2: rule__Constant__Group_3__1__Impl
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
    // InternalDTO.g:1906:1: rule__Constant__Group_3__1__Impl : ( ( rule__Constant__ValueAssignment_3_1 ) ) ;
    public final void rule__Constant__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1910:1: ( ( ( rule__Constant__ValueAssignment_3_1 ) ) )
            // InternalDTO.g:1911:1: ( ( rule__Constant__ValueAssignment_3_1 ) )
            {
            // InternalDTO.g:1911:1: ( ( rule__Constant__ValueAssignment_3_1 ) )
            // InternalDTO.g:1912:2: ( rule__Constant__ValueAssignment_3_1 )
            {
             before(grammarAccess.getConstantAccess().getValueAssignment_3_1()); 
            // InternalDTO.g:1913:2: ( rule__Constant__ValueAssignment_3_1 )
            // InternalDTO.g:1913:3: rule__Constant__ValueAssignment_3_1
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
    // InternalDTO.g:1922:1: rule__Constant__Group_4__0 : rule__Constant__Group_4__0__Impl rule__Constant__Group_4__1 ;
    public final void rule__Constant__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1926:1: ( rule__Constant__Group_4__0__Impl rule__Constant__Group_4__1 )
            // InternalDTO.g:1927:2: rule__Constant__Group_4__0__Impl rule__Constant__Group_4__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalDTO.g:1934:1: rule__Constant__Group_4__0__Impl : ( () ) ;
    public final void rule__Constant__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1938:1: ( ( () ) )
            // InternalDTO.g:1939:1: ( () )
            {
            // InternalDTO.g:1939:1: ( () )
            // InternalDTO.g:1940:2: ()
            {
             before(grammarAccess.getConstantAccess().getDateConstantAction_4_0()); 
            // InternalDTO.g:1941:2: ()
            // InternalDTO.g:1941:3: 
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
    // InternalDTO.g:1949:1: rule__Constant__Group_4__1 : rule__Constant__Group_4__1__Impl rule__Constant__Group_4__2 ;
    public final void rule__Constant__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1953:1: ( rule__Constant__Group_4__1__Impl rule__Constant__Group_4__2 )
            // InternalDTO.g:1954:2: rule__Constant__Group_4__1__Impl rule__Constant__Group_4__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalDTO.g:1961:1: rule__Constant__Group_4__1__Impl : ( ( rule__Constant__DayAssignment_4_1 ) ) ;
    public final void rule__Constant__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1965:1: ( ( ( rule__Constant__DayAssignment_4_1 ) ) )
            // InternalDTO.g:1966:1: ( ( rule__Constant__DayAssignment_4_1 ) )
            {
            // InternalDTO.g:1966:1: ( ( rule__Constant__DayAssignment_4_1 ) )
            // InternalDTO.g:1967:2: ( rule__Constant__DayAssignment_4_1 )
            {
             before(grammarAccess.getConstantAccess().getDayAssignment_4_1()); 
            // InternalDTO.g:1968:2: ( rule__Constant__DayAssignment_4_1 )
            // InternalDTO.g:1968:3: rule__Constant__DayAssignment_4_1
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
    // InternalDTO.g:1976:1: rule__Constant__Group_4__2 : rule__Constant__Group_4__2__Impl rule__Constant__Group_4__3 ;
    public final void rule__Constant__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1980:1: ( rule__Constant__Group_4__2__Impl rule__Constant__Group_4__3 )
            // InternalDTO.g:1981:2: rule__Constant__Group_4__2__Impl rule__Constant__Group_4__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalDTO.g:1988:1: rule__Constant__Group_4__2__Impl : ( '/' ) ;
    public final void rule__Constant__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:1992:1: ( ( '/' ) )
            // InternalDTO.g:1993:1: ( '/' )
            {
            // InternalDTO.g:1993:1: ( '/' )
            // InternalDTO.g:1994:2: '/'
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
    // InternalDTO.g:2003:1: rule__Constant__Group_4__3 : rule__Constant__Group_4__3__Impl rule__Constant__Group_4__4 ;
    public final void rule__Constant__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2007:1: ( rule__Constant__Group_4__3__Impl rule__Constant__Group_4__4 )
            // InternalDTO.g:2008:2: rule__Constant__Group_4__3__Impl rule__Constant__Group_4__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalDTO.g:2015:1: rule__Constant__Group_4__3__Impl : ( ( rule__Constant__MonthAssignment_4_3 ) ) ;
    public final void rule__Constant__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2019:1: ( ( ( rule__Constant__MonthAssignment_4_3 ) ) )
            // InternalDTO.g:2020:1: ( ( rule__Constant__MonthAssignment_4_3 ) )
            {
            // InternalDTO.g:2020:1: ( ( rule__Constant__MonthAssignment_4_3 ) )
            // InternalDTO.g:2021:2: ( rule__Constant__MonthAssignment_4_3 )
            {
             before(grammarAccess.getConstantAccess().getMonthAssignment_4_3()); 
            // InternalDTO.g:2022:2: ( rule__Constant__MonthAssignment_4_3 )
            // InternalDTO.g:2022:3: rule__Constant__MonthAssignment_4_3
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
    // InternalDTO.g:2030:1: rule__Constant__Group_4__4 : rule__Constant__Group_4__4__Impl rule__Constant__Group_4__5 ;
    public final void rule__Constant__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2034:1: ( rule__Constant__Group_4__4__Impl rule__Constant__Group_4__5 )
            // InternalDTO.g:2035:2: rule__Constant__Group_4__4__Impl rule__Constant__Group_4__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalDTO.g:2042:1: rule__Constant__Group_4__4__Impl : ( '/' ) ;
    public final void rule__Constant__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2046:1: ( ( '/' ) )
            // InternalDTO.g:2047:1: ( '/' )
            {
            // InternalDTO.g:2047:1: ( '/' )
            // InternalDTO.g:2048:2: '/'
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
    // InternalDTO.g:2057:1: rule__Constant__Group_4__5 : rule__Constant__Group_4__5__Impl ;
    public final void rule__Constant__Group_4__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2061:1: ( rule__Constant__Group_4__5__Impl )
            // InternalDTO.g:2062:2: rule__Constant__Group_4__5__Impl
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
    // InternalDTO.g:2068:1: rule__Constant__Group_4__5__Impl : ( ( rule__Constant__YearAssignment_4_5 ) ) ;
    public final void rule__Constant__Group_4__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2072:1: ( ( ( rule__Constant__YearAssignment_4_5 ) ) )
            // InternalDTO.g:2073:1: ( ( rule__Constant__YearAssignment_4_5 ) )
            {
            // InternalDTO.g:2073:1: ( ( rule__Constant__YearAssignment_4_5 ) )
            // InternalDTO.g:2074:2: ( rule__Constant__YearAssignment_4_5 )
            {
             before(grammarAccess.getConstantAccess().getYearAssignment_4_5()); 
            // InternalDTO.g:2075:2: ( rule__Constant__YearAssignment_4_5 )
            // InternalDTO.g:2075:3: rule__Constant__YearAssignment_4_5
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
    // InternalDTO.g:2084:1: rule__Constant__Group_5__0 : rule__Constant__Group_5__0__Impl rule__Constant__Group_5__1 ;
    public final void rule__Constant__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2088:1: ( rule__Constant__Group_5__0__Impl rule__Constant__Group_5__1 )
            // InternalDTO.g:2089:2: rule__Constant__Group_5__0__Impl rule__Constant__Group_5__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalDTO.g:2096:1: rule__Constant__Group_5__0__Impl : ( () ) ;
    public final void rule__Constant__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2100:1: ( ( () ) )
            // InternalDTO.g:2101:1: ( () )
            {
            // InternalDTO.g:2101:1: ( () )
            // InternalDTO.g:2102:2: ()
            {
             before(grammarAccess.getConstantAccess().getNullAction_5_0()); 
            // InternalDTO.g:2103:2: ()
            // InternalDTO.g:2103:3: 
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
    // InternalDTO.g:2111:1: rule__Constant__Group_5__1 : rule__Constant__Group_5__1__Impl ;
    public final void rule__Constant__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2115:1: ( rule__Constant__Group_5__1__Impl )
            // InternalDTO.g:2116:2: rule__Constant__Group_5__1__Impl
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
    // InternalDTO.g:2122:1: rule__Constant__Group_5__1__Impl : ( 'null' ) ;
    public final void rule__Constant__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2126:1: ( ( 'null' ) )
            // InternalDTO.g:2127:1: ( 'null' )
            {
            // InternalDTO.g:2127:1: ( 'null' )
            // InternalDTO.g:2128:2: 'null'
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
    // InternalDTO.g:2138:1: rule__EntityOption__Group_0__0 : rule__EntityOption__Group_0__0__Impl rule__EntityOption__Group_0__1 ;
    public final void rule__EntityOption__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2142:1: ( rule__EntityOption__Group_0__0__Impl rule__EntityOption__Group_0__1 )
            // InternalDTO.g:2143:2: rule__EntityOption__Group_0__0__Impl rule__EntityOption__Group_0__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalDTO.g:2150:1: rule__EntityOption__Group_0__0__Impl : ( () ) ;
    public final void rule__EntityOption__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2154:1: ( ( () ) )
            // InternalDTO.g:2155:1: ( () )
            {
            // InternalDTO.g:2155:1: ( () )
            // InternalDTO.g:2156:2: ()
            {
             before(grammarAccess.getEntityOptionAccess().getEntityDeleteOptionAction_0_0()); 
            // InternalDTO.g:2157:2: ()
            // InternalDTO.g:2157:3: 
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
    // InternalDTO.g:2165:1: rule__EntityOption__Group_0__1 : rule__EntityOption__Group_0__1__Impl ;
    public final void rule__EntityOption__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2169:1: ( rule__EntityOption__Group_0__1__Impl )
            // InternalDTO.g:2170:2: rule__EntityOption__Group_0__1__Impl
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
    // InternalDTO.g:2176:1: rule__EntityOption__Group_0__1__Impl : ( ( rule__EntityOption__DeleteByFlagAssignment_0_1 ) ) ;
    public final void rule__EntityOption__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2180:1: ( ( ( rule__EntityOption__DeleteByFlagAssignment_0_1 ) ) )
            // InternalDTO.g:2181:1: ( ( rule__EntityOption__DeleteByFlagAssignment_0_1 ) )
            {
            // InternalDTO.g:2181:1: ( ( rule__EntityOption__DeleteByFlagAssignment_0_1 ) )
            // InternalDTO.g:2182:2: ( rule__EntityOption__DeleteByFlagAssignment_0_1 )
            {
             before(grammarAccess.getEntityOptionAccess().getDeleteByFlagAssignment_0_1()); 
            // InternalDTO.g:2183:2: ( rule__EntityOption__DeleteByFlagAssignment_0_1 )
            // InternalDTO.g:2183:3: rule__EntityOption__DeleteByFlagAssignment_0_1
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
    // InternalDTO.g:2192:1: rule__EntityOption__Group_1__0 : rule__EntityOption__Group_1__0__Impl rule__EntityOption__Group_1__1 ;
    public final void rule__EntityOption__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2196:1: ( rule__EntityOption__Group_1__0__Impl rule__EntityOption__Group_1__1 )
            // InternalDTO.g:2197:2: rule__EntityOption__Group_1__0__Impl rule__EntityOption__Group_1__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalDTO.g:2204:1: rule__EntityOption__Group_1__0__Impl : ( () ) ;
    public final void rule__EntityOption__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2208:1: ( ( () ) )
            // InternalDTO.g:2209:1: ( () )
            {
            // InternalDTO.g:2209:1: ( () )
            // InternalDTO.g:2210:2: ()
            {
             before(grammarAccess.getEntityOptionAccess().getInheritanceMappingOptionAction_1_0()); 
            // InternalDTO.g:2211:2: ()
            // InternalDTO.g:2211:3: 
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
    // InternalDTO.g:2219:1: rule__EntityOption__Group_1__1 : rule__EntityOption__Group_1__1__Impl rule__EntityOption__Group_1__2 ;
    public final void rule__EntityOption__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2223:1: ( rule__EntityOption__Group_1__1__Impl rule__EntityOption__Group_1__2 )
            // InternalDTO.g:2224:2: rule__EntityOption__Group_1__1__Impl rule__EntityOption__Group_1__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalDTO.g:2231:1: rule__EntityOption__Group_1__1__Impl : ( 'inheritance' ) ;
    public final void rule__EntityOption__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2235:1: ( ( 'inheritance' ) )
            // InternalDTO.g:2236:1: ( 'inheritance' )
            {
            // InternalDTO.g:2236:1: ( 'inheritance' )
            // InternalDTO.g:2237:2: 'inheritance'
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
    // InternalDTO.g:2246:1: rule__EntityOption__Group_1__2 : rule__EntityOption__Group_1__2__Impl rule__EntityOption__Group_1__3 ;
    public final void rule__EntityOption__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2250:1: ( rule__EntityOption__Group_1__2__Impl rule__EntityOption__Group_1__3 )
            // InternalDTO.g:2251:2: rule__EntityOption__Group_1__2__Impl rule__EntityOption__Group_1__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalDTO.g:2258:1: rule__EntityOption__Group_1__2__Impl : ( '=' ) ;
    public final void rule__EntityOption__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2262:1: ( ( '=' ) )
            // InternalDTO.g:2263:1: ( '=' )
            {
            // InternalDTO.g:2263:1: ( '=' )
            // InternalDTO.g:2264:2: '='
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
    // InternalDTO.g:2273:1: rule__EntityOption__Group_1__3 : rule__EntityOption__Group_1__3__Impl ;
    public final void rule__EntityOption__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2277:1: ( rule__EntityOption__Group_1__3__Impl )
            // InternalDTO.g:2278:2: rule__EntityOption__Group_1__3__Impl
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
    // InternalDTO.g:2284:1: rule__EntityOption__Group_1__3__Impl : ( ( rule__EntityOption__InheritanceMappingAssignment_1_3 ) ) ;
    public final void rule__EntityOption__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2288:1: ( ( ( rule__EntityOption__InheritanceMappingAssignment_1_3 ) ) )
            // InternalDTO.g:2289:1: ( ( rule__EntityOption__InheritanceMappingAssignment_1_3 ) )
            {
            // InternalDTO.g:2289:1: ( ( rule__EntityOption__InheritanceMappingAssignment_1_3 ) )
            // InternalDTO.g:2290:2: ( rule__EntityOption__InheritanceMappingAssignment_1_3 )
            {
             before(grammarAccess.getEntityOptionAccess().getInheritanceMappingAssignment_1_3()); 
            // InternalDTO.g:2291:2: ( rule__EntityOption__InheritanceMappingAssignment_1_3 )
            // InternalDTO.g:2291:3: rule__EntityOption__InheritanceMappingAssignment_1_3
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
    // InternalDTO.g:2300:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2304:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalDTO.g:2305:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalDTO.g:2312:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__TypeAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2316:1: ( ( ( rule__Attribute__TypeAssignment_0 ) ) )
            // InternalDTO.g:2317:1: ( ( rule__Attribute__TypeAssignment_0 ) )
            {
            // InternalDTO.g:2317:1: ( ( rule__Attribute__TypeAssignment_0 ) )
            // InternalDTO.g:2318:2: ( rule__Attribute__TypeAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_0()); 
            // InternalDTO.g:2319:2: ( rule__Attribute__TypeAssignment_0 )
            // InternalDTO.g:2319:3: rule__Attribute__TypeAssignment_0
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
    // InternalDTO.g:2327:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2331:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalDTO.g:2332:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalDTO.g:2339:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2343:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalDTO.g:2344:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalDTO.g:2344:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalDTO.g:2345:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalDTO.g:2346:2: ( rule__Attribute__NameAssignment_1 )
            // InternalDTO.g:2346:3: rule__Attribute__NameAssignment_1
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
    // InternalDTO.g:2354:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2358:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalDTO.g:2359:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalDTO.g:2366:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__Group_2__0 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2370:1: ( ( ( rule__Attribute__Group_2__0 )? ) )
            // InternalDTO.g:2371:1: ( ( rule__Attribute__Group_2__0 )? )
            {
            // InternalDTO.g:2371:1: ( ( rule__Attribute__Group_2__0 )? )
            // InternalDTO.g:2372:2: ( rule__Attribute__Group_2__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_2()); 
            // InternalDTO.g:2373:2: ( rule__Attribute__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=45 && LA19_0<=46)||(LA19_0>=49 && LA19_0<=50)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDTO.g:2373:3: rule__Attribute__Group_2__0
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
    // InternalDTO.g:2381:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2385:1: ( rule__Attribute__Group__3__Impl )
            // InternalDTO.g:2386:2: rule__Attribute__Group__3__Impl
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
    // InternalDTO.g:2392:1: rule__Attribute__Group__3__Impl : ( ';' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2396:1: ( ( ';' ) )
            // InternalDTO.g:2397:1: ( ';' )
            {
            // InternalDTO.g:2397:1: ( ';' )
            // InternalDTO.g:2398:2: ';'
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
    // InternalDTO.g:2408:1: rule__Attribute__Group_2__0 : rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1 ;
    public final void rule__Attribute__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2412:1: ( rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1 )
            // InternalDTO.g:2413:2: rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalDTO.g:2420:1: rule__Attribute__Group_2__0__Impl : ( ( rule__Attribute__OptionsAssignment_2_0 ) ) ;
    public final void rule__Attribute__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2424:1: ( ( ( rule__Attribute__OptionsAssignment_2_0 ) ) )
            // InternalDTO.g:2425:1: ( ( rule__Attribute__OptionsAssignment_2_0 ) )
            {
            // InternalDTO.g:2425:1: ( ( rule__Attribute__OptionsAssignment_2_0 ) )
            // InternalDTO.g:2426:2: ( rule__Attribute__OptionsAssignment_2_0 )
            {
             before(grammarAccess.getAttributeAccess().getOptionsAssignment_2_0()); 
            // InternalDTO.g:2427:2: ( rule__Attribute__OptionsAssignment_2_0 )
            // InternalDTO.g:2427:3: rule__Attribute__OptionsAssignment_2_0
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
    // InternalDTO.g:2435:1: rule__Attribute__Group_2__1 : rule__Attribute__Group_2__1__Impl ;
    public final void rule__Attribute__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2439:1: ( rule__Attribute__Group_2__1__Impl )
            // InternalDTO.g:2440:2: rule__Attribute__Group_2__1__Impl
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
    // InternalDTO.g:2446:1: rule__Attribute__Group_2__1__Impl : ( ( rule__Attribute__Group_2_1__0 )* ) ;
    public final void rule__Attribute__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2450:1: ( ( ( rule__Attribute__Group_2_1__0 )* ) )
            // InternalDTO.g:2451:1: ( ( rule__Attribute__Group_2_1__0 )* )
            {
            // InternalDTO.g:2451:1: ( ( rule__Attribute__Group_2_1__0 )* )
            // InternalDTO.g:2452:2: ( rule__Attribute__Group_2_1__0 )*
            {
             before(grammarAccess.getAttributeAccess().getGroup_2_1()); 
            // InternalDTO.g:2453:2: ( rule__Attribute__Group_2_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==30) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalDTO.g:2453:3: rule__Attribute__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Attribute__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalDTO.g:2462:1: rule__Attribute__Group_2_1__0 : rule__Attribute__Group_2_1__0__Impl rule__Attribute__Group_2_1__1 ;
    public final void rule__Attribute__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2466:1: ( rule__Attribute__Group_2_1__0__Impl rule__Attribute__Group_2_1__1 )
            // InternalDTO.g:2467:2: rule__Attribute__Group_2_1__0__Impl rule__Attribute__Group_2_1__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalDTO.g:2474:1: rule__Attribute__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Attribute__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2478:1: ( ( ',' ) )
            // InternalDTO.g:2479:1: ( ',' )
            {
            // InternalDTO.g:2479:1: ( ',' )
            // InternalDTO.g:2480:2: ','
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
    // InternalDTO.g:2489:1: rule__Attribute__Group_2_1__1 : rule__Attribute__Group_2_1__1__Impl ;
    public final void rule__Attribute__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2493:1: ( rule__Attribute__Group_2_1__1__Impl )
            // InternalDTO.g:2494:2: rule__Attribute__Group_2_1__1__Impl
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
    // InternalDTO.g:2500:1: rule__Attribute__Group_2_1__1__Impl : ( ( rule__Attribute__OptionsAssignment_2_1_1 ) ) ;
    public final void rule__Attribute__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2504:1: ( ( ( rule__Attribute__OptionsAssignment_2_1_1 ) ) )
            // InternalDTO.g:2505:1: ( ( rule__Attribute__OptionsAssignment_2_1_1 ) )
            {
            // InternalDTO.g:2505:1: ( ( rule__Attribute__OptionsAssignment_2_1_1 ) )
            // InternalDTO.g:2506:2: ( rule__Attribute__OptionsAssignment_2_1_1 )
            {
             before(grammarAccess.getAttributeAccess().getOptionsAssignment_2_1_1()); 
            // InternalDTO.g:2507:2: ( rule__Attribute__OptionsAssignment_2_1_1 )
            // InternalDTO.g:2507:3: rule__Attribute__OptionsAssignment_2_1_1
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
    // InternalDTO.g:2516:1: superBasicType__Group_0__0 : superBasicType__Group_0__0__Impl superBasicType__Group_0__1 ;
    public final void superBasicType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2520:1: ( superBasicType__Group_0__0__Impl superBasicType__Group_0__1 )
            // InternalDTO.g:2521:2: superBasicType__Group_0__0__Impl superBasicType__Group_0__1
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
    // InternalDTO.g:2528:1: superBasicType__Group_0__0__Impl : ( () ) ;
    public final void superBasicType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2532:1: ( ( () ) )
            // InternalDTO.g:2533:1: ( () )
            {
            // InternalDTO.g:2533:1: ( () )
            // InternalDTO.g:2534:2: ()
            {
             before(grammarAccess.getDomainModelBasicTypeAccess().getStringTypeAction_0_0()); 
            // InternalDTO.g:2535:2: ()
            // InternalDTO.g:2535:3: 
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
    // InternalDTO.g:2543:1: superBasicType__Group_0__1 : superBasicType__Group_0__1__Impl ;
    public final void superBasicType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2547:1: ( superBasicType__Group_0__1__Impl )
            // InternalDTO.g:2548:2: superBasicType__Group_0__1__Impl
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
    // InternalDTO.g:2554:1: superBasicType__Group_0__1__Impl : ( 'string' ) ;
    public final void superBasicType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2558:1: ( ( 'string' ) )
            // InternalDTO.g:2559:1: ( 'string' )
            {
            // InternalDTO.g:2559:1: ( 'string' )
            // InternalDTO.g:2560:2: 'string'
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
    // InternalDTO.g:2570:1: superBasicType__Group_1__0 : superBasicType__Group_1__0__Impl superBasicType__Group_1__1 ;
    public final void superBasicType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2574:1: ( superBasicType__Group_1__0__Impl superBasicType__Group_1__1 )
            // InternalDTO.g:2575:2: superBasicType__Group_1__0__Impl superBasicType__Group_1__1
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
    // InternalDTO.g:2582:1: superBasicType__Group_1__0__Impl : ( () ) ;
    public final void superBasicType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2586:1: ( ( () ) )
            // InternalDTO.g:2587:1: ( () )
            {
            // InternalDTO.g:2587:1: ( () )
            // InternalDTO.g:2588:2: ()
            {
             before(grammarAccess.getDomainModelBasicTypeAccess().getIntTypeAction_1_0()); 
            // InternalDTO.g:2589:2: ()
            // InternalDTO.g:2589:3: 
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
    // InternalDTO.g:2597:1: superBasicType__Group_1__1 : superBasicType__Group_1__1__Impl ;
    public final void superBasicType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2601:1: ( superBasicType__Group_1__1__Impl )
            // InternalDTO.g:2602:2: superBasicType__Group_1__1__Impl
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
    // InternalDTO.g:2608:1: superBasicType__Group_1__1__Impl : ( 'int' ) ;
    public final void superBasicType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2612:1: ( ( 'int' ) )
            // InternalDTO.g:2613:1: ( 'int' )
            {
            // InternalDTO.g:2613:1: ( 'int' )
            // InternalDTO.g:2614:2: 'int'
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
    // InternalDTO.g:2624:1: superBasicType__Group_2__0 : superBasicType__Group_2__0__Impl superBasicType__Group_2__1 ;
    public final void superBasicType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2628:1: ( superBasicType__Group_2__0__Impl superBasicType__Group_2__1 )
            // InternalDTO.g:2629:2: superBasicType__Group_2__0__Impl superBasicType__Group_2__1
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
    // InternalDTO.g:2636:1: superBasicType__Group_2__0__Impl : ( () ) ;
    public final void superBasicType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2640:1: ( ( () ) )
            // InternalDTO.g:2641:1: ( () )
            {
            // InternalDTO.g:2641:1: ( () )
            // InternalDTO.g:2642:2: ()
            {
             before(grammarAccess.getDomainModelBasicTypeAccess().getLongTypeAction_2_0()); 
            // InternalDTO.g:2643:2: ()
            // InternalDTO.g:2643:3: 
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
    // InternalDTO.g:2651:1: superBasicType__Group_2__1 : superBasicType__Group_2__1__Impl ;
    public final void superBasicType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2655:1: ( superBasicType__Group_2__1__Impl )
            // InternalDTO.g:2656:2: superBasicType__Group_2__1__Impl
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
    // InternalDTO.g:2662:1: superBasicType__Group_2__1__Impl : ( 'long' ) ;
    public final void superBasicType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2666:1: ( ( 'long' ) )
            // InternalDTO.g:2667:1: ( 'long' )
            {
            // InternalDTO.g:2667:1: ( 'long' )
            // InternalDTO.g:2668:2: 'long'
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
    // InternalDTO.g:2678:1: superBasicType__Group_3__0 : superBasicType__Group_3__0__Impl superBasicType__Group_3__1 ;
    public final void superBasicType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2682:1: ( superBasicType__Group_3__0__Impl superBasicType__Group_3__1 )
            // InternalDTO.g:2683:2: superBasicType__Group_3__0__Impl superBasicType__Group_3__1
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
    // InternalDTO.g:2690:1: superBasicType__Group_3__0__Impl : ( () ) ;
    public final void superBasicType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2694:1: ( ( () ) )
            // InternalDTO.g:2695:1: ( () )
            {
            // InternalDTO.g:2695:1: ( () )
            // InternalDTO.g:2696:2: ()
            {
             before(grammarAccess.getDomainModelBasicTypeAccess().getBoolTypeAction_3_0()); 
            // InternalDTO.g:2697:2: ()
            // InternalDTO.g:2697:3: 
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
    // InternalDTO.g:2705:1: superBasicType__Group_3__1 : superBasicType__Group_3__1__Impl ;
    public final void superBasicType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2709:1: ( superBasicType__Group_3__1__Impl )
            // InternalDTO.g:2710:2: superBasicType__Group_3__1__Impl
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
    // InternalDTO.g:2716:1: superBasicType__Group_3__1__Impl : ( 'boolean' ) ;
    public final void superBasicType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2720:1: ( ( 'boolean' ) )
            // InternalDTO.g:2721:1: ( 'boolean' )
            {
            // InternalDTO.g:2721:1: ( 'boolean' )
            // InternalDTO.g:2722:2: 'boolean'
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
    // InternalDTO.g:2732:1: superBasicType__Group_4__0 : superBasicType__Group_4__0__Impl superBasicType__Group_4__1 ;
    public final void superBasicType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2736:1: ( superBasicType__Group_4__0__Impl superBasicType__Group_4__1 )
            // InternalDTO.g:2737:2: superBasicType__Group_4__0__Impl superBasicType__Group_4__1
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
    // InternalDTO.g:2744:1: superBasicType__Group_4__0__Impl : ( () ) ;
    public final void superBasicType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2748:1: ( ( () ) )
            // InternalDTO.g:2749:1: ( () )
            {
            // InternalDTO.g:2749:1: ( () )
            // InternalDTO.g:2750:2: ()
            {
             before(grammarAccess.getDomainModelBasicTypeAccess().getDateTypeAction_4_0()); 
            // InternalDTO.g:2751:2: ()
            // InternalDTO.g:2751:3: 
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
    // InternalDTO.g:2759:1: superBasicType__Group_4__1 : superBasicType__Group_4__1__Impl ;
    public final void superBasicType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2763:1: ( superBasicType__Group_4__1__Impl )
            // InternalDTO.g:2764:2: superBasicType__Group_4__1__Impl
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
    // InternalDTO.g:2770:1: superBasicType__Group_4__1__Impl : ( 'date' ) ;
    public final void superBasicType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2774:1: ( ( 'date' ) )
            // InternalDTO.g:2775:1: ( 'date' )
            {
            // InternalDTO.g:2775:1: ( 'date' )
            // InternalDTO.g:2776:2: 'date'
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
    // InternalDTO.g:2786:1: rule__CollectionType__Group__0 : rule__CollectionType__Group__0__Impl rule__CollectionType__Group__1 ;
    public final void rule__CollectionType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2790:1: ( rule__CollectionType__Group__0__Impl rule__CollectionType__Group__1 )
            // InternalDTO.g:2791:2: rule__CollectionType__Group__0__Impl rule__CollectionType__Group__1
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
    // InternalDTO.g:2798:1: rule__CollectionType__Group__0__Impl : ( 'List' ) ;
    public final void rule__CollectionType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2802:1: ( ( 'List' ) )
            // InternalDTO.g:2803:1: ( 'List' )
            {
            // InternalDTO.g:2803:1: ( 'List' )
            // InternalDTO.g:2804:2: 'List'
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
    // InternalDTO.g:2813:1: rule__CollectionType__Group__1 : rule__CollectionType__Group__1__Impl rule__CollectionType__Group__2 ;
    public final void rule__CollectionType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2817:1: ( rule__CollectionType__Group__1__Impl rule__CollectionType__Group__2 )
            // InternalDTO.g:2818:2: rule__CollectionType__Group__1__Impl rule__CollectionType__Group__2
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
    // InternalDTO.g:2825:1: rule__CollectionType__Group__1__Impl : ( '<' ) ;
    public final void rule__CollectionType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2829:1: ( ( '<' ) )
            // InternalDTO.g:2830:1: ( '<' )
            {
            // InternalDTO.g:2830:1: ( '<' )
            // InternalDTO.g:2831:2: '<'
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
    // InternalDTO.g:2840:1: rule__CollectionType__Group__2 : rule__CollectionType__Group__2__Impl rule__CollectionType__Group__3 ;
    public final void rule__CollectionType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2844:1: ( rule__CollectionType__Group__2__Impl rule__CollectionType__Group__3 )
            // InternalDTO.g:2845:2: rule__CollectionType__Group__2__Impl rule__CollectionType__Group__3
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
    // InternalDTO.g:2852:1: rule__CollectionType__Group__2__Impl : ( ( rule__CollectionType__OfTypeAssignment_2 ) ) ;
    public final void rule__CollectionType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2856:1: ( ( ( rule__CollectionType__OfTypeAssignment_2 ) ) )
            // InternalDTO.g:2857:1: ( ( rule__CollectionType__OfTypeAssignment_2 ) )
            {
            // InternalDTO.g:2857:1: ( ( rule__CollectionType__OfTypeAssignment_2 ) )
            // InternalDTO.g:2858:2: ( rule__CollectionType__OfTypeAssignment_2 )
            {
             before(grammarAccess.getCollectionTypeAccess().getOfTypeAssignment_2()); 
            // InternalDTO.g:2859:2: ( rule__CollectionType__OfTypeAssignment_2 )
            // InternalDTO.g:2859:3: rule__CollectionType__OfTypeAssignment_2
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
    // InternalDTO.g:2867:1: rule__CollectionType__Group__3 : rule__CollectionType__Group__3__Impl ;
    public final void rule__CollectionType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2871:1: ( rule__CollectionType__Group__3__Impl )
            // InternalDTO.g:2872:2: rule__CollectionType__Group__3__Impl
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
    // InternalDTO.g:2878:1: rule__CollectionType__Group__3__Impl : ( '>' ) ;
    public final void rule__CollectionType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2882:1: ( ( '>' ) )
            // InternalDTO.g:2883:1: ( '>' )
            {
            // InternalDTO.g:2883:1: ( '>' )
            // InternalDTO.g:2884:2: '>'
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


    // $ANTLR start "rule__AttributeOption__Group_0__0"
    // InternalDTO.g:2894:1: rule__AttributeOption__Group_0__0 : rule__AttributeOption__Group_0__0__Impl rule__AttributeOption__Group_0__1 ;
    public final void rule__AttributeOption__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2898:1: ( rule__AttributeOption__Group_0__0__Impl rule__AttributeOption__Group_0__1 )
            // InternalDTO.g:2899:2: rule__AttributeOption__Group_0__0__Impl rule__AttributeOption__Group_0__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalDTO.g:2906:1: rule__AttributeOption__Group_0__0__Impl : ( () ) ;
    public final void rule__AttributeOption__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2910:1: ( ( () ) )
            // InternalDTO.g:2911:1: ( () )
            {
            // InternalDTO.g:2911:1: ( () )
            // InternalDTO.g:2912:2: ()
            {
             before(grammarAccess.getAttributeOptionAccess().getRequiredAction_0_0()); 
            // InternalDTO.g:2913:2: ()
            // InternalDTO.g:2913:3: 
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
    // InternalDTO.g:2921:1: rule__AttributeOption__Group_0__1 : rule__AttributeOption__Group_0__1__Impl ;
    public final void rule__AttributeOption__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2925:1: ( rule__AttributeOption__Group_0__1__Impl )
            // InternalDTO.g:2926:2: rule__AttributeOption__Group_0__1__Impl
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
    // InternalDTO.g:2932:1: rule__AttributeOption__Group_0__1__Impl : ( ( rule__AttributeOption__RequiredAssignment_0_1 ) ) ;
    public final void rule__AttributeOption__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2936:1: ( ( ( rule__AttributeOption__RequiredAssignment_0_1 ) ) )
            // InternalDTO.g:2937:1: ( ( rule__AttributeOption__RequiredAssignment_0_1 ) )
            {
            // InternalDTO.g:2937:1: ( ( rule__AttributeOption__RequiredAssignment_0_1 ) )
            // InternalDTO.g:2938:2: ( rule__AttributeOption__RequiredAssignment_0_1 )
            {
             before(grammarAccess.getAttributeOptionAccess().getRequiredAssignment_0_1()); 
            // InternalDTO.g:2939:2: ( rule__AttributeOption__RequiredAssignment_0_1 )
            // InternalDTO.g:2939:3: rule__AttributeOption__RequiredAssignment_0_1
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
    // InternalDTO.g:2948:1: rule__AttributeOption__Group_1__0 : rule__AttributeOption__Group_1__0__Impl rule__AttributeOption__Group_1__1 ;
    public final void rule__AttributeOption__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2952:1: ( rule__AttributeOption__Group_1__0__Impl rule__AttributeOption__Group_1__1 )
            // InternalDTO.g:2953:2: rule__AttributeOption__Group_1__0__Impl rule__AttributeOption__Group_1__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalDTO.g:2960:1: rule__AttributeOption__Group_1__0__Impl : ( () ) ;
    public final void rule__AttributeOption__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2964:1: ( ( () ) )
            // InternalDTO.g:2965:1: ( () )
            {
            // InternalDTO.g:2965:1: ( () )
            // InternalDTO.g:2966:2: ()
            {
             before(grammarAccess.getAttributeOptionAccess().getPartOfAction_1_0()); 
            // InternalDTO.g:2967:2: ()
            // InternalDTO.g:2967:3: 
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
    // InternalDTO.g:2975:1: rule__AttributeOption__Group_1__1 : rule__AttributeOption__Group_1__1__Impl ;
    public final void rule__AttributeOption__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2979:1: ( rule__AttributeOption__Group_1__1__Impl )
            // InternalDTO.g:2980:2: rule__AttributeOption__Group_1__1__Impl
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
    // InternalDTO.g:2986:1: rule__AttributeOption__Group_1__1__Impl : ( ( rule__AttributeOption__PartOfAssignment_1_1 ) ) ;
    public final void rule__AttributeOption__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:2990:1: ( ( ( rule__AttributeOption__PartOfAssignment_1_1 ) ) )
            // InternalDTO.g:2991:1: ( ( rule__AttributeOption__PartOfAssignment_1_1 ) )
            {
            // InternalDTO.g:2991:1: ( ( rule__AttributeOption__PartOfAssignment_1_1 ) )
            // InternalDTO.g:2992:2: ( rule__AttributeOption__PartOfAssignment_1_1 )
            {
             before(grammarAccess.getAttributeOptionAccess().getPartOfAssignment_1_1()); 
            // InternalDTO.g:2993:2: ( rule__AttributeOption__PartOfAssignment_1_1 )
            // InternalDTO.g:2993:3: rule__AttributeOption__PartOfAssignment_1_1
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
    // InternalDTO.g:3002:1: rule__AttributeOption__Group_2__0 : rule__AttributeOption__Group_2__0__Impl rule__AttributeOption__Group_2__1 ;
    public final void rule__AttributeOption__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3006:1: ( rule__AttributeOption__Group_2__0__Impl rule__AttributeOption__Group_2__1 )
            // InternalDTO.g:3007:2: rule__AttributeOption__Group_2__0__Impl rule__AttributeOption__Group_2__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalDTO.g:3014:1: rule__AttributeOption__Group_2__0__Impl : ( () ) ;
    public final void rule__AttributeOption__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3018:1: ( ( () ) )
            // InternalDTO.g:3019:1: ( () )
            {
            // InternalDTO.g:3019:1: ( () )
            // InternalDTO.g:3020:2: ()
            {
             before(grammarAccess.getAttributeOptionAccess().getRelationshipOwnerAction_2_0()); 
            // InternalDTO.g:3021:2: ()
            // InternalDTO.g:3021:3: 
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
    // InternalDTO.g:3029:1: rule__AttributeOption__Group_2__1 : rule__AttributeOption__Group_2__1__Impl rule__AttributeOption__Group_2__2 ;
    public final void rule__AttributeOption__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3033:1: ( rule__AttributeOption__Group_2__1__Impl rule__AttributeOption__Group_2__2 )
            // InternalDTO.g:3034:2: rule__AttributeOption__Group_2__1__Impl rule__AttributeOption__Group_2__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalDTO.g:3041:1: rule__AttributeOption__Group_2__1__Impl : ( 'relationshipOwner' ) ;
    public final void rule__AttributeOption__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3045:1: ( ( 'relationshipOwner' ) )
            // InternalDTO.g:3046:1: ( 'relationshipOwner' )
            {
            // InternalDTO.g:3046:1: ( 'relationshipOwner' )
            // InternalDTO.g:3047:2: 'relationshipOwner'
            {
             before(grammarAccess.getAttributeOptionAccess().getRelationshipOwnerKeyword_2_1()); 
            match(input,45,FOLLOW_2); 
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
    // InternalDTO.g:3056:1: rule__AttributeOption__Group_2__2 : rule__AttributeOption__Group_2__2__Impl rule__AttributeOption__Group_2__3 ;
    public final void rule__AttributeOption__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3060:1: ( rule__AttributeOption__Group_2__2__Impl rule__AttributeOption__Group_2__3 )
            // InternalDTO.g:3061:2: rule__AttributeOption__Group_2__2__Impl rule__AttributeOption__Group_2__3
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
    // InternalDTO.g:3068:1: rule__AttributeOption__Group_2__2__Impl : ( '=' ) ;
    public final void rule__AttributeOption__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3072:1: ( ( '=' ) )
            // InternalDTO.g:3073:1: ( '=' )
            {
            // InternalDTO.g:3073:1: ( '=' )
            // InternalDTO.g:3074:2: '='
            {
             before(grammarAccess.getAttributeOptionAccess().getEqualsSignKeyword_2_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalDTO.g:3083:1: rule__AttributeOption__Group_2__3 : rule__AttributeOption__Group_2__3__Impl ;
    public final void rule__AttributeOption__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3087:1: ( rule__AttributeOption__Group_2__3__Impl )
            // InternalDTO.g:3088:2: rule__AttributeOption__Group_2__3__Impl
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
    // InternalDTO.g:3094:1: rule__AttributeOption__Group_2__3__Impl : ( ( rule__AttributeOption__RelationshipOwnerAssignment_2_3 ) ) ;
    public final void rule__AttributeOption__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3098:1: ( ( ( rule__AttributeOption__RelationshipOwnerAssignment_2_3 ) ) )
            // InternalDTO.g:3099:1: ( ( rule__AttributeOption__RelationshipOwnerAssignment_2_3 ) )
            {
            // InternalDTO.g:3099:1: ( ( rule__AttributeOption__RelationshipOwnerAssignment_2_3 ) )
            // InternalDTO.g:3100:2: ( rule__AttributeOption__RelationshipOwnerAssignment_2_3 )
            {
             before(grammarAccess.getAttributeOptionAccess().getRelationshipOwnerAssignment_2_3()); 
            // InternalDTO.g:3101:2: ( rule__AttributeOption__RelationshipOwnerAssignment_2_3 )
            // InternalDTO.g:3101:3: rule__AttributeOption__RelationshipOwnerAssignment_2_3
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
    // InternalDTO.g:3110:1: rule__AttributeOption__Group_3__0 : rule__AttributeOption__Group_3__0__Impl rule__AttributeOption__Group_3__1 ;
    public final void rule__AttributeOption__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3114:1: ( rule__AttributeOption__Group_3__0__Impl rule__AttributeOption__Group_3__1 )
            // InternalDTO.g:3115:2: rule__AttributeOption__Group_3__0__Impl rule__AttributeOption__Group_3__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalDTO.g:3122:1: rule__AttributeOption__Group_3__0__Impl : ( () ) ;
    public final void rule__AttributeOption__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3126:1: ( ( () ) )
            // InternalDTO.g:3127:1: ( () )
            {
            // InternalDTO.g:3127:1: ( () )
            // InternalDTO.g:3128:2: ()
            {
             before(grammarAccess.getAttributeOptionAccess().getCardinalityAction_3_0()); 
            // InternalDTO.g:3129:2: ()
            // InternalDTO.g:3129:3: 
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
    // InternalDTO.g:3137:1: rule__AttributeOption__Group_3__1 : rule__AttributeOption__Group_3__1__Impl rule__AttributeOption__Group_3__2 ;
    public final void rule__AttributeOption__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3141:1: ( rule__AttributeOption__Group_3__1__Impl rule__AttributeOption__Group_3__2 )
            // InternalDTO.g:3142:2: rule__AttributeOption__Group_3__1__Impl rule__AttributeOption__Group_3__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalDTO.g:3149:1: rule__AttributeOption__Group_3__1__Impl : ( 'reverse_cardinality' ) ;
    public final void rule__AttributeOption__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3153:1: ( ( 'reverse_cardinality' ) )
            // InternalDTO.g:3154:1: ( 'reverse_cardinality' )
            {
            // InternalDTO.g:3154:1: ( 'reverse_cardinality' )
            // InternalDTO.g:3155:2: 'reverse_cardinality'
            {
             before(grammarAccess.getAttributeOptionAccess().getReverse_cardinalityKeyword_3_1()); 
            match(input,46,FOLLOW_2); 
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
    // InternalDTO.g:3164:1: rule__AttributeOption__Group_3__2 : rule__AttributeOption__Group_3__2__Impl rule__AttributeOption__Group_3__3 ;
    public final void rule__AttributeOption__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3168:1: ( rule__AttributeOption__Group_3__2__Impl rule__AttributeOption__Group_3__3 )
            // InternalDTO.g:3169:2: rule__AttributeOption__Group_3__2__Impl rule__AttributeOption__Group_3__3
            {
            pushFollow(FOLLOW_43);
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
    // InternalDTO.g:3176:1: rule__AttributeOption__Group_3__2__Impl : ( '=' ) ;
    public final void rule__AttributeOption__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3180:1: ( ( '=' ) )
            // InternalDTO.g:3181:1: ( '=' )
            {
            // InternalDTO.g:3181:1: ( '=' )
            // InternalDTO.g:3182:2: '='
            {
             before(grammarAccess.getAttributeOptionAccess().getEqualsSignKeyword_3_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalDTO.g:3191:1: rule__AttributeOption__Group_3__3 : rule__AttributeOption__Group_3__3__Impl ;
    public final void rule__AttributeOption__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3195:1: ( rule__AttributeOption__Group_3__3__Impl )
            // InternalDTO.g:3196:2: rule__AttributeOption__Group_3__3__Impl
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
    // InternalDTO.g:3202:1: rule__AttributeOption__Group_3__3__Impl : ( ( rule__AttributeOption__CardAssignment_3_3 ) ) ;
    public final void rule__AttributeOption__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3206:1: ( ( ( rule__AttributeOption__CardAssignment_3_3 ) ) )
            // InternalDTO.g:3207:1: ( ( rule__AttributeOption__CardAssignment_3_3 ) )
            {
            // InternalDTO.g:3207:1: ( ( rule__AttributeOption__CardAssignment_3_3 ) )
            // InternalDTO.g:3208:2: ( rule__AttributeOption__CardAssignment_3_3 )
            {
             before(grammarAccess.getAttributeOptionAccess().getCardAssignment_3_3()); 
            // InternalDTO.g:3209:2: ( rule__AttributeOption__CardAssignment_3_3 )
            // InternalDTO.g:3209:3: rule__AttributeOption__CardAssignment_3_3
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
    // InternalDTO.g:3218:1: rule__StaticFieldSelection__Group__0 : rule__StaticFieldSelection__Group__0__Impl rule__StaticFieldSelection__Group__1 ;
    public final void rule__StaticFieldSelection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3222:1: ( rule__StaticFieldSelection__Group__0__Impl rule__StaticFieldSelection__Group__1 )
            // InternalDTO.g:3223:2: rule__StaticFieldSelection__Group__0__Impl rule__StaticFieldSelection__Group__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalDTO.g:3230:1: rule__StaticFieldSelection__Group__0__Impl : ( ( rule__StaticFieldSelection__ReceiverAssignment_0 ) ) ;
    public final void rule__StaticFieldSelection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3234:1: ( ( ( rule__StaticFieldSelection__ReceiverAssignment_0 ) ) )
            // InternalDTO.g:3235:1: ( ( rule__StaticFieldSelection__ReceiverAssignment_0 ) )
            {
            // InternalDTO.g:3235:1: ( ( rule__StaticFieldSelection__ReceiverAssignment_0 ) )
            // InternalDTO.g:3236:2: ( rule__StaticFieldSelection__ReceiverAssignment_0 )
            {
             before(grammarAccess.getStaticFieldSelectionAccess().getReceiverAssignment_0()); 
            // InternalDTO.g:3237:2: ( rule__StaticFieldSelection__ReceiverAssignment_0 )
            // InternalDTO.g:3237:3: rule__StaticFieldSelection__ReceiverAssignment_0
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
    // InternalDTO.g:3245:1: rule__StaticFieldSelection__Group__1 : rule__StaticFieldSelection__Group__1__Impl rule__StaticFieldSelection__Group__2 ;
    public final void rule__StaticFieldSelection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3249:1: ( rule__StaticFieldSelection__Group__1__Impl rule__StaticFieldSelection__Group__2 )
            // InternalDTO.g:3250:2: rule__StaticFieldSelection__Group__1__Impl rule__StaticFieldSelection__Group__2
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
    // InternalDTO.g:3257:1: rule__StaticFieldSelection__Group__1__Impl : ( '.' ) ;
    public final void rule__StaticFieldSelection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3261:1: ( ( '.' ) )
            // InternalDTO.g:3262:1: ( '.' )
            {
            // InternalDTO.g:3262:1: ( '.' )
            // InternalDTO.g:3263:2: '.'
            {
             before(grammarAccess.getStaticFieldSelectionAccess().getFullStopKeyword_1()); 
            match(input,47,FOLLOW_2); 
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
    // InternalDTO.g:3272:1: rule__StaticFieldSelection__Group__2 : rule__StaticFieldSelection__Group__2__Impl ;
    public final void rule__StaticFieldSelection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3276:1: ( rule__StaticFieldSelection__Group__2__Impl )
            // InternalDTO.g:3277:2: rule__StaticFieldSelection__Group__2__Impl
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
    // InternalDTO.g:3283:1: rule__StaticFieldSelection__Group__2__Impl : ( ( rule__StaticFieldSelection__MemberAssignment_2 ) ) ;
    public final void rule__StaticFieldSelection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3287:1: ( ( ( rule__StaticFieldSelection__MemberAssignment_2 ) ) )
            // InternalDTO.g:3288:1: ( ( rule__StaticFieldSelection__MemberAssignment_2 ) )
            {
            // InternalDTO.g:3288:1: ( ( rule__StaticFieldSelection__MemberAssignment_2 ) )
            // InternalDTO.g:3289:2: ( rule__StaticFieldSelection__MemberAssignment_2 )
            {
             before(grammarAccess.getStaticFieldSelectionAccess().getMemberAssignment_2()); 
            // InternalDTO.g:3290:2: ( rule__StaticFieldSelection__MemberAssignment_2 )
            // InternalDTO.g:3290:3: rule__StaticFieldSelection__MemberAssignment_2
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


    // $ANTLR start "rule__DTOModel__ConceptsAssignment"
    // InternalDTO.g:3299:1: rule__DTOModel__ConceptsAssignment : ( ruleConcept ) ;
    public final void rule__DTOModel__ConceptsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3303:1: ( ( ruleConcept ) )
            // InternalDTO.g:3304:2: ( ruleConcept )
            {
            // InternalDTO.g:3304:2: ( ruleConcept )
            // InternalDTO.g:3305:3: ruleConcept
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
    // InternalDTO.g:3314:1: rule__DTOClass__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DTOClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3318:1: ( ( RULE_ID ) )
            // InternalDTO.g:3319:2: ( RULE_ID )
            {
            // InternalDTO.g:3319:2: ( RULE_ID )
            // InternalDTO.g:3320:3: RULE_ID
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
    // InternalDTO.g:3329:1: rule__DTOClass__SuperTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__DTOClass__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3333:1: ( ( ( RULE_ID ) ) )
            // InternalDTO.g:3334:2: ( ( RULE_ID ) )
            {
            // InternalDTO.g:3334:2: ( ( RULE_ID ) )
            // InternalDTO.g:3335:3: ( RULE_ID )
            {
             before(grammarAccess.getDTOClassAccess().getSuperTypeDTOClassCrossReference_2_1_0()); 
            // InternalDTO.g:3336:3: ( RULE_ID )
            // InternalDTO.g:3337:4: RULE_ID
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
    // InternalDTO.g:3348:1: rule__DTOClass__AttributesAssignment_4 : ( ruleAttribute ) ;
    public final void rule__DTOClass__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3352:1: ( ( ruleAttribute ) )
            // InternalDTO.g:3353:2: ( ruleAttribute )
            {
            // InternalDTO.g:3353:2: ( ruleAttribute )
            // InternalDTO.g:3354:3: ruleAttribute
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
    // InternalDTO.g:3363:1: rule__Enum__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Enum__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3367:1: ( ( RULE_ID ) )
            // InternalDTO.g:3368:2: ( RULE_ID )
            {
            // InternalDTO.g:3368:2: ( RULE_ID )
            // InternalDTO.g:3369:3: RULE_ID
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
    // InternalDTO.g:3378:1: rule__Enum__AttributesAssignment_3 : ( ruleAttribute ) ;
    public final void rule__Enum__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3382:1: ( ( ruleAttribute ) )
            // InternalDTO.g:3383:2: ( ruleAttribute )
            {
            // InternalDTO.g:3383:2: ( ruleAttribute )
            // InternalDTO.g:3384:3: ruleAttribute
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
    // InternalDTO.g:3393:1: rule__Enum__LiteralsAssignment_4 : ( ruleEnumLiteral ) ;
    public final void rule__Enum__LiteralsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3397:1: ( ( ruleEnumLiteral ) )
            // InternalDTO.g:3398:2: ( ruleEnumLiteral )
            {
            // InternalDTO.g:3398:2: ( ruleEnumLiteral )
            // InternalDTO.g:3399:3: ruleEnumLiteral
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
    // InternalDTO.g:3408:1: rule__EnumLiteral__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumLiteral__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3412:1: ( ( RULE_ID ) )
            // InternalDTO.g:3413:2: ( RULE_ID )
            {
            // InternalDTO.g:3413:2: ( RULE_ID )
            // InternalDTO.g:3414:3: RULE_ID
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
    // InternalDTO.g:3423:1: rule__EnumLiteral__ParamsAssignment_1_1 : ( ruleConstant ) ;
    public final void rule__EnumLiteral__ParamsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3427:1: ( ( ruleConstant ) )
            // InternalDTO.g:3428:2: ( ruleConstant )
            {
            // InternalDTO.g:3428:2: ( ruleConstant )
            // InternalDTO.g:3429:3: ruleConstant
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
    // InternalDTO.g:3438:1: rule__EnumLiteral__ParamsAssignment_1_2_1 : ( ruleConstant ) ;
    public final void rule__EnumLiteral__ParamsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3442:1: ( ( ruleConstant ) )
            // InternalDTO.g:3443:2: ( ruleConstant )
            {
            // InternalDTO.g:3443:2: ( ruleConstant )
            // InternalDTO.g:3444:3: ruleConstant
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
    // InternalDTO.g:3453:1: rule__Constant__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Constant__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3457:1: ( ( RULE_INT ) )
            // InternalDTO.g:3458:2: ( RULE_INT )
            {
            // InternalDTO.g:3458:2: ( RULE_INT )
            // InternalDTO.g:3459:3: RULE_INT
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
    // InternalDTO.g:3468:1: rule__Constant__ValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Constant__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3472:1: ( ( RULE_INT ) )
            // InternalDTO.g:3473:2: ( RULE_INT )
            {
            // InternalDTO.g:3473:2: ( RULE_INT )
            // InternalDTO.g:3474:3: RULE_INT
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
    // InternalDTO.g:3483:1: rule__Constant__ValueAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Constant__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3487:1: ( ( RULE_STRING ) )
            // InternalDTO.g:3488:2: ( RULE_STRING )
            {
            // InternalDTO.g:3488:2: ( RULE_STRING )
            // InternalDTO.g:3489:3: RULE_STRING
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
    // InternalDTO.g:3498:1: rule__Constant__ValueAssignment_3_1 : ( ( rule__Constant__ValueAlternatives_3_1_0 ) ) ;
    public final void rule__Constant__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3502:1: ( ( ( rule__Constant__ValueAlternatives_3_1_0 ) ) )
            // InternalDTO.g:3503:2: ( ( rule__Constant__ValueAlternatives_3_1_0 ) )
            {
            // InternalDTO.g:3503:2: ( ( rule__Constant__ValueAlternatives_3_1_0 ) )
            // InternalDTO.g:3504:3: ( rule__Constant__ValueAlternatives_3_1_0 )
            {
             before(grammarAccess.getConstantAccess().getValueAlternatives_3_1_0()); 
            // InternalDTO.g:3505:3: ( rule__Constant__ValueAlternatives_3_1_0 )
            // InternalDTO.g:3505:4: rule__Constant__ValueAlternatives_3_1_0
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
    // InternalDTO.g:3513:1: rule__Constant__DayAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__Constant__DayAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3517:1: ( ( RULE_INT ) )
            // InternalDTO.g:3518:2: ( RULE_INT )
            {
            // InternalDTO.g:3518:2: ( RULE_INT )
            // InternalDTO.g:3519:3: RULE_INT
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
    // InternalDTO.g:3528:1: rule__Constant__MonthAssignment_4_3 : ( RULE_INT ) ;
    public final void rule__Constant__MonthAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3532:1: ( ( RULE_INT ) )
            // InternalDTO.g:3533:2: ( RULE_INT )
            {
            // InternalDTO.g:3533:2: ( RULE_INT )
            // InternalDTO.g:3534:3: RULE_INT
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
    // InternalDTO.g:3543:1: rule__Constant__YearAssignment_4_5 : ( RULE_INT ) ;
    public final void rule__Constant__YearAssignment_4_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3547:1: ( ( RULE_INT ) )
            // InternalDTO.g:3548:2: ( RULE_INT )
            {
            // InternalDTO.g:3548:2: ( RULE_INT )
            // InternalDTO.g:3549:3: RULE_INT
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
    // InternalDTO.g:3558:1: rule__EntityOption__DeleteByFlagAssignment_0_1 : ( ( 'deleteByFlag' ) ) ;
    public final void rule__EntityOption__DeleteByFlagAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3562:1: ( ( ( 'deleteByFlag' ) ) )
            // InternalDTO.g:3563:2: ( ( 'deleteByFlag' ) )
            {
            // InternalDTO.g:3563:2: ( ( 'deleteByFlag' ) )
            // InternalDTO.g:3564:3: ( 'deleteByFlag' )
            {
             before(grammarAccess.getEntityOptionAccess().getDeleteByFlagDeleteByFlagKeyword_0_1_0()); 
            // InternalDTO.g:3565:3: ( 'deleteByFlag' )
            // InternalDTO.g:3566:4: 'deleteByFlag'
            {
             before(grammarAccess.getEntityOptionAccess().getDeleteByFlagDeleteByFlagKeyword_0_1_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalDTO.g:3577:1: rule__EntityOption__InheritanceMappingAssignment_1_3 : ( ruleInheritanceMappingType ) ;
    public final void rule__EntityOption__InheritanceMappingAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3581:1: ( ( ruleInheritanceMappingType ) )
            // InternalDTO.g:3582:2: ( ruleInheritanceMappingType )
            {
            // InternalDTO.g:3582:2: ( ruleInheritanceMappingType )
            // InternalDTO.g:3583:3: ruleInheritanceMappingType
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
    // InternalDTO.g:3592:1: rule__InheritanceMappingType__TypeAssignment : ( ( rule__InheritanceMappingType__TypeAlternatives_0 ) ) ;
    public final void rule__InheritanceMappingType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3596:1: ( ( ( rule__InheritanceMappingType__TypeAlternatives_0 ) ) )
            // InternalDTO.g:3597:2: ( ( rule__InheritanceMappingType__TypeAlternatives_0 ) )
            {
            // InternalDTO.g:3597:2: ( ( rule__InheritanceMappingType__TypeAlternatives_0 ) )
            // InternalDTO.g:3598:3: ( rule__InheritanceMappingType__TypeAlternatives_0 )
            {
             before(grammarAccess.getInheritanceMappingTypeAccess().getTypeAlternatives_0()); 
            // InternalDTO.g:3599:3: ( rule__InheritanceMappingType__TypeAlternatives_0 )
            // InternalDTO.g:3599:4: rule__InheritanceMappingType__TypeAlternatives_0
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
    // InternalDTO.g:3607:1: rule__Attribute__TypeAssignment_0 : ( ruleAttributeType ) ;
    public final void rule__Attribute__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3611:1: ( ( ruleAttributeType ) )
            // InternalDTO.g:3612:2: ( ruleAttributeType )
            {
            // InternalDTO.g:3612:2: ( ruleAttributeType )
            // InternalDTO.g:3613:3: ruleAttributeType
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
    // InternalDTO.g:3622:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3626:1: ( ( RULE_ID ) )
            // InternalDTO.g:3627:2: ( RULE_ID )
            {
            // InternalDTO.g:3627:2: ( RULE_ID )
            // InternalDTO.g:3628:3: RULE_ID
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
    // InternalDTO.g:3637:1: rule__Attribute__OptionsAssignment_2_0 : ( ruleAttributeOption ) ;
    public final void rule__Attribute__OptionsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3641:1: ( ( ruleAttributeOption ) )
            // InternalDTO.g:3642:2: ( ruleAttributeOption )
            {
            // InternalDTO.g:3642:2: ( ruleAttributeOption )
            // InternalDTO.g:3643:3: ruleAttributeOption
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
    // InternalDTO.g:3652:1: rule__Attribute__OptionsAssignment_2_1_1 : ( ruleAttributeOption ) ;
    public final void rule__Attribute__OptionsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3656:1: ( ( ruleAttributeOption ) )
            // InternalDTO.g:3657:2: ( ruleAttributeOption )
            {
            // InternalDTO.g:3657:2: ( ruleAttributeOption )
            // InternalDTO.g:3658:3: ruleAttributeOption
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
    // InternalDTO.g:3667:1: rule__RefType__ReferenceAssignment : ( ( RULE_ID ) ) ;
    public final void rule__RefType__ReferenceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3671:1: ( ( ( RULE_ID ) ) )
            // InternalDTO.g:3672:2: ( ( RULE_ID ) )
            {
            // InternalDTO.g:3672:2: ( ( RULE_ID ) )
            // InternalDTO.g:3673:3: ( RULE_ID )
            {
             before(grammarAccess.getRefTypeAccess().getReferenceConceptCrossReference_0()); 
            // InternalDTO.g:3674:3: ( RULE_ID )
            // InternalDTO.g:3675:4: RULE_ID
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
    // InternalDTO.g:3686:1: rule__CollectionType__OfTypeAssignment_2 : ( ruleSingleType ) ;
    public final void rule__CollectionType__OfTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3690:1: ( ( ruleSingleType ) )
            // InternalDTO.g:3691:2: ( ruleSingleType )
            {
            // InternalDTO.g:3691:2: ( ruleSingleType )
            // InternalDTO.g:3692:3: ruleSingleType
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
    // InternalDTO.g:3701:1: rule__AttributeOption__RequiredAssignment_0_1 : ( ( 'required' ) ) ;
    public final void rule__AttributeOption__RequiredAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3705:1: ( ( ( 'required' ) ) )
            // InternalDTO.g:3706:2: ( ( 'required' ) )
            {
            // InternalDTO.g:3706:2: ( ( 'required' ) )
            // InternalDTO.g:3707:3: ( 'required' )
            {
             before(grammarAccess.getAttributeOptionAccess().getRequiredRequiredKeyword_0_1_0()); 
            // InternalDTO.g:3708:3: ( 'required' )
            // InternalDTO.g:3709:4: 'required'
            {
             before(grammarAccess.getAttributeOptionAccess().getRequiredRequiredKeyword_0_1_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalDTO.g:3720:1: rule__AttributeOption__PartOfAssignment_1_1 : ( ( 'partOf' ) ) ;
    public final void rule__AttributeOption__PartOfAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3724:1: ( ( ( 'partOf' ) ) )
            // InternalDTO.g:3725:2: ( ( 'partOf' ) )
            {
            // InternalDTO.g:3725:2: ( ( 'partOf' ) )
            // InternalDTO.g:3726:3: ( 'partOf' )
            {
             before(grammarAccess.getAttributeOptionAccess().getPartOfPartOfKeyword_1_1_0()); 
            // InternalDTO.g:3727:3: ( 'partOf' )
            // InternalDTO.g:3728:4: 'partOf'
            {
             before(grammarAccess.getAttributeOptionAccess().getPartOfPartOfKeyword_1_1_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalDTO.g:3739:1: rule__AttributeOption__RelationshipOwnerAssignment_2_3 : ( ruleStaticFieldSelection ) ;
    public final void rule__AttributeOption__RelationshipOwnerAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3743:1: ( ( ruleStaticFieldSelection ) )
            // InternalDTO.g:3744:2: ( ruleStaticFieldSelection )
            {
            // InternalDTO.g:3744:2: ( ruleStaticFieldSelection )
            // InternalDTO.g:3745:3: ruleStaticFieldSelection
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
    // InternalDTO.g:3754:1: rule__AttributeOption__CardAssignment_3_3 : ( ruleCardinalityType ) ;
    public final void rule__AttributeOption__CardAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3758:1: ( ( ruleCardinalityType ) )
            // InternalDTO.g:3759:2: ( ruleCardinalityType )
            {
            // InternalDTO.g:3759:2: ( ruleCardinalityType )
            // InternalDTO.g:3760:3: ruleCardinalityType
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
    // InternalDTO.g:3769:1: rule__StaticFieldSelection__ReceiverAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__StaticFieldSelection__ReceiverAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3773:1: ( ( ( RULE_ID ) ) )
            // InternalDTO.g:3774:2: ( ( RULE_ID ) )
            {
            // InternalDTO.g:3774:2: ( ( RULE_ID ) )
            // InternalDTO.g:3775:3: ( RULE_ID )
            {
             before(grammarAccess.getStaticFieldSelectionAccess().getReceiverEntityCrossReference_0_0()); 
            // InternalDTO.g:3776:3: ( RULE_ID )
            // InternalDTO.g:3777:4: RULE_ID
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
    // InternalDTO.g:3788:1: rule__StaticFieldSelection__MemberAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__StaticFieldSelection__MemberAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDTO.g:3792:1: ( ( ( RULE_ID ) ) )
            // InternalDTO.g:3793:2: ( ( RULE_ID ) )
            {
            // InternalDTO.g:3793:2: ( ( RULE_ID ) )
            // InternalDTO.g:3794:3: ( RULE_ID )
            {
             before(grammarAccess.getStaticFieldSelectionAccess().getMemberAttributeCrossReference_2_0()); 
            // InternalDTO.g:3795:3: ( RULE_ID )
            // InternalDTO.g:3796:4: RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000008040002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000007E007D00010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000007E007C00012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000003E007C00000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000007E007C00010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000200001860L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0006601000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0006600000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000003E000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000003E007C00010L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000800000000000L});

}
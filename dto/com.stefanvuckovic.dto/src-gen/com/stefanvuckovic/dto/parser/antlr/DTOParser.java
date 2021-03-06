/*
 * generated by Xtext 2.10.0
 */
package com.stefanvuckovic.dto.parser.antlr;

import com.google.inject.Inject;
import com.stefanvuckovic.dto.parser.antlr.internal.InternalDTOParser;
import com.stefanvuckovic.dto.services.DTOGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class DTOParser extends AbstractAntlrParser {

	@Inject
	private DTOGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalDTOParser createParser(XtextTokenStream stream) {
		return new InternalDTOParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "DTOModel";
	}

	public DTOGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DTOGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

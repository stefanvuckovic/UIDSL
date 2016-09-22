/*
 * generated by Xtext 2.10.0
 */
package com.stefanvuckovic.uidsl.parser.antlr;

import com.google.inject.Inject;
import com.stefanvuckovic.uidsl.parser.antlr.internal.InternalUIDSLParser;
import com.stefanvuckovic.uidsl.services.UIDSLGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class UIDSLParser extends AbstractAntlrParser {

	@Inject
	private UIDSLGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalUIDSLParser createParser(XtextTokenStream stream) {
		return new InternalUIDSLParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "UIModel";
	}

	public UIDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(UIDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
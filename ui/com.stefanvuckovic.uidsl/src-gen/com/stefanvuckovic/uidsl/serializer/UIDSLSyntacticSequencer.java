/*
 * generated by Xtext 2.10.0
 */
package com.stefanvuckovic.uidsl.serializer;

import com.google.inject.Inject;
import com.stefanvuckovic.uidsl.services.UIDSLGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class UIDSLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected UIDSLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_UIComponentInstance___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (UIDSLGrammarAccess) access;
		match_UIComponentInstance___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getUIComponentInstanceAccess().getLeftCurlyBracketKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getUIComponentInstanceAccess().getRightCurlyBracketKeyword_4_2()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_UIComponentInstance___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q.equals(syntax))
				emit_UIComponentInstance___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     component=[UIComponent|ID] (ambiguity) (rule end)
	 *     properties+=PropertyValueInstance (ambiguity) (rule end)
	 */
	protected void emit_UIComponentInstance___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}

/*
 * generated by Xtext 2.10.0
 */
package com.stefanvuckovic.domainToDto.ide.contentassist.antlr;

import com.google.inject.Inject;
import com.stefanvuckovic.domainToDto.ide.contentassist.antlr.internal.InternalDomainToDTOParser;
import com.stefanvuckovic.domainToDto.services.DomainToDTOGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class DomainToDTOParser extends AbstractContentAssistParser {

	@Inject
	private DomainToDTOGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalDomainToDTOParser createParser() {
		InternalDomainToDTOParser result = new InternalDomainToDTOParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getExpressionAccess().getAlternatives(), "rule__Expression__Alternatives");
					put(grammarAccess.getMapperAccess().getGroup(), "rule__Mapper__Group__0");
					put(grammarAccess.getMappedAttributeAccess().getGroup(), "rule__MappedAttribute__Group__0");
					put(grammarAccess.getMemberSelectionExpressionAccess().getGroup(), "rule__MemberSelectionExpression__Group__0");
					put(grammarAccess.getMemberSelectionExpressionAccess().getGroup_1(), "rule__MemberSelectionExpression__Group_1__0");
					put(grammarAccess.getEntityMappingExpressionAccess().getGroup(), "rule__EntityMappingExpression__Group__0");
					put(grammarAccess.getAtomExpressionAccess().getGroup(), "rule__AtomExpression__Group__0");
					put(grammarAccess.getMappingModelAccess().getMappersAssignment(), "rule__MappingModel__MappersAssignment");
					put(grammarAccess.getMapperAccess().getNameAssignment_1(), "rule__Mapper__NameAssignment_1");
					put(grammarAccess.getMapperAccess().getDtoAssignment_3(), "rule__Mapper__DtoAssignment_3");
					put(grammarAccess.getMapperAccess().getAttributesAssignment_5(), "rule__Mapper__AttributesAssignment_5");
					put(grammarAccess.getMappedAttributeAccess().getAttrAssignment_0(), "rule__MappedAttribute__AttrAssignment_0");
					put(grammarAccess.getMappedAttributeAccess().getMappingAssignment_2(), "rule__MappedAttribute__MappingAssignment_2");
					put(grammarAccess.getMemberSelectionExpressionAccess().getMemberAssignment_1_2(), "rule__MemberSelectionExpression__MemberAssignment_1_2");
					put(grammarAccess.getEntityMappingExpressionAccess().getMappedEntityAssignment_2(), "rule__EntityMappingExpression__MappedEntityAssignment_2");
					put(grammarAccess.getEntityMappingExpressionAccess().getMapperAssignment_4(), "rule__EntityMappingExpression__MapperAssignment_4");
					put(grammarAccess.getAtomExpressionAccess().getReferenceAssignment_1(), "rule__AtomExpression__ReferenceAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalDomainToDTOParser typedParser = (InternalDomainToDTOParser) parser;
			typedParser.entryRuleMappingModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public DomainToDTOGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DomainToDTOGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

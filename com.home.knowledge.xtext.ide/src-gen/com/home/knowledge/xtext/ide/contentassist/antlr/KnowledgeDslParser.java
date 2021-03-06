/*
 * generated by Xtext 2.10.0
 */
package com.home.knowledge.xtext.ide.contentassist.antlr;

import com.google.inject.Inject;
import com.home.knowledge.xtext.ide.contentassist.antlr.internal.InternalKnowledgeDslParser;
import com.home.knowledge.xtext.services.KnowledgeDslGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class KnowledgeDslParser extends AbstractContentAssistParser {

	@Inject
	private KnowledgeDslGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalKnowledgeDslParser createParser() {
		InternalKnowledgeDslParser result = new InternalKnowledgeDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getOrganisationAccess().getGroup(), "rule__Organisation__Group__0");
					put(grammarAccess.getOrganisationAccess().getGroup_4(), "rule__Organisation__Group_4__0");
					put(grammarAccess.getOrganisationAccess().getGroup_5(), "rule__Organisation__Group_5__0");
					put(grammarAccess.getOrganisationAccess().getGroup_5_3(), "rule__Organisation__Group_5_3__0");
					put(grammarAccess.getExperienceAccess().getGroup(), "rule__Experience__Group__0");
					put(grammarAccess.getExperienceAccess().getGroup_3(), "rule__Experience__Group_3__0");
					put(grammarAccess.getExperienceAccess().getGroup_3_3(), "rule__Experience__Group_3_3__0");
					put(grammarAccess.getExperienceAccess().getGroup_7(), "rule__Experience__Group_7__0");
					put(grammarAccess.getProblemAccess().getGroup(), "rule__Problem__Group__0");
					put(grammarAccess.getProblemAccess().getGroup_6(), "rule__Problem__Group_6__0");
					put(grammarAccess.getSolutionAccess().getGroup(), "rule__Solution__Group__0");
					put(grammarAccess.getSolutionAccess().getGroup_4(), "rule__Solution__Group_4__0");
					put(grammarAccess.getOrganisationAccess().getNameAssignment_2(), "rule__Organisation__NameAssignment_2");
					put(grammarAccess.getOrganisationAccess().getCurrentProblemAssignment_4_1(), "rule__Organisation__CurrentProblemAssignment_4_1");
					put(grammarAccess.getOrganisationAccess().getExperiencesAssignment_5_2(), "rule__Organisation__ExperiencesAssignment_5_2");
					put(grammarAccess.getOrganisationAccess().getExperiencesAssignment_5_3_1(), "rule__Organisation__ExperiencesAssignment_5_3_1");
					put(grammarAccess.getExperienceAccess().getNameAssignment_1(), "rule__Experience__NameAssignment_1");
					put(grammarAccess.getExperienceAccess().getProblemsAssignment_3_2(), "rule__Experience__ProblemsAssignment_3_2");
					put(grammarAccess.getExperienceAccess().getProblemsAssignment_3_3_1(), "rule__Experience__ProblemsAssignment_3_3_1");
					put(grammarAccess.getExperienceAccess().getSolutionsAssignment_6(), "rule__Experience__SolutionsAssignment_6");
					put(grammarAccess.getExperienceAccess().getSolutionsAssignment_7_1(), "rule__Experience__SolutionsAssignment_7_1");
					put(grammarAccess.getProblemAccess().getNameAssignment_1(), "rule__Problem__NameAssignment_1");
					put(grammarAccess.getProblemAccess().getSolutionsAssignment_5(), "rule__Problem__SolutionsAssignment_5");
					put(grammarAccess.getProblemAccess().getSolutionsAssignment_6_1(), "rule__Problem__SolutionsAssignment_6_1");
					put(grammarAccess.getSolutionAccess().getNameAssignment_2(), "rule__Solution__NameAssignment_2");
					put(grammarAccess.getSolutionAccess().getDescriptionAssignment_4_1(), "rule__Solution__DescriptionAssignment_4_1");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalKnowledgeDslParser typedParser = (InternalKnowledgeDslParser) parser;
			typedParser.entryRuleOrganisation();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public KnowledgeDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(KnowledgeDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

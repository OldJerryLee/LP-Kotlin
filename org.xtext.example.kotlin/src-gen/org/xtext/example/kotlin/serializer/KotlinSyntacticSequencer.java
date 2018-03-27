/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.kotlin.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.kotlin.services.KotlinGrammarAccess;

@SuppressWarnings("all")
public class KotlinSyntacticSequencer extends AbstractSyntacticSequencer {

	protected KotlinGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Condition_ElseKeyword_1_3_or_TEXTTerminalRuleCall_1_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (KotlinGrammarAccess) access;
		match_Condition_ElseKeyword_1_3_or_TEXTTerminalRuleCall_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getConditionAccess().getElseKeyword_1_3()), new TokenAlias(false, false, grammarAccess.getConditionAccess().getTEXTTerminalRuleCall_1_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getTEXTRule())
			return getTEXTToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal TEXT:
	 * 	'"' -> '"'
	 * ;
	 */
	protected String getTEXTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Condition_ElseKeyword_1_3_or_TEXTTerminalRuleCall_1_1.equals(syntax))
				emit_Condition_ElseKeyword_1_3_or_TEXTTerminalRuleCall_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     TEXT | 'else'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_Condition_ElseKeyword_1_3_or_TEXTTerminalRuleCall_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}

/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.kotlin.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.kotlin.kotlin.Argument;
import org.xtext.example.kotlin.kotlin.Condition;
import org.xtext.example.kotlin.kotlin.KotlinPackage;
import org.xtext.example.kotlin.kotlin.Model;
import org.xtext.example.kotlin.kotlin.When;
import org.xtext.example.kotlin.services.KotlinGrammarAccess;

@SuppressWarnings("all")
public class KotlinSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private KotlinGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == KotlinPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case KotlinPackage.ARGUMENT:
				sequence_Argument(context, (Argument) semanticObject); 
				return; 
			case KotlinPackage.CONDITION:
				sequence_Condition(context, (Condition) semanticObject); 
				return; 
			case KotlinPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case KotlinPackage.WHEN:
				sequence_When(context, (When) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Argument returns Argument
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Argument(ISerializationContext context, Argument semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, KotlinPackage.Literals.ARGUMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, KotlinPackage.Literals.ARGUMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getArgumentAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Condition returns Condition
	 *
	 * Constraint:
	 *     (value=INT | (conditional=Conditional type=Type))?
	 */
	protected void sequence_Condition(ISerializationContext context, Condition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     when=When
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, KotlinPackage.Literals.MODEL__WHEN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, KotlinPackage.Literals.MODEL__WHEN));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getModelAccess().getWhenWhenParserRuleCall_0(), semanticObject.getWhen());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     When returns When
	 *
	 * Constraint:
	 *     (name=ID condition=Condition output=Output?)
	 */
	protected void sequence_When(ISerializationContext context, When semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}

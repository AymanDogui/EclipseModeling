/*
 * generated by Xtext 2.10.0
 */
package com.home.rh.xtext.serializer;

import com.google.inject.Inject;
import com.home.rh.xtext.rhDsl.Company;
import com.home.rh.xtext.rhDsl.Employee;
import com.home.rh.xtext.rhDsl.Project;
import com.home.rh.xtext.rhDsl.RhDslPackage;
import com.home.rh.xtext.rhDsl.Task;
import com.home.rh.xtext.services.RhDslGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;

@SuppressWarnings("all")
public class RhDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RhDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == RhDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case RhDslPackage.COMPANY:
				sequence_Company(context, (Company) semanticObject); 
				return; 
			case RhDslPackage.EMPLOYEE:
				sequence_Employee(context, (Employee) semanticObject); 
				return; 
			case RhDslPackage.PROJECT:
				sequence_Project(context, (Project) semanticObject); 
				return; 
			case RhDslPackage.TASK:
				sequence_Task(context, (Task) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Company returns Company
	 *
	 * Constraint:
	 *     (name=ID employees+=Employee* projects+=Project*)
	 */
	protected void sequence_Company(ISerializationContext context, Company semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Employee returns Employee
	 *
	 * Constraint:
	 *     (name=ID weight=INT? height=INT?)
	 */
	protected void sequence_Employee(ISerializationContext context, Employee semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Project returns Project
	 *
	 * Constraint:
	 *     (name=ID type=STRING tasks+=Task*)
	 */
	protected void sequence_Project(ISerializationContext context, Project semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Task returns Task
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         responsable=[Employee|ID] 
	 *         description=STRING 
	 *         startDate=DATE 
	 *         duration=INT 
	 *         durationType=DurationType 
	 *         subtasks+=Task*
	 *     )
	 */
	protected void sequence_Task(ISerializationContext context, Task semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}

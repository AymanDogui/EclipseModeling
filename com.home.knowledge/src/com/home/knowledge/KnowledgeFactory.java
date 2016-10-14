package com.home.knowledge;

import com.home.knowledge.impl.KnowledgeFactoryImpl;

/** This factory  overrides the generated factory and returns the new generated interfaces */
public interface KnowledgeFactory extends MKnowledgeFactory 
{
	
	/** Specialize the eINSTANCE initialization with the new interface type 
	  * (overridden in the override_factory extension)
	*/
	KnowledgeFactory eINSTANCE = KnowledgeFactoryImpl.init();
				
	public Experience createExperience();
	public Problem createProblem();
	public Solution createSolution();
	public Organisation createOrganisation();
}

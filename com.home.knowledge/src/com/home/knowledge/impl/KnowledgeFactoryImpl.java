package com.home.knowledge.impl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.home.knowledge.Experience;
import com.home.knowledge.Problem;
import com.home.knowledge.Solution;
import com.home.knowledge.Organisation;
import com.home.knowledge.KnowledgeFactory;


// This factory  overrides the generated factory and returns the new generated interfaces
public class KnowledgeFactoryImpl extends MKnowledgeFactoryImpl implements KnowledgeFactory
{
	
	public static KnowledgeFactory init() {
		
		try {
			Object fact = MKnowledgeFactoryImpl.init();
			if ((fact != null) && (fact instanceof KnowledgeFactory))
					return (KnowledgeFactory) fact;
			}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new KnowledgeFactoryImpl(); 
		 }
	
	public Experience createExperience()
	{
		Experience result = new ExperienceImpl();
		return result;
	}
	public Problem createProblem()
	{
		Problem result = new ProblemImpl();
		return result;
	}
	public Solution createSolution()
	{
		Solution result = new SolutionImpl();
		return result;
	}
	public Organisation createOrganisation()
	{
		Organisation result = new OrganisationImpl();
		return result;
	}
}

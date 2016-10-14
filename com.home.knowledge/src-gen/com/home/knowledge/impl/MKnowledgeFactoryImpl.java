/**
 */
package com.home.knowledge.impl;

import com.home.knowledge.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.home.knowledge.MExperience;
import com.home.knowledge.MKnowledgeFactory;
import com.home.knowledge.MKnowledgePackage;
import com.home.knowledge.MOrganisation;
import com.home.knowledge.MProblem;
import com.home.knowledge.MSolution;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MKnowledgeFactoryImpl extends EFactoryImpl implements MKnowledgeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MKnowledgeFactory init() {
		try {
			MKnowledgeFactory theKnowledgeFactory = (MKnowledgeFactory)EPackage.Registry.INSTANCE.getEFactory(MKnowledgePackage.eNS_URI);
			if (theKnowledgeFactory != null) {
				return theKnowledgeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MKnowledgeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MKnowledgeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MKnowledgePackage.EXPERIENCE: return createExperience();
			case MKnowledgePackage.PROBLEM: return createProblem();
			case MKnowledgePackage.SOLUTION: return createSolution();
			case MKnowledgePackage.ORGANISATION: return createOrganisation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MExperience createExperience() {
		MExperienceImpl experience = new MExperienceImpl();
		return experience;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MProblem createProblem() {
		MProblemImpl problem = new MProblemImpl();
		return problem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSolution createSolution() {
		MSolutionImpl solution = new MSolutionImpl();
		return solution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MOrganisation createOrganisation() {
		MOrganisationImpl organisation = new MOrganisationImpl();
		return organisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MKnowledgePackage getKnowledgePackage() {
		return (MKnowledgePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MKnowledgePackage getPackage() {
		return MKnowledgePackage.eINSTANCE;
	}

} //MKnowledgeFactoryImpl

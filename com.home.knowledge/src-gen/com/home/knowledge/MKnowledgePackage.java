/**
 */
package com.home.knowledge;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.home.knowledge.MKnowledgeFactory
 * @model kind="package"
 * @generated
 */
public interface MKnowledgePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "knowledge";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.home.knowledge/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "knowledge";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MKnowledgePackage eINSTANCE = com.home.knowledge.impl.MKnowledgePackageImpl.init();

	/**
	 * The meta object id for the '{@link com.home.knowledge.impl.MExperienceImpl <em>Experience</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.home.knowledge.impl.MExperienceImpl
	 * @see com.home.knowledge.impl.MKnowledgePackageImpl#getExperience()
	 * @generated
	 */
	int EXPERIENCE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIENCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Problems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIENCE__PROBLEMS = 1;

	/**
	 * The feature id for the '<em><b>Solutions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIENCE__SOLUTIONS = 2;

	/**
	 * The number of structural features of the '<em>Experience</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIENCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Experience</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.home.knowledge.impl.MProblemImpl <em>Problem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.home.knowledge.impl.MProblemImpl
	 * @see com.home.knowledge.impl.MKnowledgePackageImpl#getProblem()
	 * @generated
	 */
	int PROBLEM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Solutions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM__SOLUTIONS = 1;

	/**
	 * The feature id for the '<em><b>Parent Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM__PARENT_EXP = 2;

	/**
	 * The number of structural features of the '<em>Problem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Problem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.home.knowledge.impl.MSolutionImpl <em>Solution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.home.knowledge.impl.MSolutionImpl
	 * @see com.home.knowledge.impl.MKnowledgePackageImpl#getSolution()
	 * @generated
	 */
	int SOLUTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.home.knowledge.impl.MOrganisationImpl <em>Organisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.home.knowledge.impl.MOrganisationImpl
	 * @see com.home.knowledge.impl.MKnowledgePackageImpl#getOrganisation()
	 * @generated
	 */
	int ORGANISATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Experiences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__EXPERIENCES = 1;

	/**
	 * The feature id for the '<em><b>Current Problem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__CURRENT_PROBLEM = 2;

	/**
	 * The number of structural features of the '<em>Organisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Find Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___FIND_SOLUTION__MPROBLEM = 0;

	/**
	 * The number of operations of the '<em>Organisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_OPERATION_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link com.home.knowledge.MExperience <em>Experience</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experience</em>'.
	 * @see com.home.knowledge.MExperience
	 * @generated
	 */
	EClass getExperience();

	/**
	 * Returns the meta object for the attribute '{@link com.home.knowledge.MExperience#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.home.knowledge.MExperience#getName()
	 * @see #getExperience()
	 * @generated
	 */
	EAttribute getExperience_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.home.knowledge.MExperience#getProblems <em>Problems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Problems</em>'.
	 * @see com.home.knowledge.MExperience#getProblems()
	 * @see #getExperience()
	 * @generated
	 */
	EReference getExperience_Problems();

	/**
	 * Returns the meta object for the containment reference list '{@link com.home.knowledge.MExperience#getSolutions <em>Solutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Solutions</em>'.
	 * @see com.home.knowledge.MExperience#getSolutions()
	 * @see #getExperience()
	 * @generated
	 */
	EReference getExperience_Solutions();

	/**
	 * Returns the meta object for class '{@link com.home.knowledge.MProblem <em>Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Problem</em>'.
	 * @see com.home.knowledge.MProblem
	 * @generated
	 */
	EClass getProblem();

	/**
	 * Returns the meta object for the attribute '{@link com.home.knowledge.MProblem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.home.knowledge.MProblem#getName()
	 * @see #getProblem()
	 * @generated
	 */
	EAttribute getProblem_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.home.knowledge.MProblem#getSolutions <em>Solutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Solutions</em>'.
	 * @see com.home.knowledge.MProblem#getSolutions()
	 * @see #getProblem()
	 * @generated
	 */
	EReference getProblem_Solutions();

	/**
	 * Returns the meta object for the container reference '{@link com.home.knowledge.MProblem#getParentExp <em>Parent Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Exp</em>'.
	 * @see com.home.knowledge.MProblem#getParentExp()
	 * @see #getProblem()
	 * @generated
	 */
	EReference getProblem_ParentExp();

	/**
	 * Returns the meta object for class '{@link com.home.knowledge.MSolution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution</em>'.
	 * @see com.home.knowledge.MSolution
	 * @generated
	 */
	EClass getSolution();

	/**
	 * Returns the meta object for the attribute '{@link com.home.knowledge.MSolution#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.home.knowledge.MSolution#getName()
	 * @see #getSolution()
	 * @generated
	 */
	EAttribute getSolution_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.home.knowledge.MSolution#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.home.knowledge.MSolution#getDescription()
	 * @see #getSolution()
	 * @generated
	 */
	EAttribute getSolution_Description();

	/**
	 * Returns the meta object for class '{@link com.home.knowledge.MOrganisation <em>Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organisation</em>'.
	 * @see com.home.knowledge.MOrganisation
	 * @generated
	 */
	EClass getOrganisation();

	/**
	 * Returns the meta object for the attribute '{@link com.home.knowledge.MOrganisation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.home.knowledge.MOrganisation#getName()
	 * @see #getOrganisation()
	 * @generated
	 */
	EAttribute getOrganisation_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.home.knowledge.MOrganisation#getExperiences <em>Experiences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Experiences</em>'.
	 * @see com.home.knowledge.MOrganisation#getExperiences()
	 * @see #getOrganisation()
	 * @generated
	 */
	EReference getOrganisation_Experiences();

	/**
	 * Returns the meta object for the reference '{@link com.home.knowledge.MOrganisation#getCurrentProblem <em>Current Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Problem</em>'.
	 * @see com.home.knowledge.MOrganisation#getCurrentProblem()
	 * @see #getOrganisation()
	 * @generated
	 */
	EReference getOrganisation_CurrentProblem();

	/**
	 * Returns the meta object for the '{@link com.home.knowledge.MOrganisation#findSolution(com.home.knowledge.MProblem) <em>Find Solution</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Solution</em>' operation.
	 * @see com.home.knowledge.MOrganisation#findSolution(com.home.knowledge.MProblem)
	 * @generated
	 */
	EOperation getOrganisation__FindSolution__MProblem();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MKnowledgeFactory getKnowledgeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.home.knowledge.impl.MExperienceImpl <em>Experience</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.home.knowledge.impl.MExperienceImpl
		 * @see com.home.knowledge.impl.MKnowledgePackageImpl#getExperience()
		 * @generated
		 */
		EClass EXPERIENCE = eINSTANCE.getExperience();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIENCE__NAME = eINSTANCE.getExperience_Name();

		/**
		 * The meta object literal for the '<em><b>Problems</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIENCE__PROBLEMS = eINSTANCE.getExperience_Problems();

		/**
		 * The meta object literal for the '<em><b>Solutions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIENCE__SOLUTIONS = eINSTANCE.getExperience_Solutions();

		/**
		 * The meta object literal for the '{@link com.home.knowledge.impl.MProblemImpl <em>Problem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.home.knowledge.impl.MProblemImpl
		 * @see com.home.knowledge.impl.MKnowledgePackageImpl#getProblem()
		 * @generated
		 */
		EClass PROBLEM = eINSTANCE.getProblem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROBLEM__NAME = eINSTANCE.getProblem_Name();

		/**
		 * The meta object literal for the '<em><b>Solutions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBLEM__SOLUTIONS = eINSTANCE.getProblem_Solutions();

		/**
		 * The meta object literal for the '<em><b>Parent Exp</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBLEM__PARENT_EXP = eINSTANCE.getProblem_ParentExp();

		/**
		 * The meta object literal for the '{@link com.home.knowledge.impl.MSolutionImpl <em>Solution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.home.knowledge.impl.MSolutionImpl
		 * @see com.home.knowledge.impl.MKnowledgePackageImpl#getSolution()
		 * @generated
		 */
		EClass SOLUTION = eINSTANCE.getSolution();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLUTION__NAME = eINSTANCE.getSolution_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLUTION__DESCRIPTION = eINSTANCE.getSolution_Description();

		/**
		 * The meta object literal for the '{@link com.home.knowledge.impl.MOrganisationImpl <em>Organisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.home.knowledge.impl.MOrganisationImpl
		 * @see com.home.knowledge.impl.MKnowledgePackageImpl#getOrganisation()
		 * @generated
		 */
		EClass ORGANISATION = eINSTANCE.getOrganisation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANISATION__NAME = eINSTANCE.getOrganisation_Name();

		/**
		 * The meta object literal for the '<em><b>Experiences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANISATION__EXPERIENCES = eINSTANCE.getOrganisation_Experiences();

		/**
		 * The meta object literal for the '<em><b>Current Problem</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANISATION__CURRENT_PROBLEM = eINSTANCE.getOrganisation_CurrentProblem();

		/**
		 * The meta object literal for the '<em><b>Find Solution</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ORGANISATION___FIND_SOLUTION__MPROBLEM = eINSTANCE.getOrganisation__FindSolution__MProblem();

	}

} //MKnowledgePackage

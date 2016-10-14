/**
 */
package com.home.knowledge;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.home.knowledge.MOrganisation#getName <em>Name</em>}</li>
 *   <li>{@link com.home.knowledge.MOrganisation#getExperiences <em>Experiences</em>}</li>
 *   <li>{@link com.home.knowledge.MOrganisation#getCurrentProblem <em>Current Problem</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.home.knowledge.MKnowledgePackage#getOrganisation()
 * @model
 * @generated
 */
public interface MOrganisation extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.home.knowledge.MKnowledgePackage#getOrganisation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.home.knowledge.MOrganisation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Experiences</b></em>' containment reference list.

	 
	 * The list contents are of type {@link com.home.knowledge.MExperience}. 
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Experiences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Experiences</em>' containment reference list.
	 * @see com.home.knowledge.MKnowledgePackage#getOrganisation_Experiences()
	 * @model containment="true"
	 * @generated
	 */
	List<Experience> getExperiences();

	/**
	 * Returns the value of the '<em><b>Current Problem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Problem</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Problem</em>' reference.
	 * @see #setCurrentProblem(MProblem)
	 * @see com.home.knowledge.MKnowledgePackage#getOrganisation_CurrentProblem()
	 * @model
	 * @generated
	 */
	Problem getCurrentProblem();

	/**
	 * Sets the value of the '{@link com.home.knowledge.MOrganisation#getCurrentProblem <em>Current Problem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Problem</em>' reference.
	 * @see #getCurrentProblem()
	 * @generated
	 */
	void setCurrentProblem(Problem value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Solution findSolution(Problem problem);

} // MOrganisation

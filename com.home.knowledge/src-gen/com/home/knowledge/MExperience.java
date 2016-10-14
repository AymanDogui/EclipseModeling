/**
 */
package com.home.knowledge;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Experience</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.home.knowledge.MExperience#getName <em>Name</em>}</li>
 *   <li>{@link com.home.knowledge.MExperience#getProblems <em>Problems</em>}</li>
 *   <li>{@link com.home.knowledge.MExperience#getSolutions <em>Solutions</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.home.knowledge.MKnowledgePackage#getExperience()
 * @model
 * @generated
 */
public interface MExperience extends EObject {
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
	 * @see com.home.knowledge.MKnowledgePackage#getExperience_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.home.knowledge.MExperience#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Problems</b></em>' containment reference list.

	 
	 * The list contents are of type {@link com.home.knowledge.MProblem}. 
	
	 * It is bidirectional and its opposite is '{@link com.home.knowledge.MProblem#getParentExp <em>Parent Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Problems</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Problems</em>' containment reference list.
	 * @see com.home.knowledge.MKnowledgePackage#getExperience_Problems()
	 * @see com.home.knowledge.MProblem#getParentExp
	 * @model opposite="parentExp" containment="true"
	 * @generated
	 */
	List<Problem> getProblems();

	/**
	 * Returns the value of the '<em><b>Solutions</b></em>' containment reference list.

	 
	 * The list contents are of type {@link com.home.knowledge.MSolution}. 
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solutions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solutions</em>' containment reference list.
	 * @see com.home.knowledge.MKnowledgePackage#getExperience_Solutions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	List<Solution> getSolutions();

} // MExperience

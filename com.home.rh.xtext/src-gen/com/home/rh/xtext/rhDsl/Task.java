/**
 * generated by Xtext 2.10.0
 */
package com.home.rh.xtext.rhDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.home.rh.xtext.rhDsl.Task#getName <em>Name</em>}</li>
 *   <li>{@link com.home.rh.xtext.rhDsl.Task#getResponsable <em>Responsable</em>}</li>
 *   <li>{@link com.home.rh.xtext.rhDsl.Task#getDescription <em>Description</em>}</li>
 *   <li>{@link com.home.rh.xtext.rhDsl.Task#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link com.home.rh.xtext.rhDsl.Task#getDuration <em>Duration</em>}</li>
 *   <li>{@link com.home.rh.xtext.rhDsl.Task#getDurationType <em>Duration Type</em>}</li>
 *   <li>{@link com.home.rh.xtext.rhDsl.Task#getSubtasks <em>Subtasks</em>}</li>
 * </ul>
 *
 * @see com.home.rh.xtext.rhDsl.RhDslPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends EObject
{
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
   * @see com.home.rh.xtext.rhDsl.RhDslPackage#getTask_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.home.rh.xtext.rhDsl.Task#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Responsable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Responsable</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Responsable</em>' reference.
   * @see #setResponsable(Employee)
   * @see com.home.rh.xtext.rhDsl.RhDslPackage#getTask_Responsable()
   * @model
   * @generated
   */
  Employee getResponsable();

  /**
   * Sets the value of the '{@link com.home.rh.xtext.rhDsl.Task#getResponsable <em>Responsable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Responsable</em>' reference.
   * @see #getResponsable()
   * @generated
   */
  void setResponsable(Employee value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see com.home.rh.xtext.rhDsl.RhDslPackage#getTask_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link com.home.rh.xtext.rhDsl.Task#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Start Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start Date</em>' attribute.
   * @see #setStartDate(String)
   * @see com.home.rh.xtext.rhDsl.RhDslPackage#getTask_StartDate()
   * @model
   * @generated
   */
  String getStartDate();

  /**
   * Sets the value of the '{@link com.home.rh.xtext.rhDsl.Task#getStartDate <em>Start Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start Date</em>' attribute.
   * @see #getStartDate()
   * @generated
   */
  void setStartDate(String value);

  /**
   * Returns the value of the '<em><b>Duration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Duration</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Duration</em>' attribute.
   * @see #setDuration(int)
   * @see com.home.rh.xtext.rhDsl.RhDslPackage#getTask_Duration()
   * @model
   * @generated
   */
  int getDuration();

  /**
   * Sets the value of the '{@link com.home.rh.xtext.rhDsl.Task#getDuration <em>Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Duration</em>' attribute.
   * @see #getDuration()
   * @generated
   */
  void setDuration(int value);

  /**
   * Returns the value of the '<em><b>Duration Type</b></em>' attribute.
   * The literals are from the enumeration {@link com.home.rh.xtext.rhDsl.DurationType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Duration Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Duration Type</em>' attribute.
   * @see com.home.rh.xtext.rhDsl.DurationType
   * @see #setDurationType(DurationType)
   * @see com.home.rh.xtext.rhDsl.RhDslPackage#getTask_DurationType()
   * @model
   * @generated
   */
  DurationType getDurationType();

  /**
   * Sets the value of the '{@link com.home.rh.xtext.rhDsl.Task#getDurationType <em>Duration Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Duration Type</em>' attribute.
   * @see com.home.rh.xtext.rhDsl.DurationType
   * @see #getDurationType()
   * @generated
   */
  void setDurationType(DurationType value);

  /**
   * Returns the value of the '<em><b>Subtasks</b></em>' containment reference list.
   * The list contents are of type {@link com.home.rh.xtext.rhDsl.Task}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subtasks</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subtasks</em>' containment reference list.
   * @see com.home.rh.xtext.rhDsl.RhDslPackage#getTask_Subtasks()
   * @model containment="true"
   * @generated
   */
  EList<Task> getSubtasks();

} // Task
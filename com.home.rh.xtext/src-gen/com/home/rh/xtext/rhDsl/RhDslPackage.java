/**
 * generated by Xtext 2.10.0
 */
package com.home.rh.xtext.rhDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.home.rh.xtext.rhDsl.RhDslFactory
 * @model kind="package"
 * @generated
 */
public interface RhDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "rhDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.home.com/rh/xtext/RhDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "rhDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RhDslPackage eINSTANCE = com.home.rh.xtext.rhDsl.impl.RhDslPackageImpl.init();

  /**
   * The meta object id for the '{@link com.home.rh.xtext.rhDsl.impl.CompanyImpl <em>Company</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.home.rh.xtext.rhDsl.impl.CompanyImpl
   * @see com.home.rh.xtext.rhDsl.impl.RhDslPackageImpl#getCompany()
   * @generated
   */
  int COMPANY = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPANY__NAME = 0;

  /**
   * The feature id for the '<em><b>Employees</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPANY__EMPLOYEES = 1;

  /**
   * The feature id for the '<em><b>Projects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPANY__PROJECTS = 2;

  /**
   * The number of structural features of the '<em>Company</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPANY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.home.rh.xtext.rhDsl.impl.EmployeeImpl <em>Employee</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.home.rh.xtext.rhDsl.impl.EmployeeImpl
   * @see com.home.rh.xtext.rhDsl.impl.RhDslPackageImpl#getEmployee()
   * @generated
   */
  int EMPLOYEE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPLOYEE__NAME = 0;

  /**
   * The feature id for the '<em><b>Weight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPLOYEE__WEIGHT = 1;

  /**
   * The feature id for the '<em><b>Height</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPLOYEE__HEIGHT = 2;

  /**
   * The number of structural features of the '<em>Employee</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPLOYEE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.home.rh.xtext.rhDsl.impl.ProjectImpl <em>Project</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.home.rh.xtext.rhDsl.impl.ProjectImpl
   * @see com.home.rh.xtext.rhDsl.impl.RhDslPackageImpl#getProject()
   * @generated
   */
  int PROJECT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__TYPE = 1;

  /**
   * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__TASKS = 2;

  /**
   * The number of structural features of the '<em>Project</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.home.rh.xtext.rhDsl.impl.TaskImpl <em>Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.home.rh.xtext.rhDsl.impl.TaskImpl
   * @see com.home.rh.xtext.rhDsl.impl.RhDslPackageImpl#getTask()
   * @generated
   */
  int TASK = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__NAME = 0;

  /**
   * The feature id for the '<em><b>Responsable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__RESPONSABLE = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Start Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__START_DATE = 3;

  /**
   * The feature id for the '<em><b>Duration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__DURATION = 4;

  /**
   * The feature id for the '<em><b>Duration Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__DURATION_TYPE = 5;

  /**
   * The feature id for the '<em><b>Subtasks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__SUBTASKS = 6;

  /**
   * The number of structural features of the '<em>Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link com.home.rh.xtext.rhDsl.DurationType <em>Duration Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.home.rh.xtext.rhDsl.DurationType
   * @see com.home.rh.xtext.rhDsl.impl.RhDslPackageImpl#getDurationType()
   * @generated
   */
  int DURATION_TYPE = 4;


  /**
   * Returns the meta object for class '{@link com.home.rh.xtext.rhDsl.Company <em>Company</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Company</em>'.
   * @see com.home.rh.xtext.rhDsl.Company
   * @generated
   */
  EClass getCompany();

  /**
   * Returns the meta object for the attribute '{@link com.home.rh.xtext.rhDsl.Company#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.home.rh.xtext.rhDsl.Company#getName()
   * @see #getCompany()
   * @generated
   */
  EAttribute getCompany_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.home.rh.xtext.rhDsl.Company#getEmployees <em>Employees</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Employees</em>'.
   * @see com.home.rh.xtext.rhDsl.Company#getEmployees()
   * @see #getCompany()
   * @generated
   */
  EReference getCompany_Employees();

  /**
   * Returns the meta object for the containment reference list '{@link com.home.rh.xtext.rhDsl.Company#getProjects <em>Projects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Projects</em>'.
   * @see com.home.rh.xtext.rhDsl.Company#getProjects()
   * @see #getCompany()
   * @generated
   */
  EReference getCompany_Projects();

  /**
   * Returns the meta object for class '{@link com.home.rh.xtext.rhDsl.Employee <em>Employee</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Employee</em>'.
   * @see com.home.rh.xtext.rhDsl.Employee
   * @generated
   */
  EClass getEmployee();

  /**
   * Returns the meta object for the attribute '{@link com.home.rh.xtext.rhDsl.Employee#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.home.rh.xtext.rhDsl.Employee#getName()
   * @see #getEmployee()
   * @generated
   */
  EAttribute getEmployee_Name();

  /**
   * Returns the meta object for the attribute '{@link com.home.rh.xtext.rhDsl.Employee#getWeight <em>Weight</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Weight</em>'.
   * @see com.home.rh.xtext.rhDsl.Employee#getWeight()
   * @see #getEmployee()
   * @generated
   */
  EAttribute getEmployee_Weight();

  /**
   * Returns the meta object for the attribute '{@link com.home.rh.xtext.rhDsl.Employee#getHeight <em>Height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Height</em>'.
   * @see com.home.rh.xtext.rhDsl.Employee#getHeight()
   * @see #getEmployee()
   * @generated
   */
  EAttribute getEmployee_Height();

  /**
   * Returns the meta object for class '{@link com.home.rh.xtext.rhDsl.Project <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Project</em>'.
   * @see com.home.rh.xtext.rhDsl.Project
   * @generated
   */
  EClass getProject();

  /**
   * Returns the meta object for the attribute '{@link com.home.rh.xtext.rhDsl.Project#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.home.rh.xtext.rhDsl.Project#getName()
   * @see #getProject()
   * @generated
   */
  EAttribute getProject_Name();

  /**
   * Returns the meta object for the attribute '{@link com.home.rh.xtext.rhDsl.Project#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see com.home.rh.xtext.rhDsl.Project#getType()
   * @see #getProject()
   * @generated
   */
  EAttribute getProject_Type();

  /**
   * Returns the meta object for the containment reference list '{@link com.home.rh.xtext.rhDsl.Project#getTasks <em>Tasks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tasks</em>'.
   * @see com.home.rh.xtext.rhDsl.Project#getTasks()
   * @see #getProject()
   * @generated
   */
  EReference getProject_Tasks();

  /**
   * Returns the meta object for class '{@link com.home.rh.xtext.rhDsl.Task <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task</em>'.
   * @see com.home.rh.xtext.rhDsl.Task
   * @generated
   */
  EClass getTask();

  /**
   * Returns the meta object for the attribute '{@link com.home.rh.xtext.rhDsl.Task#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.home.rh.xtext.rhDsl.Task#getName()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_Name();

  /**
   * Returns the meta object for the reference '{@link com.home.rh.xtext.rhDsl.Task#getResponsable <em>Responsable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Responsable</em>'.
   * @see com.home.rh.xtext.rhDsl.Task#getResponsable()
   * @see #getTask()
   * @generated
   */
  EReference getTask_Responsable();

  /**
   * Returns the meta object for the attribute '{@link com.home.rh.xtext.rhDsl.Task#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.home.rh.xtext.rhDsl.Task#getDescription()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_Description();

  /**
   * Returns the meta object for the attribute '{@link com.home.rh.xtext.rhDsl.Task#getStartDate <em>Start Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Start Date</em>'.
   * @see com.home.rh.xtext.rhDsl.Task#getStartDate()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_StartDate();

  /**
   * Returns the meta object for the attribute '{@link com.home.rh.xtext.rhDsl.Task#getDuration <em>Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Duration</em>'.
   * @see com.home.rh.xtext.rhDsl.Task#getDuration()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_Duration();

  /**
   * Returns the meta object for the attribute '{@link com.home.rh.xtext.rhDsl.Task#getDurationType <em>Duration Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Duration Type</em>'.
   * @see com.home.rh.xtext.rhDsl.Task#getDurationType()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_DurationType();

  /**
   * Returns the meta object for the containment reference list '{@link com.home.rh.xtext.rhDsl.Task#getSubtasks <em>Subtasks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Subtasks</em>'.
   * @see com.home.rh.xtext.rhDsl.Task#getSubtasks()
   * @see #getTask()
   * @generated
   */
  EReference getTask_Subtasks();

  /**
   * Returns the meta object for enum '{@link com.home.rh.xtext.rhDsl.DurationType <em>Duration Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Duration Type</em>'.
   * @see com.home.rh.xtext.rhDsl.DurationType
   * @generated
   */
  EEnum getDurationType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  RhDslFactory getRhDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.home.rh.xtext.rhDsl.impl.CompanyImpl <em>Company</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.home.rh.xtext.rhDsl.impl.CompanyImpl
     * @see com.home.rh.xtext.rhDsl.impl.RhDslPackageImpl#getCompany()
     * @generated
     */
    EClass COMPANY = eINSTANCE.getCompany();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPANY__NAME = eINSTANCE.getCompany_Name();

    /**
     * The meta object literal for the '<em><b>Employees</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPANY__EMPLOYEES = eINSTANCE.getCompany_Employees();

    /**
     * The meta object literal for the '<em><b>Projects</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPANY__PROJECTS = eINSTANCE.getCompany_Projects();

    /**
     * The meta object literal for the '{@link com.home.rh.xtext.rhDsl.impl.EmployeeImpl <em>Employee</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.home.rh.xtext.rhDsl.impl.EmployeeImpl
     * @see com.home.rh.xtext.rhDsl.impl.RhDslPackageImpl#getEmployee()
     * @generated
     */
    EClass EMPLOYEE = eINSTANCE.getEmployee();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EMPLOYEE__NAME = eINSTANCE.getEmployee_Name();

    /**
     * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EMPLOYEE__WEIGHT = eINSTANCE.getEmployee_Weight();

    /**
     * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EMPLOYEE__HEIGHT = eINSTANCE.getEmployee_Height();

    /**
     * The meta object literal for the '{@link com.home.rh.xtext.rhDsl.impl.ProjectImpl <em>Project</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.home.rh.xtext.rhDsl.impl.ProjectImpl
     * @see com.home.rh.xtext.rhDsl.impl.RhDslPackageImpl#getProject()
     * @generated
     */
    EClass PROJECT = eINSTANCE.getProject();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJECT__NAME = eINSTANCE.getProject_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJECT__TYPE = eINSTANCE.getProject_Type();

    /**
     * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECT__TASKS = eINSTANCE.getProject_Tasks();

    /**
     * The meta object literal for the '{@link com.home.rh.xtext.rhDsl.impl.TaskImpl <em>Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.home.rh.xtext.rhDsl.impl.TaskImpl
     * @see com.home.rh.xtext.rhDsl.impl.RhDslPackageImpl#getTask()
     * @generated
     */
    EClass TASK = eINSTANCE.getTask();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__NAME = eINSTANCE.getTask_Name();

    /**
     * The meta object literal for the '<em><b>Responsable</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK__RESPONSABLE = eINSTANCE.getTask_Responsable();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__DESCRIPTION = eINSTANCE.getTask_Description();

    /**
     * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__START_DATE = eINSTANCE.getTask_StartDate();

    /**
     * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__DURATION = eINSTANCE.getTask_Duration();

    /**
     * The meta object literal for the '<em><b>Duration Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__DURATION_TYPE = eINSTANCE.getTask_DurationType();

    /**
     * The meta object literal for the '<em><b>Subtasks</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK__SUBTASKS = eINSTANCE.getTask_Subtasks();

    /**
     * The meta object literal for the '{@link com.home.rh.xtext.rhDsl.DurationType <em>Duration Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.home.rh.xtext.rhDsl.DurationType
     * @see com.home.rh.xtext.rhDsl.impl.RhDslPackageImpl#getDurationType()
     * @generated
     */
    EEnum DURATION_TYPE = eINSTANCE.getDurationType();

  }

} //RhDslPackage
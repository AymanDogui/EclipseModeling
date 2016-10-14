/**
 */
package com.home.knowledge.tests;

import com.home.knowledge.KnowledgeFactory;
import com.home.knowledge.MKnowledgeFactory;
import com.home.knowledge.MOrganisation;
import com.home.knowledge.Organisation;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Organisation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link com.home.knowledge.MOrganisation#findSolution(com.home.knowledge.MProblem) <em>Find Solution</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class OrganisationTest extends TestCase {

	/**
	 * The fixture for this Organisation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MOrganisation fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OrganisationTest.class);
	}

	/**
	 * Constructs a new Organisation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganisationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Organisation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MOrganisation fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Organisation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MOrganisation getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MKnowledgeFactory.eINSTANCE.createOrganisation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link com.home.knowledge.MOrganisation#findSolution(com.home.knowledge.MProblem) <em>Find Solution</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.home.knowledge.MOrganisation#findSolution(com.home.knowledge.MProblem)
	 * @generated
	 */
	public void testFindSolution__MProblem() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //OrganisationTest

/**
 */
package com.home.knowledge.tests;

import com.home.knowledge.KnowledgeFactory;
import com.home.knowledge.MKnowledgeFactory;
import com.home.knowledge.MProblem;
import com.home.knowledge.Problem;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Problem</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProblemTest extends TestCase {

	/**
	 * The fixture for this Problem test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MProblem fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProblemTest.class);
	}

	/**
	 * Constructs a new Problem test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Problem test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MProblem fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Problem test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MProblem getFixture() {
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
		setFixture(MKnowledgeFactory.eINSTANCE.createProblem());
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

} //ProblemTest

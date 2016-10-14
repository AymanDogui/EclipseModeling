/**
 */
package com.home.knowledge.tests;

import com.home.knowledge.KnowledgeFactory;
import com.home.knowledge.MKnowledgeFactory;
import com.home.knowledge.MSolution;
import com.home.knowledge.Solution;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Solution</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SolutionTest extends TestCase {

	/**
	 * The fixture for this Solution test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MSolution fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SolutionTest.class);
	}

	/**
	 * Constructs a new Solution test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Solution test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MSolution fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Solution test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MSolution getFixture() {
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
		setFixture(MKnowledgeFactory.eINSTANCE.createSolution());
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

} //SolutionTest

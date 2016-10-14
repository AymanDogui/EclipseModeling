/**
 */
package com.home.knowledge.tests;

import com.home.knowledge.Experience;
import com.home.knowledge.KnowledgeFactory;

import com.home.knowledge.MExperience;
import com.home.knowledge.MKnowledgeFactory;
import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Experience</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExperienceTest extends TestCase {

	/**
	 * The fixture for this Experience test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MExperience fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExperienceTest.class);
	}

	/**
	 * Constructs a new Experience test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExperienceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Experience test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MExperience fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Experience test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MExperience getFixture() {
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
		setFixture(MKnowledgeFactory.eINSTANCE.createExperience());
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

} //ExperienceTest

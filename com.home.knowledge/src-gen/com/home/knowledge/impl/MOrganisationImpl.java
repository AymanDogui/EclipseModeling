/**
 */
package com.home.knowledge.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.home.knowledge.Experience;
import com.home.knowledge.MKnowledgePackage;
import com.home.knowledge.Organisation;
import com.home.knowledge.Problem;
import com.home.knowledge.Solution;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organisation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.home.knowledge.impl.MOrganisationImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.home.knowledge.impl.MOrganisationImpl#getExperiences <em>Experiences</em>}</li>
 *   <li>{@link com.home.knowledge.impl.MOrganisationImpl#getCurrentProblem <em>Current Problem</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 public class MOrganisationImpl extends MinimalEObjectImpl.Container implements Organisation {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExperiences() <em>Experiences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExperiences()
	 * @generated
	 * @ordered
	 */
	protected EList<Experience> experiences;

	/**
	 * The cached value of the '{@link #getCurrentProblem() <em>Current Problem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentProblem()
	 * @generated
	 * @ordered
	 */
	protected Problem currentProblem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MOrganisationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MKnowledgePackage.Literals.ORGANISATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MKnowledgePackage.ORGANISATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Experience> getExperiences() {
		if (experiences == null) {
			experiences = new EObjectContainmentEList<Experience>(Experience.class, this, MKnowledgePackage.ORGANISATION__EXPERIENCES);
		}
		return experiences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Problem getCurrentProblem() {
		if (currentProblem != null && currentProblem.eIsProxy()) {
			InternalEObject oldCurrentProblem = (InternalEObject)currentProblem;
			currentProblem = (Problem)eResolveProxy(oldCurrentProblem);
			if (currentProblem != oldCurrentProblem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MKnowledgePackage.ORGANISATION__CURRENT_PROBLEM, oldCurrentProblem, currentProblem));
			}
		}
		return currentProblem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Problem basicGetCurrentProblem() {
		return currentProblem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentProblem(Problem newCurrentProblem) {
		Problem oldCurrentProblem = currentProblem;
		currentProblem = newCurrentProblem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MKnowledgePackage.ORGANISATION__CURRENT_PROBLEM, oldCurrentProblem, currentProblem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solution findSolution(Problem problem) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException(); 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MKnowledgePackage.ORGANISATION__EXPERIENCES:
				return ((InternalEList<?>)getExperiences()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MKnowledgePackage.ORGANISATION__NAME:
				return getName();
			case MKnowledgePackage.ORGANISATION__EXPERIENCES:
				return getExperiences();
			case MKnowledgePackage.ORGANISATION__CURRENT_PROBLEM:
				if (resolve) return getCurrentProblem();
				return basicGetCurrentProblem();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MKnowledgePackage.ORGANISATION__NAME:
				setName((String)newValue);
				return;
			case MKnowledgePackage.ORGANISATION__EXPERIENCES:
				getExperiences().clear();
				getExperiences().addAll((Collection<? extends Experience>)newValue);
				return;
			case MKnowledgePackage.ORGANISATION__CURRENT_PROBLEM:
				setCurrentProblem((Problem)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MKnowledgePackage.ORGANISATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MKnowledgePackage.ORGANISATION__EXPERIENCES:
				getExperiences().clear();
				return;
			case MKnowledgePackage.ORGANISATION__CURRENT_PROBLEM:
				setCurrentProblem((Problem)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MKnowledgePackage.ORGANISATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MKnowledgePackage.ORGANISATION__EXPERIENCES:
				return experiences != null && !experiences.isEmpty();
			case MKnowledgePackage.ORGANISATION__CURRENT_PROBLEM:
				return currentProblem != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case MKnowledgePackage.ORGANISATION___FIND_SOLUTION__MPROBLEM:
				return findSolution((Problem)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MOrganisationImpl

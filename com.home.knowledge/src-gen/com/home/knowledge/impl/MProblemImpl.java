/**
 */
package com.home.knowledge.impl;

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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import com.home.knowledge.Experience;
import com.home.knowledge.MExperience;
import com.home.knowledge.MKnowledgePackage;
import com.home.knowledge.Problem;
import com.home.knowledge.Solution;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Problem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.home.knowledge.impl.MProblemImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.home.knowledge.impl.MProblemImpl#getSolutions <em>Solutions</em>}</li>
 *   <li>{@link com.home.knowledge.impl.MProblemImpl#getParentExp <em>Parent Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 public class MProblemImpl extends MinimalEObjectImpl.Container implements Problem {
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
	 * The cached value of the '{@link #getSolutions() <em>Solutions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolutions()
	 * @generated
	 * @ordered
	 */
	protected EList<Solution> solutions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MProblemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MKnowledgePackage.Literals.PROBLEM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MKnowledgePackage.PROBLEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Solution> getSolutions() {
		if (solutions == null) {
			solutions = new EObjectContainmentEList<Solution>(Solution.class, this, MKnowledgePackage.PROBLEM__SOLUTIONS);
		}
		return solutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Experience getParentExp() {
		if (eContainerFeatureID() != MKnowledgePackage.PROBLEM__PARENT_EXP) return null;
		return (Experience)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentExp(Experience newParentExp, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentExp, MKnowledgePackage.PROBLEM__PARENT_EXP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentExp(Experience newParentExp) {
		if (newParentExp != eInternalContainer() || (eContainerFeatureID() != MKnowledgePackage.PROBLEM__PARENT_EXP && newParentExp != null)) {
			if (EcoreUtil.isAncestor(this, newParentExp))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentExp != null)
				msgs = ((InternalEObject)newParentExp).eInverseAdd(this, MKnowledgePackage.EXPERIENCE__PROBLEMS, MExperience.class, msgs);
			msgs = basicSetParentExp(newParentExp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MKnowledgePackage.PROBLEM__PARENT_EXP, newParentExp, newParentExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MKnowledgePackage.PROBLEM__PARENT_EXP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentExp((Experience)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MKnowledgePackage.PROBLEM__SOLUTIONS:
				return ((InternalEList<?>)getSolutions()).basicRemove(otherEnd, msgs);
			case MKnowledgePackage.PROBLEM__PARENT_EXP:
				return basicSetParentExp(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case MKnowledgePackage.PROBLEM__PARENT_EXP:
				return eInternalContainer().eInverseRemove(this, MKnowledgePackage.EXPERIENCE__PROBLEMS, MExperience.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MKnowledgePackage.PROBLEM__NAME:
				return getName();
			case MKnowledgePackage.PROBLEM__SOLUTIONS:
				return getSolutions();
			case MKnowledgePackage.PROBLEM__PARENT_EXP:
				return getParentExp();
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
			case MKnowledgePackage.PROBLEM__NAME:
				setName((String)newValue);
				return;
			case MKnowledgePackage.PROBLEM__SOLUTIONS:
				getSolutions().clear();
				getSolutions().addAll((Collection<? extends Solution>)newValue);
				return;
			case MKnowledgePackage.PROBLEM__PARENT_EXP:
				setParentExp((Experience)newValue);
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
			case MKnowledgePackage.PROBLEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MKnowledgePackage.PROBLEM__SOLUTIONS:
				getSolutions().clear();
				return;
			case MKnowledgePackage.PROBLEM__PARENT_EXP:
				setParentExp((Experience)null);
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
			case MKnowledgePackage.PROBLEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MKnowledgePackage.PROBLEM__SOLUTIONS:
				return solutions != null && !solutions.isEmpty();
			case MKnowledgePackage.PROBLEM__PARENT_EXP:
				return getParentExp() != null;
		}
		return super.eIsSet(featureID);
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

} //MProblemImpl

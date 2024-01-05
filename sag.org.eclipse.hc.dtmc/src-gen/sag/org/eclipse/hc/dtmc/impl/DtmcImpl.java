/**
 */
package sag.org.eclipse.hc.dtmc.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sag.org.eclipse.hc.dtmc.Dtmc;
import sag.org.eclipse.hc.dtmc.DtmcPackage;
import sag.org.eclipse.hc.dtmc.Line;
import sag.org.eclipse.hc.dtmc.Reward;
import sag.org.eclipse.hc.dtmc.State;
import sag.org.eclipse.hc.dtmc.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dtmc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sag.org.eclipse.hc.dtmc.impl.DtmcImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link sag.org.eclipse.hc.dtmc.impl.DtmcImpl#getStates <em>States</em>}</li>
 *   <li>{@link sag.org.eclipse.hc.dtmc.impl.DtmcImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link sag.org.eclipse.hc.dtmc.impl.DtmcImpl#getLines <em>Lines</em>}</li>
 *   <li>{@link sag.org.eclipse.hc.dtmc.impl.DtmcImpl#getRewards <em>Rewards</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DtmcImpl extends BaseImpl implements Dtmc {
	/**
	 * The default value of the '{@link #getVariable() <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected String variable = VARIABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * The cached value of the '{@link #getLines() <em>Lines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLines()
	 * @generated
	 * @ordered
	 */
	protected EList<Line> lines;

	/**
	 * The cached value of the '{@link #getRewards() <em>Rewards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRewards()
	 * @generated
	 * @ordered
	 */
	protected EList<Reward> rewards;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DtmcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DtmcPackage.Literals.DTMC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(String newVariable) {
		String oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DtmcPackage.DTMC__VARIABLE, oldVariable, variable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<State>(State.class, this, DtmcPackage.DTMC__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentEList<Transition>(Transition.class, this,
					DtmcPackage.DTMC__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Line> getLines() {
		if (lines == null) {
			lines = new EObjectContainmentEList<Line>(Line.class, this, DtmcPackage.DTMC__LINES);
		}
		return lines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reward> getRewards() {
		if (rewards == null) {
			rewards = new EObjectContainmentEList<Reward>(Reward.class, this, DtmcPackage.DTMC__REWARDS);
		}
		return rewards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DtmcPackage.DTMC__STATES:
			return ((InternalEList<?>) getStates()).basicRemove(otherEnd, msgs);
		case DtmcPackage.DTMC__TRANSITIONS:
			return ((InternalEList<?>) getTransitions()).basicRemove(otherEnd, msgs);
		case DtmcPackage.DTMC__LINES:
			return ((InternalEList<?>) getLines()).basicRemove(otherEnd, msgs);
		case DtmcPackage.DTMC__REWARDS:
			return ((InternalEList<?>) getRewards()).basicRemove(otherEnd, msgs);
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
		case DtmcPackage.DTMC__VARIABLE:
			return getVariable();
		case DtmcPackage.DTMC__STATES:
			return getStates();
		case DtmcPackage.DTMC__TRANSITIONS:
			return getTransitions();
		case DtmcPackage.DTMC__LINES:
			return getLines();
		case DtmcPackage.DTMC__REWARDS:
			return getRewards();
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
		case DtmcPackage.DTMC__VARIABLE:
			setVariable((String) newValue);
			return;
		case DtmcPackage.DTMC__STATES:
			getStates().clear();
			getStates().addAll((Collection<? extends State>) newValue);
			return;
		case DtmcPackage.DTMC__TRANSITIONS:
			getTransitions().clear();
			getTransitions().addAll((Collection<? extends Transition>) newValue);
			return;
		case DtmcPackage.DTMC__LINES:
			getLines().clear();
			getLines().addAll((Collection<? extends Line>) newValue);
			return;
		case DtmcPackage.DTMC__REWARDS:
			getRewards().clear();
			getRewards().addAll((Collection<? extends Reward>) newValue);
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
		case DtmcPackage.DTMC__VARIABLE:
			setVariable(VARIABLE_EDEFAULT);
			return;
		case DtmcPackage.DTMC__STATES:
			getStates().clear();
			return;
		case DtmcPackage.DTMC__TRANSITIONS:
			getTransitions().clear();
			return;
		case DtmcPackage.DTMC__LINES:
			getLines().clear();
			return;
		case DtmcPackage.DTMC__REWARDS:
			getRewards().clear();
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
		case DtmcPackage.DTMC__VARIABLE:
			return VARIABLE_EDEFAULT == null ? variable != null : !VARIABLE_EDEFAULT.equals(variable);
		case DtmcPackage.DTMC__STATES:
			return states != null && !states.isEmpty();
		case DtmcPackage.DTMC__TRANSITIONS:
			return transitions != null && !transitions.isEmpty();
		case DtmcPackage.DTMC__LINES:
			return lines != null && !lines.isEmpty();
		case DtmcPackage.DTMC__REWARDS:
			return rewards != null && !rewards.isEmpty();
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (variable: ");
		result.append(variable);
		result.append(')');
		return result.toString();
	}

} //DtmcImpl

/**
 */
package sag.org.eclipse.hc.dtmc.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sag.org.eclipse.hc.dtmc.DtmcPackage;
import sag.org.eclipse.hc.dtmc.Line;
import sag.org.eclipse.hc.dtmc.State;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sag.org.eclipse.hc.dtmc.impl.LineImpl#getSource_state <em>Source state</em>}</li>
 *   <li>{@link sag.org.eclipse.hc.dtmc.impl.LineImpl#getTarget_state <em>Target state</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LineImpl extends BaseImpl implements Line {
	/**
	 * The cached value of the '{@link #getSource_state() <em>Source state</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource_state()
	 * @generated
	 * @ordered
	 */
	protected State source_state;

	/**
	 * The cached value of the '{@link #getTarget_state() <em>Target state</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget_state()
	 * @generated
	 * @ordered
	 */
	protected State target_state;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DtmcPackage.Literals.LINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getSource_state() {
		if (source_state != null && source_state.eIsProxy()) {
			InternalEObject oldSource_state = (InternalEObject) source_state;
			source_state = (State) eResolveProxy(oldSource_state);
			if (source_state != oldSource_state) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DtmcPackage.LINE__SOURCE_STATE,
							oldSource_state, source_state));
			}
		}
		return source_state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetSource_state() {
		return source_state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource_state(State newSource_state) {
		State oldSource_state = source_state;
		source_state = newSource_state;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DtmcPackage.LINE__SOURCE_STATE, oldSource_state,
					source_state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getTarget_state() {
		if (target_state != null && target_state.eIsProxy()) {
			InternalEObject oldTarget_state = (InternalEObject) target_state;
			target_state = (State) eResolveProxy(oldTarget_state);
			if (target_state != oldTarget_state) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DtmcPackage.LINE__TARGET_STATE,
							oldTarget_state, target_state));
			}
		}
		return target_state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetTarget_state() {
		return target_state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget_state(State newTarget_state) {
		State oldTarget_state = target_state;
		target_state = newTarget_state;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DtmcPackage.LINE__TARGET_STATE, oldTarget_state,
					target_state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DtmcPackage.LINE__SOURCE_STATE:
			if (resolve)
				return getSource_state();
			return basicGetSource_state();
		case DtmcPackage.LINE__TARGET_STATE:
			if (resolve)
				return getTarget_state();
			return basicGetTarget_state();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DtmcPackage.LINE__SOURCE_STATE:
			setSource_state((State) newValue);
			return;
		case DtmcPackage.LINE__TARGET_STATE:
			setTarget_state((State) newValue);
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
		case DtmcPackage.LINE__SOURCE_STATE:
			setSource_state((State) null);
			return;
		case DtmcPackage.LINE__TARGET_STATE:
			setTarget_state((State) null);
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
		case DtmcPackage.LINE__SOURCE_STATE:
			return source_state != null;
		case DtmcPackage.LINE__TARGET_STATE:
			return target_state != null;
		}
		return super.eIsSet(featureID);
	}

} //LineImpl

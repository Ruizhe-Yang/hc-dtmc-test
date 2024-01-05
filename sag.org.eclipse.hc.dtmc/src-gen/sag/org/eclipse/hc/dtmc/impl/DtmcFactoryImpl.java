/**
 */
package sag.org.eclipse.hc.dtmc.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sag.org.eclipse.hc.dtmc.Action;
import sag.org.eclipse.hc.dtmc.Dtmc;
import sag.org.eclipse.hc.dtmc.DtmcFactory;
import sag.org.eclipse.hc.dtmc.DtmcPackage;
import sag.org.eclipse.hc.dtmc.Line;
import sag.org.eclipse.hc.dtmc.Reward;
import sag.org.eclipse.hc.dtmc.State;
import sag.org.eclipse.hc.dtmc.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DtmcFactoryImpl extends EFactoryImpl implements DtmcFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DtmcFactory init() {
		try {
			DtmcFactory theDtmcFactory = (DtmcFactory) EPackage.Registry.INSTANCE.getEFactory(DtmcPackage.eNS_URI);
			if (theDtmcFactory != null) {
				return theDtmcFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DtmcFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DtmcFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case DtmcPackage.DTMC:
			return createDtmc();
		case DtmcPackage.STATE:
			return createState();
		case DtmcPackage.TRANSITION:
			return createTransition();
		case DtmcPackage.REWARD:
			return createReward();
		case DtmcPackage.ACTION:
			return createAction();
		case DtmcPackage.LINE:
			return createLine();
		case DtmcPackage.MODULE:
			return createModule();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dtmc createDtmc() {
		DtmcImpl dtmc = new DtmcImpl();
		return dtmc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reward createReward() {
		RewardImpl reward = new RewardImpl();
		return reward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Line createLine() {
		LineImpl line = new LineImpl();
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public sag.org.eclipse.hc.dtmc.Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DtmcPackage getDtmcPackage() {
		return (DtmcPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DtmcPackage getPackage() {
		return DtmcPackage.eINSTANCE;
	}

} //DtmcFactoryImpl

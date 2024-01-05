/**
 */
package sag.org.eclipse.hc.dtmc;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see sag.org.eclipse.hc.dtmc.DtmcFactory
 * @model kind="package"
 * @generated
 */
public interface DtmcPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dtmc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sag.org.eclipse.hc/dtmc";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dtmc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DtmcPackage eINSTANCE = sag.org.eclipse.hc.dtmc.impl.DtmcPackageImpl.init();

	/**
	 * The meta object id for the '{@link sag.org.eclipse.hc.dtmc.impl.BaseImpl <em>Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sag.org.eclipse.hc.dtmc.impl.BaseImpl
	 * @see sag.org.eclipse.hc.dtmc.impl.DtmcPackageImpl#getBase()
	 * @generated
	 */
	int BASE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE__ID = 1;

	/**
	 * The number of structural features of the '<em>Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sag.org.eclipse.hc.dtmc.impl.DtmcImpl <em>Dtmc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sag.org.eclipse.hc.dtmc.impl.DtmcImpl
	 * @see sag.org.eclipse.hc.dtmc.impl.DtmcPackageImpl#getDtmc()
	 * @generated
	 */
	int DTMC = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTMC__NAME = BASE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTMC__ID = BASE__ID;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTMC__VARIABLE = BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTMC__STATES = BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTMC__TRANSITIONS = BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTMC__LINES = BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rewards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTMC__REWARDS = BASE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Dtmc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTMC_FEATURE_COUNT = BASE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Dtmc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTMC_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sag.org.eclipse.hc.dtmc.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sag.org.eclipse.hc.dtmc.impl.StateImpl
	 * @see sag.org.eclipse.hc.dtmc.impl.DtmcPackageImpl#getState()
	 * @generated
	 */
	int STATE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = BASE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ID = BASE__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__LABEL = BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TRANSITIONS = BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = BASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sag.org.eclipse.hc.dtmc.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sag.org.eclipse.hc.dtmc.impl.TransitionImpl
	 * @see sag.org.eclipse.hc.dtmc.impl.DtmcPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = BASE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ID = BASE__ID;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__PROBABILITY = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sag.org.eclipse.hc.dtmc.impl.RewardImpl <em>Reward</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sag.org.eclipse.hc.dtmc.impl.RewardImpl
	 * @see sag.org.eclipse.hc.dtmc.impl.DtmcPackageImpl#getReward()
	 * @generated
	 */
	int REWARD = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWARD__NAME = BASE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWARD__ID = BASE__ID;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWARD__ACTIONS = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWARD_FEATURE_COUNT = BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWARD_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sag.org.eclipse.hc.dtmc.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sag.org.eclipse.hc.dtmc.impl.ActionImpl
	 * @see sag.org.eclipse.hc.dtmc.impl.DtmcPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = BASE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ID = BASE__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__VALUE = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sag.org.eclipse.hc.dtmc.impl.LineImpl <em>Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sag.org.eclipse.hc.dtmc.impl.LineImpl
	 * @see sag.org.eclipse.hc.dtmc.impl.DtmcPackageImpl#getLine()
	 * @generated
	 */
	int LINE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__NAME = BASE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__ID = BASE__ID;

	/**
	 * The feature id for the '<em><b>Source state</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__SOURCE_STATE = BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target state</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__TARGET_STATE = BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FEATURE_COUNT = BASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sag.org.eclipse.hc.dtmc.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sag.org.eclipse.hc.dtmc.impl.ModuleImpl
	 * @see sag.org.eclipse.hc.dtmc.impl.DtmcPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = BASE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__ID = BASE__ID;

	/**
	 * The feature id for the '<em><b>Dtmc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__DTMC = BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OPERATION_COUNT = BASE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link sag.org.eclipse.hc.dtmc.Base <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base</em>'.
	 * @see sag.org.eclipse.hc.dtmc.Base
	 * @generated
	 */
	EClass getBase();

	/**
	 * Returns the meta object for the attribute '{@link sag.org.eclipse.hc.dtmc.Base#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sag.org.eclipse.hc.dtmc.Base#getName()
	 * @see #getBase()
	 * @generated
	 */
	EAttribute getBase_Name();

	/**
	 * Returns the meta object for the attribute '{@link sag.org.eclipse.hc.dtmc.Base#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see sag.org.eclipse.hc.dtmc.Base#getId()
	 * @see #getBase()
	 * @generated
	 */
	EAttribute getBase_Id();

	/**
	 * Returns the meta object for class '{@link sag.org.eclipse.hc.dtmc.Dtmc <em>Dtmc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dtmc</em>'.
	 * @see sag.org.eclipse.hc.dtmc.Dtmc
	 * @generated
	 */
	EClass getDtmc();

	/**
	 * Returns the meta object for the attribute '{@link sag.org.eclipse.hc.dtmc.Dtmc#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see sag.org.eclipse.hc.dtmc.Dtmc#getVariable()
	 * @see #getDtmc()
	 * @generated
	 */
	EAttribute getDtmc_Variable();

	/**
	 * Returns the meta object for the containment reference list '{@link sag.org.eclipse.hc.dtmc.Dtmc#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see sag.org.eclipse.hc.dtmc.Dtmc#getStates()
	 * @see #getDtmc()
	 * @generated
	 */
	EReference getDtmc_States();

	/**
	 * Returns the meta object for the containment reference list '{@link sag.org.eclipse.hc.dtmc.Dtmc#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see sag.org.eclipse.hc.dtmc.Dtmc#getTransitions()
	 * @see #getDtmc()
	 * @generated
	 */
	EReference getDtmc_Transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link sag.org.eclipse.hc.dtmc.Dtmc#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lines</em>'.
	 * @see sag.org.eclipse.hc.dtmc.Dtmc#getLines()
	 * @see #getDtmc()
	 * @generated
	 */
	EReference getDtmc_Lines();

	/**
	 * Returns the meta object for the containment reference list '{@link sag.org.eclipse.hc.dtmc.Dtmc#getRewards <em>Rewards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rewards</em>'.
	 * @see sag.org.eclipse.hc.dtmc.Dtmc#getRewards()
	 * @see #getDtmc()
	 * @generated
	 */
	EReference getDtmc_Rewards();

	/**
	 * Returns the meta object for class '{@link sag.org.eclipse.hc.dtmc.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see sag.org.eclipse.hc.dtmc.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link sag.org.eclipse.hc.dtmc.State#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see sag.org.eclipse.hc.dtmc.State#getLabel()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link sag.org.eclipse.hc.dtmc.State#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see sag.org.eclipse.hc.dtmc.State#getTransitions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Transitions();

	/**
	 * Returns the meta object for class '{@link sag.org.eclipse.hc.dtmc.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see sag.org.eclipse.hc.dtmc.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link sag.org.eclipse.hc.dtmc.Transition#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see sag.org.eclipse.hc.dtmc.Transition#getProbability()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Probability();

	/**
	 * Returns the meta object for class '{@link sag.org.eclipse.hc.dtmc.Reward <em>Reward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reward</em>'.
	 * @see sag.org.eclipse.hc.dtmc.Reward
	 * @generated
	 */
	EClass getReward();

	/**
	 * Returns the meta object for the reference list '{@link sag.org.eclipse.hc.dtmc.Reward#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actions</em>'.
	 * @see sag.org.eclipse.hc.dtmc.Reward#getActions()
	 * @see #getReward()
	 * @generated
	 */
	EReference getReward_Actions();

	/**
	 * Returns the meta object for class '{@link sag.org.eclipse.hc.dtmc.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see sag.org.eclipse.hc.dtmc.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link sag.org.eclipse.hc.dtmc.Action#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see sag.org.eclipse.hc.dtmc.Action#getValue()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Value();

	/**
	 * Returns the meta object for class '{@link sag.org.eclipse.hc.dtmc.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line</em>'.
	 * @see sag.org.eclipse.hc.dtmc.Line
	 * @generated
	 */
	EClass getLine();

	/**
	 * Returns the meta object for the reference '{@link sag.org.eclipse.hc.dtmc.Line#getSource_state <em>Source state</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source state</em>'.
	 * @see sag.org.eclipse.hc.dtmc.Line#getSource_state()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_Source_state();

	/**
	 * Returns the meta object for the reference '{@link sag.org.eclipse.hc.dtmc.Line#getTarget_state <em>Target state</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target state</em>'.
	 * @see sag.org.eclipse.hc.dtmc.Line#getTarget_state()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_Target_state();

	/**
	 * Returns the meta object for class '{@link sag.org.eclipse.hc.dtmc.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see sag.org.eclipse.hc.dtmc.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the containment reference list '{@link sag.org.eclipse.hc.dtmc.Module#getDtmc <em>Dtmc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dtmc</em>'.
	 * @see sag.org.eclipse.hc.dtmc.Module#getDtmc()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Dtmc();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DtmcFactory getDtmcFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link sag.org.eclipse.hc.dtmc.impl.BaseImpl <em>Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sag.org.eclipse.hc.dtmc.impl.BaseImpl
		 * @see sag.org.eclipse.hc.dtmc.impl.DtmcPackageImpl#getBase()
		 * @generated
		 */
		EClass BASE = eINSTANCE.getBase();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE__NAME = eINSTANCE.getBase_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE__ID = eINSTANCE.getBase_Id();

		/**
		 * The meta object literal for the '{@link sag.org.eclipse.hc.dtmc.impl.DtmcImpl <em>Dtmc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sag.org.eclipse.hc.dtmc.impl.DtmcImpl
		 * @see sag.org.eclipse.hc.dtmc.impl.DtmcPackageImpl#getDtmc()
		 * @generated
		 */
		EClass DTMC = eINSTANCE.getDtmc();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DTMC__VARIABLE = eINSTANCE.getDtmc_Variable();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DTMC__STATES = eINSTANCE.getDtmc_States();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DTMC__TRANSITIONS = eINSTANCE.getDtmc_Transitions();

		/**
		 * The meta object literal for the '<em><b>Lines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DTMC__LINES = eINSTANCE.getDtmc_Lines();

		/**
		 * The meta object literal for the '<em><b>Rewards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DTMC__REWARDS = eINSTANCE.getDtmc_Rewards();

		/**
		 * The meta object literal for the '{@link sag.org.eclipse.hc.dtmc.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sag.org.eclipse.hc.dtmc.impl.StateImpl
		 * @see sag.org.eclipse.hc.dtmc.impl.DtmcPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__LABEL = eINSTANCE.getState_Label();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__TRANSITIONS = eINSTANCE.getState_Transitions();

		/**
		 * The meta object literal for the '{@link sag.org.eclipse.hc.dtmc.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sag.org.eclipse.hc.dtmc.impl.TransitionImpl
		 * @see sag.org.eclipse.hc.dtmc.impl.DtmcPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__PROBABILITY = eINSTANCE.getTransition_Probability();

		/**
		 * The meta object literal for the '{@link sag.org.eclipse.hc.dtmc.impl.RewardImpl <em>Reward</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sag.org.eclipse.hc.dtmc.impl.RewardImpl
		 * @see sag.org.eclipse.hc.dtmc.impl.DtmcPackageImpl#getReward()
		 * @generated
		 */
		EClass REWARD = eINSTANCE.getReward();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REWARD__ACTIONS = eINSTANCE.getReward_Actions();

		/**
		 * The meta object literal for the '{@link sag.org.eclipse.hc.dtmc.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sag.org.eclipse.hc.dtmc.impl.ActionImpl
		 * @see sag.org.eclipse.hc.dtmc.impl.DtmcPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__VALUE = eINSTANCE.getAction_Value();

		/**
		 * The meta object literal for the '{@link sag.org.eclipse.hc.dtmc.impl.LineImpl <em>Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sag.org.eclipse.hc.dtmc.impl.LineImpl
		 * @see sag.org.eclipse.hc.dtmc.impl.DtmcPackageImpl#getLine()
		 * @generated
		 */
		EClass LINE = eINSTANCE.getLine();

		/**
		 * The meta object literal for the '<em><b>Source state</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__SOURCE_STATE = eINSTANCE.getLine_Source_state();

		/**
		 * The meta object literal for the '<em><b>Target state</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__TARGET_STATE = eINSTANCE.getLine_Target_state();

		/**
		 * The meta object literal for the '{@link sag.org.eclipse.hc.dtmc.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sag.org.eclipse.hc.dtmc.impl.ModuleImpl
		 * @see sag.org.eclipse.hc.dtmc.impl.DtmcPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Dtmc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__DTMC = eINSTANCE.getModule_Dtmc();

	}

} //DtmcPackage

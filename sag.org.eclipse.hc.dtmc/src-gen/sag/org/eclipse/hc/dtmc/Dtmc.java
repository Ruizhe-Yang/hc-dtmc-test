/**
 */
package sag.org.eclipse.hc.dtmc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dtmc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sag.org.eclipse.hc.dtmc.Dtmc#getVariable <em>Variable</em>}</li>
 *   <li>{@link sag.org.eclipse.hc.dtmc.Dtmc#getStates <em>States</em>}</li>
 *   <li>{@link sag.org.eclipse.hc.dtmc.Dtmc#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link sag.org.eclipse.hc.dtmc.Dtmc#getLines <em>Lines</em>}</li>
 *   <li>{@link sag.org.eclipse.hc.dtmc.Dtmc#getRewards <em>Rewards</em>}</li>
 * </ul>
 *
 * @see sag.org.eclipse.hc.dtmc.DtmcPackage#getDtmc()
 * @model
 * @generated
 */
public interface Dtmc extends Base {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' attribute.
	 * @see #setVariable(String)
	 * @see sag.org.eclipse.hc.dtmc.DtmcPackage#getDtmc_Variable()
	 * @model
	 * @generated
	 */
	String getVariable();

	/**
	 * Sets the value of the '{@link sag.org.eclipse.hc.dtmc.Dtmc#getVariable <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' attribute.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(String value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link sag.org.eclipse.hc.dtmc.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see sag.org.eclipse.hc.dtmc.DtmcPackage#getDtmc_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link sag.org.eclipse.hc.dtmc.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see sag.org.eclipse.hc.dtmc.DtmcPackage#getDtmc_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Lines</b></em>' containment reference list.
	 * The list contents are of type {@link sag.org.eclipse.hc.dtmc.Line}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lines</em>' containment reference list.
	 * @see sag.org.eclipse.hc.dtmc.DtmcPackage#getDtmc_Lines()
	 * @model containment="true"
	 * @generated
	 */
	EList<Line> getLines();

	/**
	 * Returns the value of the '<em><b>Rewards</b></em>' containment reference list.
	 * The list contents are of type {@link sag.org.eclipse.hc.dtmc.Reward}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rewards</em>' containment reference list.
	 * @see sag.org.eclipse.hc.dtmc.DtmcPackage#getDtmc_Rewards()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reward> getRewards();

} // Dtmc

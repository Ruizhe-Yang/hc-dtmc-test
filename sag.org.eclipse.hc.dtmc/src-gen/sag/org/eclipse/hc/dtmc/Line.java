/**
 */
package sag.org.eclipse.hc.dtmc;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sag.org.eclipse.hc.dtmc.Line#getSource_state <em>Source state</em>}</li>
 *   <li>{@link sag.org.eclipse.hc.dtmc.Line#getTarget_state <em>Target state</em>}</li>
 * </ul>
 *
 * @see sag.org.eclipse.hc.dtmc.DtmcPackage#getLine()
 * @model
 * @generated
 */
public interface Line extends Base {
	/**
	 * Returns the value of the '<em><b>Source state</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source state</em>' reference.
	 * @see #setSource_state(State)
	 * @see sag.org.eclipse.hc.dtmc.DtmcPackage#getLine_Source_state()
	 * @model
	 * @generated
	 */
	State getSource_state();

	/**
	 * Sets the value of the '{@link sag.org.eclipse.hc.dtmc.Line#getSource_state <em>Source state</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source state</em>' reference.
	 * @see #getSource_state()
	 * @generated
	 */
	void setSource_state(State value);

	/**
	 * Returns the value of the '<em><b>Target state</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target state</em>' reference.
	 * @see #setTarget_state(State)
	 * @see sag.org.eclipse.hc.dtmc.DtmcPackage#getLine_Target_state()
	 * @model
	 * @generated
	 */
	State getTarget_state();

	/**
	 * Sets the value of the '{@link sag.org.eclipse.hc.dtmc.Line#getTarget_state <em>Target state</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target state</em>' reference.
	 * @see #getTarget_state()
	 * @generated
	 */
	void setTarget_state(State value);

} // Line

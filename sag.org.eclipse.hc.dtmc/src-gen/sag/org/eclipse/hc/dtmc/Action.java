/**
 */
package sag.org.eclipse.hc.dtmc;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sag.org.eclipse.hc.dtmc.Action#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see sag.org.eclipse.hc.dtmc.DtmcPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends Base {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see sag.org.eclipse.hc.dtmc.DtmcPackage#getAction_Value()
	 * @model
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link sag.org.eclipse.hc.dtmc.Action#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

} // Action

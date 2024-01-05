/**
 */
package sag.org.eclipse.hc.dtmc;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sag.org.eclipse.hc.dtmc.Transition#getProbability <em>Probability</em>}</li>
 * </ul>
 *
 * @see sag.org.eclipse.hc.dtmc.DtmcPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends Base {
	/**
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(double)
	 * @see sag.org.eclipse.hc.dtmc.DtmcPackage#getTransition_Probability()
	 * @model
	 * @generated
	 */
	double getProbability();

	/**
	 * Sets the value of the '{@link sag.org.eclipse.hc.dtmc.Transition#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	void setProbability(double value);

} // Transition

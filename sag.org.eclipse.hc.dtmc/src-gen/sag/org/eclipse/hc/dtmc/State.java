/**
 */
package sag.org.eclipse.hc.dtmc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sag.org.eclipse.hc.dtmc.State#getLabel <em>Label</em>}</li>
 *   <li>{@link sag.org.eclipse.hc.dtmc.State#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @see sag.org.eclipse.hc.dtmc.DtmcPackage#getState()
 * @model
 * @generated
 */
public interface State extends Base {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see sag.org.eclipse.hc.dtmc.DtmcPackage#getState_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link sag.org.eclipse.hc.dtmc.State#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link sag.org.eclipse.hc.dtmc.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see sag.org.eclipse.hc.dtmc.DtmcPackage#getState_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

} // State

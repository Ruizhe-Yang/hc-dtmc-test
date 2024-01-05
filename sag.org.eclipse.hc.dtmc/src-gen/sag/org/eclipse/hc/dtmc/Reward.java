/**
 */
package sag.org.eclipse.hc.dtmc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reward</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sag.org.eclipse.hc.dtmc.Reward#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see sag.org.eclipse.hc.dtmc.DtmcPackage#getReward()
 * @model
 * @generated
 */
public interface Reward extends Base {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' reference list.
	 * The list contents are of type {@link sag.org.eclipse.hc.dtmc.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' reference list.
	 * @see sag.org.eclipse.hc.dtmc.DtmcPackage#getReward_Actions()
	 * @model
	 * @generated
	 */
	EList<Action> getActions();

} // Reward

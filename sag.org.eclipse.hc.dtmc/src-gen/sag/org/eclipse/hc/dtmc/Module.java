/**
 */
package sag.org.eclipse.hc.dtmc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sag.org.eclipse.hc.dtmc.Module#getDtmc <em>Dtmc</em>}</li>
 * </ul>
 *
 * @see sag.org.eclipse.hc.dtmc.DtmcPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends Base {
	/**
	 * Returns the value of the '<em><b>Dtmc</b></em>' containment reference list.
	 * The list contents are of type {@link sag.org.eclipse.hc.dtmc.Dtmc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dtmc</em>' containment reference list.
	 * @see sag.org.eclipse.hc.dtmc.DtmcPackage#getModule_Dtmc()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dtmc> getDtmc();

} // Module

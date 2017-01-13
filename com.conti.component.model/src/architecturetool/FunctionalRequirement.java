/**
 */
package architecturetool;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link architecturetool.FunctionalRequirement#getComponentinstance <em>Componentinstance</em>}</li>
 *   <li>{@link architecturetool.FunctionalRequirement#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see architecturetool.ArchitecturetoolPackage#getFunctionalRequirement()
 * @model
 * @generated
 */
public interface FunctionalRequirement extends EObject {
	/**
	 * Returns the value of the '<em><b>Componentinstance</b></em>' containment reference list.
	 * The list contents are of type {@link architecturetool.ComponentInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Componentinstance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Componentinstance</em>' containment reference list.
	 * @see architecturetool.ArchitecturetoolPackage#getFunctionalRequirement_Componentinstance()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentInstance> getComponentinstance();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see architecturetool.ArchitecturetoolPackage#getFunctionalRequirement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link architecturetool.FunctionalRequirement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // FunctionalRequirement

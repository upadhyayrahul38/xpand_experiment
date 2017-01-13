/**
 */
package architecturetool;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>No Name Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link architecturetool.NoNameElement#getMcc <em>Mcc</em>}</li>
 *   <li>{@link architecturetool.NoNameElement#getEcus <em>Ecus</em>}</li>
 *   <li>{@link architecturetool.NoNameElement#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see architecturetool.ArchitecturetoolPackage#getNoNameElement()
 * @model annotation="http://www.obeo.fr/dsl/dnc/archetype archetype='Description'"
 * @generated
 */
public interface NoNameElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Mcc</b></em>' containment reference list.
	 * The list contents are of type {@link architecturetool.MCC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mcc</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mcc</em>' containment reference list.
	 * @see architecturetool.ArchitecturetoolPackage#getNoNameElement_Mcc()
	 * @model containment="true"
	 * @generated
	 */
	EList<MCC> getMcc();

	/**
	 * Returns the value of the '<em><b>Ecus</b></em>' containment reference list.
	 * The list contents are of type {@link architecturetool.ECU}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecus</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecus</em>' containment reference list.
	 * @see architecturetool.ArchitecturetoolPackage#getNoNameElement_Ecus()
	 * @model containment="true"
	 * @generated
	 */
	EList<ECU> getEcus();

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
	 * @see architecturetool.ArchitecturetoolPackage#getNoNameElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link architecturetool.NoNameElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // NoNameElement

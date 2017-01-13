/**
 */
package architecturetool;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ECU</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link architecturetool.ECU#getCpus <em>Cpus</em>}</li>
 *   <li>{@link architecturetool.ECU#getFunctionalrequirements <em>Functionalrequirements</em>}</li>
 *   <li>{@link architecturetool.ECU#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see architecturetool.ArchitecturetoolPackage#getECU()
 * @model
 * @generated
 */
public interface ECU extends EObject {
	/**
	 * Returns the value of the '<em><b>Cpus</b></em>' containment reference list.
	 * The list contents are of type {@link architecturetool.CPU}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cpus</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpus</em>' containment reference list.
	 * @see architecturetool.ArchitecturetoolPackage#getECU_Cpus()
	 * @model containment="true"
	 * @generated
	 */
	EList<CPU> getCpus();

	/**
	 * Returns the value of the '<em><b>Functionalrequirements</b></em>' containment reference list.
	 * The list contents are of type {@link architecturetool.FunctionalRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functionalrequirements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functionalrequirements</em>' containment reference list.
	 * @see architecturetool.ArchitecturetoolPackage#getECU_Functionalrequirements()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionalRequirement> getFunctionalrequirements();

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
	 * @see architecturetool.ArchitecturetoolPackage#getECU_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link architecturetool.ECU#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ECU

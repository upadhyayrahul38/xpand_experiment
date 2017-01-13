/**
 */
package architecturetool;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link architecturetool.Memory#getMemorypartition <em>Memorypartition</em>}</li>
 *   <li>{@link architecturetool.Memory#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see architecturetool.ArchitecturetoolPackage#getMemory()
 * @model
 * @generated
 */
public interface Memory extends EObject {
	/**
	 * Returns the value of the '<em><b>Memorypartition</b></em>' containment reference list.
	 * The list contents are of type {@link architecturetool.MemoryPartition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memorypartition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memorypartition</em>' containment reference list.
	 * @see architecturetool.ArchitecturetoolPackage#getMemory_Memorypartition()
	 * @model containment="true"
	 * @generated
	 */
	EList<MemoryPartition> getMemorypartition();

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
	 * @see architecturetool.ArchitecturetoolPackage#getMemory_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link architecturetool.Memory#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Memory

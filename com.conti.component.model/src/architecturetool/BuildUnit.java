/**
 */
package architecturetool;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Build Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link architecturetool.BuildUnit#getMemorypartition <em>Memorypartition</em>}</li>
 *   <li>{@link architecturetool.BuildUnit#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see architecturetool.ArchitecturetoolPackage#getBuildUnit()
 * @model
 * @generated
 */
public interface BuildUnit extends EObject {
	/**
	 * Returns the value of the '<em><b>Memorypartition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memorypartition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memorypartition</em>' reference.
	 * @see #setMemorypartition(MemoryPartition)
	 * @see architecturetool.ArchitecturetoolPackage#getBuildUnit_Memorypartition()
	 * @model
	 * @generated
	 */
	MemoryPartition getMemorypartition();

	/**
	 * Sets the value of the '{@link architecturetool.BuildUnit#getMemorypartition <em>Memorypartition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memorypartition</em>' reference.
	 * @see #getMemorypartition()
	 * @generated
	 */
	void setMemorypartition(MemoryPartition value);

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
	 * @see architecturetool.ArchitecturetoolPackage#getBuildUnit_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link architecturetool.BuildUnit#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // BuildUnit

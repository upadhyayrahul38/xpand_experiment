/**
 */
package architecturetool;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OS Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link architecturetool.OSApplication#getTasks <em>Tasks</em>}</li>
 *   <li>{@link architecturetool.OSApplication#getIsr <em>Isr</em>}</li>
 *   <li>{@link architecturetool.OSApplication#getMemorypartition <em>Memorypartition</em>}</li>
 *   <li>{@link architecturetool.OSApplication#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see architecturetool.ArchitecturetoolPackage#getOSApplication()
 * @model
 * @generated
 */
public interface OSApplication extends EObject {
	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' reference list.
	 * The list contents are of type {@link architecturetool.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' reference list.
	 * @see architecturetool.ArchitecturetoolPackage#getOSApplication_Tasks()
	 * @model
	 * @generated
	 */
	EList<Task> getTasks();

	/**
	 * Returns the value of the '<em><b>Isr</b></em>' reference list.
	 * The list contents are of type {@link architecturetool.ISR}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Isr</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isr</em>' reference list.
	 * @see architecturetool.ArchitecturetoolPackage#getOSApplication_Isr()
	 * @model
	 * @generated
	 */
	EList<ISR> getIsr();

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
	 * @see architecturetool.ArchitecturetoolPackage#getOSApplication_Memorypartition()
	 * @model
	 * @generated
	 */
	MemoryPartition getMemorypartition();

	/**
	 * Sets the value of the '{@link architecturetool.OSApplication#getMemorypartition <em>Memorypartition</em>}' reference.
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
	 * @see architecturetool.ArchitecturetoolPackage#getOSApplication_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link architecturetool.OSApplication#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // OSApplication

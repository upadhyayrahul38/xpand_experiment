/**
 */
package architecturetool;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link architecturetool.Task#getRamSectionUsed <em>Ram Section Used</em>}</li>
 *   <li>{@link architecturetool.Task#getStack <em>Stack</em>}</li>
 *   <li>{@link architecturetool.Task#getStartupRunnables <em>Startup Runnables</em>}</li>
 *   <li>{@link architecturetool.Task#getRunnables <em>Runnables</em>}</li>
 *   <li>{@link architecturetool.Task#getShutdownRunnables <em>Shutdown Runnables</em>}</li>
 *   <li>{@link architecturetool.Task#getName <em>Name</em>}</li>
 *   <li>{@link architecturetool.Task#getRuntime <em>Runtime</em>}</li>
 *   <li>{@link architecturetool.Task#getMemorypartition <em>Memorypartition</em>}</li>
 * </ul>
 *
 * @see architecturetool.ArchitecturetoolPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends EObject {
	/**
	 * Returns the value of the '<em><b>Ram Section Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ram Section Used</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ram Section Used</em>' attribute.
	 * @see #setRamSectionUsed(String)
	 * @see architecturetool.ArchitecturetoolPackage#getTask_RamSectionUsed()
	 * @model required="true"
	 * @generated
	 */
	String getRamSectionUsed();

	/**
	 * Sets the value of the '{@link architecturetool.Task#getRamSectionUsed <em>Ram Section Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ram Section Used</em>' attribute.
	 * @see #getRamSectionUsed()
	 * @generated
	 */
	void setRamSectionUsed(String value);

	/**
	 * Returns the value of the '<em><b>Stack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stack</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stack</em>' attribute.
	 * @see #setStack(int)
	 * @see architecturetool.ArchitecturetoolPackage#getTask_Stack()
	 * @model dataType="architecturetool.StackInt" required="true"
	 * @generated
	 */
	int getStack();

	/**
	 * Sets the value of the '{@link architecturetool.Task#getStack <em>Stack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stack</em>' attribute.
	 * @see #getStack()
	 * @generated
	 */
	void setStack(int value);

	/**
	 * Returns the value of the '<em><b>Startup Runnables</b></em>' reference list.
	 * The list contents are of type {@link architecturetool.Runnable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Startup Runnables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Startup Runnables</em>' reference list.
	 * @see architecturetool.ArchitecturetoolPackage#getTask_StartupRunnables()
	 * @model
	 * @generated
	 */
	EList<architecturetool.Runnable> getStartupRunnables();

	/**
	 * Returns the value of the '<em><b>Runnables</b></em>' reference list.
	 * The list contents are of type {@link architecturetool.Runnable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runnables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runnables</em>' reference list.
	 * @see architecturetool.ArchitecturetoolPackage#getTask_Runnables()
	 * @model
	 * @generated
	 */
	EList<architecturetool.Runnable> getRunnables();

	/**
	 * Returns the value of the '<em><b>Shutdown Runnables</b></em>' reference list.
	 * The list contents are of type {@link architecturetool.Runnable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shutdown Runnables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shutdown Runnables</em>' reference list.
	 * @see architecturetool.ArchitecturetoolPackage#getTask_ShutdownRunnables()
	 * @model
	 * @generated
	 */
	EList<architecturetool.Runnable> getShutdownRunnables();

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
	 * @see architecturetool.ArchitecturetoolPackage#getTask_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link architecturetool.Task#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Runtime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runtime</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime</em>' attribute.
	 * @see #setRuntime(int)
	 * @see architecturetool.ArchitecturetoolPackage#getTask_Runtime()
	 * @model required="true"
	 * @generated
	 */
	int getRuntime();

	/**
	 * Sets the value of the '{@link architecturetool.Task#getRuntime <em>Runtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime</em>' attribute.
	 * @see #getRuntime()
	 * @generated
	 */
	void setRuntime(int value);

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
	 * @see architecturetool.ArchitecturetoolPackage#getTask_Memorypartition()
	 * @model
	 * @generated
	 */
	MemoryPartition getMemorypartition();

	/**
	 * Sets the value of the '{@link architecturetool.Task#getMemorypartition <em>Memorypartition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memorypartition</em>' reference.
	 * @see #getMemorypartition()
	 * @generated
	 */
	void setMemorypartition(MemoryPartition value);

} // Task

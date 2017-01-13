/**
 */
package architecturetool;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Budget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link architecturetool.ResourceBudget#getRuntimebudget <em>Runtimebudget</em>}</li>
 *   <li>{@link architecturetool.ResourceBudget#getMemorybudget <em>Memorybudget</em>}</li>
 *   <li>{@link architecturetool.ResourceBudget#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see architecturetool.ArchitecturetoolPackage#getResourceBudget()
 * @model
 * @generated
 */
public interface ResourceBudget extends EObject {
	/**
	 * Returns the value of the '<em><b>Runtimebudget</b></em>' containment reference list.
	 * The list contents are of type {@link architecturetool.RuntimeBudget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runtimebudget</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtimebudget</em>' containment reference list.
	 * @see architecturetool.ArchitecturetoolPackage#getResourceBudget_Runtimebudget()
	 * @model containment="true"
	 * @generated
	 */
	EList<RuntimeBudget> getRuntimebudget();

	/**
	 * Returns the value of the '<em><b>Memorybudget</b></em>' containment reference list.
	 * The list contents are of type {@link architecturetool.MemoryBudget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memorybudget</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memorybudget</em>' containment reference list.
	 * @see architecturetool.ArchitecturetoolPackage#getResourceBudget_Memorybudget()
	 * @model containment="true"
	 * @generated
	 */
	EList<MemoryBudget> getMemorybudget();

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
	 * @see architecturetool.ArchitecturetoolPackage#getResourceBudget_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link architecturetool.ResourceBudget#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ResourceBudget

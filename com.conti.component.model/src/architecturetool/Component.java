/**
 */
package architecturetool;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link architecturetool.Component#getItsRunnable <em>Its Runnable</em>}</li>
 *   <li>{@link architecturetool.Component#getName <em>Name</em>}</li>
 *   <li>{@link architecturetool.Component#getSubcomponent <em>Subcomponent</em>}</li>
 *   <li>{@link architecturetool.Component#getPort <em>Port</em>}</li>
 *   <li>{@link architecturetool.Component#isExternalStaticMemUsed <em>External Static Mem Used</em>}</li>
 *   <li>{@link architecturetool.Component#getStructs <em>Structs</em>}</li>
 * </ul>
 *
 * @see architecturetool.ArchitecturetoolPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends EObject {
	/**
	 * Returns the value of the '<em><b>Its Runnable</b></em>' containment reference list.
	 * The list contents are of type {@link architecturetool.Runnable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Runnable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Runnable</em>' containment reference list.
	 * @see architecturetool.ArchitecturetoolPackage#getComponent_ItsRunnable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<architecturetool.Runnable> getItsRunnable();

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
	 * @see architecturetool.ArchitecturetoolPackage#getComponent_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link architecturetool.Component#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Subcomponent</b></em>' containment reference list.
	 * The list contents are of type {@link architecturetool.SubComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subcomponent</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subcomponent</em>' containment reference list.
	 * @see architecturetool.ArchitecturetoolPackage#getComponent_Subcomponent()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubComponent> getSubcomponent();

	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference list.
	 * The list contents are of type {@link architecturetool.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference list.
	 * @see architecturetool.ArchitecturetoolPackage#getComponent_Port()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Port> getPort();

	/**
	 * Returns the value of the '<em><b>External Static Mem Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Static Mem Used</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Static Mem Used</em>' attribute.
	 * @see #setExternalStaticMemUsed(boolean)
	 * @see architecturetool.ArchitecturetoolPackage#getComponent_ExternalStaticMemUsed()
	 * @model
	 * @generated
	 */
	boolean isExternalStaticMemUsed();

	/**
	 * Sets the value of the '{@link architecturetool.Component#isExternalStaticMemUsed <em>External Static Mem Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Static Mem Used</em>' attribute.
	 * @see #isExternalStaticMemUsed()
	 * @generated
	 */
	void setExternalStaticMemUsed(boolean value);

	/**
	 * Returns the value of the '<em><b>Structs</b></em>' containment reference list.
	 * The list contents are of type {@link architecturetool.DataStructure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structs</em>' containment reference list.
	 * @see architecturetool.ArchitecturetoolPackage#getComponent_Structs()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataStructure> getStructs();

} // Component

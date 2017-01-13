/**
 */
package architecturetool;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link architecturetool.Node#getTask <em>Task</em>}</li>
 *   <li>{@link architecturetool.Node#getName <em>Name</em>}</li>
 *   <li>{@link architecturetool.Node#getComponentinstance <em>Componentinstance</em>}</li>
 *   <li>{@link architecturetool.Node#getBuildunits <em>Buildunits</em>}</li>
 *   <li>{@link architecturetool.Node#getOsapplications <em>Osapplications</em>}</li>
 *   <li>{@link architecturetool.Node#getIsr <em>Isr</em>}</li>
 *   <li>{@link architecturetool.Node#getMemory <em>Memory</em>}</li>
 * </ul>
 *
 * @see architecturetool.ArchitecturetoolPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Task</b></em>' containment reference list.
	 * The list contents are of type {@link architecturetool.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' containment reference list.
	 * @see architecturetool.ArchitecturetoolPackage#getNode_Task()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Task> getTask();

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
	 * @see architecturetool.ArchitecturetoolPackage#getNode_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link architecturetool.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Componentinstance</b></em>' reference list.
	 * The list contents are of type {@link architecturetool.ComponentInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Componentinstance</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Componentinstance</em>' reference list.
	 * @see architecturetool.ArchitecturetoolPackage#getNode_Componentinstance()
	 * @model
	 * @generated
	 */
	EList<ComponentInstance> getComponentinstance();

	/**
	 * Returns the value of the '<em><b>Buildunits</b></em>' containment reference list.
	 * The list contents are of type {@link architecturetool.BuildUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buildunits</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buildunits</em>' containment reference list.
	 * @see architecturetool.ArchitecturetoolPackage#getNode_Buildunits()
	 * @model containment="true"
	 * @generated
	 */
	EList<BuildUnit> getBuildunits();

	/**
	 * Returns the value of the '<em><b>Osapplications</b></em>' containment reference list.
	 * The list contents are of type {@link architecturetool.OSApplication}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Osapplications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Osapplications</em>' containment reference list.
	 * @see architecturetool.ArchitecturetoolPackage#getNode_Osapplications()
	 * @model containment="true"
	 * @generated
	 */
	EList<OSApplication> getOsapplications();

	/**
	 * Returns the value of the '<em><b>Isr</b></em>' containment reference list.
	 * The list contents are of type {@link architecturetool.ISR}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Isr</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isr</em>' containment reference list.
	 * @see architecturetool.ArchitecturetoolPackage#getNode_Isr()
	 * @model containment="true"
	 * @generated
	 */
	EList<ISR> getIsr();

	/**
	 * Returns the value of the '<em><b>Memory</b></em>' reference list.
	 * The list contents are of type {@link architecturetool.Memory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory</em>' reference list.
	 * @see architecturetool.ArchitecturetoolPackage#getNode_Memory()
	 * @model
	 * @generated
	 */
	EList<Memory> getMemory();

} // Node

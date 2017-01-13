/**
 */
package architecturetool;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link architecturetool.ComponentInstance#getRam <em>Ram</em>}</li>
 *   <li>{@link architecturetool.ComponentInstance#getRamSection <em>Ram Section</em>}</li>
 *   <li>{@link architecturetool.ComponentInstance#getRom <em>Rom</em>}</li>
 *   <li>{@link architecturetool.ComponentInstance#getNmv <em>Nmv</em>}</li>
 *   <li>{@link architecturetool.ComponentInstance#getMeas <em>Meas</em>}</li>
 *   <li>{@link architecturetool.ComponentInstance#getType <em>Type</em>}</li>
 *   <li>{@link architecturetool.ComponentInstance#getOwner <em>Owner</em>}</li>
 *   <li>{@link architecturetool.ComponentInstance#getName <em>Name</em>}</li>
 *   <li>{@link architecturetool.ComponentInstance#getComponent <em>Component</em>}</li>
 *   <li>{@link architecturetool.ComponentInstance#getResourcebudget <em>Resourcebudget</em>}</li>
 *   <li>{@link architecturetool.ComponentInstance#getBuildunits <em>Buildunits</em>}</li>
 * </ul>
 *
 * @see architecturetool.ArchitecturetoolPackage#getComponentInstance()
 * @model
 * @generated
 */
public interface ComponentInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Ram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ram</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ram</em>' attribute.
	 * @see #setRam(double)
	 * @see architecturetool.ArchitecturetoolPackage#getComponentInstance_Ram()
	 * @model required="true"
	 * @generated
	 */
	double getRam();

	/**
	 * Sets the value of the '{@link architecturetool.ComponentInstance#getRam <em>Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ram</em>' attribute.
	 * @see #getRam()
	 * @generated
	 */
	void setRam(double value);

	/**
	 * Returns the value of the '<em><b>Ram Section</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ram Section</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ram Section</em>' attribute.
	 * @see #setRamSection(String)
	 * @see architecturetool.ArchitecturetoolPackage#getComponentInstance_RamSection()
	 * @model required="true"
	 * @generated
	 */
	String getRamSection();

	/**
	 * Sets the value of the '{@link architecturetool.ComponentInstance#getRamSection <em>Ram Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ram Section</em>' attribute.
	 * @see #getRamSection()
	 * @generated
	 */
	void setRamSection(String value);

	/**
	 * Returns the value of the '<em><b>Rom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rom</em>' attribute.
	 * @see #setRom(int)
	 * @see architecturetool.ArchitecturetoolPackage#getComponentInstance_Rom()
	 * @model required="true"
	 * @generated
	 */
	int getRom();

	/**
	 * Sets the value of the '{@link architecturetool.ComponentInstance#getRom <em>Rom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rom</em>' attribute.
	 * @see #getRom()
	 * @generated
	 */
	void setRom(int value);

	/**
	 * Returns the value of the '<em><b>Nmv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nmv</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nmv</em>' attribute.
	 * @see #setNmv(double)
	 * @see architecturetool.ArchitecturetoolPackage#getComponentInstance_Nmv()
	 * @model required="true"
	 * @generated
	 */
	double getNmv();

	/**
	 * Sets the value of the '{@link architecturetool.ComponentInstance#getNmv <em>Nmv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nmv</em>' attribute.
	 * @see #getNmv()
	 * @generated
	 */
	void setNmv(double value);

	/**
	 * Returns the value of the '<em><b>Meas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meas</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meas</em>' attribute.
	 * @see #setMeas(double)
	 * @see architecturetool.ArchitecturetoolPackage#getComponentInstance_Meas()
	 * @model required="true"
	 * @generated
	 */
	double getMeas();

	/**
	 * Sets the value of the '{@link architecturetool.ComponentInstance#getMeas <em>Meas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meas</em>' attribute.
	 * @see #getMeas()
	 * @generated
	 */
	void setMeas(double value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see architecturetool.ArchitecturetoolPackage#getComponentInstance_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link architecturetool.ComponentInstance#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' attribute.
	 * @see #setOwner(String)
	 * @see architecturetool.ArchitecturetoolPackage#getComponentInstance_Owner()
	 * @model required="true"
	 * @generated
	 */
	String getOwner();

	/**
	 * Sets the value of the '{@link architecturetool.ComponentInstance#getOwner <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' attribute.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(String value);

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
	 * @see architecturetool.ArchitecturetoolPackage#getComponentInstance_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link architecturetool.ComponentInstance#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(Component)
	 * @see architecturetool.ArchitecturetoolPackage#getComponentInstance_Component()
	 * @model
	 * @generated
	 */
	Component getComponent();

	/**
	 * Sets the value of the '{@link architecturetool.ComponentInstance#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(Component value);

	/**
	 * Returns the value of the '<em><b>Resourcebudget</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resourcebudget</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resourcebudget</em>' containment reference.
	 * @see #setResourcebudget(ResourceBudget)
	 * @see architecturetool.ArchitecturetoolPackage#getComponentInstance_Resourcebudget()
	 * @model containment="true"
	 * @generated
	 */
	ResourceBudget getResourcebudget();

	/**
	 * Sets the value of the '{@link architecturetool.ComponentInstance#getResourcebudget <em>Resourcebudget</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resourcebudget</em>' containment reference.
	 * @see #getResourcebudget()
	 * @generated
	 */
	void setResourcebudget(ResourceBudget value);

	/**
	 * Returns the value of the '<em><b>Buildunits</b></em>' reference list.
	 * The list contents are of type {@link architecturetool.BuildUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buildunits</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buildunits</em>' reference list.
	 * @see architecturetool.ArchitecturetoolPackage#getComponentInstance_Buildunits()
	 * @model
	 * @generated
	 */
	EList<BuildUnit> getBuildunits();

} // ComponentInstance

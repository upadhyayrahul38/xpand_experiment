/**
 */
package architecturetool;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runnable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link architecturetool.Runnable#getHowToBecalledBehaviour <em>How To Becalled Behaviour</em>}</li>
 *   <li>{@link architecturetool.Runnable#getNeededRunTimeAvg <em>Needed Run Time Avg</em>}</li>
 *   <li>{@link architecturetool.Runnable#getNeededRunTimeMax <em>Needed Run Time Max</em>}</li>
 *   <li>{@link architecturetool.Runnable#getNeedAccelerator <em>Need Accelerator</em>}</li>
 *   <li>{@link architecturetool.Runnable#getName <em>Name</em>}</li>
 *   <li>{@link architecturetool.Runnable#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @see architecturetool.ArchitecturetoolPackage#getRunnable()
 * @model
 * @generated
 */
public interface Runnable extends EObject {
	/**
	 * Returns the value of the '<em><b>How To Becalled Behaviour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>How To Becalled Behaviour</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>How To Becalled Behaviour</em>' attribute.
	 * @see #setHowToBecalledBehaviour(int)
	 * @see architecturetool.ArchitecturetoolPackage#getRunnable_HowToBecalledBehaviour()
	 * @model required="true"
	 * @generated
	 */
	int getHowToBecalledBehaviour();

	/**
	 * Sets the value of the '{@link architecturetool.Runnable#getHowToBecalledBehaviour <em>How To Becalled Behaviour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>How To Becalled Behaviour</em>' attribute.
	 * @see #getHowToBecalledBehaviour()
	 * @generated
	 */
	void setHowToBecalledBehaviour(int value);

	/**
	 * Returns the value of the '<em><b>Needed Run Time Avg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Needed Run Time Avg</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Needed Run Time Avg</em>' attribute.
	 * @see #setNeededRunTimeAvg(int)
	 * @see architecturetool.ArchitecturetoolPackage#getRunnable_NeededRunTimeAvg()
	 * @model required="true"
	 * @generated
	 */
	int getNeededRunTimeAvg();

	/**
	 * Sets the value of the '{@link architecturetool.Runnable#getNeededRunTimeAvg <em>Needed Run Time Avg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Needed Run Time Avg</em>' attribute.
	 * @see #getNeededRunTimeAvg()
	 * @generated
	 */
	void setNeededRunTimeAvg(int value);

	/**
	 * Returns the value of the '<em><b>Needed Run Time Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Needed Run Time Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Needed Run Time Max</em>' attribute.
	 * @see #setNeededRunTimeMax(int)
	 * @see architecturetool.ArchitecturetoolPackage#getRunnable_NeededRunTimeMax()
	 * @model required="true"
	 * @generated
	 */
	int getNeededRunTimeMax();

	/**
	 * Sets the value of the '{@link architecturetool.Runnable#getNeededRunTimeMax <em>Needed Run Time Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Needed Run Time Max</em>' attribute.
	 * @see #getNeededRunTimeMax()
	 * @generated
	 */
	void setNeededRunTimeMax(int value);

	/**
	 * Returns the value of the '<em><b>Need Accelerator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Need Accelerator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Need Accelerator</em>' attribute.
	 * @see #setNeedAccelerator(int)
	 * @see architecturetool.ArchitecturetoolPackage#getRunnable_NeedAccelerator()
	 * @model required="true"
	 * @generated
	 */
	int getNeedAccelerator();

	/**
	 * Sets the value of the '{@link architecturetool.Runnable#getNeedAccelerator <em>Need Accelerator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Need Accelerator</em>' attribute.
	 * @see #getNeedAccelerator()
	 * @generated
	 */
	void setNeedAccelerator(int value);

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
	 * @see architecturetool.ArchitecturetoolPackage#getRunnable_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link architecturetool.Runnable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' reference list.
	 * The list contents are of type {@link architecturetool.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' reference list.
	 * @see architecturetool.ArchitecturetoolPackage#getRunnable_Ports()
	 * @model
	 * @generated
	 */
	EList<Port> getPorts();

} // Runnable

/**
 */
package architecturetool.impl;

import architecturetool.ArchitecturetoolPackage;
import architecturetool.ISR;
import architecturetool.MemoryPartition;
import architecturetool.OSApplication;
import architecturetool.Task;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OS Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link architecturetool.impl.OSApplicationImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link architecturetool.impl.OSApplicationImpl#getIsr <em>Isr</em>}</li>
 *   <li>{@link architecturetool.impl.OSApplicationImpl#getMemorypartition <em>Memorypartition</em>}</li>
 *   <li>{@link architecturetool.impl.OSApplicationImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OSApplicationImpl extends MinimalEObjectImpl.Container implements OSApplication {
	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> tasks;

	/**
	 * The cached value of the '{@link #getIsr() <em>Isr</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsr()
	 * @generated
	 * @ordered
	 */
	protected EList<ISR> isr;

	/**
	 * The cached value of the '{@link #getMemorypartition() <em>Memorypartition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemorypartition()
	 * @generated
	 * @ordered
	 */
	protected MemoryPartition memorypartition;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OSApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturetoolPackage.Literals.OS_APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTasks() {
		if (tasks == null) {
			tasks = new EObjectResolvingEList<Task>(Task.class, this, ArchitecturetoolPackage.OS_APPLICATION__TASKS);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ISR> getIsr() {
		if (isr == null) {
			isr = new EObjectResolvingEList<ISR>(ISR.class, this, ArchitecturetoolPackage.OS_APPLICATION__ISR);
		}
		return isr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryPartition getMemorypartition() {
		if (memorypartition != null && memorypartition.eIsProxy()) {
			InternalEObject oldMemorypartition = (InternalEObject)memorypartition;
			memorypartition = (MemoryPartition)eResolveProxy(oldMemorypartition);
			if (memorypartition != oldMemorypartition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchitecturetoolPackage.OS_APPLICATION__MEMORYPARTITION, oldMemorypartition, memorypartition));
			}
		}
		return memorypartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryPartition basicGetMemorypartition() {
		return memorypartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemorypartition(MemoryPartition newMemorypartition) {
		MemoryPartition oldMemorypartition = memorypartition;
		memorypartition = newMemorypartition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturetoolPackage.OS_APPLICATION__MEMORYPARTITION, oldMemorypartition, memorypartition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturetoolPackage.OS_APPLICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArchitecturetoolPackage.OS_APPLICATION__TASKS:
				return getTasks();
			case ArchitecturetoolPackage.OS_APPLICATION__ISR:
				return getIsr();
			case ArchitecturetoolPackage.OS_APPLICATION__MEMORYPARTITION:
				if (resolve) return getMemorypartition();
				return basicGetMemorypartition();
			case ArchitecturetoolPackage.OS_APPLICATION__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ArchitecturetoolPackage.OS_APPLICATION__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends Task>)newValue);
				return;
			case ArchitecturetoolPackage.OS_APPLICATION__ISR:
				getIsr().clear();
				getIsr().addAll((Collection<? extends ISR>)newValue);
				return;
			case ArchitecturetoolPackage.OS_APPLICATION__MEMORYPARTITION:
				setMemorypartition((MemoryPartition)newValue);
				return;
			case ArchitecturetoolPackage.OS_APPLICATION__NAME:
				setName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ArchitecturetoolPackage.OS_APPLICATION__TASKS:
				getTasks().clear();
				return;
			case ArchitecturetoolPackage.OS_APPLICATION__ISR:
				getIsr().clear();
				return;
			case ArchitecturetoolPackage.OS_APPLICATION__MEMORYPARTITION:
				setMemorypartition((MemoryPartition)null);
				return;
			case ArchitecturetoolPackage.OS_APPLICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ArchitecturetoolPackage.OS_APPLICATION__TASKS:
				return tasks != null && !tasks.isEmpty();
			case ArchitecturetoolPackage.OS_APPLICATION__ISR:
				return isr != null && !isr.isEmpty();
			case ArchitecturetoolPackage.OS_APPLICATION__MEMORYPARTITION:
				return memorypartition != null;
			case ArchitecturetoolPackage.OS_APPLICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //OSApplicationImpl

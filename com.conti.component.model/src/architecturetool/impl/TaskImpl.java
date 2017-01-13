/**
 */
package architecturetool.impl;

import architecturetool.ArchitecturetoolPackage;
import architecturetool.MemoryPartition;
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
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link architecturetool.impl.TaskImpl#getRamSectionUsed <em>Ram Section Used</em>}</li>
 *   <li>{@link architecturetool.impl.TaskImpl#getStack <em>Stack</em>}</li>
 *   <li>{@link architecturetool.impl.TaskImpl#getStartupRunnables <em>Startup Runnables</em>}</li>
 *   <li>{@link architecturetool.impl.TaskImpl#getRunnables <em>Runnables</em>}</li>
 *   <li>{@link architecturetool.impl.TaskImpl#getShutdownRunnables <em>Shutdown Runnables</em>}</li>
 *   <li>{@link architecturetool.impl.TaskImpl#getName <em>Name</em>}</li>
 *   <li>{@link architecturetool.impl.TaskImpl#getRuntime <em>Runtime</em>}</li>
 *   <li>{@link architecturetool.impl.TaskImpl#getMemorypartition <em>Memorypartition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends MinimalEObjectImpl.Container implements Task {
	/**
	 * The default value of the '{@link #getRamSectionUsed() <em>Ram Section Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRamSectionUsed()
	 * @generated
	 * @ordered
	 */
	protected static final String RAM_SECTION_USED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRamSectionUsed() <em>Ram Section Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRamSectionUsed()
	 * @generated
	 * @ordered
	 */
	protected String ramSectionUsed = RAM_SECTION_USED_EDEFAULT;

	/**
	 * The default value of the '{@link #getStack() <em>Stack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStack()
	 * @generated
	 * @ordered
	 */
	protected static final int STACK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStack() <em>Stack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStack()
	 * @generated
	 * @ordered
	 */
	protected int stack = STACK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStartupRunnables() <em>Startup Runnables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartupRunnables()
	 * @generated
	 * @ordered
	 */
	protected EList<architecturetool.Runnable> startupRunnables;

	/**
	 * The cached value of the '{@link #getRunnables() <em>Runnables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunnables()
	 * @generated
	 * @ordered
	 */
	protected EList<architecturetool.Runnable> runnables;

	/**
	 * The cached value of the '{@link #getShutdownRunnables() <em>Shutdown Runnables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShutdownRunnables()
	 * @generated
	 * @ordered
	 */
	protected EList<architecturetool.Runnable> shutdownRunnables;

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
	 * The default value of the '{@link #getRuntime() <em>Runtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntime()
	 * @generated
	 * @ordered
	 */
	protected static final int RUNTIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRuntime() <em>Runtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntime()
	 * @generated
	 * @ordered
	 */
	protected int runtime = RUNTIME_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturetoolPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRamSectionUsed() {
		return ramSectionUsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRamSectionUsed(String newRamSectionUsed) {
		String oldRamSectionUsed = ramSectionUsed;
		ramSectionUsed = newRamSectionUsed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturetoolPackage.TASK__RAM_SECTION_USED, oldRamSectionUsed, ramSectionUsed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStack() {
		return stack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStack(int newStack) {
		int oldStack = stack;
		stack = newStack;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturetoolPackage.TASK__STACK, oldStack, stack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<architecturetool.Runnable> getStartupRunnables() {
		if (startupRunnables == null) {
			startupRunnables = new EObjectResolvingEList<architecturetool.Runnable>(architecturetool.Runnable.class, this, ArchitecturetoolPackage.TASK__STARTUP_RUNNABLES);
		}
		return startupRunnables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<architecturetool.Runnable> getRunnables() {
		if (runnables == null) {
			runnables = new EObjectResolvingEList<architecturetool.Runnable>(architecturetool.Runnable.class, this, ArchitecturetoolPackage.TASK__RUNNABLES);
		}
		return runnables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<architecturetool.Runnable> getShutdownRunnables() {
		if (shutdownRunnables == null) {
			shutdownRunnables = new EObjectResolvingEList<architecturetool.Runnable>(architecturetool.Runnable.class, this, ArchitecturetoolPackage.TASK__SHUTDOWN_RUNNABLES);
		}
		return shutdownRunnables;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturetoolPackage.TASK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRuntime() {
		return runtime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuntime(int newRuntime) {
		int oldRuntime = runtime;
		runtime = newRuntime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturetoolPackage.TASK__RUNTIME, oldRuntime, runtime));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchitecturetoolPackage.TASK__MEMORYPARTITION, oldMemorypartition, memorypartition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturetoolPackage.TASK__MEMORYPARTITION, oldMemorypartition, memorypartition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArchitecturetoolPackage.TASK__RAM_SECTION_USED:
				return getRamSectionUsed();
			case ArchitecturetoolPackage.TASK__STACK:
				return getStack();
			case ArchitecturetoolPackage.TASK__STARTUP_RUNNABLES:
				return getStartupRunnables();
			case ArchitecturetoolPackage.TASK__RUNNABLES:
				return getRunnables();
			case ArchitecturetoolPackage.TASK__SHUTDOWN_RUNNABLES:
				return getShutdownRunnables();
			case ArchitecturetoolPackage.TASK__NAME:
				return getName();
			case ArchitecturetoolPackage.TASK__RUNTIME:
				return getRuntime();
			case ArchitecturetoolPackage.TASK__MEMORYPARTITION:
				if (resolve) return getMemorypartition();
				return basicGetMemorypartition();
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
			case ArchitecturetoolPackage.TASK__RAM_SECTION_USED:
				setRamSectionUsed((String)newValue);
				return;
			case ArchitecturetoolPackage.TASK__STACK:
				setStack((Integer)newValue);
				return;
			case ArchitecturetoolPackage.TASK__STARTUP_RUNNABLES:
				getStartupRunnables().clear();
				getStartupRunnables().addAll((Collection<? extends architecturetool.Runnable>)newValue);
				return;
			case ArchitecturetoolPackage.TASK__RUNNABLES:
				getRunnables().clear();
				getRunnables().addAll((Collection<? extends architecturetool.Runnable>)newValue);
				return;
			case ArchitecturetoolPackage.TASK__SHUTDOWN_RUNNABLES:
				getShutdownRunnables().clear();
				getShutdownRunnables().addAll((Collection<? extends architecturetool.Runnable>)newValue);
				return;
			case ArchitecturetoolPackage.TASK__NAME:
				setName((String)newValue);
				return;
			case ArchitecturetoolPackage.TASK__RUNTIME:
				setRuntime((Integer)newValue);
				return;
			case ArchitecturetoolPackage.TASK__MEMORYPARTITION:
				setMemorypartition((MemoryPartition)newValue);
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
			case ArchitecturetoolPackage.TASK__RAM_SECTION_USED:
				setRamSectionUsed(RAM_SECTION_USED_EDEFAULT);
				return;
			case ArchitecturetoolPackage.TASK__STACK:
				setStack(STACK_EDEFAULT);
				return;
			case ArchitecturetoolPackage.TASK__STARTUP_RUNNABLES:
				getStartupRunnables().clear();
				return;
			case ArchitecturetoolPackage.TASK__RUNNABLES:
				getRunnables().clear();
				return;
			case ArchitecturetoolPackage.TASK__SHUTDOWN_RUNNABLES:
				getShutdownRunnables().clear();
				return;
			case ArchitecturetoolPackage.TASK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ArchitecturetoolPackage.TASK__RUNTIME:
				setRuntime(RUNTIME_EDEFAULT);
				return;
			case ArchitecturetoolPackage.TASK__MEMORYPARTITION:
				setMemorypartition((MemoryPartition)null);
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
			case ArchitecturetoolPackage.TASK__RAM_SECTION_USED:
				return RAM_SECTION_USED_EDEFAULT == null ? ramSectionUsed != null : !RAM_SECTION_USED_EDEFAULT.equals(ramSectionUsed);
			case ArchitecturetoolPackage.TASK__STACK:
				return stack != STACK_EDEFAULT;
			case ArchitecturetoolPackage.TASK__STARTUP_RUNNABLES:
				return startupRunnables != null && !startupRunnables.isEmpty();
			case ArchitecturetoolPackage.TASK__RUNNABLES:
				return runnables != null && !runnables.isEmpty();
			case ArchitecturetoolPackage.TASK__SHUTDOWN_RUNNABLES:
				return shutdownRunnables != null && !shutdownRunnables.isEmpty();
			case ArchitecturetoolPackage.TASK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ArchitecturetoolPackage.TASK__RUNTIME:
				return runtime != RUNTIME_EDEFAULT;
			case ArchitecturetoolPackage.TASK__MEMORYPARTITION:
				return memorypartition != null;
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
		result.append(" (ramSectionUsed: ");
		result.append(ramSectionUsed);
		result.append(", stack: ");
		result.append(stack);
		result.append(", name: ");
		result.append(name);
		result.append(", runtime: ");
		result.append(runtime);
		result.append(')');
		return result.toString();
	}

} //TaskImpl

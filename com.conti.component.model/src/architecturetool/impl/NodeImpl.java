/**
 */
package architecturetool.impl;

import architecturetool.ArchitecturetoolPackage;
import architecturetool.BuildUnit;
import architecturetool.ComponentInstance;
import architecturetool.ISR;
import architecturetool.Memory;
import architecturetool.Node;
import architecturetool.OSApplication;
import architecturetool.Task;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link architecturetool.impl.NodeImpl#getTask <em>Task</em>}</li>
 *   <li>{@link architecturetool.impl.NodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link architecturetool.impl.NodeImpl#getComponentinstance <em>Componentinstance</em>}</li>
 *   <li>{@link architecturetool.impl.NodeImpl#getBuildunits <em>Buildunits</em>}</li>
 *   <li>{@link architecturetool.impl.NodeImpl#getOsapplications <em>Osapplications</em>}</li>
 *   <li>{@link architecturetool.impl.NodeImpl#getIsr <em>Isr</em>}</li>
 *   <li>{@link architecturetool.impl.NodeImpl#getMemory <em>Memory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends MinimalEObjectImpl.Container implements Node {
	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> task;

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
	 * The cached value of the '{@link #getComponentinstance() <em>Componentinstance</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentinstance()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentInstance> componentinstance;

	/**
	 * The cached value of the '{@link #getBuildunits() <em>Buildunits</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildunits()
	 * @generated
	 * @ordered
	 */
	protected EList<BuildUnit> buildunits;

	/**
	 * The cached value of the '{@link #getOsapplications() <em>Osapplications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsapplications()
	 * @generated
	 * @ordered
	 */
	protected EList<OSApplication> osapplications;

	/**
	 * The cached value of the '{@link #getIsr() <em>Isr</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsr()
	 * @generated
	 * @ordered
	 */
	protected EList<ISR> isr;

	/**
	 * The cached value of the '{@link #getMemory() <em>Memory</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory()
	 * @generated
	 * @ordered
	 */
	protected EList<Memory> memory;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturetoolPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTask() {
		if (task == null) {
			task = new EObjectContainmentEList<Task>(Task.class, this, ArchitecturetoolPackage.NODE__TASK);
		}
		return task;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturetoolPackage.NODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentInstance> getComponentinstance() {
		if (componentinstance == null) {
			componentinstance = new EObjectResolvingEList<ComponentInstance>(ComponentInstance.class, this, ArchitecturetoolPackage.NODE__COMPONENTINSTANCE);
		}
		return componentinstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BuildUnit> getBuildunits() {
		if (buildunits == null) {
			buildunits = new EObjectContainmentEList<BuildUnit>(BuildUnit.class, this, ArchitecturetoolPackage.NODE__BUILDUNITS);
		}
		return buildunits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OSApplication> getOsapplications() {
		if (osapplications == null) {
			osapplications = new EObjectContainmentEList<OSApplication>(OSApplication.class, this, ArchitecturetoolPackage.NODE__OSAPPLICATIONS);
		}
		return osapplications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ISR> getIsr() {
		if (isr == null) {
			isr = new EObjectContainmentEList<ISR>(ISR.class, this, ArchitecturetoolPackage.NODE__ISR);
		}
		return isr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Memory> getMemory() {
		if (memory == null) {
			memory = new EObjectResolvingEList<Memory>(Memory.class, this, ArchitecturetoolPackage.NODE__MEMORY);
		}
		return memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArchitecturetoolPackage.NODE__TASK:
				return ((InternalEList<?>)getTask()).basicRemove(otherEnd, msgs);
			case ArchitecturetoolPackage.NODE__BUILDUNITS:
				return ((InternalEList<?>)getBuildunits()).basicRemove(otherEnd, msgs);
			case ArchitecturetoolPackage.NODE__OSAPPLICATIONS:
				return ((InternalEList<?>)getOsapplications()).basicRemove(otherEnd, msgs);
			case ArchitecturetoolPackage.NODE__ISR:
				return ((InternalEList<?>)getIsr()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArchitecturetoolPackage.NODE__TASK:
				return getTask();
			case ArchitecturetoolPackage.NODE__NAME:
				return getName();
			case ArchitecturetoolPackage.NODE__COMPONENTINSTANCE:
				return getComponentinstance();
			case ArchitecturetoolPackage.NODE__BUILDUNITS:
				return getBuildunits();
			case ArchitecturetoolPackage.NODE__OSAPPLICATIONS:
				return getOsapplications();
			case ArchitecturetoolPackage.NODE__ISR:
				return getIsr();
			case ArchitecturetoolPackage.NODE__MEMORY:
				return getMemory();
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
			case ArchitecturetoolPackage.NODE__TASK:
				getTask().clear();
				getTask().addAll((Collection<? extends Task>)newValue);
				return;
			case ArchitecturetoolPackage.NODE__NAME:
				setName((String)newValue);
				return;
			case ArchitecturetoolPackage.NODE__COMPONENTINSTANCE:
				getComponentinstance().clear();
				getComponentinstance().addAll((Collection<? extends ComponentInstance>)newValue);
				return;
			case ArchitecturetoolPackage.NODE__BUILDUNITS:
				getBuildunits().clear();
				getBuildunits().addAll((Collection<? extends BuildUnit>)newValue);
				return;
			case ArchitecturetoolPackage.NODE__OSAPPLICATIONS:
				getOsapplications().clear();
				getOsapplications().addAll((Collection<? extends OSApplication>)newValue);
				return;
			case ArchitecturetoolPackage.NODE__ISR:
				getIsr().clear();
				getIsr().addAll((Collection<? extends ISR>)newValue);
				return;
			case ArchitecturetoolPackage.NODE__MEMORY:
				getMemory().clear();
				getMemory().addAll((Collection<? extends Memory>)newValue);
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
			case ArchitecturetoolPackage.NODE__TASK:
				getTask().clear();
				return;
			case ArchitecturetoolPackage.NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ArchitecturetoolPackage.NODE__COMPONENTINSTANCE:
				getComponentinstance().clear();
				return;
			case ArchitecturetoolPackage.NODE__BUILDUNITS:
				getBuildunits().clear();
				return;
			case ArchitecturetoolPackage.NODE__OSAPPLICATIONS:
				getOsapplications().clear();
				return;
			case ArchitecturetoolPackage.NODE__ISR:
				getIsr().clear();
				return;
			case ArchitecturetoolPackage.NODE__MEMORY:
				getMemory().clear();
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
			case ArchitecturetoolPackage.NODE__TASK:
				return task != null && !task.isEmpty();
			case ArchitecturetoolPackage.NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ArchitecturetoolPackage.NODE__COMPONENTINSTANCE:
				return componentinstance != null && !componentinstance.isEmpty();
			case ArchitecturetoolPackage.NODE__BUILDUNITS:
				return buildunits != null && !buildunits.isEmpty();
			case ArchitecturetoolPackage.NODE__OSAPPLICATIONS:
				return osapplications != null && !osapplications.isEmpty();
			case ArchitecturetoolPackage.NODE__ISR:
				return isr != null && !isr.isEmpty();
			case ArchitecturetoolPackage.NODE__MEMORY:
				return memory != null && !memory.isEmpty();
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

} //NodeImpl

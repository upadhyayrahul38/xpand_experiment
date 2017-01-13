/**
 */
package architecturetool.impl;

import architecturetool.ArchitecturetoolPackage;
import architecturetool.MemoryBudget;
import architecturetool.ResourceBudget;
import architecturetool.RuntimeBudget;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Budget</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link architecturetool.impl.ResourceBudgetImpl#getRuntimebudget <em>Runtimebudget</em>}</li>
 *   <li>{@link architecturetool.impl.ResourceBudgetImpl#getMemorybudget <em>Memorybudget</em>}</li>
 *   <li>{@link architecturetool.impl.ResourceBudgetImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceBudgetImpl extends MinimalEObjectImpl.Container implements ResourceBudget {
	/**
	 * The cached value of the '{@link #getRuntimebudget() <em>Runtimebudget</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimebudget()
	 * @generated
	 * @ordered
	 */
	protected EList<RuntimeBudget> runtimebudget;

	/**
	 * The cached value of the '{@link #getMemorybudget() <em>Memorybudget</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemorybudget()
	 * @generated
	 * @ordered
	 */
	protected EList<MemoryBudget> memorybudget;

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
	protected ResourceBudgetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturetoolPackage.Literals.RESOURCE_BUDGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RuntimeBudget> getRuntimebudget() {
		if (runtimebudget == null) {
			runtimebudget = new EObjectContainmentEList<RuntimeBudget>(RuntimeBudget.class, this, ArchitecturetoolPackage.RESOURCE_BUDGET__RUNTIMEBUDGET);
		}
		return runtimebudget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MemoryBudget> getMemorybudget() {
		if (memorybudget == null) {
			memorybudget = new EObjectContainmentEList<MemoryBudget>(MemoryBudget.class, this, ArchitecturetoolPackage.RESOURCE_BUDGET__MEMORYBUDGET);
		}
		return memorybudget;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturetoolPackage.RESOURCE_BUDGET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArchitecturetoolPackage.RESOURCE_BUDGET__RUNTIMEBUDGET:
				return ((InternalEList<?>)getRuntimebudget()).basicRemove(otherEnd, msgs);
			case ArchitecturetoolPackage.RESOURCE_BUDGET__MEMORYBUDGET:
				return ((InternalEList<?>)getMemorybudget()).basicRemove(otherEnd, msgs);
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
			case ArchitecturetoolPackage.RESOURCE_BUDGET__RUNTIMEBUDGET:
				return getRuntimebudget();
			case ArchitecturetoolPackage.RESOURCE_BUDGET__MEMORYBUDGET:
				return getMemorybudget();
			case ArchitecturetoolPackage.RESOURCE_BUDGET__NAME:
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
			case ArchitecturetoolPackage.RESOURCE_BUDGET__RUNTIMEBUDGET:
				getRuntimebudget().clear();
				getRuntimebudget().addAll((Collection<? extends RuntimeBudget>)newValue);
				return;
			case ArchitecturetoolPackage.RESOURCE_BUDGET__MEMORYBUDGET:
				getMemorybudget().clear();
				getMemorybudget().addAll((Collection<? extends MemoryBudget>)newValue);
				return;
			case ArchitecturetoolPackage.RESOURCE_BUDGET__NAME:
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
			case ArchitecturetoolPackage.RESOURCE_BUDGET__RUNTIMEBUDGET:
				getRuntimebudget().clear();
				return;
			case ArchitecturetoolPackage.RESOURCE_BUDGET__MEMORYBUDGET:
				getMemorybudget().clear();
				return;
			case ArchitecturetoolPackage.RESOURCE_BUDGET__NAME:
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
			case ArchitecturetoolPackage.RESOURCE_BUDGET__RUNTIMEBUDGET:
				return runtimebudget != null && !runtimebudget.isEmpty();
			case ArchitecturetoolPackage.RESOURCE_BUDGET__MEMORYBUDGET:
				return memorybudget != null && !memorybudget.isEmpty();
			case ArchitecturetoolPackage.RESOURCE_BUDGET__NAME:
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

} //ResourceBudgetImpl

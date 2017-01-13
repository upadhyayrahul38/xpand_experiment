/**
 */
package architecturetool.impl;

import architecturetool.ArchitecturetoolPackage;
import architecturetool.Component;
import architecturetool.DataStructure;
import architecturetool.Port;
import architecturetool.SubComponent;

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
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link architecturetool.impl.ComponentImpl#getItsRunnable <em>Its Runnable</em>}</li>
 *   <li>{@link architecturetool.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link architecturetool.impl.ComponentImpl#getSubcomponent <em>Subcomponent</em>}</li>
 *   <li>{@link architecturetool.impl.ComponentImpl#getPort <em>Port</em>}</li>
 *   <li>{@link architecturetool.impl.ComponentImpl#isExternalStaticMemUsed <em>External Static Mem Used</em>}</li>
 *   <li>{@link architecturetool.impl.ComponentImpl#getStructs <em>Structs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends MinimalEObjectImpl.Container implements Component {
	/**
	 * The cached value of the '{@link #getItsRunnable() <em>Its Runnable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsRunnable()
	 * @generated
	 * @ordered
	 */
	protected EList<architecturetool.Runnable> itsRunnable;

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
	 * The cached value of the '{@link #getSubcomponent() <em>Subcomponent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubcomponent()
	 * @generated
	 * @ordered
	 */
	protected EList<SubComponent> subcomponent;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> port;

	/**
	 * The default value of the '{@link #isExternalStaticMemUsed() <em>External Static Mem Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExternalStaticMemUsed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXTERNAL_STATIC_MEM_USED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExternalStaticMemUsed() <em>External Static Mem Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExternalStaticMemUsed()
	 * @generated
	 * @ordered
	 */
	protected boolean externalStaticMemUsed = EXTERNAL_STATIC_MEM_USED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStructs() <em>Structs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructs()
	 * @generated
	 * @ordered
	 */
	protected EList<DataStructure> structs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturetoolPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<architecturetool.Runnable> getItsRunnable() {
		if (itsRunnable == null) {
			itsRunnable = new EObjectContainmentEList<architecturetool.Runnable>(architecturetool.Runnable.class, this, ArchitecturetoolPackage.COMPONENT__ITS_RUNNABLE);
		}
		return itsRunnable;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturetoolPackage.COMPONENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubComponent> getSubcomponent() {
		if (subcomponent == null) {
			subcomponent = new EObjectContainmentEList<SubComponent>(SubComponent.class, this, ArchitecturetoolPackage.COMPONENT__SUBCOMPONENT);
		}
		return subcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getPort() {
		if (port == null) {
			port = new EObjectContainmentEList<Port>(Port.class, this, ArchitecturetoolPackage.COMPONENT__PORT);
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExternalStaticMemUsed() {
		return externalStaticMemUsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalStaticMemUsed(boolean newExternalStaticMemUsed) {
		boolean oldExternalStaticMemUsed = externalStaticMemUsed;
		externalStaticMemUsed = newExternalStaticMemUsed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturetoolPackage.COMPONENT__EXTERNAL_STATIC_MEM_USED, oldExternalStaticMemUsed, externalStaticMemUsed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataStructure> getStructs() {
		if (structs == null) {
			structs = new EObjectContainmentEList<DataStructure>(DataStructure.class, this, ArchitecturetoolPackage.COMPONENT__STRUCTS);
		}
		return structs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArchitecturetoolPackage.COMPONENT__ITS_RUNNABLE:
				return ((InternalEList<?>)getItsRunnable()).basicRemove(otherEnd, msgs);
			case ArchitecturetoolPackage.COMPONENT__SUBCOMPONENT:
				return ((InternalEList<?>)getSubcomponent()).basicRemove(otherEnd, msgs);
			case ArchitecturetoolPackage.COMPONENT__PORT:
				return ((InternalEList<?>)getPort()).basicRemove(otherEnd, msgs);
			case ArchitecturetoolPackage.COMPONENT__STRUCTS:
				return ((InternalEList<?>)getStructs()).basicRemove(otherEnd, msgs);
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
			case ArchitecturetoolPackage.COMPONENT__ITS_RUNNABLE:
				return getItsRunnable();
			case ArchitecturetoolPackage.COMPONENT__NAME:
				return getName();
			case ArchitecturetoolPackage.COMPONENT__SUBCOMPONENT:
				return getSubcomponent();
			case ArchitecturetoolPackage.COMPONENT__PORT:
				return getPort();
			case ArchitecturetoolPackage.COMPONENT__EXTERNAL_STATIC_MEM_USED:
				return isExternalStaticMemUsed();
			case ArchitecturetoolPackage.COMPONENT__STRUCTS:
				return getStructs();
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
			case ArchitecturetoolPackage.COMPONENT__ITS_RUNNABLE:
				getItsRunnable().clear();
				getItsRunnable().addAll((Collection<? extends architecturetool.Runnable>)newValue);
				return;
			case ArchitecturetoolPackage.COMPONENT__NAME:
				setName((String)newValue);
				return;
			case ArchitecturetoolPackage.COMPONENT__SUBCOMPONENT:
				getSubcomponent().clear();
				getSubcomponent().addAll((Collection<? extends SubComponent>)newValue);
				return;
			case ArchitecturetoolPackage.COMPONENT__PORT:
				getPort().clear();
				getPort().addAll((Collection<? extends Port>)newValue);
				return;
			case ArchitecturetoolPackage.COMPONENT__EXTERNAL_STATIC_MEM_USED:
				setExternalStaticMemUsed((Boolean)newValue);
				return;
			case ArchitecturetoolPackage.COMPONENT__STRUCTS:
				getStructs().clear();
				getStructs().addAll((Collection<? extends DataStructure>)newValue);
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
			case ArchitecturetoolPackage.COMPONENT__ITS_RUNNABLE:
				getItsRunnable().clear();
				return;
			case ArchitecturetoolPackage.COMPONENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ArchitecturetoolPackage.COMPONENT__SUBCOMPONENT:
				getSubcomponent().clear();
				return;
			case ArchitecturetoolPackage.COMPONENT__PORT:
				getPort().clear();
				return;
			case ArchitecturetoolPackage.COMPONENT__EXTERNAL_STATIC_MEM_USED:
				setExternalStaticMemUsed(EXTERNAL_STATIC_MEM_USED_EDEFAULT);
				return;
			case ArchitecturetoolPackage.COMPONENT__STRUCTS:
				getStructs().clear();
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
			case ArchitecturetoolPackage.COMPONENT__ITS_RUNNABLE:
				return itsRunnable != null && !itsRunnable.isEmpty();
			case ArchitecturetoolPackage.COMPONENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ArchitecturetoolPackage.COMPONENT__SUBCOMPONENT:
				return subcomponent != null && !subcomponent.isEmpty();
			case ArchitecturetoolPackage.COMPONENT__PORT:
				return port != null && !port.isEmpty();
			case ArchitecturetoolPackage.COMPONENT__EXTERNAL_STATIC_MEM_USED:
				return externalStaticMemUsed != EXTERNAL_STATIC_MEM_USED_EDEFAULT;
			case ArchitecturetoolPackage.COMPONENT__STRUCTS:
				return structs != null && !structs.isEmpty();
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
		result.append(", externalStaticMemUsed: ");
		result.append(externalStaticMemUsed);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl

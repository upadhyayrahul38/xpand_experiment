/**
 */
package architecturetool.impl;

import architecturetool.ArchitecturetoolPackage;
import architecturetool.ECU;
import architecturetool.MCC;
import architecturetool.NoNameElement;

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
 * An implementation of the model object '<em><b>No Name Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link architecturetool.impl.NoNameElementImpl#getMcc <em>Mcc</em>}</li>
 *   <li>{@link architecturetool.impl.NoNameElementImpl#getEcus <em>Ecus</em>}</li>
 *   <li>{@link architecturetool.impl.NoNameElementImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NoNameElementImpl extends MinimalEObjectImpl.Container implements NoNameElement {
	/**
	 * The cached value of the '{@link #getMcc() <em>Mcc</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMcc()
	 * @generated
	 * @ordered
	 */
	protected EList<MCC> mcc;

	/**
	 * The cached value of the '{@link #getEcus() <em>Ecus</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcus()
	 * @generated
	 * @ordered
	 */
	protected EList<ECU> ecus;

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
	protected NoNameElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturetoolPackage.Literals.NO_NAME_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MCC> getMcc() {
		if (mcc == null) {
			mcc = new EObjectContainmentEList<MCC>(MCC.class, this, ArchitecturetoolPackage.NO_NAME_ELEMENT__MCC);
		}
		return mcc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ECU> getEcus() {
		if (ecus == null) {
			ecus = new EObjectContainmentEList<ECU>(ECU.class, this, ArchitecturetoolPackage.NO_NAME_ELEMENT__ECUS);
		}
		return ecus;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturetoolPackage.NO_NAME_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArchitecturetoolPackage.NO_NAME_ELEMENT__MCC:
				return ((InternalEList<?>)getMcc()).basicRemove(otherEnd, msgs);
			case ArchitecturetoolPackage.NO_NAME_ELEMENT__ECUS:
				return ((InternalEList<?>)getEcus()).basicRemove(otherEnd, msgs);
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
			case ArchitecturetoolPackage.NO_NAME_ELEMENT__MCC:
				return getMcc();
			case ArchitecturetoolPackage.NO_NAME_ELEMENT__ECUS:
				return getEcus();
			case ArchitecturetoolPackage.NO_NAME_ELEMENT__NAME:
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
			case ArchitecturetoolPackage.NO_NAME_ELEMENT__MCC:
				getMcc().clear();
				getMcc().addAll((Collection<? extends MCC>)newValue);
				return;
			case ArchitecturetoolPackage.NO_NAME_ELEMENT__ECUS:
				getEcus().clear();
				getEcus().addAll((Collection<? extends ECU>)newValue);
				return;
			case ArchitecturetoolPackage.NO_NAME_ELEMENT__NAME:
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
			case ArchitecturetoolPackage.NO_NAME_ELEMENT__MCC:
				getMcc().clear();
				return;
			case ArchitecturetoolPackage.NO_NAME_ELEMENT__ECUS:
				getEcus().clear();
				return;
			case ArchitecturetoolPackage.NO_NAME_ELEMENT__NAME:
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
			case ArchitecturetoolPackage.NO_NAME_ELEMENT__MCC:
				return mcc != null && !mcc.isEmpty();
			case ArchitecturetoolPackage.NO_NAME_ELEMENT__ECUS:
				return ecus != null && !ecus.isEmpty();
			case ArchitecturetoolPackage.NO_NAME_ELEMENT__NAME:
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

} //NoNameElementImpl

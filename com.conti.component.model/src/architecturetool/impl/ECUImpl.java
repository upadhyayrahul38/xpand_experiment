/**
 */
package architecturetool.impl;

import architecturetool.ArchitecturetoolPackage;
import architecturetool.CPU;
import architecturetool.ECU;
import architecturetool.FunctionalRequirement;

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
 * An implementation of the model object '<em><b>ECU</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link architecturetool.impl.ECUImpl#getCpus <em>Cpus</em>}</li>
 *   <li>{@link architecturetool.impl.ECUImpl#getFunctionalrequirements <em>Functionalrequirements</em>}</li>
 *   <li>{@link architecturetool.impl.ECUImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ECUImpl extends MinimalEObjectImpl.Container implements ECU {
	/**
	 * The cached value of the '{@link #getCpus() <em>Cpus</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpus()
	 * @generated
	 * @ordered
	 */
	protected EList<CPU> cpus;

	/**
	 * The cached value of the '{@link #getFunctionalrequirements() <em>Functionalrequirements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalrequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionalRequirement> functionalrequirements;

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
	protected ECUImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturetoolPackage.Literals.ECU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CPU> getCpus() {
		if (cpus == null) {
			cpus = new EObjectContainmentEList<CPU>(CPU.class, this, ArchitecturetoolPackage.ECU__CPUS);
		}
		return cpus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionalRequirement> getFunctionalrequirements() {
		if (functionalrequirements == null) {
			functionalrequirements = new EObjectContainmentEList<FunctionalRequirement>(FunctionalRequirement.class, this, ArchitecturetoolPackage.ECU__FUNCTIONALREQUIREMENTS);
		}
		return functionalrequirements;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturetoolPackage.ECU__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArchitecturetoolPackage.ECU__CPUS:
				return ((InternalEList<?>)getCpus()).basicRemove(otherEnd, msgs);
			case ArchitecturetoolPackage.ECU__FUNCTIONALREQUIREMENTS:
				return ((InternalEList<?>)getFunctionalrequirements()).basicRemove(otherEnd, msgs);
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
			case ArchitecturetoolPackage.ECU__CPUS:
				return getCpus();
			case ArchitecturetoolPackage.ECU__FUNCTIONALREQUIREMENTS:
				return getFunctionalrequirements();
			case ArchitecturetoolPackage.ECU__NAME:
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
			case ArchitecturetoolPackage.ECU__CPUS:
				getCpus().clear();
				getCpus().addAll((Collection<? extends CPU>)newValue);
				return;
			case ArchitecturetoolPackage.ECU__FUNCTIONALREQUIREMENTS:
				getFunctionalrequirements().clear();
				getFunctionalrequirements().addAll((Collection<? extends FunctionalRequirement>)newValue);
				return;
			case ArchitecturetoolPackage.ECU__NAME:
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
			case ArchitecturetoolPackage.ECU__CPUS:
				getCpus().clear();
				return;
			case ArchitecturetoolPackage.ECU__FUNCTIONALREQUIREMENTS:
				getFunctionalrequirements().clear();
				return;
			case ArchitecturetoolPackage.ECU__NAME:
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
			case ArchitecturetoolPackage.ECU__CPUS:
				return cpus != null && !cpus.isEmpty();
			case ArchitecturetoolPackage.ECU__FUNCTIONALREQUIREMENTS:
				return functionalrequirements != null && !functionalrequirements.isEmpty();
			case ArchitecturetoolPackage.ECU__NAME:
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

} //ECUImpl

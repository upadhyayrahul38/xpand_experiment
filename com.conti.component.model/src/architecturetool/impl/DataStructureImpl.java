/**
 */
package architecturetool.impl;

import architecturetool.ArchitecturetoolPackage;
import architecturetool.Attribute;
import architecturetool.DataStructure;

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
 * An implementation of the model object '<em><b>Data Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link architecturetool.impl.DataStructureImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link architecturetool.impl.DataStructureImpl#getName <em>Name</em>}</li>
 *   <li>{@link architecturetool.impl.DataStructureImpl#getReferences <em>References</em>}</li>
 *   <li>{@link architecturetool.impl.DataStructureImpl#getStructs <em>Structs</em>}</li>
 *   <li>{@link architecturetool.impl.DataStructureImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataStructureImpl extends MinimalEObjectImpl.Container implements DataStructure {
	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

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
	 * The cached value of the '{@link #getReferences() <em>References</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<DataStructure> references;

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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturetoolPackage.Literals.DATA_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, ArchitecturetoolPackage.DATA_STRUCTURE__ATTRIBUTES);
		}
		return attributes;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturetoolPackage.DATA_STRUCTURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataStructure> getReferences() {
		if (references == null) {
			references = new EObjectResolvingEList<DataStructure>(DataStructure.class, this, ArchitecturetoolPackage.DATA_STRUCTURE__REFERENCES);
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataStructure> getStructs() {
		if (structs == null) {
			structs = new EObjectContainmentEList<DataStructure>(DataStructure.class, this, ArchitecturetoolPackage.DATA_STRUCTURE__STRUCTS);
		}
		return structs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturetoolPackage.DATA_STRUCTURE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArchitecturetoolPackage.DATA_STRUCTURE__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case ArchitecturetoolPackage.DATA_STRUCTURE__STRUCTS:
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
			case ArchitecturetoolPackage.DATA_STRUCTURE__ATTRIBUTES:
				return getAttributes();
			case ArchitecturetoolPackage.DATA_STRUCTURE__NAME:
				return getName();
			case ArchitecturetoolPackage.DATA_STRUCTURE__REFERENCES:
				return getReferences();
			case ArchitecturetoolPackage.DATA_STRUCTURE__STRUCTS:
				return getStructs();
			case ArchitecturetoolPackage.DATA_STRUCTURE__DESCRIPTION:
				return getDescription();
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
			case ArchitecturetoolPackage.DATA_STRUCTURE__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case ArchitecturetoolPackage.DATA_STRUCTURE__NAME:
				setName((String)newValue);
				return;
			case ArchitecturetoolPackage.DATA_STRUCTURE__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection<? extends DataStructure>)newValue);
				return;
			case ArchitecturetoolPackage.DATA_STRUCTURE__STRUCTS:
				getStructs().clear();
				getStructs().addAll((Collection<? extends DataStructure>)newValue);
				return;
			case ArchitecturetoolPackage.DATA_STRUCTURE__DESCRIPTION:
				setDescription((String)newValue);
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
			case ArchitecturetoolPackage.DATA_STRUCTURE__ATTRIBUTES:
				getAttributes().clear();
				return;
			case ArchitecturetoolPackage.DATA_STRUCTURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ArchitecturetoolPackage.DATA_STRUCTURE__REFERENCES:
				getReferences().clear();
				return;
			case ArchitecturetoolPackage.DATA_STRUCTURE__STRUCTS:
				getStructs().clear();
				return;
			case ArchitecturetoolPackage.DATA_STRUCTURE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case ArchitecturetoolPackage.DATA_STRUCTURE__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case ArchitecturetoolPackage.DATA_STRUCTURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ArchitecturetoolPackage.DATA_STRUCTURE__REFERENCES:
				return references != null && !references.isEmpty();
			case ArchitecturetoolPackage.DATA_STRUCTURE__STRUCTS:
				return structs != null && !structs.isEmpty();
			case ArchitecturetoolPackage.DATA_STRUCTURE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //DataStructureImpl

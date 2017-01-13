/**
 */
package architecturetool.impl;

import architecturetool.ArchitecturetoolPackage;
import architecturetool.BuildUnit;
import architecturetool.Component;
import architecturetool.ComponentInstance;
import architecturetool.ResourceBudget;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link architecturetool.impl.ComponentInstanceImpl#getRam <em>Ram</em>}</li>
 *   <li>{@link architecturetool.impl.ComponentInstanceImpl#getRamSection <em>Ram Section</em>}</li>
 *   <li>{@link architecturetool.impl.ComponentInstanceImpl#getRom <em>Rom</em>}</li>
 *   <li>{@link architecturetool.impl.ComponentInstanceImpl#getNmv <em>Nmv</em>}</li>
 *   <li>{@link architecturetool.impl.ComponentInstanceImpl#getMeas <em>Meas</em>}</li>
 *   <li>{@link architecturetool.impl.ComponentInstanceImpl#getType <em>Type</em>}</li>
 *   <li>{@link architecturetool.impl.ComponentInstanceImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link architecturetool.impl.ComponentInstanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link architecturetool.impl.ComponentInstanceImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link architecturetool.impl.ComponentInstanceImpl#getResourcebudget <em>Resourcebudget</em>}</li>
 *   <li>{@link architecturetool.impl.ComponentInstanceImpl#getBuildunits <em>Buildunits</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentInstanceImpl extends MinimalEObjectImpl.Container implements ComponentInstance {
	/**
	 * The default value of the '{@link #getRam() <em>Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRam()
	 * @generated
	 * @ordered
	 */
	protected static final double RAM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRam() <em>Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRam()
	 * @generated
	 * @ordered
	 */
	protected double ram = RAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getRamSection() <em>Ram Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRamSection()
	 * @generated
	 * @ordered
	 */
	protected static final String RAM_SECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRamSection() <em>Ram Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRamSection()
	 * @generated
	 * @ordered
	 */
	protected String ramSection = RAM_SECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRom() <em>Rom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRom()
	 * @generated
	 * @ordered
	 */
	protected static final int ROM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRom() <em>Rom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRom()
	 * @generated
	 * @ordered
	 */
	protected int rom = ROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getNmv() <em>Nmv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNmv()
	 * @generated
	 * @ordered
	 */
	protected static final double NMV_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getNmv() <em>Nmv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNmv()
	 * @generated
	 * @ordered
	 */
	protected double nmv = NMV_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeas() <em>Meas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeas()
	 * @generated
	 * @ordered
	 */
	protected static final double MEAS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMeas() <em>Meas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeas()
	 * @generated
	 * @ordered
	 */
	protected double meas = MEAS_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOwner() <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected static final String OWNER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected String owner = OWNER_EDEFAULT;

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
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected Component component;

	/**
	 * The cached value of the '{@link #getResourcebudget() <em>Resourcebudget</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourcebudget()
	 * @generated
	 * @ordered
	 */
	protected ResourceBudget resourcebudget;

	/**
	 * The cached value of the '{@link #getBuildunits() <em>Buildunits</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildunits()
	 * @generated
	 * @ordered
	 */
	protected EList<BuildUnit> buildunits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturetoolPackage.Literals.COMPONENT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRam() {
		return ram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRam(double newRam) {
		double oldRam = ram;
		ram = newRam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturetoolPackage.COMPONENT_INSTANCE__RAM, oldRam, ram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRamSection() {
		return ramSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRamSection(String newRamSection) {
		String oldRamSection = ramSection;
		ramSection = newRamSection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturetoolPackage.COMPONENT_INSTANCE__RAM_SECTION, oldRamSection, ramSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRom() {
		return rom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRom(int newRom) {
		int oldRom = rom;
		rom = newRom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturetoolPackage.COMPONENT_INSTANCE__ROM, oldRom, rom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getNmv() {
		return nmv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNmv(double newNmv) {
		double oldNmv = nmv;
		nmv = newNmv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturetoolPackage.COMPONENT_INSTANCE__NMV, oldNmv, nmv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMeas() {
		return meas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeas(double newMeas) {
		double oldMeas = meas;
		meas = newMeas;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturetoolPackage.COMPONENT_INSTANCE__MEAS, oldMeas, meas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturetoolPackage.COMPONENT_INSTANCE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(String newOwner) {
		String oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturetoolPackage.COMPONENT_INSTANCE__OWNER, oldOwner, owner));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturetoolPackage.COMPONENT_INSTANCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getComponent() {
		if (component != null && component.eIsProxy()) {
			InternalEObject oldComponent = (InternalEObject)component;
			component = (Component)eResolveProxy(oldComponent);
			if (component != oldComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchitecturetoolPackage.COMPONENT_INSTANCE__COMPONENT, oldComponent, component));
			}
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(Component newComponent) {
		Component oldComponent = component;
		component = newComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturetoolPackage.COMPONENT_INSTANCE__COMPONENT, oldComponent, component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceBudget getResourcebudget() {
		return resourcebudget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourcebudget(ResourceBudget newResourcebudget, NotificationChain msgs) {
		ResourceBudget oldResourcebudget = resourcebudget;
		resourcebudget = newResourcebudget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArchitecturetoolPackage.COMPONENT_INSTANCE__RESOURCEBUDGET, oldResourcebudget, newResourcebudget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourcebudget(ResourceBudget newResourcebudget) {
		if (newResourcebudget != resourcebudget) {
			NotificationChain msgs = null;
			if (resourcebudget != null)
				msgs = ((InternalEObject)resourcebudget).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArchitecturetoolPackage.COMPONENT_INSTANCE__RESOURCEBUDGET, null, msgs);
			if (newResourcebudget != null)
				msgs = ((InternalEObject)newResourcebudget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArchitecturetoolPackage.COMPONENT_INSTANCE__RESOURCEBUDGET, null, msgs);
			msgs = basicSetResourcebudget(newResourcebudget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturetoolPackage.COMPONENT_INSTANCE__RESOURCEBUDGET, newResourcebudget, newResourcebudget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BuildUnit> getBuildunits() {
		if (buildunits == null) {
			buildunits = new EObjectResolvingEList<BuildUnit>(BuildUnit.class, this, ArchitecturetoolPackage.COMPONENT_INSTANCE__BUILDUNITS);
		}
		return buildunits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArchitecturetoolPackage.COMPONENT_INSTANCE__RESOURCEBUDGET:
				return basicSetResourcebudget(null, msgs);
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
			case ArchitecturetoolPackage.COMPONENT_INSTANCE__RAM:
				return getRam();
			case ArchitecturetoolPackage.COMPONENT_INSTANCE__RAM_SECTION:
				return getRamSection();
			case ArchitecturetoolPackage.COMPONENT_INSTANCE__ROM:
				return getRom();
			case ArchitecturetoolPackage.COMPONENT_INSTANCE__NMV:
				return getNmv();
			case ArchitecturetoolPackage.COMPONENT_INSTANCE__MEAS:
				return getMeas();
			case ArchitecturetoolPackage.COMPONENT_INSTANCE__TYPE:
				return getType();
			case ArchitecturetoolPackage.COMPONENT_INSTANCE__OWNER:
				return getOwner();
			case ArchitecturetoolPackage.COMPONENT_INSTANCE__NAME:
				return getName();
			case ArchitecturetoolPackage.COMPONENT_INSTANCE__COMPONENT:
				if (resolve) return getComponent();
				return basicGetComponent();
			case ArchitecturetoolPackage.COMPONENT_INSTANCE__RESOURCEBUDGET:
				return getResourcebudget();
			case ArchitecturetoolPackage.COMPONENT_INSTANCE__BUILDUNITS:
				return getBuildunits();
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
			case ArchitecturetoolPackage.COMPONENT_INSTANCE__RAM:
				setRam((Double)newValue);
				return;
			case ArchitecturetoolPackage.COMPONENT_INSTANCE__RAM_SECTION:
				setRamSection((String)newValue);
				return;
			case ArchitecturetoolPackage.COMPONENT_INSTANCE__ROM:
				setRom((Integer)newValue);
				return;
			case ArchitecturetoolPackage.COMPONENT_INSTANCE__NMV:
				setNmv((Double)newValue);
				return;
			case ArchitecturetoolPackage.COMPONENT_INSTANCE__MEAS:
				setMeas((Double)newValue);
				return;
			case ArchitecturetoolPackage.COMPONENT_INSTANCE__TYPE:
				setType((String)newValue);
				return;
			case ArchitecturetoolPackage.COMPONENT_INSTANCE__OWNER:
				setOwner((String)newValue);
				return;
			case ArchitecturetoolPackage.COMPONENT_INSTANCE__NAME:
				setName((String)newValue);
				return;
			case ArchitecturetoolPackage.COMPONENT_INSTANCE__COMPONENT:
				setComponent((Component)newValue);
				return;
			case ArchitecturetoolPackage.COMPONENT_INSTANCE__RESOURCEBUDGET:
				setResourcebudget((ResourceBudget)newValue);
				return;
			case ArchitecturetoolPackage.COMPONENT_INSTANCE__BUILDUNITS:
				getBuildunits().clear();
				getBuildunits().addAll((Collection<? extends BuildUnit>)newValue);
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
			case ArchitecturetoolPackage.COMPONENT_INSTANCE__RAM:
				setRam(RAM_EDEFAULT);
				return;
			case ArchitecturetoolPackage.COMPONENT_INSTANCE__RAM_SECTION:
				setRamSection(RAM_SECTION_EDEFAULT);
				return;
			case ArchitecturetoolPackage.COMPONENT_INSTANCE__ROM:
				setRom(ROM_EDEFAULT);
				return;
			case ArchitecturetoolPackage.COMPONENT_INSTANCE__NMV:
				setNmv(NMV_EDEFAULT);
				return;
			case ArchitecturetoolPackage.COMPONENT_INSTANCE__MEAS:
				setMeas(MEAS_EDEFAULT);
				return;
			case ArchitecturetoolPackage.COMPONENT_INSTANCE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ArchitecturetoolPackage.COMPONENT_INSTANCE__OWNER:
				setOwner(OWNER_EDEFAULT);
				return;
			case ArchitecturetoolPackage.COMPONENT_INSTANCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ArchitecturetoolPackage.COMPONENT_INSTANCE__COMPONENT:
				setComponent((Component)null);
				return;
			case ArchitecturetoolPackage.COMPONENT_INSTANCE__RESOURCEBUDGET:
				setResourcebudget((ResourceBudget)null);
				return;
			case ArchitecturetoolPackage.COMPONENT_INSTANCE__BUILDUNITS:
				getBuildunits().clear();
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
			case ArchitecturetoolPackage.COMPONENT_INSTANCE__RAM:
				return ram != RAM_EDEFAULT;
			case ArchitecturetoolPackage.COMPONENT_INSTANCE__RAM_SECTION:
				return RAM_SECTION_EDEFAULT == null ? ramSection != null : !RAM_SECTION_EDEFAULT.equals(ramSection);
			case ArchitecturetoolPackage.COMPONENT_INSTANCE__ROM:
				return rom != ROM_EDEFAULT;
			case ArchitecturetoolPackage.COMPONENT_INSTANCE__NMV:
				return nmv != NMV_EDEFAULT;
			case ArchitecturetoolPackage.COMPONENT_INSTANCE__MEAS:
				return meas != MEAS_EDEFAULT;
			case ArchitecturetoolPackage.COMPONENT_INSTANCE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case ArchitecturetoolPackage.COMPONENT_INSTANCE__OWNER:
				return OWNER_EDEFAULT == null ? owner != null : !OWNER_EDEFAULT.equals(owner);
			case ArchitecturetoolPackage.COMPONENT_INSTANCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ArchitecturetoolPackage.COMPONENT_INSTANCE__COMPONENT:
				return component != null;
			case ArchitecturetoolPackage.COMPONENT_INSTANCE__RESOURCEBUDGET:
				return resourcebudget != null;
			case ArchitecturetoolPackage.COMPONENT_INSTANCE__BUILDUNITS:
				return buildunits != null && !buildunits.isEmpty();
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
		result.append(" (ram: ");
		result.append(ram);
		result.append(", ramSection: ");
		result.append(ramSection);
		result.append(", rom: ");
		result.append(rom);
		result.append(", nmv: ");
		result.append(nmv);
		result.append(", meas: ");
		result.append(meas);
		result.append(", type: ");
		result.append(type);
		result.append(", owner: ");
		result.append(owner);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ComponentInstanceImpl

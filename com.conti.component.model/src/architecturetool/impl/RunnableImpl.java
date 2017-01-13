/**
 */
package architecturetool.impl;

import architecturetool.ArchitecturetoolPackage;
import architecturetool.Port;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Runnable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link architecturetool.impl.RunnableImpl#getHowToBecalledBehaviour <em>How To Becalled Behaviour</em>}</li>
 *   <li>{@link architecturetool.impl.RunnableImpl#getNeededRunTimeAvg <em>Needed Run Time Avg</em>}</li>
 *   <li>{@link architecturetool.impl.RunnableImpl#getNeededRunTimeMax <em>Needed Run Time Max</em>}</li>
 *   <li>{@link architecturetool.impl.RunnableImpl#getNeedAccelerator <em>Need Accelerator</em>}</li>
 *   <li>{@link architecturetool.impl.RunnableImpl#getName <em>Name</em>}</li>
 *   <li>{@link architecturetool.impl.RunnableImpl#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RunnableImpl extends MinimalEObjectImpl.Container implements architecturetool.Runnable {
	/**
	 * The default value of the '{@link #getHowToBecalledBehaviour() <em>How To Becalled Behaviour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHowToBecalledBehaviour()
	 * @generated
	 * @ordered
	 */
	protected static final int HOW_TO_BECALLED_BEHAVIOUR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHowToBecalledBehaviour() <em>How To Becalled Behaviour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHowToBecalledBehaviour()
	 * @generated
	 * @ordered
	 */
	protected int howToBecalledBehaviour = HOW_TO_BECALLED_BEHAVIOUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getNeededRunTimeAvg() <em>Needed Run Time Avg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeededRunTimeAvg()
	 * @generated
	 * @ordered
	 */
	protected static final int NEEDED_RUN_TIME_AVG_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNeededRunTimeAvg() <em>Needed Run Time Avg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeededRunTimeAvg()
	 * @generated
	 * @ordered
	 */
	protected int neededRunTimeAvg = NEEDED_RUN_TIME_AVG_EDEFAULT;

	/**
	 * The default value of the '{@link #getNeededRunTimeMax() <em>Needed Run Time Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeededRunTimeMax()
	 * @generated
	 * @ordered
	 */
	protected static final int NEEDED_RUN_TIME_MAX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNeededRunTimeMax() <em>Needed Run Time Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeededRunTimeMax()
	 * @generated
	 * @ordered
	 */
	protected int neededRunTimeMax = NEEDED_RUN_TIME_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getNeedAccelerator() <em>Need Accelerator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeedAccelerator()
	 * @generated
	 * @ordered
	 */
	protected static final int NEED_ACCELERATOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNeedAccelerator() <em>Need Accelerator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeedAccelerator()
	 * @generated
	 * @ordered
	 */
	protected int needAccelerator = NEED_ACCELERATOR_EDEFAULT;

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
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> ports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RunnableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturetoolPackage.Literals.RUNNABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHowToBecalledBehaviour() {
		return howToBecalledBehaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHowToBecalledBehaviour(int newHowToBecalledBehaviour) {
		int oldHowToBecalledBehaviour = howToBecalledBehaviour;
		howToBecalledBehaviour = newHowToBecalledBehaviour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturetoolPackage.RUNNABLE__HOW_TO_BECALLED_BEHAVIOUR, oldHowToBecalledBehaviour, howToBecalledBehaviour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNeededRunTimeAvg() {
		return neededRunTimeAvg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeededRunTimeAvg(int newNeededRunTimeAvg) {
		int oldNeededRunTimeAvg = neededRunTimeAvg;
		neededRunTimeAvg = newNeededRunTimeAvg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturetoolPackage.RUNNABLE__NEEDED_RUN_TIME_AVG, oldNeededRunTimeAvg, neededRunTimeAvg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNeededRunTimeMax() {
		return neededRunTimeMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeededRunTimeMax(int newNeededRunTimeMax) {
		int oldNeededRunTimeMax = neededRunTimeMax;
		neededRunTimeMax = newNeededRunTimeMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturetoolPackage.RUNNABLE__NEEDED_RUN_TIME_MAX, oldNeededRunTimeMax, neededRunTimeMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNeedAccelerator() {
		return needAccelerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeedAccelerator(int newNeedAccelerator) {
		int oldNeedAccelerator = needAccelerator;
		needAccelerator = newNeedAccelerator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturetoolPackage.RUNNABLE__NEED_ACCELERATOR, oldNeedAccelerator, needAccelerator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturetoolPackage.RUNNABLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getPorts() {
		if (ports == null) {
			ports = new EObjectResolvingEList<Port>(Port.class, this, ArchitecturetoolPackage.RUNNABLE__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArchitecturetoolPackage.RUNNABLE__HOW_TO_BECALLED_BEHAVIOUR:
				return getHowToBecalledBehaviour();
			case ArchitecturetoolPackage.RUNNABLE__NEEDED_RUN_TIME_AVG:
				return getNeededRunTimeAvg();
			case ArchitecturetoolPackage.RUNNABLE__NEEDED_RUN_TIME_MAX:
				return getNeededRunTimeMax();
			case ArchitecturetoolPackage.RUNNABLE__NEED_ACCELERATOR:
				return getNeedAccelerator();
			case ArchitecturetoolPackage.RUNNABLE__NAME:
				return getName();
			case ArchitecturetoolPackage.RUNNABLE__PORTS:
				return getPorts();
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
			case ArchitecturetoolPackage.RUNNABLE__HOW_TO_BECALLED_BEHAVIOUR:
				setHowToBecalledBehaviour((Integer)newValue);
				return;
			case ArchitecturetoolPackage.RUNNABLE__NEEDED_RUN_TIME_AVG:
				setNeededRunTimeAvg((Integer)newValue);
				return;
			case ArchitecturetoolPackage.RUNNABLE__NEEDED_RUN_TIME_MAX:
				setNeededRunTimeMax((Integer)newValue);
				return;
			case ArchitecturetoolPackage.RUNNABLE__NEED_ACCELERATOR:
				setNeedAccelerator((Integer)newValue);
				return;
			case ArchitecturetoolPackage.RUNNABLE__NAME:
				setName((String)newValue);
				return;
			case ArchitecturetoolPackage.RUNNABLE__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends Port>)newValue);
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
			case ArchitecturetoolPackage.RUNNABLE__HOW_TO_BECALLED_BEHAVIOUR:
				setHowToBecalledBehaviour(HOW_TO_BECALLED_BEHAVIOUR_EDEFAULT);
				return;
			case ArchitecturetoolPackage.RUNNABLE__NEEDED_RUN_TIME_AVG:
				setNeededRunTimeAvg(NEEDED_RUN_TIME_AVG_EDEFAULT);
				return;
			case ArchitecturetoolPackage.RUNNABLE__NEEDED_RUN_TIME_MAX:
				setNeededRunTimeMax(NEEDED_RUN_TIME_MAX_EDEFAULT);
				return;
			case ArchitecturetoolPackage.RUNNABLE__NEED_ACCELERATOR:
				setNeedAccelerator(NEED_ACCELERATOR_EDEFAULT);
				return;
			case ArchitecturetoolPackage.RUNNABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ArchitecturetoolPackage.RUNNABLE__PORTS:
				getPorts().clear();
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
			case ArchitecturetoolPackage.RUNNABLE__HOW_TO_BECALLED_BEHAVIOUR:
				return howToBecalledBehaviour != HOW_TO_BECALLED_BEHAVIOUR_EDEFAULT;
			case ArchitecturetoolPackage.RUNNABLE__NEEDED_RUN_TIME_AVG:
				return neededRunTimeAvg != NEEDED_RUN_TIME_AVG_EDEFAULT;
			case ArchitecturetoolPackage.RUNNABLE__NEEDED_RUN_TIME_MAX:
				return neededRunTimeMax != NEEDED_RUN_TIME_MAX_EDEFAULT;
			case ArchitecturetoolPackage.RUNNABLE__NEED_ACCELERATOR:
				return needAccelerator != NEED_ACCELERATOR_EDEFAULT;
			case ArchitecturetoolPackage.RUNNABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ArchitecturetoolPackage.RUNNABLE__PORTS:
				return ports != null && !ports.isEmpty();
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
		result.append(" (howToBecalledBehaviour: ");
		result.append(howToBecalledBehaviour);
		result.append(", neededRunTimeAvg: ");
		result.append(neededRunTimeAvg);
		result.append(", neededRunTimeMax: ");
		result.append(neededRunTimeMax);
		result.append(", needAccelerator: ");
		result.append(needAccelerator);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RunnableImpl

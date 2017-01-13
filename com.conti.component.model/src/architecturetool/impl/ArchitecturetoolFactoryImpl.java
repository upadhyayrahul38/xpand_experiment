/**
 */
package architecturetool.impl;

import architecturetool.ArchitecturetoolFactory;
import architecturetool.ArchitecturetoolPackage;
import architecturetool.Attribute;
import architecturetool.BuildUnit;
import architecturetool.CPU;
import architecturetool.Component;
import architecturetool.ComponentInstance;
import architecturetool.DataStructure;
import architecturetool.ECU;
import architecturetool.FunctionalRequirement;
import architecturetool.ISR;
import architecturetool.MCC;
import architecturetool.Memory;
import architecturetool.MemoryBudget;
import architecturetool.MemoryPartition;
import architecturetool.NoNameElement;
import architecturetool.Node;
import architecturetool.OSApplication;
import architecturetool.Parameter;
import architecturetool.Port;
import architecturetool.PortListType;
import architecturetool.ResourceBudget;
import architecturetool.RuntimeBudget;
import architecturetool.SubComponent;
import architecturetool.Task;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArchitecturetoolFactoryImpl extends EFactoryImpl implements ArchitecturetoolFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArchitecturetoolFactory init() {
		try {
			ArchitecturetoolFactory theArchitecturetoolFactory = (ArchitecturetoolFactory)EPackage.Registry.INSTANCE.getEFactory(ArchitecturetoolPackage.eNS_URI);
			if (theArchitecturetoolFactory != null) {
				return theArchitecturetoolFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ArchitecturetoolFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitecturetoolFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ArchitecturetoolPackage.NODE: return createNode();
			case ArchitecturetoolPackage.TASK: return createTask();
			case ArchitecturetoolPackage.COMPONENT: return createComponent();
			case ArchitecturetoolPackage.RUNNABLE: return createRunnable();
			case ArchitecturetoolPackage.COMPONENT_INSTANCE: return createComponentInstance();
			case ArchitecturetoolPackage.ECU: return createECU();
			case ArchitecturetoolPackage.CPU: return createCPU();
			case ArchitecturetoolPackage.FUNCTIONAL_REQUIREMENT: return createFunctionalRequirement();
			case ArchitecturetoolPackage.RESOURCE_BUDGET: return createResourceBudget();
			case ArchitecturetoolPackage.RUNTIME_BUDGET: return createRuntimeBudget();
			case ArchitecturetoolPackage.MEMORY_BUDGET: return createMemoryBudget();
			case ArchitecturetoolPackage.MCC: return createMCC();
			case ArchitecturetoolPackage.NO_NAME_ELEMENT: return createNoNameElement();
			case ArchitecturetoolPackage.SUB_COMPONENT: return createSubComponent();
			case ArchitecturetoolPackage.BUILD_UNIT: return createBuildUnit();
			case ArchitecturetoolPackage.OS_APPLICATION: return createOSApplication();
			case ArchitecturetoolPackage.ISR: return createISR();
			case ArchitecturetoolPackage.MEMORY: return createMemory();
			case ArchitecturetoolPackage.MEMORY_PARTITION: return createMemoryPartition();
			case ArchitecturetoolPackage.PORT: return createPort();
			case ArchitecturetoolPackage.ATTRIBUTE: return createAttribute();
			case ArchitecturetoolPackage.DATA_STRUCTURE: return createDataStructure();
			case ArchitecturetoolPackage.PARAMETER: return createParameter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ArchitecturetoolPackage.PORT_LIST_TYPE:
				return createPortListTypeFromString(eDataType, initialValue);
			case ArchitecturetoolPackage.STACK_INT:
				return createStackIntFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ArchitecturetoolPackage.PORT_LIST_TYPE:
				return convertPortListTypeToString(eDataType, instanceValue);
			case ArchitecturetoolPackage.STACK_INT:
				return convertStackIntToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public architecturetool.Runnable createRunnable() {
		RunnableImpl runnable = new RunnableImpl();
		return runnable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance createComponentInstance() {
		ComponentInstanceImpl componentInstance = new ComponentInstanceImpl();
		return componentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECU createECU() {
		ECUImpl ecu = new ECUImpl();
		return ecu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CPU createCPU() {
		CPUImpl cpu = new CPUImpl();
		return cpu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalRequirement createFunctionalRequirement() {
		FunctionalRequirementImpl functionalRequirement = new FunctionalRequirementImpl();
		return functionalRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceBudget createResourceBudget() {
		ResourceBudgetImpl resourceBudget = new ResourceBudgetImpl();
		return resourceBudget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeBudget createRuntimeBudget() {
		RuntimeBudgetImpl runtimeBudget = new RuntimeBudgetImpl();
		return runtimeBudget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryBudget createMemoryBudget() {
		MemoryBudgetImpl memoryBudget = new MemoryBudgetImpl();
		return memoryBudget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MCC createMCC() {
		MCCImpl mcc = new MCCImpl();
		return mcc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoNameElement createNoNameElement() {
		NoNameElementImpl noNameElement = new NoNameElementImpl();
		return noNameElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubComponent createSubComponent() {
		SubComponentImpl subComponent = new SubComponentImpl();
		return subComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildUnit createBuildUnit() {
		BuildUnitImpl buildUnit = new BuildUnitImpl();
		return buildUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSApplication createOSApplication() {
		OSApplicationImpl osApplication = new OSApplicationImpl();
		return osApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISR createISR() {
		ISRImpl isr = new ISRImpl();
		return isr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Memory createMemory() {
		MemoryImpl memory = new MemoryImpl();
		return memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryPartition createMemoryPartition() {
		MemoryPartitionImpl memoryPartition = new MemoryPartitionImpl();
		return memoryPartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataStructure createDataStructure() {
		DataStructureImpl dataStructure = new DataStructureImpl();
		return dataStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortListType createPortListTypeFromString(EDataType eDataType, String initialValue) {
		PortListType result = PortListType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortListTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createStackIntFromString(EDataType eDataType, String initialValue) {
		return (Integer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStackIntToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitecturetoolPackage getArchitecturetoolPackage() {
		return (ArchitecturetoolPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ArchitecturetoolPackage getPackage() {
		return ArchitecturetoolPackage.eINSTANCE;
	}

} //ArchitecturetoolFactoryImpl

/**
 */
package architecturetool;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see architecturetool.ArchitecturetoolFactory
 * @model kind="package"
 * @generated
 */
public interface ArchitecturetoolPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "architecturetool";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://component/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "component";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArchitecturetoolPackage eINSTANCE = architecturetool.impl.ArchitecturetoolPackageImpl.init();

	/**
	 * The meta object id for the '{@link architecturetool.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architecturetool.impl.NodeImpl
	 * @see architecturetool.impl.ArchitecturetoolPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 0;

	/**
	 * The feature id for the '<em><b>Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__TASK = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Componentinstance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__COMPONENTINSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Buildunits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__BUILDUNITS = 3;

	/**
	 * The feature id for the '<em><b>Osapplications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__OSAPPLICATIONS = 4;

	/**
	 * The feature id for the '<em><b>Isr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ISR = 5;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__MEMORY = 6;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link architecturetool.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architecturetool.impl.TaskImpl
	 * @see architecturetool.impl.ArchitecturetoolPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 1;

	/**
	 * The feature id for the '<em><b>Ram Section Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__RAM_SECTION_USED = 0;

	/**
	 * The feature id for the '<em><b>Stack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__STACK = 1;

	/**
	 * The feature id for the '<em><b>Startup Runnables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__STARTUP_RUNNABLES = 2;

	/**
	 * The feature id for the '<em><b>Runnables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__RUNNABLES = 3;

	/**
	 * The feature id for the '<em><b>Shutdown Runnables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__SHUTDOWN_RUNNABLES = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = 5;

	/**
	 * The feature id for the '<em><b>Runtime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__RUNTIME = 6;

	/**
	 * The feature id for the '<em><b>Memorypartition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__MEMORYPARTITION = 7;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link architecturetool.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architecturetool.impl.ComponentImpl
	 * @see architecturetool.impl.ArchitecturetoolPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Its Runnable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ITS_RUNNABLE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Subcomponent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SUBCOMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PORT = 3;

	/**
	 * The feature id for the '<em><b>External Static Mem Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__EXTERNAL_STATIC_MEM_USED = 4;

	/**
	 * The feature id for the '<em><b>Structs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__STRUCTS = 5;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link architecturetool.impl.RunnableImpl <em>Runnable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architecturetool.impl.RunnableImpl
	 * @see architecturetool.impl.ArchitecturetoolPackageImpl#getRunnable()
	 * @generated
	 */
	int RUNNABLE = 3;

	/**
	 * The feature id for the '<em><b>How To Becalled Behaviour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE__HOW_TO_BECALLED_BEHAVIOUR = 0;

	/**
	 * The feature id for the '<em><b>Needed Run Time Avg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE__NEEDED_RUN_TIME_AVG = 1;

	/**
	 * The feature id for the '<em><b>Needed Run Time Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE__NEEDED_RUN_TIME_MAX = 2;

	/**
	 * The feature id for the '<em><b>Need Accelerator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE__NEED_ACCELERATOR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE__NAME = 4;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE__PORTS = 5;

	/**
	 * The number of structural features of the '<em>Runnable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Runnable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link architecturetool.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architecturetool.impl.ComponentInstanceImpl
	 * @see architecturetool.impl.ArchitecturetoolPackageImpl#getComponentInstance()
	 * @generated
	 */
	int COMPONENT_INSTANCE = 4;

	/**
	 * The feature id for the '<em><b>Ram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__RAM = 0;

	/**
	 * The feature id for the '<em><b>Ram Section</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__RAM_SECTION = 1;

	/**
	 * The feature id for the '<em><b>Rom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__ROM = 2;

	/**
	 * The feature id for the '<em><b>Nmv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__NMV = 3;

	/**
	 * The feature id for the '<em><b>Meas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__MEAS = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__TYPE = 5;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__OWNER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__NAME = 7;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__COMPONENT = 8;

	/**
	 * The feature id for the '<em><b>Resourcebudget</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__RESOURCEBUDGET = 9;

	/**
	 * The feature id for the '<em><b>Buildunits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__BUILDUNITS = 10;

	/**
	 * The number of structural features of the '<em>Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link architecturetool.impl.ECUImpl <em>ECU</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architecturetool.impl.ECUImpl
	 * @see architecturetool.impl.ArchitecturetoolPackageImpl#getECU()
	 * @generated
	 */
	int ECU = 5;

	/**
	 * The feature id for the '<em><b>Cpus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__CPUS = 0;

	/**
	 * The feature id for the '<em><b>Functionalrequirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__FUNCTIONALREQUIREMENTS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__NAME = 2;

	/**
	 * The number of structural features of the '<em>ECU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>ECU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link architecturetool.impl.CPUImpl <em>CPU</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architecturetool.impl.CPUImpl
	 * @see architecturetool.impl.ArchitecturetoolPackageImpl#getCPU()
	 * @generated
	 */
	int CPU = 6;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU__NODES = 0;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU__MEMORY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU__NAME = 2;

	/**
	 * The number of structural features of the '<em>CPU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>CPU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link architecturetool.impl.FunctionalRequirementImpl <em>Functional Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architecturetool.impl.FunctionalRequirementImpl
	 * @see architecturetool.impl.ArchitecturetoolPackageImpl#getFunctionalRequirement()
	 * @generated
	 */
	int FUNCTIONAL_REQUIREMENT = 7;

	/**
	 * The feature id for the '<em><b>Componentinstance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__COMPONENTINSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Functional Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Functional Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link architecturetool.impl.ResourceBudgetImpl <em>Resource Budget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architecturetool.impl.ResourceBudgetImpl
	 * @see architecturetool.impl.ArchitecturetoolPackageImpl#getResourceBudget()
	 * @generated
	 */
	int RESOURCE_BUDGET = 8;

	/**
	 * The feature id for the '<em><b>Runtimebudget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BUDGET__RUNTIMEBUDGET = 0;

	/**
	 * The feature id for the '<em><b>Memorybudget</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BUDGET__MEMORYBUDGET = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BUDGET__NAME = 2;

	/**
	 * The number of structural features of the '<em>Resource Budget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BUDGET_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Resource Budget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BUDGET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link architecturetool.impl.RuntimeBudgetImpl <em>Runtime Budget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architecturetool.impl.RuntimeBudgetImpl
	 * @see architecturetool.impl.ArchitecturetoolPackageImpl#getRuntimeBudget()
	 * @generated
	 */
	int RUNTIME_BUDGET = 9;

	/**
	 * The number of structural features of the '<em>Runtime Budget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_BUDGET_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Runtime Budget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_BUDGET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link architecturetool.impl.MemoryBudgetImpl <em>Memory Budget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architecturetool.impl.MemoryBudgetImpl
	 * @see architecturetool.impl.ArchitecturetoolPackageImpl#getMemoryBudget()
	 * @generated
	 */
	int MEMORY_BUDGET = 10;

	/**
	 * The number of structural features of the '<em>Memory Budget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_BUDGET_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Memory Budget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_BUDGET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link architecturetool.impl.MCCImpl <em>MCC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architecturetool.impl.MCCImpl
	 * @see architecturetool.impl.ArchitecturetoolPackageImpl#getMCC()
	 * @generated
	 */
	int MCC = 11;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCC__COMPONENTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCC__NAME = 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCC__PARAMETERS = 2;

	/**
	 * The number of structural features of the '<em>MCC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCC_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>MCC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link architecturetool.impl.NoNameElementImpl <em>No Name Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architecturetool.impl.NoNameElementImpl
	 * @see architecturetool.impl.ArchitecturetoolPackageImpl#getNoNameElement()
	 * @generated
	 */
	int NO_NAME_ELEMENT = 12;

	/**
	 * The feature id for the '<em><b>Mcc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_NAME_ELEMENT__MCC = 0;

	/**
	 * The feature id for the '<em><b>Ecus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_NAME_ELEMENT__ECUS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_NAME_ELEMENT__NAME = 2;

	/**
	 * The number of structural features of the '<em>No Name Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_NAME_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>No Name Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_NAME_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link architecturetool.impl.SubComponentImpl <em>Sub Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architecturetool.impl.SubComponentImpl
	 * @see architecturetool.impl.ArchitecturetoolPackageImpl#getSubComponent()
	 * @generated
	 */
	int SUB_COMPONENT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_COMPONENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Sub Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_COMPONENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sub Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link architecturetool.impl.BuildUnitImpl <em>Build Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architecturetool.impl.BuildUnitImpl
	 * @see architecturetool.impl.ArchitecturetoolPackageImpl#getBuildUnit()
	 * @generated
	 */
	int BUILD_UNIT = 14;

	/**
	 * The feature id for the '<em><b>Memorypartition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__MEMORYPARTITION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Build Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Build Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_UNIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link architecturetool.impl.OSApplicationImpl <em>OS Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architecturetool.impl.OSApplicationImpl
	 * @see architecturetool.impl.ArchitecturetoolPackageImpl#getOSApplication()
	 * @generated
	 */
	int OS_APPLICATION = 15;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_APPLICATION__TASKS = 0;

	/**
	 * The feature id for the '<em><b>Isr</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_APPLICATION__ISR = 1;

	/**
	 * The feature id for the '<em><b>Memorypartition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_APPLICATION__MEMORYPARTITION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_APPLICATION__NAME = 3;

	/**
	 * The number of structural features of the '<em>OS Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_APPLICATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>OS Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_APPLICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link architecturetool.impl.ISRImpl <em>ISR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architecturetool.impl.ISRImpl
	 * @see architecturetool.impl.ArchitecturetoolPackageImpl#getISR()
	 * @generated
	 */
	int ISR = 16;

	/**
	 * The feature id for the '<em><b>Runnables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISR__RUNNABLES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISR__NAME = 1;

	/**
	 * The number of structural features of the '<em>ISR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>ISR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link architecturetool.impl.MemoryImpl <em>Memory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architecturetool.impl.MemoryImpl
	 * @see architecturetool.impl.ArchitecturetoolPackageImpl#getMemory()
	 * @generated
	 */
	int MEMORY = 17;

	/**
	 * The feature id for the '<em><b>Memorypartition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__MEMORYPARTITION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__NAME = 1;

	/**
	 * The number of structural features of the '<em>Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link architecturetool.impl.MemoryPartitionImpl <em>Memory Partition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architecturetool.impl.MemoryPartitionImpl
	 * @see architecturetool.impl.ArchitecturetoolPackageImpl#getMemoryPartition()
	 * @generated
	 */
	int MEMORY_PARTITION = 18;

	/**
	 * The number of structural features of the '<em>Memory Partition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_PARTITION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Memory Partition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_PARTITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link architecturetool.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architecturetool.impl.PortImpl
	 * @see architecturetool.impl.ArchitecturetoolPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__REF = 2;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__PARAMETER = 3;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link architecturetool.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architecturetool.impl.AttributeImpl
	 * @see architecturetool.impl.ArchitecturetoolPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link architecturetool.impl.DataStructureImpl <em>Data Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architecturetool.impl.DataStructureImpl
	 * @see architecturetool.impl.ArchitecturetoolPackageImpl#getDataStructure()
	 * @generated
	 */
	int DATA_STRUCTURE = 21;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE__ATTRIBUTES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE__NAME = 1;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE__REFERENCES = 2;

	/**
	 * The feature id for the '<em><b>Structs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE__STRUCTS = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE__DESCRIPTION = 4;

	/**
	 * The number of structural features of the '<em>Data Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Data Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link architecturetool.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architecturetool.impl.ParameterImpl
	 * @see architecturetool.impl.ArchitecturetoolPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link architecturetool.PortListType <em>Port List Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architecturetool.PortListType
	 * @see architecturetool.impl.ArchitecturetoolPackageImpl#getPortListType()
	 * @generated
	 */
	int PORT_LIST_TYPE = 23;

	/**
	 * The meta object id for the '<em>Stack Int</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see architecturetool.impl.ArchitecturetoolPackageImpl#getStackInt()
	 * @generated
	 */
	int STACK_INT = 24;


	/**
	 * Returns the meta object for class '{@link architecturetool.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see architecturetool.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the containment reference list '{@link architecturetool.Node#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task</em>'.
	 * @see architecturetool.Node#getTask()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Task();

	/**
	 * Returns the meta object for the attribute '{@link architecturetool.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see architecturetool.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the meta object for the reference list '{@link architecturetool.Node#getComponentinstance <em>Componentinstance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Componentinstance</em>'.
	 * @see architecturetool.Node#getComponentinstance()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Componentinstance();

	/**
	 * Returns the meta object for the containment reference list '{@link architecturetool.Node#getBuildunits <em>Buildunits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Buildunits</em>'.
	 * @see architecturetool.Node#getBuildunits()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Buildunits();

	/**
	 * Returns the meta object for the containment reference list '{@link architecturetool.Node#getOsapplications <em>Osapplications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Osapplications</em>'.
	 * @see architecturetool.Node#getOsapplications()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Osapplications();

	/**
	 * Returns the meta object for the containment reference list '{@link architecturetool.Node#getIsr <em>Isr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Isr</em>'.
	 * @see architecturetool.Node#getIsr()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Isr();

	/**
	 * Returns the meta object for the reference list '{@link architecturetool.Node#getMemory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Memory</em>'.
	 * @see architecturetool.Node#getMemory()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Memory();

	/**
	 * Returns the meta object for class '{@link architecturetool.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see architecturetool.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link architecturetool.Task#getRamSectionUsed <em>Ram Section Used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ram Section Used</em>'.
	 * @see architecturetool.Task#getRamSectionUsed()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_RamSectionUsed();

	/**
	 * Returns the meta object for the attribute '{@link architecturetool.Task#getStack <em>Stack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stack</em>'.
	 * @see architecturetool.Task#getStack()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Stack();

	/**
	 * Returns the meta object for the reference list '{@link architecturetool.Task#getStartupRunnables <em>Startup Runnables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Startup Runnables</em>'.
	 * @see architecturetool.Task#getStartupRunnables()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_StartupRunnables();

	/**
	 * Returns the meta object for the reference list '{@link architecturetool.Task#getRunnables <em>Runnables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Runnables</em>'.
	 * @see architecturetool.Task#getRunnables()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Runnables();

	/**
	 * Returns the meta object for the reference list '{@link architecturetool.Task#getShutdownRunnables <em>Shutdown Runnables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Shutdown Runnables</em>'.
	 * @see architecturetool.Task#getShutdownRunnables()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_ShutdownRunnables();

	/**
	 * Returns the meta object for the attribute '{@link architecturetool.Task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see architecturetool.Task#getName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Name();

	/**
	 * Returns the meta object for the attribute '{@link architecturetool.Task#getRuntime <em>Runtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Runtime</em>'.
	 * @see architecturetool.Task#getRuntime()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Runtime();

	/**
	 * Returns the meta object for the reference '{@link architecturetool.Task#getMemorypartition <em>Memorypartition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Memorypartition</em>'.
	 * @see architecturetool.Task#getMemorypartition()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Memorypartition();

	/**
	 * Returns the meta object for class '{@link architecturetool.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see architecturetool.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link architecturetool.Component#getItsRunnable <em>Its Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Its Runnable</em>'.
	 * @see architecturetool.Component#getItsRunnable()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ItsRunnable();

	/**
	 * Returns the meta object for the attribute '{@link architecturetool.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see architecturetool.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link architecturetool.Component#getSubcomponent <em>Subcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subcomponent</em>'.
	 * @see architecturetool.Component#getSubcomponent()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Subcomponent();

	/**
	 * Returns the meta object for the containment reference list '{@link architecturetool.Component#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see architecturetool.Component#getPort()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Port();

	/**
	 * Returns the meta object for the attribute '{@link architecturetool.Component#isExternalStaticMemUsed <em>External Static Mem Used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Static Mem Used</em>'.
	 * @see architecturetool.Component#isExternalStaticMemUsed()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_ExternalStaticMemUsed();

	/**
	 * Returns the meta object for the containment reference list '{@link architecturetool.Component#getStructs <em>Structs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Structs</em>'.
	 * @see architecturetool.Component#getStructs()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Structs();

	/**
	 * Returns the meta object for class '{@link architecturetool.Runnable <em>Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runnable</em>'.
	 * @see architecturetool.Runnable
	 * @generated
	 */
	EClass getRunnable();

	/**
	 * Returns the meta object for the attribute '{@link architecturetool.Runnable#getHowToBecalledBehaviour <em>How To Becalled Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>How To Becalled Behaviour</em>'.
	 * @see architecturetool.Runnable#getHowToBecalledBehaviour()
	 * @see #getRunnable()
	 * @generated
	 */
	EAttribute getRunnable_HowToBecalledBehaviour();

	/**
	 * Returns the meta object for the attribute '{@link architecturetool.Runnable#getNeededRunTimeAvg <em>Needed Run Time Avg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Needed Run Time Avg</em>'.
	 * @see architecturetool.Runnable#getNeededRunTimeAvg()
	 * @see #getRunnable()
	 * @generated
	 */
	EAttribute getRunnable_NeededRunTimeAvg();

	/**
	 * Returns the meta object for the attribute '{@link architecturetool.Runnable#getNeededRunTimeMax <em>Needed Run Time Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Needed Run Time Max</em>'.
	 * @see architecturetool.Runnable#getNeededRunTimeMax()
	 * @see #getRunnable()
	 * @generated
	 */
	EAttribute getRunnable_NeededRunTimeMax();

	/**
	 * Returns the meta object for the attribute '{@link architecturetool.Runnable#getNeedAccelerator <em>Need Accelerator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Need Accelerator</em>'.
	 * @see architecturetool.Runnable#getNeedAccelerator()
	 * @see #getRunnable()
	 * @generated
	 */
	EAttribute getRunnable_NeedAccelerator();

	/**
	 * Returns the meta object for the attribute '{@link architecturetool.Runnable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see architecturetool.Runnable#getName()
	 * @see #getRunnable()
	 * @generated
	 */
	EAttribute getRunnable_Name();

	/**
	 * Returns the meta object for the reference list '{@link architecturetool.Runnable#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ports</em>'.
	 * @see architecturetool.Runnable#getPorts()
	 * @see #getRunnable()
	 * @generated
	 */
	EReference getRunnable_Ports();

	/**
	 * Returns the meta object for class '{@link architecturetool.ComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instance</em>'.
	 * @see architecturetool.ComponentInstance
	 * @generated
	 */
	EClass getComponentInstance();

	/**
	 * Returns the meta object for the attribute '{@link architecturetool.ComponentInstance#getRam <em>Ram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ram</em>'.
	 * @see architecturetool.ComponentInstance#getRam()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EAttribute getComponentInstance_Ram();

	/**
	 * Returns the meta object for the attribute '{@link architecturetool.ComponentInstance#getRamSection <em>Ram Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ram Section</em>'.
	 * @see architecturetool.ComponentInstance#getRamSection()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EAttribute getComponentInstance_RamSection();

	/**
	 * Returns the meta object for the attribute '{@link architecturetool.ComponentInstance#getRom <em>Rom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rom</em>'.
	 * @see architecturetool.ComponentInstance#getRom()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EAttribute getComponentInstance_Rom();

	/**
	 * Returns the meta object for the attribute '{@link architecturetool.ComponentInstance#getNmv <em>Nmv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nmv</em>'.
	 * @see architecturetool.ComponentInstance#getNmv()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EAttribute getComponentInstance_Nmv();

	/**
	 * Returns the meta object for the attribute '{@link architecturetool.ComponentInstance#getMeas <em>Meas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meas</em>'.
	 * @see architecturetool.ComponentInstance#getMeas()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EAttribute getComponentInstance_Meas();

	/**
	 * Returns the meta object for the attribute '{@link architecturetool.ComponentInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see architecturetool.ComponentInstance#getType()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EAttribute getComponentInstance_Type();

	/**
	 * Returns the meta object for the attribute '{@link architecturetool.ComponentInstance#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owner</em>'.
	 * @see architecturetool.ComponentInstance#getOwner()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EAttribute getComponentInstance_Owner();

	/**
	 * Returns the meta object for the attribute '{@link architecturetool.ComponentInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see architecturetool.ComponentInstance#getName()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EAttribute getComponentInstance_Name();

	/**
	 * Returns the meta object for the reference '{@link architecturetool.ComponentInstance#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see architecturetool.ComponentInstance#getComponent()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Component();

	/**
	 * Returns the meta object for the containment reference '{@link architecturetool.ComponentInstance#getResourcebudget <em>Resourcebudget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resourcebudget</em>'.
	 * @see architecturetool.ComponentInstance#getResourcebudget()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Resourcebudget();

	/**
	 * Returns the meta object for the reference list '{@link architecturetool.ComponentInstance#getBuildunits <em>Buildunits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Buildunits</em>'.
	 * @see architecturetool.ComponentInstance#getBuildunits()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Buildunits();

	/**
	 * Returns the meta object for class '{@link architecturetool.ECU <em>ECU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ECU</em>'.
	 * @see architecturetool.ECU
	 * @generated
	 */
	EClass getECU();

	/**
	 * Returns the meta object for the containment reference list '{@link architecturetool.ECU#getCpus <em>Cpus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cpus</em>'.
	 * @see architecturetool.ECU#getCpus()
	 * @see #getECU()
	 * @generated
	 */
	EReference getECU_Cpus();

	/**
	 * Returns the meta object for the containment reference list '{@link architecturetool.ECU#getFunctionalrequirements <em>Functionalrequirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functionalrequirements</em>'.
	 * @see architecturetool.ECU#getFunctionalrequirements()
	 * @see #getECU()
	 * @generated
	 */
	EReference getECU_Functionalrequirements();

	/**
	 * Returns the meta object for the attribute '{@link architecturetool.ECU#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see architecturetool.ECU#getName()
	 * @see #getECU()
	 * @generated
	 */
	EAttribute getECU_Name();

	/**
	 * Returns the meta object for class '{@link architecturetool.CPU <em>CPU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CPU</em>'.
	 * @see architecturetool.CPU
	 * @generated
	 */
	EClass getCPU();

	/**
	 * Returns the meta object for the containment reference list '{@link architecturetool.CPU#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see architecturetool.CPU#getNodes()
	 * @see #getCPU()
	 * @generated
	 */
	EReference getCPU_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link architecturetool.CPU#getMemory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Memory</em>'.
	 * @see architecturetool.CPU#getMemory()
	 * @see #getCPU()
	 * @generated
	 */
	EReference getCPU_Memory();

	/**
	 * Returns the meta object for the attribute '{@link architecturetool.CPU#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see architecturetool.CPU#getName()
	 * @see #getCPU()
	 * @generated
	 */
	EAttribute getCPU_Name();

	/**
	 * Returns the meta object for class '{@link architecturetool.FunctionalRequirement <em>Functional Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Requirement</em>'.
	 * @see architecturetool.FunctionalRequirement
	 * @generated
	 */
	EClass getFunctionalRequirement();

	/**
	 * Returns the meta object for the containment reference list '{@link architecturetool.FunctionalRequirement#getComponentinstance <em>Componentinstance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Componentinstance</em>'.
	 * @see architecturetool.FunctionalRequirement#getComponentinstance()
	 * @see #getFunctionalRequirement()
	 * @generated
	 */
	EReference getFunctionalRequirement_Componentinstance();

	/**
	 * Returns the meta object for the attribute '{@link architecturetool.FunctionalRequirement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see architecturetool.FunctionalRequirement#getName()
	 * @see #getFunctionalRequirement()
	 * @generated
	 */
	EAttribute getFunctionalRequirement_Name();

	/**
	 * Returns the meta object for class '{@link architecturetool.ResourceBudget <em>Resource Budget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Budget</em>'.
	 * @see architecturetool.ResourceBudget
	 * @generated
	 */
	EClass getResourceBudget();

	/**
	 * Returns the meta object for the containment reference list '{@link architecturetool.ResourceBudget#getRuntimebudget <em>Runtimebudget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Runtimebudget</em>'.
	 * @see architecturetool.ResourceBudget#getRuntimebudget()
	 * @see #getResourceBudget()
	 * @generated
	 */
	EReference getResourceBudget_Runtimebudget();

	/**
	 * Returns the meta object for the containment reference list '{@link architecturetool.ResourceBudget#getMemorybudget <em>Memorybudget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Memorybudget</em>'.
	 * @see architecturetool.ResourceBudget#getMemorybudget()
	 * @see #getResourceBudget()
	 * @generated
	 */
	EReference getResourceBudget_Memorybudget();

	/**
	 * Returns the meta object for the attribute '{@link architecturetool.ResourceBudget#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see architecturetool.ResourceBudget#getName()
	 * @see #getResourceBudget()
	 * @generated
	 */
	EAttribute getResourceBudget_Name();

	/**
	 * Returns the meta object for class '{@link architecturetool.RuntimeBudget <em>Runtime Budget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime Budget</em>'.
	 * @see architecturetool.RuntimeBudget
	 * @generated
	 */
	EClass getRuntimeBudget();

	/**
	 * Returns the meta object for class '{@link architecturetool.MemoryBudget <em>Memory Budget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory Budget</em>'.
	 * @see architecturetool.MemoryBudget
	 * @generated
	 */
	EClass getMemoryBudget();

	/**
	 * Returns the meta object for class '{@link architecturetool.MCC <em>MCC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MCC</em>'.
	 * @see architecturetool.MCC
	 * @generated
	 */
	EClass getMCC();

	/**
	 * Returns the meta object for the containment reference list '{@link architecturetool.MCC#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see architecturetool.MCC#getComponents()
	 * @see #getMCC()
	 * @generated
	 */
	EReference getMCC_Components();

	/**
	 * Returns the meta object for the attribute '{@link architecturetool.MCC#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see architecturetool.MCC#getName()
	 * @see #getMCC()
	 * @generated
	 */
	EAttribute getMCC_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link architecturetool.MCC#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see architecturetool.MCC#getParameters()
	 * @see #getMCC()
	 * @generated
	 */
	EReference getMCC_Parameters();

	/**
	 * Returns the meta object for class '{@link architecturetool.NoNameElement <em>No Name Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>No Name Element</em>'.
	 * @see architecturetool.NoNameElement
	 * @generated
	 */
	EClass getNoNameElement();

	/**
	 * Returns the meta object for the containment reference list '{@link architecturetool.NoNameElement#getMcc <em>Mcc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mcc</em>'.
	 * @see architecturetool.NoNameElement#getMcc()
	 * @see #getNoNameElement()
	 * @generated
	 */
	EReference getNoNameElement_Mcc();

	/**
	 * Returns the meta object for the containment reference list '{@link architecturetool.NoNameElement#getEcus <em>Ecus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ecus</em>'.
	 * @see architecturetool.NoNameElement#getEcus()
	 * @see #getNoNameElement()
	 * @generated
	 */
	EReference getNoNameElement_Ecus();

	/**
	 * Returns the meta object for the attribute '{@link architecturetool.NoNameElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see architecturetool.NoNameElement#getName()
	 * @see #getNoNameElement()
	 * @generated
	 */
	EAttribute getNoNameElement_Name();

	/**
	 * Returns the meta object for class '{@link architecturetool.SubComponent <em>Sub Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Component</em>'.
	 * @see architecturetool.SubComponent
	 * @generated
	 */
	EClass getSubComponent();

	/**
	 * Returns the meta object for the attribute '{@link architecturetool.SubComponent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see architecturetool.SubComponent#getName()
	 * @see #getSubComponent()
	 * @generated
	 */
	EAttribute getSubComponent_Name();

	/**
	 * Returns the meta object for class '{@link architecturetool.BuildUnit <em>Build Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Build Unit</em>'.
	 * @see architecturetool.BuildUnit
	 * @generated
	 */
	EClass getBuildUnit();

	/**
	 * Returns the meta object for the reference '{@link architecturetool.BuildUnit#getMemorypartition <em>Memorypartition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Memorypartition</em>'.
	 * @see architecturetool.BuildUnit#getMemorypartition()
	 * @see #getBuildUnit()
	 * @generated
	 */
	EReference getBuildUnit_Memorypartition();

	/**
	 * Returns the meta object for the attribute '{@link architecturetool.BuildUnit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see architecturetool.BuildUnit#getName()
	 * @see #getBuildUnit()
	 * @generated
	 */
	EAttribute getBuildUnit_Name();

	/**
	 * Returns the meta object for class '{@link architecturetool.OSApplication <em>OS Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OS Application</em>'.
	 * @see architecturetool.OSApplication
	 * @generated
	 */
	EClass getOSApplication();

	/**
	 * Returns the meta object for the reference list '{@link architecturetool.OSApplication#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tasks</em>'.
	 * @see architecturetool.OSApplication#getTasks()
	 * @see #getOSApplication()
	 * @generated
	 */
	EReference getOSApplication_Tasks();

	/**
	 * Returns the meta object for the reference list '{@link architecturetool.OSApplication#getIsr <em>Isr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Isr</em>'.
	 * @see architecturetool.OSApplication#getIsr()
	 * @see #getOSApplication()
	 * @generated
	 */
	EReference getOSApplication_Isr();

	/**
	 * Returns the meta object for the reference '{@link architecturetool.OSApplication#getMemorypartition <em>Memorypartition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Memorypartition</em>'.
	 * @see architecturetool.OSApplication#getMemorypartition()
	 * @see #getOSApplication()
	 * @generated
	 */
	EReference getOSApplication_Memorypartition();

	/**
	 * Returns the meta object for the attribute '{@link architecturetool.OSApplication#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see architecturetool.OSApplication#getName()
	 * @see #getOSApplication()
	 * @generated
	 */
	EAttribute getOSApplication_Name();

	/**
	 * Returns the meta object for class '{@link architecturetool.ISR <em>ISR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISR</em>'.
	 * @see architecturetool.ISR
	 * @generated
	 */
	EClass getISR();

	/**
	 * Returns the meta object for the reference list '{@link architecturetool.ISR#getRunnables <em>Runnables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Runnables</em>'.
	 * @see architecturetool.ISR#getRunnables()
	 * @see #getISR()
	 * @generated
	 */
	EReference getISR_Runnables();

	/**
	 * Returns the meta object for the attribute '{@link architecturetool.ISR#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see architecturetool.ISR#getName()
	 * @see #getISR()
	 * @generated
	 */
	EAttribute getISR_Name();

	/**
	 * Returns the meta object for class '{@link architecturetool.Memory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory</em>'.
	 * @see architecturetool.Memory
	 * @generated
	 */
	EClass getMemory();

	/**
	 * Returns the meta object for the containment reference list '{@link architecturetool.Memory#getMemorypartition <em>Memorypartition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Memorypartition</em>'.
	 * @see architecturetool.Memory#getMemorypartition()
	 * @see #getMemory()
	 * @generated
	 */
	EReference getMemory_Memorypartition();

	/**
	 * Returns the meta object for the attribute '{@link architecturetool.Memory#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see architecturetool.Memory#getName()
	 * @see #getMemory()
	 * @generated
	 */
	EAttribute getMemory_Name();

	/**
	 * Returns the meta object for class '{@link architecturetool.MemoryPartition <em>Memory Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory Partition</em>'.
	 * @see architecturetool.MemoryPartition
	 * @generated
	 */
	EClass getMemoryPartition();

	/**
	 * Returns the meta object for class '{@link architecturetool.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see architecturetool.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link architecturetool.Port#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see architecturetool.Port#getName()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Name();

	/**
	 * Returns the meta object for the attribute '{@link architecturetool.Port#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see architecturetool.Port#getType()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Type();

	/**
	 * Returns the meta object for the reference '{@link architecturetool.Port#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see architecturetool.Port#getRef()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Ref();

	/**
	 * Returns the meta object for the reference '{@link architecturetool.Port#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see architecturetool.Port#getParameter()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Parameter();

	/**
	 * Returns the meta object for class '{@link architecturetool.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see architecturetool.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link architecturetool.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see architecturetool.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link architecturetool.Attribute#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see architecturetool.Attribute#getDescription()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Description();

	/**
	 * Returns the meta object for the attribute '{@link architecturetool.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see architecturetool.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Type();

	/**
	 * Returns the meta object for class '{@link architecturetool.DataStructure <em>Data Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Structure</em>'.
	 * @see architecturetool.DataStructure
	 * @generated
	 */
	EClass getDataStructure();

	/**
	 * Returns the meta object for the containment reference list '{@link architecturetool.DataStructure#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see architecturetool.DataStructure#getAttributes()
	 * @see #getDataStructure()
	 * @generated
	 */
	EReference getDataStructure_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link architecturetool.DataStructure#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see architecturetool.DataStructure#getName()
	 * @see #getDataStructure()
	 * @generated
	 */
	EAttribute getDataStructure_Name();

	/**
	 * Returns the meta object for the reference list '{@link architecturetool.DataStructure#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>References</em>'.
	 * @see architecturetool.DataStructure#getReferences()
	 * @see #getDataStructure()
	 * @generated
	 */
	EReference getDataStructure_References();

	/**
	 * Returns the meta object for the containment reference list '{@link architecturetool.DataStructure#getStructs <em>Structs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Structs</em>'.
	 * @see architecturetool.DataStructure#getStructs()
	 * @see #getDataStructure()
	 * @generated
	 */
	EReference getDataStructure_Structs();

	/**
	 * Returns the meta object for the attribute '{@link architecturetool.DataStructure#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see architecturetool.DataStructure#getDescription()
	 * @see #getDataStructure()
	 * @generated
	 */
	EAttribute getDataStructure_Description();

	/**
	 * Returns the meta object for class '{@link architecturetool.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see architecturetool.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link architecturetool.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see architecturetool.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for enum '{@link architecturetool.PortListType <em>Port List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Port List Type</em>'.
	 * @see architecturetool.PortListType
	 * @generated
	 */
	EEnum getPortListType();

	/**
	 * Returns the meta object for data type '<em>Stack Int</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Stack Int</em>'.
	 * @model instanceClass="int"
	 *        extendedMetaData="minInclusive='1' maxInclusive='100'"
	 * @generated
	 */
	EDataType getStackInt();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ArchitecturetoolFactory getArchitecturetoolFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link architecturetool.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architecturetool.impl.NodeImpl
		 * @see architecturetool.impl.ArchitecturetoolPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__TASK = eINSTANCE.getNode_Task();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '<em><b>Componentinstance</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__COMPONENTINSTANCE = eINSTANCE.getNode_Componentinstance();

		/**
		 * The meta object literal for the '<em><b>Buildunits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__BUILDUNITS = eINSTANCE.getNode_Buildunits();

		/**
		 * The meta object literal for the '<em><b>Osapplications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__OSAPPLICATIONS = eINSTANCE.getNode_Osapplications();

		/**
		 * The meta object literal for the '<em><b>Isr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__ISR = eINSTANCE.getNode_Isr();

		/**
		 * The meta object literal for the '<em><b>Memory</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__MEMORY = eINSTANCE.getNode_Memory();

		/**
		 * The meta object literal for the '{@link architecturetool.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architecturetool.impl.TaskImpl
		 * @see architecturetool.impl.ArchitecturetoolPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Ram Section Used</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__RAM_SECTION_USED = eINSTANCE.getTask_RamSectionUsed();

		/**
		 * The meta object literal for the '<em><b>Stack</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__STACK = eINSTANCE.getTask_Stack();

		/**
		 * The meta object literal for the '<em><b>Startup Runnables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__STARTUP_RUNNABLES = eINSTANCE.getTask_StartupRunnables();

		/**
		 * The meta object literal for the '<em><b>Runnables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__RUNNABLES = eINSTANCE.getTask_Runnables();

		/**
		 * The meta object literal for the '<em><b>Shutdown Runnables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__SHUTDOWN_RUNNABLES = eINSTANCE.getTask_ShutdownRunnables();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__NAME = eINSTANCE.getTask_Name();

		/**
		 * The meta object literal for the '<em><b>Runtime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__RUNTIME = eINSTANCE.getTask_Runtime();

		/**
		 * The meta object literal for the '<em><b>Memorypartition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__MEMORYPARTITION = eINSTANCE.getTask_Memorypartition();

		/**
		 * The meta object literal for the '{@link architecturetool.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architecturetool.impl.ComponentImpl
		 * @see architecturetool.impl.ArchitecturetoolPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Its Runnable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__ITS_RUNNABLE = eINSTANCE.getComponent_ItsRunnable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Subcomponent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__SUBCOMPONENT = eINSTANCE.getComponent_Subcomponent();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PORT = eINSTANCE.getComponent_Port();

		/**
		 * The meta object literal for the '<em><b>External Static Mem Used</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__EXTERNAL_STATIC_MEM_USED = eINSTANCE.getComponent_ExternalStaticMemUsed();

		/**
		 * The meta object literal for the '<em><b>Structs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__STRUCTS = eINSTANCE.getComponent_Structs();

		/**
		 * The meta object literal for the '{@link architecturetool.impl.RunnableImpl <em>Runnable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architecturetool.impl.RunnableImpl
		 * @see architecturetool.impl.ArchitecturetoolPackageImpl#getRunnable()
		 * @generated
		 */
		EClass RUNNABLE = eINSTANCE.getRunnable();

		/**
		 * The meta object literal for the '<em><b>How To Becalled Behaviour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNNABLE__HOW_TO_BECALLED_BEHAVIOUR = eINSTANCE.getRunnable_HowToBecalledBehaviour();

		/**
		 * The meta object literal for the '<em><b>Needed Run Time Avg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNNABLE__NEEDED_RUN_TIME_AVG = eINSTANCE.getRunnable_NeededRunTimeAvg();

		/**
		 * The meta object literal for the '<em><b>Needed Run Time Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNNABLE__NEEDED_RUN_TIME_MAX = eINSTANCE.getRunnable_NeededRunTimeMax();

		/**
		 * The meta object literal for the '<em><b>Need Accelerator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNNABLE__NEED_ACCELERATOR = eINSTANCE.getRunnable_NeedAccelerator();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNNABLE__NAME = eINSTANCE.getRunnable_Name();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNNABLE__PORTS = eINSTANCE.getRunnable_Ports();

		/**
		 * The meta object literal for the '{@link architecturetool.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architecturetool.impl.ComponentInstanceImpl
		 * @see architecturetool.impl.ArchitecturetoolPackageImpl#getComponentInstance()
		 * @generated
		 */
		EClass COMPONENT_INSTANCE = eINSTANCE.getComponentInstance();

		/**
		 * The meta object literal for the '<em><b>Ram</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INSTANCE__RAM = eINSTANCE.getComponentInstance_Ram();

		/**
		 * The meta object literal for the '<em><b>Ram Section</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INSTANCE__RAM_SECTION = eINSTANCE.getComponentInstance_RamSection();

		/**
		 * The meta object literal for the '<em><b>Rom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INSTANCE__ROM = eINSTANCE.getComponentInstance_Rom();

		/**
		 * The meta object literal for the '<em><b>Nmv</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INSTANCE__NMV = eINSTANCE.getComponentInstance_Nmv();

		/**
		 * The meta object literal for the '<em><b>Meas</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INSTANCE__MEAS = eINSTANCE.getComponentInstance_Meas();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INSTANCE__TYPE = eINSTANCE.getComponentInstance_Type();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INSTANCE__OWNER = eINSTANCE.getComponentInstance_Owner();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INSTANCE__NAME = eINSTANCE.getComponentInstance_Name();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__COMPONENT = eINSTANCE.getComponentInstance_Component();

		/**
		 * The meta object literal for the '<em><b>Resourcebudget</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__RESOURCEBUDGET = eINSTANCE.getComponentInstance_Resourcebudget();

		/**
		 * The meta object literal for the '<em><b>Buildunits</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__BUILDUNITS = eINSTANCE.getComponentInstance_Buildunits();

		/**
		 * The meta object literal for the '{@link architecturetool.impl.ECUImpl <em>ECU</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architecturetool.impl.ECUImpl
		 * @see architecturetool.impl.ArchitecturetoolPackageImpl#getECU()
		 * @generated
		 */
		EClass ECU = eINSTANCE.getECU();

		/**
		 * The meta object literal for the '<em><b>Cpus</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECU__CPUS = eINSTANCE.getECU_Cpus();

		/**
		 * The meta object literal for the '<em><b>Functionalrequirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECU__FUNCTIONALREQUIREMENTS = eINSTANCE.getECU_Functionalrequirements();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECU__NAME = eINSTANCE.getECU_Name();

		/**
		 * The meta object literal for the '{@link architecturetool.impl.CPUImpl <em>CPU</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architecturetool.impl.CPUImpl
		 * @see architecturetool.impl.ArchitecturetoolPackageImpl#getCPU()
		 * @generated
		 */
		EClass CPU = eINSTANCE.getCPU();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CPU__NODES = eINSTANCE.getCPU_Nodes();

		/**
		 * The meta object literal for the '<em><b>Memory</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CPU__MEMORY = eINSTANCE.getCPU_Memory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CPU__NAME = eINSTANCE.getCPU_Name();

		/**
		 * The meta object literal for the '{@link architecturetool.impl.FunctionalRequirementImpl <em>Functional Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architecturetool.impl.FunctionalRequirementImpl
		 * @see architecturetool.impl.ArchitecturetoolPackageImpl#getFunctionalRequirement()
		 * @generated
		 */
		EClass FUNCTIONAL_REQUIREMENT = eINSTANCE.getFunctionalRequirement();

		/**
		 * The meta object literal for the '<em><b>Componentinstance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_REQUIREMENT__COMPONENTINSTANCE = eINSTANCE.getFunctionalRequirement_Componentinstance();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTIONAL_REQUIREMENT__NAME = eINSTANCE.getFunctionalRequirement_Name();

		/**
		 * The meta object literal for the '{@link architecturetool.impl.ResourceBudgetImpl <em>Resource Budget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architecturetool.impl.ResourceBudgetImpl
		 * @see architecturetool.impl.ArchitecturetoolPackageImpl#getResourceBudget()
		 * @generated
		 */
		EClass RESOURCE_BUDGET = eINSTANCE.getResourceBudget();

		/**
		 * The meta object literal for the '<em><b>Runtimebudget</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_BUDGET__RUNTIMEBUDGET = eINSTANCE.getResourceBudget_Runtimebudget();

		/**
		 * The meta object literal for the '<em><b>Memorybudget</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_BUDGET__MEMORYBUDGET = eINSTANCE.getResourceBudget_Memorybudget();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_BUDGET__NAME = eINSTANCE.getResourceBudget_Name();

		/**
		 * The meta object literal for the '{@link architecturetool.impl.RuntimeBudgetImpl <em>Runtime Budget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architecturetool.impl.RuntimeBudgetImpl
		 * @see architecturetool.impl.ArchitecturetoolPackageImpl#getRuntimeBudget()
		 * @generated
		 */
		EClass RUNTIME_BUDGET = eINSTANCE.getRuntimeBudget();

		/**
		 * The meta object literal for the '{@link architecturetool.impl.MemoryBudgetImpl <em>Memory Budget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architecturetool.impl.MemoryBudgetImpl
		 * @see architecturetool.impl.ArchitecturetoolPackageImpl#getMemoryBudget()
		 * @generated
		 */
		EClass MEMORY_BUDGET = eINSTANCE.getMemoryBudget();

		/**
		 * The meta object literal for the '{@link architecturetool.impl.MCCImpl <em>MCC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architecturetool.impl.MCCImpl
		 * @see architecturetool.impl.ArchitecturetoolPackageImpl#getMCC()
		 * @generated
		 */
		EClass MCC = eINSTANCE.getMCC();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MCC__COMPONENTS = eINSTANCE.getMCC_Components();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MCC__NAME = eINSTANCE.getMCC_Name();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MCC__PARAMETERS = eINSTANCE.getMCC_Parameters();

		/**
		 * The meta object literal for the '{@link architecturetool.impl.NoNameElementImpl <em>No Name Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architecturetool.impl.NoNameElementImpl
		 * @see architecturetool.impl.ArchitecturetoolPackageImpl#getNoNameElement()
		 * @generated
		 */
		EClass NO_NAME_ELEMENT = eINSTANCE.getNoNameElement();

		/**
		 * The meta object literal for the '<em><b>Mcc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NO_NAME_ELEMENT__MCC = eINSTANCE.getNoNameElement_Mcc();

		/**
		 * The meta object literal for the '<em><b>Ecus</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NO_NAME_ELEMENT__ECUS = eINSTANCE.getNoNameElement_Ecus();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NO_NAME_ELEMENT__NAME = eINSTANCE.getNoNameElement_Name();

		/**
		 * The meta object literal for the '{@link architecturetool.impl.SubComponentImpl <em>Sub Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architecturetool.impl.SubComponentImpl
		 * @see architecturetool.impl.ArchitecturetoolPackageImpl#getSubComponent()
		 * @generated
		 */
		EClass SUB_COMPONENT = eINSTANCE.getSubComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_COMPONENT__NAME = eINSTANCE.getSubComponent_Name();

		/**
		 * The meta object literal for the '{@link architecturetool.impl.BuildUnitImpl <em>Build Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architecturetool.impl.BuildUnitImpl
		 * @see architecturetool.impl.ArchitecturetoolPackageImpl#getBuildUnit()
		 * @generated
		 */
		EClass BUILD_UNIT = eINSTANCE.getBuildUnit();

		/**
		 * The meta object literal for the '<em><b>Memorypartition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD_UNIT__MEMORYPARTITION = eINSTANCE.getBuildUnit_Memorypartition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILD_UNIT__NAME = eINSTANCE.getBuildUnit_Name();

		/**
		 * The meta object literal for the '{@link architecturetool.impl.OSApplicationImpl <em>OS Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architecturetool.impl.OSApplicationImpl
		 * @see architecturetool.impl.ArchitecturetoolPackageImpl#getOSApplication()
		 * @generated
		 */
		EClass OS_APPLICATION = eINSTANCE.getOSApplication();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OS_APPLICATION__TASKS = eINSTANCE.getOSApplication_Tasks();

		/**
		 * The meta object literal for the '<em><b>Isr</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OS_APPLICATION__ISR = eINSTANCE.getOSApplication_Isr();

		/**
		 * The meta object literal for the '<em><b>Memorypartition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OS_APPLICATION__MEMORYPARTITION = eINSTANCE.getOSApplication_Memorypartition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OS_APPLICATION__NAME = eINSTANCE.getOSApplication_Name();

		/**
		 * The meta object literal for the '{@link architecturetool.impl.ISRImpl <em>ISR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architecturetool.impl.ISRImpl
		 * @see architecturetool.impl.ArchitecturetoolPackageImpl#getISR()
		 * @generated
		 */
		EClass ISR = eINSTANCE.getISR();

		/**
		 * The meta object literal for the '<em><b>Runnables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISR__RUNNABLES = eINSTANCE.getISR_Runnables();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISR__NAME = eINSTANCE.getISR_Name();

		/**
		 * The meta object literal for the '{@link architecturetool.impl.MemoryImpl <em>Memory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architecturetool.impl.MemoryImpl
		 * @see architecturetool.impl.ArchitecturetoolPackageImpl#getMemory()
		 * @generated
		 */
		EClass MEMORY = eINSTANCE.getMemory();

		/**
		 * The meta object literal for the '<em><b>Memorypartition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY__MEMORYPARTITION = eINSTANCE.getMemory_Memorypartition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY__NAME = eINSTANCE.getMemory_Name();

		/**
		 * The meta object literal for the '{@link architecturetool.impl.MemoryPartitionImpl <em>Memory Partition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architecturetool.impl.MemoryPartitionImpl
		 * @see architecturetool.impl.ArchitecturetoolPackageImpl#getMemoryPartition()
		 * @generated
		 */
		EClass MEMORY_PARTITION = eINSTANCE.getMemoryPartition();

		/**
		 * The meta object literal for the '{@link architecturetool.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architecturetool.impl.PortImpl
		 * @see architecturetool.impl.ArchitecturetoolPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__NAME = eINSTANCE.getPort_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__TYPE = eINSTANCE.getPort_Type();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__REF = eINSTANCE.getPort_Ref();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__PARAMETER = eINSTANCE.getPort_Parameter();

		/**
		 * The meta object literal for the '{@link architecturetool.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architecturetool.impl.AttributeImpl
		 * @see architecturetool.impl.ArchitecturetoolPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__DESCRIPTION = eINSTANCE.getAttribute_Description();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '{@link architecturetool.impl.DataStructureImpl <em>Data Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architecturetool.impl.DataStructureImpl
		 * @see architecturetool.impl.ArchitecturetoolPackageImpl#getDataStructure()
		 * @generated
		 */
		EClass DATA_STRUCTURE = eINSTANCE.getDataStructure();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_STRUCTURE__ATTRIBUTES = eINSTANCE.getDataStructure_Attributes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_STRUCTURE__NAME = eINSTANCE.getDataStructure_Name();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_STRUCTURE__REFERENCES = eINSTANCE.getDataStructure_References();

		/**
		 * The meta object literal for the '<em><b>Structs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_STRUCTURE__STRUCTS = eINSTANCE.getDataStructure_Structs();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_STRUCTURE__DESCRIPTION = eINSTANCE.getDataStructure_Description();

		/**
		 * The meta object literal for the '{@link architecturetool.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architecturetool.impl.ParameterImpl
		 * @see architecturetool.impl.ArchitecturetoolPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '{@link architecturetool.PortListType <em>Port List Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architecturetool.PortListType
		 * @see architecturetool.impl.ArchitecturetoolPackageImpl#getPortListType()
		 * @generated
		 */
		EEnum PORT_LIST_TYPE = eINSTANCE.getPortListType();

		/**
		 * The meta object literal for the '<em>Stack Int</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see architecturetool.impl.ArchitecturetoolPackageImpl#getStackInt()
		 * @generated
		 */
		EDataType STACK_INT = eINSTANCE.getStackInt();

	}

} //ArchitecturetoolPackage

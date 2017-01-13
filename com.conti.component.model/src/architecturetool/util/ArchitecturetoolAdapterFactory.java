/**
 */
package architecturetool.util;

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
import architecturetool.ResourceBudget;
import architecturetool.RuntimeBudget;
import architecturetool.SubComponent;
import architecturetool.Task;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see architecturetool.ArchitecturetoolPackage
 * @generated
 */
public class ArchitecturetoolAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArchitecturetoolPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitecturetoolAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ArchitecturetoolPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchitecturetoolSwitch<Adapter> modelSwitch =
		new ArchitecturetoolSwitch<Adapter>() {
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseTask(Task object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter caseRunnable(architecturetool.Runnable object) {
				return createRunnableAdapter();
			}
			@Override
			public Adapter caseComponentInstance(ComponentInstance object) {
				return createComponentInstanceAdapter();
			}
			@Override
			public Adapter caseECU(ECU object) {
				return createECUAdapter();
			}
			@Override
			public Adapter caseCPU(CPU object) {
				return createCPUAdapter();
			}
			@Override
			public Adapter caseFunctionalRequirement(FunctionalRequirement object) {
				return createFunctionalRequirementAdapter();
			}
			@Override
			public Adapter caseResourceBudget(ResourceBudget object) {
				return createResourceBudgetAdapter();
			}
			@Override
			public Adapter caseRuntimeBudget(RuntimeBudget object) {
				return createRuntimeBudgetAdapter();
			}
			@Override
			public Adapter caseMemoryBudget(MemoryBudget object) {
				return createMemoryBudgetAdapter();
			}
			@Override
			public Adapter caseMCC(MCC object) {
				return createMCCAdapter();
			}
			@Override
			public Adapter caseNoNameElement(NoNameElement object) {
				return createNoNameElementAdapter();
			}
			@Override
			public Adapter caseSubComponent(SubComponent object) {
				return createSubComponentAdapter();
			}
			@Override
			public Adapter caseBuildUnit(BuildUnit object) {
				return createBuildUnitAdapter();
			}
			@Override
			public Adapter caseOSApplication(OSApplication object) {
				return createOSApplicationAdapter();
			}
			@Override
			public Adapter caseISR(ISR object) {
				return createISRAdapter();
			}
			@Override
			public Adapter caseMemory(Memory object) {
				return createMemoryAdapter();
			}
			@Override
			public Adapter caseMemoryPartition(MemoryPartition object) {
				return createMemoryPartitionAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseDataStructure(DataStructure object) {
				return createDataStructureAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link architecturetool.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see architecturetool.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link architecturetool.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see architecturetool.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link architecturetool.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see architecturetool.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link architecturetool.Runnable <em>Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see architecturetool.Runnable
	 * @generated
	 */
	public Adapter createRunnableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link architecturetool.ComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see architecturetool.ComponentInstance
	 * @generated
	 */
	public Adapter createComponentInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link architecturetool.ECU <em>ECU</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see architecturetool.ECU
	 * @generated
	 */
	public Adapter createECUAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link architecturetool.CPU <em>CPU</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see architecturetool.CPU
	 * @generated
	 */
	public Adapter createCPUAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link architecturetool.FunctionalRequirement <em>Functional Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see architecturetool.FunctionalRequirement
	 * @generated
	 */
	public Adapter createFunctionalRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link architecturetool.ResourceBudget <em>Resource Budget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see architecturetool.ResourceBudget
	 * @generated
	 */
	public Adapter createResourceBudgetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link architecturetool.RuntimeBudget <em>Runtime Budget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see architecturetool.RuntimeBudget
	 * @generated
	 */
	public Adapter createRuntimeBudgetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link architecturetool.MemoryBudget <em>Memory Budget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see architecturetool.MemoryBudget
	 * @generated
	 */
	public Adapter createMemoryBudgetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link architecturetool.MCC <em>MCC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see architecturetool.MCC
	 * @generated
	 */
	public Adapter createMCCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link architecturetool.NoNameElement <em>No Name Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see architecturetool.NoNameElement
	 * @generated
	 */
	public Adapter createNoNameElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link architecturetool.SubComponent <em>Sub Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see architecturetool.SubComponent
	 * @generated
	 */
	public Adapter createSubComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link architecturetool.BuildUnit <em>Build Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see architecturetool.BuildUnit
	 * @generated
	 */
	public Adapter createBuildUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link architecturetool.OSApplication <em>OS Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see architecturetool.OSApplication
	 * @generated
	 */
	public Adapter createOSApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link architecturetool.ISR <em>ISR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see architecturetool.ISR
	 * @generated
	 */
	public Adapter createISRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link architecturetool.Memory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see architecturetool.Memory
	 * @generated
	 */
	public Adapter createMemoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link architecturetool.MemoryPartition <em>Memory Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see architecturetool.MemoryPartition
	 * @generated
	 */
	public Adapter createMemoryPartitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link architecturetool.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see architecturetool.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link architecturetool.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see architecturetool.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link architecturetool.DataStructure <em>Data Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see architecturetool.DataStructure
	 * @generated
	 */
	public Adapter createDataStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link architecturetool.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see architecturetool.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ArchitecturetoolAdapterFactory

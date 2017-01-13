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
import architecturetool.PortListType;
import architecturetool.ResourceBudget;
import architecturetool.RuntimeBudget;
import architecturetool.SubComponent;
import architecturetool.Task;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see architecturetool.ArchitecturetoolPackage
 * @generated
 */
public class ArchitecturetoolValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ArchitecturetoolValidator INSTANCE = new ArchitecturetoolValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "architecturetool";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitecturetoolValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ArchitecturetoolPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ArchitecturetoolPackage.NODE:
				return validateNode((Node)value, diagnostics, context);
			case ArchitecturetoolPackage.TASK:
				return validateTask((Task)value, diagnostics, context);
			case ArchitecturetoolPackage.COMPONENT:
				return validateComponent((Component)value, diagnostics, context);
			case ArchitecturetoolPackage.RUNNABLE:
				return validateRunnable((architecturetool.Runnable)value, diagnostics, context);
			case ArchitecturetoolPackage.COMPONENT_INSTANCE:
				return validateComponentInstance((ComponentInstance)value, diagnostics, context);
			case ArchitecturetoolPackage.ECU:
				return validateECU((ECU)value, diagnostics, context);
			case ArchitecturetoolPackage.CPU:
				return validateCPU((CPU)value, diagnostics, context);
			case ArchitecturetoolPackage.FUNCTIONAL_REQUIREMENT:
				return validateFunctionalRequirement((FunctionalRequirement)value, diagnostics, context);
			case ArchitecturetoolPackage.RESOURCE_BUDGET:
				return validateResourceBudget((ResourceBudget)value, diagnostics, context);
			case ArchitecturetoolPackage.RUNTIME_BUDGET:
				return validateRuntimeBudget((RuntimeBudget)value, diagnostics, context);
			case ArchitecturetoolPackage.MEMORY_BUDGET:
				return validateMemoryBudget((MemoryBudget)value, diagnostics, context);
			case ArchitecturetoolPackage.MCC:
				return validateMCC((MCC)value, diagnostics, context);
			case ArchitecturetoolPackage.NO_NAME_ELEMENT:
				return validateNoNameElement((NoNameElement)value, diagnostics, context);
			case ArchitecturetoolPackage.SUB_COMPONENT:
				return validateSubComponent((SubComponent)value, diagnostics, context);
			case ArchitecturetoolPackage.BUILD_UNIT:
				return validateBuildUnit((BuildUnit)value, diagnostics, context);
			case ArchitecturetoolPackage.OS_APPLICATION:
				return validateOSApplication((OSApplication)value, diagnostics, context);
			case ArchitecturetoolPackage.ISR:
				return validateISR((ISR)value, diagnostics, context);
			case ArchitecturetoolPackage.MEMORY:
				return validateMemory((Memory)value, diagnostics, context);
			case ArchitecturetoolPackage.MEMORY_PARTITION:
				return validateMemoryPartition((MemoryPartition)value, diagnostics, context);
			case ArchitecturetoolPackage.PORT:
				return validatePort((Port)value, diagnostics, context);
			case ArchitecturetoolPackage.ATTRIBUTE:
				return validateAttribute((Attribute)value, diagnostics, context);
			case ArchitecturetoolPackage.DATA_STRUCTURE:
				return validateDataStructure((DataStructure)value, diagnostics, context);
			case ArchitecturetoolPackage.PARAMETER:
				return validateParameter((Parameter)value, diagnostics, context);
			case ArchitecturetoolPackage.PORT_LIST_TYPE:
				return validatePortListType((PortListType)value, diagnostics, context);
			case ArchitecturetoolPackage.STACK_INT:
				return validateStackInt((Integer)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(node, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(task, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(component, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRunnable(architecturetool.Runnable runnable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(runnable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentInstance(ComponentInstance componentInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateECU(ECU ecu, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ecu, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCPU(CPU cpu, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cpu, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalRequirement(FunctionalRequirement functionalRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(functionalRequirement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceBudget(ResourceBudget resourceBudget, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourceBudget, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRuntimeBudget(RuntimeBudget runtimeBudget, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(runtimeBudget, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemoryBudget(MemoryBudget memoryBudget, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(memoryBudget, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMCC(MCC mcc, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mcc, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoNameElement(NoNameElement noNameElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(noNameElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubComponent(SubComponent subComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBuildUnit(BuildUnit buildUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buildUnit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOSApplication(OSApplication osApplication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(osApplication, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateISR(ISR isr, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(isr, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemory(Memory memory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(memory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemoryPartition(MemoryPartition memoryPartition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(memoryPartition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePort(Port port, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(port, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataStructure(DataStructure dataStructure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataStructure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortListType(PortListType portListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStackInt(int stackInt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStackInt_Min(stackInt, diagnostics, context);
		if (result || diagnostics != null) result &= validateStackInt_Max(stackInt, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateStackInt_Min
	 */
	public static final int STACK_INT__MIN__VALUE = 1;

	/**
	 * Validates the Min constraint of '<em>Stack Int</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStackInt_Min(int stackInt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = stackInt >= STACK_INT__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(ArchitecturetoolPackage.Literals.STACK_INT, stackInt, STACK_INT__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateStackInt_Max
	 */
	public static final int STACK_INT__MAX__VALUE = 100;

	/**
	 * Validates the Max constraint of '<em>Stack Int</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStackInt_Max(int stackInt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = stackInt <= STACK_INT__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(ArchitecturetoolPackage.Literals.STACK_INT, stackInt, STACK_INT__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ArchitecturetoolValidator

package com.conti.component.ui.popup;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import com.conti.component.ui.dialogs.ImportComponentInterfaceDialog;
import com.conti.component.ui.dialogs.ImportECUdialog;
import com.telelogic.rhapsody.core.IRPCollection;
import com.telelogic.rhapsody.core.IRPModelElement;
import com.telelogic.rhapsody.core.IRPStereotype;
import com.telelogic.rhapsody.core.RPDependency;

import architecturetool.ArchitecturetoolFactory;
import architecturetool.CPU;
import architecturetool.ComponentInstance;
import architecturetool.ECU;
import architecturetool.FunctionalRequirement;
import architecturetool.Memory;
import architecturetool.NoNameElement;
import architecturetool.Node;

public class ImportECUInstancefromRhapsodyAction implements IObjectActionDelegate {
	
	private NoNameElement noNameElement;

	@Override
	public void run(IAction action) {
		ImportECUdialog ecuInterfaceDailog=new ImportECUdialog(Display.getDefault().getActiveShell());
		if(IDialogConstants.OK_ID == ecuInterfaceDailog.open()) {

	    	IRPModelElement selectedProject = ecuInterfaceDailog.getSelectedProject();
	    	
	    	
			IRPCollection collectionOfCompInstances = selectedProject.getNestedElementsByMetaClass("Node", 1);
			int noOfNodes = collectionOfCompInstances.getCount();
			for (int i = 1; i < noOfNodes + 1; i++) {
				IRPModelElement componentInstance = (IRPModelElement) collectionOfCompInstances.getItem(i);
				IRPCollection stereotypes = componentInstance.getStereotypes();
				if (stereotypes.getCount() > 0) {
					if (((IRPStereotype) stereotypes.getItem(1)).getName().equals("ECU")) {
						System.out.println(componentInstance.getName());
						ECU createECU = ArchitecturetoolFactory.eINSTANCE.createECU();
						createECU.setName(componentInstance.getName());
						noNameElement.getEcus().add(createECU);
						IRPCollection dependencies = componentInstance.getDependencies();
						if(dependencies.getCount() > 0) {
							for (int j = 1; j < dependencies.getCount()+1; j++) {
								RPDependency item = (RPDependency) dependencies.getItem(j);
//								System.out.println(item.getName());
								IRPModelElement dependent = item.getDependsOn();
								IRPCollection childStereoType = dependent.getStereotypes();
								if (childStereoType.getCount() > 0) {
									if (((IRPStereotype) childStereoType.getItem(1)).getName().equals("CPU")) {
										CPU createCPU = ArchitecturetoolFactory.eINSTANCE.createCPU();	
										createCPU.setName(dependent.getName());
										createECU.getCpus().add(createCPU);
										System.out.println("CPU "+dependent.getName());
										
										IRPCollection nodeDepenencies = dependent.getDependencies();
										if(nodeDepenencies.getCount() > 0) {
											for (int k = 1; k < nodeDepenencies.getCount()+1; k++) {
												RPDependency nodeItem = (RPDependency) nodeDepenencies.getItem(k);
//												System.out.println(item.getName());
												IRPModelElement nodedependent = nodeItem.getDependsOn();
												IRPCollection nodeStereoType = nodedependent.getStereotypes();
												if (nodeStereoType.getCount() > 0) {
													if (((IRPStereotype) nodeStereoType.getItem(1)).getName().equals("ExecutionUnit")) {
														Node createNode = ArchitecturetoolFactory.eINSTANCE.createNode();		
														createNode.setName(nodedependent.getName());
														createCPU.getNodes().add(createNode);
														System.out.println("node "+nodedependent.getName());
													}
													else if (((IRPStereotype) nodeStereoType.getItem(1)).getName().equals("Memory")) {
														Memory creatememory = ArchitecturetoolFactory.eINSTANCE.createMemory();		
														creatememory.setName(nodedependent.getName());
														createCPU.getMemory().add(creatememory);
														System.out.println("node "+nodedependent.getName());
													}
												}
												
											}
										}
									}
								}
								else if (((IRPStereotype) childStereoType.getItem(1)).getName().equals("Function")) {
									FunctionalRequirement createFunctionalRequirement= ArchitecturetoolFactory.eINSTANCE.createFunctionalRequirement();
									createFunctionalRequirement.setName(dependent.getName());
									createECU.getFunctionalrequirements().add(createFunctionalRequirement);
								}
							}
						}
					}
					
				}
			}
		}
		
		
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection sSelection = (IStructuredSelection) selection;
			noNameElement = (NoNameElement) sSelection.getFirstElement();
			
			
		}
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// TODO Auto-generated method stub
		
	}

}

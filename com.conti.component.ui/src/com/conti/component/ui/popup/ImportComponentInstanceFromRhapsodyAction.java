package com.conti.component.ui.popup;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import com.conti.component.ui.Activator;
import com.conti.component.ui.dialogs.ImportComponentInterfaceDialog;
import com.telelogic.rhapsody.core.IRPModelElement;

import architecturetool.ArchitecturetoolFactory;
import architecturetool.ComponentInstance;
import architecturetool.FunctionalRequirement;

public class ImportComponentInstanceFromRhapsodyAction implements IObjectActionDelegate {

	private FunctionalRequirement firstElement;

	public ImportComponentInstanceFromRhapsodyAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run(IAction action) {
		
		ImportComponentInterfaceDialog componentInterfaceDailog=new ImportComponentInterfaceDialog(Display.getDefault().getActiveShell());
	    if(IDialogConstants.OK_ID == componentInterfaceDailog.open()) {
	    	ArrayList<IRPModelElement> componentInstanceList = componentInterfaceDailog.getComponentInstanceList();
	    	for (IRPModelElement irpModelElement : componentInstanceList) {
				ComponentInstance compInstance = ArchitecturetoolFactory.eINSTANCE.createComponentInstance();
				compInstance.setName(irpModelElement.getName());
				firstElement.getComponentinstance().add(compInstance);
				
				compInstance.setMeas(Double.parseDouble(irpModelElement.getTag("Meas").getValue()));
				compInstance.setNmv(Double.parseDouble(irpModelElement.getTag("NVM").getValue()));
				compInstance.setRam(Double.parseDouble(irpModelElement.getTag("RAM").getValue()));
				compInstance.setRom(Integer.parseInt(irpModelElement.getTag("ROM").getValue()));
				
			}
	    }
		
		// TODO Auto-generated method stub

	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection sSelection = (IStructuredSelection) selection;
			firstElement = (FunctionalRequirement) sSelection.getFirstElement();
			
			
		}
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// TODO Auto-generated method stub

	}

}

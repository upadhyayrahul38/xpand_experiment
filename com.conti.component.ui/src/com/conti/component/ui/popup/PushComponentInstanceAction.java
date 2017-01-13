package com.conti.component.ui.popup;

import java.util.List;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import com.telelogic.rhapsody.core.IRPApplication;
import com.telelogic.rhapsody.core.IRPDependency;
import com.telelogic.rhapsody.core.IRPModelElement;
import com.telelogic.rhapsody.core.IRPTag;
import com.telelogic.rhapsody.core.RhapsodyAppServer;

import architecturetool.ComponentInstance;

public class PushComponentInstanceAction implements IObjectActionDelegate {

	private ComponentInstance componentInstance;

	public PushComponentInstanceAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run(IAction action) {
		String name = componentInstance.getName();
		double meas = componentInstance.getMeas();
		double nmv = componentInstance.getNmv();
		String owner = componentInstance.getOwner();
		double ram = componentInstance.getRam();
		int rom = componentInstance.getRom();
		String ramSec = componentInstance.getRamSection();
		addRowInComponentTable(name,meas,nmv,ram,rom,ramSec);

	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection iStructuredSelection = (IStructuredSelection) selection;
			componentInstance = (ComponentInstance) iStructuredSelection.getFirstElement();
			
		}
	}
	public static void addRowInComponentTable(String name, double meas, double nmv, double ram, int rom, String ramSec) {
		IRPApplication rpy = RhapsodyAppServer.getActiveRhapsodyApplication();
		IRPModelElement pkgRoot = rpy.getSelectedElement();
		// step 1
		IRPModelElement addNewAggr = pkgRoot.addNewAggr("ComponentInstance", name);

		// step 2
		addNewAggr.addStereotype("Component", "ComponentInstance");
		addNewAggr.addStereotype("MFC431_specific", "ComponentInstance");

		addNewAggr.addDependency("RRAM_BAI","Dependency");

		addNewAggr.addNewAggr("Tag", "Meas");
		addNewAggr.addNewAggr("Tag", "NVM");
		addNewAggr.addNewAggr("Tag", "RAM");
		addNewAggr.addNewAggr("Tag", "ROM");
		System.out.println(pkgRoot.getMetaClass());

		List<?> tags = addNewAggr.getAllTags().toList();
		for (Object tag : tags) {
			IRPTag tagName = (IRPTag) tag;
			if (tagName.getName().equalsIgnoreCase("Meas")) {
				tagName.setValue(Double.toString(meas));
			} else if (tagName.getName().equalsIgnoreCase("NVM")) {
				tagName.setValue(Double.toString(nmv));
			} else if (tagName.getName().equalsIgnoreCase("RAM")) {
				tagName.setValue(Double.toString(ram));
			} else if (tagName.getName().equalsIgnoreCase("ROM")) {
				tagName.setValue(Integer.toString(rom));
			}
		}

	}
	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// TODO Auto-generated method stub

	}

}

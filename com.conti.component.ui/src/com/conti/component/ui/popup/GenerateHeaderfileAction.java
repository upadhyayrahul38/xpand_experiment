package com.conti.component.ui.popup;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import com.conti.component.ui.templates.PortHeadergenerator;

import architecturetool.Component;

public class GenerateHeaderfileAction implements IObjectActionDelegate {

	private Component component;

	public GenerateHeaderfileAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run(IAction action) {
		// TODO Auto-generated method stub
		
		PortHeadergenerator headergenerator=new PortHeadergenerator();
		String result = headergenerator.generate(component);
		   System.out.println(result);
		   File file = new File("D:\\Work\\Workspaces\\TrialSpace\\com.conti.component.ui\\templates\\"+component.getName()+".h");
			String content = result;
			if (!file.exists()) {
				try {
					file.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			try (FileOutputStream fop = new FileOutputStream(file)) {

				// if file doesn't exists, then create it
			

				// get the content in bytes
				byte[] contentInBytes = content.getBytes();

				fop.write(contentInBytes);
				fop.flush();
				fop.close();

				System.out.println("Done");

			} catch (IOException e) {
				e.printStackTrace();
			}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection iStructuredSelection = (IStructuredSelection) selection;
			component = (Component) iStructuredSelection.getFirstElement();
			
		}
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// TODO Auto-generated method stub

	}

}

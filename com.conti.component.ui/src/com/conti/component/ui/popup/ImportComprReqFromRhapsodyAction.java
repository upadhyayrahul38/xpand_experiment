package com.conti.component.ui.popup;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import com.telelogic.rhapsody.core.IRPApplication;
import com.telelogic.rhapsody.core.IRPCollection;
import com.telelogic.rhapsody.core.IRPModelElement;
import com.telelogic.rhapsody.core.IRPProject;
import com.telelogic.rhapsody.core.IRPStereotype;
import com.telelogic.rhapsody.core.RhapsodyAppServer;

import architecturetool.ArchitecturetoolFactory;
import architecturetool.Component;
import architecturetool.MCC;
import architecturetool.SubComponent;

public class ImportComprReqFromRhapsodyAction implements IObjectActionDelegate {

	private MCC mcc;

	public ImportComprReqFromRhapsodyAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run(IAction action) {
		findElement();
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection iStructuredSelection = (IStructuredSelection) selection;
			Object firstElement = iStructuredSelection.getFirstElement();
			if (firstElement instanceof MCC) {
				mcc = (MCC) firstElement;
			}
			
		}
	}
	
	private void findElement() {
//		URL fileURL = Platform.getBundle(Activator.PLUGIN_ID).getResource("rhapsody.dll");
////		System.load(fileURL);
//		try {
//			URI uri = FileLocator.resolve(fileURL).toURI();
//			System.out.println(uri);
			System.setProperty("java.library.path", "D:/Work/Workspaces/TrialSpace/com.conti.component.ui/dll");
			System.load( "D:/Work/Workspaces/TrialSpace/com.conti.component.ui/dll/rhapsody.dll");
//		} catch (URISyntaxException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		IRPApplication app = RhapsodyAppServer.getActiveRhapsodyApplication();
		IRPProject prj = app.activeProject();
		IRPModelElement myEle = prj.findNestedElementRecursive("CompReq", "Package");
		myEle.highLightElement();
		IRPCollection nestedElementsByMetaClass = myEle.getNestedElementsByMetaClass("Package", 0);
		int count = nestedElementsByMetaClass.getCount();
		for (int i = 1; i < count + 1; i++) {
			IRPModelElement modelElement = (IRPModelElement) nestedElementsByMetaClass.getItem(i);
			if (modelElement.getStereotypes().getCount() > 0) {
				Object item = modelElement.getStereotypes().getItem(1);

				if (((IRPStereotype) item).getName().equals("Component")) {
					System.err.println("Parent Component" +modelElement.getMetaClass() + ": " + modelElement.getDisplayName());
					Component component = ArchitecturetoolFactory.eINSTANCE.createComponent();
					component.setName(modelElement.getName());
					mcc.getComponents().add(component);
					IRPCollection nestedElementsByMetaClass2 = modelElement.getNestedElementsByMetaClass("Component", 1);
					int count2 = nestedElementsByMetaClass2.getCount();
					for (int j = 1; j < count2+1; j++) {
						IRPModelElement innerElement = (IRPModelElement) nestedElementsByMetaClass2.getItem(j);
						if (innerElement.getStereotypes() != null && innerElement.getStereotypes().getCount() > 0) {
							Object innerItem = innerElement.getStereotypes().getItem(1);
							if (((IRPStereotype) innerItem).getName().equals("Sub-Component")) {
								System.out.println("Child Component"+innerElement.getMetaClass() + ": " + innerElement.getDisplayName());
								SubComponent subcomponent = ArchitecturetoolFactory.eINSTANCE.createSubComponent();
								subcomponent.setName(innerElement.getName());
								component.getSubcomponent().add(subcomponent);
							}
						}
					}
				}
			}
		}

	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// TODO Auto-generated method stub

	}

}

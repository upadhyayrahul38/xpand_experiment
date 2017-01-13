package com.conti.component.ui.dialogs;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

import com.telelogic.rhapsody.core.IRPApplication;
import com.telelogic.rhapsody.core.IRPCollection;
import com.telelogic.rhapsody.core.IRPModelElement;
import com.telelogic.rhapsody.core.IRPProject;
import com.telelogic.rhapsody.core.IRPStereotype;
import com.telelogic.rhapsody.core.RPPackage;
import com.telelogic.rhapsody.core.RhapsodyAppServer;

public class ImportComponentInterfaceDialog extends Dialog {
	private static class ViewerLabelProvider extends LabelProvider {
		public Image getImage(Object element) {
			return super.getImage(element);
		}

		public String getText(Object element) {
			if (element instanceof IRPModelElement) {
				IRPModelElement irpModelElement = (IRPModelElement) element;
				return irpModelElement.getName();
			}
			return super.getText(element);
		}
	}

	private String name;
	private ComboViewer coreComboViewer;
	private ArrayList<IRPModelElement> componentInstanceList = new ArrayList<IRPModelElement>();

	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 */
	public ImportComponentInterfaceDialog(Shell parentShell) {
		super(parentShell);
	}

	/**
	 * Create contents of the dialog.
	 * 
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		container.setLayout(new GridLayout(2, false));
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);

		Label lblProject = new Label(container, SWT.NONE);
		lblProject.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblProject.setText("Project");

		ArrayList<IRPModelElement> arrayList = new ArrayList<IRPModelElement>();
		IRPApplication app = RhapsodyAppServer.getActiveRhapsodyApplication();
		IRPProject prj = app.activeProject();
		IRPModelElement myEle = prj.findNestedElementRecursive("Projects", "Package");
		myEle.highLightElement();
		IRPCollection nestedElementsByMetaClass = myEle.getNestedElementsByMetaClass("Package", 0);
		int count = nestedElementsByMetaClass.getCount();
		for (int i = 1; i < count + 1; i++) {
			IRPModelElement modelElement = (IRPModelElement) nestedElementsByMetaClass.getItem(i);
			name = modelElement.getName();
			System.out.println(myEle.getClass().getName());
			arrayList.add(modelElement);

		}

		ComboViewer comboViewer = new ComboViewer(container, SWT.NONE);
		Combo combo = comboViewer.getCombo();
		combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		comboViewer.setContentProvider(new ArrayContentProvider());
		comboViewer.setLabelProvider(new ViewerLabelProvider());
		comboViewer.setInput(arrayList);
		comboViewer.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				ISelection selection = event.getSelection();
				IStructuredSelection sSelection = (IStructuredSelection) selection;
				IRPModelElement firstElement = (IRPModelElement) sSelection.getFirstElement();
				IRPCollection collectionOfCompInstances = firstElement.getNestedElementsByMetaClass("Node", 1);
				int noOfNodes = collectionOfCompInstances.getCount();
				ArrayList<IRPModelElement> nodeList = new ArrayList<IRPModelElement>();
				for (int i = 1; i < noOfNodes + 1; i++) {
					IRPModelElement componentInstance = (IRPModelElement) collectionOfCompInstances.getItem(i);
					IRPCollection stereotypes = componentInstance.getStereotypes();
					if (stereotypes.getCount() > 0) {
						if (((IRPStereotype) stereotypes.getItem(1)).getName().equals("ExecutionUnit")) {
							System.out.println(componentInstance.getName());
							nodeList.add(componentInstance);
						}
					}
				}
				coreComboViewer.setInput(nodeList);
			}
		});

		Label lblNode = new Label(container, SWT.NONE);
		lblNode.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNode.setText("Node");
		
		coreComboViewer = new ComboViewer(container, SWT.NONE);
		Combo combo_1 = coreComboViewer.getCombo();
		combo_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		coreComboViewer.setContentProvider(ArrayContentProvider.getInstance());
		coreComboViewer.setLabelProvider(new LabelProvider(){
			@Override
			public String getText(Object element) {
				IRPModelElement modelElement = (IRPModelElement)element;
				return modelElement.getName();
			}
		});
		
		coreComboViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection sSelection = (IStructuredSelection)event.getSelection();
				IRPModelElement firstElement = (IRPModelElement) sSelection.getFirstElement();
				IRPCollection nestedElements = firstElement.getNestedElementsByMetaClass("ComponentInstance", 1);
				
				
				int noOfCompinst = nestedElements.getCount();
				for (int j = 1; j < noOfCompinst+1; j++) {
					IRPModelElement item = (IRPModelElement)nestedElements.getItem(j);
					componentInstanceList.add(item);
				}
			}
		});

		return container;
	}
	
	public ArrayList<IRPModelElement> getComponentInstanceList() {
		return componentInstanceList;
	}

	/**
	 * Create contents of the button bar.
	 * 
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
		createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(305, 174);
	}

}

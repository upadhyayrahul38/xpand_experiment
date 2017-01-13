package com.conti.component.ui.dialogs;

import java.util.ArrayList;

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
import com.telelogic.rhapsody.core.RPDependency;
import com.telelogic.rhapsody.core.RhapsodyAppServer;

public class ImportECUdialog extends Dialog {
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
	private ArrayList<IRPModelElement> eCUList = new ArrayList<IRPModelElement>();
	private ComboViewer comboViewer;
	private IRPModelElement selectedProject;

	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 */
	public ImportECUdialog(Shell parentShell) {
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

		comboViewer = new ComboViewer(container, SWT.NONE);
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
				
			}
		});

	
		
		

		return container;
	}
	
	@Override
	protected void okPressed() {
		selectedProject = (IRPModelElement) ((IStructuredSelection)comboViewer.getSelection()).getFirstElement();
		super.okPressed();
	}
	
	public IRPModelElement getSelectedProject() {
		return selectedProject;
	};
	
	public ArrayList<IRPModelElement> getComponentInstanceList() {
		return eCUList;
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

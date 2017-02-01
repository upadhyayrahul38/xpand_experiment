package com.conti.component.application;

import java.net.URL;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ConnectionEndpointLocator;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.LightweightSystem;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.part.ViewPart;

public class OutlineView extends ViewPart implements ISelectionChangedListener {
    
	// layout.addView("com.conti.component.ui.popup.OutlineView", IPageLayout.BOTTOM, 0.3f, IPageLayout.ID_OUTLINE);
	private Label label;
	@Override
	public void createPartControl(Composite parent) {
              Canvas canvas = new Canvas(parent, 0);
              // Starting Outline View 
              LightweightSystem lws = new LightweightSystem(canvas);
          	Figure contents = new Figure();
          	XYLayout contentsLayout = new XYLayout();
          	contents.setLayoutManager(contentsLayout);
          	
          	Font classFont = new Font(null, "Arial", 12, SWT.BOLD);
          	
          	 URL imageURL = UMLClassFigureTest.class.getResource("class_obj.gif");
          	 Image image = ImageDescriptor.createFromURL(imageURL).createImage();
          	 
          	org.eclipse.draw2d.Label classLabel1 = new org.eclipse.draw2d.Label("Table",image);
          	classLabel1.setFont(classFont);
          	
          	org.eclipse.draw2d.Label classLabel2 = new org.eclipse.draw2d.Label("Column",image);
          	classLabel2.setFont(classFont);
          	
          	final UMLClassFigure classFigure = new UMLClassFigure(classLabel1);
          	final UMLClassFigure classFigure2 = new UMLClassFigure(classLabel2);
          	
          	imageURL = UMLClassFigureTest.class.getResource("field_private_obj.gif");
          	image = ImageDescriptor.createFromURL(imageURL).createImage();
          	
          	org.eclipse.draw2d.Label attribute1 = new org.eclipse.draw2d.Label("columns: Column[]", image);
          	org.eclipse.draw2d.Label attribute2 = new org.eclipse.draw2d.Label("rows: Row[]", image);
          	org.eclipse.draw2d.Label attribute3 = new org.eclipse.draw2d.Label("columnID: int", image);
          	org.eclipse.draw2d.Label attribute4 = new org.eclipse.draw2d.Label("items: List", image);

          	classFigure.getAttributesCompartment().add(attribute1);
          	classFigure.getAttributesCompartment().add(attribute2);
          	classFigure2.getAttributesCompartment().add(attribute3);
          	classFigure2.getAttributesCompartment().add(attribute4);
              
          	imageURL = UMLClassFigureTest.class.getResource("methpub_obj.gif");
          	image = ImageDescriptor.createFromURL(imageURL).createImage();
          	org.eclipse.draw2d.Label method1 = new org.eclipse.draw2d.Label("getColumns(): Column[]", image);
          	org.eclipse.draw2d.Label method2 = new org.eclipse.draw2d.Label("getRows(): Row[]", image);
          	org.eclipse.draw2d.Label method3 = new org.eclipse.draw2d.Label("getColumnID(): int", image);
          	org.eclipse.draw2d.Label method4 = new org.eclipse.draw2d.Label("getItems(): List", image);

          	classFigure.getMethodsCompartment().add(method1);
          	classFigure.getMethodsCompartment().add(method2);
          	classFigure2.getMethodsCompartment().add(method3);
          	classFigure2.getMethodsCompartment().add(method4);
          					
          	contentsLayout.setConstraint(classFigure, new Rectangle(10,10,-1,-1));
          	contentsLayout.setConstraint(classFigure2, new Rectangle(200, 200, -1, -1));
          	
          	/* Creating the connection */
          	PolylineConnection c = new PolylineConnection();
          	ChopboxAnchor sourceAnchor = new ChopboxAnchor(classFigure);
          	ChopboxAnchor targetAnchor = new ChopboxAnchor(classFigure2);
          	c.setSourceAnchor(sourceAnchor);
          	c.setTargetAnchor(targetAnchor);
          	
          	/* Creating the decoration */
          	PolygonDecoration decoration = new PolygonDecoration();
          	PointList decorationPointList = new PointList();
          	decorationPointList.addPoint(0,0);
          	decorationPointList.addPoint(-2,2);
          	decorationPointList.addPoint(-4,0);
          	decorationPointList.addPoint(-2,-2);
          	decoration.setTemplate(decorationPointList);
          	c.setSourceDecoration(decoration);
          	
          	/* Adding labels to the connection */
          	ConnectionEndpointLocator targetEndpointLocator = 
          	        new ConnectionEndpointLocator(c, true);
          	targetEndpointLocator.setVDistance(15);
          	org.eclipse.draw2d.Label targetMultiplicityLabel = new org.eclipse.draw2d.Label("1..*");
          	c.add(targetMultiplicityLabel, targetEndpointLocator);

          	ConnectionEndpointLocator sourceEndpointLocator = 
          		new ConnectionEndpointLocator(c, false);
          	sourceEndpointLocator.setVDistance(15);
          	org.eclipse.draw2d.Label sourceMultiplicityLabel = new org.eclipse.draw2d.Label("1");
          	c.add(sourceMultiplicityLabel, sourceEndpointLocator);

          	ConnectionEndpointLocator relationshipLocator = 
          		new ConnectionEndpointLocator(c,true);
          	relationshipLocator.setUDistance(10);
          	relationshipLocator.setVDistance(-20);
          	org.eclipse.draw2d.Label relationshipLabel = new org.eclipse.draw2d.Label("contains");
          	c.add(relationshipLabel,relationshipLocator);

          	contents.add(classFigure);
          	contents.add(classFigure2);
          	contents.add(c);
          	lws.setContents(contents);
	}

	@Override
	public void setFocus() {
           //label.setFocus();
	}

	public OutlineView() {
		super();
	}

	@Override
	public void selectionChanged(SelectionChangedEvent event) {
		
		
	}

}

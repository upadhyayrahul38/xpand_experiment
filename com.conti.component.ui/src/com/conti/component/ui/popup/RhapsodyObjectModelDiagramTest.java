package com.conti.component.ui.popup;

import java.util.List;

import com.telelogic.rhapsody.core.IRPApplication;
import com.telelogic.rhapsody.core.IRPCollection;
import com.telelogic.rhapsody.core.IRPFlow;
import com.telelogic.rhapsody.core.IRPFlowItem;
import com.telelogic.rhapsody.core.IRPModelElement;
import com.telelogic.rhapsody.core.RPDependency;
import com.telelogic.rhapsody.core.RPObjectModelDiagram;
import com.telelogic.rhapsody.core.RhapsodyAppServer;

public class RhapsodyObjectModelDiagramTest {

	public static void main(String[] args) {
		IRPApplication app = RhapsodyAppServer.getActiveRhapsodyApplication();
		RPObjectModelDiagram el = (RPObjectModelDiagram)app.getSelectedElement();


	}

}

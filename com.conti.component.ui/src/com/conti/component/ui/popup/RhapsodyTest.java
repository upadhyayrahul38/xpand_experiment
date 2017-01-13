package com.conti.component.ui.popup;

import java.util.List;

import com.telelogic.rhapsody.core.IRPApplication;
import com.telelogic.rhapsody.core.IRPCollection;
import com.telelogic.rhapsody.core.IRPFlow;
import com.telelogic.rhapsody.core.IRPFlowItem;
import com.telelogic.rhapsody.core.IRPModelElement;
import com.telelogic.rhapsody.core.RPDependency;
import com.telelogic.rhapsody.core.RhapsodyAppServer;

public class RhapsodyTest {

	public static void main(String[] args) {
		IRPApplication app = RhapsodyAppServer.getActiveRhapsodyApplication();
		IRPFlow el = (IRPFlow)app.getSelectedElement();

		// access the collection of itemflows
		List<IRPFlowItem> ListOfItemFlows = el.getConveyed().toList();
		System.out.println("Item flows under "+el.getName()+" flow:");
		for (IRPFlowItem itemflow : ListOfItemFlows)
		{
		System.out.print("\t" + itemflow.getName());

		// access the flow that contains/owns the above flowitems

		List<IRPModelElement> ItemFlowRefs = itemflow.getReferences().toList();

		for (IRPModelElement ref : ItemFlowRefs)
		{
		if (ref instanceof IRPFlow) {
			IRPCollection dependencies = ref.getDependencies();
			if(dependencies.getCount() > 0) {
				for (int j = 1; j < dependencies.getCount()+1; j++) {
					RPDependency item = (RPDependency) dependencies.getItem(j);
//					System.out.println(item.getName());
					IRPModelElement dependent = item.getDependsOn();
					System.out.println(dependent.getName());
				}
			}
//			System.out.println(" (belongs to "+dependencies+")");
			
		}
		}
		}

	}

}

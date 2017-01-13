package rhapsody.util;

import java.util.List;

import com.telelogic.rhapsody.core.IRPApplication;
import com.telelogic.rhapsody.core.IRPCollection;
import com.telelogic.rhapsody.core.IRPEvent;
import com.telelogic.rhapsody.core.IRPPackage;
import com.telelogic.rhapsody.core.RPTableView;
import com.telelogic.rhapsody.core.RhapsodyAppServer;

public class RhapsodyUtil {

	public static void main(String[] args) {
		IRPApplication app = RhapsodyAppServer.getActiveRhapsodyApplication();
		IRPCollection listOfSelectedElements = app.getListOfSelectedElements();
		List list = listOfSelectedElements.toList();
		for (Object object : list) {
			RPTableView tableView = (RPTableView) object;
			System.out.println(tableView.getHTMLContent());
			
		}
		
		
	}

}

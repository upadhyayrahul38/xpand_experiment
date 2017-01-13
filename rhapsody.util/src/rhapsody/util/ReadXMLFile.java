package rhapsody.util;

import java.io.File;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.telelogic.rhapsody.core.IRPApplication;
import com.telelogic.rhapsody.core.IRPCollection;
import com.telelogic.rhapsody.core.RPTableView;
import com.telelogic.rhapsody.core.RhapsodyAppServer;

public class ReadXMLFile {

	private static String htmlContent;

	public static void main(String argv[]) {

		try {

			IRPApplication app = RhapsodyAppServer.getActiveRhapsodyApplication();
			IRPCollection listOfSelectedElements = app.getListOfSelectedElements();
			List list = listOfSelectedElements.toList();
			
			for (Object object : list) {
				RPTableView tableView = (RPTableView) object;
				htmlContent = tableView.getHTMLContent();
				System.out.println(htmlContent);
			}
		}
//			File fXmlFile = new File("C:\\Users\\uid20364\\Downloads\\resumeXML\\resume_w_xsl.xml");
//			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
//			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
//			Document doc = dBuilder.parse(fXmlFile);

			//optional, but recommended
			//read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
//			doc.getDocumentElement().normalize();

//			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

//			NodeList nList = doc.getElementsByTagName("book");

//			System.out.println("----------------------------");
//
//			for (int temp = 0; temp < nList.getLength(); temp++) {
//
//				Node nNode = nList.item(temp);
//
////				System.out.println("\nCurrent Element :" + nNode.getNodeName());
//
//				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
//
//					Element eElement = (Element) nNode;

//					System.out.println("Staff id : " + eElement.getAttribute("id"));
//					System.out.println("First Name : " + eElement.getElementsByTagName("author").item(0).getTextContent());
//					System.out.println("Last Name : " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
//					System.out.println("Nick Name : " + eElement.getElementsByTagName("nickname").item(0).getTextContent());
//					System.out.println("Salary : " + eElement.getElementsByTagName("salary").item(0).getTextContent());


//			for (Object object : list) {
//				RPTableView tableView = (RPTableView) object;
//				System.out.println(tableView.getHTMLContent());
//			}
//				}
//				
//			}
//		}
//			
//
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
			
		
		

}
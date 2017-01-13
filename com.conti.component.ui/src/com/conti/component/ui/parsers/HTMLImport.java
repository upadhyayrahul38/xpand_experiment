package com.conti.component.ui.parsers;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;

import architecturetool.ArchitecturetoolFactory;
import architecturetool.ComponentInstance;

public class HTMLImport {
	private static String htmlContent;

	public static void main(String args[]) {

		// IRPApplication app =
		// RhapsodyAppServer.getActiveRhapsodyApplication();
		// IRPCollection listOfSelectedElements =
		// app.getListOfSelectedElements();
		// List list = listOfSelectedElements.toList();
		//
		// for (Object object : list) {
		// RPTableView tableView = (RPTableView) object;
		// htmlContent = tableView.getHTMLContent();
		// System.out.println(htmlContent);
		// }

		importHTML("D:\\Work\\Workspaces\\TrialSpace\\vikash.html");
	}

	public static ArrayList importHTML(String path) {
		Document htmlFile = null;

		try {

			htmlFile = Jsoup.parse(new File(path), "ISO-8859-1");

		} catch (IOException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		} // right
	
		ArrayList list=new ArrayList();
		 Elements element = htmlFile.body().getElementsByTag("TR");
		System.out.println(element.size());
		int count=0;
//		System.out.println(htmlFile.body().getElementsByTag("TR").get(40).children().get(2).text().equals("\u00a0"));
		for (int temp = 1; temp < element.size(); temp++) {
			ComponentInstance componentInstance=ArchitecturetoolFactory.eINSTANCE.createComponentInstance();
			int size = htmlFile.body().getElementsByTag("TD").get(temp).siblingElements().size()+1;
				for (int temp2 = 0; temp2 < size; temp2++) {
					String text = htmlFile.body().getElementsByTag("TR").get(temp).children().get(temp2).text();
					
					
					if(temp2==0){
						
						componentInstance.setName(text);
					}
					else if(temp2==1){
						if(!text.equals("\u00a0"))
						componentInstance.setRam(Double.parseDouble(text));
					}
					else if(temp2==2){
						
						componentInstance.setRamSection(text);
					}
					else if(temp2==3){
						if(!text.equals("\u00a0"))
						componentInstance.setRom(Integer.parseInt(text));
					}
					else if(temp2==4){
						if(!text.equals("\u00a0"))
						componentInstance.setNmv(Double.parseDouble(text));
					}
					else if(temp2==5){
						if(!text.equals("\u00a0"))
						componentInstance.setMeas(Double.parseDouble(text));
					}
					else if(temp2==6){
//						componentInstance.setComponent(text);
					}
					else if(temp2==7){
						componentInstance.setType(text);
					}
					else if(temp2==8){
						componentInstance.setOwner(text);
					}
//					
//					list.add(text);
//				System.out.println(text); // getting class form HTML element
					
				}

				list.add(componentInstance);
			
			
		}
		System.out.println(list);
		System.out.println("\n");
		return list;
	}
}

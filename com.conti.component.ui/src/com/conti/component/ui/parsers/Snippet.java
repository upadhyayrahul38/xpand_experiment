package com.conti.component.ui.parsers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import architecturetool.ArchitecturetoolFactory;
import architecturetool.Component;
import architecturetool.ComponentInstance;
import architecturetool.Task;

public class Snippet {
	public static void main(String[] args) {
		try {
			File myFile = new File("D:\\Work\\Documents\\components_tasks.xlsx");
			FileInputStream fis = new FileInputStream(myFile); // Finds the
																// workbook
																// instance for
																// XLSX
																// file
			XSSFWorkbook myWorkBook = new XSSFWorkbook(fis); // Return first
																// sheet
																// from the XLSX
			loadComponent(myWorkBook);
			loadTask(myWorkBook);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static ArrayList loadComponent(XSSFWorkbook myWorkBook) {
		// workbook
		XSSFSheet mySheet = myWorkBook.getSheetAt(0); // Get iterator to all the
		// rows in current sheet
		Iterator<Row> rowIterator = mySheet.iterator(); // Traversing over each	
		// row of XLSX file
		ArrayList arrayList=new ArrayList();
		
		int j=0;
		while (rowIterator.hasNext()) {
			
			Row row = rowIterator.next(); // For each row, iterate through each
			
			ComponentInstance componentInstance=ArchitecturetoolFactory.eINSTANCE.createComponentInstance();
			int i=0;
			
			Iterator<Cell> cellIterator = row.cellIterator();
			while (cellIterator.hasNext()) {
				i++;
				
				Cell cell = cellIterator.next();
				switch (cell.getCellType()) {
				case Cell.CELL_TYPE_STRING:
					if(i==1){
						if(cell.getStringCellValue().trim().equals("Component Instance"))
						{
							continue;
						}
						componentInstance.setName(cell.getStringCellValue());
					}
					else if(i==3){
						if(cell.getStringCellValue().trim().equals("RAM sections used"))
						{
							continue;
						}
						componentInstance.setRamSection(cell.getStringCellValue());
					}
					else if(i==7){ 
						if(cell.getStringCellValue().trim().equals("Component under CompReq"))
						{
							continue;
						}
//						componentInstance.setComponent((Component)cell.getStringCellValue());
					}
					else if(i==8){
						if(cell.getStringCellValue().trim().equals("Type"))
						{
							continue;
						}
						componentInstance.setType(cell.getStringCellValue());
					}
					else if(i==9){
						if(cell.getStringCellValue().trim().equals("Owner"))
						{
							continue;
						}
						componentInstance.setOwner(cell.getStringCellValue());
					}
					
					
					break;
				case Cell.CELL_TYPE_NUMERIC:
					 if(i==2){
						
						componentInstance.setRam(cell.getNumericCellValue());
					}
					 
					 else if(i==4){
							
							double numericCellValue = cell.getNumericCellValue();
							
							componentInstance.setRom((int)numericCellValue);
						}
						 
						 else if(i==5){
								
								componentInstance.setNmv(cell.getNumericCellValue());
							}
						 else if(i==6){
								
								componentInstance.setMeas(cell.getNumericCellValue());
							}
					break;
				case Cell.CELL_TYPE_BOOLEAN:
//					System.out.print(cell.getBooleanCellValue() + "\t");
//					arrayList.add(cell.getBooleanCellValue());
					break;
				default:
				}
			}
			if(componentInstance.getName()!=null){
			arrayList.add(componentInstance);
			}
			
		}
		System.out.println(arrayList);
		System.out.println("\n");
		return arrayList;
	}
	
	public static ArrayList loadTask(XSSFWorkbook myWorkBook) {

		// workbook
		XSSFSheet mySheet = myWorkBook.getSheetAt(1); // Get iterator to all the
		// rows in current sheet
		Iterator<Row> rowIterator = mySheet.iterator(); // Traversing over each
		// row of XLSX file
		ArrayList arrayList=new ArrayList();
		
		int j=0;
		while (rowIterator.hasNext()) {
			
			Row row = rowIterator.next(); // For each row, iterate through each
			
			Task task=ArchitecturetoolFactory.eINSTANCE.createTask();
			int i=0;
			
			Iterator<Cell> cellIterator = row.cellIterator();
			while (cellIterator.hasNext()) {
				i++;
				
				Cell cell = cellIterator.next();
				switch (cell.getCellType()) {
				case Cell.CELL_TYPE_STRING:
					if(i==1){
						if(cell.getStringCellValue().trim().equals("Name"))
						{
							continue;
						}
						task.setName(cell.getStringCellValue());
					}
					else if(i==2){
						if(cell.getStringCellValue().trim().equals("RAM sections used"))
						{
							continue;
						}
						task.setRamSectionUsed(cell.getStringCellValue());
					}
				
					
					
					break;
				case Cell.CELL_TYPE_NUMERIC:
					if(i==3){
						
						
						task.setStack((int)cell.getNumericCellValue());
					}

					else if(i==4){
						
						task.setRuntime((int)cell.getNumericCellValue());
					}
					 
					break;
				default:
				}
			}
			if(task.getName()!=null){
			arrayList.add(task);
			}
			
		}
		System.out.println(arrayList);
		System.out.println("\n");
		return arrayList;
	
		
	}

}

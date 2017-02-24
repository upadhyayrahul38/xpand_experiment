package com.conti.component.ui.templates;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelToAutoSarGen {
	private Object autosarGenObj;
	protected String packageImpl;
	protected String type_Str;
	protected String short_name;
	protected String description;
	protected String category;

	public ExcelToAutoSarGen(Object object) {
		this.autosarGenObj = object;
	}

	public static void main(String[] args) {
		File baseAlgoFile = new File("C:\\EclipseDSL\\algo\\vdy\\vdy_algo_interface_types.xls");
		List<Integer> outlineLevelList = new ArrayList<Integer>();
		ArrayList iteratorList = new ArrayList();
		ArrayList<DataStructure> dsList = new ArrayList<DataStructure>();
		Set<Integer> outlineSet = new HashSet<Integer>();
		Set<Integer> levelGroupSet = new HashSet<Integer>();
		HashMap<Integer, ArrayList<DataStructure>> dataStructMap = new HashMap<Integer, ArrayList<DataStructure>>();
		try {
			FileInputStream fileInputStream = new FileInputStream(baseAlgoFile);
			if (baseAlgoFile != null && baseAlgoFile.isFile() && baseAlgoFile.exists()) {
				try {
					Workbook workbook = WorkbookFactory.create(fileInputStream);
					Iterator<Sheet> sheetIterator = workbook.sheetIterator();
					List<Row> rowList = new ArrayList<Row>();
					while (sheetIterator.hasNext()) {
						Sheet sheet = sheetIterator.next();
						if (sheet instanceof HSSFSheet) {
							HSSFSheet hssfSheet = ((HSSFSheet) sheet);
							String sheetName = hssfSheet.getSheetName();
							if (sheetName != null && sheetName.equals("VehDyn")) {
								Iterator<Row> rowIterator = hssfSheet.rowIterator();
								while (rowIterator.hasNext()) {
									Row row = rowIterator.next();
									outlineLevelList.add((row.getOutlineLevel() + 1));
									rowList.add(row);
								}
							}
						}
					}
					int minLevel = -1;
					int maxLevel = -1;
					outlineSet.addAll(outlineLevelList);
					Object[] outlineLevel = outlineSet.toArray();
					minLevel = (int) outlineLevel[0];
					maxLevel = (int) outlineLevel[outlineLevel.length - 1];
					for (int i = 0; i < outlineLevel.length; i++) {
						int currLevel = (int) outlineLevel[i];
						for (int j = 0; j < rowList.size(); j++) {
							Row rowInfo = rowList.get(j);
							int currRowOutlineLevel = (rowInfo.getOutlineLevel() + 1);
							if ((currLevel <3) && (currLevel == currRowOutlineLevel)
									&& ((rowInfo.getRowNum() + 1) > 1)) {
								System.err.println("RowInfo:: " + (rowInfo.getRowNum() + 1)
										+ " Current Outline Level:: " + (currRowOutlineLevel));
								String rowStringCellValue = rowInfo.getCell(3).getStringCellValue();
								System.err.println("RowStringCellValue is:: " + rowStringCellValue);
								if (rowStringCellValue.equals("struct")) {
									Iterator<Cell> rowCellIterator = rowInfo.cellIterator();
									Iterator<Cell> cellIterator = rowCellIterator;
									if (!iteratorList.isEmpty()) {
										iteratorList.clear();
									}
									cellIterator.forEachRemaining(iteratorList::add);
									DataStructure dataStructure = new DataStructure(iteratorList.get(0).toString(),
											iteratorList.get(1).toString(), iteratorList.get(2).toString(),
											iteratorList.get(3).toString(), iteratorList.get(4).toString(),
											iteratorList.get(5).toString(), iteratorList.get(6).toString(),
											iteratorList.get(7).toString(), iteratorList.get(8).toString(),
											iteratorList.get(9).toString(), iteratorList.get(10).toString(),
											iteratorList.get(11).toString(), iteratorList.get(12).toString(),
											iteratorList.get(13).toString());
									dsList.add(dataStructure);
									dataStructMap.put(rowInfo.getRowNum(),dsList);
									outlineLevelList.add(rowInfo.getRowNum());
								}
							}
						}
					}
					int size = dsList.size();
				} catch (EncryptedDocumentException e) {
					e.printStackTrace();
				} catch (InvalidFormatException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			ArrayList<DataStructure> dataStructList = dataStructMap.get(1);
			System.err.println("Coming inside data struct map:: "+dataStructList);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

//	private static int GetGroupData(List<Row> rows, int index, int groupLevel) {
//	      for (;index<rows.size();index++) {
//	    	  Row rowInfo = rows.get(index);
//	    	  int rowGroupLevel = rowInfo.getOutlineLevel();
//	    	  if(rowGroupLevel > groupLevel) {
//	    		  index = GetGroupData(rows, index, rowGroupLevel);
//	    	  } else if(rowGroupLevel < groupLevel) {
//	    		  return index;
//	    	  } else {
//	    	  }
//	      }
//	      return index;
//	}

}

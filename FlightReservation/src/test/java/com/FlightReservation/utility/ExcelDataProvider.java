package com.FlightReservation.utility;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	
public ExcelDataProvider(String excelpath,String sheetname) 
	
	
    {
	try {
		workbook = new XSSFWorkbook(excelpath);
		sheet=workbook.getSheet(sheetname);	
	    } 
	catch (Exception e) 
	{
		System.out.println("unable to read the excel teh Excel File"+ e.getMessage());
		
		//e.printStackTrace();
	      }
	
     }
	

	
	public static void getRowCount() 
	
	{
		
		
		try {
			
			
	//to get the row count for the sheet.		
			int rowCount=sheet.getPhysicalNumberOfRows();
			
			System.out.println("Number of Rows:  " + rowCount);
			
		} catch (Exception exp) {
			
			System.out.println("unable to read the row count" + exp.getMessage());
			
		}
		
				
	}
	
	public static void getCellDataString(int rowNum, int colNum)
	{
		try {
			
			
			String cellData=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println(cellData);
			
		} catch (Exception exp) {
			
			System.out.println("unable to read CellDataString" + exp.getMessage());
			
		}
		
		
	}
	
	public static void getCellDataNumber(int rowNum, int colNum)
	{
		try {
		
			
		double cellData=sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println(cellData);
			
		} catch (Exception exp) {
			
			System.out.println("unable to read CellDataNumber" + exp.getMessage());
			
		}
		
		
	}
	
	
}

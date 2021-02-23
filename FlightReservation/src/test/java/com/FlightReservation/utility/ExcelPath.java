package com.FlightReservation.utility;



public class ExcelPath {
	
	
	public static void main (String[] args)
	
	{
		ExcelDataProvider excel=new ExcelDataProvider("./TestData/Data.xlsx", "data2");
		excel.getRowCount();
		excel.getCellDataString(0, 0);
		excel.getCellDataString(1, 0);
		
		System.out.println("     ");
		
		
		excel.getCellDataString(0, 1);
		excel.getCellDataString(1, 1);
		
	}
	
}


	
	

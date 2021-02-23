package com.FlightReservation.utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

//import com.google.common.io.Files;



public class ScreenShot {

	
	public static void captureScreenShot(WebDriver driver)
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File srcFile=ts.getScreenshotAs(OutputType.FILE);
		
		try {
			FileHandler.copy(srcFile, new File("./ScreenShots/FlightReservation"+ getCurrentDateTime() +".png"));
			//File destFile= new File("./SreenShots/FlightReservation"+ getCurrentDateTime() +".png");
			//Files.copy(srcFile,destFile);
			System.out.println("ScreenShot Captured");
		 } 
		catch (IOException e) 
		{
			
			System.out.println("unable to catch Screenshot" + e.getMessage());
	    }
    }
	
	public static String getCurrentDateTime()
	{
		DateFormat customFormat=new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currentDate=new Date();
		return customFormat.format(currentDate);
		
		
	}
}

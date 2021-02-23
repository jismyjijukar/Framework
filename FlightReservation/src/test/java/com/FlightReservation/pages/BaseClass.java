package com.FlightReservation.pages;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import com.FlightReservation.utility.BrowserFactory;
import com.FlightReservation.utility.ConfigDataProvider;
import com.FlightReservation.utility.ExcelPath;
import com.FlightReservation.utility.ScreenShot;




public class BaseClass {

	public WebDriver driver;
	public ConfigDataProvider config;
	public ExcelPath ex;
	
	
	@BeforeSuite()
	public void setUpSuite()
	{
		
		config=new ConfigDataProvider();
		ex=new ExcelPath();
	}
	
	@BeforeClass
	public void setUp()
	{
		
		//driver=BrowserFactory.startApplication(driver, "Chrome", "https://www.yatra.com/");
		driver=BrowserFactory.startApplication(driver, config.getBrowser(), config.getUrl());
		
	}
	
	
	@AfterMethod
	public void tearDownMethod(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			ScreenShot.captureScreenShot(driver);
		}
	}
	
	
	@AfterClass
	public void tearDown()
	{
		BrowserFactory.quitBrowser(driver);
	}
}

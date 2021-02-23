package com.FlightReservation.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

	public static WebDriver startApplication(WebDriver driver,String browserName,String appURL) 
	
	{
		if (browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		else
		{
			System.out.println("Do not support this browser");
		}
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(appURL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//if any element are loading slowly or not visible immedietly we will set implict wait.
		
		return driver;

	}
	
	public static void quitBrowser(WebDriver driver)
	{
		driver.quit();
	}

}

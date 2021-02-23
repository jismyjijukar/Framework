package com.FlightReservation.testcases;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestCaseWithoutFramework {

	
	
	@Test
	
	public void test1() throws InterruptedException
	
	
	{
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//launch chrome
		
		driver.manage().window().maximize();//maximize window
		driver.manage().deleteAllCookies();//delete all the cookies
		
		//dynamic wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		
		driver.get("https://www.yatra.com/");
        	
		
	
			WebElement oneWay=driver.findElement(By.cssSelector("a[class='blur_class type-active']"));
			oneWay.click();
			
		Actions action=new Actions(driver);
	
		//click on Depart from
		WebElement Depart=driver.findElement(By.id("BE_flight_origin_city"));
		
		action.moveToElement(Depart).click().perform();
		
	//Click on Bangalore
		
		WebElement Bang=driver.findElement(By.xpath("//p[contains(text(),'Bangalore ')]"));
		
		action.moveToElement(Bang).click().perform();
		
	//Click Going to
		
		WebElement Goingto=driver.findElement(By.id("BE_flight_arrival_city"));
		action.moveToElement(Goingto).click().perform();
				
	//Click on New Delhi
		
		WebElement Delhi=driver.findElement(By.xpath("//p[contains(text(),'New Delhi ')]"));
				
				
		action.moveToElement(Delhi).click().perform();
		
	//Click on Departure date
		WebElement Date=driver.findElement(By.id("BE_flight_origin_date"));
		action.moveToElement(Date).click().perform();
		
		
	//Select date
		driver.findElement(By.id("27/02/2021")).click();
	
		
	//Click on search button
		
		WebElement Button=driver.findElement(By.id("BE_flight_flsearch_btn"));
		Button.click();
		
}
}
	



	



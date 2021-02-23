package com.FlightReservation.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class OpenApplicationPage {
	
	WebDriver driver;
	
	public OpenApplicationPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	
	@FindBy(css="a[class='blur_class type-active']") WebElement oneWay;
	
	
// Find the WE to click on Depart from
	
	@FindBy(id="BE_flight_origin_city") WebElement Depart;
	
// Find the WE to Click on Bangalore
	
	@FindBy(xpath="//p[contains(text(),'Bangalore ')]") WebElement Bang;
	
	//Click Going to
	
    @FindBy(id="BE_flight_arrival_city") WebElement Goingto;
	
// Find the WE to Click on New Delhi
	
    @FindBy(xpath="//p[contains(text(),'New Delhi ')]") WebElement Delhi;
  				
  				
//Find the WE to Click on Departure date
  	@FindBy(id="BE_flight_origin_date") WebElement Date;
  		
 //Find the WE to Select date
  	@FindBy(id="27/02/2021") WebElement selectDate;
  				
//Find the WE to Click on search button
		
  	 @FindBy(id="BE_flight_flsearch_btn") WebElement Button;
  			
	
	
	public void details() throws InterruptedException 
	{
		
		Thread.sleep(2000);
		
		oneWay.click();
//Create an Object of Actions Class
	Actions action=new Actions(driver);
	

	action.moveToElement(Depart).click().perform();
	

	action.moveToElement(Bang).click().perform();
	

	action.moveToElement(Goingto).click().perform();
	

	action.moveToElement(Delhi).click().perform();
	

	action.moveToElement(Date).click().perform();

	selectDate.click();

	Button.click();
		
		
	}


}

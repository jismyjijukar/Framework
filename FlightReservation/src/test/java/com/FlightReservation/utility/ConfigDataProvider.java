package com.FlightReservation.utility;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

public class ConfigDataProvider {
	
	
	Properties pro;
	
	
	//Create Constructor, will helps us to initialize the variable and objects
	public ConfigDataProvider() 
	
	
	{
		//
		File src=new File("./Configuration/Config.properties");
		try {
			FileInputStream fis=new FileInputStream(src);
			
			//Create an object
			pro=new Properties();
			
			//load the configuration file
			
			pro.load(fis);
		} catch (Exception e)
		
		{
			System.out.println("Unable to load config file"+ e.getMessage());
			
		}
	}
	
	public String getBrowser()
	{
		
		
		return pro.getProperty("Browser");
	}
	
	public String getUrl()
	
	{
		return pro.getProperty("URL");
	}

}

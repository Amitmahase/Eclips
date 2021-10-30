package com.learnautomation.utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	
	//to  handle, screenshots, alrets, frames, windows, sync issue, javascript executor etc.
	
	public static  void captureScreenShot(WebDriver driver)
	{
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	System.out.println("ScreenShot Captured");
	
	try {
		FileHandler.copy(src, new File("./Screenshots/FreeCRM_"+getCurrentDateTime() +".png"));
	} catch (IOException e) {
		
		System.out.println("unable to capture Screenshot : "+ 	e.getMessage());
	}
	}
	
	public static String  getCurrentDateTime()
	{
	DateFormat customformat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
	Date currentdate= new Date();
	return customformat.format(currentdate);
	}
	

}

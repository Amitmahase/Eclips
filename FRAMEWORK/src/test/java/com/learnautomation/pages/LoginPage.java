package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver ldriver)
	{
		this.driver=ldriver;
		
	}
	@FindBy(xpath="//span[@class='icon icon-xs mdi-chart-bar']")WebElement clik;
	
	@FindBy(name="email")WebElement uname;
	
	@FindBy(name="password")WebElement pass;
	
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")WebElement loginbutton;	
	
	public void loginToCRM(String usernameApp, String passwordApp) throws InterruptedException
	{
		
		try
		{
			Thread.sleep(2000);
		} 
		
		catch (InterruptedException e)
		{
			
			
		}
		clik.click();
		uname.sendKeys(usernameApp);
		pass.sendKeys(passwordApp);
		loginbutton.click();
		Thread.sleep(3000);
		loginbutton.click();
	}

}

package Loginpage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utilities.BrowserFactory;


public class Login extends BrowserFactory {
	
	
	@Test(dataProvider="getData")
	public void login(String username, String pass) throws IOException
	{
		
	driver=initilizeDriver();
	driver.get("https://mail.google.com/");
	driver.findElement(By.id("identifierId")).sendKeys(username);
	
	
	}
	
	
	@DataProvider(name="getData")
	public Object[][] getData()
	{
		
		Object[][]data=new Object[2][2];
		data[0][0]="non restricted user";
		data[0][1]="password";
		
		
		data[1][0]="restricted user";
		data[1][1]="pass";
		return data;
		
	}
	
}



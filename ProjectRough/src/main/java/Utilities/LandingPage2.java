package Utilities;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import LoginPage.LoginPage;
import LoginPage.SendMsg;
import LoginPage.SerchPage;



public class LandingPage2 extends PageFactory {

	@Test

	public void Login() throws IOException, InterruptedException {

		driver = Initilizer();
		String url = pro.getProperty("url");
		driver.get(url);

		String email = pro.getProperty("email");
		String pass = pro.getProperty("password");
		LoginPage lp = new LoginPage(driver);
		lp.email().sendKeys(email);
		Thread.sleep(2000);
		lp.password().sendKeys(pass);

		Thread.sleep(2000);
		lp.login().click();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		SerchPage sp = new SerchPage(driver);
		String SN = pro.getProperty("serchName");
		sp.serchname().sendKeys(SN);

		Thread.sleep(5000);
		sp.serchname().sendKeys(Keys.ARROW_DOWN);
		sp.serchname().sendKeys(Keys.ENTER);
		
		SendMsg sm = new SendMsg(driver);
		String msg = pro.getProperty("msg");
		
		sm.sendms().click();
		
		driver.switchTo().activeElement();
		sm.send().sendKeys(msg);
		

	}
	
	@AfterTest
	
	public void teardown()
	{
		driver.close();
		
	}

}

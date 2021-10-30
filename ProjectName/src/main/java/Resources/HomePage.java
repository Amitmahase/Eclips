package Resources;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jdk.internal.org.jline.utils.Log;
import pageObjects.LandingPage;
import pageObjects.LoginPage;

public class HomePage extends Base {

	@Test(dataProvider="getData")
	public void basePageNavigation(String username, String password, String text) throws  InterruptedException, IOException {
		driver = initializeDriver();
		String URL=prop.getProperty("url");
		driver.get(URL);
		

		// two methods, 1 is inheritance and other is create object for the class.

		LandingPage lp = new LandingPage(driver);
		
		lp.getLogin().click();
		

		LoginPage l = new LoginPage(driver);
		l.mail().sendKeys(username);
		Thread.sleep(2000);
		l.password().sendKeys(password);
		Thread.sleep(2000);
		l.submit().click();
		Log.info(text);

	}
	
	@DataProvider (name="getData")
	
	public Object[][] getDate()
	{
		
		//Row Stands for how many different data types of test should run
		//column stands for how many values for each test
		Object[][] data=new Object[2][3];
		
		
		data[0][0]= "animationrule@gmail.com";
		data[0][1]="Amitkumar001@";
		data[0][2]= "Restricted user";
		
		data[1][0]="restricteduser@qw.com";
		data[1][1]="password";
		data[1][2]="Non restricted user";
		return data;
	}

	@AfterSuite
	
	public void teardown()
	{
	driver.quit();
	}
	
}

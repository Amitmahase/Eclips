package Resources;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jdk.internal.org.jline.utils.Log;
import pageObjects.LandingPage;

public class ValidateTitle extends Base {
	public static Logger log=LogManager.getLogger(Base.class.getName());

	@Test
	public void basePageNavigation() throws InterruptedException, IOException {
		driver = initializeDriver();
		Log.info("Driver is initilize");
		String URL=prop.getProperty("url");
		driver.get(URL);
		
		Log.info("NAvigated to Home Page");
		

		// two methods, 1 is inheritance and other is create object for the class.

		LandingPage lp = new LandingPage(driver);

		// Compare the text from the browser with actual text--Error...

		Assert.assertEquals(lp.getTitle().getText(), "FEATURED COURSES");
		lp.Navigation().getText();
		Assert.assertTrue(lp.Navigation().isDisplayed());
		Assert.assertFalse(false, URL);
		Log.info("Successfully validated text");

	}
@AfterTest
public void tearDown()
{
	driver.close();
	driver=null;
}
	

}

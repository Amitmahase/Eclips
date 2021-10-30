package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class DataDriven {
	
	
	
	@Test
	public void Login() throws IOException
	
	{
		
		Properties prop=new  Properties();
		
		FileInputStream fis=new FileInputStream("C:\\Users\\eikamum\\eclipse-workspace\\TestNGTutorial\\src\\Test\\datadriver.properties");
		
		prop.load(fis);
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("url"));
		
		//driver.findelElement(By.Xpath("").sendKeys("username")
		
	}

}

package Resources;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Base {

	public static WebDriver driver;
	public Properties prop;

	public WebDriver initializeDriver() throws IOException {

		 prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\eikamum\\eclipse-workspace\\ProjectName\\src\\main\\java\\Resources\\data.properties");

		prop.load(fis);
		String browserName = prop.getProperty("browser");
		

		if (browserName.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "./src\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browserName.equals("FireFox")) {
			System.setProperty("webdriver. gecko. driver", "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (browserName.equals("Edge")) {
			System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");

			driver = new EdgeDriver();

		} else {
			System.out.println("Sorry not supporting this ");
		}
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
		
		

	}
	
	public void getScreenshot(String result) throws IOException
	{
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	FileHandler.copy(src, new File("./Screenshots/failtest_"+result+"Screenshot.png"));

	}
	
	public static String  getCurrentDateTime()
	{
	DateFormat customformat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
	Date currentdate= new Date();
	return customformat.format(currentdate);
	}
}

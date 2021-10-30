package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PageFactory {

	public WebDriver driver;
	public Properties pro;

	public WebDriver Initilizer() throws IOException {
		 pro = new Properties();

		FileInputStream fis = new FileInputStream("C:\\Users\\eikamum\\eclipse-workspace\\ProjectRough\\src\\main\\java\\Utilities\\Data.properties");

		

		pro.load(fis);
		String browserName = pro.getProperty("browser");

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\eikamum\\eclipse-workspace\\ProjectRough\\target\\chromedriver.exe");
			ChromeOptions o = new ChromeOptions();
			o.addArguments("--disable-notifications");

			WebDriver driver = new ChromeDriver(o);

		} else {
			System.out.println("Currently other browsers are not installed");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		return driver;
	}

}

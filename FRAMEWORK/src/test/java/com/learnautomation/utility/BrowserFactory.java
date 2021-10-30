package com.learnautomation.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

	public static WebDriver startApplication(WebDriver driver, String browserName, String appURL) {

		if (browserName.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\eikamum\\eclipse-workspace\\FRAMEWORK\\src\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();

		}

		else if (browserName.equals("FireFox")) {
			System.setProperty("webdriver.Firefox.driver", "./gekodriver.exe");
			driver = new FirefoxDriver();

		} else if (browserName.equals("IE")) {
			// driver= new IEDriver();

		}

		else {
			System.out.println("We donot support this driver");
		}

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("https://freecrm.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;

	}

	public static void quitBrowser(WebDriver driver) {

		driver.quit();

	}

}

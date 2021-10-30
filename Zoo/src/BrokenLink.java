import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\eikamum\\Desktop\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\eikamum\\\\Desktop\\\\WebDrivers\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//System.setProperty("webdriver.ie.driver", "C:\\Users\\eikamum\\Desktop\\WebDrivers\\IEDriverServer.exe");
		// driver=new EdgeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
		if(!driver.getCurrentUrl().equalsIgnoreCase("https://www.google.com/"))
		{
			
			driver.close();
			System.out.println("Site is not safe");
		}
		
		else
		{
			System.out.println("site is safe");
		}
		
		//driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Animation",Keys.ENTER);
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(3000);
		
		
		driver.findElement(By.linkText("Images")).click();
		
		//driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Animation",Keys.ENTER);
		driver.findElement(By.cssSelector("a[title='Google apps']")).click();
		
	driver.findElement(By.xpath("//ul[@jsname='k77Iif']/li/following-sibling::li[2]"));
		//driver.navigate().forward();
		//Thread.sleep(2000);
		//driver.navigate().refresh();
		//Thread.sleep(2000);
		//driver.close();
		
		//System.out.println(driver.getPageSource());
		
		
		
		
		//List<WebElement> links=driver.findElements(By.tagName("a"));

		
		/*driver.get("https://login.salesforce.com/?locale=in");
		//driver.findElement(By.className("input r4 wide mb16 mt8 username"));--->> we can't use class name with spaces,
		//ie, compount class name is not allowed.
		driver.findElement(By.id("username")).sendKeys("Amit");
		
		
		driver.findElement(By.id("password")).sendKeys("Passwprd");
		driver.findElement(By.id("Login")).click();*/
		
		
		
		

	}

}

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HD {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eikamum\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footer=driver.findElement(By.id("gf-BIG"));
		
		int footerlink=footer.findElements(By.tagName("a")).size();
		System.out.println(footerlink);
		
		
		 WebElement links=driver.findElement(By.xpath("//tbody/tr/td/ul"));
		 List <WebElement> l=links.findElements(By.tagName("a"));
		
		for(int i=0;i<l.size();i++)
		{
			
			
			l.get(i).sendKeys(Keys.CONTROL, Keys.ENTER);
			
		}
		
		Set<String> id=driver.getWindowHandles();
		
		Iterator<String> it=id.iterator();
		it.next();
		it.next();
		
		while(it.hasNext())
		{
			
			System.out.println(driver.switchTo().window(it.next()).getTitle());
			Thread.sleep(2000);
		}
	
	

	}

}

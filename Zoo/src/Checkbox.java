import static org.testng.Assert.assertFalse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eikamum\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		
		
		driver.get("https://beta.spicejet.com/");
		Thread.sleep(3000);
		//System.out.println(driver.findElement(By.xpath("//div[text()='Senior Citizen']")).isSelected());
		//driver.findElement(By.xpath("//div[text()='Senior Citizen']")).click();
		//System.out.println(driver.findElement(By.xpath("//div[text()='Senior Citizen']")).isSelected());
		
		
		int count =driver.findElements(By.xpath("//div[@style='position: relative; z-index: 1;']")).size();
		
		for(int i=0;i<count;i++)
		{
			
			String str=driver.findElements(By.xpath("//div[@style='position: relative; z-index: 1;']")).get(i).getText();
			
			if(str.equalsIgnoreCase("LTC"))
			{
				driver.findElements(By.xpath("//div[@style='position: relative; z-index: 1;']")).get(i).click();
				
			}
		}
		
		//assert.assertFalse(driver.findElement(By.xpath("//div[text()='Senior Citizen']")).isSelected());
	}

}

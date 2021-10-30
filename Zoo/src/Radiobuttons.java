import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eikamum\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.keynotesupport.com/internet/web-contact-form-example-radio-buttons.shtml");
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//input[@value='Advanced']")).click();
		
		//driver.findElement(By.xpath("//input[@value='QBP']")).click();
		driver.findElement(By.name("comments")).sendKeys("I am a Software Engineer");
		
		System.out.println(driver.findElements(By.xpath("//input[@type='radio']")).size());
		int count=driver.findElements(By.xpath("//input[@type='radio']")).size();
		
		for(int i=0;i<count;i++)
		{
			//driver.findElements(By.xpath("//input[@type='radio']")).get(i).click();
			Thread.sleep(3000);
			String val=driver.findElements(By.xpath("//input[@type='radio']")).get(i).getAttribute("value");
			
			if(val.equalsIgnoreCase("Excel"))
			{
				driver.findElements(By.xpath("//input[@type='radio']")).get(i).click();
			}
			
		}
		
		

	}

}

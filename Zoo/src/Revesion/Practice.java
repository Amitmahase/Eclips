package Revesion;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;



public class Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eikamum\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@value='radio2']")).click();
		
		driver.findElement(By.xpath("//input[@type='text'] [@id='autocomplete']")).sendKeys("Hello Amit A software engineer");
		
		Select s=new Select(driver.findElement(By.id("dropdown-class-example")));
		
		s.selectByVisibleText("Option3");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("checkBoxOption1")).click();
		
		driver.findElement(By.id("openwindow")).click();
		
		Set<String> id=driver.getWindowHandles();
		
		Iterator<String> it=id.iterator();
		
		String Pid=it.next();
		String Cid=it.next();
		
		driver.switchTo().window(Cid);
		
		Thread.sleep(2000);
		System.out.println((driver.getTitle()));
		
		driver.switchTo().window(Pid);
		driver.findElement(By.id("opentab")).click();
		
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> its=ids.iterator();
		String p=its.next();
		String c=its.next();
		
		driver.switchTo().window(c);
		
		driver.findElement(By.xpath("//a[text()='Courses']")).click();
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(p);
		
		
		driver.findElement(By.id("name")).sendKeys("Programmer");
		
		Thread.sleep(3000);
		driver.findElement(By.id("alertbtn")).click();
		
	System.out.println(driver.switchTo().alert().getText());
	
	driver.switchTo().alert().accept();
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\eikamum\\\\Desktop\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		
		Actions a=new Actions(driver);
		
		//a.moveToElement(driver.findElement(By.xpath("a[id='nav-link-accountList']"))).build().perform();
		
		//a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).sendKeys(Keys.ARROW_DOWN, Keys.SHIFT, "Animation").build().perform();
		
		WebElement serch=driver.findElement(By.id("twotabsearchtextbox"));
		
		//driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("iphone",Keys.ENTER);
		
		//a.moveToElement(serch).click().keyDown(Keys.SHIFT).sendKeys("phone").doubleClick().build().perform();
		
		
		//a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).contextClick().build().perform();
		
		a.moveToElement(driver.findElement(By.xpath("//div[@id='nav-xshop']/a"))).keyDown(Keys.CONTROL).click().build().perform();
		
		Set<String> adress=driver.getWindowHandles();
		Iterator <String> it=adress.iterator();
		
		String Pid=it.next();
		String Cid=it.next();
		
		driver.switchTo().window(Cid);
		System.out.println(driver.getTitle().split("-")[0].trim());
		
		driver.switchTo().window(Pid);
		a.moveToElement(serch).contextClick().build().perform();
		
		
		
		
	}
	
}
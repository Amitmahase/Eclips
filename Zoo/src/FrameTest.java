import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eikamum\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		
		//System.out.println(driver.findElement(By.tagName("Iframe")).size());
	
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		driver.switchTo().frame(frame);
		
		//or use index.....
		//driver.switchTo().frame(0);
		
		
		WebElement source=driver.findElement(By.cssSelector("#draggable"));
		
		WebElement target=driver.findElement(By.cssSelector("#droppable"));
		
		Actions a=new Actions(driver);
		a.dragAndDrop(source, target).build().perform();
		
		driver.switchTo().defaultContent();
		
		
		
		
		
		
		

	}

}

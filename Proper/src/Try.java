import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Try {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		Properties pro = new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\eikamum\\eclipse-workspace\\Proper\\src\\data.properties");
		
		System.out.println(pro.getProperty("name"));
		System.out.println(pro.getProperty("url"));
	
		
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eikamum\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://www.practo.com/");
		driver.findElement(By.xpath("//input[@data-qa-id='omni-searchbox-keyword']")).click();
		List<WebElement> opt = driver.findElements(By.xpath("//div[@data-qa-id='omni-suggestion-main']"));

		for (int i = 0; i < opt.size(); i++) {
			String name = (opt.get(i).getText());
			if (name.equalsIgnoreCase("Dentist")) {
				opt.get(i).click();

				break;
			}

		}

		List<WebElement> docs = driver
				.findElements(By.xpath("//div[@class='u-color--primary uv2-spacer--xs-bottom']/h2"));

		for (int j = 0; j < docs.size(); j++) {
			String docname = docs.get(j).getText();
			if (docname.equalsIgnoreCase("Dr. Devaraju D")) {
				docs.get(j).click();
			}
		}

		Set<String> ids = driver.getWindowHandles();

		Iterator<String> it = ids.iterator();

		String Pid = it.next();
		String Cid = it.next();

		driver.switchTo().window(Cid);

		driver.findElement(By.cssSelector(".u-t-capitalize.u-bold.c-btn--dark-medium")).click();

	}

}

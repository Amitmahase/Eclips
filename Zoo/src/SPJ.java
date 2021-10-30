import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;


public class SPJ {

public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\eikamum\\\\\\\\Desktop\\\\\\\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://beta.spicejet.com/");



driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']//input[@type='text']")).sendKeys("MAA");

driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']/div/div[2]/input")).click();
driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']/div/div[2]/input")).sendKeys("IXB");

Thread.sleep(2000);
driver.findElement(By.cssSelector(".css-1dbjc4n.r-1awozwy.r-19m6qjp.r-156aje7.r-y47klf.r-1phboty.r-1d6rzhh.r-1pi2tsx.r-1777fci.r-13qz1uu")).click();

driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click();


for(int i=1;i<5;i++)
{
driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
}

driver.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']")).click();

driver.findElement(By.xpath("//div[text()='Health Professional']")).click();

//System.out.println(driver.findElement(By.xpath("//div[text()='Return Date']")).isEnabled());

driver.findElement(By.xpath("//div[text()='Search Flight']")).click();

driver.findElement(By.xpath("//*[name()='path' and contains(@stroke,'currentCol')]")).click();


}
}

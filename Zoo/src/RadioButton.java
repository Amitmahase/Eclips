	import org.openqa.selenium.By;
		import org.openqa.selenium.Keys;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		
				System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\eikamum\\\\Desktop\\\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				
				driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
				driver.findElements(By.className("panel-body")).size();
				System.out.println(driver.findElements(By.className("panel-body")).size());
				driver.findElement(By.xpath("//input[@value='Male']")).click();
				Thread.sleep(2000);
				driver.findElement(By.id("buttoncheck")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label[1]/input")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@value='15 - 50']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
				

	}

}

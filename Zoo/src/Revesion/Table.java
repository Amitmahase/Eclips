package Revesion;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\eikamum\\\\Desktop\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/38557/uae-vs-ire-2nd-t20i-uae-summer-t20-bash-2021");
		
		WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		
		
		int count =table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		

			int sum=0;
			for(int i=0;i<count-3;i++)
			{
				String score=(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
				System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
				
				sum=sum+Integer.parseInt(score);
			}
			
			System.out.println(sum);
			String extra=driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div[1]")).getText();
			int ext=Integer.parseInt(extra);
			String total=driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
			int tota=Integer.parseInt(total);
			System.out.println("Total-->"+ total);
			int su=ext+sum;
			System.out.println(su);
			if (tota==su)
			{
				System.out.println("The sum is correct");
			}
	}

}

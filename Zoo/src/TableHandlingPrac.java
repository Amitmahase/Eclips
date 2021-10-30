import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandlingPrac {

	public static void main(String[] args) {
		int sum=0;
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\eikamum\\\\Desktop\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cricbuzz.com/");
		driver.findElement(By.xpath("//a[@class='cb-mat-mnu-itm cb-ovr-flo'][3]")).click();
		driver.findElement(By.xpath("//a[text()='Scorecard']")).click();
		WebElement parent=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		
		int count=parent.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		
		for(int i=0;i<count-2;i++)
		{
			
			String s=parent.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			System.out.println(s);
			sum=sum+Integer.parseInt(s);
		}



String s1=parent.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
int a=Integer.parseInt(s1);
sum=sum+a;
System.out.println(sum);

String s2=parent.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
int total=Integer.parseInt(s2);


if(sum==total)
{
	System.out.println("Sum is ok");

}
else
{
	System.out.println("Sum is not ok");
}

	}

}

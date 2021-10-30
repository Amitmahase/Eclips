package alpha;
import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo {

	
	private static Logger log=LogManager.getLogger(Demo.class.getName());
	public static void main(String[] args) {
		
		
		log.debug("I am debugging");
		if(2>0)
			
		{
			log.info("Object is present");
			log.debug("Object is present");
			log.fatal("This is fatle");
			
		
			log.error("object is not present");
		}
	

	}


	}
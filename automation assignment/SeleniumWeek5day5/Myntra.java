package windowHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;

public class mouseHoverActionMyntra {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Load the application url
		    FirefoxOptions option=new FirefoxOptions();
		    option.addArguments("--disable-notifications","start-maximized","--incognito");
	   //   option.setHeadless(true); 
	        FirefoxDriver driver=new FirefoxDriver();
			driver.get("https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK_New&gclid=Cj0KCQjw_5unBhCMARIsACZyzS3EE4ACX1T42e5edmbu9vmQ71F366w3LjgLMARnGwVHMEZmvSsP13kaApqwEALw_wcB");
			//maximize the browser
	//		driver.manage().window().maximize();
			//add implicitly wait
			System.out.println("browser launch ");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			Actions builder=new Actions(driver);
			
			WebElement kids = driver.findElement(By.xpath("(//a[text()='Kids'])[1] "));
			WebElement partywear = driver.findElement(By.xpath("(//a[text()='Party Wear'])[1]"));
			
		/*  method 1
		    builder.moveToElement(kids).perform();
		    kids.click();
		    builder.moveToElement(partywear).perform(); 
		    partywear.click();
		 */			
			
        /*	method 2		
			builder.moveToElement(kids).perform();
			builder.click(partywear).perform();
		*/	
		//	method 3
			builder.moveToElement(kids).pause(2000).click(partywear).perform();
			
	}

}

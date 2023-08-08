package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;


public class Amazon {

	public static void main(String[] args) throws InterruptedException {

//		01) Launch Edge
		EdgeDriver drive= new EdgeDriver();
//		02) Load https://www.amazon.in/ add  implicitlyWait driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		drive.get("https://www.amazon.in/");
		drive.manage().window().maximize();
		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		03) Type "Bags" in the Search box
		drive.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags");
		
		//drive.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
//		04) Choose the 	 item in the result (bags for boys)
		drive.findElement(By.xpath("//span[text()=' for boys']")).click();
//		05) Print the total number of results (like 50000) 1-48 of over 50,000 results for "bags for boys"
		System.out.println(drive.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")));
//		06) Select the first 2 brands in the left menu (like American Tourister, Generic)
		drive.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
		drive.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
//		07) Choose New Arrivals (Sort)
		drive.findElement(By.xpath("//span[text()='Sort by:']")).click();
		drive.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
//		08) Print the first resulting bag info (name, discounted price)
		System.out.println(drive.findElement(By.xpath("(//div[@class='a-section a-spacing-small puis-padding-left-micro puis-padding-right-micro'])[1]")).getText());
//		09) Get the page title and close the browser(driver.close())	
		String Title="Amazon.in: Bags For Boys - American Tourister Or Skybags: Bags, Wallets And Luggage";
		String AcuatalTitle=drive.getTitle();
		if (Title.equals(AcuatalTitle)) {
			System.out.println("Resultant page title is displayed");
		}else {
			System.out.println("Resultant page title is not displayed");
		}
		Thread.sleep(9000);
		drive.close();
		
	}

}

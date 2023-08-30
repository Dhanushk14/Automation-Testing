package SeleniumWeek5day5;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Amazon {
public static void main(String[] args) throws IOException, InterruptedException {
	FirefoxOptions option=new FirefoxOptions();
	option.addArguments("--disable-notifications","start-maximized");
	
	FirefoxDriver drive=new FirefoxDriver(option);
	
//	    1. Launch https://www.amazon.com/
    drive.get("https://www.amazon.in/");
    drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//    2.search as oneplus 9 pro 
    drive.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro");
    drive.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click(); 
//  3.Get the price of the first product
    String productprice=drive.findElement(By.xpath("(//span[@class='a-offscreen'])[1]")).getText();
  //  System.out.println("price of first product: "+productprice);
  //  System.out.println("------------------------");
//  4. Print the number of customer ratings for the first displayed product
 //   System.out.println("customer rating: "+drive.findElement(By.xpath("(//span[@class='a-size-base puis-normal-weight-text'])[1]")).getText()); 
 //   System.out.println("NO of customer rated the product: "+drive.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]")).getText());
  
//  5. Click the first text link of the first image
    drive.findElement(By.xpath("(//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'])[1]")).click();
//  6. Take a screen shot of the product displayed
    File screenshotAs = drive.getScreenshotAs(OutputType.FILE);
    File destination=new File("./snap/004.jpg");
    FileUtils.copyFile(screenshotAs, destination);
//windowHandling
    String parentWindow = drive.getWindowHandle();
    Set<String> childwindow = drive.getWindowHandles();
    List<String> window=new ArrayList<String>(childwindow);
    drive.switchTo().window(window.get(1));
//  7. Click 'Add to Cart' button
    drive.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
//  8. Get the cart subtotal and verify if it is correct.
    System.out.println(drive.findElement(By.xpath("//div[@class='a-column a-span11 a-text-left a-spacing-top-large']")));
    String AcutualsubTotal=drive.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
    if(productprice.equals(AcutualsubTotal)) {
    	System.out.println("product Total price correct");
    }else {
    	System.out.println("product Total price not correct");
    }
//  9.close the browser
    Thread.sleep(3000);
    drive.close();
}
}

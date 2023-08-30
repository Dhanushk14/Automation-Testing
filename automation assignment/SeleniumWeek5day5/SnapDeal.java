package SeleniumWeek5day5;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		FirefoxOptions option=new FirefoxOptions();
		option.addArguments("--disable-notifications","start-maximized");
		
		FirefoxDriver drive=new FirefoxDriver(option);
//		    1. Launch https://www.snapdeal.com/
        drive.get("https://www.snapdeal.com/");
        drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//			2. Go to Mens Fashion
			WebElement mensFashion = drive.findElement(By.xpath("//span[@class='catText'])[1]"));
			Actions builder=new Actions(drive);
			builder.moveToElement(mensFashion).perform();
//			3. Go to Sports Shoes
			WebElement sportShoes = drive.findElement(By.xpath("//span[text()='Sports Shoes'])[1]"));
			builder.click(sportShoes).perform();
//			4. Get the count of the sports shoes
			drive.findElement(By.xpath("//div[@class='child-cat-count '])[2]")).click();
//			5. Click Training shoes
			drive.findElement(By.xpath("//div[text()='Training Shoes']")).click();
//			6. Sort by Low to High
			drive.findElement(By.xpath("//span[text()='Sort by:']")).click();
			drive.findElement(By.xpath("//div[@class='sort-selected']")).click();
//			7. Check if the items displayed are sorted correctly
			String sortprice1 =drive.findElement(By.xpath("(//span[@class='lfloat product-price'])[1]")).getText();
			String sortprice2 =drive.findElement(By.xpath("(//span[@class='lfloat product-price'])[2]")).getText();
			int product1=Integer.parseInt(sortprice1);
			int product2=Integer.parseInt(sortprice2);
			if(product1<product2) {
				System.out.println("the product is sorted");
			}else {
				System.out.println("the product is not sorted");
			}
//			8.Select the price range (900-1200)
			drive.findElement(By.xpath("(//div[@class='price-text-box'])[1]")).sendKeys("500");
			drive.findElement(By.xpath("(//div[@class='price-text-box'])[1]")).sendKeys("1200");
			drive.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click(); 
//			9.Filter with color Navy--- 
      		drive.findElement(By.linkText("Navy")).click();
//			10 verify the all applied filters 
			System.out.println(drive.findElement(By.xpath("(//div[@class='filters'])[1]")).getText());
			String colour=drive.findElement(By.xpath("(//a[text()='Navy'])[1]")).getText();
			String colourverify="Navy";  
			String price=drive.findElement(By.xpath("(//a[text()='Rs. 500 - Rs. 1200'])[1]")).getText();
			String priceverify="Rs. 500 - Rs. 1200";
			if((colour.equals(colourverify))&&(price.equals(priceverify))) {
				System.out.println(" all sort are applied");
			}else {
				System.out.println(" all sort are not applied");
			}
//			11. Mouse Hover on first resulting Training shoes
            WebElement productHover = drive.findElement(By.xpath("(//div[@class='col-xs-6  favDp product-tuple-listing js-tuple '])[1]"));
            builder.moveToElement(productHover).perform();
//			12. click QuickView button
            WebElement quickview = drive.findElement(By.xpath("(//div[@class='center quick-view-bar  btn btn-theme-secondary  '])[1]"));
            builder.click(quickview).perform();
//			13. Print the cost and the discount percentage
			System.out.println("product price: "+drive.findElement(By.xpath("//span[@class='payBlkBig']")));
			System.out.println("product discount: "+drive.findElement(By.xpath("//span[@class='percent-desc ']")));
            
//			14. Take the snapshot of the shoes.
            File screenshotAs = drive.getScreenshotAs(OutputType.FILE);
            File destination=new File("./snap/003.jpg");
            FileUtils.copyFile(screenshotAs, destination);
//			15. Close the current window 
            drive.findElement(By.xpath("(//i[@class='sd-icon sd-icon-delete-sign'])[3]")).click();
//			16. Close the main window
            Thread.sleep(3000);
            drive.close();
	}

}

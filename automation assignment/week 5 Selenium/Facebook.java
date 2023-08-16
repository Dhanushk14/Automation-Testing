package SeleniumWeek5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		//step 1: To open the EdgeDriver 
		FirefoxDriver drive=new FirefoxDriver();
		//step 2:Load the application Url "https://www.facebook.com/"
		drive.get("https://www.facebook.com/");
		//step 3: Maximize the window
		drive.manage().window().maximize();
		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//step 4:Click on create new Account button
		drive.findElement(By.xpath("//a[text()='Create new account']")).click();
		//step 5:Enter the first name
		drive.findElement(By.xpath("//input[@name='firstname']")).sendKeys("messi");
		//step 6:Enter the last name
		drive.findElement(By.xpath("//input[@name='lastname']")).sendKeys("kumar");
		//step 7:Enter the mobile
		drive.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9940692648");
		//step 8:Enter the password
		drive.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("MessiKumar@10");
		//step 9:select date
		Select date=new Select(drive.findElement(By.xpath("//select[@id='day']")));
		date.selectByValue("14");
		//step 10:select the month
		Select month=new Select(drive.findElement(By.xpath("//select[@id='month']")));
		month.selectByValue("9");
		//step 11:select the year
		Select year=new Select(drive.findElement(By.xpath("//select[@id='year']")));
		year.selectByValue("1999");
		//step 12:click on your gender
		drive.findElement(By.xpath("//label[text()='Male']")).click();
		//step 13:close your browser
		Thread.sleep(6000);
		drive.close();

	}

}

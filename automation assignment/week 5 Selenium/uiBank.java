package SeleniumWeek5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class uiBank {

	public static void main(String[] args) throws InterruptedException {
		//step 1: To open the EdgeDriver 
		FirefoxDriver drive=new FirefoxDriver();
		//step 2:Load the application Url "https://uibank.uipath.com/register-account"
		drive.get("https://uibank.uipath.com/register-account");
		//step 3: Maximize the window
		drive.manage().window().maximize();
		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//step 4:Enter your name
		drive.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Messi");
		//step 5:Select your title
		Select title=new Select(drive.findElement(By.xpath("//select[@id='title']")));
		title.selectByVisibleText("Mr");
		//step 6:Enter your initial
		drive.findElement(By.xpath("//input[@id='middleName']")).sendKeys("N");
		//step 7:Enter your last name
		drive.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Kumar");
		//step 8:select your gender
		Select gender=new Select(drive.findElement(By.xpath("//select[@id='sex']")));
		gender.selectByVisibleText("Male");
		//step 9:select employee status by using selectByVisibleText()
		Select employeestatus=new Select(drive.findElement(By.xpath("//select[@id='employmentStatus']")));
		employeestatus.selectByVisibleText("Full-time");
		//step 10:enter the date of birth in mm/dd/yy formate
		drive.findElement(By.xpath("//input[@id='age']")).sendKeys("09/14/99");
		//step 11:enter your username
		drive.findElement(By.xpath("//input[@id='username']")).sendKeys("messik10");
		//step 12:enter the email id
		drive.findElement(By.xpath("//input[@id='email']")).sendKeys("messikumar@gmail.com");
		//step 13:enter your password
		drive.findElement(By.xpath("//input[@id='password']")).sendKeys("mdhdsjshsdjsd");
		//step 14:close your browser
        Thread.sleep(6000);
        drive.close();
	}

}

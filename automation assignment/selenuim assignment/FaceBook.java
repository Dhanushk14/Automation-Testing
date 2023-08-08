package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		 
		// Step 1: Launch the Edgebrowser
		 EdgeDriver drive= new EdgeDriver();
		// Step 2: Load the URL https://en-gb.facebook.com/
		 drive.get("https://www.facebook.com/");
		// Step 3: Maximise the window
		 drive.manage().window().maximize();
		// Step 4: Add implicit wait
		 drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// Step 5: Click on Create New Account button
		 drive.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		// Step 6: Enter the first name
		 drive.findElement(By.xpath("//input[@name='firstname']")).sendKeys("messi");
		// Step 7: Enter the last name
		 drive.findElement(By.xpath("//input[@name='lastname']")).sendKeys("ronaldo");
		// Step 8: Enter the mobile number
		 drive.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9940692659");
		// Step 9: Enterthe password
		 drive.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("MessiRonaldo10");
		// Step 10: Handle all the three drop downs
		 
		 //date day
		 WebElement day=drive.findElement(By.xpath("//select[@id='day']"));
		 //select day dropdown
		 Select Dday= new Select(day);
		 //selct the option
		 Dday.selectByValue("10");
		 
		 //month
		 WebElement month=drive.findElement(By.xpath("//select[@id='month']"));
		 //select  month dropdown
		 Select Mmonth=new Select(month);
		 //select the month option
		 Mmonth.selectByVisibleText("Jul");
		 
		 //year
		 WebElement year=drive.findElement(By.xpath("//select[@id='year']"));
		 //select the year dropdown
		 Select Yyear=new Select(year);
		 //select the year option
		 Yyear.selectByIndex(31);//993
		 
		// Step 11: Select the radio button "Female" ( A normal click will do for this step) 
		 drive.findElement(By.xpath("//label[text()='Female']")).click();
	   // step 12: click the sigup button
		 drive.findElement(By.xpath("//button[@name='websubmit']")).click();
		 
	}

}

package SeleniumWeek5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class tamilMatrimony {

	public static void main(String[] args) throws InterruptedException {
		//step 1: To open the EdgeDriver
		FirefoxDriver drive=new FirefoxDriver();
		//step 2:Load the application Url "https://www.tamilmatrimony.in/"
		drive.get("https://www.tamilmatrimony.in/");
		//step 3: Maximize the window
		drive.manage().window().maximize();
		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//step 4:select the matrimony profile by yourself
		Select profile=new Select(drive.findElement(By.xpath("//select[@id='REGISTERED_BY']")));
		profile.selectByValue("1");
		//step 5:Enter the name
		drive.findElement(By.xpath("//input[@id='NAME']")).sendKeys("messi");
		//step 6:click on gender
		drive.findElement(By.xpath("//input[@id='gendermale']")).click();
		//step 7:select your date of birth
		  //select the date
		  Select date=new Select(drive.findElement(By.xpath("//select[@id='DOBDAY']")));
		  date.selectByValue("14");
		  //select the month
		  Select month =new Select(drive.findElement(By.xpath("//select[@id='DOBMONTH']")));
		  month.selectByValue("9");
		  //select the year
		  Select year=new Select(drive.findElement(By.xpath("//select[@id='DOBYEAR']")));
		  year.selectByValue("1999");
		//step 8:select your religion
		Select religion =new Select(drive.findElement(By.xpath("//select[@id='RELIGION']")));
		religion.selectByVisibleText("Hindu");
		//step 9:select your mother tongue
		Select language =new Select(drive.findElement(By.xpath("//select[@id='MOTHERTONGUE']")));
		language.selectByVisibleText("Tamil");
		//step 10:select your country
		Select country=new Select(drive.findElement(By.xpath("//select[@id='COUNTRY']")));
		country.selectByVisibleText("India");
		//step 11:enter the mobile number
		drive.findElement(By.xpath("//input[@id='MOBILENO']")).sendKeys("9940692648");
		//step 12:enter your email id
		drive.findElement(By.xpath("//input[@id='EMAIL']")).sendKeys("messiKummar@gmail.com");
		//step 13:close your browser
		Thread.sleep(6000);
		drive.close();
	}
}

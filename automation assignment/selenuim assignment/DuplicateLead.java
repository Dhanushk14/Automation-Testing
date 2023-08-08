package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {

	public static void main(String[] args) {
		
		 EdgeDriver drive=new EdgeDriver();
		  
		  drive.manage().window().maximize();
		  drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  
//		  1. Launch URL "http://leaftaps.com/opentaps/control/login"
		  drive.get("http://leaftaps.com/opentaps/control/login");
		  
//		  2. Enter UserName and Password Using Id Locator
		  drive.findElement(By.id("username")).sendKeys("demosalesmanager");
		  drive.findElement(By.id("password")).sendKeys("crmsfa");
//		  3. Click on Login Button using Class Locator
		  drive.findElement(By.className("decorativeSubmit")).click();
//		  4. Click on CRM/SFA Link
		  drive.findElement(By.linkText("CRM/SFA")).click();
//		  5. Click on Leads Button
		  drive.findElement(By.linkText("Leads")).click();
//		  6. Click on Create Lead 
		  drive.findElement(By.linkText("Create Lead")).click();
//		  7. Enter CompanyName Field Using id Locator
		  drive.findElement(By.id("createLeadForm_companyName")).sendKeys("Dk company");
//		  8. Enter FirstName Field Using id Locator
		  drive.findElement(By.id("createLeadForm_firstName")).sendKeys("Dhanush");
//		  9. Enter LastName Field Using id Locator
		  drive.findElement(By.id("createLeadForm_lastName")).sendKeys("kumar");
//		  10. Enter FirstName(Local) Field Using id Locator
		  drive.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Dhanush");
//		  11. Enter Department Field Using any Locator of Your Choice
		  drive.findElement(By.name("departmentName")).sendKeys("IT");
//		  12. Enter Description Field Using any Locator of your choice
		  drive.findElement(By.id("createLeadForm_description")).sendKeys("Software Testing Engineer");
//		  13. Enter your email in the E-mail address Field using the locator of your choice
		  drive.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("dhanushk1@gmail.com");
//		  14. Select State/Province as NewYork Using Visible Text
		  WebElement statedropdown = drive.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		  Select state=new Select(statedropdown);
		  state.selectByVisibleText("Indiana");
//		  15. Click on Create Button
		  drive.findElement(By.className("smallSubmit")).click();
//         16. Get the Title of Resulting Page. refer the video  using driver.getTitle()
		  String Title ="View Lead | opentaps CRM";
		  String AcutalTitle=drive.getTitle();
         
		  if (Title.equals(AcutalTitle)) {
			  System.out.println("Fist Resultant page is displayed");
		  }else {
			  System.out.println("First Resultant page is Not displayed");
		  }
//        17. Click on Duplicate button
		  drive.findElement(By.linkText("Duplicate Lead")).click();
//        18. Clear the CompanyName Field using .clear() And Enter new CompanyName
		  WebElement companyname =drive.findElement(By.id("createLeadForm_companyName"));
		  companyname.clear();
		  companyname.sendKeys("Microsoft");
//        19.Clear the FirstName Field using .clear() And Enter new FirstName
		  WebElement name=drive.findElement(By.id("createLeadForm_firstName"));
		  name.clear();
		  name.sendKeys("Vijay");
//        20.Click on Create Lead Button
		  drive.findElement(By.className("smallSubmit")).click();
//        21. Get the Title of Resulting Page(refer the video)  using driver.getTitle()
		  String Title2="View Lead | opentaps CRM";
		  String AcutalTitle2=drive.getTitle();
		  
		  if (Title2.equals(AcutalTitle2)) {
			  System.out.println("Second Resultant page is displayed");
		  }else {
			  System.out.println("Second Resultant page is Not displayed");
		  }
	}

}

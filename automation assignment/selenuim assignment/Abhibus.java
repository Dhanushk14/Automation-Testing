package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Abhibus {

	public static void main(String[] args) throws InterruptedException {
		
//		01) Launch  Edge browser add  implicitlyWait driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		EdgeDriver drive=new EdgeDriver();
		
		drive.manage().window().maximize();
		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		02) Load https://www.abhibus.com/
		drive.get("https://www.abhibus.com/");
//		03) Click on Bus
		drive.findElement(By.xpath("//a[@id='pills-home-tab']")).click();
//		04) Type "Chennai" in the FROM text box
		drive.findElement(By.xpath("//input[@id='source']")).sendKeys("Chenn");
//		05) Click the first option from the pop up box
		drive.findElement(By.xpath("//li[text()='Chennai']")).click();
//		06) Type "Bangalore" in the TO text box
		drive.findElement(By.xpath("//input[@id='destination']")).sendKeys("bang");
//		07) Click the first option from the pop up box
		drive.findElement(By.xpath("//li[text()='Bangalore']")).click();
//		08) Select tomorrow's date in the Date field
		drive.findElement(By.xpath("//input[@class='form-control border-0 mb-0 hasDatepicker']")).click();
		drive.findElement(By.xpath("(//a[text()='24'])[1]")).click();
//		09) Click Search Buses
		drive.findElement(By.xpath("//a[text()='Search']")).click();
//		09) Print the name of the first resulting bus (use .getText())
		System.out.println(drive.findElement(By.xpath("//div[@class='travele clearfix rSet ng-scope']")).getText());
//		10) Choose SLEEPER in the left menu from Bus Type
		drive.findElement(By.xpath("//input[@id='Bustypes4']")).click();
//		11) Print the first resulting bus seat count(Example:35 Seats Available)(use .getText())
		System.out.println(drive.findElement(By.xpath("//h2[@class='TravelAgntNm ng-binding'] ")).getText());
//		12) Click SelectSeat
		drive.findElement(By.xpath("(//span[text()='Select Seat'])[1]")).click();
//		13) Choose any one Available seat
		drive.findElement(By.xpath("(//a[@class='tooltip tooltipstered'])[2]")).click();
//		14) Print Seats Selected ,Total Fare
		System.out.println(drive.findElement(By.xpath("//span[@id='seatnos']")).getText());
		System.out.println(drive.findElement(By.xpath("//span[@id='ticketfare']")).getText());
//		15) Select Boarding Point  and Dropping Point
		Select boarding = new Select(drive.findElement(By.xpath("//select[@id='boardingpoint_id']")));
		boarding.selectByVisibleText("Perungudi-09:20");
		
		Select dropping = new Select(drive.findElement(By.xpath("//select[@id='droppingpoint_id']")));
		dropping.selectByVisibleText("Madiwala-17:00");
//		16) Get the Title of the page(use .getTitle())
		System.out.println(drive.getTitle());
//		17) Close the browser
		Thread.sleep(5000);
		drive.close();

	}

}

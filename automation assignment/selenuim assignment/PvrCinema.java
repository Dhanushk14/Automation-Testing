package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class PvrCinema {

	public static void main(String[] args) {
		
            EdgeDriver drive=new EdgeDriver();
            
            drive.manage().window().maximize();
            drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//     		01) Launch the Url  https://www.pvrcinemas.com/
            drive.get("https://www.pvrcinemas.com/movie-library/detail?city=Chennai");
            
            drive.findElement(By.xpath("//span[text()='Chennai']")).click();
//			02) Click  on Movie Library
            drive.findElement(By.xpath("//div[@class='nav-icon']")).click();
            drive.findElement(By.xpath("//a[text()='Movie Library']")).click();
//			03) Select the City -->chennai
            Select cities =new Select(drive.findElement(By.xpath("//select[@name='city']")));
            cities.selectByValue("Chennai");
//			04) Select the Genre-->Animation
            Select gen=new Select(drive.findElement(By.xpath("//select[@name='genre']")));
            gen.selectByVisibleText("ANIMATION");
//			05) Select the Language-->english
            Select lang = new Select(drive.findElement(By.xpath("//select[@name='lang']")));
            lang.selectByVisibleText("ENGLISH");
//			06) Click on Apply
            drive.findElement(By.xpath("//button[text()='Apply']")).click();
//			07) Click on first resulting animation movie
            drive.findElement(By.xpath("//img[@src='https://originserver-static1-uat.pvrcinemas.com/app/movies/1/402x516/HO00018056.jpg?v=8']")).click();
            //drive.findElement(By.xpath("//div[text()='Paw Patrol']")).click();
//			08) Click proceed to book
            drive.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
//			09) Enter the all fields  cinema , Name, date, Prefered show time, no of seats, food and beverages,Email and Mobile
            Select cinema=new Select(drive.findElement(By.xpath("//select[@id='cinemaName']")));
            cinema.selectByValue("PVR Velachery Chennai");
            
            //select date
            drive.findElement(By.xpath("//input[@class='ng-pristine ng-valid ng-touched']")).click();
            drive.findElement(By.xpath("//span[text()='21']")).click();
            
            //select timing
            Select timing=new Select(drive.findElement(By.xpath("//select[@name='timings']")));
            timing.selectByValue("12:00 PM - 03:00 PM");
            
            //select no of seat
            drive.findElement(By.xpath("//input[@name='noOfTickets']")).sendKeys("2");
            
            //giving name
            drive.findElement(By.xpath("//input[@name='name']")).sendKeys("Messi");
            
            drive.findElement(By.xpath("//input[@name='email']")).sendKeys("messi@gmail.com");
            
            drive.findElement(By.xpath("//input[@name='mobile']")).sendKeys("909329209");
            
            Select food=new Select(drive.findElement(By.xpath("//select[@name='food']")));
            food.selectByValue("Yes");
           
//			10) Click on copy to self 
            drive.findElement(By.xpath("//span[text()='Copy To Self']")).click();
//			11) Click on  Send Request
            drive.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
//			12) Click cancel 
            drive.findElement(By.xpath("(//button[text()='CANCEL'])[2]")).click();
//			13) Close the OTP dialog
            drive.findElement(By.xpath("//button[@class='swal2-close']")).click();
//			14) Verify the ttile of the page
            String title="Movie Library";
            String acutualtitle=drive.getTitle();
            
            if(title.equals(acutualtitle)) {
            	System.out.println("resultant page is displayed");
            }else {
            	System.out.println("resultant page is  not displayed");
            }

	}

}

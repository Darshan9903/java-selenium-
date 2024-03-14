package com.allianz.assignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task2 {

	public static void main(String[] args) {

		WebDriver wd = new ChromeDriver();
		
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wd.get("https://www.citibank.co.in/ssjsps/forgetuserid.jsp");
		wd.findElement(By.linkText("select your product type")).click();
		wd.findElement(By.linkText("Credit Card")).click();
		wd.findElement(By.id("citiCard1")).sendKeys("4545");
		wd.findElement(By.id("citiCard2")).sendKeys("5656");
		wd.findElement(By.id("citiCard3")).sendKeys("8887");
		wd.findElement(By.id("citiCard4")).sendKeys("9998");
		wd.findElement(By.id("cvvnumber")).sendKeys("337");
		wd.findElement(By.name("DOB")).click();
		Select selectyear = new Select(wd.findElement(By.className("ui-datepicker-year")));
		selectyear.selectByVisibleText("2022");
		Select selectMonh = new Select(wd.findElement(By.className("ui-datepicker-month")));
		selectMonh.selectByVisibleText("Apr");
		wd.findElement(By.linkText("14")).click();
		
		//System.out.println(windowHandle);
//		wd.findElement(By.id("agree")).click();
		wd.findElement(By.xpath("//input[@type='button']")).click();
		 Alert alert = wd.switchTo().alert();
		 System.out.println(alert);
		System.out.println("OK");
		
	}

}

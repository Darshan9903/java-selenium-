package com.allianz.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TashOpenEmr {

	public static void main(String[] args) {

		WebDriver wd1 = new ChromeDriver();
		wd1.manage().window().maximize();
		wd1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wd1.get("http://demo.openemr.io/b/openemr/");
		wd1.findElement(By.id("authUser")).sendKeys("admin");
		wd1.findElement(By.id("clearPass")).sendKeys("pass");
		wd1.findElement(By.id("login-button")).click();
		wd1.findElement(By.xpath("//div[text()= 'Patient' ]")).click();
		wd1.findElement(By.xpath("//div[text()='New/Search']")).click();
		wd1.switchTo().frame(3);
		wd1.findElement(By.xpath("//input[@title='First Name']")).sendKeys("darshh");
		wd1.findElement(By.id("form_lname")).sendKeys("patil");
		wd1.findElement(By.id("form_DOB")).sendKeys("2024-01-12");
		wd1.findElement(By.id("form_sex")).click();
		wd1.findElement(By.xpath("//option[text()='Male']")).click(); 
		wd1.findElement(By.id("create")).click();
		wd1.findElement(By.xpath("//button[text()='Confirm Create New Patient']")).click();

		System.out.println("OK"); 

	}

}

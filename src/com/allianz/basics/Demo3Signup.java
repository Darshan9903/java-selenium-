package com.allianz.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3Signup {

	public static void main(String[] args) {


		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wd.get("https://www.facebook.com");
		wd.findElement(By.linkText("Create new account")).click();
		wd.findElement(By.name("firstname")).sendKeys("Jack");
		wd.findElement(By.name("lastname")).sendKeys("Sparrow");
		wd.findElement(By.id("password_step_input")).sendKeys("abc@123");
		wd.findElement(By.xpath("//input[@value='-1']")).click();
		Select  selectDay = new Select(wd.findElement(By.id("day")));
		selectDay.selectByVisibleText("14");
		Select  selectMonth = new Select(wd.findElement(By.id("month")));
		selectMonth.selectByVisibleText("Apr");
		Select  selectYear = new Select(wd.findElement(By.id("year")));
		selectYear.selectByVisibleText("1970");
		
		  
	}

}

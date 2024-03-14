package com.allianz.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2FB {

	public static void main(String[] args) {

		WebDriver wd = new ChromeDriver();
		wd.get("https://www.facebook.com/");
//		String currentUrl = wd.getCurrentUrl();
//		String source = wd.getPageSource();
//		String tittle = wd.getTitle();
//		System.out.println(tittle);
//		System.out.println(currentUrl);
//		System.out.println(source);
		wd.findElement(By.id("email")).sendKeys("darshan@123");
		wd.findElement(By.id("pass")).sendKeys("darsn@123");
		wd.findElement(By.name("login")).click();
		//wd.quit();
	}

}

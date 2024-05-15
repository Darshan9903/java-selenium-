package com.allianz.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3medibuddy {

	public static void main(String[] args) {

		WebDriver wd = new ChromeDriver();

		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		wd.get("https://www.medibuddy.in");
//		String windowHandle = wd.getWindowHandle();
//		System.out.println(windowHandle);
//		wd.switchTo().window(windowHandle);
//		wd.findElement(By.xpath("//a[@class=wzrkClose]")).click();
		wd.findElement(By.linkText("Login")).click();
		wd.findElement(By.className("coperate")).click();
		wd.findElement(By.linkText("Learn More")).click();
		wd.findElement(By.linkText("skip")).click();
		wd.findElement(By.linkText("Login using Username & Password")).click();
		wd.findElement(By.id("username")).sendKeys("john");
		wd.findElement(By.xpath("//button[@type='submit']")).click();
		wd.findElement(By.id("password")).sendKeys("john@123");
		wd.findElement(By.xpath("//button[@type='submit']")).click();
		WebElement element = wd.findElement(By.xpath(
				"//div[text()='Sorry, We are not able to connect your corporate account. Please use your phone number to login and use other services.']"));
		System.out.println(element);

	}

}

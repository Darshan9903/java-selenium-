package com.allianz.tabs;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTab {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        driver.get("https://db4free.net");
        
        //click on phpMyAdmin »
        driver.findElement(By.linkText("phpMyAdmin »")).click();
        ArrayList<String> windows = new ArrayList<String>( driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));
        driver.findElement(By.id("input_username")).sendKeys("admin");
        driver.findElement(By.id("input_password")).sendKeys("admin123");
        driver.close();
        driver.switchTo().window(windows.get(0));
        System.out.println(driver.getTitle());
        
	}

}

package com.allianz.assignments;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskCitibank {

	public static void main(String[] args) {

		WebDriver wd1 = new ChromeDriver();
		wd1.manage().window().maximize();
		wd1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wd1.get("https://www.online.citibank.co.in/");
		wd1.findElement(By.xpath("//a[@class='newclose']")).click();
		wd1.findElement(By.xpath("//a[@class='newclose2']")).click();
		
		wd1.findElement(By.className("txtSign")).click();
		ArrayList<String> windows = new ArrayList<String>(wd1.getWindowHandles());
		
		wd1.switchTo().window(windows.get(1));
//		System.out.println(windows.get(1));
//		System.out.println(windows.get(0));
		wd1.findElement(By.xpath("//div[@class='fl cup pt3']")).click();
		wd1.findElement(By.linkText("select your product type")).click();
		wd1.findElement(By.linkText("Credit Card")).click();
		wd1.findElement(By.id("citiCard1")).sendKeys("4545");
		wd1.findElement(By.id("citiCard2")).sendKeys("5656");
		wd1.findElement(By.id("citiCard3")).sendKeys("8887");
		wd1.findElement(By.id("citiCard4")).sendKeys("9998");
		wd1.findElement(By.id("cvvnumber")).sendKeys("337");
//		wd1.findElement(By.name("DOB")).click();
//		Select selectyear = new Select(wd1.findElement(By.className("ui-datepicker-year")));
//		selectyear.selectByVisibleText("2022");
//		Select selectMonh = new Select(wd1.findElement(By.className("ui-datepicker-month")));
//		selectMonh.selectByVisibleText("Apr");
//		wd1.findElement(By.linkText("14")).click();
		
		// approach 3 - js
        JavascriptExecutor js = (JavascriptExecutor) wd1;
        js.executeScript("document.querySelector('#bill-date-long').value='17/08/2017'");
//
//        // approach 4 - js
//        WebElement ele1=driver.findElement(By.xpath("//input[@id='bill-date-long']"));
//        js.executeScript("arguments[0].value='17/08/2017'",ele1);
//		
		//System.out.println(windowHandle);
//		wd.findElement(By.id("agree")).click();
		wd1.findElement(By.xpath("//input[@type='button']")).click();
//		
		String text = wd1.findElement(By.xpath("//li[text()='• Please accept Terms and Conditions ']")).getText();
		System.out.println(text);
		System.out.println("ok");

	}

}

package com.allianz.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1Login {

	public static void main(String[] args) {
		
		WebDriver wd1 = new ChromeDriver();
		wd1.manage().window().maximize();
		wd1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wd1.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
		wd1.findElement(By.name("UserFirstName")).sendKeys("john");
		wd1.findElement(By.name("UserLastName")).sendKeys("Wick");
		wd1.findElement(By.name("UserEmail")).sendKeys("john@gmail.com");
		Select select = new Select(wd1.findElement(By.name("UserTitle")));
		select.selectByVisibleText("IT Manager");
		Select select1 = new Select(wd1.findElement(By.name("CompanyCountry")));
		select1.selectByVisibleText("United Kingdom");
		wd1.findElement(By.name("CompanyName")).sendKeys("allianz");
	    Select select2 = new  Select(wd1.findElement(By.name("CompanyEmployees")));
	   select2.selectByVisibleText("101 - 200 employees");
	    
		wd1.findElement(By.xpath("(//div[@class='checkbox-ui'])[2]" )).click();
	
		wd1.findElement(By.name("start my free trial")).click();
		
	}

}

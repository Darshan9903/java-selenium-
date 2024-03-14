package com.allianz.basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1LaunceBrowser {

	public static void main(String[] args) {

		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.google.com/");
		String url = cd.getCurrentUrl();
		String title = cd.getTitle();
		System.out.println(url);
		System.out.println(title);
		cd.quit();
		
	}

}

package com.java.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageTitleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	
	//GetTitle
	
	String title = driver.getTitle();
	
	if (title.equals("Google")) {
		System.out.println("Correct");
	} else {
	 System.out.println("Incorrect");
	}
	
	System.out.println(title);
	
	driver.quit();	
	}

}

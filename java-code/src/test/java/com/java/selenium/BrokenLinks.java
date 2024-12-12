package com.java.selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.eddymens.com/blog/page-with-broken-pages-for-testing-53049e870421");
		
		List<WebElement> brokenLinks = driver.findElements(By.tagName("a"));
		
		for (WebElement link : brokenLinks) {
			String url = link.getAttribute("href");
			
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			
			conn.connect();
			
			if (conn.getResponseCode() >= 400) {
				System.out.println("Broken link: " +url);
			} else {
				System.out.println("Unbroken link: " +url);
			}
			
		}
		
		driver.quit();	
		
	}

}

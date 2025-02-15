package com.java.selenium;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintNewsHeadlines {
	// TODO Auto-generated method stub
	public static void main(String[] args) throws MalformedURLException, IOException {
			WebDriverManager.chromedriver().setup();			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
            driver.get("https://news.google.com/");

        try {
        	//Click India
            WebElement clickIndiaTab = driver.findElement(By.xpath("//a[contains(text(), 'India')]"));
            clickIndiaTab.click();

            List<WebElement> headline_desc = driver.findElements(By.xpath("//a[@class='gPFEn']"));

            int headline_desc_count = Math.min(headline_desc.size(), 4);

            for(int i=1; i<= headline_desc_count; i++){
                String headlines_desc = headline_desc.get(i).getText();

                System.out.println("Headline :"+i+ headlines_desc);
            }

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
    
}

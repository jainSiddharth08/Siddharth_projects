package com.java.selenium;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExcelDBExample {

    public static void main(String[] args) throws Exception {
        // Load Excel Data
        String excelFilePath = "data.xlsx"; // Provide the correct file path
        FileInputStream fileInputStream = new FileInputStream(new File(excelFilePath));
        Workbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheetAt(0);

        // Extract data from the first row
        Row row = sheet.getRow(1);
        String username = row.getCell(0).getStringCellValue();
        String password = row.getCell(1).getStringCellValue();
        
        // Initialize WebDriver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        try {
            // Open website and fill form
            driver.get("https://example.com/login");
            WebElement usernameField = driver.findElement(By.id("username"));
            WebElement passwordField = driver.findElement(By.id("password"));
            WebElement loginButton = driver.findElement(By.id("loginButton"));

            usernameField.sendKeys(username);
            passwordField.sendKeys(password);
            loginButton.click();

            // Save the current page as a screenshot
            File screenshot = ((org.openqa.selenium.TakesScreenshot) driver).getScreenshotAs(org.openqa.selenium.OutputType.FILE);
            File destination = new File("screenshot.png");
            org.apache.commons.io.FileUtils.copyFile(screenshot, destination);

            // Verify the data in the database
            String dbUrl = "jdbc:mysql://localhost:3306/your_database";
            String dbUsername = "root";
            String dbPassword = "password";

            Connection connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
            String query = "SELECT * FROM users WHERE username = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                System.out.println("Verification successful: User exists in the database.");
            } else {
                System.out.println("Verification failed: User does not exist in the database.");
            }

            connection.close();
        } finally {
            // Close resources
            driver.quit();
            workbook.close();
            fileInputStream.close();
        }
    }
}


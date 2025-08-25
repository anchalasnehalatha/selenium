package com.wipro.javaselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Fileupload {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions chromeoptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeoptions);
        
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();

        // ✅ Correct way to locate by ID
        WebElement uploadInput = driver.findElement(By.id("file-upload"));

        // ✅ Make sure this path exists and file is accessible
        uploadInput.sendKeys("C:\\Users\\ancha\\OneDrive\\Desktop\\websiteexcelsheet(wipro).xlsx");
        Thread.sleep(2000);

        // Click upload button
        WebElement uploadButton = driver.findElement(By.id("file-submit"));
        uploadButton.click();
        Thread.sleep(2000);

        // Check upload confirmation message
        String message = driver.findElement(By.tagName("h3")).getText();
        if (message.contains("File Uploaded!")) {
            System.out.println("✅ The file is uploaded successfully");
        } else {
            System.out.println("❌ The file upload failed");
        }

        driver.quit();
    }
}

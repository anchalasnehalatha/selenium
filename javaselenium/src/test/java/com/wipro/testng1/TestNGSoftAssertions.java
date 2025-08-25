package com.wipro.testng1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGSoftAssertions {

    @Test
    public void testcheckbox() throws InterruptedException {

        // Setup ChromeDriver
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new ChromeDriver(chromeOptions);

        // Open the site
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Capture title
        String actualTitle = driver.getTitle();
        System.out.println("Page Title: " + actualTitle);

        String expectedTitle = "Practise page";  // (note: actual is "Practice Page")

        // Soft assertion example
        SoftAssert soft = new SoftAssert();
        soft.assertNotEquals(actualTitle, expectedTitle, "Title should not match");

        // Interact with checkbox
        WebElement checkbox = driver.findElement(By.id("checkBoxOption1"));
        checkbox.click();
        Thread.sleep(2000);

        // ✅ Important: this will collate all soft assertion results
        soft.assertAll();

        driver.quit();
    }
}

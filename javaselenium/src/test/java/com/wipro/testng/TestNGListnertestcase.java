package com.wipro.testng;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(TestNGListeners.class)
public class TestNGListnertestcase {

    @Test
    public void testcheckbox() throws InterruptedException {

        // Setup ChromeDriver
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new ChromeDriver(chromeOptions);

        // Maximize window
        driver.manage().window().maximize();

        // Open the site
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        // Wait until checkbox is clickable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement checkbox = wait.until(
                ExpectedConditions.elementToBeClickable(By.id("checkBoxOption1")));

        // Click the checkbox
        checkbox.click();
        Thread.sleep(2000);

        // Close browser
        driver.quit();
    }
}

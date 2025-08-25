package com.wipro.selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Browsercommands {
    public static void main(String[] args) throws InterruptedException {
        // Setup Chrome
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);

        // Open URL
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        // Get and print page title
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);

        // Get and print page source length (not full source to avoid clutter)
        String pageSource = driver.getPageSource();
        System.out.println("Page Source Length: " + pageSource.length());

        // Get and print current URL
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);

        // Close browser
        driver.quit();
    }
}

package com.wipro.selenium1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertseg {
    public static void main(String[] args) throws InterruptedException {
        // Setup Chrome
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        // 1️⃣ Simple Alert
        WebElement simpleAlert = driver.findElement(By.cssSelector("button[onclick='jsAlert()']"));
        simpleAlert.click();
        Thread.sleep(2000);
        Alert alt = driver.switchTo().alert();
        System.out.println("Simple Alert Text: " + alt.getText());
        alt.accept();
        Thread.sleep(2000);

        // 2️⃣ Confirmation Alert
        WebElement confirmAlert = driver.findElement(By.cssSelector("button[onclick='jsConfirm()']"));
        confirmAlert.click();   // ✅ fixed (was simpleAlert.click())
        Thread.sleep(2000);
        Alert alt1 = driver.switchTo().alert();
        System.out.println("Confirm Alert Text: " + alt1.getText());
        alt1.dismiss();
        Thread.sleep(2000);

        // 3️⃣ Prompt Alert
        WebElement promptAlert = driver.findElement(By.cssSelector("button[onclick='jsPrompt()']"));
        promptAlert.click();
        Thread.sleep(2000);
        Alert alt2 = driver.switchTo().alert();
        System.out.println("Prompt Alert Text: " + alt2.getText());
        alt2.sendKeys("snehalatha");
        Thread.sleep(2000);
        alt2.accept();
        Thread.sleep(2000);

        // Close browser
        driver.quit();
    }
}

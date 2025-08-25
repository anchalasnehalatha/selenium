package com.wipro.javaselenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertsex {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions chromeoptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeoptions);
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.manage().window().maximize();

        // Simple Alert
        WebElement simplealert = driver.findElement(By.cssSelector("button[onclick='jsAlert()']"));
        simplealert.click();
        Thread.sleep(2000);
        Alert alt = driver.switchTo().alert();
        alt.accept();
        Thread.sleep(2000);

        // Confirmation Alert
        WebElement confirmalert = driver.findElement(By.cssSelector("button[onclick='jsConfirm()']"));
        confirmalert.click();
        Thread.sleep(2000);
        Alert alt1 = driver.switchTo().alert();
        alt1.dismiss(); // Click Cancel
        Thread.sleep(2000);

        // Prompt Alert
        WebElement promptalert = driver.findElement(By.cssSelector("button[onclick='jsPrompt()']"));
        promptalert.click();
        Thread.sleep(2000);
        Alert alt2 = driver.switchTo().alert();
        String alerttext=alt2.getText();
        System.out.println(alerttext);
        alt2.sendKeys("sneha");
        Thread.sleep(2000);
        alt2.accept();
        Thread.sleep(2000);

        driver.quit();
    }
}

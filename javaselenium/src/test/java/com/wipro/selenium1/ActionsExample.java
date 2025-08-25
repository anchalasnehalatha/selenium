package com.wipro.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions; // ✅ Import the correct Actions class

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsExample { // ✅ Changed class name to avoid conflict
    public static void main(String[] args) throws InterruptedException { // ✅ Added throws InterruptedException
        ChromeOptions chromeoptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeoptions);
        
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        
        // Create Actions object
        Actions act = new Actions(driver);
        
        // Double click on "Sell" link
        WebElement sell = driver.findElement(By.xpath("(//a[normalize-space()='Sell'])[1]"));
        act.doubleClick(sell).perform();
        Thread.sleep(2000);
        
        // Navigate back
        driver.navigate().back();
        Thread.sleep(2000);
        
        // Right click on "MX Player"
        WebElement mxplayer = driver.findElement(By.xpath("//a[normalize-space()='MX Player']")); // ✅ Fixed XPath
        act.contextClick(mxplayer).perform();
        Thread.sleep(2000);
        
        driver.quit(); // ✅ Close browser
    }
}

package com.wipro.testng1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGdependency {
	  WebDriver driver;
	@Test
    public void login() throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOptions);

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // enter username
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Admin");

        // enter password
        WebElement password = driver.findElement(By.xpath("//input[@name = 'password']"));
        password.sendKeys("admin123");

        // click login
        WebElement loginbutton = driver.findElement(By.xpath("//button[@type = 'submit']"));
        loginbutton.click();

        Thread.sleep(2000);
    }
	@Test(dependsOnMethods= {"login"})
	public void testcheckbox() throws InterruptedException {
        // Using the same driver (not creating a new one)
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement checkbox = driver.findElement(By.id("checkBoxOption1"));
        checkbox.click();

        Thread.sleep(2000);

        driver.quit();
    }


}

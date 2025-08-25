package com.wipro.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGparameterization {
	
	@Parameters({"browser","platform"})
	@Test
	public void testparameters(String browser, String platform) throws InterruptedException {
		
		if(browser.equals("chrome") && platform.equals("windows")) {
			
			ChromeOptions chromeOption = new ChromeOptions();
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver(chromeOption);
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			driver.quit();
			
		}
		else {
			
			FirefoxOptions firefoxOption = new FirefoxOptions();
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new FirefoxDriver(firefoxOption);
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			Thread.sleep(2000);
			driver.quit();
			
		}
		
	}

}
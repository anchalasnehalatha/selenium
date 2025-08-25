package com.wipro.selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigationalcommands {
	public static void main(String[] args) throws InterruptedException {
		 ChromeOptions chromeoptions = new ChromeOptions(); // ✅ Correct object creation
	        WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver(chromeoptions);

	        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
	        driver.manage().window().maximize();
	       Thread.sleep(2000);
	       //forward
	       driver.navigate().back();
	       Thread.sleep(2000);
	        //backward
	       driver.navigate().forward();
	       Thread.sleep(2000);
	       //refresh
	       driver.navigate().refresh();
	       Thread.sleep(3000);
	       driver.quit();
	}

}

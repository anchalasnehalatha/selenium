package com.wipro.javaselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radiobutttoneg {
	public static void main(String[] args) throws InterruptedException {
	    ChromeOptions chromeoptions = new ChromeOptions();
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver(chromeoptions);
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    WebElement radio3 = driver.findElement(By.xpath("//input[@value='radio3']"));
	    radio3.click();
	    Thread.sleep(2000);
	    driver.quit();
	}

	}



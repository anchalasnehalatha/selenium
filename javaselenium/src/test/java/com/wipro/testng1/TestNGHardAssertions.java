package com.wipro.testng1;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class TestNGHardAssertions {
	public void testcheckbox() throws InterruptedException {
		 
		ChromeOptions chromeOptions = new ChromeOptions();
 
		WebDriverManager.chromedriver().setup();
 
		WebDriver driver = new ChromeDriver(chromeOptions);
 
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(2000);
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		String expectedtitle = "Practice Page";
		// hard assertion  - the validation fails if the assertion is failing (it gives testcase fail when u give wrongtitle and gives pass when u give correct title))
		Assert.assertEquals(actualtitle,expectedtitle);
 
		WebElement checkbox = driver.findElement(By.xpath("//input[@id = 'checkBoxOption1']"));
 
		checkbox.click();
 
		Thread.sleep(2000);
 
	}

 

}

package com.wipro.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class radiobuttoneg {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement radiobutton1=driver.findElement(By.xpath("//input[@value='radio1']"));
		radiobutton1.click();
		Thread.sleep(2000);
		WebElement radiobutton2=driver.findElement(By.xpath("//input[@value='radio2']"));
		radiobutton2.click();
		Thread.sleep(2000);
		
	}

}

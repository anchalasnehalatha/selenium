package com.wipro.javaselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiradiobuttoneg {
	public static void main(String[] args) throws InterruptedException {
		 ChromeOptions chromeoptions = new ChromeOptions();
		    WebDriverManager.chromedriver().setup();
		    WebDriver driver = new ChromeDriver(chromeoptions);
		    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		    //maximize the window
		
		    driver.manage().window().maximize();
		   List<WebElement> radiobuttons = driver.findElements(By.xpath("//input[@type='radio']"));
		    int size=radiobuttons.size();
		    System.out.println(size);
		    //for loop to iterate the webelements
		    for(int i=0;i<size;i++) {
		    	radiobuttons.get(i).click();
		    }
		    Thread.sleep(2000);
		    driver.quit();
	}
	}




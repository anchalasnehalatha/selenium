package com.wipro.javaselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {
	 public static void main(String[] args) throws InterruptedException {
		 
		 
		
	        // Set Chrome Options (optional)
	        ChromeOptions chromeOptions = new ChromeOptions();
	       // open browser maximized

	        // Initialize ChromeDriver
	        WebDriver driver = new ChromeDriver(chromeOptions);
	        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
	        driver.manage().window().maximize();

	        // Actions class is used to simulate the mouse related activities
	        Actions act = new Actions(driver);

	        // Find elements to drag and drop
	        WebElement from = driver.findElement(By.id("column-a"));
	        WebElement to = driver.findElement(By.id("column-b"));

	        // Perform drag and drop
	        act.dragAndDrop(from, to).perform();
	        
	        Thread.sleep(5000);
	        
	        driver.quit();
	        
	 }
}
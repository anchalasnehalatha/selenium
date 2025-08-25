package com.wipro.testng1;

import org.testng.annotations.Test;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleTestNG {
	@Test(priority=1)
       public void alerts() throws InterruptedException {
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
	
	@Test(priority=2)
	public void draganddrop() throws InterruptedException{

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
	@Test(priority=0)
	public void multiradiobutton() throws InterruptedException{
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
	





package com.wipro.selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multicheckbox {
	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions chromeoptions = new ChromeOptions(); 
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver(chromeoptions);

	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    driver.manage().window().maximize();
	    List<WebElement> multicheckbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
	    int size=multicheckbox.size();
	    for(int i=0;i<size;i++) {
	    	multicheckbox.get(i).click();
	    }
	    
	    Thread.sleep(2000);
	    driver.quit();
	    

}
}
package com.wipro.javaselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Deselectex {
	public static void main(String[] args) throws InterruptedException {
		 ChromeOptions chromeoptions = new ChromeOptions();
		    WebDriverManager.chromedriver().setup();
		    WebDriver driver = new ChromeDriver(chromeoptions);
		    driver.get("https://grotechminds.com/multiple-select/?");
		    driver.manage().window().maximize();
		    WebElement drdwn=driver.findElement(By.xpath("//select[@id='automobiles']"));
		    Select sel=new Select(drdwn);
		     sel.deselectByIndex(0);
            Thread.sleep(1000);
            
            sel.deselectByIndex(1);
            Thread.sleep(1000);
            
            sel.deselectByIndex(2);
            Thread.sleep(1000);

            sel.deselectByIndex(3);
            Thread.sleep(1000);
            
            sel.deselectAll();
            driver.quit();

		    
		    
		    
	}
}



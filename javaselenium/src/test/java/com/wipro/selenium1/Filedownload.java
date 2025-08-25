package com.wipro.selenium1;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Filedownload {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions chromeoptions = new ChromeOptions();
	     WebDriverManager.chromedriver().setup();
	     WebDriver driver = new ChromeDriver(chromeoptions);
	     driver.get("https://the-internet.herokuapp.com/download");

	     driver.manage().window().maximize();
	     //file download
	     WebElement download=driver.findElement(By.xpath("//a[normalize-space()='mobile-test_1755215158517_xl92w.txt']"));
	     download.click();
	     Thread.sleep(2000);
	     //check existence
	     File f=new File("C:/Users/ancha/Downloads/mobile-test_1755215158517_xl92w.txt");
	     if(f.exists()) {
	    	 System.out.println("file is present");
	     }
	     else {
	    	 System.out.println("not present");
	     }
	     
	     
	}

}

package com.wipro.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launchbrowser {
	/**
	 * 
	 */
	@Test
	public void launchingbrowser() {
	ChromeOptions chromeoptions=new ChromeOptions();
   WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver(chromeoptions);
	driver.get("https://the-internet.herokuapp.com/windows");
	

}
}

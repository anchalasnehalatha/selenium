package com.wipro.javaselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokeChromeBrowser {
	public static void main(String[] args) {
		//Inorder to see website in chrome
		ChromeOptions chromeoptions=new ChromeOptions();
		//chromedriver method allows to see where this method invokesall from browser which automatically setup by Webdrivermanager
		WebDriverManager.chromedriver().setup();
		//webdriver is interface used to start new chromedriver
		WebDriver driver=new ChromeDriver(chromeoptions);
		//url which u want to see website throh this chrome browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

}

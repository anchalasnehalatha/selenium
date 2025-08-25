package com.wipro.javaselenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationalCommandsEg {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions chromeOptions = new ChromeOptions();
		// webdriver manager - download setup and maintance of the diff
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		// mximize the window
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		

		driver.navigate().forward();
		Thread.sleep(2000);
		

		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		driver.close();
		

		
		
		
		
}
}
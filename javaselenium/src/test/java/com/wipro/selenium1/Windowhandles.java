package com.wipro.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandles {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions chromeoptions=new ChromeOptions();
	   WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver(chromeoptions);
		driver.get("https://the-internet.herokuapp.com/windows\r\n");
		driver.manage().window().maximize();
		//to get parent window
		WebElement clickhere=driver.findElement(By.xpath("//a[normalize-space()='Click Here']"));
		clickhere.click();
		Thread.sleep(2000);
		//to get child window
		Object[] windowHandles=driver.getWindowHandles().toArray();
		System.out.println("WindowHandles");
		driver.switchTo().window((String) windowHandles[1]);
		//title of child window
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		driver.close();
		//get back to parent window
		driver.switchTo().window((String) windowHandles[0]);
		driver.quit();
		
		
}
}

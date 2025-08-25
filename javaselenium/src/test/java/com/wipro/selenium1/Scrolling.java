package com.wipro.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolling {
	public static void main(String[] args) throws InterruptedException {
        ChromeOptions chromeoptions=new ChromeOptions();
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver(chromeoptions);
				driver.get("https://www.amazon.in/");
				driver.manage().window().maximize();
				WebElement amazon=driver.findElement(By.xpath("//a[normalize-space()='About Amazon']"));
				Actions act=new Actions(driver);
				Thread.sleep(2000);
				act.scrollToElement(amazon);
				amazon.click();
				
				

}
}

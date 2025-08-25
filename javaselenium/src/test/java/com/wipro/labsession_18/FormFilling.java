package com.wipro.labsession_18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FormFilling {
	@Test(groups= {"Sanity","Regression"})

	public void practise() throws InterruptedException {
		ChromeOptions chromeOption = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOption);
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		//Maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//firstname
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("Snehalatha");
		//lastname
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.sendKeys("reddy");
		//gender
		WebElement gender = driver.findElement(By.xpath("//input[@id='sex-1']"));
		gender.click();
		//experience
		WebElement experience = driver.findElement(By.xpath("//input[@id='exp-0']"));
		experience.click();
		//date
		WebElement date = driver.findElement(By.xpath("//input[@id='datepicker']"));
		date.sendKeys("18-08-2025");
		//profession
		WebElement profession = driver.findElement(By.xpath("//input[@id='profession-1']"));
		profession.click();
		WebElement tools = driver.findElement(By.xpath("//input[@id='tool-2']"));
		tools.click();
		//select continent
		WebElement continents = driver.findElement(By.id("continents"));
		Select selectContinent = new Select(continents);
		selectContinent.selectByVisibleText("Europe"); // Choose the continent you want

		// Select Commands
		WebElement commandsElement = driver.findElement(By.id("selenium_commands")); // The <select> element for commands
		Select selectCommands = new Select(commandsElement);
		selectCommands.selectByVisibleText("Browser Commands"); // Choose the desired command

		Thread.sleep(2000);
		WebElement upload = driver.findElement(By.xpath("//input[@id='photo']"));
		upload.sendKeys("C://Users//ancha//OneDrive//Desktop//locatorsfora website.txt");
		Thread.sleep(2000);
		WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
		submit.click();
		Thread.sleep(2000);
		
	}

}


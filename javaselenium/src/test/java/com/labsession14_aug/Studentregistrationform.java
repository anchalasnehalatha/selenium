package com.labsession14_aug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Studentregistrationform {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions chromeoptions=new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(chromeoptions);
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		//name
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        username.sendKeys("sneha");
        Thread.sleep(1000);
        //email
        WebElement useremail = driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
        useremail.sendKeys("sneha@gmail.com");
        Thread.sleep(1000);
        //gender
        WebElement usermale= driver.findElement(By.xpath("//input[@id='gender']"));
        usermale.click();
	    Thread.sleep(2000);
	    //mobile
	    WebElement mobile = driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']"));
	    mobile.sendKeys("9879673456");
	    Thread.sleep(2000);
	    //dob
	    WebElement dob = driver.findElement(By.xpath("//input[@id='dob']"));
	    dob.sendKeys("14-08-2025");
	    Thread.sleep(2000);
	    //subjects
	    WebElement subjects = driver.findElement(By.xpath("//input[@id='subjects']"));
	    subjects.sendKeys("English");
	    Thread.sleep(2000);
	    //hobbies
	    WebElement hobbies = driver.findElement(By.xpath("//input[@id='hobbies']"));
	    hobbies.sendKeys("sports");
	    Thread.sleep(2000);
	    //currentaddress
	    WebElement address = driver.findElement(By.xpath("//textarea[@id='picture']"));
	    address.sendKeys("Anantapur");
	    Thread.sleep(2000);
	    //state
	    WebElement state = driver.findElement(By.xpath("//select[@id='state']"));
	    state.sendKeys("Haryana");
	    Thread.sleep(2000);
	    //city
	    WebElement city = driver.findElement(By.xpath("//select[@id='city']"));
	    city.sendKeys("Agra");
	    Thread.sleep(2000);
	    //choose a file
	    WebElement fileupload = driver.findElement(By.xpath("//input[@id='picture']"));
	    fileupload.sendKeys("C://Users//ancha//OneDrive//Desktop//websiteexcelsheet(wipro).xlsx");
	    Thread.sleep(2000);
	    
	    
	    
        
	}

}

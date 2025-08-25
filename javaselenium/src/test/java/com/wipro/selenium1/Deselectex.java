package com.wipro.selenium1;

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
	    WebElement dropdown=driver.findElement(By.xpath("//select[@id='automobiles']"));
	    Select sel=new Select(dropdown);
	    //Deselecting by index
	    sel.selectByIndex(0);
	    Thread.sleep(2000);
	    sel.selectByIndex(1);
	    Thread.sleep(2000);
	    sel.selectByIndex(2);
	    Thread.sleep(2000);

}
}

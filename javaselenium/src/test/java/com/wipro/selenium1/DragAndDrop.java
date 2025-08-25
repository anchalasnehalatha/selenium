package com.wipro.selenium1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
        ChromeOptions chromeoptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeoptions);
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");

        driver.manage().window().maximize();
        //this is used for mouse related activities
        Actions act = new Actions(driver);
        //webelements for drag and drop
        WebElement from=driver.findElement(By.xpath("//div[@id='column-a']"));
        WebElement to=driver.findElement(By.xpath("//div[@id='column-b']"));
        //performing it 
        act.dragAndDrop(from,to).perform();
        Thread.sleep(2000);
        driver.quit();


}
}

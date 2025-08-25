package com.wipro.selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datepicker {
	public static void main(String[] args) {
		ChromeOptions chromeoptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeoptions);
        driver.get("https://ui.shadcn.com/docs/components/date-picker");

        driver.manage().window().maximize();
        

	}

}

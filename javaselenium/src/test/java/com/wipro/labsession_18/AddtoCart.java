
package com.wipro.labsession_18;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

//@Listeners(TestNGListner.class) // SOFT ASSERTION
public class AddtoCart {

    @Parameters("Cart")
    @Test(groups = {"Sanity", "Regression"})
    public void cart(String Cart) throws InterruptedException {
        try {
            if (Cart.equals("Electronics")) {

                ChromeOptions chromeOption = new ChromeOptions();
                WebDriverManager.chromedriver().setup();
                WebDriver driver = new ChromeDriver(chromeOption);
                driver.get("https://www.demoblaze.com/index.html");

                // Maximize the window
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

                // Soft Assertion for Title
                SoftAssert soft = new SoftAssert();

                String expectedTitle = "STORED";
                String actualTitle = driver.getTitle();

                soft.assertEquals(actualTitle, expectedTitle);
                System.out.println("Expected Title: " + expectedTitle);
                System.out.println("Actual Title: " + actualTitle);

                // continue your flow
                WebElement phone = driver.findElement(By.xpath("//a[normalize-space()='Sony xperia z5']"));
                phone.click();

                WebElement sony = driver.findElement(By.xpath("//a[normalize-space()='Add to cart']"));
                sony.click();

                Thread.sleep(2000);
                Alert alt = driver.switchTo().alert();
                alt.accept();

                WebElement home = driver.findElement(By.xpath("//li[@class='nav-item active']//a[@class='nav-link']"));
                home.click();

                WebElement laptops = driver.findElement(By.xpath("//a[3]"));
                laptops.click();

                WebElement laptop = driver.findElement(By.xpath("//a[normalize-space()='MacBook Pro']"));
                laptop.click();

                WebElement macbook = driver.findElement(By.xpath("//a[normalize-space()='Add to cart']"));
                macbook.click();

                Thread.sleep(2000);
                Alert alt1 = driver.switchTo().alert();
                alt1.accept();

                WebElement adc = driver.findElement(By.xpath("//a[@id='cartur']"));
                adc.click();

                WebElement order = driver.findElement(By.xpath("//button[normalize-space()='Place Order']"));
                order.click();

                WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
                name.sendKeys("Sufian");
                WebElement country = driver.findElement(By.xpath("//input[@id='country']"));
                country.sendKeys("India");
                WebElement city = driver.findElement(By.xpath("//input[@id='city']"));
                city.sendKeys("Kurnool");
                Thread.sleep(2000);

                WebElement creditcard = driver.findElement(By.xpath("//input[@id='card']"));
                creditcard.sendKeys("8898 6655 9822");
                Thread.sleep(2000);

                WebElement month = driver.findElement(By.xpath("//input[@id='month']"));
                month.sendKeys("August");
                Thread.sleep(2000);

                WebElement year = driver.findElement(By.xpath("//input[@id='year']"));
                year.sendKeys("2025");
                Thread.sleep(2000);

                WebElement purchase = driver.findElement(By.xpath("//button[normalize-space()='Purchase']"));
                purchase.click();

                //Collect all soft assert results (reports failures at the end)
                soft.assertAll();

            } else {
                System.out.println("Error: Wrong parameter value passed.");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

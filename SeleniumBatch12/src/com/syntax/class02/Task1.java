package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

    /**
     * Task
     * Navigate to http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx
     * Login
     * Get title and verify
     * logout
     * close the browser
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");

        WebElement pass = driver.findElement(By.name("ctl00$MainContent$password"));
        pass.sendKeys("test");

        WebElement buttonClick = driver.findElement(By.name("ctl00$MainContent$login_button"));
        buttonClick .click();

        Thread.sleep(2000);

        WebElement logout = driver.findElement(By.linkText("Logout"));
        logout.click();
        driver.quit();


    }
}

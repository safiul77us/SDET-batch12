package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        WebElement uName = driver.findElement(By.xpath("//input[contains(@id, 'username')]"));
        uName.sendKeys("Tester");
        WebElement pass = driver.findElement(By.xpath("//input[@type = 'password']"));
        pass.sendKeys("test");
        WebElement lButton = driver.findElement(By.xpath("//input[@value='Login']"));
        lButton.click();
        WebElement logout = driver.findElement(By.xpath("//a[contains(@id, 'logout')]"));
        logout.click();
        driver.quit();
    }
}

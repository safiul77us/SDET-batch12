package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements {

    public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.get("https://www.fb.com");
driver.findElement(By.id("email")).sendKeys("syntax@yahoo.com");
driver.findElement(By.id("pass")).sendKeys("12334555");
driver.findElement(By.name("login")).click();
Thread.sleep(2000);
//driver.findElement(By.linkText("Forgot password?")).click();
driver.findElement(By.partialLinkText("password")).click();
    }
}

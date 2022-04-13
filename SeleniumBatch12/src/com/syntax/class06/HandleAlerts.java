package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HandleAlerts {
    public static String url = "http://www.uitestpractice.com/Students/Switchto";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver.manage().window().maximize();
//        WebElement simpleAlertButton = driver.findElement(By.id("alert"));
//        simpleAlertButton.click(); // alert window popup
//        Alert simpleAlert = driver.switchTo().alert(); // switching focus on alert window
//        Thread.sleep(2000);
//        simpleAlert.accept();

//
//        WebElement confirmAlertButton = driver.findElement(By.id("confirm"));
//        confirmAlertButton.click();
//        Thread.sleep(2000);
        //Alert alert = driver.switchTo().alert(); // switch the focus to alert
//        String alertText = alert.getText();
//        System.out.println(alertText);
//        alert.dismiss();

        WebElement promptAlertButton = driver.findElement(By.cssSelector("button#prompt"));
        promptAlertButton.click();
        Thread.sleep(2000);
        Alert promptAlert = driver.switchTo().alert();
        promptAlert.sendKeys("Batch 12 is the Best!!!");
        Thread.sleep(2000);
        promptAlert.accept();

    }
}

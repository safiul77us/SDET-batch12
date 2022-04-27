package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.jws.WebService;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class UploadDocuments {

    public static String url = "https://the-internet.herokuapp.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement fileUploadLink = driver.findElement(By.linkText("File Upload"));
        fileUploadLink.click();

        WebElement chooseFile = driver.findElement(By.id("file-upload"));

        chooseFile.sendKeys("C:\\Users\\alam7\\Desktop\\Git.txt");
        WebElement uploadButton = driver.findElement(By.id("file-submit"));
        uploadButton.click();
    }
}

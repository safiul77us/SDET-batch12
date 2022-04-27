package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JsExecutorDemo3 {
    public static String url = "http://google.com";

    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();

        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.open('http://amazon.com');"); // opens a new tab and navigates to amazon
        //window.open(); -- open a blank tab

        driver.get(url);


        WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
        searchBar.sendKeys("hello");

        WebElement searchBarClick = driver.findElement(By.id("nav-search-submit-button"));
        searchBarClick.click();

    }
}

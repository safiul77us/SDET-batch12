package com.syntax.class25;

import java.awt.*;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.openBrowser();
        driver.maximizeWindow();
        driver.findElement();
        driver.closeBrowser();

        System.out.println("-----------");

        WebDriver driver2 = new FirefoxDriver();
        driver2.openBrowser();
        driver2.maximizeWindow();
        driver2.findElement();
        driver2.closeBrowser();
    }
}

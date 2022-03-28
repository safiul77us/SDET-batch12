package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.get("https://fb.com");
driver.manage().window().maximize();

String title = driver.getTitle();
System.out.println(title);
String expectedTitle = "Facebook - Log In or Sign Up";
if(title.equals(expectedTitle)){
    System.out.println("Title is correct");
}else {
    System.out.println("Title is incorrect");
}
driver.quit();

    }
}

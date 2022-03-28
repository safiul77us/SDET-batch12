package com.syntax.class25;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HumanTester {
    public static void main(String[] args) {
        Maha maha = new Maha();
        maha.walk();
        Human.printLegs();

        WebDriver wb = new ChromeDriver();
    }
}

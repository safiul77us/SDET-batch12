package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

public class DDWithIterator {

    public static String url = "https://amazon.com";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(url);

        WebElement departmentsDD = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(departmentsDD);
        boolean isMultiple = select.isMultiple();
        System.out.println(isMultiple);

        if (!isMultiple) {
            List<WebElement> options = select.getOptions();
            Iterator<WebElement> it = options.iterator(); //iterator is an interface
            while (it.hasNext()) {
                WebElement ddOption = it.next();
                String optionText = ddOption.getText();
                System.out.println(optionText);
            }
        }
    }
}

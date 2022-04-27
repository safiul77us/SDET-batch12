package com.syntax.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class WebtablesWithPagination {

public static String url = "http://syntaxprojects.com/table-pagination-demo.php";

public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get(url);

    List<WebElement> rows = driver.findElements(By.xpath("//table[@class = 'table table-hover']/tbody/tr"));
    WebElement nextButton = driver.findElement(By.xpath("//a[@class='next_link']"));

    boolean flag = true;
    while (flag) {
        for (WebElement row : rows) { //iterating through webElemet, container = rows
            String rowText = row.getText();
            if (rowText.contains("Archy J")) {
                flag = false; //found our target, met our condition, so don't continue
                System.out.println(rowText);
                break;
            }
        }
        if (flag) {
            nextButton.click();
        }
    }

}
}




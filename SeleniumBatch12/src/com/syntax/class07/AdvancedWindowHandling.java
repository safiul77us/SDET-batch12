package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Iterator;
import java.util.Set;

public class AdvancedWindowHandling {
    public static String url = "https://syntaxprojects.com/window-popup-modal-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        String mainPageHandel = driver.getWindowHandle();
        System.out.println("The title of the main page: " + driver.getTitle()+"\n");

        WebElement igButton = driver.findElement(By.linkText("Follow On Instagram"));
        WebElement fbButton = driver.findElement(By.linkText("Like us On Facebook"));
        WebElement igAndFbButton = driver.findElement(By.linkText("Follow Instagram & Facebook"));

        igButton.click();
        fbButton.click();
        igAndFbButton.click();

        Set<String> allWindowHandles = driver.getWindowHandles();
        //System.out.println(allWindowHandles.size());
        Iterator<String> it = allWindowHandles.iterator();

        while (it.hasNext()){
            String handle = it.next();
            if(!mainPageHandel.equals(handle)){
                driver.switchTo().window(handle); // switch to a window which is not equal to main page handle
                //driver.manage().window().maximize();
                String title = driver.getTitle();
                System.out.println(title);
                driver.close();
            }
        }
        driver.switchTo().window(mainPageHandel);
        igButton.click();
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://ebay.com");

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("Number of links " + allLinks.size());

        //getting all non empty link
//        for (WebElement link : allLinks) {
//            String linkText = link.getText();
//            if (!linkText.isEmpty()) {
//                System.out.println(linkText);
//            }
//        }

        // getting all link of href
        for (WebElement link : allLinks) {
            String linkText = link.getText();
            String fullLink = link.getAttribute("href");
            if (!linkText.isEmpty()) {
                System.out.println(linkText + "    " + fullLink);
            }
        }

    }
}




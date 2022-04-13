import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class Main {
        public static String url = "http://syntaxprojects.com/index.php";

        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get(url);

            String title =  driver.getTitle();
            String mainPageHandel =  driver.getWindowHandle();
            Set<String> allHandles = driver.getWindowHandles();

            System.out.println(title);
            System.out.println(mainPageHandel);

    }
}


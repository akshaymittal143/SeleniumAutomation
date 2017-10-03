package packt.selenium.chap3_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

/**
 * Created by Ripon on 11/4/2015.
 */
public class WebDriverDocumentationTest_02 {
    private static WebDriver driver;
    private static String baseUrl;

    public static void main(String args[]){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        baseUrl = "http://www.seleniumhq.org";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        testVerifyTitleWebDriver();
        driver.quit();
    }

    //navigation
    public static void navigateToSeleniumWebDriver() {
        driver.get(baseUrl + "/");
        driver.findElement(By.linkText("Documentation")).click();
        driver.findElement(By.linkText("Selenium WebDriver")).click();
    }

    //Validation
    public static void testVerifyTitleWebDriver() {
        navigateToSeleniumWebDriver();
        String actualTitle = driver.getTitle();
        assertEquals("Selenium WebDriver — Selenium Documentation", driver.getTitle());
    }
}
package packt.selenium.chap3_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.Assert.assertEquals;

public class WebDriverDocumentationTest_03 {

    public static void main(String... args){
        WebDriver driver = new FirefoxDriver();

        SeleniumHQ seleniumHQ = new SeleniumHQ(driver);
        Documentation documentationPage = seleniumHQ.clickDocumentation();
        WebDriverDocumentation webDriverDocumentation = documentationPage.navigateToWebDriverDocumentation();

        String actualTitle = driver.getTitle();
        String expectedTitle = "Selenium WebDriver — Selenium Documentation";
        assertEquals(expectedTitle, actualTitle);
        driver.quit();
    }
}
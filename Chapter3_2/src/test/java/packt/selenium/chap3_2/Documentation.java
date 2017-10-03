package packt.selenium.chap3_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;


public class Documentation {
    private WebDriver driver;

    public Documentation(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriverDocumentation navigateToWebDriverDocumentation(){
        driver.findElement(By.linkText("Selenium WebDriver")).click();
        return new WebDriverDocumentation(driver);
    }
}
package packt.selenium.chap5_2.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Ripon on 11/14/2015.
 */
public class TestDesignConsiderations {
    private WebDriver driver;

    public TestDesignConsiderations(WebDriver driver) {
        this.driver = driver;
        if (!driver.getTitle().equals("Test Design Considerations — Selenium Documentation")){
            throw new WrongPageException("Incorrect page for Test Design Considerations");
        }
    }

    public String getTextHeadingPageObjectDesignPattern(){
        String actualHeading = driver.findElement(By.xpath("//div[@id='page-object-design-pattern']/h2")).getText();
        return actualHeading;
    }

    public TestDesignConsiderations navigateToWebDriverDocumentation(){
        return this;
    }
}
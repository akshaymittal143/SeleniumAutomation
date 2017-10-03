package packt.selenium.chap3_7.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Ripon on 11/4/2015.
 */
public class Documentation {
    private WebDriver driver;

    public Documentation(WebDriver driver) {
        this.driver = driver;
        if (!driver.getTitle().equals("Selenium Documentation — Selenium Documentation")){
            throw new WrongPageException("Incorrect page for Documentation Page");
        }
    }

    public TestDesignConsiderations navigateToTestDesignConsiderations(){
        driver.findElement(By.linkText("Test Design Considerations")).click();
        return new TestDesignConsiderations(driver);
    }
}
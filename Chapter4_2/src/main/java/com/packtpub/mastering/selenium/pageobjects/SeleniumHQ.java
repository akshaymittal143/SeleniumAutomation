package com.packtpub.mastering.selenium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

/**
 * Created by Ripon on 11/8/2015.
 */
public class SeleniumHQ {
    private WebDriver driver;
    private String baseUrl;

    public SeleniumHQ(WebDriver driver) {
        this.driver = driver;
        driver.manage().window().maximize();
        baseUrl = "http://www.seleniumhq.org";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(baseUrl + "/");
        if (!driver.getTitle().equals("Selenium - Web Browser Automation")){
            throw new IllegalStateException();
        }
    }
    /*public SeleniumHQ showSeleniumHQHomePage(){
        driver.get(baseUrl + "/");
        return this;
    }*/
    public Documentation goToDocumentationPage(){
        driver.findElement(By.linkText("Documentation")).click();
        return new Documentation(driver);
    }
}
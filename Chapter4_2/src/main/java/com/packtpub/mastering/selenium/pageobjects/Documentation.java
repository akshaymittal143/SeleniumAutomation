package com.packtpub.mastering.selenium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Ripon on 11/8/2015.
 */
public class Documentation {
    private WebDriver driver;

    public Documentation(WebDriver driver) {
        this.driver = driver;
    }
    /*public Documentation goToDocumentation(){
        driver.findElement(By.linkText("Documentation")).click();
        return this;
    }*/
    public PageObjectDesignPattern goToPageObjectDesignPatternPage(){
        driver.findElement(By.linkText("Page Object Design Pattern")).click();
        return new PageObjectDesignPattern(driver);
    }
}
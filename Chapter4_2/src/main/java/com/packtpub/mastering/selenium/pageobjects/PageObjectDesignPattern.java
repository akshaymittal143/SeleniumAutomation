package com.packtpub.mastering.selenium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Ripon on 11/8/2015.
 */
public class PageObjectDesignPattern {
    private WebDriver driver;
    public PageObjectDesignPattern(WebDriver driver){
        this.driver = driver;
    }
    public PageObjectDesignPattern goToPageObjectDesignPatternPage(){
        driver.findElement(By.linkText("Page Object Design Pattern")).click();
        return this;
    }
}
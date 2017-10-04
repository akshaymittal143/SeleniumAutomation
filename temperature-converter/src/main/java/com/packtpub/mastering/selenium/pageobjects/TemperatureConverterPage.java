package com.packtpub.mastering.selenium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Ripon on 11/28/2015.
 */
public class TemperatureConverterPage {
    private WebDriver driver;
    public TemperatureConverterPage(WebDriver driver){
        this.driver = driver;
        System.out.println(driver.getTitle());
        if (!driver.getTitle().equals("from fahrenheit to celsius - Google Search")){
            throw new WrongPageException("Incorrect page for Temperature Conversion page");
        }
    }
    public void inputFahrenheit(double valueOfFahrenheit){
        String s = Double.toString(valueOfFahrenheit);
        driver.findElement(By.xpath(".//*[@id='_Aif']/input")).clear();
        driver.findElement(By.xpath(".//*[@id='_Aif']/input")).sendKeys(s);
    }
    public String actualResult(){
        String valueOfCelsius = driver.findElement(By.xpath(".//*[@id='_Cif']/input")).getAttribute("value");
        System.out.println(valueOfCelsius);
        return valueOfCelsius;
    }
    public String expectedResult(){
        return "37";
    }
}

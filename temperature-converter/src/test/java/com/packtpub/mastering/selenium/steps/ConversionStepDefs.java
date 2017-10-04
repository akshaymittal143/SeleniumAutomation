package com.packtpub.mastering.selenium.steps;

import com.packtpub.mastering.selenium.pageobjects.Google;
import com.packtpub.mastering.selenium.pageobjects.TemperatureConverterPage;
import cucumber.annotation.After;
import cucumber.annotation.Before;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by Ripon on 11/26/2015.
 */
public class ConversionStepDefs {
    private WebDriver driver;
    public Google googlePage;
    public TemperatureConverterPage temperatureConverterPage;
    @Given("^I want to  convert (\\d+).(\\d+) degree Fahrenheit to Celsius$")
    public void I_want_to_convert_degree_Fahrenheit_to_Celsius(int arg1, int arg2) throws Throwable {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        googlePage = new Google(driver);
        temperatureConverterPage = googlePage.goToTemperatureConversionPage();
    }

    @When("^I input the value of Fahrenheit as (\\d+).(\\d+) in text field$")
    public void I_input_the_value_of_Fahrenheit_as_in_text_field(int arg1, int arg2) throws Throwable {
        //input Fahrenheit value
        temperatureConverterPage.inputFahrenheit(98.6);
    }

    @Then("^It should be converted to Celsius as (\\d+) degree$")
    public void It_should_be_converted_to_Celsius_as_degree(int arg1) throws Throwable {
        //assertion
        assertEquals(temperatureConverterPage.actualResult(), temperatureConverterPage.expectedResult());
        driver.quit();
    }
}
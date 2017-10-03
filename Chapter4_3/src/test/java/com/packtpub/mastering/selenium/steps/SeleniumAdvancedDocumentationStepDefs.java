package com.packtpub.mastering.selenium.steps;

import cucumber.annotation.After;
import cucumber.annotation.Before;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;

import com.packtpub.mastering.selenium.pageobjects.SeleniumHQ;
import com.packtpub.mastering.selenium.pageobjects.Documentation;
import com.packtpub.mastering.selenium.pageobjects.PageObjectDesignPattern;

/**
 * Created by Ripon on 11/8/2015.
 */
public class SeleniumAdvancedDocumentationStepDefs {
    protected WebDriver driver;

    SeleniumHQ seleniumHQPage;
    Documentation documentationPage;
    PageObjectDesignPattern pageObjectDesignPatternPage;
    String actualPageTitle;

    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        //driver.close();
        driver.quit();
    }
    @Given("^that seleniumhq.org is available$")
    public void that_seleniumhq_org_is_available() throws Throwable {
        seleniumHQPage = new SeleniumHQ(driver);
    }

    @When("^I read the documentation about page objects$")
    public void I_read_the_documentation_about_page_objects() throws Throwable {
        //seleniumHQPage.goToDocumentationPage();
        Documentation documentationPage = seleniumHQPage.goToDocumentationPage();
        PageObjectDesignPattern pageObjectDesignPatternPage = documentationPage.goToPageObjectDesignPatternPage();
        //documentationPage = new Documentation(driver);
        //documentationPage.goToPageObjectDesignPatternPage();
        actualPageTitle = driver.getTitle();
    }

    @Then("^I should see the title \"([^\"]*)\"$")
    public void I_should_see_the_title(String expectedTitle) throws Throwable {
        assertEquals(expectedTitle, actualPageTitle);
    }
}
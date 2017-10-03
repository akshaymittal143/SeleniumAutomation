package packt.selenium.chap3_7;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import packt.selenium.chap3_7.pageobjects.Documentation;
import packt.selenium.chap3_7.pageobjects.SeleniumHQ;
import packt.selenium.chap3_7.pageobjects.TestDesignConsiderations;

import java.util.concurrent.TimeUnit;


public class TestDesignConsiderationsTest {
    private WebDriver driver;
    private SeleniumHQ seleniumHQ;
    private Documentation documentationPage;
    private TestDesignConsiderations testDesignConsiderationsPage;

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void testHeading_PageObjectDesignPattern() throws Exception {
        seleniumHQ = new SeleniumHQ(driver);
        documentationPage = seleniumHQ.clickDocumentation();
        testDesignConsiderationsPage = documentationPage.navigateToTestDesignConsiderations();

        String actualHeading = testDesignConsiderationsPage.getTextHeadingPageObjectDesignPattern();
        System.out.println(actualHeading);
        String expectedHeading = "Page Object Design Pattern";
        assertEquals(expectedHeading, actualHeading);
    }
}
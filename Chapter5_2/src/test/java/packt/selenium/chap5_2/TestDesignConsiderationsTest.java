package packt.selenium.chap5_2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import packt.selenium.chap5_2.pageobjects.Documentation;
import packt.selenium.chap5_2.pageobjects.SeleniumHQ;
import packt.selenium.chap5_2.pageobjects.TestDesignConsiderations;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestDesignConsiderationsTest {
    private WebDriver driver;
    private SeleniumHQ seleniumHQ;
    private Documentation documentationPage;
    private TestDesignConsiderations testDesignConsiderationsPage;

    @Before
    public void setUp() throws Exception {
        //driver = new FirefoxDriver();
        //URL url = new URL("http://localhost:4444/wd/hub");
        URL url = new URL("http://akshaymittal143:f98e95a8-8d39-43f8-99a5-59f77b65e24c@ondemand.saucelabs.com:80/wd/hub");
        Capabilities capabilities = DesiredCapabilities.firefox();
        driver = new RemoteWebDriver(url, capabilities);

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
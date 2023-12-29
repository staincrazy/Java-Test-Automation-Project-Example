package base_test;

import helpers.Credentials;
import org.openqa.selenium.WebDriver;
import resources.drivers.WebDriverSingleton;

public class BaseTest {

    protected WebDriver webDriver;

    protected Credentials credentials;

    public void initFirefoxDriver() {
        webDriver = WebDriverSingleton.getFireFoxDriverInstance();
    }

    public void initChromeDriver() throws Exception {
        this.webDriver = WebDriverSingleton.getChromeDriverInstance();
    }

    public void tearDown() {
        webDriver.quit();
    }
}

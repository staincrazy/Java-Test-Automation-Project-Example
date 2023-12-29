package base_test;

import org.openqa.selenium.WebDriver;
import resources.drivers.WebDriverSingleton;

public class BaseTest {

    protected WebDriver webDriver;

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

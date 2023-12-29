package resources.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverSingleton {
    private static WebDriver driver;

    public static WebDriver getChromeDriverInstance() throws Exception {

        throw new Exception("Chromedriver needs to be setup with executable binary");

//        if (!(driver instanceof ChromeDriver)) {
//
//            driver = new ChromeDriver();
//            driver.manage().window().maximize();
//        }
//        return driver;
    }

    public static WebDriver getFireFoxDriverInstance() {
        if (!(driver instanceof FirefoxDriver)) {

            driver = new FirefoxDriver();
            driver.manage().window().maximize();
        }
        return driver;
    }

}
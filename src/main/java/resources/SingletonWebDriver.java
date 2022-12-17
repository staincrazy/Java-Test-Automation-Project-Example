package resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SingletonWebDriver {
    private static WebDriver driver;

    public static WebDriver getChromeDriverInstance(){
        if(driver == null){
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static WebDriver getSafariDriverInstance(){
        if(driver==null){
            driver = new SafariDriver();
            driver.manage().window().maximize();
        }
        return driver;

    }

    public static WebDriver getFireFoxDriverInstance(){
        if(driver==null){
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
        }
        return driver;
    }

}
package resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingletonWebDriver {
    private static WebDriver driver;

    public static WebDriver getInstance(){
        if(driver == null){
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        return driver;

    }

}
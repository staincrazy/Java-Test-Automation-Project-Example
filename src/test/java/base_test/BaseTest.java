package base_test;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import resources.SingletonWebDriver;

public class BaseTest {

    public WebDriver driver = SingletonWebDriver.getChromeDriverInstance();

    @BeforeClass
    public void initDriver(){
        if(driver==null){
            driver = SingletonWebDriver.getChromeDriverInstance();
        }
   }

    @AfterClass
    public void tearDown(){
        driver.close();
    }
}

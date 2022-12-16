package base_test;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import resources.SingletonWebDriver;

public class BaseTest {

    public WebDriver driver = SingletonWebDriver.getInstance();

    @BeforeClass
    public void initDriver(){
        if(driver==null){
            driver = SingletonWebDriver.getInstance();
        }
   }

    @AfterClass
    public void tearDown(){
        driver.close();
    }
}

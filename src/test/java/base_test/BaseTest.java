package base_test;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import random_web_pages.GoogleSearchPage;
import random_web_pages.YahooSearchPage;
import resources.SingletonWebDriver;
import workflows.Actions;
import workflows.Assertions;

public class BaseTest {

    GoogleSearchPage googleSearchPage;
    YahooSearchPage yahooSearchPage;

    Actions actions;
    Assertions assertions;

    public static WebDriver driver = SingletonWebDriver.getInstance();

    @BeforeClass
    public void initDriver(){
        if(driver==null){
            driver = SingletonWebDriver.getInstance();
            actions = new Actions(driver);
            assertions = new Assertions(driver);
        }
    }
    @Test
    public void googleSearchTestOne(){
        googleSearchPage = new GoogleSearchPage(driver);
        googleSearchPage.navigateToGoogle();
        googleSearchPage.performSearch("Hello world");
    }
    @Test
    public void googleSearchTestTwo(){

        googleSearchPage = new GoogleSearchPage(driver);
        googleSearchPage.navigateToGoogle();
        googleSearchPage.performSearch("Why Java is so bad?");
   }
    @Test
    public void yahooSearchTest(){

        yahooSearchPage = new YahooSearchPage(driver);
        yahooSearchPage.navigateToYahoo();
        yahooSearchPage.performSearch("Hello world");
    }

    @AfterClass
    public void tearDown(){
        driver.close();
    }
}

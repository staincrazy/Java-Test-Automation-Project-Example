package oktopost_publishing_app_tests;

import oktopost_pages.OktopostAppDashboardPage;
import oktopost_pages.OktopostAppLoginPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import base_test.BaseTest;
import resources.SingletonWebDriver;
import workflows.Actions;
import workflows.Assertions;

public class LoginTest extends BaseTest {

    Actions actions = new Actions(driver);
    Assertions assertions = new Assertions(driver);
    OktopostAppLoginPage oktopostAppLoginPage = new OktopostAppLoginPage(driver);
    OktopostAppDashboardPage oktopostAppDashboardPage = new OktopostAppDashboardPage(driver);


    @BeforeTest(alwaysRun = true)
    public void initTest(){
        if(driver==null){
            driver= SingletonWebDriver.getSafariDriverInstance();
        }
    }

    @AfterTest(alwaysRun = true)
    public void tearDownTest(){
        driver.quit();

    }


    @Test(priority = 0)
    public void loginTest(){

        actions.navigate(OktopostAppLoginPage.appUrl);
        oktopostAppLoginPage.loginToOktopostApp("reanold@oktopost.com", "Reanold_123");
        assert oktopostAppDashboardPage.assertPageTitleEquals();

    }

    @Test(priority = 1)
    public void loginTestIncorrectCredentials(){

        actions.navigate(OktopostAppLoginPage.appUrl);
        oktopostAppLoginPage.loginToOktopostApp("random+user@oktopost.com","EmptyPwd123");
        assert oktopostAppLoginPage.isErrorMessageDisplayed();

    }


}

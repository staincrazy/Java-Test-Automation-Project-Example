package oktopost_publishing_app_tests;

import oktopost_pages.DashboardPage;
import oktopost_pages.LoginPage;
import org.testng.annotations.Test;
import base_test.BaseTest;
import utils.GetCredentials;
import workflows.Actions;
import workflows.Assertions;

public class LoginTest extends BaseTest {

    Actions actions = new Actions(driver);
    Assertions assertions = new Assertions(driver);
    LoginPage oktopostAppLoginPage = new LoginPage(driver);
    DashboardPage oktopostAppDashboardPage = new DashboardPage(driver);


    @Test(priority = 1)
    public void loginTest(){
        GetCredentials credentials = new GetCredentials("src/main/java/test_data/default_app_user_credentials");
        String userLogin = credentials.getProperty("Username");
        String userPassword = credentials.getProperty("Password");
        actions.navigate(LoginPage.appUrl);
        oktopostAppLoginPage.loginToOktopostApp(userLogin, userPassword);
        assert oktopostAppDashboardPage.assertPageTitleEquals();

    }

    @Test(priority = 0)
    public void loginTestIncorrectCredentials(){

        actions.navigate(LoginPage.appUrl);
        oktopostAppLoginPage.loginToOktopostApp("random+user@oktopost.com","EmptyPwd123");
        assert oktopostAppLoginPage.isErrorMessageDisplayed();

    }


}

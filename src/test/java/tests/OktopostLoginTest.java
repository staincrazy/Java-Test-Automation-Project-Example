package tests;

import oktopost_pages.OktopostAppDashboardPage;
import oktopost_pages.OktopostAppLoginPage;
import org.testng.annotations.Test;
import selenium.BaseTest;
import workflows.Actions;
import workflows.Assertions;

public class OktopostLoginTest extends BaseTest {

    Actions actions = new Actions(driver);
    Assertions assertions = new Assertions(driver);
    OktopostAppLoginPage oktopostAppLoginPage = new OktopostAppLoginPage(driver);
    OktopostAppDashboardPage oktopostAppDashboardPage = new OktopostAppDashboardPage(driver);

    @Test(priority = 0)
    public void loginTest(){

        actions.navigate(OktopostAppLoginPage.appUrl);
        oktopostAppLoginPage.loginToOktopostApp("reanold@oktopost.com", "Reanold_123");
        assert assertions.assertPageTitleIs(OktopostAppDashboardPage.pageTitle);

    }

    @Test(priority = 1)
    public void navigateToCalendar(){


    }
}

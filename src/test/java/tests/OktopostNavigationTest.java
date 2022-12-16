package tests;

import oktopost_pages.NavigationBar;
import oktopost_pages.OktopostAppDashboardPage;
import oktopost_pages.OktopostAppLoginPage;
import org.testng.annotations.Test;
import base_test.BaseTest;
import workflows.Actions;
import workflows.Assertions;

public class OktopostNavigationTest extends BaseTest {

    Actions actions = new Actions(driver);
    Assertions assertions = new Assertions(driver);

    NavigationBar navigationBar = new NavigationBar(driver);
    OktopostAppLoginPage oktopostAppLoginPage = new OktopostAppLoginPage(driver);


    @Test
    public void navigateToStreams(){
        actions.navigate(OktopostAppLoginPage.appUrl);
        oktopostAppLoginPage.loginToOktopostApp("reanold@oktopost.com", "Reanold_123");
        assert assertions.assertPageTitleIs(OktopostAppDashboardPage.pageTitle);
        navigationBar.getToSection(NavigationBar.streams);
        assert assertions.assertPageTitleIs("New Tab - Streams | Oktopost");
    }
}

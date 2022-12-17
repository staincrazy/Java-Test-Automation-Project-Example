package oktopost_publishing_app_tests;

import base_test.BaseTest;
import oktopost_pages.NavigationBar;
import oktopost_pages.OktopostAppDashboardPage;
import oktopost_pages.OktopostAppLoginPage;
import org.testng.annotations.Test;
import workflows.Actions;
import workflows.Assertions;
import workflows.E2EWorkflows;

public class NavigationTest extends BaseTest {

    Actions actions = new Actions(driver);
    Assertions assertions = new Assertions(driver);
    NavigationBar navigationBar = new NavigationBar(driver);
    OktopostAppLoginPage oktopostAppLoginPage = new OktopostAppLoginPage(driver);

    E2EWorkflows authorizationWorkflows = new E2EWorkflows(driver);

    @Test
    public void navigateToStreams(){
        actions.navigate(OktopostAppLoginPage.appUrl);
        oktopostAppLoginPage.loginToOktopostApp("reanold@oktopost.com", "Reanold_123");
        assert assertions.assertPageTitleIs(OktopostAppDashboardPage.dashboardPageTitle);
        navigationBar.getToSection(NavigationBar.streams);
        assert assertions.assertPageTitleIs("New Tab - Streams | Oktopost");
    }

    @Test
    public void navigateToSettingsSection(){
        actions.navigate(OktopostAppLoginPage.appUrl);
        authorizationWorkflows.loginToAppWithDefaultUser();
        assert assertions.assertPageTitleIs(OktopostAppDashboardPage.dashboardPageTitle);
        navigationBar.navigateToSettings();
        assert assertions.assertPageTitleIs("Account - Settings | Oktopost");
    }
}

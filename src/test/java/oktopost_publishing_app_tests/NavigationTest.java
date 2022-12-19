package oktopost_publishing_app_tests;

import base_test.BaseTest;
import oktopost_pages.NavigationBar;
import oktopost_pages.DashboardPage;
import oktopost_pages.LoginPage;
import org.testng.annotations.Test;
import workflows.Actions;
import workflows.Assertions;
import workflows.E2EWorkflows;

public class NavigationTest extends BaseTest {

    Actions actions = new Actions(driver);
    Assertions assertions = new Assertions(driver);
    NavigationBar navigationBar = new NavigationBar(driver);
    LoginPage oktopostAppLoginPage = new LoginPage(driver);
    E2EWorkflows e2EWorkflows = new E2EWorkflows(driver);

    @Test
    public void navigateToStreams(){
        actions.navigate(LoginPage.appUrl);
        oktopostAppLoginPage.loginToOktopostApp("reanold@oktopost.com", "Reanold_123");
        assert assertions.isPageTitle(DashboardPage.dashboardPageTitle);
        navigationBar.getToSection(NavigationBar.streams);
        assert assertions.isPageTitle("New Tab - Streams | Oktopost");
    }

    @Test
    public void navigateToSettingsSection(){
        actions.navigate(LoginPage.appUrl);
        e2EWorkflows.loginToAppWithDefaultUser();
        assert assertions.isPageTitle(DashboardPage.dashboardPageTitle);
        navigationBar.navigateToSettings();
        assert assertions.isPageTitle("Account - Settings | Oktopost");
    }
}

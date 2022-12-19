package oktopost_publishing_app_tests.e2e_tests;

import base_test.BaseTest;
import oktopost_pages.NavigationBar;
import oktopost_pages.LoginPage;
import org.testng.annotations.Test;
import workflows.Actions;
import workflows.Assertions;
import workflows.E2EWorkflows;

public class EndToEndTests extends BaseTest {

    Actions actions = new Actions(driver);
    Assertions assertions = new Assertions(driver);
    E2EWorkflows e2EWorkflows = new E2EWorkflows(driver);
    NavigationBar navigationBar = new NavigationBar(driver);

    @Test
    public void connectFaceBookProfile(){

        actions.navigate(LoginPage.appUrl);
        e2EWorkflows.loginToAppWithDefaultUser();
        assert assertions.isLoggedInToApp();
        navigationBar.getToSection(NavigationBar.userAvatarIcon);
        navigationBar.getToSection(NavigationBar.userMenuSettingsButton);


    }

}

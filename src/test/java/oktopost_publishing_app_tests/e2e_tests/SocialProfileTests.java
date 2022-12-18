package oktopost_publishing_app_tests.e2e_tests;

import base_test.BaseTest;
import network_pages.TikTokPage;
import oktopost_pages.LoginPage;
import oktopost_pages.NavigationBar;
import oktopost_pages.SocialProfilesPage;
import org.testng.annotations.Test;
import utils.GetCredentials;
import workflows.Actions;
import workflows.Assertions;
import workflows.E2EWorkflows;

public class SocialProfileTests extends BaseTest {

    private SocialProfilesPage socialProfilesPage = new SocialProfilesPage(driver);
    private NavigationBar navigationBar = new NavigationBar(driver);
    private E2EWorkflows workflows = new E2EWorkflows(driver);
    private TikTokPage tikTokPage = new TikTokPage(driver);
    Assertions assertions = new Assertions(driver);
    Actions actions = new Actions(driver);

    @Test
    public void connectTikTikProfileTest(){

        GetCredentials credentials = new GetCredentials("src/main/java/test_data/tik_tok_user_credentials");
        String loginTikTok = credentials.getProperty("Username");
        String passwordTikTok = credentials.getProperty("Password");

        actions.navigate(LoginPage.appUrl);
        workflows.loginToAppWithDefaultUser();
        assert assertions.isLoggedInApp();
        navigationBar.navigateToSocialProfiles();
        socialProfilesPage.connectNewTikTokProfile();
        tikTokPage.loginToTikTok(loginTikTok, passwordTikTok);




    }


}

package oktopost_publishing_app_tests.e2e_tests;

import base_test.BaseTest;
import network_pages.LinkedInPage;
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
    private LinkedInPage linkedInPage = new LinkedInPage(driver);

    private GetCredentials credentials;
    Assertions assertions = new Assertions(driver);
    Actions actions = new Actions(driver);

    @Test
    public void connectTikTikProfileTest(){

        credentials = new GetCredentials("src/main/java/test_data/tik_tok_user_credentials");
        String loginTikTok = credentials.getProperty("Username");
        String passwordTikTok = credentials.getProperty("Password");

        actions.navigate(LoginPage.appUrl);
        workflows.loginToAppWithDefaultUser();
        assert assertions.isLoggedInToApp();
        navigationBar.navigateToSocialProfiles();
        socialProfilesPage.connectNewTikTokProfile();
        tikTokPage.loginToTikTok(loginTikTok, passwordTikTok);

    }

    @Test
    public void connectLinkedInProfileTest(){
        credentials = new GetCredentials("src/main/java/test_data/linkedin_user_credentials");
        String loginLinkedIn = credentials.getProperty("Username");
        String passwordLinkedIn = credentials.getProperty("Password");

        actions.navigate(LoginPage.appUrl);
        workflows.loginToAppWithDefaultUser();
        assert assertions.isLoggedInToApp();
        navigationBar.navigateToSocialProfiles();
        socialProfilesPage.connectNewLinkedInProfile();
        linkedInPage.loginToLinkedIn(loginLinkedIn, passwordLinkedIn);

    }

}

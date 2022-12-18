package workflows;

import oktopost_pages.NavigationBar;
import oktopost_pages.LoginPage;
import org.openqa.selenium.WebDriver;
import utils.GetCredentials;

public class E2EWorkflows {

    WebDriver driver;

    public E2EWorkflows(WebDriver driver){
        this.driver = driver;
    }

    public void loginToAppWithDefaultUser() {
        GetCredentials credentials = new GetCredentials("src/main/java/test_data/default_app_user_credentials");
        String userLogin = credentials.getProperty("Username");
        String userPassword = credentials.getProperty("Password");
        LoginPage appLoginPage = new LoginPage(driver);
        appLoginPage.loginToOktopostApp(userLogin, userPassword);

    }

    public void navigateToSocialProfilesSection(){
        NavigationBar navigationBar = new NavigationBar(driver);
        navigationBar.navigateToSettings();

    }
}

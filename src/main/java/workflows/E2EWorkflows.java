package workflows;

import oktopost_pages.NavigationBar;
import oktopost_pages.OktopostAppLoginPage;
import org.openqa.selenium.WebDriver;

public class E2EWorkflows {

    WebDriver driver;

    public E2EWorkflows(WebDriver driver){
        this.driver = driver;
    }

    public void loginToAppWithDefaultUser() {
        OktopostAppLoginPage appLoginPage = new OktopostAppLoginPage(driver);
        appLoginPage.loginToOktopostApp("reanold@oktopost.com", "Reanold_123");
    }

    public void navigateToSocialProfilesSection(){
        NavigationBar navigationBar = new NavigationBar(driver);
        navigationBar.navigateToSettings();

    }
}

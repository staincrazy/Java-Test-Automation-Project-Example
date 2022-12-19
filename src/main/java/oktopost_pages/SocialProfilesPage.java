package oktopost_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import workflows.Actions;

public class SocialProfilesPage {

    Actions actions;
    WebDriver driver;

    By connectFirstProfileButtonSelector = By.xpath(".//*[contains(text(),'Connect your first profile')]");
    By connectProfileButtonSelector = By.cssSelector("button[class='lobster-button']");
    By tiktokNetworkButtonSelector = By.xpath(".//*[contains(text(),'TikTok Business')]");
    By linkedInProfileButtonSelector = By.xpath(".//*[contains(text(),'LinkedIn Profile')]");

    By authenticationEmailField = By.cssSelector("input[name='NetworkAuthEmail']");
    By profileSettingsSaveButton = By.xpath(".//*[contains(text(),'Save')]");

    public SocialProfilesPage(WebDriver driver){
        this.driver = driver;
        actions = new Actions(driver);
    }


    public void connectNewTikTokProfile(){


        actions.clickOnFirstAvailableElement(connectFirstProfileButtonSelector, connectProfileButtonSelector);
        driver.findElement(tiktokNetworkButtonSelector).click();
    }

    public void connectNewLinkedInProfile(){

        actions.clickOnFirstAvailableElement(connectProfileButtonSelector, connectFirstProfileButtonSelector);
        actions.clickOnElement(linkedInProfileButtonSelector);
    }

    public void editProfileSettings(){

        actions.inputTextInField(authenticationEmailField, "test+email@oktopost.com");
        actions.clickOnElement(profileSettingsSaveButton);
    }

}

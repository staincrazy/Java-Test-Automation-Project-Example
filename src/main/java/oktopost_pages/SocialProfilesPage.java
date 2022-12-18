package oktopost_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import workflows.Actions;

public class SocialProfilesPage {

    Actions actions;
    WebDriver driver;

    By connectFirstProfileButtonSelector = By.xpath(".//*[contains(text(),'Connect your first profile')]");
    By connectProfileButtonSelector = By.xpath(".//*[contains(text(),'Connect a Profile')]");
    By tiktokNetworkButtonSelector = By.xpath(".//*[contains(text(),'TikTok Business')]");

    public SocialProfilesPage(WebDriver driver){
        this.driver = driver;
    }


    public void connectNewTikTokProfile(){

        actions = new Actions(driver);
        actions.clickOnFirstAvailableElement(connectFirstProfileButtonSelector, connectProfileButtonSelector);
        driver.findElement(tiktokNetworkButtonSelector).click();
    }

}
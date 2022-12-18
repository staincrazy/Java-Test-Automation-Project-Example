package oktopost_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SocialProfilesPage {

    WebDriver driver;

    By connectFirstProfileButtonSelector = By.xpath(".//*[contains(text(),'Connect your first profile')]");
    By connectProfileButtonSelector = By.xpath(".//*[contains(text(),'Connect a Profile')]");

    By tiktokNetworkButtonSelector = By.xpath(".//*[contains(text(),'TikTok Business')]");

    public SocialProfilesPage(WebDriver driver){
        this.driver = driver;
    }

}

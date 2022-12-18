package network_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TikTokPage {

    WebDriver driver;

    By useEmailButtonSelector = By.xpath(".//*[contains(text(),'Use phone / email / username')]");
    By loginWithEmailButtonSelector = By.xpath(".//a[@href='/login/phone-or-email/email']");
    By emailFieldSelector = By.xpath(".//*[@placeholder='Email or username']");
    By passwordFieldSelector = By.xpath(".//*[@placeholder='Password']");
    By loginButtonSelector = By.xpath(".//button[contains(text(),'Log in')]");
    By confirmButtonSelector = By.xpath(".//button[@id='auth-btn']");

    public TikTokPage(WebDriver driver){
        this.driver = driver;
    }

    public void loginToNetwork(String userLogin, String userPassword){
        driver.findElement(useEmailButtonSelector).click();
        driver.findElement(loginWithEmailButtonSelector).click();
        driver.findElement(emailFieldSelector).sendKeys(userLogin);
        driver.findElement(passwordFieldSelector).sendKeys(userPassword);
        driver.findElement(loginButtonSelector).click();
        driver.findElement(confirmButtonSelector).click();

    }
}

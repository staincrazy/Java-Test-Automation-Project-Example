package oktopost_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class OktopostAppLoginPage {
    public static String appUrl = "https://app.oktopost.com";

    WebDriver driver;


    By loginField = By.xpath(".//input[@placeholder='name@company.com']");
    By passwordField = By.xpath(".//input[@placeholder='Password']");
    By submitButton = By.xpath(".//*[contains(text(),'Sign in')]");


    public OktopostAppLoginPage(WebDriver driver) {
        this.driver = driver;
    }


    public void loginToOktopostApp(String userLogin, String userPassword) {
        try {
            driver.findElement(loginField).sendKeys(userLogin);
            driver.findElement(passwordField).sendKeys(userPassword);
            driver.findElement(submitButton).click();

        } catch (Exception e) {
            System.out.println("Cannot perform action, this exception occurs " + e);
        }
    }

}

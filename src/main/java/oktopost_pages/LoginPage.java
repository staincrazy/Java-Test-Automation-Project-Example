package oktopost_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import workflows.Assertions;


public class LoginPage {
    public static String appUrl = "https://app.oktopost.com";
    Assertions assertions;
    WebDriver driver;
    By incorrectCredentialsErrorMessage =
            By.xpath(".//*[contains(text(),'Please check your email and password')]");

    By loginField = By.xpath(".//input[@placeholder='name@company.com']");
    By passwordField = By.xpath(".//input[@placeholder='Password']");
    By submitButton = By.xpath(".//*[contains(text(),'Sign in')]");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        assertions = new Assertions(driver);
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

    public boolean isErrorMessageDisplayed(){
        return assertions.isDisplayed(incorrectCredentialsErrorMessage);

    }


}

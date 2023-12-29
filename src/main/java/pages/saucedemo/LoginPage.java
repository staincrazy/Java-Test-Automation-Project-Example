package pages.saucedemo;

import org.openqa.selenium.By;
import pages.AbstractWebPage;

public class LoginPage extends AbstractWebPage {

    private String usernameFieldXPATH = ".//input[@placeholder='Username']";
    private String passwordFieldXPATH = ".//input[@placeholder='Password']";
    private String loginButtonXPATH = ".//input[@value='Login']";

    public void setDefaultPageURL() {
        this.setPageUrl("https://www.saucedemo.com/");

    }

    public void inputUsername(String username) {
        this.webDriver.findElement(By.xpath(usernameFieldXPATH)).sendKeys(username);
    }

    public void inputPassword(String password) {
        this.webDriver.findElement(By.xpath(passwordFieldXPATH)).sendKeys(password);
    }

    public void clickOnLoginButton() {
        this.webDriver.findElement(By.xpath(loginButtonXPATH)).click();
    }
}

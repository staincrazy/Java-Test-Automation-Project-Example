package network_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinkedInPage {

    WebDriver driver;

    By loginFieldSelector = By.xpath(".//input[@id='username']");
    By passwordFieldSelector = By.xpath(".//input[@id='password']");
    By signInButtonSelector = By.xpath(".//button[@type='submit']");

    By allowConnectionButtonSelector = By.xpath(".//button[text()='Allow']");

    public LinkedInPage (WebDriver driver){
        this.driver = driver;
    }

    public void loginToLinkedIn(String login, String password){
        driver.findElement(loginFieldSelector).sendKeys(login);
        driver.findElement(passwordFieldSelector).sendKeys(password);
        driver.findElement(signInButtonSelector).click();

        try{
            driver.findElement(allowConnectionButtonSelector).click();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}

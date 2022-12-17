package oktopost_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationBar {

    WebDriver driver;

    public static By dashboard = By.xpath(".//a[@data-menu='dashboard']");
    public static By publishing = By.xpath(".//a[@data-menu='publishing']");
    public static By streams = By.xpath(".//a[@data-menu='streams']");
    public static By inbox = By.xpath(".//a[@data-menu='engagement']");
    public static By listening = By.xpath(".//a[@data-menu='social-listening']");
    public static By advocacy = By.xpath(".//a[@data-menu='advocacy']");
    public static By socialBi = By.xpath(".//a[@data-menu='social-bi']");
    public static By peopleDataBase = By.xpath(".//a[@data-menu='pdb']");

    public static By userAvatarIcon = By.xpath(".//button/img[@alt='user avatar']");
    public static By userMenuSettingsButton = By.xpath(".//a[@href='/setup/account']");

    public NavigationBar(WebDriver driver){
        this.driver = driver;
    }

    public void getToSection(By sectionName){
        driver.findElement(sectionName).click();
    }

    public void navigateToSettings(){
        driver.findElement(userAvatarIcon).click();
        driver.findElement(userMenuSettingsButton).click();

    }



}

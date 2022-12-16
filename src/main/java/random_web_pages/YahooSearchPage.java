package random_web_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YahooSearchPage {

    String yahooUrl = "https://yahoo.com";

    WebDriver driver;
    By searchField = By.xpath(".//input[@name='p']");
    By searchButton = By.xpath(".//button[@type='submit']");

    public YahooSearchPage(WebDriver driver){
        this.driver = driver;
    }

    public void navigateToYahoo(){
        driver.get(yahooUrl);
    }

    public void performSearch(String query){
        try{
            WebElement field = driver.findElement(searchField);
            field.sendKeys(query);
            WebElement button = driver.findElement(searchButton);
            button.click();

        }
        catch (Exception e){
            System.out.println("Cannot perform search due to error " + e + "\n");
        }

}
}

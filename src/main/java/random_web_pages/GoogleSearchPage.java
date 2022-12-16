package random_web_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GoogleSearchPage {

    String googleUrl = "https://google.com";
    WebDriver driver;
    By searchField = By.xpath(".//input[@name='q']");
    By searchButton = By.xpath(".//input[@value='Google Search']");

    public GoogleSearchPage(WebDriver driver){
        this.driver = driver;
    }

    public void navigateToGoogle(){
        driver.get(googleUrl);
    }

    public void performSearch(String query){
        try{
            WebElement search = driver.findElement(searchField);
            search.sendKeys(query);}
        catch (Exception e){
            System.out.println("Cannot find search field " + e);
        }
        try {
            List<WebElement> buttons = driver.findElements(searchButton);
            for(WebElement element : buttons){
                try{
                    element.click();
                    return;
                }
                catch (Exception e){
                    System.out.println("This exception occurs " + e);
                }
            }

        }
        catch (Exception e){
            System.out.println("Cannot find search button " + e);
        }
    }
}

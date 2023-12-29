package engine;

import pages.oktopost_pages.NavigationBar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Assertions {

    int defaultTimeout;
    WebDriver driver;
    String myException;

    public Assertions(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isPageTitle(String targetUrl) {
        for (defaultTimeout = 10000; defaultTimeout > 0; defaultTimeout -= 1) {
            if (driver.getTitle().equals(targetUrl)) {
                return true;
            }
        }
        System.out.println(driver.getTitle());
        return false;
    }

    public boolean isDisplayed(By element){

        for(defaultTimeout = 10000; defaultTimeout>0; defaultTimeout-=1){

            try{
               driver.findElement(element).isDisplayed();

               return true;
            }catch (Exception e){
                myException = e.getMessage();
            }
        }
        System.out.println(myException);
        return false;
    }

    public boolean isLoggedInToApp(){
        for(defaultTimeout=10000; defaultTimeout>0;defaultTimeout-=1){
            try {
                driver.findElement(NavigationBar.userAvatarIcon).isDisplayed();
                return true;
            }catch (Exception e){
                myException = e.getMessage();
            }
        }
        System.out.println(myException);
        return false;

    }
}
package oktopost_pages;

import org.openqa.selenium.WebDriver;

public class DashboardPage {

    WebDriver driver;

    int defaultTimeout;


    public static String dashboardPageTitle = "Dashboard | Oktopost";

    public DashboardPage(WebDriver driver) {
        this.driver = driver;

    }

    public boolean assertPageTitleEquals(){
        for(defaultTimeout=100000; defaultTimeout>0;defaultTimeout-=1){
            if(driver.getTitle().equals(dashboardPageTitle)){
                return true;
            }
        }return false;
    }


}



package oktopost_pages;

import org.openqa.selenium.WebDriver;

public class OktopostAppDashboardPage {

    WebDriver driver;

    int defaultTimeout;


    public static String dashboardPageTitle = "Dashboard | Oktopost";

    public OktopostAppDashboardPage(WebDriver driver) {
        this.driver = driver;

    }

    public boolean assertPageTitleEquals(){
        for(defaultTimeout=10000; defaultTimeout>0;defaultTimeout-=1){
            if(driver.getTitle().equals(dashboardPageTitle)){
                return true;
            }
        }return false;
    }


}



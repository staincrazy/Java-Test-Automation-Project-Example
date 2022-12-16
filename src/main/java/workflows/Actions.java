package workflows;

import com.beust.ah.A;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Actions {

    WebDriver driver;

    public Actions(WebDriver driver){
        this.driver = driver;
    }

    public void navigate(String url){
        if(url!=null){
            driver.get(url);
    }
    }

    public String getPageTitle(){
        return driver.getTitle();
    }

}

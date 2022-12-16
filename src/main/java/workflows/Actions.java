package workflows;

import org.openqa.selenium.WebDriver;

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


}

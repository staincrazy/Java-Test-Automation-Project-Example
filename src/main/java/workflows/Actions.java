package workflows;

import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class Actions {

    String exceptionText;

    WebDriver driver;

    public Actions(WebDriver driver){
        this.driver = driver;
    }

    public void navigate(String url){
        if(url!=null){
            driver.get(url);
        }
    }

    public void clickOnFirstAvailableElement(By @NotNull ...elements){
        for(By element: elements){
            try{
                driver.findElement(element).click();
                break;
            }catch (Exception e){
                exceptionText = e.getMessage();
            }
        }
        System.out.println(exceptionText);
    }


}

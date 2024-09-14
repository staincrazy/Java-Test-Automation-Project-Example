package engine;

import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Actions {

    String      exceptionText;
    int         defaultTimeout;
    WebDriver   driver;

    public Actions(WebDriver driver){
        this.driver = driver;
    }

    public void navigate(String url)
    {
        if (url != null)
        {
            driver.get(url);
        }
    }

    public void clickOnFirstAvailableElement(By @NotNull ...elements)
    {
        String defaultMessage = "Nothing found";

        for (By element: elements){
            try{
                clickOnElement(element);
                break;
            }catch (Exception e)
            {
                if (!e.getMessage().isEmpty())
                {
                    exceptionText = e.getMessage();
                }
                else {
                    exceptionText = defaultMessage;
                }

            }
        }

        System.out.println(exceptionText);
    }

    public void clickOnElement(By selector){
        for (defaultTimeout = 10000; defaultTimeout>0; defaultTimeout-=1){
            try {
                driver.findElement(selector).click();
                break;
            } catch (Exception e){
                exceptionText = e.getMessage();
            }
        }
        System.out.println(exceptionText);
    }

    public void inputTextInField(By selector, String inputText){
        for(defaultTimeout = 10000; defaultTimeout > 0; defaultTimeout -= 1){
            try{
                driver.findElement(selector).clear();
                driver.findElement(selector).sendKeys(inputText);
                break;
            }catch (Exception e){
                exceptionText = e.getMessage();
            }
        }
    }

}

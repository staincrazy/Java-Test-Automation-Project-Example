package engine.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import resources.drivers.WebDriverSingleton;

public abstract class AbstractBrowserActions
{
    public WebDriver webDriver()
    {
        return WebDriverSingleton.getFireFoxDriverInstance();
    }
}

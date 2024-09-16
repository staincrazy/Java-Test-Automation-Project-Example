package engine.actions;

import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.WebElement;

public class InputTextActions extends AbstractBrowserActions
{
    public void inputText(@NotNull WebElement element, String text)
    {
        element.sendKeys(text);
    }
}

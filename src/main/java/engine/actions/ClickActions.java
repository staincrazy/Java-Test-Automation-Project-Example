package engine.actions;

import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;

public class ClickActions extends AbstractBrowserActions
{

    public void click(By element)
    {
        this.webDriver().findElement(element).click();
    }

    public void multipleClicks(By...elements)
    {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void clickOnFirstElement(By @NotNull ...elements)
    {
        for (By element: elements)
        {
            try
            {
                this.webDriver().findElement(element).click();
                break;
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}


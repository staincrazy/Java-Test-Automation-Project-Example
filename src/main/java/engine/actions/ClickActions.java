package engine.actions;

import org.openqa.selenium.By;

public class ClickActions extends AbstractBrowserActions
{

    public void performSingleClick(By element)
    {
        this.webDriver().findElement(element).click();
    }

    public void performMultipleClicks(By...elements)
    {

    }

    public void clickOnFirstElement(By...elements)
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


package engine.actions;

public class NavigateActions extends AbstractBrowserActions
{

    public void navigate(String url)
    {
        this.webDriver().manage().window().maximize();
        this.webDriver().get(url);
    }

}


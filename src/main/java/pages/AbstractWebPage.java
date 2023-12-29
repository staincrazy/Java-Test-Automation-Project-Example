package pages;

import org.openqa.selenium.WebDriver;

public class AbstractWebPage {
    protected String pageUrl;

    protected WebDriver webDriver;

    public String getPageUrl() {
        return this.pageUrl;
    }
    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }
    public void setWebDriver(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    public WebDriver getWebdriver() {
        return this.webDriver;
    }

    public void navigate() {
        this.webDriver.get(this.pageUrl);
    }
}

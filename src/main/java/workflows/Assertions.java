package workflows;

import org.openqa.selenium.WebDriver;

public class Assertions {

    int defaultTimeout;
    WebDriver driver;

    public Assertions(WebDriver driver) {
        this.driver = driver;
    }

    public boolean assertPageTitleIs(String targetUrl) {
        for (defaultTimeout = 1000; defaultTimeout > 0; defaultTimeout -= 1) {
            System.out.println(defaultTimeout);
            if (driver.getTitle().equals(targetUrl)) {
                return true;
            }
        }
        return false;
    }
}
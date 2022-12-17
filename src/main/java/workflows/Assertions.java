package workflows;

import org.openqa.selenium.WebDriver;

public class Assertions {

    int defaultTimeout;
    WebDriver driver;

    public Assertions(WebDriver driver) {
        this.driver = driver;
    }

    public boolean assertPageTitleIs(String targetUrl) {
        for (defaultTimeout = 10000; defaultTimeout > 0; defaultTimeout -= 1) {
            if (driver.getTitle().equals(targetUrl)) {
                return true;
            }
        }
        System.out.println(driver.getTitle());
        return false;
    }
}
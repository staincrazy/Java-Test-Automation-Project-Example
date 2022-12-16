package selenide;

import static com.codeborne.selenide.Selenide.*;

import org.junit.Test;
import org.openqa.selenium.By;

import java.util.Objects;

public class SimpleSelenide {
    int defaultTimeout;

    @Test
    public void seleniumAutomation() {

        open("https://app.oktopost.com");
        $(By.xpath(".//input[@placeholder='name@company.com']")).
                sendKeys("reanold@oktopost.com");
        $(By.xpath(".//input[@placeholder='Password']"))
                .sendKeys("Reanold_123");
        $(By.xpath(".//*[contains(text(),'Sign in')]")).click();

        for (defaultTimeout = 10000; defaultTimeout > 0; defaultTimeout -= 1) {

            if (Objects.equals(title(), "Dashboard | Oktopost")) {
                System.out.println(defaultTimeout);
                return;
            }

        }

    }
}

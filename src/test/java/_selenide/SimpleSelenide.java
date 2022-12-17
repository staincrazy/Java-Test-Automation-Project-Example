package _selenide;

import static com.codeborne.selenide.Selenide.*;

import org.junit.Test;
import org.openqa.selenium.By;
import utils.GetCredentials;

import java.util.Objects;

public class SimpleSelenide {
    int defaultTimeout;

    GetCredentials credentials = new GetCredentials("src/main/java/test_data/default_app_user_credentials");

    @Test
    public void seleniumAutomation() {

        String userLogin = credentials.getProperty("Username");
        String userPassword = credentials.getProperty("Password");

        open("https://app.oktopost.com");
        $(By.xpath(".//input[@placeholder='name@company.com']")).
                sendKeys(userLogin);
        $(By.xpath(".//input[@placeholder='Password']"))
                .sendKeys(userPassword);
        $(By.xpath(".//*[contains(text(),'Sign in')]")).click();

        for (defaultTimeout = 10000; defaultTimeout > 0; defaultTimeout -= 1) {

            if (Objects.equals(title(), "Dashboard | Oktopost")) {
                System.out.println(defaultTimeout);
                return;
            }

        }

    }
}

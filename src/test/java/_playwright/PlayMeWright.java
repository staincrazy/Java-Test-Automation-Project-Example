package _playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.testng.annotations.Test;

public class PlayMeWright {

    @Test
    public void initClass(){
        try(Playwright playwright = Playwright.create()){
            BrowserType firefox = playwright.firefox();
            Browser browser = firefox.launch();
            Page page = browser.newPage();
            page.navigate("https://google.com");


            browser.close();
        }

    }

}

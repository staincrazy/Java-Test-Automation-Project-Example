package selenide;

import static com.codeborne.selenide.Selenide.*;


import org.junit.Test;
import org.openqa.selenium.By;

public class SimpleSelenide {
    @Test
    public void seleniumAutomation(){
        System.out.println("Test passes");
        open("https://google.com");
        $(By.name("q")).sendKeys("Hello world");
        $(By.name("btnK")).click();


    }
}

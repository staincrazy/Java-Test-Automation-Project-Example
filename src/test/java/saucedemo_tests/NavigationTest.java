package saucedemo_tests;

import base_test.BaseTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.saucedemo.LoginPage;

public class NavigationTest extends BaseTest {

    private LoginPage loginPage;

    @BeforeTest
    public void setupTest() {

        this.initFirefoxDriver();
        this.loginPage = new LoginPage();
        this.loginPage.setDefaultPageURL();
        this.loginPage.setWebDriver(this.webDriver);
    }

    @AfterTest
    public void closeTest() {
        this.tearDown();
    }

    @Test
    public void navigationTest() {

        loginPage.navigate();

        assert this.webDriver.getTitle().equals("Swag Labs");

    }
}

package saucedemo_tests;

import base_test.BaseTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.saucedemo.LoginPage;

public class LoginTest extends BaseTest {

    private LoginPage loginPage;
    @BeforeTest
    public void initTest(){
        this.initFirefoxDriver();
        this.loginPage = new LoginPage();
        this.loginPage.setPageUrl("");
        this.loginPage.setWebDriver(this.webDriver);
    }
    @AfterTest
    public void closeTest(){
        this.tearDown();
    }
    @Test
    public void successfulLoginTest(){


        this.loginPage.navigate();

        this.loginPage.inputUsername("");
        this.loginPage.inputPassword("");

        this.loginPage.clickOnLoginButton();
    }

    @Test
    public void unsuccessfulLoginTest(){

    }

}

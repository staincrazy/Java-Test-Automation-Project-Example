package saucedemo_tests;

import base_test.BaseTest;
import helpers.Credentials;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.saucedemo.LoginPage;

public class LoginTest extends BaseTest {

    private LoginPage loginPage;

    private String username;
    private String password;

    private void setUser()
    {
        this.credentials = new Credentials("src/main/java/test_data/default_app_user_credentials");
        this.username = this.credentials.getCredential("Username");
        this.password = this.credentials.getCredential("Password");
    }
    @BeforeTest
    public void initTest(){
        this.setUser();
        this.initFirefoxDriver();
        this.loginPage = new LoginPage();
        this.loginPage.setDefaultPageURL();
        this.loginPage.setWebDriver(this.webDriver);
    }
    @AfterTest
    public void closeTest(){
        this.tearDown();
    }
    @Test
    public void successfulLoginTest(){


        this.loginPage.navigate();

        this.loginPage.inputUsername(this.username);
        this.loginPage.inputPassword(this.password);

        this.loginPage.clickOnLoginButton();
    }

    @Test
    public void unsuccessfulLoginTest(){

    }

}

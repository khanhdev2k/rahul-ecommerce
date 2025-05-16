package tests;

import core.BaseTest;
import enums.Locators;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.ElementActions;

public class LoginTest extends BaseTest {
    @Test

    public void testInvalidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.navigateToLoginPage();

        // Access page and input nickname
//
//        loginPage.login("khanhleduy99er@gmail.com", "wrongpassword");

        // Check login account
//
//        Assert.assertTrue(loginPage.isLoginFailed(), "Toast");

        // Register account
        loginPage.registerPage("Khanh", "Le", "khanhleduy99er@gmail.com", "duykhanh!23", "duykhanh!23", "0913618810", "Student");

    }
}
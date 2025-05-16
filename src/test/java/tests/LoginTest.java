package tests;

import core.BaseTest;
import pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void verifySuccessfulPageNavigation() {
        LoginPage loginPage = new LoginPage(driver);

        // Step 1: Navigate to login page
        loginPage.navigateToLoginPage();

        // Step 2: Verify page loaded successfully
        Assert.assertTrue(loginPage.isLoginPageLoaded(),
                "Login page did not load successfully");
    }
}
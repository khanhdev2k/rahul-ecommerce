package pages;

import enums.Locators;
import org.openqa.selenium.WebDriver;
import org.xml.sax.Locator;
import utils.ElementActions;

public class LoginPage {
    private final WebDriver driver;
    private final ElementActions elementActions;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.elementActions = new ElementActions(driver);
    }

    public void navigateToLoginPage() {
        driver.get("https://rahulshettyacademy.com/client");
    }

    public void login(String email, String password) {
        elementActions.type(Locators.LOGIN_EMAIL.get(), email);
        elementActions.type(Locators.LOGIN_PASSWORD.get(), password);
        elementActions.click(Locators.LOGIN_BUTTON.get());
    }

    public boolean isLoginFailed() {
        return elementActions.isToastVisible();
    }

    public void registerPage(String firstName, String lastName, String email, String password, String confirmPassword, String phoneNumber, String typePersonRegister) {
        elementActions.click(Locators.REGISTER_BTN.get());
        elementActions.type(Locators.FIRST_NAME.get(), firstName);
        elementActions.type(Locators.LAST_NAME.get(), lastName);
        elementActions.type(Locators.PHONE_NUMBER.get(), phoneNumber);
        elementActions.type(Locators.EMAIL.get(), email);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        elementActions.isSelected(Locators.MALE.get());

        elementActions.click(Locators.OCCUPATION.get());
        elementActions.selectedDropDownList(Locators.OCCUPATION.get(), typePersonRegister);
        elementActions.type(Locators.REGISTER_PASSWORD.get(), password);
        elementActions.type(Locators.REGISTER_CONFIRM_PASSWORD.get(), confirmPassword);

        elementActions.click(Locators.REGISTER_BTN.get());

        elementActions.click(Locators.REGISTER_BTN.get());
    }

    public String getErrorMessage() {
        return elementActions.getText(Locators.LOGIN_ERROR.get());
    }

    public boolean isLoginPageLoaded() {
        return elementActions.isDisplayed(Locators.LOGIN_EMAIL.get());
    }
}
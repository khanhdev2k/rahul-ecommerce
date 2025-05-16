package enums;

import org.openqa.selenium.By;

public enum Locators {
    // Login Page

    LOGIN_EMAIL(By.id("userEmail")),
    LOGIN_PASSWORD(By.id("userPassword")),
    LOGIN_BUTTON(By.id("login")),
    TOAST_CONTAINER(By.id("toast-container")),
    LOGIN_ERROR(By.cssSelector("ng-star-inserted")),
    REGISTER_BTN(By.cssSelector("p.login-wrapper-footer-text a")),

    // Register page
    FIRST_NAME(By.id("firstName")),
    LAST_NAME(By.id("lastName")),
    EMAIL(By.id("userEmail")),
    PHONE_NUMBER(By.id("userMobile")),
    OCCUPATION(By.xpath("//div[@class='form-group col-md-6']/select")),
    MALE(By.cssSelector("input[value^='Male']")),
    FEMALE(By.cssSelector("input[value^='Female']")),
    REGISTER_PASSWORD(By.id("userPassword")),
    REGISTER_CONFIRM_PASSWORD(By.id("confirmPassword")),
    ENOUGH_YEAR_OLD(By.cssSelector("input[type='checkbox']")),
    SUBMIT_REGISTER_BTN(By.cssSelector("#login")),

    // Dashboard Page
    DASHBOARD_HEADER(By.cssSelector(".heading")),
    SHOPPING_CART(By.cssSelector("[routerlink*='cart']")),
    CART_BADGE(By.cssSelector(".cart .badge"));

    private final By locator;

    Locators(By locator) {
        this.locator = locator;
    }

    public By get() {
        return locator;
    }
}
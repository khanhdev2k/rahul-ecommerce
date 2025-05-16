package utils;

import enums.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static enums.Locators.LOGIN_ERROR;

public class ElementActions {
    private final WaitUtils waitUtils; // Chỉ cần giữ WaitUtils

    public ElementActions(WebDriver driver) {
        this.waitUtils = new WaitUtils(driver); // Khởi tạo WaitUtils một lần
    }

    public void click(By locator) {
        waitUtils.waitForElementClickable(locator).click();
    }

    public void type(By locator, String text) {
        WebElement element = waitUtils.waitForElementVisible(locator);
        element.clear();
        element.sendKeys(text);
    }

    public void isSelected(By locator) {
        WebElement element = waitUtils.waitForElementVisible(locator);
        if(!element.isSelected()) {
            element.click();
        }else {
            System.out.println("Element is selected");
        }

    }

    public boolean isToastVisible() {
        try {
            return waitUtils.waitForElementVisible(Locators.TOAST_CONTAINER.get()).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void selectedDropDownList(By locator, String value) {
        WebElement element = waitUtils.waitForElementVisible(locator);
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }

    public String getText(By locator) {
        return waitUtils.waitForElementVisible(locator).getText();
    }

    public boolean isDisplayed(By locator) {
        try {
            return waitUtils.waitForElementVisible(locator).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShippingAppObject {
    private WebDriver driver;

    public ShippingAppObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getValidatePageLabel() {
        return driver.findElement(By.className("page-heading"));
    }

    public WebElement getValidatePriceDeliveryLabel() {
        return driver.findElement(By.className("delivery_option_price"));
    }

    public WebElement getTermsOfServiceCheckBox() {
        return driver.findElement(By.id("cgv"));
    }

    public WebElement getProceedToCheckoutButton() {
        return driver.findElement(By.cssSelector("button.button.btn.btn-default.standard-checkout.button-medium"));
    }
}

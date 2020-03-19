package tasks;

import appobjects.ShippingAppObject;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class ShippingTask {
    private WebDriver driver;
    private ShippingAppObject shippingAppObject;

    public ShippingTask(WebDriver driver) {
        this.driver = driver;
        this.shippingAppObject = new ShippingAppObject(driver);
    }

    public void validateShippingAndAdress() {
        Assertions.assertEquals("Order - My Store", driver.getTitle(), "Shipping: Tab page title is not correct");
        Assertions.assertEquals("SHIPPING", shippingAppObject.getValidatePageLabel().getText());
        Assertions.assertEquals("2.00", shippingAppObject.getValidatePriceDeliveryLabel().getText().replace("$",""));
    }

    public void checkBoxAndProceedToCheckout() {
        if (shippingAppObject.getTermsOfServiceCheckBox().isSelected()) {
            System.out.println("Checkbox was already selected: " + shippingAppObject.getTermsOfServiceCheckBox().toString());
        } else {
            shippingAppObject.getTermsOfServiceCheckBox().click();
        }
        shippingAppObject.getProceedToCheckoutButton().click();
    }
}
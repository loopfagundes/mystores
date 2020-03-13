package tasks;

import appobjects.AddressAppObject;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class AddressTask {
    private WebDriver driver;
    private AddressAppObject addressAppObject;

    public AddressTask(WebDriver driver) {
        this.driver = driver;
        this.addressAppObject = new AddressAppObject(driver);
    }

    public void reviewAdresses() {
        Assertions.assertEquals("Order - My Store", driver.getTitle());
        Assertions.assertEquals("ADDRESSES", addressAppObject.getValidatePageAddressLabel().getText());
        Assertions.assertEquals("YOUR DELIVERY ADDRESS", addressAppObject.getValidateDeliveryAndressLabel().getText());
        Assertions.assertEquals("Luciano Test", addressAppObject.getValidateFirstNameText().getText());
        Assertions.assertEquals("street", addressAppObject.getValidateAddressText().getText());
        Assertions.assertEquals("chinatown, New York 10033", addressAppObject.getValidateStatePostCodeText().getText());
        Assertions.assertEquals("United States", addressAppObject.getValidateCountryNameText().getText());
        Assertions.assertEquals("5199999999", addressAppObject.getValidatePhoneNumberText().getText());
        addressAppObject.getCommentTextField().sendKeys("I'am deaf...");
        addressAppObject.getProceedToCheckoutButton().click();
    }
}
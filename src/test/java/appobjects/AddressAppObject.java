package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddressAppObject {
    private WebDriver driver;

    public AddressAppObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getValidatePageAddressLabel() {
        return driver.findElement(By.className("page-heading"));
    }

    public WebElement getValidateDeliveryAndressLabel() {
        return driver.findElement(By.className("page-subheading"));
    }

    public WebElement getValidateFirstNameText() {
        return driver.findElement(By.cssSelector("#address_delivery > li.address_firstname.address_lastname"));
    }

    public WebElement getValidateAddressText() {
        return driver.findElement(By.cssSelector("#address_delivery > li.address_address1.address_address2"));
    }

    public WebElement getValidateStatePostCodeText() {
        return driver.findElement(By.cssSelector("#address_delivery > li.address_city.address_state_name.address_postcode"));
    }

    public WebElement getValidateCountryNameText() {
        return driver.findElement(By.cssSelector("#address_delivery > li.address_country_name"));
    }

    public WebElement getValidatePhoneNumberText() {
        return driver.findElement(By.cssSelector("#address_delivery > li.address_phone"));
    }

    public WebElement getCommentTextField() {
        return driver.findElement(By.className("form-control"));
    }

    public WebElement getProceedToCheckoutButton() {
        return driver.findElement(By.cssSelector("#center_column > form > p > button > span"));
    }
}
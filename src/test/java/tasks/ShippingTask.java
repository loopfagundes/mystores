package tasks;

import appobjects.ShippingAppObject;
import org.openqa.selenium.WebDriver;

public class ShippingTask {
    private WebDriver driver;
    private ShippingAppObject shippingAppObject;

    public ShippingTask(WebDriver driver) {
        this.driver = driver;
        this.shippingAppObject = new ShippingAppObject(driver);
    }

    public void validateShippingAndAdress() {
        System.out.println(shippingAppObject.getValidatePageLabel().getText());
    }
}

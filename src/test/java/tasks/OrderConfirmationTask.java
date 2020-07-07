package tasks;

import appobjects.OrderConfirmationAppObject;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class OrderConfirmationTask {
    private WebDriver driver;
    private OrderConfirmationAppObject orderConfirmationAppObject;

    public OrderConfirmationTask(WebDriver driver) {
        this.driver = driver;
        this.orderConfirmationAppObject = new OrderConfirmationAppObject(driver);
    }

    public void validateOrder() {
        Assertions.assertEquals("Order confirmation - My Store", driver.getTitle(), "OrderConfirmation: Tab page title is not correct");
        Assertions.assertEquals("ORDER CONFIRMATION", orderConfirmationAppObject.getValidatePageLabel().getText());
        Assertions.assertEquals("Your order on My Store is complete.", orderConfirmationAppObject.getValidateMyStoreCompleteLabel().getText());
    }
}
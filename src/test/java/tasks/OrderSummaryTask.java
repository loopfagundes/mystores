package tasks;

import appobjects.OrderSummaryAppObject;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class OrderSummaryTask {
    private WebDriver driver;
    private OrderSummaryAppObject orderSummaryAppObject;

    public OrderSummaryTask(WebDriver driver) {
        this.driver = driver;
        this.orderSummaryAppObject = new OrderSummaryAppObject(driver);
    }

    public void reviewOrderSummary() {
        Assertions.assertEquals("My Store", driver.getTitle(), "OrderSummary: Tab page title is not correct");
        Assertions.assertEquals("ORDER SUMMARY", orderSummaryAppObject.getValidatePageLabel().getText());
        orderSummaryAppObject.getConfirmButton().click();
    }
}
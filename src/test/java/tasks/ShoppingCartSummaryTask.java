package tasks;

import appobjects.ShoppingCartSummaryAppObject;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class ShoppingCartSummaryTask {
    private WebDriver driver;
    private ShoppingCartSummaryAppObject shoppingCartSummaryAppObject;

    public  ShoppingCartSummaryTask(WebDriver driver) {
        this.driver = driver;
        this.shoppingCartSummaryAppObject = new ShoppingCartSummaryAppObject(driver);
    }

    public void pageShoppingSummary() {
        Assertions.assertEquals("Order - My Store", driver.getTitle());
        Assertions.assertEquals("SHOPPING-CART SUMMARY\nYour shopping cart contains: 1 Product", shoppingCartSummaryAppObject.getValidatePageLabel().getText());
        Assertions.assertEquals("$28.00", shoppingCartSummaryAppObject.getValidatePriceTotalLabel().getText());
        shoppingCartSummaryAppObject.getProceedToCheckoutButton().click();
    }
}
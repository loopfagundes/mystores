package tasks;

import appobjects.PaymentAppObject;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class PaymentTask {
    private WebDriver driver;
    private PaymentAppObject paymentAppObject;

    public PaymentTask(WebDriver driver) {
        this.driver = driver;
        this.paymentAppObject = new PaymentAppObject(driver);
    }

    public void prepaymentReview() {
        Assertions.assertEquals("Order - My Store", driver.getTitle(), "Payment: Tab page title is not correct");
        Assertions.assertEquals("PLEASE CHOOSE YOUR PAYMENT METHOD", paymentAppObject.getValidatePageLabel().getText());
        Assertions.assertEquals("26.00", paymentAppObject.getValidateUnitPriceLabel().getText().replace("$", ""), "Pay: Unit price not is correct");
        Assertions.assertEquals("1", paymentAppObject.getValidateQtyLabel().getText(), "Pay: Quantity not is correct");
        Assertions.assertEquals("26.00", paymentAppObject.getValidateTotalProductsLabel().getText().replace("$", ""), "Pay: Total Product not is correct");
        Assertions.assertEquals("2.00", paymentAppObject.getValidateTotalShippingLabel().getText().replace("$", ""), "Pay: Total Shipping not is correct");
        Assertions.assertEquals("28.00", paymentAppObject.getTotalAllLabel().getText().replace("$", ""), "Pay: Total All not is correct");
    }

    public void payment() {
        paymentAppObject.getPayByBankButton().click();
    }
}
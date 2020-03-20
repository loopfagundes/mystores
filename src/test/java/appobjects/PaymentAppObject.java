package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentAppObject {
    private WebDriver driver;

    public PaymentAppObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getValidatePageLabel() {
        return driver.findElement(By.className("page-heading"));
    }

    public WebElement getValidateUnitPriceLabel() {
        return driver.findElement(By.cssSelector("#product_price_3_14_275030 .price"));
    }

    public WebElement getValidateQtyLabel() {
        return driver.findElement(By.cssSelector(".cart_quantity.text-center > span"));
    }

    public WebElement getValidateTotalProductsLabel() {
        return driver.findElement(By.id("total_product"));
    }

    public WebElement getValidateTotalShippingLabel() {
        return driver.findElement(By.id("total_shipping"));
    }

    public WebElement getTotalAllLabel() {
        return driver.findElement(By.id("total_price"));
    }

    public WebElement getPayByBankButton() {
        return driver.findElement(By.className("bankwire"));
    }
}

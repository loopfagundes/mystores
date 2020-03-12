package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCartSummaryAppObject {
    private WebDriver driver;

    public ShoppingCartSummaryAppObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getValidatePageLabel() {
        return driver.findElement(By.className("page-heading"));
    }

    public WebElement getValidatePriceTotalLabel() {
        return driver.findElement(By.id("total_price"));
    }

    public WebElement getProceedToCheckoutButton() {
        return driver.findElement(By.cssSelector("p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium > span"));
    }

    public WebElement getCommentTextField() {
        return driver.findElement(By.className("form-control"));
    }
}
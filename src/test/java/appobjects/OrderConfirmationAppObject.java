package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderConfirmationAppObject {
    private WebDriver driver;

    public OrderConfirmationAppObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getValidatePageLabel() {
        return driver.findElement(By.className("page-heading"));
    }

    public WebElement getValidateMyStoreCompleteLabel() {
        return driver.findElement(By.className("cheque-indent"));
    }
}

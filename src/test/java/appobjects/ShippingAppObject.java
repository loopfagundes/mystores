package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShippingAppObject {
    private WebDriver driver;

    public ShippingAppObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getValidatePageLabel() {
        return driver.findElement(By.className("page-heading"));
    }
}

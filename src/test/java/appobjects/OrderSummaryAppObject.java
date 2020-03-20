package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderSummaryAppObject {
    private WebDriver driver;

    public OrderSummaryAppObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getValidatePageLabel() {
        return driver.findElement(By.className("page-heading"));
    }

    public WebElement getConfirmButton() {
        return driver.findElement(By.cssSelector("button.button.btn.btn-default.button-medium"));
    }
}
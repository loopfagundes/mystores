package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BuyProductAppObject {
    private WebDriver driver;

    public BuyProductAppObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement get() {
        return driver.findElement(By.id(""));
    }
}
// nao ainda atualizado
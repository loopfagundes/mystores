package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountAppObject {
    private WebDriver driver;

    public MyAccountAppObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getHomeButton() {
        return driver.findElement(By.className("icon-home"));
    }

    public WebElement getValidateMyAccountLabel() {
        return driver.findElement(By.className("page-heading"));
    }
}
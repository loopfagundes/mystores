package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProductDetailsAppObject {
    private WebDriver driver;

    public ProductDetailsAppObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getValidateProductLabel() {
        return driver.findElement(By.cssSelector(".pb-center-column.col-xs-12.col-sm-4 > h1"));
    }

    public WebElement getLargerPictureButton() {
        return driver.findElement(By.id("thumb_8"));
    }

    public WebElement getClosePictureButton() {
        return driver.findElement(By.cssSelector("#product > div.fancybox-overlay.fancybox-overlay-fixed > div > div > a"));
    }

    public Select getSizeButton() {
        return new Select(driver.findElement(By.id("group_1")));
    }

    public WebElement getAddToCartButton() {
        return driver.findElement(By.cssSelector("button.exclusive"));
    }

    public WebElement getValdiatePriceProductLabel() {
        return driver.findElement(By.id("our_price_display"));
    }

    public WebElement getProceedToCheckoutButton() {
        return driver.findElement(By.cssSelector(".btn.btn-default.button.button-medium"));
    }
}
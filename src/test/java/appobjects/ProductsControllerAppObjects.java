package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsControllerAppObjects {
    private WebDriver driver;

    public ProductsControllerAppObjects(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getValidateSearchLabel() {
        return driver.findElement(By.className("lighter"));
    }

    public WebElement getChooseProductButton() {
        return driver.findElement(By.cssSelector("#center_column > ul > li:nth-child(5) > div > div.left-block > div > a.product_img_link > img"));
    }
}
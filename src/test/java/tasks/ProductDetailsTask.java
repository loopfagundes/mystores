package tasks;

import appobjects.ProductDetailsAppObject;
import frameworks.UtilsFw;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ProductDetailsTask {
    private WebDriver driver;
    private ProductDetailsAppObject productDetailsAppObject;

    public ProductDetailsTask(WebDriver driver) {
        this.driver = driver;
        this.productDetailsAppObject = new ProductDetailsAppObject(driver);
    }

    public void viewLagerPhoto() {
        productDetailsAppObject.getLargerPictureButton().click();
        productDetailsAppObject.getClosePictureButton().click();
    }

    public void buyProduct() {
        Assertions.assertEquals("Printed Dress - My Store", driver.getTitle());
        productDetailsAppObject.getSizeButton().selectByValue("2");
        productDetailsAppObject.getAddToCartButton().click();
        Assertions.assertEquals("$26.00", productDetailsAppObject.getValdiatePriceProductLabel().getText());
        productDetailsAppObject.getProceedToCheckoutButton().click();
    }
}
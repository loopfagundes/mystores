package tasks;

import appobjects.ProductDetailsAppObject;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class ProductDetailsTask {
    private WebDriver driver;
    private ProductDetailsAppObject productDetailsAppObject;


    public ProductDetailsTask(WebDriver driver) {
        this.driver = driver;
        this.productDetailsAppObject = new ProductDetailsAppObject(driver);
    }


    public void buyProduct() {
        Assertions.assertEquals("Printed Dress", productDetailsAppObject.getValidateProductLabel().getText());
        Assertions.assertEquals("Printed Dress - My Store", driver.getTitle(),"ProductDetails: Page title is not correct");
        productDetailsAppObject.getLargerPictureButton().click();
        productDetailsAppObject.getClosePictureButton().click();
        productDetailsAppObject.getSizeButton().selectByValue("2");
        Assertions.assertEquals("26.00", productDetailsAppObject.getValdiatePriceProductLabel().getText().replace("$",""),"ProductDetails: Price Product is not correct");
        productDetailsAppObject.getAddToCartButton().click();
    }

    public void modal() {
        productDetailsAppObject.getProceedToCheckoutButton().click();
    }
}
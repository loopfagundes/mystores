package tasks;

import appobjects.ProductsControllerAppObjects;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class ProductsControllerTask {
    private WebDriver driver;
    private ProductsControllerAppObjects productsControllerAppObjects;

    public ProductsControllerTask(WebDriver driver) {
        this.driver = driver;
        this.productsControllerAppObjects = new ProductsControllerAppObjects(driver);
    }

    public void chooseProduct() {
        productsControllerAppObjects.getChooseProductButton().click();
        Assertions.assertEquals("Printed Dress", productsControllerAppObjects.getValidateProductLabel().getText());
    }
}
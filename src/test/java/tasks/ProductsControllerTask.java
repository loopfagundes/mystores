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
        Assertions.assertEquals("Search - My Store", driver.getTitle(),"ProductsController: Tab page title is not correct");
        Assertions.assertEquals("\"DRESS\"", productsControllerAppObjects.getValidateSearchLabel().getText());
        productsControllerAppObjects.getChooseProductButton().click();
    }
}
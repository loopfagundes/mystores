package tasks;

import appobjects.IframeAppObject;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class IframeTask {
    private WebDriver driver;
    private IframeAppObject iframeAppObject;
    private static final String quantityProduct = "3";

    public IframeTask(WebDriver driver) {
        this.driver = driver;
        this.iframeAppObject = new IframeAppObject(driver);
    }

    public void chooseProduct() {
        iframeAppObject.getChooseProduct().click();
    }

    public void iframeQtyProduct() {
        iframeAppObject.getIframeQtyProductTextField().clear();
        iframeAppObject.getIframeQtyProductTextField().sendKeys(quantityProduct);
    }
}
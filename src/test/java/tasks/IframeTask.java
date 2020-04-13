package tasks;

import appobjects.IframeAppObject;
import frameworks.JsExecutorFw;
import frameworks.ScreenshotFw;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class IframeTask {
    private WebDriver driver;
    private IframeAppObject iframeAppObject;
    private static final String size = "M";
    private static final int quantityProduct = 3;

    public IframeTask(WebDriver driver) {
        this.driver = driver;
        this.iframeAppObject = new IframeAppObject(driver);
    }

    public void chooseProduct() {
        iframeAppObject.getChooseProduct().click();
    }

    public void iframeQtyProduct() {
        Assertions.assertEquals("Search - My Store", driver.getTitle());
        iframeAppObject.getIframeQtyProductTextField().clear();
        iframeAppObject.getIframeQtyProductTextField().sendKeys(Integer.toString(quantityProduct));
        JsExecutorFw.highlight(driver, iframeAppObject.getIframeQtyProductTextField());
        ScreenshotFw.viewScreenshot(driver, "QtyProductTestScreen");
        iframeAppObject.getSizeProductComboBox().selectByVisibleText(size);
        iframeAppObject.getIframeAddToCartButton().click();
    }
}
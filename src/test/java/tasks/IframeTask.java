package tasks;

import appobjects.IframeAppObject;
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

    public void iframeQtyProduct() throws InterruptedException {
        iframeAppObject.getIframeQtyProductTextField().clear();
        iframeAppObject.getIframeQtyProductTextField().sendKeys(Integer.toString(quantityProduct));
        iframeAppObject.getSizeProductComboBox().selectByVisibleText(size);
        System.out.println(driver.getPageSource());
        Thread.sleep(30);
        System.out.println(iframeAppObject.getValidateQuantityProduct().getText());
        Assertions.assertEquals(quantityProduct, iframeAppObject.getValidateQuantityProduct().getText());
    }
}
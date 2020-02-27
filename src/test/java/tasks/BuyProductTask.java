package tasks;

import appobjects.BuyProductAppObject;
import org.openqa.selenium.WebDriver;

public class BuyProductTask {
    private WebDriver driver;
    private BuyProductAppObject buyProductAppObject;

    public BuyProductTask(WebDriver driver) {
        this.driver = driver;
        this.buyProductAppObject = new BuyProductAppObject(driver);
    }

    public void chooseProduct() {
        buyProductAppObject.get().click();
    }
}

//nao ainda atualizado
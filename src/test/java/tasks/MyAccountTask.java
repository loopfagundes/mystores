package tasks;

import appobjects.MyAccountAppObject;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class MyAccountTask {
    private WebDriver driver;
    private MyAccountAppObject myAccountAppObject;

    public MyAccountTask(WebDriver driver) {
        this.driver = driver;
        this.myAccountAppObject = new MyAccountAppObject(driver);
    }

    public void accessMyAccount() {
        Assertions.assertEquals("My account - My Store", driver.getTitle());
        Assertions.assertEquals("MY ACCOUNT", myAccountAppObject.getValidatePageMyAccountLabel().getText());
        myAccountAppObject.getHomeButton().click();
    }
}
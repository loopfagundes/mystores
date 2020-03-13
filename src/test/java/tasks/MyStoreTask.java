package tasks;

import appobjects.MyStoreAppObject;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class MyStoreTask {
    private WebDriver driver;
    private MyStoreAppObject myStoreAppObject;

    public MyStoreTask(WebDriver driver) {
        this.driver = driver;
        this.myStoreAppObject = new MyStoreAppObject(driver);
    }

    public void searchProduct() {
        Assertions.assertEquals("My Store", driver.getTitle());
        myStoreAppObject.getSearchTextField().sendKeys("Dress");
        myStoreAppObject.getSearchTextField().sendKeys(Keys.ENTER);
    }
}
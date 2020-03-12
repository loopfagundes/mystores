package tasks;

import appobjects.IndexAppObject;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class IndexTask {
    private WebDriver driver;
    private IndexAppObject indexAppObject;

    public IndexTask(WebDriver driver) {
        this.driver = driver;
        this.indexAppObject = new IndexAppObject(driver);
    }

    public void searchProduct() {
        Assertions.assertEquals("My Store", driver.getTitle());
        indexAppObject.getSearchTextField().sendKeys("Dress");
        indexAppObject.getSearchTextField().sendKeys(Keys.ENTER);
        Assertions.assertEquals("\"DRESS\"", indexAppObject.getValidateSearchLabel().getText());
    }
}
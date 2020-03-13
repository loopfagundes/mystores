package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyStoreAppObject {
    private WebDriver driver;

    public MyStoreAppObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getSearchTextField() {
        return driver.findElement(By.id("search_query_top"));
    }
}
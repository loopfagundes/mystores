package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IndexAppObject {
    private WebDriver driver;

    public IndexAppObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getSearchTextField() {
        return driver.findElement(By.id("search_query_top"));
    }

    public WebElement getValidateSearchLabel() {
        return driver.findElement(By.className("lighter"));
    }
}
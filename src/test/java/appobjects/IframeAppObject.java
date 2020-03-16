package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class IframeAppObject {
    private WebDriver driver;

    public IframeAppObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getChooseProduct() {
        WebElement element = driver.findElement(By.cssSelector("#center_column > ul > li:nth-child(5) > div > div.left-block > div"));
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
        return element.findElement(By.cssSelector("a.quick-view"));
    }

    public WebElement getIframeQtyProductTextField() {
        driver.switchTo().defaultContent();
        WebElement iframeElement = driver.findElement(By.cssSelector(".fancybox-iframe"));
        WebDriver iframeDriver = driver.switchTo().frame(iframeElement);
        return iframeDriver.findElement(By.id("quantity_wanted"));
    }
}
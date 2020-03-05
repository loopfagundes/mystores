package tasks;

import appobjects.MyAccountAppObject;
import org.openqa.selenium.WebDriver;

public class MyAccountTask {
    private WebDriver driver;
    private MyAccountAppObject myAccountAppObject;

    public MyAccountTask(WebDriver driver) {
        this.driver = driver;
        this.myAccountAppObject = new MyAccountAppObject(driver);
    }

    public void accessHome() {
        myAccountAppObject.getHomeButton().click();
    }
}
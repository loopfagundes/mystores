package tasks;

import appobjects.LoginAppObject;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class LoginTask {
    private WebDriver driver;
    private LoginAppObject loginAppObject;

    public LoginTask(WebDriver driver){
        this.driver = driver;
        this.loginAppObject = new LoginAppObject(driver);
    }

    public void accessLogin(String email, String password) {
        loginAppObject.getSignInButton().click();
        loginAppObject.getEmailTextField().sendKeys(email);
        loginAppObject.getPasswordTextField().sendKeys(password);
        loginAppObject.getAccessSignInButton().click();
        Assertions.assertEquals("MY ACCOUNT", loginAppObject.getValidateMyAccountLabel().getText());
        loginAppObject.getHomeButton().click();
    }
}

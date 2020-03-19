package tasks;

import appobjects.AuthenticationAppObject;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class  AuthenticationTask {
    private WebDriver driver;
    private AuthenticationAppObject authenticationAppObject;

    public  AuthenticationTask(WebDriver driver){
        this.driver = driver;
        this.authenticationAppObject = new  AuthenticationAppObject(driver);
    }

    public void accessLogin(String email, String password) {
        Assertions.assertEquals("My Store", driver.getTitle(),"Authentication: Tab page title is not correct");
        authenticationAppObject.getSignInButton().click();
        Assertions.assertEquals("AUTHENTICATION", authenticationAppObject.getValidatePageMyAccountLabel().getText());
        authenticationAppObject.getEmailTextField().sendKeys(email);
        authenticationAppObject.getPasswordTextField().sendKeys(password);
        authenticationAppObject.getAccessSignInButton().click();
    }
}
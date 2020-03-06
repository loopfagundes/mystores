package testcases;

import frameworks.BaseTestFw;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.WebDriver;
import tasks.AuthenticationTask;
import tasks.IndexTask;
import tasks.MyAccountTask;

public class BuySuccessfullyTestCase extends BaseTestFw {
    private WebDriver driver = getDriver();
    private AuthenticationTask authenticationTask = new AuthenticationTask(driver);
    private MyAccountTask myAccountTask = new MyAccountTask(driver);
    private IndexTask indexTask = new IndexTask(driver);

    @BeforeEach
    public void setUp() {
        driver.get("http://automationpractice.com/index.php");
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
    void test(String email, String password) {
        authenticationTask.accessLogin(email, password);
        myAccountTask.accessMyAccount();
        indexTask.searchProduct();
    }
}
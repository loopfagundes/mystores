package testcases;

import frameworks.BaseTestFw;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.WebDriver;
import tasks.LoginTask;

public class MyStoreTestCase extends BaseTestFw {
    private WebDriver driver = getDriver();
    private LoginTask loginTask = new LoginTask(driver);


    @BeforeEach
    public void setUp() {
        driver.get("http://automationpractice.com/index.php");
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
    void test(String email, String password) {
        loginTask.accessLogin(email, password);
    }
}

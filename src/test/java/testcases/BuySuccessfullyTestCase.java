package testcases;

import frameworks.BaseTestFw;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.WebDriver;
import tasks.*;

public class BuySuccessfullyTestCase extends BaseTestFw {
    private WebDriver driver = getDriver();
    private AuthenticationTask authenticationTask = new AuthenticationTask(driver);
    private MyAccountTask myAccountTask = new MyAccountTask(driver);
    private MyStoreTask myStoreTask = new MyStoreTask(driver);
    private ProductsControllerTask productsControllerTask = new ProductsControllerTask(driver);
    private ProductDetailsTask productDetailsTask = new ProductDetailsTask(driver);
    private ShoppingCartSummaryTask shoppingCartSummaryTask = new ShoppingCartSummaryTask(driver);
    private AddressTask addressTask = new AddressTask(driver);

    @BeforeEach
    public void setUp() {
        driver.get("http://automationpractice.com/index.php");
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
    void test(String email, String password) {
        authenticationTask.accessLogin(email, password);
        myAccountTask.accessMyAccount();
        myStoreTask.searchProduct();
        productsControllerTask.chooseProduct();
        productDetailsTask.buyProduct();
        shoppingCartSummaryTask.pageShoppingSummary();
        addressTask.reviewAdresses();
    }
}
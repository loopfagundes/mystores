package suites;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;
import testcases.BuySuccessfullyTestCase;

@RunWith(JUnitPlatform.class)
@SelectPackages("testcases")
public class AllTests {

}
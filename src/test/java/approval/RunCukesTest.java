package approval;

import approval.util.BDD;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.firefox.FirefoxDriver;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"})
public class RunCukesTest {
    @BeforeClass
    public static void setup() {
        System.out.println("Ran the before");
		BDD.setWebDriver(new FirefoxDriver());
    }

    @AfterClass
    public static void teardown() {
		BDD.getWebDriver().quit();
        System.out.println("Ran the after");
    }
}

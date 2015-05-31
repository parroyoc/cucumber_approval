package approval.feature;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import approval.flow.AdministrationBusinessSteps;
import approval.flow.ApplicationBusinessSteps;
import approval.flow.CustomerBusinessSteps;
import approval.util.BDDCache;
import approval.util.BDDRecorder;
import approval.util.BDDCacheKeys;
import approval.util.ProductSearchResults;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProductFeatureSteps {
	
	@Before 
	public void before(Scenario scenario) { 
		BDDCache.reset();
		BDDRecorder.start(scenario.getName(), BDDRecorder.ACTION);
		ApplicationBusinessSteps.startApplication();
	}
	
	@After
	public void afterScenario() {
		BDDRecorder.stop();
		ApplicationBusinessSteps.endApplication();
	}
	
	@Given("^a product \"(.*?)\" is deleted$")
	public void a_product_is_deleted(String product) throws Throwable {
		BDDRecorder.step("Given a product is deleted");
	    AdministrationBusinessSteps.logInAsAdministrator();
	    AdministrationBusinessSteps.deleteProduct(product);
	}

	@When("^a customer retrieves the list of products$")
	public void a_customer_retrieves_the_list_of_products() throws Throwable {
		BDDRecorder.step("When a customer retrieves the list of products");
	    CustomerBusinessSteps.logInAsCustomer();
	    CustomerBusinessSteps.retrieveListOfProducts();
	}

	@Then("^the list of products contains \"(.*?)\"$")
	public void the_list_of_products_contains(String product) throws Throwable {
		BDDRecorder.step("Then the list of products contains " + product);
		ProductSearchResults results = (ProductSearchResults) BDDCache.get(BDDCacheKeys.PRODUCT_CUSTOMER_SEARCH_RESULT_LIST);
		assertTrue(results.contains(product));
	}
	
	@Then("^the list of products does not contain \"(.*?)\"$")
	public void the_list_of_products_does_not_contain(String product) throws Throwable {
		BDDRecorder.step("Then the list of products does not contain " + product);
		ProductSearchResults results = (ProductSearchResults) BDDCache.get(BDDCacheKeys.PRODUCT_CUSTOMER_SEARCH_RESULT_LIST);
		assertFalse(results.contains(product));
	}
}

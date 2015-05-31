package approval.flow;

import approval.module.LoginModuleSteps;
import approval.module.ProductModuleSteps;

public class CustomerBusinessSteps {

	public static void logInAsCustomer() {
		LoginModuleSteps.loginAs("pablo", "pablo123");
	}

	public static void retrieveListOfProducts() {
		ProductModuleSteps.customerSearchAllProducts();
	}

}

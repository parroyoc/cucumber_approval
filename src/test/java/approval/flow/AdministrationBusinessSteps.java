package approval.flow;

import approval.module.LoginModuleSteps;
import approval.module.ProductModuleSteps;

public class AdministrationBusinessSteps {

	public static void logInAsAdministrator() {
		LoginModuleSteps.loginAs("root", "rootPwd");
	}

	public static void deleteProduct(String product) {
		ProductModuleSteps.deleteProduct(product);
	}

}

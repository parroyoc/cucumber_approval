package approval.module;

import approval.page.ProductAdminPageSteps;
import approval.page.ProductCustomerPageSteps;
import approval.util.BDDNavigation;

public class ProductModuleSteps {

	public static void customerSearchAllProducts() {
		BDDNavigation.goTo("products.html");
		ProductCustomerPageSteps.searchAll();
	}
	
	public static void deleteProduct(String product) {
		BDDNavigation.goTo("productAdmin.html");		
		ProductAdminPageSteps.searchProductByName(product);
		ProductAdminPageSteps.selectProduct(product);
		ProductAdminPageSteps.deleteSelectedProduct();
	}

}

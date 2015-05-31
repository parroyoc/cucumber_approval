package approval.module;

import approval.page.ProductAdminPageSteps;
import approval.page.ProductCustomerPageSteps;
import approval.util.Navigation;

public class ProductModuleSteps {

	public static void customerSearchAllProducts() {
		Navigation.goTo("products.html");
		ProductCustomerPageSteps.searchAll();
	}
	
	public static void deleteProduct(String product) {
		Navigation.goTo("productAdmin.html");		
		ProductAdminPageSteps.searchProductByName(product);
		ProductAdminPageSteps.selectProduct(product);
		ProductAdminPageSteps.deleteSelectedProduct();
	}

}

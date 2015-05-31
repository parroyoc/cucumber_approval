package approval.page;

import approval.util.BDD;
import approval.util.CacheKeys;
import approval.util.ConcisePageSteps;
import approval.util.ProductSearchResults;

public class ProductCustomerPageSteps  extends ConcisePageSteps {

	private static final String PRODUCT_CUSTOMER_SEARCH_BUTTON = "product_customer_search_button";
	private static final String PRODUCT_CUSTOMER_SEARCH_RESULT_LIST = "product_customer_search_result_list";

	public static void searchAll() {
		clickId(PRODUCT_CUSTOMER_SEARCH_BUTTON);
		ProductSearchResults productSearchResults = new ProductSearchResults(byClassWithinId("result", PRODUCT_CUSTOMER_SEARCH_RESULT_LIST));
		BDD.put(CacheKeys.PRODUCT_CUSTOMER_SEARCH_RESULT_LIST, productSearchResults);
	}

}

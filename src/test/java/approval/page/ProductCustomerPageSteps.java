package approval.page;

import static approval.util.BDDConcisePageSteps.byClassWithinId;
import static approval.util.BDDConcisePageSteps.clickId;
import approval.util.BDDCache;
import approval.util.BDDCacheKeys;
import approval.util.ProductSearchResults;

public class ProductCustomerPageSteps {

	private static final String PRODUCT_CUSTOMER_SEARCH_BUTTON = "product_customer_search_button";
	private static final String PRODUCT_CUSTOMER_SEARCH_RESULT_LIST = "product_customer_search_result_list";

	public static void searchAll() {
		clickId(PRODUCT_CUSTOMER_SEARCH_BUTTON);
		ProductSearchResults productSearchResults = new ProductSearchResults(byClassWithinId("result", PRODUCT_CUSTOMER_SEARCH_RESULT_LIST));
		BDDCache.put(BDDCacheKeys.PRODUCT_CUSTOMER_SEARCH_RESULT_LIST, productSearchResults);
	}

}

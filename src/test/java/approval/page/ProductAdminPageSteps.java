package approval.page;

import static approval.util.BDDConcisePageSteps.byClassWithinId;
import static approval.util.BDDConcisePageSteps.clickId;
import static approval.util.BDDConcisePageSteps.typeInId;
import approval.util.BDDCache;
import approval.util.BDDCacheKeys;
import approval.util.ProductSearchResults;

public class ProductAdminPageSteps {

	private static final String PRODUCT_ADMIN_SEARCH_NAME = "product_admin_search_name";
	private static final String PRODUCT_ADMIN_SEARCH_BUTTON = "product_admin_search_button";
	private static final String PRODUCT_ADMIN_SEARCH_RESULT_LIST = "product_admin_search_result_list";
	private static final String PRODUCT_ADMIN_DELETE_SELECTED_BUTTON = "product_admin_delete_selected";

	public static void searchProductByName(String name) {
		typeInId(PRODUCT_ADMIN_SEARCH_NAME, name);		
		clickId(PRODUCT_ADMIN_SEARCH_BUTTON);
		ProductSearchResults productSearchResults = new ProductSearchResults(byClassWithinId("result", PRODUCT_ADMIN_SEARCH_RESULT_LIST));
		BDDCache.put(BDDCacheKeys.PRODUCT_ADMIN_SEARCH_RESULT_LIST, productSearchResults);
	}

	public static void selectProduct(String name) {
		clickId("product_" + name);
	}

	public static void deleteSelectedProduct() {
		clickId(PRODUCT_ADMIN_DELETE_SELECTED_BUTTON);
	}

}

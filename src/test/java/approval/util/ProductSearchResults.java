package approval.util;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

public class ProductSearchResults {
	ArrayList<String> products;
	
	public ProductSearchResults(List<WebElement> productWebElements) {
		products = new ArrayList<String>();
		for (WebElement product : productWebElements) {
			products.add(product.getAttribute("value"));
		}
	}

	public boolean contains(String product) {
		return products.contains(product);
	}

}

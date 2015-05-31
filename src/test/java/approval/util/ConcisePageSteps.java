package approval.util;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ConcisePageSteps {

	protected static WebElement byId(String id) {
		return BDD.getWebDriver().findElement(By.id(id));
	}

	protected static List<WebElement> byClassWithinId(String className, String id) {
		return byId(id).findElements(By.className(className));
	}

	protected static void clickId(String id) {
		byId(id).click();		
		BDDRecorder.snapshot(BDDRecorder.ACTION, "Click on " + id);
	}
	
	protected static void typeInId(String id, String string) {
		byId(id).sendKeys(string);
		BDDRecorder.snapshot(BDDRecorder.ACTION, "Type " + string + " on " + id);
	}

}

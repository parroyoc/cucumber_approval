package approval.util;

import org.openqa.selenium.remote.RemoteWebDriver;

public class BDD {

	private static RemoteWebDriver webDriver;

	public static void setWebDriver(RemoteWebDriver driver) {
		webDriver = driver;
	}

	public static RemoteWebDriver getWebDriver() {
		return webDriver;
	}

}

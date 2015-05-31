package approval.util;

import java.util.HashMap;

import org.openqa.selenium.remote.RemoteWebDriver;

public class BDD {

	private static HashMap<String, Object> cache = new HashMap<String, Object>();
	private static RemoteWebDriver webDriver;

	public static Object get(String string) {
		return cache.get(string);
	}
	
	public static void put(String string, Object object) {
		cache.put(string,object);
	}

	public static void reset() {
		cache.clear();
	}

	public static void setWebDriver(RemoteWebDriver driver) {
		webDriver = driver;
	}

	public static RemoteWebDriver getWebDriver() {
		return webDriver;
	}

}

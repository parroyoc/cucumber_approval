package approval.util;

public class Navigation {

	private static final String BASE_URL = "BASE_URL";

	public static void openApplication() {
		BDD.getWebDriver().get(BDDProperties.get(BASE_URL) + "/login.html");
	}
	
	public static void goTo(String route) {
		BDD.getWebDriver().get(BDDProperties.get(BASE_URL) + "/" + route);
		BDDRecorder.snapshot(BDDRecorder.NAVIGATION, "Going to " + route);
	}
	
	public static void closeApplication() {
	}
}

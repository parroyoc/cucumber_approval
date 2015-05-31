package approval.flow;

import approval.util.BDDNavigation;

public class ApplicationBusinessSteps {

	public static void startApplication() {
		BDDNavigation.openApplication();
	}

	public static void endApplication() {
		BDDNavigation.closeApplication();
	}
}

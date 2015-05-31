package approval.flow;

import approval.util.Navigation;

public class ApplicationBusinessSteps {

	public static void startApplication() {
		Navigation.openApplication();
	}

	public static void endApplication() {
		Navigation.closeApplication();
	}
}

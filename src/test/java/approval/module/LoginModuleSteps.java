package approval.module;

import approval.page.LoginPageSteps;
import approval.util.BDDNavigation;

public class LoginModuleSteps {

	public static void loginAs(String user, String password) {
		BDDNavigation.goTo("login.html");		
		LoginPageSteps.loginWithCredentials(user, password);
	}
}

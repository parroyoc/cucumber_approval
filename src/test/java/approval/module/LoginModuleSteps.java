package approval.module;

import approval.page.LoginPageSteps;
import approval.util.Navigation;

public class LoginModuleSteps {

	public static void loginAs(String user, String password) {
		Navigation.goTo("login.html");		
		LoginPageSteps.loginWithCredentials(user, password);
	}
}

package approval.page;

import approval.util.ConcisePageSteps;

public class LoginPageSteps extends ConcisePageSteps {
	private static final String LOGIN_USERNAME_TEXTFIELD = "login_username_textfield";
	private static final String LOGIN_PASSWORD_TEXTFIELD = "login_password_textfield";
	private static final String LOGIN_ENTER_BUTTON = "login_enter_button";

	public static void loginWithCredentials(String user, String password) {
		typeInId(LOGIN_USERNAME_TEXTFIELD, user);		
		typeInId(LOGIN_PASSWORD_TEXTFIELD, password);		
		clickId(LOGIN_ENTER_BUTTON);
	}

}

package yagni.passwordValidator;

public class PasswordValidator {

	public boolean check(String password) {
		if (password == null || password.isEmpty())
			return false;

		return password.length() >= 8;
	}
}

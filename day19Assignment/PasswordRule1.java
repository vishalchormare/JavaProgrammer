package day19Assignment;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordRule1 {

	public static boolean isValidPassword(String password) {

		String regex = "^(?=\\S+$).{8,}$";
		Pattern p = Pattern.compile(regex);
		if (password == null) {
			return false;
		}
		Matcher m = p.matcher(password);
		return m.matches();
	}

	public static void main(String args[]) {
		String str1 = "Viasal@chor21";
		System.out.println(isValidPassword(str1));

		String str2 = "VishalChormarare";
		System.out.println(isValidPassword(str2));

		String str3 = "Viasal@chor21";
		System.out.println(isValidPassword(str3));

		String str4 = "1234";
		System.out.println(isValidPassword(str4));

		String str5 = "Vis@chor21";
		System.out.println(isValidPassword(str5));

		String str6 = "vis@chor21";
		System.out.println(isValidPassword(str6));
	}

}

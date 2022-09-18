package day19Assignment;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

	public static boolean isValidEmail(String str) {
		Pattern ptrn = Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
		Matcher match = ptrn.matcher(str);
		return (match.find() && match.group().equals(str));

	}

	public static void main(String args[]) {
		System.out.println("Enter EmailId");
		Scanner s = new Scanner(System.in);
		String str = s.next();
		if (isValidEmail(str))
			System.out.println("It is a valid EmailId.");
		else
			System.out.println("Entered EmailId Is Invalid.");
	}

}

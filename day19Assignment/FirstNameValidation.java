package day19Assignment;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstNameValidation {

	public static boolean isValidFirstName(String str) {

		Pattern ptrn = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
		Matcher match = ptrn.matcher(str);
		return (match.find() && match.group().equals(str));
	}

	public static void main(String args[]) {
		System.out.println("Enter First Name");
		Scanner s = new Scanner(System.in);
		String str = s.next();
		if (isValidFirstName(str))
			System.out.println("It is a valid FirstNAme.");
		else
			System.out.println("Entered Name Is Invalid.");
	}

}

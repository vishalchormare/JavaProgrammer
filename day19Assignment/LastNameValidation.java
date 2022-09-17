package day19Assignment;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastNameValidation {

	public static boolean isValidLastName(String str) {

		Pattern ptrn = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
		Matcher match = ptrn.matcher(str);
		return (match.find() && match.group().equals(str));

	}

	public static void main(String args[]) {

		System.out.println("ENter last name");
		Scanner s = new Scanner(System.in);
		String str = s.next();

		if (isValidLastName(str))
			System.out.println("it is valid last name");
		else
			System.out.println("Enter Name Is Invalid");

	}

}

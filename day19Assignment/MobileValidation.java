package day19Assignment;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileValidation {

	public static boolean isValidMobileNo(String str) {

		Pattern ptrn = Pattern.compile("(0/91)?[7-9][0-9]{9}");
		Matcher match = ptrn.matcher(str);
		return (match.find() && match.group().equals(str));
	}

	public static void main(String args[]) {
		System.out.println("Enter First Name");
		Scanner s = new Scanner(System.in);
		String str = s.next();
		if (isValidMobileNo(str))
			System.out.println("It is a valid mobile number.");
		else
			System.out.println("Entered mobile number is invalid.");
	}

}

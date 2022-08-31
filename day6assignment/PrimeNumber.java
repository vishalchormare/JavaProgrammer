package day6assignment;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int number;

		System.out.println("Enter the no to find prime or not");
		number = scanner.nextInt();
		boolean primeflag = false;

		for (int i = 2; i <= number / 2; ++i) {
			if (number % i == 0) {
				primeflag = true;
				break;
			}
		}
		if (!primeflag) {
			System.out.println(number + " is a prime number.");
		} else {
			System.out.println(number + " is not a prime number.");
		}
	}
}

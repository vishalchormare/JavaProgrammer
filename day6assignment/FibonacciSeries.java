package day6assignment;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = 100;
		int firstTerm;
		int secondTerm;

		System.out.println("Enter your First Term");
		firstTerm = scanner.nextInt();
		System.out.println("Enter your Second Term");
		secondTerm = scanner.nextInt();
		System.out.println("Fibonacci Series Upto " + n + ": ");
		while (firstTerm <= n) {

			System.out.print(firstTerm + ", ");
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;

		}

	}

}

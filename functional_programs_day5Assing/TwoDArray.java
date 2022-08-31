package functional_programs_day5Assing;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {

		int twoDArry[][] = new int[5][5];

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your Rows");
		int m = scanner.nextInt();

		System.out.println("Enter your Coloum");
		int n = scanner.nextInt();

		int noElement = m * n;

		System.out.println("Numbers Elements are :" + noElement);
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <n ; j++) {
				twoDArry[i][j] = scanner.nextInt();
			}
		}
		scanner.close();
		
		System.out.println("The Input array is :");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(twoDArry[i][j] + "\t");
			}
			System.out.println();
		}
	}
}

package functional_programs_day5Assing;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {

		int x;
		int y;

		System.out.println("Enter the Euclidean distance value X and Y");

		Scanner run = new Scanner(System.in);
		x = run.nextInt();
		y = run.nextInt();

		//double distance_result = Math.sqrt(x * x + y * y);

		double result = Math.pow((x * x + y * y),0.5);
		System.out.println(result);
	}

}

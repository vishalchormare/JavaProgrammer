package functional_programs_day5Assing;

import java.util.Scanner;

public class QuaericEquation {

	public static void main(String[] args) {
		double secondRoot = 0, firstRoot = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a ::");
		double a = sc.nextDouble();

		System.out.println("Enter the value of b ::");
		double b = sc.nextDouble();

		System.out.println("Enter the value of c ::");
		double c = sc.nextDouble();

		double delta = (b * b) - (4 * a * c);

		if (delta > 0) {
			firstRoot = (-b + Math.sqrt(delta)) / (2 * a);
			secondRoot = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("Roots are :: " + firstRoot + " and " + secondRoot);
		} else if (delta == 0) {
			firstRoot = (-b + Math.sqrt(delta)) / (2 * a);
			secondRoot = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("Roots are :: " + firstRoot + " and " + secondRoot);
		}else{
			
			System.out.println("delta less than zero");
		}
	}
}

package functional_programs_day5Assing;

public class SumOfThreeElement {

	public static void find(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				for (int l = j + 1; l < a.length; l++) {
					if (a[i] + a[j] + a[l] == 0) {
						System.out.println("Found 3 elements whose sum is = 0");
						System.out.println("Elements are " + a[i] + " " + a[j] + " " + a[l]);
						return;
					}
				}
			}
		}
		System.out.println("Did not find 3 elements whose sum is = 0");
	}

	public static void main(String[] args) {
		 int a [] = { -1,2,3,4,-5,-6,-7,8,9,-1,-3};
		 find(a);
	}
}

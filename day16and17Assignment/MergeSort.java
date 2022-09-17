package day16and17Assignment;

import java.util.Scanner;

public class MergeSort {

	Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {
		MergeSort obj = new MergeSort();
		System.out.println("Enter number of String");
		int numberOfStrings = obj.sc.nextInt();
		obj.sc.nextLine();
		String[] array = new String[numberOfStrings];
		for (int i = 0; i < numberOfStrings; i++) {
			array[i] = obj.sc.nextLine();
		}
		String[] sorted = Utility.mergeSort(array);

		System.out.println();

	}

}

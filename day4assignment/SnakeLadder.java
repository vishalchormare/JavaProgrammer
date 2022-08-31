package day4assignment;

import java.util.Random;
import java.util.Scanner;

public class SnakeLadder {

	static Random random = new Random();
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int ch = 3;
		int currentPostinFor1 = 0;
		int count = 0;

		do {
			currentPostinFor1 = play(currentPostinFor1);
			if (currentPostinFor1 == 100) {
				System.out.println("You win");
			}

			System.out.println("Do want to continue press 1");

			ch = scanner.nextInt();

		} while (ch == 1);

		count++;

		System.out.println(count);

	}

	private static int play(int CurrentPostin) {
		// TODO Auto-generated method stub

		int a = random.nextInt(3);
		int stratPosition = 0;
		int ladderPositon = 0;

		if (a == 0) {
			System.out.println("No play Current positon ::" + CurrentPostin);
		} else {
			
			int disc=rollDisc();
			CurrentPostin = CurrentPostin + disc:
			System.out.println("Disc ::" + disc);
			boolean flag = true;
			if(CurrentPostin == 100) {
				
			}

		}

	}

}

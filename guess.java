package cst105n.w2.e3;

import java.util.Scanner;

public class guess {

	public static void main(String[] args) {
		int target;
		int guess;
		Scanner sn = new Scanner(System.in);
		target = (int) (Math.random() * 9999 + 1);
		int min = 1, max = 10000;
		//System.out.println("Secret number is " + target);

		

		System.out.println("Enter a guess between 1 and 10000 :");
		do {
			
			guess = sn.nextInt();
			sn.hasNextLine();
			System.out.println("Your guess is " + guess);

			if (guess == target) {
				System.out.println("The secret number was " + target);
				System.out.println("WINNER");
			} else if (guess < target) {
				min = guess + 1;
				System.out.println("Secret number is between " + min + " and " + max);
				System.out.println("HIGHER");

			} else if (guess > target) {
				max = guess - 1;
				System.out.println("Secret number is between " + min + " and " + max);
				System.out.println("LOWER");

			}
		} while (guess != target);
	}
}
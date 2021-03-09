package week2;

import java.util.Scanner;

public class work1 {
	public static void main(String args[]) {
		String again;
		Scanner scan = new Scanner(System.in);
		do {
			Scanner scan2 = new Scanner(System.in);
			System.out.println("Enter a number:");
			int number = scan2.nextInt();
			for (int i = 1; i <= number; i++) {
				for (int j = number - i; j >= 1; j--) {
					System.out.print(" ");
				}
				for (int j = 0; j < i; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			System.out.println("again?(y/n)");
			again = scan.nextLine();
		} while (again.equalsIgnoreCase("y"));
		System.out.println("over!");
	}
}

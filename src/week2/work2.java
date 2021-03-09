package week2;

import java.util.Scanner;

public class work2 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);

		int sum, number;
		String again;
		do {
			System.out.println("输入3~7数字作为输出水仙花数的位数:");
			number = scan.nextInt();
			for (int i = (int)Math.pow(10, number-1); i < (int)Math.pow(10, number); i++) {
				sum = 0;
				for (int j = i; j > 0; j = j / 10) {
					sum = (int) (sum + Math.pow(j % 10, number));
				}
				if (i == sum)
					System.out.println(i);
			}
			System.out.println("again?(y/n)");
			again = scan2.nextLine();
		} while (again.equalsIgnoreCase("y"));
		System.out.println("over!");
	}
}

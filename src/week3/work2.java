package week3;

import java.util.Scanner;

public class work2 {
	public static int firstNum, secondNum;

	public static void main(String args[]) {
		int choose = menu();
		while (true) {
			if (choose == 0) {
				System.out.println("Thranks!");
				break;
			}
			switch (choose) {
			case 1:
				Inputs();
				break;
			case 2:
				if (firstNum == 0 && secondNum == 0) {
					System.out.println("You Must Input Two Integers first!");
					break;
				}
				oddNum();
				break;
			case 3:
				if (firstNum == 0 && secondNum == 0) {
					System.out.println("You Must Input Two Integers first!");
					break;
				}
				sumOfEven();
				break;
			case 4:
				if (firstNum == 0 && secondNum == 0) {
					System.out.println("You Must Input Two Integers first!");
					break;
				}
				numAndsquares();
				break;
			case 5:
				if (firstNum == 0 && secondNum == 0) {
					System.out.println("You Must Input Two Integers first!");
					break;
				}
				Sum();
				break;
			default:
				System.out.println("error and choose again!");
			}
			choose = menu();
		}
	}

	public static int menu() {
		System.out.println("============================================");
		System.out.println("1.Input two integers: firstNum and secondNum.");
		System.out.println("2.Output all the odd numbers between firstNum and secondNum.");
		System.out.println("3.Output the sum of all the even numbers between firstNum and secondNum.");
		System.out.println("4.Output all the numbers and their squares between firstNum and secondNum.");
		System.out.println("5.Output the sum of the squares of all the odd numbers between firstNum and secondNum.");
		System.out.println("0.Exit");
		System.out.print("Please Choose(0-5):");
		int choose;
		Scanner scan = new Scanner(System.in);
		choose = scan.nextInt();
		return choose;
	}

	public static void Inputs() {
		Scanner scan = new Scanner(System.in);
		System.out.print("firstNum:");
		firstNum = scan.nextInt();
		System.out.print("secondNum(firstNum must be less than secondNum):");
		secondNum = scan.nextInt();
		while (firstNum >= secondNum) {
			System.out.print("firstNum must be less than secondNum! input again:");
			secondNum = scan.nextInt();
		}
	}

	public static void oddNum() {
		for (int i = firstNum; i <= secondNum; i++)
			if (i % 2 != 0)
				System.out.println(i);
	}

	public static void sumOfEven() {
		int sum = 0;
		for (int i = firstNum; i <= secondNum; i++)
			sum += i;
		System.out.println(sum);
	}

	public static void numAndsquares() {
		for (int i = firstNum; i <= secondNum; i++) {
			System.out.print(i);
			System.out.println(" squared is " + Math.pow(i, 2));
		}
	}

	public static void Sum() {
		int sum = 0;
		for (int i = firstNum; i <= secondNum; i++)
			if (i % 2 != 0)
				sum += Math.pow(i, 2);
		System.out.println(sum);

	}

}
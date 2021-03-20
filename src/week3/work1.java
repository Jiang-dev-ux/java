package week3;

import java.util.Scanner;

public class work1 {
	public static double score[];

	public static void main(String args[]) {
		int choose = menu();
		double average, highestGrade, lowestGrade;

		while (true) {
			if (choose == 0) {
				System.out.println("Thranks!");
				break;
			}

			switch (choose) {

			case 1:

				Results();

				break;

			case 2:

				if (score == null) {

					System.out.println("请先输入成绩!");

					break;

				}

				average = Average();

				System.out.println("平均成绩：" + average);

				break;

			case 3:

				if (score == null) {

					System.out.println("请先输入成绩!");

					break;

				}

				highestGrade = highestGrade();

				System.out.println("最高分：" + highestGrade);

				break;

			case 4:

				if (score == null) {

					System.out.println("请先输入成绩!");

					break;

				}

				lowestGrade = lowestGrade();

				System.out.println(lowestGrade);

				break;

			case 5:

				if (score == null) {

					System.out.println("请先输入成绩：");

					break;

				}

				Print();
				break;

			default:

				System.out.println("error and choose again!");

			}

			choose = menu();

		}

	}

	public static int menu() {

		System.out.println("==========score==========");

		System.out.println("1.Enter Student Results");

		System.out.println("2.Class Average");

		System.out.println("3.Highest Grade");

		System.out.println("4.Lowest Grade");

		System.out.println("5.Print Grade");

		System.out.println("0.Exit");

		System.out.print("Please Choose(0-5):");

		int choose;

		Scanner scan = new Scanner(System.in);

		choose = scan.nextInt();

		return choose;

	}

	public static void Results() {

		Scanner scan = new Scanner(System.in);

		int length;

		System.out.print("学生数量:");

		length = scan.nextInt();

		score = new double[length];

		for (int i = 0; i < score.length; i++) {

			System.out.print("请输入第" + (i + 1) + "学生的成绩:");

			while (true) {

				score[i] = scan.nextDouble();

				if (score[i] < 0 || score[i] > 100)

					System.out.print("输入失败，请重新输入：");

				else

					break;

			}

		}

	}

	public static double Average() {

		double sum = 0, average;

		for (int i = 0; i < score.length; i++) {

			sum = sum + score[i];

		}

		average = sum / score.length;

		return average;

	}

	public static double highestGrade() {

		double highest = score[0];

		for (int i = 1; i < score.length; i++)

			if (highest < score[i])

				highest = score[i];

		return highest;

	}

	public static double lowestGrade() {

		double lowest = score[0];

		for (int i = 1; i < score.length; i++)

			if (lowest > score[i])

				lowest = score[i];

		return lowest;

	}

	public static void Print() {

		for (int i = 0; i < score.length - 1; i++) {

			for (int j = i + 1; j < score.length; j++) {

				if (score[i] > score[j]) {

					double temp = score[i];

					score[i] = score[j];

					score[j] = temp;

				}

			}

			System.out.println(score[i]);

		}

	}

}
package week1;

import java.util.Scanner;

public class work1 {
	public static void main(String args[]) {

		final int ONE_DOLLAR = 100;
		final int FIFTY_CENT = 50;
		final int TWENTY_CENT = 20;
		final int TEN_CENT = 10;
		final int FIVE_CENT = 5;
		final int TWO_CENT = 2;
		final int ONE_CENT = 1;

		double dollar;
		int dollarToCent;
		int dollarNumber;
		int fiftyCentCoin;
		int twentyCentCoin;
		int tenCentCoin;
		int fiveCentCoin;
		int twoCentCoin;
		int oneCentCoin;
		int otherMoney;

		Scanner scan = new Scanner(System.in);

		System.out.println("输入美元：");
		dollar = scan.nextDouble();

		dollarToCent = (int) (dollar * 100);

		dollarNumber = dollarToCent / ONE_DOLLAR;
		otherMoney = dollarToCent % ONE_DOLLAR;
		fiftyCentCoin = otherMoney / FIFTY_CENT;
		otherMoney = otherMoney % FIFTY_CENT;
		twentyCentCoin = otherMoney / TWENTY_CENT;
		otherMoney = otherMoney % TWENTY_CENT;
		tenCentCoin = otherMoney / TEN_CENT;
		otherMoney = otherMoney % TEN_CENT;
		fiveCentCoin = otherMoney / FIVE_CENT;
		otherMoney = otherMoney % FIVE_CENT;
		twoCentCoin = otherMoney / TWO_CENT;
		otherMoney = otherMoney % TWO_CENT;
		oneCentCoin = otherMoney / ONE_CENT;

		System.out.println("美元：" + dollarNumber);
		System.out.println("五十美分硬币：" + fiftyCentCoin);
		System.out.println("二十美分硬币：" + twentyCentCoin);
		System.out.println("十美分硬币：" + tenCentCoin);
		System.out.println("五美分硬币：" + fiveCentCoin);
		System.out.println("二美分硬币：" + twoCentCoin);
		System.out.println("一美分硬币：" + oneCentCoin);
	}

}

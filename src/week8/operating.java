package week8;

import java.util.Scanner;

public class operating {
	public static void main(String args[]) {

		// �˵�
		System.out.println("����һ���ַ�������ʽ���£�");
		System.out.println("add(num1,num2) ���������������");
		System.out.println("sub(num1,num2) ���������������");
		System.out.println("max(num1,num2) �ҳ������������нϴ����");
		System.out.println("min(num1,num2) �ҳ������������н�С����");
		System.out.println("doubleMe(num1) ������������");
		System.out.println("exit           �˳�");

		while (true) {
			Scanner scan = new Scanner(System.in);
			String express = scan.nextLine();
			
			express = express.replace(" ", "");
			
			if (express.equals("exit"))
				break;

			int pos1 = express.indexOf("(");
			int pos2 = express.indexOf(")");

			String operate = express.substring(0, pos1);
			String numberString = express.substring(pos1 + 1, pos2);
			double number1, number2, result;
			String msg = "";

			if (!operate.equals("doubleMe")) {
				int pos3 = numberString.indexOf(",");
				String string1 = numberString.substring(0, pos3);
				String string2 = numberString.substring(pos3 + 1);
				number1 = Double.parseDouble(string1);
				number2 = Double.parseDouble(string2);
				if (operate.equals("add")) {
					result = number1 + number2;
					msg += express + " = " + result;
				}

				if (operate.equals("sub")) {
					result = number1 - number2;
					msg += express + " = " + result;
				}

				if (operate.equals("max")) {
					if (number1 > number2)
						result = number1;
					else
						result = number2;
					msg += express + " = " + result;
				}

				if (operate.equals("min")) {
					if (number1 > number2)
						result = number2;
					else
						result = number1;
					msg += express + " = " + result;
				}
			}
			else if (operate.equals("doubleMe")) {
				number1 = Double.parseDouble(numberString);
				result = number1 * 2;
				msg += express + " = " + result;
			}
			else
				System.out.println("����");

			System.out.println(msg);
		}
	}
}

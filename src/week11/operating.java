package week11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class operating {
	public static void main(String args[]) {
		String str;
		Scanner scan = new Scanner(System.in);
		str = scan.nextLine();
		String regex = "[a-zA-Z]{3}\\([1-9]\\d?\\,[1-9]\\d?\\)|[a-zA-Z]{8}\\([1-9]\\)";
		while(true) {
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(str);
			if(m.find()){
				String express = m.group();
				int pos1 = express.indexOf("(");
				int pos2 = express.indexOf(")");

				String operate = express.substring(0, pos1);
				String numberString = express.substring(pos1 + 1, pos2);
				int number1, number2, result = 0;
				String msg = "";

				if (!operate.equals("doubleMe")) {
					int pos3 = numberString.indexOf(",");
					String string1 = numberString.substring(0, pos3);
					String string2 = numberString.substring(pos3 + 1);
					number1 = Integer.parseInt(string1);
					number2 = Integer.parseInt(string2);
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
					number1 = Integer.parseInt(numberString);
					result = number1 * 2;
					msg += express + " = " + result;
				}
				else
					System.out.println("����");
				
				str = str.replace(m.group(), String.valueOf(result));
				System.out.println(msg);
				}
			
		}
	}
}

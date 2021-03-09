package week1;

import java.util.Scanner;
import java.math.*;

public class work2 {
	public static void main(String args[]) {
		
		final double COLOURING_FRAME_PER_INCH = 0.10;
		final double REGULAR_FRAME_PER_INCH = 0.15;		
		final double FANCY_FRAME_PER_INCH = 0.25;
		final double CARDBOARD_PAPER_PER_SQUARE_INCH = 0.02;
		final double GLASS_PER_SQUARE_INCH = 0.07;
		final double CROWN = 0.35;
		
		double length;
		double width;
		String frameType;
		String colour;
		int crownNumber; 
		double perimeter;
		double area;
		double framePrice = 0;
		double colourPrice = 0;
		double totalPrice;
		String price;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your length and width of the picture(in inche):");
		length = scan.nextDouble();
		width = scan.nextDouble();
		System.out.println("Enter your type of the frame(regular or fancy):");
		frameType = scan.next();
		System.out.println("Enter your choice of the frame colour(white or other):");
		colour = scan.next();
		System.out.println("Enter the number of crown(up to four):");
		crownNumber = scan.nextInt();
		
		if(frameType.equals("regular"))  //这里不能直接用 '=='
			framePrice = REGULAR_FRAME_PER_INCH;
		else if(frameType.equals("fancy"))
			framePrice = FANCY_FRAME_PER_INCH;
		else {
			System.out.println("Frame format error!");
			System.exit(0);
		}
		if(colour.equals("white"))
			colourPrice = 0;
		else
			colourPrice = COLOURING_FRAME_PER_INCH;
		perimeter = (length + width) * 2;
		area = length * width;
		totalPrice = perimeter * (colourPrice + framePrice)
				+ area * (GLASS_PER_SQUARE_INCH + CARDBOARD_PAPER_PER_SQUARE_INCH)
				+ crownNumber * CROWN;
		price = String.format("%.2f");
		System.out.println("Total price:" + price);
	}
}

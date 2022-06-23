package javapackage;

import java.util.Scanner;

public class Quotient_Reminder {
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.print("Enter the Dividend : ");
		int dividend = Input.nextInt();
		System.out.print("Enter the Divisor : ");
		int divisor = Input.nextInt();
		int quotient = dividend / divisor;
		int reminder = dividend % divisor;
		System.out.println("Quotient = " + quotient + " Reminder = " + reminder);
	}
}

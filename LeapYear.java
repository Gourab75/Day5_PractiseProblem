package javapackage;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		System.out.print("Enter Any Year : ");
		Scanner Input = new Scanner(System.in);
		int y = Input.nextInt();

		if (y % 400 == 0) {
			System.out.println(y + " is a leap year");
		} else if (y % 100 == 0) {
			System.out.println(y + " is not a leap year");
		} else if (y % 4 == 0) {
			System.out.println(y + " is a leap year");
		} else {
			System.out.println(y + " is not a lea year");
		}
	}
}

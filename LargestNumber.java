package javapackage;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter The Three Number : ");
		int A = Input.nextInt();
		int B = Input.nextInt();
		int C = Input.nextInt();
		if (A > B) {
			if (A > C) {
				System.out.println(+A + " is Greater ");
			} else {
				System.out.println(C + " is Grater");
			}
		} else {
			if (B > C) {
				System.out.println(+B + " is Greater ");
			} else {
				System.out.println(C + " is Grater");
			}
		}
	}
}

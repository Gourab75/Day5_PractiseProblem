package javapackage;

import java.util.Scanner;

public class SwapTwoNum {
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.print("Enter The Value of A : ");
		int A = Input.nextInt(); // 10
		System.out.print("Enter The Value of B : ");
		int B = Input.nextInt(); // 20
		System.out.println("Before Swaping " + A + " " + B);
		int temp = A; // temp = 10
		A = B; // A = 20
		B = temp; // 10
		System.out.println("After Swaping " + A + " " + B);
	}
}

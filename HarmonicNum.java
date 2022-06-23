package javapackage;

import java.util.Scanner;

public class HarmonicNum {
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = Input.nextInt();
		double sum = 0.0;
		while (n > 0) {
			sum += (1.0) / n;
			n--;
			System.out.println(sum);
		}
		System.out.println("Harmonic number is " + sum);
	}
}

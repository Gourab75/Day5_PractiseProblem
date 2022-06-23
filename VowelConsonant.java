package javapackage;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		System.out.println("Enter a character :");
		Scanner Input = new Scanner(System.in);
		char ch = Input.next().charAt(0);

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("Given character is an vowel");
		} else {
			System.out.println("Given character is a consonant");

		}
	}
}

package javapackage;

import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the x and y co-ordinate :");
		int a=scan.nextInt();
		int b=scan.nextInt();
		double distance=Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
		System.out.println("The distance from the origin is : "+ distance);

	}
}

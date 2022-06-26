package javapackage;

import java.util.Scanner;

public class WindChill {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the temperature not greater than 50 :");
			double t = scan.nextDouble();
			System.out.println("Enter the wind speed less than 120 or greater than 3: ");
			double v = scan.nextDouble();
			if (t < 50 && v < 120 && v > 3) {
				double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
				System.out.println("The windchill is :" + w);
				break;
			} else {
				System.out.println("Please enter the value within given range");
			}
		}
	}

}

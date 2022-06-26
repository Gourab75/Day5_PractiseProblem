package javapackage;

import java.util.Scanner;

public class Flipcoin {
	Scanner scan = new Scanner(System.in);

	 int setFlips() {
		System.out.println("Enter the number of flips: ");
		int flip = scan.nextInt();
		return flip;
	}
	 double random() {
		 double randomNumber=Math.random();
		 return randomNumber;
	 }
    double[] percentageCalculator(double a,double b) {
   	 double[] percentage= {(a/(a+b))*100,(b/(a+b))*100};
   	 return percentage;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int head = 0;
		int tail = 0;
		Flipcoin ob=new Flipcoin();
       int flips=ob.setFlips();
       while(true) {
       	  if(flips<0) {
             	System.out.println("Enter the positive integer");
             	flips=ob.setFlips();
             }	
       	  else {
       		  for(int i=0;i<flips;i++) {
       			  if(ob.random()<0.5) {
       				  tail+=1;
       			  }
       			  else {
       				  head+=1;
       			  }
       		  }
       		  
       		  break;
       	  }
       
       }
       System.out.printf("Percentage of tails: %.2f " ,ob.percentageCalculator(tail, head)[0]);
       System.out.println();
       System.out.printf("Percentage of heads: %.2f " ,ob.percentageCalculator(tail, head)[1]);
       }
	}


}

package javapackage;

import java.util.Random;
import java.util.Scanner;

public class TwodimArray {
	 void setArray(int[][] array) {
	    	Random randomInt=new Random();
	    	for(int i=0;i<array.length;i++) {
	    		for(int j=0;j<array[i].length;j++) {
	    			array[i][j]=randomInt.nextInt(100);   ////array will show only element within 100 
	    		}
	    	}
	    }
	    
	    void getArray(int[][] array) {
	    	
	    	for(int i=0;i<array.length;i++) {
	    		for(int j=0;j<array[i].length;j++) {
	    			System.out.printf("%d \t",array[i][j]);
	    		}
	    		System.out.println();
	    	}
	    }
	    
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scan=new Scanner(System.in);
	        System.out.println("Enter the dimension of array");
	        int m=scan.nextInt();
	        int n=scan.nextInt();
	        int[][] array=new int [m][n];
	        TwodimArray obj=new TwodimArray();
	        obj.setArray(array);
	        obj.getArray(array);
		}

}

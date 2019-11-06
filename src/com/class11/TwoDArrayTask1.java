package com.class11;

public class TwoDArrayTask1 {
 //Create a 2D array of integer type with 3 rows and 4 columns and print all values of the whole array.
	public static void main(String[] args) {
		
	
		 int sum=0;
	    int[][] allNumbers= {
	            {3,6,8},
	            {2,45,67},
	            {67,6,5},
	    };
	    for(int a[]:allNumbers) {
	        for(int b: a) {
	            sum=sum+b;
	            
	        }
	        
	    }
	    
	    System.out.println(sum);
}

}

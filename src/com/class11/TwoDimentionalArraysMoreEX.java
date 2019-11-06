package com.class11;

public class TwoDimentionalArraysMoreEX {

	public static void main(String[] args) {
		
	      int [] [] numbers= {
				{8, 7,5,3,8},
				{1,5,6,4,9,8},
				{3,6,8,0,7}
	      };
       for(int i=0; i<numbers.length;i++) {
    	   for(int j=0;j<numbers[0].length;j++) {
    		   System.out.println(numbers[i][j]+" ");
    	   }
    	   System.out.println();
       }
	}

}

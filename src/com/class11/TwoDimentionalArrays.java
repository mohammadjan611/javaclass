package com.class11;

public class TwoDimentionalArrays {

	public static void main(String[] args) {
		
		// to Declare 2D Array
		int[] [] array=new int [3] [4];
		
		// first row 
		array [0] [0]=44;
		array [0] [1] =80;
		array [0] [2]=33;
		array [0] [3]=20;
		
		// 2nd row
		array [1] [0]=10;
		array [1] [1]=5;
		array [1] [2]=7;
		array [1] [3]=8;
		
		// 3rd row
		array [2] [0]=10;
		array [2] [1]=9;
		array [2] [2]=70;
		array [2] [3]=6;
		System.out.println(array[1] [3]);
		
		
		int [] [] numbers= {
				{8, 7,5,3,8},
				{1,5,6,4,9,8},
				{36,8,0,7}
				
	};
		System.out.println("The value in index 1 and 4 is= "+numbers[1][4]);
		// to identify the numbers of Rows
		System.out.println("The numbers of Rows are:="+numbers.length);
		
		// To identify the numbers of Columns/elements in that row
		 System.out.println("The numbers of Rows are:= "+numbers[0].length);
		
		}
}
		// Task creat 2D array of string with 2 and 3 columns
		//String[] [] array1=new String [2] [3];
		// array1[0] [0]="Ahmad";
		// array1 [0][1]="Muhmood";
		
		

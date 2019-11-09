package com.class15;

import java.util.Arrays;

public class InterviewQuestion2 {

	public static void main(String[] args) {
		/*
		 * 2.Write a java program to find the  second larges tnumber in the array? 
		 * Maximum and minimum number in the array?
		 */
		int[] array= {100, -90, 8787, 898, 0,1 -90, 8787};
		// 1 easiest way 
		Arrays.sort(array);
		int min=array[0];
		int max=array[array.length-1];
		
		System.out.println(min);
		System.out.println(max);
		// 2 way
		int[] myArray= {100, -90, 8787, 898, 0,1 -90, 8787};
		int largest=myArray[0];
		int smallest=myArray[0];
		
		for (int i=0; i<=myArray.length; i++) {
			largest=myArray[i];
		
		if (myArray[i] > largest);
		largest = myArray[i];
		}
		
			
		}
		
	}
 



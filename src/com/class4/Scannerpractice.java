package com.class4;

import java.util.Scanner;

public class Scannerpractice {
	
	public static void main(String[] args) {
		// ask user to enter 2 number and then compare 
		// which is larger 
		Scanner keyboard=new Scanner(System.in);
		System.out.println(" please enter first number");
		int num1 = keyboard.nextInt();
		
		System.out.println(" please enter second number");
		int num2 = keyboard.nextInt();
		
		if (num1 > num2) {
			System.out.println(" is Larger than " + num2);
		}else if (num1 == num2) {
			System.out.println(" is equal "+ num2);
		}else {
			System.out.println(" is smaller than "+ num2);
			
		}
		
	}

}

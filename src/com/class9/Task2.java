package com.class9;

public class Task2 {

	public static void main(String[] args) {
		// print the following pattern
		// *
		// **
		// ***
		// ****
		// *****
		// ****
		// ***
		// **
		// *

		for (int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int k=4; k>=1; k--) {
			for(int l=1; l<=k; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

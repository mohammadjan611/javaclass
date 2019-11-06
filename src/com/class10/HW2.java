package com.class10;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		
		// write a gussing game where the user has tp guess a secret number between 1 and 20.
		// after every guess input, the program 
		
		Scanner scan;
		int secretNumber, guessNumber;
		scan=new Scanner(System.in);
		secretNumber=12;
		
		int secretNuber;
		do {
			System.out.println("please guess my number from 1 to 20");
			guessNumber = scan.nextInt();
			
			if (guessNumber< secretNumber) {
				System.out.println("your number is too small");
			}else if (guessNumber>secretNumber) {
				System.out.println("your number is too large");
			}
			} while (guessNumber !=secretNumber);
		System.out.println("congratulation you got it");
		
	}

}

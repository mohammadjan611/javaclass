package com.class8;

import java.util.Scanner;

public class Task1NEW {

	public static void main(String[] args) {
		
		// create a program that will be asking user to apply for a credit card 10 times .
					// as soon you get an "yes" from a user program should stop asking.
					String card;
					Scanner scan = new Scanner(System.in);
			        for (int cc=1;cc<=10;cc++) {
			            System.out.println("Would you like to apply for cridit card");
			             card= scan.nextLine();
			            if (card.equalsIgnoreCase("Yes")) {
			                break;
					
				}
				}
				}

		

	}


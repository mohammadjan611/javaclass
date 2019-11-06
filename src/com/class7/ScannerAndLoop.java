package com.class7;

import java.util.Scanner;

public class ScannerAndLoop {

	public static void main(String[] args) {
		
		/* sask user to enter name 5 timee
		 * and our output should be "Good afternoon______"*/
		
		Scanner scan=new Scanner(System.in);
		int i =5;
		while(i < 10) {
			System.out.println("please enter your name");
			String name = scan.nextLine();
			System.out.println("Good afternoon "+ name);
			i++;
			
		}

	}

}

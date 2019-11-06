package com.class4;

import java.util.Scanner;

public class Task2 {
	
	public static void main(String[] args) {
		
		/*  Write a program to ask user to enter numbers of worked years and annual salary. 
		 * If userworked for more or equals to 5 years than useris eligible for the bonus,
		 *  otherwise he is not.Once
		 *   user is eligible and salary is larger than50000 than bonus = 5000, otherwisebonus=3000.
		 */
	
		Scanner scan=new Scanner(System.in);
		 System.out.println("please entter the number of the years worked ");
		 int years=scan.nextInt();
		 if (years>=5) {
		 System.out.println("you are eligible for bonus");
		 
		 System.out.println("please enter your salary");
		  int salary=scan.nextInt();
		 if (salary>50000) {
			 System.out.println("your bonus is 50000");
		 }else {
			 System.out.println("you bonus is 3000 ");
				 
			 }
	}else {
			 System.out.println("you are not eligible for bonus");
		 
			 
		 }
		 
		 
		 
		
		
	}

}

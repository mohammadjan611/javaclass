package com.Class5;

import java.util.Scanner;

public class LogicalAndsSanner {

	public static void main(String[] args) {
		
		/* ask user to enter age 
		 *  if age is from 1 to 3 --> you are a baby
		 *  if age from 3-5 --> you are toddler 
		 *  if age from 5-12 --> you are kid
		 *  if age from 12-19 --> you re teenager 
		 *  if age >20 --> you are an adult
		 */
          int age;
          Scanner scan;
          scan=new Scanner(System.in);
		  System.out.println("please enter your age");
		   age=scan.nextInt();
		   
		   if (age>=1 && age<=3) {
			   System.out.println("you are a baby");
		   }else if (age>3 && age <=5) {
			   System.out.println("you are a toddler ");
		   }else if(age>5 && age<=12) {
			   System.out.println("you are a kid");
		   }else if(age>12 && age <=19) {
			   System.out.println("you are a teenager");
		   }else if (age>19) {
			   System.out.println("you are a adult");
		   }else {
			   System.out.println(" Invalid age entered");
			   
			   
		   
		   
		  
		  }
	}

}

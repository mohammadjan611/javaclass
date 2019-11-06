package com.class13;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your class day:: ");
		String day=scanner.nextLine();
		
		if (day.equals("Staruday")) {
			System.out.println("Staruday is your Java class");
		}else if (day.equals("Sunday")) {
			System.out.println("Sunday is your Git class");
		}else if(day.equals("Tuesday")) {
			System.out.println("Tuseday is your SDLC class");
		}else if (day.equals("thursday")) {
			System.out.println("Thursday is your Manual Testing class");
		}else {
			System.err.println("Envalid Entry!! please enter a valid class day");
		}
		scanner.close();
		
			
		}
		

	}



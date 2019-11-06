package com.class7;

public class WhileLoop {

	public static void main(String[] args) {
		
		int time=8;
		
		if (time<12) { // Good morning is true
			System.out.println("Good morning");
			
		}
		System.out.println("----");
		while (time <12) { // while condition is true
			System.out.println("Good morning");
			time++;
			
		}

	}

}

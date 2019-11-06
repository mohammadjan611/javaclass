package com.class8;

public class BreakAndContinue {

	public static void main(String[] args) {
		// break keyword break/exist the loop
		for (int I=0; I<10; I++) {
			if(I==7) {
				break;
				
			}
			System.out.println(I);
		}
		System.out.println("I am outside of the loop");
		
        // continue - it will skip current iteration
		
		for (int i=1; i<=5; i++) {
			if (i==2) {
				continue;
				
			}
			System.out.println(i);
			
			System.out.println("*******************");
			
			
			
			
			//////      Let's work on this at home ......?????
			// I want to print nums from 1 to 20 except 5, 6,,7
			for (int a =1; a <=20; a++) {
				if (a == 5 || a == 6 || a ==7 ) {
					continue;
					
				}
				System.out.println(a);
			}
			
			
		}
	}

}

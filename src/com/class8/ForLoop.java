package com.class8;

public class ForLoop {

	public static void main(String[] args) {
		
		// Say good morning 5 times
		// initialize: test condition,  increment
		
		
		for (int i=0; i<=4; i++ ) { 
			System.out.println( "Good moring");
			
			// print numbers from 1-10
			for (int Y=1; Y<=10; Y++) {
				System.out.println(Y);
				
				// print number from10-1
				for (int C=10; C>=1; C--) {
					System.out.println(C);
					
					// 5, 10 ,15 , 20
					for (i=10; i<=50; i+=5) {
						System.out.println(i);
					}
				}
			}
			
			
			
			
		}
		

	}

}

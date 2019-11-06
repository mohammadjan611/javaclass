package com.class9;

public class Pyramid {

	public static void main(String[] args) {
		
		// *
		// **
		// ***
		// ****
		// *****
		
		for(int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
			//print number
			// 1
			// 12
			// 123
			// 1234
			// 12345
			
			for(int e=1; e<=5; e++) {
				for(int d=1; d<=e; d++) {
					System.out.print(d);
				}
				System.out.println();
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@");
				
				//print number
				// 1
				// 22
				// 333
				// 4444
				// 55555
				// 666666
				// 7777777
				// 88888888
				// 999999999
				
				for (int j=1; j<=9; j++) {
					for(int f=1; f<=j; f++) {
						System.out.print(f);
					}
					System.out.println();
					
					System.out.println("^^^^^^^^^^^^^^^^^^^");
					
					//print upside down
					// 999999999
					// 88888888
					// 7777777
					// 666666
					// 55555
					// 4444
					// 333
					// 22
					// 1
					
					for (int y=9; y>=0; y--) {
						for(int g=1; g<=y; g++) {
							System.out.print(y);
							
						}
						System.out.println();
					}
				}
			}
		}

	}

}

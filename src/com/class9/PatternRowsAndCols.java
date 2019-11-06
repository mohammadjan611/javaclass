package com.class9;

public class PatternRowsAndCols {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) { //rows
			for(int y=0; y<10; y++) { // colms
				System.out.print("*");
			}
			System.out.println();
			
		}
		// print
		/* 12345
		 * 12345
		 * 12345
		 * 12345
		 * 12345
		 */
		
        for (int i=0; i<5; i++) {
        	for (int j=0; j<6; j++) {
        		System.out.print(j);
        	}
        	System.out.println();
        	System.out.println("################");
        	// print
    		/* 11111
    		 * 22222
    		 * 33333
    		 * 44444
    		 * 55555
    		 */
        	
        	for (int e=1; e<=5; e++) {
        		for(int j=1; j<=5; j++) {
        			System.out.print(e);
        		}
        		System.out.println();
        		System.out.println("&&&&&&&&&&&&&");
        		
        		//print 
        		/* 123456789
        		 * 123456789
        		 * 123456789
        		 * 123456789
        		 * 123456789
        		 */
        		
        		for(int s=1; s<=5; s++) {
        			for(int q=1; q<=9; q++) {
      				System.out.print(q);
        			}
        			System.out.println();
        		}
        	}
        }
	}

}

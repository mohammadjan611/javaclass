package com.class8;

public class TaskLoop1 {
	
	public static void main(String[] args) {
		
		// print number from 1-100 in one lane 
		
		for (int i=1; i<=100; i++) {
			System.out.print(i+" ");
			
			
			
			// from 100-1
			for (int q=100; q>1; q--) {
				System.out.println(q);
				
				System.out.println("********************");
				// what is th output
				int sum =0;
				for (int I =1; i <= 5; I++) {
					sum = sum + I;
					System.out.println(sum+"+");
					
					System.out.println();
					System.out.println(sum); //
					
					
					
					
					
					
					System.out.println("********************");
					
					/*
					 * Print odd numbers between 20 and 50 (2 ways)
					 */
					for (int a = 21; a <= 50; a += 2) {
						System.out.println(a);
					}
					// 2 way
					for (int b = 20; b <= 50; b++) {
						
							System.out.println(b);
					}
					
					
					
					
					
					
					
					System.out.println("*********************");
					// what is the output
					int Sum = 0;
					for (int c = 1; c <= 5; c++) {
						sum = sum + c;
						System.out.print(sum+ "+");
					}
					System.out.println();
					System.out.println(sum);//
					
					System.out.println("*********************");
					// what is the output
					int sumAll=0;
					
					for (int d=0; d<=20; d+=5) {//0, 5, 15, 20
						sumAll=sumAll+d;
					}
					System.out.println(sumAll);
					
					System.out.println("*********************");
					// what is the output
					int total=2;
					
					for (int y=1; y<=3; y++) {
						total=total*y;//2=2*1; 4=2*2; 12=4*3
					}
					System.out.println(total);
					
					
					
				}
			}
		}
		
	}

}

package com.class7;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		
		/* you need to ask user to pay for coffe
		 * you need to keep asking user to pay for it until
		 * entered price is equal =5;
		 * After user paid then say "Enjoy your coffe!"
		 */
		
		Scanner  scan=new Scanner (System.in);
		int price;
		
		do {
	
			System.out.println("please Pay for coffee");
			price=scan.nextInt(); 
			
			price++;      
        }while(price!=5);
        System.out.println(" Thanks you and enjoy your coffee");
        
        // 2nd way with while 
        int price1;
        System.out.println("please pay for your coffee");
        price1=scan.nextInt();
        
        while(price1!=5) {
        
    }
	  System.out.println("Enjoy your coffee");
	  

	}

}
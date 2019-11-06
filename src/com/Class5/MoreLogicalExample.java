package com.Class5;

import java.util.Scanner;

public class MoreLogicalExample {

	public static void main(String[] args) {
		
		/* ask use to enter daily sales
		 * based on the sales rang we want give commision to the person 
		 * if sales is <100 --> commission is 10%
		 * if sales if between 100-200 --> commission of 20%  
		 * etc....
		 */
         Scanner scan;
         double salesAmount;
         double  commission;
         scan=new Scanner(System.in);
         System.out.println("please enter your sales amount ");
         salesAmount=scan.nextDouble();
         
         if (salesAmount<100) {
        	 //lets give user 10% commission of a sale
        	 commission=salesAmount*0.1;
         }else if (salesAmount >=100 && salesAmount <200) { 
        	 //let give user 10% commission of  sale 
        	 commission =salesAmount*0.2;
         }else if (salesAmount >=200 && salesAmount<500) {
        	 commission =salesAmount*0.3;
        	 
        	 
        	 
        	 
         }
         
	}

}

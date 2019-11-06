package com.class7;

public class Task2 {

	public static void main(String[] args) {
		
		/*Create a boolean variable workDay and assign true create int variable day and assign it to 1
          * As long as it is workDay print “I need a day off” and increase day.
         * Once day is 6 or 7 print “I do not need a day off any more”
         */
		boolean worday=true;
		int day=1;
		while (day<=5) {
			System.out.println("I need a day off");
			day++;
			
		} 
		System.out.println("I do not need a day off");
		    
		// 2nd way to do teacher way ....
		
		boolean workday=true;
		int day1=1;
		while (workday) {
	
			if(day1 == 6) {
				workday =false;
				System.out.println("I do not need a day of anymore");
			}else {
			} System.out.println(" I need a day off");
				
		        day1++;
		
		} 
	
		
	}

}

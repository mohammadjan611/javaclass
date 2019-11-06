package com.Class5;

public class LogicalOr {
	
	public static void main(String[] args) {
		
		//7 days a week 
		// if days is 2 or 4 --> SDLC class
		// if days 6 or 7 --> Java class 
		// if day 1 or or 5 --> no class 
		// if day =3 --> review class
		
		int day =6;
		// falsse OR false --> false 
		if (day==2 || day==4) {
			System.out.println("SDLC class");
			// true OR false --> true 
		}else if (day==6 || day==7) {
			System.out.println("Java class");
			// false OR false --> false 
		}else if (day==1 || day==5) {
			System.out.println("No class");
		}else if (day==3) {
			System.out.println("Review class");
		}else {
			System.out.println("Not a valid day");
			}
		//7 days a week 
		// if days is Tuesday  or Thursday --> SDLC class
		// if days Saturday or Sunday --> Java class 
		// if day monday or or friday --> no class 
		// if day =wednesday --> review class
		
		String weekDay="Sunday";
		if (weekDay.equals("Tuesday") || weekDay.equals("Thursday")) {
			System.out.println("SDLC class");
		}else if (weekDay.equals("Saturday") || weekDay.equals("Sunday")) {
			System.out.println("Java class");
		}else if (weekDay.equals("Monday") || weekDay.equals("friday")) {
			System.out.println("No class");
		}else if (weekDay.equals("wednesday")) {
			System.out.println("Review class");
		}else {
			System.out.println("Not a valid day");
			
			
			
		}
	}

}

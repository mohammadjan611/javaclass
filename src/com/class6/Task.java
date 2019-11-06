package com.class6;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {

		Scanner scan;
		String season;
		 scan=new Scanner(System.in);
		System.out.println("Month of born");
		season  =scan.nextLine();

		if (season.equals("January") || season.equals("February") || season.equals("December")) {
			season = "winter";
			
		} else if (season.equals("March") || season.equals("April") || season.equals("May")) {
			season = "Spring";
			
		} else if (season.equals("June") || season.equals("Jule") ||season.equals("August")) {
			season = "Summer";
		} else if (season.equals("September") || season.equals("October") || season.equals("November")) {
			season = "Fall";
		} else {
			season= "Unknown";
		}
		System.out.println("You were born in " +season);
		System.out.println(season);

	}

}

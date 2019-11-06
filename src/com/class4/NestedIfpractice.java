package com.class4;

public class NestedIfpractice {

	public static void main(String[] args) {

		boolean isFriday = true;
		int day = 14;
		// if todsy is friday only day i want to check if it day is 13
		if (isFriday) {
			System.out.println("Today is friday ");
			if (day == 13) {
				System.out.println("I will watch scary movies ");

			} else {
				System.out.println("Today is Not friday");

			}
		}
	}

}

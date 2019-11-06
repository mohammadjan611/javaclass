package com.class14;

public class Task2 {

	public static void main(String[] args) {
		 /* Create a String that should be combination of letters, numbers and
		  *  special characters. Find out how many
		  *  alpha characters are there in the String.
		  */
           
		 String str1= "9876$%^5Wha**^&t432Is123your1258746name";
	        System.out.println(str1.replaceAll("\\w", "" ));
	        String str2=(str1.replaceAll("[^A-Za-z]", ""));
	        System.out.println(str2.length());

          
	}

}

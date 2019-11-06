package com.class13;

public class TaskReverseString {

	public static void main(String[] args) {
		/*
		 * Create a String and print it in reverse order (Sunday → yadnuS).
		 */
          String day="Sunday";
          
         // System.out.println(day.charAt(4)+" "+day.charAt(5)+" "+day.charAt(3));
          
          System.out.println(day.length());
          
          for(int i=day.length()-1; i>=0; i--) {
        	  System.out.print(day.charAt(i));
          }
          
          
		
	}

}

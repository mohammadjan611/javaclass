package com.class14;

public class Taske3 {

	public static void main(String[] args) {
		/*You have a String a=Is it saturday? Is it raining? Do we have a Java Class today?”
		 *  How would you find out how many sentences are in that String?
		 */
               String c="Is it saturday? Is it raining ? Do we have a Java Class today?";
	    
	    String []array=c.split("\\?");
	    for (int i=0; i<array.length;i++) {
	        
	    }System.out.println(array.length);
	}

}

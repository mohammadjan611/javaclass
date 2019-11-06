package com.class14;

public class SplitMethod {

	public static void main(String[] args) {
		/*.split()
		 * This method splits this string around matches of the given regular expression.
		 */
		
		//split the following string into array of strings/work
		String str="Video provides a powerful way to help you prove your point.";
		
		String[] array=str.split(" ");
		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
			
			System.out.println("*****************");
			// How can we find how many sentences are the follwing string 
			String str1="Today is sunday. its sunny say. and we are having java class";
			String [] array2=str1.split("\\.");
			System.out.println("This number of sentences in the string is::"+array2.length);
			
			// for (String string : array2) {   // 2nd wayy is the   
			// System.out.println(string.trim()); // you can removed the space both way 
			// }
			
	}
	}
}


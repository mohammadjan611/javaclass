package com.class13;

public class ReplaceMethodString {

	public static void main(String[] args) {
		/*. areplace()
		 * This method returns a new string resulting
		 * from replacing all occurrences of oldChar in this  string with newChar.
		 * 
		 */
		
		String str="Hello Dear Jan, how are you , how you  been?";
		String str1="12-22-1990"; //2/22/1990
		/*. areplace()
		 * This method returns a new string resulting
		 * from replacing all occurrences of sequence of in this   string with newCharsequence.
		 * 
		 */
		System.out.println(str.replace("n ", " z"));
		System.out.println(str1.replace('-', '/'));
		
		System.out.println("=========");
		System.out.println(str.replace("Jan", "Moh"));
		
		System.out.println("=========");
		System.out.println(str.replaceFirst("Jan", "Samir"));
		
		
		
	}

}

package com.class12;

public class StringMiniPulitonDemo2 {

	public static void main(String[] args) {
		
		/*
		 *. contains ();
		 * This method  searches the sequence of characters in the string.
		 * If the sequences of characters are found
		 * then it returns true otherwise returns false
		 */
		String sentence="It was raining";
		String sen="raining";
		System.err.println(sen.contains(sentence));
		
		System.out.println(sentence.contains("was"));
		
	}

}

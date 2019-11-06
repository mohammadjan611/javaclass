package com.class13;

public class RegularExpressions {

	public static void main(String[] args) {
		
		String str="1423Hel235648lo45632147"; // Hello
		System.out.println("=============");
		
		System.out.println(str.replaceAll("[0-9]","")); // Leave only text //  ^  mean not
		
		System.out.println(str.replaceAll("[a-zA-Z]","")); // leave only numbers 1234568912554
          
		
		// Remove everything except text and numbers
		
		String str2="Hi#$%^&&**HOW@#$%^&4521452152";
		System.out.println(str2.replaceAll("[^a-zA-Z0-9]", ""));
		
		System.out.println("=============");
		System.out.println(str2.replaceAll("\\w", ""));
	
	}
}

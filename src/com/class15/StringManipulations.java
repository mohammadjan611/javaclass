package com.class15;

public class StringManipulations {

	public static void main(String[] args) {
		
		// String class come in java Lang package 
		// 2 way to creat the string  a String
		// Frist way using string Literal
		String str="Hello";
		
		// Second way  using new keywword - creating a string object 
		String str1=new String("Hello");
		System.out.println(str);
		System.out.println(str1);
		
		// find the number of characters inside the string 
		int lengt=str.length();
		System.out.println(lengt);
		// case coversion methods/functions 
		str=str.toLowerCase().toUpperCase();// HELLO
		System.out.println(str);//HELLL
		
		// verify if there if the string is Empty
		String myString="";
		boolean isEmpty=myString.isEmpty();
		System.out.println(isEmpty);
		
	    String myString1=null; // no value at all it is equal to 
		// String myString1;
		System.out.println(myString1.isEmpty());
		
		// how to verify existence of characters in the string
		String a="Good evening students";
		boolean exsit=a.contains("student");
		System.out.println(exsit);
		
		System.out.println(a.startsWith("Good"));
		System.out.println(a.endsWith("student"));
		
		

	}

}

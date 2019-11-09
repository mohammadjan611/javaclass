package com.class15;

public class SrtingMoreExamples {

	public static void main(String[] args) {

     String str="Syntax Rechnologies";
     //get a character at specific location
     String str1="Syntax Technologies Inc";
     
     char letter=str1.charAt(5);
     System.out.println(letter);
     //length =19
     //System.out.println(str.charAt(str.length()));//StringIndexOutOfBoundsException
     System.out.println(str1.charAt(str1.length()-1));
     
     //get a substring from a String
     //Syntax
     String substr1=str1.substring(0, 6);
     System.out.println(substr1);
     //Technologies Inc
     String substr2=str1.substring(7);
     System.out.println(substr2);
	}

}

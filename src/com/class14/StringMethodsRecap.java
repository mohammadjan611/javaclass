package com.class14;

public class StringMethodsRecap {

	public static void main(String[] args) {
		
		//.Replace
         String str=" your Syntax Technologies is your place to study";
         System.out.println(str.replace('y', 'i'));
         
         System.out.println("*********************");
         System.out.println(str.replace("your", "My"));
         
         System.out.println("*********************");
         // Replace all
         String str2="Video provides a powerful way to help you prove When you click Online Video";
         System.out.println(str.replaceAll("way", ".*")); // anything or after that  this .* mean
         
         System.out.println("*********************");
         
         String str3="23423HELL3049o^#*^&*$%$@";
         System.out.println(str3.replaceAll("[0-9]", "")); //use this for numbers...
         System.out.println(str3.replaceAll("[^A-z]", "")); // use this way for Alphabic 
         
         System.out.println("*********************");
        // String str2="Video provides a powerful way to help you prove When you click Online Video";
         System.out.println(str2.replaceFirst(" ", ""));
         System.out.println(str3.replaceAll("\\w", ""));
         
	}

}

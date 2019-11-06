package com.class13;

public class Task2Secondway {

	public static void main(String[] args) {
		
	    /*
         * Create a String and if the String is not empty perform the following: if the
         * String has an odd number of characters and has 3 or more characters, print
         * the character in the middle of the String.
         */
        
    
        
        String str1="Hellourwewr";
        
        int lenght=str1.length();
        int middle=str1.length()/2;
        
        System.out.println();
        if(!str1.isEmpty()) {
            if(lenght%2!=0 && lenght>=3) {
                System.out.println(str1.charAt(middle));
            
            }
        }
        
        
     
        int a=5%2;
        System.out.println("=====");
        System.out.println(a);
        
        
    }

		
	}


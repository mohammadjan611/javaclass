package com.class14;

public class SpliteMethod2 {

	public static void main(String[] args) {
		
		// how to separate comma delimated string . mean removed comma....
		
		String str="If you come to class early, then you can study more, also u can learn more,"
				+ " and u can leave early";
		String [] array=str.split(",");
		for (int i =0; i<array.length; i++) {
			System.out.println(array[i]);	
		}
		
        System.out.println("*************");
        
        
        String str1="Welcome to Syntax Technologies";
       String [] array2=str1.split(" ", 3);
       System.out.println(array2.length);
       
       for (int i =0; i <array2.length; i++) {
    	   System.out.println(array2[i]);
       }

	}

}

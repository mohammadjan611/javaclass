package com.class13;

public class Recap2 {

	public static void main(String[] args) {
		String str1="Hello";
		String str2="Hello";
		

		System.out.println(str1.equals(str2)); // true
		System.out.println(str1.equalsIgnoreCase(str2)); // Inore case
		System.out.println(str1==str2);
		
		
		String str3=new String("Bye");
		String str4=new String("Bye");
		
		System.out.println("==============");
		
		System.out.println(str3.equals(str4)); // True   you have add new key word that Y it different
		System.out.println(str3==str4);  // it will give you the false respond .
		
		/// contains method
		System.out.println("&&&&&&&&&&&&&&=");
		
		System.out.println(str1.contains("zz"));
		
		System.out.println(">>>>>>>>>>>StartsWith and Endwith<<<<<<<<<<<<");
		
		String str5="Today is Saturday";
		System.out.println(str5.startsWith("Today"));
		System.out.println(str5.endsWith("day"));
		
		System.out.println(">>>>>>>>>>> concat <<<<<<<<<<<<");
		System.out.println(str5.concat("and we have java class"));
		
		System.out.println("&&&& trime &&&&&&&");
		String str6="  it is sunny    ";
		System.out.println("Before triming: "+str6);
		System.out.println(str6.trim());
		
		System.out.println(">>>>>>>>>>> Index of and charAt <<<<<<<<<<<<");
		
		String str7=" tomorrow we will be done with string Manipulation";
		System.out.println(str7.indexOf('e'));    // if it give you -1 it mean the number is not present
		System.out.println(str7.indexOf('e', 11));
		System.out.println(str7.indexOf("we")); // wich index you looking for we it is 11
		
		System.out.println(str7.charAt(10));  // which charector you askeing for 10 it is w..
		
		
		
		
		
		
		
	}

}

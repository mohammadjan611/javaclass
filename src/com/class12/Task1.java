package com.class12;

public class Task1 {

	private static String sentence;

	public static void main(String[] args) {
		
		// creat two String and initialize them with some value.
		// implement the follwing methods on those strings.
		
      /*
       * sen.length();
       * sen.equals();
       * sen.contains(s);
       * sen. toLowerCase();
       * sen.EqulasIgnoreCaase(anotherString);
       */
		String a = "Java classes";
        String b = "Realy  Java classes";
        System.out.println(a.length());
        System.out.println(b.length());
        System.out.println("____________________________");
        
        boolean isEqual = a.equals(b);
        System.out.println(isEqual);
        boolean isEqualTo = b.equalsIgnoreCase(a);
        System.out.println(isEqualTo);
        
        System.out.println("____________________________");
        
        System.out.println(a.contains("Java"));
        System.out.println(b.contains("Classes"));
        String sen = "classes";
        System.out.println(a.contains(sen));
        System.out.println("____________________________");
        
        System.out.println(a.toLowerCase());
        System.out.println(b.toUpperCase());
        System.out.println(a.toUpperCase());
        System.out.println("____________________________");
        
	}

}

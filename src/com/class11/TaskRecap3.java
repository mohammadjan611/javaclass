package com.class11;

public class TaskRecap3 {

	
 // Create an array of countries. While retrieving all values from an array print capital for each
	//	country. (use 2 different loops).
	public static void main(String[] args) {
		
       String[] capital= {"Kabul","WASHINGTON","Ankara", "INDIA"};
        
        
        String[] country= {"Afghainstan","USA","Turkey", "New Delhi"};
        for(int i=0; i<country.length; i++) {
            
            
            System.out.println(country[i]+"'s capital is "+capital[i]);            
                // 2nd WAY
           
            String [] countries= {"India", "Canada" ,"USA"};
            for (String getCountry : countries) {
            	if (getCountry.equals("USA"));
            	String[] capitals =countries ;
				System.out.println("capital is "+capitals[1]);
            }
        }
	}
}

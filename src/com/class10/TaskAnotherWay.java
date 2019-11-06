package com.class10;

public class TaskAnotherWay {
	
	/*Create an array of countries. 
	 * While retrieving all values from an array 
	 * print capital for each country.*/

	public static void main(String[] args) {
		
		String[] countries= {"Afghanistan", "Colombia","USA", "Russia", "Turkey"};
		for(int i=0; i< countries.length; i++) {
			switch (countries[i]) {
			case "Afghanistan":
				System.out.println("Kabul");
				break;
			case "Colombia":
				System.out.println("Bogota");
				break;
			case "USA":
				System.out.println("Washington DC");
				break;
			case "Turkey":
				System.out.println("Ankara");
				break;
			case "Russia":
				System.out.println("Moscow");
				break;
			}
		}
	}
}

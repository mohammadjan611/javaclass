package com.class10;

public class TaskCuntry {

		/*Create an array of countries. 
		 * While retrieving all values from an array 
		 * print capital for each country.*/
			
			public static void main(String[] args) {
				String[] countries= {"Afghanistan", "Colombia","USA", "Russia", "Turkey"};
				for(int i=0; i< countries.length; i++) {
					
					if(countries[i].equals("USA")) {
						System.out.println("Washington DC");
					}else if(countries[i].equals("Russia")) {
						System.out.println("Moscow");
					}else if(countries[i].equals("Turkey")) {
						System.out.println("Ankara");
					}else if(countries[i].equals("Afghanistan")) {
						System.out.println("Kabul");
					}else if(countries[i].equals("Colombia")) {
						System.out.println("Bogota");
					}
				}
			}
		}
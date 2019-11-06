package com.class10;

public class GetAllValues {

	public static void main(String[] args) {
		// i want to print all values from an array
		// when value is dog--> I love dogs
		String[] animals= {"cat","Dog", "cow", "snake", "elephant"};
		for(int i=0; i<animals.length; i++) {
			if(animals[i].equals("Dog")) {
			System.out.println("I love Dog");
		}else {
			System.out.println(animals[i]);
		}
		

	}
	}
}

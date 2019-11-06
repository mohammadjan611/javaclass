package com.class10;

public class ArrayIntro {

	public static void main(String[] args) {
		
		int a;
		a=10;
		
		int a1=10;
		// 1 way
		int [] b; // declare an array --> preferred way 
		int c[];
		
		b=new int[4]; // initialize an array
		// 2 way --> all in 1 line(declaration & initialization)
		int [] array=new int[4]; 
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
		// access value from an array
		System.out.println(array[2]);
		
		// lets creat an array that will store classes
		
		String [] classes=new String[4];
		classes[0]="Java";
		classes[1]="SDLC";
		classes[2]="Manual Testing";
		classes[3]="GIT";
		//Today we have Java class
		System.out.println("Today we have"+classes[0]+" class");
		
		int [] num=new int[3];
		num [0]=1;
		num [1]=2;
		num [2]=3;
		// how can change 1 to 100
		num[0]=100;
		System.out.println(num[0]);
		System.out.println(num[0]+num[2]); //100+3
		// the size of an array is fixed
		String[] names=new String[3];
		names [0]="Jan";
		names [1]="Muhammad";
		names [2]="Samir";
	  //names [3]="Mudasir"; during run time we will get an exeception
		//ArrayIndexOutOfBoundsException
		
		//System.out.println(names[3]);
		
		// we are putting less elemets inside 
		//--> compiler will give default value
		double[] numbers=new double[4];
		numbers[1]=100;
		numbers[3]=200;
		
		System.out.println(numbers[0]);
		
		
		
		
	}

}

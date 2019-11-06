package com.class10;

public class Task1 {

	public static void main(String[] args) {
		
		char[] grades=new char[6];
		grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='E';
		grades[5]='F';
		
		System.out.println(grades[2]);
		
		
		String[] names= {"Jamil", " Musawir", "Modasir" , " Safia"};
		System.out.println("My name is " + names [2]);
		
		for (int i=0; i<grades.length; i++) {
			System.out.println(grades[i]);
			
		}
		System.out.println("---------------");
		String[] animals= {"cat","Dog", "cow", "snake", "elephant"};
		int size=animals.length;
		 
		for(int i=0; i<size; i++) {
			System.out.print(animals[i]+" ");
		}
		// 
		String [] words=new String[5];
		     words[0]="Java ";
	         words[1]="Saturday ";
	         words[2]="day.";
	         words[3]="coding ";
	         words[4]="is ";
	         
	         System.out.println(words[1]+ words[4]+ words[0]+ words[3]+words[2]); 
		
	    
		
		
		

	}

}

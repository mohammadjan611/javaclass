package com.class11;

public class TwoDArraysDemo2 {

	public static void main(String[] args) {
		
		String [] [] names= {
				{"khan", "Yousef","Alex","Zynab","jan"},
				{"Mohammad","Ann","Samir","Weqas"},
				{"Diago","Asif","Zubair","Shogofa"},
		};
		int lenghtofRows=names.length;
		System.out.println(lenghtofRows);
		
		int lenghtofCols=names[1].length;
		System.out.println(lenghtofCols);
		
		for(String getArray[]: names) {
			for(String getName: getArray) {
				System.out.print(getName+" ");
				
			}
			System.out.println();
				
		}

	}

}

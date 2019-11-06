package com.class12;

import java.util.Scanner;

public class Taske1 {

	public static void main(String[] args) {
		int [] array2= {2,5,4,7};
		for (int i:array2) {
			System.out.println(i);
	}
    int [] arr=new int[3];
    Scanner scan=new Scanner(System.in);
    for (int i=0; i<arr.length; i++) {
    	arr[i]=scan.nextInt();
    }
    for (int i=0; i<arr.length; i++) {
    	System.out.println(arr[i]+" ");
    }
}
}
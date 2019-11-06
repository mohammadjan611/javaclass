package com.class11;

import java.util.Arrays;

public class NumberSort {

	public static void main(String[] args) {
		
        int[] numbers= {123,34,15,66,99};
        
        for(int i:numbers) {
            System.out.print(i+" ");
        }
        
        System.out.println();
        System.out.println("***********");
        
        
        Arrays.sort(numbers);
        for(int i:numbers) {
            System.out.print(i+" ");
        }
		

	}

}

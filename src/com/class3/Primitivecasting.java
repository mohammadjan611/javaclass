package com.class3;

public class Primitivecasting {
	
	public static void main(String[] args) {
		
		double d=12;
		System.out.println(d);
		//int i=112.0; compile time error
		//widening or automatic or implicit casting 
		
		byte b=127;
		int i=b;
	
		int num=123;
		double d1=num;
		System.out.println(d1);
		
		//narrowing or explicit or manual casting 
		
		double d2=123.56;
		int num2=(int)d2;
		System.out.println(num2); // we manually change it ot int otherwise will show error .
		
		int num3=789;
		byte b1=(byte)num3;
		System.out.println(b1);  // change num3 int to byte manually . we can not put big bucket 
		                         // into small buckett.
		
				
		
	}

}

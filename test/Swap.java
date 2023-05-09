package com.test;

public class Swap {

	public static void main(String[] args) {
		int a=10;
		int b= 20;
		//using 3rd variable
		
		System.out.println("before swapping using third variabale a= "+a+" b="+b);
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping using third variabale a= "+a+" b="+b);
		
		System.out.println("---------------------------------------------");
		System.out.println("before swapping without using third variabale ");
		System.out.println("a="+a+" b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping without using third variabale ");
		System.out.println("a="+a+" b="+b);
		
	}
}

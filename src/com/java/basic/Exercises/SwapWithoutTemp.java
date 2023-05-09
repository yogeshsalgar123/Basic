package com.java.basic.Exercises;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		System.out.println("first value a before swapping :" +a);
		System.out.println("second number b before swapping :" +b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swapping new a after swapping :" +a);
		System.out.println("After Swapping new b after swapping : " +b);

	}

}

package com.test;

import java.util.Scanner;

public class InputFromUser {
	public static void main(String[] args) {
		//int float string char
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter integer number: ");
		int num1 = sc.nextInt();
		
		
		System.out.println("please enter float number: ");
		float num2=sc.nextFloat();
		
		
		System.out.println("please enter String: ");
		String str= sc.next();
		
		
		System.out.println("please enter character: ");
		char ch= sc.next().charAt(0);
		
		
		
		
		System.out.println("your result is: ");
		System.out.println("int: "+num1 +" "+"float: "+num2 +" "+"String: "+str+" "+"char: "+ch);
	}
}

package com.java.numbers;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		
		System.out.println("enter the number");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		double sqrt = Math.sqrt(num);
		
		System.out.println(sqrt);

	}

}

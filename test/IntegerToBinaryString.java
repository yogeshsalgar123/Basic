package com.test;

public class IntegerToBinaryString {
	public static void main(String[] args) {
		int num= 8;
		
		String binary=Integer.toBinaryString(num);
		System.out.println("binary String of "+num+" is="+binary);
	}
}
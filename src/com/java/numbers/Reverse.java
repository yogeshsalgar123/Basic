package com.java.numbers;

public class Reverse {
	public static void main(String[] args) {
		int num=123;
		int rev=0;
		while(num != 0)
		{
			rev=num%10;  
			System.out.println(rev); 
			System.out.println(num);
			num=num/10; 
			 
		}
	}

}

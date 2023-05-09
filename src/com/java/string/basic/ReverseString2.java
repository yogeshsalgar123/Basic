package com.java.string.basic;

public class ReverseString2 {

	public static void main(String[] args) {
		
		String str = "Yogesh Salgar";
		String reverse = "";
		
		int len = str.length();
		
		for(int i=len-1;i>=0;i--)
		{
			reverse = reverse + str.charAt(i);	
		}
		System.out.println("original String = " +str);
		System.out.println("reversed String  " +reverse);
		
	}

}

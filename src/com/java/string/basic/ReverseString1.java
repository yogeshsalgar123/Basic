package com.java.string.basic;

public class ReverseString1 {

	public static void main(String[] args) {
		
		String str = "yogesh";
		
		char [] ch = str.toCharArray();
		
//		for (char c : ch) {
//			System.out.println(c); //  a b c d
//		}
		
		for(int i=ch.length-1; i>=0; i--)
		{
			System.out.print(ch[i]);
		}

	}

}

package com.test;

public class ReverseFromAlphaNumeric {

	public static void main(String[] args) {
		String alpha= "ajdg527hdhdr199";
		String reverse="";
		for(int i=alpha.length()-1;i>=0;i--)
		{
			
			if(Character.isDigit(alpha.charAt(i)))
			{
				reverse=reverse+alpha.charAt(i);
			}
		}
		
		System.out.println(reverse);
	}

}

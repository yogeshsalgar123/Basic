package com.test;

public class StringMethods {

	public static void main(String[] args) {
		String str = "   abcdef  abc     ";
		
		String str1 = "abc";
		String str2 = new String("abc");
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println(str1==str2);  //false
		System.out.println(str1.equals(str2)); //true
		
		System.out.println("original String "+str);
		System.out.println("removing Space from left and right"+str.trim()); //remove space
		System.out.println(str.startsWith(" "));//true
		System.out.println(str.startsWith("a", 5)); //false
		System.out.println(str.contains("def"));  //true
		System.out.println(str.indexOf("a"));  //3
		
		System.out.println(str1.length());  //3
		System.out.println(str1.matches(str2));
		System.out.println(str1.repeat(5));
		//System.out.println(str1.replace(str, str1));
		
		char[] ch=str1.toCharArray();
		for(char character: ch)
		{
			System.out.println(character);
		}
		System.out.println(str1.translateEscapes());
		
		char ch1= '3';
		System.out.println(Character.valueOf(ch1));
		
		System.out.println(Character.isDigit(ch1));
		
		
	}

}

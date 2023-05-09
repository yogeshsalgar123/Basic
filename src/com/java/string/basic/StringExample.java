
   //methods in String

package com.java.string.basic;

public class StringExample {

	public static void main(String[] args) {
		String s1= "java";
		System.out.println(s1);
		
		char ch[] = {'y','o','g','e','s','h'}; //character array 
		String s2 =new String(ch);    // converting to String
		System.out.println(s2);
		
		String s3 = new String("welcome");  //new String
		
		System.out.println(s3);
		
	
		System.out.println(s3.charAt(0)); //character at index
		
		System.out.println(s3.length());  //length of string

		int stringL =s3.length();
		System.out.println(s3.charAt(stringL-1));  //last char
		
		
	}

}

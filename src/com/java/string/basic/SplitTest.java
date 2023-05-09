package com.java.string.basic;

public class SplitTest {
	public static void main(String[] args) {

		String s1 = "java  string  example";

		String[] words = s1.split("//");// splits the string based on whitespace

		for (String w : words) // using java foreach loop to print elements of string array

		{
			System.out.println(w);
		}

	}

}

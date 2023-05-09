package com.java.basic.Exercises;

public class Leap {

	public static void main(String[] args) {
		int year=2100;
		
		System.out.println(leap(year));

	}
	
	public static String leap(int year)
	{
		if(year%4==0 && year%100!=0 || year%400==0)
		{
			return "year is leap";
		}
		else
		{
		return "year is leap not a leap year";
		}
	}

}

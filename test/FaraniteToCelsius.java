package com.test;

public class FaraniteToCelsius {
	public static void main(String[] args) {
		//double faranite=80;
		
		System.out.println(convertToCelsius(80) +" C");
	}

	private static double convertToCelsius(double faranite) {
		double celsius= (faranite-32)*5/9;
		return celsius;
	}
}

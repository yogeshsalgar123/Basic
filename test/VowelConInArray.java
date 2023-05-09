package com.test;

import java.util.ArrayList;

public class VowelConInArray {

	public static void main(String[] args) {
		String name = "dzbcaiushnmcnjm";

		ArrayList<Character> vowel = new ArrayList<Character>();
		ArrayList<Character> consonent = new ArrayList<Character>();

		for (int i = 0; i < name.length(); i++) {
			char character = name.charAt(i);

			if (character == 'a' || character == 'e' || character == 'i' || character == 'i' || character == 'o'
					|| character == 'u') {
				vowel.add(character);
			} else {
				consonent.add(character);
			}
		}
		
		System.out.println("vowels :"+vowel);
		System.out.println("consonent:"+consonent);
	}

}

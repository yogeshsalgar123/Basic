package com.collection.Map;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(105, "yogesh");
		map.put(101, "Ankesh");
		map.put(104, "abhiranjan");
		map.put(103, "Snehal");
		map.put(102, "Raksh");
		
		System.out.println(map);   //ascending order
	//	map.forEach(var -> System.out.println(var));
		System.out.println(map.entrySet());
	}
}

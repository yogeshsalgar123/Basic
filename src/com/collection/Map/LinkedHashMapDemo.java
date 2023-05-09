package com.collection.Map;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<String , Integer> map = new LinkedHashMap<>();
		
		map.put("Maths",500);
		map.put("chemistry",200);
		map.put("physics",100);
		
		System.out.println(map); //insertion order inside{ }
		System.out.println("set of keys: "+map.keySet());
		System.out.println("set of entry: "+map.entrySet());
	}
}

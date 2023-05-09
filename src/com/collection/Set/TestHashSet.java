package com.collection.Set;

import java.util.HashSet;

public class TestHashSet {

	//HashSet is Raw type it can take any data
	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		set.add("yogesh");
		set.add(25);
		set.add(10.00);
		set.add(true);
		set.add(12.0f);
		set.add('A');
		set.add("yogesh"); //it will not take duplicate data
		
		System.out.println(set);  // it will print in random order
		
		set.remove(25);
		System.out.println("after removing 25: "+set);
		
	}

}

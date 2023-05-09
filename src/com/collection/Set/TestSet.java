package com.collection.Set;

import java.util.HashSet;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {
	//	Set set = new Set();     we can not create object of interface
		                      //  bcoz it has only declaration
		
		Set set = new HashSet();   //Upcasting
//	parent interface = child class
		set.add("abc");
		set.add(123);
		set.add("def");
		set.add(456);
		System.out.println(set);  //Hashset is taking raw data and printing in random order
	}

}

package com.Class.Collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
	public static void main(String[] args) {
		SortedSet<Integer> set = new TreeSet<Integer>();
		set.add(20);
		set.add(50);
		set.add(10);
		set.add(30);
		set.add(40);
		
		System.out.println(set);
		System.out.println("first element: "+set.first());
		System.out.println("last element: "+set.last());
		System.out.println("elements >=30: "+set.headSet(30));
		System.out.println("elements <=30: "+set.tailSet(30));
		System.out.println(set.comparator());
	}
}

package com.collection.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
//		TreeSet set = new TreeSet();
//		set.add(30);
//		set.add("Revathi"); //it will show class cast exception it will not take row data
//		set.add(10);
		
		TreeSet<Integer> set = new TreeSet<>();
		set.add(30);
		set.add(30);  //it will not take duplicate data
		set.add(20);
		set.add(10);
		
		System.out.println(set); //TreeSet print in ascending order
		
		
		System.out.println("-----with iterator()------");
		Iterator itr = set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		System.out.println("----with lambda one by one----");
		set.forEach(var->System.out.println(var));
		
	}

}

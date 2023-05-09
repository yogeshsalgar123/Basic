package com.collection.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestLinkedHashSet {

	public static void main(String[] args) {
	//	LinkedHashSet set = new  LinkedHashSet(); // take raw data
		LinkedHashSet<String> lhset = new LinkedHashSet<>(); // take generic String Data
		
		lhset.add("c");
		lhset.add("c#");
		lhset.add("java");
		lhset.add("python");
		lhset.add(".net");
		
		System.out.println(lhset);  //LinkedHashSet will print in insertion order
		
		System.out.println("------------printing one by one with iterator---------------");
		
		Iterator itr = lhset.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("-------------using lambda printing one by one--------------");
		
		lhset.forEach(var->System.out.println(var));
	}
}

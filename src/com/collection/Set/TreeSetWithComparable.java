package com.collection.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetWithComparable {

	//if we are creating TreeSet of user defined classes or 
	//any Java classes which does not implements comparable interface
	//we will get ClassCastException. 
	//to solve this problem we can either implement Comparable to our user defined class or
	//we can pass Comparator object in Constructor while creating the set.
	public static void main(String[] args) {
		TreeSet<Employee> set = new TreeSet<>();
		set.add(new Employee(123,"Revathi",9820318));
		set.add(new Employee(321,"drish",908293));
		set.add(new Employee(100,"Sheetal",929293));
		
		System.out.println(set);
		
		Iterator<Employee> itr = set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next()); //fetch only one obj if we will not implement @overriden cmp method
		}
		
	//	set.forEach(var->System.out.println(var)); //fetch only one obj if we will not implement @overriden cmp method
	}
}

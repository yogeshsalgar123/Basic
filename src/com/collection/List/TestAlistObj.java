		package com.collection.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class TestAlistObj {

	public static void main(String[] args) {
		List<Employee> als = new ArrayList<>();
		als.add(new Employee(11,"yogesh",4436));
		als.add(new Employee(2,"abhiranjan",1871));
		als.add(new Employee(3,"ankesh",2162));
		 
		                         // insertion order
		System.out.println(als);//[Employee(empid=11, ename=yogesh, Phoneno=4436),
		                        // Employee(empid=2, ename=abhiranjan, Phoneno=1871), 
		                        // Employee(empid=3, ename=ankesh, Phoneno=2162)]
		
		//Collections.sort(als);  not possible with object
		//we have to implement comparable method in employee class
		
//	 after overriding compareTo method in the employee class now we can sort directly
		System.out.println("--------------------------------------");
		Collections.sort(als);
		System.out.println(als);
		
		System.out.println("----------------one by one----------------------");
		ListIterator<Employee> itr = als.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("-------------------------------------------------");
		als.forEach(emp->System.out.println(emp)); //5 lines loop in one line
	}
}

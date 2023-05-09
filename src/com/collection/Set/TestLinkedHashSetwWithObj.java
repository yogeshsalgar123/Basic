package com.collection.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestLinkedHashSetwWithObj {

	public static void main(String[] args) {
		    //passing employee args    
		LinkedHashSet<Employee> set = new LinkedHashSet<>();
		set.add(new Employee(201,"Revathi",1234567890));
		set.add(new Employee(301,"drish",324568901));
		set.add(new Employee(101,"Sheela",253183618));
		
		System.out.println(set);//it will print hash address if we dont override toString in emp class
		//we are already having toString inside emp so it will print all data inside [ ]bracket 
		
		System.out.println("-----with iterator-----");
		Iterator<Employee> itr = set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());//by insertion order
		}
		
		System.out.println("-----with lambda-----");
		set.forEach(var->System.out.println(var));
	
		
	}
}

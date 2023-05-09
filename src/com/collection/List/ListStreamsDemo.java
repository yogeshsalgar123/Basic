package com.collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListStreamsDemo {

	public static void main(String[] args) {
		List<Employee> als = new ArrayList<>();
		als.add(new Employee(11,"yogesh",4436));
		als.add(new Employee(2,"abhiranjan",1871));
		als.add(new Employee(3,"ankesh",2162));
		
		als.forEach(emp-> System.out.println(emp.getEname()));  //print only names
		
		//to print names which has lenght ==6
		System.out.println("------------------------------------------------------");
		for (Employee emp : als) {
			if(emp.getEname().length()==6)
			{
				System.out.println(emp.getEname());
			}
		}
		System.out.println("----------------------using Streams---------------------------------");
		//to reduce that lines of code we can use streams
		
		als.stream().filter(emp->emp.getEname().length()==6) //intermadiate operation
		            .map(emp -> emp.getEname().toUpperCase())
		            .forEach(name -> System.out.println(name));//terminal operation
		
		
		
		
		
	}
}

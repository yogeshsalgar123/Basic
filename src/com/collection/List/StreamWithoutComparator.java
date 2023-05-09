package com.collection.List;

import java.util.LinkedList;
import java.util.List;

public class StreamWithoutComparator {
	public static void main(String[] args) {
		List<Emp> ls = new LinkedList<Emp>();
		ls.add(new Emp(10, "yogesh", 27));
		ls.add(new Emp(102, "ankesh", 26));
		ls.add(new Emp(18, "yogesh", 28));
		
		ls.stream().sorted((e1,e2)->e1.getAge()-e2.getAge())
		           .forEach(emp -> System.out.println(emp));
		
		System.out.println("****************************");
		ls.stream().sorted((e1,e2)->e1.getId()-e2.getId())
                   .forEach(emp -> System.out.println(emp));
		
	 
	}
	
}

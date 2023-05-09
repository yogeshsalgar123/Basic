package com.collection.Set.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.collection.Set.Employee;

public class TreeSetWithComparator {

	public static void main(String[] args) {
		
		TreeSet<Student> set = new TreeSet<Student>(new Student());  //not aaplicable
	//	List <Student> set = new ArrayList <>();
		set.add(new Student(5, "yogesh",954320));
		set.add(new Student(2,"Ankesh",98420));
		set.add(new Student(1,"Snehal",20393));
		
	//	Collections.sort(set, new SortById()); not applicable by tree set
		
	//	Collections.sort(set, new SortById());
		
		
		//System.out.println(set);// class cast exception without comparator
		
		Iterator<Student> itr = set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
}

package com.collection.List;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class AscDescOrderOfLinkedList {

	public static void main(String[] args) {
	//	List ls = new List(); list is interface so it is not possible
		
	//	we have to upcast first to use interface
		
		List l = new LinkedList();  //shows warining bcoz it is of raw datatype
		
		List<String> ls = new LinkedList<>();
		ls.add("b");
		ls.add("d");
		ls.add("a");
		ls.add("c");
		
		Collections.sort(ls); //to sort in ascending
		System.out.println("In ascending order with Collection.Sort() method :");
		System.out.println(ls);
		
		Collections.sort(ls, Collections.reverseOrder());
		System.out.println("-----reverse order by sort(list,Collections.reverseOrder method-----");
		System.out.println(ls);  // linkedList print in insertion order
		
		
		System.out.println("-----one by one with ListIterator forward------");
		//Iterator<String> itr = ls.iterator();
	
		ListIterator<String> litr = ls.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		
		System.out.println("-------backword------");
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
		
	}
}

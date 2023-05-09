package com.collection.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AscDescOrderOfArrayList {

	public static void main(String[] args) {
		List<Integer> als = new ArrayList<>();
		als.add(20);
		als.add(10);
		als.add(40);
		als.add(30);
		als.add(20);
		als.add(10);
		System.out.println("----Insertion Order----");
		System.out.println(als); // insertion order
		
		Collections.sort(als);
		System.out.println("----asc order by sort() method----");
		System.out.println(als);

		System.out.println("-----desc by sort(list,collection.reverseOrder() method---- ");

		Collections.sort(als, Collections.reverseOrder());
		System.out.println(als);
		

		System.out.println("----printing one by one----");

		System.out.println("----forward with Iterator ----");
		
		
		ListIterator<Integer> itrl = als.listIterator();
		while (itrl.hasNext()) {
			System.out.println(itrl.next());
		}

		System.out.println("----Backward with listIterator()----");
		
		
		while(itrl.hasPrevious())
		{
			System.out.println(itrl.previous());
		}
	}
}

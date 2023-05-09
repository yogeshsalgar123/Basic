package com.Class.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

public class CollectionsDemo {

	public static void main(String[] args) {
		ArrayList<Integer> als =new ArrayList<>();
		als.add(3);
		als.add(1);
		als.add(4);
		System.out.println(als);
		Collections.addAll(als, 1,2,3,4);
		System.out.println(als);
		Collections.reverse(als);
		System.out.println(als);
		
		Collections.sort(als,Collections.reverseOrder());
		System.out.println(als);
		
		ListIterator<Integer> itr = als.listIterator();
	
	//	Iterator<Integer> itr1 = als.iterator();
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
			//itr.remove();
			//System.out.println(itr1.next());
		}
		
		//System.out.println("list:"+als);
	}
}

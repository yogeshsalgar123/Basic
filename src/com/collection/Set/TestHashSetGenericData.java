package com.collection.Set;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSetGenericData {

	public static void main(String[] args) {
		                   //not mandatory to write <Interger> here
		HashSet<Integer> set = new HashSet<Integer>();
		                                //take similar type date i.e Interger
		
		set.add(10);
		set.add(20);
		set.add(30);
//		set.add("yogesh"); it will take only generic data
		set.add(40);
		
//		System.out.println(set); // print values randomly
		
//    to print value one by one 
		
//		Iterator itr = set.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next()); //next() will print current element
//		}
		
		
//  printing values one by one using Lambda Expression
		
		set.forEach(var->System.out.println(var));    //it will print randomly
	}
}

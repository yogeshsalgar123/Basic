package com.collection.Map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		Map<String , Integer> map = new TreeMap<String, Integer>();
		map.put("maths", 89);
		map.put("physics", 97);
		map.put("physics", 100); // key will be override 
		map.put("English", 78);
		
		System.out.println(map);//{English=78, maths=89, physics=100}
		
	//	map.forEach(var ->System.out.println(var));
		
		System.out.println("with entrySet() :" +map.entrySet());//[English=78, maths=89, physics=100]
		
		System.out.println("with keySet() :" +map.keySet());//[English, maths, physics]

		System.out.println("with values() :"+map.values());//[78, 89, 100]

		Iterator itr = map.entrySet().iterator();
		System.out.println("-----------with the help of iterator ------");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}

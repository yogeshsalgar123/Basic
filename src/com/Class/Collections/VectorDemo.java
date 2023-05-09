package com.Class.Collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<Integer> vec =new Vector<>();
		vec.add(4);
		vec.add(2);
		vec.add(1);
		vec.add(3);
		
		System.out.println(vec);
		
		Enumeration<Integer> enm=vec.elements();

		while(enm.hasMoreElements())
		{
			System.out.println(enm.nextElement());
		}
	}
}

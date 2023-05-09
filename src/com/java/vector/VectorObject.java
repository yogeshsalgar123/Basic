package com.java.vector;

import java.util.Iterator;
import java.util.Vector;

public class VectorObject {
	public static void main(String[] args)
	{
		Student s = new Student("Naruto",20);
		Teacher t = new Teacher("Kakashi","Science",35);
		Hod  h    = new Hod("Jiraya",50);
		
		Vector v=new Vector();
		v.add(s);
		v.add(t);
		v.add(h);
		
//		for(Object obj:v) {
//			System.out.println(obj);
//		}
		
		v.forEach(vec-> System.out.println(vec));
	}
}

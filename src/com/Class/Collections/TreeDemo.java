package com.Class.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeDemo {
	public static void main(String[] args) {
		TreeSet<Integer> treeset = new TreeSet<Integer>();
		TreeMap<Integer, String> treemap = new TreeMap<>();
		LinkedHashMap<Integer, String> lhmap=new LinkedHashMap<>();
		ArrayList<Integer> als = new ArrayList<Integer>();
		treeset.add(20);
		treeset.add(10);
		treeset.add(10);
		treeset.add(30);
		treeset.add(50);
		
		als.add(38);
		als.add(31);
		als.add(35);
		
		System.out.println(treeset);
		
		Collections.sort(als);
	}
}

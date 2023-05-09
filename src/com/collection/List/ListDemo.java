package com.collection.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		LinkedList <Integer> ls= new LinkedList<>();
		ls.add(90);
		ls.add(30);
		ls.add(50);
		ls.add(10);
		
		System.out.println(ls);
		
		ls.remove(0);
		System.out.println("after removing 90: "+ls);
	}
}

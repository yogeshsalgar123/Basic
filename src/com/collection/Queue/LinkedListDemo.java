package com.collection.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListDemo {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		q.add("Yogesh");
		q.add("Ankesh");
		q.add("Abhiranjan");
		
		System.out.println(q);
		q.forEach(queue -> System.out.println(queue));
	}
}

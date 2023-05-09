package com.collection.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		
		Queue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(10);
		pq.add(45);
		pq.add(1);
		pq.add(30);
		
		pq.forEach(prior ->System.out.println(prior));//randomly it is printing 
		                                       //but internally it will print 
		                                    //based on MinHeap MaxHeap
		System.out.println("********************");
		System.out.println(pq.peek());
		System.out.println(pq);
		System.out.println("***********************");
		System.out.println(pq.poll());
		System.out.println(pq);
	}
}

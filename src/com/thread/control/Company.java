package com.thread.control;

public class Company {
	boolean b;  //produce the item

	synchronized public void produce_items(int i) throws InterruptedException
	{
		if(b)
		{
			wait();
		}
		Thread.sleep(3000);
		System.out.println("Produced item..." +i);
		b=true;
		notify();
	}
	
	synchronized public void consume_items(int i) throws InterruptedException
	{
		if(!b)
		{
		wait();
		}
	
		Thread.sleep(3000);
		System.out.println("consumed item..." +i);
		b=false;
		notify(); //interthread Communication
	}
	
}

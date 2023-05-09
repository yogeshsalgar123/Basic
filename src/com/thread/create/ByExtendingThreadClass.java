package com.thread.create;
//first way to create thread
public class ByExtendingThreadClass extends Thread{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
		  System.out.println(i);
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("inside main thread....");
		ByExtendingThreadClass thread = new ByExtendingThreadClass();
		thread.start();
	}
}

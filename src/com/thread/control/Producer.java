package com.thread.control;

public class Producer extends Thread{
	Company c1;
	
	public Producer(Company c1)
	{
		this.c1=c1;
	}
	
	public void run()
	{
		for(int i=1;i<=5;i++) {
		try {
			this.c1.produce_items(i);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
}

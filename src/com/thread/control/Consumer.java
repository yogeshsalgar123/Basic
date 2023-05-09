package com.thread.control;

public class Consumer extends Thread {
Company c1;
	
	public Consumer(Company c1)
	{
		this.c1=c1;
	}
	
	public void run()
	{
		for(int i=1;i<=5;i++) {
		try {
			this.c1.consume_items(i);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		}
	}
}

package com.thread.create;

public class ByImplementingRunnableInterface implements Runnable {
	
	@Override
	public void run() {
		for(int i=10;i>0;i--)
		{
			System.out.println("inside child thread....");
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		
		ByImplementingRunnableInterface thread = new ByImplementingRunnableInterface();
		System.out.println("inside main thread");
		Thread t1 = new Thread(thread);
		t1.start();
	}

	
}

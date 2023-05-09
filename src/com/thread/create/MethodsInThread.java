package com.thread.create;

public class MethodsInThread implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<5;i++)
		{
			System.out.println("inside child thread...");
			System.out.println(i);
			
			System.out.println(Thread.currentThread()); //reference of current thread
			
			
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	    Thread.interrupted();
	}

	public static void main(String[] args) throws InterruptedException {
		MethodsInThread thread = new MethodsInThread();
		
		Thread t1= new Thread(thread);
		t1.start();
		
		System.out.println(Thread.currentThread());
		System.out.println("priority :-");
		System.out.println(t1.getPriority());
		
		t1.join();
		
	}
}

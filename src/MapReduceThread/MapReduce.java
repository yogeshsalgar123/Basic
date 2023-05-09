package MapReduceThread;

import java.util.PriorityQueue;
import java.util.Queue;

public class MapReduce  implements Runnable {
	int a,b;
	int avg;
	String name;
	Thread t;
	Integer[] arr;
	Queue<Integer>queue=new PriorityQueue<>();
	public MapReduce(Integer[] arr,int a, int b, String name) {
		super();
		this.a = a;
		this.b = b;
		this.name = name;
		t=new Thread(this);
		t.start();
		this.arr = arr;
	}

	@Override
	public synchronized void run()
	{
		for(int i=a;i<=b;i++)
		{
			avg=avg+arr[i];
			try {t.join(1000);} catch(InterruptedException e){e.printStackTrace();}
		}
		this.notify();
		System.out.println(t + " "+ avg);
	}
	public int displayiof()
	{
		synchronized(this)
		{
			try {
				this.wait();
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		return queue.poll();
	}

	
}

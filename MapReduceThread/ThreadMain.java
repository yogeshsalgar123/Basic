package MapReduceThread;

public class ThreadMain {

	public static void main(String[] args) {
		Integer[] array = new Integer[]  {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
 
		int sum =0;
		MapReduce mapReduce = new MapReduce(array,0, 4,"Thread1");
		sum+=mapReduce.displayiof();
				
		MapReduce mapReduce1 = new MapReduce(array,5, 9,"Thread2");
		sum+=mapReduce1.displayiof();
		
		MapReduce mapReduce2= new MapReduce(array,10, 14,"Thread3");
		sum+=mapReduce2.displayiof();
		
		MapReduce mapReduce3= new MapReduce(array,15, 20,"Thread4");
		sum+=mapReduce3.displayiof();
		
		MapReduce mapReduce4= new MapReduce(array,15, 20,"Thread5");
		sum+=mapReduce4.displayiof();
		
		System.out.println("sum is "+sum);
		System.out.println("Average is "+sum/array.length);
		
	}

}

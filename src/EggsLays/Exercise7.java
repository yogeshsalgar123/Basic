package EggsLays;

import java.util.ArrayList;
import java.util.List;

public class Exercise7 
{
	public static int noOfEggs;
	public static int pricePerEgg =2;

	class Hen extends Thread{
		Hen(){
			this.start();
		}

		@Override
		public void run()
		{
			this.layEgg();
			System.out.println("hen laid the eggs "+ noOfEggs);
			System.out.println("Owner Gained Rs " + noOfEggs*pricePerEgg);
			System.out.println();
		}

		public void layEgg() {
			noOfEggs++;
		}
	}

	public static void main(String[] args) 
	{	
		List <Exercise7.Hen> eggs=new ArrayList<>();

		for(int i=1;i<=50;i++)
		{
			eggs.add(new Exercise7().new Hen());
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

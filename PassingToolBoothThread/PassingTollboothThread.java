package PassingToolBoothThread;

public class PassingTollboothThread {

	class Vehicle extends Thread
	{
		int vehicleNo;

		public Vehicle(int vehicleNo) {
			super();
			this.vehicleNo = vehicleNo;
			this.start();    //Start the thread
		}
		
		@Override
		public void run()
		{
			System.out.println("Vehicle Number :"+this.vehicleNo+", Started journey");
			this.crossBridge();
			System.out.println("Vehicle Number: "+this.vehicleNo+", journey Ended !!!");
		}	

		public synchronized void tollCollect()
		{
			System.out.println("Vehicle Number : "+this.vehicleNo+", is Collecting Ticket");
		}

		public synchronized void crossBridge() 
		{
			System.out.println("Vehicle Number :"+this.vehicleNo+" ,Arrived at Bridge");
			this.tollCollect();
			System.out.println("Vehicle NUmber: "+this.vehicleNo+", Crossed the Bridge ");
		}



	
	}
	public static void main(String[] args) throws InterruptedException {
		PassingTollboothThread.Vehicle[] vehicleCreation= new PassingTollboothThread.Vehicle[5];
		
		for(int i=1;i<=5;i++)    
		{
			vehicleCreation[i-1]=new PassingTollboothThread().new Vehicle(i);  //Initialization of  vehicle object
		     Thread.sleep(1000);
		}
		
		for(int i=1;i<=5;i++)
		{
			try {
				vehicleCreation[i-1].join();   
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		System.out.println("All Vehicle Collected the ticket and Crossed the bridge !!!");
		
	}
}

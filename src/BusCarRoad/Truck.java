package BusCarRoad;

public class Truck extends Vehicle //Sub Class
{
	Truck(String clr, int nowls, String mdl) 
	{
		super(clr, nowls, mdl);
		System.out.println("Truck");
		System.out.println("--------------------------------------------");
		System.out.println("Color of the Truck: "+clr);
		System.out.println("No of wheels in Truck: "+nowls);
		System.out.println("Truck Model is: "+mdl);
		System.out.println();
	}
}

package BusCarRoad;

public class Car extends Vehicle //Sub Class
{

	Car(String clr, int nowls, String mdl) 
	{
		super(clr, nowls, mdl);
		System.out.println("Car");
		System.out.println("--------------------------------------------");
		System.out.println("Color of the Car: "+clr);
		System.out.println("No of wheels in Car: "+nowls);
		System.out.println("Car Model is: "+mdl);
		System.out.println();
	}

}

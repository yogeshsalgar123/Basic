package BusCarRoad;

public class Bus extends Vehicle//Sub Class
{
	Bus(String clr, int nowls, String mdl)
	{
		super(clr, nowls, mdl);
		System.out.println("Bus");
		System.out.println("--------------------------------------------");
		System.out.println("Color of the Bus: "+clr);
		System.out.println("No of wheels in Bus: "+nowls);
		System.out.println("Bus Model is: "+mdl);
		System.out.println();
	}
}

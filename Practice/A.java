package Practice;

public class A {

	private static int a=20;    //private 
	public static int b =30;    // public
	static int c= 25;       //default
	
	static protected int d=80;
	
	
	private static void display()
	{
		System.out.println("Inside private  method");
	}
	
	public static void show()
	{
		System.out.println("inside public method");
	}
	
	
     static void TestDefault()
     {
    	 System.out.println("Default modifer method is accessed");
     }
     
     
     static void TestProtectedMethod()
     {
    	 System.out.println("Protected method is accessed");
     }
     
     
     
	
	public static void main(String[] args) {
		a=10;               // possible inside same class
		System.out.println(a);
		display();           //possible inside same class
		
		b=50;    //possible
		System.out.println(b);
		show();
		
		c=25;
		System.out.println(c); //possible to access within class
		TestDefault();        // possible within same class
		
		d=36;                 // possible within same class
		System.out.println(d);
		TestProtectedMethod(); //possible
		
	}
}

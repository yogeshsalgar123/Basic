package Practice;

public class MainAccessModi {
	int a = 10;
	static int b = 20;
	int x;
	static int y;

	void m1() {
		int c = 30;
		System.out.println("M1");
		System.out.println("instance variable :" + a);  //10  recamanded
		System.out.println("instance variable2 :" + new MainAccessModi().a); //10
		System.out.println("Static var3 " + MainAccessModi.b);  //20  recamanded
		System.out.println("Local var " + c);  //30
	}

	void m2() {
		int a = 100;
		int b = 200;
		System.out.println("M2");
		System.out.println("Instance varl " + a);//100
		System.out.println("Instance var2 " + new MainAccessModi().a); //10
		System.out.println("Static var1 " + b);      //200
		System.out.println("Static var2 " + new MainAccessModi().b); //20
		System.out.println("Static var3 " + MainAccessModi.b); //20
	}

	void m3() {
		int z=10;
		System.out.println("M3");
		System.out.println("Instance var1 " + x); //0
		System.out.println("Instance var2 " + new MainAccessModi().x); //0
		System.out.println("Static vari " + y); // 0
		System.out.println("Static var2 " + new MainAccessModi().y); //0
		System.out.println("Static var3 " + MainAccessModi.y); //0 recamnded 
		System.out.println("Local var " + z); //not possible
	}

	public static void main(String[] args) {
		System.out.println("Hello World");  //hello world
		MainAccessModi obj1=new MainAccessModi();
	    obj1.m1();  //M1
	    obj1.m2();  //M2
	    obj1.m3();  //M3
	    
	    

	    System.out.println("FROM MAIN");
	//  System.out.println("Instance var1 "+a);
	    System.out.println("Instance var2 "+new MainAccessModi().a); //10
	    System.out.println("Static var1 "+b);             //20
	    System.out.println("Static var2 "+new MainAccessModi().b);   //20
	    System.out.println("Static var3 "+MainAccessModi.b);         //20
   //   System.out.println("Local var "+c);             //not possible
}
	
}

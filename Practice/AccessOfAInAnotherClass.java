package Practice;

public class AccessOfAInAnotherClass {
public static void main(String[] args) {
	A a1 = new A();
	//a1.a=30;  //not possible directly
	//a1.display(); not possible private member out class directly
	
	
	a1.b=23;           //posible public variable outside the class
	System.out.println(a1.b);
	a1.show();         // public method is accessible outside class
	
	a1.c=50;        //possible outside class
	System.out.println(a1.c);
	a1.TestDefault();  //default method is possible to access outside class
	
	a1.d=38; //accesible outside class inside same package
	System.out.println(a1.d);
	a1.TestProtectedMethod(); // posible
	
}
}
 
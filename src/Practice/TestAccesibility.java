package Practice;

public class TestAccesibility {
	public static void main(String[] args) {
		A a1 = new A();   // to create obj of another pack class we need to import that package first
	//	a1.a=28;  //private variable is not accessible 
	//	a1.display();  //private method not acceesible 
		
		a1.b=15; //public variable accesible outside package
		System.out.println(a1.b); //through refernce variable 
		System.out.println(A.b);  //through class name
		
		a1.show(); //public method also accesible outside package
		
		
		//a1.c=10;     //not possible outside package
		//a1.testDefault(); //not possible default method to access outside package
		
		
 	}

}

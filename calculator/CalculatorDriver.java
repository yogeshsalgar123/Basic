package calculator;

public class CalculatorDriver {
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		
		System.out.println("Addition :");
		System.out.println(cal.add(20,10));
		System.out.println(cal.add(10.20,20.10));
		System.out.println(cal.add(10,20.10));
		System.out.println(cal.add(20.67, 10));
		System.out.println("=============================");
		
		System.out.println("Substraction :");
		System.out.println(cal.diff(20,10));
		System.out.println(cal.diff(50.20,20.10));
		System.out.println(cal.diff(60,20.10));
		System.out.println(cal.diff(20.67, 10));
		System.out.println("=============================");

		System.out.println("Multiplication :");
		System.out.println(cal.mul(20,10));
		System.out.println(cal.mul(10.20,20.10));
		System.out.println(cal.mul(10,20.10));
		System.out.println(cal.mul(20.67, 10));
		System.out.println("=============================");

		System.out.println("Division :");
		System.out.println(cal.div(20, 10));
		System.out.println(cal.div(40.10, 20.10));
		System.out.println(cal.div(50, 20.10));
		System.out.println(cal.div(200.10, 40));



	}

}

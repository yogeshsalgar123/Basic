package programs;

public class Quiz {
	String name;
	static {
	//	name="java";  we can not make static referance to non static field
	}
	public static void main(String[] args) {
		System.out.println(Quiz.class);
	}
}

package Constructor;

public class Student {

	int id;
	String name;
	
	Student()     //default constructor
	{
		System.out.println("Default");
	}
	
	Student(int id,String name)   //parameterized constructor
	{
		this.id=id;
		this.name=name;
		System.out.println("hiiii");
	}
	
	public static void main(String[] args) {
		Student s1= new Student();
		Student s2 = new Student(101,"yogesh");
		
		
	}
}

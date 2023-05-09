package DemoComparator;

public class Student 
{
	 // Attributes of a student
	int rollno;
    String name, address;
	public Student(int rollno, String name, String address)
	{
		 // This keyword refers to current instance itself
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	
	// Method of Student class
    // To print student details in main()
	@Override
	public String toString() 
	{
		 // Returning attributes of Student
		return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
	}
	
	
    
    
}

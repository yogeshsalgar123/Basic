package Practice;

public class Student {
	
	private int rollNo;
	private String Name;
	
	Marks m1=new Marks();
	
	
	public Student(int rollNo, String name, Marks m1) {
		super();
		this.rollNo = rollNo;
		Name = name;
		this.m1 = m1;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Marks getM1() {
		return m1;
	}
	public void setM1(Marks m1) {
		this.m1 = m1;
	}
	
	
	
	

}

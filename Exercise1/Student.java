package Exercise1;

public class Student implements Comparable<Student>
{
	private String name;
	private Marks marks;

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Marks getMarks() {
		return marks;
	}
	public void setMarks(Marks marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return  "Name" + name  +" Marks" + marks ;
	}
	@Override
	public int compareTo(Student s) {
		
		return s.getMarks().getRegNo() - this.getMarks().getRegNo();
	}
	public Student(String name, Marks marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	

}

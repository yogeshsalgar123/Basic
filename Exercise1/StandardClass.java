package Exercise1;

import java.util.ArrayList;
import java.util.Collections;

public class StandardClass {
	static ArrayList<Student> als=new ArrayList<Student>();
	static public void addStudent(Student s)
	{
		als.add(s);
	}
	
	public static void displayStudentInAscendingOrder()
	{
		Collections.sort(als);
		//System.out.println(als);
	}
	public static void main(String[] args)
	{
		Student s1=new Student("yogesh",new Marks(108,95,98,96));
		Student s2=new Student("raj",new Marks(102,95,94,93));
		als.add(s1);
		als.add(s2);
		displayStudentInAscendingOrder();
		
  
	}

}

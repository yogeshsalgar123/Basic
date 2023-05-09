package DemoComparator;

import java.util.Comparator;
//Helper class implementing Comparator interface
public class SortByRollno implements Comparator<Student> 
{
	 // Method
    // Sorting in ascending order of roll number
	@Override
	public int compare(Student s1, Student s2) {
		
		return s1.rollno-s2.rollno;
	}
	

}

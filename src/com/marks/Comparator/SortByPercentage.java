package com.marks.Comparator;

import java.util.Comparator;

public class SortByPercentage implements Comparator<Student>
{

	
	
	@Override
	public int compare(Student s1, Student s2) 
	{

		return s1.getMarks().per()-s2.getMarks().per();
	}

}

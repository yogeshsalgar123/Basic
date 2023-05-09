package com.marks.Comparator;

import java.util.Comparator;

public class SortByMaths implements Comparator<Student> 
{

	@Override
	public int compare(Student s1, Student s2) {
		
		return s2.getMarks().getMarksInMaths()-s1.getMarks().getMarksInMaths();
	}

}
